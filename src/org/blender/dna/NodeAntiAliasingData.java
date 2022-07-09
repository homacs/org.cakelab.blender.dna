package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAntiAliasingData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class NodeAntiAliasingData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAntiAliasingData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAntiAliasingData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 434;

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAntiAliasingData nodeantialiasingdata = ...;
	 * CPointer&lt;Object&gt; p = nodeantialiasingdata.__dna__addressof(NodeAntiAliasingData.__DNA__FIELD__threshold);
	 * CPointer&lt;Float&gt; p_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'contrast_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAntiAliasingData nodeantialiasingdata = ...;
	 * CPointer&lt;Object&gt; p = nodeantialiasingdata.__dna__addressof(NodeAntiAliasingData.__DNA__FIELD__contrast_limit);
	 * CPointer&lt;Float&gt; p_contrast_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contrast_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contrast_limit = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'corner_rounding'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAntiAliasingData nodeantialiasingdata = ...;
	 * CPointer&lt;Object&gt; p = nodeantialiasingdata.__dna__addressof(NodeAntiAliasingData.__DNA__FIELD__corner_rounding);
	 * CPointer&lt;Float&gt; p_corner_rounding = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'corner_rounding'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__corner_rounding = new long[]{8, 8};

	public NodeAntiAliasingData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAntiAliasingData(NodeAntiAliasingData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public float getThreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(float threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, threshold);
		} else {
			__io__block.writeFloat(__io__address + 0, threshold);
		}
	}

	/**
	 * Get method for struct member 'contrast_limit'.
	 * @see #__DNA__FIELD__contrast_limit
	 */
	
	public float getContrast_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'contrast_limit'.
	 * @see #__DNA__FIELD__contrast_limit
	 */
	
	public void setContrast_limit(float contrast_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, contrast_limit);
		} else {
			__io__block.writeFloat(__io__address + 4, contrast_limit);
		}
	}

	/**
	 * Get method for struct member 'corner_rounding'.
	 * @see #__DNA__FIELD__corner_rounding
	 */
	
	public float getCorner_rounding() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'corner_rounding'.
	 * @see #__DNA__FIELD__corner_rounding
	 */
	
	public void setCorner_rounding(float corner_rounding) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, corner_rounding);
		} else {
			__io__block.writeFloat(__io__address + 8, corner_rounding);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAntiAliasingData> __io__addressof() {
		return new CPointer<NodeAntiAliasingData>(__io__address, new Class[]{NodeAntiAliasingData.class}, __io__block, __io__blockTable);
	}

}
