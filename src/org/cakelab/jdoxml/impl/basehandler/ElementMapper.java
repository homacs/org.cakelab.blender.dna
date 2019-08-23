package org.cakelab.jdoxml.impl.basehandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.xml.sax.Attributes;

class ElementMapper<T>
{

	public class StartElementHandler
    {
        private T m_parent;
		private Method m_handler;

		public StartElementHandler() {
        	 this.m_parent = null;
		}
		public StartElementHandler(T parent, Method h) {
			this.m_parent = parent;
			this.m_handler = h;
		}
		
		public void call(Attributes attrib) { 
			if (m_parent != null) {
				try {
					m_handler.invoke(m_parent, attrib);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					throw new RuntimeException("implementation error", e);
				} 
			}
		}
    }

    public class EndElementHandler
    {
        T m_parent;
        Method m_handler;
        
        public EndElementHandler() { 
        	m_parent = null;
        }
        public EndElementHandler(T parent, Method h) {
        	m_parent = parent; 
        	m_handler = h;
        }
        public void call() { 
        	if (m_parent != null) {
        		try {
					m_handler.invoke(m_parent);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					throw new RuntimeException("internal error", e);
				} 
        	}
        }
    }

    
    protected Dict<StartElementHandler> m_startHandlers;
    protected Dict<EndElementHandler>   m_endHandlers;

    public ElementMapper()
    {
    	m_startHandlers = new Dict<StartElementHandler>(67);
    	m_endHandlers = new Dict<EndElementHandler>(67);
    }

    public void addStartHandler(String key)
    {
      m_startHandlers.insert(key,new StartElementHandler());
    }

    public void addStartHandler(String key, T obj, Method handler)
    {
      m_startHandlers.insert(key,new StartElementHandler(obj,handler));
    }
    
    public void addEndHandler(String key)
    {
      m_endHandlers.insert(key,new EndElementHandler());
    }

    public void addEndHandler(String key, T obj, Method handler)
    {
      m_endHandlers.insert(key,new EndElementHandler(obj,handler));
    }

	public void addStartHandler(String key, T obj, String methodName) {
		try {
			addStartHandler(key, obj, obj.getClass().getMethod(methodName, Attributes.class));
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException("implementation error", e);
		}
	}

	public void addEndHandler(String key, T obj, String methodName) {
		try {
			addEndHandler(key, obj, obj.getClass().getMethod(methodName));
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException("implementation error", e);
		}
	}


}