package org.cakelab.jdoxml.impl.compoundhandler;

import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.api.IRelatedCompound;

public class RelatedCompound implements IRelatedCompound
{
    private CompoundHandler m_parent;
    private String m_id;                  // refid
    private Protection m_protection;       // prot
    private Kind m_kind;                   // virt
    private String m_name;             // element's content
    
    public RelatedCompound(CompoundHandler parent,
                    String id, Protection prot, Kind kind) {
        m_parent = parent;
        m_id = id;
        m_protection = prot; 
        m_kind = kind;
    }

    void setName(String str) { 
    	m_name = str; 
    }

    public ICompound compound() {
    	return m_parent.m_mainHandler.compoundById(m_id); 
    }
    public Protection protection() {
    	return m_protection; 
    }
    public Kind kind() { 
    	return m_kind; 
    }
    public String name() { 
    	return m_name; 
    }
    
}