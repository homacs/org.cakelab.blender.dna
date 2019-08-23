package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocOrderedList extends IDoc
{
    ListIterator<IDocListItem> elements();
}