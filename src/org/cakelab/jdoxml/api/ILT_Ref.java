package org.cakelab.jdoxml.api;

/** Reference to an object.
 */
public interface ILT_Ref extends ILinkedText
{
    enum TargetKind { Member, Compound };
    String id();
    TargetKind targetKind();
    String external();
    String text();
}