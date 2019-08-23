package org.cakelab.jdoxml.impl.dochandler;

import org.cakelab.jdoxml.api.IDocImage;
import org.cakelab.jdoxml.impl.Log;
import org.cakelab.jdoxml.impl.basehandler.BaseHandler;
import org.cakelab.jdoxml.impl.basehandler.IBaseHandler;
import org.xml.sax.Attributes;

/** Node representing an image.
 *
 */
// children: -
public class ImageHandler extends BaseHandler<ImageHandler> implements IDocImage {
	private IBaseHandler m_parent;
	private String m_name;
	private String m_caption;

	public ImageHandler(IBaseHandler parent)

	{
		m_parent = parent;
		addEndHandler("image", this, "endImage");
	}

	public void startImage(Attributes attrib) {
		m_name = attrib.getValue("name");
		m_curString = "";
		m_parent.setDelegate(this);
	}

	public void endImage() {
		m_caption = m_curString;
		Log.debug(2, "image name=`%s' caption=`%s'\n", m_name, m_caption);
		m_parent.setDelegate(null);
	}

	// IDocImage
	public Kind kind() {
		return Kind.Image;
	}

	public String name() {
		return m_name;
	}

	public String caption() {
		return m_caption;
	}

}