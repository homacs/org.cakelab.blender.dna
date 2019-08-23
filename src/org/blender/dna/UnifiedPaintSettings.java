package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UnifiedPaintSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=128)
public class UnifiedPaintSettings extends CFacade {

	/**
	 * This is the sdna index of the struct UnifiedPaintSettings.
	 * <p>
	 * It is required when allocating a new block to store data for UnifiedPaintSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 177;

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__size);
	 * CPointer&lt;Integer&gt; p_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'unprojected_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__unprojected_radius);
	 * CPointer&lt;Float&gt; p_unprojected_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unprojected_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unprojected_radius = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rgb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgb = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'secondary_rgb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__secondary_rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_secondary_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'secondary_rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__secondary_rgb = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'last_rake'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__last_rake);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_last_rake = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_rake'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_rake = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'brush_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__brush_rotation);
	 * CPointer&lt;Float&gt; p_brush_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_rotation = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'draw_anchored'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__draw_anchored);
	 * CPointer&lt;Integer&gt; p_draw_anchored = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_anchored'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_anchored = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'anchored_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__anchored_size);
	 * CPointer&lt;Integer&gt; p_anchored_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchored_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchored_size = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'draw_inverted'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__draw_inverted);
	 * CPointer&lt;Byte&gt; p_draw_inverted = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_inverted'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_inverted = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad3'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad3 = new long[]{65, 65};

	/**
	 * Field descriptor (offset) for struct member 'overlap_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__overlap_factor);
	 * CPointer&lt;Float&gt; p_overlap_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlap_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlap_factor = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'anchored_initial_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__anchored_initial_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_anchored_initial_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchored_initial_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchored_initial_mouse = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'stroke_active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__stroke_active);
	 * CPointer&lt;Integer&gt; p_stroke_active = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stroke_active'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stroke_active = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'size_pressure_value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__size_pressure_value);
	 * CPointer&lt;Float&gt; p_size_pressure_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_pressure_value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_pressure_value = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'tex_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__tex_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tex_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_mouse = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__mask_tex_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mask_tex_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_mouse = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'do_linear_conversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__do_linear_conversion);
	 * CPointer&lt;Integer&gt; p_do_linear_conversion = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_linear_conversion'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_linear_conversion = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'colorspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__colorspace);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_colorspace = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorspace'</li>
	 * <li>Signature: 'ColorSpace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorspace = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'pixel_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pixel_radius);
	 * CPointer&lt;Float&gt; p_pixel_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixel_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixel_radius = new long[]{116, 120};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pad4);
	 * CPointer&lt;Integer&gt; p_pad4 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{120, 124};

	public UnifiedPaintSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UnifiedPaintSettings(UnifiedPaintSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public int getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(int size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, size);
		} else {
			__io__block.writeInt(__io__address + 0, size);
		}
	}

	/**
	 * Get method for struct member 'unprojected_radius'.
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public float getUnprojected_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'unprojected_radius'.
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public void setUnprojected_radius(float unprojected_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 4, unprojected_radius);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, alpha);
		} else {
			__io__block.writeFloat(__io__address + 8, alpha);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, weight);
		} else {
			__io__block.writeFloat(__io__address + 12, weight);
		}
	}

	/**
	 * Get method for struct member 'rgb'.
	 * @see #__DNA__FIELD__rgb
	 */
	
	public CArrayFacade<Float> getRgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rgb'.
	 * @see #__DNA__FIELD__rgb
	 */
	
