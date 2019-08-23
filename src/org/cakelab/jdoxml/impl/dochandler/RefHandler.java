package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocRef;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a reference to another item
 *
 */
public class RefHandler extends BaseHandler<RefHandler> implements IDocRef {
	private IBaseHandler m_parent;
	private String m_refId;
	private String m_extId;
	private String m_linkText;
	private TargetKind m_targetKind;

	public RefHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("ref", this, "endRef");
	}

	public void startRef(Attributes attrib) {
		m_parent.setDelegate(this);
		m_refId = attrib.getValue("refid");
		m_extId = attrib.getValue("external");
		assert ("compound".equals(attrib.getValue("kindref")) || "member".equals(attrib.getValue("kindref")));
		m_targetKind = "compound".equals(attrib.getValue("kindref")) ? TargetKind.Compound : TargetKind.Member;
		Log.debug(2, "Start ref refId=%s\n", m_refId);
		m_curString = "";
	}

	public void endRef() {
		m_linkText = m_curString;
		m_parent.setDelegate(null);
		Log.debug(2, "End ref: text=`%s'\n", m_linkText);
	}

	public Kind kind() {
		return Kind.Ref;
	}

	public String refId() {
		return m_refId;
	}

	public TargetKind targetKind() {
		return m_targetKind;
	}

	public String external() {
		return m_extId;
	}

	public String text() {
		return m_linkText;
	}

}