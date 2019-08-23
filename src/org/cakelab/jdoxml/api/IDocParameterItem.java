package org.cakelab.jdoxml.api;

import java.util.ListIterator;

import org.cakelab.jdoxml.impl.dochandler.ParameterHandler;

public interface IDocParameterItem extends IDoc
{
    ListIterator<ParameterHandler> paramNames();
    IDocPara description();
}