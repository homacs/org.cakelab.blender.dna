package org.cakelab.jdoxml.api;
public interface IDocMarkupModifier extends IDoc
{
    boolean enabled();
    int markup();
    int headingLevel();
}