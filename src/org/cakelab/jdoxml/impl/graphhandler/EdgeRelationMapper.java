package org.cakelab.jdoxml.impl.graphhandler;

import java.util.HashMap;
import java.util.Map;

import org.cakelab.jdoxml.api.IChildNode;

class EdgeRelationMapper {
	private Map<String, IChildNode.NodeRelation> m_map = new HashMap<String, IChildNode.NodeRelation>();

	EdgeRelationMapper() {
		m_map.put("public-inheritance", IChildNode.NodeRelation.PublicInheritance);
		m_map.put("protected-inheritance", IChildNode.NodeRelation.ProtectedInheritance);
		m_map.put("private-inheritance", IChildNode.NodeRelation.PrivateInheritance);
		m_map.put("usage", IChildNode.NodeRelation.Usage);
		m_map.put("template-instance", IChildNode.NodeRelation.TemplateInstance);
	}

	public IChildNode.NodeRelation stringToNodeRelation(String nrStr) {
		return m_map.get(nrStr);
	}
}