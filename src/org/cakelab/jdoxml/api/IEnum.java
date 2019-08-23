package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IEnum extends IMember
{
    ListIterator<IMember> enumValues();
}