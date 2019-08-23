package org.cakelab.jdoxml.api;
public interface IMemberReference 
{
    IMember member();
    String name();
    String scope();
    String protection();
    String virtualness();
    String ambiguityScope();
}