package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocIndexEntry;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an entry in the index.
 *
 */
// children: -
public class IndexEntryHandler extends BaseHandler<IndexEntryHandler> implements IDocIndexEntry {
	private IBaseHandler m_parent;
	private String m_primary;
	private String m_secondary;

	public IndexEntryHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("indexentry", this, "endIndexEntry");
		addStartHandler("primaryie", this, "startPrimaryIE");
		addEndHandler("primaryie", this, "endPrimaryIE");
		addStartHandler("secondaryie", this, "startSecondaryIE");
		addEndHandler("secondaryie", this, "endSecondaryIE");
	}

	public void startIndexEntry(Attributes attrib) {
		Log.debug(2, "start index entry\n");
		m_parent.setDelegate(this);
	}

	public void endIndexEntry() {
		Log.debug(2, "index entry primary=`%s' secondary=`%s'\n", m_primary, m_secondary);
		m_parent.setDelegate(null);
	}

	public void startPrimaryIE(Attributes attrib) {
		m_curString = "";
	}

	public void endPrimaryIE() {
		m_primary = m_curString;
	}

	public void startSecondaryIE(Attributes attrib) {
		m_curString = "";
	}

	public void endSecondaryIE() {
		m_secondary = m_curString;
	}

	public Kind kind() {
		return Kind.IndexEntry;
	}

	public String primary() {
		return m_primary;
	}

	public String secondary() {
		return m_secondary;
	}

}