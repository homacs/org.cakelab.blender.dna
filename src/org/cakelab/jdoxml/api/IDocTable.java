package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocTable extends IDoc
{
    ListIterator<IDocRow> rows();
    int numColumns();
    String caption();
}