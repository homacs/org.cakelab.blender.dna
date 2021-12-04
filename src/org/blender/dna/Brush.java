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

@CMetaData(size32=2248, size64=2336)
public class Brush extends CFacade {

	/**
	 * This is the sdna index of the struct Brush.
	 * <p>
	 * It is required when allocating a new block to store data for Brush.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 553;

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
	 * <li>Actual Size (32bit/64bit): 136/176</li>
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
	public static final long[] __DNA__FIELD__clone = new long[]{136, 176};

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
	public static final long[] __DNA__FIELD__curve = new long[]{156, 200};

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
	 * <li>Actual Size (32bit/64bit): 304/312</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{160, 208};

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
	 * <li>Actual Size (32bit/64bit): 304/312</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_mtex = new long[]{464, 520};

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
	public static final long[] __DNA__FIELD__toggle_brush = new long[]{768, 832};

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
	public static final long[] __DNA__FIELD__icon_imbuf = new long[]{772, 840};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
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
	public static final long[] __DNA__FIELD__preview = new long[]{776, 848};

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
	public static final long[] __DNA__FIELD__gradient = new long[]{780, 856};

	/**
	 * Field descriptor (offset) for struct member 'paint_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active paint curve
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
	public static final long[] __DNA__FIELD__paint_curve = new long[]{784, 864};

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
	public static final long[] __DNA__FIELD__icon_filepath = new long[]{788, 872};

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
	public static final long[] __DNA__FIELD__normal_weight = new long[]{1812, 1896};

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
	public static final long[] __DNA__FIELD__rake_factor = new long[]{1816, 1900};

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
	public static final long[] __DNA__FIELD__blend = new long[]{1820, 1904};

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
	public static final long[] __DNA__FIELD__ob_mode = new long[]{1822, 1906};

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
	public static final long[] __DNA__FIELD__weight = new long[]{1824, 1908};

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
	public static final long[] __DNA__FIELD__size = new long[]{1828, 1912};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flags. </p>
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
	public static final long[] __DNA__FIELD__flag = new long[]{1832, 1916};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__flag2);
	 * CPointer&lt;Integer&gt; p_flag2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{1836, 1920};

	/**
	 * Field descriptor (offset) for struct member 'sampling_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__sampling_flag);
	 * CPointer&lt;Integer&gt; p_sampling_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sampling_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sampling_flag = new long[]{1840, 1924};

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
	public static final long[] __DNA__FIELD__mask_pressure = new long[]{1844, 1928};

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
	public static final long[] __DNA__FIELD__jitter = new long[]{1848, 1932};

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
	public static final long[] __DNA__FIELD__jitter_absolute = new long[]{1852, 1936};

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
	public static final long[] __DNA__FIELD__overlay_flags = new long[]{1856, 1940};

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
	public static final long[] __DNA__FIELD__spacing = new long[]{1860, 1944};

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
	public static final long[] __DNA__FIELD__smooth_stroke_radius = new long[]{1864, 1948};

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
	public static final long[] __DNA__FIELD__smooth_stroke_factor = new long[]{1868, 1952};

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
	public static final long[] __DNA__FIELD__rate = new long[]{1872, 1956};

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
	public static final long[] __DNA__FIELD__rgb = new long[]{1876, 1960};

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
	public static final long[] __DNA__FIELD__alpha = new long[]{1888, 1972};

	/**
	 * Field descriptor (offset) for struct member 'hardness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close the brush falloff starts from the edge of the brush<h4>Blender Source Code:</h4>
	 * <p> Hardness </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__hardness);
	 * CPointer&lt;Float&gt; p_hardness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hardness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hardness = new long[]{1892, 1976};

	/**
	 * Field descriptor (offset) for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is applied per stroke sample<h4>Blender Source Code:</h4>
	 * <p> Flow </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__flow);
	 * CPointer&lt;Float&gt; p_flow = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flow'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flow = new long[]{1896, 1980};

	/**
	 * Field descriptor (offset) for struct member 'wet_mix'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is picked from the surface into the brush color<h4>Blender Source Code:</h4>
	 * <p> Wet Mix </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__wet_mix);
	 * CPointer&lt;Float&gt; p_wet_mix = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wet_mix'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wet_mix = new long[]{1900, 1984};

	/**
	 * Field descriptor (offset) for struct member 'wet_persistence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of wet paint that stays in the brush after applying paint to the surface
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__wet_persistence);
	 * CPointer&lt;Float&gt; p_wet_persistence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wet_persistence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wet_persistence = new long[]{1904, 1988};

	/**
	 * Field descriptor (offset) for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of random elements that are going to be affected by the brush<h4>Blender Source Code:</h4>
	 * <p> Density </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__density);
	 * CPointer&lt;Float&gt; p_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density = new long[]{1908, 1992};

	/**
	 * Field descriptor (offset) for struct member 'paint_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__paint_flags);
	 * CPointer&lt;Integer&gt; p_paint_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_flags = new long[]{1912, 1996};

	/**
	 * Field descriptor (offset) for struct member 'tip_roundness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roundness of the brush tip<h4>Blender Source Code:</h4>
	 * <p> Tip Shape Factor that controls the shape of the brush tip by rounding the corners of a square. 0.0 value produces a square, 1.0 produces a circle. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__tip_roundness);
	 * CPointer&lt;Float&gt; p_tip_roundness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tip_roundness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tip_roundness = new long[]{1916, 2000};

	/**
	 * Field descriptor (offset) for struct member 'tip_scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of the brush tip in the X axis
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__tip_scale_x);
	 * CPointer&lt;Float&gt; p_tip_scale_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tip_scale_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tip_scale_x = new long[]{1920, 2004};

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
	public static final long[] __DNA__FIELD__secondary_rgb = new long[]{1924, 2008};

	/**
	 * Field descriptor (offset) for struct member 'dash_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio of samples in a cycle that the brush is enabled<h4>Blender Source Code:</h4>
	 * <p> Rate </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__dash_ratio);
	 * CPointer&lt;Float&gt; p_dash_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash_ratio = new long[]{1936, 2020};

	/**
	 * Field descriptor (offset) for struct member 'dash_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of a dash cycle measured in stroke samples
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__dash_samples);
	 * CPointer&lt;Integer&gt; p_dash_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash_samples = new long[]{1940, 2024};

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
	public static final long[] __DNA__FIELD__sculpt_plane = new long[]{1944, 2028};

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
	public static final long[] __DNA__FIELD__plane_offset = new long[]{1948, 2032};

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
	public static final long[] __DNA__FIELD__gradient_spacing = new long[]{1952, 2036};

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
	public static final long[] __DNA__FIELD__gradient_stroke_mode = new long[]{1956, 2040};

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
	public static final long[] __DNA__FIELD__gradient_fill_mode = new long[]{1957, 2041};

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
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{1958, 2042};

	/**
	 * Field descriptor (offset) for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use projected or spherical falloff<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__falloff_shape = new long[]{1963, 2047};

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
	public static final long[] __DNA__FIELD__falloff_angle = new long[]{1964, 2048};

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
	public static final long[] __DNA__FIELD__sculpt_tool = new long[]{1968, 2052};

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
	public static final long[] __DNA__FIELD__uv_sculpt_tool = new long[]{1969, 2053};

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
	public static final long[] __DNA__FIELD__vertexpaint_tool = new long[]{1970, 2054};

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
	public static final long[] __DNA__FIELD__weightpaint_tool = new long[]{1971, 2055};

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
	public static final long[] __DNA__FIELD__imagepaint_tool = new long[]{1972, 2056};

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
	public static final long[] __DNA__FIELD__mask_tool = new long[]{1973, 2057};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__gpencil_tool = new long[]{1974, 2058};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_vertex_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil vertex tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gpencil_vertex_tool);
	 * CPointer&lt;Byte&gt; p_gpencil_vertex_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_vertex_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_vertex_tool = new long[]{1975, 2059};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil sculpt tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gpencil_sculpt_tool);
	 * CPointer&lt;Byte&gt; p_gpencil_sculpt_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_sculpt_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_sculpt_tool = new long[]{1976, 2060};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_weight_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil weight tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__gpencil_weight_tool);
	 * CPointer&lt;Byte&gt; p_gpencil_weight_tool = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_weight_tool'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_weight_tool = new long[]{1977, 2061};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1978, 2062};

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
	public static final long[] __DNA__FIELD__autosmooth_factor = new long[]{1984, 2068};

	/**
	 * Field descriptor (offset) for struct member 'tilt_strength_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the tilt of the pen will affect the brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__tilt_strength_factor);
	 * CPointer&lt;Float&gt; p_tilt_strength_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilt_strength_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilt_strength_factor = new long[]{1988, 2072};

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
	public static final long[] __DNA__FIELD__topology_rake_factor = new long[]{1992, 2076};

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
	public static final long[] __DNA__FIELD__crease_pinch_factor = new long[]{1996, 2080};

	/**
	 * Field descriptor (offset) for struct member 'normal_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the normal
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__normal_radius_factor);
	 * CPointer&lt;Float&gt; p_normal_radius_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_radius_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_radius_factor = new long[]{2000, 2084};

	/**
	 * Field descriptor (offset) for struct member 'area_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the area center
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__area_radius_factor);
	 * CPointer&lt;Float&gt; p_area_radius_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'area_radius_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__area_radius_factor = new long[]{2004, 2088};

	/**
	 * Field descriptor (offset) for struct member 'wet_paint_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the color to blend in wet paint
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__wet_paint_radius_factor);
	 * CPointer&lt;Float&gt; p_wet_paint_radius_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wet_paint_radius_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wet_paint_radius_factor = new long[]{2008, 2092};

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
	public static final long[] __DNA__FIELD__plane_trim = new long[]{2012, 2096};

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
	public static final long[] __DNA__FIELD__height = new long[]{2016, 2100};

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
	public static final long[] __DNA__FIELD__texture_sample_bias = new long[]{2020, 2104};

	/**
	 * Field descriptor (offset) for struct member 'curve_preset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__curve_preset);
	 * CPointer&lt;Integer&gt; p_curve_preset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_preset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_preset = new long[]{2024, 2108};

	/**
	 * Field descriptor (offset) for struct member 'disconnected_distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance to search for disconnected loose parts in the mesh<h4>Blender Source Code:</h4>
	 * <p> Maximum distance to search fake neighbors from a vertex. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__disconnected_distance_max);
	 * CPointer&lt;Float&gt; p_disconnected_distance_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disconnected_distance_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disconnected_distance_max = new long[]{2028, 2112};

	/**
	 * Field descriptor (offset) for struct member 'deform_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the deformation of the brush will affect the object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__deform_target);
	 * CPointer&lt;Integer&gt; p_deform_target = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deform_target'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deform_target = new long[]{2032, 2116};

	/**
	 * Field descriptor (offset) for struct member 'automasking_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> automasking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__automasking_flags);
	 * CPointer&lt;Integer&gt; p_automasking_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'automasking_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__automasking_flags = new long[]{2036, 2120};

	/**
	 * Field descriptor (offset) for struct member 'automasking_boundary_edges_propagation_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance where boundary edge automasking is going to protect vertices from the fully masked edge
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__automasking_boundary_edges_propagation_steps);
	 * CPointer&lt;Integer&gt; p_automasking_boundary_edges_propagation_steps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'automasking_boundary_edges_propagation_steps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__automasking_boundary_edges_propagation_steps = new long[]{2040, 2124};

	/**
	 * Field descriptor (offset) for struct member 'elastic_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__elastic_deform_type);
	 * CPointer&lt;Integer&gt; p_elastic_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'elastic_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__elastic_deform_type = new long[]{2044, 2128};

	/**
	 * Field descriptor (offset) for struct member 'elastic_deform_volume_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Poisson ratio for elastic deformation. Higher values preserve volume more, but also lead to more bulging
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__elastic_deform_volume_preservation);
	 * CPointer&lt;Float&gt; p_elastic_deform_volume_preservation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'elastic_deform_volume_preservation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__elastic_deform_volume_preservation = new long[]{2048, 2132};

	/**
	 * Field descriptor (offset) for struct member 'snake_hook_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> snake hook </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__snake_hook_deform_type);
	 * CPointer&lt;Integer&gt; p_snake_hook_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snake_hook_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snake_hook_deform_type = new long[]{2052, 2136};

	/**
	 * Field descriptor (offset) for struct member 'pose_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> pose </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__pose_deform_type);
	 * CPointer&lt;Integer&gt; p_pose_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_deform_type = new long[]{2056, 2140};

	/**
	 * Field descriptor (offset) for struct member 'pose_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the pose origin in relation to the brush radius
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__pose_offset);
	 * CPointer&lt;Float&gt; p_pose_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_offset = new long[]{2060, 2144};

	/**
	 * Field descriptor (offset) for struct member 'pose_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smooth iterations applied after calculating the pose factor of each vertex
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__pose_smooth_iterations);
	 * CPointer&lt;Integer&gt; p_pose_smooth_iterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_smooth_iterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_smooth_iterations = new long[]{2064, 2148};

	/**
	 * Field descriptor (offset) for struct member 'pose_ik_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of segments of the inverse kinematics chain that will deform the mesh
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__pose_ik_segments);
	 * CPointer&lt;Integer&gt; p_pose_ik_segments = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_ik_segments'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_ik_segments = new long[]{2068, 2152};

	/**
	 * Field descriptor (offset) for struct member 'pose_origin_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to set the rotation origins for the segments of the brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__pose_origin_type);
	 * CPointer&lt;Integer&gt; p_pose_origin_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_origin_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_origin_type = new long[]{2072, 2156};

	/**
	 * Field descriptor (offset) for struct member 'boundary_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> boundary </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__boundary_deform_type);
	 * CPointer&lt;Integer&gt; p_boundary_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_deform_type = new long[]{2076, 2160};

	/**
	 * Field descriptor (offset) for struct member 'boundary_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the brush falloff is applied across the boundary
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__boundary_falloff_type);
	 * CPointer&lt;Integer&gt; p_boundary_falloff_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_falloff_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_falloff_type = new long[]{2080, 2164};

	/**
	 * Field descriptor (offset) for struct member 'boundary_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the boundary origin in relation to the brush radius
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__boundary_offset);
	 * CPointer&lt;Float&gt; p_boundary_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_offset = new long[]{2084, 2168};

	/**
	 * Field descriptor (offset) for struct member 'cloth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> cloth </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_deform_type);
	 * CPointer&lt;Integer&gt; p_cloth_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_deform_type = new long[]{2088, 2172};

	/**
	 * Field descriptor (offset) for struct member 'cloth_force_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shape used in the brush to apply force to the cloth
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_force_falloff_type);
	 * CPointer&lt;Integer&gt; p_cloth_force_falloff_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_force_falloff_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_force_falloff_type = new long[]{2092, 2176};

	/**
	 * Field descriptor (offset) for struct member 'cloth_simulation_area_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Part of the mesh that is going to be simulated when the stroke is active
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_simulation_area_type);
	 * CPointer&lt;Integer&gt; p_cloth_simulation_area_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_simulation_area_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_simulation_area_type = new long[]{2096, 2180};

	/**
	 * Field descriptor (offset) for struct member 'cloth_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of each simulation particle
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_mass);
	 * CPointer&lt;Float&gt; p_cloth_mass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_mass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_mass = new long[]{2100, 2184};

	/**
	 * Field descriptor (offset) for struct member 'cloth_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the applied forces are propagated through the cloth
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_damping);
	 * CPointer&lt;Float&gt; p_cloth_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_damping = new long[]{2104, 2188};

	/**
	 * Field descriptor (offset) for struct member 'cloth_sim_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor added relative to the size of the radius to limit the cloth simulation effects
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_sim_limit);
	 * CPointer&lt;Float&gt; p_cloth_sim_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_sim_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_sim_limit = new long[]{2108, 2192};

	/**
	 * Field descriptor (offset) for struct member 'cloth_sim_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Area to apply deformation falloff to the effects of the simulation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_sim_falloff);
	 * CPointer&lt;Float&gt; p_cloth_sim_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_sim_falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_sim_falloff = new long[]{2112, 2196};

	/**
	 * Field descriptor (offset) for struct member 'cloth_constraint_softbody_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the cloth preserves the original shape, acting as a soft body
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__cloth_constraint_softbody_strength);
	 * CPointer&lt;Float&gt; p_cloth_constraint_softbody_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cloth_constraint_softbody_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cloth_constraint_softbody_strength = new long[]{2116, 2200};

	/**
	 * Field descriptor (offset) for struct member 'smooth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smooth </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__smooth_deform_type);
	 * CPointer&lt;Integer&gt; p_smooth_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_deform_type = new long[]{2120, 2204};

	/**
	 * Field descriptor (offset) for struct member 'surface_smooth_shape_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much of the original shape is preserved when smoothing
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__surface_smooth_shape_preservation);
	 * CPointer&lt;Float&gt; p_surface_smooth_shape_preservation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_smooth_shape_preservation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_smooth_shape_preservation = new long[]{2124, 2208};

	/**
	 * Field descriptor (offset) for struct member 'surface_smooth_current_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the position of each individual vertex influences the final result
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__surface_smooth_current_vertex);
	 * CPointer&lt;Float&gt; p_surface_smooth_current_vertex = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_smooth_current_vertex'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_smooth_current_vertex = new long[]{2128, 2212};

	/**
	 * Field descriptor (offset) for struct member 'surface_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of smoothing iterations per brush step
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__surface_smooth_iterations);
	 * CPointer&lt;Integer&gt; p_surface_smooth_iterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_smooth_iterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_smooth_iterations = new long[]{2132, 2216};

	/**
	 * Field descriptor (offset) for struct member 'multiplane_scrape_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle between the planes of the crease<h4>Blender Source Code:</h4>
	 * <p> multiplane scrape </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__multiplane_scrape_angle);
	 * CPointer&lt;Float&gt; p_multiplane_scrape_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multiplane_scrape_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multiplane_scrape_angle = new long[]{2136, 2220};

	/**
	 * Field descriptor (offset) for struct member 'smear_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smear </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__smear_deform_type);
	 * CPointer&lt;Integer&gt; p_smear_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smear_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smear_deform_type = new long[]{2140, 2224};

	/**
	 * Field descriptor (offset) for struct member 'slide_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> slide/relax </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Brush brush = ...;
	 * CPointer&lt;Object&gt; p = brush.__dna__addressof(Brush.__DNA__FIELD__slide_deform_type);
	 * CPointer&lt;Integer&gt; p_slide_deform_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slide_deform_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slide_deform_type = new long[]{2144, 2228};

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
	public static final long[] __DNA__FIELD__texture_overlay_alpha = new long[]{2148, 2232};

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
	public static final long[] __DNA__FIELD__mask_overlay_alpha = new long[]{2152, 2236};

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
	public static final long[] __DNA__FIELD__cursor_overlay_alpha = new long[]{2156, 2240};

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
	public static final long[] __DNA__FIELD__unprojected_radius = new long[]{2160, 2244};

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
	public static final long[] __DNA__FIELD__sharp_threshold = new long[]{2164, 2248};

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
	public static final long[] __DNA__FIELD__blur_kernel_radius = new long[]{2168, 2252};

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
	public static final long[] __DNA__FIELD__blur_mode = new long[]{2172, 2256};

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
	public static final long[] __DNA__FIELD__fill_threshold = new long[]{2176, 2260};

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
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_col = new long[]{2180, 2264};

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
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sub_col = new long[]{2196, 2280};

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
	public static final long[] __DNA__FIELD__stencil_pos = new long[]{2212, 2296};

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
	public static final long[] __DNA__FIELD__stencil_dimension = new long[]{2220, 2304};

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
	public static final long[] __DNA__FIELD__mask_stencil_pos = new long[]{2228, 2312};

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
	public static final long[] __DNA__FIELD__mask_stencil_dimension = new long[]{2236, 2320};

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
	public static final long[] __DNA__FIELD__gpencil_settings = new long[]{2244, 2328};

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
			return new BrushClone(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new BrushClone(__io__address + 136, __io__block, __io__blockTable);
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
			__dna__offset = 176;
		} else {
			__dna__offset = 136;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
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
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * @see #__DNA__FIELD__mtex
	 */
	
