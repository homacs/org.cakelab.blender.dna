package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskSplinePointUW'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class MaskSplinePointUW extends CFacade {

	/**
	 * This is the sdna index of the struct MaskSplinePointUW.
	 * <p>
	 * It is required when allocating a new block to store data for MaskSplinePointUW.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 574;

	/**
	 * Field descriptor (offset) for struct member 'u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * U coordinate of point along spline segment<h4>Blender Source Code:</h4>
	 * <p> U coordinate along spline segment and weight of this point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePointUW masksplinepointuw = ...;
	 * CPointer&lt;Object&gt; p = masksplinepointuw.__dna__addressof(MaskSplinePointUW.__DNA__FIELD__u);
	 * CPointer&lt;Float&gt; p_u = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'u'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__u = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'w'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePointUW masksplinepointuw = ...;
	 * CPointer&lt;Object&gt; p = masksplinepointuw.__dna__addressof(MaskSplinePointUW.__DNA__FIELD__w);
	 * CPointer&lt;Float&gt; p_w = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'w'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__w = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Different flags of this point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePointUW masksplinepointuw = ...;
	 * CPointer&lt;Object&gt; p = masksplinepointuw.__dna__addressof(MaskSplinePointUW.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	public MaskSplinePointUW(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskSplinePointUW(MaskSplinePointUW that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * U coordinate of point along spline segment<h4>Blender Source Code:</h4>
	 * <p> U coordinate along spline segment and weight of this point. </p>
	 * @see #__DNA__FIELD__u
	 */
	
	public float getU() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * U coordinate of point along spline segment<h4>Blender Source Code:</h4>
	 * <p> U coordinate along spline segment and weight of this point. </p>
	 * @see #__DNA__FIELD__u
	 */
	
	public void setU(float u) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, u);
		} else {
			__io__block.writeFloat(__io__address + 0, u);
		}
	}

	/**
	 * Get method for struct member 'w'.
	 * @see #__DNA__FIELD__w
	 */
	
	public float getW() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'w'.
	 * @see #__DNA__FIELD__w
	 */
	
	public void setW(float w) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, w);
		} else {
			__io__block.writeFloat(__io__address + 4, w);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Different flags of this point. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Different flags of this point. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskSplinePointUW> __io__addressof() {
		return new CPointer<MaskSplinePointUW>(__io__address, new Class[]{MaskSplinePointUW.class}, __io__block, __io__blockTable);
	}

}
