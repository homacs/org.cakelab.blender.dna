package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IMember extends IDocumentedElement
{
    enum MemberKind { 
    	Invalid,
    	Define,
    	Property,
    	Variable,
    	Typedef,
    	Enum,
    	Function,
    	Signal,
    	Prototype,
    	Friend,
    	DCOP,
    	Slot, 
        EnumValue;
    	public int value() {
    		return ordinal();
    	}
	}

    ICompound compound();
    ISection section();
    MemberKind kind();
    String  kindString();
    String  id();
    String  protection();
    String  virtualness();
    ListIterator<ILinkedText> type();
    String  typeString();
    String  name();
    String  readAccessor();
    String  writeAccessor();
    String  definition();
    String  argsstring();
    boolean isConst();
    boolean isVolatile();
    boolean isStatic();
    boolean isExplicit();
    boolean isInline();
    boolean isMutable();
    boolean isReadable();
    boolean isWritable();
    ListIterator<IParam> parameters();
    ListIterator<IParam> templateParameters();
    ListIterator<ILinkedText> initializer();
    ListIterator<ILinkedText> exceptions();
    ListIterator<IMemberReference> references(); 
    ListIterator<IMemberReference> referencedBy();
    String bodyFile();
    int bodyStart();
    int bodyEnd();
    String  definitionFile();
    int definitionLine();
    IMemberReference reimplements();
    ListIterator<IMemberReference> reimplementedBy();
    IDocRoot briefDescription();
    IDocRoot detailedDescription();
    IDocRoot inbodyDescription();
}