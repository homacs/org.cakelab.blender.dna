package org.cakelab.jdoxml.impl.sectionhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocRoot;
import org.cakelab.jdoxml.api.IMember;
import org.cakelab.jdoxml.api.IUserDefined;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.cakelab.jdoxml.impl.compoundhandler.CompoundHandler;
import org.cakelab.jdoxml.impl.dochandler.DocHandler;
import org.cakelab.jdoxml.impl.memberhandler.MemberHandler;
import org.xml.sax.Attributes;

public class SectionHandler extends BaseHandler<SectionHandler> implements IUserDefined {

	static SectionTypeMap s_typeMap;

	static public void sectionhandler_init() {
		s_typeMap = new SectionTypeMap();
	}

	static public void sectionhandler_exit() {
		s_typeMap = null;
	}

	private IBaseHandler m_parent;

	// XML elements:
	// -------------
	private String m_header; // header
	private DocHandler m_description; // description
	private List<IMember> m_members = new ArrayList<IMember>(); // memberdef

	// XML attributes:
	// ---------------
	private SectionKind m_kind; // kind
	private String m_kindString; // kind as a string

	public SectionHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("sectiondef", this, "endSection");
		addStartHandler("memberdef", this, "startMember");
		addStartHandler("header", this, "startHeader");
		addEndHandler("header", this, "endHeader");
		addStartHandler("description", this, "startDescription");
	}

	public void startSection(Attributes attrib) {
		m_parent.setDelegate(this);
		m_kindString = attrib.getValue("kind");
		m_kind = s_typeMap.map(m_kindString);
		Log.debug(2, "section kind=`%s'\n", m_kindString);
	}

	public void startDescription(Attributes attrib) {
		DocHandler docHandler = new DocHandler(this);
		docHandler.startDoc(attrib);
		m_description = docHandler;
	}

	public void endSection() {
		m_parent.setDelegate(null);
	}

	public void startMember(Attributes attrib) {
		MemberHandler memHandler = new MemberHandler(this);
		memHandler.startMember(attrib);
		m_members.add(memHandler);
	}

	public void startHeader(Attributes attrib) {
		m_header = "";
		m_curString = "";
	}

	public void endHeader() {
		m_header = m_curString.trim();
		Log.debug(2, "member header=`%s'\n", m_header);
	}

	public void initialize(CompoundHandler ch) {
		for (IMember m : m_members) {
			MemberHandler mh = (MemberHandler) m;
			mh.setCompoundHandler(ch);
			ch.insertMember(mh);
			mh.setSectionHandler(this);
		}
	}

	public IDocRoot description() {
		return m_description;
	}

	public ListIterator<IMember> members() {
		return m_members.listIterator();
	}

	public String kindString() {
		return m_kindString;
	}

	public SectionKind kind() {
		return m_kind;
	}

	public boolean isStatic() {
		return m_kind == SectionKind.PubStatFuncs || m_kind == SectionKind.PubStatAttribs
				|| m_kind == SectionKind.ProStatFuncs || m_kind == SectionKind.ProStatAttribs
				|| m_kind == SectionKind.PriStatFuncs || m_kind == SectionKind.PriStatAttribs;
	}

	public boolean isPublic() {
		return !isProtected() && !isPrivate();
	}

	public boolean isProtected() {
		return m_kind == SectionKind.ProTypes || m_kind == SectionKind.ProFuncs || m_kind == SectionKind.ProAttribs
				|| m_kind == SectionKind.ProSlots || m_kind == SectionKind.ProStatFuncs
				|| m_kind == SectionKind.ProStatAttribs;
	}

	public boolean isPrivate() {
		return m_kind == SectionKind.PriTypes || m_kind == SectionKind.PriFuncs || m_kind == SectionKind.PriAttribs
				|| m_kind == SectionKind.PriSlots || m_kind == SectionKind.PriStatFuncs
				|| m_kind == SectionKind.PriStatAttribs;
	}

	// IUserDefined implementation
	public String header() {
		return m_header;
	}

}