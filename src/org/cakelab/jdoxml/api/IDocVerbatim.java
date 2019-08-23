package org.cakelab.jdoxml.api;
public interface IDocVerbatim extends IDoc
{
    enum Types { 
    	Invalid, 
    	HtmlOnly, 
    	LatexOnly, 
    	Verbatim;
    	public int value() {
    		return ordinal();
    	}
    };
    String text(); 
    Types type();
}