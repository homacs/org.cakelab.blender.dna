package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** \brief public interface to a directory in the object model. */
public interface IDir extends ICompound
{
	ListIterator<ICompound> nestedCompounds();
}