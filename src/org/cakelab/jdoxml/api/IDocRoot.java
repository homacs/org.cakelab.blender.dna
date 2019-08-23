package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocRoot extends IDoc
{
    ListIterator<IDoc> contents(); 
    IDocInternal internal();
	String text(); 
}