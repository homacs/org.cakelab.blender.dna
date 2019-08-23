package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDtriangle'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Grease-Pencil Annotations - 'Triangle' -> A triangle contains the index of three vertices for filling the stroke This is only used if high quality fill is enabled </p>
 */

@CMetaData(size32=12, size64=12)
public class bGPDtriangle extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDtriangle.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDtriangle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 490;

	/**
	 * Field descriptor (offset) for struct member 'v1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDtriangle bgpdtriangle = ...;
	 * CPointer&lt;Object&gt; p = bgpdtriangle.__dna__addressof(bGPDtriangle.__DNA__FIELD__v1);
	 * CPointer&lt;Integer&gt; p_v1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v1 = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'v2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDtriangle bgpdtriangle = ...;
	 * CPointer&lt;Object&gt; p = bgpdtriangle.__dna__addressof(bGPDtriangle.__DNA__FIELD__v2);
	 * CPointer&lt;Integer&gt; p_v2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'v3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tesselated triangle used for GP Fill </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDtriangle bgpdtriangle = ...;
	 * CPointer&lt;Object&gt; p = bgpdtriangle.__dna__addressof(bGPDtriangle.__DNA__FIELD__v3);
	 * CPointer&lt;Integer&gt; p_v3 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v3'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v3 = new long[]{8, 8};

	public bGPDtriangle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDtriangle(bGPDtriangle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v1'.
	 * @see #__DNA__FIELD__v1
	 */
	
	public int getV1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'v1'.
	 * @see #__DNA__FIELD__v1
	 */
	
	public void setV1(int v1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, v1);
		} else {
			__io__block.writeInt(__io__address + 0, v1);
		}
	}

	/**
	 * Get method for struct member 'v2'.
	 * @see #__DNA__FIELD__v2
	 */
	
	public int getV2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'v2'.
	 * @see #__DNA__FIELD__v2
	 */
	
	public void setV2(int v2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, v2);
		} else {
			__io__block.writeInt(__io__address + 4, v2);
		}
	}

	/**
	 * Get method for struct member 'v3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tesselated triangle used for GP Fill </p>
	 * @see #__DNA__FIELD__v3
	 */
	
	public int getV3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'v3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indices for tesselated triangle used for GP Fill </p>
	 * @see #__DNA__FIELD__v3
	 */
	
	public void setV3(int v3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, v3);
		} else {
			__io__block.writeInt(__io__address + 8, v3);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDtriangle> __io__addressof() {
		return new CPointer<bGPDtriangle>(__io__address, new Class[]{bGPDtriangle.class}, __io__block, __io__blockTable);
	}

}
