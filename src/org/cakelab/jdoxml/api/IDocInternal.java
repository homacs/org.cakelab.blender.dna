package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocInternal extends IDoc
{
    ListIterator<IDocPara> paragraphs();
    ListIterator<IDocSection> subSections();
}