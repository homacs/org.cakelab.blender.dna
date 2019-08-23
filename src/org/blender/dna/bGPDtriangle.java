package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDtriangle'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Fill - Triangle Tessellation Data Grease-Pencil Annotations - 'Triangle' -> A triangle contains the index of three vertices for filling the stroke This is only used if high quality fill is enabled </p>
 */

@CMetaData(size32=36, size64=36)
public class bGPDtriangle extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDtriangle.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDtriangle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 463;

	/**
	 * Field descriptor (offset) for struct member 'verts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tessellated triangle used for GP Fill </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDtriangle bgpdtriangle = ...;
	 * CPointer&lt;Object&gt; p = bgpdtriangle.__dna__addressof(bGPDtriangle.__DNA__FIELD__verts);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_verts = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'verts'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__verts = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture coordinates for verts </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDtriangle bgpdtriangle = ...;
	 * CPointer&lt;Object&gt; p = bgpdtriangle.__dna__addressof(bGPDtriangle.__DNA__FIELD__uv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_uv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv'</li>
	 * <li>Signature: 'float[3][2]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv = new long[]{12, 12};

	public bGPDtriangle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDtriangle(bGPDtriangle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'verts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tessellated triangle used for GP Fill </p>
	 * @see #__DNA__FIELD__verts
	 */
	
	public CArrayFacade<Integer> getVerts() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'verts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tessellated triangle used for GP Fill </p>
	 * @see #__DNA__FIELD__verts
	 */
	
	public void setVerts(CArrayFacade<Integer> verts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(verts, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, verts)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, verts);
		} else {
			__io__generic__copy( getVerts(), verts);
		}
	}

	/**
	 * Get method for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture coordinates for verts </p>
	 * @see #__DNA__FIELD__uv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getUv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture coordinates for verts </p>
	 * @see #__DNA__FIELD__uv
	 */
	
	public void setUv(CArrayFacade<CArrayFacade<Float>> uv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
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
	public CPointer<bGPDtriangle> __io__addressof() {
		return new CPointer<bGPDtriangle>(__io__address, new Class[]{bGPDtriangle.class}, __io__block, __io__blockTable);
	}

}
