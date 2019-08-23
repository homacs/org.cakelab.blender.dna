package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a file in the object model. 
 */
public interface IFile extends ICompound
{
    IGraph includeDependencyGraph();
    IGraph includedByDependencyGraph();
    IDocProgramListing source();
    ListIterator<ICompound> nestedCompounds();

    ListIterator<IInclude> includes();
    ListIterator<IInclude> includedBy();

    //  ICompound *innerNamespaces()
    //  ICompoundIterator *innerClasses()
}