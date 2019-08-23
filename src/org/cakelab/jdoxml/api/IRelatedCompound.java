package org.cakelab.jdoxml.api;
public interface IRelatedCompound
{
    enum Protection { 
    	Public, 
    	Protected, 
    	Private;
    	public int value(){
    		return ordinal();
    	}
    }
    enum Kind { 
    	Normal, 
    	Virtual;
    	public int value() { return ordinal(); }
    };
    ICompound compound();
    Protection protection();
    Kind kind();
    String name();

}