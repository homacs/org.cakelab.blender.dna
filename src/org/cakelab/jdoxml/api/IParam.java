package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** Representation of a parameter of a function. */
public interface IParam 
{
	ListIterator<ILinkedText> type();
    String  declarationName();
    String  definitionName();
    String  attrib();
    String  arraySpecifier();
    ListIterator<ILinkedText> defaultValue();
    IDocRoot briefDescription();
}
