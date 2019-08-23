package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseFallBackHandler;
import org.xml.sax.Attributes;

/** Handles markup commands in the XML input. 
 *
 */
public class MarkupHandler extends BaseFallBackHandler<MarkupHandler> {

	private List<IDoc> m_children = new ArrayList<IDoc>();
	private String m_curString;
	private int m_curMarkup;
	private int m_headingLevel;

	int markup() {
		return m_curMarkup;
	}

	int headingLevel() {
		return m_headingLevel;
	}

	public MarkupHandler(List<IDoc> children, String curString) {
		m_children = children;
		m_curString = curString;
		m_curMarkup = IDocMarkup.Markup.Normal.value();
		m_headingLevel = 0;

		addStartHandler("bold", this, "startBold");
		addEndHandler("bold", this, "endBold");

		addStartHandler("emphasis", this, "startEmphasis");
		addEndHandler("emphasis", this, "endEmphasis");

		addStartHandler("computeroutput", this, "startComputerOutput");
		addEndHandler("computeroutput", this, "endComputerOutput");

		addStartHandler("center", this, "startCenter");
		addEndHandler("center", this, "endCenter");

		addStartHandler("small", this, "startSmallFont");
		addEndHandler("small", this, "endSmallFont");

		addStartHandler("subscript", this, "startSubscript");
		addEndHandler("subscript", this, "endSubscript");

		addStartHandler("superscript", this, "startSuperscript");
		addEndHandler("superscript", this, "endSuperscript");

		addStartHandler("preformatted", this, "startPreformatted");
		addEndHandler("preformatted", this, "endPreformatted");

		addStartHandler("heading1", this, "startHeading1");
		addEndHandler("heading1", this, "endHeading1");

		addStartHandler("heading2", this, "startHeading2");
		addEndHandler("heading2", this, "endHeading2");

		addStartHandler("heading3", this, "startHeading3");
		addEndHandler("heading3", this, "endHeading3");

		addStartHandler("heading4", this, "startHeading4");
		addEndHandler("heading4", this, "endHeading4");

		addStartHandler("heading5", this, "startHeading5");
		addEndHandler("heading5", this, "endHeading5");

		addStartHandler("heading6", this, "startHeading6");
		addEndHandler("heading6", this, "endHeading6");
	}

	private void addTextNode() {
		if (!m_curString.isEmpty()) {
			m_children.add(new TextNode(m_curString, m_curMarkup, m_headingLevel));
			Log.debug(2, "addTextNode() text=%s markup=%x\n", m_curString, m_curMarkup);
			m_curString = "";
		}
	}

	public void startBold(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Bold, true));
		m_curMarkup |= IDocMarkup.Markup.Bold.value();
	}

	public void endBold() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Bold, false));
		m_curMarkup &= ~IDocMarkup.Markup.Bold.value();
	}

	public void startEmphasis(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Emphasis, true));
		m_curMarkup |= IDocMarkup.Markup.Emphasis.value();
	}

	public void endEmphasis() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Emphasis, false));
		m_curMarkup &= ~IDocMarkup.Markup.Emphasis.value();
	}

	public void startComputerOutput(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.ComputerOutput, true));
		m_curMarkup |= IDocMarkup.Markup.ComputerOutput.value();
	}

	public void endComputerOutput() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.ComputerOutput, false));
		m_curMarkup &= ~IDocMarkup.Markup.ComputerOutput.value();
	}

	public void startCenter(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Center, true));
		m_curMarkup |= IDocMarkup.Markup.Center.value();
	}

	public void endCenter() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Center, false));
		m_curMarkup &= ~IDocMarkup.Markup.Center.value();
	}

	public void startSmallFont(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.SmallFont, true));
		m_curMarkup |= IDocMarkup.Markup.SmallFont.value();
	}

	public void endSmallFont() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.SmallFont, false));
		m_curMarkup &= ~IDocMarkup.Markup.SmallFont.value();
	}

	public void startSubscript(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Subscript, true));
		m_curMarkup |= IDocMarkup.Markup.Subscript.value();
	}

	public void endSubscript() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Subscript, false));
		m_curMarkup &= ~IDocMarkup.Markup.Subscript.value();
	}

	public void startSuperscript(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Superscript, true));
		m_curMarkup |= IDocMarkup.Markup.Superscript.value();
	}

	public void endSuperscript() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Superscript, false));
		m_curMarkup &= ~IDocMarkup.Markup.Superscript.value();
	}

	public void startPreformatted(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Preformatted, true));
		m_curMarkup |= IDocMarkup.Markup.Preformatted.value();
	}

	public void endPreformatted() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Preformatted, false));
		m_curMarkup &= ~IDocMarkup.Markup.Preformatted.value();
	}

	public void startHeading1(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 1));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 1;
	}

	public void endHeading1() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 1));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

	public void startHeading2(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 2));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 2;
	}

	public void endHeading2() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 2));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

	public void startHeading3(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 3));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 3;
	}

	public void endHeading3() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 3));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

	public void startHeading4(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 4));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 4;
	}

	public void endHeading4() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 4));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

	public void startHeading5(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 5));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 5;
	}

	public void endHeading5() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 5));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

	public void startHeading6(Attributes attrib) {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, true, 6));
		m_curMarkup |= IDocMarkup.Markup.Heading.value();
		m_headingLevel = 6;
	}

	public void endHeading6() {
		addTextNode();
		m_children.add(new MarkupModifierNode(IDocMarkup.Markup.Heading, false, 6));
		m_curMarkup &= ~IDocMarkup.Markup.Heading.value();
		m_headingLevel = 0;
	}

}