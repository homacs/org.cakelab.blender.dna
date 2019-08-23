package org.cakelab.jdoxml.impl.graphhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IChildNode;
import org.cakelab.jdoxml.api.INode;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class NodeHandler extends BaseHandler<NodeHandler> implements INode {
	private IBaseHandler m_parent;
	private String m_id;
	private String m_label;
	private String m_link;
	List<IChildNode> m_children = new ArrayList<IChildNode>();
	private GraphHandler m_graph;

	NodeHandler(GraphHandler gh) {
		m_parent = gh;
		m_graph = gh;
		addEndHandler("node", this, "endNode");
		addStartHandler("link", this, "startLink");
		addEndHandler("link", this, "endLink");
		addStartHandler("label", this, "startLabel");
		addEndHandler("label", this, "endLabel");
		addStartHandler("childnode", this, "startChildNode");
	}

	public void startNode(Attributes attrib) {
		Log.debug(2, "startNode\n");
		m_parent.setDelegate(this);
		m_id = attrib.getValue("id");
	}

	public void endNode() {
		Log.debug(2, "endNode\n");
		m_parent.setDelegate(null);
	}

	public void startLink(Attributes attrib) {
		m_link = attrib.getValue("refid");
	}

	public void endLink() {
	}

	public void startLabel(Attributes attrib) {
		m_curString = "";
	}

	public void endLabel() {
		m_label = m_curString;
	}

	public void startChildNode(Attributes attrib) {
		ChildNodeHandler cnh = new ChildNodeHandler(this, m_graph);
		cnh.startChildNode(attrib);
		m_children.add(cnh);
	}

	public ListIterator<IChildNode> children() {
		return m_children.listIterator();
	}

	public String id() {
		return m_id;
	}

	public String label() {
		return m_label;
	}

	public String linkId() {
		return m_link;
	}

}