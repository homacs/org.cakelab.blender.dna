package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocNDash;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a horizontal ruler
 *
 */
public class NDashHandler extends BaseHandler<NDashHandler> implements IDocNDash {

	private IBaseHandler m_parent;

	public NDashHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("ndash", this, "end");
	}

	public void start(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start ndash\n");
	}

	public void end() {
		m_parent.setDelegate(null);
		Log.debug(2, "End ndash\n");
	}

	public Kind kind() {
		return Kind.NDash;
	}

}