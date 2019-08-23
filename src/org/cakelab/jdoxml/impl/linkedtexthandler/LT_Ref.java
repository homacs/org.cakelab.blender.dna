package org.cakelab.jdoxml.impl.linkedtexthandler;

import org.cakelab.jdoxml.api.ILT_Ref;
import org.cakelab.jdoxml.api.ILinkedText;

class LT_Ref implements ILT_Ref, ILinkedText {
	private String m_refId;
	private String m_extId;
	private String m_text;
	private TargetKind m_targetKind;

	public LT_Ref() {
	}

	public void setRefId(String refId) {
		m_refId = refId;
	}

	public void setText(String text) {
		m_text = text;
	}

	public void setExtId(String extId) {
		m_extId = extId;
	}

	public void setTargetKind(TargetKind k) {
		m_targetKind = k;
	}

	// ILT_Ref
	public String text() {
		return m_text;
	}

	public String id() {
		return m_refId;
	}

	public TargetKind targetKind() {
		return m_targetKind;
	}

	public String external() {
		return m_extId;
	}

	public Kind kind() {
		return Kind.Kind_Ref;
	}

}