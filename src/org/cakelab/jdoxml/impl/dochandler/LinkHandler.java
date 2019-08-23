package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocLink;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class LinkHandler extends BaseHandler<LinkHandler> implements IDocLink {
	private IBaseHandler m_parent;
	private String m_ref;
	private String m_text;

	LinkHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("link", this, "endLink");
	}

	void startLink(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start link\n");
		m_ref = attrib.getValue("linkend");
		m_curString = "";
	}

	void endLink() {
		m_text = m_curString;
		m_curString = "";
		m_parent.setDelegate(null);
		Log.debug(2, "End link\n");
	}

	public Kind kind() {
		return Kind.Link;
	}

	public String refId() {
		return m_ref;
	}

	public String text() {
		return m_text;
	}

}