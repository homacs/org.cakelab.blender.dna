package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MultiresEdge'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class MultiresEdge extends CFacade {

	/**
	 * This is the sdna index of the struct MultiresEdge.
	 * <p>
	 * It is required when allocating a new block to store data for MultiresEdge.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 81;

	/**
	 * Field descriptor (offset) for struct member 'v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresEdge multiresedge = ...;
	 * CPointer&lt;Object&gt; p = multiresedge.__dna__addressof(MultiresEdge.__DNA__FIELD__v);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_v = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresEdge multiresedge = ...;
	 * CPointer&lt;Object&gt; p = multiresedge.__dna__addressof(MultiresEdge.__DNA__FIELD__mid);
	 * CPointer&lt;Integer&gt; p_mid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mid = new long[]{8, 8};

	public MultiresEdge(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MultiresEdge(MultiresEdge that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public CArrayFacade<Integer> getV() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public void setV(CArrayFacade<Integer> v) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(v, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, v)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, v);
		} else {
			__io__generic__copy( getV(), v);
		}
	}

	/**
	 * Get method for struct member 'mid'.
	 * @see #__DNA__FIELD__mid
	 */
	
	public int getMid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'mid'.
	 * @see #__DNA__FIELD__mid
	 */
	
	public void setMid(int mid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, mid);
		} else {
			__io__block.writeInt(__io__address + 8, mid);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiresEdge> __io__addressof() {
		return new CPointer<MultiresEdge>(__io__address, new Class[]{MultiresEdge.class}, __io__block, __io__blockTable);
	}

}
