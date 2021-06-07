package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SBVertex'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class SBVertex extends CFacade {

	/**
	 * This is the sdna index of the struct SBVertex.
	 * <p>
	 * It is required when allocating a new block to store data for SBVertex.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 168;

	/**
	 * Field descriptor (offset) for struct member 'vec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SBVertex sbvertex = ...;
	 * CPointer&lt;Object&gt; p = sbvertex.__dna__addressof(SBVertex.__DNA__FIELD__vec);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vec = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vec'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vec = new long[]{0, 0};

	public SBVertex(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SBVertex(SBVertex that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vec'.
	 * @see #__DNA__FIELD__vec
	 */
	
	public CArrayFacade<Float> getVec() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vec'.
	 * @see #__DNA__FIELD__vec
	 */
	
	public void setVec(CArrayFacade<Float> vec) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(vec, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vec)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vec);
		} else {
			__io__generic__copy( getVec(), vec);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SBVertex> __io__addressof() {
		return new CPointer<SBVertex>(__io__address, new Class[]{SBVertex.class}, __io__block, __io__blockTable);
	}

}
