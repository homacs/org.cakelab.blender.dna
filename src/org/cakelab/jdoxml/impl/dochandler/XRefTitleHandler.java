package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocXRefTitle;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing the title of a section
 *
 */
// children: text, ref
// children handled by MarkupHandler: 
//           bold, computeroutput, emphasis, center,
//           small, subscript, superscript. 
public class XRefTitleHandler extends BaseHandler<XRefTitleHandler> implements IDocXRefTitle {
	private IBaseHandler m_parent;
	List<IDoc> m_children = new ArrayList<IDoc>();
	private MarkupHandler m_markupHandler;
	private String m_text;

	public XRefTitleHandler(IBaseHandler parent) {
		m_parent = parent;
		m_markupHandler = new MarkupHandler(m_children, m_curString);
		setFallBackHandler(m_markupHandler);
		addEndHandler("xreftitle", this, "endTitle");
	}

	public void startTitle(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start xreftitle\n");
		m_curString = "";
	}

	public void endTitle() {
		m_text = super.m_curString;
		addTextNode();
		m_parent.setDelegate(null);
		Log.debug(2, "End title\n");
	}

	public void addTextNode() {
		if (!m_curString.isEmpty()) {
			m_children.add(new TextNode(m_curString, m_markupHandler.markup(), m_markupHandler.headingLevel()));
			Log.debug(2, "addTextNode() text=\"%s\" markup=%x headingLevel=%d\n", m_curString, m_markupHandler.markup(),
					m_markupHandler.headingLevel());
			m_curString = "";
		}
	}

	public void startRef(Attributes attrib) {
		RefHandler ref = new RefHandler(this);
		ref.startRef(attrib);
		m_children.add(ref);
	}

	public ListIterator<IDoc> title() {
		return m_children.listIterator();
	}

	public Kind kind() {
		return Kind.Title;
	}

	public String text() {
		return m_text;
	}
	
}