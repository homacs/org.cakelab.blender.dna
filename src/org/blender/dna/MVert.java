package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MVert'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Java .Blend</h4>
 * A single vertex with coordinates and normal vector.
 * <h4>Blender Source Code</h4>
 * <p>{@link Mesh}  Vertices.</p><p> Typically accessed from {@link Mesh#getMvert()}  </p>
 */

@CMetaData(size32=16, size64=16)
public class MVert extends CFacade {

	/**
	 * This is the sdna index of the struct MVert.
	 * <p>
	 * It is required when allocating a new block to store data for MVert.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 294;

	/**
	 * Field descriptor (offset) for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * XYZ coordinates.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MVert mvert = ...;
	 * CPointer&lt;Object&gt; p = mvert.__dna__addressof(MVert.__DNA__FIELD__co);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_co = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'co'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__co = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	SELECT				= 1
	 * 	ME_VERT_TMP_TAG     = (1 << 2),
	 * 	ME_HIDE             = (1 << 4),
	 * 	ME_VERT_MERGED      = (1 << 6),
	 * 	ME_VERT_PBVH_UPDATE = (1 << 7),
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MVert mvert = ...;
	 * CPointer&lt;Object&gt; p = mvert.__dna__addressof(MVert.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'bweight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MVert mvert = ...;
	 * CPointer&lt;Object&gt; p = mvert.__dna__addressof(MVert.__DNA__FIELD__bweight);
	 * CPointer&lt;Byte&gt; p_bweight = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bweight'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bweight = new long[]{13, 13};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MVert mvert = ...;
	 * CPointer&lt;Object&gt; p = mvert.__dna__addressof(MVert.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{14, 14};

	public MVert(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MVert(MVert that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * XYZ coordinates.
	 * @see #__DNA__FIELD__co
	 */
	
	public CArrayFacade<Float> getCo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * XYZ coordinates.
	 * @see #__DNA__FIELD__co
	 */
	
	public void setCo(CArrayFacade<Float> co) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(co, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, co)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, co);
		} else {
			__io__generic__copy( getCo(), co);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	SELECT				= 1
	 * 	ME_VERT_TMP_TAG     = (1 << 2),
	 * 	ME_HIDE             = (1 << 4),
	 * 	ME_VERT_MERGED      = (1 << 6),
	 * 	ME_VERT_PBVH_UPDATE = (1 << 7),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 12);
		} else {
			return __io__block.readByte(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	SELECT				= 1
	 * 	ME_VERT_TMP_TAG     = (1 << 2),
	 * 	ME_HIDE             = (1 << 4),
	 * 	ME_VERT_MERGED      = (1 << 6),
	 * 	ME_VERT_PBVH_UPDATE = (1 << 7),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 12, flag);
		} else {
			__io__block.writeByte(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'bweight'.
	 * @see #__DNA__FIELD__bweight
	 */
	
	public byte getBweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 13);
		} else {
			return __io__block.readByte(__io__address + 13);
		}
	}

	/**
	 * Set method for struct member 'bweight'.
	 * @see #__DNA__FIELD__bweight
	 */
	
	public void setBweight(byte bweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 13, bweight);
		} else {
			__io__block.writeByte(__io__address + 13, bweight);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 14;
		} else {
			__dna__offset = 14;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MVert> __io__addressof() {
		return new CPointer<MVert>(__io__address, new Class[]{MVert.class}, __io__block, __io__blockTable);
	}

}
