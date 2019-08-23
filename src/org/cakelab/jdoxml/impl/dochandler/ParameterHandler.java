package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocParameter;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a parameter.
 *
 */
public class ParameterHandler extends BaseHandler<ParameterHandler> implements IDocParameter
{
    private IBaseHandler    m_parent;
    private String			m_name;
    

	public ParameterHandler(IBaseHandler parent)
	{
		  m_parent = parent;
		  addEndHandler("parametername", this, "endParameterName");
	}
	
	public void startParameterName(Attributes attrib)
	{
	  m_parent.setDelegate(this);
	}
	
	public void endParameterName()
	{
	  m_name = m_curString;
	  Log.debug(2,"parameter %s\n",m_name);
	  m_curString="";
	  m_parent.setDelegate(null);
	}

    // IDocParameter
    public Kind kind() { 
    	return Kind.Parameter; 
    }
    public String name() { 
    	return m_name; 
    }

}