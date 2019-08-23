package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UnitSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Assorted {@link Scene}  Data -------------------------------------<mdash/><mdash/>  Unit Settings </p>
 */

@CMetaData(size32=16, size64=16)
public class UnitSettings extends CFacade {

	/**
	 * This is the sdna index of the struct UnitSettings.
	 * <p>
	 * It is required when allocating a new block to store data for UnitSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 203;

	/**
	 * Field descriptor (offset) for struct member 'scale_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale to use when converting between blender units and dimensions. When working at microscopic or astronomical scale, a small or large unit scale respectively can be used to avoid numerical precision problems<h4>Blender Source Code:</h4>
	 * <p> Display/Editing unit options for each scene Maybe have other unit conversions?. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The unit system to use for user interface controls<h4>Blender Source Code:</h4>
	 * <p> Imperial, metric etc. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit to use for displaying/editing rotation values<h4>Blender Source Code:</h4>
	 * <p> Not implemented as a proper unit system yet. </p>
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

	/**
	 * Field descriptor (offset) for struct member 'length_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display length values
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__length_unit);
	 * CPointer&lt;Byte&gt; p_length_unit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length_unit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length_unit = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'mass_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display mass values
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__mass_unit);
	 * CPointer&lt;Byte&gt; p_mass_unit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mass_unit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mass_unit = new long[]{9, 9};

	/**
	 * Field descriptor (offset) for struct member 'time_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display time values
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD__time_unit);
	 * CPointer&lt;Byte&gt; p_time_unit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_unit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_unit = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnitSettings unitsettings = ...;
	 * CPointer&lt;Object&gt; p = unitsettings.__dna__addressof(UnitSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{11, 11};

	public UnitSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UnitSettings(UnitSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'scale_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale to use when converting between blender units and dimensions. When working at microscopic or astronomical scale, a small or large unit scale respectively can be used to avoid numerical precision problems<h4>Blender Source Code:</h4>
	 * <p> Display/Editing unit options for each scene Maybe have other unit conversions?. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale to use when converting between blender units and dimensions. When working at microscopic or astronomical scale, a small or large unit scale respectively can be used to avoid numerical precision problems<h4>Blender Source Code:</h4>
	 * <p> Display/Editing unit options for each scene Maybe have other unit conversions?. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The unit system to use for user interface controls<h4>Blender Source Code:</h4>
	 * <p> Imperial, metric etc. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The unit system to use for user interface controls<h4>Blender Source Code:</h4>
	 * <p> Imperial, metric etc. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit to use for displaying/editing rotation values<h4>Blender Source Code:</h4>
	 * <p> Not implemented as a proper unit system yet. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit to use for displaying/editing rotation values<h4>Blender Source Code:</h4>
	 * <p> Not implemented as a proper unit system yet. </p>
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
	 * Get method for struct member 'length_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display length values
	 * @see #__DNA__FIELD__length_unit
	 */
	
	public byte getLength_unit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'length_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display length values
	 * @see #__DNA__FIELD__length_unit
	 */
	
	public void setLength_unit(byte length_unit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, length_unit);
		} else {
			__io__block.writeByte(__io__address + 8, length_unit);
		}
	}

	/**
	 * Get method for struct member 'mass_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display mass values
	 * @see #__DNA__FIELD__mass_unit
	 */
	
	public byte getMass_unit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'mass_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display mass values
	 * @see #__DNA__FIELD__mass_unit
	 */
	
	public void setMass_unit(byte mass_unit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, mass_unit);
		} else {
			__io__block.writeByte(__io__address + 9, mass_unit);
		}
	}

	/**
	 * Get method for struct member 'time_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display time values
	 * @see #__DNA__FIELD__time_unit
	 */
	
	public byte getTime_unit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10);
		} else {
			return __io__block.readByte(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'time_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unit that will be used to display time values
	 * @see #__DNA__FIELD__time_unit
	 */
	
	public void setTime_unit(byte time_unit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10, time_unit);
		} else {
			__io__block.writeByte(__io__address + 10, time_unit);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 11, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 11, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 11;
		} else {
			__dna__offset = 11;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UnitSettings> __io__addressof() {
		return new CPointer<UnitSettings>(__io__address, new Class[]{UnitSettings.class}, __io__block, __io__blockTable);
	}

}
