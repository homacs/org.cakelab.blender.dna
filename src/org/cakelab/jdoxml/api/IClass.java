package org.cakelab.jdoxml.api;

import java.util.ListIterator;


/** The public interface to a class in the object model. 
 */
public interface IClass extends ICompound
{
    IGraph inheritanceGraph();
    IGraph collaborationGraph();
    ListIterator<IRelatedCompound> baseCompounds();
    ListIterator<IRelatedCompound> derivedCompounds();
    ListIterator<ICompound> nestedCompounds();
    ListIterator<IParam> templateParameters();
    String locationFile();
    int locationLine();
    String locationBodyFile();
    int locationBodyStartLine();
    int locationBodyEndLine();

    // TODO:
    // class:
    //  listOfAllMembers()
    //  protection()
    //  isAbstract()
}