package org.cakelab.jdoxml.impl.compoundhandler;


import org.cakelab.jdoxml.api.IInclude;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

public class IncludeHandler extends BaseHandler<IncludeHandler> implements IInclude
{
    IBaseHandler m_parent;
    String m_name;             // element's content
    String m_refId;            // refid
    boolean m_isLocal;                // local
    
    public IncludeHandler(IBaseHandler parent, String endtag) {
    	this.m_parent = parent;
    	addEndHandler(endtag, this, "endInclude");
    }

	public void startInclude(Attributes attrib) {
		  m_curString = "";
		  m_refId     = attrib.getValue("refid");
		  m_isLocal   = attrib.getValue("local")=="yes";
		  m_parent.setDelegate(this);

	}
    public void endInclude() {
    	  m_name = m_curString;
    	  m_parent.setDelegate(null);
    	  Log.debug(2,"Found include %s\n", m_name);
   	
    }

    // IInclude
    public String name() { 
    	return m_name; 
    }
    public String refId() { 
    	return m_refId; 
    }
	public boolean isLocal() { 
		return m_isLocal; 
	}

}