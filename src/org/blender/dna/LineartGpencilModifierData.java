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
 * Generated facet for DNA struct type 'LineartGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=340, size64=368)
public class LineartGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct LineartGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for LineartGpencilModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 564;

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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  or {@link Collection} , from eLineartGpencilModifierSource </p>
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
	public static final long[] __DNA__FIELD__source_object = new long[]{100, 112};

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
	public static final long[] __DNA__FIELD__source_collection = new long[]{104, 120};

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
	public static final long[] __DNA__FIELD__target_material = new long[]{108, 128};

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
	public static final long[] __DNA__FIELD__target_layer = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'source_vertex_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__source_vertex_group = new long[]{176, 200};

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
	public static final long[] __DNA__FIELD__vgname = new long[]{240, 264};

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
	public static final long[] __DNA__FIELD__opacity = new long[]{304, 328};

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
	public static final long[] __DNA__FIELD__thickness = new long[]{308, 332};

	/**
	 * Field descriptor (offset) for struct member 'transparency_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eLineartGpencilTransparencyFlags </p>
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
	public static final long[] __DNA__FIELD__transparency_flags = new long[]{310, 334};

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
	public static final long[] __DNA__FIELD__transparency_mask = new long[]{311, 335};

	/**
	 * Field descriptor (offset) for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__crease_threshold = new long[]{312, 336};

	/**
	 * Field descriptor (offset) for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__angle_splitting_threshold = new long[]{316, 340};

	/**
	 * Field descriptor (offset) for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__chaining_image_threshold = new long[]{320, 344};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;Integer&gt; p__pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{324, 348};

	/**
	 * Field descriptor (offset) for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__calculation_flags = new long[]{328, 352};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional Switches. </p>
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
	public static final long[] __DNA__FIELD__flags = new long[]{332, 356};

	/**
	 * Field descriptor (offset) for struct member 'render_buffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineartGpencilModifierData lineartgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = lineartgpencilmodifierdata.__dna__addressof(LineartGpencilModifierData.__DNA__FIELD__render_buffer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_render_buffer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_buffer'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_buffer = new long[]{336, 360};

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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  or {@link Collection} , from eLineartGpencilModifierSource </p>
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  or {@link Collection} , from eLineartGpencilModifierSource </p>
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
	 * Get method for struct member 'source_object'.
	 * @see #__DNA__FIELD__source_object
	 */
	
	public CPointer<BlenderObject> getSource_object() throws IOException
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
	 * Set method for struct member 'source_object'.
	 * @see #__DNA__FIELD__source_object
	 */
	
	public void setSource_object(CPointer<BlenderObject> source_object) throws IOException
	{
		long __address = ((source_object == null) ? 0 : source_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
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
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
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
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
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
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 136;
		} else {
			__dna__offset = 112;
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
	 * <h4>Blender Source Code</h4>
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
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'source_vertex_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  specifies which vertex groups our strokes from source_vertex_group will go to. </p>
	 * @see #__DNA__FIELD__source_vertex_group
	 */
	
	public void setSource_vertex_group(CArrayFacade<Byte> source_vertex_group) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 176;
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
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 264;
		} else {
			__dna__offset = 240;
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
	 * Get method for struct member 'opacity'.
	 * @see #__DNA__FIELD__opacity
	 */
	
	public float getOpacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'opacity'.
	 * @see #__DNA__FIELD__opacity
	 */
	
	public void setOpacity(float opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, opacity);
		} else {
			__io__block.writeFloat(__io__address + 304, opacity);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 332);
		} else {
			return __io__block.readShort(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 332, thickness);
		} else {
			__io__block.writeShort(__io__address + 308, thickness);
		}
	}

	/**
	 * Get method for struct member 'transparency_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eLineartGpencilTransparencyFlags </p>
	 * @see #__DNA__FIELD__transparency_flags
	 */
	
	public byte getTransparency_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 334);
		} else {
			return __io__block.readByte(__io__address + 310);
		}
	}

	/**
	 * Set method for struct member 'transparency_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eLineartGpencilTransparencyFlags </p>
	 * @see #__DNA__FIELD__transparency_flags
	 */
	
	public void setTransparency_flags(byte transparency_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 334, transparency_flags);
		} else {
			__io__block.writeByte(__io__address + 310, transparency_flags);
		}
	}

	/**
	 * Get method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public byte getTransparency_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 335);
		} else {
			return __io__block.readByte(__io__address + 311);
		}
	}

	/**
	 * Set method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public void setTransparency_mask(byte transparency_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 335, transparency_mask);
		} else {
			__io__block.writeByte(__io__address + 311, transparency_mask);
		}
	}

	/**
	 * Get method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  range for cosine angle </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public float getCrease_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'crease_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  range for cosine angle </p>
	 * @see #__DNA__FIELD__crease_threshold
	 */
	
	public void setCrease_threshold(float crease_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, crease_threshold);
		} else {
			__io__block.writeFloat(__io__address + 312, crease_threshold);
		}
	}

	/**
	 * Get method for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  angle, for splitting strokes at sharp points. </p>
	 * @see #__DNA__FIELD__angle_splitting_threshold
	 */
	
	public float getAngle_splitting_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'angle_splitting_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  angle, for splitting strokes at sharp points. </p>
	 * @see #__DNA__FIELD__angle_splitting_threshold
	 */
	
	public void setAngle_splitting_threshold(float angle_splitting_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, angle_splitting_threshold);
		} else {
			__io__block.writeFloat(__io__address + 316, angle_splitting_threshold);
		}
	}

	/**
	 * Get method for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CPU mode </p>
	 * @see #__DNA__FIELD__chaining_image_threshold
	 */
	
	public float getChaining_image_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'chaining_image_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CPU mode </p>
	 * @see #__DNA__FIELD__chaining_image_threshold
	 */
	
	public void setChaining_image_threshold(float chaining_image_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, chaining_image_threshold);
		} else {
			__io__block.writeFloat(__io__address + 320, chaining_image_threshold);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public int get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 348);
		} else {
			return __io__block.readInt(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(int _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 348, _pad);
		} else {
			__io__block.writeInt(__io__address + 324, _pad);
		}
	}

	/**
	 * Get method for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ported from SceneLineArt flags. </p>
	 * @see #__DNA__FIELD__calculation_flags
	 */
	
	public int getCalculation_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 352);
		} else {
			return __io__block.readInt(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'calculation_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ported from SceneLineArt flags. </p>
	 * @see #__DNA__FIELD__calculation_flags
	 */
	
	public void setCalculation_flags(int calculation_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 352, calculation_flags);
		} else {
			__io__block.writeInt(__io__address + 328, calculation_flags);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional Switches. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 356);
		} else {
			return __io__block.readInt(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional Switches. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 356, flags);
		} else {
			__io__block.writeInt(__io__address + 332, flags);
		}
	}

	/**
	 * Get method for struct member 'render_buffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__render_buffer
	 */
	
	public CPointer<Object> getRender_buffer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'render_buffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__render_buffer
	 */
	
	public void setRender_buffer(CPointer<Object> render_buffer) throws IOException
	{
		long __address = ((render_buffer == null) ? 0 : render_buffer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineartGpencilModifierData> __io__addressof() {
		return new CPointer<LineartGpencilModifierData>(__io__address, new Class[]{LineartGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
