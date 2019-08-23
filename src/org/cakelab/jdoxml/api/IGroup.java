package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a group in the object model. 
 */
public interface IGroup extends ICompound
{
	ListIterator<ICompound> nestedCompounds();
    // group:
    //  Title()
    //  innerFile()
    //  innerPage()
}