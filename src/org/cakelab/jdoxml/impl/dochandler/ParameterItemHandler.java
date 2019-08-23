package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocParameterItem;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/* \brief Node representing a list of param names with a single description.
 *
 */
public class ParameterItemHandler extends BaseHandler<ParameterItemHandler> implements IDocParameterItem {
	private IBaseHandler m_parent;
	List<ParameterHandler> m_parameters = new ArrayList<ParameterHandler>();
	private ParagraphHandler m_description;

	public ParameterItemHandler(IBaseHandler parent) {
		m_parent = parent;
		addEndHandler("parameteritem", this, "endParameterItem");
		addStartHandler("parameternamelist");
		addEndHandler("parameternamelist");
		addStartHandler("parametername", this, "startParameterName");
		addStartHandler("parameterdescription");
		addEndHandler("parameterdescription");
		addStartHandler("para", this, "startParagraph");
		m_description = null;
	}

	public void startParameterItem(Attributes attrib) {
		m_parent.setDelegate(this);
	}

	public void endParameterItem() {
		m_parent.setDelegate(null);
	}

	public void startParameterName(Attributes attrib) {
		ParameterHandler param = new ParameterHandler(this);
		m_parameters.add(param);
		param.startParameterName(attrib);
	}

	public void startParagraph(Attributes attrib) {
		m_description = new ParagraphHandler(this);
		m_description.startParagraph(attrib);
	}

	public ListIterator<ParameterHandler> paramNames() {
		return m_parameters.listIterator();
	}

	public Kind kind() {
		return Kind.ParameterItem;
	}

	public IDocPara description() {
		return m_description;
	}

}