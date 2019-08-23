package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UnitSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class UnitSettings extends CFacade {

	/**
	 * This is the sdna index of the struct UnitSettings.
	 * <p>
	 * It is required when allocating a new block to store data for UnitSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 193;

	/**
	 * Field descriptor (offset) for struct member 'scale_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__scale_length);
	 * CPointer&lt;Float&gt; p_scale_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_length = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'system'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__system);
	 * CPointer&lt;Byte&gt; p_system = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'system'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__system = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'system_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__system_rotation);
	 * CPointer&lt;Byte&gt; p_system_rotation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'system_rotation'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__system_rotation = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{6, 6};

	public UnitSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UnitSettings(UnitSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'scale_length'.
	 * @see #__DNA__FIELD__scale_length
	 */
	
	public float getScale_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'scale_length'.
	 * @see #__DNA__FIELD__scale_length
	 */
	
	public void setScale_length(float scale_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, scale_length);
		} else {
			__io__block.writeFloat(__io__address + 0, scale_length);
		}
	}

	/**
	 * Get method for struct member 'system'.
	 * @see #__DNA__FIELD__system
	 */
	
	public byte getSystem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'system'.
	 * @see #__DNA__FIELD__system
	 */
	
	public void setSystem(byte system) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, system);
		} else {
			__io__block.writeByte(__io__address + 4, system);
		}
	}

	/**
	 * Get method for struct member 'system_rotation'.
	 * @see #__DNA__FIELD__system_rotation
	 */
	
	public byte getSystem_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'system_rotation'.
	 * @see #__DNA__FIELD__system_rotation
	 */
	
	public void setSystem_rotation(byte system_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, system_rotation);
		} else {
			__io__block.writeByte(__io__address + 5, system_rotation);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, flag);
		} else {
			__io__block.writeShort(__io__address + 6, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UnitSettings> __io__addressof() {
		return new CPointer<UnitSettings>(__io__address, new Class[]{UnitSettings.class}, __io__block, __io__blockTable);
	}

}
