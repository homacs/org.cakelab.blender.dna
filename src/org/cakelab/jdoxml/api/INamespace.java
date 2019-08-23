package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a namespace in the object model. 
 */
public interface INamespace extends ICompound
{
	ListIterator<ICompound> nestedCompounds();
}