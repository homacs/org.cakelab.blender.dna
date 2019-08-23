package org.cakelab.jdoxml.impl.mainhandler;

import org.cakelab.jdoxml.impl.basehandler.Dict;

public class CompoundEntry extends IndexEntry{
    Dict<MemberEntry> memberDict;
    
    public CompoundEntry(int size) 
    { 
    	memberDict = new Dict<MemberEntry>(size);
   	}
}

