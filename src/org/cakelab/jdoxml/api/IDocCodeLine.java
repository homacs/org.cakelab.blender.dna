package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocCodeLine extends IDoc
{
    int lineNumber();
    String refId();
    ListIterator<IDoc> codeElements();
}