	public void setRgb(CArrayFacade<Float> rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(rgb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rgb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rgb);
		} else {
			__io__generic__copy( getRgb(), rgb);
		}
	}

	/**
	 * Get method for struct member 'secondary_rgb'.
	 * @see #__DNA__FIELD__secondary_rgb
	 */
	
	public CArrayFacade<Float> getSecondary_rgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'secondary_rgb'.
	 * @see #__DNA__FIELD__secondary_rgb
	 */
	
	public void setSecondary_rgb(CArrayFacade<Float> secondary_rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(secondary_rgb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, secondary_rgb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, secondary_rgb);
		} else {
			__io__generic__copy( getSecondary_rgb(), secondary_rgb);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, flag);
		} else {
			__io__block.writeInt(__io__address + 40, flag);
		}
	}

	/**
	 * Get method for struct member 'last_rake'.
	 * @see #__DNA__FIELD__last_rake
	 */
	
	public CArrayFacade<Float> getLast_rake() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'last_rake'.
	 * @see #__DNA__FIELD__last_rake
	 */
	
	public void setLast_rake(CArrayFacade<Float> last_rake) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(last_rake, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, last_rake)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, last_rake);
		} else {
			__io__generic__copy( getLast_rake(), last_rake);
		}
	}

	/**
	 * Get method for struct member 'brush_rotation'.
	 * @see #__DNA__FIELD__brush_rotation
	 */
	
	public float getBrush_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'brush_rotation'.
	 * @see #__DNA__FIELD__brush_rotation
	 */
	
	public void setBrush_rotation(float brush_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, brush_rotation);
		} else {
			__io__block.writeFloat(__io__address + 52, brush_rotation);
		}
	}

	/**
	 * Get method for struct member 'draw_anchored'.
	 * @see #__DNA__FIELD__draw_anchored
	 */
	
	public int getDraw_anchored() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'draw_anchored'.
	 * @see #__DNA__FIELD__draw_anchored
	 */
	
	public void setDraw_anchored(int draw_anchored) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, draw_anchored);
		} else {
			__io__block.writeInt(__io__address + 56, draw_anchored);
		}
	}

	/**
	 * Get method for struct member 'anchored_size'.
	 * @see #__DNA__FIELD__anchored_size
	 */
	
	public int getAnchored_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'anchored_size'.
	 * @see #__DNA__FIELD__anchored_size
	 */
	
	public void setAnchored_size(int anchored_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, anchored_size);
		} else {
			__io__block.writeInt(__io__address + 60, anchored_size);
		}
	}

	/**
	 * Get method for struct member 'draw_inverted'.
	 * @see #__DNA__FIELD__draw_inverted
	 */
	
	public byte getDraw_inverted() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 64);
		} else {
			return __io__block.readByte(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'draw_inverted'.
	 * @see #__DNA__FIELD__draw_inverted
	 */
	
	public void setDraw_inverted(byte draw_inverted) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 64, draw_inverted);
		} else {
			__io__block.writeByte(__io__address + 64, draw_inverted);
		}
	}

	/**
	 * Get method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public CArrayFacade<Byte> getPad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 65, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 65, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public void setPad3(CArrayFacade<Byte> pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 65;
		} else {
			__dna__offset = 65;
		}
		if (__io__equals(pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad3);
		} else {
			__io__generic__copy( getPad3(), pad3);
		}
	}

	/**
	 * Get method for struct member 'overlap_factor'.
	 * @see #__DNA__FIELD__overlap_factor
	 */
	
	public float getOverlap_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'overlap_factor'.
	 * @see #__DNA__FIELD__overlap_factor
	 */
	
	public void setOverlap_factor(float overlap_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, overlap_factor);
		} else {
			__io__block.writeFloat(__io__address + 72, overlap_factor);
		}
	}

	/**
	 * Get method for struct member 'anchored_initial_mouse'.
	 * @see #__DNA__FIELD__anchored_initial_mouse
	 */
	
	public CArrayFacade<Float> getAnchored_initial_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anchored_initial_mouse'.
	 * @see #__DNA__FIELD__anchored_initial_mouse
	 */
	
	public void setAnchored_initial_mouse(CArrayFacade<Float> anchored_initial_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(anchored_initial_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anchored_initial_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anchored_initial_mouse);
		} else {
			__io__generic__copy( getAnchored_initial_mouse(), anchored_initial_mouse);
		}
	}

	/**
	 * Get method for struct member 'stroke_active'.
	 * @see #__DNA__FIELD__stroke_active
	 */
	
	public int getStroke_active() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'stroke_active'.
	 * @see #__DNA__FIELD__stroke_active
	 */
	
	public void setStroke_active(int stroke_active) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, stroke_active);
		} else {
			__io__block.writeInt(__io__address + 84, stroke_active);
		}
	}

	/**
	 * Get method for struct member 'size_pressure_value'.
	 * @see #__DNA__FIELD__size_pressure_value
	 */
	
	public float getSize_pressure_value() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'size_pressure_value'.
	 * @see #__DNA__FIELD__size_pressure_value
	 */
	
	public void setSize_pressure_value(float size_pressure_value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, size_pressure_value);
		} else {
			__io__block.writeFloat(__io__address + 88, size_pressure_value);
		}
	}

	/**
	 * Get method for struct member 'tex_mouse'.
	 * @see #__DNA__FIELD__tex_mouse
	 */
	
	public CArrayFacade<Float> getTex_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tex_mouse'.
	 * @see #__DNA__FIELD__tex_mouse
	 */
	
	public void setTex_mouse(CArrayFacade<Float> tex_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 92;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(tex_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tex_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tex_mouse);
		} else {
			__io__generic__copy( getTex_mouse(), tex_mouse);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_mouse'.
	 * @see #__DNA__FIELD__mask_tex_mouse
	 */
	
	public CArrayFacade<Float> getMask_tex_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_mouse'.
	 * @see #__DNA__FIELD__mask_tex_mouse
	 */
	
	public void setMask_tex_mouse(CArrayFacade<Float> mask_tex_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(mask_tex_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_tex_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_tex_mouse);
		} else {
			__io__generic__copy( getMask_tex_mouse(), mask_tex_mouse);
		}
	}

	/**
	 * Get method for struct member 'do_linear_conversion'.
	 * @see #__DNA__FIELD__do_linear_conversion
	 */
	
	public int getDo_linear_conversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'do_linear_conversion'.
	 * @see #__DNA__FIELD__do_linear_conversion
	 */
	
	public void setDo_linear_conversion(int do_linear_conversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, do_linear_conversion);
		} else {
			__io__block.writeInt(__io__address + 108, do_linear_conversion);
		}
	}

	/**
	 * Get method for struct member 'colorspace'.
	 * @see #__DNA__FIELD__colorspace
	 */
	
	public CPointer<Object> getColorspace() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'colorspace'.
	 * @see #__DNA__FIELD__colorspace
	 */
	
	public void setColorspace(CPointer<Object> colorspace) throws IOException
	{
		long __address = ((colorspace == null) ? 0 : colorspace.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'pixel_radius'.
	 * @see #__DNA__FIELD__pixel_radius
	 */
	
	public float getPixel_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'pixel_radius'.
	 * @see #__DNA__FIELD__pixel_radius
	 */
	
	public void setPixel_radius(float pixel_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, pixel_radius);
		} else {
			__io__block.writeFloat(__io__address + 116, pixel_radius);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public int getPad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(int pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, pad4);
		} else {
			__io__block.writeInt(__io__address + 120, pad4);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UnifiedPaintSettings> __io__addressof() {
		return new CPointer<UnifiedPaintSettings>(__io__address, new Class[]{UnifiedPaintSettings.class}, __io__block, __io__blockTable);
	}

}
