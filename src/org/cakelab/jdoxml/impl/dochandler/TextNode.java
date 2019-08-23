package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.api.IDocText;

/** Node representing a piece of text.
 *
 */
public class TextNode implements IDocText
{
    private String m_text;
    private int m_markup;
    private int m_headingLevel;
    
    public TextNode(String t, int markup, int level) {
    	m_text = t;
    	m_markup = markup;
    	m_headingLevel = level;
    }

    public TextNode(String t, IDocMarkup.Markup markup, int level) {
    	this(t, markup.value(), level);
    }

    // IDocText
    public Kind kind() { return Kind.Text; }
    public String text() { return m_text; }
    public int markup() { return m_markup; }
    public int headingLevel() { return m_headingLevel; }
  
}