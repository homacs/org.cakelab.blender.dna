package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Object'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
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

@CMetaData(size32=1176, size64=1440)
public class BlenderObject extends CFacade {

	/**
	 * This is the sdna index of the struct Object.
	 * <p>
	 * It is required when allocating a new block to store data for Object.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 150;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * animation data<h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__sculpt = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Type of Object
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
	public static final long[] __DNA__FIELD__type = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__partype = new long[]{110, 138};

	/**
	 * Field descriptor (offset) for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
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
	public static final long[] __DNA__FIELD__par1 = new long[]{112, 140};

	/**
	 * Field descriptor (offset) for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__par2 = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
	 * <p> can be vertexnrs </p>
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
	public static final long[] __DNA__FIELD__par3 = new long[]{120, 148};

	/**
	 * Field descriptor (offset) for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2 </p>
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
	public static final long[] __DNA__FIELD__parsubstr = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Parent Object
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
	public static final long[] __DNA__FIELD__parent = new long[]{188, 216};

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
	public static final long[] __DNA__FIELD__track = new long[]{192, 224};

	/**
	 * Field descriptor (offset) for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library object this proxy object controls<h4>Blender Source Code:</h4>
	 * <p> if ob->proxy (or proxy_group), this object is proxy for object ob->proxy proxy_from is set in target back to the proxy. </p>
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
	public static final long[] __DNA__FIELD__proxy = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library group duplicator object this proxy object controls
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
	public static final long[] __DNA__FIELD__proxy_group = new long[]{200, 240};

	/**
	 * Field descriptor (offset) for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * proxy_from is set in target back to the proxy.
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
	public static final long[] __DNA__FIELD__proxy_from = new long[]{204, 248};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
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
	public static final long[] __DNA__FIELD__ipo = new long[]{208, 256};

	/**
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Bounding box of the associated mesh/curve/etc. Cache value not stored in file.<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; axis aligned boundbox (in localspace) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{212, 264};

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated
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
	public static final long[] __DNA__FIELD__action = new long[]{216, 272};

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
	public static final long[] __DNA__FIELD__poselib = new long[]{220, 280};

	/**
	 * Field descriptor (offset) for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pose data, armature objects only<h4>Blender Python API:</h4>
	 * (read-only)    Current pose for armatures<h4>Blender Source Code:</h4>
	 * <p> pose data, armature objects only </p>
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
	public static final long[] __DNA__FIELD__pose = new long[]{224, 288};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pointer to objects data - an 'ID' or NULL<h4>Blender Python API:</h4>
	 * Object data<h4>Blender Source Code:</h4>
	 * <p> pointer to objects data - an '{@link ID} ' or NULL </p>
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
	public static final long[] __DNA__FIELD__data = new long[]{228, 296};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data </p>
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
	public static final long[] __DNA__FIELD__gpd = new long[]{232, 304};

	/**
	 * Field descriptor (offset) for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
	 * <p> settings for visualization of object-transform animation </p>
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
	 * <li>Actual Size (32bit/64bit): 48/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avs = new long[]{236, 312};

	/**
	 * Field descriptor (offset) for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * motion path cache for this object<h4>Blender Source Code:</h4>
	 * <p> motion path cache for this object </p>
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
	public static final long[] __DNA__FIELD__mpath = new long[]{284, 360};

	/**
	 * Field descriptor (offset) for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system.<br/>@depricated
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
	public static final long[] __DNA__FIELD__constraintChannels = new long[]{288, 368};

	/**
	 * Field descriptor (offset) for struct member 'effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <br/>@depricated
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
	public static final long[] __DNA__FIELD__effect = new long[]{296, 384};

	/**
	 * Field descriptor (offset) for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of bDeformGroup (vertex groups) names and flag only<h4>Blender Source Code:</h4>
	 * <p> list of {@link bDeformGroup}  (vertex groups) names and flag only </p>
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
	public static final long[] __DNA__FIELD__defbase = new long[]{304, 400};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of ModifierData structures<h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object<h4>Blender Source Code:</h4>
	 * <p> list of {@link ModifierData}  structures </p>
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
	public static final long[] __DNA__FIELD__modifiers = new long[]{312, 416};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Object interaction mode<h4>Blender Source Code:</h4>
	 * <p> Local object mode </p>
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
	public static final long[] __DNA__FIELD__mode = new long[]{320, 432};

	/**
	 * Field descriptor (offset) for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Keep track of what mode to return to after toggling a mode<h4>Blender Source Code:</h4>
	 * <p> Keep track of what mode to return to after toggling a mode </p>
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
	public static final long[] __DNA__FIELD__restore_mode = new long[]{324, 436};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
	 * <p> materials material slots </p>
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
	public static final long[] __DNA__FIELD__mat = new long[]{328, 440};

	/**
	 * Field descriptor (offset) for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
	 * <p> a boolean field, with each byte 1 if corresponding material is linked to object </p>
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
	public static final long[] __DNA__FIELD__matbits = new long[]{332, 448};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
	 * <p> copy of mesh, curve & meta struct member of same name (keep in sync) </p>
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
	public static final long[] __DNA__FIELD__totcol = new long[]{336, 456};

	/**
	 * Field descriptor (offset) for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
	 * <p> currently selected material in the UI </p>
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
	public static final long[] __DNA__FIELD__actcol = new long[]{340, 460};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * location of the object<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__loc = new long[]{344, 464};

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
	public static final long[] __DNA__FIELD__dloc = new long[]{356, 476};

	/**
	 * Field descriptor (offset) for struct member 'orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * origin of the object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__orig);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_orig = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig = new long[]{368, 488};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * size/scale of the object<h4>Blender Source Code:</h4>
	 * <p> scale in fact </p>
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
	public static final long[] __DNA__FIELD__size = new long[]{380, 500};

	/**
	 * Field descriptor (offset) for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> DEPRECATED, 2.60 and older only </p>
	 * @deprecated
	 *  DeprecatedDEPRECATED, 2.60 and older only </p>
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
	public static final long[] __DNA__FIELD__dsize = new long[]{392, 512};

	/**
	 * Field descriptor (offset) for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ack!, changing </p>
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
	public static final long[] __DNA__FIELD__dscale = new long[]{404, 524};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation
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
	public static final long[] __DNA__FIELD__rot = new long[]{416, 536};

	/**
	 * Field descriptor (offset) for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation<h4>Blender Source Code:</h4>
	 * <p> euler rotation </p>
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
	public static final long[] __DNA__FIELD__drot = new long[]{428, 548};

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation
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
	public static final long[] __DNA__FIELD__quat = new long[]{440, 560};

	/**
	 * Field descriptor (offset) for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation<h4>Blender Source Code:</h4>
	 * <p> quaternion rotation </p>
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
	public static final long[] __DNA__FIELD__dquat = new long[]{456, 576};

	/**
	 * Field descriptor (offset) for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part
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
	public static final long[] __DNA__FIELD__rotAxis = new long[]{472, 592};

	/**
	 * Field descriptor (offset) for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - axis part </p>
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
	public static final long[] __DNA__FIELD__drotAxis = new long[]{484, 604};

	/**
	 * Field descriptor (offset) for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part
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
	public static final long[] __DNA__FIELD__rotAngle = new long[]{496, 616};

	/**
	 * Field descriptor (offset) for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - angle part </p>
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
	public static final long[] __DNA__FIELD__drotAngle = new long[]{500, 620};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> final worldspace matrix with constraints & animsys applied </p>
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
	public static final long[] __DNA__FIELD__obmat = new long[]{504, 624};

	/**
	 * Field descriptor (offset) for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent<h4>Blender Source Code:</h4>
	 * <p> inverse result of parent, so that object doesn't 'stick' to parent </p>
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
	public static final long[] __DNA__FIELD__parentinv = new long[]{568, 688};

	/**
	 * Field descriptor (offset) for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform<h4>Blender Source Code:</h4>
	 * <p> inverse result of constraints. doesn't include effect of parent or object local transform </p>
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
	public static final long[] __DNA__FIELD__constinv = new long[]{632, 752};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);<h4>Blender Source Code:</h4>
	 * <p> inverse matrix of 'obmat' for any other use than rendering! </p>
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
	public static final long[] __DNA__FIELD__imat = new long[]{696, 816};

	/**
	 * Field descriptor (offset) for struct member 'imat_ren'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Cache of inverse object-view matrix calculated at runtime. Previously 'imat' was used at render time, but as other places use it too
	 * 	 							the interactive ui of 2.5 creates problems. So now only 'imat_ren' should
	 * 								be used when ever the inverse of ob->obmat * re->viewmat is needed!<h4>Blender Source Code:</h4>
	 * <p> note: this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__imat_ren);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat_ren = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat_ren'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat_ren = new long[]{760, 880};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of Base's layer in the scene<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base} 's layer in the scene </p>
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
	public static final long[] __DNA__FIELD__lay = new long[]{824, 944};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base}  </p>
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
	public static final long[] __DNA__FIELD__flag = new long[]{828, 948};

	/**
	 * Field descriptor (offset) for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use 'matbits' </p>
	 * @deprecated
	 *  Deprecateddeprecated, use 'matbits' </p>
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
	public static final long[] __DNA__FIELD__colbits = new long[]{830, 950};

	/**
	 * Field descriptor (offset) for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__transflag = new long[]{832, 952};

	/**
	 * Field descriptor (offset) for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> transformation settings and transform locks </p>
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
	public static final long[] __DNA__FIELD__protectflag = new long[]{834, 954};

	/**
	 * Field descriptor (offset) for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__trackflag = new long[]{836, 956};

	/**
	 * Field descriptor (offset) for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__upflag = new long[]{838, 958};

	/**
	 * Field descriptor (offset) for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> used for DopeSheet filtering settings (expanded/collapsed) </p>
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
	public static final long[] __DNA__FIELD__nlaflag = new long[]{840, 960};

	/**
	 * Field descriptor (offset) for struct member 'scaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * ui state for game logic<h4>Blender Source Code:</h4>
	 * <p> ui state for game logic </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__scaflag);
	 * CPointer&lt;Short&gt; p_scaflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaflag = new long[]{842, 962};

	/**
	 * Field descriptor (offset) for struct member 'scavisflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * more display settings for game logic<h4>Blender Source Code:</h4>
	 * <p> more display settings for game logic </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__scavisflag);
	 * CPointer&lt;Byte&gt; p_scavisflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scavisflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scavisflag = new long[]{844, 964};

	/**
	 * Field descriptor (offset) for struct member 'depsflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__depsflag);
	 * CPointer&lt;Byte&gt; p_depsflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depsflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depsflag = new long[]{845, 965};

	/**
	 * Field descriptor (offset) for struct member 'lastNeedMapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime cache info related to derived mesh. Gets initialised on demand.<h4>Blender Source Code:</h4>
	 * <p> did last modifier stack generation need mapping support? bool </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lastNeedMapping);
	 * CPointer&lt;Byte&gt; p_lastNeedMapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastNeedMapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastNeedMapping = new long[]{846, 966};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * padding. Ignore it.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{847, 967};

	/**
	 * Field descriptor (offset) for struct member 'dupon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dupli-frame settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dupon);
	 * CPointer&lt;Integer&gt; p_dupon = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupon'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupon = new long[]{848, 968};

	/**
	 * Field descriptor (offset) for struct member 'dupoff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dupoff);
	 * CPointer&lt;Integer&gt; p_dupoff = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupoff'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupoff = new long[]{852, 972};

	/**
	 * Field descriptor (offset) for struct member 'dupsta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dupsta);
	 * CPointer&lt;Integer&gt; p_dupsta = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupsta'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupsta = new long[]{856, 976};

	/**
	 * Field descriptor (offset) for struct member 'dupend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dupend);
	 * CPointer&lt;Integer&gt; p_dupend = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupend'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupend = new long[]{860, 980};

	/**
	 * Field descriptor (offset) for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. <h4>Blender Source Code:</h4>
	 * <p> during realtime note that inertia is only called inertia for historical reasons and is not changed to avoid DNA surgery. It actually reflects the Size value in the GameButtons (= radius) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__mass);
	 * CPointer&lt;Float&gt; p_mass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mass = new long[]{864, 984};

	/**
	 * Field descriptor (offset) for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__damping);
	 * CPointer&lt;Float&gt; p_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damping = new long[]{868, 988};

	/**
	 * Field descriptor (offset) for struct member 'inertia'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. note that inertia is only called inertia for historical reasons
	 * 	 				and is not changed to avoid DNA surgery. It actually reflects the 
	 * 	 				Size value in the GameButtons (= radius).
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__inertia);
	 * CPointer&lt;Float&gt; p_inertia = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inertia'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inertia = new long[]{872, 992};

	/**
	 * Field descriptor (offset) for struct member 'formfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The form factor k is introduced to give the user more control
	 * 					and to fix incompatibility problems.
	 * 					For rotational symmetric objects, the inertia value can be
	 * 					expressed as: Theta = k * m * r^2
	 * 					where m = Mass, r = Radius
	 * 					For a Sphere, the form factor is by default = 0.4<h4>Blender Source Code:</h4>
	 * <p> The form factor k is introduced to give the user more control and to fix incompatibility problems. For rotational symmetric objects, the inertia value can be expressed as: Theta = k * m * r^2 where m = Mass, r = Radius For a Sphere, the form factor is by default = 0.4 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__formfactor);
	 * CPointer&lt;Float&gt; p_formfactor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'formfactor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__formfactor = new long[]{876, 996};

	/**
	 * Field descriptor (offset) for struct member 'rdamping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__rdamping);
	 * CPointer&lt;Float&gt; p_rdamping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rdamping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rdamping = new long[]{880, 1000};

	/**
	 * Field descriptor (offset) for struct member 'margin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__margin);
	 * CPointer&lt;Float&gt; p_margin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin = new long[]{884, 1004};

	/**
	 * Field descriptor (offset) for struct member 'max_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the maximum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the maximum velocity 0.0 is disabled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__max_vel);
	 * CPointer&lt;Float&gt; p_max_vel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_vel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_vel = new long[]{888, 1008};

	/**
	 * Field descriptor (offset) for struct member 'min_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the minimum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the minimum velocity 0.0 is disabled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__min_vel);
	 * CPointer&lt;Float&gt; p_min_vel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_vel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_vel = new long[]{892, 1012};

	/**
	 * Field descriptor (offset) for struct member 'max_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the maximum angular velocity, 0.0 is disabled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__max_angvel);
	 * CPointer&lt;Float&gt; p_max_angvel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_angvel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_angvel = new long[]{896, 1016};

	/**
	 * Field descriptor (offset) for struct member 'min_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the minimum angular velocity, 0.0 is disabled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__min_angvel);
	 * CPointer&lt;Float&gt; p_min_angvel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_angvel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_angvel = new long[]{900, 1020};

	/**
	 * Field descriptor (offset) for struct member 'obstacleRad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__obstacleRad);
	 * CPointer&lt;Float&gt; p_obstacleRad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obstacleRad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obstacleRad = new long[]{904, 1024};

	/**
	 * Field descriptor (offset) for struct member 'step_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties<h4>Blender Source Code:</h4>
	 * <p> "Character" physics properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__step_height);
	 * CPointer&lt;Float&gt; p_step_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'step_height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__step_height = new long[]{908, 1028};

	/**
	 * Field descriptor (offset) for struct member 'jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 10</em></p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__jump_speed);
	 * CPointer&lt;Float&gt; p_jump_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jump_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jump_speed = new long[]{912, 1032};

	/**
	 * Field descriptor (offset) for struct member 'fall_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 55</em></p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__fall_speed);
	 * CPointer&lt;Float&gt; p_fall_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fall_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fall_speed = new long[]{916, 1036};

	/**
	 * Field descriptor (offset) for struct member 'max_jumps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__max_jumps);
	 * CPointer&lt;Byte&gt; p_max_jumps = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_jumps'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_jumps = new long[]{920, 1040};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{921, 1041};

	/**
	 * Field descriptor (offset) for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Collision mask settings<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__col_group = new long[]{924, 1044};

	/**
	 * Field descriptor (offset) for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__col_mask = new long[]{926, 1046};

	/**
	 * Field descriptor (offset) for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations... </p>
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
	public static final long[] __DNA__FIELD__rotmode = new long[]{928, 1048};

	/**
	 * Field descriptor (offset) for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
	 * <p> bounding box use for drawing </p>
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
	public static final long[] __DNA__FIELD__boundtype = new long[]{930, 1050};

	/**
	 * Field descriptor (offset) for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> bounding box type used for collision </p>
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
	public static final long[] __DNA__FIELD__collision_boundtype = new long[]{931, 1051};

	/**
	 * Field descriptor (offset) for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw extra settings </p>
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
	public static final long[] __DNA__FIELD__dtx = new long[]{932, 1052};

	/**
	 * Field descriptor (offset) for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw type </p>
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
	public static final long[] __DNA__FIELD__dt = new long[]{934, 1054};

	/**
	 * Field descriptor (offset) for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__empty_drawtype = new long[]{935, 1055};

	/**
	 * Field descriptor (offset) for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__empty_drawsize = new long[]{936, 1056};

	/**
	 * Field descriptor (offset) for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dupliface scale<h4>Blender Source Code:</h4>
	 * <p> dupliface scale </p>
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
	public static final long[] __DNA__FIELD__dupfacesca = new long[]{940, 1060};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic property list (not to be confused with IDProperties)<h4>Blender Source Code:</h4>
	 * <p> game logic property list (not to be confused with IDProperties) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__prop);
	 * CPointer&lt;ListBase&gt; p_prop = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop = new long[]{944, 1064};

	/**
	 * Field descriptor (offset) for struct member 'sensors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic sensors<h4>Blender Source Code:</h4>
	 * <p> game logic sensors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__sensors);
	 * CPointer&lt;ListBase&gt; p_sensors = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensors'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensors = new long[]{952, 1080};

	/**
	 * Field descriptor (offset) for struct member 'controllers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic controllers<h4>Blender Source Code:</h4>
	 * <p> game logic controllers </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__controllers);
	 * CPointer&lt;ListBase&gt; p_controllers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'controllers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__controllers = new long[]{960, 1096};

	/**
	 * Field descriptor (offset) for struct member 'actuators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic actuators<h4>Blender Source Code:</h4>
	 * <p> game logic actuators </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__actuators);
	 * CPointer&lt;ListBase&gt; p_actuators = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actuators'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actuators = new long[]{968, 1112};

	/**
	 * Field descriptor (offset) for struct member 'sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * sf is time-offset<h4>Blender Source Code:</h4>
	 * <p> sf is time-offset </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__sf);
	 * CPointer&lt;Float&gt; p_sf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sf = new long[]{976, 1128};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> custom index, for renderpasses </p>
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
	public static final long[] __DNA__FIELD__index = new long[]{980, 1132};

	/**
	 * Field descriptor (offset) for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> current deformation group, note: index starts at 1 </p>
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
	public static final long[] __DNA__FIELD__actdef = new long[]{982, 1134};

	/**
	 * Field descriptor (offset) for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object color<h4>Blender Source Code:</h4>
	 * <p> object color </p>
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
	public static final long[] __DNA__FIELD__col = new long[]{984, 1136};

	/**
	 * Field descriptor (offset) for struct member 'gameflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	OB_DYNAMIC               = 1 << 0,
	 * 	OB_CHILD                 = 1 << 1,
	 * 	OB_ACTOR                 = 1 << 2,
	 * 	OB_INERTIA_LOCK_X        = 1 << 3,
	 * 	OB_INERTIA_LOCK_Y        = 1 << 4,
	 * 	OB_INERTIA_LOCK_Z        = 1 << 5,
	 * 	OB_DO_FH                 = 1 << 6,
	 * 	OB_ROT_FH                = 1 << 7,
	 * 	OB_ANISOTROPIC_FRICTION  = 1 << 8,
	 * 	OB_GHOST                 = 1 << 9,
	 * 	OB_RIGID_BODY            = 1 << 10,
	 * 	OB_BOUNDS                = 1 << 11,
	 * 
	 * 	OB_COLLISION_RESPONSE    = 1 << 12,
	 * 	OB_SECTOR                = 1 << 13,
	 * 	OB_PROP                  = 1 << 14,
	 * 	OB_MAINACTOR             = 1 << 15,
	 * 
	 * 	OB_COLLISION             = 1 << 16,
	 * 	OB_SOFT_BODY             = 1 << 17,
	 * 	OB_OCCLUDER              = 1 << 18,
	 * 	OB_SENSOR                = 1 << 19,
	 * 	OB_NAVMESH               = 1 << 20,
	 * 	OB_HASOBSTACLE           = 1 << 21,
	 * 	OB_CHARACTER             = 1 << 22,
	 * 
	 * 	OB_RECORD_ANIMATION      = 1 << 23,
	 * 				
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__gameflag);
	 * CPointer&lt;Integer&gt; p_gameflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gameflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gameflag = new long[]{1000, 1152};

	/**
	 * Field descriptor (offset) for struct member 'gameflag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__gameflag2);
	 * CPointer&lt;Integer&gt; p_gameflag2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gameflag2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gameflag2 = new long[]{1004, 1156};

	/**
	 * Field descriptor (offset) for struct member 'bsoft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for game engine bullet soft body<h4>Blender Source Code:</h4>
	 * <p> settings for game engine bullet soft body </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__bsoft);
	 * CPointer&lt;CPointer&lt;BulletSoftBody&gt;&gt; p_bsoft = p.cast(new Class[]{CPointer.class, BulletSoftBody.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bsoft'</li>
	 * <li>Signature: 'BulletSoftBody*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bsoft = new long[]{1008, 1160};

	/**
	 * Field descriptor (offset) for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> for restricting view, select, render etc. accessible in outliner </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__restrictflag);
	 * CPointer&lt;Byte&gt; p_restrictflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'restrictflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__restrictflag = new long[]{1012, 1168};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dependency flag<h4>Blender Source Code:</h4>
	 * <p> dependency flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__recalc);
	 * CPointer&lt;Byte&gt; p_recalc = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{1013, 1169};

	/**
	 * Field descriptor (offset) for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
	 * <p> softbody settings </p>
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
	public static final long[] __DNA__FIELD__softflag = new long[]{1014, 1170};

	/**
	 * Field descriptor (offset) for struct member 'anisotropicFriction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__anisotropicFriction);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_anisotropicFriction = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anisotropicFriction'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anisotropicFriction = new long[]{1016, 1172};

	/**
	 * Field descriptor (offset) for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
	 * <p> object constraints </p>
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
	public static final long[] __DNA__FIELD__constraints = new long[]{1028, 1184};

	/**
	 * Field descriptor (offset) for struct member 'nlastrips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated
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
	public static final long[] __DNA__FIELD__nlastrips = new long[]{1036, 1200};

	/**
	 * Field descriptor (offset) for struct member 'hooks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated
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
	public static final long[] __DNA__FIELD__hooks = new long[]{1044, 1216};

	/**
	 * Field descriptor (offset) for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle systems<h4>Blender Source Code:</h4>
	 * <p> particle systems </p>
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
	public static final long[] __DNA__FIELD__particlesystem = new long[]{1052, 1232};

	/**
	 * Field descriptor (offset) for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle deflector/attractor/collision data<h4>Blender Source Code:</h4>
	 * <p> particle deflector/attractor/collision data </p>
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
	public static final long[] __DNA__FIELD__pd = new long[]{1060, 1248};

	/**
	 * Field descriptor (offset) for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
	 * <p> if exists, saved in file </p>
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
	public static final long[] __DNA__FIELD__soft = new long[]{1064, 1256};

	/**
	 * Field descriptor (offset) for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object duplicator for group<h4>Blender Source Code:</h4>
	 * <p> object duplicator for group </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__dup_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_dup_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dup_group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dup_group = new long[]{1068, 1264};

	/**
	 * Field descriptor (offset) for struct member 'body_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for now used to temporarily holds the type of collision object.
	 * 				<pre>
	 * 	OB_BODY_TYPE_NO_COLLISION   = 0,
	 * 	OB_BODY_TYPE_STATIC         = 1,
	 * 	OB_BODY_TYPE_DYNAMIC        = 2,
	 * 	OB_BODY_TYPE_RIGID          = 3,
	 * 	OB_BODY_TYPE_SOFT           = 4,
	 * 	OB_BODY_TYPE_OCCLUDER       = 5,
	 * 	OB_BODY_TYPE_SENSOR         = 6,
	 * 	OB_BODY_TYPE_NAVMESH        = 7,
	 * 	OB_BODY_TYPE_CHARACTER      = 8,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> for now used to temporarily holds the type of collision object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__body_type);
	 * CPointer&lt;Byte&gt; p_body_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'body_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__body_type = new long[]{1072, 1272};

	/**
	 * Field descriptor (offset) for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
	 * <p> flag for pinning </p>
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
	public static final long[] __DNA__FIELD__shapeflag = new long[]{1073, 1273};

	/**
	 * Field descriptor (offset) for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
	 * <p> current shape key for menu or pinned </p>
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
	public static final long[] __DNA__FIELD__shapenr = new long[]{1074, 1274};

	/**
	 * Field descriptor (offset) for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * smoothresh is phong interpolation ray_shadow correction in render<h4>Blender Source Code:</h4>
	 * <p> smoothresh is phong interpolation ray_shadow correction in render </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__smoothresh);
	 * CPointer&lt;Float&gt; p_smoothresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smoothresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smoothresh = new long[]{1076, 1276};

	/**
	 * Field descriptor (offset) for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> if fluidsim enabled, store additional settings </p>
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
	public static final long[] __DNA__FIELD__fluidsimSettings = new long[]{1080, 1280};

	/**
	 * Field descriptor (offset) for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime valuated curve-specific data, not stored in the file<h4>Blender Source Code:</h4>
	 * <p> Runtime valuated curve-specific data, not stored in the file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__curve_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_curve_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_cache'</li>
	 * <li>Signature: 'CurveCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_cache = new long[]{1084, 1288};

	/**
	 * Field descriptor (offset) for struct member 'derivedDeform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__derivedDeform);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_derivedDeform = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'derivedDeform'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__derivedDeform = new long[]{1088, 1296};

	/**
	 * Field descriptor (offset) for struct member 'derivedFinal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__derivedFinal);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_derivedFinal = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'derivedFinal'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__derivedFinal = new long[]{1092, 1304};

	/**
	 * Field descriptor (offset) for struct member 'lastDataMask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * the custom data layer mask that was last used to calculate derivedDeform and derivedFinal
	 * 				<h3>Values:</h3>
	 * 				<pre>
	 * 	// Bits for CustomDataMask 
	 * 	CD_MASK_MVERT		(1 << CD_MVERT)
	 * 	CD_MASK_MDEFORMVERT	(1 << CD_MDEFORMVERT)
	 * 	CD_MASK_MEDGE		(1 << CD_MEDGE)
	 * 	CD_MASK_MFACE		(1 << CD_MFACE)
	 * 	CD_MASK_MTFACE		(1 << CD_MTFACE)
	 * 	CD_MASK_MCOL		(1 << CD_MCOL)
	 * 	CD_MASK_ORIGINDEX	(1 << CD_ORIGINDEX)
	 * 	CD_MASK_NORMAL		(1 << CD_NORMAL)
	 * 	CD_MASK_PROP_FLT	(1 << CD_PROP_FLT)
	 * 	CD_MASK_PROP_INT	(1 << CD_PROP_INT)
	 * 	CD_MASK_PROP_STR	(1 << CD_PROP_STR)
	 * 	CD_MASK_ORIGSPACE	(1 << CD_ORIGSPACE)
	 * 	CD_MASK_ORCO		(1 << CD_ORCO)
	 * 	CD_MASK_MTEXPOLY	(1 << CD_MTEXPOLY)
	 * 	CD_MASK_MLOOPUV		(1 << CD_MLOOPUV)
	 * 	CD_MASK_MLOOPCOL	(1 << CD_MLOOPCOL)
	 * 	CD_MASK_TANGENT		(1 << CD_TANGENT)
	 * 	CD_MASK_MDISPS		(1 << CD_MDISPS)
	 * 	CD_MASK_PREVIEW_MCOL	(1 << CD_PREVIEW_MCOL)
	 * 	CD_MASK_CLOTH_ORCO	(1 << CD_CLOTH_ORCO)
	 * 	CD_MASK_RECAST		(1 << CD_RECAST)
	 * 	
	 * 	// BMESH ONLY START
	 * 	CD_MASK_MPOLY		(1 << CD_MPOLY)
	 * 	CD_MASK_MLOOP		(1 << CD_MLOOP)
	 * 	CD_MASK_SHAPE_KEYINDEX	(1 << CD_SHAPE_KEYINDEX)
	 * 	CD_MASK_SHAPEKEY	(1 << CD_SHAPEKEY)
	 * 	CD_MASK_BWEIGHT		(1 << CD_BWEIGHT)
	 * 	CD_MASK_CREASE		(1 << CD_CREASE)
	 * 	CD_MASK_ORIGSPACE_MLOOP	(1LL << CD_ORIGSPACE_MLOOP)
	 * 	CD_MASK_PREVIEW_MLOOPCOL (1LL << CD_PREVIEW_MLOOPCOL)
	 * 	CD_MASK_BM_ELEM_PYPTR (1LL << CD_BM_ELEM_PYPTR)
	 * 	// BMESH ONLY END
	 * 	
	 * 	CD_MASK_PAINT_MASK		(1LL << CD_PAINT_MASK)
	 * 	CD_MASK_GRID_PAINT_MASK	(1LL << CD_GRID_PAINT_MASK)
	 * 	CD_MASK_MVERT_SKIN		(1LL << CD_MVERT_SKIN)
	 * 	CD_MASK_FREESTYLE_EDGE	(1LL << CD_FREESTYLE_EDGE)
	 * 	CD_MASK_FREESTYLE_FACE	(1LL << CD_FREESTYLE_FACE)
	 * 	CD_MASK_MLOOPTANGENT    (1LL << CD_MLOOPTANGENT)
	 * 	CD_MASK_TESSLOOPNORMAL  (1LL << CD_TESSLOOPNORMAL)
	 * 	CD_MASK_CUSTOMLOOPNORMAL (1LL << CD_CUSTOMLOOPNORMAL)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> the custom data layer mask that was last used to calculate derivedDeform and derivedFinal </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lastDataMask);
	 * CPointer&lt;int64&gt; p_lastDataMask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastDataMask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastDataMask = new long[]{1096, 1312};

	/**
	 * Field descriptor (offset) for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph. <b>See Also:</n> {@link #getLastDataMask()}<h4>Blender Source Code:</h4>
	 * <p> (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__customdata_mask);
	 * CPointer&lt;int64&gt; p_customdata_mask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata_mask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata_mask = new long[]{1104, 1320};

	/**
	 * Field descriptor (offset) for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of game controllers that are active<h4>Blender Source Code:</h4>
	 * <p> bit masks of game controllers that are active </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__state);
	 * CPointer&lt;Integer&gt; p_state = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'state'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__state = new long[]{1112, 1328};

	/**
	 * Field descriptor (offset) for struct member 'init_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of initial state as recorded by the users<h4>Blender Source Code:</h4>
	 * <p> bit masks of initial state as recorded by the users </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__init_state);
	 * CPointer&lt;Integer&gt; p_init_state = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init_state'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init_state = new long[]{1116, 1332};

	/**
	 * Field descriptor (offset) for struct member 'gpulamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * runtime, for glsl lamp display only<h4>Blender Source Code:</h4>
	 * <p> runtime, for glsl lamp display only </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__gpulamp);
	 * CPointer&lt;ListBase&gt; p_gpulamp = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpulamp'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpulamp = new long[]{1120, 1336};

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
	public static final long[] __DNA__FIELD__pc_ids = new long[]{1128, 1352};

	/**
	 * Field descriptor (offset) for struct member 'duplilist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for temporary dupli list storage, only for use by RNA API<h4>Blender Source Code:</h4>
	 * <p> for temporary dupli list storage, only for use by RNA API </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__duplilist);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_duplilist = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'duplilist'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__duplilist = new long[]{1136, 1368};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet rigid body </p>
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
	public static final long[] __DNA__FIELD__rigidbody_object = new long[]{1140, 1376};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet constraint </p>
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
	public static final long[] __DNA__FIELD__rigidbody_constraint = new long[]{1144, 1384};

	/**
	 * Field descriptor (offset) for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
	 * <p> offset for image empties </p>
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
	public static final long[] __DNA__FIELD__ima_ofs = new long[]{1148, 1392};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> must be non-null when oject is an empty image </p>
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
	public static final long[] __DNA__FIELD__iuser = new long[]{1156, 1400};

	/**
	 * Field descriptor (offset) for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> contains data for levels of detail </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__lodlevels);
	 * CPointer&lt;ListBase&gt; p_lodlevels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lodlevels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lodlevels = new long[]{1160, 1408};

	/**
	 * Field descriptor (offset) for struct member 'currentlod'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__currentlod);
	 * CPointer&lt;CPointer&lt;LodLevel&gt;&gt; p_currentlod = p.cast(new Class[]{CPointer.class, LodLevel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'currentlod'</li>
	 * <li>Signature: 'LodLevel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__currentlod = new long[]{1168, 1424};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
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
	public static final long[] __DNA__FIELD__preview = new long[]{1172, 1432};

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
	 * <h4>Java .Blend:</h4>
	 * animation data<h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * animation data<h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
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
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Type of Object
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Type of Object
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, type);
		} else {
			__io__block.writeShort(__io__address + 108, type);
		}
	}

	/**
	 * Get method for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'partype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			__io__block.writeShort(__io__address + 138, partype);
		} else {
			__io__block.writeShort(__io__address + 110, partype);
		}
	}

	/**
	 * Get method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par1
	 */
	
