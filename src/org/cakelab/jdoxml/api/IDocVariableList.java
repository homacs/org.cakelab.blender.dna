package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocVariableList extends IDoc
{
    ListIterator<IDocVariableListEntry> entries();
}