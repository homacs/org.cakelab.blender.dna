package org.cakelab.jdoxml.impl.dochandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocSymbol;
import org.cakelab.jdoxml.api.IDocVerbatim;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a paragraph of text and commands.
 *
 */
// children: itemizedlist, orderedlist, parameterlist, simplesect, ref,
//           variablelist, hruler, linebreak, ulink, email, link
//           programlisting, formula, image, dotfile, indexentry,
//           table
//
// children handled by MarkupHandler: 
//           bold, computeroutput, emphasis, center,
//           small, subscript, superscript. 
//
public class ParagraphHandler extends BaseHandler<ParagraphHandler> implements IDocPara
{
    private IBaseHandler   m_parent;
    List<IDoc>         m_children = new ArrayList<IDoc>();
    private MarkupHandler  m_markupHandler;


public ParagraphHandler(IBaseHandler parent)
{
	m_parent = parent;

	m_markupHandler = new MarkupHandler(m_children, m_curString);

  // preformatted
  setFallBackHandler(m_markupHandler);

  addEndHandler("para", this, "endParagraph");

  addStartHandler("linebreak", this, "startLineBreak");
  addStartHandler("hruler", this, "startHRuler");
  addStartHandler("ndash", this, "startNDash");
  addStartHandler("mdash", this, "startMDash");
  addStartHandler("programlisting", this, "startProgramListing");
  addStartHandler("verbatim", this, "startVerbatim");
  addStartHandler("indexentry", this, "startIndexEntry");
  addStartHandler("orderedlist", this, "startOrderedList");
  addStartHandler("itemizedlist", this, "startItemizedList");
  addStartHandler("simplesect", this, "startSimpleSect");
  // TODO: title
  addStartHandler("variablelist", this, "startVariableList");
  addStartHandler("table", this, "startTable");
  // TODO: heading
  addStartHandler("image", this, "startImage");
  addStartHandler("dotfile", this, "startDotFile");
  addStartHandler("toclist", this, "startTocList");
  // TODO: language???
  addStartHandler("parameterlist", this, "startParameterList");
  // TODO: xrefsect
  addStartHandler("copydoc", this, "startCopyDoc");

  addStartHandler("ref", this, "startRef");
  addStartHandler("xrefsect", this, "startXRefSect");
  addStartHandler("ulink", this, "startULink");
  addStartHandler("email", this, "startEMail");
  addStartHandler("link", this, "startLink");
  addStartHandler("formula", this, "startFormula");
  addStartHandler("latexonly", this, "startHtmlOnly");
  addStartHandler("htmlonly", this, "startLatexOnly");
  addStartHandler("umlaut", this, "startUmlaut");
  addStartHandler("acute", this, "startAcute");
  addStartHandler("grave", this, "startGrave");
  addStartHandler("circ", this, "startCirc");
  addStartHandler("tilde", this, "startTilde");
  addStartHandler("szlig", this, "startSzlig");
  addStartHandler("cedil", this, "startCedil");
  addStartHandler("ring", this, "startRing");
  addStartHandler("nbsp", this, "startNbsp");
  addStartHandler("copy", this, "startCopy");
  addStartHandler("anchor", this, "startAnchor");
}

public void startParagraph(Attributes attrib)
{
  m_parent.setDelegate(this);
  Log.debug(2,"para\n");
}

public void endParagraph()
{
  addTextNode();
  Log.debug(2,"end para\n");
  m_parent.setDelegate(null);
}

public void startItemizedList(Attributes attrib)
{
  addTextNode();
  ItemizedListHandler listHandler = new ItemizedListHandler(this);
  listHandler.startItemizedList(attrib);
  m_children.add(listHandler);
}

public void startOrderedList(Attributes attrib)
{
  addTextNode();
  OrderedListHandler listHandler = new OrderedListHandler(this);
  listHandler.startOrderedList(attrib);
  m_children.add(listHandler);
}

public void startParameterList(Attributes attrib)
{
  addTextNode();
  ParameterListHandler listHandler = new ParameterListHandler(this);
  listHandler.startParameterList(attrib);
  m_children.add(listHandler);
}

public void startSimpleSect(Attributes attrib)
{
  addTextNode();
  SimpleSectHandler sectHandler = new SimpleSectHandler(this);
  sectHandler.startSimpleSect(attrib);
  m_children.add(sectHandler);
}

public void startRef(Attributes attrib)
{
  addTextNode();
  RefHandler ref = new RefHandler(this);
  ref.startRef(attrib);
  m_children.add(ref);
}

public void startXRefSect(Attributes attrib) {
	  addTextNode();
	XRefSectHandler handler = new XRefSectHandler(this);
	handler.start(attrib);
	m_children.add(handler);
}

public void startVariableList(Attributes attrib)
{
  addTextNode();
  VariableListHandler vl = new VariableListHandler(this);
  vl.startVariableList(attrib);
  m_children.add(vl);
}

public void startHRuler(Attributes attrib)
{
  addTextNode();
  HRulerHandler hr = new HRulerHandler(this);
  hr.startHRuler(attrib);
  m_children.add(hr);
}

public void startNDash(Attributes attrib)
{
  addTextNode();
  NDashHandler hr = new NDashHandler(this);
  hr.start(attrib);
  m_children.add(hr);
}

public void startMDash(Attributes attrib)
{
  addTextNode();
  MDashHandler hr = new MDashHandler(this);
  hr.start(attrib);
  m_children.add(hr);
}

public void startLineBreak(Attributes attrib)
{
  addTextNode();
  LineBreakHandler lb = new LineBreakHandler(this);
  lb.startLineBreak(attrib);
  m_children.add(lb);
}

public void startULink(Attributes attrib)
{
  addTextNode();
  ULinkHandler uh = new ULinkHandler(this);
  uh.startULink(attrib);
  m_children.add(uh);
}

public void startEMail(Attributes attrib)
{
  addTextNode();
  EMailHandler eh = new EMailHandler(this);
  eh.startEMail(attrib);
  m_children.add(eh);
}

public void startLink(Attributes attrib)
{
  addTextNode();
  LinkHandler lh = new LinkHandler(this);
  lh.startLink(attrib);
  m_children.add(lh);
}

public void startProgramListing(Attributes attrib)
{
  addTextNode();
  ProgramListingHandler pl = new ProgramListingHandler(this);
  pl.startProgramListing(attrib);
  m_children.add(pl);
}

public void startFormula(Attributes attrib)
{
  addTextNode();
  FormulaHandler fh = new FormulaHandler(this);
  fh.startFormula(attrib);
  m_children.add(fh);
}

public void startImage(Attributes attrib)
{
  addTextNode();
  ImageHandler ih = new ImageHandler(this);
  ih.startImage(attrib);
  m_children.add(ih);
}

public void startDotFile(Attributes attrib)
{
  addTextNode();
  DotFileHandler df = new DotFileHandler(this);
  df.startDotFile(attrib);
  m_children.add(df);
}

public void startIndexEntry(Attributes attrib)
{
  addTextNode();
  IndexEntryHandler df = new IndexEntryHandler(this);
  df.startIndexEntry(attrib);
  m_children.add(df);
}

public void startTable(Attributes attrib)
{
  addTextNode();
  TableHandler th = new TableHandler(this);
  th.startTable(attrib);
  m_children.add(th);
}

public void startVerbatim(Attributes attrib)
{
  addTextNode();
  VerbatimHandler vh = new VerbatimHandler(this);
  vh.startVerbatim(attrib,IDocVerbatim.Types.Verbatim);
  m_children.add(vh);
}

public void startHtmlOnly(Attributes attrib)
{
  addTextNode();
  VerbatimHandler vh = new VerbatimHandler(this);
  vh.startVerbatim(attrib,IDocVerbatim.Types.HtmlOnly);
  m_children.add(vh);
}

public void startLatexOnly(Attributes attrib)
{
  addTextNode();
  VerbatimHandler vh = new VerbatimHandler(this);
  vh.startVerbatim(attrib,IDocVerbatim.Types.LatexOnly);
  m_children.add(vh);
}

public void startUmlaut(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Umlaut);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startAcute(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Acute);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startGrave(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Grave);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startCirc(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Circ);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startTilde(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Tilde);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startSzlig(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Szlig);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startCedil(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Cedil);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startRing(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Ring);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startNbsp(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Nbsp);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startCopy(Attributes attrib)
{
  addTextNode();
  SymbolHandler sh = new SymbolHandler(this,IDocSymbol.Types.Copy);
  sh.startSymbol(attrib);
  m_children.add(sh);
}

public void startAnchor(Attributes attrib)
{
  addTextNode();
  AnchorHandler ah = new AnchorHandler(this);
  ah.startAnchor(attrib);
  m_children.add(ah);
}

public void startCopyDoc(Attributes attrib)
{
  addTextNode();
  CopyHandler ch = new CopyHandler(this);
  ch.startCopy(attrib);
  m_children.add(ch);
}

public void startTocList(Attributes attrib)
{
  addTextNode();
  TocListHandler th = new TocListHandler(this);
  th.startTocList(attrib);
  m_children.add(th);
}

public void addTextNode()
{
  if (!m_curString.isEmpty())
  {
    m_children.add(
                      new TextNode(
                                   m_curString,
                                   m_markupHandler.markup(),
                                   m_markupHandler.headingLevel()
                                  )
                     );
    Log.debug(2,"addTextNode() text=\"%s\" markup=%x headingLevel=%d\n",
        m_curString,m_markupHandler.markup(),m_markupHandler.headingLevel());
    m_curString="";
  }
}

public ListIterator<IDoc> contents()
{
  return m_children.listIterator();
}

    public Kind kind() { 
    	return Kind.Para;
    }

}