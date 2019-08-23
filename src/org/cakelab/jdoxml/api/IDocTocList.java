package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocTocList extends IDoc
{
    ListIterator<IDocTocItem> elements();
}