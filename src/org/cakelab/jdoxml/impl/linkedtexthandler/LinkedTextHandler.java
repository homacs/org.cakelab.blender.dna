package org.cakelab.jdoxml.impl.linkedtexthandler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.cakelab.jdoxml.api.ILT_Ref;
import org.cakelab.jdoxml.api.ILT_Text;
import org.cakelab.jdoxml.api.ILinkedText;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class LinkedTextHandler extends BaseHandler<LinkedTextHandler>
{
    private IBaseHandler m_parent;
    private List<ILinkedText> m_children = new ArrayList<ILinkedText>();
    private LT_Ref m_ref;


public LinkedTextHandler(IBaseHandler parent, List<ILinkedText> children) 
{
	 m_parent =parent;
	 if (children == null) {
		 throw new RuntimeException("so nicht");
	 }
	 m_children = children;
  addStartHandler("ref",this,"startRef");
  addEndHandler("ref",this,"endRef");
  m_ref=null;
}

public void start(String endTag)
{
  addEndHandler(endTag,this,"end");
  m_parent.setDelegate(this);
  m_curString="";
}

public void end()
{
  if (!m_curString.isEmpty())
  {
    m_children.add(new LT_Text(m_curString));
    Log.debug(2,"LinkedTextHandler: add text `%s'\n",m_curString);
    m_curString="";
  }
  m_parent.setDelegate(null);
}

public void startRef(Attributes attrib)
{
  if (!m_curString.isEmpty())
  {
    m_children.add(new LT_Text(m_curString));
    Log.debug(2,"LinkedTextHandler: add text `%s'\n",m_curString);
    m_curString="";
  }
  assert (m_ref==null);
  m_ref = new LT_Ref();
  m_ref.setRefId(attrib.getValue("refid"));
  m_ref.setExtId(attrib.getValue("external"));
  assert (attrib.getValue("kindref")=="compound" || attrib.getValue("kindref")=="member");
  m_ref.setTargetKind(attrib.getValue("kindref")=="compound" ? ILT_Ref.TargetKind.Compound : ILT_Ref.TargetKind.Member);
}

public void endRef()
{
  m_ref.setText(m_curString);
  m_children.add(m_ref);
  Log.debug(2,"LinkedTextHandler: add ref `%s'\n",m_ref.text());
  m_ref=null;
}

public static String toString(List<ILinkedText> list) 
{
  Iterator<ILinkedText> li = list.iterator();
  String result = "";
  ILinkedText lt;
  if (li.hasNext()) for (lt = li.next();li.hasNext();lt = li.next())
  {
    switch(lt.kind())
    {
      case Kind_Text:
        result += ((ILT_Text)lt).text();
        break;
      case Kind_Ref:
        result += ((ILT_Ref)lt).text();
        break;
    }
  }
  return result;
}


}