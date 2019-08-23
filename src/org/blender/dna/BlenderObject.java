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

@CMetaData(size32=1128, size64=1416)
public class BlenderObject extends CFacade {

	/**
	 * This is the sdna index of the struct Object.
	 * <p>
	 * It is required when allocating a new block to store data for Object.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 161;

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
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * animation data<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__drawdata = new long[]{124, 160};

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
	public static final long[] __DNA__FIELD__sculpt = new long[]{132, 176};

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
	public static final long[] __DNA__FIELD__type = new long[]{136, 184};

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
	public static final long[] __DNA__FIELD__partype = new long[]{138, 186};

	/**
	 * Field descriptor (offset) for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__par1 = new long[]{140, 188};

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
	public static final long[] __DNA__FIELD__par2 = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__par3 = new long[]{148, 196};

	/**
	 * Field descriptor (offset) for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__parsubstr = new long[]{152, 200};

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
	public static final long[] __DNA__FIELD__parent = new long[]{216, 264};

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
	public static final long[] __DNA__FIELD__track = new long[]{220, 272};

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
	public static final long[] __DNA__FIELD__proxy = new long[]{224, 280};

	/**
	 * Field descriptor (offset) for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
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
	public static final long[] __DNA__FIELD__proxy_group = new long[]{228, 288};

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
	public static final long[] __DNA__FIELD__proxy_from = new long[]{232, 296};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__ipo = new long[]{236, 304};

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; </p>
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
	public static final long[] __DNA__FIELD__action = new long[]{240, 312};

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
	public static final long[] __DNA__FIELD__poselib = new long[]{244, 320};

	/**
	 * Field descriptor (offset) for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pose data, armature objects only<h4>Blender Python API:</h4>
	 * (read-only)    Current pose for armatures<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__pose = new long[]{248, 328};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pointer to objects data - an 'ID' or NULL<h4>Blender Python API:</h4>
	 * Object data<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__data = new long[]{252, 336};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data. </p>
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
	public static final long[] __DNA__FIELD__gpd = new long[]{256, 344};

	/**
	 * Field descriptor (offset) for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__avs = new long[]{260, 352};

	/**
	 * Field descriptor (offset) for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * motion path cache for this object<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__mpath = new long[]{292, 384};

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
	public static final long[] __DNA__FIELD___pad0 = new long[]{296, 392};

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
	public static final long[] __DNA__FIELD__constraintChannels = new long[]{300, 400};

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
	public static final long[] __DNA__FIELD__effect = new long[]{308, 416};

	/**
	 * Field descriptor (offset) for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of bDeformGroup (vertex groups) names and flag only<h4>Blender Source Code:</h4>
	 * <p> List of {@link bDeformGroup}  (vertex groups) names and flag only. </p>
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
	public static final long[] __DNA__FIELD__defbase = new long[]{316, 432};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of ModifierData structures<h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__modifiers = new long[]{324, 448};

	/**
	 * Field descriptor (offset) for struct member 'greasepencil_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__greasepencil_modifiers = new long[]{332, 464};

	/**
	 * Field descriptor (offset) for struct member 'fmaps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__fmaps = new long[]{340, 480};

	/**
	 * Field descriptor (offset) for struct member 'shader_fx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__shader_fx = new long[]{348, 496};

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
	public static final long[] __DNA__FIELD__mode = new long[]{356, 512};

	/**
	 * Field descriptor (offset) for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__restore_mode = new long[]{360, 516};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__mat = new long[]{364, 520};

	/**
	 * Field descriptor (offset) for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__matbits = new long[]{368, 528};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__totcol = new long[]{372, 536};

	/**
	 * Field descriptor (offset) for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__actcol = new long[]{376, 540};

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
	public static final long[] __DNA__FIELD__loc = new long[]{380, 544};

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
	public static final long[] __DNA__FIELD__dloc = new long[]{392, 556};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__size = new long[]{404, 568};

	/**
	 * Field descriptor (offset) for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__dsize = new long[]{416, 580};

	/**
	 * Field descriptor (offset) for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__dscale = new long[]{428, 592};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__rot = new long[]{440, 604};

	/**
	 * Field descriptor (offset) for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__drot = new long[]{452, 616};

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__quat = new long[]{464, 628};

	/**
	 * Field descriptor (offset) for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__dquat = new long[]{480, 644};

	/**
	 * Field descriptor (offset) for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__rotAxis = new long[]{496, 660};

	/**
	 * Field descriptor (offset) for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__drotAxis = new long[]{508, 672};

	/**
	 * Field descriptor (offset) for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__rotAngle = new long[]{520, 684};

	/**
	 * Field descriptor (offset) for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__drotAngle = new long[]{524, 688};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> Final worldspace matrix with constraints & animsys applied. </p>
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
	public static final long[] __DNA__FIELD__obmat = new long[]{528, 692};

	/**
	 * Field descriptor (offset) for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__parentinv = new long[]{592, 756};

	/**
	 * Field descriptor (offset) for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__constinv = new long[]{656, 820};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse matrix of 'obmat' for any other use than rendering! 
	 * 							note: this isn't assured to be valid as with 'obmat',
	 * 	                     	before using this value you should do...
	 * 	                    	invert_m4_m4(ob->imat, ob->obmat);<h4>Blender Source Code:</h4>
	 * <p> Inverse matrix of 'obmat' for any other use than rendering!</p><p><h2>Note</h2><p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); </p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); 
	 * </p>
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
	public static final long[] __DNA__FIELD__imat = new long[]{720, 884};

	/**
	 * Field descriptor (offset) for struct member 'imat_ren'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Cache of inverse object-view matrix calculated at runtime. Previously 'imat' was used at render time, but as other places use it too
	 * 	 							the interactive ui of 2.5 creates problems. So now only 'imat_ren' should
	 * 								be used when ever the inverse of ob->obmat * re->viewmat is needed!<h4>Blender Source Code:</h4>
	 * <p> Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
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
	public static final long[] __DNA__FIELD__imat_ren = new long[]{784, 948};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of Base's layer in the scene<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__lay = new long[]{848, 1012};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__flag = new long[]{852, 1016};

	/**
	 * Field descriptor (offset) for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__colbits = new long[]{854, 1018};

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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Transformation settings and transform locks . </p>
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
	public static final long[] __DNA__FIELD__transflag = new long[]{856, 1020};

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
	public static final long[] __DNA__FIELD__protectflag = new long[]{858, 1022};

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
	public static final long[] __DNA__FIELD__trackflag = new long[]{860, 1024};

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
	public static final long[] __DNA__FIELD__upflag = new long[]{862, 1026};

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
	public static final long[] __DNA__FIELD__nlaflag = new long[]{864, 1028};

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
	public static final long[] __DNA__FIELD___pad1 = new long[]{866, 1030};

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
	public static final long[] __DNA__FIELD__duplicator_visibility_flag = new long[]{867, 1031};

	/**
	 * Field descriptor (offset) for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__base_flag = new long[]{868, 1032};

	/**
	 * Field descriptor (offset) for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__base_local_view_bits = new long[]{870, 1034};

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
	public static final long[] __DNA__FIELD__col_group = new long[]{872, 1036};

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
	public static final long[] __DNA__FIELD__col_mask = new long[]{874, 1038};

	/**
	 * Field descriptor (offset) for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> Rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations.... </p>
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
	public static final long[] __DNA__FIELD__rotmode = new long[]{876, 1040};

	/**
	 * Field descriptor (offset) for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__boundtype = new long[]{878, 1042};

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
	public static final long[] __DNA__FIELD__collision_boundtype = new long[]{879, 1043};

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
	public static final long[] __DNA__FIELD__dtx = new long[]{880, 1044};

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
	public static final long[] __DNA__FIELD__dt = new long[]{882, 1046};

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
	public static final long[] __DNA__FIELD__empty_drawtype = new long[]{883, 1047};

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
	public static final long[] __DNA__FIELD__empty_drawsize = new long[]{884, 1048};

	/**
	 * Field descriptor (offset) for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__dupfacesca = new long[]{888, 1052};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> Custom index, for renderpasses. </p>
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
	public static final long[] __DNA__FIELD__index = new long[]{892, 1056};

	/**
	 * Field descriptor (offset) for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> Current deformation group, note: index starts at 1. </p>
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
	public static final long[] __DNA__FIELD__actdef = new long[]{894, 1058};

	/**
	 * Field descriptor (offset) for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current face map, note: index starts at 1. </p>
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
	public static final long[] __DNA__FIELD__actfmap = new long[]{896, 1060};

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
	public static final long[] __DNA__FIELD___pad2 = new long[]{898, 1062};

	/**
	 * Field descriptor (offset) for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__col = new long[]{900, 1064};

	/**
	 * Field descriptor (offset) for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__softflag = new long[]{916, 1080};

	/**
	 * Field descriptor (offset) for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> For restricting view, select, render etc. accessible in outliner. </p>
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
	public static final long[] __DNA__FIELD__restrictflag = new long[]{918, 1082};

	/**
	 * Field descriptor (offset) for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__shapeflag = new long[]{919, 1083};

	/**
	 * Field descriptor (offset) for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__shapenr = new long[]{920, 1084};

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
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{922, 1086};

	/**
	 * Field descriptor (offset) for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__constraints = new long[]{924, 1088};

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
	public static final long[] __DNA__FIELD__nlastrips = new long[]{932, 1104};

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
	public static final long[] __DNA__FIELD__hooks = new long[]{940, 1120};

	/**
	 * Field descriptor (offset) for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle systems<h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  systems. </p>
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
	public static final long[] __DNA__FIELD__particlesystem = new long[]{948, 1136};

	/**
	 * Field descriptor (offset) for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle deflector/attractor/collision data<h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  deflector/attractor/collision data. </p>
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
	public static final long[] __DNA__FIELD__pd = new long[]{956, 1152};

	/**
	 * Field descriptor (offset) for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__soft = new long[]{960, 1160};

	/**
	 * Field descriptor (offset) for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
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
	public static final long[] __DNA__FIELD__dup_group = new long[]{964, 1168};

	/**
	 * Field descriptor (offset) for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> If fluidsim enabled, store additional settings. </p>
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
	public static final long[] __DNA__FIELD__fluidsimSettings = new long[]{968, 1176};

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
	public static final long[] __DNA__FIELD__derivedDeform = new long[]{972, 1184};

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
	public static final long[] __DNA__FIELD__derivedFinal = new long[]{976, 1192};

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
	public static final long[] __DNA__FIELD__pc_ids = new long[]{980, 1200};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__rigidbody_object = new long[]{988, 1216};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__rigidbody_constraint = new long[]{992, 1224};

	/**
	 * Field descriptor (offset) for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__ima_ofs = new long[]{996, 1232};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__iuser = new long[]{1004, 1240};

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
	public static final long[] __DNA__FIELD__empty_image_visibility_flag = new long[]{1008, 1248};

	/**
	 * Field descriptor (offset) for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
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
	public static final long[] __DNA__FIELD__empty_image_depth = new long[]{1009, 1249};

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
	public static final long[] __DNA__FIELD__empty_image_flag = new long[]{1010, 1250};

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
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{1011, 1251};

	/**
	 * Field descriptor (offset) for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for levels of detail. </p>
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
	public static final long[] __DNA__FIELD__lodlevels = new long[]{1016, 1256};

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
	public static final long[] __DNA__FIELD__currentlod = new long[]{1024, 1272};

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
	public static final long[] __DNA__FIELD__preview = new long[]{1028, 1280};

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
	 * BlenderObject blenderobject = ...;
	 * CPointer&lt;Object&gt; p = blenderobject.__dna__addressof(BlenderObject.__DNA__FIELD__runtime);
	 * CPointer&lt;Object_Runtime&gt; p_runtime = p.cast(new Class[]{Object_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Object_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 96/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1032, 1288};

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
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * animation data<h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public DrawDataList getDrawdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DrawDataList(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new DrawDataList(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public void setDrawdata(DrawDataList drawdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 124;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
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
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
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
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 136);
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
			__io__block.writeShort(__io__address + 184, type);
		} else {
			__io__block.writeShort(__io__address + 136, type);
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
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 138);
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
			__io__block.writeShort(__io__address + 186, partype);
		} else {
			__io__block.writeShort(__io__address + 138, partype);
		}
	}

	/**
	 * Get method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
	 * <p> Can be vertexnrs. </p>
	 * @see #__DNA__FIELD__par1
	 */
	
