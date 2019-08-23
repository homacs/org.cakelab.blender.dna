package org.cakelab.jdoxml.impl.dochandler;

import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocEntry;
import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an entry in the table entry.
 *
 */
// children: para
public class EntryHandler extends BaseHandler<EntryHandler> implements IDocEntry
{
    private IBaseHandler   m_parent;
    List<IDocPara>  m_children;

public EntryHandler(IBaseHandler parent)
  
{
	m_parent = parent;
  addEndHandler("entry", this, "endEntry");
  addStartHandler("para", this, "startParagraph");
}


public void startEntry(Attributes attrib)
{
  m_parent.setDelegate(this);
}

public void endEntry()
{
  m_parent.setDelegate(null);
}

public void startParagraph(Attributes attrib)
{
  ParagraphHandler ph = new ParagraphHandler(this);
  ph.startParagraph(attrib);
  m_children.add(ph);
}

public ListIterator<IDocPara> contents()
{
  return m_children.listIterator();
}

    public Kind kind() { return Kind.Entry; }

}