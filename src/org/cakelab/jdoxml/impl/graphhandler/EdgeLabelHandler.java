package org.cakelab.jdoxml.impl.graphhandler;

import org.cakelab.jdoxml.api.IEdgeLabel;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class EdgeLabelHandler extends BaseHandler<EdgeLabelHandler> implements IEdgeLabel {
	private IBaseHandler m_parent;
	private String m_label;

	public EdgeLabelHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("edgelabel", this, "endEdgeLabel");
	}

	public void startEdgeLabel(Attributes attrib) {
		m_parent.setDelegate(this);
		m_curString = "";
	}

	public void endEdgeLabel() {
		m_label = m_curString;
		m_parent.setDelegate(null);
	}

	public String label() {
		return m_label;
	}

}