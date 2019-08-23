package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeDefocus'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> qdn: Defocus blur node </p>
 */

@CMetaData(size32=32, size64=32)
public class NodeDefocus extends CFacade {

	/**
	 * This is the sdna index of the struct NodeDefocus.
	 * <p>
	 * It is required when allocating a new block to store data for NodeDefocus.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 420;

	/**
	 * Field descriptor (offset) for struct member 'bktype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__bktype);
	 * CPointer&lt;Byte&gt; p_bktype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bktype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bktype = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pad_c1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__pad_c1);
	 * CPointer&lt;Byte&gt; p_pad_c1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_c1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_c1 = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__preview);
	 * CPointer&lt;Byte&gt; p_preview = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'gamco'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__gamco);
	 * CPointer&lt;Byte&gt; p_gamco = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamco'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamco = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__samples);
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
	 * Field descriptor (offset) for struct member 'no_zbuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__no_zbuf);
	 * CPointer&lt;Short&gt; p_no_zbuf = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'no_zbuf'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__no_zbuf = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'fstop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__fstop);
	 * CPointer&lt;Float&gt; p_fstop = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fstop'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fstop = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'maxblur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__maxblur);
	 * CPointer&lt;Float&gt; p_maxblur = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxblur'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxblur = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'bthresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__bthresh);
	 * CPointer&lt;Float&gt; p_bthresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bthresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bthresh = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad_f1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDefocus nodedefocus = ...;
	 * CPointer&lt;Object&gt; p = nodedefocus.__dna__addressof(NodeDefocus.__DNA__FIELD__pad_f1);
	 * CPointer&lt;Float&gt; p_pad_f1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_f1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_f1 = new long[]{28, 28};

	public NodeDefocus(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeDefocus(NodeDefocus that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'bktype'.
	 * @see #__DNA__FIELD__bktype
	 */
	
	public byte getBktype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'bktype'.
	 * @see #__DNA__FIELD__bktype
	 */
	
	public void setBktype(byte bktype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, bktype);
		} else {
			__io__block.writeByte(__io__address + 0, bktype);
		}
	}

	/**
	 * Get method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public byte getPad_c1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public void setPad_c1(byte pad_c1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, pad_c1);
		} else {
			__io__block.writeByte(__io__address + 1, pad_c1);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public byte getPreview() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(byte preview) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, preview);
		} else {
			__io__block.writeByte(__io__address + 2, preview);
		}
	}

	/**
	 * Get method for struct member 'gamco'.
	 * @see #__DNA__FIELD__gamco
	 */
	
	public byte getGamco() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'gamco'.
	 * @see #__DNA__FIELD__gamco
	 */
	
	public void setGamco(byte gamco) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, gamco);
		} else {
			__io__block.writeByte(__io__address + 3, gamco);
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
	 * Get method for struct member 'no_zbuf'.
	 * @see #__DNA__FIELD__no_zbuf
	 */
	
	public short getNo_zbuf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'no_zbuf'.
	 * @see #__DNA__FIELD__no_zbuf
	 */
	
	public void setNo_zbuf(short no_zbuf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, no_zbuf);
		} else {
			__io__block.writeShort(__io__address + 6, no_zbuf);
		}
	}

	/**
	 * Get method for struct member 'fstop'.
	 * @see #__DNA__FIELD__fstop
	 */
	
	public float getFstop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'fstop'.
	 * @see #__DNA__FIELD__fstop
	 */
	
	public void setFstop(float fstop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, fstop);
		} else {
			__io__block.writeFloat(__io__address + 8, fstop);
		}
	}

	/**
	 * Get method for struct member 'maxblur'.
	 * @see #__DNA__FIELD__maxblur
	 */
	
	public float getMaxblur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'maxblur'.
	 * @see #__DNA__FIELD__maxblur
	 */
	
	public void setMaxblur(float maxblur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, maxblur);
		} else {
			__io__block.writeFloat(__io__address + 12, maxblur);
		}
	}

	/**
	 * Get method for struct member 'bthresh'.
	 * @see #__DNA__FIELD__bthresh
	 */
	
	public float getBthresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'bthresh'.
	 * @see #__DNA__FIELD__bthresh
	 */
	
	public void setBthresh(float bthresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, bthresh);
		} else {
			__io__block.writeFloat(__io__address + 16, bthresh);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, scale);
		} else {
			__io__block.writeFloat(__io__address + 20, scale);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, rotation);
		} else {
			__io__block.writeFloat(__io__address + 24, rotation);
		}
	}

	/**
	 * Get method for struct member 'pad_f1'.
	 * @see #__DNA__FIELD__pad_f1
	 */
	
	public float getPad_f1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'pad_f1'.
	 * @see #__DNA__FIELD__pad_f1
	 */
	
	public void setPad_f1(float pad_f1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, pad_f1);
		} else {
			__io__block.writeFloat(__io__address + 28, pad_f1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeDefocus> __io__addressof() {
		return new CPointer<NodeDefocus>(__io__address, new Class[]{NodeDefocus.class}, __io__block, __io__blockTable);
	}

}