	public int getPar1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'par1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr<h4>Blender Source Code:</h4>
	 * <p> Can be vertexnrs. </p>
	 * @see #__DNA__FIELD__par1
	 */
	
	public void setPar1(int par1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, par1);
		} else {
			__io__block.writeInt(__io__address + 140, par1);
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
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 144);
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
			__io__block.writeInt(__io__address + 192, par2);
		} else {
			__io__block.writeInt(__io__address + 144, par2);
		}
	}

	/**
	 * Get method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par3
	 */
	
	public int getPar3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 196);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'par3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * can be a vertexnr
	 * @see #__DNA__FIELD__par3
	 */
	
	public void setPar3(int par3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 196, par3);
		} else {
			__io__block.writeInt(__io__address + 148, par3);
		}
	}

	/**
	 * Get method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * String describing subobject info, MAX_ID_NAME-2<h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public void setParsubstr(CArrayFacade<Byte> parsubstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 152;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
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
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 220);
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
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 220, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
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
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 224, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public CPointer<BlenderObject> getProxy_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if ob->proxy (or proxy_group), this object is proxy for object ob->proxy
	 * @see #__DNA__FIELD__proxy_group
	 */
	
	public void setProxy_group(CPointer<BlenderObject> proxy_group) throws IOException
	{
		long __address = ((proxy_group == null) ? 0 : proxy_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 228, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
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
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 232, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 236);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system, deprecated for 2.5.<br/>@depricated<h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 236, __address);
		}
	}

	/**
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public CPointer<bAction> getAction() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * old animation system. @depricated<h4>Blender Source Code:</h4>
	 * <p> struct {@link Path}  *path; </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CPointer<bAction> action) throws IOException
	{
		long __address = ((action == null) ? 0 : action.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 244);
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
			__io__block.writeLong(__io__address + 320, __address);
		} else {
			__io__block.writeLong(__io__address + 244, __address);
		}
	}

	/**
	 * Get method for struct member 'pose'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pose data, armature objects only<h4>Blender Python API:</h4>
	 * (read-only)    Current pose for armatures<h4>Blender Source Code:</h4>
	 * <p> Pose data, armature objects only. </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public CPointer<bPose> getPose() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
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
	 * <p> Pose data, armature objects only. </p>
	 * @see #__DNA__FIELD__pose
	 */
	
	public void setPose(CPointer<bPose> pose) throws IOException
	{
		long __address = ((pose == null) ? 0 : pose.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 328, __address);
		} else {
			__io__block.writeLong(__io__address + 248, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * pointer to objects data - an 'ID' or NULL<h4>Blender Python API:</h4>
	 * Object data<h4>Blender Source Code:</h4>
	 * <p> Pointer to objects data - an '{@link ID} ' or NULL. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
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
	 * <p> Pointer to objects data - an '{@link ID} ' or NULL. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Grease Pencil data<h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
	 * <p> Settings for visualization of object-transform animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public bAnimVizSettings getAvs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bAnimVizSettings(__io__address + 352, __io__block, __io__blockTable);
		} else {
			return new bAnimVizSettings(__io__address + 260, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for visualization of object-transform animation<h4>Blender Source Code:</h4>
	 * <p> Settings for visualization of object-transform animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public void setAvs(bAnimVizSettings avs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 352;
		} else {
			__dna__offset = 260;
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
	 * <p> Motion path cache for this object. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public CPointer<bMotionPath> getMpath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 292);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bMotionPath.class};
		return new CPointer<bMotionPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bMotionPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * motion path cache for this object<h4>Blender Source Code:</h4>
	 * <p> Motion path cache for this object. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public void setMpath(CPointer<bMotionPath> mpath) throws IOException
	{
		long __address = ((mpath == null) ? 0 : mpath.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 292, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
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
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
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
			return new ListBase(__io__address + 400, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 300, __io__block, __io__blockTable);
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
			__dna__offset = 400;
		} else {
			__dna__offset = 300;
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
			return new ListBase(__io__address + 416, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 308, __io__block, __io__blockTable);
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
			__dna__offset = 416;
		} else {
			__dna__offset = 308;
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
	 * <p> List of {@link bDeformGroup}  (vertex groups) names and flag only. </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public ListBase getDefbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 432, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 316, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of bDeformGroup (vertex groups) names and flag only<h4>Blender Source Code:</h4>
	 * <p> List of {@link bDeformGroup}  (vertex groups) names and flag only. </p>
	 * @see #__DNA__FIELD__defbase
	 */
	
	public void setDefbase(ListBase defbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 432;
		} else {
			__dna__offset = 316;
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
	 * <p> List of {@link ModifierData}  structures. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 448, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 324, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * list of ModifierData structures<h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the geometric data of the object<h4>Blender Source Code:</h4>
	 * <p> List of {@link ModifierData}  structures. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 448;
		} else {
			__dna__offset = 324;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> List of {@link GpencilModifierData}  structures. </p>
	 * @see #__DNA__FIELD__greasepencil_modifiers
	 */
	
	public ListBase getGreasepencil_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 464, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 332, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'greasepencil_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of {@link GpencilModifierData}  structures. </p>
	 * @see #__DNA__FIELD__greasepencil_modifiers
	 */
	
	public void setGreasepencil_modifiers(ListBase greasepencil_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 332;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> List of facemaps. </p>
	 * @see #__DNA__FIELD__fmaps
	 */
	
	public ListBase getFmaps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 480, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 340, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fmaps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of facemaps. </p>
	 * @see #__DNA__FIELD__fmaps
	 */
	
	public void setFmaps(ListBase fmaps) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 480;
		} else {
			__dna__offset = 340;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> List of viewport effects. Actually only used by grease pencil. </p>
	 * @see #__DNA__FIELD__shader_fx
	 */
	
	public ListBase getShader_fx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 496, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 348, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shader_fx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of viewport effects. Actually only used by grease pencil. </p>
	 * @see #__DNA__FIELD__shader_fx
	 */
	
	public void setShader_fx(ListBase shader_fx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 496;
		} else {
			__dna__offset = 348;
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
	 * <p> Local object mode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 512);
		} else {
			return __io__block.readInt(__io__address + 356);
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
	 * <p> Local object mode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 512, mode);
		} else {
			__io__block.writeInt(__io__address + 356, mode);
		}
	}

	/**
	 * Get method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Keep track of what mode to return to after toggling a mode
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public int getRestore_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 516);
		} else {
			return __io__block.readInt(__io__address + 360);
		}
	}

	/**
	 * Set method for struct member 'restore_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Keep track of what mode to return to after toggling a mode
	 * @see #__DNA__FIELD__restore_mode
	 */
	
	public void setRestore_mode(int restore_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 516, restore_mode);
		} else {
			__io__block.writeInt(__io__address + 360, restore_mode);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
	 * <p> materials {@link Material}  slots. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 520);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 364);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Material slots. Pointer on a list of pointers on instances of {@link Material}.<br/><b>see</b> {@link #getTotcol()}<h4>Blender Source Code:</h4>
	 * <p> materials {@link Material}  slots. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 520, __address);
		} else {
			__io__block.writeLong(__io__address + 364, __address);
		}
	}

	/**
	 * Get method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
	 * <p> A boolean field, with each byte 1 if corresponding material is linked to object. </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public CPointer<Byte> getMatbits() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 528);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'matbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * a boolean field, with each byte 1 if corresponding material is linked to object<h4>Blender Source Code:</h4>
	 * <p> A boolean field, with each byte 1 if corresponding material is linked to object. </p>
	 * @see #__DNA__FIELD__matbits
	 */
	
	public void setMatbits(CPointer<Byte> matbits) throws IOException
	{
		long __address = ((matbits == null) ? 0 : matbits.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 528, __address);
		} else {
			__io__block.writeLong(__io__address + 368, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
	 * <p> Copy of mesh, curve & meta struct member of same name (keep in sync). </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public int getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 536);
		} else {
			return __io__block.readInt(__io__address + 372);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of available material slots (see {@link #getMat()}). Copy of {@link Mesh#getTotcol()}, {@link Curve#getTotcol()} and meta struct member of same name (keep in sync).<h4>Blender Source Code:</h4>
	 * <p> Copy of mesh, curve & meta struct member of same name (keep in sync). </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(int totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 536, totcol);
		} else {
			__io__block.writeInt(__io__address + 372, totcol);
		}
	}

	/**
	 * Get method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
	 * <p> Currently selected material in the UI. </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public int getActcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 540);
		} else {
			return __io__block.readInt(__io__address + 376);
		}
	}

	/**
	 * Set method for struct member 'actcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * currently selected material slot in the UI<h4>Blender Source Code:</h4>
	 * <p> Currently selected material in the UI. </p>
	 * @see #__DNA__FIELD__actcol
	 */
	
	public void setActcol(int actcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 540, actcol);
		} else {
			__io__block.writeInt(__io__address + 376, actcol);
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
			return new CArrayFacade<Float>(__io__address + 544, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 544;
		} else {
			__dna__offset = 380;
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
			return new CArrayFacade<Float>(__io__address + 556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 556;
		} else {
			__dna__offset = 392;
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
	 * <h4>Java .Blend:</h4>
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
			return new CArrayFacade<Float>(__io__address + 568, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * size/scale of the object
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 568;
		} else {
			__dna__offset = 404;
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
			return new CArrayFacade<Float>(__io__address + 580, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p> DEPRECATED, 2.60 and older only. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dsize
	 */
	
	public void setDsize(CArrayFacade<Float> dsize) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 580;
		} else {
			__dna__offset = 416;
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
			return new CArrayFacade<Float>(__io__address + 592, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 428, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ack!, changing. </p>
	 * @see #__DNA__FIELD__dscale
	 */
	
	public void setDscale(CArrayFacade<Float> dscale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 592;
		} else {
			__dna__offset = 428;
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
	 * euler rotation<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 604, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation<h4>Blender Source Code:</h4>
	 * <p> Euler rotation. </p>
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 604;
		} else {
			__dna__offset = 440;
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
			return new CArrayFacade<Float>(__io__address + 616, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 452, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * euler rotation
	 * @see #__DNA__FIELD__drot
	 */
	
	public void setDrot(CArrayFacade<Float> drot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 616;
		} else {
			__dna__offset = 452;
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
	 * quaternion rotation<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 628, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation<h4>Blender Source Code:</h4>
	 * <p> Quaternion rotation. </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 628;
		} else {
			__dna__offset = 464;
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
			return new CArrayFacade<Float>(__io__address + 644, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dquat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * quaternion rotation
	 * @see #__DNA__FIELD__dquat
	 */
	
	public void setDquat(CArrayFacade<Float> dquat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 644;
		} else {
			__dna__offset = 480;
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
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part<h4>Blender Source Code:</h4>
	 * <p> Axis angle rotation - axis part. </p>
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public void setRotAxis(CArrayFacade<Float> rotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 660;
		} else {
			__dna__offset = 496;
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
			return new CArrayFacade<Float>(__io__address + 672, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - axis part
	 * @see #__DNA__FIELD__drotAxis
	 */
	
	public void setDrotAxis(CArrayFacade<Float> drotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 672;
		} else {
			__dna__offset = 508;
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
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
	 * <p> Axis angle rotation - angle part. </p>
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public float getRotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 684);
		} else {
			return __io__block.readFloat(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'rotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part<h4>Blender Source Code:</h4>
	 * <p> Axis angle rotation - angle part. </p>
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public void setRotAngle(float rotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 684, rotAngle);
		} else {
			__io__block.writeFloat(__io__address + 520, rotAngle);
		}
	}

	/**
	 * Get method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public float getDrotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 688);
		} else {
			return __io__block.readFloat(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'drotAngle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * axis angle rotation - angle part
	 * @see #__DNA__FIELD__drotAngle
	 */
	
	public void setDrotAngle(float drotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 688, drotAngle);
		} else {
			__io__block.writeFloat(__io__address + 524, drotAngle);
		}
	}

	/**
	 * Get method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> Final worldspace matrix with constraints & animsys applied. </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 692, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * final worldspace matrix with constraints & animsys applied<h4>Blender Source Code:</h4>
	 * <p> Final worldspace matrix with constraints & animsys applied. </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 692;
		} else {
			__dna__offset = 528;
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 756, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 592, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of parent, so that object doesn't 'stick' to parent<h4>Blender Source Code:</h4>
	 * <p> Inverse result of parent, so that object doesn't 'stick' to parent. </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public void setParentinv(CArrayFacade<CArrayFacade<Float>> parentinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 756;
		} else {
			__dna__offset = 592;
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 820, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * inverse result of constraints. doesn't include effect of parent or object local transform<h4>Blender Source Code:</h4>
	 * <p> Inverse result of constraints. doesn't include effect of parent or object local transform. </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public void setConstinv(CArrayFacade<CArrayFacade<Float>> constinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 820;
		} else {
			__dna__offset = 656;
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
	 * <p> Inverse matrix of 'obmat' for any other use than rendering!</p><p><h2>Note</h2><p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); </p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); 
	 * </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
	 * <p> Inverse matrix of 'obmat' for any other use than rendering!</p><p><h2>Note</h2><p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); </p> this isn't assured to be valid as with 'obmat', before using this value you should do... invert_m4_m4(ob->imat, ob->obmat); 
	 * </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 884;
		} else {
			__dna__offset = 720;
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
	 * <p> Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 948, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 784, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat_ren'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Cache of inverse object-view matrix calculated at runtime. Previously 'imat' was used at render time, but as other places use it too
	 * 	 							the interactive ui of 2.5 creates problems. So now only 'imat_ren' should
	 * 								be used when ever the inverse of ob->obmat * re->viewmat is needed!<h4>Blender Source Code:</h4>
	 * <p> Previously 'imat' was used at render time, but as other places use it too the interactive ui of 2.5 creates problems. So now only 'imat_ren' should be used when ever the inverse of ob->obmat * re->viewmat is needed! - jahka </p>
	 * @see #__DNA__FIELD__imat_ren
	 */
	
	public void setImat_ren(CArrayFacade<CArrayFacade<Float>> imat_ren) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 948;
		} else {
			__dna__offset = 784;
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
	 * <p> Copy of {@link Base} 's layer in the scene. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1012);
		} else {
			return __io__block.readInt(__io__address + 848);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of Base's layer in the scene<h4>Blender Source Code:</h4>
	 * <p> Copy of {@link Base} 's layer in the scene. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1012, lay);
		} else {
			__io__block.writeInt(__io__address + 848, lay);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
	 * <p> Copy of {@link Base} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1016);
		} else {
			return __io__block.readShort(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * copy of {@link Base#flag}<h4>Blender Source Code:</h4>
	 * <p> Copy of {@link Base} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1016, flag);
		} else {
			__io__block.writeShort(__io__address + 852, flag);
		}
	}

	/**
	 * Get method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p> Deprecated, use 'matbits'. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public short getColbits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1018);
		} else {
			return __io__block.readShort(__io__address + 854);
		}
	}

	/**
	 * Set method for struct member 'colbits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * @depricated<h4>Blender Source Code:</h4>
	 * <p> Deprecated, use 'matbits'. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colbits
	 */
	
	public void setColbits(short colbits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1018, colbits);
		} else {
			__io__block.writeShort(__io__address + 854, colbits);
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Transformation settings and transform locks . </p>
	 * @see #__DNA__FIELD__transflag
	 */
	
	public short getTransflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1020);
		} else {
			return __io__block.readShort(__io__address + 856);
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Transformation settings and transform locks . </p>
	 * @see #__DNA__FIELD__transflag
	 */
	
	public void setTransflag(short transflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1020, transflag);
		} else {
			__io__block.writeShort(__io__address + 856, transflag);
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
	 * 				</pre>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public short getProtectflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1022);
		} else {
			return __io__block.readShort(__io__address + 858);
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
	 * 				</pre>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public void setProtectflag(short protectflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1022, protectflag);
		} else {
			__io__block.writeShort(__io__address + 858, protectflag);
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
			return __io__block.readShort(__io__address + 1024);
		} else {
			return __io__block.readShort(__io__address + 860);
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
			__io__block.writeShort(__io__address + 1024, trackflag);
		} else {
			__io__block.writeShort(__io__address + 860, trackflag);
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
			return __io__block.readShort(__io__address + 1026);
		} else {
			return __io__block.readShort(__io__address + 862);
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
			__io__block.writeShort(__io__address + 1026, upflag);
		} else {
			__io__block.writeShort(__io__address + 862, upflag);
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
	 * <p> Used for DopeSheet filtering settings (expanded/collapsed). </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public short getNlaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1028);
		} else {
			return __io__block.readShort(__io__address + 864);
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
	 * <p> Used for DopeSheet filtering settings (expanded/collapsed). </p>
	 * @see #__DNA__FIELD__nlaflag
	 */
	
	public void setNlaflag(short nlaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1028, nlaflag);
		} else {
			__io__block.writeShort(__io__address + 864, nlaflag);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public byte get_pad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1030);
		} else {
			return __io__block.readByte(__io__address + 866);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(byte _pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1030, _pad1);
		} else {
			__io__block.writeByte(__io__address + 866, _pad1);
		}
	}

	/**
	 * Get method for struct member 'duplicator_visibility_flag'.
	 * @see #__DNA__FIELD__duplicator_visibility_flag
	 */
	
	public byte getDuplicator_visibility_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1031);
		} else {
			return __io__block.readByte(__io__address + 867);
		}
	}

	/**
	 * Set method for struct member 'duplicator_visibility_flag'.
	 * @see #__DNA__FIELD__duplicator_visibility_flag
	 */
	
	public void setDuplicator_visibility_flag(byte duplicator_visibility_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1031, duplicator_visibility_flag);
		} else {
			__io__block.writeByte(__io__address + 867, duplicator_visibility_flag);
		}
	}

	/**
	 * Get method for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Depsgraph Used by depsgraph, flushed from base. </p>
	 * @see #__DNA__FIELD__base_flag
	 */
	
	public short getBase_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1032);
		} else {
			return __io__block.readShort(__io__address + 868);
		}
	}

	/**
	 * Set method for struct member 'base_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Depsgraph Used by depsgraph, flushed from base. </p>
	 * @see #__DNA__FIELD__base_flag
	 */
	
	public void setBase_flag(short base_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1032, base_flag);
		} else {
			__io__block.writeShort(__io__address + 868, base_flag);
		}
	}

	/**
	 * Get method for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by viewport, synced from base. </p>
	 * @see #__DNA__FIELD__base_local_view_bits
	 */
	
	public short getBase_local_view_bits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1034);
		} else {
			return __io__block.readShort(__io__address + 870);
		}
	}

	/**
	 * Set method for struct member 'base_local_view_bits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by viewport, synced from base. </p>
	 * @see #__DNA__FIELD__base_local_view_bits
	 */
	
	public void setBase_local_view_bits(short base_local_view_bits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1034, base_local_view_bits);
		} else {
			__io__block.writeShort(__io__address + 870, base_local_view_bits);
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
			return __io__block.readShort(__io__address + 1036);
		} else {
			return __io__block.readShort(__io__address + 872);
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
			__io__block.writeShort(__io__address + 1036, col_group);
		} else {
			__io__block.writeShort(__io__address + 872, col_group);
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
			return __io__block.readShort(__io__address + 1038);
		} else {
			return __io__block.readShort(__io__address + 874);
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
			__io__block.writeShort(__io__address + 1038, col_mask);
		} else {
			__io__block.writeShort(__io__address + 874, col_mask);
		}
	}

	/**
	 * Get method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> Rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations.... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public short getRotmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1040);
		} else {
			return __io__block.readShort(__io__address + 876);
		}
	}

	/**
	 * Set method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * rotation mode - uses defines set out in DNA_action_types.h for PoseChannel rotations...<h4>Blender Source Code:</h4>
	 * <p> Rotation mode - uses defines set out in {@link DNA_action_types.h}  for PoseChannel rotations.... </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public void setRotmode(short rotmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1040, rotmode);
		} else {
			__io__block.writeShort(__io__address + 876, rotmode);
		}
	}

	/**
	 * Get method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
	 * <p> Bounding box use for drawing. </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public byte getBoundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1042);
		} else {
			return __io__block.readByte(__io__address + 878);
		}
	}

	/**
	 * Set method for struct member 'boundtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * bounding box use for drawing<h4>Blender Source Code:</h4>
	 * <p> Bounding box use for drawing. </p>
	 * @see #__DNA__FIELD__boundtype
	 */
	
	public void setBoundtype(byte boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1042, boundtype);
		} else {
			__io__block.writeByte(__io__address + 878, boundtype);
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
	 * <p> Bounding box type used for collision. </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public byte getCollision_boundtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1043);
		} else {
			return __io__block.readByte(__io__address + 879);
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
	 * <p> Bounding box type used for collision. </p>
	 * @see #__DNA__FIELD__collision_boundtype
	 */
	
	public void setCollision_boundtype(byte collision_boundtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1043, collision_boundtype);
		} else {
			__io__block.writeByte(__io__address + 879, collision_boundtype);
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
	 * <p> Viewport draw extra settings. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public short getDtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1044);
		} else {
			return __io__block.readShort(__io__address + 880);
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
	 * <p> Viewport draw extra settings. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public void setDtx(short dtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1044, dtx);
		} else {
			__io__block.writeShort(__io__address + 880, dtx);
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
	 * <p> Viewport draw type. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public byte getDt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1046);
		} else {
			return __io__block.readByte(__io__address + 882);
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
	 * <p> Viewport draw type. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public void setDt(byte dt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1046, dt);
		} else {
			__io__block.writeByte(__io__address + 882, dt);
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
			return __io__block.readByte(__io__address + 1047);
		} else {
			return __io__block.readByte(__io__address + 883);
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
			__io__block.writeByte(__io__address + 1047, empty_drawtype);
		} else {
			__io__block.writeByte(__io__address + 883, empty_drawtype);
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
			return __io__block.readFloat(__io__address + 1048);
		} else {
			return __io__block.readFloat(__io__address + 884);
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
			__io__block.writeFloat(__io__address + 1048, empty_drawsize);
		} else {
			__io__block.writeFloat(__io__address + 884, empty_drawsize);
		}
	}

	/**
	 * Get method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dupliface scale
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public float getDupfacesca() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1052);
		} else {
			return __io__block.readFloat(__io__address + 888);
		}
	}

	/**
	 * Set method for struct member 'dupfacesca'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * dupliface scale
	 * @see #__DNA__FIELD__dupfacesca
	 */
	
	public void setDupfacesca(float dupfacesca) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1052, dupfacesca);
		} else {
			__io__block.writeFloat(__io__address + 888, dupfacesca);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> Custom index, for renderpasses. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1056);
		} else {
			return __io__block.readShort(__io__address + 892);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * custom index, for renderpasses<h4>Blender Source Code:</h4>
	 * <p> Custom index, for renderpasses. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1056, index);
		} else {
			__io__block.writeShort(__io__address + 892, index);
		}
	}

	/**
	 * Get method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> Current deformation group, note: index starts at 1. </p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public short getActdef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1058);
		} else {
			return __io__block.readShort(__io__address + 894);
		}
	}

	/**
	 * Set method for struct member 'actdef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current deformation group, note: index starts at 1<h4>Blender Source Code:</h4>
	 * <p> Current deformation group, note: index starts at 1. </p>
	 * @see #__DNA__FIELD__actdef
	 */
	
	public void setActdef(short actdef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1058, actdef);
		} else {
			__io__block.writeShort(__io__address + 894, actdef);
		}
	}

	/**
	 * Get method for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current face map, note: index starts at 1. </p>
	 * @see #__DNA__FIELD__actfmap
	 */
	
	public short getActfmap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1060);
		} else {
			return __io__block.readShort(__io__address + 896);
		}
	}

	/**
	 * Set method for struct member 'actfmap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current face map, note: index starts at 1. </p>
	 * @see #__DNA__FIELD__actfmap
	 */
	
	public void setActfmap(short actfmap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1060, actfmap);
		} else {
			__io__block.writeShort(__io__address + 896, actfmap);
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
			return new CArrayFacade<Byte>(__io__address + 1062, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 898, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1062;
		} else {
			__dna__offset = 898;
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
	 * <h4>Java .Blend:</h4>
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
			return new CArrayFacade<Float>(__io__address + 1064, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 900, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object color
	 * @see #__DNA__FIELD__col
	 */
	
	public void setCol(CArrayFacade<Float> col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1064;
		} else {
			__dna__offset = 900;
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
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
	 * <p> Softbody settings. </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public short getSoftflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1080);
		} else {
			return __io__block.readShort(__io__address + 916);
		}
	}

	/**
	 * Set method for struct member 'softflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * softbody settings<h4>Blender Source Code:</h4>
	 * <p> Softbody settings. </p>
	 * @see #__DNA__FIELD__softflag
	 */
	
	public void setSoftflag(short softflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1080, softflag);
		} else {
			__io__block.writeShort(__io__address + 916, softflag);
		}
	}

	/**
	 * Get method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> For restricting view, select, render etc. accessible in outliner. </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public byte getRestrictflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1082);
		} else {
			return __io__block.readByte(__io__address + 918);
		}
	}

	/**
	 * Set method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * for restricting view, select, render etc. accessible in outliner<h4>Blender Source Code:</h4>
	 * <p> For restricting view, select, render etc. accessible in outliner. </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public void setRestrictflag(byte restrictflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1082, restrictflag);
		} else {
			__io__block.writeByte(__io__address + 918, restrictflag);
		}
	}

	/**
	 * Get method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
	 * <p> Flag for pinning. </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public byte getShapeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1083);
		} else {
			return __io__block.readByte(__io__address + 919);
		}
	}

	/**
	 * Set method for struct member 'shapeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * flag for pinning<h4>Blender Source Code:</h4>
	 * <p> Flag for pinning. </p>
	 * @see #__DNA__FIELD__shapeflag
	 */
	
	public void setShapeflag(byte shapeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1083, shapeflag);
		} else {
			__io__block.writeByte(__io__address + 919, shapeflag);
		}
	}

	/**
	 * Get method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
	 * <p> Current shape key for menu or pinned. </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public short getShapenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1084);
		} else {
			return __io__block.readShort(__io__address + 920);
		}
	}

	/**
	 * Set method for struct member 'shapenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * current shape key for menu or pinned<h4>Blender Source Code:</h4>
	 * <p> Current shape key for menu or pinned. </p>
	 * @see #__DNA__FIELD__shapenr
	 */
	
	public void setShapenr(short shapenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1084, shapenr);
		} else {
			__io__block.writeShort(__io__address + 920, shapenr);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1086, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 922, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1086;
		} else {
			__dna__offset = 922;
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
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
	 * <p>{@link Object}  constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public ListBase getConstraints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1088, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 924, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object constraints<h4>Blender Python API:</h4>
	 * (read-only)    Constraints affecting the transformation of the object<h4>Blender Source Code:</h4>
	 * <p>{@link Object}  constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public void setConstraints(ListBase constraints) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1088;
		} else {
			__dna__offset = 924;
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
			return new ListBase(__io__address + 1104, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 932, __io__block, __io__blockTable);
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
			__dna__offset = 1104;
		} else {
			__dna__offset = 932;
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
			return new ListBase(__io__address + 1120, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 940, __io__block, __io__blockTable);
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
			__dna__offset = 1120;
		} else {
			__dna__offset = 940;
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
	 * <p>{@link Particle}  systems. </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public ListBase getParticlesystem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1136, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 948, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particlesystem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle systems<h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  systems. </p>
	 * @see #__DNA__FIELD__particlesystem
	 */
	
	public void setParticlesystem(ListBase particlesystem) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1136;
		} else {
			__dna__offset = 948;
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
	 * <p>{@link Particle}  deflector/attractor/collision data. </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public CPointer<PartDeflect> getPd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 956);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartDeflect.class};
		return new CPointer<PartDeflect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartDeflect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * particle deflector/attractor/collision data<h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  deflector/attractor/collision data. </p>
	 * @see #__DNA__FIELD__pd
	 */
	
	public void setPd(CPointer<PartDeflect> pd) throws IOException
	{
		long __address = ((pd == null) ? 0 : pd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1152, __address);
		} else {
			__io__block.writeLong(__io__address + 956, __address);
		}
	}

	/**
	 * Get method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
	 * <p> If exists, saved in file. </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public CPointer<SoftBody> getSoft() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 960);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SoftBody.class};
		return new CPointer<SoftBody>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SoftBody.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'soft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if exists, saved in file<h4>Blender Source Code:</h4>
	 * <p> If exists, saved in file. </p>
	 * @see #__DNA__FIELD__soft
	 */
	
	public void setSoft(CPointer<SoftBody> soft) throws IOException
	{
		long __address = ((soft == null) ? 0 : soft.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1160, __address);
		} else {
			__io__block.writeLong(__io__address + 960, __address);
		}
	}

	/**
	 * Get method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object duplicator for group
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public CPointer<Collection> getDup_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 964);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dup_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * object duplicator for group
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public void setDup_group(CPointer<Collection> dup_group) throws IOException
	{
		long __address = ((dup_group == null) ? 0 : dup_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1168, __address);
		} else {
			__io__block.writeLong(__io__address + 964, __address);
		}
	}

	/**
	 * Get method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> If fluidsim enabled, store additional settings. </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public CPointer<FluidsimSettings> getFluidsimSettings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 968);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidsimSettings.class};
		return new CPointer<FluidsimSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidsimSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluidsimSettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * if fluidsim enabled, store additional settings<h4>Blender Source Code:</h4>
	 * <p> If fluidsim enabled, store additional settings. </p>
	 * @see #__DNA__FIELD__fluidsimSettings
	 */
	
	public void setFluidsimSettings(CPointer<FluidsimSettings> fluidsimSettings) throws IOException
	{
		long __address = ((fluidsimSettings == null) ? 0 : fluidsimSettings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1176, __address);
		} else {
			__io__block.writeLong(__io__address + 968, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 972);
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
			__io__block.writeLong(__io__address + 1184, __address);
		} else {
			__io__block.writeLong(__io__address + 972, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 976);
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
			__io__block.writeLong(__io__address + 1192, __address);
		} else {
			__io__block.writeLong(__io__address + 976, __address);
		}
	}

	/**
	 * Get method for struct member 'pc_ids'.
	 * @see #__DNA__FIELD__pc_ids
	 */
	
	public ListBase getPc_ids() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1200, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 980, __io__block, __io__blockTable);
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
			__dna__offset = 1200;
		} else {
			__dna__offset = 980;
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
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
	 * <p> Settings for Bullet rigid body. </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public CPointer<RigidBodyOb> getRigidbody_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 988);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyOb.class};
		return new CPointer<RigidBodyOb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyOb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet rigid body<h4>Blender Source Code:</h4>
	 * <p> Settings for Bullet rigid body. </p>
	 * @see #__DNA__FIELD__rigidbody_object
	 */
	
	public void setRigidbody_object(CPointer<RigidBodyOb> rigidbody_object) throws IOException
	{
		long __address = ((rigidbody_object == null) ? 0 : rigidbody_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1216, __address);
		} else {
			__io__block.writeLong(__io__address + 988, __address);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
	 * <p> Settings for Bullet constraint. </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public CPointer<RigidBodyCon> getRigidbody_constraint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 992);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyCon.class};
		return new CPointer<RigidBodyCon>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyCon.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * settings for Bullet constraint<h4>Blender Source Code:</h4>
	 * <p> Settings for Bullet constraint. </p>
	 * @see #__DNA__FIELD__rigidbody_constraint
	 */
	
	public void setRigidbody_constraint(CPointer<RigidBodyCon> rigidbody_constraint) throws IOException
	{
		long __address = ((rigidbody_constraint == null) ? 0 : rigidbody_constraint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1224, __address);
		} else {
			__io__block.writeLong(__io__address + 992, __address);
		}
	}

	/**
	 * Get method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 1232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 996, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ima_ofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset for image empties<h4>Blender Source Code:</h4>
	 * <p> Offset for image empties. </p>
	 * @see #__DNA__FIELD__ima_ofs
	 */
	
	public void setIma_ofs(CArrayFacade<Float> ima_ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1232;
		} else {
			__dna__offset = 996;
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
	 * <p> Must be non-null when object is an empty image. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public CPointer<ImageUser> getIuser() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1004);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageUser.class};
		return new CPointer<ImageUser>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageUser.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Must be non-null when object is an empty image. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(CPointer<ImageUser> iuser) throws IOException
	{
		long __address = ((iuser == null) ? 0 : iuser.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1240, __address);
		} else {
			__io__block.writeLong(__io__address + 1004, __address);
		}
	}

	/**
	 * Get method for struct member 'empty_image_visibility_flag'.
	 * @see #__DNA__FIELD__empty_image_visibility_flag
	 */
	
	public byte getEmpty_image_visibility_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1248);
		} else {
			return __io__block.readByte(__io__address + 1008);
		}
	}

	/**
	 * Set method for struct member 'empty_image_visibility_flag'.
	 * @see #__DNA__FIELD__empty_image_visibility_flag
	 */
	
	public void setEmpty_image_visibility_flag(byte empty_image_visibility_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1248, empty_image_visibility_flag);
		} else {
			__io__block.writeByte(__io__address + 1008, empty_image_visibility_flag);
		}
	}

	/**
	 * Get method for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determine which other objects will occlude the image
	 * @see #__DNA__FIELD__empty_image_depth
	 */
	
	public byte getEmpty_image_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1249);
		} else {
			return __io__block.readByte(__io__address + 1009);
		}
	}

	/**
	 * Set method for struct member 'empty_image_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determine which other objects will occlude the image
	 * @see #__DNA__FIELD__empty_image_depth
	 */
	
	public void setEmpty_image_depth(byte empty_image_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1249, empty_image_depth);
		} else {
			__io__block.writeByte(__io__address + 1009, empty_image_depth);
		}
	}

	/**
	 * Get method for struct member 'empty_image_flag'.
	 * @see #__DNA__FIELD__empty_image_flag
	 */
	
	public byte getEmpty_image_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1250);
		} else {
			return __io__block.readByte(__io__address + 1010);
		}
	}

	/**
	 * Set method for struct member 'empty_image_flag'.
	 * @see #__DNA__FIELD__empty_image_flag
	 */
	
	public void setEmpty_image_flag(byte empty_image_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1250, empty_image_flag);
		} else {
			__io__block.writeByte(__io__address + 1010, empty_image_flag);
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
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1251, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1011, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1251;
		} else {
			__dna__offset = 1011;
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
	 * Get method for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for levels of detail. </p>
	 * @see #__DNA__FIELD__lodlevels
	 */
	
	public ListBase getLodlevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1016, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lodlevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for levels of detail. </p>
	 * @see #__DNA__FIELD__lodlevels
	 */
	
	public void setLodlevels(ListBase lodlevels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1256;
		} else {
			__dna__offset = 1016;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1024);
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
			__io__block.writeLong(__io__address + 1272, __address);
		} else {
			__io__block.writeLong(__io__address + 1024, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1028);
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
			__io__block.writeLong(__io__address + 1280, __address);
		} else {
			__io__block.writeLong(__io__address + 1028, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Object_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Object_Runtime(__io__address + 1288, __io__block, __io__blockTable);
		} else {
			return new Object_Runtime(__io__address + 1032, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluation data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Object_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1288;
		} else {
			__dna__offset = 1032;
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
