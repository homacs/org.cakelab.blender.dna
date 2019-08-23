package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DynamicPaintSurface'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1512, size64=1552)
public class DynamicPaintSurface extends CFacade {

	/**
	 * This is the sdna index of the struct DynamicPaintSurface.
	 * <p>
	 * It is required when allocating a new block to store data for DynamicPaintSurface.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 569;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;DynamicPaintSurface&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, DynamicPaintSurface.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'DynamicPaintSurface*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;DynamicPaintSurface&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, DynamicPaintSurface.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'DynamicPaintSurface*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__canvas);
	 * CPointer&lt;CPointer&lt;DynamicPaintCanvasSettings&gt;&gt; p_canvas = p.cast(new Class[]{CPointer.class, DynamicPaintCanvasSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'canvas'</li>
	 * <li>Signature: 'DynamicPaintCanvasSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__canvas = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'PaintSurfaceData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'brush_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__brush_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_brush_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_group = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__pointcache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_pointcache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointcache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointcache = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'current_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__current_frame);
	 * CPointer&lt;Integer&gt; p_current_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'current_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__current_frame = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface name<h4>Blender Source Code:</h4>
	 * <p> surface </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{40, 76};

	/**
	 * Field descriptor (offset) for struct member 'format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__format);
	 * CPointer&lt;Short&gt; p_format = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'format'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__format = new long[]{104, 140};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{106, 142};

	/**
	 * Field descriptor (offset) for struct member 'disp_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__disp_type);
	 * CPointer&lt;Short&gt; p_disp_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp_type = new long[]{108, 144};

	/**
	 * Field descriptor (offset) for struct member 'image_fileformat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__image_fileformat);
	 * CPointer&lt;Short&gt; p_image_fileformat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_fileformat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_fileformat = new long[]{110, 146};

	/**
	 * Field descriptor (offset) for struct member 'effect_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ui selection box. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__effect_ui);
	 * CPointer&lt;Short&gt; p_effect_ui = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effect_ui'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effect_ui = new long[]{112, 148};

	/**
	 * Field descriptor (offset) for struct member 'init_color_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__init_color_type);
	 * CPointer&lt;Short&gt; p_init_color_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init_color_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init_color_type = new long[]{114, 150};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'effect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__effect);
	 * CPointer&lt;Integer&gt; p_effect = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effect'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effect = new long[]{120, 156};

	/**
	 * Field descriptor (offset) for struct member 'image_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Output image resolution
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__image_resolution);
	 * CPointer&lt;Integer&gt; p_image_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_resolution = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'substeps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__substeps);
	 * CPointer&lt;Integer&gt; p_substeps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'substeps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__substeps = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'start_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__start_frame);
	 * CPointer&lt;Integer&gt; p_start_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_frame = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'end_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__end_frame);
	 * CPointer&lt;Integer&gt; p_end_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_frame = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'init_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial color of the surface<h4>Blender Source Code:</h4>
	 * <p> initial color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__init_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_init_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init_color = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'init_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__init_texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_init_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init_texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init_texture = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'init_layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__init_layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_init_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init_layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init_layername = new long[]{160, 200};

	/**
	 * Field descriptor (offset) for struct member 'dry_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Approximately in how many frames should drying happen
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__dry_speed);
	 * CPointer&lt;Integer&gt; p_dry_speed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dry_speed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dry_speed = new long[]{224, 264};

	/**
	 * Field descriptor (offset) for struct member 'diss_speed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__diss_speed);
	 * CPointer&lt;Integer&gt; p_diss_speed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diss_speed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diss_speed = new long[]{228, 268};

	/**
	 * Field descriptor (offset) for struct member 'color_dry_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The wetness level when colors start to shift to the background
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__color_dry_threshold);
	 * CPointer&lt;Float&gt; p_color_dry_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_dry_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_dry_threshold = new long[]{232, 272};

	/**
	 * Field descriptor (offset) for struct member 'depth_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of depth intersection in object space (use 0.0 to disable)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__depth_clamp);
	 * CPointer&lt;Float&gt; p_depth_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth_clamp = new long[]{236, 276};

	/**
	 * Field descriptor (offset) for struct member 'disp_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__disp_factor);
	 * CPointer&lt;Float&gt; p_disp_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp_factor = new long[]{240, 280};

	/**
	 * Field descriptor (offset) for struct member 'spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast spread effect moves on the canvas surface
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__spread_speed);
	 * CPointer&lt;Float&gt; p_spread_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spread_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spread_speed = new long[]{244, 284};

	/**
	 * Field descriptor (offset) for struct member 'color_spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast colors get mixed within wet paint
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__color_spread_speed);
	 * CPointer&lt;Float&gt; p_color_spread_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_spread_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_spread_speed = new long[]{248, 288};

	/**
	 * Field descriptor (offset) for struct member 'shrink_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast shrink effect moves on the canvas surface
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__shrink_speed);
	 * CPointer&lt;Float&gt; p_shrink_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrink_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrink_speed = new long[]{252, 292};

	/**
	 * Field descriptor (offset) for struct member 'drip_vel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__drip_vel);
	 * CPointer&lt;Float&gt; p_drip_vel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drip_vel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drip_vel = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'drip_acc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__drip_acc);
	 * CPointer&lt;Float&gt; p_drip_acc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drip_acc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drip_acc = new long[]{260, 300};

	/**
	 * Field descriptor (offset) for struct member 'influence_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> per surface brush settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__influence_scale);
	 * CPointer&lt;Float&gt; p_influence_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'influence_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__influence_scale = new long[]{264, 304};

	/**
	 * Field descriptor (offset) for struct member 'radius_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__radius_scale);
	 * CPointer&lt;Float&gt; p_radius_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_scale = new long[]{268, 308};

	/**
	 * Field descriptor (offset) for struct member 'wave_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave damping factor<h4>Blender Source Code:</h4>
	 * <p> wave settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__wave_damping);
	 * CPointer&lt;Float&gt; p_wave_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_damping = new long[]{272, 312};

	/**
	 * Field descriptor (offset) for struct member 'wave_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave propagation speed
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__wave_speed);
	 * CPointer&lt;Float&gt; p_wave_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_speed = new long[]{276, 316};

	/**
	 * Field descriptor (offset) for struct member 'wave_timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave time scaling factor
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__wave_timescale);
	 * CPointer&lt;Float&gt; p_wave_timescale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_timescale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_timescale = new long[]{280, 320};

	/**
	 * Field descriptor (offset) for struct member 'wave_spring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring force that pulls water level back to zero
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__wave_spring);
	 * CPointer&lt;Float&gt; p_wave_spring = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_spring'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_spring = new long[]{284, 324};

	/**
	 * Field descriptor (offset) for struct member 'wave_smoothness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit maximum steepness of wave slope between simulation points (use higher values for smoother waves at expense of reduced detail)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__wave_smoothness);
	 * CPointer&lt;Float&gt; p_wave_smoothness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_smoothness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_smoothness = new long[]{288, 328};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{292, 332};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{296, 336};

	/**
	 * Field descriptor (offset) for struct member 'image_output_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory to save the textures<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__image_output_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_image_output_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_output_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_output_path = new long[]{360, 400};

	/**
	 * Field descriptor (offset) for struct member 'output_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__output_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_output_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'output_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__output_name = new long[]{1384, 1424};

	/**
	 * Field descriptor (offset) for struct member 'output_name2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME some surfaces have 2 outputs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintSurface dynamicpaintsurface = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintsurface.__dna__addressof(DynamicPaintSurface.__DNA__FIELD__output_name2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_output_name2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'output_name2'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__output_name2 = new long[]{1448, 1488};

	public DynamicPaintSurface(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DynamicPaintSurface(DynamicPaintSurface that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<DynamicPaintSurface> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DynamicPaintSurface.class};
		return new CPointer<DynamicPaintSurface>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DynamicPaintSurface.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<DynamicPaintSurface> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<DynamicPaintSurface> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DynamicPaintSurface.class};
		return new CPointer<DynamicPaintSurface>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DynamicPaintSurface.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<DynamicPaintSurface> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__canvas
	 */
	
