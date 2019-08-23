package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View3D'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> 3D ViewPort Struct. </p>
 */

@CMetaData(size32=1180, size64=1224)
public class View3D extends CFacade {

	/**
	 * This is the sdna index of the struct View3D.
	 * <p>
	 * It is required when allocating a new block to store data for View3D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 215;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
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
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__spacetype);
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'link_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__link_flag);
	 * CPointer&lt;Byte&gt; p_link_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link_flag = new long[]{17, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__viewquat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_viewquat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewquat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewquat = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of bundles in reconstructed data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__bundle_size);
	 * CPointer&lt;Float&gt; p_bundle_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bundle_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bundle_size = new long[]{44, 60};

	/**
	 * Field descriptor (offset) for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display style for bundle. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__bundle_drawtype);
	 * CPointer&lt;Byte&gt; p_bundle_drawtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bundle_drawtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bundle_drawtype = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__drawtype);
	 * CPointer&lt;Byte&gt; p_drawtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawtype = new long[]{49, 65};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{50, 66};

	/**
	 * Field descriptor (offset) for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview current eye - for internal use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__multiview_eye);
	 * CPointer&lt;Byte&gt; p_multiview_eye = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multiview_eye'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multiview_eye = new long[]{51, 67};

	/**
	 * Field descriptor (offset) for struct member 'object_type_exclude_viewport'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__object_type_exclude_viewport);
	 * CPointer&lt;Integer&gt; p_object_type_exclude_viewport = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_type_exclude_viewport'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_type_exclude_viewport = new long[]{52, 68};

	/**
	 * Field descriptor (offset) for struct member 'object_type_exclude_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__object_type_exclude_select);
	 * CPointer&lt;Integer&gt; p_object_type_exclude_select = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_type_exclude_select'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_type_exclude_select = new long[]{56, 72};

	/**
	 * Field descriptor (offset) for struct member 'persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__persp);
	 * CPointer&lt;Short&gt; p_persp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persp = new long[]{60, 76};

	/**
	 * Field descriptor (offset) for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__view);
	 * CPointer&lt;Short&gt; p_view = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view = new long[]{62, 78};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__camera);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_camera = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'ob_centre'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__ob_centre);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob_centre = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_centre'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_centre = new long[]{68, 88};

	/**
	 * Field descriptor (offset) for struct member 'render_border'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__render_border);
	 * CPointer&lt;rctf&gt; p_render_border = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_border'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_border = new long[]{72, 96};

	/**
	 * Field descriptor (offset) for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated backup of its self while in localview. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__localvd);
	 * CPointer&lt;CPointer&lt;View3D&gt;&gt; p_localvd = p.cast(new Class[]{CPointer.class, View3D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'localvd'</li>
	 * <li>Signature: 'View3D*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__localvd = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional string for armature bone to define center, MAXBONENAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__ob_centre_bone);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_ob_centre_bone = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_centre_bone'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_centre_bone = new long[]{92, 120};

	/**
	 * Field descriptor (offset) for struct member 'local_view_uuid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__local_view_uuid);
	 * CPointer&lt;Short&gt; p_local_view_uuid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'local_view_uuid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__local_view_uuid = new long[]{156, 184};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD___pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{158, 186};

	/**
	 * Field descriptor (offset) for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__layact);
	 * CPointer&lt;Integer&gt; p_layact = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layact'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layact = new long[]{160, 188};

	/**
	 * Field descriptor (offset) for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional bool for 3d cursor to define center. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__ob_centre_cursor);
	 * CPointer&lt;Short&gt; p_ob_centre_cursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_centre_cursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_centre_cursor = new long[]{164, 192};

	/**
	 * Field descriptor (offset) for struct member 'scenelock'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__scenelock);
	 * CPointer&lt;Short&gt; p_scenelock = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scenelock'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scenelock = new long[]{166, 194};

	/**
	 * Field descriptor (offset) for struct member 'gp_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gp_flag);
	 * CPointer&lt;Short&gt; p_gp_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_flag = new long[]{168, 196};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{170, 198};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__flag2);
	 * CPointer&lt;Integer&gt; p_flag2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{172, 200};

	/**
	 * Field descriptor (offset) for struct member 'lens'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__lens);
	 * CPointer&lt;Float&gt; p_lens = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lens'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lens = new long[]{176, 204};

	/**
	 * Field descriptor (offset) for struct member 'grid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__grid);
	 * CPointer&lt;Float&gt; p_grid = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'near'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__near);
	 * CPointer&lt;Float&gt; p_near = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'near'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__near = new long[]{184, 212};

	/**
	 * Field descriptor (offset) for struct member 'far'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__far);
	 * CPointer&lt;Float&gt; p_far = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'far'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__far = new long[]{188, 216};

	/**
	 * Field descriptor (offset) for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofs'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofs = new long[]{192, 220};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{204, 232};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo info. #V3D_GIZMO_SHOW_* </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_flag);
	 * CPointer&lt;Byte&gt; p_gizmo_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_flag = new long[]{205, 233};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_show_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_show_object);
	 * CPointer&lt;Byte&gt; p_gizmo_show_object = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_show_object'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_show_object = new long[]{206, 234};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_show_armature'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_show_armature);
	 * CPointer&lt;Byte&gt; p_gizmo_show_armature = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_show_armature'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_show_armature = new long[]{207, 235};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_show_empty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_show_empty);
	 * CPointer&lt;Byte&gt; p_gizmo_show_empty = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_show_empty'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_show_empty = new long[]{208, 236};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_show_light'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_show_light);
	 * CPointer&lt;Byte&gt; p_gizmo_show_light = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_show_light'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_show_light = new long[]{209, 237};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_show_camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gizmo_show_camera);
	 * CPointer&lt;Byte&gt; p_gizmo_show_camera = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_show_camera'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_show_camera = new long[]{210, 238};

	/**
	 * Field descriptor (offset) for struct member 'gridflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gridflag);
	 * CPointer&lt;Byte&gt; p_gridflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gridflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gridflag = new long[]{211, 239};

	/**
	 * Field descriptor (offset) for struct member 'gridlines'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gridlines);
	 * CPointer&lt;Short&gt; p_gridlines = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gridlines'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gridlines = new long[]{212, 240};

	/**
	 * Field descriptor (offset) for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gridsubdiv);
	 * CPointer&lt;Short&gt; p_gridsubdiv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gridsubdiv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gridsubdiv = new long[]{214, 242};

	/**
	 * Field descriptor (offset) for struct member 'vertex_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actually only used to define the opacity of the grease pencil vertex in edit mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__vertex_opacity);
	 * CPointer&lt;Float&gt; p_vertex_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_opacity = new long[]{216, 244};

	/**
	 * Field descriptor (offset) for struct member 'fx_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  allocated, instead set (temporarily) from camera </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__fx_settings);
	 * CPointer&lt;GPUFXSettings&gt; p_fx_settings = p.cast(new Class[]{GPUFXSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fx_settings'</li>
	 * <li>Signature: 'GPUFXSettings'</li>
	 * <li>Actual Size (32bit/64bit): 16/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fx_settings = new long[]{220, 248};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? Grease-Pencil Data (annotation layers). 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{236, 272};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stereoscopy settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__stereo3d_flag);
	 * CPointer&lt;Short&gt; p_stereo3d_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_flag = new long[]{240, 280};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__stereo3d_camera);
	 * CPointer&lt;Byte&gt; p_stereo3d_camera = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_camera'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_camera = new long[]{242, 282};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD___pad4);
	 * CPointer&lt;Byte&gt; p__pad4 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{243, 283};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_convergence_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__stereo3d_convergence_factor);
	 * CPointer&lt;Float&gt; p_stereo3d_convergence_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_convergence_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_convergence_factor = new long[]{244, 284};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_volume_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__stereo3d_volume_alpha);
	 * CPointer&lt;Float&gt; p_stereo3d_volume_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_volume_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_volume_alpha = new long[]{248, 288};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_convergence_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__stereo3d_convergence_alpha);
	 * CPointer&lt;Float&gt; p_stereo3d_convergence_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_convergence_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_convergence_alpha = new long[]{252, 292};

	/**
	 * Field descriptor (offset) for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__shading);
	 * CPointer&lt;View3DShading&gt; p_shading = p.cast(new Class[]{View3DShading.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shading'</li>
	 * <li>Signature: 'View3DShading'</li>
	 * <li>Actual Size (32bit/64bit): 856/856</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shading = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'overlay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__overlay);
	 * CPointer&lt;View3DOverlay&gt; p_overlay = p.cast(new Class[]{View3DOverlay.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlay'</li>
	 * <li>Signature: 'View3DOverlay'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlay = new long[]{1112, 1152};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__runtime);
	 * CPointer&lt;View3D_Runtime&gt; p_runtime = p.cast(new Class[]{View3D_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'View3D_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1176, 1216};

	public View3D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3D(View3D that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
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
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, spacetype);
		} else {
			__io__block.writeByte(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public byte getLink_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public void setLink_flag(byte link_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, link_flag);
		} else {
			__io__block.writeByte(__io__address + 17, link_flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__viewquat
	 */
	
