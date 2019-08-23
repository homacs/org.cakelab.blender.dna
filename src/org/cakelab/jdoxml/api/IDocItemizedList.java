package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocItemizedList extends IDoc
{
    ListIterator<IDocListItem> elements();
}