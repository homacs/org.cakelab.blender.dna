package org.cakelab.jdoxml.impl.sectionhandler;

import org.cakelab.jdoxml.api.ISection;
import org.cakelab.jdoxml.api.ISection.SectionKind;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.Dict;

public class SectionTypeMap
{
    private Dict<ISection.SectionKind> m_map;

    SectionTypeMap()
    {
    	m_map = new Dict<ISection.SectionKind>(37);
      m_map.insert("user-defined",ISection.SectionKind.UserDefined);
      m_map.insert("public-type",ISection.SectionKind.PubTypes);
      m_map.insert("public-func",ISection.SectionKind.PubFuncs);
      m_map.insert("public-attrib",ISection.SectionKind.PubAttribs);
      m_map.insert("public-slot",ISection.SectionKind.PubSlots);
      m_map.insert("signal",ISection.SectionKind.Signals);
      m_map.insert("dcop-func",ISection.SectionKind.DCOPFuncs);
      m_map.insert("property",ISection.SectionKind.Properties);
      m_map.insert("event",ISection.SectionKind.Events);
      m_map.insert("public-static-func",ISection.SectionKind.PubStatFuncs);
      m_map.insert("public-static-attrib",ISection.SectionKind.PubStatAttribs);
      m_map.insert("protected-type",ISection.SectionKind.ProTypes);
      m_map.insert("protected-func",ISection.SectionKind.ProFuncs);
      m_map.insert("protected-attrib",ISection.SectionKind.ProAttribs);
      m_map.insert("protected-slot",ISection.SectionKind.ProSlots);
      m_map.insert("protected-static-func",ISection.SectionKind.ProStatFuncs);
      m_map.insert("protected-static-attrib",ISection.SectionKind.ProStatAttribs);
      m_map.insert("package-type",ISection.SectionKind.PacTypes);
      m_map.insert("package-func",ISection.SectionKind.PacFuncs);
      m_map.insert("package-attrib",ISection.SectionKind.PacAttribs);
      m_map.insert("package-static-func",ISection.SectionKind.PacStatFuncs);
      m_map.insert("package-static-attrib",ISection.SectionKind.PacStatAttribs);
      m_map.insert("private-type",ISection.SectionKind.PriTypes);
      m_map.insert("private-func",ISection.SectionKind.PriFuncs);
      m_map.insert("private-attrib",ISection.SectionKind.PriAttribs);
      m_map.insert("private-slot",ISection.SectionKind.PriSlots);
      m_map.insert("private-static-func",ISection.SectionKind.PriStatFuncs);
      m_map.insert("private-static-attrib",ISection.SectionKind.PriStatAttribs);
      m_map.insert("friend",ISection.SectionKind.Friend);
      m_map.insert("related",ISection.SectionKind.Related);
      m_map.insert("define",ISection.SectionKind.Defines);
      m_map.insert("prototype",ISection.SectionKind.Prototypes);
      m_map.insert("typedef",ISection.SectionKind.Typedefs);
      m_map.insert("enum",ISection.SectionKind.Enums);
      m_map.insert("func",ISection.SectionKind.Functions);
      m_map.insert("var",ISection.SectionKind.Variables);
    }
    ISection.SectionKind map(String s)
    {
      SectionKind val = m_map.find(s);
      if (val==null) 
      {
        Log.debug(1,"Warning: `%s' is an invalid section type\n",s);
        return ISection.SectionKind.Invalid;
      }
      else return val;
    }
}