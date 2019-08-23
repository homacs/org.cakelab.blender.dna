package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MultiresColFace'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class MultiresColFace extends CFacade {

	/**
	 * This is the sdna index of the struct MultiresColFace.
	 * <p>
	 * It is required when allocating a new block to store data for MultiresColFace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 85;

	/**
	 * Field descriptor (offset) for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex colors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresColFace multirescolface = ...;
	 * CPointer&lt;Object&gt; p = multirescolface.__dna__addressof(MultiresColFace.__DNA__FIELD__col);
	 * CPointer&lt;CArrayFacade&lt;MultiresCol&gt;&gt; p_col = p.cast(new Class[]{CArrayFacade.class, MultiresCol.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'col'</li>
	 * <li>Signature: 'MultiresCol[4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__col = new long[]{0, 0};

	public MultiresColFace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MultiresColFace(MultiresColFace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex colors </p>
	 * @see #__DNA__FIELD__col
	 */
	
	public CArrayFacade<MultiresCol> getCol() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{MultiresCol.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<MultiresCol>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<MultiresCol>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex colors </p>
	 * @see #__DNA__FIELD__col
	 */
	
	public void setCol(CArrayFacade<MultiresCol> col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, col);
		} else {
			__io__generic__copy( getCol(), col);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiresColFace> __io__addressof() {
		return new CPointer<MultiresColFace>(__io__address, new Class[]{MultiresColFace.class}, __io__block, __io__blockTable);
	}

}
