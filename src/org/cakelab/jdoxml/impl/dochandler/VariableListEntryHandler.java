package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocVariableListEntry;
import org.cakelab.jdoxml.api.ILinkedText;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.cakelab.jdoxml.impl.linkedtexthandler.LinkedTextHandler;
import org.xml.sax.Attributes;

/* \brief Node representing an named item of a VariableList.
 *
 */
public class VariableListEntryHandler extends BaseHandler<VariableListEntryHandler> implements IDocVariableListEntry {
	private IBaseHandler m_parent;
	private List<ILinkedText> m_term = new ArrayList<ILinkedText>();
	private ParagraphHandler m_description;
	private LinkedTextHandler m_linkedTextHandler;

	public VariableListEntryHandler(IBaseHandler parent) {
		m_parent = parent;
		m_description = null;
		m_linkedTextHandler = null;
		addStartHandler("term", this, "startTerm");
		addEndHandler("term", this, "endTerm");
		addStartHandler("para", this, "startParagraph");
		addEndHandler("varlistentry", this, "endVarListEntry");
		addEndHandler("listitem", this, "endListItem");
	}

	public void startVarListEntry(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start varlistentry\n");
	}

	public void endVarListEntry() {
		m_parent.setDelegate(null);
		Log.debug(2, "end varlistentry\n");
	}

	public void startListItem(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start listitem\n");
	}

	public void endListItem() {
		m_parent.setDelegate(null);
		Log.debug(2, "end listitem\n");
	}

	public void startTerm(Attributes attrib) {
		m_curString = "";
		m_linkedTextHandler = new LinkedTextHandler(this, m_term);
		m_linkedTextHandler.start("term");
	}

	public void endTerm() {
		m_linkedTextHandler = null;
	}

	public void startParagraph(Attributes attrib) {
		assert (m_description == null);
		m_description = new ParagraphHandler(this);
		m_description.startParagraph(attrib);
	}

	public ListIterator<ILinkedText> term() {
		return m_term.listIterator();
	}

	public Kind kind() {
		return Kind.VariableListEntry;
	}

	public IDocPara description() {
		return m_description;
	}

}