package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocListItem;
import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a list item.
 *
 */
public class ListItemHandler extends BaseHandler<ListItemHandler> implements IDocListItem {
	private IBaseHandler m_parent;
	List<IDocPara> m_children = new ArrayList<IDocPara>();

	// IDocItem
	public Kind kind() {
		return Kind.ListItem;
	}

	public ListItemHandler(IBaseHandler parent) {
		m_parent = parent;

		addEndHandler("listitem", this, "endListItem");

		addStartHandler("para", this, "startParagraph");
	}

	public void startListItem(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "start list item handler\n");
	}

	public void endListItem() {
		Log.debug(2, "end list item handler\n");
		m_parent.setDelegate(null);
	}

	public void startParagraph(Attributes attrib) {
		ParagraphHandler parHandler = new ParagraphHandler(this);
		parHandler.startParagraph(attrib);
		m_children.add(parHandler);
	}

	public ListIterator<IDocPara> contents() {
		return m_children.listIterator();
	}

}