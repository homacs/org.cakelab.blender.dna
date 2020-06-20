package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BrushGpencilSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=152, size64=168)
public class BrushGpencilSettings extends CFacade {

	/**
	 * This is the sdna index of the struct BrushGpencilSettings.
	 * <p>
	 * It is required when allocating a new block to store data for BrushGpencilSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 449;

	/**
	 * Field descriptor (offset) for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of smoothing to apply to newly created strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_smoothfac);
	 * CPointer&lt;Float&gt; p_draw_smoothfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_smoothfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_smoothfac = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of alpha strength to apply to newly created strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_strength);
	 * CPointer&lt;Float&gt; p_draw_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_strength = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of jitter to apply to newly created strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_jitter);
	 * CPointer&lt;Float&gt; p_draw_jitter = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_jitter'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_jitter = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle when the brush has full thickness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_angle);
	 * CPointer&lt;Float&gt; p_draw_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_angle = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply when angle change (only 90 degrees). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_angle_factor);
	 * CPointer&lt;Float&gt; p_draw_angle_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_angle_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_angle_factor = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of randomness for pressure. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_random_press);
	 * CPointer&lt;Float&gt; p_draw_random_press = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_random_press'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_random_press = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'draw_random_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of strength for strength. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_random_strength);
	 * CPointer&lt;Float&gt; p_draw_random_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_random_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_random_strength = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to apply smooth factor to new strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_smoothlvl);
	 * CPointer&lt;Short&gt; p_draw_smoothlvl = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_smoothlvl'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_smoothlvl = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'draw_subdivide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to subdivide new strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__draw_subdivide);
	 * CPointer&lt;Short&gt; p_draw_subdivide = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_subdivide'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_subdivide = new long[]{34, 34};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold to consider color transparent for filling<h4>Blender Source Code:</h4>
	 * <p> Factor for transparency. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__fill_threshold);
	 * CPointer&lt;Float&gt; p_fill_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_threshold = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'fill_leak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size in pixels to consider the leak closed<h4>Blender Source Code:</h4>
	 * <p> Number of pixel to consider the leak is too small (x 2). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__fill_leak);
	 * CPointer&lt;Short&gt; p_fill_leak = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_leak'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_leak = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'fill_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for fill resolution, higher resolution is more accurate but slower<h4>Blender Source Code:</h4>
	 * <p> Fill zoom factor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__fill_factor);
	 * CPointer&lt;Short&gt; p_fill_factor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_factor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_factor = new long[]{46, 46};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'fill_simplylvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of simplify steps. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__fill_simplylvl);
	 * CPointer&lt;Integer&gt; p_fill_simplylvl = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_simplylvl'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_simplylvl = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'fill_draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to draw boundary limits<h4>Blender Source Code:</h4>
	 * <p> Type of control lines drawing mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__fill_draw_mode);
	 * CPointer&lt;Integer&gt; p_fill_draw_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_draw_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_draw_mode = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon identifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__icon_id);
	 * CPointer&lt;Integer&gt; p_icon_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_id = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Generate intermediate points for very fast mouse movements. Set to 0 to disable<h4>Blender Source Code:</h4>
	 * <p> Maximum distance before generate new point for very fast mouse movements. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__input_samples);
	 * CPointer&lt;Integer&gt; p_input_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_samples = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'uv_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random factor for autogenerated UV rotation<h4>Blender Source Code:</h4>
	 * <p> Random factor for UV rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__uv_random);
	 * CPointer&lt;Float&gt; p_uv_random = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_random'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_random = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'brush_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Moved to '{@link Brush.gpencil_tool} '. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__brush_type);
	 * CPointer&lt;Integer&gt; p_brush_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_type = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'eraser_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Eraser Mode<h4>Blender Source Code:</h4>
	 * <p> Soft, hard or stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__eraser_mode);
	 * CPointer&lt;Integer&gt; p_eraser_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eraser_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eraser_mode = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'active_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Smooth while drawing factor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__active_smooth);
	 * CPointer&lt;Float&gt; p_active_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_smooth = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'era_strength_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to strength for soft eraser. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__era_strength_f);
	 * CPointer&lt;Float&gt; p_era_strength_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'era_strength_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__era_strength_f = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'era_thickness_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to thickness for soft eraser. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__era_thickness_f);
	 * CPointer&lt;Float&gt; p_era_thickness_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'era_thickness_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__era_thickness_f = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal grease pencil drawing flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'gradient_f'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__gradient_f);
	 * CPointer&lt;Float&gt; p_gradient_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_f = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'gradient_s'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__gradient_s);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gradient_s = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_s'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_s = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'simplify_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Simplify adaptive factor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__simplify_f);
	 * CPointer&lt;Float&gt; p_simplify_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_f = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'vertex_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix colorfactor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__vertex_factor);
	 * CPointer&lt;Float&gt; p_vertex_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_factor = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'vertex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how vertex color affect to the strokes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__vertex_mode);
	 * CPointer&lt;Integer&gt; p_vertex_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_mode = new long[]{116, 116};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__sculpt_flag);
	 * CPointer&lt;Integer&gt; p_sculpt_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_flag = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Mode_Flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__sculpt_mode_flag);
	 * CPointer&lt;Integer&gt; p_sculpt_mode_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_mode_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_mode_flag = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'preset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preset type (used to reset brushes - internal). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__preset_type);
	 * CPointer&lt;Short&gt; p_preset_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preset_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preset_type = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{130, 130};

	/**
	 * Field descriptor (offset) for struct member 'curve_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the sensitivity
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__curve_sensitivity);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve_sensitivity = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_sensitivity'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_sensitivity = new long[]{136, 136};

	/**
	 * Field descriptor (offset) for struct member 'curve_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the strength
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__curve_strength);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve_strength = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_strength'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_strength = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'curve_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the jitter effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__curve_jitter);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve_jitter = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_jitter'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_jitter = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Material used for strokes drawn using this brush<h4>Blender Source Code:</h4>
	 * <p> optional link of material to replace default in context {@link Material} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrushGpencilSettings brushgpencilsettings = ...;
	 * CPointer&lt;Object&gt; p = brushgpencilsettings.__dna__addressof(BrushGpencilSettings.__DNA__FIELD__material);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_material = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'material'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__material = new long[]{148, 160};

	public BrushGpencilSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BrushGpencilSettings(BrushGpencilSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of smoothing to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_smoothfac
	 */
	