	public int getPar1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par1
	 */
	
	public void setPar1(int par1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, par1);
		} else {
			__io__block.writeInt(__io__address + 112, par1);
		}
	}

	/**
	 * Get method for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par2
	 */
	
	public int getPar2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'par2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par2
	 */
	
	public void setPar2(int par2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, par2);
		} else {
			__io__block.writeInt(__io__address + 116, par2);
		}
	}

	/**
	 * Get method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
	 * <p> can be vertexnrs </p>
	 * @see #__DNA__FIELD__par3
	 */
	
	public int getPar3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
	 * <p> can be vertexnrs </p>
	 * @see #__DNA__FIELD__par3
	 */
	
	public void setPar3(int par3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, par3);
		} else {
			__io__block.writeInt(__io__address + 120, par3);
		}
	}

	/**
	 * Get method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2 </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public CArrayFacade<Byte> getParsubstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2 </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public void setParsubstr(CArrayFacade<Byte> parsubstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 124;
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
	 * <h4>Blender Python API:</h4>
	 * Parent Object
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<BlenderObject> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Parent Object
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<BlenderObject> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
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
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library object this proxy object controls<h4>Blender Source Code:</h4>
	 * <p> if ob->proxy (or proxy_group), this object is proxy for object ob->proxy proxy_from is set in target back to the proxy. </p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public CPointer<BlenderObject> getProxy() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library object this proxy object controls<h4>Blender Source Code:</h4>
	 * <p> if ob->proxy (or proxy_group), this object is proxy for object ob->proxy proxy_from is set in target back to the proxy. </p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public void setProxy(CPointer<BlenderObject> proxy) throws IOException
	{
		long __address = ((proxy == null) ? 0 : proxy.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library group duplicator object this proxy object controls
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public CPointer<BlenderObject> getProxy_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy<h4>Blender Python API:</h4>
	 * (read-only)    Library group duplicator object this proxy object controls
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public void setProxy_group(CPointer<BlenderObject> proxy_group) throws IOException
	{
		long __address = ((proxy_group == null) ? 0 : proxy_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * proxy_from is set in target back to the proxy.
	 * @see #__DNA__FIELD__proxy_from
	 */
	
	public CPointer<BlenderObject> getProxy_from() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * proxy_from is set in target back to the proxy.
	 * @see #__DNA__FIELD__proxy_from
	 */
	
	public void setProxy_from(CPointer<BlenderObject> proxy_from) throws IOException
	{
		long __address = ((proxy_from == null) ? 0 : proxy_from.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Bounding box of the associated mesh/curve/etc. Cache value not stored in file.<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; axis aligned boundbox (in localspace) </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Bounding box of the associated mesh/curve/etc. Cache value not stored in file.<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; axis aligned boundbox (in localspace) </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated
	 * @see #__DNA__FIELD__action
	 */
	
	public CPointer<bAction> getAction() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CPointer<bAction> action) throws IOException
	{
		long __address = ((action == null) ? 0 : action.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 220);
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
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 220, __address);
		}
	}

	/**
	 * Get method for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pose data, armature objects only<h4>Blender Python API:</h4>
	 * (read-only)    Current pose for armatures<h4>Blender Source Code:</h4>
	 * <p> pose data, armature objects only </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public CPointer<bPose> getPose() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPose.class};
		return new CPointer<bPose>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPose.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pose data, armature objects only<h4>Blender Python API:</h4>
	 * (read-only)    Current pose for armatures<h4>Blender Source Code:</h4>
	 * <p> pose data, armature objects only </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public void setPose(CPointer<bPose> pose) throws IOException
	{
		long __address = ((pose == null) ? 0 : pose.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 224, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pointer to objects data - an 'ID' or NULL<h4>Blender Python API:</h4>
	 * Object data<h4>Blender Source Code:</h4>
	 * <p> pointer to objects data - an '{@link ID} ' or NULL </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pointer to objects data - an 'ID' or NULL<h4>Blender Python API:</h4>
	 * Object data<h4>Blender Source Code:</h4>
	 * <p> pointer to objects data - an '{@link ID} ' or NULL </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 228, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 232, __address);
		}
	}

	/**
	 * Get method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
	 * <p> settings for visualization of object-transform animation </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public bAnimVizSettings getAvs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bAnimVizSettings(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new bAnimVizSettings(__io__address + 236, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
	 * <p> settings for visualization of object-transform animation </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public void setAvs(bAnimVizSettings avs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 236;
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
	 * <h4>Java .Blend:</h4>
	 * motion path cache for this object<h4>Blender Source Code:</h4>
	 * <p> motion path cache for this object </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public CPointer<bMotionPath> getMpath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bMotionPath.class};
		return new CPointer<bMotionPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bMotionPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * motion path cache for this object<h4>Blender Source Code:</h4>
	 * <p> motion path cache for this object </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public void setMpath(CPointer<bMotionPath> mpath) throws IOException
	{
		long __address = ((mpath == null) ? 0 : mpath.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Get method for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system.<br/>@depricated
	 * @see #__DNA__FIELD__constraintChannels
	 */
	
	public ListBase getConstraintChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 368, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraintChannels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system.<br/>@depricated
	 * @see #__DNA__FIELD__constraintChannels
	 */
	
	public void setConstraintChannels(ListBase constraintChannels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 368;
		} else {
			__dna__offset = 288;
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
	 * <h4>Java .Blend:</h4>
	 * <br/>@depricated
	 * @see #__DNA__FIELD__effect
	 */
	
	public ListBase getEffect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <br/>@depricated
	 * @see #__DNA__FIELD__effect
	 */
	
	public void setEffect(ListBase effect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 296;
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
	 * <h4>Java .Blend:</h4>
	 * list of bDeformGroup (vertex groups) names and flag only<h4>Blender Source Code:</h4>
	 * <p> list of {@link bDeformGroup}  (vertex groups) names and flag only </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public ListBase getDefbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 400, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 304, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of bDeformGroup (vertex groups) names and flag only<h4>Blender Source Code:</h4>
	 * <p> list of {@link bDeformGroup}  (vertex groups) names and flag only </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public void setDefbase(ListBase defbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 304;
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
	 * <h4>Java .Blend:</h4>
	 * list of ModifierData structures<h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object<h4>Blender Source Code:</h4>
	 * <p> list of {@link ModifierData}  structures </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 416, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 312, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of ModifierData structures<h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object<h4>Blender Source Code:</h4>
	 * <p> list of {@link ModifierData}  structures </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 416;
		} else {
			__dna__offset = 312;
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
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Object interaction mode<h4>Blender Source Code:</h4>
	 * <p> Local object mode </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 432);
		} else {
			return __io__block.readInt(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    Object interaction mode<h4>Blender Source Code:</h4>
	 * <p> Local object mode </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 432, mode);
		} else {
			__io__block.writeInt(__io__address + 320, mode);
		}
	}

	/**
	 * Get method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Keep track of what mode to return to after toggling a mode<h4>Blender Source Code:</h4>
	 * <p> Keep track of what mode to return to after toggling a mode </p>
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public int getRestore_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 436);
		} else {
			return __io__block.readInt(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Keep track of what mode to return to after toggling a mode<h4>Blender Source Code:</h4>
	 * <p> Keep track of what mode to return to after toggling a mode </p>
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public void setRestore_mode(int restore_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 436, restore_mode);
		} else {
			__io__block.writeInt(__io__address + 324, restore_mode);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
	 * <p> materials material slots </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 440);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
	 * <p> materials material slots </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 440, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
	 * <p> a boolean field, with each byte 1 if corresponding material is linked to object </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public CPointer<Byte> getMatbits() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 448);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
	 * <p> a boolean field, with each byte 1 if corresponding material is linked to object </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public void setMatbits(CPointer<Byte> matbits) throws IOException
	{
		long __address = ((matbits == null) ? 0 : matbits.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 448, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
	 * <p> copy of mesh, curve & meta struct member of same name (keep in sync) </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public int getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 456);
		} else {
			return __io__block.readInt(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
	 * <p> copy of mesh, curve & meta struct member of same name (keep in sync) </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(int totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 456, totcol);
		} else {
			__io__block.writeInt(__io__address + 336, totcol);
		}
	}

	/**
	 * Get method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
	 * <p> currently selected material in the UI </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public int getActcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
	 * <p> currently selected material in the UI </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public void setActcol(int actcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, actcol);
		} else {
			__io__block.writeInt(__io__address + 340, actcol);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * location of the object<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * location of the object<h4>Blender Source Code:</h4>
	 * <p> rot en drot have to be together! (transform('r' en 's')) </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 344;
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
			return new CArrayFacade<Float>(__io__address + 476, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 476;
		} else {
			__dna__offset = 356;
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
	 * Get method for struct member 'orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * origin of the object
	 * @see #__DNA__FIELD__orig
	 */
	
	public CArrayFacade<Float> getOrig() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * origin of the object
	 * @see #__DNA__FIELD__orig
	 */
	
	public void setOrig(CArrayFacade<Float> orig) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 488;
		} else {
			__dna__offset = 368;
		}
		if (__io__equals(orig, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, orig)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, orig);
		} else {
			__io__generic__copy( getOrig(), orig);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * size/scale of the object<h4>Blender Source Code:</h4>
	 * <p> scale in fact </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 500, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * size/scale of the object<h4>Blender Source Code:</h4>
	 * <p> scale in fact </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 500;
		} else {
			__dna__offset = 380;
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
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> DEPRECATED, 2.60 and older only </p>
	 * @deprecated
	 *  DeprecatedDEPRECATED, 2.60 and older only </p>
	 * @see #__DNA__FIELD__dsize
	 */
	
	public CArrayFacade<Float> getDsize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 512, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> DEPRECATED, 2.60 and older only </p>
	 * @deprecated
	 *  DeprecatedDEPRECATED, 2.60 and older only </p>
	 * @see #__DNA__FIELD__dsize
	 */
	
	public void setDsize(CArrayFacade<Float> dsize) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 512;
		} else {
			__dna__offset = 392;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> ack!, changing </p>
	 * @see #__DNA__FIELD__dscale
	 */
	
	public CArrayFacade<Float> getDscale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 524, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ack!, changing </p>
	 * @see #__DNA__FIELD__dscale
	 */
	
	public void setDscale(CArrayFacade<Float> dscale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 524;
		} else {
			__dna__offset = 404;
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
	 * <h4>Java .Blend:</h4>
	 * euler rotation
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 536, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 536;
		} else {
			__dna__offset = 416;
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
	 * <h4>Java .Blend:</h4>
	 * euler rotation<h4>Blender Source Code:</h4>
	 * <p> euler rotation </p>
	 * @see #__DNA__FIELD__drot
	 */
	
	public CArrayFacade<Float> getDrot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 548, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 428, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation<h4>Blender Source Code:</h4>
	 * <p> euler rotation </p>
	 * @see #__DNA__FIELD__drot
	 */
	
	public void setDrot(CArrayFacade<Float> drot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 548;
		} else {
			__dna__offset = 428;
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
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation
	 * @see #__DNA__FIELD__quat
	 */
	
	public CArrayFacade<Float> getQuat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 560;
		} else {
			__dna__offset = 440;
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
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation<h4>Blender Source Code:</h4>
	 * <p> quaternion rotation </p>
	 * @see #__DNA__FIELD__dquat
	 */
	
	public CArrayFacade<Float> getDquat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 576, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation<h4>Blender Source Code:</h4>
	 * <p> quaternion rotation </p>
	 * @see #__DNA__FIELD__dquat
	 */
	
	public void setDquat(CArrayFacade<Float> dquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 576;
		} else {
			__dna__offset = 456;
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
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public CArrayFacade<Float> getRotAxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 592, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 472, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public void setRotAxis(CArrayFacade<Float> rotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 592;
		} else {
			__dna__offset = 472;
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
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - axis part </p>
	 * @see #__DNA__FIELD__drotAxis
	 */
	
	public CArrayFacade<Float> getDrotAxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 604, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 484, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - axis part </p>
	 * @see #__DNA__FIELD__drotAxis
	 */
	
	public void setDrotAxis(CArrayFacade<Float> drotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 604;
		} else {
			__dna__offset = 484;
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
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public float getRotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 616);
		} else {
			return __io__block.readFloat(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public void setRotAngle(float rotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 616, rotAngle);
		} else {
			__io__block.writeFloat(__io__address + 496, rotAngle);
		}
	}

	/**
	 * Get method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - angle part </p>
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public float getDrotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 620);
		} else {
			return __io__block.readFloat(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
	 * <p> axis angle rotation - angle part </p>
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public void setDrotAngle(float drotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 620, drotAngle);
		} else {
			__io__block.writeFloat(__io__address + 500, drotAngle);
		}
	}

	/**
	 * Get method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> final worldspace matrix with constraints & animsys applied </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 624, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 504, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> final worldspace matrix with constraints & animsys applied </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 624;
		} else {
			__dna__offset = 504;
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
	 * Get method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent<h4>Blender Source Code:</h4>
	 * <p> inverse result of parent, so that object doesn't 'stick' to parent </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 688, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 568, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent<h4>Blender Source Code:</h4>
	 * <p> inverse result of parent, so that object doesn't 'stick' to parent </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public void setParentinv(CArrayFacade<CArrayFacade<Float>> parentinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 688;
		} else {
			__dna__offset = 568;
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
	 * <h4>Java .Blend:</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform<h4>Blender Source Code:</h4>
	 * <p> inverse result of constraints. doesn't include effect of parent or object local transform </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 752, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform<h4>Blender Source Code:</h4>
	 * <p> inverse result of constraints. doesn't include effect of parent or object local transform </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public void setConstinv(CArrayFacade<CArrayFacade<Float>> constinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 752;
		} else {
			__dna__offset = 632;
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
	 * Get method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);<h4>Blender Source Code:</h4>
	 * <p> inverse matrix of 'obmat' for any other use than rendering! </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 816, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 696, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);<h4>Blender Source Code:</h4>
	 * <p> inverse matrix of 'obmat' for any other use than rendering! </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 816;
		} else {
			__dna__offset = 696;
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
	 * Get method for struct member 'imat_ren'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Cache of inverse object-view matrix calculated at runtime. Previously 'imat' was used at render time, but as other places use it too
	 * 	 							the interactive ui of 2.5 creates problems. So now only 'imat_ren' should
	 * 								be used when ever the inverse of ob->obmat * re->viewmat is needed!<h4>Blender Source Code:</h4>
	 * <p> note: this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
	 * @see #__DNA__FIELD__imat_ren
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getImat_ren() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 880, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 760, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat_ren'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Cache of inverse object-view matrix calculated at runtime. Previously 'imat' was used at render time, but as other places use it too
	 * 	 							the interactive ui of 2.5 creates problems. So now only 'imat_ren' should
	 * 								be used when ever the inverse of ob->obmat * re->viewmat is needed!<h4>Blender Source Code:</h4>
	 * <p> note: this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
	 * @see #__DNA__FIELD__imat_ren
	 */
	
	public void setImat_ren(CArrayFacade<CArrayFacade<Float>> imat_ren) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 880;
		} else {
			__dna__offset = 760;
		}
		if (__io__equals(imat_ren, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imat_ren)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imat_ren);
		} else {
			__io__generic__copy( getImat_ren(), imat_ren);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of Base's layer in the scene<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base} 's layer in the scene </p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 944);
		} else {
			return __io__block.readInt(__io__address + 824);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of Base's layer in the scene<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base} 's layer in the scene </p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 944, lay);
		} else {
			__io__block.writeInt(__io__address + 824, lay);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base}  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 948);
		} else {
			return __io__block.readShort(__io__address + 828);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
	 * <p> copy of {@link Base}  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 948, flag);
		} else {
			__io__block.writeShort(__io__address + 828, flag);
		}
	}

	/**
	 * Get method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use 'matbits' </p>
	 * @deprecated
	 *  Deprecateddeprecated, use 'matbits' </p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public short getColbits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 950);
		} else {
			return __io__block.readShort(__io__address + 830);
		}
	}

	/**
	 * Set method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p><p> deprecated, use 'matbits' </p>
	 * @deprecated
	 *  Deprecateddeprecated, use 'matbits' </p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public void setColbits(short colbits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 950, colbits);
		} else {
			__io__block.writeShort(__io__address + 830, colbits);
		}
	}

	/**
	 * Get method for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * @see #__DNA__FIELD__transflag
	 */
	
	public short getTransflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 952);
		} else {
			return __io__block.readShort(__io__address + 832);
		}
	}

	/**
	 * Set method for struct member 'transflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * @see #__DNA__FIELD__transflag
	 */
	
	public void setTransflag(short transflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 952, transflag);
		} else {
			__io__block.writeShort(__io__address + 832, transflag);
		}
	}

	/**
	 * Get method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> transformation settings and transform locks </p>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public short getProtectflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 954);
		} else {
			return __io__block.readShort(__io__address + 834);
		}
	}

	/**
	 * Set method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> transformation settings and transform locks </p>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public void setProtectflag(short protectflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 954, protectflag);
		} else {
			__io__block.writeShort(__io__address + 834, protectflag);
		}
	}

	/**
	 * Get method for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			return __io__block.readShort(__io__address + 956);
		} else {
			return __io__block.readShort(__io__address + 836);
		}
	}

	/**
	 * Set method for struct member 'trackflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			__io__block.writeShort(__io__address + 956, trackflag);
		} else {
			__io__block.writeShort(__io__address + 836, trackflag);
		}
	}

	/**
	 * Get method for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			return __io__block.readShort(__io__address + 958);
		} else {
			return __io__block.readShort(__io__address + 838);
		}
	}

	/**
	 * Set method for struct member 'upflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			__io__block.writeShort(__io__address + 958, upflag);
		} else {
			__io__block.writeShort(__io__address + 838, upflag);
		}
	}

	/**
	 * Get method for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> used for DopeSheet filtering settings (expanded/collapsed) </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public short getNlaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 960);
		} else {
			return __io__block.readShort(__io__address + 840);
		}
	}

	/**
	 * Set method for struct member 'nlaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> used for DopeSheet filtering settings (expanded/collapsed) </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public void setNlaflag(short nlaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 960, nlaflag);
		} else {
			__io__block.writeShort(__io__address + 840, nlaflag);
		}
	}

	/**
	 * Get method for struct member 'scaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * ui state for game logic<h4>Blender Source Code:</h4>
	 * <p> ui state for game logic </p>
	 * @see #__DNA__FIELD__scaflag
	 */
	
	public short getScaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 962);
		} else {
			return __io__block.readShort(__io__address + 842);
		}
	}

	/**
	 * Set method for struct member 'scaflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * ui state for game logic<h4>Blender Source Code:</h4>
	 * <p> ui state for game logic </p>
	 * @see #__DNA__FIELD__scaflag
	 */
	
	public void setScaflag(short scaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 962, scaflag);
		} else {
			__io__block.writeShort(__io__address + 842, scaflag);
		}
	}

	/**
	 * Get method for struct member 'scavisflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * more display settings for game logic<h4>Blender Source Code:</h4>
	 * <p> more display settings for game logic </p>
	 * @see #__DNA__FIELD__scavisflag
	 */
	
	public byte getScavisflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 964);
		} else {
			return __io__block.readByte(__io__address + 844);
		}
	}

	/**
	 * Set method for struct member 'scavisflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * more display settings for game logic<h4>Blender Source Code:</h4>
	 * <p> more display settings for game logic </p>
	 * @see #__DNA__FIELD__scavisflag
	 */
	
	public void setScavisflag(byte scavisflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 964, scavisflag);
		} else {
			__io__block.writeByte(__io__address + 844, scavisflag);
		}
	}

	/**
	 * Get method for struct member 'depsflag'.
	 * @see #__DNA__FIELD__depsflag
	 */
	
	public byte getDepsflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 965);
		} else {
			return __io__block.readByte(__io__address + 845);
		}
	}

	/**
	 * Set method for struct member 'depsflag'.
	 * @see #__DNA__FIELD__depsflag
	 */
	
	public void setDepsflag(byte depsflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 965, depsflag);
		} else {
			__io__block.writeByte(__io__address + 845, depsflag);
		}
	}

	/**
	 * Get method for struct member 'lastNeedMapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime cache info related to derived mesh. Gets initialised on demand.<h4>Blender Source Code:</h4>
	 * <p> did last modifier stack generation need mapping support? bool </p>
	 * @see #__DNA__FIELD__lastNeedMapping
	 */
	
	public byte getLastNeedMapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 966);
		} else {
			return __io__block.readByte(__io__address + 846);
		}
	}

	/**
	 * Set method for struct member 'lastNeedMapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime cache info related to derived mesh. Gets initialised on demand.<h4>Blender Source Code:</h4>
	 * <p> did last modifier stack generation need mapping support? bool </p>
	 * @see #__DNA__FIELD__lastNeedMapping
	 */
	
	public void setLastNeedMapping(byte lastNeedMapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 966, lastNeedMapping);
		} else {
			__io__block.writeByte(__io__address + 846, lastNeedMapping);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * padding. Ignore it.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 967);
		} else {
			return __io__block.readByte(__io__address + 847);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * padding. Ignore it.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 967, pad);
		} else {
			__io__block.writeByte(__io__address + 847, pad);
		}
	}

	/**
	 * Get method for struct member 'dupon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dupli-frame settings </p>
	 * @see #__DNA__FIELD__dupon
	 */
	
	public int getDupon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 968);
		} else {
			return __io__block.readInt(__io__address + 848);
		}
	}

	/**
	 * Set method for struct member 'dupon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dupli-frame settings </p>
	 * @see #__DNA__FIELD__dupon
	 */
	
	public void setDupon(int dupon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 968, dupon);
		} else {
			__io__block.writeInt(__io__address + 848, dupon);
		}
	}

	/**
	 * Get method for struct member 'dupoff'.
	 * @see #__DNA__FIELD__dupoff
	 */
	
	public int getDupoff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 972);
		} else {
			return __io__block.readInt(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'dupoff'.
	 * @see #__DNA__FIELD__dupoff
	 */
	
	public void setDupoff(int dupoff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 972, dupoff);
		} else {
			__io__block.writeInt(__io__address + 852, dupoff);
		}
	}

	/**
	 * Get method for struct member 'dupsta'.
	 * @see #__DNA__FIELD__dupsta
	 */
	
	public int getDupsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 976);
		} else {
			return __io__block.readInt(__io__address + 856);
		}
	}

	/**
	 * Set method for struct member 'dupsta'.
	 * @see #__DNA__FIELD__dupsta
	 */
	
	public void setDupsta(int dupsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 976, dupsta);
		} else {
			__io__block.writeInt(__io__address + 856, dupsta);
		}
	}

	/**
	 * Get method for struct member 'dupend'.
	 * @see #__DNA__FIELD__dupend
	 */
	
	public int getDupend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 980);
		} else {
			return __io__block.readInt(__io__address + 860);
		}
	}

	/**
	 * Set method for struct member 'dupend'.
	 * @see #__DNA__FIELD__dupend
	 */
	
	public void setDupend(int dupend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 980, dupend);
		} else {
			__io__block.writeInt(__io__address + 860, dupend);
		}
	}

	/**
	 * Get method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. <h4>Blender Source Code:</h4>
	 * <p> during realtime note that inertia is only called inertia for historical reasons and is not changed to avoid DNA surgery. It actually reflects the Size value in the GameButtons (= radius) </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public float getMass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 984);
		} else {
			return __io__block.readFloat(__io__address + 864);
		}
	}

	/**
	 * Set method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. <h4>Blender Source Code:</h4>
	 * <p> during realtime note that inertia is only called inertia for historical reasons and is not changed to avoid DNA surgery. It actually reflects the Size value in the GameButtons (= radius) </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public void setMass(float mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 984, mass);
		} else {
			__io__block.writeFloat(__io__address + 864, mass);
		}
	}

	/**
	 * Get method for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime.
	 * @see #__DNA__FIELD__damping
	 */
	
	public float getDamping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 988);
		} else {
			return __io__block.readFloat(__io__address + 868);
		}
	}

	/**
	 * Set method for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime.
	 * @see #__DNA__FIELD__damping
	 */
	
	public void setDamping(float damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 988, damping);
		} else {
			__io__block.writeFloat(__io__address + 868, damping);
		}
	}

	/**
	 * Get method for struct member 'inertia'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. note that inertia is only called inertia for historical reasons
	 * 	 				and is not changed to avoid DNA surgery. It actually reflects the 
	 * 	 				Size value in the GameButtons (= radius).
	 * @see #__DNA__FIELD__inertia
	 */
	
	public float getInertia() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 992);
		} else {
			return __io__block.readFloat(__io__address + 872);
		}
	}

	/**
	 * Set method for struct member 'inertia'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * during realtime. note that inertia is only called inertia for historical reasons
	 * 	 				and is not changed to avoid DNA surgery. It actually reflects the 
	 * 	 				Size value in the GameButtons (= radius).
	 * @see #__DNA__FIELD__inertia
	 */
	
	public void setInertia(float inertia) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 992, inertia);
		} else {
			__io__block.writeFloat(__io__address + 872, inertia);
		}
	}

	/**
	 * Get method for struct member 'formfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The form factor k is introduced to give the user more control
	 * 					and to fix incompatibility problems.
	 * 					For rotational symmetric objects, the inertia value can be
	 * 					expressed as: Theta = k * m * r^2
	 * 					where m = Mass, r = Radius
	 * 					For a Sphere, the form factor is by default = 0.4<h4>Blender Source Code:</h4>
	 * <p> The form factor k is introduced to give the user more control and to fix incompatibility problems. For rotational symmetric objects, the inertia value can be expressed as: Theta = k * m * r^2 where m = Mass, r = Radius For a Sphere, the form factor is by default = 0.4 </p>
	 * @see #__DNA__FIELD__formfactor
	 */
	
	public float getFormfactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 996);
		} else {
			return __io__block.readFloat(__io__address + 876);
		}
	}

	/**
	 * Set method for struct member 'formfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The form factor k is introduced to give the user more control
	 * 					and to fix incompatibility problems.
	 * 					For rotational symmetric objects, the inertia value can be
	 * 					expressed as: Theta = k * m * r^2
	 * 					where m = Mass, r = Radius
	 * 					For a Sphere, the form factor is by default = 0.4<h4>Blender Source Code:</h4>
	 * <p> The form factor k is introduced to give the user more control and to fix incompatibility problems. For rotational symmetric objects, the inertia value can be expressed as: Theta = k * m * r^2 where m = Mass, r = Radius For a Sphere, the form factor is by default = 0.4 </p>
	 * @see #__DNA__FIELD__formfactor
	 */
	
	public void setFormfactor(float formfactor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 996, formfactor);
		} else {
			__io__block.writeFloat(__io__address + 876, formfactor);
		}
	}

	/**
	 * Get method for struct member 'rdamping'.
	 * @see #__DNA__FIELD__rdamping
	 */
	
	public float getRdamping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1000);
		} else {
			return __io__block.readFloat(__io__address + 880);
		}
	}

	/**
	 * Set method for struct member 'rdamping'.
	 * @see #__DNA__FIELD__rdamping
	 */
	
	public void setRdamping(float rdamping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1000, rdamping);
		} else {
			__io__block.writeFloat(__io__address + 880, rdamping);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public float getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1004);
		} else {
			return __io__block.readFloat(__io__address + 884);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(float margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1004, margin);
		} else {
			__io__block.writeFloat(__io__address + 884, margin);
		}
	}

	/**
	 * Get method for struct member 'max_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the maximum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the maximum velocity 0.0 is disabled </p>
	 * @see #__DNA__FIELD__max_vel
	 */
	
	public float getMax_vel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1008);
		} else {
			return __io__block.readFloat(__io__address + 888);
		}
	}

	/**
	 * Set method for struct member 'max_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the maximum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the maximum velocity 0.0 is disabled </p>
	 * @see #__DNA__FIELD__max_vel
	 */
	
	public void setMax_vel(float max_vel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1008, max_vel);
		} else {
			__io__block.writeFloat(__io__address + 888, max_vel);
		}
	}

	/**
	 * Get method for struct member 'min_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the minimum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the minimum velocity 0.0 is disabled </p>
	 * @see #__DNA__FIELD__min_vel
	 */
	
	public float getMin_vel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1012);
		} else {
			return __io__block.readFloat(__io__address + 892);
		}
	}

	/**
	 * Set method for struct member 'min_vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * clamp the minimum velocity 0.0 is disabled<h4>Blender Source Code:</h4>
	 * <p> clamp the minimum velocity 0.0 is disabled </p>
	 * @see #__DNA__FIELD__min_vel
	 */
	
	public void setMin_vel(float min_vel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1012, min_vel);
		} else {
			__io__block.writeFloat(__io__address + 892, min_vel);
		}
	}

	/**
	 * Get method for struct member 'max_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the maximum angular velocity, 0.0 is disabled </p>
	 * @see #__DNA__FIELD__max_angvel
	 */
	
	public float getMax_angvel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1016);
		} else {
			return __io__block.readFloat(__io__address + 896);
		}
	}

	/**
	 * Set method for struct member 'max_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the maximum angular velocity, 0.0 is disabled </p>
	 * @see #__DNA__FIELD__max_angvel
	 */
	
	public void setMax_angvel(float max_angvel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1016, max_angvel);
		} else {
			__io__block.writeFloat(__io__address + 896, max_angvel);
		}
	}

	/**
	 * Get method for struct member 'min_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the minimum angular velocity, 0.0 is disabled </p>
	 * @see #__DNA__FIELD__min_angvel
	 */
	
	public float getMin_angvel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1020);
		} else {
			return __io__block.readFloat(__io__address + 900);
		}
	}

	/**
	 * Set method for struct member 'min_angvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clamp the minimum angular velocity, 0.0 is disabled </p>
	 * @see #__DNA__FIELD__min_angvel
	 */
	
	public void setMin_angvel(float min_angvel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1020, min_angvel);
		} else {
			__io__block.writeFloat(__io__address + 900, min_angvel);
		}
	}

	/**
	 * Get method for struct member 'obstacleRad'.
	 * @see #__DNA__FIELD__obstacleRad
	 */
	
	public float getObstacleRad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1024);
		} else {
			return __io__block.readFloat(__io__address + 904);
		}
	}

	/**
	 * Set method for struct member 'obstacleRad'.
	 * @see #__DNA__FIELD__obstacleRad
	 */
	
	public void setObstacleRad(float obstacleRad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1024, obstacleRad);
		} else {
			__io__block.writeFloat(__io__address + 904, obstacleRad);
		}
	}

	/**
	 * Get method for struct member 'step_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties<h4>Blender Source Code:</h4>
	 * <p> "Character" physics properties </p>
	 * @see #__DNA__FIELD__step_height
	 */
	
	public float getStep_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1028);
		} else {
			return __io__block.readFloat(__io__address + 908);
		}
	}

	/**
	 * Set method for struct member 'step_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties<h4>Blender Source Code:</h4>
	 * <p> "Character" physics properties </p>
	 * @see #__DNA__FIELD__step_height
	 */
	
	public void setStep_height(float step_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1028, step_height);
		} else {
			__io__block.writeFloat(__io__address + 908, step_height);
		}
	}

	/**
	 * Get method for struct member 'jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 10</em></p>
	 * @see #__DNA__FIELD__jump_speed
	 */
	
	public float getJump_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1032);
		} else {
			return __io__block.readFloat(__io__address + 912);
		}
	}

	/**
	 * Set method for struct member 'jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 10</em></p>
	 * @see #__DNA__FIELD__jump_speed
	 */
	
	public void setJump_speed(float jump_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1032, jump_speed);
		} else {
			__io__block.writeFloat(__io__address + 912, jump_speed);
		}
	}

	/**
	 * Get method for struct member 'fall_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 55</em></p>
	 * @see #__DNA__FIELD__fall_speed
	 */
	
	public float getFall_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1036);
		} else {
			return __io__block.readFloat(__io__address + 916);
		}
	}

	/**
	 * Set method for struct member 'fall_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * "Character" physics properties. <p><em>Default: 55</em></p>
	 * @see #__DNA__FIELD__fall_speed
	 */
	
	public void setFall_speed(float fall_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1036, fall_speed);
		} else {
			__io__block.writeFloat(__io__address + 916, fall_speed);
		}
	}

	/**
	 * Get method for struct member 'max_jumps'.
	 * @see #__DNA__FIELD__max_jumps
	 */
	
	public byte getMax_jumps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1040);
		} else {
			return __io__block.readByte(__io__address + 920);
		}
	}

	/**
	 * Set method for struct member 'max_jumps'.
	 * @see #__DNA__FIELD__max_jumps
	 */
	
	public void setMax_jumps(byte max_jumps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1040, max_jumps);
		} else {
			__io__block.writeByte(__io__address + 920, max_jumps);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public CArrayFacade<Byte> getPad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1041, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 921, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(CArrayFacade<Byte> pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1041;
		} else {
			__dna__offset = 921;
		}
		if (__io__equals(pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad2);
		} else {
			__io__generic__copy( getPad2(), pad2);
		}
	}

	/**
	 * Get method for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Collision mask settings<h4>Blender Source Code:</h4>
	 * <p> Collision mask settings </p>
	 * @see #__DNA__FIELD__col_group
	 */
	
	public short getCol_group() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1044);
		} else {
			return __io__block.readShort(__io__address + 924);
		}
	}

	/**
	 * Set method for struct member 'col_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Collision mask settings<h4>Blender Source Code:</h4>
	 * <p> Collision mask settings </p>
	 * @see #__DNA__FIELD__col_group
	 */
	
	public void setCol_group(short col_group) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1044, col_group);
		} else {
			__io__block.writeShort(__io__address + 924, col_group);
		}
	}

	/**
	 * Get method for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Collision mask settings
	 * @see #__DNA__FIELD__col_mask
	 */
	
	public short getCol_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1046);
		} else {
			return __io__block.readShort(__io__address + 926);
		}
	}

	/**
	 * Set method for struct member 'col_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Collision mask settings
	 * @see #__DNA__FIELD__col_mask
	 */
	
	public void setCol_mask(short col_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1046, col_mask);
		} else {
			__io__block.writeShort(__io__address + 926, col_mask);
		}
	}

	/**
	 * Get method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public short getRotmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1048);
		} else {
			return __io__block.readShort(__io__address + 928);
		}
	}

	/**
	 * Set method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public void setRotmode(short rotmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1048, rotmode);
		} else {
			__io__block.writeShort(__io__address + 928, rotmode);
		}
	}

	/**
	 * Get method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
	 * <p> bounding box use for drawing </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public byte getBoundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1050);
		} else {
			return __io__block.readByte(__io__address + 930);
		}
	}

	/**
	 * Set method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
	 * <p> bounding box use for drawing </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public void setBoundtype(byte boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1050, boundtype);
		} else {
			__io__block.writeByte(__io__address + 930, boundtype);
		}
	}

	/**
	 * Get method for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> bounding box type used for collision </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public byte getCollision_boundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1051);
		} else {
			return __io__block.readByte(__io__address + 931);
		}
	}

	/**
	 * Set method for struct member 'collision_boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box type used for collision.
	 * 				<pre>
	 * 					OB_BOUND_BOX           = 0,
	 * 					OB_BOUND_SPHERE        = 1,
	 * 					OB_BOUND_CYLINDER      = 2,
	 * 					OB_BOUND_CONE          = 3,
	 * 					OB_BOUND_TRIANGLE_MESH = 4,
	 * 					OB_BOUND_CONVEX_HULL   = 5,
	 * 					OB_BOUND_CAPSULE       = 7,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> bounding box type used for collision </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public void setCollision_boundtype(byte collision_boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1051, collision_boundtype);
		} else {
			__io__block.writeByte(__io__address + 931, collision_boundtype);
		}
	}

	/**
	 * Get method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw extra settings </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public short getDtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1052);
		} else {
			return __io__block.readShort(__io__address + 932);
		}
	}

	/**
	 * Set method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw extra settings </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public void setDtx(short dtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1052, dtx);
		} else {
			__io__block.writeShort(__io__address + 932, dtx);
		}
	}

	/**
	 * Get method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw type </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public byte getDt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1054);
		} else {
			return __io__block.readByte(__io__address + 934);
		}
	}

	/**
	 * Set method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * viewport draw type.
	 * 				<pre>
	 * 					OB_BOUNDBOX  = 1,
	 * 					OB_WIRE      = 2,
	 * 					OB_SOLID     = 3,
	 * 					OB_MATERIAL  = 4,
	 * 					OB_TEXTURE   = 5,
	 * 					OB_RENDER    = 6,
	 * 					OB_PAINT     = 100,  --> temporary used in draw code 
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> viewport draw type </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public void setDt(byte dt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1054, dt);
		} else {
			__io__block.writeByte(__io__address + 934, dt);
		}
	}

	/**
	 * Get method for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			return __io__block.readByte(__io__address + 1055);
		} else {
			return __io__block.readByte(__io__address + 935);
		}
	}

	/**
	 * Set method for struct member 'empty_drawtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
			__io__block.writeByte(__io__address + 1055, empty_drawtype);
		} else {
			__io__block.writeByte(__io__address + 935, empty_drawtype);
		}
	}

	/**
	 * Get method for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * related to viewport drawing
	 * @see #__DNA__FIELD__empty_drawsize
	 */
	
	public float getEmpty_drawsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1056);
		} else {
			return __io__block.readFloat(__io__address + 936);
		}
	}

	/**
	 * Set method for struct member 'empty_drawsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * related to viewport drawing
	 * @see #__DNA__FIELD__empty_drawsize
	 */
	
	public void setEmpty_drawsize(float empty_drawsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1056, empty_drawsize);
		} else {
			__io__block.writeFloat(__io__address + 936, empty_drawsize);
		}
	}

	/**
	 * Get method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dupliface scale<h4>Blender Source Code:</h4>
	 * <p> dupliface scale </p>
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public float getDupfacesca() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1060);
		} else {
			return __io__block.readFloat(__io__address + 940);
		}
	}

	/**
	 * Set method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dupliface scale<h4>Blender Source Code:</h4>
	 * <p> dupliface scale </p>
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public void setDupfacesca(float dupfacesca) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1060, dupfacesca);
		} else {
			__io__block.writeFloat(__io__address + 940, dupfacesca);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic property list (not to be confused with IDProperties)<h4>Blender Source Code:</h4>
	 * <p> game logic property list (not to be confused with IDProperties) </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public ListBase getProp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1064, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 944, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic property list (not to be confused with IDProperties)<h4>Blender Source Code:</h4>
	 * <p> game logic property list (not to be confused with IDProperties) </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(ListBase prop) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1064;
		} else {
			__dna__offset = 944;
		}
		if (__io__equals(prop, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prop)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prop);
		} else {
			__io__generic__copy( getProp(), prop);
		}
	}

	/**
	 * Get method for struct member 'sensors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic sensors<h4>Blender Source Code:</h4>
	 * <p> game logic sensors </p>
	 * @see #__DNA__FIELD__sensors
	 */
	
	public ListBase getSensors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1080, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 952, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sensors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic sensors<h4>Blender Source Code:</h4>
	 * <p> game logic sensors </p>
	 * @see #__DNA__FIELD__sensors
	 */
	
	public void setSensors(ListBase sensors) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1080;
		} else {
			__dna__offset = 952;
		}
		if (__io__equals(sensors, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sensors)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sensors);
		} else {
			__io__generic__copy( getSensors(), sensors);
		}
	}

	/**
	 * Get method for struct member 'controllers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic controllers<h4>Blender Source Code:</h4>
	 * <p> game logic controllers </p>
	 * @see #__DNA__FIELD__controllers
	 */
	
	public ListBase getControllers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1096, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 960, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'controllers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic controllers<h4>Blender Source Code:</h4>
	 * <p> game logic controllers </p>
	 * @see #__DNA__FIELD__controllers
	 */
	
	public void setControllers(ListBase controllers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1096;
		} else {
			__dna__offset = 960;
		}
		if (__io__equals(controllers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, controllers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, controllers);
		} else {
			__io__generic__copy( getControllers(), controllers);
		}
	}

	/**
	 * Get method for struct member 'actuators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic actuators<h4>Blender Source Code:</h4>
	 * <p> game logic actuators </p>
	 * @see #__DNA__FIELD__actuators
	 */
	
	public ListBase getActuators() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1112, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 968, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'actuators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * game logic actuators<h4>Blender Source Code:</h4>
	 * <p> game logic actuators </p>
	 * @see #__DNA__FIELD__actuators
	 */
	
	public void setActuators(ListBase actuators) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1112;
		} else {
			__dna__offset = 968;
		}
		if (__io__equals(actuators, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, actuators)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, actuators);
		} else {
			__io__generic__copy( getActuators(), actuators);
		}
	}

	/**
	 * Get method for struct member 'sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * sf is time-offset<h4>Blender Source Code:</h4>
	 * <p> sf is time-offset </p>
	 * @see #__DNA__FIELD__sf
	 */
	
	public float getSf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1128);
		} else {
			return __io__block.readFloat(__io__address + 976);
		}
	}

	/**
	 * Set method for struct member 'sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * sf is time-offset<h4>Blender Source Code:</h4>
	 * <p> sf is time-offset </p>
	 * @see #__DNA__FIELD__sf
	 */
	
	public void setSf(float sf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1128, sf);
		} else {
			__io__block.writeFloat(__io__address + 976, sf);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> custom index, for renderpasses </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1132);
		} else {
			return __io__block.readShort(__io__address + 980);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> custom index, for renderpasses </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1132, index);
		} else {
			__io__block.writeShort(__io__address + 980, index);
		}
	}

	/**
	 * Get method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> current deformation group, note: index starts at 1 </p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public short getActdef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1134);
		} else {
			return __io__block.readShort(__io__address + 982);
		}
	}

	/**
	 * Set method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> current deformation group, note: index starts at 1 </p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public void setActdef(short actdef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1134, actdef);
		} else {
			__io__block.writeShort(__io__address + 982, actdef);
		}
	}

	/**
	 * Get method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object color<h4>Blender Source Code:</h4>
	 * <p> object color </p>
	 * @see #__DNA__FIELD__col
	 */
	
	public CArrayFacade<Float> getCol() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 984, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object color<h4>Blender Source Code:</h4>
	 * <p> object color </p>
	 * @see #__DNA__FIELD__col
	 */
	
	public void setCol(CArrayFacade<Float> col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1136;
		} else {
			__dna__offset = 984;
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
	 * Get method for struct member 'gameflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	OB_DYNAMIC               = 1 << 0,
	 * 	OB_CHILD                 = 1 << 1,
	 * 	OB_ACTOR                 = 1 << 2,
	 * 	OB_INERTIA_LOCK_X        = 1 << 3,
	 * 	OB_INERTIA_LOCK_Y        = 1 << 4,
	 * 	OB_INERTIA_LOCK_Z        = 1 << 5,
	 * 	OB_DO_FH                 = 1 << 6,
	 * 	OB_ROT_FH                = 1 << 7,
	 * 	OB_ANISOTROPIC_FRICTION  = 1 << 8,
	 * 	OB_GHOST                 = 1 << 9,
	 * 	OB_RIGID_BODY            = 1 << 10,
	 * 	OB_BOUNDS                = 1 << 11,
	 * 
	 * 	OB_COLLISION_RESPONSE    = 1 << 12,
	 * 	OB_SECTOR                = 1 << 13,
	 * 	OB_PROP                  = 1 << 14,
	 * 	OB_MAINACTOR             = 1 << 15,
	 * 
	 * 	OB_COLLISION             = 1 << 16,
	 * 	OB_SOFT_BODY             = 1 << 17,
	 * 	OB_OCCLUDER              = 1 << 18,
	 * 	OB_SENSOR                = 1 << 19,
	 * 	OB_NAVMESH               = 1 << 20,
	 * 	OB_HASOBSTACLE           = 1 << 21,
	 * 	OB_CHARACTER             = 1 << 22,
	 * 
	 * 	OB_RECORD_ANIMATION      = 1 << 23,
	 * 				
	 * 				</pre>
	 * @see #__DNA__FIELD__gameflag
	 */
	
	public int getGameflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1152);
		} else {
			return __io__block.readInt(__io__address + 1000);
		}
	}

	/**
	 * Set method for struct member 'gameflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	OB_DYNAMIC               = 1 << 0,
	 * 	OB_CHILD                 = 1 << 1,
	 * 	OB_ACTOR                 = 1 << 2,
	 * 	OB_INERTIA_LOCK_X        = 1 << 3,
	 * 	OB_INERTIA_LOCK_Y        = 1 << 4,
	 * 	OB_INERTIA_LOCK_Z        = 1 << 5,
	 * 	OB_DO_FH                 = 1 << 6,
	 * 	OB_ROT_FH                = 1 << 7,
	 * 	OB_ANISOTROPIC_FRICTION  = 1 << 8,
	 * 	OB_GHOST                 = 1 << 9,
	 * 	OB_RIGID_BODY            = 1 << 10,
	 * 	OB_BOUNDS                = 1 << 11,
	 * 
	 * 	OB_COLLISION_RESPONSE    = 1 << 12,
	 * 	OB_SECTOR                = 1 << 13,
	 * 	OB_PROP                  = 1 << 14,
	 * 	OB_MAINACTOR             = 1 << 15,
	 * 
	 * 	OB_COLLISION             = 1 << 16,
	 * 	OB_SOFT_BODY             = 1 << 17,
	 * 	OB_OCCLUDER              = 1 << 18,
	 * 	OB_SENSOR                = 1 << 19,
	 * 	OB_NAVMESH               = 1 << 20,
	 * 	OB_HASOBSTACLE           = 1 << 21,
	 * 	OB_CHARACTER             = 1 << 22,
	 * 
	 * 	OB_RECORD_ANIMATION      = 1 << 23,
	 * 				
	 * 				</pre>
	 * @see #__DNA__FIELD__gameflag
	 */
	
	public void setGameflag(int gameflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1152, gameflag);
		} else {
			__io__block.writeInt(__io__address + 1000, gameflag);
		}
	}

	/**
	 * Get method for struct member 'gameflag2'.
	 * @see #__DNA__FIELD__gameflag2
	 */
	
	public int getGameflag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1156);
		} else {
			return __io__block.readInt(__io__address + 1004);
		}
	}

	/**
	 * Set method for struct member 'gameflag2'.
	 * @see #__DNA__FIELD__gameflag2
	 */
	
	public void setGameflag2(int gameflag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1156, gameflag2);
		} else {
			__io__block.writeInt(__io__address + 1004, gameflag2);
		}
	}

	/**
	 * Get method for struct member 'bsoft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for game engine bullet soft body<h4>Blender Source Code:</h4>
	 * <p> settings for game engine bullet soft body </p>
	 * @see #__DNA__FIELD__bsoft
	 */
	
	public CPointer<BulletSoftBody> getBsoft() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1008);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BulletSoftBody.class};
		return new CPointer<BulletSoftBody>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BulletSoftBody.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bsoft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for game engine bullet soft body<h4>Blender Source Code:</h4>
	 * <p> settings for game engine bullet soft body </p>
	 * @see #__DNA__FIELD__bsoft
	 */
	
	public void setBsoft(CPointer<BulletSoftBody> bsoft) throws IOException
	{
		long __address = ((bsoft == null) ? 0 : bsoft.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1160, __address);
		} else {
			__io__block.writeLong(__io__address + 1008, __address);
		}
	}

	/**
	 * Get method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> for restricting view, select, render etc. accessible in outliner </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public byte getRestrictflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1168);
		} else {
			return __io__block.readByte(__io__address + 1012);
		}
	}

	/**
	 * Set method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> for restricting view, select, render etc. accessible in outliner </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public void setRestrictflag(byte restrictflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1168, restrictflag);
		} else {
			__io__block.writeByte(__io__address + 1012, restrictflag);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dependency flag<h4>Blender Source Code:</h4>
	 * <p> dependency flag </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public byte getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1169);
		} else {
			return __io__block.readByte(__io__address + 1013);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dependency flag<h4>Blender Source Code:</h4>
	 * <p> dependency flag </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(byte recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1169, recalc);
		} else {
			__io__block.writeByte(__io__address + 1013, recalc);
		}
	}

	/**
	 * Get method for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
	 * <p> softbody settings </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public short getSoftflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1170);
		} else {
			return __io__block.readShort(__io__address + 1014);
		}
	}

	/**
	 * Set method for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
	 * <p> softbody settings </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public void setSoftflag(short softflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1170, softflag);
		} else {
			__io__block.writeShort(__io__address + 1014, softflag);
		}
	}

	/**
	 * Get method for struct member 'anisotropicFriction'.
	 * @see #__DNA__FIELD__anisotropicFriction
	 */
	
	public CArrayFacade<Float> getAnisotropicFriction() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1016, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anisotropicFriction'.
	 * @see #__DNA__FIELD__anisotropicFriction
	 */
	
	public void setAnisotropicFriction(CArrayFacade<Float> anisotropicFriction) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1172;
		} else {
			__dna__offset = 1016;
		}
		if (__io__equals(anisotropicFriction, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anisotropicFriction)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anisotropicFriction);
		} else {
			__io__generic__copy( getAnisotropicFriction(), anisotropicFriction);
		}
	}

	/**
	 * Get method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
	 * <p> object constraints </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public ListBase getConstraints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1028, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
	 * <p> object constraints </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public void setConstraints(ListBase constraints) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1184;
		} else {
			__dna__offset = 1028;
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
	 * <h4>Java .Blend:</h4>
	 * @depricated
	 * @see #__DNA__FIELD__nlastrips
	 */
	
	public ListBase getNlastrips() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1200, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1036, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nlastrips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated
	 * @see #__DNA__FIELD__nlastrips
	 */
	
	public void setNlastrips(ListBase nlastrips) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1200;
		} else {
			__dna__offset = 1036;
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
	 * <h4>Java .Blend:</h4>
	 * @depricated
	 * @see #__DNA__FIELD__hooks
	 */
	
	public ListBase getHooks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1216, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1044, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hooks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated
	 * @see #__DNA__FIELD__hooks
	 */
	
	public void setHooks(ListBase hooks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1216;
		} else {
			__dna__offset = 1044;
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
	 * <h4>Java .Blend:</h4>
	 * particle systems<h4>Blender Source Code:</h4>
	 * <p> particle systems </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public ListBase getParticlesystem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1232, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1052, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle systems<h4>Blender Source Code:</h4>
	 * <p> particle systems </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public void setParticlesystem(ListBase particlesystem) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1232;
		} else {
			__dna__offset = 1052;
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
	 * <h4>Java .Blend:</h4>
	 * particle deflector/attractor/collision data<h4>Blender Source Code:</h4>
	 * <p> particle deflector/attractor/collision data </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public CPointer<PartDeflect> getPd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1060);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartDeflect.class};
		return new CPointer<PartDeflect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartDeflect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle deflector/attractor/collision data<h4>Blender Source Code:</h4>
	 * <p> particle deflector/attractor/collision data </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public void setPd(CPointer<PartDeflect> pd) throws IOException
	{
		long __address = ((pd == null) ? 0 : pd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1248, __address);
		} else {
			__io__block.writeLong(__io__address + 1060, __address);
		}
	}

	/**
	 * Get method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
	 * <p> if exists, saved in file </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public CPointer<SoftBody> getSoft() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1064);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SoftBody.class};
		return new CPointer<SoftBody>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SoftBody.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
	 * <p> if exists, saved in file </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public void setSoft(CPointer<SoftBody> soft) throws IOException
	{
		long __address = ((soft == null) ? 0 : soft.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1256, __address);
		} else {
			__io__block.writeLong(__io__address + 1064, __address);
		}
	}

	/**
	 * Get method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object duplicator for group<h4>Blender Source Code:</h4>
	 * <p> object duplicator for group </p>
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public CPointer<Group> getDup_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1068);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object duplicator for group<h4>Blender Source Code:</h4>
	 * <p> object duplicator for group </p>
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public void setDup_group(CPointer<Group> dup_group) throws IOException
	{
		long __address = ((dup_group == null) ? 0 : dup_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1264, __address);
		} else {
			__io__block.writeLong(__io__address + 1068, __address);
		}
	}

	/**
	 * Get method for struct member 'body_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for now used to temporarily holds the type of collision object.
	 * 				<pre>
	 * 	OB_BODY_TYPE_NO_COLLISION   = 0,
	 * 	OB_BODY_TYPE_STATIC         = 1,
	 * 	OB_BODY_TYPE_DYNAMIC        = 2,
	 * 	OB_BODY_TYPE_RIGID          = 3,
	 * 	OB_BODY_TYPE_SOFT           = 4,
	 * 	OB_BODY_TYPE_OCCLUDER       = 5,
	 * 	OB_BODY_TYPE_SENSOR         = 6,
	 * 	OB_BODY_TYPE_NAVMESH        = 7,
	 * 	OB_BODY_TYPE_CHARACTER      = 8,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> for now used to temporarily holds the type of collision object </p>
	 * @see #__DNA__FIELD__body_type
	 */
	
	public byte getBody_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1272);
		} else {
			return __io__block.readByte(__io__address + 1072);
		}
	}

	/**
	 * Set method for struct member 'body_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for now used to temporarily holds the type of collision object.
	 * 				<pre>
	 * 	OB_BODY_TYPE_NO_COLLISION   = 0,
	 * 	OB_BODY_TYPE_STATIC         = 1,
	 * 	OB_BODY_TYPE_DYNAMIC        = 2,
	 * 	OB_BODY_TYPE_RIGID          = 3,
	 * 	OB_BODY_TYPE_SOFT           = 4,
	 * 	OB_BODY_TYPE_OCCLUDER       = 5,
	 * 	OB_BODY_TYPE_SENSOR         = 6,
	 * 	OB_BODY_TYPE_NAVMESH        = 7,
	 * 	OB_BODY_TYPE_CHARACTER      = 8,
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> for now used to temporarily holds the type of collision object </p>
	 * @see #__DNA__FIELD__body_type
	 */
	
	public void setBody_type(byte body_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1272, body_type);
		} else {
			__io__block.writeByte(__io__address + 1072, body_type);
		}
	}

	/**
	 * Get method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
	 * <p> flag for pinning </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public byte getShapeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1273);
		} else {
			return __io__block.readByte(__io__address + 1073);
		}
	}

	/**
	 * Set method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
	 * <p> flag for pinning </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public void setShapeflag(byte shapeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1273, shapeflag);
		} else {
			__io__block.writeByte(__io__address + 1073, shapeflag);
		}
	}

	/**
	 * Get method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
	 * <p> current shape key for menu or pinned </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public short getShapenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1274);
		} else {
			return __io__block.readShort(__io__address + 1074);
		}
	}

	/**
	 * Set method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
	 * <p> current shape key for menu or pinned </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public void setShapenr(short shapenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1274, shapenr);
		} else {
			__io__block.writeShort(__io__address + 1074, shapenr);
		}
	}

	/**
	 * Get method for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * smoothresh is phong interpolation ray_shadow correction in render<h4>Blender Source Code:</h4>
	 * <p> smoothresh is phong interpolation ray_shadow correction in render </p>
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public float getSmoothresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1276);
		} else {
			return __io__block.readFloat(__io__address + 1076);
		}
	}

	/**
	 * Set method for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * smoothresh is phong interpolation ray_shadow correction in render<h4>Blender Source Code:</h4>
	 * <p> smoothresh is phong interpolation ray_shadow correction in render </p>
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public void setSmoothresh(float smoothresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1276, smoothresh);
		} else {
			__io__block.writeFloat(__io__address + 1076, smoothresh);
		}
	}

	/**
	 * Get method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> if fluidsim enabled, store additional settings </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public CPointer<FluidsimSettings> getFluidsimSettings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1080);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidsimSettings.class};
		return new CPointer<FluidsimSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidsimSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> if fluidsim enabled, store additional settings </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public void setFluidsimSettings(CPointer<FluidsimSettings> fluidsimSettings) throws IOException
	{
		long __address = ((fluidsimSettings == null) ? 0 : fluidsimSettings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1280, __address);
		} else {
			__io__block.writeLong(__io__address + 1080, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime valuated curve-specific data, not stored in the file<h4>Blender Source Code:</h4>
	 * <p> Runtime valuated curve-specific data, not stored in the file </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public CPointer<Object> getCurve_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1084);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Runtime valuated curve-specific data, not stored in the file<h4>Blender Source Code:</h4>
	 * <p> Runtime valuated curve-specific data, not stored in the file </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public void setCurve_cache(CPointer<Object> curve_cache) throws IOException
	{
		long __address = ((curve_cache == null) ? 0 : curve_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1288, __address);
		} else {
			__io__block.writeLong(__io__address + 1084, __address);
		}
	}

	/**
	 * Get method for struct member 'derivedDeform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * @see #__DNA__FIELD__derivedDeform
	 */
	
	public CPointer<Object> getDerivedDeform() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1088);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'derivedDeform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * @see #__DNA__FIELD__derivedDeform
	 */
	
	public void setDerivedDeform(CPointer<Object> derivedDeform) throws IOException
	{
		long __address = ((derivedDeform == null) ? 0 : derivedDeform.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1296, __address);
		} else {
			__io__block.writeLong(__io__address + 1088, __address);
		}
	}

	/**
	 * Get method for struct member 'derivedFinal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * @see #__DNA__FIELD__derivedFinal
	 */
	
	public CPointer<Object> getDerivedFinal() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1092);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'derivedFinal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this is just a cache which gets initialised by blender on demand
	 * @see #__DNA__FIELD__derivedFinal
	 */
	
	public void setDerivedFinal(CPointer<Object> derivedFinal) throws IOException
	{
		long __address = ((derivedFinal == null) ? 0 : derivedFinal.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1304, __address);
		} else {
			__io__block.writeLong(__io__address + 1092, __address);
		}
	}

	/**
	 * Get method for struct member 'lastDataMask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * the custom data layer mask that was last used to calculate derivedDeform and derivedFinal
	 * 				<h3>Values:</h3>
	 * 				<pre>
	 * 	// Bits for CustomDataMask 
	 * 	CD_MASK_MVERT		(1 << CD_MVERT)
	 * 	CD_MASK_MDEFORMVERT	(1 << CD_MDEFORMVERT)
	 * 	CD_MASK_MEDGE		(1 << CD_MEDGE)
	 * 	CD_MASK_MFACE		(1 << CD_MFACE)
	 * 	CD_MASK_MTFACE		(1 << CD_MTFACE)
	 * 	CD_MASK_MCOL		(1 << CD_MCOL)
	 * 	CD_MASK_ORIGINDEX	(1 << CD_ORIGINDEX)
	 * 	CD_MASK_NORMAL		(1 << CD_NORMAL)
	 * 	CD_MASK_PROP_FLT	(1 << CD_PROP_FLT)
	 * 	CD_MASK_PROP_INT	(1 << CD_PROP_INT)
	 * 	CD_MASK_PROP_STR	(1 << CD_PROP_STR)
	 * 	CD_MASK_ORIGSPACE	(1 << CD_ORIGSPACE)
	 * 	CD_MASK_ORCO		(1 << CD_ORCO)
	 * 	CD_MASK_MTEXPOLY	(1 << CD_MTEXPOLY)
	 * 	CD_MASK_MLOOPUV		(1 << CD_MLOOPUV)
	 * 	CD_MASK_MLOOPCOL	(1 << CD_MLOOPCOL)
	 * 	CD_MASK_TANGENT		(1 << CD_TANGENT)
	 * 	CD_MASK_MDISPS		(1 << CD_MDISPS)
	 * 	CD_MASK_PREVIEW_MCOL	(1 << CD_PREVIEW_MCOL)
	 * 	CD_MASK_CLOTH_ORCO	(1 << CD_CLOTH_ORCO)
	 * 	CD_MASK_RECAST		(1 << CD_RECAST)
	 * 	
	 * 	// BMESH ONLY START
	 * 	CD_MASK_MPOLY		(1 << CD_MPOLY)
	 * 	CD_MASK_MLOOP		(1 << CD_MLOOP)
	 * 	CD_MASK_SHAPE_KEYINDEX	(1 << CD_SHAPE_KEYINDEX)
	 * 	CD_MASK_SHAPEKEY	(1 << CD_SHAPEKEY)
	 * 	CD_MASK_BWEIGHT		(1 << CD_BWEIGHT)
	 * 	CD_MASK_CREASE		(1 << CD_CREASE)
	 * 	CD_MASK_ORIGSPACE_MLOOP	(1LL << CD_ORIGSPACE_MLOOP)
	 * 	CD_MASK_PREVIEW_MLOOPCOL (1LL << CD_PREVIEW_MLOOPCOL)
	 * 	CD_MASK_BM_ELEM_PYPTR (1LL << CD_BM_ELEM_PYPTR)
	 * 	// BMESH ONLY END
	 * 	
	 * 	CD_MASK_PAINT_MASK		(1LL << CD_PAINT_MASK)
	 * 	CD_MASK_GRID_PAINT_MASK	(1LL << CD_GRID_PAINT_MASK)
	 * 	CD_MASK_MVERT_SKIN		(1LL << CD_MVERT_SKIN)
	 * 	CD_MASK_FREESTYLE_EDGE	(1LL << CD_FREESTYLE_EDGE)
	 * 	CD_MASK_FREESTYLE_FACE	(1LL << CD_FREESTYLE_FACE)
	 * 	CD_MASK_MLOOPTANGENT    (1LL << CD_MLOOPTANGENT)
	 * 	CD_MASK_TESSLOOPNORMAL  (1LL << CD_TESSLOOPNORMAL)
	 * 	CD_MASK_CUSTOMLOOPNORMAL (1LL << CD_CUSTOMLOOPNORMAL)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> the custom data layer mask that was last used to calculate derivedDeform and derivedFinal </p>
	 * @see #__DNA__FIELD__lastDataMask
	 */
	
	public long getLastDataMask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 1312);
		} else {
			return __io__block.readInt64(__io__address + 1096);
		}
	}

	/**
	 * Set method for struct member 'lastDataMask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * the custom data layer mask that was last used to calculate derivedDeform and derivedFinal
	 * 				<h3>Values:</h3>
	 * 				<pre>
	 * 	// Bits for CustomDataMask 
	 * 	CD_MASK_MVERT		(1 << CD_MVERT)
	 * 	CD_MASK_MDEFORMVERT	(1 << CD_MDEFORMVERT)
	 * 	CD_MASK_MEDGE		(1 << CD_MEDGE)
	 * 	CD_MASK_MFACE		(1 << CD_MFACE)
	 * 	CD_MASK_MTFACE		(1 << CD_MTFACE)
	 * 	CD_MASK_MCOL		(1 << CD_MCOL)
	 * 	CD_MASK_ORIGINDEX	(1 << CD_ORIGINDEX)
	 * 	CD_MASK_NORMAL		(1 << CD_NORMAL)
	 * 	CD_MASK_PROP_FLT	(1 << CD_PROP_FLT)
	 * 	CD_MASK_PROP_INT	(1 << CD_PROP_INT)
	 * 	CD_MASK_PROP_STR	(1 << CD_PROP_STR)
	 * 	CD_MASK_ORIGSPACE	(1 << CD_ORIGSPACE)
	 * 	CD_MASK_ORCO		(1 << CD_ORCO)
	 * 	CD_MASK_MTEXPOLY	(1 << CD_MTEXPOLY)
	 * 	CD_MASK_MLOOPUV		(1 << CD_MLOOPUV)
	 * 	CD_MASK_MLOOPCOL	(1 << CD_MLOOPCOL)
	 * 	CD_MASK_TANGENT		(1 << CD_TANGENT)
	 * 	CD_MASK_MDISPS		(1 << CD_MDISPS)
	 * 	CD_MASK_PREVIEW_MCOL	(1 << CD_PREVIEW_MCOL)
	 * 	CD_MASK_CLOTH_ORCO	(1 << CD_CLOTH_ORCO)
	 * 	CD_MASK_RECAST		(1 << CD_RECAST)
	 * 	
	 * 	// BMESH ONLY START
	 * 	CD_MASK_MPOLY		(1 << CD_MPOLY)
	 * 	CD_MASK_MLOOP		(1 << CD_MLOOP)
	 * 	CD_MASK_SHAPE_KEYINDEX	(1 << CD_SHAPE_KEYINDEX)
	 * 	CD_MASK_SHAPEKEY	(1 << CD_SHAPEKEY)
	 * 	CD_MASK_BWEIGHT		(1 << CD_BWEIGHT)
	 * 	CD_MASK_CREASE		(1 << CD_CREASE)
	 * 	CD_MASK_ORIGSPACE_MLOOP	(1LL << CD_ORIGSPACE_MLOOP)
	 * 	CD_MASK_PREVIEW_MLOOPCOL (1LL << CD_PREVIEW_MLOOPCOL)
	 * 	CD_MASK_BM_ELEM_PYPTR (1LL << CD_BM_ELEM_PYPTR)
	 * 	// BMESH ONLY END
	 * 	
	 * 	CD_MASK_PAINT_MASK		(1LL << CD_PAINT_MASK)
	 * 	CD_MASK_GRID_PAINT_MASK	(1LL << CD_GRID_PAINT_MASK)
	 * 	CD_MASK_MVERT_SKIN		(1LL << CD_MVERT_SKIN)
	 * 	CD_MASK_FREESTYLE_EDGE	(1LL << CD_FREESTYLE_EDGE)
	 * 	CD_MASK_FREESTYLE_FACE	(1LL << CD_FREESTYLE_FACE)
	 * 	CD_MASK_MLOOPTANGENT    (1LL << CD_MLOOPTANGENT)
	 * 	CD_MASK_TESSLOOPNORMAL  (1LL << CD_TESSLOOPNORMAL)
	 * 	CD_MASK_CUSTOMLOOPNORMAL (1LL << CD_CUSTOMLOOPNORMAL)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> the custom data layer mask that was last used to calculate derivedDeform and derivedFinal </p>
	 * @see #__DNA__FIELD__lastDataMask
	 */
	
	public void setLastDataMask(long lastDataMask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 1312, lastDataMask);
		} else {
			__io__block.writeInt64(__io__address + 1096, lastDataMask);
		}
	}

	/**
	 * Get method for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph. <b>See Also:</n> {@link #getLastDataMask()}<h4>Blender Source Code:</h4>
	 * <p> (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph </p>
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public long getCustomdata_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 1320);
		} else {
			return __io__block.readInt64(__io__address + 1104);
		}
	}

	/**
	 * Set method for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph. <b>See Also:</n> {@link #getLastDataMask()}<h4>Blender Source Code:</h4>
	 * <p> (extra) custom data layer mask to use for creating derivedmesh, set by depsgraph </p>
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public void setCustomdata_mask(long customdata_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 1320, customdata_mask);
		} else {
			__io__block.writeInt64(__io__address + 1104, customdata_mask);
		}
	}

	/**
	 * Get method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of game controllers that are active<h4>Blender Source Code:</h4>
	 * <p> bit masks of game controllers that are active </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public int getState() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1328);
		} else {
			return __io__block.readInt(__io__address + 1112);
		}
	}

	/**
	 * Set method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of game controllers that are active<h4>Blender Source Code:</h4>
	 * <p> bit masks of game controllers that are active </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public void setState(int state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1328, state);
		} else {
			__io__block.writeInt(__io__address + 1112, state);
		}
	}

	/**
	 * Get method for struct member 'init_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of initial state as recorded by the users<h4>Blender Source Code:</h4>
	 * <p> bit masks of initial state as recorded by the users </p>
	 * @see #__DNA__FIELD__init_state
	 */
	
	public int getInit_state() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1332);
		} else {
			return __io__block.readInt(__io__address + 1116);
		}
	}

	/**
	 * Set method for struct member 'init_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bit masks of initial state as recorded by the users<h4>Blender Source Code:</h4>
	 * <p> bit masks of initial state as recorded by the users </p>
	 * @see #__DNA__FIELD__init_state
	 */
	
	public void setInit_state(int init_state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1332, init_state);
		} else {
			__io__block.writeInt(__io__address + 1116, init_state);
		}
	}

	/**
	 * Get method for struct member 'gpulamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * runtime, for glsl lamp display only<h4>Blender Source Code:</h4>
	 * <p> runtime, for glsl lamp display only </p>
	 * @see #__DNA__FIELD__gpulamp
	 */
	
	public ListBase getGpulamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1336, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpulamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * runtime, for glsl lamp display only<h4>Blender Source Code:</h4>
	 * <p> runtime, for glsl lamp display only </p>
	 * @see #__DNA__FIELD__gpulamp
	 */
	
	public void setGpulamp(ListBase gpulamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1336;
		} else {
			__dna__offset = 1120;
		}
		if (__io__equals(gpulamp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gpulamp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gpulamp);
		} else {
			__io__generic__copy( getGpulamp(), gpulamp);
		}
	}

	/**
	 * Get method for struct member 'pc_ids'.
	 * @see #__DNA__FIELD__pc_ids
	 */
	
	public ListBase getPc_ids() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1352, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1128, __io__block, __io__blockTable);
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
			__dna__offset = 1352;
		} else {
			__dna__offset = 1128;
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
	 * Get method for struct member 'duplilist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for temporary dupli list storage, only for use by RNA API<h4>Blender Source Code:</h4>
	 * <p> for temporary dupli list storage, only for use by RNA API </p>
	 * @see #__DNA__FIELD__duplilist
	 */
	
	public CPointer<ListBase> getDuplilist() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'duplilist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for temporary dupli list storage, only for use by RNA API<h4>Blender Source Code:</h4>
	 * <p> for temporary dupli list storage, only for use by RNA API </p>
	 * @see #__DNA__FIELD__duplilist
	 */
	
	public void setDuplilist(CPointer<ListBase> duplilist) throws IOException
	{
		long __address = ((duplilist == null) ? 0 : duplilist.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1368, __address);
		} else {
			__io__block.writeLong(__io__address + 1136, __address);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet rigid body </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public CPointer<RigidBodyOb> getRigidbody_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyOb.class};
		return new CPointer<RigidBodyOb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyOb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet rigid body </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public void setRigidbody_object(CPointer<RigidBodyOb> rigidbody_object) throws IOException
	{
		long __address = ((rigidbody_object == null) ? 0 : rigidbody_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1376, __address);
		} else {
			__io__block.writeLong(__io__address + 1140, __address);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet constraint </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public CPointer<RigidBodyCon> getRigidbody_constraint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyCon.class};
		return new CPointer<RigidBodyCon>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyCon.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
	 * <p> settings for Bullet constraint </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public void setRigidbody_constraint(CPointer<RigidBodyCon> rigidbody_constraint) throws IOException
	{
		long __address = ((rigidbody_constraint == null) ? 0 : rigidbody_constraint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1384, __address);
		} else {
			__io__block.writeLong(__io__address + 1144, __address);
		}
	}

	/**
	 * Get method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
	 * <p> offset for image empties </p>
	 * @see #__DNA__FIELD__ima_ofs
	 */
	
	public CArrayFacade<Float> getIma_ofs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
	 * <p> offset for image empties </p>
	 * @see #__DNA__FIELD__ima_ofs
	 */
	
	public void setIma_ofs(CArrayFacade<Float> ima_ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1392;
		} else {
			__dna__offset = 1148;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> must be non-null when oject is an empty image </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public CPointer<ImageUser> getIuser() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1400);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageUser.class};
		return new CPointer<ImageUser>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageUser.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> must be non-null when oject is an empty image </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(CPointer<ImageUser> iuser) throws IOException
	{
		long __address = ((iuser == null) ? 0 : iuser.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1400, __address);
		} else {
			__io__block.writeLong(__io__address + 1156, __address);
		}
	}

	/**
	 * Get method for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> contains data for levels of detail </p>
	 * @see #__DNA__FIELD__lodlevels
	 */
	
	public ListBase getLodlevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1408, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1160, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> contains data for levels of detail </p>
	 * @see #__DNA__FIELD__lodlevels
	 */
	
	public void setLodlevels(ListBase lodlevels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1408;
		} else {
			__dna__offset = 1160;
		}
		if (__io__equals(lodlevels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lodlevels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lodlevels);
		} else {
			__io__generic__copy( getLodlevels(), lodlevels);
		}
	}

	/**
	 * Get method for struct member 'currentlod'.
	 * @see #__DNA__FIELD__currentlod
	 */
	
	public CPointer<LodLevel> getCurrentlod() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LodLevel.class};
		return new CPointer<LodLevel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LodLevel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'currentlod'.
	 * @see #__DNA__FIELD__currentlod
	 */
	
	public void setCurrentlod(CPointer<LodLevel> currentlod) throws IOException
	{
		long __address = ((currentlod == null) ? 0 : currentlod.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1424, __address);
		} else {
			__io__block.writeLong(__io__address + 1168, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1432, __address);
		} else {
			__io__block.writeLong(__io__address + 1172, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BlenderObject> __io__addressof() {
		return new CPointer<BlenderObject>(__io__address, new Class[]{BlenderObject.class}, __io__block, __io__blockTable);
	}

}
