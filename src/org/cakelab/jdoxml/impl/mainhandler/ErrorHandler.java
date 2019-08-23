package org.cakelab.jdoxml.impl.mainhandler;

import org.cakelab.jdoxml.impl.Log;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ErrorHandler implements org.xml.sax.ErrorHandler {
	private String errorMsg = "";

	public String errorString() {
		return errorMsg;
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// XXX: not sure if we should propagate or suppress the exception when in QT we would return FALSE.
		Log.debug(1, "Warning at line %d column %d: %s\n", e.getLineNumber(), e.getColumnNumber(),
				e.getMessage());
		System.exit(-1);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		Log.debug(1, "Error at line %d column %d: %s\n", e.getLineNumber(), e.getColumnNumber(),
				e.getMessage());
		System.exit(-1);
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		Log.debug(1, "Fatal error at line %d column %d: %s\n", e.getLineNumber(), e.getColumnNumber(),
				e.getMessage());
		System.exit(-1);
	}

}