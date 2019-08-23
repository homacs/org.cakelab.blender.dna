package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocAnchor;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

//-----------------------------------------------------------------------------
/** Node representing an anchor.
 *
 */
// children: -
public class AnchorHandler extends BaseHandler<AnchorHandler> implements IDocAnchor
{
    private IBaseHandler  m_parent;
    private String     m_id;


public AnchorHandler(IBaseHandler parent)
{
	m_parent = parent;
	addEndHandler("anchor",this,"endAnchor");
}

public void startAnchor(Attributes attrib)
{
  m_id = attrib.getValue("id");
  m_parent.setDelegate(this);
}

public void endAnchor()
{
  Log.debug(2,"anchor id=`%s'\n",m_id);
  m_parent.setDelegate(null);
}
    public Kind kind() { return Kind.Anchor; }
    public String id() { return m_id; }

}