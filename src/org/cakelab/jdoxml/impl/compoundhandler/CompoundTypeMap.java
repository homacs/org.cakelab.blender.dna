package org.cakelab.jdoxml.impl.compoundhandler;

import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.Dict;

public class CompoundTypeMap
{
	
	private Dict<Integer> m_map = new Dict<Integer>(128);
	
	public CompoundTypeMap()
    {
      m_map.insert("class",    ICompound.CompoundKind.Class.value());
      m_map.insert("struct",   ICompound.CompoundKind.Struct.value());
      m_map.insert("union",    ICompound.CompoundKind.Union.value());
      m_map.insert("interface",ICompound.CompoundKind.Interface.value());
      m_map.insert("protocol", ICompound.CompoundKind.Protocol.value());
      m_map.insert("category", ICompound.CompoundKind.Category.value());
      m_map.insert("exception",ICompound.CompoundKind.Exception.value());
      m_map.insert("file",     ICompound.CompoundKind.File.value());
      m_map.insert("namespace",ICompound.CompoundKind.Namespace.value());
      m_map.insert("group",    ICompound.CompoundKind.Group.value());
      m_map.insert("page",     ICompound.CompoundKind.Page.value());
      m_map.insert("example",  ICompound.CompoundKind.Example.value());
      m_map.insert("dir",      ICompound.CompoundKind.Dir.value());
    }

    ICompound.CompoundKind map(String s)
    {
      int val = m_map.find(s);
      if (val==0) 
      {
        Log.debug(1,"Warning: `%s' is an invalid compound type\n", s);
        return ICompound.CompoundKind.Invalid;
      }
      else return ICompound.CompoundKind.values()[val];
    }
    
}