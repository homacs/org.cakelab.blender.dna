package org.cakelab.jdoxml.api;
public interface IDocSymbol extends IDoc
{
    enum Types 
    { 
    	Invalid,
    	Umlaut, 
    	Acute, 
    	Grave, 
    	Circ, 
    	Tilde, 
    	Szlig, 
    	Cedil, 
    	Ring, 
    	Nbsp, 
    	Copy;
    	public int value() {
    		return ordinal();
    	}
    };
    Types type();
    String typeString();
    char letter();
}