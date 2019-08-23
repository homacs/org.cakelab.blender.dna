package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocSymbol;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an special symbol.
 *
 */
// children: -
public class SymbolHandler extends BaseHandler<SymbolHandler> implements IDocSymbol {
	@SuppressWarnings("unused")
	private IBaseHandler m_parent;
	private char m_letter;
	private Types m_type;
	private String m_typeString;

	public SymbolHandler(IBaseHandler parent, Types type) {
		m_parent = parent;
		m_letter = '\0';
		m_type = type;
		addEndHandler("symbol");
		switch (type) {
		case Invalid:
			m_typeString = "invalid";
			break;
		case Umlaut:
			m_typeString = "umlaut";
			break;
		case Acute:
			m_typeString = "acute";
			break;
		case Grave:
			m_typeString = "grave";
			break;
		case Circ:
			m_typeString = "circ";
			break;
		case Tilde:
			m_typeString = "tilde";
			break;
		case Szlig:
			m_typeString = "szlig";
			break;
		case Cedil:
			m_typeString = "cedil";
			break;
		case Ring:
			m_typeString = "ring";
			break;
		case Nbsp:
			m_typeString = "nbsp";
			break;
		case Copy:
			m_typeString = "copy";
			break;
		}
	}

	public void startSymbol(Attributes attrib) {
		String ls = attrib.getValue("char");
		if (!ls.isEmpty())
			m_letter = ls.charAt(0);
	}

	public Kind kind() {
		return Kind.Symbol;
	}

	public Types type() {
		return m_type;
	}

	public String typeString() {
		return m_typeString;
	}

	public char letter() {
		return m_letter;
	}

}