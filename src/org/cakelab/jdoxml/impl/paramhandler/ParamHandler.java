package org.cakelab.jdoxml.impl.paramhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocRoot;
import org.cakelab.jdoxml.api.ILinkedText;
import org.cakelab.jdoxml.api.IParam;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.cakelab.jdoxml.impl.dochandler.DocHandler;
import org.cakelab.jdoxml.impl.linkedtexthandler.LinkedTextHandler;
import org.xml.sax.Attributes;

public class ParamHandler extends BaseHandler<ParamHandler> implements IParam {

	// XML elements:
	// -------------
	private List<ILinkedText> m_type = new ArrayList<ILinkedText>(); // type
	private String m_declName; // declname
	private String m_defName; // defname
	private String m_array; // array
	private List<ILinkedText> m_defVal = new ArrayList<ILinkedText>(); // defval
	private DocHandler m_brief; // briefdescription

	private String m_attrib; // TODO: not yet in XML output

	private IBaseHandler m_parent;
	private LinkedTextHandler m_linkedTextHandler;

	public ParamHandler(IBaseHandler parent) {
		m_brief = null;
		m_parent = parent;
		addEndHandler("param", this, "endParam");

		addStartHandler("type", this, "startType");

		addStartHandler("declname");
		addEndHandler("declname", this, "endDeclName");

		addStartHandler("defname");
		addEndHandler("defname", this, "endDefName");

		addStartHandler("array");
		addEndHandler("array", this, "endArray");

		addStartHandler("attribute");
		addEndHandler("attribute", this, "endAttrib");

		addStartHandler("briefdescription", this, "startBriefDesc");

		addStartHandler("defval", this, "startDefVal");

		m_linkedTextHandler = null;
	}

	public void startParam(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "param\n");
	}

	public void endParam() {
		m_parent.setDelegate(null);
	}

	public void startType(Attributes attrib) {
		m_linkedTextHandler = new LinkedTextHandler(this, m_type);
		m_linkedTextHandler.start("type");
		Log.debug(2, "param type\n");
	}

	public void endDeclName() {
		m_declName = m_curString.trim();
		Log.debug(2, "member declName=`%s'\n", m_declName);
	}

	public void endDefName() {
		m_defName = m_curString.trim();
		Log.debug(2, "member defName=`%s'\n", m_defName);
	}

	public void endAttrib() {
		m_attrib = m_curString.trim();
		Log.debug(2, "member attrib=`%s'\n", m_attrib);
	}

	public void endArray() {
		m_array = m_curString.trim();
		Log.debug(2, "member array=`%s'\n", m_array);
	}

	public void startDefVal(Attributes attrib) {
		m_linkedTextHandler = new LinkedTextHandler(this, m_defVal);
		m_linkedTextHandler.start("defval");
		Log.debug(2, "member defVal\n");
	}

	public void startBriefDesc(Attributes attrib) {
		DocHandler docHandler = new DocHandler(this);
		docHandler.startDoc(attrib);
		m_brief = docHandler;
	}

	public ListIterator<ILinkedText> type() {
		return m_type.listIterator();
	}

	public ListIterator<ILinkedText> defaultValue() {
		return m_defVal.listIterator();
	}

	public IDocRoot briefDescription() {
		return m_brief;
	}

	public String declarationName() {
		return m_declName;
	}

	public String definitionName() {
		return m_defName;
	}

	public String attrib() {
		return m_attrib;
	}

	public String arraySpecifier() {
		return m_array;
	}
}