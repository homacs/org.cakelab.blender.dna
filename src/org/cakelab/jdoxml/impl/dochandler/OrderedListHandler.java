package org.cakelab.jdoxml.impl.dochandler;

import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocListItem;
import org.cakelab.jdoxml.api.IDocOrderedList;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing list of items.
 *
 */
public class OrderedListHandler extends BaseHandler<OrderedListHandler> implements IDocOrderedList
{
    private IBaseHandler   m_parent;
    List<IDocListItem>  m_children;
    
    // IDocOrderedList
    public Kind kind() { 
    	return Kind.OrderedList; 
    }


  //----------------------------------------------------------------------
  // OrderedListHandler
  //----------------------------------------------------------------------

  public OrderedListHandler(IBaseHandler parent)
  {
	  m_parent = parent;
    addEndHandler("orderedlist",this,"endOrderedList");
    addStartHandler("listitem",this,"startOrderedListItem");
  }

  
  public void startOrderedList(Attributes attrib)
  {
    m_parent.setDelegate(this);
  }

  public void endOrderedList()
  {
    m_parent.setDelegate(null);
  }

  public void startOrderedListItem(Attributes attrib)
  {
    ListItemHandler liHandler = new ListItemHandler(this);
    liHandler.startListItem(attrib);
    m_children.add(liHandler);
  }

  public ListIterator<IDocListItem> elements()
  {
    return m_children.listIterator();
  }
}