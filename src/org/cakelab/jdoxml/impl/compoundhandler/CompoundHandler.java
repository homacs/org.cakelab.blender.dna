package org.cakelab.jdoxml.impl.compoundhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.cakelab.jdoxml.api.*;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.StringDecode;
import org.cakelab.jdoxml.impl.basehandler.*;
import org.cakelab.jdoxml.impl.dochandler.*;
import org.cakelab.jdoxml.impl.graphhandler.GraphHandler;
import org.cakelab.jdoxml.impl.loamhandler.ListOfAllMembersHandler;
import org.cakelab.jdoxml.impl.mainhandler.MainHandler;
import org.cakelab.jdoxml.impl.memberhandler.MemberHandler;
import org.cakelab.jdoxml.impl.paramhandler.TemplateParamListHandler;
import org.cakelab.jdoxml.impl.sectionhandler.SectionHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class CompoundHandler extends BaseHandler<CompoundHandler>
		implements IClass, IStruct, IUnion, IException, IInterface, INamespace, IFile, IGroup, IPage, IDir {
	// global compound type map
	public static CompoundTypeMap s_typeMap;

	// XML elements:
	// -------------
	private String m_name; // compoundname
	private TitleHandler m_titleHandler; // title
	private List<IRelatedCompound> m_subClasses = new ArrayList<IRelatedCompound>(); // basecompoundref
	private List<IRelatedCompound> m_superClasses = new ArrayList<IRelatedCompound>(); // derivedcompoundref
	private List<IInclude> m_includes = new ArrayList<IInclude>(); // includes
	private List<IInclude> m_includedBy = new ArrayList<IInclude>(); // includedBy
	private GraphHandler m_includeDependencyGraph; // incdepgraph
	private GraphHandler m_includedByDependencyGraph; // invincdepgraph
	private List<String> m_innerCompounds = new ArrayList<String>(); // innerdir/innerfile/innerclass/innernamespace/innergroup
	private TemplateParamListHandler m_templateParamList; // templateparamlist
	private List<IUserDefined> m_sections = new ArrayList<IUserDefined>(); // sectiondef
	private DocHandler m_brief; // briefdescription
	private DocHandler m_detailed; // detaileddescription
	private GraphHandler m_inheritanceGraph; // inheritancegraph
	private GraphHandler m_collaborationGraph; // collaborationgraph
	private ProgramListingHandler m_programListing; // programlisting
	// location
	private String m_defFile; // - file
	private int m_defLine; // - line
	private String m_defBodyFile; // - bodyfile
	private int m_defBodyStart; // - bodystart
	private int m_defBodyEnd; // - bodyend
	private ListOfAllMembersHandler m_members; // listofallmember

	// XML attributes:
	// ---------------
	private String m_id; // id
	private CompoundKind m_kind; // kind
	private String m_kindString; // kind as a string
	private String m_protection; // prot

	// local variables
	private String m_xmlDir; // directory where the info is found
	private int m_refCount; // object reference counter
	private Dict<MemberHandler> m_memberDict; // id.member lookup
	private Dict<List<IMember>> m_memberNameDict; // name.memberlist
														// lookup
	MainHandler m_mainHandler; // parent object

	public static void init() {
		s_typeMap = new CompoundTypeMap();
	}

	public static void exit() {
		s_typeMap = null;
	}

	public CompoundHandler(String xmlDir) {
		m_titleHandler = null;
		m_includeDependencyGraph = null;
		m_includedByDependencyGraph = null;
		m_templateParamList = null;
		m_brief = null;
		m_detailed = null;
		m_inheritanceGraph = null;
		m_collaborationGraph = null;
		m_programListing = null;
		m_members = null;
		m_xmlDir = xmlDir;
		m_refCount = 1;
		m_memberDict = new Dict<MemberHandler>(257);
		m_memberNameDict = new Dict<List<IMember>>(257);
		m_mainHandler = null;

		addStartHandler("doxygen");
		addEndHandler("doxygen");

		addStartHandler("compounddef", this, "startCompound");
		addEndHandler("compounddef", this, "endCompound");

		addStartHandler("compoundname");
		addEndHandler("compoundname", this, "endCompoundName");

		addStartHandler("title", this, "startTitle");

		addStartHandler("basecompoundref", this, "startSuperClass");
		addEndHandler("basecompoundref", this, "endSuperClass");

		addStartHandler("derivedcompoundref", this, "startSubClass");
		addEndHandler("derivedcompoundref", this, "endSubClass");

		addStartHandler("includes", this, "startIncludes");
		addStartHandler("includedby", this, "startIncludedBy");

		addStartHandler("incdepgraph", this, "startIncludeDependencyGraph");

		addStartHandler("invincdepgraph", this, "startIncludedByDependencyGraph");

		addStartHandler("innerdir", this, "startInnerDir");
		addEndHandler("innerdir");

		addStartHandler("innerfile", this, "startInnerFile");
		addEndHandler("innerfile");

		addStartHandler("innerclass", this, "startInnerClass");
		addEndHandler("innerclass");

		addStartHandler("innernamespace", this, "startInnerNamespace");
		addEndHandler("innernamespace");

		addStartHandler("innerpage", this, "startInnerPage");
		addEndHandler("innerpage");

		addStartHandler("innergroup", this, "startInnerGroup");
		addEndHandler("innergroup");

		addStartHandler("templateparamlist", this, "startTemplateParamList");

		addStartHandler("sectiondef", this, "startSection");

		addStartHandler("briefdescription", this, "startBriefDesc");

		addStartHandler("detaileddescription", this, "startDetailedDesc");

		addStartHandler("inheritancegraph", this, "startInheritanceGraph");

		addStartHandler("collaborationgraph", this, "startCollaborationGraph");

		addStartHandler("programlisting", this, "startProgramListing");

		addStartHandler("location", this, "startLocation");
		addEndHandler("location");

		addStartHandler("listofallmembers", this, "startListOfAllMembers");

	}

    public String locationFile() { return m_defFile; }
    public int locationLine() { return m_defLine; }
    public String locationBodyFile() { return m_defBodyFile; }
    public int locationBodyStartLine() { return m_defBodyStart; }
    public int locationBodyEndLine() { return m_defBodyEnd; }
    public String  name() { return m_name; }
    public String id()   { return m_id;   }
    public CompoundKind kind() { return m_kind; }
    public String kindString() { return m_kindString; }
    public String protection() { return m_protection; }

	public void startSection(Attributes attrib) {
		SectionHandler sectHandler = new SectionHandler(this);
		sectHandler.startSection(attrib);
		m_sections.add(sectHandler);
	}

	public void startBriefDesc(Attributes attrib) {
		DocHandler docHandler = new DocHandler(this);
		docHandler.startDoc(attrib);
		m_brief = docHandler;
	}

	public void startDetailedDesc(Attributes attrib) {
		DocHandler docHandler = new DocHandler(this);
		docHandler.startDoc(attrib);
		m_detailed = docHandler;
	}

	public void startProgramListing(Attributes attrib) {
		ProgramListingHandler plHandler = new ProgramListingHandler(this);
		plHandler.startProgramListing(attrib);
		m_programListing = plHandler;
	}

	public void startIncludes(Attributes attrib) {
		IncludeHandler inc = new IncludeHandler(this, "includes");
		m_includes.add(inc);
		inc.startInclude(attrib);
	}

	public void startIncludedBy(Attributes attrib) {
		IncludeHandler inc = new IncludeHandler(this, "includedby");
		m_includedBy.add(inc);
		inc.startInclude(attrib);
	}

	public void startCompound(Attributes attrib) {
		m_id = attrib.getValue("id");
		m_kindString = attrib.getValue("kind");
		m_kind = s_typeMap.map(m_kindString);
		m_protection = attrib.getValue("prot");
		Log.debug(2, "startCompound(id=`%s' type=`%s')\n", m_id, m_kindString);
	}

	public void endCompound() {
		Log.debug(2, "endCompound()\n");
	}

	public void startLocation(Attributes attrib) {
		m_defFile = attrib.getValue("file");
		m_defLine = StringDecode.toInt(attrib.getValue("line"), 0);
		m_defBodyFile = attrib.getValue("bodyfile");
		m_defBodyStart = StringDecode.toInt(attrib.getValue("bodystart"), 0);
		m_defBodyEnd = StringDecode.toInt(attrib.getValue("bodyend"), 0);
	}

	public void endCompoundName() {
		m_name = m_curString.trim();
		Log.debug(2, "Compound name `%s'\n", m_name);
	}

	public void startInnerClass(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startInnerNamespace(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startInnerFile(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startInnerGroup(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startInnerPage(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startInnerDir(Attributes attrib) {
		m_innerCompounds.add(new String(attrib.getValue("refid")));
	}

	public void startTemplateParamList(Attributes attrib) {
		m_templateParamList = new TemplateParamListHandler(this);
		m_templateParamList.startTemplateParamList(attrib);
	}

	public void startListOfAllMembers(Attributes attrib) {
		m_members = new ListOfAllMembersHandler(this);
		m_members.startListOfAllMembers(attrib);
	}

	public void startSuperClass(Attributes attrib) {
		IRelatedCompound.Protection prot = IRelatedCompound.Protection.Public;
		String protString = attrib.getValue("prot");
		if (protString == "protected") {
			prot = IRelatedCompound.Protection.Protected;
		} else if (protString == "private") {
			prot = IRelatedCompound.Protection.Private;
		}
		IRelatedCompound.Kind kind = IRelatedCompound.Kind.Normal;
		String kindString = attrib.getValue("virt");
		if (kindString == "virtual")
			kind = IRelatedCompound.Kind.Virtual;

		RelatedCompound sc = new RelatedCompound(this, attrib.getValue("refid"), prot, kind);
		Log.debug(2, "super class id=`%s' prot=`%s' virt=`%s'\n", attrib.getValue("refid"), protString, kindString);
		m_superClasses.add(sc);
		m_curString = "";
	}

	public void endSuperClass() {
		RelatedCompound superClass = (RelatedCompound) m_superClasses.get(m_superClasses.size() - 1);
		superClass.setName(m_curString);
	}

	public void startSubClass(Attributes attrib) {
		IRelatedCompound.Protection prot = IRelatedCompound.Protection.Public;
		String protString = attrib.getValue("prot");
		if (protString == "protected")
			prot = IRelatedCompound.Protection.Protected;
		else if (protString == "private")
			prot = IRelatedCompound.Protection.Private;

		IRelatedCompound.Kind kind = IRelatedCompound.Kind.Normal;
		String kindString = attrib.getValue("virt");
		if (kindString == "virtual")
			kind = IRelatedCompound.Kind.Virtual;

		RelatedCompound sc = new RelatedCompound(this, attrib.getValue("refid"), prot, kind);
		Log.debug(2, "sub class id=`%s' prot=`%s' virt=`%s'\n", attrib.getValue("refid"), protString, kindString);
		m_subClasses.add(sc);
		m_curString = "";
	}

	public void endSubClass() {
		RelatedCompound subClass = (RelatedCompound) m_subClasses.get(m_subClasses.size() - 1);
		subClass.setName(m_curString);
	}

	public void startTitle(Attributes attrib) {
		assert (m_titleHandler == null);
		m_titleHandler = new TitleHandler(this);
		m_titleHandler.startTitle(attrib);
	}

	public boolean parseXML(String id) throws SAXException, IOException {
		File xmlFile = new File(m_xmlDir + "/" + id + ".xml");
		if (!xmlFile.exists())
			return false;
		CompoundErrorHandler errorHandler = new CompoundErrorHandler();

		FileInputStream byteStream = new FileInputStream(xmlFile);
		InputSource source = new InputSource(byteStream);

		XMLReader reader = XMLReaderFactory.createXMLReader();
		reader.setContentHandler(this);
		reader.setErrorHandler(errorHandler);
		reader.parse(source);
		byteStream.close();
		return true;
	}

	public void initialize(MainHandler mh) {
		m_mainHandler = mh;
		for (IUserDefined ud : m_sections) {
			((SectionHandler)ud).initialize(this);
		}
		if (m_members != null) {
			m_members.initialize(mh);
		}
	}

	public void insertMember(MemberHandler mh) {
		m_memberDict.put(mh.id(), mh);
		mh.initialize(m_mainHandler);
		// XXX: this looks like a mistake: searching for id in a map with names!
		List<IMember> mhl = m_memberNameDict.find(mh.id());
		if (mhl == null) {
			mhl = new ArrayList<IMember>();
			m_memberNameDict.insert(mh.name(), mhl);
		}
		mhl.add(mh);
	}

	public ICompound toICompound() {
		switch (m_kind) {
		case Class:
			return (IClass) this;
		case Struct:
			return (IStruct) this;
		case Union:
			return (IUnion) this;
		case Interface:
			return (IInterface) this;
		case Protocol:
			return (IClass) this;
		case Category:
			return (IClass) this;
		case Exception:
			return (IException) this;
		case File:
			return (IFile) this;
		case Namespace:
			return (INamespace) this;
		case Group:
			return (IGroup) this;
		case Page:
			return (IPage) this;
		case Example:
			return (IPage) this;
		case Dir:
			return (IDir) this;
		default:
			return null;
		}
	}

	public void release() {
		// XXX: maybe use java reference counting instead?
		Log.debug(2, "CompoundHandler::release() %d.%d\n", m_refCount, m_refCount - 1);
		if (--m_refCount <= 0) {
			m_mainHandler.unloadCompound(this);
		}
	}

	public ListIterator<IUserDefined> sections() {
		return m_sections.listIterator();
	}

	public ListIterator<IMember> memberByName(String name) {
		// XXX: name() is a single character? and id() as well?
		List<IMember> ml = m_memberNameDict.get(name);
		if (ml == null)
			return null;
		return ml.listIterator();
	}

	public void startInheritanceGraph(Attributes attrib) {
		m_inheritanceGraph = new GraphHandler(this, "inheritancegraph");
		m_inheritanceGraph.startGraph(attrib);
	}

	public void startCollaborationGraph(Attributes attrib) {
		m_collaborationGraph = new GraphHandler(this, "collaborationgraph");
		m_collaborationGraph.startGraph(attrib);
	}

	public void startIncludeDependencyGraph(Attributes attrib) {
		m_includeDependencyGraph = new GraphHandler(this, "incdepgraph");
		m_includeDependencyGraph.startGraph(attrib);
	}

	public void startIncludedByDependencyGraph(Attributes attrib) {
		m_includedByDependencyGraph = new GraphHandler(this, "invincdepgraph");
		m_includedByDependencyGraph.startGraph(attrib);
	}

	public IDocRoot briefDescription() {
		return m_brief;
	}

	public IDocRoot detailedDescription() {
		return m_detailed;
	}

	public IMember memberById(String id) {
		return (IFunction) m_memberDict.get(id);
	}

	public IGraph inheritanceGraph() {
		return m_inheritanceGraph;
	}

	public IGraph collaborationGraph() {
		return m_collaborationGraph;
	}

	public IGraph includeDependencyGraph() {
		return m_includeDependencyGraph;
	}

	public IGraph includedByDependencyGraph() {
		return m_includedByDependencyGraph;
	}

	public ListIterator<IRelatedCompound> baseCompounds() {
		return m_superClasses.listIterator();
	}

	public ListIterator<IRelatedCompound> derivedCompounds() {
		return m_subClasses.listIterator();
	}

	public ListIterator<ICompound> nestedCompounds() {
		return new CompoundIdIterator(m_mainHandler, m_innerCompounds);
	}

	public IDocProgramListing source() {
		return m_programListing;
	}

	public ListIterator<IInclude> includes() {
		return m_includes.listIterator();
	}

	public ListIterator<IInclude> includedBy() {
		return m_includedBy.listIterator();
	}

	public ListIterator<IParam> templateParameters() {
		return m_templateParamList != null ? m_templateParamList.templateParams() : null;
	}

	public IDocTitle title() {
		return m_titleHandler;
	}

	public ListIterator<IMemberReference> members() {
		return m_members != null ? m_members.members() : null;
	}

}