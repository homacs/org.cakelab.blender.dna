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
 * Generated facet for DNA struct type 'Object'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Java .Blend</h4>
 * An instance of BlenderObject represents an element of a scene
 * 			such as a graphical object, camera, source of sound or light etc..
 * 			<p>
 * 			There are the following types of objects:
 * 			</p>
 * 			<table border="1">
 * 				<tr><th>Name</th><th>type id<br/>(see {@link #getType()})</th><th>Data type<br/>(see {@link #getData()})</th><tr>
 * 				<tr><td>OB_EMPTY</td><td>0</td><td>--</td></tr>
 * 				<tr><td>OB_MESH</td><td>1</td><td>{@link Mesh}</td></tr>
 * 				<tr><td>OB_CURVE</td><td>2</td><td>{@link Curve}</td></tr>
 * 				<tr><td>OB_SURF</td><td>3</td><td>{@link Curve}</td></tr>
 * 				<tr><td>OB_FONT</td><td>4</td><td>{@link Curve}</td></tr>
 * 				<tr><td>OB_MBALL</td><td>5</td><td>{@link MetaBall}</td></tr>
 * 				<tr><td>OB_LAMP</td><td>10</td><td>{@link Lamp}</td></tr>
 * 				<tr><td>OB_CAMERA</td><td>11</td><td>{@link Camera}</td></tr>
 * 				<tr><td>OB_SPEAKER</td><td>12</td><td>{@link Speaker}</td></tr>
 * 				<tr><td>OB_WAVE</td><td>21</td><td>deprecated?</td></tr>
 * 				<tr><td>OB_LATTICE</td><td>22</td><td>{@link Lattice}</td></tr>
 * 				<tr><td>OB_ARMATURE</td><td>25</td><td>{@link bArmature}</td></tr>
 * 			</table>
 * 			<p>
 * 			The type of an object defines what type of data is to be retrieved from {@link #getData()}.			
 * 			</p>
 */

@CMetaData(size32=1152, size64=1456)
public class BlenderObject extends CFacade {

	/**
	 * This is the sdna index of the struct Object.
	 * <p>
	 * It is required when allocating a new block to store data for Object.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 548;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 152/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * animation data
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__drawdata);
	 * CPointer&lt;DrawDataList&gt; p_drawdata = p.cast(new Class[]{DrawDataList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawdata'</li>
	 * <li>Signature: 'DrawDataList'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawdata = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'sculpt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__sculpt);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sculpt = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt'</li>
	 * <li>Signature: 'SculptSession*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt = new long[]{164, 216};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * type of this object. <h3>Values:</h3>
	 * 				<pre>
	 * 	OB_EMPTY      = 0,
	 * 	OB_MESH       = 1,
	 * 	OB_CURVE      = 2,
	 * 	OB_SURF       = 3,
	 * 	OB_FONT       = 4,
	 * 	OB_MBALL      = 5,
	 * 	OB_LAMP       = 10,
	 * 	OB_CAMERA     = 11,
	 * 	OB_SPEAKER    = 12,
	 * 	//	OB_WAVE       = 21, 
	 * 	OB_LATTICE    = 22,
	 * 
	 * 	// 23 and 24 are for life and sector (old file compat.)
	 * 	OB_ARMATURE   = 25,
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{168, 224};

	/**
	 * Field descriptor (offset) for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * parent type: first 4 bits: type.
	 * 				<pre>
	 * 					PARTYPE       = (1 << 4) - 1,
	 * 					PAROBJECT     = 0,
	 * 					PARCURVE      = 1,
	 * 					PARKEY        = 2,
	 * 					PARSKEL       = 4,
	 * 					PARVERT1      = 5,
	 * 					PARVERT3      = 6,
	 * 					PARBONE       = 7,
	 * 					PARSLOW       = 16,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__partype);
	 * CPointer&lt;Short&gt; p_partype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partype = new long[]{170, 226};

	/**
	 * Field descriptor (offset) for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * <h4>Blender Source Code</h4>
	 * <p> Can be vertexnrs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__par1);
	 * CPointer&lt;Integer&gt; p_par1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'par1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__par1 = new long[]{172, 228};

	/**
	 * Field descriptor (offset) for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__par2);
	 * CPointer&lt;Integer&gt; p_par2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'par2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__par2 = new long[]{176, 232};

	/**
	 * Field descriptor (offset) for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__par3);
	 * CPointer&lt;Integer&gt; p_par3 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'par3'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__par3 = new long[]{180, 236};

	/**
	 * Field descriptor (offset) for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * String describing subobject info, MAX_ID_NAME-2
	 * <h4>Blender Source Code</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__parsubstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_parsubstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parsubstr'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parsubstr = new long[]{184, 240};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Parent object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{248, 304};

	/**
	 * Field descriptor (offset) for struct member 'track'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__track);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_track = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track = new long[]{252, 312};

	/**
	 * Field descriptor (offset) for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p> Proxy pointer are deprecated, only kept for conversion to liboverrides. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__proxy);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_proxy = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy = new long[]{256, 320};

	/**
	 * Field descriptor (offset) for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__proxy_group);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_proxy_group = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy_group'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy_group = new long[]{260, 328};

	/**
	 * Field descriptor (offset) for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * proxy_from is set in target back to the proxy.
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__proxy_from);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_proxy_from = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy_from'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy_from = new long[]{264, 336};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system, deprecated for 2.5.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{268, 344};

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system. @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> struct Path *path; <p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__action);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_action = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action = new long[]{272, 352};

	/**
	 * Field descriptor (offset) for struct member 'poselib'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__poselib);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_poselib = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poselib'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poselib = new long[]{276, 360};

	/**
	 * Field descriptor (offset) for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pose data, armature objects only
	 * <h4>Blender Python API</h4>
	 * (read-only)    Current pose for armatures
	 * <h4>Blender Source Code</h4>
	 * <p> Pose data, armature objects only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__pose);
	 * CPointer&lt;CPointer&lt;bPose&gt;&gt; p_pose = p.cast(new Class[]{CPointer.class, bPose.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose'</li>
	 * <li>Signature: 'bPose*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose = new long[]{280, 368};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pointer to objects data - an 'ID' or NULL
	 * <h4>Blender Python API</h4>
	 * Object data
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to objects data - an '{@link ID} ' or NULL. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{284, 376};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Grease Pencil data
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil data. <p> XXX deprecated... replaced by gpencil object, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by gpencil object, keep for readfile 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{288, 384};

	/**
	 * Field descriptor (offset) for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for visualization of object-transform animation
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of object-transform animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__avs);
	 * CPointer&lt;bAnimVizSettings&gt; p_avs = p.cast(new Class[]{bAnimVizSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avs'</li>
	 * <li>Signature: 'bAnimVizSettings'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avs = new long[]{292, 392};

	/**
	 * Field descriptor (offset) for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * motion path cache for this object
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__mpath);
	 * CPointer&lt;CPointer&lt;bMotionPath&gt;&gt; p_mpath = p.cast(new Class[]{CPointer.class, bMotionPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mpath'</li>
	 * <li>Signature: 'bMotionPath*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mpath = new long[]{324, 424};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD___pad0);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad0 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{328, 432};

	/**
	 * Field descriptor (offset) for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__constraintChannels);
	 * CPointer&lt;ListBase&gt; p_constraintChannels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constraintChannels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constraintChannels = new long[]{332, 440};

	/**
	 * Field descriptor (offset) for struct member 'effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... keep for readfile 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__effect);
	 * CPointer&lt;ListBase&gt; p_effect = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effect'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effect = new long[]{340, 456};

	/**
	 * Field descriptor (offset) for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of bDeformGroup (vertex groups) names and flag only
	 * <h4>Blender Source Code</h4>
	 * <p><p> Only for versioning, moved to object data. </p>
	 * @deprecated
	 *  DeprecatedOnly for versioning, moved to object data. 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__defbase);
	 * CPointer&lt;ListBase&gt; p_defbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defbase = new long[]{348, 472};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of ModifierData structures
	 * <h4>Blender Python API</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ModifierData}  structures. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__modifiers);
	 * CPointer&lt;ListBase&gt; p_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifiers = new long[]{356, 488};

	/**
	 * Field descriptor (offset) for struct member 'greasepencil_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link GpencilModifierData}  structures. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__greasepencil_modifiers);
	 * CPointer&lt;ListBase&gt; p_greasepencil_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'greasepencil_modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__greasepencil_modifiers = new long[]{364, 504};

	/**
	 * Field descriptor (offset) for struct member 'fmaps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of facemaps. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__fmaps);
	 * CPointer&lt;ListBase&gt; p_fmaps = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fmaps'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fmaps = new long[]{372, 520};

	/**
	 * Field descriptor (offset) for struct member 'shader_fx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of viewport effects. Actually only used by grease pencil. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__shader_fx);
	 * CPointer&lt;ListBase&gt; p_shader_fx = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shader_fx'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shader_fx = new long[]{380, 536};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Local object mode. On of:
	 * 				<pre>
	 * 					OB_MODE_OBJECT        = 0,
	 * 					OB_MODE_EDIT          = 1 << 0,
	 * 					OB_MODE_SCULPT        = 1 << 1,
	 * 					OB_MODE_VERTEX_PAINT  = 1 << 2,
	 * 					OB_MODE_WEIGHT_PAINT  = 1 << 3,
	 * 					OB_MODE_TEXTURE_PAINT = 1 << 4,
	 * 					OB_MODE_PARTICLE_EDIT = 1 << 5,
	 * 					OB_MODE_POSE          = 1 << 6
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Object interaction mode
	 * <h4>Blender Source Code</h4>
	 * <p> Local object mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{388, 552};

	/**
	 * Field descriptor (offset) for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Keep track of what mode to return to after toggling a mode
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__restore_mode);
	 * CPointer&lt;Integer&gt; p_restore_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'restore_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__restore_mode = new long[]{392, 556};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}
	 * <h4>Blender Source Code</h4>
	 * <p> materials {@link Material}  slots. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{396, 560};

	/**
	 * Field descriptor (offset) for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object
	 * <h4>Blender Source Code</h4>
	 * <p> A boolean field, with each byte 1 if corresponding material is linked to object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__matbits);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_matbits = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matbits'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matbits = new long[]{400, 568};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of mesh, curve & meta struct member of same name (keep in sync). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__totcol);
	 * CPointer&lt;Integer&gt; p_totcol = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{404, 576};

	/**
	 * Field descriptor (offset) for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * currently selected material slot in the UI
	 * <h4>Blender Source Code</h4>
	 * <p> Currently selected material in the UI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__actcol);
	 * CPointer&lt;Integer&gt; p_actcol = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actcol'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actcol = new long[]{408, 580};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * location of the object
	 * <h4>Blender Source Code</h4>
	 * <p> rot en drot have to be together! (transform('r' en 's')) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{412, 584};

	/**
	 * Field descriptor (offset) for struct member 'dloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dloc = new long[]{424, 596};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * size/scale of the object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{436, 608};

	/**
	 * Field descriptor (offset) for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> DEPRECATED, 2.60 and older only. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dsize);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dsize = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dsize'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dsize = new long[]{448, 620};

	/**
	 * Field descriptor (offset) for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ack!, changing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dscale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dscale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dscale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dscale = new long[]{460, 632};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Euler rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{472, 644};

	/**
	 * Field descriptor (offset) for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__drot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drot = new long[]{484, 656};

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__quat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_quat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quat = new long[]{496, 668};

	/**
	 * Field descriptor (offset) for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dquat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dquat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dquat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dquat = new long[]{512, 684};

	/**
	 * Field descriptor (offset) for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - axis part. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rotAxis);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotAxis = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotAxis'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotAxis = new long[]{528, 700};

	/**
	 * Field descriptor (offset) for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__drotAxis);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drotAxis = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drotAxis'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drotAxis = new long[]{540, 712};

	/**
	 * Field descriptor (offset) for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - angle part. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rotAngle);
	 * CPointer&lt;Float&gt; p_rotAngle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotAngle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotAngle = new long[]{552, 724};

	/**
	 * Field descriptor (offset) for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__drotAngle);
	 * CPointer&lt;Float&gt; p_drotAngle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drotAngle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drotAngle = new long[]{556, 728};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * final worldspace matrix with constraints & animsys applied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__obmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_obmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obmat = new long[]{560, 732};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__imat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{624, 796};

	/**
	 * Field descriptor (offset) for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of parent, so that object doesn't 'stick' to parent. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__parentinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_parentinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parentinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parentinv = new long[]{688, 860};

	/**
	 * Field descriptor (offset) for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of parent or object local transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__constinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_constinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constinv = new long[]{752, 924};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of Base's layer in the scene
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} 's layer in the scene. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lay);
	 * CPointer&lt;Integer&gt; p_lay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay = new long[]{816, 988};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of {@link Base#flag}
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{820, 992};

	/**
	 * Field descriptor (offset) for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use 'matbits'. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__colbits);
	 * CPointer&lt;Short&gt; p_colbits = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colbits'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colbits = new long[]{822, 994};

	/**
	 * Field descriptor (offset) for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				Flags 1 and 2 were unused or relics from past features.
	 * 				<pre>
	 * 					OB_NEG_SCALE        = 1 << 2,
	 * 					OB_DUPLIFRAMES      = 1 << 3,
	 * 					OB_DUPLIVERTS       = 1 << 4,
	 * 					OB_DUPLIROT         = 1 << 5,
	 * 					OB_DUPLINOSPEED     = 1 << 6,
	 * 					OB_DUPLIGROUP       = 1 << 8,
	 * 					OB_DUPLIFACES       = 1 << 9,
	 * 					OB_DUPLIFACES_SCALE = 1 << 10,
	 * 					OB_DUPLIPARTS       = 1 << 11,
	 * 					OB_RENDER_DUPLI     = 1 << 12,
	 * 					OB_NO_CONSTRAINTS   = 1 << 13,  --> runtime constraints disable
	 * 					OB_NO_PSYS_UPDATE   = 1 << 14,  --> hack to work around particle issue
	 * 					OB_DUPLI            = OB_DUPLIFRAMES | OB_DUPLIVERTS | OB_DUPLIGROUP | OB_DUPLIFACES | OB_DUPLIPARTS,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Transformation settings and transform locks. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__transflag);
	 * CPointer&lt;Short&gt; p_transflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transflag = new long[]{824, 996};

	/**
	 * Field descriptor (offset) for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks. <h3>Values:</h3>
	 * 				<pre>
	 * 					OB_LOCK_LOCX    = 1 << 0,
	 * 					OB_LOCK_LOCY    = 1 << 1,
	 * 					OB_LOCK_LOCZ    = 1 << 2,
	 * 					OB_LOCK_LOC     = OB_LOCK_LOCX | OB_LOCK_LOCY | OB_LOCK_LOCZ,
	 * 					OB_LOCK_ROTX    = 1 << 3,
	 * 					OB_LOCK_ROTY    = 1 << 4,
	 * 					OB_LOCK_ROTZ    = 1 << 5,
	 * 					OB_LOCK_ROT     = OB_LOCK_ROTX | OB_LOCK_ROTY | OB_LOCK_ROTZ,
	 * 					OB_LOCK_SCALEX  = 1 << 6,
	 * 					OB_LOCK_SCALEY  = 1 << 7,
	 * 					OB_LOCK_SCALEZ  = 1 << 8,
	 * 					OB_LOCK_SCALE   = OB_LOCK_SCALEX | OB_LOCK_SCALEY | OB_LOCK_SCALEZ,
	 * 					OB_LOCK_ROTW    = 1 << 9,
	 * 					OB_LOCK_ROT4D   = 1 << 10,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__protectflag);
	 * CPointer&lt;Short&gt; p_protectflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'protectflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__protectflag = new long[]{826, 998};

	/**
	 * Field descriptor (offset) for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__trackflag);
	 * CPointer&lt;Short&gt; p_trackflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'trackflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__trackflag = new long[]{828, 1000};

	/**
	 * Field descriptor (offset) for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__upflag);
	 * CPointer&lt;Short&gt; p_upflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'upflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__upflag = new long[]{830, 1002};

	/**
	 * Field descriptor (offset) for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * used for DopeSheet filtering settings (expanded/collapsed).
	 * 				<pre>
	 * 					-- object-channel expanded status --
	 * 					OB_ADS_COLLAPSED    = 1 << 10,
	 * 					-- object's ipo-block --
	 * 					OB_ADS_SHOWIPO      = 1 << 11,
	 * 					-- object's constraint channels --
	 * 					OB_ADS_SHOWCONS     = 1 << 12,
	 * 					-- object's material channels --
	 * 					OB_ADS_SHOWMATS     = 1 << 13,
	 * 					-- object's marticle channels --
	 * 					OB_ADS_SHOWPARTS    = 1 << 14,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for DopeSheet filtering settings (expanded/collapsed). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__nlaflag);
	 * CPointer&lt;Short&gt; p_nlaflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nlaflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nlaflag = new long[]{832, 1004};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD___pad1);
	 * CPointer&lt;Byte&gt; p__pad1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{834, 1006};

	/**
	 * Field descriptor (offset) for struct member 'duplicator_visibility_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__duplicator_visibility_flag);
	 * CPointer&lt;Byte&gt; p_duplicator_visibility_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'duplicator_visibility_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__duplicator_visibility_flag = new long[]{835, 1007};

	/**
	 * Field descriptor (offset) for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Depsgraph Used by depsgraph, flushed from base. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__base_flag);
	 * CPointer&lt;Short&gt; p_base_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_flag = new long[]{836, 1008};

	/**
	 * Field descriptor (offset) for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used by viewport, synced from base. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__base_local_view_bits);
	 * CPointer&lt;Short&gt; p_base_local_view_bits = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_local_view_bits'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_local_view_bits = new long[]{838, 1010};

	/**
	 * Field descriptor (offset) for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * <h4>Blender Source Code</h4>
	 * <p> Collision mask settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__col_group);
	 * CPointer&lt;Short&gt; p_col_group = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'col_group'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__col_group = new long[]{840, 1012};

	/**
	 * Field descriptor (offset) for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__col_mask);
	 * CPointer&lt;Short&gt; p_col_mask = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'col_mask'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__col_mask = new long[]{842, 1014};

	/**
	 * Field descriptor (offset) for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...
	 * <h4>Blender Source Code</h4>
	 * <p> Rotation mode - uses defines set out in DNA_action_types.h  for PoseChannel rotations.... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rotmode);
	 * CPointer&lt;Short&gt; p_rotmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotmode = new long[]{844, 1016};

	/**
	 * Field descriptor (offset) for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box use for drawing
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box use for drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__boundtype);
	 * CPointer&lt;Byte&gt; p_boundtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundtype = new long[]{846, 1018};

	/**
	 * Field descriptor (offset) for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box type used for collision. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__collision_boundtype);
	 * CPointer&lt;Byte&gt; p_collision_boundtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision_boundtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision_boundtype = new long[]{847, 1019};

	/**
	 * Field descriptor (offset) for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw extra settings. Flags:
	 * 				<pre>
	 * 					OB_DRAWBOUNDOX    = 1 << 0,
	 * 					OB_AXIS           = 1 << 1,
	 * 					OB_TEXSPACE       = 1 << 2,
	 * 					OB_DRAWNAME       = 1 << 3,
	 * 					OB_DRAWIMAGE      = 1 << 4,
	 * 					-- for solid+wire display --
	 * 					OB_DRAWWIRE       = 1 << 5,
	 * 					-- for overdraw s --
	 * 					OB_DRAWXRAY       = 1 << 6,
	 * 					-- enable transparent draw --
	 * 					OB_DRAWTRANSP     = 1 << 7,
	 * 					OB_DRAW_ALL_EDGES = 1 << 8,  --> only for meshes currently
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw extra settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dtx);
	 * CPointer&lt;Short&gt; p_dtx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dtx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dtx = new long[]{848, 1020};

	/**
	 * Field descriptor (offset) for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dt);
	 * CPointer&lt;Byte&gt; p_dt = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt = new long[]{850, 1022};

	/**
	 * Field descriptor (offset) for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing.
	 * 				<pre>
	 * 					OB_ARROWS        = 1,
	 * 					OB_PLAINAXES     = 2,
	 * 					OB_CIRCLE        = 3,
	 * 					OB_SINGLE_ARROW  = 4,
	 * 					OB_CUBE          = 5,
	 * 					OB_EMPTY_SPHERE  = 6,
	 * 					OB_EMPTY_CONE    = 7,
	 * 					OB_EMPTY_IMAGE   = 8,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__empty_drawtype);
	 * CPointer&lt;Byte&gt; p_empty_drawtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty_drawtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty_drawtype = new long[]{851, 1023};

	/**
	 * Field descriptor (offset) for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__empty_drawsize);
	 * CPointer&lt;Float&gt; p_empty_drawsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty_drawsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty_drawsize = new long[]{852, 1024};

	/**
	 * Field descriptor (offset) for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * dupliface scale
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dupfacesca);
	 * CPointer&lt;Float&gt; p_dupfacesca = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupfacesca'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupfacesca = new long[]{856, 1028};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * custom index, for renderpasses
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index, for render-passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__index);
	 * CPointer&lt;Short&gt; p_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index = new long[]{860, 1032};

	/**
	 * Field descriptor (offset) for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current deformation group, note: index starts at 1
	 * <h4>Blender Source Code</h4>
	 * <p> Current deformation group, NOTE: index starts at 1. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__actdef);
	 * CPointer&lt;Short&gt; p_actdef = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actdef'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actdef = new long[]{862, 1034};

	/**
	 * Field descriptor (offset) for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current face map, NOTE: index starts at 1. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__actfmap);
	 * CPointer&lt;Short&gt; p_actfmap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actfmap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actfmap = new long[]{864, 1036};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{866, 1038};

	/**
	 * Field descriptor (offset) for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'col'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__col = new long[]{868, 1040};

	/**
	 * Field descriptor (offset) for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * softbody settings
	 * <h4>Blender Source Code</h4>
	 * <p> Softbody settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__softflag);
	 * CPointer&lt;Short&gt; p_softflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'softflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__softflag = new long[]{884, 1056};

	/**
	 * Field descriptor (offset) for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * for restricting view, select, render etc. accessible in outliner
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__restrictflag);
	 * CPointer&lt;Short&gt; p_restrictflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'restrictflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__restrictflag = new long[]{886, 1058};

	/**
	 * Field descriptor (offset) for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current shape key for menu or pinned
	 * <h4>Blender Source Code</h4>
	 * <p> Current shape key for menu or pinned. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__shapenr);
	 * CPointer&lt;Short&gt; p_shapenr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shapenr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shapenr = new long[]{888, 1060};

	/**
	 * Field descriptor (offset) for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * flag for pinning
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for pinning. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__shapeflag);
	 * CPointer&lt;Byte&gt; p_shapeflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shapeflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shapeflag = new long[]{890, 1062};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{891, 1063};

	/**
	 * Field descriptor (offset) for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object constraints
	 * <h4>Blender Python API</h4>
	 * (read-only)    Constraints affecting the transformation of the object
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  constraints. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__constraints);
	 * CPointer&lt;ListBase&gt; p_constraints = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constraints'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constraints = new long[]{892, 1064};

	/**
	 * Field descriptor (offset) for struct member 'nlastrips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__nlastrips);
	 * CPointer&lt;ListBase&gt; p_nlastrips = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nlastrips'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nlastrips = new long[]{900, 1080};

	/**
	 * Field descriptor (offset) for struct member 'hooks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__hooks);
	 * CPointer&lt;ListBase&gt; p_hooks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hooks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hooks = new long[]{908, 1096};

	/**
	 * Field descriptor (offset) for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle systems
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  systems. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__particlesystem);
	 * CPointer&lt;ListBase&gt; p_particlesystem = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particlesystem'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particlesystem = new long[]{916, 1112};

	/**
	 * Field descriptor (offset) for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle deflector/attractor/collision data
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  deflector/attractor/collision data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__pd);
	 * CPointer&lt;CPointer&lt;PartDeflect&gt;&gt; p_pd = p.cast(new Class[]{CPointer.class, PartDeflect.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pd'</li>
	 * <li>Signature: 'PartDeflect*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pd = new long[]{924, 1128};

	/**
	 * Field descriptor (offset) for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if exists, saved in file
	 * <h4>Blender Source Code</h4>
	 * <p> If exists, saved in file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__soft);
	 * CPointer&lt;CPointer&lt;SoftBody&gt;&gt; p_soft = p.cast(new Class[]{CPointer.class, SoftBody.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'soft'</li>
	 * <li>Signature: 'SoftBody*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__soft = new long[]{928, 1136};

	/**
	 * Field descriptor (offset) for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object duplicator for group
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dup_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_dup_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dup_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dup_group = new long[]{932, 1144};

	/**
	 * Field descriptor (offset) for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if fluidsim enabled, store additional settings
	 * <h4>Blender Source Code</h4>
	 * <p> If fluidsim enabled, store additional settings. <p> XXX deprecated... replaced by mantaflow, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by mantaflow, keep for readfile 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__fluidsimSettings);
	 * CPointer&lt;CPointer&lt;FluidsimSettings&gt;&gt; p_fluidsimSettings = p.cast(new Class[]{CPointer.class, FluidsimSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluidsimSettings'</li>
	 * <li>Signature: 'FluidsimSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluidsimSettings = new long[]{936, 1152};

	/**
	 * Field descriptor (offset) for struct member 'pc_ids'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__pc_ids);
	 * CPointer&lt;ListBase&gt; p_pc_ids = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pc_ids'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pc_ids = new long[]{940, 1160};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet rigid body
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet rigid body. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rigidbody_object);
	 * CPointer&lt;CPointer&lt;RigidBodyOb&gt;&gt; p_rigidbody_object = p.cast(new Class[]{CPointer.class, RigidBodyOb.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rigidbody_object'</li>
	 * <li>Signature: 'RigidBodyOb*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rigidbody_object = new long[]{948, 1176};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet constraint
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet constraint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rigidbody_constraint);
	 * CPointer&lt;CPointer&lt;RigidBodyCon&gt;&gt; p_rigidbody_constraint = p.cast(new Class[]{CPointer.class, RigidBodyCon.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rigidbody_constraint'</li>
	 * <li>Signature: 'RigidBodyCon*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rigidbody_constraint = new long[]{952, 1184};

	/**
	 * Field descriptor (offset) for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * offset for image empties
	 * <h4>Blender Source Code</h4>
	 * <p> Offset for image empties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__ima_ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ima_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ima_ofs'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ima_ofs = new long[]{956, 1192};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be non-null when object is an empty image. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__iuser);
	 * CPointer&lt;CPointer&lt;ImageUser&gt;&gt; p_iuser = p.cast(new Class[]{CPointer.class, ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{964, 1200};

	/**
	 * Field descriptor (offset) for struct member 'empty_image_visibility_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__empty_image_visibility_flag);
	 * CPointer&lt;Byte&gt; p_empty_image_visibility_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty_image_visibility_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty_image_visibility_flag = new long[]{968, 1208};

	/**
	 * Field descriptor (offset) for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine which other objects will occlude the image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__empty_image_depth);
	 * CPointer&lt;Byte&gt; p_empty_image_depth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty_image_depth'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty_image_depth = new long[]{969, 1209};

	/**
	 * Field descriptor (offset) for struct member 'empty_image_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__empty_image_flag);
	 * CPointer&lt;Byte&gt; p_empty_image_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty_image_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty_image_flag = new long[]{970, 1210};

	/**
	 * Field descriptor (offset) for struct member 'modifier_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> ModifierFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__modifier_flag);
	 * CPointer&lt;Byte&gt; p_modifier_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier_flag'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier_flag = new long[]{971, 1211};

	/**
	 * Field descriptor (offset) for struct member '_pad8'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD___pad8);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad8 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad8'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{972, 1212};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{976, 1216};

	/**
	 * Field descriptor (offset) for struct member 'lineart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Line art settings for the object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lineart);
	 * CPointer&lt;ObjectLineArt&gt; p_lineart = p.cast(new Class[]{ObjectLineArt.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineart'</li>
	 * <li>Signature: 'ObjectLineArt'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineart = new long[]{980, 1224};

	/**
	 * Field descriptor (offset) for struct member 'lightgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Lightgroup that the object belongs to
	 * <h4>Blender Source Code</h4>
	 * <p> Lightgroup membership information. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lightgroup);
	 * CPointer&lt;CPointer&lt;LightgroupMembership&gt;&gt; p_lightgroup = p.cast(new Class[]{CPointer.class, LightgroupMembership.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lightgroup'</li>
	 * <li>Signature: 'LightgroupMembership*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lightgroup = new long[]{996, 1240};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__runtime);
	 * CPointer&lt;Object_Runtime&gt; p_runtime = p.cast(new Class[]{Object_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Object_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 152/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1000, 1248};

	public BlenderObject(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BlenderObject(BlenderObject that) {
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
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * animation data
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * animation data
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public DrawDataList getDrawdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DrawDataList(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new DrawDataList(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public void setDrawdata(DrawDataList drawdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(drawdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawdata);
		} else {
			__io__generic__copy( getDrawdata(), drawdata);
		}
	}

	/**
	 * Get method for struct member 'sculpt'.
	 * @see #__DNA__FIELD__sculpt
	 */
	
	public CPointer<Object> getSculpt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sculpt'.
	 * @see #__DNA__FIELD__sculpt
	 */
	
	public void setSculpt(CPointer<Object> sculpt) throws IOException
	{
		long __address = ((sculpt == null) ? 0 : sculpt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * type of this object. <h3>Values:</h3>
	 * 				<pre>
	 * 	OB_EMPTY      = 0,
	 * 	OB_MESH       = 1,
	 * 	OB_CURVE      = 2,
	 * 	OB_SURF       = 3,
	 * 	OB_FONT       = 4,
	 * 	OB_MBALL      = 5,
	 * 	OB_LAMP       = 10,
	 * 	OB_CAMERA     = 11,
	 * 	OB_SPEAKER    = 12,
	 * 	//	OB_WAVE       = 21, 
	 * 	OB_LATTICE    = 22,
	 * 
	 * 	// 23 and 24 are for life and sector (old file compat.)
	 * 	OB_ARMATURE   = 25,
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of object
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * type of this object. <h3>Values:</h3>
	 * 				<pre>
	 * 	OB_EMPTY      = 0,
	 * 	OB_MESH       = 1,
	 * 	OB_CURVE      = 2,
	 * 	OB_SURF       = 3,
	 * 	OB_FONT       = 4,
	 * 	OB_MBALL      = 5,
	 * 	OB_LAMP       = 10,
	 * 	OB_CAMERA     = 11,
	 * 	OB_SPEAKER    = 12,
	 * 	//	OB_WAVE       = 21, 
	 * 	OB_LATTICE    = 22,
	 * 
	 * 	// 23 and 24 are for life and sector (old file compat.)
	 * 	OB_ARMATURE   = 25,
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of object
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, type);
		} else {
			__io__block.writeShort(__io__address + 168, type);
		}
	}

	/**
	 * Get method for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * parent type: first 4 bits: type.
	 * 				<pre>
	 * 					PARTYPE       = (1 << 4) - 1,
	 * 					PAROBJECT     = 0,
	 * 					PARCURVE      = 1,
	 * 					PARKEY        = 2,
	 * 					PARSKEL       = 4,
	 * 					PARVERT1      = 5,
	 * 					PARVERT3      = 6,
	 * 					PARBONE       = 7,
	 * 					PARSLOW       = 16,
	 * 				</pre>
	 * @see #__DNA__FIELD__partype
	 */
	
	public short getPartype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * parent type: first 4 bits: type.
	 * 				<pre>
	 * 					PARTYPE       = (1 << 4) - 1,
	 * 					PAROBJECT     = 0,
	 * 					PARCURVE      = 1,
	 * 					PARKEY        = 2,
	 * 					PARSKEL       = 4,
	 * 					PARVERT1      = 5,
	 * 					PARVERT3      = 6,
	 * 					PARBONE       = 7,
	 * 					PARSLOW       = 16,
	 * 				</pre>
	 * @see #__DNA__FIELD__partype
	 */
	
	public void setPartype(short partype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, partype);
		} else {
			__io__block.writeShort(__io__address + 170, partype);
		}
	}

	/**
	 * Get method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * <h4>Blender Source Code</h4>
	 * <p> Can be vertexnrs. </p>
	 * @see #__DNA__FIELD__par1
	 */
	
	public int getPar1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * <h4>Blender Source Code</h4>
	 * <p> Can be vertexnrs. </p>
	 * @see #__DNA__FIELD__par1
	 */
	
	public void setPar1(int par1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, par1);
		} else {
			__io__block.writeInt(__io__address + 172, par1);
		}
	}

	/**
	 * Get method for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par2
	 */
	
	public int getPar2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par2
	 */
	
	public void setPar2(int par2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, par2);
		} else {
			__io__block.writeInt(__io__address + 176, par2);
		}
	}

	/**
	 * Get method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par3
	 */
	
	public int getPar3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par3
	 */
	
	public void setPar3(int par3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, par3);
		} else {
			__io__block.writeInt(__io__address + 180, par3);
		}
	}

	/**
	 * Get method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * String describing subobject info, MAX_ID_NAME-2
	 * <h4>Blender Source Code</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public CArrayFacade<Byte> getParsubstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * String describing subobject info, MAX_ID_NAME-2
	 * <h4>Blender Source Code</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public void setParsubstr(CArrayFacade<Byte> parsubstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(parsubstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parsubstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parsubstr);
		} else {
			__io__generic__copy( getParsubstr(), parsubstr);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Parent object
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<BlenderObject> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Parent object
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<BlenderObject> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 248, __address);
		}
	}

	/**
	 * Get method for struct member 'track'.
	 * @see #__DNA__FIELD__track
	 */
	
	public CPointer<BlenderObject> getTrack() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'track'.
	 * @see #__DNA__FIELD__track
	 */
	
	public void setTrack(CPointer<BlenderObject> track) throws IOException
	{
		long __address = ((track == null) ? 0 : track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p> Proxy pointer are deprecated, only kept for conversion to liboverrides. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public CPointer<BlenderObject> getProxy() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p> Proxy pointer are deprecated, only kept for conversion to liboverrides. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public void setProxy(CPointer<BlenderObject> proxy) throws IOException
	{
		long __address = ((proxy == null) ? 0 : proxy.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 320, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public CPointer<BlenderObject> getProxy_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public void setProxy_group(CPointer<BlenderObject> proxy_group) throws IOException
	{
		long __address = ((proxy_group == null) ? 0 : proxy_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 328, __address);
		} else {
			__io__block.writeLong(__io__address + 260, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * proxy_from is set in target back to the proxy.
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy_from
	 */
	
	public CPointer<BlenderObject> getProxy_from() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * proxy_from is set in target back to the proxy.
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__proxy_from
	 */
	
	public void setProxy_from(CPointer<BlenderObject> proxy_from) throws IOException
	{
		long __address = ((proxy_from == null) ? 0 : proxy_from.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 264, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system, deprecated for 2.5.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 268);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system, deprecated for 2.5.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 268, __address);
		}
	}

	/**
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system. @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> struct Path *path; <p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public CPointer<bAction> getAction() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system. @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> struct Path *path; <p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CPointer<bAction> action) throws IOException
	{
		long __address = ((action == null) ? 0 : action.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'poselib'.
	 * @see #__DNA__FIELD__poselib
	 */
	
	public CPointer<bAction> getPoselib() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'poselib'.
	 * @see #__DNA__FIELD__poselib
	 */
	
	public void setPoselib(CPointer<bAction> poselib) throws IOException
	{
		long __address = ((poselib == null) ? 0 : poselib.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pose data, armature objects only
	 * <h4>Blender Python API</h4>
	 * (read-only)    Current pose for armatures
	 * <h4>Blender Source Code</h4>
	 * <p> Pose data, armature objects only. </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public CPointer<bPose> getPose() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPose.class};
		return new CPointer<bPose>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPose.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pose data, armature objects only
	 * <h4>Blender Python API</h4>
	 * (read-only)    Current pose for armatures
	 * <h4>Blender Source Code</h4>
	 * <p> Pose data, armature objects only. </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public void setPose(CPointer<bPose> pose) throws IOException
	{
		long __address = ((pose == null) ? 0 : pose.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 280, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pointer to objects data - an 'ID' or NULL
	 * <h4>Blender Python API</h4>
	 * Object data
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to objects data - an '{@link ID} ' or NULL. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * pointer to objects data - an 'ID' or NULL
	 * <h4>Blender Python API</h4>
	 * Object data
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to objects data - an '{@link ID} ' or NULL. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Grease Pencil data
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil data. <p> XXX deprecated... replaced by gpencil object, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by gpencil object, keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Grease Pencil data
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil data. <p> XXX deprecated... replaced by gpencil object, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by gpencil object, keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 288, __address);
		}
	}

	/**
	 * Get method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for visualization of object-transform animation
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of object-transform animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public bAnimVizSettings getAvs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bAnimVizSettings(__io__address + 392, __io__block, __io__blockTable);
		} else {
			return new bAnimVizSettings(__io__address + 292, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for visualization of object-transform animation
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of object-transform animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public void setAvs(bAnimVizSettings avs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 292;
		}
		if (__io__equals(avs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, avs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, avs);
		} else {
			__io__generic__copy( getAvs(), avs);
		}
	}

	/**
	 * Get method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * motion path cache for this object
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this object. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public CPointer<bMotionPath> getMpath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 324);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bMotionPath.class};
		return new CPointer<bMotionPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bMotionPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * motion path cache for this object
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this object. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public void setMpath(CPointer<bMotionPath> mpath) throws IOException
	{
		long __address = ((mpath == null) ? 0 : mpath.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 424, __address);
		} else {
			__io__block.writeLong(__io__address + 324, __address);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CPointer<Object> get_pad0() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CPointer<Object> _pad0) throws IOException
	{
		long __address = ((_pad0 == null) ? 0 : _pad0.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 432, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__constraintChannels
	 */
	
	public ListBase getConstraintChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 440, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 332, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * old animation system.<br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__constraintChannels
	 */
	
	public void setConstraintChannels(ListBase constraintChannels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 440;
		} else {
			__dna__offset = 332;
		}
		if (__io__equals(constraintChannels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, constraintChannels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, constraintChannels);
		} else {
			__io__generic__copy( getConstraintChannels(), constraintChannels);
		}
	}

	/**
	 * Get method for struct member 'effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__effect
	 */
	
	public ListBase getEffect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 456, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 340, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * <br/>@deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__effect
	 */
	
	public void setEffect(ListBase effect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 456;
		} else {
			__dna__offset = 340;
		}
		if (__io__equals(effect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, effect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, effect);
		} else {
			__io__generic__copy( getEffect(), effect);
		}
	}

	/**
	 * Get method for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of bDeformGroup (vertex groups) names and flag only
	 * <h4>Blender Source Code</h4>
	 * <p><p> Only for versioning, moved to object data. </p>
	 * @deprecated
	 *  DeprecatedOnly for versioning, moved to object data. 
	 * </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public ListBase getDefbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 472, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 348, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of bDeformGroup (vertex groups) names and flag only
	 * <h4>Blender Source Code</h4>
	 * <p><p> Only for versioning, moved to object data. </p>
	 * @deprecated
	 *  DeprecatedOnly for versioning, moved to object data. 
	 * </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public void setDefbase(ListBase defbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 472;
		} else {
			__dna__offset = 348;
		}
		if (__io__equals(defbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defbase);
		} else {
			__io__generic__copy( getDefbase(), defbase);
		}
	}

	/**
	 * Get method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of ModifierData structures
	 * <h4>Blender Python API</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ModifierData}  structures. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 488, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 356, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * list of ModifierData structures
	 * <h4>Blender Python API</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ModifierData}  structures. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 488;
		} else {
			__dna__offset = 356;
		}
		if (__io__equals(modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifiers);
		} else {
			__io__generic__copy( getModifiers(), modifiers);
		}
	}

	/**
	 * Get method for struct member 'greasepencil_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link GpencilModifierData}  structures. </p>
	 * @see #__DNA__FIELD__greasepencil_modifiers
	 */
	
	public ListBase getGreasepencil_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 504, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 364, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'greasepencil_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link GpencilModifierData}  structures. </p>
	 * @see #__DNA__FIELD__greasepencil_modifiers
	 */
	
	public void setGreasepencil_modifiers(ListBase greasepencil_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 504;
		} else {
			__dna__offset = 364;
		}
		if (__io__equals(greasepencil_modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, greasepencil_modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, greasepencil_modifiers);
		} else {
			__io__generic__copy( getGreasepencil_modifiers(), greasepencil_modifiers);
		}
	}

	/**
	 * Get method for struct member 'fmaps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of facemaps. </p>
	 * @see #__DNA__FIELD__fmaps
	 */
	
	public ListBase getFmaps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 520, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 372, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fmaps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of facemaps. </p>
	 * @see #__DNA__FIELD__fmaps
	 */
	
	public void setFmaps(ListBase fmaps) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 520;
		} else {
			__dna__offset = 372;
		}
		if (__io__equals(fmaps, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fmaps)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fmaps);
		} else {
			__io__generic__copy( getFmaps(), fmaps);
		}
	}

	/**
	 * Get method for struct member 'shader_fx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of viewport effects. Actually only used by grease pencil. </p>
	 * @see #__DNA__FIELD__shader_fx
	 */
	
	public ListBase getShader_fx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 536, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 380, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shader_fx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of viewport effects. Actually only used by grease pencil. </p>
	 * @see #__DNA__FIELD__shader_fx
	 */
	
	public void setShader_fx(ListBase shader_fx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 536;
		} else {
			__dna__offset = 380;
		}
		if (__io__equals(shader_fx, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shader_fx)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shader_fx);
		} else {
			__io__generic__copy( getShader_fx(), shader_fx);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Local object mode. On of:
	 * 				<pre>
	 * 					OB_MODE_OBJECT        = 0,
	 * 					OB_MODE_EDIT          = 1 << 0,
	 * 					OB_MODE_SCULPT        = 1 << 1,
	 * 					OB_MODE_VERTEX_PAINT  = 1 << 2,
	 * 					OB_MODE_WEIGHT_PAINT  = 1 << 3,
	 * 					OB_MODE_TEXTURE_PAINT = 1 << 4,
	 * 					OB_MODE_PARTICLE_EDIT = 1 << 5,
	 * 					OB_MODE_POSE          = 1 << 6
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Object interaction mode
	 * <h4>Blender Source Code</h4>
	 * <p> Local object mode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 552);
		} else {
			return __io__block.readInt(__io__address + 388);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Local object mode. On of:
	 * 				<pre>
	 * 					OB_MODE_OBJECT        = 0,
	 * 					OB_MODE_EDIT          = 1 << 0,
	 * 					OB_MODE_SCULPT        = 1 << 1,
	 * 					OB_MODE_VERTEX_PAINT  = 1 << 2,
	 * 					OB_MODE_WEIGHT_PAINT  = 1 << 3,
	 * 					OB_MODE_TEXTURE_PAINT = 1 << 4,
	 * 					OB_MODE_PARTICLE_EDIT = 1 << 5,
	 * 					OB_MODE_POSE          = 1 << 6
	 * 				</pre>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Object interaction mode
	 * <h4>Blender Source Code</h4>
	 * <p> Local object mode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 552, mode);
		} else {
			__io__block.writeInt(__io__address + 388, mode);
		}
	}

	/**
	 * Get method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Keep track of what mode to return to after toggling a mode
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public int getRestore_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 556);
		} else {
			return __io__block.readInt(__io__address + 392);
		}
	}

	/**
	 * Set method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Keep track of what mode to return to after toggling a mode
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public void setRestore_mode(int restore_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 556, restore_mode);
		} else {
			__io__block.writeInt(__io__address + 392, restore_mode);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}
	 * <h4>Blender Source Code</h4>
	 * <p> materials {@link Material}  slots. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 560);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 396);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}
	 * <h4>Blender Source Code</h4>
	 * <p> materials {@link Material}  slots. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 560, __address);
		} else {
			__io__block.writeLong(__io__address + 396, __address);
		}
	}

	/**
	 * Get method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object
	 * <h4>Blender Source Code</h4>
	 * <p> A boolean field, with each byte 1 if corresponding material is linked to object. </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public CPointer<Byte> getMatbits() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 568);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 400);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object
	 * <h4>Blender Source Code</h4>
	 * <p> A boolean field, with each byte 1 if corresponding material is linked to object. </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public void setMatbits(CPointer<Byte> matbits) throws IOException
	{
		long __address = ((matbits == null) ? 0 : matbits.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 568, __address);
		} else {
			__io__block.writeLong(__io__address + 400, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of mesh, curve & meta struct member of same name (keep in sync). </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public int getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 576);
		} else {
			return __io__block.readInt(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of mesh, curve & meta struct member of same name (keep in sync). </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(int totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 576, totcol);
		} else {
			__io__block.writeInt(__io__address + 404, totcol);
		}
	}

	/**
	 * Get method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * currently selected material slot in the UI
	 * <h4>Blender Source Code</h4>
	 * <p> Currently selected material in the UI. </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public int getActcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 580);
		} else {
			return __io__block.readInt(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * currently selected material slot in the UI
	 * <h4>Blender Source Code</h4>
	 * <p> Currently selected material in the UI. </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public void setActcol(int actcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 580, actcol);
		} else {
			__io__block.writeInt(__io__address + 408, actcol);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * location of the object
	 * <h4>Blender Source Code</h4>
	 * <p> rot en drot have to be together! (transform('r' en 's')) </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * location of the object
	 * <h4>Blender Source Code</h4>
	 * <p> rot en drot have to be together! (transform('r' en 's')) </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 584;
		} else {
			__dna__offset = 412;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'dloc'.
	 * @see #__DNA__FIELD__dloc
	 */
	
	public CArrayFacade<Float> getDloc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 596, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dloc'.
	 * @see #__DNA__FIELD__dloc
	 */
	
	public void setDloc(CArrayFacade<Float> dloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 596;
		} else {
			__dna__offset = 424;
		}
		if (__io__equals(dloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dloc);
		} else {
			__io__generic__copy( getDloc(), dloc);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * size/scale of the object
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 608, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 436, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * size/scale of the object
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 608;
		} else {
			__dna__offset = 436;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> DEPRECATED, 2.60 and older only. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dsize
	 */
	
	public CArrayFacade<Float> getDsize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 448, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> DEPRECATED, 2.60 and older only. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dsize
	 */
	
	public void setDsize(CArrayFacade<Float> dsize) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 620;
		} else {
			__dna__offset = 448;
		}
		if (__io__equals(dsize, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dsize)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dsize);
		} else {
			__io__generic__copy( getDsize(), dsize);
		}
	}

	/**
	 * Get method for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ack!, changing. </p>
	 * @see #__DNA__FIELD__dscale
	 */
	
	public CArrayFacade<Float> getDscale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ack!, changing. </p>
	 * @see #__DNA__FIELD__dscale
	 */
	
	public void setDscale(CArrayFacade<Float> dscale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 632;
		} else {
			__dna__offset = 460;
		}
		if (__io__equals(dscale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dscale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dscale);
		} else {
			__io__generic__copy( getDscale(), dscale);
		}
	}

	/**
	 * Get method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Euler rotation. </p>
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 644, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 472, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Euler rotation. </p>
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 644;
		} else {
			__dna__offset = 472;
		}
		if (__io__equals(rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot);
		} else {
			__io__generic__copy( getRot(), rot);
		}
	}

	/**
	 * Get method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * @see #__DNA__FIELD__drot
	 */
	
	public CArrayFacade<Float> getDrot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 484, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * euler rotation
	 * @see #__DNA__FIELD__drot
	 */
	
	public void setDrot(CArrayFacade<Float> drot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 656;
		} else {
			__dna__offset = 484;
		}
		if (__io__equals(drot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drot);
		} else {
			__io__generic__copy( getDrot(), drot);
		}
	}

	/**
	 * Get method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public CArrayFacade<Float> getQuat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 668, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 668;
		} else {
			__dna__offset = 496;
		}
		if (__io__equals(quat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, quat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, quat);
		} else {
			__io__generic__copy( getQuat(), quat);
		}
	}

	/**
	 * Get method for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * @see #__DNA__FIELD__dquat
	 */
	
	public CArrayFacade<Float> getDquat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 684, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 512, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * quaternion rotation
	 * @see #__DNA__FIELD__dquat
	 */
	
	public void setDquat(CArrayFacade<Float> dquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 684;
		} else {
			__dna__offset = 512;
		}
		if (__io__equals(dquat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dquat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dquat);
		} else {
			__io__generic__copy( getDquat(), dquat);
		}
	}

	/**
	 * Get method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - axis part. </p>
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public CArrayFacade<Float> getRotAxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - axis part. </p>
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public void setRotAxis(CArrayFacade<Float> rotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 700;
		} else {
			__dna__offset = 528;
		}
		if (__io__equals(rotAxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotAxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotAxis);
		} else {
			__io__generic__copy( getRotAxis(), rotAxis);
		}
	}

	/**
	 * Get method for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * @see #__DNA__FIELD__drotAxis
	 */
	
	public CArrayFacade<Float> getDrotAxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - axis part
	 * @see #__DNA__FIELD__drotAxis
	 */
	
	public void setDrotAxis(CArrayFacade<Float> drotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 712;
		} else {
			__dna__offset = 540;
		}
		if (__io__equals(drotAxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drotAxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drotAxis);
		} else {
			__io__generic__copy( getDrotAxis(), drotAxis);
		}
	}

	/**
	 * Get method for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - angle part. </p>
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public float getRotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 724);
		} else {
			return __io__block.readFloat(__io__address + 552);
		}
	}

	/**
	 * Set method for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * <h4>Blender Source Code</h4>
	 * <p> Axis angle rotation - angle part. </p>
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public void setRotAngle(float rotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 724, rotAngle);
		} else {
			__io__block.writeFloat(__io__address + 552, rotAngle);
		}
	}

	/**
	 * Get method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public float getDrotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 728);
		} else {
			return __io__block.readFloat(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public void setDrotAngle(float drotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 728, drotAngle);
		} else {
			__io__block.writeFloat(__io__address + 556, drotAngle);
		}
	}

	/**
	 * Get method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * final worldspace matrix with constraints & animsys applied
	 * @see #__DNA__FIELD__obmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getObmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 732, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * final worldspace matrix with constraints & animsys applied
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 732;
		} else {
			__dna__offset = 560;
		}
		if (__io__equals(obmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, obmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, obmat);
		} else {
			__io__generic__copy( getObmat(), obmat);
		}
	}

	/**
	 * Get method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);
	 * @see #__DNA__FIELD__imat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getImat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 796, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 624, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 796;
		} else {
			__dna__offset = 624;
		}
		if (__io__equals(imat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imat);
		} else {
			__io__generic__copy( getImat(), imat);
		}
	}

	/**
	 * Get method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of parent, so that object doesn't 'stick' to parent. </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getParentinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 860, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 688, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of parent, so that object doesn't 'stick' to parent. </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public void setParentinv(CArrayFacade<CArrayFacade<Float>> parentinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 860;
		} else {
			__dna__offset = 688;
		}
		if (__io__equals(parentinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parentinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parentinv);
		} else {
			__io__generic__copy( getParentinv(), parentinv);
		}
	}

	/**
	 * Get method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of parent or object local transform. </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getConstinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 924, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 752, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of parent or object local transform. </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public void setConstinv(CArrayFacade<CArrayFacade<Float>> constinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 924;
		} else {
			__dna__offset = 752;
		}
		if (__io__equals(constinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, constinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, constinv);
		} else {
			__io__generic__copy( getConstinv(), constinv);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of Base's layer in the scene
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} 's layer in the scene. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 988);
		} else {
			return __io__block.readInt(__io__address + 816);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of Base's layer in the scene
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} 's layer in the scene. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 988, lay);
		} else {
			__io__block.writeInt(__io__address + 816, lay);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of {@link Base#flag}
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 992);
		} else {
			return __io__block.readShort(__io__address + 820);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * copy of {@link Base#flag}
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of {@link Base} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 992, flag);
		} else {
			__io__block.writeShort(__io__address + 820, flag);
		}
	}

	/**
	 * Get method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use 'matbits'. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public short getColbits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 994);
		} else {
			return __io__block.readShort(__io__address + 822);
		}
	}

	/**
	 * Set method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use 'matbits'. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public void setColbits(short colbits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 994, colbits);
		} else {
			__io__block.writeShort(__io__address + 822, colbits);
		}
	}

	/**
	 * Get method for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				Flags 1 and 2 were unused or relics from past features.
	 * 				<pre>
	 * 					OB_NEG_SCALE        = 1 << 2,
	 * 					OB_DUPLIFRAMES      = 1 << 3,
	 * 					OB_DUPLIVERTS       = 1 << 4,
	 * 					OB_DUPLIROT         = 1 << 5,
	 * 					OB_DUPLINOSPEED     = 1 << 6,
	 * 					OB_DUPLIGROUP       = 1 << 8,
	 * 					OB_DUPLIFACES       = 1 << 9,
	 * 					OB_DUPLIFACES_SCALE = 1 << 10,
	 * 					OB_DUPLIPARTS       = 1 << 11,
	 * 					OB_RENDER_DUPLI     = 1 << 12,
	 * 					OB_NO_CONSTRAINTS   = 1 << 13,  --> runtime constraints disable
	 * 					OB_NO_PSYS_UPDATE   = 1 << 14,  --> hack to work around particle issue
	 * 					OB_DUPLI            = OB_DUPLIFRAMES | OB_DUPLIVERTS | OB_DUPLIGROUP | OB_DUPLIFACES | OB_DUPLIPARTS,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Transformation settings and transform locks. </p>
	 * @see #__DNA__FIELD__transflag
	 */
	
	public short getTransflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 996);
		} else {
			return __io__block.readShort(__io__address + 824);
		}
	}

	/**
	 * Set method for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				Flags 1 and 2 were unused or relics from past features.
	 * 				<pre>
	 * 					OB_NEG_SCALE        = 1 << 2,
	 * 					OB_DUPLIFRAMES      = 1 << 3,
	 * 					OB_DUPLIVERTS       = 1 << 4,
	 * 					OB_DUPLIROT         = 1 << 5,
	 * 					OB_DUPLINOSPEED     = 1 << 6,
	 * 					OB_DUPLIGROUP       = 1 << 8,
	 * 					OB_DUPLIFACES       = 1 << 9,
	 * 					OB_DUPLIFACES_SCALE = 1 << 10,
	 * 					OB_DUPLIPARTS       = 1 << 11,
	 * 					OB_RENDER_DUPLI     = 1 << 12,
	 * 					OB_NO_CONSTRAINTS   = 1 << 13,  --> runtime constraints disable
	 * 					OB_NO_PSYS_UPDATE   = 1 << 14,  --> hack to work around particle issue
	 * 					OB_DUPLI            = OB_DUPLIFRAMES | OB_DUPLIVERTS | OB_DUPLIGROUP | OB_DUPLIFACES | OB_DUPLIPARTS,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Transformation settings and transform locks. </p>
	 * @see #__DNA__FIELD__transflag
	 */
	
	public void setTransflag(short transflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 996, transflag);
		} else {
			__io__block.writeShort(__io__address + 824, transflag);
		}
	}

	/**
	 * Get method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks. <h3>Values:</h3>
	 * 				<pre>
	 * 					OB_LOCK_LOCX    = 1 << 0,
	 * 					OB_LOCK_LOCY    = 1 << 1,
	 * 					OB_LOCK_LOCZ    = 1 << 2,
	 * 					OB_LOCK_LOC     = OB_LOCK_LOCX | OB_LOCK_LOCY | OB_LOCK_LOCZ,
	 * 					OB_LOCK_ROTX    = 1 << 3,
	 * 					OB_LOCK_ROTY    = 1 << 4,
	 * 					OB_LOCK_ROTZ    = 1 << 5,
	 * 					OB_LOCK_ROT     = OB_LOCK_ROTX | OB_LOCK_ROTY | OB_LOCK_ROTZ,
	 * 					OB_LOCK_SCALEX  = 1 << 6,
	 * 					OB_LOCK_SCALEY  = 1 << 7,
	 * 					OB_LOCK_SCALEZ  = 1 << 8,
	 * 					OB_LOCK_SCALE   = OB_LOCK_SCALEX | OB_LOCK_SCALEY | OB_LOCK_SCALEZ,
	 * 					OB_LOCK_ROTW    = 1 << 9,
	 * 					OB_LOCK_ROT4D   = 1 << 10,
	 * 				</pre>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public short getProtectflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 998);
		} else {
			return __io__block.readShort(__io__address + 826);
		}
	}

	/**
	 * Set method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks. <h3>Values:</h3>
	 * 				<pre>
	 * 					OB_LOCK_LOCX    = 1 << 0,
	 * 					OB_LOCK_LOCY    = 1 << 1,
	 * 					OB_LOCK_LOCZ    = 1 << 2,
	 * 					OB_LOCK_LOC     = OB_LOCK_LOCX | OB_LOCK_LOCY | OB_LOCK_LOCZ,
	 * 					OB_LOCK_ROTX    = 1 << 3,
	 * 					OB_LOCK_ROTY    = 1 << 4,
	 * 					OB_LOCK_ROTZ    = 1 << 5,
	 * 					OB_LOCK_ROT     = OB_LOCK_ROTX | OB_LOCK_ROTY | OB_LOCK_ROTZ,
	 * 					OB_LOCK_SCALEX  = 1 << 6,
	 * 					OB_LOCK_SCALEY  = 1 << 7,
	 * 					OB_LOCK_SCALEZ  = 1 << 8,
	 * 					OB_LOCK_SCALE   = OB_LOCK_SCALEX | OB_LOCK_SCALEY | OB_LOCK_SCALEZ,
	 * 					OB_LOCK_ROTW    = 1 << 9,
	 * 					OB_LOCK_ROT4D   = 1 << 10,
	 * 				</pre>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public void setProtectflag(short protectflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 998, protectflag);
		} else {
			__io__block.writeShort(__io__address + 826, protectflag);
		}
	}

	/**
	 * Get method for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * @see #__DNA__FIELD__trackflag
	 */
	
	public short getTrackflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1000);
		} else {
			return __io__block.readShort(__io__address + 828);
		}
	}

	/**
	 * Set method for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * @see #__DNA__FIELD__trackflag
	 */
	
	public void setTrackflag(short trackflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1000, trackflag);
		} else {
			__io__block.writeShort(__io__address + 828, trackflag);
		}
	}

	/**
	 * Get method for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * @see #__DNA__FIELD__upflag
	 */
	
	public short getUpflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1002);
		} else {
			return __io__block.readShort(__io__address + 830);
		}
	}

	/**
	 * Set method for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * transformation settings and transform locks.
	 * 				<pre>
	 * 					OB_POSX = 0,
	 * 					OB_POSY = 1,
	 * 					OB_POSZ = 2,
	 * 					OB_NEGX = 3,
	 * 					OB_NEGY = 4,
	 * 					OB_NEGZ = 5,
	 * 				</pre>
	 * @see #__DNA__FIELD__upflag
	 */
	
	public void setUpflag(short upflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1002, upflag);
		} else {
			__io__block.writeShort(__io__address + 830, upflag);
		}
	}

	/**
	 * Get method for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * used for DopeSheet filtering settings (expanded/collapsed).
	 * 				<pre>
	 * 					-- object-channel expanded status --
	 * 					OB_ADS_COLLAPSED    = 1 << 10,
	 * 					-- object's ipo-block --
	 * 					OB_ADS_SHOWIPO      = 1 << 11,
	 * 					-- object's constraint channels --
	 * 					OB_ADS_SHOWCONS     = 1 << 12,
	 * 					-- object's material channels --
	 * 					OB_ADS_SHOWMATS     = 1 << 13,
	 * 					-- object's marticle channels --
	 * 					OB_ADS_SHOWPARTS    = 1 << 14,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for DopeSheet filtering settings (expanded/collapsed). </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public short getNlaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1004);
		} else {
			return __io__block.readShort(__io__address + 832);
		}
	}

	/**
	 * Set method for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * used for DopeSheet filtering settings (expanded/collapsed).
	 * 				<pre>
	 * 					-- object-channel expanded status --
	 * 					OB_ADS_COLLAPSED    = 1 << 10,
	 * 					-- object's ipo-block --
	 * 					OB_ADS_SHOWIPO      = 1 << 11,
	 * 					-- object's constraint channels --
	 * 					OB_ADS_SHOWCONS     = 1 << 12,
	 * 					-- object's material channels --
	 * 					OB_ADS_SHOWMATS     = 1 << 13,
	 * 					-- object's marticle channels --
	 * 					OB_ADS_SHOWPARTS    = 1 << 14,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for DopeSheet filtering settings (expanded/collapsed). </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public void setNlaflag(short nlaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1004, nlaflag);
		} else {
			__io__block.writeShort(__io__address + 832, nlaflag);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public byte get_pad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1006);
		} else {
			return __io__block.readByte(__io__address + 834);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(byte _pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1006, _pad1);
		} else {
			__io__block.writeByte(__io__address + 834, _pad1);
		}
	}

	/**
	 * Get method for struct member 'duplicator_visibility_flag'.
	 * @see #__DNA__FIELD__duplicator_visibility_flag
	 */
	
	public byte getDuplicator_visibility_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1007);
		} else {
			return __io__block.readByte(__io__address + 835);
		}
	}

	/**
	 * Set method for struct member 'duplicator_visibility_flag'.
	 * @see #__DNA__FIELD__duplicator_visibility_flag
	 */
	
	public void setDuplicator_visibility_flag(byte duplicator_visibility_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1007, duplicator_visibility_flag);
		} else {
			__io__block.writeByte(__io__address + 835, duplicator_visibility_flag);
		}
	}

	/**
	 * Get method for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Depsgraph Used by depsgraph, flushed from base. </p>
	 * @see #__DNA__FIELD__base_flag
	 */
	
	public short getBase_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1008);
		} else {
			return __io__block.readShort(__io__address + 836);
		}
	}

	/**
	 * Set method for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Depsgraph Used by depsgraph, flushed from base. </p>
	 * @see #__DNA__FIELD__base_flag
	 */
	
	public void setBase_flag(short base_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1008, base_flag);
		} else {
			__io__block.writeShort(__io__address + 836, base_flag);
		}
	}

	/**
	 * Get method for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used by viewport, synced from base. </p>
	 * @see #__DNA__FIELD__base_local_view_bits
	 */
	
	public short getBase_local_view_bits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1010);
		} else {
			return __io__block.readShort(__io__address + 838);
		}
	}

	/**
	 * Set method for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used by viewport, synced from base. </p>
	 * @see #__DNA__FIELD__base_local_view_bits
	 */
	
	public void setBase_local_view_bits(short base_local_view_bits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1010, base_local_view_bits);
		} else {
			__io__block.writeShort(__io__address + 838, base_local_view_bits);
		}
	}

	/**
	 * Get method for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * <h4>Blender Source Code</h4>
	 * <p> Collision mask settings </p>
	 * @see #__DNA__FIELD__col_group
	 */
	
	public short getCol_group() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1012);
		} else {
			return __io__block.readShort(__io__address + 840);
		}
	}

	/**
	 * Set method for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * <h4>Blender Source Code</h4>
	 * <p> Collision mask settings </p>
	 * @see #__DNA__FIELD__col_group
	 */
	
	public void setCol_group(short col_group) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1012, col_group);
		} else {
			__io__block.writeShort(__io__address + 840, col_group);
		}
	}

	/**
	 * Get method for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * @see #__DNA__FIELD__col_mask
	 */
	
	public short getCol_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1014);
		} else {
			return __io__block.readShort(__io__address + 842);
		}
	}

	/**
	 * Set method for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * Collision mask settings
	 * @see #__DNA__FIELD__col_mask
	 */
	
	public void setCol_mask(short col_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1014, col_mask);
		} else {
			__io__block.writeShort(__io__address + 842, col_mask);
		}
	}

	/**
	 * Get method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...
	 * <h4>Blender Source Code</h4>
	 * <p> Rotation mode - uses defines set out in DNA_action_types.h  for PoseChannel rotations.... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public short getRotmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1016);
		} else {
			return __io__block.readShort(__io__address + 844);
		}
	}

	/**
	 * Set method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...
	 * <h4>Blender Source Code</h4>
	 * <p> Rotation mode - uses defines set out in DNA_action_types.h  for PoseChannel rotations.... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public void setRotmode(short rotmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1016, rotmode);
		} else {
			__io__block.writeShort(__io__address + 844, rotmode);
		}
	}

	/**
	 * Get method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box use for drawing
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box use for drawing. </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public byte getBoundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1018);
		} else {
			return __io__block.readByte(__io__address + 846);
		}
	}

	/**
	 * Set method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box use for drawing
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box use for drawing. </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public void setBoundtype(byte boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1018, boundtype);
		} else {
			__io__block.writeByte(__io__address + 846, boundtype);
		}
	}

	/**
	 * Get method for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box type used for collision. </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public byte getCollision_boundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1019);
		} else {
			return __io__block.readByte(__io__address + 847);
		}
	}

	/**
	 * Set method for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Bounding box type used for collision. </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public void setCollision_boundtype(byte collision_boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1019, collision_boundtype);
		} else {
			__io__block.writeByte(__io__address + 847, collision_boundtype);
		}
	}

	/**
	 * Get method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw extra settings. Flags:
	 * 				<pre>
	 * 					OB_DRAWBOUNDOX    = 1 << 0,
	 * 					OB_AXIS           = 1 << 1,
	 * 					OB_TEXSPACE       = 1 << 2,
	 * 					OB_DRAWNAME       = 1 << 3,
	 * 					OB_DRAWIMAGE      = 1 << 4,
	 * 					-- for solid+wire display --
	 * 					OB_DRAWWIRE       = 1 << 5,
	 * 					-- for overdraw s --
	 * 					OB_DRAWXRAY       = 1 << 6,
	 * 					-- enable transparent draw --
	 * 					OB_DRAWTRANSP     = 1 << 7,
	 * 					OB_DRAW_ALL_EDGES = 1 << 8,  --> only for meshes currently
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw extra settings. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public short getDtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1020);
		} else {
			return __io__block.readShort(__io__address + 848);
		}
	}

	/**
	 * Set method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw extra settings. Flags:
	 * 				<pre>
	 * 					OB_DRAWBOUNDOX    = 1 << 0,
	 * 					OB_AXIS           = 1 << 1,
	 * 					OB_TEXSPACE       = 1 << 2,
	 * 					OB_DRAWNAME       = 1 << 3,
	 * 					OB_DRAWIMAGE      = 1 << 4,
	 * 					-- for solid+wire display --
	 * 					OB_DRAWWIRE       = 1 << 5,
	 * 					-- for overdraw s --
	 * 					OB_DRAWXRAY       = 1 << 6,
	 * 					-- enable transparent draw --
	 * 					OB_DRAWTRANSP     = 1 << 7,
	 * 					OB_DRAW_ALL_EDGES = 1 << 8,  --> only for meshes currently
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw extra settings. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public void setDtx(short dtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1020, dtx);
		} else {
			__io__block.writeShort(__io__address + 848, dtx);
		}
	}

	/**
	 * Get method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw type. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public byte getDt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1022);
		} else {
			return __io__block.readByte(__io__address + 850);
		}
	}

	/**
	 * Set method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre>
	 * <h4>Blender Source Code</h4>
	 * <p> Viewport draw type. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public void setDt(byte dt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1022, dt);
		} else {
			__io__block.writeByte(__io__address + 850, dt);
		}
	}

	/**
	 * Get method for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing.
	 * 				<pre>
	 * 					OB_ARROWS        = 1,
	 * 					OB_PLAINAXES     = 2,
	 * 					OB_CIRCLE        = 3,
	 * 					OB_SINGLE_ARROW  = 4,
	 * 					OB_CUBE          = 5,
	 * 					OB_EMPTY_SPHERE  = 6,
	 * 					OB_EMPTY_CONE    = 7,
	 * 					OB_EMPTY_IMAGE   = 8,
	 * 				</pre>
	 * @see #__DNA__FIELD__empty_drawtype
	 */
	
	public byte getEmpty_drawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1023);
		} else {
			return __io__block.readByte(__io__address + 851);
		}
	}

	/**
	 * Set method for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing.
	 * 				<pre>
	 * 					OB_ARROWS        = 1,
	 * 					OB_PLAINAXES     = 2,
	 * 					OB_CIRCLE        = 3,
	 * 					OB_SINGLE_ARROW  = 4,
	 * 					OB_CUBE          = 5,
	 * 					OB_EMPTY_SPHERE  = 6,
	 * 					OB_EMPTY_CONE    = 7,
	 * 					OB_EMPTY_IMAGE   = 8,
	 * 				</pre>
	 * @see #__DNA__FIELD__empty_drawtype
	 */
	
	public void setEmpty_drawtype(byte empty_drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1023, empty_drawtype);
		} else {
			__io__block.writeByte(__io__address + 851, empty_drawtype);
		}
	}

	/**
	 * Get method for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing
	 * @see #__DNA__FIELD__empty_drawsize
	 */
	
	public float getEmpty_drawsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1024);
		} else {
			return __io__block.readFloat(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * related to viewport drawing
	 * @see #__DNA__FIELD__empty_drawsize
	 */
	
	public void setEmpty_drawsize(float empty_drawsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1024, empty_drawsize);
		} else {
			__io__block.writeFloat(__io__address + 852, empty_drawsize);
		}
	}

	/**
	 * Get method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * dupliface scale
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public float getDupfacesca() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1028);
		} else {
			return __io__block.readFloat(__io__address + 856);
		}
	}

	/**
	 * Set method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * dupliface scale
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public void setDupfacesca(float dupfacesca) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1028, dupfacesca);
		} else {
			__io__block.writeFloat(__io__address + 856, dupfacesca);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * custom index, for renderpasses
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index, for render-passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1032);
		} else {
			return __io__block.readShort(__io__address + 860);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * custom index, for renderpasses
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index, for render-passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1032, index);
		} else {
			__io__block.writeShort(__io__address + 860, index);
		}
	}

	/**
	 * Get method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current deformation group, note: index starts at 1
	 * <h4>Blender Source Code</h4>
	 * <p> Current deformation group, NOTE: index starts at 1. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public short getActdef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1034);
		} else {
			return __io__block.readShort(__io__address + 862);
		}
	}

	/**
	 * Set method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current deformation group, note: index starts at 1
	 * <h4>Blender Source Code</h4>
	 * <p> Current deformation group, NOTE: index starts at 1. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public void setActdef(short actdef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1034, actdef);
		} else {
			__io__block.writeShort(__io__address + 862, actdef);
		}
	}

	/**
	 * Get method for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current face map, NOTE: index starts at 1. </p>
	 * @see #__DNA__FIELD__actfmap
	 */
	
	public short getActfmap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1036);
		} else {
			return __io__block.readShort(__io__address + 864);
		}
	}

	/**
	 * Set method for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current face map, NOTE: index starts at 1. </p>
	 * @see #__DNA__FIELD__actfmap
	 */
	
	public void setActfmap(short actfmap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1036, actfmap);
		} else {
			__io__block.writeShort(__io__address + 864, actfmap);
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
			return new CArrayFacade<Byte>(__io__address + 1038, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 866, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1038;
		} else {
			__dna__offset = 866;
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
	 * Get method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object color
	 * @see #__DNA__FIELD__col
	 */
	
	public CArrayFacade<Float> getCol() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1040, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 868, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object color
	 * @see #__DNA__FIELD__col
	 */
	
	public void setCol(CArrayFacade<Float> col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1040;
		} else {
			__dna__offset = 868;
		}
		if (__io__equals(col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, col);
		} else {
			__io__generic__copy( getCol(), col);
		}
	}

	/**
	 * Get method for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * softbody settings
	 * <h4>Blender Source Code</h4>
	 * <p> Softbody settings. </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public short getSoftflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1056);
		} else {
			return __io__block.readShort(__io__address + 884);
		}
	}

	/**
	 * Set method for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * softbody settings
	 * <h4>Blender Source Code</h4>
	 * <p> Softbody settings. </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public void setSoftflag(short softflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1056, softflag);
		} else {
			__io__block.writeShort(__io__address + 884, softflag);
		}
	}

	/**
	 * Get method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * for restricting view, select, render etc. accessible in outliner
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public short getRestrictflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1058);
		} else {
			return __io__block.readShort(__io__address + 886);
		}
	}

	/**
	 * Set method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * for restricting view, select, render etc. accessible in outliner
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public void setRestrictflag(short restrictflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1058, restrictflag);
		} else {
			__io__block.writeShort(__io__address + 886, restrictflag);
		}
	}

	/**
	 * Get method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current shape key for menu or pinned
	 * <h4>Blender Source Code</h4>
	 * <p> Current shape key for menu or pinned. </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public short getShapenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1060);
		} else {
			return __io__block.readShort(__io__address + 888);
		}
	}

	/**
	 * Set method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * current shape key for menu or pinned
	 * <h4>Blender Source Code</h4>
	 * <p> Current shape key for menu or pinned. </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public void setShapenr(short shapenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1060, shapenr);
		} else {
			__io__block.writeShort(__io__address + 888, shapenr);
		}
	}

	/**
	 * Get method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * flag for pinning
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for pinning. </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public byte getShapeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1062);
		} else {
			return __io__block.readByte(__io__address + 890);
		}
	}

	/**
	 * Set method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * flag for pinning
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for pinning. </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public void setShapeflag(byte shapeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1062, shapeflag);
		} else {
			__io__block.writeByte(__io__address + 890, shapeflag);
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
			return new CArrayFacade<Byte>(__io__address + 1063, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 891, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1063;
		} else {
			__dna__offset = 891;
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
	 * Get method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object constraints
	 * <h4>Blender Python API</h4>
	 * (read-only)    Constraints affecting the transformation of the object
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public ListBase getConstraints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1064, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 892, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object constraints
	 * <h4>Blender Python API</h4>
	 * (read-only)    Constraints affecting the transformation of the object
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public void setConstraints(ListBase constraints) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1064;
		} else {
			__dna__offset = 892;
		}
		if (__io__equals(constraints, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, constraints)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, constraints);
		} else {
			__io__generic__copy( getConstraints(), constraints);
		}
	}

	/**
	 * Get method for struct member 'nlastrips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__nlastrips
	 */
	
	public ListBase getNlastrips() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1080, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 900, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nlastrips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__nlastrips
	 */
	
	public void setNlastrips(ListBase nlastrips) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1080;
		} else {
			__dna__offset = 900;
		}
		if (__io__equals(nlastrips, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nlastrips)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nlastrips);
		} else {
			__io__generic__copy( getNlastrips(), nlastrips);
		}
	}

	/**
	 * Get method for struct member 'hooks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__hooks
	 */
	
	public ListBase getHooks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1096, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 908, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hooks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * @deprecated
	 * <h4>Blender Source Code</h4>
	 * <p><p> XXX deprecated... old animation system </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... old animation system 
	 * </p>
	 * @see #__DNA__FIELD__hooks
	 */
	
	public void setHooks(ListBase hooks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1096;
		} else {
			__dna__offset = 908;
		}
		if (__io__equals(hooks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hooks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hooks);
		} else {
			__io__generic__copy( getHooks(), hooks);
		}
	}

	/**
	 * Get method for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle systems
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  systems. </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public ListBase getParticlesystem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1112, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 916, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle systems
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  systems. </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public void setParticlesystem(ListBase particlesystem) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1112;
		} else {
			__dna__offset = 916;
		}
		if (__io__equals(particlesystem, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, particlesystem)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, particlesystem);
		} else {
			__io__generic__copy( getParticlesystem(), particlesystem);
		}
	}

	/**
	 * Get method for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle deflector/attractor/collision data
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  deflector/attractor/collision data. </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public CPointer<PartDeflect> getPd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 924);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartDeflect.class};
		return new CPointer<PartDeflect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartDeflect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * particle deflector/attractor/collision data
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  deflector/attractor/collision data. </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public void setPd(CPointer<PartDeflect> pd) throws IOException
	{
		long __address = ((pd == null) ? 0 : pd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1128, __address);
		} else {
			__io__block.writeLong(__io__address + 924, __address);
		}
	}

	/**
	 * Get method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if exists, saved in file
	 * <h4>Blender Source Code</h4>
	 * <p> If exists, saved in file. </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public CPointer<SoftBody> getSoft() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 928);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SoftBody.class};
		return new CPointer<SoftBody>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SoftBody.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if exists, saved in file
	 * <h4>Blender Source Code</h4>
	 * <p> If exists, saved in file. </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public void setSoft(CPointer<SoftBody> soft) throws IOException
	{
		long __address = ((soft == null) ? 0 : soft.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1136, __address);
		} else {
			__io__block.writeLong(__io__address + 928, __address);
		}
	}

	/**
	 * Get method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object duplicator for group
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public CPointer<Collection> getDup_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 932);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * object duplicator for group
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public void setDup_group(CPointer<Collection> dup_group) throws IOException
	{
		long __address = ((dup_group == null) ? 0 : dup_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1144, __address);
		} else {
			__io__block.writeLong(__io__address + 932, __address);
		}
	}

	/**
	 * Get method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if fluidsim enabled, store additional settings
	 * <h4>Blender Source Code</h4>
	 * <p> If fluidsim enabled, store additional settings. <p> XXX deprecated... replaced by mantaflow, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by mantaflow, keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public CPointer<FluidsimSettings> getFluidsimSettings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 936);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidsimSettings.class};
		return new CPointer<FluidsimSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidsimSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * if fluidsim enabled, store additional settings
	 * <h4>Blender Source Code</h4>
	 * <p> If fluidsim enabled, store additional settings. <p> XXX deprecated... replaced by mantaflow, keep for readfile </p>
	 * @deprecated
	 *  DeprecatedXXX deprecated... replaced by mantaflow, keep for readfile 
	 * </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public void setFluidsimSettings(CPointer<FluidsimSettings> fluidsimSettings) throws IOException
	{
		long __address = ((fluidsimSettings == null) ? 0 : fluidsimSettings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1152, __address);
		} else {
			__io__block.writeLong(__io__address + 936, __address);
		}
	}

	/**
	 * Get method for struct member 'pc_ids'.
	 * @see #__DNA__FIELD__pc_ids
	 */
	
	public ListBase getPc_ids() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 940, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pc_ids'.
	 * @see #__DNA__FIELD__pc_ids
	 */
	
	public void setPc_ids(ListBase pc_ids) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1160;
		} else {
			__dna__offset = 940;
		}
		if (__io__equals(pc_ids, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pc_ids)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pc_ids);
		} else {
			__io__generic__copy( getPc_ids(), pc_ids);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet rigid body
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet rigid body. </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public CPointer<RigidBodyOb> getRigidbody_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 948);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyOb.class};
		return new CPointer<RigidBodyOb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyOb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet rigid body
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet rigid body. </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public void setRigidbody_object(CPointer<RigidBodyOb> rigidbody_object) throws IOException
	{
		long __address = ((rigidbody_object == null) ? 0 : rigidbody_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1176, __address);
		} else {
			__io__block.writeLong(__io__address + 948, __address);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet constraint
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet constraint. </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public CPointer<RigidBodyCon> getRigidbody_constraint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 952);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyCon.class};
		return new CPointer<RigidBodyCon>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyCon.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * settings for Bullet constraint
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for Bullet constraint. </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public void setRigidbody_constraint(CPointer<RigidBodyCon> rigidbody_constraint) throws IOException
	{
		long __address = ((rigidbody_constraint == null) ? 0 : rigidbody_constraint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1184, __address);
		} else {
			__io__block.writeLong(__io__address + 952, __address);
		}
	}

	/**
	 * Get method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * offset for image empties
	 * <h4>Blender Source Code</h4>
	 * <p> Offset for image empties. </p>
	 * @see #__DNA__FIELD__ima_ofs
	 */
	
	public CArrayFacade<Float> getIma_ofs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 956, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend</h4>
	 * offset for image empties
	 * <h4>Blender Source Code</h4>
	 * <p> Offset for image empties. </p>
	 * @see #__DNA__FIELD__ima_ofs
	 */
	
	public void setIma_ofs(CArrayFacade<Float> ima_ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1192;
		} else {
			__dna__offset = 956;
		}
		if (__io__equals(ima_ofs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ima_ofs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ima_ofs);
		} else {
			__io__generic__copy( getIma_ofs(), ima_ofs);
		}
	}

	/**
	 * Get method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be non-null when object is an empty image. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public CPointer<ImageUser> getIuser() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 964);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageUser.class};
		return new CPointer<ImageUser>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageUser.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be non-null when object is an empty image. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(CPointer<ImageUser> iuser) throws IOException
	{
		long __address = ((iuser == null) ? 0 : iuser.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1200, __address);
		} else {
			__io__block.writeLong(__io__address + 964, __address);
		}
	}

	/**
	 * Get method for struct member 'empty_image_visibility_flag'.
	 * @see #__DNA__FIELD__empty_image_visibility_flag
	 */
	
	public byte getEmpty_image_visibility_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1208);
		} else {
			return __io__block.readByte(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'empty_image_visibility_flag'.
	 * @see #__DNA__FIELD__empty_image_visibility_flag
	 */
	
	public void setEmpty_image_visibility_flag(byte empty_image_visibility_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1208, empty_image_visibility_flag);
		} else {
			__io__block.writeByte(__io__address + 968, empty_image_visibility_flag);
		}
	}

	/**
	 * Get method for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine which other objects will occlude the image
	 * @see #__DNA__FIELD__empty_image_depth
	 */
	
	public byte getEmpty_image_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1209);
		} else {
			return __io__block.readByte(__io__address + 969);
		}
	}

	/**
	 * Set method for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine which other objects will occlude the image
	 * @see #__DNA__FIELD__empty_image_depth
	 */
	
	public void setEmpty_image_depth(byte empty_image_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1209, empty_image_depth);
		} else {
			__io__block.writeByte(__io__address + 969, empty_image_depth);
		}
	}

	/**
	 * Get method for struct member 'empty_image_flag'.
	 * @see #__DNA__FIELD__empty_image_flag
	 */
	
	public byte getEmpty_image_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1210);
		} else {
			return __io__block.readByte(__io__address + 970);
		}
	}

	/**
	 * Set method for struct member 'empty_image_flag'.
	 * @see #__DNA__FIELD__empty_image_flag
	 */
	
	public void setEmpty_image_flag(byte empty_image_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1210, empty_image_flag);
		} else {
			__io__block.writeByte(__io__address + 970, empty_image_flag);
		}
	}

	/**
	 * Get method for struct member 'modifier_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> ModifierFlag </p>
	 * @see #__DNA__FIELD__modifier_flag
	 */
	
	public byte getModifier_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1211);
		} else {
			return __io__block.readByte(__io__address + 971);
		}
	}

	/**
	 * Set method for struct member 'modifier_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> ModifierFlag </p>
	 * @see #__DNA__FIELD__modifier_flag
	 */
	
	public void setModifier_flag(byte modifier_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1211, modifier_flag);
		} else {
			__io__block.writeByte(__io__address + 971, modifier_flag);
		}
	}

	/**
	 * Get method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public CArrayFacade<Byte> get_pad8() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 972, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public void set_pad8(CArrayFacade<Byte> _pad8) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1212;
		} else {
			__dna__offset = 972;
		}
		if (__io__equals(_pad8, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad8)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad8);
		} else {
			__io__generic__copy( get_pad8(), _pad8);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 976);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1216, __address);
		} else {
			__io__block.writeLong(__io__address + 976, __address);
		}
	}

	/**
	 * Get method for struct member 'lineart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Line art settings for the object
	 * @see #__DNA__FIELD__lineart
	 */
	
	public ObjectLineArt getLineart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ObjectLineArt(__io__address + 1224, __io__block, __io__blockTable);
		} else {
			return new ObjectLineArt(__io__address + 980, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lineart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Line art settings for the object
	 * @see #__DNA__FIELD__lineart
	 */
	
	public void setLineart(ObjectLineArt lineart) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1224;
		} else {
			__dna__offset = 980;
		}
		if (__io__equals(lineart, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lineart)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lineart);
		} else {
			__io__generic__copy( getLineart(), lineart);
		}
	}

	/**
	 * Get method for struct member 'lightgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Lightgroup that the object belongs to
	 * <h4>Blender Source Code</h4>
	 * <p> Lightgroup membership information. </p>
	 * @see #__DNA__FIELD__lightgroup
	 */
	
	public CPointer<LightgroupMembership> getLightgroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 996);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LightgroupMembership.class};
		return new CPointer<LightgroupMembership>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LightgroupMembership.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lightgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Lightgroup that the object belongs to
	 * <h4>Blender Source Code</h4>
	 * <p> Lightgroup membership information. </p>
	 * @see #__DNA__FIELD__lightgroup
	 */
	
	public void setLightgroup(CPointer<LightgroupMembership> lightgroup) throws IOException
	{
		long __address = ((lightgroup == null) ? 0 : lightgroup.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1240, __address);
		} else {
			__io__block.writeLong(__io__address + 996, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Object_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Object_Runtime(__io__address + 1248, __io__block, __io__blockTable);
		} else {
			return new Object_Runtime(__io__address + 1000, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Object_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1248;
		} else {
			__dna__offset = 1000;
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
	public CPointer<BlenderObject> __io__addressof() {
		return new CPointer<BlenderObject>(__io__address, new Class[]{BlenderObject.class}, __io__block, __io__blockTable);
	}

}
