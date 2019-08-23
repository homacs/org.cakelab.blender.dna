package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocSection extends IDoc
{
    String id(); 
    int level();
    IDocTitle title();
    ListIterator<IDocPara> paragraphs();
    ListIterator<IDocSection> subSections();
    IDocInternal internal();
}