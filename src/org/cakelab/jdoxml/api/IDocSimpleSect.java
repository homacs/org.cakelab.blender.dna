package org.cakelab.jdoxml.api;
public interface IDocSimpleSect extends IDoc
{
    enum Types { Invalid,
                 See, Return, Author, Version, 
                 Since, Date, Bug, Note,
                 Warning, Par, Deprecated, Pre, 
                 Post, Invar, Remark, Attention,
                 Todo, Test, RCS, EnumValues, 
                 Examples;
    	public int value() {
    		return ordinal();
    	}
    };
    Types type();
    String   typeString();
    IDocTitle title();
    IDocPara  description();
}