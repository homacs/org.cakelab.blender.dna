package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocListItem extends IDoc
{
    ListIterator<IDocPara> contents();
}