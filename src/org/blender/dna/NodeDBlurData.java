package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeDBlurData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=28)
public class NodeDBlurData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeDBlurData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeDBlurData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 382;

	/**
	 * Field descriptor (offset) for struct member 'center_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__center_x);
	 * CPointer&lt;Float&gt; p_center_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'center_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__center_x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'center_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__center_y);
	 * CPointer&lt;Float&gt; p_center_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'center_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__center_y = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'spin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__spin);
	 * CPointer&lt;Float&gt; p_spin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spin = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'zoom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__zoom);
	 * CPointer&lt;Float&gt; p_zoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zoom = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'iter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__iter);
	 * CPointer&lt;Short&gt; p_iter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'wrap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD__wrap);
	 * CPointer&lt;Byte&gt; p_wrap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wrap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wrap = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDBlurData nodedblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodedblurdata.__dna__addressof(NodeDBlurData.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{27, 27};

	public NodeDBlurData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeDBlurData(NodeDBlurData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'center_x'.
	 * @see #__DNA__FIELD__center_x
	 */
	
	public float getCenter_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'center_x'.
	 * @see #__DNA__FIELD__center_x
	 */
	
	public void setCenter_x(float center_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, center_x);
		} else {
			__io__block.writeFloat(__io__address + 0, center_x);
		}
	}

	/**
	 * Get method for struct member 'center_y'.
	 * @see #__DNA__FIELD__center_y
	 */
	
	public float getCenter_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'center_y'.
	 * @see #__DNA__FIELD__center_y
	 */
	
	public void setCenter_y(float center_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, center_y);
		} else {
			__io__block.writeFloat(__io__address + 4, center_y);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, distance);
		} else {
			__io__block.writeFloat(__io__address + 8, distance);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, angle);
		} else {
			__io__block.writeFloat(__io__address + 12, angle);
		}
	}

	/**
	 * Get method for struct member 'spin'.
	 * @see #__DNA__FIELD__spin
	 */
	
	public float getSpin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spin'.
	 * @see #__DNA__FIELD__spin
	 */
	
	public void setSpin(float spin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, spin);
		} else {
			__io__block.writeFloat(__io__address + 16, spin);
		}
	}

	/**
	 * Get method for struct member 'zoom'.
	 * @see #__DNA__FIELD__zoom
	 */
	
	public float getZoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'zoom'.
	 * @see #__DNA__FIELD__zoom
	 */
	
	public void setZoom(float zoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, zoom);
		} else {
			__io__block.writeFloat(__io__address + 20, zoom);
		}
	}

	/**
	 * Get method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public short getIter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public void setIter(short iter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, iter);
		} else {
			__io__block.writeShort(__io__address + 24, iter);
		}
	}

	/**
	 * Get method for struct member 'wrap'.
	 * @see #__DNA__FIELD__wrap
	 */
	
	public byte getWrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 26);
		} else {
			return __io__block.readByte(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'wrap'.
	 * @see #__DNA__FIELD__wrap
	 */
	
	public void setWrap(byte wrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 26, wrap);
		} else {
			__io__block.writeByte(__io__address + 26, wrap);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 27);
		} else {
			return __io__block.readByte(__io__address + 27);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 27, _pad);
		} else {
			__io__block.writeByte(__io__address + 27, _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeDBlurData> __io__addressof() {
		return new CPointer<NodeDBlurData>(__io__address, new Class[]{NodeDBlurData.class}, __io__block, __io__blockTable);
	}

}
