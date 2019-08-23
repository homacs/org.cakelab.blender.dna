package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocEMail;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a link to an email address
 *
 */
class EMailHandler extends BaseHandler<EMailHandler> implements IDocEMail {
	private IBaseHandler m_parent;
	private String m_address;

	public EMailHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("email", this, "endEMail");
	}

	public void startEMail(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start email\n");
		m_curString = "";
	}

	public void endEMail() {
		m_address = m_curString;
		m_curString = "";
		m_parent.setDelegate(null);
		Log.debug(2, "End email\n");
	}

	public Kind kind() {
		return Kind.EMail;
	}

	public String address() {
		return m_address;
	}

}