	public CPointer<DynamicPaintCanvasSettings> getCanvas() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DynamicPaintCanvasSettings.class};
		return new CPointer<DynamicPaintCanvasSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DynamicPaintCanvasSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__canvas
	 */
	
	public void setCanvas(CPointer<DynamicPaintCanvasSettings> canvas) throws IOException
	{
		long __address = ((canvas == null) ? 0 : canvas.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'brush_group'.
	 * @see #__DNA__FIELD__brush_group
	 */
	
	public CPointer<Collection> getBrush_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'brush_group'.
	 * @see #__DNA__FIELD__brush_group
	 */
	
	public void setBrush_group(CPointer<Collection> brush_group) throws IOException
	{
		long __address = ((brush_group == null) ? 0 : brush_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public CPointer<PointCache> getPointcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public void setPointcache(CPointer<PointCache> pointcache) throws IOException
	{
		long __address = ((pointcache == null) ? 0 : pointcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(ListBase ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
		}
	}

	/**
	 * Get method for struct member 'current_frame'.
	 * @see #__DNA__FIELD__current_frame
	 */
	
	public int getCurrent_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'current_frame'.
	 * @see #__DNA__FIELD__current_frame
	 */
	
	public void setCurrent_frame(int current_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, current_frame);
		} else {
			__io__block.writeInt(__io__address + 36, current_frame);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface name<h4>Blender Source Code:</h4>
	 * <p> surface </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface name<h4>Blender Source Code:</h4>
	 * <p> surface </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'format'.
	 * @see #__DNA__FIELD__format
	 */
	
	public short getFormat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 140);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'format'.
	 * @see #__DNA__FIELD__format
	 */
	
	public void setFormat(short format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 140, format);
		} else {
			__io__block.writeShort(__io__address + 104, format);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 142);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 142, type);
		} else {
			__io__block.writeShort(__io__address + 106, type);
		}
	}

	/**
	 * Get method for struct member 'disp_type'.
	 * @see #__DNA__FIELD__disp_type
	 */
	
	public short getDisp_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'disp_type'.
	 * @see #__DNA__FIELD__disp_type
	 */
	
	public void setDisp_type(short disp_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 144, disp_type);
		} else {
			__io__block.writeShort(__io__address + 108, disp_type);
		}
	}

	/**
	 * Get method for struct member 'image_fileformat'.
	 * @see #__DNA__FIELD__image_fileformat
	 */
	
	public short getImage_fileformat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 146);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'image_fileformat'.
	 * @see #__DNA__FIELD__image_fileformat
	 */
	
	public void setImage_fileformat(short image_fileformat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 146, image_fileformat);
		} else {
			__io__block.writeShort(__io__address + 110, image_fileformat);
		}
	}

	/**
	 * Get method for struct member 'effect_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ui selection box. </p>
	 * @see #__DNA__FIELD__effect_ui
	 */
	
	public short getEffect_ui() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 148);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'effect_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ui selection box. </p>
	 * @see #__DNA__FIELD__effect_ui
	 */
	
	public void setEffect_ui(short effect_ui) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 148, effect_ui);
		} else {
			__io__block.writeShort(__io__address + 112, effect_ui);
		}
	}

	/**
	 * Get method for struct member 'init_color_type'.
	 * @see #__DNA__FIELD__init_color_type
	 */
	
	public short getInit_color_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 150);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'init_color_type'.
	 * @see #__DNA__FIELD__init_color_type
	 */
	
	public void setInit_color_type(short init_color_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 150, init_color_type);
		} else {
			__io__block.writeShort(__io__address + 114, init_color_type);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, flags);
		} else {
			__io__block.writeInt(__io__address + 116, flags);
		}
	}

	/**
	 * Get method for struct member 'effect'.
	 * @see #__DNA__FIELD__effect
	 */
	
	public int getEffect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'effect'.
	 * @see #__DNA__FIELD__effect
	 */
	
	public void setEffect(int effect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, effect);
		} else {
			__io__block.writeInt(__io__address + 120, effect);
		}
	}

	/**
	 * Get method for struct member 'image_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Output image resolution
	 * @see #__DNA__FIELD__image_resolution
	 */
	
	public int getImage_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'image_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Output image resolution
	 * @see #__DNA__FIELD__image_resolution
	 */
	
	public void setImage_resolution(int image_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, image_resolution);
		} else {
			__io__block.writeInt(__io__address + 124, image_resolution);
		}
	}

	/**
	 * Get method for struct member 'substeps'.
	 * @see #__DNA__FIELD__substeps
	 */
	
	public int getSubsteps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'substeps'.
	 * @see #__DNA__FIELD__substeps
	 */
	
	public void setSubsteps(int substeps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, substeps);
		} else {
			__io__block.writeInt(__io__address + 128, substeps);
		}
	}

	/**
	 * Get method for struct member 'start_frame'.
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public int getStart_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'start_frame'.
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public void setStart_frame(int start_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, start_frame);
		} else {
			__io__block.writeInt(__io__address + 132, start_frame);
		}
	}

	/**
	 * Get method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public int getEnd_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public void setEnd_frame(int end_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, end_frame);
		} else {
			__io__block.writeInt(__io__address + 136, end_frame);
		}
	}

	/**
	 * Get method for struct member 'init_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial color of the surface<h4>Blender Source Code:</h4>
	 * <p> initial color </p>
	 * @see #__DNA__FIELD__init_color
	 */
	
	public CArrayFacade<Float> getInit_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'init_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial color of the surface<h4>Blender Source Code:</h4>
	 * <p> initial color </p>
	 * @see #__DNA__FIELD__init_color
	 */
	
	public void setInit_color(CArrayFacade<Float> init_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(init_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, init_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, init_color);
		} else {
			__io__generic__copy( getInit_color(), init_color);
		}
	}

	/**
	 * Get method for struct member 'init_texture'.
	 * @see #__DNA__FIELD__init_texture
	 */
	
	public CPointer<Tex> getInit_texture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'init_texture'.
	 * @see #__DNA__FIELD__init_texture
	 */
	
	public void setInit_texture(CPointer<Tex> init_texture) throws IOException
	{
		long __address = ((init_texture == null) ? 0 : init_texture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'init_layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__init_layername
	 */
	
	public CArrayFacade<Byte> getInit_layername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'init_layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__init_layername
	 */
	
	public void setInit_layername(CArrayFacade<Byte> init_layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(init_layername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, init_layername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, init_layername);
		} else {
			__io__generic__copy( getInit_layername(), init_layername);
		}
	}

	/**
	 * Get method for struct member 'dry_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Approximately in how many frames should drying happen
	 * @see #__DNA__FIELD__dry_speed
	 */
	
	public int getDry_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 264);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'dry_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Approximately in how many frames should drying happen
	 * @see #__DNA__FIELD__dry_speed
	 */
	
	public void setDry_speed(int dry_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 264, dry_speed);
		} else {
			__io__block.writeInt(__io__address + 224, dry_speed);
		}
	}

	/**
	 * Get method for struct member 'diss_speed'.
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public int getDiss_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 268);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'diss_speed'.
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public void setDiss_speed(int diss_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 268, diss_speed);
		} else {
			__io__block.writeInt(__io__address + 228, diss_speed);
		}
	}

	/**
	 * Get method for struct member 'color_dry_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The wetness level when colors start to shift to the background
	 * @see #__DNA__FIELD__color_dry_threshold
	 */
	
	public float getColor_dry_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'color_dry_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The wetness level when colors start to shift to the background
	 * @see #__DNA__FIELD__color_dry_threshold
	 */
	
	public void setColor_dry_threshold(float color_dry_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, color_dry_threshold);
		} else {
			__io__block.writeFloat(__io__address + 232, color_dry_threshold);
		}
	}

	/**
	 * Get method for struct member 'depth_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of depth intersection in object space (use 0.0 to disable)
	 * @see #__DNA__FIELD__depth_clamp
	 */
	
	public float getDepth_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'depth_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of depth intersection in object space (use 0.0 to disable)
	 * @see #__DNA__FIELD__depth_clamp
	 */
	
	public void setDepth_clamp(float depth_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, depth_clamp);
		} else {
			__io__block.writeFloat(__io__address + 236, depth_clamp);
		}
	}

	/**
	 * Get method for struct member 'disp_factor'.
	 * @see #__DNA__FIELD__disp_factor
	 */
	
	public float getDisp_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'disp_factor'.
	 * @see #__DNA__FIELD__disp_factor
	 */
	
	public void setDisp_factor(float disp_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, disp_factor);
		} else {
			__io__block.writeFloat(__io__address + 240, disp_factor);
		}
	}

	/**
	 * Get method for struct member 'spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast spread effect moves on the canvas surface
	 * @see #__DNA__FIELD__spread_speed
	 */
	
	public float getSpread_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast spread effect moves on the canvas surface
	 * @see #__DNA__FIELD__spread_speed
	 */
	
	public void setSpread_speed(float spread_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, spread_speed);
		} else {
			__io__block.writeFloat(__io__address + 244, spread_speed);
		}
	}

	/**
	 * Get method for struct member 'color_spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast colors get mixed within wet paint
	 * @see #__DNA__FIELD__color_spread_speed
	 */
	
	public float getColor_spread_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'color_spread_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast colors get mixed within wet paint
	 * @see #__DNA__FIELD__color_spread_speed
	 */
	
	public void setColor_spread_speed(float color_spread_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, color_spread_speed);
		} else {
			__io__block.writeFloat(__io__address + 248, color_spread_speed);
		}
	}

	/**
	 * Get method for struct member 'shrink_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast shrink effect moves on the canvas surface
	 * @see #__DNA__FIELD__shrink_speed
	 */
	
	public float getShrink_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'shrink_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast shrink effect moves on the canvas surface
	 * @see #__DNA__FIELD__shrink_speed
	 */
	
	public void setShrink_speed(float shrink_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, shrink_speed);
		} else {
			__io__block.writeFloat(__io__address + 252, shrink_speed);
		}
	}

	/**
	 * Get method for struct member 'drip_vel'.
	 * @see #__DNA__FIELD__drip_vel
	 */
	
	public float getDrip_vel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'drip_vel'.
	 * @see #__DNA__FIELD__drip_vel
	 */
	
	public void setDrip_vel(float drip_vel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, drip_vel);
		} else {
			__io__block.writeFloat(__io__address + 256, drip_vel);
		}
	}

	/**
	 * Get method for struct member 'drip_acc'.
	 * @see #__DNA__FIELD__drip_acc
	 */
	
	public float getDrip_acc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'drip_acc'.
	 * @see #__DNA__FIELD__drip_acc
	 */
	
	public void setDrip_acc(float drip_acc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, drip_acc);
		} else {
			__io__block.writeFloat(__io__address + 260, drip_acc);
		}
	}

	/**
	 * Get method for struct member 'influence_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> per surface brush settings </p>
	 * @see #__DNA__FIELD__influence_scale
	 */
	
	public float getInfluence_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'influence_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> per surface brush settings </p>
	 * @see #__DNA__FIELD__influence_scale
	 */
	
	public void setInfluence_scale(float influence_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, influence_scale);
		} else {
			__io__block.writeFloat(__io__address + 264, influence_scale);
		}
	}

	/**
	 * Get method for struct member 'radius_scale'.
	 * @see #__DNA__FIELD__radius_scale
	 */
	
	public float getRadius_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'radius_scale'.
	 * @see #__DNA__FIELD__radius_scale
	 */
	
	public void setRadius_scale(float radius_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, radius_scale);
		} else {
			__io__block.writeFloat(__io__address + 268, radius_scale);
		}
	}

	/**
	 * Get method for struct member 'wave_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave damping factor<h4>Blender Source Code:</h4>
	 * <p> wave settings </p>
	 * @see #__DNA__FIELD__wave_damping
	 */
	
	public float getWave_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'wave_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave damping factor<h4>Blender Source Code:</h4>
	 * <p> wave settings </p>
	 * @see #__DNA__FIELD__wave_damping
	 */
	
	public void setWave_damping(float wave_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, wave_damping);
		} else {
			__io__block.writeFloat(__io__address + 272, wave_damping);
		}
	}

	/**
	 * Get method for struct member 'wave_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave propagation speed
	 * @see #__DNA__FIELD__wave_speed
	 */
	
	public float getWave_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'wave_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave propagation speed
	 * @see #__DNA__FIELD__wave_speed
	 */
	
	public void setWave_speed(float wave_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, wave_speed);
		} else {
			__io__block.writeFloat(__io__address + 276, wave_speed);
		}
	}

	/**
	 * Get method for struct member 'wave_timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave time scaling factor
	 * @see #__DNA__FIELD__wave_timescale
	 */
	
	public float getWave_timescale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'wave_timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wave time scaling factor
	 * @see #__DNA__FIELD__wave_timescale
	 */
	
	public void setWave_timescale(float wave_timescale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, wave_timescale);
		} else {
			__io__block.writeFloat(__io__address + 280, wave_timescale);
		}
	}

	/**
	 * Get method for struct member 'wave_spring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring force that pulls water level back to zero
	 * @see #__DNA__FIELD__wave_spring
	 */
	
	public float getWave_spring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 324);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'wave_spring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring force that pulls water level back to zero
	 * @see #__DNA__FIELD__wave_spring
	 */
	
	public void setWave_spring(float wave_spring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 324, wave_spring);
		} else {
			__io__block.writeFloat(__io__address + 284, wave_spring);
		}
	}

	/**
	 * Get method for struct member 'wave_smoothness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit maximum steepness of wave slope between simulation points (use higher values for smoother waves at expense of reduced detail)
	 * @see #__DNA__FIELD__wave_smoothness
	 */
	
	public float getWave_smoothness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'wave_smoothness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit maximum steepness of wave slope between simulation points (use higher values for smoother waves at expense of reduced detail)
	 * @see #__DNA__FIELD__wave_smoothness
	 */
	
	public void setWave_smoothness(float wave_smoothness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, wave_smoothness);
		} else {
			__io__block.writeFloat(__io__address + 288, wave_smoothness);
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
			return new CArrayFacade<Byte>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 332;
		} else {
			__dna__offset = 292;
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
	 * Get method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public CArrayFacade<Byte> getUvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 296;
		}
		if (__io__equals(uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvlayer_name);
		} else {
			__io__generic__copy( getUvlayer_name(), uvlayer_name);
		}
	}

	/**
	 * Get method for struct member 'image_output_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory to save the textures<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__image_output_path
	 */
	
	public CArrayFacade<Byte> getImage_output_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'image_output_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory to save the textures<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__image_output_path
	 */
	
	public void setImage_output_path(CArrayFacade<Byte> image_output_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 360;
		}
		if (__io__equals(image_output_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, image_output_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, image_output_path);
		} else {
			__io__generic__copy( getImage_output_path(), image_output_path);
		}
	}

	/**
	 * Get method for struct member 'output_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__output_name
	 */
	
	public CArrayFacade<Byte> getOutput_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'output_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__output_name
	 */
	
	public void setOutput_name(CArrayFacade<Byte> output_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1424;
		} else {
			__dna__offset = 1384;
		}
		if (__io__equals(output_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, output_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, output_name);
		} else {
			__io__generic__copy( getOutput_name(), output_name);
		}
	}

	/**
	 * Get method for struct member 'output_name2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME some surfaces have 2 outputs. </p>
	 * @see #__DNA__FIELD__output_name2
	 */
	
	public CArrayFacade<Byte> getOutput_name2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1448, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'output_name2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME some surfaces have 2 outputs. </p>
	 * @see #__DNA__FIELD__output_name2
	 */
	
	public void setOutput_name2(CArrayFacade<Byte> output_name2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1488;
		} else {
			__dna__offset = 1448;
		}
		if (__io__equals(output_name2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, output_name2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, output_name2);
		} else {
			__io__generic__copy( getOutput_name2(), output_name2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DynamicPaintSurface> __io__addressof() {
		return new CPointer<DynamicPaintSurface>(__io__address, new Class[]{DynamicPaintSurface.class}, __io__block, __io__blockTable);
	}

}
