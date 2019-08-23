package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocHighlight;
import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a highlighted text fragment.
 *
 */
// children: ref
public class HighlightHandler extends BaseHandler<HighlightHandler> implements IDocHighlight {
	private IBaseHandler m_parent;
	private HighlightKind m_hl;
	private String m_hlString;
	List<IDoc> m_children = new ArrayList<IDoc>();

	public HighlightHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("highlight", this, "endHighlight");
		addStartHandler("ref", this, "startRef");
		addStartHandler("sp", this, "startSpace");
		m_hl = HighlightKind.Invalid;
	}

	public void startHighlight(Attributes attrib) {
		m_hlString = attrib.getValue("class");
		m_hl = DocHandler.s_highlightMapper.stringToKind(m_hlString);
		m_curString = "";
		m_parent.setDelegate(this);
		Log.debug(2, "start highlight\n");
	}

	public void endHighlight() {
		addTextNode();
		Log.debug(2, "end highlight class=`%s'\n", m_hlString);
		m_parent.setDelegate(null);
	}

	public void startRef(Attributes attrib) {
		addTextNode();
		RefHandler rh = new RefHandler(this);
		m_children.add(rh);
		rh.startRef(attrib);
	}

	public void startSpace(Attributes attrib) {
		m_curString = " ";
		addTextNode();
	}

	public void addTextNode() {
		if (!m_curString.isEmpty()) {
			m_children.add(new TextNode(m_curString, IDocMarkup.Markup.Normal, 0));
			Log.debug(2, "addTextNode() text=\"%s\"\n", m_curString);
			m_curString = "";
		}
	}

	public ListIterator<IDoc> codeElements() {
		return m_children.listIterator();
	}

	public Kind kind() {
		return Kind.Highlight;
	}

	public HighlightKind highlightKind() {
		return m_hl;
	}

}