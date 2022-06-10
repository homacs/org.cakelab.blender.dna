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
 * Generated facet for DNA struct type 'Mesh_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Runtime data, not saved in files. </p>
 */

@CMetaData(size32=144, size64=200)
public class Mesh_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Mesh_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Mesh_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 72;

	/**
	 * Field descriptor (offset) for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is used as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__mesh_eval);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_eval = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_eval'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_eval = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'eval_mutex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__eval_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_eval_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eval_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eval_mutex = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'normals_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A separate mutex is needed for normal calculation, because sometimes the normals are needed while #eval_mutex is already locked. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__normals_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_normals_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normals_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normals_mutex = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'render_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed to ensure some thread-safety during render data pre-processing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__render_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_render_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_mutex = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'edit_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Lazily initialized SoA data from the #edit_mesh field in {@link Mesh} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__edit_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_edit_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_data'</li>
	 * <li>Signature: 'EditMeshData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_data = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'looptris'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for derived triangulation of the mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__looptris);
	 * CPointer&lt;MLoopTri_Store&gt; p_looptris = p.cast(new Class[]{MLoopTri_Store.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'looptris'</li>
	 * <li>Signature: 'MLoopTri_Store'</li>
	 * <li>Actual Size (32bit/64bit): 16/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__looptris = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for BVH trees generated for the mesh. Defined in 'BKE_bvhutil.c' </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__bvh_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bvh_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvh_cache'</li>
	 * <li>Signature: 'BVHCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvh_cache = new long[]{40, 72};

	/**
	 * Field descriptor (offset) for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache of non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__shrinkwrap_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_shrinkwrap_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkwrap_data'</li>
	 * <li>Signature: 'ShrinkwrapBoundaryData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkwrap_data = new long[]{44, 80};

	/**
	 * Field descriptor (offset) for struct member 'cd_mask_extra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed in case we need to lazily initialize the mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__cd_mask_extra);
	 * CPointer&lt;CustomData_MeshMasks&gt; p_cd_mask_extra = p.cast(new Class[]{CustomData_MeshMasks.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_mask_extra'</li>
	 * <li>Signature: 'CustomData_MeshMasks'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_mask_extra = new long[]{48, 88};

	/**
	 * Field descriptor (offset) for struct member 'subdiv_ccg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subdiv_ccg);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_subdiv_ccg = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv_ccg'</li>
	 * <li>Signature: 'SubdivCCG*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv_ccg = new long[]{88, 128};

	/**
	 * Field descriptor (offset) for struct member 'subdiv_ccg_tot_level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subdiv_ccg_tot_level);
	 * CPointer&lt;Integer&gt; p_subdiv_ccg_tot_level = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv_ccg_tot_level'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv_ccg_tot_level = new long[]{92, 136};

	/**
	 * Field descriptor (offset) for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__deformed_only);
	 * CPointer&lt;Byte&gt; p_deformed_only = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deformed_only'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deformed_only = new long[]{96, 140};

	/**
	 * Field descriptor (offset) for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copied from edit-mesh (hint, draw with edit-mesh data when true).</p><p> Modifiers that edit the mesh data in-place must set this to false (most #eModifierTypeType_NonGeometrical modifiers). Otherwise the edit-mesh data will be used for drawing, missing changes from modifiers. See T79517. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__is_original);
	 * CPointer&lt;Byte&gt; p_is_original = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_original'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_original = new long[]{97, 141};

	/**
	 * Field descriptor (offset) for struct member 'wrapper_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eMeshWrapperType  and others. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__wrapper_type);
	 * CPointer&lt;Byte&gt; p_wrapper_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wrapper_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wrapper_type = new long[]{98, 142};

	/**
	 * Field descriptor (offset) for struct member 'wrapper_type_finalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A type mask from wrapper_type, in case there are differences in finalizing logic between types. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__wrapper_type_finalize);
	 * CPointer&lt;Byte&gt; p_wrapper_type_finalize = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wrapper_type_finalize'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wrapper_type_finalize = new long[]{99, 143};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for lazily evaluating the subdivision on the CPU if needed. These are set in the modifier when GPU subdivision can be performed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_session_uuid);
	 * CPointer&lt;SessionUUID&gt; p_subsurf_session_uuid = p.cast(new Class[]{SessionUUID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_session_uuid'</li>
	 * <li>Signature: 'SessionUUID'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_session_uuid = new long[]{100, 144};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_resolution);
	 * CPointer&lt;Byte&gt; p_subsurf_resolution = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_resolution'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_resolution = new long[]{108, 152};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_do_loop_normals'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_do_loop_normals);
	 * CPointer&lt;Byte&gt; p_subsurf_do_loop_normals = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_do_loop_normals'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_do_loop_normals = new long[]{109, 153};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_apply_render'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_apply_render);
	 * CPointer&lt;Byte&gt; p_subsurf_apply_render = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_apply_render'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_apply_render = new long[]{110, 154};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_use_optimal_display'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_use_optimal_display);
	 * CPointer&lt;Byte&gt; p_subsurf_use_optimal_display = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_use_optimal_display'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_use_optimal_display = new long[]{111, 155};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cached from the draw code for stats display. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_totvert);
	 * CPointer&lt;Integer&gt; p_subsurf_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_totvert = new long[]{112, 156};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_totedge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_totedge);
	 * CPointer&lt;Integer&gt; p_subsurf_totedge = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_totedge'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_totedge = new long[]{116, 160};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_totpoly'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_totpoly);
	 * CPointer&lt;Integer&gt; p_subsurf_totpoly = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_totpoly'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_totpoly = new long[]{120, 164};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_totloop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_totloop);
	 * CPointer&lt;Integer&gt; p_subsurf_totloop = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_totloop'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_totloop = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{128, 172};

	/**
	 * Field descriptor (offset) for struct member 'vert_normals_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caches for lazily computed vertex and polygon normals. These are stored here rather than in {@link CustomData}  because they can be calculated on a const mesh, and adding custom data layers on a const mesh is not thread-safe. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__vert_normals_dirty);
	 * CPointer&lt;Byte&gt; p_vert_normals_dirty = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_normals_dirty'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_normals_dirty = new long[]{130, 174};

	/**
	 * Field descriptor (offset) for struct member 'poly_normals_dirty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__poly_normals_dirty);
	 * CPointer&lt;Byte&gt; p_poly_normals_dirty = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poly_normals_dirty'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poly_normals_dirty = new long[]{131, 175};

	/**
	 * Field descriptor (offset) for struct member 'subsurf_face_dot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A #BLI_bitmap containing tags for the center vertices of subdivided polygons, set by the subdivision surface modifier and used by drawing code instead of polygon center face dots. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subsurf_face_dot_tags);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_subsurf_face_dot_tags = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurf_face_dot_tags'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurf_face_dot_tags = new long[]{140, 192};

	public Mesh_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Mesh_Runtime(Mesh_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is used as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public CPointer<Mesh> getMesh_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is used as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public void setMesh_eval(CPointer<Mesh> mesh_eval) throws IOException
	{
		long __address = ((mesh_eval == null) ? 0 : mesh_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'eval_mutex'.
	 * @see #__DNA__FIELD__eval_mutex
	 */
	
	public CPointer<Object> getEval_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eval_mutex'.
	 * @see #__DNA__FIELD__eval_mutex
	 */
	
	public void setEval_mutex(CPointer<Object> eval_mutex) throws IOException
	{
		long __address = ((eval_mutex == null) ? 0 : eval_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'normals_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A separate mutex is needed for normal calculation, because sometimes the normals are needed while #eval_mutex is already locked. </p>
	 * @see #__DNA__FIELD__normals_mutex
	 */
	
	public CPointer<Object> getNormals_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'normals_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A separate mutex is needed for normal calculation, because sometimes the normals are needed while #eval_mutex is already locked. </p>
	 * @see #__DNA__FIELD__normals_mutex
	 */
	
	public void setNormals_mutex(CPointer<Object> normals_mutex) throws IOException
	{
		long __address = ((normals_mutex == null) ? 0 : normals_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'render_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed to ensure some thread-safety during render data pre-processing. </p>
	 * @see #__DNA__FIELD__render_mutex
	 */
	
	public CPointer<Object> getRender_mutex() throws IOException
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
	 * Set method for struct member 'render_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed to ensure some thread-safety during render data pre-processing. </p>
	 * @see #__DNA__FIELD__render_mutex
	 */
	
	public void setRender_mutex(CPointer<Object> render_mutex) throws IOException
	{
		long __address = ((render_mutex == null) ? 0 : render_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'edit_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Lazily initialized SoA data from the #edit_mesh field in {@link Mesh} . </p>
	 * @see #__DNA__FIELD__edit_data
	 */
	
	public CPointer<Object> getEdit_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edit_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Lazily initialized SoA data from the #edit_mesh field in {@link Mesh} . </p>
	 * @see #__DNA__FIELD__edit_data
	 */
	
	public void setEdit_data(CPointer<Object> edit_data) throws IOException
	{
		long __address = ((edit_data == null) ? 0 : edit_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'looptris'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for derived triangulation of the mesh. </p>
	 * @see #__DNA__FIELD__looptris
	 */
	
	public MLoopTri_Store getLooptris() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MLoopTri_Store(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new MLoopTri_Store(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'looptris'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for derived triangulation of the mesh. </p>
	 * @see #__DNA__FIELD__looptris
	 */
	
	public void setLooptris(MLoopTri_Store looptris) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(looptris, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, looptris)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, looptris);
		} else {
			__io__generic__copy( getLooptris(), looptris);
		}
	}

	/**
	 * Get method for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for BVH trees generated for the mesh. Defined in 'BKE_bvhutil.c' </p>
	 * @see #__DNA__FIELD__bvh_cache
	 */
	
	public CPointer<Object> getBvh_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache for BVH trees generated for the mesh. Defined in 'BKE_bvhutil.c' </p>
	 * @see #__DNA__FIELD__bvh_cache
	 */
	
	public void setBvh_cache(CPointer<Object> bvh_cache) throws IOException
	{
		long __address = ((bvh_cache == null) ? 0 : bvh_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache of non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * @see #__DNA__FIELD__shrinkwrap_data
	 */
	
	public CPointer<Object> getShrinkwrap_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache of non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * @see #__DNA__FIELD__shrinkwrap_data
	 */
	
	public void setShrinkwrap_data(CPointer<Object> shrinkwrap_data) throws IOException
	{
		long __address = ((shrinkwrap_data == null) ? 0 : shrinkwrap_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'cd_mask_extra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed in case we need to lazily initialize the mesh. </p>
	 * @see #__DNA__FIELD__cd_mask_extra
	 */
	
	public CustomData_MeshMasks getCd_mask_extra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData_MeshMasks(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new CustomData_MeshMasks(__io__address + 48, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cd_mask_extra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Needed in case we need to lazily initialize the mesh. </p>
	 * @see #__DNA__FIELD__cd_mask_extra
	 */
	
	public void setCd_mask_extra(CustomData_MeshMasks cd_mask_extra) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(cd_mask_extra, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cd_mask_extra)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cd_mask_extra);
		} else {
			__io__generic__copy( getCd_mask_extra(), cd_mask_extra);
		}
	}

	/**
	 * Get method for struct member 'subdiv_ccg'.
	 * @see #__DNA__FIELD__subdiv_ccg
	 */
	
	public CPointer<Object> getSubdiv_ccg() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'subdiv_ccg'.
	 * @see #__DNA__FIELD__subdiv_ccg
	 */
	
	public void setSubdiv_ccg(CPointer<Object> subdiv_ccg) throws IOException
	{
		long __address = ((subdiv_ccg == null) ? 0 : subdiv_ccg.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'subdiv_ccg_tot_level'.
	 * @see #__DNA__FIELD__subdiv_ccg_tot_level
	 */
	
	public int getSubdiv_ccg_tot_level() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'subdiv_ccg_tot_level'.
	 * @see #__DNA__FIELD__subdiv_ccg_tot_level
	 */
	
	public void setSubdiv_ccg_tot_level(int subdiv_ccg_tot_level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, subdiv_ccg_tot_level);
		} else {
			__io__block.writeInt(__io__address + 92, subdiv_ccg_tot_level);
		}
	}

	/**
	 * Get method for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * @see #__DNA__FIELD__deformed_only
	 */
	
	public byte getDeformed_only() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 140);
		} else {
			return __io__block.readByte(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * @see #__DNA__FIELD__deformed_only
	 */
	
	public void setDeformed_only(byte deformed_only) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 140, deformed_only);
		} else {
			__io__block.writeByte(__io__address + 96, deformed_only);
		}
	}

	/**
	 * Get method for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copied from edit-mesh (hint, draw with edit-mesh data when true).</p><p> Modifiers that edit the mesh data in-place must set this to false (most #eModifierTypeType_NonGeometrical modifiers). Otherwise the edit-mesh data will be used for drawing, missing changes from modifiers. See T79517. </p>
	 * @see #__DNA__FIELD__is_original
	 */
	
	public byte getIs_original() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 141);
		} else {
			return __io__block.readByte(__io__address + 97);
		}
	}

	/**
	 * Set method for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copied from edit-mesh (hint, draw with edit-mesh data when true).</p><p> Modifiers that edit the mesh data in-place must set this to false (most #eModifierTypeType_NonGeometrical modifiers). Otherwise the edit-mesh data will be used for drawing, missing changes from modifiers. See T79517. </p>
	 * @see #__DNA__FIELD__is_original
	 */
	
	public void setIs_original(byte is_original) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 141, is_original);
		} else {
			__io__block.writeByte(__io__address + 97, is_original);
		}
	}

	/**
	 * Get method for struct member 'wrapper_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eMeshWrapperType  and others. </p>
	 * @see #__DNA__FIELD__wrapper_type
	 */
	
	public byte getWrapper_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 142);
		} else {
			return __io__block.readByte(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'wrapper_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eMeshWrapperType  and others. </p>
	 * @see #__DNA__FIELD__wrapper_type
	 */
	
	public void setWrapper_type(byte wrapper_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 142, wrapper_type);
		} else {
			__io__block.writeByte(__io__address + 98, wrapper_type);
		}
	}

	/**
	 * Get method for struct member 'wrapper_type_finalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A type mask from wrapper_type, in case there are differences in finalizing logic between types. </p>
	 * @see #__DNA__FIELD__wrapper_type_finalize
	 */
	
	public byte getWrapper_type_finalize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 143);
		} else {
			return __io__block.readByte(__io__address + 99);
		}
	}

	/**
	 * Set method for struct member 'wrapper_type_finalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A type mask from wrapper_type, in case there are differences in finalizing logic between types. </p>
	 * @see #__DNA__FIELD__wrapper_type_finalize
	 */
	
	public void setWrapper_type_finalize(byte wrapper_type_finalize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 143, wrapper_type_finalize);
		} else {
			__io__block.writeByte(__io__address + 99, wrapper_type_finalize);
		}
	}

	/**
	 * Get method for struct member 'subsurf_session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for lazily evaluating the subdivision on the CPU if needed. These are set in the modifier when GPU subdivision can be performed. </p>
	 * @see #__DNA__FIELD__subsurf_session_uuid
	 */
	
	public SessionUUID getSubsurf_session_uuid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SessionUUID(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new SessionUUID(__io__address + 100, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subsurf_session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for lazily evaluating the subdivision on the CPU if needed. These are set in the modifier when GPU subdivision can be performed. </p>
	 * @see #__DNA__FIELD__subsurf_session_uuid
	 */
	
	public void setSubsurf_session_uuid(SessionUUID subsurf_session_uuid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(subsurf_session_uuid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subsurf_session_uuid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subsurf_session_uuid);
		} else {
			__io__generic__copy( getSubsurf_session_uuid(), subsurf_session_uuid);
		}
	}

	/**
	 * Get method for struct member 'subsurf_resolution'.
	 * @see #__DNA__FIELD__subsurf_resolution
	 */
	
	public byte getSubsurf_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 152);
		} else {
			return __io__block.readByte(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'subsurf_resolution'.
	 * @see #__DNA__FIELD__subsurf_resolution
	 */
	
	public void setSubsurf_resolution(byte subsurf_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 152, subsurf_resolution);
		} else {
			__io__block.writeByte(__io__address + 108, subsurf_resolution);
		}
	}

	/**
	 * Get method for struct member 'subsurf_do_loop_normals'.
	 * @see #__DNA__FIELD__subsurf_do_loop_normals
	 */
	
	public byte getSubsurf_do_loop_normals() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 153);
		} else {
			return __io__block.readByte(__io__address + 109);
		}
	}

	/**
	 * Set method for struct member 'subsurf_do_loop_normals'.
	 * @see #__DNA__FIELD__subsurf_do_loop_normals
	 */
	
	public void setSubsurf_do_loop_normals(byte subsurf_do_loop_normals) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 153, subsurf_do_loop_normals);
		} else {
			__io__block.writeByte(__io__address + 109, subsurf_do_loop_normals);
		}
	}

	/**
	 * Get method for struct member 'subsurf_apply_render'.
	 * @see #__DNA__FIELD__subsurf_apply_render
	 */
	
	public byte getSubsurf_apply_render() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 154);
		} else {
			return __io__block.readByte(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'subsurf_apply_render'.
	 * @see #__DNA__FIELD__subsurf_apply_render
	 */
	
	public void setSubsurf_apply_render(byte subsurf_apply_render) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 154, subsurf_apply_render);
		} else {
			__io__block.writeByte(__io__address + 110, subsurf_apply_render);
		}
	}

	/**
	 * Get method for struct member 'subsurf_use_optimal_display'.
	 * @see #__DNA__FIELD__subsurf_use_optimal_display
	 */
	
	public byte getSubsurf_use_optimal_display() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 155);
		} else {
			return __io__block.readByte(__io__address + 111);
		}
	}

	/**
	 * Set method for struct member 'subsurf_use_optimal_display'.
	 * @see #__DNA__FIELD__subsurf_use_optimal_display
	 */
	
	public void setSubsurf_use_optimal_display(byte subsurf_use_optimal_display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 155, subsurf_use_optimal_display);
		} else {
			__io__block.writeByte(__io__address + 111, subsurf_use_optimal_display);
		}
	}

	/**
	 * Get method for struct member 'subsurf_totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cached from the draw code for stats display. </p>
	 * @see #__DNA__FIELD__subsurf_totvert
	 */
	
	public int getSubsurf_totvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'subsurf_totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cached from the draw code for stats display. </p>
	 * @see #__DNA__FIELD__subsurf_totvert
	 */
	
	public void setSubsurf_totvert(int subsurf_totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, subsurf_totvert);
		} else {
			__io__block.writeInt(__io__address + 112, subsurf_totvert);
		}
	}

	/**
	 * Get method for struct member 'subsurf_totedge'.
	 * @see #__DNA__FIELD__subsurf_totedge
	 */
	
	public int getSubsurf_totedge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'subsurf_totedge'.
	 * @see #__DNA__FIELD__subsurf_totedge
	 */
	
	public void setSubsurf_totedge(int subsurf_totedge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, subsurf_totedge);
		} else {
			__io__block.writeInt(__io__address + 116, subsurf_totedge);
		}
	}

	/**
	 * Get method for struct member 'subsurf_totpoly'.
	 * @see #__DNA__FIELD__subsurf_totpoly
	 */
	
	public int getSubsurf_totpoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'subsurf_totpoly'.
	 * @see #__DNA__FIELD__subsurf_totpoly
	 */
	
	public void setSubsurf_totpoly(int subsurf_totpoly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, subsurf_totpoly);
		} else {
			__io__block.writeInt(__io__address + 120, subsurf_totpoly);
		}
	}

	/**
	 * Get method for struct member 'subsurf_totloop'.
	 * @see #__DNA__FIELD__subsurf_totloop
	 */
	
	public int getSubsurf_totloop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'subsurf_totloop'.
	 * @see #__DNA__FIELD__subsurf_totloop
	 */
	
	public void setSubsurf_totloop(int subsurf_totloop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, subsurf_totloop);
		} else {
			__io__block.writeInt(__io__address + 124, subsurf_totloop);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 172;
		} else {
			__dna__offset = 128;
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
	 * Get method for struct member 'vert_normals_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caches for lazily computed vertex and polygon normals. These are stored here rather than in {@link CustomData}  because they can be calculated on a const mesh, and adding custom data layers on a const mesh is not thread-safe. </p>
	 * @see #__DNA__FIELD__vert_normals_dirty
	 */
	
	public byte getVert_normals_dirty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 174);
		} else {
			return __io__block.readByte(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'vert_normals_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caches for lazily computed vertex and polygon normals. These are stored here rather than in {@link CustomData}  because they can be calculated on a const mesh, and adding custom data layers on a const mesh is not thread-safe. </p>
	 * @see #__DNA__FIELD__vert_normals_dirty
	 */
	
	public void setVert_normals_dirty(byte vert_normals_dirty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 174, vert_normals_dirty);
		} else {
			__io__block.writeByte(__io__address + 130, vert_normals_dirty);
		}
	}

	/**
	 * Get method for struct member 'poly_normals_dirty'.
	 * @see #__DNA__FIELD__poly_normals_dirty
	 */
	
	public byte getPoly_normals_dirty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 175);
		} else {
			return __io__block.readByte(__io__address + 131);
		}
	}

	/**
	 * Set method for struct member 'poly_normals_dirty'.
	 * @see #__DNA__FIELD__poly_normals_dirty
	 */
	
	public void setPoly_normals_dirty(byte poly_normals_dirty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 175, poly_normals_dirty);
		} else {
			__io__block.writeByte(__io__address + 131, poly_normals_dirty);
		}
	}

	/**
	 * Get method for struct member 'subsurf_face_dot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A #BLI_bitmap containing tags for the center vertices of subdivided polygons, set by the subdivision surface modifier and used by drawing code instead of polygon center face dots. </p>
	 * @see #__DNA__FIELD__subsurf_face_dot_tags
	 */
	
	public CPointer<Integer> getSubsurf_face_dot_tags() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'subsurf_face_dot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> A #BLI_bitmap containing tags for the center vertices of subdivided polygons, set by the subdivision surface modifier and used by drawing code instead of polygon center face dots. </p>
	 * @see #__DNA__FIELD__subsurf_face_dot_tags
	 */
	
	public void setSubsurf_face_dot_tags(CPointer<Integer> subsurf_face_dot_tags) throws IOException
	{
		long __address = ((subsurf_face_dot_tags == null) ? 0 : subsurf_face_dot_tags.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Mesh_Runtime> __io__addressof() {
		return new CPointer<Mesh_Runtime>(__io__address, new Class[]{Mesh_Runtime.class}, __io__block, __io__blockTable);
	}

}
