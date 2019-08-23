package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocTitle extends IDoc
{
    ListIterator<IDoc> title();
    String text();
}