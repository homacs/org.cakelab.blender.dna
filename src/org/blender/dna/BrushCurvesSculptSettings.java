package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BrushCurvesSculptSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=36, size64=36)
public class BrushCurvesSculptSettings extends CFacade {

	/**
	 * This is the sdna index of the struct BrushCurvesSculptSettings.
	 * <p>
	 * It is required when allocating a new block to store data for BrushCurvesSculptSettings.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 70;

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
	 * Field descriptor (offset) for struct member 'points_per_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of control points in a newly added curve
	 * <h4>Blender Source Code</h4>
	 * <p> Number of control points in new curves added by the add brush. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__points_per_curve);
	 * CPointer&lt;Integer&gt; p_points_per_curve = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points_per_curve'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points_per_curve = new long[]{4, 4};

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
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

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
	public static final long[] __DNA__FIELD__minimum_length = new long[]{12, 12};

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
	public static final long[] __DNA__FIELD__curve_length = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'minimum_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Goal distance between curve roots for the Density brush
	 * <h4>Blender Source Code</h4>
	 * <p> Minimum distance between curve root points used by the Density brush. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__minimum_distance);
	 * CPointer&lt;Float&gt; p_minimum_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minimum_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minimum_distance = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'density_add_attempts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How many times the Density brush tries to add a new curve
	 * <h4>Blender Source Code</h4>
	 * <p> How often the Density brush tries to add a new curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__density_add_attempts);
	 * CPointer&lt;Integer&gt; p_density_add_attempts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density_add_attempts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density_add_attempts = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'density_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determines whether the brush adds or removes curves
	 * <h4>Blender Source Code</h4>
	 * <p> #eBrushCurvesSculptDensityMode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD__density_mode);
	 * CPointer&lt;Byte&gt; p_density_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density_mode'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density_mode = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushCurvesSculptSettings brushcurvessculptsettings = ...;
	 * CPointer&lt;Object&gt; p = brushcurvessculptsettings.__dna__addressof(BrushCurvesSculptSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{29, 29};

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
	 * Get method for struct member 'points_per_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of control points in a newly added curve
	 * <h4>Blender Source Code</h4>
	 * <p> Number of control points in new curves added by the add brush. </p>
	 * @see #__DNA__FIELD__points_per_curve
	 */
	
	public int getPoints_per_curve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'points_per_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of control points in a newly added curve
	 * <h4>Blender Source Code</h4>
	 * <p> Number of control points in new curves added by the add brush. </p>
	 * @see #__DNA__FIELD__points_per_curve
	 */
	
	public void setPoints_per_curve(int points_per_curve) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, points_per_curve);
		} else {
			__io__block.writeInt(__io__address + 4, points_per_curve);
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
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
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
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
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
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
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
			__io__block.writeFloat(__io__address + 12, minimum_length);
		} else {
			__io__block.writeFloat(__io__address + 12, minimum_length);
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
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
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
			__io__block.writeFloat(__io__address + 16, curve_length);
		} else {
			__io__block.writeFloat(__io__address + 16, curve_length);
		}
	}

	/**
	 * Get method for struct member 'minimum_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Goal distance between curve roots for the Density brush
	 * <h4>Blender Source Code</h4>
	 * <p> Minimum distance between curve root points used by the Density brush. </p>
	 * @see #__DNA__FIELD__minimum_distance
	 */
	
	public float getMinimum_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'minimum_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Goal distance between curve roots for the Density brush
	 * <h4>Blender Source Code</h4>
	 * <p> Minimum distance between curve root points used by the Density brush. </p>
	 * @see #__DNA__FIELD__minimum_distance
	 */
	
	public void setMinimum_distance(float minimum_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, minimum_distance);
		} else {
			__io__block.writeFloat(__io__address + 20, minimum_distance);
		}
	}

	/**
	 * Get method for struct member 'density_add_attempts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How many times the Density brush tries to add a new curve
	 * <h4>Blender Source Code</h4>
	 * <p> How often the Density brush tries to add a new curve. </p>
	 * @see #__DNA__FIELD__density_add_attempts
	 */
	
	public int getDensity_add_attempts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'density_add_attempts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * How many times the Density brush tries to add a new curve
	 * <h4>Blender Source Code</h4>
	 * <p> How often the Density brush tries to add a new curve. </p>
	 * @see #__DNA__FIELD__density_add_attempts
	 */
	
	public void setDensity_add_attempts(int density_add_attempts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, density_add_attempts);
		} else {
			__io__block.writeInt(__io__address + 24, density_add_attempts);
		}
	}

	/**
	 * Get method for struct member 'density_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determines whether the brush adds or removes curves
	 * <h4>Blender Source Code</h4>
	 * <p> #eBrushCurvesSculptDensityMode. </p>
	 * @see #__DNA__FIELD__density_mode
	 */
	
	public byte getDensity_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 28);
		} else {
			return __io__block.readByte(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'density_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determines whether the brush adds or removes curves
	 * <h4>Blender Source Code</h4>
	 * <p> #eBrushCurvesSculptDensityMode. </p>
	 * @see #__DNA__FIELD__density_mode
	 */
	
	public void setDensity_mode(byte density_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 28, density_mode);
		} else {
			__io__block.writeByte(__io__address + 28, density_mode);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 29, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 29, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 29;
		} else {
			__dna__offset = 29;
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
	public CPointer<BrushCurvesSculptSettings> __io__addressof() {
		return new CPointer<BrushCurvesSculptSettings>(__io__address, new Class[]{BrushCurvesSculptSettings.class}, __io__block, __io__blockTable);
	}

}
