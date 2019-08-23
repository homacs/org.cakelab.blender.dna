package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocVariableListEntry extends IDoc
{
    ListIterator<ILinkedText> term();
    IDocPara description();
}