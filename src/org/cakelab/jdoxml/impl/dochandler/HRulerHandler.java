package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocHRuler;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a horizontal ruler
 *
 */
public class HRulerHandler extends BaseHandler<HRulerHandler> implements IDocHRuler {

	private IBaseHandler m_parent;

	public HRulerHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("hruler", this, "endHRuler");
	}

	public void startHRuler(Attributes attrib) {
		m_parent.setDelegate(this);
		Log.debug(2, "Start hruler\n");
	}

	public void endHRuler() {
		m_parent.setDelegate(null);
		Log.debug(2, "End hruler\n");
	}

	public Kind kind() {
		return Kind.HRuler;
	}

}