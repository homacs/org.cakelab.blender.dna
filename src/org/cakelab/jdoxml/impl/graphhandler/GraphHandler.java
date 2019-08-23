package org.cakelab.jdoxml.impl.graphhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IGraph;
import org.cakelab.jdoxml.api.INode;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.Dict;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class GraphHandler extends BaseHandler<GraphHandler> implements IGraph {
	
	// global
	static EdgeRelationMapper s_edgeRelationMapper;
	public static void init() {
		s_edgeRelationMapper = new EdgeRelationMapper();
	}

	public static void exit() {
		s_edgeRelationMapper = null;
	}

	
	private IBaseHandler m_parent;
	List<INode> m_nodes = new ArrayList<INode>();
	private Dict<NodeHandler> m_nodeDict = new Dict<NodeHandler>(1009);

	public GraphHandler(IBaseHandler parent, String endTag)

	{
		m_parent = parent;
		addEndHandler(endTag, this, "endGraph");
		addStartHandler("node", this, "startNode");
	}

	public void startGraph(Attributes attrib) {
		Log.debug(2, "startGraph\n");
		m_parent.setDelegate(this);
	}

	public void endGraph() {
		Log.debug(2, "endGraph\n");
		m_parent.setDelegate(null);
	}

	public void startNode(Attributes attrib) {
		NodeHandler n = new NodeHandler(this);
		n.startNode(attrib);
		m_nodes.add(n);
		m_nodeDict.insert(attrib.getValue("id"), n);
	}

	public ListIterator<INode> nodes() {
		return m_nodes.listIterator();
	}

	public NodeHandler getNodeById(String id) {
		return m_nodeDict.find(id);
	}


}