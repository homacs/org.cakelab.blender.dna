package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocDotFile;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing a dot file.
 *
 */
// children: -
public class DotFileHandler extends BaseHandler<DotFileHandler> implements IDocDotFile {
	private IBaseHandler m_parent;
	private String m_name;
	private String m_caption;

	public DotFileHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("dotfile", this, "endDotFile");
	}

	public void startDotFile(Attributes attrib) {
		m_name = attrib.getValue("name");
		m_curString = "";
		m_parent.setDelegate(this);
	}

	public void endDotFile() {
		m_caption = m_curString;
		Log.debug(2, "image name=`%s' caption=`%s'\n", m_name, m_caption);
		m_parent.setDelegate(null);
	}

	public Kind kind() {
		return Kind.DotFile;
	}

	public String name() {
		return m_name;
	}

	public String caption() {
		return m_caption;
	}

}