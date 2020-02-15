package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_Interpolate_Settings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Settings for GP Interpolation Operators </p>
 */

@CMetaData(size32=20, size64=24)
public class GP_Interpolate_Settings extends CFacade {

	/**
	 * This is the sdna index of the struct GP_Interpolate_Settings.
	 * <p>
	 * It is required when allocating a new block to store data for GP_Interpolate_Settings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 198;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_SettingsFlag} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_Type}  - Interpolation Mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eBezTriple_Easing}  - Easing mode (if easing equation used). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__easing);
	 * CPointer&lt;Byte&gt; p_easing = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'easing'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__easing = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__back);
	 * CPointer&lt;Float&gt; p_back = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'back'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__back = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__amplitude);
	 * CPointer&lt;Float&gt; p_amplitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amplitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amplitude = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'period'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__period);
	 * CPointer&lt;Float&gt; p_period = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'period'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__period = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom interpolation curve (for use with GP_IPO_CURVEMAP). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Interpolate_Settings gp_interpolate_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_interpolate_settings.__dna__addressof(GP_Interpolate_Settings.__DNA__FIELD__custom_ipo);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_custom_ipo = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_ipo'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_ipo = new long[]{16, 16};

	public GP_Interpolate_Settings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_Interpolate_Settings(GP_Interpolate_Settings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_SettingsFlag} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_SettingsFlag} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_Type}  - Interpolation Mode. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Interpolate_Type}  - Interpolation Mode. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, type);
		} else {
			__io__block.writeByte(__io__address + 2, type);
		}
	}

	/**
	 * Get method for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eBezTriple_Easing}  - Easing mode (if easing equation used). </p>
	 * @see #__DNA__FIELD__easing
	 */
	
	public byte getEasing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eBezTriple_Easing}  - Easing mode (if easing equation used). </p>
	 * @see #__DNA__FIELD__easing
	 */
	
	public void setEasing(byte easing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, easing);
		} else {
			__io__block.writeByte(__io__address + 3, easing);
		}
	}

	/**
	 * Get method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public float getBack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public void setBack(float back) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, back);
		} else {
			__io__block.writeFloat(__io__address + 4, back);
		}
	}

	/**
	 * Get method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public float getAmplitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public void setAmplitude(float amplitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, amplitude);
		} else {
			__io__block.writeFloat(__io__address + 8, amplitude);
		}
	}

	/**
	 * Get method for struct member 'period'.
	 * @see #__DNA__FIELD__period
	 */
	
	public float getPeriod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'period'.
	 * @see #__DNA__FIELD__period
	 */
	
	public void setPeriod(float period) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, period);
		} else {
			__io__block.writeFloat(__io__address + 12, period);
		}
	}

	/**
	 * Get method for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom interpolation curve (for use with GP_IPO_CURVEMAP). </p>
	 * @see #__DNA__FIELD__custom_ipo
	 */
	
	public CPointer<CurveMapping> getCustom_ipo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom interpolation curve (for use with GP_IPO_CURVEMAP). </p>
	 * @see #__DNA__FIELD__custom_ipo
	 */
	
	public void setCustom_ipo(CPointer<CurveMapping> custom_ipo) throws IOException
	{
		long __address = ((custom_ipo == null) ? 0 : custom_ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GP_Interpolate_Settings> __io__addressof() {
		return new CPointer<GP_Interpolate_Settings>(__io__address, new Class[]{GP_Interpolate_Settings.class}, __io__block, __io__blockTable);
	}

}
