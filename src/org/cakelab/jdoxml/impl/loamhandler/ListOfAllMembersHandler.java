package org.cakelab.jdoxml.impl.loamhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IMemberReference;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.cakelab.jdoxml.impl.mainhandler.MainHandler;
import org.cakelab.jdoxml.impl.memberhandler.MemberReference;
import org.xml.sax.Attributes;

public class ListOfAllMembersHandler extends BaseHandler<ListOfAllMembersHandler>
{
    protected IBaseHandler m_parent;
    protected List<IMemberReference> m_members = new ArrayList<IMemberReference>();
    


public ListOfAllMembersHandler(IBaseHandler parent) 
{
	m_parent = parent;

  addStartHandler("member", this, "startMember");
  addStartHandler("name", this, "startName");
  addEndHandler("name", this, "endName");
  addStartHandler("scope", this, "startScope");
  addEndHandler("scope", this, "endScope");

  addEndHandler("listofallmembers", this, "endListOfAllMembers");
}

public void initialize(MainHandler mh)
{
  for (IMemberReference mr : m_members)
  {
    ((MemberReference)mr).initialize(mh);
  }
}

public void startMember(Attributes attrib)
{
  MemberReference mr = new MemberReference();
  mr.m_memId = attrib.getValue("refid");
  mr.m_virtualness = attrib.getValue("virt");
  mr.m_protection = attrib.getValue("prot");
  mr.m_ambiguityScope = attrib.getValue("ambiguityscope");
  m_members.add(mr);
}

public void startName(Attributes attrib)
{
  m_curString="";
}

public void endName()
{
  assert (m_members.size() != 0);
  ((MemberReference)m_members.get(m_members.size()-1)).m_name = m_curString;
}

public void startScope(Attributes attrib)
{
  m_curString="";
}

public void endScope()
{
	  assert (m_members.size() != 0);
	  ((MemberReference)m_members.get(m_members.size()-1)).m_scope = m_curString;
}

public void startListOfAllMembers(Attributes  attrib)
{
  m_parent.setDelegate(this);
  Log.debug(2,"listofallmembers start\n");
}

public void endListOfAllMembers()
{
  m_parent.setDelegate(null);
  Log.debug(2,"listofallmembers end\n");
}

public ListIterator<IMemberReference> members() 
{ 
  return m_members.listIterator(); 
}

    
}