package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'OrigSpaceFace'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class OrigSpaceFace extends CFacade {

	/**
	 * This is the sdna index of the struct OrigSpaceFace.
	 * <p>
	 * It is required when allocating a new block to store data for OrigSpaceFace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 75;

	/**
	 * Field descriptor (offset) for struct member 'uv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OrigSpaceFace origspaceface = ...;
	 * CPointer&lt;Object&gt; p = origspaceface.__dna__addressof(OrigSpaceFace.__DNA__FIELD__uv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_uv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv'</li>
	 * <li>Signature: 'float[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv = new long[]{0, 0};

	public OrigSpaceFace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected OrigSpaceFace(OrigSpaceFace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getUv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public void setUv(CArrayFacade<CArrayFacade<Float>> uv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(uv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv);
		} else {
			__io__generic__copy( getUv(), uv);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<OrigSpaceFace> __io__addressof() {
		return new CPointer<OrigSpaceFace>(__io__address, new Class[]{OrigSpaceFace.class}, __io__block, __io__blockTable);
	}

}
