package org.cakelab.jdoxml.impl.basehandler;

import org.xml.sax.Attributes;

interface IFallBackHandler
{
    boolean handleStartElement(String name, Attributes attrib);
    boolean handleEndElement(String name);
}