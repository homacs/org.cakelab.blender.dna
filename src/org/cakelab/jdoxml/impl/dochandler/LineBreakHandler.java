package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocLineBreak;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a horizontal ruler
 *
 */
class LineBreakHandler extends BaseHandler<LineBreakHandler> implements IDocLineBreak {
	private IBaseHandler m_parent;

	public LineBreakHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("linebreak", this, "endLineBreak");
	}

	public void startLineBreak(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start linebreak\n");
	}

	void endLineBreak() {
		m_parent.setDelegate(null);
		Log.debug(2, "End linebreak\n");
	}

	public Kind kind() {
		return Kind.LineBreak;
	}

}