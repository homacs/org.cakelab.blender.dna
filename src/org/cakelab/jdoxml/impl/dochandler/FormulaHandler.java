package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocFormula;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a formula.
 *
 */
// children: -
public class FormulaHandler extends BaseHandler<FormulaHandler> implements IDocFormula
{
    IBaseHandler  m_parent;
    private String     m_id;
    private String     m_text;


public FormulaHandler(IBaseHandler parent)
{
	m_parent = parent;
	addEndHandler("formula", this, "endFormula");
}

public void startFormula(Attributes attrib)
{
  m_id = attrib.getValue("id");
  m_curString="";
  m_parent.setDelegate(this);
}

public void endFormula()
{
  m_text = m_curString;
  Log.debug(2,"formula id=`%s' text=`%s'\n",m_id,m_text);
  m_parent.setDelegate(null);
}

    public Kind kind() { return Kind.Formula; }
    public String id() { return m_id; }
    public String text() { return m_text; }

}