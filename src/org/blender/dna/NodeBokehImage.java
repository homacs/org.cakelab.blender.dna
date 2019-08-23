package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeBokehImage'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=20)
public class NodeBokehImage extends CFacade {

	/**
	 * This is the sdna index of the struct NodeBokehImage.
	 * <p>
	 * It is required when allocating a new block to store data for NodeBokehImage.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 408;

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBokehImage nodebokehimage = ...;
	 * CPointer&lt;Object&gt; p = nodebokehimage.__dna__addressof(NodeBokehImage.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flaps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBokehImage nodebokehimage = ...;
	 * CPointer&lt;Object&gt; p = nodebokehimage.__dna__addressof(NodeBokehImage.__DNA__FIELD__flaps);
	 * CPointer&lt;Integer&gt; p_flaps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flaps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flaps = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'rounding'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBokehImage nodebokehimage = ...;
	 * CPointer&lt;Object&gt; p = nodebokehimage.__dna__addressof(NodeBokehImage.__DNA__FIELD__rounding);
	 * CPointer&lt;Float&gt; p_rounding = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rounding'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rounding = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'catadioptric'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBokehImage nodebokehimage = ...;
	 * CPointer&lt;Object&gt; p = nodebokehimage.__dna__addressof(NodeBokehImage.__DNA__FIELD__catadioptric);
	 * CPointer&lt;Float&gt; p_catadioptric = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'catadioptric'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__catadioptric = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'lensshift'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBokehImage nodebokehimage = ...;
	 * CPointer&lt;Object&gt; p = nodebokehimage.__dna__addressof(NodeBokehImage.__DNA__FIELD__lensshift);
	 * CPointer&lt;Float&gt; p_lensshift = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lensshift'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lensshift = new long[]{16, 16};

	public NodeBokehImage(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeBokehImage(NodeBokehImage that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, angle);
		} else {
			__io__block.writeFloat(__io__address + 0, angle);
		}
	}

	/**
	 * Get method for struct member 'flaps'.
	 * @see #__DNA__FIELD__flaps
	 */
	
	public int getFlaps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flaps'.
	 * @see #__DNA__FIELD__flaps
	 */
	
	public void setFlaps(int flaps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, flaps);
		} else {
			__io__block.writeInt(__io__address + 4, flaps);
		}
	}

	/**
	 * Get method for struct member 'rounding'.
	 * @see #__DNA__FIELD__rounding
	 */
	
	public float getRounding() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'rounding'.
	 * @see #__DNA__FIELD__rounding
	 */
	
	public void setRounding(float rounding) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, rounding);
		} else {
			__io__block.writeFloat(__io__address + 8, rounding);
		}
	}

	/**
	 * Get method for struct member 'catadioptric'.
	 * @see #__DNA__FIELD__catadioptric
	 */
	
	public float getCatadioptric() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'catadioptric'.
	 * @see #__DNA__FIELD__catadioptric
	 */
	
	public void setCatadioptric(float catadioptric) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, catadioptric);
		} else {
			__io__block.writeFloat(__io__address + 12, catadioptric);
		}
	}

	/**
	 * Get method for struct member 'lensshift'.
	 * @see #__DNA__FIELD__lensshift
	 */
	
	public float getLensshift() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'lensshift'.
	 * @see #__DNA__FIELD__lensshift
	 */
	
	public void setLensshift(float lensshift) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, lensshift);
		} else {
			__io__block.writeFloat(__io__address + 16, lensshift);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeBokehImage> __io__addressof() {
		return new CPointer<NodeBokehImage>(__io__address, new Class[]{NodeBokehImage.class}, __io__block, __io__blockTable);
	}

}
