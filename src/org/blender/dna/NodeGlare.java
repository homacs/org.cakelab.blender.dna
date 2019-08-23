package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGlare'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> qdn: glare node </p>
 */

@CMetaData(size32=32, size64=32)
public class NodeGlare extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGlare.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGlare.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 426;

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__quality);
	 * CPointer&lt;Byte&gt; p_quality = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'iter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__iter);
	 * CPointer&lt;Byte&gt; p_iter = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX angle is only kept for backward/forward compatibility, was used for two different things, see T50736. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__angle);
	 * CPointer&lt;Byte&gt; p_angle = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'pad_c1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__pad_c1);
	 * CPointer&lt;Byte&gt; p_pad_c1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_c1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_c1 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__size);
	 * CPointer&lt;Byte&gt; p_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member 'star_45'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__star_45);
	 * CPointer&lt;Byte&gt; p_star_45 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'star_45'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__star_45 = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'streaks'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__streaks);
	 * CPointer&lt;Byte&gt; p_streaks = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'streaks'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__streaks = new long[]{7, 7};

	/**
	 * Field descriptor (offset) for struct member 'colmod'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__colmod);
	 * CPointer&lt;Float&gt; p_colmod = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colmod'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colmod = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'mix'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__mix);
	 * CPointer&lt;Float&gt; p_mix = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__threshold);
	 * CPointer&lt;Float&gt; p_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'fade'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__fade);
	 * CPointer&lt;Float&gt; p_fade = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fade'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fade = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'angle_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__angle_ofs);
	 * CPointer&lt;Float&gt; p_angle_ofs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle_ofs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle_ofs = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad_f1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGlare nodeglare = ...;
	 * CPointer&lt;Object&gt; p = nodeglare.__dna__addressof(NodeGlare.__DNA__FIELD__pad_f1);
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

	public NodeGlare(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGlare(NodeGlare that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public byte getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(byte quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, quality);
		} else {
			__io__block.writeByte(__io__address + 0, quality);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, type);
		} else {
			__io__block.writeByte(__io__address + 1, type);
		}
	}

	/**
	 * Get method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public byte getIter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public void setIter(byte iter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, iter);
		} else {
			__io__block.writeByte(__io__address + 2, iter);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX angle is only kept for backward/forward compatibility, was used for two different things, see T50736. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public byte getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX angle is only kept for backward/forward compatibility, was used for two different things, see T50736. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(byte angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, angle);
		} else {
			__io__block.writeByte(__io__address + 3, angle);
		}
	}

	/**
	 * Get method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public byte getPad_c1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public void setPad_c1(byte pad_c1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, pad_c1);
		} else {
			__io__block.writeByte(__io__address + 4, pad_c1);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public byte getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(byte size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, size);
		} else {
			__io__block.writeByte(__io__address + 5, size);
		}
	}

	/**
	 * Get method for struct member 'star_45'.
	 * @see #__DNA__FIELD__star_45
	 */
	
	public byte getStar_45() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 6);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'star_45'.
	 * @see #__DNA__FIELD__star_45
	 */
	
	public void setStar_45(byte star_45) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 6, star_45);
		} else {
			__io__block.writeByte(__io__address + 6, star_45);
		}
	}

	/**
	 * Get method for struct member 'streaks'.
	 * @see #__DNA__FIELD__streaks
	 */
	
	public byte getStreaks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 7);
		} else {
			return __io__block.readByte(__io__address + 7);
		}
	}

	/**
	 * Set method for struct member 'streaks'.
	 * @see #__DNA__FIELD__streaks
	 */
	
	public void setStreaks(byte streaks) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 7, streaks);
		} else {
			__io__block.writeByte(__io__address + 7, streaks);
		}
	}

	/**
	 * Get method for struct member 'colmod'.
	 * @see #__DNA__FIELD__colmod
	 */
	
	public float getColmod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'colmod'.
	 * @see #__DNA__FIELD__colmod
	 */
	
	public void setColmod(float colmod) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, colmod);
		} else {
			__io__block.writeFloat(__io__address + 8, colmod);
		}
	}

	/**
	 * Get method for struct member 'mix'.
	 * @see #__DNA__FIELD__mix
	 */
	
	public float getMix() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'mix'.
	 * @see #__DNA__FIELD__mix
	 */
	
	public void setMix(float mix) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, mix);
		} else {
			__io__block.writeFloat(__io__address + 12, mix);
		}
	}

	/**
	 * Get method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public float getThreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(float threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, threshold);
		} else {
			__io__block.writeFloat(__io__address + 16, threshold);
		}
	}

	/**
	 * Get method for struct member 'fade'.
	 * @see #__DNA__FIELD__fade
	 */
	
	public float getFade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'fade'.
	 * @see #__DNA__FIELD__fade
	 */
	
	public void setFade(float fade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, fade);
		} else {
			__io__block.writeFloat(__io__address + 20, fade);
		}
	}

	/**
	 * Get method for struct member 'angle_ofs'.
	 * @see #__DNA__FIELD__angle_ofs
	 */
	
	public float getAngle_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'angle_ofs'.
	 * @see #__DNA__FIELD__angle_ofs
	 */
	
	public void setAngle_ofs(float angle_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, angle_ofs);
		} else {
			__io__block.writeFloat(__io__address + 24, angle_ofs);
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
	public CPointer<NodeGlare> __io__addressof() {
		return new CPointer<NodeGlare>(__io__address, new Class[]{NodeGlare.class}, __io__block, __io__blockTable);
	}

}
