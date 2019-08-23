package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocVerbatim;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an preformatted section
 */
public class VerbatimHandler extends BaseHandler<VerbatimHandler> implements IDocVerbatim {
	private IBaseHandler m_parent;
	private String m_text;
	private Types m_type;

	public VerbatimHandler(IBaseHandler parent) {
		m_parent = parent;
		m_type = Types.Invalid;
		addEndHandler("verbatim", this, "endVerbatim");
		addEndHandler("latexonly", this, "endVerbatim");
		addEndHandler("htmlonly", this, "endVerbatim");
	}

	public void startVerbatim(Attributes attrib, Types type) {
		m_type = type;
		m_parent.setDelegate(this);
		m_curString = "";
	}

	public void endVerbatim() {
		m_text = m_curString;
		m_parent.setDelegate(null);
	}

	public Kind kind() {
		return Kind.Verbatim;
	}

	public String text() {
		return m_text;
	}

	public Types type() {
		return m_type;
	}

}