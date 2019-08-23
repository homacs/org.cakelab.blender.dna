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
 * <p> 3D ViewPort Struct </p>
 */

@CMetaData(size32=340, size64=424)
public class View3D extends CFacade {

	/**
	 * This is the sdna index of the struct View3D.
	 * <p>
	 * It is required when allocating a new block to store data for View3D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 207;

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
	 * <p> storage of regions for inactive spaces </p>
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
	 * CPointer&lt;Integer&gt; p_spacetype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'blockscale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__blockscale);
	 * CPointer&lt;Float&gt; p_blockscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockscale = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'blockhandler'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__blockhandler);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_blockhandler = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockhandler'</li>
	 * <li>Signature: 'short[8]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockhandler = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'viewquat'.
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
	public static final long[] __DNA__FIELD__viewquat = new long[]{40, 56};

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
	public static final long[] __DNA__FIELD__dist = new long[]{56, 72};

	/**
	 * Field descriptor (offset) for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of bundles in reconstructed data </p>
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
	public static final long[] __DNA__FIELD__bundle_size = new long[]{60, 76};

	/**
	 * Field descriptor (offset) for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display style for bundle </p>
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
	public static final long[] __DNA__FIELD__bundle_drawtype = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{65, 81};

	/**
	 * Field descriptor (offset) for struct member 'lay_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for active layer toggle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__lay_prev);
	 * CPointer&lt;Integer&gt; p_lay_prev = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay_prev'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay_prev = new long[]{68, 84};

	/**
	 * Field descriptor (offset) for struct member 'lay_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used while drawing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__lay_used);
	 * CPointer&lt;Integer&gt; p_lay_used = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay_used'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay_used = new long[]{72, 88};

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
	public static final long[] __DNA__FIELD__persp = new long[]{76, 92};

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
	public static final long[] __DNA__FIELD__view = new long[]{78, 94};

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
	public static final long[] __DNA__FIELD__camera = new long[]{80, 96};

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
	public static final long[] __DNA__FIELD__ob_centre = new long[]{84, 104};

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
	public static final long[] __DNA__FIELD__render_border = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'bgpicbase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__bgpicbase);
	 * CPointer&lt;ListBase&gt; p_bgpicbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bgpicbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bgpicbase = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'bgpic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * @deprecated
	 *  Deprecateddeprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__bgpic);
	 * CPointer&lt;CPointer&lt;BGpic&gt;&gt; p_bgpic = p.cast(new Class[]{CPointer.class, BGpic.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bgpic'</li>
	 * <li>Signature: 'BGpic*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bgpic = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allocated backup of its self while in localview </p>
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
	public static final long[] __DNA__FIELD__localvd = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional string for armature bone to define center, MAXBONENAME </p>
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
	public static final long[] __DNA__FIELD__ob_centre_bone = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__lay);
	 * CPointer&lt;Integer&gt; p_lay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay = new long[]{184, 224};

	/**
	 * Field descriptor (offset) for struct member 'layact'.
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
	public static final long[] __DNA__FIELD__layact = new long[]{188, 228};

	/**
	 * Field descriptor (offset) for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The drawing mode for the 3d display. Set to OB_BOUNDBOX, OB_WIRE, OB_SOLID, OB_TEXTURE, OB_MATERIAL or OB_RENDER </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__drawtype);
	 * CPointer&lt;Short&gt; p_drawtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawtype = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional bool for 3d cursor to define center </p>
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
	public static final long[] __DNA__FIELD__ob_centre_cursor = new long[]{194, 234};

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
	public static final long[] __DNA__FIELD__scenelock = new long[]{196, 236};

	/**
	 * Field descriptor (offset) for struct member 'around'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__around);
	 * CPointer&lt;Short&gt; p_around = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'around'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__around = new long[]{198, 238};

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
	public static final long[] __DNA__FIELD__flag = new long[]{200, 240};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__flag2);
	 * CPointer&lt;Short&gt; p_flag2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{202, 242};

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
	public static final long[] __DNA__FIELD__lens = new long[]{204, 244};

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
	public static final long[] __DNA__FIELD__grid = new long[]{208, 248};

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
	public static final long[] __DNA__FIELD__near = new long[]{212, 252};

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
	public static final long[] __DNA__FIELD__far = new long[]{216, 256};

	/**
	 * Field descriptor (offset) for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> XXX deprecated </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated </p>
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
	public static final long[] __DNA__FIELD__ofs = new long[]{220, 260};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__cursor);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cursor = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{232, 272};

	/**
	 * Field descriptor (offset) for struct member 'matcap_icon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> icon id </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__matcap_icon);
	 * CPointer&lt;Short&gt; p_matcap_icon = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matcap_icon'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matcap_icon = new long[]{244, 284};

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
	public static final long[] __DNA__FIELD__gridlines = new long[]{246, 286};

	/**
	 * Field descriptor (offset) for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line </p>
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
	public static final long[] __DNA__FIELD__gridsubdiv = new long[]{248, 288};

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
	public static final long[] __DNA__FIELD__gridflag = new long[]{250, 290};

	/**
	 * Field descriptor (offset) for struct member 'twtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> transform widget info </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__twtype);
	 * CPointer&lt;Byte&gt; p_twtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twtype = new long[]{251, 291};

	/**
	 * Field descriptor (offset) for struct member 'twmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__twmode);
	 * CPointer&lt;Byte&gt; p_twmode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twmode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twmode = new long[]{252, 292};

	/**
	 * Field descriptor (offset) for struct member 'twflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__twflag);
	 * CPointer&lt;Byte&gt; p_twflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twflag = new long[]{253, 293};

	/**
	 * Field descriptor (offset) for struct member 'flag3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__flag3);
	 * CPointer&lt;Short&gt; p_flag3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag3 = new long[]{254, 294};

	/**
	 * Field descriptor (offset) for struct member 'afterdraw_transp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> afterdraw, for xray & transparent </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__afterdraw_transp);
	 * CPointer&lt;ListBase&gt; p_afterdraw_transp = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'afterdraw_transp'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__afterdraw_transp = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'afterdraw_xray'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__afterdraw_xray);
	 * CPointer&lt;ListBase&gt; p_afterdraw_xray = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'afterdraw_xray'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__afterdraw_xray = new long[]{264, 312};

	/**
	 * Field descriptor (offset) for struct member 'afterdraw_xraytransp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__afterdraw_xraytransp);
	 * CPointer&lt;ListBase&gt; p_afterdraw_xraytransp = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'afterdraw_xraytransp'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__afterdraw_xraytransp = new long[]{272, 328};

	/**
	 * Field descriptor (offset) for struct member 'zbuf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawflags, denoting state </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__zbuf);
	 * CPointer&lt;Byte&gt; p_zbuf = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zbuf'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zbuf = new long[]{280, 344};

	/**
	 * Field descriptor (offset) for struct member 'transp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__transp);
	 * CPointer&lt;Byte&gt; p_transp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transp = new long[]{281, 345};

	/**
	 * Field descriptor (offset) for struct member 'xray'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__xray);
	 * CPointer&lt;Byte&gt; p_xray = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xray'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xray = new long[]{282, 346};

	/**
	 * Field descriptor (offset) for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview current eye - for internal use </p>
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
	public static final long[] __DNA__FIELD__multiview_eye = new long[]{283, 347};

	/**
	 * Field descriptor (offset) for struct member 'pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> built-in shader effects (eGPUFXFlags) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad3 = new long[]{284, 348};

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
	public static final long[] __DNA__FIELD__fx_settings = new long[]{288, 352};

	/**
	 * Field descriptor (offset) for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here (runtime only!) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__properties_storage);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_properties_storage = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties_storage'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties_storage = new long[]{304, 376};

	/**
	 * Field descriptor (offset) for struct member 'defmaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated per view, not library data (used by matcap). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__defmaterial);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_defmaterial = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defmaterial'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defmaterial = new long[]{308, 384};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? <p> Grease-Pencil Data (annotation layers) </p>
	 * @deprecated
	 *  DeprecatedGrease-Pencil Data (annotation layers) </p>
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
	public static final long[] __DNA__FIELD__gpd = new long[]{312, 392};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview - stereo 3d </p>
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
	public static final long[] __DNA__FIELD__stereo3d_flag = new long[]{316, 400};

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
	public static final long[] __DNA__FIELD__stereo3d_camera = new long[]{318, 402};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__pad4);
	 * CPointer&lt;Byte&gt; p_pad4 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{319, 403};

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
	public static final long[] __DNA__FIELD__stereo3d_convergence_factor = new long[]{320, 404};

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
	public static final long[] __DNA__FIELD__stereo3d_volume_alpha = new long[]{324, 408};

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
	public static final long[] __DNA__FIELD__stereo3d_convergence_alpha = new long[]{328, 412};

	/**
	 * Field descriptor (offset) for struct member 'prev_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Previous viewport draw type. Runtime-only, set in the rendered viewport toggle operator. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__prev_drawtype);
	 * CPointer&lt;Short&gt; p_prev_drawtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_drawtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_drawtype = new long[]{332, 416};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__pad1);
	 * CPointer&lt;Short&gt; p_pad1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{334, 418};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D view3d = ...;
	 * CPointer&lt;Object&gt; p = view3d.__dna__addressof(View3D.__DNA__FIELD__pad2);
	 * CPointer&lt;Float&gt; p_pad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{336, 420};

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
	 * <p> storage of regions for inactive spaces </p>
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
	 * <p> storage of regions for inactive spaces </p>
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
	
	public int getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(int spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, spacetype);
		} else {
			__io__block.writeInt(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'blockscale'.
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public float getBlockscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'blockscale'.
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public void setBlockscale(float blockscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, blockscale);
		} else {
			__io__block.writeFloat(__io__address + 20, blockscale);
		}
	}

	/**
	 * Get method for struct member 'blockhandler'.
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public CArrayFacade<Short> getBlockhandler() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blockhandler'.
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public void setBlockhandler(CArrayFacade<Short> blockhandler) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(blockhandler, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blockhandler)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blockhandler);
		} else {
			__io__generic__copy( getBlockhandler(), blockhandler);
		}
	}

	/**
	 * Get method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
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
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__viewquat
	 */
	
