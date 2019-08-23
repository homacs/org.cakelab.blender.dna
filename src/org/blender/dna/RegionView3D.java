package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RegionView3D'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=912, size64=936)
public class RegionView3D extends CFacade {

	/**
	 * This is the sdna index of the struct RegionView3D.
	 * <p>
	 * It is required when allocating a new block to store data for RegionView3D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 210;

	/**
	 * Field descriptor (offset) for struct member 'winmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_PROJECTION matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__winmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_winmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winmat = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'viewmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_MODELVIEW matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_viewmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewmat = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'viewinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of viewmat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_viewinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewinv = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'persmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewmat*winmat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__persmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_persmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persmat = new long[]{192, 192};

	/**
	 * Field descriptor (offset) for struct member 'persinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of persmat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__persinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_persinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persinv = new long[]{256, 256};

	/**
	 * Field descriptor (offset) for struct member 'viewcamtexcofac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset/scale for camera glsl texcoords. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewcamtexcofac);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_viewcamtexcofac = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewcamtexcofac'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewcamtexcofac = new long[]{320, 320};

	/**
	 * Field descriptor (offset) for struct member 'viewmatob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> viewmat/persmat multiplied with object matrix, while drawing and selection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewmatob);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_viewmatob = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewmatob'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewmatob = new long[]{336, 336};

	/**
	 * Field descriptor (offset) for struct member 'persmatob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__persmatob);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_persmatob = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persmatob'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persmatob = new long[]{400, 400};

	/**
	 * Field descriptor (offset) for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User defined clipping planes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__clip);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_clip = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip'</li>
	 * <li>Signature: 'float[6][4]'</li>
	 * <li>Actual Size (32bit/64bit): 96/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip = new long[]{464, 464};

	/**
	 * Field descriptor (offset) for struct member 'clip_local'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clip in object space, means we can test for clipping in editmode without first going into worldspace. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__clip_local);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_clip_local = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_local'</li>
	 * <li>Signature: 'float[6][4]'</li>
	 * <li>Actual Size (32bit/64bit): 96/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_local = new long[]{560, 560};

	/**
	 * Field descriptor (offset) for struct member 'clipbb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__clipbb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_clipbb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipbb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipbb = new long[]{656, 656};

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
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__localvd);
	 * CPointer&lt;CPointer&lt;RegionView3D&gt;&gt; p_localvd = p.cast(new Class[]{CPointer.class, RegionView3D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'localvd'</li>
	 * <li>Signature: 'RegionView3D*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__localvd = new long[]{660, 664};

	/**
	 * Field descriptor (offset) for struct member 'render_engine'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__render_engine);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_render_engine = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_engine'</li>
	 * <li>Signature: 'RenderEngine*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_engine = new long[]{664, 672};

	/**
	 * Field descriptor (offset) for struct member 'depths'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__depths);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_depths = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depths'</li>
	 * <li>Signature: 'ViewDepths*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depths = new long[]{668, 680};

	/**
	 * Field descriptor (offset) for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animated smooth view. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__sms);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sms = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sms'</li>
	 * <li>Signature: 'SmoothView3DStore*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sms = new long[]{672, 688};

	/**
	 * Field descriptor (offset) for struct member 'smooth_timer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__smooth_timer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_smooth_timer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_timer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_timer = new long[]{676, 696};

	/**
	 * Field descriptor (offset) for struct member 'twmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__twmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_twmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twmat = new long[]{680, 704};

	/**
	 * Field descriptor (offset) for struct member 'tw_axis_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max dot product on twmat xyz axis. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__tw_axis_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tw_axis_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tw_axis_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tw_axis_min = new long[]{744, 768};

	/**
	 * Field descriptor (offset) for struct member 'tw_axis_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__tw_axis_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tw_axis_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tw_axis_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tw_axis_max = new long[]{756, 780};

	/**
	 * Field descriptor (offset) for struct member 'tw_axis_matrix'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__tw_axis_matrix);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_tw_axis_matrix = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tw_axis_matrix'</li>
	 * <li>Signature: 'float[3][3]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tw_axis_matrix = new long[]{768, 792};

	/**
	 * Field descriptor (offset) for struct member 'gridview'.
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
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__gridview);
	 * CPointer&lt;Float&gt; p_gridview = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gridview'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gridview = new long[]{804, 828};

	/**
	 * Field descriptor (offset) for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View rotation, must be kept normalized. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewquat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_viewquat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewquat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewquat = new long[]{808, 832};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance from 'ofs' along -viewinv[2] vector, where result is negative as is 'ofs'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{824, 848};

	/**
	 * Field descriptor (offset) for struct member 'camdx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  view offsets, 1.0 = viewplane moves entire width/height. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__camdx);
	 * CPointer&lt;Float&gt; p_camdx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camdx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camdx = new long[]{828, 852};

	/**
	 * Field descriptor (offset) for struct member 'camdy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__camdy);
	 * CPointer&lt;Float&gt; p_camdy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camdy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camdy = new long[]{832, 856};

	/**
	 * Field descriptor (offset) for struct member 'pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__pixsize);
	 * CPointer&lt;Float&gt; p_pixsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixsize = new long[]{836, 860};

	/**
	 * Field descriptor (offset) for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View center & orbit pivot, negative of worldspace location, also matches -viewinv[3][0:3] in ortho mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofs'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofs = new long[]{840, 864};

	/**
	 * Field descriptor (offset) for struct member 'camzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport zoom on the camera frame, see BKE_screen_view3d_zoom_to_fac. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__camzoom);
	 * CPointer&lt;Float&gt; p_camzoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camzoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camzoom = new long[]{852, 876};

	/**
	 * Field descriptor (offset) for struct member 'is_persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Check if persp/ortho view, since 'persp' cant be used for this since it can have cameras assigned as well. (only set in #view3d_winmatrix_set) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__is_persp);
	 * CPointer&lt;Byte&gt; p_is_persp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_persp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_persp = new long[]{856, 880};

	/**
	 * Field descriptor (offset) for struct member 'persp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__persp);
	 * CPointer&lt;Byte&gt; p_persp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persp = new long[]{857, 881};

	/**
	 * Field descriptor (offset) for struct member 'view'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__view);
	 * CPointer&lt;Byte&gt; p_view = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view = new long[]{858, 882};

	/**
	 * Field descriptor (offset) for struct member 'viewlock'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewlock);
	 * CPointer&lt;Byte&gt; p_viewlock = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewlock'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewlock = new long[]{859, 883};

	/**
	 * Field descriptor (offset) for struct member 'viewlock_quad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for quadview (store while out of quad view). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__viewlock_quad);
	 * CPointer&lt;Byte&gt; p_viewlock_quad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewlock_quad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewlock_quad = new long[]{860, 884};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{861, 885};

	/**
	 * Field descriptor (offset) for struct member 'ofs_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Normalized offset for locked view: (-1, -1) bottom left, (1, 1) upper right. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__ofs_lock);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ofs_lock = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofs_lock'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofs_lock = new long[]{864, 888};

	/**
	 * Field descriptor (offset) for struct member 'twdrawflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX can easily get rid of this (Julian). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__twdrawflag);
	 * CPointer&lt;Short&gt; p_twdrawflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twdrawflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twdrawflag = new long[]{872, 896};

	/**
	 * Field descriptor (offset) for struct member 'rflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__rflag);
	 * CPointer&lt;Short&gt; p_rflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rflag = new long[]{874, 898};

	/**
	 * Field descriptor (offset) for struct member 'lviewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last view (use when switching out of camera view). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__lviewquat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lviewquat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lviewquat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lviewquat = new long[]{876, 900};

	/**
	 * Field descriptor (offset) for struct member 'lpersp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lpersp can never be set to 'RV3D_CAMOB'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__lpersp);
	 * CPointer&lt;Short&gt; p_lpersp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lpersp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lpersp = new long[]{892, 916};

	/**
	 * Field descriptor (offset) for struct member 'lview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__lview);
	 * CPointer&lt;Short&gt; p_lview = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lview'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lview = new long[]{894, 918};

	/**
	 * Field descriptor (offset) for struct member 'rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active rotation from NDOF or elsewhere. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__rot_angle);
	 * CPointer&lt;Float&gt; p_rot_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot_angle = new long[]{896, 920};

	/**
	 * Field descriptor (offset) for struct member 'rot_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RegionView3D regionview3d = ...;
	 * CPointer&lt;Object&gt; p = regionview3d.__dna__addressof(RegionView3D.__DNA__FIELD__rot_axis);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot_axis = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot_axis'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot_axis = new long[]{900, 924};

	public RegionView3D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RegionView3D(RegionView3D that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'winmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_PROJECTION matrix. </p>
	 * @see #__DNA__FIELD__winmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getWinmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'winmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_PROJECTION matrix. </p>
	 * @see #__DNA__FIELD__winmat
	 */
	
