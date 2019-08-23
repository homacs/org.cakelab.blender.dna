package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocMDash;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a horizontal ruler
 *
 */
public class MDashHandler extends BaseHandler<MDashHandler> implements IDocMDash {

	private IBaseHandler m_parent;

	public MDashHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("mdash", this, "end");
	}

	public void start(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start mdash\n");
	}

	public void end() {
		m_parent.setDelegate(null);
		Log.debug(2, "End mdash\n");
	}

	public Kind kind() {
		return Kind.MDash;
	}

}