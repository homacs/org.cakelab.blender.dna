package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocCopy extends IDoc
{
    ListIterator<IDocPara> contents(); 
}