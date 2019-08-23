package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface INode
{
    String id();
    String label();
    String linkId();
    ListIterator<IChildNode> children();
}