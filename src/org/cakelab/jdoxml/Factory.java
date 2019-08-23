package org.cakelab.jdoxml;

import org.cakelab.jdoxml.api.IDoxygen;
import org.cakelab.jdoxml.impl.mainhandler.MainHandler;

public class Factory {
	/** Factory method that creates an empty object model for a doxygen generated XML file.
	 *  Use the readXMLDir() method to build the model from an XML output 
	 *  directory containing doxygen output.
	 */
	public static IDoxygen createObjectModel() {
		return MainHandler.createObjectModel();
	}

}
