package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeBlurData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=40, size64=40)
public class NodeBlurData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeBlurData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeBlurData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 412;

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__sizex);
	 * CPointer&lt;Short&gt; p_sizex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizex = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__sizey);
	 * CPointer&lt;Short&gt; p_sizey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizey = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__samples);
	 * CPointer&lt;Short&gt; p_samples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samples = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'maxspeed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__maxspeed);
	 * CPointer&lt;Short&gt; p_maxspeed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxspeed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxspeed = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'minspeed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__minspeed);
	 * CPointer&lt;Short&gt; p_minspeed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minspeed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minspeed = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'relative'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__relative);
	 * CPointer&lt;Short&gt; p_relative = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'relative'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__relative = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'aspect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__aspect);
	 * CPointer&lt;Short&gt; p_aspect = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspect'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspect = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'curved'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__curved);
	 * CPointer&lt;Short&gt; p_curved = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curved'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curved = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'fac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__fac);
	 * CPointer&lt;Float&gt; p_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fac = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'percentx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__percentx);
	 * CPointer&lt;Float&gt; p_percentx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'percentx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__percentx = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'percenty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__percenty);
	 * CPointer&lt;Float&gt; p_percenty = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'percenty'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__percenty = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'filtertype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__filtertype);
	 * CPointer&lt;Short&gt; p_filtertype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filtertype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filtertype = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'bokeh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__bokeh);
	 * CPointer&lt;Byte&gt; p_bokeh = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bokeh'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bokeh = new long[]{30, 30};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__gamma);
	 * CPointer&lt;Byte&gt; p_gamma = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{31, 31};

	/**
	 * Field descriptor (offset) for struct member 'image_in_width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__image_in_width);
	 * CPointer&lt;Integer&gt; p_image_in_width = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_in_width'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_in_width = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'image_in_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> needed for absolute/relative conversions </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBlurData nodeblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodeblurdata.__dna__addressof(NodeBlurData.__DNA__FIELD__image_in_height);
	 * CPointer&lt;Integer&gt; p_image_in_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_in_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_in_height = new long[]{36, 36};

	public NodeBlurData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeBlurData(NodeBlurData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public short getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(short sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, sizex);
		} else {
			__io__block.writeShort(__io__address + 0, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public short getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(short sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, sizey);
		} else {
			__io__block.writeShort(__io__address + 2, sizey);
		}
	}

	/**
	 * Get method for struct member 'samples'.
	 * @see #__DNA__FIELD__samples
	 */
	
	public short getSamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'samples'.
	 * @see #__DNA__FIELD__samples
	 */
	
	public void setSamples(short samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, samples);
		} else {
			__io__block.writeShort(__io__address + 4, samples);
		}
	}

	/**
	 * Get method for struct member 'maxspeed'.
	 * @see #__DNA__FIELD__maxspeed
	 */
	
	public short getMaxspeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'maxspeed'.
	 * @see #__DNA__FIELD__maxspeed
	 */
	
	public void setMaxspeed(short maxspeed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, maxspeed);
		} else {
			__io__block.writeShort(__io__address + 6, maxspeed);
		}
	}

	/**
	 * Get method for struct member 'minspeed'.
	 * @see #__DNA__FIELD__minspeed
	 */
	
	public short getMinspeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'minspeed'.
	 * @see #__DNA__FIELD__minspeed
	 */
	
	public void setMinspeed(short minspeed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, minspeed);
		} else {
			__io__block.writeShort(__io__address + 8, minspeed);
		}
	}

	/**
	 * Get method for struct member 'relative'.
	 * @see #__DNA__FIELD__relative
	 */
	
	public short getRelative() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'relative'.
	 * @see #__DNA__FIELD__relative
	 */
	
	public void setRelative(short relative) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, relative);
		} else {
			__io__block.writeShort(__io__address + 10, relative);
		}
	}

	/**
	 * Get method for struct member 'aspect'.
	 * @see #__DNA__FIELD__aspect
	 */
	
	public short getAspect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'aspect'.
	 * @see #__DNA__FIELD__aspect
	 */
	
	public void setAspect(short aspect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, aspect);
		} else {
			__io__block.writeShort(__io__address + 12, aspect);
		}
	}

	/**
	 * Get method for struct member 'curved'.
	 * @see #__DNA__FIELD__curved
	 */
	
	public short getCurved() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'curved'.
	 * @see #__DNA__FIELD__curved
	 */
	
	public void setCurved(short curved) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, curved);
		} else {
			__io__block.writeShort(__io__address + 14, curved);
		}
	}

	/**
	 * Get method for struct member 'fac'.
	 * @see #__DNA__FIELD__fac
	 */
	
	public float getFac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'fac'.
	 * @see #__DNA__FIELD__fac
	 */
	
	public void setFac(float fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, fac);
		} else {
			__io__block.writeFloat(__io__address + 16, fac);
		}
	}

	/**
	 * Get method for struct member 'percentx'.
	 * @see #__DNA__FIELD__percentx
	 */
	
	public float getPercentx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'percentx'.
	 * @see #__DNA__FIELD__percentx
	 */
	
	public void setPercentx(float percentx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, percentx);
		} else {
			__io__block.writeFloat(__io__address + 20, percentx);
		}
	}

	/**
	 * Get method for struct member 'percenty'.
	 * @see #__DNA__FIELD__percenty
	 */
	
	public float getPercenty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'percenty'.
	 * @see #__DNA__FIELD__percenty
	 */
	
	public void setPercenty(float percenty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, percenty);
		} else {
			__io__block.writeFloat(__io__address + 24, percenty);
		}
	}

	/**
	 * Get method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public short getFiltertype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public void setFiltertype(short filtertype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, filtertype);
		} else {
			__io__block.writeShort(__io__address + 28, filtertype);
		}
	}

	/**
	 * Get method for struct member 'bokeh'.
	 * @see #__DNA__FIELD__bokeh
	 */
	
	public byte getBokeh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 30);
		} else {
			return __io__block.readByte(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'bokeh'.
	 * @see #__DNA__FIELD__bokeh
	 */
	
	public void setBokeh(byte bokeh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 30, bokeh);
		} else {
			__io__block.writeByte(__io__address + 30, bokeh);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public byte getGamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 31);
		} else {
			return __io__block.readByte(__io__address + 31);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(byte gamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 31, gamma);
		} else {
			__io__block.writeByte(__io__address + 31, gamma);
		}
	}

	/**
	 * Get method for struct member 'image_in_width'.
	 * @see #__DNA__FIELD__image_in_width
	 */
	
	public int getImage_in_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'image_in_width'.
	 * @see #__DNA__FIELD__image_in_width
	 */
	
	public void setImage_in_width(int image_in_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, image_in_width);
		} else {
			__io__block.writeInt(__io__address + 32, image_in_width);
		}
	}

	/**
	 * Get method for struct member 'image_in_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> needed for absolute/relative conversions </p>
	 * @see #__DNA__FIELD__image_in_height
	 */
	
	public int getImage_in_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'image_in_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> needed for absolute/relative conversions </p>
	 * @see #__DNA__FIELD__image_in_height
	 */
	
	public void setImage_in_height(int image_in_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, image_in_height);
		} else {
			__io__block.writeInt(__io__address + 36, image_in_height);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeBlurData> __io__addressof() {
		return new CPointer<NodeBlurData>(__io__address, new Class[]{NodeBlurData.class}, __io__block, __io__blockTable);
	}

}
