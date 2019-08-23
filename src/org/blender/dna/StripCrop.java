package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'StripCrop'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class StripCrop extends CFacade {

	/**
	 * This is the sdna index of the struct StripCrop.
	 * <p>
	 * It is required when allocating a new block to store data for StripCrop.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 263;

	/**
	 * Field descriptor (offset) for struct member 'top'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripCrop stripcrop = ...;
	 * CPointer&lt;Object&gt; p = stripcrop.__dna__addressof(StripCrop.__DNA__FIELD__top);
	 * CPointer&lt;Integer&gt; p_top = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'top'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__top = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'bottom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripCrop stripcrop = ...;
	 * CPointer&lt;Object&gt; p = stripcrop.__dna__addressof(StripCrop.__DNA__FIELD__bottom);
	 * CPointer&lt;Integer&gt; p_bottom = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bottom'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bottom = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'left'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripCrop stripcrop = ...;
	 * CPointer&lt;Object&gt; p = stripcrop.__dna__addressof(StripCrop.__DNA__FIELD__left);
	 * CPointer&lt;Integer&gt; p_left = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'left'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__left = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'right'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripCrop stripcrop = ...;
	 * CPointer&lt;Object&gt; p = stripcrop.__dna__addressof(StripCrop.__DNA__FIELD__right);
	 * CPointer&lt;Integer&gt; p_right = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'right'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__right = new long[]{12, 12};

	public StripCrop(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected StripCrop(StripCrop that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'top'.
	 * @see #__DNA__FIELD__top
	 */
	
	public int getTop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'top'.
	 * @see #__DNA__FIELD__top
	 */
	
	public void setTop(int top) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, top);
		} else {
			__io__block.writeInt(__io__address + 0, top);
		}
	}

	/**
	 * Get method for struct member 'bottom'.
	 * @see #__DNA__FIELD__bottom
	 */
	
	public int getBottom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'bottom'.
	 * @see #__DNA__FIELD__bottom
	 */
	
	public void setBottom(int bottom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, bottom);
		} else {
			__io__block.writeInt(__io__address + 4, bottom);
		}
	}

	/**
	 * Get method for struct member 'left'.
	 * @see #__DNA__FIELD__left
	 */
	
	public int getLeft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'left'.
	 * @see #__DNA__FIELD__left
	 */
	
	public void setLeft(int left) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, left);
		} else {
			__io__block.writeInt(__io__address + 8, left);
		}
	}

	/**
	 * Get method for struct member 'right'.
	 * @see #__DNA__FIELD__right
	 */
	
	public int getRight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'right'.
	 * @see #__DNA__FIELD__right
	 */
	
	public void setRight(int right) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, right);
		} else {
			__io__block.writeInt(__io__address + 12, right);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<StripCrop> __io__addressof() {
		return new CPointer<StripCrop>(__io__address, new Class[]{StripCrop.class}, __io__block, __io__blockTable);
	}

}
