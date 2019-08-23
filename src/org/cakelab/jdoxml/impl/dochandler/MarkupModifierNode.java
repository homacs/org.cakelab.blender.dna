package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.api.IDocMarkupModifier;

/** Node representing a change in the markup style.
 *
 */
class MarkupModifierNode implements IDocMarkupModifier
{
    private int m_markup;
    private boolean m_enabled;
    private int m_headingLevel;
    
    MarkupModifierNode(int markup, boolean enabled) {
    	this(markup, enabled, 0);
    }
    MarkupModifierNode(int markup, boolean enabled, int level) {
      m_markup = markup;
      m_enabled = enabled;
      m_headingLevel = level;
    }
  
    public MarkupModifierNode(IDocMarkup.Markup markup, boolean enabled) {
    	this(markup.value(), enabled);
	}
	public MarkupModifierNode(IDocMarkup.Markup markup, boolean enabled, int level) {
		this(markup.value(), enabled, level);
}
	// IDocMarkupModifier
    public Kind kind() { return Kind.MarkupModifier; }
    public boolean enabled() { return m_enabled; }
    public int markup() { return m_markup; }
    public int headingLevel() { return m_headingLevel; }

}