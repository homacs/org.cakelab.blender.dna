package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocVariableList;
import org.cakelab.jdoxml.api.IDocVariableListEntry;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a list of named items.
 *
 */
// children: varlistentry, listitem
public class VariableListHandler extends BaseHandler<VariableListHandler> implements IDocVariableList {
	private IBaseHandler m_parent;
	List<IDocVariableListEntry> m_entries = new ArrayList<IDocVariableListEntry>();
	private VariableListEntryHandler m_curEntry;

	public VariableListHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addStartHandler("varlistentry", this, "startVarListEntry");
		addStartHandler("listitem", this, "startListItem");
		addEndHandler("variablelist", this, "endVariableList");
	}

	public void startVariableList(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start variablelist\n");
	}

	public void endVariableList() {
		Log.debug(2, "end variablelist\n");
		m_parent.setDelegate(null);
	}

	public void startVarListEntry(Attributes attrib) {
		VariableListEntryHandler vle = new VariableListEntryHandler(this);
		vle.startVarListEntry(attrib);
		m_curEntry = vle;
		m_entries.add(vle);
	}

	public void startListItem(Attributes attrib) {
		assert (m_curEntry != null);
		m_curEntry.startListItem(attrib);
	}

	public ListIterator<IDocVariableListEntry> entries() {
		return m_entries.listIterator();
	}

	public Kind kind() {
		return Kind.VariableList;
	}

}