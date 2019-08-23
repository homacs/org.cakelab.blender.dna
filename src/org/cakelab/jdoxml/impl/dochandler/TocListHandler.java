package org.cakelab.jdoxml.impl.dochandler;

import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocTocItem;
import org.cakelab.jdoxml.api.IDocTocList;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing table of contents list.
 *
 */
public class TocListHandler extends BaseHandler<TocListHandler> implements IDocTocList
{
    IBaseHandler   m_parent;
    List<IDocTocItem>     m_children;

    public Kind kind() { 
    	return Kind.TocList; 
    }

  //----------------------------------------------------------------------
 // TocListHandler
 //----------------------------------------------------------------------

 TocListHandler(IBaseHandler parent)
 {
	 m_parent = parent;
	   addEndHandler("toclist", this, "endTocList");
	   addStartHandler("tocitem", this, "startTocItem");
 }

public void startTocList(Attributes attrib)
 {
   m_parent.setDelegate(this);
 }

public void endTocList()
 {
   m_parent.setDelegate(null);
 }

public void startTocItem(Attributes attrib)
 {
   TocItemHandler tiHandler = new TocItemHandler(this);
   tiHandler.startTocItem(attrib);
   m_children.add(tiHandler);
 }

public ListIterator<IDocTocItem> elements() {
   return m_children.listIterator();
 }

}