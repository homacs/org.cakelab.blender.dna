package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=20)
public class BoidData extends CFacade {

	/**
	 * This is the sdna index of the struct BoidData.
	 * <p>
	 * It is required when allocating a new block to store data for BoidData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 536;

	/**
	 * Field descriptor (offset) for struct member 'health'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidData boiddata = ...;
	 * CPointer&lt;Object&gt; p = boiddata.__dna__addressof(BoidData.__DNA__FIELD__health);
	 * CPointer&lt;Float&gt; p_health = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'health'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__health = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'acc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidData boiddata = ...;
	 * CPointer&lt;Object&gt; p = boiddata.__dna__addressof(BoidData.__DNA__FIELD__acc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_acc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'acc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__acc = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'state_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidData boiddata = ...;
	 * CPointer&lt;Object&gt; p = boiddata.__dna__addressof(BoidData.__DNA__FIELD__state_id);
	 * CPointer&lt;Short&gt; p_state_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'state_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__state_id = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidData boiddata = ...;
	 * CPointer&lt;Object&gt; p = boiddata.__dna__addressof(BoidData.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{18, 18};

	public BoidData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidData(BoidData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'health'.
	 * @see #__DNA__FIELD__health
	 */
	
	public float getHealth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'health'.
	 * @see #__DNA__FIELD__health
	 */
	
	public void setHealth(float health) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, health);
		} else {
			__io__block.writeFloat(__io__address + 0, health);
		}
	}

	/**
	 * Get method for struct member 'acc'.
	 * @see #__DNA__FIELD__acc
	 */
	
	public CArrayFacade<Float> getAcc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'acc'.
	 * @see #__DNA__FIELD__acc
	 */
	
	public void setAcc(CArrayFacade<Float> acc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(acc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, acc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, acc);
		} else {
			__io__generic__copy( getAcc(), acc);
		}
	}

	/**
	 * Get method for struct member 'state_id'.
	 * @see #__DNA__FIELD__state_id
	 */
	
	public short getState_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'state_id'.
	 * @see #__DNA__FIELD__state_id
	 */
	
	public void setState_id(short state_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, state_id);
		} else {
			__io__block.writeShort(__io__address + 16, state_id);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, mode);
		} else {
			__io__block.writeShort(__io__address + 18, mode);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidData> __io__addressof() {
		return new CPointer<BoidData>(__io__address, new Class[]{BoidData.class}, __io__block, __io__blockTable);
	}

}
