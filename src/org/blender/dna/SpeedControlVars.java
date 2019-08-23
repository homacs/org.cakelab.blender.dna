package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpeedControlVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=24)
public class SpeedControlVars extends CFacade {

	/**
	 * This is the sdna index of the struct SpeedControlVars.
	 * <p>
	 * It is required when allocating a new block to store data for SpeedControlVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 275;

	/**
	 * Field descriptor (offset) for struct member 'frameMap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpeedControlVars speedcontrolvars = ...;
	 * CPointer&lt;Object&gt; p = speedcontrolvars.__dna__addressof(SpeedControlVars.__DNA__FIELD__frameMap);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_frameMap = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frameMap'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frameMap = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'globalSpeed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpeedControlVars speedcontrolvars = ...;
	 * CPointer&lt;Object&gt; p = speedcontrolvars.__dna__addressof(SpeedControlVars.__DNA__FIELD__globalSpeed);
	 * CPointer&lt;Float&gt; p_globalSpeed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'globalSpeed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__globalSpeed = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpeedControlVars speedcontrolvars = ...;
	 * CPointer&lt;Object&gt; p = speedcontrolvars.__dna__addressof(SpeedControlVars.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpeedControlVars speedcontrolvars = ...;
	 * CPointer&lt;Object&gt; p = speedcontrolvars.__dna__addressof(SpeedControlVars.__DNA__FIELD__length);
	 * CPointer&lt;Integer&gt; p_length = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'lastValidFrame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpeedControlVars speedcontrolvars = ...;
	 * CPointer&lt;Object&gt; p = speedcontrolvars.__dna__addressof(SpeedControlVars.__DNA__FIELD__lastValidFrame);
	 * CPointer&lt;Integer&gt; p_lastValidFrame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastValidFrame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastValidFrame = new long[]{16, 20};

	public SpeedControlVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpeedControlVars(SpeedControlVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'frameMap'.
	 * @see #__DNA__FIELD__frameMap
	 */
	
	public CPointer<Float> getFrameMap() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'frameMap'.
	 * @see #__DNA__FIELD__frameMap
	 */
	
	public void setFrameMap(CPointer<Float> frameMap) throws IOException
	{
		long __address = ((frameMap == null) ? 0 : frameMap.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'globalSpeed'.
	 * @see #__DNA__FIELD__globalSpeed
	 */
	
	public float getGlobalSpeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'globalSpeed'.
	 * @see #__DNA__FIELD__globalSpeed
	 */
	
	public void setGlobalSpeed(float globalSpeed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, globalSpeed);
		} else {
			__io__block.writeFloat(__io__address + 4, globalSpeed);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, flags);
		} else {
			__io__block.writeInt(__io__address + 8, flags);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public int getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(int length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, length);
		} else {
			__io__block.writeInt(__io__address + 12, length);
		}
	}

	/**
	 * Get method for struct member 'lastValidFrame'.
	 * @see #__DNA__FIELD__lastValidFrame
	 */
	
	public int getLastValidFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'lastValidFrame'.
	 * @see #__DNA__FIELD__lastValidFrame
	 */
	
	public void setLastValidFrame(int lastValidFrame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, lastValidFrame);
		} else {
			__io__block.writeInt(__io__address + 16, lastValidFrame);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpeedControlVars> __io__addressof() {
		return new CPointer<SpeedControlVars>(__io__address, new Class[]{SpeedControlVars.class}, __io__block, __io__blockTable);
	}

}
