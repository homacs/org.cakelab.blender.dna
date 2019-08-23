package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDframe_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Frame Runtime temp data for {@link bGPDframe}  </p>
 */

@CMetaData(size32=64, size64=64)
public class bGPDframe_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDframe_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDframe_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 468;

	/**
	 * Field descriptor (offset) for struct member 'parent_obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent matrix for drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDframe_Runtime bgpdframe_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdframe_runtime.__dna__addressof(bGPDframe_Runtime.__DNA__FIELD__parent_obmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_parent_obmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent_obmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent_obmat = new long[]{0, 0};

	public bGPDframe_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDframe_Runtime(bGPDframe_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'parent_obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent matrix for drawing. </p>
	 * @see #__DNA__FIELD__parent_obmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getParent_obmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent_obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent matrix for drawing. </p>
	 * @see #__DNA__FIELD__parent_obmat
	 */
	
	public void setParent_obmat(CArrayFacade<CArrayFacade<Float>> parent_obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(parent_obmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent_obmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent_obmat);
		} else {
			__io__generic__copy( getParent_obmat(), parent_obmat);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDframe_Runtime> __io__addressof() {
		return new CPointer<bGPDframe_Runtime>(__io__address, new Class[]{bGPDframe_Runtime.class}, __io__block, __io__blockTable);
	}

}
