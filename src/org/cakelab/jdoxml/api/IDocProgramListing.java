package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocProgramListing extends IDoc
{
    ListIterator<IDocCodeLine> codeLines();
}