	public MTex getMtex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MTex(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new MTex(__io__address + 160, __io__block, __io__blockTable);
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
			__dna__offset = 208;
		} else {
			__dna__offset = 160;
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
			return new MTex(__io__address + 520, __io__block, __io__blockTable);
		} else {
			return new MTex(__io__address + 464, __io__block, __io__blockTable);
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
			__dna__offset = 520;
		} else {
			__dna__offset = 464;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 832);
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
			__io__block.writeLong(__io__address + 832, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 840);
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
			__io__block.writeLong(__io__address + 840, __address);
		} else {
			__io__block.writeLong(__io__address + 772, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 848);
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
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 848, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 856);
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
			__io__block.writeLong(__io__address + 856, __address);
		} else {
			__io__block.writeLong(__io__address + 780, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active paint curve
	 * @see #__DNA__FIELD__paint_curve
	 */
	
	public CPointer<PaintCurve> getPaint_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 864);
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
	 * Active paint curve
	 * @see #__DNA__FIELD__paint_curve
	 */
	
	public void setPaint_curve(CPointer<PaintCurve> paint_curve) throws IOException
	{
		long __address = ((paint_curve == null) ? 0 : paint_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 864, __address);
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
			return new CArrayFacade<Byte>(__io__address + 872, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 872;
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
			return __io__block.readFloat(__io__address + 1896);
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
			__io__block.writeFloat(__io__address + 1896, normal_weight);
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
			return __io__block.readFloat(__io__address + 1900);
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
			__io__block.writeFloat(__io__address + 1900, rake_factor);
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
			return __io__block.readShort(__io__address + 1904);
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
			__io__block.writeShort(__io__address + 1904, blend);
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
			return __io__block.readShort(__io__address + 1906);
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
			__io__block.writeShort(__io__address + 1906, ob_mode);
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
			return __io__block.readFloat(__io__address + 1908);
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
			__io__block.writeFloat(__io__address + 1908, weight);
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
			return __io__block.readInt(__io__address + 1912);
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
			__io__block.writeInt(__io__address + 1912, size);
		} else {
			__io__block.writeInt(__io__address + 1828, size);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1916);
		} else {
			return __io__block.readInt(__io__address + 1832);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General purpose flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1916, flag);
		} else {
			__io__block.writeInt(__io__address + 1832, flag);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public int getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1920);
		} else {
			return __io__block.readInt(__io__address + 1836);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(int flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1920, flag2);
		} else {
			__io__block.writeInt(__io__address + 1836, flag2);
		}
	}

	/**
	 * Get method for struct member 'sampling_flag'.
	 * @see #__DNA__FIELD__sampling_flag
	 */
	
	public int getSampling_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1924);
		} else {
			return __io__block.readInt(__io__address + 1840);
		}
	}

	/**
	 * Set method for struct member 'sampling_flag'.
	 * @see #__DNA__FIELD__sampling_flag
	 */
	
	public void setSampling_flag(int sampling_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1924, sampling_flag);
		} else {
			__io__block.writeInt(__io__address + 1840, sampling_flag);
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
			return __io__block.readInt(__io__address + 1928);
		} else {
			return __io__block.readInt(__io__address + 1844);
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
			__io__block.writeInt(__io__address + 1928, mask_pressure);
		} else {
			__io__block.writeInt(__io__address + 1844, mask_pressure);
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
			return __io__block.readFloat(__io__address + 1932);
		} else {
			return __io__block.readFloat(__io__address + 1848);
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
			__io__block.writeFloat(__io__address + 1932, jitter);
		} else {
			__io__block.writeFloat(__io__address + 1848, jitter);
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
			return __io__block.readInt(__io__address + 1936);
		} else {
			return __io__block.readInt(__io__address + 1852);
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
			__io__block.writeInt(__io__address + 1936, jitter_absolute);
		} else {
			__io__block.writeInt(__io__address + 1852, jitter_absolute);
		}
	}

	/**
	 * Get method for struct member 'overlay_flags'.
	 * @see #__DNA__FIELD__overlay_flags
	 */
	
	public int getOverlay_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1940);
		} else {
			return __io__block.readInt(__io__address + 1856);
		}
	}

	/**
	 * Set method for struct member 'overlay_flags'.
	 * @see #__DNA__FIELD__overlay_flags
	 */
	
	public void setOverlay_flags(int overlay_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1940, overlay_flags);
		} else {
			__io__block.writeInt(__io__address + 1856, overlay_flags);
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
			return __io__block.readInt(__io__address + 1944);
		} else {
			return __io__block.readInt(__io__address + 1860);
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
			__io__block.writeInt(__io__address + 1944, spacing);
		} else {
			__io__block.writeInt(__io__address + 1860, spacing);
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
			return __io__block.readInt(__io__address + 1948);
		} else {
			return __io__block.readInt(__io__address + 1864);
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
			__io__block.writeInt(__io__address + 1948, smooth_stroke_radius);
		} else {
			__io__block.writeInt(__io__address + 1864, smooth_stroke_radius);
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
			return __io__block.readFloat(__io__address + 1952);
		} else {
			return __io__block.readFloat(__io__address + 1868);
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
			__io__block.writeFloat(__io__address + 1952, smooth_stroke_factor);
		} else {
			__io__block.writeFloat(__io__address + 1868, smooth_stroke_factor);
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
			return __io__block.readFloat(__io__address + 1956);
		} else {
			return __io__block.readFloat(__io__address + 1872);
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
			__io__block.writeFloat(__io__address + 1956, rate);
		} else {
			__io__block.writeFloat(__io__address + 1872, rate);
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
			return new CArrayFacade<Float>(__io__address + 1960, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1876, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1960;
		} else {
			__dna__offset = 1876;
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
			return __io__block.readFloat(__io__address + 1972);
		} else {
			return __io__block.readFloat(__io__address + 1888);
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
			__io__block.writeFloat(__io__address + 1972, alpha);
		} else {
			__io__block.writeFloat(__io__address + 1888, alpha);
		}
	}

	/**
	 * Get method for struct member 'hardness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close the brush falloff starts from the edge of the brush<h4>Blender Source Code:</h4>
	 * <p> Hardness </p>
	 * @see #__DNA__FIELD__hardness
	 */
	
	public float getHardness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1976);
		} else {
			return __io__block.readFloat(__io__address + 1892);
		}
	}

	/**
	 * Set method for struct member 'hardness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close the brush falloff starts from the edge of the brush<h4>Blender Source Code:</h4>
	 * <p> Hardness </p>
	 * @see #__DNA__FIELD__hardness
	 */
	
	public void setHardness(float hardness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1976, hardness);
		} else {
			__io__block.writeFloat(__io__address + 1892, hardness);
		}
	}

	/**
	 * Get method for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is applied per stroke sample<h4>Blender Source Code:</h4>
	 * <p> Flow </p>
	 * @see #__DNA__FIELD__flow
	 */
	
	public float getFlow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1980);
		} else {
			return __io__block.readFloat(__io__address + 1896);
		}
	}

	/**
	 * Set method for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is applied per stroke sample<h4>Blender Source Code:</h4>
	 * <p> Flow </p>
	 * @see #__DNA__FIELD__flow
	 */
	
	public void setFlow(float flow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1980, flow);
		} else {
			__io__block.writeFloat(__io__address + 1896, flow);
		}
	}

	/**
	 * Get method for struct member 'wet_mix'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is picked from the surface into the brush color<h4>Blender Source Code:</h4>
	 * <p> Wet Mix </p>
	 * @see #__DNA__FIELD__wet_mix
	 */
	
	public float getWet_mix() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1984);
		} else {
			return __io__block.readFloat(__io__address + 1900);
		}
	}

	/**
	 * Set method for struct member 'wet_mix'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of paint that is picked from the surface into the brush color<h4>Blender Source Code:</h4>
	 * <p> Wet Mix </p>
	 * @see #__DNA__FIELD__wet_mix
	 */
	
	public void setWet_mix(float wet_mix) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1984, wet_mix);
		} else {
			__io__block.writeFloat(__io__address + 1900, wet_mix);
		}
	}

	/**
	 * Get method for struct member 'wet_persistence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of wet paint that stays in the brush after applying paint to the surface
	 * @see #__DNA__FIELD__wet_persistence
	 */
	
	public float getWet_persistence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1988);
		} else {
			return __io__block.readFloat(__io__address + 1904);
		}
	}

	/**
	 * Set method for struct member 'wet_persistence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of wet paint that stays in the brush after applying paint to the surface
	 * @see #__DNA__FIELD__wet_persistence
	 */
	
	public void setWet_persistence(float wet_persistence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1988, wet_persistence);
		} else {
			__io__block.writeFloat(__io__address + 1904, wet_persistence);
		}
	}

	/**
	 * Get method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of random elements that are going to be affected by the brush<h4>Blender Source Code:</h4>
	 * <p> Density </p>
	 * @see #__DNA__FIELD__density
	 */
	
	public float getDensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1992);
		} else {
			return __io__block.readFloat(__io__address + 1908);
		}
	}

	/**
	 * Set method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of random elements that are going to be affected by the brush<h4>Blender Source Code:</h4>
	 * <p> Density </p>
	 * @see #__DNA__FIELD__density
	 */
	
	public void setDensity(float density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1992, density);
		} else {
			__io__block.writeFloat(__io__address + 1908, density);
		}
	}

	/**
	 * Get method for struct member 'paint_flags'.
	 * @see #__DNA__FIELD__paint_flags
	 */
	
	public int getPaint_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1996);
		} else {
			return __io__block.readInt(__io__address + 1912);
		}
	}

	/**
	 * Set method for struct member 'paint_flags'.
	 * @see #__DNA__FIELD__paint_flags
	 */
	
	public void setPaint_flags(int paint_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1996, paint_flags);
		} else {
			__io__block.writeInt(__io__address + 1912, paint_flags);
		}
	}

	/**
	 * Get method for struct member 'tip_roundness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roundness of the brush tip<h4>Blender Source Code:</h4>
	 * <p> Tip Shape Factor that controls the shape of the brush tip by rounding the corners of a square. 0.0 value produces a square, 1.0 produces a circle. </p>
	 * @see #__DNA__FIELD__tip_roundness
	 */
	
	public float getTip_roundness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2000);
		} else {
			return __io__block.readFloat(__io__address + 1916);
		}
	}

	/**
	 * Set method for struct member 'tip_roundness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roundness of the brush tip<h4>Blender Source Code:</h4>
	 * <p> Tip Shape Factor that controls the shape of the brush tip by rounding the corners of a square. 0.0 value produces a square, 1.0 produces a circle. </p>
	 * @see #__DNA__FIELD__tip_roundness
	 */
	
	public void setTip_roundness(float tip_roundness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2000, tip_roundness);
		} else {
			__io__block.writeFloat(__io__address + 1916, tip_roundness);
		}
	}

	/**
	 * Get method for struct member 'tip_scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of the brush tip in the X axis
	 * @see #__DNA__FIELD__tip_scale_x
	 */
	
	public float getTip_scale_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2004);
		} else {
			return __io__block.readFloat(__io__address + 1920);
		}
	}

	/**
	 * Set method for struct member 'tip_scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of the brush tip in the X axis
	 * @see #__DNA__FIELD__tip_scale_x
	 */
	
	public void setTip_scale_x(float tip_scale_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2004, tip_scale_x);
		} else {
			__io__block.writeFloat(__io__address + 1920, tip_scale_x);
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
			return new CArrayFacade<Float>(__io__address + 2008, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1924, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2008;
		} else {
			__dna__offset = 1924;
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
	 * Get method for struct member 'dash_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio of samples in a cycle that the brush is enabled<h4>Blender Source Code:</h4>
	 * <p> Rate </p>
	 * @see #__DNA__FIELD__dash_ratio
	 */
	
	public float getDash_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2020);
		} else {
			return __io__block.readFloat(__io__address + 1936);
		}
	}

	/**
	 * Set method for struct member 'dash_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio of samples in a cycle that the brush is enabled<h4>Blender Source Code:</h4>
	 * <p> Rate </p>
	 * @see #__DNA__FIELD__dash_ratio
	 */
	
	public void setDash_ratio(float dash_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2020, dash_ratio);
		} else {
			__io__block.writeFloat(__io__address + 1936, dash_ratio);
		}
	}

	/**
	 * Get method for struct member 'dash_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of a dash cycle measured in stroke samples
	 * @see #__DNA__FIELD__dash_samples
	 */
	
	public int getDash_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2024);
		} else {
			return __io__block.readInt(__io__address + 1940);
		}
	}

	/**
	 * Set method for struct member 'dash_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of a dash cycle measured in stroke samples
	 * @see #__DNA__FIELD__dash_samples
	 */
	
	public void setDash_samples(int dash_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2024, dash_samples);
		} else {
			__io__block.writeInt(__io__address + 1940, dash_samples);
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
			return __io__block.readInt(__io__address + 2028);
		} else {
			return __io__block.readInt(__io__address + 1944);
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
			__io__block.writeInt(__io__address + 2028, sculpt_plane);
		} else {
			__io__block.writeInt(__io__address + 1944, sculpt_plane);
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
			return __io__block.readFloat(__io__address + 2032);
		} else {
			return __io__block.readFloat(__io__address + 1948);
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
			__io__block.writeFloat(__io__address + 2032, plane_offset);
		} else {
			__io__block.writeFloat(__io__address + 1948, plane_offset);
		}
	}

	/**
	 * Get method for struct member 'gradient_spacing'.
	 * @see #__DNA__FIELD__gradient_spacing
	 */
	
	public int getGradient_spacing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2036);
		} else {
			return __io__block.readInt(__io__address + 1952);
		}
	}

	/**
	 * Set method for struct member 'gradient_spacing'.
	 * @see #__DNA__FIELD__gradient_spacing
	 */
	
	public void setGradient_spacing(int gradient_spacing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2036, gradient_spacing);
		} else {
			__io__block.writeInt(__io__address + 1952, gradient_spacing);
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
			return __io__block.readByte(__io__address + 2040);
		} else {
			return __io__block.readByte(__io__address + 1956);
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
			__io__block.writeByte(__io__address + 2040, gradient_stroke_mode);
		} else {
			__io__block.writeByte(__io__address + 1956, gradient_stroke_mode);
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
			return __io__block.readByte(__io__address + 2041);
		} else {
			return __io__block.readByte(__io__address + 1957);
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
			__io__block.writeByte(__io__address + 2041, gradient_fill_mode);
		} else {
			__io__block.writeByte(__io__address + 1957, gradient_fill_mode);
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
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2042, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1958, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2042;
		} else {
			__dna__offset = 1958;
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
	 * Get method for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use projected or spherical falloff<h4>Blender Source Code:</h4>
	 * <p> Projection shape (sphere, circle). </p>
	 * @see #__DNA__FIELD__falloff_shape
	 */
	
	public byte getFalloff_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2047);
		} else {
			return __io__block.readByte(__io__address + 1963);
		}
	}

	/**
	 * Set method for struct member 'falloff_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use projected or spherical falloff<h4>Blender Source Code:</h4>
	 * <p> Projection shape (sphere, circle). </p>
	 * @see #__DNA__FIELD__falloff_shape
	 */
	
	public void setFalloff_shape(byte falloff_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2047, falloff_shape);
		} else {
			__io__block.writeByte(__io__address + 1963, falloff_shape);
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
			return __io__block.readFloat(__io__address + 2048);
		} else {
			return __io__block.readFloat(__io__address + 1964);
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
			__io__block.writeFloat(__io__address + 2048, falloff_angle);
		} else {
			__io__block.writeFloat(__io__address + 1964, falloff_angle);
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
			return __io__block.readByte(__io__address + 2052);
		} else {
			return __io__block.readByte(__io__address + 1968);
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
			__io__block.writeByte(__io__address + 2052, sculpt_tool);
		} else {
			__io__block.writeByte(__io__address + 1968, sculpt_tool);
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
			return __io__block.readByte(__io__address + 2053);
		} else {
			return __io__block.readByte(__io__address + 1969);
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
			__io__block.writeByte(__io__address + 2053, uv_sculpt_tool);
		} else {
			__io__block.writeByte(__io__address + 1969, uv_sculpt_tool);
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
			return __io__block.readByte(__io__address + 2054);
		} else {
			return __io__block.readByte(__io__address + 1970);
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
			__io__block.writeByte(__io__address + 2054, vertexpaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1970, vertexpaint_tool);
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
			return __io__block.readByte(__io__address + 2055);
		} else {
			return __io__block.readByte(__io__address + 1971);
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
			__io__block.writeByte(__io__address + 2055, weightpaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1971, weightpaint_tool);
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
			return __io__block.readByte(__io__address + 2056);
		} else {
			return __io__block.readByte(__io__address + 1972);
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
			__io__block.writeByte(__io__address + 2056, imagepaint_tool);
		} else {
			__io__block.writeByte(__io__address + 1972, imagepaint_tool);
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
			return __io__block.readByte(__io__address + 2057);
		} else {
			return __io__block.readByte(__io__address + 1973);
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
			__io__block.writeByte(__io__address + 2057, mask_tool);
		} else {
			__io__block.writeByte(__io__address + 1973, mask_tool);
		}
	}

	/**
	 * Get method for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil tool. </p>
	 * @see #__DNA__FIELD__gpencil_tool
	 */
	
	public byte getGpencil_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2058);
		} else {
			return __io__block.readByte(__io__address + 1974);
		}
	}

	/**
	 * Set method for struct member 'gpencil_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil tool. </p>
	 * @see #__DNA__FIELD__gpencil_tool
	 */
	
	public void setGpencil_tool(byte gpencil_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2058, gpencil_tool);
		} else {
			__io__block.writeByte(__io__address + 1974, gpencil_tool);
		}
	}

	/**
	 * Get method for struct member 'gpencil_vertex_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil vertex tool. </p>
	 * @see #__DNA__FIELD__gpencil_vertex_tool
	 */
	
	public byte getGpencil_vertex_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2059);
		} else {
			return __io__block.readByte(__io__address + 1975);
		}
	}

	/**
	 * Set method for struct member 'gpencil_vertex_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil vertex tool. </p>
	 * @see #__DNA__FIELD__gpencil_vertex_tool
	 */
	
	public void setGpencil_vertex_tool(byte gpencil_vertex_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2059, gpencil_vertex_tool);
		} else {
			__io__block.writeByte(__io__address + 1975, gpencil_vertex_tool);
		}
	}

	/**
	 * Get method for struct member 'gpencil_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil sculpt tool. </p>
	 * @see #__DNA__FIELD__gpencil_sculpt_tool
	 */
	
	public byte getGpencil_sculpt_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2060);
		} else {
			return __io__block.readByte(__io__address + 1976);
		}
	}

	/**
	 * Set method for struct member 'gpencil_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil sculpt tool. </p>
	 * @see #__DNA__FIELD__gpencil_sculpt_tool
	 */
	
	public void setGpencil_sculpt_tool(byte gpencil_sculpt_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2060, gpencil_sculpt_tool);
		} else {
			__io__block.writeByte(__io__address + 1976, gpencil_sculpt_tool);
		}
	}

	/**
	 * Get method for struct member 'gpencil_weight_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil weight tool. </p>
	 * @see #__DNA__FIELD__gpencil_weight_tool
	 */
	
	public byte getGpencil_weight_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2061);
		} else {
			return __io__block.readByte(__io__address + 1977);
		}
	}

	/**
	 * Set method for struct member 'gpencil_weight_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active grease pencil weight tool. </p>
	 * @see #__DNA__FIELD__gpencil_weight_tool
	 */
	
	public void setGpencil_weight_tool(byte gpencil_weight_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2061, gpencil_weight_tool);
		} else {
			__io__block.writeByte(__io__address + 1977, gpencil_weight_tool);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2062, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1978, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2062;
		} else {
			__dna__offset = 1978;
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
	 * Get method for struct member 'autosmooth_factor'.
	 * @see #__DNA__FIELD__autosmooth_factor
	 */
	
	public float getAutosmooth_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2068);
		} else {
			return __io__block.readFloat(__io__address + 1984);
		}
	}

	/**
	 * Set method for struct member 'autosmooth_factor'.
	 * @see #__DNA__FIELD__autosmooth_factor
	 */
	
	public void setAutosmooth_factor(float autosmooth_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2068, autosmooth_factor);
		} else {
			__io__block.writeFloat(__io__address + 1984, autosmooth_factor);
		}
	}

	/**
	 * Get method for struct member 'tilt_strength_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the tilt of the pen will affect the brush
	 * @see #__DNA__FIELD__tilt_strength_factor
	 */
	
	public float getTilt_strength_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2072);
		} else {
			return __io__block.readFloat(__io__address + 1988);
		}
	}

	/**
	 * Set method for struct member 'tilt_strength_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the tilt of the pen will affect the brush
	 * @see #__DNA__FIELD__tilt_strength_factor
	 */
	
	public void setTilt_strength_factor(float tilt_strength_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2072, tilt_strength_factor);
		} else {
			__io__block.writeFloat(__io__address + 1988, tilt_strength_factor);
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
			return __io__block.readFloat(__io__address + 2076);
		} else {
			return __io__block.readFloat(__io__address + 1992);
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
			__io__block.writeFloat(__io__address + 2076, topology_rake_factor);
		} else {
			__io__block.writeFloat(__io__address + 1992, topology_rake_factor);
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
			return __io__block.readFloat(__io__address + 2080);
		} else {
			return __io__block.readFloat(__io__address + 1996);
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
			__io__block.writeFloat(__io__address + 2080, crease_pinch_factor);
		} else {
			__io__block.writeFloat(__io__address + 1996, crease_pinch_factor);
		}
	}

	/**
	 * Get method for struct member 'normal_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the normal
	 * @see #__DNA__FIELD__normal_radius_factor
	 */
	
	public float getNormal_radius_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2084);
		} else {
			return __io__block.readFloat(__io__address + 2000);
		}
	}

	/**
	 * Set method for struct member 'normal_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the normal
	 * @see #__DNA__FIELD__normal_radius_factor
	 */
	
	public void setNormal_radius_factor(float normal_radius_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2084, normal_radius_factor);
		} else {
			__io__block.writeFloat(__io__address + 2000, normal_radius_factor);
		}
	}

	/**
	 * Get method for struct member 'area_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the area center
	 * @see #__DNA__FIELD__area_radius_factor
	 */
	
	public float getArea_radius_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2088);
		} else {
			return __io__block.readFloat(__io__address + 2004);
		}
	}

	/**
	 * Set method for struct member 'area_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the area center
	 * @see #__DNA__FIELD__area_radius_factor
	 */
	
	public void setArea_radius_factor(float area_radius_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2088, area_radius_factor);
		} else {
			__io__block.writeFloat(__io__address + 2004, area_radius_factor);
		}
	}

	/**
	 * Get method for struct member 'wet_paint_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the color to blend in wet paint
	 * @see #__DNA__FIELD__wet_paint_radius_factor
	 */
	
	public float getWet_paint_radius_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2092);
		} else {
			return __io__block.readFloat(__io__address + 2008);
		}
	}

	/**
	 * Set method for struct member 'wet_paint_radius_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Ratio between the brush radius and the radius that is going to be used to sample the color to blend in wet paint
	 * @see #__DNA__FIELD__wet_paint_radius_factor
	 */
	
	public void setWet_paint_radius_factor(float wet_paint_radius_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2092, wet_paint_radius_factor);
		} else {
			__io__block.writeFloat(__io__address + 2008, wet_paint_radius_factor);
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
			return __io__block.readFloat(__io__address + 2096);
		} else {
			return __io__block.readFloat(__io__address + 2012);
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
			__io__block.writeFloat(__io__address + 2096, plane_trim);
		} else {
			__io__block.writeFloat(__io__address + 2012, plane_trim);
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
			return __io__block.readFloat(__io__address + 2100);
		} else {
			return __io__block.readFloat(__io__address + 2016);
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
			__io__block.writeFloat(__io__address + 2100, height);
		} else {
			__io__block.writeFloat(__io__address + 2016, height);
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
			return __io__block.readFloat(__io__address + 2104);
		} else {
			return __io__block.readFloat(__io__address + 2020);
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
			__io__block.writeFloat(__io__address + 2104, texture_sample_bias);
		} else {
			__io__block.writeFloat(__io__address + 2020, texture_sample_bias);
		}
	}

	/**
	 * Get method for struct member 'curve_preset'.
	 * @see #__DNA__FIELD__curve_preset
	 */
	
	public int getCurve_preset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2108);
		} else {
			return __io__block.readInt(__io__address + 2024);
		}
	}

	/**
	 * Set method for struct member 'curve_preset'.
	 * @see #__DNA__FIELD__curve_preset
	 */
	
	public void setCurve_preset(int curve_preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2108, curve_preset);
		} else {
			__io__block.writeInt(__io__address + 2024, curve_preset);
		}
	}

	/**
	 * Get method for struct member 'disconnected_distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance to search for disconnected loose parts in the mesh<h4>Blender Source Code:</h4>
	 * <p> Maximum distance to search fake neighbors from a vertex. </p>
	 * @see #__DNA__FIELD__disconnected_distance_max
	 */
	
	public float getDisconnected_distance_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2112);
		} else {
			return __io__block.readFloat(__io__address + 2028);
		}
	}

	/**
	 * Set method for struct member 'disconnected_distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance to search for disconnected loose parts in the mesh<h4>Blender Source Code:</h4>
	 * <p> Maximum distance to search fake neighbors from a vertex. </p>
	 * @see #__DNA__FIELD__disconnected_distance_max
	 */
	
	public void setDisconnected_distance_max(float disconnected_distance_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2112, disconnected_distance_max);
		} else {
			__io__block.writeFloat(__io__address + 2028, disconnected_distance_max);
		}
	}

	/**
	 * Get method for struct member 'deform_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the deformation of the brush will affect the object
	 * @see #__DNA__FIELD__deform_target
	 */
	
	public int getDeform_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2116);
		} else {
			return __io__block.readInt(__io__address + 2032);
		}
	}

	/**
	 * Set method for struct member 'deform_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the deformation of the brush will affect the object
	 * @see #__DNA__FIELD__deform_target
	 */
	
	public void setDeform_target(int deform_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2116, deform_target);
		} else {
			__io__block.writeInt(__io__address + 2032, deform_target);
		}
	}

	/**
	 * Get method for struct member 'automasking_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> automasking </p>
	 * @see #__DNA__FIELD__automasking_flags
	 */
	
	public int getAutomasking_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2120);
		} else {
			return __io__block.readInt(__io__address + 2036);
		}
	}

	/**
	 * Set method for struct member 'automasking_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> automasking </p>
	 * @see #__DNA__FIELD__automasking_flags
	 */
	
	public void setAutomasking_flags(int automasking_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2120, automasking_flags);
		} else {
			__io__block.writeInt(__io__address + 2036, automasking_flags);
		}
	}

	/**
	 * Get method for struct member 'automasking_boundary_edges_propagation_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance where boundary edge automasking is going to protect vertices from the fully masked edge
	 * @see #__DNA__FIELD__automasking_boundary_edges_propagation_steps
	 */
	
	public int getAutomasking_boundary_edges_propagation_steps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2124);
		} else {
			return __io__block.readInt(__io__address + 2040);
		}
	}

	/**
	 * Set method for struct member 'automasking_boundary_edges_propagation_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance where boundary edge automasking is going to protect vertices from the fully masked edge
	 * @see #__DNA__FIELD__automasking_boundary_edges_propagation_steps
	 */
	
	public void setAutomasking_boundary_edges_propagation_steps(int automasking_boundary_edges_propagation_steps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2124, automasking_boundary_edges_propagation_steps);
		} else {
			__io__block.writeInt(__io__address + 2040, automasking_boundary_edges_propagation_steps);
		}
	}

	/**
	 * Get method for struct member 'elastic_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush
	 * @see #__DNA__FIELD__elastic_deform_type
	 */
	
	public int getElastic_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2128);
		} else {
			return __io__block.readInt(__io__address + 2044);
		}
	}

	/**
	 * Set method for struct member 'elastic_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush
	 * @see #__DNA__FIELD__elastic_deform_type
	 */
	
	public void setElastic_deform_type(int elastic_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2128, elastic_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2044, elastic_deform_type);
		}
	}

	/**
	 * Get method for struct member 'elastic_deform_volume_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Poisson ratio for elastic deformation. Higher values preserve volume more, but also lead to more bulging
	 * @see #__DNA__FIELD__elastic_deform_volume_preservation
	 */
	
	public float getElastic_deform_volume_preservation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2132);
		} else {
			return __io__block.readFloat(__io__address + 2048);
		}
	}

	/**
	 * Set method for struct member 'elastic_deform_volume_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Poisson ratio for elastic deformation. Higher values preserve volume more, but also lead to more bulging
	 * @see #__DNA__FIELD__elastic_deform_volume_preservation
	 */
	
	public void setElastic_deform_volume_preservation(float elastic_deform_volume_preservation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2132, elastic_deform_volume_preservation);
		} else {
			__io__block.writeFloat(__io__address + 2048, elastic_deform_volume_preservation);
		}
	}

	/**
	 * Get method for struct member 'snake_hook_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> snake hook </p>
	 * @see #__DNA__FIELD__snake_hook_deform_type
	 */
	
	public int getSnake_hook_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2136);
		} else {
			return __io__block.readInt(__io__address + 2052);
		}
	}

	/**
	 * Set method for struct member 'snake_hook_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> snake hook </p>
	 * @see #__DNA__FIELD__snake_hook_deform_type
	 */
	
	public void setSnake_hook_deform_type(int snake_hook_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2136, snake_hook_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2052, snake_hook_deform_type);
		}
	}

	/**
	 * Get method for struct member 'pose_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> pose </p>
	 * @see #__DNA__FIELD__pose_deform_type
	 */
	
	public int getPose_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2140);
		} else {
			return __io__block.readInt(__io__address + 2056);
		}
	}

	/**
	 * Set method for struct member 'pose_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> pose </p>
	 * @see #__DNA__FIELD__pose_deform_type
	 */
	
	public void setPose_deform_type(int pose_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2140, pose_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2056, pose_deform_type);
		}
	}

	/**
	 * Get method for struct member 'pose_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the pose origin in relation to the brush radius
	 * @see #__DNA__FIELD__pose_offset
	 */
	
	public float getPose_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2144);
		} else {
			return __io__block.readFloat(__io__address + 2060);
		}
	}

	/**
	 * Set method for struct member 'pose_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the pose origin in relation to the brush radius
	 * @see #__DNA__FIELD__pose_offset
	 */
	
	public void setPose_offset(float pose_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2144, pose_offset);
		} else {
			__io__block.writeFloat(__io__address + 2060, pose_offset);
		}
	}

	/**
	 * Get method for struct member 'pose_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smooth iterations applied after calculating the pose factor of each vertex
	 * @see #__DNA__FIELD__pose_smooth_iterations
	 */
	
	public int getPose_smooth_iterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2148);
		} else {
			return __io__block.readInt(__io__address + 2064);
		}
	}

	/**
	 * Set method for struct member 'pose_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smooth iterations applied after calculating the pose factor of each vertex
	 * @see #__DNA__FIELD__pose_smooth_iterations
	 */
	
	public void setPose_smooth_iterations(int pose_smooth_iterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2148, pose_smooth_iterations);
		} else {
			__io__block.writeInt(__io__address + 2064, pose_smooth_iterations);
		}
	}

	/**
	 * Get method for struct member 'pose_ik_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of segments of the inverse kinematics chain that will deform the mesh
	 * @see #__DNA__FIELD__pose_ik_segments
	 */
	
	public int getPose_ik_segments() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2152);
		} else {
			return __io__block.readInt(__io__address + 2068);
		}
	}

	/**
	 * Set method for struct member 'pose_ik_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of segments of the inverse kinematics chain that will deform the mesh
	 * @see #__DNA__FIELD__pose_ik_segments
	 */
	
	public void setPose_ik_segments(int pose_ik_segments) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2152, pose_ik_segments);
		} else {
			__io__block.writeInt(__io__address + 2068, pose_ik_segments);
		}
	}

	/**
	 * Get method for struct member 'pose_origin_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to set the rotation origins for the segments of the brush
	 * @see #__DNA__FIELD__pose_origin_type
	 */
	
	public int getPose_origin_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2156);
		} else {
			return __io__block.readInt(__io__address + 2072);
		}
	}

	/**
	 * Set method for struct member 'pose_origin_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to set the rotation origins for the segments of the brush
	 * @see #__DNA__FIELD__pose_origin_type
	 */
	
	public void setPose_origin_type(int pose_origin_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2156, pose_origin_type);
		} else {
			__io__block.writeInt(__io__address + 2072, pose_origin_type);
		}
	}

	/**
	 * Get method for struct member 'boundary_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> boundary </p>
	 * @see #__DNA__FIELD__boundary_deform_type
	 */
	
	public int getBoundary_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2160);
		} else {
			return __io__block.readInt(__io__address + 2076);
		}
	}

	/**
	 * Set method for struct member 'boundary_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> boundary </p>
	 * @see #__DNA__FIELD__boundary_deform_type
	 */
	
	public void setBoundary_deform_type(int boundary_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2160, boundary_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2076, boundary_deform_type);
		}
	}

	/**
	 * Get method for struct member 'boundary_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the brush falloff is applied across the boundary
	 * @see #__DNA__FIELD__boundary_falloff_type
	 */
	
	public int getBoundary_falloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2164);
		} else {
			return __io__block.readInt(__io__address + 2080);
		}
	}

	/**
	 * Set method for struct member 'boundary_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the brush falloff is applied across the boundary
	 * @see #__DNA__FIELD__boundary_falloff_type
	 */
	
	public void setBoundary_falloff_type(int boundary_falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2164, boundary_falloff_type);
		} else {
			__io__block.writeInt(__io__address + 2080, boundary_falloff_type);
		}
	}

	/**
	 * Get method for struct member 'boundary_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the boundary origin in relation to the brush radius
	 * @see #__DNA__FIELD__boundary_offset
	 */
	
	public float getBoundary_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2168);
		} else {
			return __io__block.readFloat(__io__address + 2084);
		}
	}

	/**
	 * Set method for struct member 'boundary_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of the boundary origin in relation to the brush radius
	 * @see #__DNA__FIELD__boundary_offset
	 */
	
	public void setBoundary_offset(float boundary_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2168, boundary_offset);
		} else {
			__io__block.writeFloat(__io__address + 2084, boundary_offset);
		}
	}

	/**
	 * Get method for struct member 'cloth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> cloth </p>
	 * @see #__DNA__FIELD__cloth_deform_type
	 */
	
	public int getCloth_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2172);
		} else {
			return __io__block.readInt(__io__address + 2088);
		}
	}

	/**
	 * Set method for struct member 'cloth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> cloth </p>
	 * @see #__DNA__FIELD__cloth_deform_type
	 */
	
	public void setCloth_deform_type(int cloth_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2172, cloth_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2088, cloth_deform_type);
		}
	}

	/**
	 * Get method for struct member 'cloth_force_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shape used in the brush to apply force to the cloth
	 * @see #__DNA__FIELD__cloth_force_falloff_type
	 */
	
	public int getCloth_force_falloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2176);
		} else {
			return __io__block.readInt(__io__address + 2092);
		}
	}

	/**
	 * Set method for struct member 'cloth_force_falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shape used in the brush to apply force to the cloth
	 * @see #__DNA__FIELD__cloth_force_falloff_type
	 */
	
	public void setCloth_force_falloff_type(int cloth_force_falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2176, cloth_force_falloff_type);
		} else {
			__io__block.writeInt(__io__address + 2092, cloth_force_falloff_type);
		}
	}

	/**
	 * Get method for struct member 'cloth_simulation_area_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Part of the mesh that is going to be simulated when the stroke is active
	 * @see #__DNA__FIELD__cloth_simulation_area_type
	 */
	
	public int getCloth_simulation_area_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2180);
		} else {
			return __io__block.readInt(__io__address + 2096);
		}
	}

	/**
	 * Set method for struct member 'cloth_simulation_area_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Part of the mesh that is going to be simulated when the stroke is active
	 * @see #__DNA__FIELD__cloth_simulation_area_type
	 */
	
	public void setCloth_simulation_area_type(int cloth_simulation_area_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2180, cloth_simulation_area_type);
		} else {
			__io__block.writeInt(__io__address + 2096, cloth_simulation_area_type);
		}
	}

	/**
	 * Get method for struct member 'cloth_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of each simulation particle
	 * @see #__DNA__FIELD__cloth_mass
	 */
	
	public float getCloth_mass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2184);
		} else {
			return __io__block.readFloat(__io__address + 2100);
		}
	}

	/**
	 * Set method for struct member 'cloth_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of each simulation particle
	 * @see #__DNA__FIELD__cloth_mass
	 */
	
	public void setCloth_mass(float cloth_mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2184, cloth_mass);
		} else {
			__io__block.writeFloat(__io__address + 2100, cloth_mass);
		}
	}

	/**
	 * Get method for struct member 'cloth_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the applied forces are propagated through the cloth
	 * @see #__DNA__FIELD__cloth_damping
	 */
	
	public float getCloth_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2188);
		} else {
			return __io__block.readFloat(__io__address + 2104);
		}
	}

	/**
	 * Set method for struct member 'cloth_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the applied forces are propagated through the cloth
	 * @see #__DNA__FIELD__cloth_damping
	 */
	
	public void setCloth_damping(float cloth_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2188, cloth_damping);
		} else {
			__io__block.writeFloat(__io__address + 2104, cloth_damping);
		}
	}

	/**
	 * Get method for struct member 'cloth_sim_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor added relative to the size of the radius to limit the cloth simulation effects
	 * @see #__DNA__FIELD__cloth_sim_limit
	 */
	
	public float getCloth_sim_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2192);
		} else {
			return __io__block.readFloat(__io__address + 2108);
		}
	}

	/**
	 * Set method for struct member 'cloth_sim_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor added relative to the size of the radius to limit the cloth simulation effects
	 * @see #__DNA__FIELD__cloth_sim_limit
	 */
	
	public void setCloth_sim_limit(float cloth_sim_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2192, cloth_sim_limit);
		} else {
			__io__block.writeFloat(__io__address + 2108, cloth_sim_limit);
		}
	}

	/**
	 * Get method for struct member 'cloth_sim_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Area to apply deformation falloff to the effects of the simulation
	 * @see #__DNA__FIELD__cloth_sim_falloff
	 */
	
	public float getCloth_sim_falloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2196);
		} else {
			return __io__block.readFloat(__io__address + 2112);
		}
	}

	/**
	 * Set method for struct member 'cloth_sim_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Area to apply deformation falloff to the effects of the simulation
	 * @see #__DNA__FIELD__cloth_sim_falloff
	 */
	
	public void setCloth_sim_falloff(float cloth_sim_falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2196, cloth_sim_falloff);
		} else {
			__io__block.writeFloat(__io__address + 2112, cloth_sim_falloff);
		}
	}

	/**
	 * Get method for struct member 'cloth_constraint_softbody_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the cloth preserves the original shape, acting as a soft body
	 * @see #__DNA__FIELD__cloth_constraint_softbody_strength
	 */
	
	public float getCloth_constraint_softbody_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2200);
		} else {
			return __io__block.readFloat(__io__address + 2116);
		}
	}

	/**
	 * Set method for struct member 'cloth_constraint_softbody_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the cloth preserves the original shape, acting as a soft body
	 * @see #__DNA__FIELD__cloth_constraint_softbody_strength
	 */
	
	public void setCloth_constraint_softbody_strength(float cloth_constraint_softbody_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2200, cloth_constraint_softbody_strength);
		} else {
			__io__block.writeFloat(__io__address + 2116, cloth_constraint_softbody_strength);
		}
	}

	/**
	 * Get method for struct member 'smooth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smooth </p>
	 * @see #__DNA__FIELD__smooth_deform_type
	 */
	
	public int getSmooth_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2204);
		} else {
			return __io__block.readInt(__io__address + 2120);
		}
	}

	/**
	 * Set method for struct member 'smooth_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smooth </p>
	 * @see #__DNA__FIELD__smooth_deform_type
	 */
	
	public void setSmooth_deform_type(int smooth_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2204, smooth_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2120, smooth_deform_type);
		}
	}

	/**
	 * Get method for struct member 'surface_smooth_shape_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much of the original shape is preserved when smoothing
	 * @see #__DNA__FIELD__surface_smooth_shape_preservation
	 */
	
	public float getSurface_smooth_shape_preservation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2208);
		} else {
			return __io__block.readFloat(__io__address + 2124);
		}
	}

	/**
	 * Set method for struct member 'surface_smooth_shape_preservation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much of the original shape is preserved when smoothing
	 * @see #__DNA__FIELD__surface_smooth_shape_preservation
	 */
	
	public void setSurface_smooth_shape_preservation(float surface_smooth_shape_preservation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2208, surface_smooth_shape_preservation);
		} else {
			__io__block.writeFloat(__io__address + 2124, surface_smooth_shape_preservation);
		}
	}

	/**
	 * Get method for struct member 'surface_smooth_current_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the position of each individual vertex influences the final result
	 * @see #__DNA__FIELD__surface_smooth_current_vertex
	 */
	
	public float getSurface_smooth_current_vertex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2212);
		} else {
			return __io__block.readFloat(__io__address + 2128);
		}
	}

	/**
	 * Set method for struct member 'surface_smooth_current_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the position of each individual vertex influences the final result
	 * @see #__DNA__FIELD__surface_smooth_current_vertex
	 */
	
	public void setSurface_smooth_current_vertex(float surface_smooth_current_vertex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2212, surface_smooth_current_vertex);
		} else {
			__io__block.writeFloat(__io__address + 2128, surface_smooth_current_vertex);
		}
	}

	/**
	 * Get method for struct member 'surface_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of smoothing iterations per brush step
	 * @see #__DNA__FIELD__surface_smooth_iterations
	 */
	
	public int getSurface_smooth_iterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2216);
		} else {
			return __io__block.readInt(__io__address + 2132);
		}
	}

	/**
	 * Set method for struct member 'surface_smooth_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of smoothing iterations per brush step
	 * @see #__DNA__FIELD__surface_smooth_iterations
	 */
	
	public void setSurface_smooth_iterations(int surface_smooth_iterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2216, surface_smooth_iterations);
		} else {
			__io__block.writeInt(__io__address + 2132, surface_smooth_iterations);
		}
	}

	/**
	 * Get method for struct member 'multiplane_scrape_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle between the planes of the crease<h4>Blender Source Code:</h4>
	 * <p> multiplane scrape </p>
	 * @see #__DNA__FIELD__multiplane_scrape_angle
	 */
	
	public float getMultiplane_scrape_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2220);
		} else {
			return __io__block.readFloat(__io__address + 2136);
		}
	}

	/**
	 * Set method for struct member 'multiplane_scrape_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle between the planes of the crease<h4>Blender Source Code:</h4>
	 * <p> multiplane scrape </p>
	 * @see #__DNA__FIELD__multiplane_scrape_angle
	 */
	
	public void setMultiplane_scrape_angle(float multiplane_scrape_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2220, multiplane_scrape_angle);
		} else {
			__io__block.writeFloat(__io__address + 2136, multiplane_scrape_angle);
		}
	}

	/**
	 * Get method for struct member 'smear_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smear </p>
	 * @see #__DNA__FIELD__smear_deform_type
	 */
	
	public int getSmear_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2224);
		} else {
			return __io__block.readInt(__io__address + 2140);
		}
	}

	/**
	 * Set method for struct member 'smear_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> smear </p>
	 * @see #__DNA__FIELD__smear_deform_type
	 */
	
	public void setSmear_deform_type(int smear_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2224, smear_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2140, smear_deform_type);
		}
	}

	/**
	 * Get method for struct member 'slide_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> slide/relax </p>
	 * @see #__DNA__FIELD__slide_deform_type
	 */
	
	public int getSlide_deform_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2228);
		} else {
			return __io__block.readInt(__io__address + 2144);
		}
	}

	/**
	 * Set method for struct member 'slide_deform_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Deformation type that is used in the brush<h4>Blender Source Code:</h4>
	 * <p> slide/relax </p>
	 * @see #__DNA__FIELD__slide_deform_type
	 */
	
	public void setSlide_deform_type(int slide_deform_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2228, slide_deform_type);
		} else {
			__io__block.writeInt(__io__address + 2144, slide_deform_type);
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
			return __io__block.readInt(__io__address + 2232);
		} else {
			return __io__block.readInt(__io__address + 2148);
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
			__io__block.writeInt(__io__address + 2232, texture_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 2148, texture_overlay_alpha);
		}
	}

	/**
	 * Get method for struct member 'mask_overlay_alpha'.
	 * @see #__DNA__FIELD__mask_overlay_alpha
	 */
	
	public int getMask_overlay_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2236);
		} else {
			return __io__block.readInt(__io__address + 2152);
		}
	}

	/**
	 * Set method for struct member 'mask_overlay_alpha'.
	 * @see #__DNA__FIELD__mask_overlay_alpha
	 */
	
	public void setMask_overlay_alpha(int mask_overlay_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2236, mask_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 2152, mask_overlay_alpha);
		}
	}

	/**
	 * Get method for struct member 'cursor_overlay_alpha'.
	 * @see #__DNA__FIELD__cursor_overlay_alpha
	 */
	
	public int getCursor_overlay_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2240);
		} else {
			return __io__block.readInt(__io__address + 2156);
		}
	}

	/**
	 * Set method for struct member 'cursor_overlay_alpha'.
	 * @see #__DNA__FIELD__cursor_overlay_alpha
	 */
	
	public void setCursor_overlay_alpha(int cursor_overlay_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2240, cursor_overlay_alpha);
		} else {
			__io__block.writeInt(__io__address + 2156, cursor_overlay_alpha);
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
			return __io__block.readFloat(__io__address + 2244);
		} else {
			return __io__block.readFloat(__io__address + 2160);
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
			__io__block.writeFloat(__io__address + 2244, unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 2160, unprojected_radius);
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
			return __io__block.readFloat(__io__address + 2248);
		} else {
			return __io__block.readFloat(__io__address + 2164);
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
			__io__block.writeFloat(__io__address + 2248, sharp_threshold);
		} else {
			__io__block.writeFloat(__io__address + 2164, sharp_threshold);
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
			return __io__block.readInt(__io__address + 2252);
		} else {
			return __io__block.readInt(__io__address + 2168);
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
			__io__block.writeInt(__io__address + 2252, blur_kernel_radius);
		} else {
			__io__block.writeInt(__io__address + 2168, blur_kernel_radius);
		}
	}

	/**
	 * Get method for struct member 'blur_mode'.
	 * @see #__DNA__FIELD__blur_mode
	 */
	
	public int getBlur_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2256);
		} else {
			return __io__block.readInt(__io__address + 2172);
		}
	}

	/**
	 * Set method for struct member 'blur_mode'.
	 * @see #__DNA__FIELD__blur_mode
	 */
	
	public void setBlur_mode(int blur_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2256, blur_mode);
		} else {
			__io__block.writeInt(__io__address + 2172, blur_mode);
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
			return __io__block.readFloat(__io__address + 2260);
		} else {
			return __io__block.readFloat(__io__address + 2176);
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
			__io__block.writeFloat(__io__address + 2260, fill_threshold);
		} else {
			__io__block.writeFloat(__io__address + 2176, fill_threshold);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2264;
		} else {
			__dna__offset = 2180;
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2280;
		} else {
			__dna__offset = 2196;
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
			return new CArrayFacade<Float>(__io__address + 2296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2296;
		} else {
			__dna__offset = 2212;
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
			return new CArrayFacade<Float>(__io__address + 2304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2304;
		} else {
			__dna__offset = 2220;
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
			return new CArrayFacade<Float>(__io__address + 2312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2312;
		} else {
			__dna__offset = 2228;
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
			return new CArrayFacade<Float>(__io__address + 2320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2320;
		} else {
			__dna__offset = 2236;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 2328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2244);
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
			__io__block.writeLong(__io__address + 2328, __address);
		} else {
			__io__block.writeLong(__io__address + 2244, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Brush> __io__addressof() {
		return new CPointer<Brush>(__io__address, new Class[]{Brush.class}, __io__block, __io__blockTable);
	}

}
