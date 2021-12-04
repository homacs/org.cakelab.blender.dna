package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View3DOverlay'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> 3D Viewport Overlay settings. </p>
 */

@CMetaData(size32=88, size64=88)
public class View3DOverlay extends CFacade {

	/**
	 * This is the sdna index of the struct View3DOverlay.
	 * <p>
	 * It is required when allocating a new block to store data for View3DOverlay.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 223;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'edit_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edit mode settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__edit_flag);
	 * CPointer&lt;Integer&gt; p_edit_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_flag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'normals_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for normals in the 3D view
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__normals_length);
	 * CPointer&lt;Float&gt; p_normals_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normals_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normals_length = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'normals_constant_screen_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen size for normals in the 3D view
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__normals_constant_screen_size);
	 * CPointer&lt;Float&gt; p_normals_constant_screen_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normals_constant_screen_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normals_constant_screen_size = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'backwire_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity when rendering transparent wires
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__backwire_opacity);
	 * CPointer&lt;Float&gt; p_backwire_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'backwire_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__backwire_opacity = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'paint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  mode settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__paint_flag);
	 * CPointer&lt;Integer&gt; p_paint_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_flag = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'wpaint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint mode settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__wpaint_flag);
	 * CPointer&lt;Integer&gt; p_wpaint_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wpaint_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wpaint_flag = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'texture_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay<h4>Blender Source Code:</h4>
	 * <p> Alpha for texture, weight, vertex paint overlay. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__texture_paint_mode_opacity);
	 * CPointer&lt;Float&gt; p_texture_paint_mode_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_paint_mode_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_paint_mode_opacity = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'vertex_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__vertex_paint_mode_opacity);
	 * CPointer&lt;Float&gt; p_vertex_paint_mode_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_paint_mode_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_paint_mode_opacity = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'weight_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the weight paint mode overlay
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__weight_paint_mode_opacity);
	 * CPointer&lt;Float&gt; p_weight_paint_mode_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight_paint_mode_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight_paint_mode_opacity = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_mode_mask_opacity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__sculpt_mode_mask_opacity);
	 * CPointer&lt;Float&gt; p_sculpt_mode_mask_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_mode_mask_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_mode_mask_opacity = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_mode_face_sets_opacity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__sculpt_mode_face_sets_opacity);
	 * CPointer&lt;Float&gt; p_sculpt_mode_face_sets_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_mode_face_sets_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_mode_face_sets_opacity = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'xray_alpha_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity to use for bone selection<h4>Blender Source Code:</h4>
	 * <p> Armature edit/pose mode settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__xray_alpha_bone);
	 * CPointer&lt;Float&gt; p_xray_alpha_bone = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xray_alpha_bone'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xray_alpha_bone = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'fade_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Darken Inactive. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__fade_alpha);
	 * CPointer&lt;Float&gt; p_fade_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fade_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fade_alpha = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'wireframe_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the angle threshold for displaying edges (1.0 for all)<h4>Blender Source Code:</h4>
	 * <p> Other settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__wireframe_threshold);
	 * CPointer&lt;Float&gt; p_wireframe_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wireframe_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wireframe_threshold = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'wireframe_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the displayed edges (1.0 for opaque)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__wireframe_opacity);
	 * CPointer&lt;Float&gt; p_wireframe_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wireframe_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wireframe_opacity = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_paper_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__gpencil_paper_opacity);
	 * CPointer&lt;Float&gt; p_gpencil_paper_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_paper_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_paper_opacity = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_grid_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Canvas grid opacity
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__gpencil_grid_opacity);
	 * CPointer&lt;Float&gt; p_gpencil_grid_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_grid_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_grid_opacity = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_fade_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fade layer opacity for Grease Pencil layers except the active one
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__gpencil_fade_layer);
	 * CPointer&lt;Float&gt; p_gpencil_fade_layer = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_fade_layer'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_fade_layer = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex Paint mix factor<h4>Blender Source Code:</h4>
	 * <p> Factor for mixing vertex paint with original color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__gpencil_vertex_paint_opacity);
	 * CPointer&lt;Float&gt; p_gpencil_vertex_paint_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_vertex_paint_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_vertex_paint_opacity = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'handle_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handles display type for curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD__handle_display);
	 * CPointer&lt;Integer&gt; p_handle_display = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_display'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_display = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DOverlay view3doverlay = ...;
	 * CPointer&lt;Object&gt; p = view3doverlay.__dna__addressof(View3DOverlay.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{84, 84};

	public View3DOverlay(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3DOverlay(View3DOverlay that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'edit_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edit mode settings. </p>
	 * @see #__DNA__FIELD__edit_flag
	 */
	
