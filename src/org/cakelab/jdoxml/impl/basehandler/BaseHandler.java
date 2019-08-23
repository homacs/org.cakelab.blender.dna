package org.cakelab.jdoxml.impl.basehandler;

import org.cakelab.jdoxml.impl.Log;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BaseHandler<T> extends DefaultHandler implements IBaseHandler {
	protected ElementMapper<T> elementMapper = new ElementMapper<T>();
	protected static Locator s_theLocator = null;

	protected String m_curString = "";
	protected String m_skipUntil = "";
	protected int m_skipCount;
	protected DefaultHandler m_delegateHandler;
	protected IFallBackHandler m_fallBackHandler;

	public BaseHandler() {
		m_skipCount = 0;
		m_delegateHandler = null;
		m_fallBackHandler = null;
	}

	@Override
	public void startDocument() {
	}

	@Override
	public void startElement(String namespaceURI, String localName, String name, Attributes attrib)
			throws SAXException {
		if (m_delegateHandler != null) {
			m_delegateHandler.startElement(namespaceURI, localName, name, attrib);
		} else {
			if (!m_skipUntil.isEmpty()) {// skip mode
				if (m_skipUntil.equals(name))
					m_skipCount++;
				Log.debug(1, "line %d, col %d: skipping start tag %s count=%d\n", s_theLocator.getLineNumber(),
						s_theLocator.getColumnNumber(), name, m_skipCount);
			}
	
			ElementMapper<T>.StartElementHandler handler = elementMapper.m_startHandlers.get(name);
			if (handler != null) {
				handler.call(attrib);
				// printf("found start tag %s\n",name.data());
			} else {
	
				boolean isUnexpectedTag = (m_fallBackHandler == null || !m_fallBackHandler.handleStartElement(name, attrib));
		
				if (isUnexpectedTag) {
					Log.debug(1, "line %d, col %d: found unexpected tag `%s', skipping until matching end tag\n",
							s_theLocator.getLineNumber(), s_theLocator.getColumnNumber(), name);
					m_skipUntil = name;
					m_skipCount = 1;
				}
			}
		}
	}

	@Override
	public void endElement(String namespaceURI, String localName, String name) throws SAXException {
		if (m_delegateHandler != null) {
			m_delegateHandler.endElement(namespaceURI, localName, name);
		} else {
			if (name.equals(m_skipUntil)) {
				m_skipCount--;
				Log.debug(1, "line %d, col %d: skipping end tag %s count=%d\n", s_theLocator.getLineNumber(),
						s_theLocator.getColumnNumber(), name, m_skipCount);
				if (m_skipCount == 0) {
					m_skipUntil = "";
				}
				// printf("found end tag %s\n",name.data());
			} else if (m_skipUntil.isEmpty()) {
				ElementMapper<T>.EndElementHandler handler = elementMapper.m_endHandlers.get(name);
				if (handler != null) {
					handler.call();
					// printf("found end tag %s\n",name.data());
				} else if (m_fallBackHandler != null) {
					m_fallBackHandler.handleEndElement(name);
				}
			}
			m_curString = "";
		}
	}

	@Override
	public void skippedEntity(String s) throws SAXException {
		if (m_delegateHandler != null) {
			m_delegateHandler.skippedEntity(s);
		}

		Log.debug(1, "line %d, col %d: Skipped unhandled entity %s\n", s_theLocator.getLineNumber(),
				s_theLocator.getColumnNumber(), s);
	}

	/**
	 * called when a number of characters are received by the parser. \param ch
	 * the characters.
	 */
	@Override
	public void characters(char[] ch, int start, int len) throws SAXException {
		if (m_delegateHandler != null) {
			m_delegateHandler.characters(ch, start, len);
		}

		// printf("Found characters \"%s\"\n",ch.data());
		m_curString += new String(ch, start, len);
	}

	@Override
	public void setDelegate(DefaultHandler delegate) {
		m_delegateHandler = delegate;
	}

	@Override
	public DefaultHandler delegate() {
		return m_delegateHandler;
	}

	public void setFallBackHandler(IFallBackHandler h) {
		m_fallBackHandler = h;
	}

	public IFallBackHandler fallBackHandler() {
		return m_fallBackHandler;
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		if (s_theLocator != null && s_theLocator != locator) {
			Log.debug(1, "different locator.\n");
		}
		s_theLocator = locator;
	}

	public void addStartHandler(String key) {
		elementMapper.addStartHandler(key);
	}

	public void addStartHandler(String key, T obj, String methodName) {
		elementMapper.addStartHandler(key, obj, methodName);
	}

	public void addEndHandler(String key) {
		elementMapper.addEndHandler(key);
	}

	public void addEndHandler(String key, T obj, String methodName) {
		elementMapper.addEndHandler(key, obj, methodName);
	}

}