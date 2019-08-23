package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Brush'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2040, size64=2120)
public class Brush extends CFacade {

	/**
	 * This is the sdna index of the struct Brush.
	 * <p>
	 * It is required when allocating a new block to store data for Brush.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 439;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'clone'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__clone);
	 * CPointer&lt;BrushClone&gt; p_clone = p.cast(new Class[]{BrushClone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clone'</li>
	 * <li>Signature: 'BrushClone'</li>
	 * <li>Actual Size (32bit/64bit): 20/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clone = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable falloff curve<h4>Blender Source Code:</h4>
	 * <p> Falloff curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mtex);
	 * CPointer&lt;MTex&gt; p_mtex = p.cast(new Class[]{MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex'</li>
	 * <li>Actual Size (32bit/64bit): 312/320</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{144, 184};

	/**
	 * Field descriptor (offset) for struct member 'mask_mtex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_mtex);
	 * CPointer&lt;MTex&gt; p_mask_mtex = p.cast(new Class[]{MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_mtex'</li>
	 * <li>Signature: 'MTex'</li>
	 * <li>Actual Size (32bit/64bit): 312/320</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_mtex = new long[]{456, 504};

	/**
	 * Field descriptor (offset) for struct member 'toggle_brush'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__toggle_brush);
	 * CPointer&lt;CPointer&lt;Brush&gt;&gt; p_toggle_brush = p.cast(new Class[]{CPointer.class, Brush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toggle_brush'</li>
	 * <li>Signature: 'Brush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toggle_brush = new long[]{768, 824};

	/**
	 * Field descriptor (offset) for struct member 'icon_imbuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__icon_imbuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_icon_imbuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_imbuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_imbuf = new long[]{772, 832};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{776, 840};

	/**
	 * Field descriptor (offset) for struct member 'gradient'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Color gradient. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gradient);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_gradient = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient = new long[]{780, 848};

	/**
	 * Field descriptor (offset) for struct member 'paint_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Paint Curve
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__paint_curve);
	 * CPointer&lt;CPointer&lt;PaintCurve&gt;&gt; p_paint_curve = p.cast(new Class[]{CPointer.class, PaintCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_curve'</li>
	 * <li>Signature: 'PaintCurve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_curve = new long[]{784, 856};

	/**
	 * Field descriptor (offset) for struct member 'icon_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * File path to brush icon<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__icon_filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_filepath = new long[]{788, 864};

	/**
	 * Field descriptor (offset) for struct member 'normal_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will pull vertexes out of surface during a grab
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__normal_weight);
	 * CPointer&lt;Float&gt; p_normal_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_weight = new long[]{1812, 1888};

	/**
	 * Field descriptor (offset) for struct member 'rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will follow cursor rotation<h4>Blender Source Code:</h4>
	 * <p> Rake actual data (not texture), used for sculpt. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__rake_factor);
	 * CPointer&lt;Float&gt; p_rake_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rake_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rake_factor = new long[]{1816, 1892};

	/**
	 * Field descriptor (offset) for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brush blending mode<h4>Blender Source Code:</h4>
	 * <p> Blend mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__blend);
	 * CPointer&lt;Short&gt; p_blend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend = new long[]{1820, 1896};

	/**
	 * Field descriptor (offset) for struct member 'ob_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eObjectMode} : to see if the brush is compatible, use for display only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__ob_mode);
	 * CPointer&lt;Short&gt; p_ob_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_mode = new long[]{1822, 1898};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex weight when brush is applied<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  weight. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{1824, 1900};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  diameter. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__size);
	 * CPointer&lt;Integer&gt; p_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{1828, 1904};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1832, 1908};

	/**
	 * Field descriptor (offset) for struct member 'mask_pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure influence for mask. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_pressure);
	 * CPointer&lt;Integer&gt; p_mask_pressure = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_pressure'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_pressure = new long[]{1836, 1912};

	/**
	 * Field descriptor (offset) for struct member 'jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush while painting<h4>Blender Source Code:</h4>
	 * <p> Jitter the position of the brush. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__jitter);
	 * CPointer&lt;Float&gt; p_jitter = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jitter'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jitter = new long[]{1840, 1916};

	/**
	 * Field descriptor (offset) for struct member 'jitter_absolute'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush in pixels while painting<h4>Blender Source Code:</h4>
	 * <p> Absolute jitter in pixels. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__jitter_absolute);
	 * CPointer&lt;Integer&gt; p_jitter_absolute = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jitter_absolute'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jitter_absolute = new long[]{1844, 1920};

	/**
	 * Field descriptor (offset) for struct member 'overlay_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__overlay_flags);
	 * CPointer&lt;Integer&gt; p_overlay_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlay_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlay_flags = new long[]{1848, 1924};

	/**
	 * Field descriptor (offset) for struct member 'spacing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spacing between brush daubs as a percentage of brush diameter<h4>Blender Source Code:</h4>
	 * <p> Spacing of paint operations. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__spacing);
	 * CPointer&lt;Integer&gt; p_spacing = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacing'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacing = new long[]{1852, 1928};

	/**
	 * Field descriptor (offset) for struct member 'smooth_stroke_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum distance from last point before stroke continues<h4>Blender Source Code:</h4>
	 * <p> Turning radius (in pixels) for smooth stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__smooth_stroke_radius);
	 * CPointer&lt;Integer&gt; p_smooth_stroke_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_stroke_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_stroke_radius = new long[]{1856, 1932};

	/**
	 * Field descriptor (offset) for struct member 'smooth_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Higher values give a smoother stroke<h4>Blender Source Code:</h4>
	 * <p> Higher values limit fast changes in the stroke direction. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__smooth_stroke_factor);
	 * CPointer&lt;Float&gt; p_smooth_stroke_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_stroke_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_stroke_factor = new long[]{1860, 1936};

	/**
	 * Field descriptor (offset) for struct member 'rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval between paints for Airbrush<h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  operations / second (airbrush). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__rate);
	 * CPointer&lt;Float&gt; p_rate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rate = new long[]{1864, 1940};

	/**
	 * Field descriptor (offset) for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgb = new long[]{1868, 1944};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{1880, 1956};

	/**
	 * Field descriptor (offset) for struct member 'secondary_rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Background color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__secondary_rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_secondary_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'secondary_rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__secondary_rgb = new long[]{1884, 1960};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The direction of movement for sculpt vertices. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__sculpt_plane);
	 * CPointer&lt;Integer&gt; p_sculpt_plane = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_plane'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_plane = new long[]{1896, 1972};

	/**
	 * Field descriptor (offset) for struct member 'plane_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust plane on which the brush acts towards or away from the object surface<h4>Blender Source Code:</h4>
	 * <p> Offset for plane brushes (clay, flatten, fill, scrape). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__plane_offset);
	 * CPointer&lt;Float&gt; p_plane_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plane_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plane_offset = new long[]{1900, 1976};

	/**
	 * Field descriptor (offset) for struct member 'gradient_spacing'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gradient_spacing);
	 * CPointer&lt;Integer&gt; p_gradient_spacing = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_spacing'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_spacing = new long[]{1904, 1980};

	/**
	 * Field descriptor (offset) for struct member 'gradient_stroke_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for stroke color gradient application. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gradient_stroke_mode);
	 * CPointer&lt;Byte&gt; p_gradient_stroke_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_stroke_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_stroke_mode = new long[]{1908, 1984};

	/**
	 * Field descriptor (offset) for struct member 'gradient_fill_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for fill tool color gradient application. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gradient_fill_mode);
	 * CPointer&lt;Byte&gt; p_gradient_fill_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_fill_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_fill_mode = new long[]{1909, 1985};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1910, 1986};

	/**
	 * Field descriptor (offset) for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Projection shape (sphere, circle). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__falloff_shape);
	 * CPointer&lt;Byte&gt; p_falloff_shape = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_shape'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_shape = new long[]{1911, 1987};

	/**
	 * Field descriptor (offset) for struct member 'falloff_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Paint most on faces pointing towards the view according to this angle
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__falloff_angle);
	 * CPointer&lt;Float&gt; p_falloff_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_angle = new long[]{1912, 1988};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__sculpt_tool);
	 * CPointer&lt;Byte&gt; p_sculpt_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_tool = new long[]{1916, 1992};

	/**
	 * Field descriptor (offset) for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__uv_sculpt_tool);
	 * CPointer&lt;Byte&gt; p_uv_sculpt_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_sculpt_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_sculpt_tool = new long[]{1917, 1993};

	/**
	 * Field descriptor (offset) for struct member 'vertexpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active vertex paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__vertexpaint_tool);
	 * CPointer&lt;Byte&gt; p_vertexpaint_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertexpaint_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertexpaint_tool = new long[]{1918, 1994};

	/**
	 * Field descriptor (offset) for struct member 'weightpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active weight paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__weightpaint_tool);
	 * CPointer&lt;Byte&gt; p_weightpaint_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weightpaint_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weightpaint_tool = new long[]{1919, 1995};

	/**
	 * Field descriptor (offset) for struct member 'imagepaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active image paint tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__imagepaint_tool);
	 * CPointer&lt;Byte&gt; p_imagepaint_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imagepaint_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imagepaint_tool = new long[]{1920, 1996};

	/**
	 * Field descriptor (offset) for struct member 'mask_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eBrushMaskTool, only used if sculpt_tool is SCULPT_TOOL_MASK. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_tool);
	 * CPointer&lt;Byte&gt; p_mask_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tool = new long[]{1921, 1997};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Category of the brush<h4>Blender Source Code:</h4>
	 * <p> Active grease pencil tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gpencil_tool);
	 * CPointer&lt;Byte&gt; p_gpencil_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_tool = new long[]{1922, 1998};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{1923, 1999};

	/**
	 * Field descriptor (offset) for struct member 'autosmooth_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__autosmooth_factor);
	 * CPointer&lt;Float&gt; p_autosmooth_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autosmooth_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autosmooth_factor = new long[]{1924, 2000};

	/**
	 * Field descriptor (offset) for struct member 'topology_rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Automatically align edges to the brush direction to generate cleaner topology and define sharp features. Best used on low-poly meshes as it has a performance impact
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__topology_rake_factor);
	 * CPointer&lt;Float&gt; p_topology_rake_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'topology_rake_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__topology_rake_factor = new long[]{1928, 2004};

	/**
	 * Field descriptor (offset) for struct member 'crease_pinch_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the crease brush pinches
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__crease_pinch_factor);
	 * CPointer&lt;Float&gt; p_crease_pinch_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_pinch_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_pinch_factor = new long[]{1932, 2008};

	/**
	 * Field descriptor (offset) for struct member 'plane_trim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If a vertex is further away from offset plane than this, then it is not affected
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__plane_trim);
	 * CPointer&lt;Float&gt; p_plane_trim = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plane_trim'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plane_trim = new long[]{1936, 2012};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Affectable height of brush (layer height for layer tool, i.e.)<h4>Blender Source Code:</h4>
	 * <p> Affectable height of brush (layer height for layer tool, i.e.). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__height);
	 * CPointer&lt;Float&gt; p_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{1940, 2016};

	/**
	 * Field descriptor (offset) for struct member 'texture_sample_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value added to texture samples
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__texture_sample_bias);
	 * CPointer&lt;Float&gt; p_texture_sample_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_sample_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_sample_bias = new long[]{1944, 2020};

	/**
	 * Field descriptor (offset) for struct member 'texture_overlay_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overlay </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__texture_overlay_alpha);
	 * CPointer&lt;Integer&gt; p_texture_overlay_alpha = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_overlay_alpha'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_overlay_alpha = new long[]{1948, 2024};

	/**
	 * Field descriptor (offset) for struct member 'mask_overlay_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_overlay_alpha);
	 * CPointer&lt;Integer&gt; p_mask_overlay_alpha = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_overlay_alpha'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_overlay_alpha = new long[]{1952, 2028};

	/**
	 * Field descriptor (offset) for struct member 'cursor_overlay_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cursor_overlay_alpha);
	 * CPointer&lt;Integer&gt; p_cursor_overlay_alpha = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor_overlay_alpha'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor_overlay_alpha = new long[]{1956, 2032};

	/**
	 * Field descriptor (offset) for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__unprojected_radius);
	 * CPointer&lt;Float&gt; p_unprojected_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unprojected_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unprojected_radius = new long[]{1960, 2036};

	/**
	 * Field descriptor (offset) for struct member 'sharp_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold below which, no sharpening is done<h4>Blender Source Code:</h4>
	 * <p> soften/sharpen </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__sharp_threshold);
	 * CPointer&lt;Float&gt; p_sharp_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sharp_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sharp_threshold = new long[]{1964, 2040};

	/**
	 * Field descriptor (offset) for struct member 'blur_kernel_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of kernel used for soften and sharpen in pixels
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__blur_kernel_radius);
	 * CPointer&lt;Integer&gt; p_blur_kernel_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur_kernel_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur_kernel_radius = new long[]{1968, 2044};

	/**
	 * Field descriptor (offset) for struct member 'blur_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__blur_mode);
	 * CPointer&lt;Integer&gt; p_blur_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur_mode = new long[]{1972, 2048};

	/**
	 * Field descriptor (offset) for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold above which filling is not propagated<h4>Blender Source Code:</h4>
	 * <p> fill tool </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__fill_threshold);
	 * CPointer&lt;Float&gt; p_fill_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_threshold = new long[]{1976, 2052};

	/**
	 * Field descriptor (offset) for struct member 'add_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__add_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_add_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_col = new long[]{1980, 2056};

	/**
	 * Field descriptor (offset) for struct member 'sub_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__sub_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sub_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sub_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sub_col = new long[]{1992, 2068};

	/**
	 * Field descriptor (offset) for struct member 'stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of stencil in viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__stencil_pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stencil_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stencil_pos'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stencil_pos = new long[]{2004, 2080};

	/**
	 * Field descriptor (offset) for struct member 'stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of stencil in viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__stencil_dimension);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stencil_dimension = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stencil_dimension'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stencil_dimension = new long[]{2012, 2088};

	/**
	 * Field descriptor (offset) for struct member 'mask_stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of mask stencil in viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_stencil_pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mask_stencil_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_stencil_pos'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_stencil_pos = new long[]{2020, 2096};

	/**
	 * Field descriptor (offset) for struct member 'mask_stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of mask stencil in viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__mask_stencil_dimension);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mask_stencil_dimension = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_stencil_dimension'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_stencil_dimension = new long[]{2028, 2104};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gpencil_settings);
	 * CPointer&lt;CPointer&lt;BrushGpencilSettings&gt;&gt; p_gpencil_settings = p.cast(new Class[]{CPointer.class, BrushGpencilSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_settings'</li>
	 * <li>Signature: 'BrushGpencilSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_settings = new long[]{2036, 2112};

	public Brush(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Brush(Brush that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'clone'.
	 * @see #__DNA__FIELD__clone
	 */
	
