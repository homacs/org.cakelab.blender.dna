package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocEntry extends IDoc
{
    ListIterator<IDocPara> contents();
}