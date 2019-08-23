package org.cakelab.jdoxml.api;

import java.util.ListIterator;

public interface IDocHighlight extends IDoc
{
    enum HighlightKind 
    { 
    	Invalid,
    	Comment, 
    	Keyword, 
    	KeywordType, 
    	KeywordFlow, 
    	CharLiteral, 
    	StringLiteral, 
    	Preprocessor;
    	public int value() {
    		return ordinal();
    	}
    };
    HighlightKind highlightKind();
    ListIterator<IDoc>  codeElements();
}