package org.cakelab.jdoxml.impl.memberhandler;

import org.cakelab.jdoxml.api.IMember;
import org.cakelab.jdoxml.api.IMemberReference;
import org.cakelab.jdoxml.impl.mainhandler.MainHandler;

public class MemberReference implements IMemberReference {
	public String m_memId;
	public String m_name;
	public String m_scope;
	public String m_virtualness;
	public String m_protection;
	public String m_ambiguityScope;
	@SuppressWarnings("unused")
	private MainHandler m_mainHandler;

	public void initialize(MainHandler mh) {
		m_mainHandler = mh;
	}

	public IMember member() {
		// return m_mainHandler->memberById(m_memId);
		return null;
	}

	public String name() {
		return m_name;
	}

	public String scope() {
		return m_scope;
	}

	public String protection() {
		return m_protection;
	}

	public String virtualness() {
		return m_virtualness;
	}

	public String ambiguityScope() {
		return m_ambiguityScope;
	}

}