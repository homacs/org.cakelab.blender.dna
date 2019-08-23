package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocULink;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a link to an URL
 *
 */
public class ULinkHandler extends BaseHandler<ULinkHandler> implements IDocULink {
	private IBaseHandler m_parent;
	private String m_url;
	private String m_text;

	public ULinkHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("ulink", this, "endULink");
	}

	public void startULink(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start ulink\n");
		m_url = attrib.getValue("url");
		m_curString = "";
	}

	public void endULink() {
		m_text = m_curString;
		m_curString = "";
		m_parent.setDelegate(null);
		Log.debug(2, "End ulink\n");
	}

	public Kind kind() {
		return Kind.ULink;
	}

	public String url() {
		return m_url;
	}

	public String text() {
		return m_text;
	}

}