	public void setViewquat(CArrayFacade<Float> viewquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 40;
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
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 56);
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
			__io__block.writeFloat(__io__address + 72, dist);
		} else {
			__io__block.writeFloat(__io__address + 56, dist);
		}
	}

	/**
	 * Get method for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of bundles in reconstructed data </p>
	 * @see #__DNA__FIELD__bundle_size
	 */
	
	public float getBundle_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'bundle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of bundles in reconstructed data </p>
	 * @see #__DNA__FIELD__bundle_size
	 */
	
	public void setBundle_size(float bundle_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, bundle_size);
		} else {
			__io__block.writeFloat(__io__address + 60, bundle_size);
		}
	}

	/**
	 * Get method for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display style for bundle </p>
	 * @see #__DNA__FIELD__bundle_drawtype
	 */
	
	public byte getBundle_drawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'bundle_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display style for bundle </p>
	 * @see #__DNA__FIELD__bundle_drawtype
	 */
	
	public void setBundle_drawtype(byte bundle_drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, bundle_drawtype);
		} else {
			__io__block.writeByte(__io__address + 64, bundle_drawtype);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 81, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 65, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 81;
		} else {
			__dna__offset = 65;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'lay_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for active layer toggle </p>
	 * @see #__DNA__FIELD__lay_prev
	 */
	
	public int getLay_prev() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'lay_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for active layer toggle </p>
	 * @see #__DNA__FIELD__lay_prev
	 */
	
	public void setLay_prev(int lay_prev) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, lay_prev);
		} else {
			__io__block.writeInt(__io__address + 68, lay_prev);
		}
	}

	/**
	 * Get method for struct member 'lay_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used while drawing </p>
	 * @see #__DNA__FIELD__lay_used
	 */
	
	public int getLay_used() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'lay_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used while drawing </p>
	 * @see #__DNA__FIELD__lay_used
	 */
	
	public void setLay_used(int lay_used) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, lay_used);
		} else {
			__io__block.writeInt(__io__address + 72, lay_used);
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
			return __io__block.readShort(__io__address + 92);
		} else {
			return __io__block.readShort(__io__address + 76);
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
			__io__block.writeShort(__io__address + 92, persp);
		} else {
			__io__block.writeShort(__io__address + 76, persp);
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
			return __io__block.readShort(__io__address + 94);
		} else {
			return __io__block.readShort(__io__address + 78);
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
			__io__block.writeShort(__io__address + 94, view);
		} else {
			__io__block.writeShort(__io__address + 78, view);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
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
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
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
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'render_border'.
	 * @see #__DNA__FIELD__render_border
	 */
	
	public rctf getRender_border() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 112, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 88, __io__block, __io__blockTable);
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
			__dna__offset = 112;
		} else {
			__dna__offset = 88;
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
	 * Get method for struct member 'bgpicbase'.
	 * @see #__DNA__FIELD__bgpicbase
	 */
	
	public ListBase getBgpicbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 104, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bgpicbase'.
	 * @see #__DNA__FIELD__bgpicbase
	 */
	
	public void setBgpicbase(ListBase bgpicbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(bgpicbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bgpicbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bgpicbase);
		} else {
			__io__generic__copy( getBgpicbase(), bgpicbase);
		}
	}

	/**
	 * Get method for struct member 'bgpic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * @deprecated
	 *  Deprecateddeprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * @see #__DNA__FIELD__bgpic
	 */
	
	public CPointer<BGpic> getBgpic() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BGpic.class};
		return new CPointer<BGpic>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BGpic.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bgpic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * @deprecated
	 *  Deprecateddeprecated, use bgpicbase, only kept for do_versions(...) </p>
	 * @see #__DNA__FIELD__bgpic
	 */
	
	public void setBgpic(CPointer<BGpic> bgpic) throws IOException
	{
		long __address = ((bgpic == null) ? 0 : bgpic.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allocated backup of its self while in localview </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public CPointer<View3D> getLocalvd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{View3D.class};
		return new CPointer<View3D>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, View3D.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allocated backup of its self while in localview </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public void setLocalvd(CPointer<View3D> localvd) throws IOException
	{
		long __address = ((localvd == null) ? 0 : localvd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional string for armature bone to define center, MAXBONENAME </p>
	 * @see #__DNA__FIELD__ob_centre_bone
	 */
	
	public CArrayFacade<Byte> getOb_centre_bone() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ob_centre_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional string for armature bone to define center, MAXBONENAME </p>
	 * @see #__DNA__FIELD__ob_centre_bone
	 */
	
	public void setOb_centre_bone(CArrayFacade<Byte> ob_centre_bone) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 120;
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
	 * Get method for struct member 'lay'.
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, lay);
		} else {
			__io__block.writeInt(__io__address + 184, lay);
		}
	}

	/**
	 * Get method for struct member 'layact'.
	 * @see #__DNA__FIELD__layact
	 */
	
	public int getLayact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'layact'.
	 * @see #__DNA__FIELD__layact
	 */
	
	public void setLayact(int layact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, layact);
		} else {
			__io__block.writeInt(__io__address + 188, layact);
		}
	}

	/**
	 * Get method for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The drawing mode for the 3d display. Set to OB_BOUNDBOX, OB_WIRE, OB_SOLID, OB_TEXTURE, OB_MATERIAL or OB_RENDER </p>
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public short getDrawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The drawing mode for the 3d display. Set to OB_BOUNDBOX, OB_WIRE, OB_SOLID, OB_TEXTURE, OB_MATERIAL or OB_RENDER </p>
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public void setDrawtype(short drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, drawtype);
		} else {
			__io__block.writeShort(__io__address + 192, drawtype);
		}
	}

	/**
	 * Get method for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional bool for 3d cursor to define center </p>
	 * @see #__DNA__FIELD__ob_centre_cursor
	 */
	
	public short getOb_centre_cursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'ob_centre_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional bool for 3d cursor to define center </p>
	 * @see #__DNA__FIELD__ob_centre_cursor
	 */
	
	public void setOb_centre_cursor(short ob_centre_cursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, ob_centre_cursor);
		} else {
			__io__block.writeShort(__io__address + 194, ob_centre_cursor);
		}
	}

	/**
	 * Get method for struct member 'scenelock'.
	 * @see #__DNA__FIELD__scenelock
	 */
	
	public short getScenelock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'scenelock'.
	 * @see #__DNA__FIELD__scenelock
	 */
	
	public void setScenelock(short scenelock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, scenelock);
		} else {
			__io__block.writeShort(__io__address + 196, scenelock);
		}
	}

	/**
	 * Get method for struct member 'around'.
	 * @see #__DNA__FIELD__around
	 */
	
	public short getAround() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 238);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'around'.
	 * @see #__DNA__FIELD__around
	 */
	
	public void setAround(short around) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 238, around);
		} else {
			__io__block.writeShort(__io__address + 198, around);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 240);
		} else {
			return __io__block.readShort(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 240, flag);
		} else {
			__io__block.writeShort(__io__address + 200, flag);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public short getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 242);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(short flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 242, flag2);
		} else {
			__io__block.writeShort(__io__address + 202, flag2);
		}
	}

	/**
	 * Get method for struct member 'lens'.
	 * @see #__DNA__FIELD__lens
	 */
	
	public float getLens() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'lens'.
	 * @see #__DNA__FIELD__lens
	 */
	
	public void setLens(float lens) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, lens);
		} else {
			__io__block.writeFloat(__io__address + 204, lens);
		}
	}

	/**
	 * Get method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public float getGrid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public void setGrid(float grid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, grid);
		} else {
			__io__block.writeFloat(__io__address + 208, grid);
		}
	}

	/**
	 * Get method for struct member 'near'.
	 * @see #__DNA__FIELD__near
	 */
	
	public float getNear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'near'.
	 * @see #__DNA__FIELD__near
	 */
	
	public void setNear(float near) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, near);
		} else {
			__io__block.writeFloat(__io__address + 212, near);
		}
	}

	/**
	 * Get method for struct member 'far'.
	 * @see #__DNA__FIELD__far
	 */
	
	public float getFar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'far'.
	 * @see #__DNA__FIELD__far
	 */
	
	public void setFar(float far) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, far);
		} else {
			__io__block.writeFloat(__io__address + 216, far);
		}
	}

	/**
	 * Get method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> XXX deprecated </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated </p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public CArrayFacade<Float> getOfs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> XXX deprecated </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated </p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public void setOfs(CArrayFacade<Float> ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 260;
		} else {
			__dna__offset = 220;
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
	 * Get method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public CArrayFacade<Float> getCursor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(CArrayFacade<Float> cursor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(cursor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cursor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cursor);
		} else {
			__io__generic__copy( getCursor(), cursor);
		}
	}

	/**
	 * Get method for struct member 'matcap_icon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> icon id </p>
	 * @see #__DNA__FIELD__matcap_icon
	 */
	
	public short getMatcap_icon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 284);
		} else {
			return __io__block.readShort(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'matcap_icon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> icon id </p>
	 * @see #__DNA__FIELD__matcap_icon
	 */
	
	public void setMatcap_icon(short matcap_icon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 284, matcap_icon);
		} else {
			__io__block.writeShort(__io__address + 244, matcap_icon);
		}
	}

	/**
	 * Get method for struct member 'gridlines'.
	 * @see #__DNA__FIELD__gridlines
	 */
	
	public short getGridlines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 286);
		} else {
			return __io__block.readShort(__io__address + 246);
		}
	}

	/**
	 * Set method for struct member 'gridlines'.
	 * @see #__DNA__FIELD__gridlines
	 */
	
	public void setGridlines(short gridlines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 286, gridlines);
		} else {
			__io__block.writeShort(__io__address + 246, gridlines);
		}
	}

	/**
	 * Get method for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line </p>
	 * @see #__DNA__FIELD__gridsubdiv
	 */
	
	public short getGridsubdiv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 288);
		} else {
			return __io__block.readShort(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'gridsubdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of subdivisions in the grid between each highlighted grid line </p>
	 * @see #__DNA__FIELD__gridsubdiv
	 */
	
	public void setGridsubdiv(short gridsubdiv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 288, gridsubdiv);
		} else {
			__io__block.writeShort(__io__address + 248, gridsubdiv);
		}
	}

	/**
	 * Get method for struct member 'gridflag'.
	 * @see #__DNA__FIELD__gridflag
	 */
	
	public byte getGridflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 290);
		} else {
			return __io__block.readByte(__io__address + 250);
		}
	}

	/**
	 * Set method for struct member 'gridflag'.
	 * @see #__DNA__FIELD__gridflag
	 */
	
	public void setGridflag(byte gridflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 290, gridflag);
		} else {
			__io__block.writeByte(__io__address + 250, gridflag);
		}
	}

	/**
	 * Get method for struct member 'twtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> transform widget info </p>
	 * @see #__DNA__FIELD__twtype
	 */
	
	public byte getTwtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 291);
		} else {
			return __io__block.readByte(__io__address + 251);
		}
	}

	/**
	 * Set method for struct member 'twtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> transform widget info </p>
	 * @see #__DNA__FIELD__twtype
	 */
	
	public void setTwtype(byte twtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 291, twtype);
		} else {
			__io__block.writeByte(__io__address + 251, twtype);
		}
	}

	/**
	 * Get method for struct member 'twmode'.
	 * @see #__DNA__FIELD__twmode
	 */
	
	public byte getTwmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 292);
		} else {
			return __io__block.readByte(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'twmode'.
	 * @see #__DNA__FIELD__twmode
	 */
	
	public void setTwmode(byte twmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 292, twmode);
		} else {
			__io__block.writeByte(__io__address + 252, twmode);
		}
	}

	/**
	 * Get method for struct member 'twflag'.
	 * @see #__DNA__FIELD__twflag
	 */
	
	public byte getTwflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 293);
		} else {
			return __io__block.readByte(__io__address + 253);
		}
	}

	/**
	 * Set method for struct member 'twflag'.
	 * @see #__DNA__FIELD__twflag
	 */
	
	public void setTwflag(byte twflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 293, twflag);
		} else {
			__io__block.writeByte(__io__address + 253, twflag);
		}
	}

	/**
	 * Get method for struct member 'flag3'.
	 * @see #__DNA__FIELD__flag3
	 */
	
	public short getFlag3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 294);
		} else {
			return __io__block.readShort(__io__address + 254);
		}
	}

	/**
	 * Set method for struct member 'flag3'.
	 * @see #__DNA__FIELD__flag3
	 */
	
	public void setFlag3(short flag3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 294, flag3);
		} else {
			__io__block.writeShort(__io__address + 254, flag3);
		}
	}

	/**
	 * Get method for struct member 'afterdraw_transp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> afterdraw, for xray & transparent </p>
	 * @see #__DNA__FIELD__afterdraw_transp
	 */
	
	public ListBase getAfterdraw_transp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'afterdraw_transp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> afterdraw, for xray & transparent </p>
	 * @see #__DNA__FIELD__afterdraw_transp
	 */
	
	public void setAfterdraw_transp(ListBase afterdraw_transp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(afterdraw_transp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, afterdraw_transp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, afterdraw_transp);
		} else {
			__io__generic__copy( getAfterdraw_transp(), afterdraw_transp);
		}
	}

	/**
	 * Get method for struct member 'afterdraw_xray'.
	 * @see #__DNA__FIELD__afterdraw_xray
	 */
	
	public ListBase getAfterdraw_xray() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'afterdraw_xray'.
	 * @see #__DNA__FIELD__afterdraw_xray
	 */
	
	public void setAfterdraw_xray(ListBase afterdraw_xray) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(afterdraw_xray, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, afterdraw_xray)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, afterdraw_xray);
		} else {
			__io__generic__copy( getAfterdraw_xray(), afterdraw_xray);
		}
	}

	/**
	 * Get method for struct member 'afterdraw_xraytransp'.
	 * @see #__DNA__FIELD__afterdraw_xraytransp
	 */
	
	public ListBase getAfterdraw_xraytransp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 272, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'afterdraw_xraytransp'.
	 * @see #__DNA__FIELD__afterdraw_xraytransp
	 */
	
	public void setAfterdraw_xraytransp(ListBase afterdraw_xraytransp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(afterdraw_xraytransp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, afterdraw_xraytransp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, afterdraw_xraytransp);
		} else {
			__io__generic__copy( getAfterdraw_xraytransp(), afterdraw_xraytransp);
		}
	}

	/**
	 * Get method for struct member 'zbuf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawflags, denoting state </p>
	 * @see #__DNA__FIELD__zbuf
	 */
	
	public byte getZbuf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 344);
		} else {
			return __io__block.readByte(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'zbuf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawflags, denoting state </p>
	 * @see #__DNA__FIELD__zbuf
	 */
	
	public void setZbuf(byte zbuf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 344, zbuf);
		} else {
			__io__block.writeByte(__io__address + 280, zbuf);
		}
	}

	/**
	 * Get method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public byte getTransp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 345);
		} else {
			return __io__block.readByte(__io__address + 281);
		}
	}

	/**
	 * Set method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public void setTransp(byte transp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 345, transp);
		} else {
			__io__block.writeByte(__io__address + 281, transp);
		}
	}

	/**
	 * Get method for struct member 'xray'.
	 * @see #__DNA__FIELD__xray
	 */
	
	public byte getXray() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 346);
		} else {
			return __io__block.readByte(__io__address + 282);
		}
	}

	/**
	 * Set method for struct member 'xray'.
	 * @see #__DNA__FIELD__xray
	 */
	
	public void setXray(byte xray) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 346, xray);
		} else {
			__io__block.writeByte(__io__address + 282, xray);
		}
	}

	/**
	 * Get method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview current eye - for internal use </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public byte getMultiview_eye() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 347);
		} else {
			return __io__block.readByte(__io__address + 283);
		}
	}

	/**
	 * Set method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview current eye - for internal use </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public void setMultiview_eye(byte multiview_eye) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 347, multiview_eye);
		} else {
			__io__block.writeByte(__io__address + 283, multiview_eye);
		}
	}

	/**
	 * Get method for struct member 'pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> built-in shader effects (eGPUFXFlags) </p>
	 * @see #__DNA__FIELD__pad3
	 */
	
	public CArrayFacade<Byte> getPad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> built-in shader effects (eGPUFXFlags) </p>
	 * @see #__DNA__FIELD__pad3
	 */
	
	public void setPad3(CArrayFacade<Byte> pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 348;
		} else {
			__dna__offset = 284;
		}
		if (__io__equals(pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad3);
		} else {
			__io__generic__copy( getPad3(), pad3);
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
			return new GPUFXSettings(__io__address + 352, __io__block, __io__blockTable);
		} else {
			return new GPUFXSettings(__io__address + 288, __io__block, __io__blockTable);
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
			__dna__offset = 352;
		} else {
			__dna__offset = 288;
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
	 * Get method for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here (runtime only!) </p>
	 * @see #__DNA__FIELD__properties_storage
	 */
	
	public CPointer<Object> getProperties_storage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here (runtime only!) </p>
	 * @see #__DNA__FIELD__properties_storage
	 */
	
	public void setProperties_storage(CPointer<Object> properties_storage) throws IOException
	{
		long __address = ((properties_storage == null) ? 0 : properties_storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 304, __address);
		}
	}

	/**
	 * Get method for struct member 'defmaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated per view, not library data (used by matcap). </p>
	 * @see #__DNA__FIELD__defmaterial
	 */
	
	public CPointer<Material> getDefmaterial() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 308);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Material.class};
		return new CPointer<Material>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Material.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'defmaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated per view, not library data (used by matcap). </p>
	 * @see #__DNA__FIELD__defmaterial
	 */
	
	public void setDefmaterial(CPointer<Material> defmaterial) throws IOException
	{
		long __address = ((defmaterial == null) ? 0 : defmaterial.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 308, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? <p> Grease-Pencil Data (annotation layers) </p>
	 * @deprecated
	 *  DeprecatedGrease-Pencil Data (annotation layers) </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated? <p> Grease-Pencil Data (annotation layers) </p>
	 * @deprecated
	 *  DeprecatedGrease-Pencil Data (annotation layers) </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 312, __address);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview - stereo 3d </p>
	 * @see #__DNA__FIELD__stereo3d_flag
	 */
	
	public short getStereo3d_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 400);
		} else {
			return __io__block.readShort(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiview - stereo 3d </p>
	 * @see #__DNA__FIELD__stereo3d_flag
	 */
	
	public void setStereo3d_flag(short stereo3d_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 400, stereo3d_flag);
		} else {
			__io__block.writeShort(__io__address + 316, stereo3d_flag);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_camera'.
	 * @see #__DNA__FIELD__stereo3d_camera
	 */
	
	public byte getStereo3d_camera() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 402);
		} else {
			return __io__block.readByte(__io__address + 318);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_camera'.
	 * @see #__DNA__FIELD__stereo3d_camera
	 */
	
	public void setStereo3d_camera(byte stereo3d_camera) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 402, stereo3d_camera);
		} else {
			__io__block.writeByte(__io__address + 318, stereo3d_camera);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public byte getPad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 403);
		} else {
			return __io__block.readByte(__io__address + 319);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(byte pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 403, pad4);
		} else {
			__io__block.writeByte(__io__address + 319, pad4);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_convergence_factor'.
	 * @see #__DNA__FIELD__stereo3d_convergence_factor
	 */
	
	public float getStereo3d_convergence_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 404);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_convergence_factor'.
	 * @see #__DNA__FIELD__stereo3d_convergence_factor
	 */
	
	public void setStereo3d_convergence_factor(float stereo3d_convergence_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 404, stereo3d_convergence_factor);
		} else {
			__io__block.writeFloat(__io__address + 320, stereo3d_convergence_factor);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_volume_alpha'.
	 * @see #__DNA__FIELD__stereo3d_volume_alpha
	 */
	
	public float getStereo3d_volume_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 408);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_volume_alpha'.
	 * @see #__DNA__FIELD__stereo3d_volume_alpha
	 */
	
	public void setStereo3d_volume_alpha(float stereo3d_volume_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 408, stereo3d_volume_alpha);
		} else {
			__io__block.writeFloat(__io__address + 324, stereo3d_volume_alpha);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_convergence_alpha'.
	 * @see #__DNA__FIELD__stereo3d_convergence_alpha
	 */
	
	public float getStereo3d_convergence_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 412);
		} else {
			return __io__block.readFloat(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_convergence_alpha'.
	 * @see #__DNA__FIELD__stereo3d_convergence_alpha
	 */
	
	public void setStereo3d_convergence_alpha(float stereo3d_convergence_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 412, stereo3d_convergence_alpha);
		} else {
			__io__block.writeFloat(__io__address + 328, stereo3d_convergence_alpha);
		}
	}

	/**
	 * Get method for struct member 'prev_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Previous viewport draw type. Runtime-only, set in the rendered viewport toggle operator. </p>
	 * @see #__DNA__FIELD__prev_drawtype
	 */
	
	public short getPrev_drawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 416);
		} else {
			return __io__block.readShort(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'prev_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Previous viewport draw type. Runtime-only, set in the rendered viewport toggle operator. </p>
	 * @see #__DNA__FIELD__prev_drawtype
	 */
	
	public void setPrev_drawtype(short prev_drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 416, prev_drawtype);
		} else {
			__io__block.writeShort(__io__address + 332, prev_drawtype);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public short getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 418);
		} else {
			return __io__block.readShort(__io__address + 334);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(short pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 418, pad1);
		} else {
			__io__block.writeShort(__io__address + 334, pad1);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public float getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 420);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(float pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 420, pad2);
		} else {
			__io__block.writeFloat(__io__address + 336, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3D> __io__addressof() {
		return new CPointer<View3D>(__io__address, new Class[]{View3D.class}, __io__block, __io__blockTable);
	}

}
