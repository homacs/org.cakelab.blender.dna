package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocCodeLine;
import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.StringDecode;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a line of code.
 *
 */
// children: linenumber, highlight, anchor, ref
public class CodeLineHandler extends BaseHandler<CodeLineHandler> implements IDocCodeLine {
	private IBaseHandler m_parent;
	private int m_lineNumber;
	private String m_refId;
	List<IDoc> m_children = new ArrayList<IDoc>();

	public CodeLineHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("codeline", this, "endCodeLine");
		addEndHandler("linenumber", this, "endLineNumber");
		addStartHandler("highlight", this, "startHighlight");
		addStartHandler("ref", this, "startRef");
		m_lineNumber = 0;
	}

	public void startCodeLine(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start codeline\n");
	}

	public void endCodeLine() {
		addTextNode();
		Log.debug(2, "end codeline\n");
		m_parent.setDelegate(null);
	}

	public void startLineNumber(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start linenumber\n");
		m_lineNumber = StringDecode.toInt(attrib.getValue("line"), 0);
		m_refId = attrib.getValue("refid");
	}

	public void endLineNumber() {
		m_parent.setDelegate(null);
	}

	public void startHighlight(Attributes attrib) {
		addTextNode();
		HighlightHandler hlh = new HighlightHandler(this);
		m_children.add(hlh);
		hlh.startHighlight(attrib);
	}

	public void startRef(Attributes attrib) {
		addTextNode();
		RefHandler rh = new RefHandler(this);
		m_children.add(rh);
		rh.startRef(attrib);
	}

	private void addTextNode() {
		if (!m_curString.isEmpty()) {
			m_children.add(new TextNode(m_curString, IDocMarkup.Markup.Normal, 0));
			Log.debug(2, "addTextNode() text=\"%s\"\n", m_curString);
			m_curString = "";
		}
	}

	public ListIterator<IDoc> codeElements() {
		return m_children.listIterator();
	}

	// IDocCodeLine
	public Kind kind() {
		return Kind.CodeLine;
	}

	public int lineNumber() {
		return m_lineNumber;
	}

	public String refId() {
		return m_refId;
	}

}