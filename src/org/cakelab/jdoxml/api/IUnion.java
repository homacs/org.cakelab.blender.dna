package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a union in the object model. 
 */
public interface IUnion extends ICompound
{
	ListIterator<ICompound> nestedCompounds();
}