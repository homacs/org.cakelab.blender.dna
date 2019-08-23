package org.cakelab.jdoxml.impl.basehandler;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class BaseFallBackHandler<T> extends DefaultHandler implements IFallBackHandler
{

	private ElementMapper<T> elementMapper = new ElementMapper<T>();
	
	
    public BaseFallBackHandler() 
    {
    }
    
    public boolean handleStartElement(String name, Attributes attrib)
    {
    	ElementMapper<T>.StartElementHandler handler = elementMapper.m_startHandlers.get(name);
      if (handler != null)
      {
        handler.call(attrib);
        return true;
      }
      return false;
    }
    
    public boolean handleEndElement(String name)
    {
      ElementMapper<T>.EndElementHandler handler = elementMapper.m_endHandlers.get(name);
      if (handler != null)
      {
        handler.call();
        return true;
      }
      return false;
    }

	public void addStartHandler(String key) {
		elementMapper.addStartHandler(key);
	}

	public void addEndHandler(String key) {
		elementMapper.addEndHandler(key);
	}

	public void addStartHandler(String key, T obj, String methodName) {
		elementMapper.addStartHandler(key, obj, methodName);
	}

	public void addEndHandler(String key, T obj, String methodName) {
		elementMapper.addEndHandler(key, obj, methodName);
	}
    
    
}