	public int getEdit_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'edit_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edit mode settings. </p>
	 * @see #__DNA__FIELD__edit_flag
	 */
	
	public void setEdit_flag(int edit_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, edit_flag);
		} else {
			__io__block.writeInt(__io__address + 4, edit_flag);
		}
	}

	/**
	 * Get method for struct member 'normals_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for normals in the 3D view
	 * @see #__DNA__FIELD__normals_length
	 */
	
	public float getNormals_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'normals_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for normals in the 3D view
	 * @see #__DNA__FIELD__normals_length
	 */
	
	public void setNormals_length(float normals_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, normals_length);
		} else {
			__io__block.writeFloat(__io__address + 8, normals_length);
		}
	}

	/**
	 * Get method for struct member 'normals_constant_screen_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen size for normals in the 3D view
	 * @see #__DNA__FIELD__normals_constant_screen_size
	 */
	
	public float getNormals_constant_screen_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'normals_constant_screen_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen size for normals in the 3D view
	 * @see #__DNA__FIELD__normals_constant_screen_size
	 */
	
	public void setNormals_constant_screen_size(float normals_constant_screen_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, normals_constant_screen_size);
		} else {
			__io__block.writeFloat(__io__address + 12, normals_constant_screen_size);
		}
	}

	/**
	 * Get method for struct member 'backwire_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity when rendering transparent wires
	 * @see #__DNA__FIELD__backwire_opacity
	 */
	
	public float getBackwire_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'backwire_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity when rendering transparent wires
	 * @see #__DNA__FIELD__backwire_opacity
	 */
	
	public void setBackwire_opacity(float backwire_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, backwire_opacity);
		} else {
			__io__block.writeFloat(__io__address + 16, backwire_opacity);
		}
	}

	/**
	 * Get method for struct member 'paint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  mode settings. </p>
	 * @see #__DNA__FIELD__paint_flag
	 */
	
	public int getPaint_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'paint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  mode settings. </p>
	 * @see #__DNA__FIELD__paint_flag
	 */
	
	public void setPaint_flag(int paint_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, paint_flag);
		} else {
			__io__block.writeInt(__io__address + 20, paint_flag);
		}
	}

	/**
	 * Get method for struct member 'wpaint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint mode settings. </p>
	 * @see #__DNA__FIELD__wpaint_flag
	 */
	
	public int getWpaint_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'wpaint_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint mode settings. </p>
	 * @see #__DNA__FIELD__wpaint_flag
	 */
	
	public void setWpaint_flag(int wpaint_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, wpaint_flag);
		} else {
			__io__block.writeInt(__io__address + 24, wpaint_flag);
		}
	}

	/**
	 * Get method for struct member 'texture_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay<h4>Blender Source Code:</h4>
	 * <p> Alpha for texture, weight, vertex paint overlay. </p>
	 * @see #__DNA__FIELD__texture_paint_mode_opacity
	 */
	
	public float getTexture_paint_mode_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'texture_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay<h4>Blender Source Code:</h4>
	 * <p> Alpha for texture, weight, vertex paint overlay. </p>
	 * @see #__DNA__FIELD__texture_paint_mode_opacity
	 */
	
	public void setTexture_paint_mode_opacity(float texture_paint_mode_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, texture_paint_mode_opacity);
		} else {
			__io__block.writeFloat(__io__address + 28, texture_paint_mode_opacity);
		}
	}

	/**
	 * Get method for struct member 'vertex_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay
	 * @see #__DNA__FIELD__vertex_paint_mode_opacity
	 */
	
	public float getVertex_paint_mode_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'vertex_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the texture paint mode stencil mask overlay
	 * @see #__DNA__FIELD__vertex_paint_mode_opacity
	 */
	
	public void setVertex_paint_mode_opacity(float vertex_paint_mode_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, vertex_paint_mode_opacity);
		} else {
			__io__block.writeFloat(__io__address + 32, vertex_paint_mode_opacity);
		}
	}

	/**
	 * Get method for struct member 'weight_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the weight paint mode overlay
	 * @see #__DNA__FIELD__weight_paint_mode_opacity
	 */
	
	public float getWeight_paint_mode_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'weight_paint_mode_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the weight paint mode overlay
	 * @see #__DNA__FIELD__weight_paint_mode_opacity
	 */
	
	public void setWeight_paint_mode_opacity(float weight_paint_mode_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, weight_paint_mode_opacity);
		} else {
			__io__block.writeFloat(__io__address + 36, weight_paint_mode_opacity);
		}
	}

	/**
	 * Get method for struct member 'sculpt_mode_mask_opacity'.
	 * @see #__DNA__FIELD__sculpt_mode_mask_opacity
	 */
	
	public float getSculpt_mode_mask_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'sculpt_mode_mask_opacity'.
	 * @see #__DNA__FIELD__sculpt_mode_mask_opacity
	 */
	
	public void setSculpt_mode_mask_opacity(float sculpt_mode_mask_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, sculpt_mode_mask_opacity);
		} else {
			__io__block.writeFloat(__io__address + 40, sculpt_mode_mask_opacity);
		}
	}

	/**
	 * Get method for struct member 'sculpt_mode_face_sets_opacity'.
	 * @see #__DNA__FIELD__sculpt_mode_face_sets_opacity
	 */
	
	public float getSculpt_mode_face_sets_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'sculpt_mode_face_sets_opacity'.
	 * @see #__DNA__FIELD__sculpt_mode_face_sets_opacity
	 */
	
	public void setSculpt_mode_face_sets_opacity(float sculpt_mode_face_sets_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, sculpt_mode_face_sets_opacity);
		} else {
			__io__block.writeFloat(__io__address + 44, sculpt_mode_face_sets_opacity);
		}
	}

	/**
	 * Get method for struct member 'xray_alpha_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity to use for bone selection<h4>Blender Source Code:</h4>
	 * <p> Armature edit/pose mode settings. </p>
	 * @see #__DNA__FIELD__xray_alpha_bone
	 */
	
	public float getXray_alpha_bone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'xray_alpha_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity to use for bone selection<h4>Blender Source Code:</h4>
	 * <p> Armature edit/pose mode settings. </p>
	 * @see #__DNA__FIELD__xray_alpha_bone
	 */
	
	public void setXray_alpha_bone(float xray_alpha_bone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, xray_alpha_bone);
		} else {
			__io__block.writeFloat(__io__address + 48, xray_alpha_bone);
		}
	}

	/**
	 * Get method for struct member 'fade_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Darken Inactive. </p>
	 * @see #__DNA__FIELD__fade_alpha
	 */
	
	public float getFade_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'fade_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Darken Inactive. </p>
	 * @see #__DNA__FIELD__fade_alpha
	 */
	
	public void setFade_alpha(float fade_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, fade_alpha);
		} else {
			__io__block.writeFloat(__io__address + 52, fade_alpha);
		}
	}

	/**
	 * Get method for struct member 'wireframe_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the angle threshold for displaying edges (1.0 for all)<h4>Blender Source Code:</h4>
	 * <p> Other settings. </p>
	 * @see #__DNA__FIELD__wireframe_threshold
	 */
	
	public float getWireframe_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'wireframe_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the angle threshold for displaying edges (1.0 for all)<h4>Blender Source Code:</h4>
	 * <p> Other settings. </p>
	 * @see #__DNA__FIELD__wireframe_threshold
	 */
	
	public void setWireframe_threshold(float wireframe_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, wireframe_threshold);
		} else {
			__io__block.writeFloat(__io__address + 56, wireframe_threshold);
		}
	}

	/**
	 * Get method for struct member 'wireframe_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the displayed edges (1.0 for opaque)
	 * @see #__DNA__FIELD__wireframe_opacity
	 */
	
	public float getWireframe_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'wireframe_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the displayed edges (1.0 for opaque)
	 * @see #__DNA__FIELD__wireframe_opacity
	 */
	
	public void setWireframe_opacity(float wireframe_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, wireframe_opacity);
		} else {
			__io__block.writeFloat(__io__address + 60, wireframe_opacity);
		}
	}

	/**
	 * Get method for struct member 'gpencil_paper_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil settings. </p>
	 * @see #__DNA__FIELD__gpencil_paper_opacity
	 */
	
	public float getGpencil_paper_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'gpencil_paper_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil settings. </p>
	 * @see #__DNA__FIELD__gpencil_paper_opacity
	 */
	
	public void setGpencil_paper_opacity(float gpencil_paper_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, gpencil_paper_opacity);
		} else {
			__io__block.writeFloat(__io__address + 64, gpencil_paper_opacity);
		}
	}

	/**
	 * Get method for struct member 'gpencil_grid_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Canvas grid opacity
	 * @see #__DNA__FIELD__gpencil_grid_opacity
	 */
	
	public float getGpencil_grid_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'gpencil_grid_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Canvas grid opacity
	 * @see #__DNA__FIELD__gpencil_grid_opacity
	 */
	
	public void setGpencil_grid_opacity(float gpencil_grid_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, gpencil_grid_opacity);
		} else {
			__io__block.writeFloat(__io__address + 68, gpencil_grid_opacity);
		}
	}

	/**
	 * Get method for struct member 'gpencil_fade_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fade layer opacity for Grease Pencil layers except the active one
	 * @see #__DNA__FIELD__gpencil_fade_layer
	 */
	
	public float getGpencil_fade_layer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'gpencil_fade_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fade layer opacity for Grease Pencil layers except the active one
	 * @see #__DNA__FIELD__gpencil_fade_layer
	 */
	
	public void setGpencil_fade_layer(float gpencil_fade_layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, gpencil_fade_layer);
		} else {
			__io__block.writeFloat(__io__address + 72, gpencil_fade_layer);
		}
	}

	/**
	 * Get method for struct member 'gpencil_vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex Paint mix factor<h4>Blender Source Code:</h4>
	 * <p> Factor for mixing vertex paint with original color </p>
	 * @see #__DNA__FIELD__gpencil_vertex_paint_opacity
	 */
	
	public float getGpencil_vertex_paint_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'gpencil_vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Vertex Paint mix factor<h4>Blender Source Code:</h4>
	 * <p> Factor for mixing vertex paint with original color </p>
	 * @see #__DNA__FIELD__gpencil_vertex_paint_opacity
	 */
	
	public void setGpencil_vertex_paint_opacity(float gpencil_vertex_paint_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, gpencil_vertex_paint_opacity);
		} else {
			__io__block.writeFloat(__io__address + 76, gpencil_vertex_paint_opacity);
		}
	}

	/**
	 * Get method for struct member 'handle_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handles display type for curves. </p>
	 * @see #__DNA__FIELD__handle_display
	 */
	
	public int getHandle_display() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'handle_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handles display type for curves. </p>
	 * @see #__DNA__FIELD__handle_display
	 */
	
	public void setHandle_display(int handle_display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, handle_display);
		} else {
			__io__block.writeInt(__io__address + 80, handle_display);
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
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 84;
		} else {
			__dna__offset = 84;
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
	public CPointer<View3DOverlay> __io__addressof() {
		return new CPointer<View3DOverlay>(__io__address, new Class[]{View3DOverlay.class}, __io__block, __io__blockTable);
	}

}
