package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocTocItem;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a table of contents item.
 *
 */
public class TocItemHandler extends BaseHandler<TocItemHandler> implements IDocTocItem {
	IBaseHandler m_parent;
	String m_id;
	String m_title;

	public Kind kind() {
		return Kind.TocItem;
	}

	public String id() {
		return m_id;
	}

	public String title() {
		return m_title;
	}

	public TocItemHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("tocitem", this, "endTocItem");
	}

	void startTocItem(Attributes attrib) {
		m_parent.setDelegate(this);
		m_id = attrib.getValue("id");
		m_curString = "";
	}

	void endTocItem() {
		m_title = m_curString;
		m_parent.setDelegate(null);
	}

}