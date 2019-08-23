package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Sculpt'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=48, size64=56)
public class Sculpt extends CFacade {

	/**
	 * This is the sdna index of the struct Sculpt.
	 * <p>
	 * It is required when allocating a new block to store data for Sculpt.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 167;

	/**
	 * Field descriptor (offset) for struct member 'paint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__paint);
	 * CPointer&lt;Paint&gt; p_paint = p.cast(new Class[]{Paint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint'</li>
	 * <li>Signature: 'Paint'</li>
	 * <li>Actual Size (32bit/64bit): 24/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'radial_symm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__radial_symm);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_radial_symm = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radial_symm'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radial_symm = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__detail_size);
	 * CPointer&lt;Integer&gt; p_detail_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'detail_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__detail_size = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__symmetrize_direction);
	 * CPointer&lt;Integer&gt; p_symmetrize_direction = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetrize_direction'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetrize_direction = new long[]{44, 52};

	public Sculpt(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Sculpt(Sculpt that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public Paint getPaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public void setPaint(Paint paint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(paint, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint);
		} else {
			__io__generic__copy( getPaint(), paint);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, flags);
		} else {
			__io__block.writeInt(__io__address + 24, flags);
		}
	}

	/**
	 * Get method for struct member 'radial_symm'.
	 * @see #__DNA__FIELD__radial_symm
	 */
	
	public CArrayFacade<Integer> getRadial_symm() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'radial_symm'.
	 * @see #__DNA__FIELD__radial_symm
	 */
	
	public void setRadial_symm(CArrayFacade<Integer> radial_symm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(radial_symm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, radial_symm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, radial_symm);
		} else {
			__io__generic__copy( getRadial_symm(), radial_symm);
		}
	}

	/**
	 * Get method for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)
	 * @see #__DNA__FIELD__detail_size
	 */
	
	public int getDetail_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)
	 * @see #__DNA__FIELD__detail_size
	 */
	
	public void setDetail_size(int detail_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, detail_size);
		} else {
			__io__block.writeInt(__io__address + 40, detail_size);
		}
	}

	/**
	 * Get method for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator
	 * @see #__DNA__FIELD__symmetrize_direction
	 */
	
	public int getSymmetrize_direction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator
	 * @see #__DNA__FIELD__symmetrize_direction
	 */
	
	public void setSymmetrize_direction(int symmetrize_direction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, symmetrize_direction);
		} else {
			__io__block.writeInt(__io__address + 44, symmetrize_direction);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Sculpt> __io__addressof() {
		return new CPointer<Sculpt>(__io__address, new Class[]{Sculpt.class}, __io__block, __io__blockTable);
	}

}
