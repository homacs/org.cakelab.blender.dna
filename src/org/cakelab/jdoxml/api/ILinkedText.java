package org.cakelab.jdoxml.api;
/** Base public interface for hyperlinked text
 *
 *  Depending on the result of kind() the public interface is extended by
 *  ILT_Text or ILT_Ref.
 */
public interface ILinkedText
{
    enum Kind { Kind_Text, Kind_Ref };
    Kind kind();
}
