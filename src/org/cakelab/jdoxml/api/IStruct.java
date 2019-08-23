package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a struct in the object model. 
 */
public interface IStruct extends ICompound
{
	ListIterator<ICompound> nestedCompounds();
    ListIterator<IRelatedCompound> baseCompounds();
    ListIterator<IRelatedCompound> derivedCompounds();
    String locationFile();
    int locationLine();
    int locationBodyStartLine();
    int locationBodyEndLine();
}