	public CArrayFacade<Float> getViewquat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__viewquat
	 */
	
	public void setViewquat(CArrayFacade<Float> viewquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(viewquat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewquat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewquat);
		} else {
			__io__generic__copy( getViewquat(), viewquat);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, dist);
		} else {
			__io__block.writeFloat(__io__address + 40, dist);
		}
	}

	/**
	 * Get method for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of bundles in reconstructed data. </p>
	 * @see #__DNA__FIELD__bundle_size
	 */
	
	public float getBundle_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of bundles in reconstructed data. </p>
	 * @see #__DNA__FIELD__bundle_size
	 */
	
	public void setBundle_size(float bundle_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, bundle_size);
		} else {
			__io__block.writeFloat(__io__address + 44, bundle_size);
		}
	}

	/**
	 * Get method for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display style for bundle. </p>
	 * @see #__DNA__FIELD__bundle_drawtype
	 */
	
	public byte getBundle_drawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 64);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display style for bundle. </p>
	 * @see #__DNA__FIELD__bundle_drawtype
	 */
	
	public void setBundle_drawtype(byte bundle_drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 64, bundle_drawtype);
		} else {
			__io__block.writeByte(__io__address + 48, bundle_drawtype);
		}
	}

	/**
	 * Get method for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public byte getDrawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 65);
		} else {
			return __io__block.readByte(__io__address + 49);
		}
	}

	/**
	 * Set method for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public void setDrawtype(byte drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 65, drawtype);
		} else {
			__io__block.writeByte(__io__address + 49, drawtype);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 66, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 50, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 66;
		} else {
			__dna__offset = 50;
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
	 * Get method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview current eye - for internal use. </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public byte getMultiview_eye() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 67);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview current eye - for internal use. </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public void setMultiview_eye(byte multiview_eye) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 67, multiview_eye);
		} else {
			__io__block.writeByte(__io__address + 51, multiview_eye);
		}
	}

	/**
	 * Get method for struct member 'object_type_exclude_viewport'.
	 * @see #__DNA__FIELD__object_type_exclude_viewport
	 */
	
	public int getObject_type_exclude_viewport() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 68);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'object_type_exclude_viewport'.
	 * @see #__DNA__FIELD__object_type_exclude_viewport
	 */
	
	public void setObject_type_exclude_viewport(int object_type_exclude_viewport) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 68, object_type_exclude_viewport);
		} else {
			__io__block.writeInt(__io__address + 52, object_type_exclude_viewport);
		}
	}

	/**
	 * Get method for struct member 'object_type_exclude_select'.
	 * @see #__DNA__FIELD__object_type_exclude_select
	 */
	
	public int getObject_type_exclude_select() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'object_type_exclude_select'.
	 * @see #__DNA__FIELD__object_type_exclude_select
	 */
	
	public void setObject_type_exclude_select(int object_type_exclude_select) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, object_type_exclude_select);
		} else {
			__io__block.writeInt(__io__address + 56, object_type_exclude_select);
		}
	}

	/**
	 * Get method for struct member 'persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__persp
	 */
	
	public short getPersp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__persp
	 */
	
	public void setPersp(short persp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, persp);
		} else {
			__io__block.writeShort(__io__address + 60, persp);
		}
	}

	/**
	 * Get method for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__view
	 */
	
	public short getView() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 78);
		} else {
			return __io__block.readShort(__io__address + 62);
		}
	}

	/**
	 * Set method for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__view
	 */
	
	public void setView(short view) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 78, view);
		} else {
			__io__block.writeShort(__io__address + 62, view);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public CPointer<BlenderObject> getCamera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(CPointer<BlenderObject> camera) throws IOException
	{
		long __address = ((camera == null) ? 0 : camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'ob_centre'.
	 * @see #__DNA__FIELD__ob_centre
	 */
	
	public CPointer<BlenderObject> getOb_centre() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob_centre'.
	 * @see #__DNA__FIELD__ob_centre
	 */
	
	public void setOb_centre(CPointer<BlenderObject> ob_centre) throws IOException
	{
		long __address = ((ob_centre == null) ? 0 : ob_centre.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'render_border'.
	 * @see #__DNA__FIELD__render_border
	 */
	
	public rctf getRender_border() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'render_border'.
	 * @see #__DNA__FIELD__render_border
	 */
	
	public void setRender_border(rctf render_border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(render_border, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, render_border)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, render_border);
		} else {
			__io__generic__copy( getRender_border(), render_border);
		}
	}

	/**
	 * Get method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated backup of its self while in localview. </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public CPointer<View3D> getLocalvd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{View3D.class};
		return new CPointer<View3D>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, View3D.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated backup of its self while in localview. </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public void setLocalvd(CPointer<View3D> localvd) throws IOException
	{
		long __address = ((localvd == null) ? 0 : localvd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional string for armature bone to define center, MAXBONENAME. </p>
	 * @see #__DNA__FIELD__ob_centre_bone
	 */
	
	public CArrayFacade<Byte> getOb_centre_bone() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional string for armature bone to define center, MAXBONENAME. </p>
	 * @see #__DNA__FIELD__ob_centre_bone
	 */
	
	public void setOb_centre_bone(CArrayFacade<Byte> ob_centre_bone) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(ob_centre_bone, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ob_centre_bone)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ob_centre_bone);
		} else {
			__io__generic__copy( getOb_centre_bone(), ob_centre_bone);
		}
	}

	/**
	 * Get method for struct member 'local_view_uuid'.
	 * @see #__DNA__FIELD__local_view_uuid
	 */
	
	public short getLocal_view_uuid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'local_view_uuid'.
	 * @see #__DNA__FIELD__local_view_uuid
	 */
	
	public void setLocal_view_uuid(short local_view_uuid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, local_view_uuid);
		} else {
			__io__block.writeShort(__io__address + 156, local_view_uuid);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public CArrayFacade<Byte> get_pad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 158, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(CArrayFacade<Byte> _pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 186;
		} else {
			__dna__offset = 158;
		}
		if (__io__equals(_pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad6);
		} else {
			__io__generic__copy( get_pad6(), _pad6);
		}
	}

	/**
	 * Get method for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layact
	 */
	
	public int getLayact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layact
	 */
	
	public void setLayact(int layact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, layact);
		} else {
			__io__block.writeInt(__io__address + 160, layact);
		}
	}

	/**
	 * Get method for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional bool for 3d cursor to define center. </p>
	 * @see #__DNA__FIELD__ob_centre_cursor
	 */
	
	public short getOb_centre_cursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional bool for 3d cursor to define center. </p>
	 * @see #__DNA__FIELD__ob_centre_cursor
	 */
	
	public void setOb_centre_cursor(short ob_centre_cursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, ob_centre_cursor);
		} else {
			__io__block.writeShort(__io__address + 164, ob_centre_cursor);
		}
	}

	/**
	 * Get method for struct member 'scenelock'.
	 * @see #__DNA__FIELD__scenelock
	 */
	
	public short getScenelock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'scenelock'.
	 * @see #__DNA__FIELD__scenelock
	 */
	
	public void setScenelock(short scenelock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, scenelock);
		} else {
			__io__block.writeShort(__io__address + 166, scenelock);
		}
	}

	/**
	 * Get method for struct member 'gp_flag'.
	 * @see #__DNA__FIELD__gp_flag
	 */
	
	public short getGp_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'gp_flag'.
	 * @see #__DNA__FIELD__gp_flag
	 */
	
	public void setGp_flag(short gp_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, gp_flag);
		} else {
			__io__block.writeShort(__io__address + 168, gp_flag);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, flag);
		} else {
			__io__block.writeShort(__io__address + 170, flag);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public int getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(int flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, flag2);
		} else {
			__io__block.writeInt(__io__address + 172, flag2);
		}
	}

	/**
	 * Get method for struct member 'lens'.
	 * @see #__DNA__FIELD__lens
	 */
	
	public float getLens() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'lens'.
	 * @see #__DNA__FIELD__lens
	 */
	
	public void setLens(float lens) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, lens);
		} else {
			__io__block.writeFloat(__io__address + 176, lens);
		}
	}

	/**
	 * Get method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public float getGrid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public void setGrid(float grid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, grid);
		} else {
			__io__block.writeFloat(__io__address + 180, grid);
		}
	}

	/**
	 * Get method for struct member 'near'.
	 * @see #__DNA__FIELD__near
	 */
	
	public float getNear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'near'.
	 * @see #__DNA__FIELD__near
	 */
	
	public void setNear(float near) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, near);
		} else {
			__io__block.writeFloat(__io__address + 184, near);
		}
	}

	/**
	 * Get method for struct member 'far'.
	 * @see #__DNA__FIELD__far
	 */
	
	public float getFar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'far'.
	 * @see #__DNA__FIELD__far
	 */
	
	public void setFar(float far) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, far);
		} else {
			__io__block.writeFloat(__io__address + 188, far);
		}
	}

	/**
	 * Get method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public CArrayFacade<Float> getOfs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public void setOfs(CArrayFacade<Float> ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(ofs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ofs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ofs);
		} else {
			__io__generic__copy( getOfs(), ofs);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 232;
		} else {
			__dna__offset = 204;
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
	 * Get method for struct member 'gizmo_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo info. #V3D_GIZMO_SHOW_* </p>
	 * @see #__DNA__FIELD__gizmo_flag
	 */
	
	public byte getGizmo_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 233);
		} else {
			return __io__block.readByte(__io__address + 205);
		}
	}

	/**
	 * Set method for struct member 'gizmo_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo info. #V3D_GIZMO_SHOW_* </p>
	 * @see #__DNA__FIELD__gizmo_flag
	 */
	
	public void setGizmo_flag(byte gizmo_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 233, gizmo_flag);
		} else {
			__io__block.writeByte(__io__address + 205, gizmo_flag);
		}
	}

	/**
	 * Get method for struct member 'gizmo_show_object'.
	 * @see #__DNA__FIELD__gizmo_show_object
	 */
	
	public byte getGizmo_show_object() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 234);
		} else {
			return __io__block.readByte(__io__address + 206);
		}
	}

	/**
	 * Set method for struct member 'gizmo_show_object'.
	 * @see #__DNA__FIELD__gizmo_show_object
	 */
	
	public void setGizmo_show_object(byte gizmo_show_object) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 234, gizmo_show_object);
		} else {
			__io__block.writeByte(__io__address + 206, gizmo_show_object);
		}
	}

	/**
	 * Get method for struct member 'gizmo_show_armature'.
	 * @see #__DNA__FIELD__gizmo_show_armature
	 */
	
	public byte getGizmo_show_armature() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 235);
		} else {
			return __io__block.readByte(__io__address + 207);
		}
	}

	/**
	 * Set method for struct member 'gizmo_show_armature'.
	 * @see #__DNA__FIELD__gizmo_show_armature
	 */
	
	public void setGizmo_show_armature(byte gizmo_show_armature) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 235, gizmo_show_armature);
		} else {
			__io__block.writeByte(__io__address + 207, gizmo_show_armature);
		}
	}

	/**
	 * Get method for struct member 'gizmo_show_empty'.
	 * @see #__DNA__FIELD__gizmo_show_empty
	 */
	
	public byte getGizmo_show_empty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 236);
		} else {
			return __io__block.readByte(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'gizmo_show_empty'.
	 * @see #__DNA__FIELD__gizmo_show_empty
	 */
	
	public void setGizmo_show_empty(byte gizmo_show_empty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 236, gizmo_show_empty);
		} else {
			__io__block.writeByte(__io__address + 208, gizmo_show_empty);
		}
	}

	/**
	 * Get method for struct member 'gizmo_show_light'.
	 * @see #__DNA__FIELD__gizmo_show_light
	 */
	
	public byte getGizmo_show_light() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 237);
		} else {
			return __io__block.readByte(__io__address + 209);
		}
	}

	/**
	 * Set method for struct member 'gizmo_show_light'.
	 * @see #__DNA__FIELD__gizmo_show_light
	 */
	
	public void setGizmo_show_light(byte gizmo_show_light) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 237, gizmo_show_light);
		} else {
			__io__block.writeByte(__io__address + 209, gizmo_show_light);
		}
	}

	/**
	 * Get method for struct member 'gizmo_show_camera'.
	 * @see #__DNA__FIELD__gizmo_show_camera
	 */
	
	public byte getGizmo_show_camera() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 238);
		} else {
			return __io__block.readByte(__io__address + 210);
		}
	}

	/**
	 * Set method for struct member 'gizmo_show_camera'.
	 * @see #__DNA__FIELD__gizmo_show_camera
	 */
	
	public void setGizmo_show_camera(byte gizmo_show_camera) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 238, gizmo_show_camera);
		} else {
			__io__block.writeByte(__io__address + 210, gizmo_show_camera);
		}
	}

	/**
	 * Get method for struct member 'gridflag'.
	 * @see #__DNA__FIELD__gridflag
	 */
	
	public byte getGridflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 239);
		} else {
			return __io__block.readByte(__io__address + 211);
		}
	}

	/**
	 * Set method for struct member 'gridflag'.
	 * @see #__DNA__FIELD__gridflag
	 */
	
	public void setGridflag(byte gridflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 239, gridflag);
		} else {
			__io__block.writeByte(__io__address + 211, gridflag);
		}
	}

	/**
	 * Get method for struct member 'gridlines'.
	 * @see #__DNA__FIELD__gridlines
	 */
	
	public short getGridlines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 240);
		} else {
			return __io__block.readShort(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'gridlines'.
	 * @see #__DNA__FIELD__gridlines
	 */
	
	public void setGridlines(short gridlines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 240, gridlines);
		} else {
			__io__block.writeShort(__io__address + 212, gridlines);
		}
	}

	/**
	 * Get method for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line. </p>
	 * @see #__DNA__FIELD__gridsubdiv
	 */
	
	public short getGridsubdiv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 242);
		} else {
			return __io__block.readShort(__io__address + 214);
		}
	}

	/**
	 * Set method for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line. </p>
	 * @see #__DNA__FIELD__gridsubdiv
	 */
	
	public void setGridsubdiv(short gridsubdiv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 242, gridsubdiv);
		} else {
			__io__block.writeShort(__io__address + 214, gridsubdiv);
		}
	}

	/**
	 * Get method for struct member 'vertex_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actually only used to define the opacity of the grease pencil vertex in edit mode. </p>
	 * @see #__DNA__FIELD__vertex_opacity
	 */
	
	public float getVertex_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'vertex_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actually only used to define the opacity of the grease pencil vertex in edit mode. </p>
	 * @see #__DNA__FIELD__vertex_opacity
	 */
	
	public void setVertex_opacity(float vertex_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, vertex_opacity);
		} else {
			__io__block.writeFloat(__io__address + 216, vertex_opacity);
		}
	}

	/**
	 * Get method for struct member 'fx_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  allocated, instead set (temporarily) from camera </p>
	 * @see #__DNA__FIELD__fx_settings
	 */
	
	public GPUFXSettings getFx_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GPUFXSettings(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new GPUFXSettings(__io__address + 220, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fx_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  allocated, instead set (temporarily) from camera </p>
	 * @see #__DNA__FIELD__fx_settings
	 */
	
	public void setFx_settings(GPUFXSettings fx_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 220;
		}
		if (__io__equals(fx_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fx_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fx_settings);
		} else {
			__io__generic__copy( getFx_settings(), fx_settings);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? Grease-Pencil Data (annotation layers). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 236);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? Grease-Pencil Data (annotation layers). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 236, __address);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stereoscopy settings. </p>
	 * @see #__DNA__FIELD__stereo3d_flag
	 */
	
	public short getStereo3d_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 280);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stereoscopy settings. </p>
	 * @see #__DNA__FIELD__stereo3d_flag
	 */
	
	public void setStereo3d_flag(short stereo3d_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 280, stereo3d_flag);
		} else {
			__io__block.writeShort(__io__address + 240, stereo3d_flag);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_camera'.
	 * @see #__DNA__FIELD__stereo3d_camera
	 */
	
	public byte getStereo3d_camera() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 282);
		} else {
			return __io__block.readByte(__io__address + 242);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_camera'.
	 * @see #__DNA__FIELD__stereo3d_camera
	 */
	
	public void setStereo3d_camera(byte stereo3d_camera) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 282, stereo3d_camera);
		} else {
			__io__block.writeByte(__io__address + 242, stereo3d_camera);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public byte get_pad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 283);
		} else {
			return __io__block.readByte(__io__address + 243);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(byte _pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 283, _pad4);
		} else {
			__io__block.writeByte(__io__address + 243, _pad4);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_convergence_factor'.
	 * @see #__DNA__FIELD__stereo3d_convergence_factor
	 */
	
	public float getStereo3d_convergence_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_convergence_factor'.
	 * @see #__DNA__FIELD__stereo3d_convergence_factor
	 */
	
	public void setStereo3d_convergence_factor(float stereo3d_convergence_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, stereo3d_convergence_factor);
		} else {
			__io__block.writeFloat(__io__address + 244, stereo3d_convergence_factor);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_volume_alpha'.
	 * @see #__DNA__FIELD__stereo3d_volume_alpha
	 */
	
	public float getStereo3d_volume_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_volume_alpha'.
	 * @see #__DNA__FIELD__stereo3d_volume_alpha
	 */
	
	public void setStereo3d_volume_alpha(float stereo3d_volume_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, stereo3d_volume_alpha);
		} else {
			__io__block.writeFloat(__io__address + 248, stereo3d_volume_alpha);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_convergence_alpha'.
	 * @see #__DNA__FIELD__stereo3d_convergence_alpha
	 */
	
	public float getStereo3d_convergence_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_convergence_alpha'.
	 * @see #__DNA__FIELD__stereo3d_convergence_alpha
	 */
	
	public void setStereo3d_convergence_alpha(float stereo3d_convergence_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, stereo3d_convergence_alpha);
		} else {
			__io__block.writeFloat(__io__address + 252, stereo3d_convergence_alpha);
		}
	}

	/**
	 * Get method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display settings. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public View3DShading getShading() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3DShading(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new View3DShading(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display settings. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public void setShading(View3DShading shading) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(shading, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shading)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shading);
		} else {
			__io__generic__copy( getShading(), shading);
		}
	}

	/**
	 * Get method for struct member 'overlay'.
	 * @see #__DNA__FIELD__overlay
	 */
	
	public View3DOverlay getOverlay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3DOverlay(__io__address + 1152, __io__block, __io__blockTable);
		} else {
			return new View3DOverlay(__io__address + 1112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'overlay'.
	 * @see #__DNA__FIELD__overlay
	 */
	
	public void setOverlay(View3DOverlay overlay) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1152;
		} else {
			__dna__offset = 1112;
		}
		if (__io__equals(overlay, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, overlay)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, overlay);
		} else {
			__io__generic__copy( getOverlay(), overlay);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public View3D_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3D_Runtime(__io__address + 1216, __io__block, __io__blockTable);
		} else {
			return new View3D_Runtime(__io__address + 1176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(View3D_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1216;
		} else {
			__dna__offset = 1176;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3D> __io__addressof() {
		return new CPointer<View3D>(__io__address, new Class[]{View3D.class}, __io__block, __io__blockTable);
	}

}
