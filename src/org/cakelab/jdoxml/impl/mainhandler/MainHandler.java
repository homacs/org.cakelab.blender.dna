package org.cakelab.jdoxml.impl.mainhandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.api.IDoxygen;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.Dict;
import org.cakelab.jdoxml.impl.compoundhandler.CompoundHandler;
import org.cakelab.jdoxml.impl.dochandler.DocHandler;
import org.cakelab.jdoxml.impl.graphhandler.GraphHandler;
import org.cakelab.jdoxml.impl.memberhandler.MemberHandler;
import org.cakelab.jdoxml.impl.sectionhandler.SectionHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainHandler extends BaseHandler<MainHandler> implements IDoxygen {
	private CompoundEntry m_curCompound;
	private MemberEntry m_curMember;
	private List<CompoundEntry> m_compounds = new ArrayList<CompoundEntry>();
	private Dict<CompoundEntry> m_compoundDict;
	private Dict<CompoundEntry> m_compoundNameDict;
	private Dict<MemberEntry> m_memberDict;
	private Dict<List<CompoundEntry>> m_memberNameDict;
	private String m_xmlDirName;
	private Dict<CompoundHandler> m_compoundsLoaded;
	private boolean m_insideMember;

	public MainHandler() {
		m_compoundDict = new Dict<CompoundEntry>(2999);
		m_compoundNameDict = new Dict<CompoundEntry>(2999);
		m_memberDict = new Dict<MemberEntry>(12251);
		m_memberNameDict = new Dict<List<CompoundEntry>>(12251);
		m_compoundsLoaded = new Dict<CompoundHandler>(1009);
		addStartHandler("doxygenindex");
		addEndHandler("doxygenindex");
		addStartHandler("compound", this, "startCompound");
		addEndHandler("compound");
		addStartHandler("member", this, "startMember");
		addEndHandler("member", this, "endMember");
		addStartHandler("name", this, "startName");
		addEndHandler("name", this, "endName");
		m_curCompound = null;
		m_insideMember = false;
	}

	public void startCompound(Attributes attrib) {
		m_curCompound = new CompoundEntry(257);
		m_curCompound.id = attrib.getValue("refid");
		m_compounds.add(m_curCompound);
		m_compoundDict.insert(m_curCompound.id, m_curCompound);
	}

	public void startName(Attributes attrib) {
		m_curString = "";
	}

	public void endName() {
		if (m_insideMember) {
			m_curMember.name = m_curString;
		} else {
			m_curCompound.name = m_curString;
			m_compoundNameDict.insert(m_curString, m_curCompound);
		}
	}

	public void startMember(Attributes attrib) {
		m_insideMember = true;
		m_curMember = new MemberEntry();
		m_curMember.id = attrib.getValue("refid");
		m_curMember.compound = m_curCompound;
		m_memberDict.insert(m_curMember.id, m_curMember);
	}

	public void endMember() {
		m_curCompound.memberDict.insert(m_curMember.name, m_curMember);
		List<CompoundEntry> cel = null;
		if ((cel = m_memberNameDict.find(m_curMember.name)) == null) {
			cel = new ArrayList<CompoundEntry>();
			m_memberNameDict.insert(m_curMember.name, cel);
		}
		cel.add(m_curCompound);
		m_insideMember = false;
	}

	public void setDebugLevel(int level) {
		Log.setDebugLevel(level);
	}

	public void dump() {
		if (Log.hasDebugLevel(2)) {
			for (CompoundEntry ce : m_compounds) {
				Log.debug(2, "compound id=`%s' name=`%s'\n", ce.id, ce.name);
				for (MemberEntry me : ce.memberDict.values()) {
					Log.debug(2, "  member id=`%s' name=`%s'\n", me.id, me.name);
				}
			}
		}
	}

	public void readXMLDir(File xmlDir) throws SAXException, IOException {
		m_xmlDirName = xmlDir.toString();
		File xmlFile = new File(xmlDir, "index.xml");
		FileInputStream input = new FileInputStream(xmlFile);
		InputSource source = new InputSource(input);
		XMLReader reader = XMLReaderFactory.createXMLReader();
		reader.setContentHandler(this);
		reader.setErrorHandler(new ErrorHandler());
		reader.parse(source);
		dump();
		input.close();
	}

	public ListIterator<ICompound> compounds() {
		return new CompoundEntryIterator(this, m_compounds);
	}

	public ICompound compoundById(String id) {
		String ids = id;
		if (ids.isEmpty())
			return null;
		CompoundHandler ch = m_compoundsLoaded.get(ids);
		if (ch != null) // compound already in memory
		{
			return ch.toICompound();
		}
		CompoundEntry ce = m_compoundDict.find(ids);
		if (ce == null)
			return null; // id not found
		// create and load a new compound
		ch = new CompoundHandler(m_xmlDirName);
		try {
			ch.parseXML(id);
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			// XXX: not sure if we should throw an exception
			// compound could not be initialized.
			return null;
		}

		ch.initialize(this);
		this.m_compoundsLoaded.insert(id, ch);
		return ch.toICompound();
	}

	public void unloadCompound(CompoundHandler ch) {
		// printf("unloading compound %s from memory\n",ch.id().latin1());
		CompoundHandler result = m_compoundsLoaded.remove(ch.id());
		if (result == null)
			Log.debug(1, "Failed to unload component!\n");
	}

	public ICompound compoundByName(String name) {
		String nameStr = name;
		if (nameStr.isEmpty())
			return null;
		CompoundEntry ce = m_compoundNameDict.get(name);
		if (ce == null)
			return null; // name not found
		return compoundById(ce.id);
	}

	public ICompound memberById(String id) {
		String ids = id;
		if (ids.isEmpty())
			return null;
		MemberEntry me = m_memberDict.get(id);
		if (me == null)
			return null; // id not found
		return compoundById(me.compound.id);
	}

	public ListIterator<ICompound> memberByName(String name) {
		String nameStr = name;
		if (nameStr.isEmpty())
			return null;
		List<CompoundEntry> cel = m_memberNameDict.get(name);
		if (cel == null)
			return null; // name not found
		return new CompoundEntryIterator(this, cel);
	}

	public static IDoxygen createObjectModel()
	{
	  CompoundHandler.init();
	  SectionHandler.sectionhandler_init();
	  MemberHandler.memberhandler_init();
	  DocHandler.init();
	  GraphHandler.init();
	  return new MainHandler();
	}

	public void release() {
		GraphHandler.exit();
		DocHandler.exit();
		MemberHandler.memberhandler_exit();
		SectionHandler.sectionhandler_exit();
		CompoundHandler.exit();
	}
}