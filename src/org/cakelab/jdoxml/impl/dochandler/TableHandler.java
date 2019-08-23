package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocRow;
import org.cakelab.jdoxml.api.IDocTable;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.StringDecode;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an entry in the table.
 *
 */
// children: row, caption
public class TableHandler extends BaseHandler<TableHandler> implements IDocTable {
	private IBaseHandler m_parent;
	List<IDocRow> m_children = new ArrayList<IDocRow>();
	private int m_numColumns;
	private String m_caption;

	TableHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("table", this, "endTable");
		addStartHandler("row", this, "startRow");
		addStartHandler("caption", this, "startCaption");
		addEndHandler("caption", this, "endCaption");
	}

	public void startTable(Attributes attrib) {
		m_parent.setDelegate(this);
		m_numColumns = StringDecode.toInt(attrib.getValue("cols"), 0);
		Log.debug(2, "table cols=%d\n", m_numColumns);
	}

	public void endTable() {
		m_parent.setDelegate(null);
	}

	public void startRow(Attributes attrib) {
		RowHandler rh = new RowHandler(this);
		rh.startRow(attrib);
		m_children.add(rh);
	}

	public void startCaption(Attributes attrib) {
		m_curString = "";
	}

	public void endCaption() {
		m_caption = m_curString;
	}

	public ListIterator<IDocRow> rows() {
		return m_children.listIterator();
	}

	public Kind kind() {
		return Kind.Table;
	}

	public int numColumns() {
		return m_numColumns;
	}

	public String caption() {
		return m_caption;
	}

}