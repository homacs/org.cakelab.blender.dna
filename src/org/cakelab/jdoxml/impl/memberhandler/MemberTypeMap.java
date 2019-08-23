package org.cakelab.jdoxml.impl.memberhandler;

import org.cakelab.jdoxml.api.IMember;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.Dict;

public class MemberTypeMap {
	private Dict<IMember.MemberKind> m_map = new Dict<IMember.MemberKind>();

	public MemberTypeMap() {
		m_map.insert("define", IMember.MemberKind.Define);
		m_map.insert("property", IMember.MemberKind.Property);
		m_map.insert("variable", IMember.MemberKind.Variable);
		m_map.insert("typedef", IMember.MemberKind.Typedef);
		m_map.insert("enum", IMember.MemberKind.Enum);
		m_map.insert("function", IMember.MemberKind.Function);
		m_map.insert("signal", IMember.MemberKind.Signal);
		m_map.insert("prototype", IMember.MemberKind.Prototype);
		m_map.insert("friend", IMember.MemberKind.Friend);
		m_map.insert("dcop", IMember.MemberKind.DCOP);
		m_map.insert("slot", IMember.MemberKind.Slot);
		m_map.insert("enumvalue", IMember.MemberKind.EnumValue);
	}

	public IMember.MemberKind map(String s) {
		IMember.MemberKind val = m_map.find(s);
		if (val == null) {
			Log.debug(1, "Warning: `%s' is an invalid member type\n", s);
			return IMember.MemberKind.Invalid;
		} else
			return val;
	}
};
