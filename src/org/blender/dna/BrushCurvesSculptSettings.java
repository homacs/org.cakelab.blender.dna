package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BrushCurvesSculptSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class BrushCurvesSculptSettings extends CFacade {

	/**
	 * This is the sdna index of the struct BrushCurvesSculptSettings.
	 * <p>
	 * It is required when allocating a new block to store data for BrushCurvesSculptSettings.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 548;

	/**
	 * Field descriptor (offset) for struct member 'add_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of curves added by the Add brush
	 * <h4>Blender Source Code</h4>
	 * <p> Number of curves added by the add brush. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__add_amount);
	 * CPointer&lt;Integer&gt; p_add_amount = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add_amount'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_amount = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eBrushCurvesSculptFlag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'minimum_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Avoid shrinking curves shorter than this length
	 * <h4>Blender Source Code</h4>
	 * <p> When shrinking curves, they shouldn't become shorter than this length. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__minimum_length);
	 * CPointer&lt;Float&gt; p_minimum_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minimum_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minimum_length = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'curve_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Length of newly added curves when it is not interpolated from other curves
	 * <h4>Blender Source Code</h4>
	 * <p> Length of newly added curves when it is not interpolated from other curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__curve_length);
	 * CPointer&lt;Float&gt; p_curve_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_length = new long[]{12, 12};

	public BrushCurvesSculptSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BrushCurvesSculptSettings(BrushCurvesSculptSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'add_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of curves added by the Add brush
	 * <h4>Blender Source Code</h4>
	 * <p> Number of curves added by the add brush. </p>
	 * @see #__DNA__FIELD__add_amount
	 */
	
	public int getAdd_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'add_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of curves added by the Add brush
	 * <h4>Blender Source Code</h4>
	 * <p> Number of curves added by the add brush. </p>
	 * @see #__DNA__FIELD__add_amount
	 */
	
	public void setAdd_amount(int add_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, add_amount);
		} else {
			__io__block.writeInt(__io__address + 0, add_amount);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eBrushCurvesSculptFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eBrushCurvesSculptFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'minimum_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Avoid shrinking curves shorter than this length
	 * <h4>Blender Source Code</h4>
	 * <p> When shrinking curves, they shouldn't become shorter than this length. </p>
	 * @see #__DNA__FIELD__minimum_length
	 */
	
	public float getMinimum_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'minimum_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Avoid shrinking curves shorter than this length
	 * <h4>Blender Source Code</h4>
	 * <p> When shrinking curves, they shouldn't become shorter than this length. </p>
	 * @see #__DNA__FIELD__minimum_length
	 */
	
	public void setMinimum_length(float minimum_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, minimum_length);
		} else {
			__io__block.writeFloat(__io__address + 8, minimum_length);
		}
	}

	/**
	 * Get method for struct member 'curve_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Length of newly added curves when it is not interpolated from other curves
	 * <h4>Blender Source Code</h4>
	 * <p> Length of newly added curves when it is not interpolated from other curves. </p>
	 * @see #__DNA__FIELD__curve_length
	 */
	
	public float getCurve_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'curve_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Length of newly added curves when it is not interpolated from other curves
	 * <h4>Blender Source Code</h4>
	 * <p> Length of newly added curves when it is not interpolated from other curves. </p>
	 * @see #__DNA__FIELD__curve_length
	 */
	
	public void setCurve_length(float curve_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, curve_length);
		} else {
			__io__block.writeFloat(__io__address + 12, curve_length);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BrushCurvesSculptSettings> __io__addressof() {
		return new CPointer<BrushCurvesSculptSettings>(__io__address, new Class[]{BrushCurvesSculptSettings.class}, __io__block, __io__blockTable);
	}

}
