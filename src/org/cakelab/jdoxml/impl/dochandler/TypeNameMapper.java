package org.cakelab.jdoxml.impl.dochandler;

import java.util.HashMap;
import java.util.Map;

public class TypeNameMapper {
	Map<String, SimpleSectHandler.Types> m_map = new HashMap<String, SimpleSectHandler.Types>();

	public TypeNameMapper() {
		m_map.put("see", SimpleSectHandler.Types.See);
		m_map.put("return", SimpleSectHandler.Types.Return);
		m_map.put("author", SimpleSectHandler.Types.Author);
		m_map.put("version", SimpleSectHandler.Types.Version);
		m_map.put("since", SimpleSectHandler.Types.Since);
		m_map.put("date", SimpleSectHandler.Types.Date);
		m_map.put("bug", SimpleSectHandler.Types.Bug);
		m_map.put("note", SimpleSectHandler.Types.Note);
		m_map.put("warning", SimpleSectHandler.Types.Warning);
		m_map.put("par", SimpleSectHandler.Types.Par);
		m_map.put("deprecated", SimpleSectHandler.Types.Deprecated);
		m_map.put("pre", SimpleSectHandler.Types.Pre);
		m_map.put("post", SimpleSectHandler.Types.Post);
		m_map.put("invariant", SimpleSectHandler.Types.Invar);
		m_map.put("remark", SimpleSectHandler.Types.Remark);
		m_map.put("attention", SimpleSectHandler.Types.Attention);
		m_map.put("todo", SimpleSectHandler.Types.Todo);
		m_map.put("test", SimpleSectHandler.Types.Test);
		m_map.put("rcs", SimpleSectHandler.Types.RCS);
		m_map.put("enumvalues", SimpleSectHandler.Types.EnumValues);
		m_map.put("examples", SimpleSectHandler.Types.Examples);
	}

	SimpleSectHandler.Types stringToType(String typeStr) {
		return m_map.get(typeStr);
	}
}