	public float getDraw_smoothfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of smoothing to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_smoothfac
	 */
	
	public void setDraw_smoothfac(float draw_smoothfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, draw_smoothfac);
		} else {
			__io__block.writeFloat(__io__address + 0, draw_smoothfac);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of alpha strength to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_strength
	 */
	
	public float getDraw_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of alpha strength to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_strength
	 */
	
	public void setDraw_strength(float draw_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, draw_strength);
		} else {
			__io__block.writeFloat(__io__address + 8, draw_strength);
		}
	}

	/**
	 * Get method for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of jitter to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_jitter
	 */
	
	public float getDraw_jitter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of jitter to apply to newly created strokes. </p>
	 * @see #__DNA__FIELD__draw_jitter
	 */
	
	public void setDraw_jitter(float draw_jitter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, draw_jitter);
		} else {
			__io__block.writeFloat(__io__address + 12, draw_jitter);
		}
	}

	/**
	 * Get method for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle when the brush has full thickness. </p>
	 * @see #__DNA__FIELD__draw_angle
	 */
	
	public float getDraw_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle when the brush has full thickness. </p>
	 * @see #__DNA__FIELD__draw_angle
	 */
	
	public void setDraw_angle(float draw_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, draw_angle);
		} else {
			__io__block.writeFloat(__io__address + 16, draw_angle);
		}
	}

	/**
	 * Get method for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply when angle change (only 90 degrees). </p>
	 * @see #__DNA__FIELD__draw_angle_factor
	 */
	
	public float getDraw_angle_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply when angle change (only 90 degrees). </p>
	 * @see #__DNA__FIELD__draw_angle_factor
	 */
	
	public void setDraw_angle_factor(float draw_angle_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, draw_angle_factor);
		} else {
			__io__block.writeFloat(__io__address + 20, draw_angle_factor);
		}
	}

	/**
	 * Get method for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of randomness for pressure. </p>
	 * @see #__DNA__FIELD__draw_random_press
	 */
	
	public float getDraw_random_press() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of randomness for pressure. </p>
	 * @see #__DNA__FIELD__draw_random_press
	 */
	
	public void setDraw_random_press(float draw_random_press) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, draw_random_press);
		} else {
			__io__block.writeFloat(__io__address + 24, draw_random_press);
		}
	}

	/**
	 * Get method for struct member 'draw_random_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of strength for strength. </p>
	 * @see #__DNA__FIELD__draw_random_strength
	 */
	
	public float getDraw_random_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'draw_random_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of strength for strength. </p>
	 * @see #__DNA__FIELD__draw_random_strength
	 */
	
	public void setDraw_random_strength(float draw_random_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, draw_random_strength);
		} else {
			__io__block.writeFloat(__io__address + 28, draw_random_strength);
		}
	}

	/**
	 * Get method for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to apply smooth factor to new strokes. </p>
	 * @see #__DNA__FIELD__draw_smoothlvl
	 */
	
	public short getDraw_smoothlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 32);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to apply smooth factor to new strokes. </p>
	 * @see #__DNA__FIELD__draw_smoothlvl
	 */
	
	public void setDraw_smoothlvl(short draw_smoothlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 32, draw_smoothlvl);
		} else {
			__io__block.writeShort(__io__address + 32, draw_smoothlvl);
		}
	}

	/**
	 * Get method for struct member 'draw_subdivide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to subdivide new strokes. </p>
	 * @see #__DNA__FIELD__draw_subdivide
	 */
	
	public short getDraw_subdivide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 34);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'draw_subdivide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of times to subdivide new strokes. </p>
	 * @see #__DNA__FIELD__draw_subdivide
	 */
	
	public void setDraw_subdivide(short draw_subdivide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 34, draw_subdivide);
		} else {
			__io__block.writeShort(__io__address + 34, draw_subdivide);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
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
	 * Get method for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold to consider color transparent for filling<h4>Blender Source Code:</h4>
	 * <p> Factor for transparency. </p>
	 * @see #__DNA__FIELD__fill_threshold
	 */
	
	public float getFill_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold to consider color transparent for filling<h4>Blender Source Code:</h4>
	 * <p> Factor for transparency. </p>
	 * @see #__DNA__FIELD__fill_threshold
	 */
	
	public void setFill_threshold(float fill_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, fill_threshold);
		} else {
			__io__block.writeFloat(__io__address + 40, fill_threshold);
		}
	}

	/**
	 * Get method for struct member 'fill_leak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size in pixels to consider the leak closed<h4>Blender Source Code:</h4>
	 * <p> Number of pixel to consider the leak is too small (x 2). </p>
	 * @see #__DNA__FIELD__fill_leak
	 */
	
	public short getFill_leak() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'fill_leak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size in pixels to consider the leak closed<h4>Blender Source Code:</h4>
	 * <p> Number of pixel to consider the leak is too small (x 2). </p>
	 * @see #__DNA__FIELD__fill_leak
	 */
	
	public void setFill_leak(short fill_leak) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, fill_leak);
		} else {
			__io__block.writeShort(__io__address + 44, fill_leak);
		}
	}

	/**
	 * Get method for struct member 'fill_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for fill resolution, higher resolution is more accurate but slower<h4>Blender Source Code:</h4>
	 * <p> Fill zoom factor </p>
	 * @see #__DNA__FIELD__fill_factor
	 */
	
	public short getFill_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'fill_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for fill resolution, higher resolution is more accurate but slower<h4>Blender Source Code:</h4>
	 * <p> Fill zoom factor </p>
	 * @see #__DNA__FIELD__fill_factor
	 */
	
	public void setFill_factor(short fill_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, fill_factor);
		} else {
			__io__block.writeShort(__io__address + 46, fill_factor);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'fill_simplylvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of simplify steps. </p>
	 * @see #__DNA__FIELD__fill_simplylvl
	 */
	
	public int getFill_simplylvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'fill_simplylvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of simplify steps. </p>
	 * @see #__DNA__FIELD__fill_simplylvl
	 */
	
	public void setFill_simplylvl(int fill_simplylvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, fill_simplylvl);
		} else {
			__io__block.writeInt(__io__address + 52, fill_simplylvl);
		}
	}

	/**
	 * Get method for struct member 'fill_draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to draw boundary limits<h4>Blender Source Code:</h4>
	 * <p> Type of control lines drawing mode. </p>
	 * @see #__DNA__FIELD__fill_draw_mode
	 */
	
	public int getFill_draw_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'fill_draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to draw boundary limits<h4>Blender Source Code:</h4>
	 * <p> Type of control lines drawing mode. </p>
	 * @see #__DNA__FIELD__fill_draw_mode
	 */
	
	public void setFill_draw_mode(int fill_draw_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, fill_draw_mode);
		} else {
			__io__block.writeInt(__io__address + 56, fill_draw_mode);
		}
	}

	/**
	 * Get method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon identifier. </p>
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public int getIcon_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon identifier. </p>
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public void setIcon_id(int icon_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, icon_id);
		} else {
			__io__block.writeInt(__io__address + 60, icon_id);
		}
	}

	/**
	 * Get method for struct member 'input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Generate intermediate points for very fast mouse movements. Set to 0 to disable<h4>Blender Source Code:</h4>
	 * <p> Maximum distance before generate new point for very fast mouse movements. </p>
	 * @see #__DNA__FIELD__input_samples
	 */
	
	public int getInput_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Generate intermediate points for very fast mouse movements. Set to 0 to disable<h4>Blender Source Code:</h4>
	 * <p> Maximum distance before generate new point for very fast mouse movements. </p>
	 * @see #__DNA__FIELD__input_samples
	 */
	
	public void setInput_samples(int input_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, input_samples);
		} else {
			__io__block.writeInt(__io__address + 64, input_samples);
		}
	}

	/**
	 * Get method for struct member 'uv_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random factor for autogenerated UV rotation<h4>Blender Source Code:</h4>
	 * <p> Random factor for UV rotation. </p>
	 * @see #__DNA__FIELD__uv_random
	 */
	
	public float getUv_random() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'uv_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random factor for autogenerated UV rotation<h4>Blender Source Code:</h4>
	 * <p> Random factor for UV rotation. </p>
	 * @see #__DNA__FIELD__uv_random
	 */
	
	public void setUv_random(float uv_random) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, uv_random);
		} else {
			__io__block.writeFloat(__io__address + 68, uv_random);
		}
	}

	/**
	 * Get method for struct member 'brush_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Moved to '{@link Brush.gpencil_tool} '. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__brush_type
	 */
	
	public int getBrush_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'brush_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Moved to '{@link Brush.gpencil_tool} '. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__brush_type
	 */
	
	public void setBrush_type(int brush_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, brush_type);
		} else {
			__io__block.writeInt(__io__address + 72, brush_type);
		}
	}

	/**
	 * Get method for struct member 'eraser_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Eraser Mode<h4>Blender Source Code:</h4>
	 * <p> Soft, hard or stroke. </p>
	 * @see #__DNA__FIELD__eraser_mode
	 */
	
	public int getEraser_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'eraser_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Eraser Mode<h4>Blender Source Code:</h4>
	 * <p> Soft, hard or stroke. </p>
	 * @see #__DNA__FIELD__eraser_mode
	 */
	
	public void setEraser_mode(int eraser_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, eraser_mode);
		} else {
			__io__block.writeInt(__io__address + 76, eraser_mode);
		}
	}

	/**
	 * Get method for struct member 'active_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Smooth while drawing factor. </p>
	 * @see #__DNA__FIELD__active_smooth
	 */
	
	public float getActive_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'active_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Smooth while drawing factor. </p>
	 * @see #__DNA__FIELD__active_smooth
	 */
	
	public void setActive_smooth(float active_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, active_smooth);
		} else {
			__io__block.writeFloat(__io__address + 80, active_smooth);
		}
	}

	/**
	 * Get method for struct member 'era_strength_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to strength for soft eraser. </p>
	 * @see #__DNA__FIELD__era_strength_f
	 */
	
	public float getEra_strength_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'era_strength_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to strength for soft eraser. </p>
	 * @see #__DNA__FIELD__era_strength_f
	 */
	
	public void setEra_strength_f(float era_strength_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, era_strength_f);
		} else {
			__io__block.writeFloat(__io__address + 84, era_strength_f);
		}
	}

	/**
	 * Get method for struct member 'era_thickness_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to thickness for soft eraser. </p>
	 * @see #__DNA__FIELD__era_thickness_f
	 */
	
	public float getEra_thickness_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'era_thickness_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to apply to thickness for soft eraser. </p>
	 * @see #__DNA__FIELD__era_thickness_f
	 */
	
	public void setEra_thickness_f(float era_thickness_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, era_thickness_f);
		} else {
			__io__block.writeFloat(__io__address + 88, era_thickness_f);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal grease pencil drawing flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal grease pencil drawing flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, flag);
		} else {
			__io__block.writeInt(__io__address + 92, flag);
		}
	}

	/**
	 * Get method for struct member 'gradient_f'.
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public float getGradient_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'gradient_f'.
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public void setGradient_f(float gradient_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, gradient_f);
		} else {
			__io__block.writeFloat(__io__address + 96, gradient_f);
		}
	}

	/**
	 * Get method for struct member 'gradient_s'.
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public CArrayFacade<Float> getGradient_s() throws IOException
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
	 * Set method for struct member 'gradient_s'.
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public void setGradient_s(CArrayFacade<Float> gradient_s) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(gradient_s, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient_s)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient_s);
		} else {
			__io__generic__copy( getGradient_s(), gradient_s);
		}
	}

	/**
	 * Get method for struct member 'simplify_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Simplify adaptive factor </p>
	 * @see #__DNA__FIELD__simplify_f
	 */
	
	public float getSimplify_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'simplify_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Simplify adaptive factor </p>
	 * @see #__DNA__FIELD__simplify_f
	 */
	
	public void setSimplify_f(float simplify_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, simplify_f);
		} else {
			__io__block.writeFloat(__io__address + 108, simplify_f);
		}
	}

	/**
	 * Get method for struct member 'vertex_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix colorfactor </p>
	 * @see #__DNA__FIELD__vertex_factor
	 */
	
	public float getVertex_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'vertex_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix colorfactor </p>
	 * @see #__DNA__FIELD__vertex_factor
	 */
	
	public void setVertex_factor(float vertex_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, vertex_factor);
		} else {
			__io__block.writeFloat(__io__address + 112, vertex_factor);
		}
	}

	/**
	 * Get method for struct member 'vertex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how vertex color affect to the strokes
	 * @see #__DNA__FIELD__vertex_mode
	 */
	
	public int getVertex_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'vertex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how vertex color affect to the strokes
	 * @see #__DNA__FIELD__vertex_mode
	 */
	
	public void setVertex_mode(int vertex_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, vertex_mode);
		} else {
			__io__block.writeInt(__io__address + 116, vertex_mode);
		}
	}

	/**
	 * Get method for struct member 'sculpt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Flag. </p>
	 * @see #__DNA__FIELD__sculpt_flag
	 */
	
	public int getSculpt_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'sculpt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Flag. </p>
	 * @see #__DNA__FIELD__sculpt_flag
	 */
	
	public void setSculpt_flag(int sculpt_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, sculpt_flag);
		} else {
			__io__block.writeInt(__io__address + 120, sculpt_flag);
		}
	}

	/**
	 * Get method for struct member 'sculpt_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Mode_Flag. </p>
	 * @see #__DNA__FIELD__sculpt_mode_flag
	 */
	
	public int getSculpt_mode_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'sculpt_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_Sculpt_Mode_Flag. </p>
	 * @see #__DNA__FIELD__sculpt_mode_flag
	 */
	
	public void setSculpt_mode_flag(int sculpt_mode_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, sculpt_mode_flag);
		} else {
			__io__block.writeInt(__io__address + 124, sculpt_mode_flag);
		}
	}

	/**
	 * Get method for struct member 'preset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preset type (used to reset brushes - internal). </p>
	 * @see #__DNA__FIELD__preset_type
	 */
	
	public short getPreset_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'preset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preset type (used to reset brushes - internal). </p>
	 * @see #__DNA__FIELD__preset_type
	 */
	
	public void setPreset_type(short preset_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, preset_type);
		} else {
			__io__block.writeShort(__io__address + 128, preset_type);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 130, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 130, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 130;
		} else {
			__dna__offset = 130;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'curve_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the sensitivity
	 * @see #__DNA__FIELD__curve_sensitivity
	 */
	
	public CPointer<CurveMapping> getCurve_sensitivity() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the sensitivity
	 * @see #__DNA__FIELD__curve_sensitivity
	 */
	
	public void setCurve_sensitivity(CPointer<CurveMapping> curve_sensitivity) throws IOException
	{
		long __address = ((curve_sensitivity == null) ? 0 : curve_sensitivity.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the strength
	 * @see #__DNA__FIELD__curve_strength
	 */
	
	public CPointer<CurveMapping> getCurve_strength() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the strength
	 * @see #__DNA__FIELD__curve_strength
	 */
	
	public void setCurve_strength(CPointer<CurveMapping> curve_strength) throws IOException
	{
		long __address = ((curve_strength == null) ? 0 : curve_strength.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the jitter effect
	 * @see #__DNA__FIELD__curve_jitter
	 */
	
	public CPointer<CurveMapping> getCurve_jitter() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the jitter effect
	 * @see #__DNA__FIELD__curve_jitter
	 */
	
	public void setCurve_jitter(CPointer<CurveMapping> curve_jitter) throws IOException
	{
		long __address = ((curve_jitter == null) ? 0 : curve_jitter.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Material used for strokes drawn using this brush<h4>Blender Source Code:</h4>
	 * <p> optional link of material to replace default in context {@link Material} . </p>
	 * @see #__DNA__FIELD__material
	 */
	
	public CPointer<Material> getMaterial() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Material.class};
		return new CPointer<Material>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Material.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Material used for strokes drawn using this brush<h4>Blender Source Code:</h4>
	 * <p> optional link of material to replace default in context {@link Material} . </p>
	 * @see #__DNA__FIELD__material
	 */
	
	public void setMaterial(CPointer<Material> material) throws IOException
	{
		long __address = ((material == null) ? 0 : material.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BrushGpencilSettings> __io__addressof() {
		return new CPointer<BrushGpencilSettings>(__io__address, new Class[]{BrushGpencilSettings.class}, __io__block, __io__blockTable);
	}

}
