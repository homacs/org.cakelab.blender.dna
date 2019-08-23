package org.cakelab.jdoxml.api;
public interface IDocRef extends IDoc
{
    enum TargetKind { 
    	Member, 
    	Compound;
    	public int value() { return ordinal(); }
    };
    String refId();
    TargetKind targetKind();
    String external();
    String text();
}