	public void setWinmat(CArrayFacade<CArrayFacade<Float>> winmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(winmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, winmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, winmat);
		} else {
			__io__generic__copy( getWinmat(), winmat);
		}
	}

	/**
	 * Get method for struct member 'viewmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_MODELVIEW matrix. </p>
	 * @see #__DNA__FIELD__viewmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getViewmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GL_MODELVIEW matrix. </p>
	 * @see #__DNA__FIELD__viewmat
	 */
	
	public void setViewmat(CArrayFacade<CArrayFacade<Float>> viewmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(viewmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewmat);
		} else {
			__io__generic__copy( getViewmat(), viewmat);
		}
	}

	/**
	 * Get method for struct member 'viewinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of viewmat. </p>
	 * @see #__DNA__FIELD__viewinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getViewinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of viewmat. </p>
	 * @see #__DNA__FIELD__viewinv
	 */
	
	public void setViewinv(CArrayFacade<CArrayFacade<Float>> viewinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(viewinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewinv);
		} else {
			__io__generic__copy( getViewinv(), viewinv);
		}
	}

	/**
	 * Get method for struct member 'persmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewmat*winmat. </p>
	 * @see #__DNA__FIELD__persmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getPersmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'persmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewmat*winmat. </p>
	 * @see #__DNA__FIELD__persmat
	 */
	
	public void setPersmat(CArrayFacade<CArrayFacade<Float>> persmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(persmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, persmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, persmat);
		} else {
			__io__generic__copy( getPersmat(), persmat);
		}
	}

	/**
	 * Get method for struct member 'persinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of persmat. </p>
	 * @see #__DNA__FIELD__persinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getPersinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'persinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse of persmat. </p>
	 * @see #__DNA__FIELD__persinv
	 */
	
	public void setPersinv(CArrayFacade<CArrayFacade<Float>> persinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(persinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, persinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, persinv);
		} else {
			__io__generic__copy( getPersinv(), persinv);
		}
	}

	/**
	 * Get method for struct member 'viewcamtexcofac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset/scale for camera glsl texcoords. </p>
	 * @see #__DNA__FIELD__viewcamtexcofac
	 */
	
	public CArrayFacade<Float> getViewcamtexcofac() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewcamtexcofac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset/scale for camera glsl texcoords. </p>
	 * @see #__DNA__FIELD__viewcamtexcofac
	 */
	
	public void setViewcamtexcofac(CArrayFacade<Float> viewcamtexcofac) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 320;
		}
		if (__io__equals(viewcamtexcofac, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewcamtexcofac)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewcamtexcofac);
		} else {
			__io__generic__copy( getViewcamtexcofac(), viewcamtexcofac);
		}
	}

	/**
	 * Get method for struct member 'viewmatob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> viewmat/persmat multiplied with object matrix, while drawing and selection. </p>
	 * @see #__DNA__FIELD__viewmatob
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getViewmatob() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewmatob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> viewmat/persmat multiplied with object matrix, while drawing and selection. </p>
	 * @see #__DNA__FIELD__viewmatob
	 */
	
	public void setViewmatob(CArrayFacade<CArrayFacade<Float>> viewmatob) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(viewmatob, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewmatob)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewmatob);
		} else {
			__io__generic__copy( getViewmatob(), viewmatob);
		}
	}

	/**
	 * Get method for struct member 'persmatob'.
	 * @see #__DNA__FIELD__persmatob
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getPersmatob() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'persmatob'.
	 * @see #__DNA__FIELD__persmatob
	 */
	
	public void setPersmatob(CArrayFacade<CArrayFacade<Float>> persmatob) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 400;
		}
		if (__io__equals(persmatob, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, persmatob)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, persmatob);
		} else {
			__io__generic__copy( getPersmatob(), persmatob);
		}
	}

	/**
	 * Get method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User defined clipping planes. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getClip() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			6,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User defined clipping planes. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CArrayFacade<CArrayFacade<Float>> clip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 464;
		}
		if (__io__equals(clip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clip);
		} else {
			__io__generic__copy( getClip(), clip);
		}
	}

	/**
	 * Get method for struct member 'clip_local'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clip in object space, means we can test for clipping in editmode without first going into worldspace. </p>
	 * @see #__DNA__FIELD__clip_local
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getClip_local() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			6,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clip_local'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clip in object space, means we can test for clipping in editmode without first going into worldspace. </p>
	 * @see #__DNA__FIELD__clip_local
	 */
	
	public void setClip_local(CArrayFacade<CArrayFacade<Float>> clip_local) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 560;
		} else {
			__dna__offset = 560;
		}
		if (__io__equals(clip_local, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clip_local)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clip_local);
		} else {
			__io__generic__copy( getClip_local(), clip_local);
		}
	}

	/**
	 * Get method for struct member 'clipbb'.
	 * @see #__DNA__FIELD__clipbb
	 */
	
	public CPointer<BoundBox> getClipbb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 656);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 656);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clipbb'.
	 * @see #__DNA__FIELD__clipbb
	 */
	
	public void setClipbb(CPointer<BoundBox> clipbb) throws IOException
	{
		long __address = ((clipbb == null) ? 0 : clipbb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 656, __address);
		} else {
			__io__block.writeLong(__io__address + 656, __address);
		}
	}

	/**
	 * Get method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated backup of its self while in localview. </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public CPointer<RegionView3D> getLocalvd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 660);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RegionView3D.class};
		return new CPointer<RegionView3D>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RegionView3D.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'localvd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Allocated backup of its self while in localview. </p>
	 * @see #__DNA__FIELD__localvd
	 */
	
	public void setLocalvd(CPointer<RegionView3D> localvd) throws IOException
	{
		long __address = ((localvd == null) ? 0 : localvd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 664, __address);
		} else {
			__io__block.writeLong(__io__address + 660, __address);
		}
	}

	/**
	 * Get method for struct member 'render_engine'.
	 * @see #__DNA__FIELD__render_engine
	 */
	
	public CPointer<Object> getRender_engine() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 672);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'render_engine'.
	 * @see #__DNA__FIELD__render_engine
	 */
	
	public void setRender_engine(CPointer<Object> render_engine) throws IOException
	{
		long __address = ((render_engine == null) ? 0 : render_engine.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 672, __address);
		} else {
			__io__block.writeLong(__io__address + 664, __address);
		}
	}

	/**
	 * Get method for struct member 'depths'.
	 * @see #__DNA__FIELD__depths
	 */
	
	public CPointer<Object> getDepths() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 680);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 668);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'depths'.
	 * @see #__DNA__FIELD__depths
	 */
	
	public void setDepths(CPointer<Object> depths) throws IOException
	{
		long __address = ((depths == null) ? 0 : depths.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 680, __address);
		} else {
			__io__block.writeLong(__io__address + 668, __address);
		}
	}

	/**
	 * Get method for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animated smooth view. </p>
	 * @see #__DNA__FIELD__sms
	 */
	
	public CPointer<Object> getSms() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 688);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 672);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animated smooth view. </p>
	 * @see #__DNA__FIELD__sms
	 */
	
	public void setSms(CPointer<Object> sms) throws IOException
	{
		long __address = ((sms == null) ? 0 : sms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 688, __address);
		} else {
			__io__block.writeLong(__io__address + 672, __address);
		}
	}

	/**
	 * Get method for struct member 'smooth_timer'.
	 * @see #__DNA__FIELD__smooth_timer
	 */
	
	public CPointer<Object> getSmooth_timer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 696);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 676);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'smooth_timer'.
	 * @see #__DNA__FIELD__smooth_timer
	 */
	
	public void setSmooth_timer(CPointer<Object> smooth_timer) throws IOException
	{
		long __address = ((smooth_timer == null) ? 0 : smooth_timer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 696, __address);
		} else {
			__io__block.writeLong(__io__address + 676, __address);
		}
	}

	/**
	 * Get method for struct member 'twmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo matrix. </p>
	 * @see #__DNA__FIELD__twmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getTwmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 704, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 680, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'twmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform gizmo matrix. </p>
	 * @see #__DNA__FIELD__twmat
	 */
	
	public void setTwmat(CArrayFacade<CArrayFacade<Float>> twmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 704;
		} else {
			__dna__offset = 680;
		}
		if (__io__equals(twmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, twmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, twmat);
		} else {
			__io__generic__copy( getTwmat(), twmat);
		}
	}

	/**
	 * Get method for struct member 'tw_axis_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max dot product on twmat xyz axis. </p>
	 * @see #__DNA__FIELD__tw_axis_min
	 */
	
	public CArrayFacade<Float> getTw_axis_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 768, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 744, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tw_axis_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max dot product on twmat xyz axis. </p>
	 * @see #__DNA__FIELD__tw_axis_min
	 */
	
	public void setTw_axis_min(CArrayFacade<Float> tw_axis_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 768;
		} else {
			__dna__offset = 744;
		}
		if (__io__equals(tw_axis_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tw_axis_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tw_axis_min);
		} else {
			__io__generic__copy( getTw_axis_min(), tw_axis_min);
		}
	}

	/**
	 * Get method for struct member 'tw_axis_max'.
	 * @see #__DNA__FIELD__tw_axis_max
	 */
	
	public CArrayFacade<Float> getTw_axis_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 780, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 756, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tw_axis_max'.
	 * @see #__DNA__FIELD__tw_axis_max
	 */
	
	public void setTw_axis_max(CArrayFacade<Float> tw_axis_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 780;
		} else {
			__dna__offset = 756;
		}
		if (__io__equals(tw_axis_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tw_axis_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tw_axis_max);
		} else {
			__io__generic__copy( getTw_axis_max(), tw_axis_max);
		}
	}

	/**
	 * Get method for struct member 'tw_axis_matrix'.
	 * @see #__DNA__FIELD__tw_axis_matrix
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getTw_axis_matrix() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 792, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 768, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tw_axis_matrix'.
	 * @see #__DNA__FIELD__tw_axis_matrix
	 */
	
	public void setTw_axis_matrix(CArrayFacade<CArrayFacade<Float>> tw_axis_matrix) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 792;
		} else {
			__dna__offset = 768;
		}
		if (__io__equals(tw_axis_matrix, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tw_axis_matrix)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tw_axis_matrix);
		} else {
			__io__generic__copy( getTw_axis_matrix(), tw_axis_matrix);
		}
	}

	/**
	 * Get method for struct member 'gridview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gridview
	 */
	
	public float getGridview() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 828);
		} else {
			return __io__block.readFloat(__io__address + 804);
		}
	}

	/**
	 * Set method for struct member 'gridview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gridview
	 */
	
	public void setGridview(float gridview) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 828, gridview);
		} else {
			__io__block.writeFloat(__io__address + 804, gridview);
		}
	}

	/**
	 * Get method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View rotation, must be kept normalized. </p>
	 * @see #__DNA__FIELD__viewquat
	 */
	
	public CArrayFacade<Float> getViewquat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 832, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 808, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View rotation, must be kept normalized. </p>
	 * @see #__DNA__FIELD__viewquat
	 */
	
	public void setViewquat(CArrayFacade<Float> viewquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 832;
		} else {
			__dna__offset = 808;
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
	 * <p> Distance from 'ofs' along -viewinv[2] vector, where result is negative as is 'ofs'. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 848);
		} else {
			return __io__block.readFloat(__io__address + 824);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance from 'ofs' along -viewinv[2] vector, where result is negative as is 'ofs'. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 848, dist);
		} else {
			__io__block.writeFloat(__io__address + 824, dist);
		}
	}

	/**
	 * Get method for struct member 'camdx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  view offsets, 1.0 = viewplane moves entire width/height. </p>
	 * @see #__DNA__FIELD__camdx
	 */
	
	public float getCamdx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 852);
		} else {
			return __io__block.readFloat(__io__address + 828);
		}
	}

	/**
	 * Set method for struct member 'camdx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  view offsets, 1.0 = viewplane moves entire width/height. </p>
	 * @see #__DNA__FIELD__camdx
	 */
	
	public void setCamdx(float camdx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 852, camdx);
		} else {
			__io__block.writeFloat(__io__address + 828, camdx);
		}
	}

	/**
	 * Get method for struct member 'camdy'.
	 * @see #__DNA__FIELD__camdy
	 */
	
	public float getCamdy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 856);
		} else {
			return __io__block.readFloat(__io__address + 832);
		}
	}

	/**
	 * Set method for struct member 'camdy'.
	 * @see #__DNA__FIELD__camdy
	 */
	
	public void setCamdy(float camdy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 856, camdy);
		} else {
			__io__block.writeFloat(__io__address + 832, camdy);
		}
	}

	/**
	 * Get method for struct member 'pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__pixsize
	 */
	
	public float getPixsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 860);
		} else {
			return __io__block.readFloat(__io__address + 836);
		}
	}

	/**
	 * Set method for struct member 'pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__pixsize
	 */
	
	public void setPixsize(float pixsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 860, pixsize);
		} else {
			__io__block.writeFloat(__io__address + 836, pixsize);
		}
	}

	/**
	 * Get method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View center & orbit pivot, negative of worldspace location, also matches -viewinv[3][0:3] in ortho mode. </p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public CArrayFacade<Float> getOfs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 864, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 840, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> View center & orbit pivot, negative of worldspace location, also matches -viewinv[3][0:3] in ortho mode. </p>
	 * @see #__DNA__FIELD__ofs
	 */
	
	public void setOfs(CArrayFacade<Float> ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 864;
		} else {
			__dna__offset = 840;
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
	 * Get method for struct member 'camzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport zoom on the camera frame, see BKE_screen_view3d_zoom_to_fac. </p>
	 * @see #__DNA__FIELD__camzoom
	 */
	
	public float getCamzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 876);
		} else {
			return __io__block.readFloat(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'camzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport zoom on the camera frame, see BKE_screen_view3d_zoom_to_fac. </p>
	 * @see #__DNA__FIELD__camzoom
	 */
	
	public void setCamzoom(float camzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 876, camzoom);
		} else {
			__io__block.writeFloat(__io__address + 852, camzoom);
		}
	}

	/**
	 * Get method for struct member 'is_persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Check if persp/ortho view, since 'persp' cant be used for this since it can have cameras assigned as well. (only set in #view3d_winmatrix_set) </p>
	 * @see #__DNA__FIELD__is_persp
	 */
	
	public byte getIs_persp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 880);
		} else {
			return __io__block.readByte(__io__address + 856);
		}
	}

	/**
	 * Set method for struct member 'is_persp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Check if persp/ortho view, since 'persp' cant be used for this since it can have cameras assigned as well. (only set in #view3d_winmatrix_set) </p>
	 * @see #__DNA__FIELD__is_persp
	 */
	
	public void setIs_persp(byte is_persp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 880, is_persp);
		} else {
			__io__block.writeByte(__io__address + 856, is_persp);
		}
	}

	/**
	 * Get method for struct member 'persp'.
	 * @see #__DNA__FIELD__persp
	 */
	
	public byte getPersp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 881);
		} else {
			return __io__block.readByte(__io__address + 857);
		}
	}

	/**
	 * Set method for struct member 'persp'.
	 * @see #__DNA__FIELD__persp
	 */
	
	public void setPersp(byte persp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 881, persp);
		} else {
			__io__block.writeByte(__io__address + 857, persp);
		}
	}

	/**
	 * Get method for struct member 'view'.
	 * @see #__DNA__FIELD__view
	 */
	
	public byte getView() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 882);
		} else {
			return __io__block.readByte(__io__address + 858);
		}
	}

	/**
	 * Set method for struct member 'view'.
	 * @see #__DNA__FIELD__view
	 */
	
	public void setView(byte view) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 882, view);
		} else {
			__io__block.writeByte(__io__address + 858, view);
		}
	}

	/**
	 * Get method for struct member 'viewlock'.
	 * @see #__DNA__FIELD__viewlock
	 */
	
	public byte getViewlock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 883);
		} else {
			return __io__block.readByte(__io__address + 859);
		}
	}

	/**
	 * Set method for struct member 'viewlock'.
	 * @see #__DNA__FIELD__viewlock
	 */
	
	public void setViewlock(byte viewlock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 883, viewlock);
		} else {
			__io__block.writeByte(__io__address + 859, viewlock);
		}
	}

	/**
	 * Get method for struct member 'viewlock_quad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for quadview (store while out of quad view). </p>
	 * @see #__DNA__FIELD__viewlock_quad
	 */
	
	public byte getViewlock_quad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 884);
		} else {
			return __io__block.readByte(__io__address + 860);
		}
	}

	/**
	 * Set method for struct member 'viewlock_quad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for quadview (store while out of quad view). </p>
	 * @see #__DNA__FIELD__viewlock_quad
	 */
	
	public void setViewlock_quad(byte viewlock_quad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 884, viewlock_quad);
		} else {
			__io__block.writeByte(__io__address + 860, viewlock_quad);
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
			return new CArrayFacade<Byte>(__io__address + 885, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 861, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 885;
		} else {
			__dna__offset = 861;
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
	 * Get method for struct member 'ofs_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Normalized offset for locked view: (-1, -1) bottom left, (1, 1) upper right. </p>
	 * @see #__DNA__FIELD__ofs_lock
	 */
	
	public CArrayFacade<Float> getOfs_lock() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 888, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 864, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ofs_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Normalized offset for locked view: (-1, -1) bottom left, (1, 1) upper right. </p>
	 * @see #__DNA__FIELD__ofs_lock
	 */
	
	public void setOfs_lock(CArrayFacade<Float> ofs_lock) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 888;
		} else {
			__dna__offset = 864;
		}
		if (__io__equals(ofs_lock, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ofs_lock)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ofs_lock);
		} else {
			__io__generic__copy( getOfs_lock(), ofs_lock);
		}
	}

	/**
	 * Get method for struct member 'twdrawflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX can easily get rid of this (Julian). </p>
	 * @see #__DNA__FIELD__twdrawflag
	 */
	
	public short getTwdrawflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 896);
		} else {
			return __io__block.readShort(__io__address + 872);
		}
	}

	/**
	 * Set method for struct member 'twdrawflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX can easily get rid of this (Julian). </p>
	 * @see #__DNA__FIELD__twdrawflag
	 */
	
	public void setTwdrawflag(short twdrawflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 896, twdrawflag);
		} else {
			__io__block.writeShort(__io__address + 872, twdrawflag);
		}
	}

	/**
	 * Get method for struct member 'rflag'.
	 * @see #__DNA__FIELD__rflag
	 */
	
	public short getRflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 898);
		} else {
			return __io__block.readShort(__io__address + 874);
		}
	}

	/**
	 * Set method for struct member 'rflag'.
	 * @see #__DNA__FIELD__rflag
	 */
	
	public void setRflag(short rflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 898, rflag);
		} else {
			__io__block.writeShort(__io__address + 874, rflag);
		}
	}

	/**
	 * Get method for struct member 'lviewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last view (use when switching out of camera view). </p>
	 * @see #__DNA__FIELD__lviewquat
	 */
	
	public CArrayFacade<Float> getLviewquat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 900, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 876, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lviewquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last view (use when switching out of camera view). </p>
	 * @see #__DNA__FIELD__lviewquat
	 */
	
	public void setLviewquat(CArrayFacade<Float> lviewquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 900;
		} else {
			__dna__offset = 876;
		}
		if (__io__equals(lviewquat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lviewquat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lviewquat);
		} else {
			__io__generic__copy( getLviewquat(), lviewquat);
		}
	}

	/**
	 * Get method for struct member 'lpersp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lpersp can never be set to 'RV3D_CAMOB'. </p>
	 * @see #__DNA__FIELD__lpersp
	 */
	
	public short getLpersp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 916);
		} else {
			return __io__block.readShort(__io__address + 892);
		}
	}

	/**
	 * Set method for struct member 'lpersp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lpersp can never be set to 'RV3D_CAMOB'. </p>
	 * @see #__DNA__FIELD__lpersp
	 */
	
	public void setLpersp(short lpersp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 916, lpersp);
		} else {
			__io__block.writeShort(__io__address + 892, lpersp);
		}
	}

	/**
	 * Get method for struct member 'lview'.
	 * @see #__DNA__FIELD__lview
	 */
	
	public short getLview() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 918);
		} else {
			return __io__block.readShort(__io__address + 894);
		}
	}

	/**
	 * Set method for struct member 'lview'.
	 * @see #__DNA__FIELD__lview
	 */
	
	public void setLview(short lview) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 918, lview);
		} else {
			__io__block.writeShort(__io__address + 894, lview);
		}
	}

	/**
	 * Get method for struct member 'rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active rotation from NDOF or elsewhere. </p>
	 * @see #__DNA__FIELD__rot_angle
	 */
	
	public float getRot_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 920);
		} else {
			return __io__block.readFloat(__io__address + 896);
		}
	}

	/**
	 * Set method for struct member 'rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active rotation from NDOF or elsewhere. </p>
	 * @see #__DNA__FIELD__rot_angle
	 */
	
	public void setRot_angle(float rot_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 920, rot_angle);
		} else {
			__io__block.writeFloat(__io__address + 896, rot_angle);
		}
	}

	/**
	 * Get method for struct member 'rot_axis'.
	 * @see #__DNA__FIELD__rot_axis
	 */
	
	public CArrayFacade<Float> getRot_axis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 924, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 900, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot_axis'.
	 * @see #__DNA__FIELD__rot_axis
	 */
	
	public void setRot_axis(CArrayFacade<Float> rot_axis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 924;
		} else {
			__dna__offset = 900;
		}
		if (__io__equals(rot_axis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot_axis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot_axis);
		} else {
			__io__generic__copy( getRot_axis(), rot_axis);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RegionView3D> __io__addressof() {
		return new CPointer<RegionView3D>(__io__address, new Class[]{RegionView3D.class}, __io__block, __io__blockTable);
	}

}
