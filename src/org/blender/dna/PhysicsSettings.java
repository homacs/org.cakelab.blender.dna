package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PhysicsSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Global/Common Physics Settings </p>
 */

@CMetaData(size32=24, size64=24)
public class PhysicsSettings extends CFacade {

	/**
	 * This is the sdna index of the struct PhysicsSettings.
	 * <p>
	 * It is required when allocating a new block to store data for PhysicsSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 198;

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PhysicsSettings physicssettings = ...;
	 * CPointer&lt;Object&gt; p = physicssettings.__dna__addressof(PhysicsSettings.__DNA__FIELD__gravity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gravity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PhysicsSettings physicssettings = ...;
	 * CPointer&lt;Object&gt; p = physicssettings.__dna__addressof(PhysicsSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'quick_cache_step'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PhysicsSettings physicssettings = ...;
	 * CPointer&lt;Object&gt; p = physicssettings.__dna__addressof(PhysicsSettings.__DNA__FIELD__quick_cache_step);
	 * CPointer&lt;Integer&gt; p_quick_cache_step = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quick_cache_step'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quick_cache_step = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PhysicsSettings physicssettings = ...;
	 * CPointer&lt;Object&gt; p = physicssettings.__dna__addressof(PhysicsSettings.__DNA__FIELD__rt);
	 * CPointer&lt;Integer&gt; p_rt = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{20, 20};

	public PhysicsSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PhysicsSettings(PhysicsSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public CArrayFacade<Float> getGravity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(CArrayFacade<Float> gravity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(gravity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gravity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gravity);
		} else {
			__io__generic__copy( getGravity(), gravity);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, flag);
		} else {
			__io__block.writeInt(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'quick_cache_step'.
	 * @see #__DNA__FIELD__quick_cache_step
	 */
	
	public int getQuick_cache_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'quick_cache_step'.
	 * @see #__DNA__FIELD__quick_cache_step
	 */
	
	public void setQuick_cache_step(int quick_cache_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, quick_cache_step);
		} else {
			__io__block.writeInt(__io__address + 16, quick_cache_step);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public int getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(int rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, rt);
		} else {
			__io__block.writeInt(__io__address + 20, rt);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PhysicsSettings> __io__addressof() {
		return new CPointer<PhysicsSettings>(__io__address, new Class[]{PhysicsSettings.class}, __io__block, __io__blockTable);
	}

}
