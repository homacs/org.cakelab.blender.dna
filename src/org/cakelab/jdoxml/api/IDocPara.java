package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocPara extends IDoc
{
    ListIterator<IDoc> contents(); 
}