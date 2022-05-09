package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ObjectLineArt'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class ObjectLineArt extends CFacade {

	/**
	 * This is the sdna index of the struct ObjectLineArt.
	 * <p>
	 * It is required when allocating a new block to store data for ObjectLineArt.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 171;

	/**
	 * Field descriptor (offset) for struct member 'usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How to use this object in line art calculation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ObjectLineArt objectlineart = ...;
	 * CPointer&lt;Object&gt; p = objectlineart.__dna__addressof(ObjectLineArt.__DNA__FIELD__usage);
	 * CPointer&lt;Short&gt; p_usage = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'usage'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__usage = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ObjectLineArt objectlineart = ...;
	 * CPointer&lt;Object&gt; p = objectlineart.__dna__addressof(ObjectLineArt.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Angles smaller than this will be treated as creases
	 * <h4>Blender Source Code</h4>
	 * <p> if OBJECT_LRT_OWN_CREASE is set </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ObjectLineArt objectlineart = ...;
	 * CPointer&lt;Object&gt; p = objectlineart.__dna__addressof(ObjectLineArt.__DNA__FIELD__crease_threshold);
	 * CPointer&lt;Float&gt; p_crease_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_threshold = new long[]{4, 4};

	public ObjectLineArt(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ObjectLineArt(ObjectLineArt that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How to use this object in line art calculation
	 * @see #__DNA__FIELD__usage
	 */
	
	public short getUsage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How to use this object in line art calculation
	 * @see #__DNA__FIELD__usage
	 */
	
	public void setUsage(short usage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, usage);
		} else {
			__io__block.writeShort(__io__address + 0, usage);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, flags);
		} else {
			__io__block.writeShort(__io__address + 2, flags);
		}
	}

	/**
	 * Get method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Angles smaller than this will be treated as creases
	 * <h4>Blender Source Code</h4>
	 * <p> if OBJECT_LRT_OWN_CREASE is set </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public float getCrease_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Angles smaller than this will be treated as creases
	 * <h4>Blender Source Code</h4>
	 * <p> if OBJECT_LRT_OWN_CREASE is set </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public void setCrease_threshold(float crease_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, crease_threshold);
		} else {
			__io__block.writeFloat(__io__address + 4, crease_threshold);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ObjectLineArt> __io__addressof() {
		return new CPointer<ObjectLineArt>(__io__address, new Class[]{ObjectLineArt.class}, __io__block, __io__blockTable);
	}

}
