package org.cakelab.jdoxml.impl.compoundhandler;

import org.cakelab.jdoxml.impl.Log;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

class CompoundErrorHandler implements org.xml.sax.ErrorHandler
{

	@Override
	public void warning(SAXParseException e) throws SAXException {
        Log.debug(1,"error at line %d column %d: %s\n",
                e.getLineNumber(),e.getColumnNumber(),
                e.getMessage());
		System.exit(-1);
	}
	@Override
	public void error(SAXParseException e) throws SAXException {
        Log.debug(1,"error at line %d column %d: %s\n",
                e.getLineNumber(),e.getColumnNumber(),
                e.getMessage());
		System.exit(-1);
	}
	@Override
	public void fatalError(SAXParseException e) throws SAXException {
        Log.debug(1,"Fatal error at line %d column %d: %s\n",
                e.getLineNumber(),e.getColumnNumber(),
                e.getMessage());
		System.exit(-1);
	}
}