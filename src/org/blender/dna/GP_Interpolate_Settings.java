package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_Interpolate_Settings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Settings for GP Interpolation Operators. </p>
 */

@CMetaData(size32=4, size64=8)
public class GP_Interpolate_Settings extends CFacade {

	/**
	 * This is the sdna index of the struct GP_Interpolate_Settings.
	 * <p>
	 * It is required when allocating a new block to store data for GP_Interpolate_Settings.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 212;

	/**
	 * Field descriptor (offset) for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__custom_ipo = new long[]{0, 0};

	public GP_Interpolate_Settings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_Interpolate_Settings(GP_Interpolate_Settings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom interpolation curve (for use with GP_IPO_CURVEMAP). </p>
	 * @see #__DNA__FIELD__custom_ipo
	 */
	
	public CPointer<CurveMapping> getCustom_ipo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom interpolation curve (for use with GP_IPO_CURVEMAP). </p>
	 * @see #__DNA__FIELD__custom_ipo
	 */
	
	public void setCustom_ipo(CPointer<CurveMapping> custom_ipo) throws IOException
	{
		long __address = ((custom_ipo == null) ? 0 : custom_ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GP_Interpolate_Settings> __io__addressof() {
		return new CPointer<GP_Interpolate_Settings>(__io__address, new Class[]{GP_Interpolate_Settings.class}, __io__block, __io__blockTable);
	}

}
