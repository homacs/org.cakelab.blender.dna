package org.cakelab.jdoxml.impl.linkedtexthandler;

import org.cakelab.jdoxml.api.ILT_Text;
import org.cakelab.jdoxml.api.ILinkedText;

class LT_Text implements ILT_Text, ILinkedText {
	private String m_text;

	public LT_Text(String text) {
		m_text = text;
	}

	public String text() {
		return m_text;
	}

	public Kind kind() {
		return Kind.Kind_Text;
	}
}