	public BrushClone getClone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BrushClone(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new BrushClone(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clone'.
	 * @see #__DNA__FIELD__clone
	 */
	
	public void setClone(BrushClone clone) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(clone, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clone)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clone);
		} else {
			__io__generic__copy( getClone(), clone);
		}
	}

	/**
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable falloff curve<h4>Blender Source Code:</h4>
	 * <p> Falloff curve. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public CPointer<CurveMapping> getCurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable falloff curve<h4>Blender Source Code:</h4>
	 * <p> Falloff curve. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(CPointer<CurveMapping> curve) throws IOException
	{
		long __address = ((curve == null) ? 0 : curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * @see #__DNA__FIELD__mtex
	 */
	
	public MTex getMtex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MTex(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new MTex(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(MTex mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mtex);
		} else {
			__io__generic__copy( getMtex(), mtex);
		}
	}

	/**
	 * Get method for struct member 'mask_mtex'.
	 * @see #__DNA__FIELD__mask_mtex
	 */
	
	public MTex getMask_mtex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MTex(__io__address + 504, __io__block, __io__blockTable);
		} else {
			return new MTex(__io__address + 456, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_mtex'.
	 * @see #__DNA__FIELD__mask_mtex
	 */
	
	public void setMask_mtex(MTex mask_mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 504;
		} else {
			__dna__offset = 456;
		}
		if (__io__equals(mask_mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_mtex);
		} else {
			__io__generic__copy( getMask_mtex(), mask_mtex);
		}
	}

	/**
	 * Get method for struct member 'toggle_brush'.
	 * @see #__DNA__FIELD__toggle_brush
	 */
	
	public CPointer<Brush> getToggle_brush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 824);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 768);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'toggle_brush'.
	 * @see #__DNA__FIELD__toggle_brush
	 */
	
	public void setToggle_brush(CPointer<Brush> toggle_brush) throws IOException
	{
		long __address = ((toggle_brush == null) ? 0 : toggle_brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 824, __address);
		} else {
			__io__block.writeLong(__io__address + 768, __address);
		}
	}

	/**
	 * Get method for struct member 'icon_imbuf'.
	 * @see #__DNA__FIELD__icon_imbuf
	 */
	
	public CPointer<Object> getIcon_imbuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 832);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 772);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'icon_imbuf'.
	 * @see #__DNA__FIELD__icon_imbuf
	 */
	
	public void setIcon_imbuf(CPointer<Object> icon_imbuf) throws IOException
	{
		long __address = ((icon_imbuf == null) ? 0 : icon_imbuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 832, __address);
		} else {
			__io__block.writeLong(__io__address + 772, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 840);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 776);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 840, __address);
		} else {
			__io__block.writeLong(__io__address + 776, __address);
		}
	}

	/**
	 * Get method for struct member 'gradient'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Color gradient. </p>
	 * @see #__DNA__FIELD__gradient
	 */
	
	public CPointer<ColorBand> getGradient() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 848);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 780);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gradient'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Color gradient. </p>
	 * @see #__DNA__FIELD__gradient
	 */
	
	public void setGradient(CPointer<ColorBand> gradient) throws IOException
	{
		long __address = ((gradient == null) ? 0 : gradient.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 848, __address);
		} else {
			__io__block.writeLong(__io__address + 780, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Paint Curve
	 * @see #__DNA__FIELD__paint_curve
	 */
	
	public CPointer<PaintCurve> getPaint_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 856);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 784);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PaintCurve.class};
		return new CPointer<PaintCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PaintCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paint_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Paint Curve
	 * @see #__DNA__FIELD__paint_curve
	 */
	
	public void setPaint_curve(CPointer<PaintCurve> paint_curve) throws IOException
	{
		long __address = ((paint_curve == null) ? 0 : paint_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 856, __address);
		} else {
			__io__block.writeLong(__io__address + 784, __address);
		}
	}

	/**
	 * Get method for struct member 'icon_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * File path to brush icon<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__icon_filepath
	 */
	
	public CArrayFacade<Byte> getIcon_filepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 864, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 788, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * File path to brush icon<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__icon_filepath
	 */
	
	public void setIcon_filepath(CArrayFacade<Byte> icon_filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 864;
		} else {
			__dna__offset = 788;
		}
		if (__io__equals(icon_filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_filepath);
		} else {
			__io__generic__copy( getIcon_filepath(), icon_filepath);
		}
	}

	/**
	 * Get method for struct member 'normal_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will pull vertexes out of surface during a grab
	 * @see #__DNA__FIELD__normal_weight
	 */
	
	public float getNormal_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1888);
		} else {
			return __io__block.readFloat(__io__address + 1812);
		}
	}

	/**
	 * Set method for struct member 'normal_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will pull vertexes out of surface during a grab
	 * @see #__DNA__FIELD__normal_weight
	 */
	
	public void setNormal_weight(float normal_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1888, normal_weight);
		} else {
			__io__block.writeFloat(__io__address + 1812, normal_weight);
		}
	}

	/**
	 * Get method for struct member 'rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will follow cursor rotation<h4>Blender Source Code:</h4>
	 * <p> Rake actual data (not texture), used for sculpt. </p>
	 * @see #__DNA__FIELD__rake_factor
	 */
	
	public float getRake_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1892);
		} else {
			return __io__block.readFloat(__io__address + 1816);
		}
	}

	/**
	 * Set method for struct member 'rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much grab will follow cursor rotation<h4>Blender Source Code:</h4>
	 * <p> Rake actual data (not texture), used for sculpt. </p>
	 * @see #__DNA__FIELD__rake_factor
	 */
	
	public void setRake_factor(float rake_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1892, rake_factor);
		} else {
			__io__block.writeFloat(__io__address + 1816, rake_factor);
		}
	}

	/**
	 * Get method for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brush blending mode<h4>Blender Source Code:</h4>
	 * <p> Blend mode. </p>
	 * @see #__DNA__FIELD__blend
	 */
	
	public short getBlend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1896);
		} else {
			return __io__block.readShort(__io__address + 1820);
		}
	}

	/**
	 * Set method for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brush blending mode<h4>Blender Source Code:</h4>
	 * <p> Blend mode. </p>
	 * @see #__DNA__FIELD__blend
	 */
	
	public void setBlend(short blend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1896, blend);
		} else {
			__io__block.writeShort(__io__address + 1820, blend);
		}
	}

	/**
	 * Get method for struct member 'ob_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eObjectMode} : to see if the brush is compatible, use for display only. </p>
	 * @see #__DNA__FIELD__ob_mode
	 */
	
	public short getOb_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1898);
		} else {
			return __io__block.readShort(__io__address + 1822);
		}
	}

	/**
	 * Set method for struct member 'ob_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eObjectMode} : to see if the brush is compatible, use for display only. </p>
	 * @see #__DNA__FIELD__ob_mode
	 */
	
	public void setOb_mode(short ob_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1898, ob_mode);
		} else {
			__io__block.writeShort(__io__address + 1822, ob_mode);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex weight when brush is applied<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1900);
		} else {
			return __io__block.readFloat(__io__address + 1824);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex weight when brush is applied<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1900, weight);
		} else {
			__io__block.writeFloat(__io__address + 1824, weight);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  diameter. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public int getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1904);
		} else {
			return __io__block.readInt(__io__address + 1828);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels<h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  diameter. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(int size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1904, size);
		} else {
			__io__block.writeInt(__io__address + 1828, size);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1908);
		} else {
			return __io__block.readInt(__io__address + 1832);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1908, flag);
		} else {
			__io__block.writeInt(__io__address + 1832, flag);
		}
	}

	/**
	 * Get method for struct member 'mask_pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure influence for mask. </p>
	 * @see #__DNA__FIELD__mask_pressure
	 */
	
	public int getMask_pressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1912);
		} else {
			return __io__block.readInt(__io__address + 1836);
		}
	}

	/**
	 * Set method for struct member 'mask_pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure influence for mask. </p>
	 * @see #__DNA__FIELD__mask_pressure
	 */
	
	public void setMask_pressure(int mask_pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1912, mask_pressure);
		} else {
			__io__block.writeInt(__io__address + 1836, mask_pressure);
		}
	}

	/**
	 * Get method for struct member 'jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush while painting<h4>Blender Source Code:</h4>
	 * <p> Jitter the position of the brush. </p>
	 * @see #__DNA__FIELD__jitter
	 */
	
	public float getJitter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1916);
		} else {
			return __io__block.readFloat(__io__address + 1840);
		}
	}

	/**
	 * Set method for struct member 'jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush while painting<h4>Blender Source Code:</h4>
	 * <p> Jitter the position of the brush. </p>
	 * @see #__DNA__FIELD__jitter
	 */
	
	public void setJitter(float jitter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1916, jitter);
		} else {
			__io__block.writeFloat(__io__address + 1840, jitter);
		}
	}

	/**
	 * Get method for struct member 'jitter_absolute'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush in pixels while painting<h4>Blender Source Code:</h4>
	 * <p> Absolute jitter in pixels. </p>
	 * @see #__DNA__FIELD__jitter_absolute
	 */
	
	public int getJitter_absolute() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1920);
		} else {
			return __io__block.readInt(__io__address + 1844);
		}
	}

	/**
	 * Set method for struct member 'jitter_absolute'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Jitter the position of the brush in pixels while painting<h4>Blender Source Code:</h4>
	 * <p> Absolute jitter in pixels. </p>
	 * @see #__DNA__FIELD__jitter_absolute
	 */
	
	public void setJitter_absolute(int jitter_absolute) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1920, jitter_absolute);
		} else {
			__io__block.writeInt(__io__address + 1844, jitter_absolute);
		}
	}

	/**
	 * Get method for struct member 'overlay_flags'.
	 * @see #__DNA__FIELD__overlay_flags
	 */
	
	public int getOverlay_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1924);
		} else {
			return __io__block.readInt(__io__address + 1848);
		}
	}

	/**
	 * Set method for struct member 'overlay_flags'.
	 * @see #__DNA__FIELD__overlay_flags
	 */
	
	public void setOverlay_flags(int overlay_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1924, overlay_flags);
		} else {
			__io__block.writeInt(__io__address + 1848, overlay_flags);
		}
	}

	/**
	 * Get method for struct member 'spacing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spacing between brush daubs as a percentage of brush diameter<h4>Blender Source Code:</h4>
	 * <p> Spacing of paint operations. </p>
	 * @see #__DNA__FIELD__spacing
	 */
	
	public int getSpacing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1928);
		} else {
			return __io__block.readInt(__io__address + 1852);
		}
	}

	/**
	 * Set method for struct member 'spacing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spacing between brush daubs as a percentage of brush diameter<h4>Blender Source Code:</h4>
	 * <p> Spacing of paint operations. </p>
	 * @see #__DNA__FIELD__spacing
	 */
	
	public void setSpacing(int spacing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1928, spacing);
		} else {
			__io__block.writeInt(__io__address + 1852, spacing);
		}
	}

	/**
	 * Get method for struct member 'smooth_stroke_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum distance from last point before stroke continues<h4>Blender Source Code:</h4>
	 * <p> Turning radius (in pixels) for smooth stroke. </p>
	 * @see #__DNA__FIELD__smooth_stroke_radius
	 */
	
	public int getSmooth_stroke_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1932);
		} else {
			return __io__block.readInt(__io__address + 1856);
		}
	}

	/**
	 * Set method for struct member 'smooth_stroke_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum distance from last point before stroke continues<h4>Blender Source Code:</h4>
	 * <p> Turning radius (in pixels) for smooth stroke. </p>
	 * @see #__DNA__FIELD__smooth_stroke_radius
	 */
	
	public void setSmooth_stroke_radius(int smooth_stroke_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1932, smooth_stroke_radius);
		} else {
			__io__block.writeInt(__io__address + 1856, smooth_stroke_radius);
		}
	}

	/**
	 * Get method for struct member 'smooth_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Higher values give a smoother stroke<h4>Blender Source Code:</h4>
	 * <p> Higher values limit fast changes in the stroke direction. </p>
	 * @see #__DNA__FIELD__smooth_stroke_factor
	 */
	
	public float getSmooth_stroke_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1936);
		} else {
			return __io__block.readFloat(__io__address + 1860);
		}
	}

	/**
	 * Set method for struct member 'smooth_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Higher values give a smoother stroke<h4>Blender Source Code:</h4>
	 * <p> Higher values limit fast changes in the stroke direction. </p>
	 * @see #__DNA__FIELD__smooth_stroke_factor
	 */
	
	public void setSmooth_stroke_factor(float smooth_stroke_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1936, smooth_stroke_factor);
		} else {
			__io__block.writeFloat(__io__address + 1860, smooth_stroke_factor);
		}
	}

	/**
	 * Get method for struct member 'rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval between paints for Airbrush<h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  operations / second (airbrush). </p>
	 * @see #__DNA__FIELD__rate
	 */
	
	public float getRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1940);
		} else {
			return __io__block.readFloat(__io__address + 1864);
		}
	}

	/**
	 * Set method for struct member 'rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval between paints for Airbrush<h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  operations / second (airbrush). </p>
	 * @see #__DNA__FIELD__rate
	 */
	
	public void setRate(float rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1940, rate);
		} else {
			__io__block.writeFloat(__io__address + 1864, rate);
		}
	}

	/**
	 * Get method for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color. </p>
	 * @see #__DNA__FIELD__rgb
	 */
	
	public CArrayFacade<Float> getRgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1944, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1868, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color. </p>
	 * @see #__DNA__FIELD__rgb
	 */
	
	public void setRgb(CArrayFacade<Float> rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1944;
		} else {
			__dna__offset = 1868;
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
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity. </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1956);
		} else {
			return __io__block.readFloat(__io__address + 1880);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity. </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1956, alpha);
		} else {
			__io__block.writeFloat(__io__address + 1880, alpha);
		}
	}

	/**
	 * Get method for struct member 'secondary_rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Background color. </p>
	 * @see #__DNA__FIELD__secondary_rgb
	 */
	
	public CArrayFacade<Float> getSecondary_rgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1960, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'secondary_rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Background color. </p>
	 * @see #__DNA__FIELD__secondary_rgb
	 */
	
	public void setSecondary_rgb(CArrayFacade<Float> secondary_rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1960;
		} else {
			__dna__offset = 1884;
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
	 * Get method for struct member 'sculpt_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The direction of movement for sculpt vertices. </p>
	 * @see #__DNA__FIELD__sculpt_plane
	 */
	
	public int getSculpt_plane() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1972);
		} else {
			return __io__block.readInt(__io__address + 1896);
		}
	}

	/**
	 * Set method for struct member 'sculpt_plane'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The direction of movement for sculpt vertices. </p>
	 * @see #__DNA__FIELD__sculpt_plane
	 */
	
	public void setSculpt_plane(int sculpt_plane) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1972, sculpt_plane);
		} else {
			__io__block.writeInt(__io__address + 1896, sculpt_plane);
		}
	}

	/**
	 * Get method for struct member 'plane_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust plane on which the brush acts towards or away from the object surface<h4>Blender Source Code:</h4>
	 * <p> Offset for plane brushes (clay, flatten, fill, scrape). </p>
	 * @see #__DNA__FIELD__plane_offset
	 */
	
	public float getPlane_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1976);
		} else {
			return __io__block.readFloat(__io__address + 1900);
		}
	}

	/**
	 * Set method for struct member 'plane_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust plane on which the brush acts towards or away from the object surface<h4>Blender Source Code:</h4>
	 * <p> Offset for plane brushes (clay, flatten, fill, scrape). </p>
	 * @see #__DNA__FIELD__plane_offset
	 */
	
	public void setPlane_offset(float plane_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1976, plane_offset);
		} else {
			__io__block.writeFloat(__io__address + 1900, plane_offset);
		}
	}

	/**
	 * Get method for struct member 'gradient_spacing'.
	 * @see #__DNA__FIELD__gradient_spacing
	 */
	
	public int getGradient_spacing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1980);
		} else {
			return __io__block.readInt(__io__address + 1904);
		}
	}

	/**
	 * Set method for struct member 'gradient_spacing'.
	 * @see #__DNA__FIELD__gradient_spacing
	 */
	
	public void setGradient_spacing(int gradient_spacing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1980, gradient_spacing);
		} else {
			__io__block.writeInt(__io__address + 1904, gradient_spacing);
		}
	}

	/**
	 * Get method for struct member 'gradient_stroke_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for stroke color gradient application. </p>
	 * @see #__DNA__FIELD__gradient_stroke_mode
	 */
	
	public byte getGradient_stroke_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1984);
		} else {
			return __io__block.readByte(__io__address + 1908);
		}
	}

	/**
	 * Set method for struct member 'gradient_stroke_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for stroke color gradient application. </p>
	 * @see #__DNA__FIELD__gradient_stroke_mode
	 */
	
	public void setGradient_stroke_mode(byte gradient_stroke_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1984, gradient_stroke_mode);
		} else {
			__io__block.writeByte(__io__address + 1908, gradient_stroke_mode);
		}
	}

	/**
	 * Get method for struct member 'gradient_fill_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for fill tool color gradient application. </p>
	 * @see #__DNA__FIELD__gradient_fill_mode
	 */
	
	public byte getGradient_fill_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1985);
		} else {
			return __io__block.readByte(__io__address + 1909);
		}
	}

	/**
	 * Set method for struct member 'gradient_fill_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source for fill tool color gradient application. </p>
	 * @see #__DNA__FIELD__gradient_fill_mode
	 */
	
	public void setGradient_fill_mode(byte gradient_fill_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1985, gradient_fill_mode);
		} else {
			__io__block.writeByte(__io__address + 1909, gradient_fill_mode);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1986);
		} else {
			return __io__block.readByte(__io__address + 1910);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1986, _pad);
		} else {
			__io__block.writeByte(__io__address + 1910, _pad);
		}
	}

	/**
	 * Get method for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Projection shape (sphere, circle). </p>
	 * @see #__DNA__FIELD__falloff_shape
	 */
	
	public byte getFalloff_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1987);
		} else {
			return __io__block.readByte(__io__address + 1911);
		}
	}

	/**
	 * Set method for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Projection shape (sphere, circle). </p>
	 * @see #__DNA__FIELD__falloff_shape
	 */
	
	public void setFalloff_shape(byte falloff_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1987, falloff_shape);
		} else {
			__io__block.writeByte(__io__address + 1911, falloff_shape);
		}
	}

	/**
	 * Get method for struct member 'falloff_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Paint most on faces pointing towards the view according to this angle
	 * @see #__DNA__FIELD__falloff_angle
	 */
	
	public float getFalloff_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1988);
		} else {
			return __io__block.readFloat(__io__address + 1912);
		}
	}

	/**
	 * Set method for struct member 'falloff_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Paint most on faces pointing towards the view according to this angle
	 * @see #__DNA__FIELD__falloff_angle
	 */
	
	public void setFalloff_angle(float falloff_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1988, falloff_angle);
		} else {
			__io__block.writeFloat(__io__address + 1912, falloff_angle);
		}
	}

	/**
	 * Get method for struct member 'sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * @see #__DNA__FIELD__sculpt_tool
	 */
	
	public byte getSculpt_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1992);
		} else {
			return __io__block.readByte(__io__address + 1916);
		}
	}

	/**
	 * Set method for struct member 'sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * @see #__DNA__FIELD__sculpt_tool
	 */
	
	public void setSculpt_tool(byte sculpt_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1992, sculpt_tool);
		} else {
			__io__block.writeByte(__io__address + 1916, sculpt_tool);
		}
	}

	/**
	 * Get method for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * @see #__DNA__FIELD__uv_sculpt_tool
	 */
	
	public byte getUv_sculpt_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1993);
		} else {
			return __io__block.readByte(__io__address + 1917);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active sculpt tool. </p>
	 * @see #__DNA__FIELD__uv_sculpt_tool
	 */
	
	public void setUv_sculpt_tool(byte uv_sculpt_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1993, uv_sculpt_tool);
		} else {
			__io__block.writeByte(__io__address + 1917, uv_sculpt_tool);
		}
	}

	/**
	 * Get method for struct member 'vertexpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active vertex paint. </p>
	 * @see #__DNA__FIELD__vertexpaint_tool
	 */
	
	public byte getVertexpaint_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1994);
		} else {
			return __io__block.readByte(__io__address + 1918);
		}
	}

	/**
	 * Set method for struct member 'vertexpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active vertex paint. </p>
	 * @see #__DNA__FIELD__vertexpaint_tool
	 */
	
	public void setVertexpaint_tool(byte vertexpaint_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1994, vertexpaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1918, vertexpaint_tool);
		}
	}

	/**
	 * Get method for struct member 'weightpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active weight paint. </p>
	 * @see #__DNA__FIELD__weightpaint_tool
	 */
	
	public byte getWeightpaint_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1995);
		} else {
			return __io__block.readByte(__io__address + 1919);
		}
	}

	/**
	 * Set method for struct member 'weightpaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active weight paint. </p>
	 * @see #__DNA__FIELD__weightpaint_tool
	 */
	
	public void setWeightpaint_tool(byte weightpaint_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1995, weightpaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1919, weightpaint_tool);
		}
	}

	/**
	 * Get method for struct member 'imagepaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active image paint tool. </p>
	 * @see #__DNA__FIELD__imagepaint_tool
	 */
	
	public byte getImagepaint_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1996);
		} else {
			return __io__block.readByte(__io__address + 1920);
		}
	}

	/**
	 * Set method for struct member 'imagepaint_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active image paint tool. </p>
	 * @see #__DNA__FIELD__imagepaint_tool
	 */
	
	public void setImagepaint_tool(byte imagepaint_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1996, imagepaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1920, imagepaint_tool);
		}
	}

	/**
	 * Get method for struct member 'mask_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eBrushMaskTool, only used if sculpt_tool is SCULPT_TOOL_MASK. </p>
	 * @see #__DNA__FIELD__mask_tool
	 */
	
	public byte getMask_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1997);
		} else {
			return __io__block.readByte(__io__address + 1921);
		}
	}

	/**
	 * Set method for struct member 'mask_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eBrushMaskTool, only used if sculpt_tool is SCULPT_TOOL_MASK. </p>
	 * @see #__DNA__FIELD__mask_tool
	 */
	
	public void setMask_tool(byte mask_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1997, mask_tool);
		} else {
			__io__block.writeByte(__io__address + 1921, mask_tool);
		}
	}

	/**
	 * Get method for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Category of the brush<h4>Blender Source Code:</h4>
	 * <p> Active grease pencil tool. </p>
	 * @see #__DNA__FIELD__gpencil_tool
	 */
	
	public byte getGpencil_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1998);
		} else {
			return __io__block.readByte(__io__address + 1922);
		}
	}

	/**
	 * Set method for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Category of the brush<h4>Blender Source Code:</h4>
	 * <p> Active grease pencil tool. </p>
	 * @see #__DNA__FIELD__gpencil_tool
	 */
	
	public void setGpencil_tool(byte gpencil_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1998, gpencil_tool);
		} else {
			__io__block.writeByte(__io__address + 1922, gpencil_tool);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1999, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1923, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1999;
		} else {
			__dna__offset = 1923;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'autosmooth_factor'.
	 * @see #__DNA__FIELD__autosmooth_factor
	 */
	
	public float getAutosmooth_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2000);
		} else {
			return __io__block.readFloat(__io__address + 1924);
		}
	}

	/**
	 * Set method for struct member 'autosmooth_factor'.
	 * @see #__DNA__FIELD__autosmooth_factor
	 */
	
	public void setAutosmooth_factor(float autosmooth_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2000, autosmooth_factor);
		} else {
			__io__block.writeFloat(__io__address + 1924, autosmooth_factor);
		}
	}

	/**
	 * Get method for struct member 'topology_rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Automatically align edges to the brush direction to generate cleaner topology and define sharp features. Best used on low-poly meshes as it has a performance impact
	 * @see #__DNA__FIELD__topology_rake_factor
	 */
	
	public float getTopology_rake_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2004);
		} else {
			return __io__block.readFloat(__io__address + 1928);
		}
	}

	/**
	 * Set method for struct member 'topology_rake_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Automatically align edges to the brush direction to generate cleaner topology and define sharp features. Best used on low-poly meshes as it has a performance impact
	 * @see #__DNA__FIELD__topology_rake_factor
	 */
	
	public void setTopology_rake_factor(float topology_rake_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2004, topology_rake_factor);
		} else {
			__io__block.writeFloat(__io__address + 1928, topology_rake_factor);
		}
	}

	/**
	 * Get method for struct member 'crease_pinch_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the crease brush pinches
	 * @see #__DNA__FIELD__crease_pinch_factor
	 */
	
	public float getCrease_pinch_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2008);
		} else {
			return __io__block.readFloat(__io__address + 1932);
		}
	}

	/**
	 * Set method for struct member 'crease_pinch_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the crease brush pinches
	 * @see #__DNA__FIELD__crease_pinch_factor
	 */
	
	public void setCrease_pinch_factor(float crease_pinch_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2008, crease_pinch_factor);
		} else {
			__io__block.writeFloat(__io__address + 1932, crease_pinch_factor);
		}
	}

	/**
	 * Get method for struct member 'plane_trim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If a vertex is further away from offset plane than this, then it is not affected
	 * @see #__DNA__FIELD__plane_trim
	 */
	
	public float getPlane_trim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2012);
		} else {
			return __io__block.readFloat(__io__address + 1936);
		}
	}

	/**
	 * Set method for struct member 'plane_trim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If a vertex is further away from offset plane than this, then it is not affected
	 * @see #__DNA__FIELD__plane_trim
	 */
	
	public void setPlane_trim(float plane_trim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2012, plane_trim);
		} else {
			__io__block.writeFloat(__io__address + 1936, plane_trim);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Affectable height of brush (layer height for layer tool, i.e.)<h4>Blender Source Code:</h4>
	 * <p> Affectable height of brush (layer height for layer tool, i.e.). </p>
	 * @see #__DNA__FIELD__height
	 */
	
	public float getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2016);
		} else {
			return __io__block.readFloat(__io__address + 1940);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Affectable height of brush (layer height for layer tool, i.e.)<h4>Blender Source Code:</h4>
	 * <p> Affectable height of brush (layer height for layer tool, i.e.). </p>
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(float height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2016, height);
		} else {
			__io__block.writeFloat(__io__address + 1940, height);
		}
	}

	/**
	 * Get method for struct member 'texture_sample_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value added to texture samples
	 * @see #__DNA__FIELD__texture_sample_bias
	 */
	
	public float getTexture_sample_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2020);
		} else {
			return __io__block.readFloat(__io__address + 1944);
		}
	}

	/**
	 * Set method for struct member 'texture_sample_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value added to texture samples
	 * @see #__DNA__FIELD__texture_sample_bias
	 */
	
	public void setTexture_sample_bias(float texture_sample_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2020, texture_sample_bias);
		} else {
			__io__block.writeFloat(__io__address + 1944, texture_sample_bias);
		}
	}

	/**
	 * Get method for struct member 'texture_overlay_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overlay </p>
	 * @see #__DNA__FIELD__texture_overlay_alpha
	 */
	
	public int getTexture_overlay_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2024);
		} else {
			return __io__block.readInt(__io__address + 1948);
		}
	}

	/**
	 * Set method for struct member 'texture_overlay_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overlay </p>
	 * @see #__DNA__FIELD__texture_overlay_alpha
	 */
	
	public void setTexture_overlay_alpha(int texture_overlay_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2024, texture_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 1948, texture_overlay_alpha);
		}
	}

	/**
	 * Get method for struct member 'mask_overlay_alpha'.
	 * @see #__DNA__FIELD__mask_overlay_alpha
	 */
	
	public int getMask_overlay_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2028);
		} else {
			return __io__block.readInt(__io__address + 1952);
		}
	}

	/**
	 * Set method for struct member 'mask_overlay_alpha'.
	 * @see #__DNA__FIELD__mask_overlay_alpha
	 */
	
	public void setMask_overlay_alpha(int mask_overlay_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2028, mask_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 1952, mask_overlay_alpha);
		}
	}

	/**
	 * Get method for struct member 'cursor_overlay_alpha'.
	 * @see #__DNA__FIELD__cursor_overlay_alpha
	 */
	
	public int getCursor_overlay_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2032);
		} else {
			return __io__block.readInt(__io__address + 1956);
		}
	}

	/**
	 * Set method for struct member 'cursor_overlay_alpha'.
	 * @see #__DNA__FIELD__cursor_overlay_alpha
	 */
	
	public void setCursor_overlay_alpha(int cursor_overlay_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2032, cursor_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 1956, cursor_overlay_alpha);
		}
	}

	/**
	 * Get method for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public float getUnprojected_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2036);
		} else {
			return __io__block.readFloat(__io__address + 1960);
		}
	}

	/**
	 * Set method for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public void setUnprojected_radius(float unprojected_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2036, unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 1960, unprojected_radius);
		}
	}

	/**
	 * Get method for struct member 'sharp_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold below which, no sharpening is done<h4>Blender Source Code:</h4>
	 * <p> soften/sharpen </p>
	 * @see #__DNA__FIELD__sharp_threshold
	 */
	
	public float getSharp_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2040);
		} else {
			return __io__block.readFloat(__io__address + 1964);
		}
	}

	/**
	 * Set method for struct member 'sharp_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold below which, no sharpening is done<h4>Blender Source Code:</h4>
	 * <p> soften/sharpen </p>
	 * @see #__DNA__FIELD__sharp_threshold
	 */
	
	public void setSharp_threshold(float sharp_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2040, sharp_threshold);
		} else {
			__io__block.writeFloat(__io__address + 1964, sharp_threshold);
		}
	}

	/**
	 * Get method for struct member 'blur_kernel_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of kernel used for soften and sharpen in pixels
	 * @see #__DNA__FIELD__blur_kernel_radius
	 */
	
	public int getBlur_kernel_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2044);
		} else {
			return __io__block.readInt(__io__address + 1968);
		}
	}

	/**
	 * Set method for struct member 'blur_kernel_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of kernel used for soften and sharpen in pixels
	 * @see #__DNA__FIELD__blur_kernel_radius
	 */
	
	public void setBlur_kernel_radius(int blur_kernel_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2044, blur_kernel_radius);
		} else {
			__io__block.writeInt(__io__address + 1968, blur_kernel_radius);
		}
	}

	/**
	 * Get method for struct member 'blur_mode'.
	 * @see #__DNA__FIELD__blur_mode
	 */
	
	public int getBlur_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2048);
		} else {
			return __io__block.readInt(__io__address + 1972);
		}
	}

	/**
	 * Set method for struct member 'blur_mode'.
	 * @see #__DNA__FIELD__blur_mode
	 */
	
	public void setBlur_mode(int blur_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2048, blur_mode);
		} else {
			__io__block.writeInt(__io__address + 1972, blur_mode);
		}
	}

	/**
	 * Get method for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold above which filling is not propagated<h4>Blender Source Code:</h4>
	 * <p> fill tool </p>
	 * @see #__DNA__FIELD__fill_threshold
	 */
	
	public float getFill_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2052);
		} else {
			return __io__block.readFloat(__io__address + 1976);
		}
	}

	/**
	 * Set method for struct member 'fill_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Threshold above which filling is not propagated<h4>Blender Source Code:</h4>
	 * <p> fill tool </p>
	 * @see #__DNA__FIELD__fill_threshold
	 */
	
	public void setFill_threshold(float fill_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2052, fill_threshold);
		} else {
			__io__block.writeFloat(__io__address + 1976, fill_threshold);
		}
	}

	/**
	 * Get method for struct member 'add_col'.
	 * @see #__DNA__FIELD__add_col
	 */
	
	public CArrayFacade<Float> getAdd_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2056, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1980, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'add_col'.
	 * @see #__DNA__FIELD__add_col
	 */
	
	public void setAdd_col(CArrayFacade<Float> add_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2056;
		} else {
			__dna__offset = 1980;
		}
		if (__io__equals(add_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, add_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, add_col);
		} else {
			__io__generic__copy( getAdd_col(), add_col);
		}
	}

	/**
	 * Get method for struct member 'sub_col'.
	 * @see #__DNA__FIELD__sub_col
	 */
	
	public CArrayFacade<Float> getSub_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2068, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1992, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sub_col'.
	 * @see #__DNA__FIELD__sub_col
	 */
	
	public void setSub_col(CArrayFacade<Float> sub_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2068;
		} else {
			__dna__offset = 1992;
		}
		if (__io__equals(sub_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sub_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sub_col);
		} else {
			__io__generic__copy( getSub_col(), sub_col);
		}
	}

	/**
	 * Get method for struct member 'stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of stencil in viewport
	 * @see #__DNA__FIELD__stencil_pos
	 */
	
	public CArrayFacade<Float> getStencil_pos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2080, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2004, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of stencil in viewport
	 * @see #__DNA__FIELD__stencil_pos
	 */
	
	public void setStencil_pos(CArrayFacade<Float> stencil_pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2080;
		} else {
			__dna__offset = 2004;
		}
		if (__io__equals(stencil_pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stencil_pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stencil_pos);
		} else {
			__io__generic__copy( getStencil_pos(), stencil_pos);
		}
	}

	/**
	 * Get method for struct member 'stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of stencil in viewport
	 * @see #__DNA__FIELD__stencil_dimension
	 */
	
	public CArrayFacade<Float> getStencil_dimension() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2088, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2012, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of stencil in viewport
	 * @see #__DNA__FIELD__stencil_dimension
	 */
	
	public void setStencil_dimension(CArrayFacade<Float> stencil_dimension) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2088;
		} else {
			__dna__offset = 2012;
		}
		if (__io__equals(stencil_dimension, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stencil_dimension)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stencil_dimension);
		} else {
			__io__generic__copy( getStencil_dimension(), stencil_dimension);
		}
	}

	/**
	 * Get method for struct member 'mask_stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of mask stencil in viewport
	 * @see #__DNA__FIELD__mask_stencil_pos
	 */
	
	public CArrayFacade<Float> getMask_stencil_pos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2096, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2020, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_stencil_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of mask stencil in viewport
	 * @see #__DNA__FIELD__mask_stencil_pos
	 */
	
	public void setMask_stencil_pos(CArrayFacade<Float> mask_stencil_pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2096;
		} else {
			__dna__offset = 2020;
		}
		if (__io__equals(mask_stencil_pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_stencil_pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_stencil_pos);
		} else {
			__io__generic__copy( getMask_stencil_pos(), mask_stencil_pos);
		}
	}

	/**
	 * Get method for struct member 'mask_stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of mask stencil in viewport
	 * @see #__DNA__FIELD__mask_stencil_dimension
	 */
	
	public CArrayFacade<Float> getMask_stencil_dimension() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2028, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_stencil_dimension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Dimensions of mask stencil in viewport
	 * @see #__DNA__FIELD__mask_stencil_dimension
	 */
	
	public void setMask_stencil_dimension(CArrayFacade<Float> mask_stencil_dimension) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2104;
		} else {
			__dna__offset = 2028;
		}
		if (__io__equals(mask_stencil_dimension, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_stencil_dimension)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_stencil_dimension);
		} else {
			__io__generic__copy( getMask_stencil_dimension(), mask_stencil_dimension);
		}
	}

	/**
	 * Get method for struct member 'gpencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__gpencil_settings
	 */
	
	public CPointer<BrushGpencilSettings> getGpencil_settings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2036);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BrushGpencilSettings.class};
		return new CPointer<BrushGpencilSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BrushGpencilSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__gpencil_settings
	 */
	
	public void setGpencil_settings(CPointer<BrushGpencilSettings> gpencil_settings) throws IOException
	{
		long __address = ((gpencil_settings == null) ? 0 : gpencil_settings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2112, __address);
		} else {
			__io__block.writeLong(__io__address + 2036, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Brush> __io__addressof() {
		return new CPointer<Brush>(__io__address, new Class[]{Brush.class}, __io__block, __io__blockTable);
	}

}
