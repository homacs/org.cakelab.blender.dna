package org.cakelab.jdoxml.api;

/**
 * Interface to summarise elements which have brief 
 * and detailed descriptions.
 *
 */
public interface IDocumentedElement {
	
	/** provides the brief description for this element. */
    IDocRoot briefDescription();
    
    /** provides the detailed description for this element. */
    IDocRoot detailedDescription();
}
