package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a Java/IDL public interface in the object model. 
 */
public interface IInterface extends ICompound
{
	ListIterator<IRelatedCompound> baseCompounds();
	ListIterator<IRelatedCompound> derivedCompounds();
}