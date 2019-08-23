package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocParameterList extends IDoc
{
    enum Types { Param, RetVal, Exception };
    Types sectType();
    ListIterator<IDocParameterItem> params();
}