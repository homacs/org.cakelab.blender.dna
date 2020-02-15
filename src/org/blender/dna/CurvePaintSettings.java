package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurvePaintSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class CurvePaintSettings extends CFacade {

	/**
	 * This is the sdna index of the struct CurvePaintSettings.
	 * <p>
	 * It is required when allocating a new block to store data for CurvePaintSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 200;

	/**
	 * Field descriptor (offset) for struct member 'curve_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of curve to use for new strokes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__curve_type);
	 * CPointer&lt;Byte&gt; p_curve_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'depth_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of projecting depth
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__depth_mode);
	 * CPointer&lt;Byte&gt; p_depth_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth_mode = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'surface_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Plane for projected stroke
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__surface_plane);
	 * CPointer&lt;Byte&gt; p_surface_plane = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_plane'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_plane = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curve fitting method
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__fit_method);
	 * CPointer&lt;Byte&gt; p_fit_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fit_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fit_method = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member 'error_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Allow deviation for a smoother, less precise line
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__error_threshold);
	 * CPointer&lt;Short&gt; p_error_threshold = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error_threshold'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error_threshold = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'radius_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum radius when the minimum pressure is applied (also the minimum when tapering)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__radius_min);
	 * CPointer&lt;Float&gt; p_radius_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_min = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'radius_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to use when the maximum pressure is applied (or when a tablet isn't used)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__radius_max);
	 * CPointer&lt;Float&gt; p_radius_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_max = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'radius_taper_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__radius_taper_start);
	 * CPointer&lt;Float&gt; p_radius_taper_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_taper_start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_taper_start = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'radius_taper_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__radius_taper_end);
	 * CPointer&lt;Float&gt; p_radius_taper_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_taper_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_taper_end = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'surface_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the stroke from the surface
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__surface_offset);
	 * CPointer&lt;Float&gt; p_surface_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_offset = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'corner_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angles above this are considered corners
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvePaintSettings curvepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = curvepaintsettings.__dna__addressof(CurvePaintSettings.__DNA__FIELD__corner_angle);
	 * CPointer&lt;Float&gt; p_corner_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'corner_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__corner_angle = new long[]{28, 28};

	public CurvePaintSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurvePaintSettings(CurvePaintSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'curve_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of curve to use for new strokes
	 * @see #__DNA__FIELD__curve_type
	 */
	
	public byte getCurve_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'curve_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of curve to use for new strokes
	 * @see #__DNA__FIELD__curve_type
	 */
	
	public void setCurve_type(byte curve_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, curve_type);
		} else {
			__io__block.writeByte(__io__address + 0, curve_type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, flag);
		} else {
			__io__block.writeByte(__io__address + 1, flag);
		}
	}

	/**
	 * Get method for struct member 'depth_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of projecting depth
	 * @see #__DNA__FIELD__depth_mode
	 */
	
	public byte getDepth_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'depth_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of projecting depth
	 * @see #__DNA__FIELD__depth_mode
	 */
	
	public void setDepth_mode(byte depth_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, depth_mode);
		} else {
			__io__block.writeByte(__io__address + 2, depth_mode);
		}
	}

	/**
	 * Get method for struct member 'surface_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Plane for projected stroke
	 * @see #__DNA__FIELD__surface_plane
	 */
	
	public byte getSurface_plane() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'surface_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Plane for projected stroke
	 * @see #__DNA__FIELD__surface_plane
	 */
	
	public void setSurface_plane(byte surface_plane) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, surface_plane);
		} else {
			__io__block.writeByte(__io__address + 3, surface_plane);
		}
	}

	/**
	 * Get method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curve fitting method
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public byte getFit_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curve fitting method
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public void setFit_method(byte fit_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, fit_method);
		} else {
			__io__block.writeByte(__io__address + 4, fit_method);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, _pad);
		} else {
			__io__block.writeByte(__io__address + 5, _pad);
		}
	}

	/**
	 * Get method for struct member 'error_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Allow deviation for a smoother, less precise line
	 * @see #__DNA__FIELD__error_threshold
	 */
	
	public short getError_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'error_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Allow deviation for a smoother, less precise line
	 * @see #__DNA__FIELD__error_threshold
	 */
	
	public void setError_threshold(short error_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, error_threshold);
		} else {
			__io__block.writeShort(__io__address + 6, error_threshold);
		}
	}

	/**
	 * Get method for struct member 'radius_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum radius when the minimum pressure is applied (also the minimum when tapering)
	 * @see #__DNA__FIELD__radius_min
	 */
	
	public float getRadius_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'radius_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum radius when the minimum pressure is applied (also the minimum when tapering)
	 * @see #__DNA__FIELD__radius_min
	 */
	
	public void setRadius_min(float radius_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, radius_min);
		} else {
			__io__block.writeFloat(__io__address + 8, radius_min);
		}
	}

	/**
	 * Get method for struct member 'radius_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to use when the maximum pressure is applied (or when a tablet isn't used)
	 * @see #__DNA__FIELD__radius_max
	 */
	
	public float getRadius_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'radius_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to use when the maximum pressure is applied (or when a tablet isn't used)
	 * @see #__DNA__FIELD__radius_max
	 */
	
	public void setRadius_max(float radius_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, radius_max);
		} else {
			__io__block.writeFloat(__io__address + 12, radius_max);
		}
	}

	/**
	 * Get method for struct member 'radius_taper_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * @see #__DNA__FIELD__radius_taper_start
	 */
	
	public float getRadius_taper_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'radius_taper_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * @see #__DNA__FIELD__radius_taper_start
	 */
	
	public void setRadius_taper_start(float radius_taper_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, radius_taper_start);
		} else {
			__io__block.writeFloat(__io__address + 16, radius_taper_start);
		}
	}

	/**
	 * Get method for struct member 'radius_taper_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * @see #__DNA__FIELD__radius_taper_end
	 */
	
	public float getRadius_taper_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'radius_taper_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Taper factor for the radius of each point along the curve
	 * @see #__DNA__FIELD__radius_taper_end
	 */
	
	public void setRadius_taper_end(float radius_taper_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, radius_taper_end);
		} else {
			__io__block.writeFloat(__io__address + 20, radius_taper_end);
		}
	}

	/**
	 * Get method for struct member 'surface_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the stroke from the surface
	 * @see #__DNA__FIELD__surface_offset
	 */
	
	public float getSurface_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'surface_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the stroke from the surface
	 * @see #__DNA__FIELD__surface_offset
	 */
	
	public void setSurface_offset(float surface_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, surface_offset);
		} else {
			__io__block.writeFloat(__io__address + 24, surface_offset);
		}
	}

	/**
	 * Get method for struct member 'corner_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angles above this are considered corners
	 * @see #__DNA__FIELD__corner_angle
	 */
	
	public float getCorner_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'corner_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angles above this are considered corners
	 * @see #__DNA__FIELD__corner_angle
	 */
	
	public void setCorner_angle(float corner_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, corner_angle);
		} else {
			__io__block.writeFloat(__io__address + 28, corner_angle);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurvePaintSettings> __io__addressof() {
		return new CPointer<CurvePaintSettings>(__io__address, new Class[]{CurvePaintSettings.class}, __io__block, __io__blockTable);
	}

}
