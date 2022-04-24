package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineartGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=364, size64=400)
public class LineartGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct LineartGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for LineartGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 625;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'line_types'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__line_types);
	 * CPointer&lt;Short&gt; p_line_types = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_types'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_types = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'source_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  or {@link Collection} , from #eLineartGpencilModifierSource. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__source_type);
	 * CPointer&lt;Byte&gt; p_source_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_type = new long[]{94, 106};

	/**
	 * Field descriptor (offset) for struct member 'use_multiple_levels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__use_multiple_levels);
	 * CPointer&lt;Byte&gt; p_use_multiple_levels = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_multiple_levels'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_multiple_levels = new long[]{95, 107};

	/**
	 * Field descriptor (offset) for struct member 'level_start'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__level_start);
	 * CPointer&lt;Short&gt; p_level_start = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_start'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_start = new long[]{96, 108};

	/**
	 * Field descriptor (offset) for struct member 'level_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__level_end);
	 * CPointer&lt;Short&gt; p_level_end = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_end'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_end = new long[]{98, 110};

	/**
	 * Field descriptor (offset) for struct member 'source_camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__source_camera);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_source_camera = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_camera'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_camera = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'source_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__source_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_source_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_object = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'source_collection'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__source_collection);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_source_collection = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_collection'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_collection = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'target_material'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__target_material);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_target_material = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_material'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_material = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'target_layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__target_layer);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_target_layer = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_layer'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_layer = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'source_vertex_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  specifies which vertex groups our strokes from source_vertex_group will go to. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__source_vertex_group);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_source_vertex_group = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_vertex_group'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_vertex_group = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'vgname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__vgname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgname = new long[]{244, 272};

	/**
	 * Field descriptor (offset) for struct member 'overscan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}<code></code> , before calculation, which give a wider FOV, this doesn't change coordinates range internally (-1, 1), but makes the calculated frame bigger than actual output. This is for the easier shifting calculation. A value of 0.5 means the "internal" focal length become 2/3 of the actual camera. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__overscan);
	 * CPointer&lt;Float&gt; p_overscan = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overscan'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overscan = new long[]{308, 336};

	/**
	 * Field descriptor (offset) for struct member 'opacity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__opacity);
	 * CPointer&lt;Float&gt; p_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opacity = new long[]{312, 340};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{316, 344};

	/**
	 * Field descriptor (offset) for struct member 'transparency_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__transparency_flags);
	 * CPointer&lt;Byte&gt; p_transparency_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transparency_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transparency_flags = new long[]{318, 346};

	/**
	 * Field descriptor (offset) for struct member 'transparency_mask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__transparency_mask);
	 * CPointer&lt;Byte&gt; p_transparency_mask = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transparency_mask'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transparency_mask = new long[]{319, 347};

	/**
	 * Field descriptor (offset) for struct member 'intersection_mask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__intersection_mask);
	 * CPointer&lt;Byte&gt; p_intersection_mask = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'intersection_mask'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__intersection_mask = new long[]{320, 348};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{321, 349};

	/**
	 * Field descriptor (offset) for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  range for cosine angle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__crease_threshold);
	 * CPointer&lt;Float&gt; p_crease_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_threshold = new long[]{324, 352};

	/**
	 * Field descriptor (offset) for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  angle, for splitting strokes at sharp points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__angle_splitting_threshold);
	 * CPointer&lt;Float&gt; p_angle_splitting_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle_splitting_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle_splitting_threshold = new long[]{328, 356};

	/**
	 * Field descriptor (offset) for struct member 'chain_smooth_tolerance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength for smoothing jagged chains. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__chain_smooth_tolerance);
	 * CPointer&lt;Float&gt; p_chain_smooth_tolerance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chain_smooth_tolerance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chain_smooth_tolerance = new long[]{332, 360};

	/**
	 * Field descriptor (offset) for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CPU mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__chaining_image_threshold);
	 * CPointer&lt;Float&gt; p_chaining_image_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chaining_image_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chaining_image_threshold = new long[]{336, 364};

	/**
	 * Field descriptor (offset) for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ported from SceneLineArt flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__calculation_flags);
	 * CPointer&lt;Integer&gt; p_calculation_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'calculation_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__calculation_flags = new long[]{340, 368};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eLineArtGPencilModifierFlags} , modifier internal state. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{344, 372};

	/**
	 * Field descriptor (offset) for struct member 'stroke_depth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Move strokes towards camera to avoid clipping while preserve depth for the viewport. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__stroke_depth_offset);
	 * CPointer&lt;Float&gt; p_stroke_depth_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stroke_depth_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stroke_depth_offset = new long[]{348, 376};

	/**
	 * Field descriptor (offset) for struct member 'level_start_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. Because we can potentially only compute features lines once per modifier stack (Use Cache), we need to have these override values to ensure that we have the data we need is computed and stored in the cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__level_start_override);
	 * CPointer&lt;Byte&gt; p_level_start_override = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_start_override'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_start_override = new long[]{352, 380};

	/**
	 * Field descriptor (offset) for struct member 'level_end_override'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__level_end_override);
	 * CPointer&lt;Byte&gt; p_level_end_override = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_end_override'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_end_override = new long[]{353, 381};

	/**
	 * Field descriptor (offset) for struct member 'edge_types_override'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__edge_types_override);
	 * CPointer&lt;Short&gt; p_edge_types_override = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_types_override'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_types_override = new long[]{354, 382};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'LineartCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{356, 384};

	/**
	 * Field descriptor (offset) for struct member 'render_buffer_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep a pointer to the render buffer so we can call destroy from {@link ModifierData} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__render_buffer_ptr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_render_buffer_ptr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_buffer_ptr'</li>
	 * <li>Signature: 'LineartRenderBuffer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_buffer_ptr = new long[]{360, 392};

	public LineartGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineartGpencilModifierData(LineartGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'line_types'.
	 * @see #__DNA__FIELD__line_types
	 */
	
	public short getLine_types() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'line_types'.
	 * @see #__DNA__FIELD__line_types
	 */
	
	public void setLine_types(short line_types) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, line_types);
		} else {
			__io__block.writeShort(__io__address + 92, line_types);
		}
	}

	/**
	 * Get method for struct member 'source_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  or {@link Collection} , from #eLineartGpencilModifierSource. </p>
	 * @see #__DNA__FIELD__source_type
	 */
	
	public byte getSource_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 106);
		} else {
			return __io__block.readByte(__io__address + 94);
		}
	}

	/**
	 * Set method for struct member 'source_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  or {@link Collection} , from #eLineartGpencilModifierSource. </p>
	 * @see #__DNA__FIELD__source_type
	 */
	
	public void setSource_type(byte source_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 106, source_type);
		} else {
			__io__block.writeByte(__io__address + 94, source_type);
		}
	}

	/**
	 * Get method for struct member 'use_multiple_levels'.
	 * @see #__DNA__FIELD__use_multiple_levels
	 */
	
	public byte getUse_multiple_levels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 107);
		} else {
			return __io__block.readByte(__io__address + 95);
		}
	}

	/**
	 * Set method for struct member 'use_multiple_levels'.
	 * @see #__DNA__FIELD__use_multiple_levels
	 */
	
	public void setUse_multiple_levels(byte use_multiple_levels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 107, use_multiple_levels);
		} else {
			__io__block.writeByte(__io__address + 95, use_multiple_levels);
		}
	}

	/**
	 * Get method for struct member 'level_start'.
	 * @see #__DNA__FIELD__level_start
	 */
	
	public short getLevel_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 108);
		} else {
			return __io__block.readShort(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'level_start'.
	 * @see #__DNA__FIELD__level_start
	 */
	
	public void setLevel_start(short level_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 108, level_start);
		} else {
			__io__block.writeShort(__io__address + 96, level_start);
		}
	}

	/**
	 * Get method for struct member 'level_end'.
	 * @see #__DNA__FIELD__level_end
	 */
	
	public short getLevel_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 110);
		} else {
			return __io__block.readShort(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'level_end'.
	 * @see #__DNA__FIELD__level_end
	 */
	
	public void setLevel_end(short level_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 110, level_end);
		} else {
			__io__block.writeShort(__io__address + 98, level_end);
		}
	}

	/**
	 * Get method for struct member 'source_camera'.
	 * @see #__DNA__FIELD__source_camera
	 */
	
	public CPointer<BlenderObject> getSource_camera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'source_camera'.
	 * @see #__DNA__FIELD__source_camera
	 */
	
	public void setSource_camera(CPointer<BlenderObject> source_camera) throws IOException
	{
		long __address = ((source_camera == null) ? 0 : source_camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'source_object'.
	 * @see #__DNA__FIELD__source_object
	 */
	
	public CPointer<BlenderObject> getSource_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'source_object'.
	 * @see #__DNA__FIELD__source_object
	 */
	
	public void setSource_object(CPointer<BlenderObject> source_object) throws IOException
	{
		long __address = ((source_object == null) ? 0 : source_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'source_collection'.
	 * @see #__DNA__FIELD__source_collection
	 */
	
	public CPointer<Collection> getSource_collection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'source_collection'.
	 * @see #__DNA__FIELD__source_collection
	 */
	
	public void setSource_collection(CPointer<Collection> source_collection) throws IOException
	{
		long __address = ((source_collection == null) ? 0 : source_collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'target_material'.
	 * @see #__DNA__FIELD__target_material
	 */
	
	public CPointer<Material> getTarget_material() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Material.class};
		return new CPointer<Material>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Material.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target_material'.
	 * @see #__DNA__FIELD__target_material
	 */
	
	public void setTarget_material(CPointer<Material> target_material) throws IOException
	{
		long __address = ((target_material == null) ? 0 : target_material.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'target_layer'.
	 * @see #__DNA__FIELD__target_layer
	 */
	
	public CArrayFacade<Byte> getTarget_layer() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'target_layer'.
	 * @see #__DNA__FIELD__target_layer
	 */
	
	public void setTarget_layer(CArrayFacade<Byte> target_layer) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(target_layer, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, target_layer)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, target_layer);
		} else {
			__io__generic__copy( getTarget_layer(), target_layer);
		}
	}

	/**
	 * Get method for struct member 'source_vertex_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  specifies which vertex groups our strokes from source_vertex_group will go to. </p>
	 * @see #__DNA__FIELD__source_vertex_group
	 */
	
	public CArrayFacade<Byte> getSource_vertex_group() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'source_vertex_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  specifies which vertex groups our strokes from source_vertex_group will go to. </p>
	 * @see #__DNA__FIELD__source_vertex_group
	 */
	
	public void setSource_vertex_group(CArrayFacade<Byte> source_vertex_group) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(source_vertex_group, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, source_vertex_group)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, source_vertex_group);
		} else {
			__io__generic__copy( getSource_vertex_group(), source_vertex_group);
		}
	}

	/**
	 * Get method for struct member 'vgname'.
	 * @see #__DNA__FIELD__vgname
	 */
	
	public CArrayFacade<Byte> getVgname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgname'.
	 * @see #__DNA__FIELD__vgname
	 */
	
	public void setVgname(CArrayFacade<Byte> vgname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 244;
		}
		if (__io__equals(vgname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgname);
		} else {
			__io__generic__copy( getVgname(), vgname);
		}
	}

	/**
	 * Get method for struct member 'overscan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}<code></code> , before calculation, which give a wider FOV, this doesn't change coordinates range internally (-1, 1), but makes the calculated frame bigger than actual output. This is for the easier shifting calculation. A value of 0.5 means the "internal" focal length become 2/3 of the actual camera. </p>
	 * @see #__DNA__FIELD__overscan
	 */
	
	public float getOverscan() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'overscan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}<code></code> , before calculation, which give a wider FOV, this doesn't change coordinates range internally (-1, 1), but makes the calculated frame bigger than actual output. This is for the easier shifting calculation. A value of 0.5 means the "internal" focal length become 2/3 of the actual camera. </p>
	 * @see #__DNA__FIELD__overscan
	 */
	
	public void setOverscan(float overscan) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, overscan);
		} else {
			__io__block.writeFloat(__io__address + 308, overscan);
		}
	}

	/**
	 * Get method for struct member 'opacity'.
	 * @see #__DNA__FIELD__opacity
	 */
	
	public float getOpacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'opacity'.
	 * @see #__DNA__FIELD__opacity
	 */
	
	public void setOpacity(float opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, opacity);
		} else {
			__io__block.writeFloat(__io__address + 312, opacity);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 344);
		} else {
			return __io__block.readShort(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 344, thickness);
		} else {
			__io__block.writeShort(__io__address + 316, thickness);
		}
	}

	/**
	 * Get method for struct member 'transparency_flags'.
	 * @see #__DNA__FIELD__transparency_flags
	 */
	
	public byte getTransparency_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 346);
		} else {
			return __io__block.readByte(__io__address + 318);
		}
	}

	/**
	 * Set method for struct member 'transparency_flags'.
	 * @see #__DNA__FIELD__transparency_flags
	 */
	
	public void setTransparency_flags(byte transparency_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 346, transparency_flags);
		} else {
			__io__block.writeByte(__io__address + 318, transparency_flags);
		}
	}

	/**
	 * Get method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public byte getTransparency_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 347);
		} else {
			return __io__block.readByte(__io__address + 319);
		}
	}

	/**
	 * Set method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public void setTransparency_mask(byte transparency_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 347, transparency_mask);
		} else {
			__io__block.writeByte(__io__address + 319, transparency_mask);
		}
	}

	/**
	 * Get method for struct member 'intersection_mask'.
	 * @see #__DNA__FIELD__intersection_mask
	 */
	
	public byte getIntersection_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 348);
		} else {
			return __io__block.readByte(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'intersection_mask'.
	 * @see #__DNA__FIELD__intersection_mask
	 */
	
	public void setIntersection_mask(byte intersection_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 348, intersection_mask);
		} else {
			__io__block.writeByte(__io__address + 320, intersection_mask);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 349, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 321, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 349;
		} else {
			__dna__offset = 321;
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
	 * Get method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  range for cosine angle </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public float getCrease_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  range for cosine angle </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public void setCrease_threshold(float crease_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, crease_threshold);
		} else {
			__io__block.writeFloat(__io__address + 324, crease_threshold);
		}
	}

	/**
	 * Get method for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  angle, for splitting strokes at sharp points. </p>
	 * @see #__DNA__FIELD__angle_splitting_threshold
	 */
	
	public float getAngle_splitting_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 356);
		} else {
			return __io__block.readFloat(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  angle, for splitting strokes at sharp points. </p>
	 * @see #__DNA__FIELD__angle_splitting_threshold
	 */
	
	public void setAngle_splitting_threshold(float angle_splitting_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 356, angle_splitting_threshold);
		} else {
			__io__block.writeFloat(__io__address + 328, angle_splitting_threshold);
		}
	}

	/**
	 * Get method for struct member 'chain_smooth_tolerance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength for smoothing jagged chains. </p>
	 * @see #__DNA__FIELD__chain_smooth_tolerance
	 */
	
	public float getChain_smooth_tolerance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 360);
		} else {
			return __io__block.readFloat(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'chain_smooth_tolerance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength for smoothing jagged chains. </p>
	 * @see #__DNA__FIELD__chain_smooth_tolerance
	 */
	
	public void setChain_smooth_tolerance(float chain_smooth_tolerance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 360, chain_smooth_tolerance);
		} else {
			__io__block.writeFloat(__io__address + 332, chain_smooth_tolerance);
		}
	}

	/**
	 * Get method for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CPU mode </p>
	 * @see #__DNA__FIELD__chaining_image_threshold
	 */
	
	public float getChaining_image_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CPU mode </p>
	 * @see #__DNA__FIELD__chaining_image_threshold
	 */
	
	public void setChaining_image_threshold(float chaining_image_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, chaining_image_threshold);
		} else {
			__io__block.writeFloat(__io__address + 336, chaining_image_threshold);
		}
	}

	/**
	 * Get method for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ported from SceneLineArt flags. </p>
	 * @see #__DNA__FIELD__calculation_flags
	 */
	
	public int getCalculation_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 368);
		} else {
			return __io__block.readInt(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ported from SceneLineArt flags. </p>
	 * @see #__DNA__FIELD__calculation_flags
	 */
	
	public void setCalculation_flags(int calculation_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 368, calculation_flags);
		} else {
			__io__block.writeInt(__io__address + 340, calculation_flags);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eLineArtGPencilModifierFlags} , modifier internal state. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 372);
		} else {
			return __io__block.readInt(__io__address + 344);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eLineArtGPencilModifierFlags} , modifier internal state. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 372, flags);
		} else {
			__io__block.writeInt(__io__address + 344, flags);
		}
	}

	/**
	 * Get method for struct member 'stroke_depth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Move strokes towards camera to avoid clipping while preserve depth for the viewport. </p>
	 * @see #__DNA__FIELD__stroke_depth_offset
	 */
	
	public float getStroke_depth_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 376);
		} else {
			return __io__block.readFloat(__io__address + 348);
		}
	}

	/**
	 * Set method for struct member 'stroke_depth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Move strokes towards camera to avoid clipping while preserve depth for the viewport. </p>
	 * @see #__DNA__FIELD__stroke_depth_offset
	 */
	
	public void setStroke_depth_offset(float stroke_depth_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 376, stroke_depth_offset);
		} else {
			__io__block.writeFloat(__io__address + 348, stroke_depth_offset);
		}
	}

	/**
	 * Get method for struct member 'level_start_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. Because we can potentially only compute features lines once per modifier stack (Use Cache), we need to have these override values to ensure that we have the data we need is computed and stored in the cache. </p>
	 * @see #__DNA__FIELD__level_start_override
	 */
	
	public byte getLevel_start_override() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 380);
		} else {
			return __io__block.readByte(__io__address + 352);
		}
	}

	/**
	 * Set method for struct member 'level_start_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. Because we can potentially only compute features lines once per modifier stack (Use Cache), we need to have these override values to ensure that we have the data we need is computed and stored in the cache. </p>
	 * @see #__DNA__FIELD__level_start_override
	 */
	
	public void setLevel_start_override(byte level_start_override) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 380, level_start_override);
		} else {
			__io__block.writeByte(__io__address + 352, level_start_override);
		}
	}

	/**
	 * Get method for struct member 'level_end_override'.
	 * @see #__DNA__FIELD__level_end_override
	 */
	
	public byte getLevel_end_override() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 381);
		} else {
			return __io__block.readByte(__io__address + 353);
		}
	}

	/**
	 * Set method for struct member 'level_end_override'.
	 * @see #__DNA__FIELD__level_end_override
	 */
	
	public void setLevel_end_override(byte level_end_override) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 381, level_end_override);
		} else {
			__io__block.writeByte(__io__address + 353, level_end_override);
		}
	}

	/**
	 * Get method for struct member 'edge_types_override'.
	 * @see #__DNA__FIELD__edge_types_override
	 */
	
	public short getEdge_types_override() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 382);
		} else {
			return __io__block.readShort(__io__address + 354);
		}
	}

	/**
	 * Set method for struct member 'edge_types_override'.
	 * @see #__DNA__FIELD__edge_types_override
	 */
	
	public void setEdge_types_override(short edge_types_override) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 382, edge_types_override);
		} else {
			__io__block.writeShort(__io__address + 354, edge_types_override);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 356);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 356, __address);
		}
	}

	/**
	 * Get method for struct member 'render_buffer_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep a pointer to the render buffer so we can call destroy from {@link ModifierData} . </p>
	 * @see #__DNA__FIELD__render_buffer_ptr
	 */
	
	public CPointer<Object> getRender_buffer_ptr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'render_buffer_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep a pointer to the render buffer so we can call destroy from {@link ModifierData} . </p>
	 * @see #__DNA__FIELD__render_buffer_ptr
	 */
	
	public void setRender_buffer_ptr(CPointer<Object> render_buffer_ptr) throws IOException
	{
		long __address = ((render_buffer_ptr == null) ? 0 : render_buffer_ptr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 360, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineartGpencilModifierData> __io__addressof() {
		return new CPointer<LineartGpencilModifierData>(__io__address, new Class[]{LineartGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
