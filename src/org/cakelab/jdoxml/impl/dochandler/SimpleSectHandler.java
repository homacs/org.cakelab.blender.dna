package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocSimpleSect;
import org.cakelab.jdoxml.api.IDocTitle;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a simple section with an unnumbered header.
 *
 */
// children: title, para
public class SimpleSectHandler extends BaseHandler<SimpleSectHandler> implements IDocSimpleSect {
	private IBaseHandler m_parent;
	private ParagraphHandler m_paragraph;
	private Types m_type;
	private String m_typeString;
	private TitleHandler m_title;

	public SimpleSectHandler(IBaseHandler parent) {
		m_parent = parent;
		m_paragraph = null;
		m_title = null;
		addStartHandler("title", this, "startTitle");
		addStartHandler("para", this, "startParagraph");
		addEndHandler("simplesect", this, "endSimpleSect");
	}

	public void startSimpleSect(Attributes attrib) {
		m_typeString = attrib.getValue("kind");
		m_type = DocHandler.s_typeMapper.stringToType(m_typeString);
		Log.debug(2, "start simple section %s\n", m_typeString);
		m_parent.setDelegate(this);
	}

	public void endSimpleSect() {
		Log.debug(2, "end simple section\n");
		m_parent.setDelegate(null);
	}

	public void startTitle(Attributes attrib) {
		assert (m_title == null);
		m_title = new TitleHandler(this);
		m_title.startTitle(attrib);
	}

	public void startParagraph(Attributes attrib) {
		assert (m_paragraph == null);
		m_paragraph = new ParagraphHandler(this);
		m_paragraph.startParagraph(attrib);
	}

	public Kind kind() {
		return Kind.SimpleSect;
	}

	public Types type() {
		return m_type;
	}

	public String typeString() {
		return m_typeString;
	}

	public IDocTitle title() {
		return m_title;
	}

	public IDocPara description() {
		return m_paragraph;
	}

}