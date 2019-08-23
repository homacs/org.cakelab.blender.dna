package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocParameterItem;
import org.cakelab.jdoxml.api.IDocParameterList;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a parameter section.
 *
 */
public class ParameterListHandler extends BaseHandler<ParameterListHandler> implements IDocParameterList {
	private IBaseHandler m_parent;
	List<IDocParameterItem> m_paramItems = new ArrayList<IDocParameterItem>();
	private Types m_type;

	public ParameterListHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("parameterlist", this, "endParameterList");
		addStartHandler("parameteritem", this, "startParameterItem");
	}

	public void startParameterList(Attributes attrib) {
		String kind = attrib.getValue("kind");
		if (kind == "retval")
			m_type = Types.RetVal;
		else if (kind == "exception")
			m_type = Types.Exception;
		else if (kind == "param")
			m_type = Types.Param;
		else {
			Log.debug(1, "Error: invalid parameterlist type: %s\n", kind);
		}
		Log.debug(2, "parameterlist kind=%s\n", kind);
		m_parent.setDelegate(this);
	}

	public void endParameterList() {
		m_parent.setDelegate(null);
	}

	public void startParameterItem(Attributes attrib) {
		ParameterItemHandler paramItem = new ParameterItemHandler(this);
		m_paramItems.add(paramItem);
		paramItem.startParameterItem(attrib);
	}

	public ListIterator<IDocParameterItem> params() {
		return m_paramItems.listIterator();
	}

	public Kind kind() {
		return Kind.ParameterList;
	}

	public Types sectType() {
		return m_type;
	}

}