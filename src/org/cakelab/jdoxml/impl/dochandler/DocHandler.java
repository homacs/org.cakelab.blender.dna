package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocInternal;
import org.cakelab.jdoxml.api.IDocRoot;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/**
 * \brief Node representing a documentation block.
 *
 */
// children: para, title, sect1, internal
public class DocHandler extends BaseHandler<DocHandler> implements IDocRoot {
	private IBaseHandler m_parent;
	List<IDoc> m_children = new ArrayList<IDoc>();
	private DocInternalHandler m_internal;
	private String m_text;

	public static TypeNameMapper s_typeMapper;
	public static HighlightMapper s_highlightMapper;

	public static void init() {
		s_typeMapper = new TypeNameMapper();
		s_highlightMapper = new HighlightMapper();
	}

	public static void exit() {
		s_typeMapper = null;
		s_highlightMapper = null;
	}

	public DocHandler(IBaseHandler parent) {
		m_parent = parent;

		addEndHandler("briefdescription", this, "endDoc");
		addEndHandler("detaileddescription", this, "endDoc");
		addEndHandler("inbodydescription", this, "endDoc");
		// addEndHandler("internal""); // TODO: implement this as a section
		addStartHandler("internal", this, "startInternal");

		addStartHandler("para", this, "startParagraph");
		addStartHandler("sect1", this, "startSect1");
		addStartHandler("title", this, "startTitle");
		// addStartHandler("internal");
	}

	public void startDoc(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start dochandler\n");
	}

	public void endDoc()
	{
		Log.debug(2, "end dochandler\n");
		m_parent.setDelegate(null);
		m_text = super.m_curString;
	}

	public void startParagraph(Attributes attrib) {
		ParagraphHandler parHandler = new ParagraphHandler(this);
		parHandler.startParagraph(attrib);
		m_children.add(parHandler);
	}

	public void startSect1(Attributes attrib) {
		DocSectionHandler secHandler = new DocSectionHandler(this, 1);
		secHandler.startDocSection(attrib);
		m_children.add(secHandler);
	}

	public void startTitle(Attributes attrib) {
		TitleHandler titleHandler = new TitleHandler(this);
		titleHandler.startTitle(attrib);
		m_children.add(titleHandler);
	}

	public void startInternal(Attributes attrib) {
		m_internal = new DocInternalHandler(this, 1);
		m_internal.startInternal(attrib);
	}

	public ListIterator<IDoc> contents() {
		return m_children.listIterator();
	}

	public IDocInternal internal() {
		return m_internal;
	}

	@Override
	public Kind kind() {
		return Kind.Root;
	}

	@Override
	public String text() {
		return m_text;
	}

	

}