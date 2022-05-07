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
 * Generated facet for DNA struct type 'Object_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Not saved in file! </p>
 */

@CMetaData(size32=152, size64=208)
public class Object_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Object_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Object_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 170;

	/**
	 * Field descriptor (offset) for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate data_eval and mesh_deform_eval. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__last_data_mask);
	 * CPointer&lt;CustomData_MeshMasks&gt; p_last_data_mask = p.cast(new Class[]{CustomData_MeshMasks.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_data_mask'</li>
	 * <li>Signature: 'CustomData_MeshMasks'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_data_mask = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__last_need_mapping);
	 * CPointer&lt;Byte&gt; p_last_need_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_need_mapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_need_mapping = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'collection_management'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opaque data reserved for management of objects in collection context. E.g. used currently to check for potential duplicates of objects in a collection, after remapping process. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__collection_management);
	 * CPointer&lt;Byte&gt; p_collection_management = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection_management'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection_management = new long[]{41, 41};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{42, 42};

	/**
	 * Field descriptor (offset) for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__parent_display_origin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_parent_display_origin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent_display_origin'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent_display_origin = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object. It might differ between an evaluated and its original object, when the object is being instanced. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__select_id);
	 * CPointer&lt;Integer&gt; p_select_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select_id = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'is_data_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated data is owned by this object or is referenced and owned by somebody else. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__is_data_eval_owned);
	 * CPointer&lt;Byte&gt; p_is_data_eval_owned = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_data_eval_owned'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_data_eval_owned = new long[]{63, 63};

	/**
	 * Field descriptor (offset) for struct member 'overlay_mode_transfer_start_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start time of the mode transfer overlay animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__overlay_mode_transfer_start_time);
	 * CPointer&lt;Double&gt; p_overlay_mode_transfer_start_time = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlay_mode_transfer_start_time'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlay_mode_transfer_start_time = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned bound-box (in local-space). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'data_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original data pointer, before object->data was changed to point to data_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__data_orig);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_data_orig = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_orig'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_orig = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'data_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data structure created during object evaluation. It has all modifiers applied. The type is determined by the type of the original object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__data_eval);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_data_eval = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_eval'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_eval = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'geometry_set_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s can evaluate to a geometry set instead of a single {@link ID} . In those cases, the evaluated geometry set will be stored here. An {@link ID}  of the correct type is still stored in {@link #data_eval} . {@link #geometry_set_eval}  might reference the {@link ID}  pointed to by {@link #data_eval}  as well, but does not own the data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__geometry_set_eval);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_geometry_set_eval = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'geometry_set_eval'</li>
	 * <li>Signature: 'GeometrySet*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__geometry_set_eval = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deformation only modifiers applied on it. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__mesh_deform_eval);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_deform_eval = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_deform_eval'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_deform_eval = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'editmesh_eval_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh cage in edit mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__editmesh_eval_cage);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_editmesh_eval_cage = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editmesh_eval_cage'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editmesh_eval_cage = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'editmesh_bb_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  for selection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__editmesh_bb_cage);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_editmesh_bb_cage = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editmesh_bb_cage'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editmesh_bb_cage = new long[]{96, 120};

	/**
	 * Field descriptor (offset) for struct member 'gpd_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original grease pencil {@link bGPdata}  pointer, before object->data was changed to point to gpd_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__gpd_orig);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd_orig = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd_orig'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd_orig = new long[]{100, 128};

	/**
	 * Field descriptor (offset) for struct member 'gpd_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bGPdata}  structure created during object evaluation. It has all modifiers applied. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__gpd_eval);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd_eval = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd_eval'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd_eval = new long[]{104, 136};

	/**
	 * Field descriptor (offset) for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__object_as_temp_mesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_object_as_temp_mesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_as_temp_mesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_as_temp_mesh = new long[]{108, 144};

	/**
	 * Field descriptor (offset) for struct member 'object_as_temp_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__object_as_temp_curve);
	 * CPointer&lt;CPointer&lt;Curve&gt;&gt; p_object_as_temp_curve = p.cast(new Class[]{CPointer.class, Curve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_as_temp_curve'</li>
	 * <li>Signature: 'Curve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_as_temp_curve = new long[]{112, 152};

	/**
	 * Field descriptor (offset) for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__curve_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_curve_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_cache'</li>
	 * <li>Signature: 'CurveCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_cache = new long[]{116, 160};

	/**
	 * Field descriptor (offset) for struct member 'local_collections_bits'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__local_collections_bits);
	 * CPointer&lt;Short&gt; p_local_collections_bits = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'local_collections_bits'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__local_collections_bits = new long[]{120, 168};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{122, 170};

	/**
	 * Field descriptor (offset) for struct member 'crazyspace_num_verts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__crazyspace_num_verts);
	 * CPointer&lt;Integer&gt; p_crazyspace_num_verts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crazyspace_num_verts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crazyspace_num_verts = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{140, 196};

	public Object_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Object_Runtime(Object_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate data_eval and mesh_deform_eval. </p>
	 * @see #__DNA__FIELD__last_data_mask
	 */
	
	public CustomData_MeshMasks getLast_data_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData_MeshMasks(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new CustomData_MeshMasks(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate data_eval and mesh_deform_eval. </p>
	 * @see #__DNA__FIELD__last_data_mask
	 */
	
	public void setLast_data_mask(CustomData_MeshMasks last_data_mask) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(last_data_mask, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, last_data_mask)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, last_data_mask);
		} else {
			__io__generic__copy( getLast_data_mask(), last_data_mask);
		}
	}

	/**
	 * Get method for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * @see #__DNA__FIELD__last_need_mapping
	 */
	
	public byte getLast_need_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 40);
		} else {
			return __io__block.readByte(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * @see #__DNA__FIELD__last_need_mapping
	 */
	
	public void setLast_need_mapping(byte last_need_mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 40, last_need_mapping);
		} else {
			__io__block.writeByte(__io__address + 40, last_need_mapping);
		}
	}

	/**
	 * Get method for struct member 'collection_management'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opaque data reserved for management of objects in collection context. E.g. used currently to check for potential duplicates of objects in a collection, after remapping process. </p>
	 * @see #__DNA__FIELD__collection_management
	 */
	
	public byte getCollection_management() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 41);
		} else {
			return __io__block.readByte(__io__address + 41);
		}
	}

	/**
	 * Set method for struct member 'collection_management'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opaque data reserved for management of objects in collection context. E.g. used currently to check for potential duplicates of objects in a collection, after remapping process. </p>
	 * @see #__DNA__FIELD__collection_management
	 */
	
	public void setCollection_management(byte collection_management) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 41, collection_management);
		} else {
			__io__block.writeByte(__io__address + 41, collection_management);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 42, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 42, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 42;
		} else {
			__dna__offset = 42;
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
	 * Get method for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * @see #__DNA__FIELD__parent_display_origin
	 */
	
	public CArrayFacade<Float> getParent_display_origin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * @see #__DNA__FIELD__parent_display_origin
	 */
	
	public void setParent_display_origin(CArrayFacade<Float> parent_display_origin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(parent_display_origin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent_display_origin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent_display_origin);
		} else {
			__io__generic__copy( getParent_display_origin(), parent_display_origin);
		}
	}

	/**
	 * Get method for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object. It might differ between an evaluated and its original object, when the object is being instanced. </p>
	 * @see #__DNA__FIELD__select_id
	 */
	
	public int getSelect_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object. It might differ between an evaluated and its original object, when the object is being instanced. </p>
	 * @see #__DNA__FIELD__select_id
	 */
	
	public void setSelect_id(int select_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, select_id);
		} else {
			__io__block.writeInt(__io__address + 56, select_id);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
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
	 * Get method for struct member 'is_data_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated data is owned by this object or is referenced and owned by somebody else. </p>
	 * @see #__DNA__FIELD__is_data_eval_owned
	 */
	
	public byte getIs_data_eval_owned() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 63);
		} else {
			return __io__block.readByte(__io__address + 63);
		}
	}

	/**
	 * Set method for struct member 'is_data_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated data is owned by this object or is referenced and owned by somebody else. </p>
	 * @see #__DNA__FIELD__is_data_eval_owned
	 */
	
	public void setIs_data_eval_owned(byte is_data_eval_owned) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 63, is_data_eval_owned);
		} else {
			__io__block.writeByte(__io__address + 63, is_data_eval_owned);
		}
	}

	/**
	 * Get method for struct member 'overlay_mode_transfer_start_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start time of the mode transfer overlay animation. </p>
	 * @see #__DNA__FIELD__overlay_mode_transfer_start_time
	 */
	
	public double getOverlay_mode_transfer_start_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 64);
		} else {
			return __io__block.readDouble(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'overlay_mode_transfer_start_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start time of the mode transfer overlay animation. </p>
	 * @see #__DNA__FIELD__overlay_mode_transfer_start_time
	 */
	
	public void setOverlay_mode_transfer_start_time(double overlay_mode_transfer_start_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 64, overlay_mode_transfer_start_time);
		} else {
			__io__block.writeDouble(__io__address + 64, overlay_mode_transfer_start_time);
		}
	}

	/**
	 * Get method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned bound-box (in local-space). </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned bound-box (in local-space). </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'data_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original data pointer, before object->data was changed to point to data_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__data_orig
	 */
	
	public CPointer<ID> getData_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original data pointer, before object->data was changed to point to data_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__data_orig
	 */
	
	public void setData_orig(CPointer<ID> data_orig) throws IOException
	{
		long __address = ((data_orig == null) ? 0 : data_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'data_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data structure created during object evaluation. It has all modifiers applied. The type is determined by the type of the original object. </p>
	 * @see #__DNA__FIELD__data_eval
	 */
	
	public CPointer<ID> getData_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data structure created during object evaluation. It has all modifiers applied. The type is determined by the type of the original object. </p>
	 * @see #__DNA__FIELD__data_eval
	 */
	
	public void setData_eval(CPointer<ID> data_eval) throws IOException
	{
		long __address = ((data_eval == null) ? 0 : data_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'geometry_set_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s can evaluate to a geometry set instead of a single {@link ID} . In those cases, the evaluated geometry set will be stored here. An {@link ID}  of the correct type is still stored in {@link #data_eval} . {@link #geometry_set_eval}  might reference the {@link ID}  pointed to by {@link #data_eval}  as well, but does not own the data. </p>
	 * @see #__DNA__FIELD__geometry_set_eval
	 */
	
	public CPointer<Object> getGeometry_set_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'geometry_set_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s can evaluate to a geometry set instead of a single {@link ID} . In those cases, the evaluated geometry set will be stored here. An {@link ID}  of the correct type is still stored in {@link #data_eval} . {@link #geometry_set_eval}  might reference the {@link ID}  pointed to by {@link #data_eval}  as well, but does not own the data. </p>
	 * @see #__DNA__FIELD__geometry_set_eval
	 */
	
	public void setGeometry_set_eval(CPointer<Object> geometry_set_eval) throws IOException
	{
		long __address = ((geometry_set_eval == null) ? 0 : geometry_set_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deformation only modifiers applied on it. </p>
	 * @see #__DNA__FIELD__mesh_deform_eval
	 */
	
	public CPointer<Mesh> getMesh_deform_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deformation only modifiers applied on it. </p>
	 * @see #__DNA__FIELD__mesh_deform_eval
	 */
	
	public void setMesh_deform_eval(CPointer<Mesh> mesh_deform_eval) throws IOException
	{
		long __address = ((mesh_deform_eval == null) ? 0 : mesh_deform_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'editmesh_eval_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh cage in edit mode. </p>
	 * @see #__DNA__FIELD__editmesh_eval_cage
	 */
	
	public CPointer<Mesh> getEditmesh_eval_cage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editmesh_eval_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh cage in edit mode. </p>
	 * @see #__DNA__FIELD__editmesh_eval_cage
	 */
	
	public void setEditmesh_eval_cage(CPointer<Mesh> editmesh_eval_cage) throws IOException
	{
		long __address = ((editmesh_eval_cage == null) ? 0 : editmesh_eval_cage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'editmesh_bb_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  for selection. </p>
	 * @see #__DNA__FIELD__editmesh_bb_cage
	 */
	
	public CPointer<BoundBox> getEditmesh_bb_cage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editmesh_bb_cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  for selection. </p>
	 * @see #__DNA__FIELD__editmesh_bb_cage
	 */
	
	public void setEditmesh_bb_cage(CPointer<BoundBox> editmesh_bb_cage) throws IOException
	{
		long __address = ((editmesh_bb_cage == null) ? 0 : editmesh_bb_cage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original grease pencil {@link bGPdata}  pointer, before object->data was changed to point to gpd_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__gpd_orig
	 */
	
	public CPointer<bGPdata> getGpd_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original grease pencil {@link bGPdata}  pointer, before object->data was changed to point to gpd_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__gpd_orig
	 */
	
	public void setGpd_orig(CPointer<bGPdata> gpd_orig) throws IOException
	{
		long __address = ((gpd_orig == null) ? 0 : gpd_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bGPdata}  structure created during object evaluation. It has all modifiers applied. </p>
	 * @see #__DNA__FIELD__gpd_eval
	 */
	
	public CPointer<bGPdata> getGpd_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bGPdata}  structure created during object evaluation. It has all modifiers applied. </p>
	 * @see #__DNA__FIELD__gpd_eval
	 */
	
	public void setGpd_eval(CPointer<bGPdata> gpd_eval) throws IOException
	{
		long __address = ((gpd_eval == null) ? 0 : gpd_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_mesh
	 */
	
	public CPointer<Mesh> getObject_as_temp_mesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_mesh
	 */
	
	public void setObject_as_temp_mesh(CPointer<Mesh> object_as_temp_mesh) throws IOException
	{
		long __address = ((object_as_temp_mesh == null) ? 0 : object_as_temp_mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'object_as_temp_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_curve
	 */
	
	public CPointer<Curve> getObject_as_temp_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Curve.class};
		return new CPointer<Curve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Curve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_as_temp_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_curve
	 */
	
	public void setObject_as_temp_curve(CPointer<Curve> object_as_temp_curve) throws IOException
	{
		long __address = ((object_as_temp_curve == null) ? 0 : object_as_temp_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public CPointer<Object> getCurve_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public void setCurve_cache(CPointer<Object> curve_cache) throws IOException
	{
		long __address = ((curve_cache == null) ? 0 : curve_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'local_collections_bits'.
	 * @see #__DNA__FIELD__local_collections_bits
	 */
	
	public short getLocal_collections_bits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'local_collections_bits'.
	 * @see #__DNA__FIELD__local_collections_bits
	 */
	
	public void setLocal_collections_bits(short local_collections_bits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, local_collections_bits);
		} else {
			__io__block.writeShort(__io__address + 120, local_collections_bits);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Short> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 170, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 122, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Short> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 170;
		} else {
			__dna__offset = 122;
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
	 * Get method for struct member 'crazyspace_num_verts'.
	 * @see #__DNA__FIELD__crazyspace_num_verts
	 */
	
	public int getCrazyspace_num_verts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'crazyspace_num_verts'.
	 * @see #__DNA__FIELD__crazyspace_num_verts
	 */
	
	public void setCrazyspace_num_verts(int crazyspace_num_verts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, crazyspace_num_verts);
		} else {
			__io__block.writeInt(__io__address + 136, crazyspace_num_verts);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Integer> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Integer> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 140;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Object_Runtime> __io__addressof() {
		return new CPointer<Object_Runtime>(__io__address, new Class[]{Object_Runtime.class}, __io__block, __io__blockTable);
	}

}
