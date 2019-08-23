package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocRow extends IDoc
{
    ListIterator<IDocEntry> entries();
}