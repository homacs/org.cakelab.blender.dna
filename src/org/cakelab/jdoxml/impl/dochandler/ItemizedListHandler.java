package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocItemizedList;
import org.cakelab.jdoxml.api.IDocListItem;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing list of items.
 *
 */
public class ItemizedListHandler extends BaseHandler<ItemizedListHandler> implements IDocItemizedList {
	private IBaseHandler m_parent;
	List<IDocListItem> m_children = new ArrayList<IDocListItem>();

	public ItemizedListHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("itemizedlist", this, "endItemizedList");
		addStartHandler("listitem", this, "startItemizedListItem");
	}

	public void startItemizedList(Attributes attrib) {
		m_parent.setDelegate(this);
	}

	public void endItemizedList() {
		m_parent.setDelegate(null);
	}

	public void startItemizedListItem(Attributes attrib) {
		ListItemHandler liHandler = new ListItemHandler(this);
		liHandler.startListItem(attrib);
		m_children.add(liHandler);
	}

	public ListIterator<IDocListItem> elements() {
		return m_children.listIterator();
	}

	public Kind kind() {
		return Kind.ItemizedList;
	}

}