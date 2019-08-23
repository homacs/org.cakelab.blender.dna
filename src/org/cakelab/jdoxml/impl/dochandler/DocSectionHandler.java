package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocInternal;
import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocSection;
import org.cakelab.jdoxml.api.IDocTitle;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a section.
 *
 */
// children: title, para, sect(n+1)
public class DocSectionHandler extends BaseHandler<DocSectionHandler> implements IDocSection {

	private IBaseHandler m_parent;
	List<IDocPara> m_paragraphs = new ArrayList<IDocPara>();
	List<IDocSection> m_subsections = new ArrayList<IDocSection>();
	private DocInternalHandler m_internal;
	private String m_id;
	private int m_level;
	private TitleHandler m_title;

	public DocSectionHandler(IBaseHandler parent, int level) {
		m_parent = parent;
		m_internal = null;
		m_level = level;
		m_title = null;
		String sectionKey;
		addStartHandler("title", this, "startTitle");
		addStartHandler("para", this, "startParagraph");
		if (level < 6) {
			sectionKey = "sect" + (level + 1);
			addStartHandler(sectionKey, this, "startSubSection");
		}
		addStartHandler("internal", this, "startInternal");
		sectionKey = "sect" + level;
		addEndHandler(sectionKey, this, "endDocSection");
	}

	public void startDocSection(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start docsection\n");
		m_id = attrib.getValue("id");
	}

	public void endDocSection() {
		m_parent.setDelegate(null);
		Log.debug(2, "End docsection\n");
	}

	public void startSubSection(Attributes attrib) {
		DocSectionHandler secHandler = new DocSectionHandler(this, m_level + 1);
		secHandler.startDocSection(attrib);
		m_subsections.add(secHandler);
	}

	public void startParagraph(Attributes attrib) {
		ParagraphHandler parHandler = new ParagraphHandler(this);
		parHandler.startParagraph(attrib);
		m_paragraphs.add(parHandler);
	}

	public void startInternal(Attributes attrib) {
		m_internal = new DocInternalHandler(this, m_level);
		m_internal.startInternal(attrib);
	}

	public void startTitle(Attributes attrib) {
		m_title = new TitleHandler(this);
		m_title.startTitle(attrib);
	}

	public ListIterator<IDocPara> paragraphs() {
		return m_paragraphs.listIterator();
	}

	public ListIterator<IDocSection> subSections() {
		return m_subsections.listIterator();
	}

	public IDocInternal internal() {
		return m_internal;
	}

	public Kind kind() {
		return Kind.Section;
	}

	public String id() {
		return m_id;
	}

	public int level() {
		return m_level;
	}

	public IDocTitle title() {
		return m_title;
	}

}