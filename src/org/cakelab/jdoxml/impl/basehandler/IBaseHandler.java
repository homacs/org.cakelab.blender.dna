package org.cakelab.jdoxml.impl.basehandler;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

public interface IBaseHandler extends ContentHandler 
{
    void setDelegate(DefaultHandler delegate);
    DefaultHandler delegate();
}