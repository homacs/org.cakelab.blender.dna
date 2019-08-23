package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Mesh'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Wrapper for referencing Objects in a Scene
 */

@CMetaData(size32=1360, size64=1576)
public class Mesh extends CFacade {

	/**
	 * This is the sdna index of the struct Mesh.
	 * <p>
	 * It is required when allocating a new block to store data for Mesh.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 63;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__id);
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
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__key);
	 * CPointer&lt;CPointer&lt;Key&gt;&gt; p_key = p.cast(new Class[]{CPointer.class, Key.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'Key*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{136, 184};

	/**
	 * Field descriptor (offset) for struct member 'mselect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mselect);
	 * CPointer&lt;CPointer&lt;MSelect&gt;&gt; p_mselect = p.cast(new Class[]{CPointer.class, MSelect.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mselect'</li>
	 * <li>Signature: 'MSelect*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mselect = new long[]{140, 192};

	/**
	 * Field descriptor (offset) for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY new face structures </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mpoly);
	 * CPointer&lt;CPointer&lt;MPoly&gt;&gt; p_mpoly = p.cast(new Class[]{CPointer.class, MPoly.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mpoly'</li>
	 * <li>Signature: 'MPoly*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mpoly = new long[]{144, 200};

	/**
	 * Field descriptor (offset) for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mloop);
	 * CPointer&lt;CPointer&lt;MLoop&gt;&gt; p_mloop = p.cast(new Class[]{CPointer.class, MLoop.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mloop'</li>
	 * <li>Signature: 'MLoop*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mloop = new long[]{148, 208};

	/**
	 * Field descriptor (offset) for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mloopuv);
	 * CPointer&lt;CPointer&lt;MLoopUV&gt;&gt; p_mloopuv = p.cast(new Class[]{CPointer.class, MLoopUV.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mloopuv'</li>
	 * <li>Signature: 'MLoopUV*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mloopuv = new long[]{152, 216};

	/**
	 * Field descriptor (offset) for struct member 'mloopcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mloopcol);
	 * CPointer&lt;CPointer&lt;MLoopCol&gt;&gt; p_mloopcol = p.cast(new Class[]{CPointer.class, MLoopCol.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mloopcol'</li>
	 * <li>Signature: 'MLoopCol*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mloopcol = new long[]{156, 224};

	/**
	 * Field descriptor (offset) for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY mface stores the tessellation (triangulation) of the mesh, real faces are now stored in nface. Array of mesh object mode faces for tessellation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mface);
	 * CPointer&lt;CPointer&lt;MFace&gt;&gt; p_mface = p.cast(new Class[]{CPointer.class, MFace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mface'</li>
	 * <li>Signature: 'MFace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mface = new long[]{160, 232};

	/**
	 * Field descriptor (offset) for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store tessellation face UV's and texture here. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mtface);
	 * CPointer&lt;CPointer&lt;MTFace&gt;&gt; p_mtface = p.cast(new Class[]{CPointer.class, MTFace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtface'</li>
	 * <li>Signature: 'MTFace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtface = new long[]{164, 240};

	/**
	 * Field descriptor (offset) for struct member 'tface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, use mtface. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__tface);
	 * CPointer&lt;CPointer&lt;TFace&gt;&gt; p_tface = p.cast(new Class[]{CPointer.class, TFace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tface'</li>
	 * <li>Signature: 'TFace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tface = new long[]{168, 248};

	/**
	 * Field descriptor (offset) for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by {@link #getVdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of verts. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mvert);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_mvert = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mvert'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mvert = new long[]{172, 256};

	/**
	 * Field descriptor (offset) for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by {@link #getEdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__medge);
	 * CPointer&lt;CPointer&lt;MEdge&gt;&gt; p_medge = p.cast(new Class[]{CPointer.class, MEdge.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'medge'</li>
	 * <li>Signature: 'MEdge*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__medge = new long[]{176, 264};

	/**
	 * Field descriptor (offset) for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformgroup vertices. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__dvert);
	 * CPointer&lt;CPointer&lt;MDeformVert&gt;&gt; p_dvert = p.cast(new Class[]{CPointer.class, MDeformVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dvert'</li>
	 * <li>Signature: 'MDeformVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dvert = new long[]{180, 272};

	/**
	 * Field descriptor (offset) for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of colors for the tessellated faces, must be number of tessellated faces * 4 in length </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mcol);
	 * CPointer&lt;CPointer&lt;MCol&gt;&gt; p_mcol = p.cast(new Class[]{CPointer.class, MCol.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mcol'</li>
	 * <li>Signature: 'MCol*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mcol = new long[]{184, 280};

	/**
	 * Field descriptor (offset) for struct member 'texcomesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__texcomesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_texcomesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texcomesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texcomesh = new long[]{188, 288};

	/**
	 * Field descriptor (offset) for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> When the object is available, the preferred access method is: BKE_editmesh_from_object(ob) Not saved in file!. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__edit_mesh);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_edit_mesh = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_mesh'</li>
	 * <li>Signature: 'BMEditMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_mesh = new long[]{192, 296};

	/**
	 * Field descriptor (offset) for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing vertices.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__vdata);
	 * CPointer&lt;CustomData&gt; p_vdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vdata = new long[]{196, 304};

	/**
	 * Field descriptor (offset) for struct member 'edata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing edges.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__edata);
	 * CPointer&lt;CustomData&gt; p_edata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edata = new long[]{392, 512};

	/**
	 * Field descriptor (offset) for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__fdata);
	 * CPointer&lt;CustomData&gt; p_fdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fdata = new long[]{588, 720};

	/**
	 * Field descriptor (offset) for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MTexPoly}s and {@link MPoly}s.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__pdata);
	 * CPointer&lt;CustomData&gt; p_pdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdata = new long[]{784, 928};

	/**
	 * Field descriptor (offset) for struct member 'ldata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.<h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__ldata);
	 * CPointer&lt;CustomData&gt; p_ldata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ldata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ldata = new long[]{980, 1136};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{1176, 1344};

	/**
	 * Field descriptor (offset) for struct member 'totedge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totedge);
	 * CPointer&lt;Integer&gt; p_totedge = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totedge'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totedge = new long[]{1180, 1348};

	/**
	 * Field descriptor (offset) for struct member 'totface'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totface);
	 * CPointer&lt;Integer&gt; p_totface = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totface'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totface = new long[]{1184, 1352};

	/**
	 * Field descriptor (offset) for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see {@link #getMselect()}).
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totselect);
	 * CPointer&lt;Integer&gt; p_totselect = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totselect'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totselect = new long[]{1188, 1356};

	/**
	 * Field descriptor (offset) for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totpoly);
	 * CPointer&lt;Integer&gt; p_totpoly = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoly'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoly = new long[]{1192, 1360};

	/**
	 * Field descriptor (offset) for struct member 'totloop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totloop);
	 * CPointer&lt;Integer&gt; p_totloop = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totloop'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totloop = new long[]{1196, 1364};

	/**
	 * Field descriptor (offset) for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY the last selected vertex/edge/face are used for the active face however this means the active face must always be selected, this is to keep track of the last selected face and is similar to the old active face flag where the face does not need to be selected, -1 is inactive </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__act_face);
	 * CPointer&lt;Integer&gt; p_act_face = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_face'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_face = new long[]{1200, 1368};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{1204, 1372};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{1216, 1384};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{1228, 1396};

	/**
	 * Field descriptor (offset) for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_AUTOSPACE = 1
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__texflag);
	 * CPointer&lt;Short&gt; p_texflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texflag = new long[]{1240, 1408};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * //	ME_ISDONE                  = 1 << 0, 
	 * //	ME_DEPRECATED              = 1 << 1, 
	 * 	ME_TWOSIDED                = 1 << 2,
	 * 	ME_UVEFFECT                = 1 << 3,
	 * 	ME_VCOLEFFECT              = 1 << 4,
	 * 	ME_AUTOSMOOTH              = 1 << 5,
	 * 	ME_SMESH                   = 1 << 6,
	 * 	ME_SUBSURF                 = 1 << 7,
	 * 	ME_OPT_EDGES               = 1 << 8,
	 * 	ME_DS_EXPAND               = 1 << 9,
	 * 	ME_SCULPT_DYNAMIC_TOPOLOGY = 1 << 10,
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1242, 1410};

	/**
	 * Field descriptor (offset) for struct member 'smoothresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__smoothresh);
	 * CPointer&lt;Float&gt; p_smoothresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smoothresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smoothresh = new long[]{1244, 1412};

	/**
	 * Field descriptor (offset) for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> customdata flag, for bevel-weight and crease, which are now optional </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__cd_flag);
	 * CPointer&lt;Byte&gt; p_cd_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_flag = new long[]{1248, 1416};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1249, 1417};

	/**
	 * Field descriptor (offset) for struct member 'subdiv'.
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
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__subdiv);
	 * CPointer&lt;Byte&gt; p_subdiv = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv = new long[]{1250, 1418};

	/**
	 * Field descriptor (offset) for struct member 'subdivr'.
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
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__subdivr);
	 * CPointer&lt;Byte&gt; p_subdivr = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdivr'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdivr = new long[]{1251, 1419};

	/**
	 * Field descriptor (offset) for struct member 'subsurftype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only kept for backwards compat, not used anymore. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__subsurftype);
	 * CPointer&lt;Byte&gt; p_subsurftype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurftype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurftype = new long[]{1252, 1420};

	/**
	 * Field descriptor (offset) for struct member 'editflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__editflag);
	 * CPointer&lt;Byte&gt; p_editflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editflag = new long[]{1253, 1421};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{1254, 1422};

	/**
	 * Field descriptor (offset) for struct member 'mr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated multiresolution modeling data, only keep for loading old files. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__mr);
	 * CPointer&lt;CPointer&lt;Multires&gt;&gt; p_mr = p.cast(new Class[]{CPointer.class, Multires.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mr'</li>
	 * <li>Signature: 'Multires*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mr = new long[]{1256, 1424};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1260, 1432};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__runtime);
	 * CPointer&lt;Mesh_Runtime&gt; p_runtime = p.cast(new Class[]{Mesh_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Mesh_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 96/136</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1264, 1440};

	public Mesh(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Mesh(Mesh that) {
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
	 * <h4>Blender Source Code:</h4>
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
	 * <h4>Blender Source Code:</h4>
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
	 * Get method for struct member 'bb'.
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public CPointer<Key> getKey() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Key.class};
		return new CPointer<Key>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Key.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(CPointer<Key> key) throws IOException
	{
		long __address = ((key == null) ? 0 : key.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'mselect'.
	 * @see #__DNA__FIELD__mselect
	 */
	
	public CPointer<MSelect> getMselect() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MSelect.class};
		return new CPointer<MSelect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MSelect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mselect'.
	 * @see #__DNA__FIELD__mselect
	 */
	
	public void setMselect(CPointer<MSelect> mselect) throws IOException
	{
		long __address = ((mselect == null) ? 0 : mselect.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY new face structures </p>
	 * @see #__DNA__FIELD__mpoly
	 */
	
	public CPointer<MPoly> getMpoly() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MPoly.class};
		return new CPointer<MPoly>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MPoly.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY new face structures </p>
	 * @see #__DNA__FIELD__mpoly
	 */
	
	public void setMpoly(CPointer<MPoly> mpoly) throws IOException
	{
		long __address = ((mpoly == null) ? 0 : mpoly.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * @see #__DNA__FIELD__mloop
	 */
	
	public CPointer<MLoop> getMloop() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoop.class};
		return new CPointer<MLoop>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoop.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * @see #__DNA__FIELD__mloop
	 */
	
	public void setMloop(CPointer<MLoop> mloop) throws IOException
	{
		long __address = ((mloop == null) ? 0 : mloop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * @see #__DNA__FIELD__mloopuv
	 */
	
	public CPointer<MLoopUV> getMloopuv() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopUV.class};
		return new CPointer<MLoopUV>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopUV.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by {@link #getLdata()}]</p>
	 * @see #__DNA__FIELD__mloopuv
	 */
	
	public void setMloopuv(CPointer<MLoopUV> mloopuv) throws IOException
	{
		long __address = ((mloopuv == null) ? 0 : mloopuv.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'mloopcol'.
	 * @see #__DNA__FIELD__mloopcol
	 */
	
	public CPointer<MLoopCol> getMloopcol() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopCol.class};
		return new CPointer<MLoopCol>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopCol.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloopcol'.
	 * @see #__DNA__FIELD__mloopcol
	 */
	
	public void setMloopcol(CPointer<MLoopCol> mloopcol) throws IOException
	{
		long __address = ((mloopcol == null) ? 0 : mloopcol.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY mface stores the tessellation (triangulation) of the mesh, real faces are now stored in nface. Array of mesh object mode faces for tessellation. </p>
	 * @see #__DNA__FIELD__mface
	 */
	
	public CPointer<MFace> getMface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MFace.class};
		return new CPointer<MFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY mface stores the tessellation (triangulation) of the mesh, real faces are now stored in nface. Array of mesh object mode faces for tessellation. </p>
	 * @see #__DNA__FIELD__mface
	 */
	
	public void setMface(CPointer<MFace> mface) throws IOException
	{
		long __address = ((mface == null) ? 0 : mface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store tessellation face UV's and texture here. </p>
	 * @see #__DNA__FIELD__mtface
	 */
	
	public CPointer<MTFace> getMtface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MTFace.class};
		return new CPointer<MTFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MTFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store tessellation face UV's and texture here. </p>
	 * @see #__DNA__FIELD__mtface
	 */
	
	public void setMtface(CPointer<MTFace> mtface) throws IOException
	{
		long __address = ((mtface == null) ? 0 : mtface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'tface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, use mtface. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tface
	 */
	
	public CPointer<TFace> getTface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TFace.class};
		return new CPointer<TFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, use mtface. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tface
	 */
	
	public void setTface(CPointer<TFace> tface) throws IOException
	{
		long __address = ((tface == null) ? 0 : tface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Get method for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by {@link #getVdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of verts. </p>
	 * @see #__DNA__FIELD__mvert
	 */
	
	public CPointer<MVert> getMvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by {@link #getVdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of verts. </p>
	 * @see #__DNA__FIELD__mvert
	 */
	
	public void setMvert(CPointer<MVert> mvert) throws IOException
	{
		long __address = ((mvert == null) ? 0 : mvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by {@link #getEdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges. </p>
	 * @see #__DNA__FIELD__medge
	 */
	
	public CPointer<MEdge> getMedge() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MEdge.class};
		return new CPointer<MEdge>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MEdge.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by {@link #getEdata()}]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges. </p>
	 * @see #__DNA__FIELD__medge
	 */
	
	public void setMedge(CPointer<MEdge> medge) throws IOException
	{
		long __address = ((medge == null) ? 0 : medge.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformgroup vertices. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public CPointer<MDeformVert> getDvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformVert.class};
		return new CPointer<MDeformVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformgroup vertices. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public void setDvert(CPointer<MDeformVert> dvert) throws IOException
	{
		long __address = ((dvert == null) ? 0 : dvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of colors for the tessellated faces, must be number of tessellated faces * 4 in length </p>
	 * @see #__DNA__FIELD__mcol
	 */
	
	public CPointer<MCol> getMcol() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MCol.class};
		return new CPointer<MCol>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MCol.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of colors for the tessellated faces, must be number of tessellated faces * 4 in length </p>
	 * @see #__DNA__FIELD__mcol
	 */
	
	public void setMcol(CPointer<MCol> mcol) throws IOException
	{
		long __address = ((mcol == null) ? 0 : mcol.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'texcomesh'.
	 * @see #__DNA__FIELD__texcomesh
	 */
	
	public CPointer<Mesh> getTexcomesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texcomesh'.
	 * @see #__DNA__FIELD__texcomesh
	 */
	
	public void setTexcomesh(CPointer<Mesh> texcomesh) throws IOException
	{
		long __address = ((texcomesh == null) ? 0 : texcomesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> When the object is available, the preferred access method is: BKE_editmesh_from_object(ob) Not saved in file!. </p>
	 * @see #__DNA__FIELD__edit_mesh
	 */
	
	public CPointer<Object> getEdit_mesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> When the object is available, the preferred access method is: BKE_editmesh_from_object(ob) Not saved in file!. </p>
	 * @see #__DNA__FIELD__edit_mesh
	 */
	
	public void setEdit_mesh(CPointer<Object> edit_mesh) throws IOException
	{
		long __address = ((edit_mesh == null) ? 0 : edit_mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing vertices.
	 * @see #__DNA__FIELD__vdata
	 */
	
	public CustomData getVdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 304, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 196, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing vertices.
	 * @see #__DNA__FIELD__vdata
	 */
	
	public void setVdata(CustomData vdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 196;
		}
		if (__io__equals(vdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vdata);
		} else {
			__io__generic__copy( getVdata(), vdata);
		}
	}

	/**
	 * Get method for struct member 'edata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing edges.
	 * @see #__DNA__FIELD__edata
	 */
	
	public CustomData getEdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 512, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 392, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing edges.
	 * @see #__DNA__FIELD__edata
	 */
	
	public void setEdata(CustomData edata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 512;
		} else {
			__dna__offset = 392;
		}
		if (__io__equals(edata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edata);
		} else {
			__io__generic__copy( getEdata(), edata);
		}
	}

	/**
	 * Get method for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.
	 * @see #__DNA__FIELD__fdata
	 */
	
	public CustomData getFdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 720, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 588, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.
	 * @see #__DNA__FIELD__fdata
	 */
	
	public void setFdata(CustomData fdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 720;
		} else {
			__dna__offset = 588;
		}
		if (__io__equals(fdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fdata);
		} else {
			__io__generic__copy( getFdata(), fdata);
		}
	}

	/**
	 * Get method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MTexPoly}s and {@link MPoly}s.
	 * @see #__DNA__FIELD__pdata
	 */
	
	public CustomData getPdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 928, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 784, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MTexPoly}s and {@link MPoly}s.
	 * @see #__DNA__FIELD__pdata
	 */
	
	public void setPdata(CustomData pdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 928;
		} else {
			__dna__offset = 784;
		}
		if (__io__equals(pdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pdata);
		} else {
			__io__generic__copy( getPdata(), pdata);
		}
	}

	/**
	 * Get method for struct member 'ldata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.<h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * @see #__DNA__FIELD__ldata
	 */
	
	public CustomData getLdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 1136, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 980, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ldata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.<h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * @see #__DNA__FIELD__ldata
	 */
	
	public void setLdata(CustomData ldata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1136;
		} else {
			__dna__offset = 980;
		}
		if (__io__equals(ldata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ldata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ldata);
		} else {
			__io__generic__copy( getLdata(), ldata);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1344);
		} else {
			return __io__block.readInt(__io__address + 1176);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1344, totvert);
		} else {
			__io__block.writeInt(__io__address + 1176, totvert);
		}
	}

	/**
	 * Get method for struct member 'totedge'.
	 * @see #__DNA__FIELD__totedge
	 */
	
	public int getTotedge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1348);
		} else {
			return __io__block.readInt(__io__address + 1180);
		}
	}

	/**
	 * Set method for struct member 'totedge'.
	 * @see #__DNA__FIELD__totedge
	 */
	
	public void setTotedge(int totedge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1348, totedge);
		} else {
			__io__block.writeInt(__io__address + 1180, totedge);
		}
	}

	/**
	 * Get method for struct member 'totface'.
	 * @see #__DNA__FIELD__totface
	 */
	
	public int getTotface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1352);
		} else {
			return __io__block.readInt(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'totface'.
	 * @see #__DNA__FIELD__totface
	 */
	
	public void setTotface(int totface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1352, totface);
		} else {
			__io__block.writeInt(__io__address + 1184, totface);
		}
	}

	/**
	 * Get method for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see {@link #getMselect()}).
	 * @see #__DNA__FIELD__totselect
	 */
	
	public int getTotselect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1356);
		} else {
			return __io__block.readInt(__io__address + 1188);
		}
	}

	/**
	 * Set method for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see {@link #getMselect()}).
	 * @see #__DNA__FIELD__totselect
	 */
	
	public void setTotselect(int totselect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1356, totselect);
		} else {
			__io__block.writeInt(__io__address + 1188, totselect);
		}
	}

	/**
	 * Get method for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * @see #__DNA__FIELD__totpoly
	 */
	
	public int getTotpoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1360);
		} else {
			return __io__block.readInt(__io__address + 1192);
		}
	}

	/**
	 * Set method for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BMESH ONLY </p>
	 * @see #__DNA__FIELD__totpoly
	 */
	
	public void setTotpoly(int totpoly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1360, totpoly);
		} else {
			__io__block.writeInt(__io__address + 1192, totpoly);
		}
	}

	/**
	 * Get method for struct member 'totloop'.
	 * @see #__DNA__FIELD__totloop
	 */
	
	public int getTotloop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1364);
		} else {
			return __io__block.readInt(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'totloop'.
	 * @see #__DNA__FIELD__totloop
	 */
	
	public void setTotloop(int totloop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1364, totloop);
		} else {
			__io__block.writeInt(__io__address + 1196, totloop);
		}
	}

	/**
	 * Get method for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY the last selected vertex/edge/face are used for the active face however this means the active face must always be selected, this is to keep track of the last selected face and is similar to the old active face flag where the face does not need to be selected, -1 is inactive </p>
	 * @see #__DNA__FIELD__act_face
	 */
	
	public int getAct_face() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1368);
		} else {
			return __io__block.readInt(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> END BMESH ONLY the last selected vertex/edge/face are used for the active face however this means the active face must always be selected, this is to keep track of the last selected face and is similar to the old active face flag where the face does not need to be selected, -1 is inactive </p>
	 * @see #__DNA__FIELD__act_face
	 */
	
	public void setAct_face(int act_face) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1368, act_face);
		} else {
			__io__block.writeInt(__io__address + 1200, act_face);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1372;
		} else {
			__dna__offset = 1204;
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
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1384;
		} else {
			__dna__offset = 1216;
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
	 * Get method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1396;
		} else {
			__dna__offset = 1228;
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
	 * Get method for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_AUTOSPACE = 1
	 * 				</pre>
	 * @see #__DNA__FIELD__texflag
	 */
	
	public short getTexflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1408);
		} else {
			return __io__block.readShort(__io__address + 1240);
		}
	}

	/**
	 * Set method for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_AUTOSPACE = 1
	 * 				</pre>
	 * @see #__DNA__FIELD__texflag
	 */
	
	public void setTexflag(short texflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1408, texflag);
		} else {
			__io__block.writeShort(__io__address + 1240, texflag);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * //	ME_ISDONE                  = 1 << 0, 
	 * //	ME_DEPRECATED              = 1 << 1, 
	 * 	ME_TWOSIDED                = 1 << 2,
	 * 	ME_UVEFFECT                = 1 << 3,
	 * 	ME_VCOLEFFECT              = 1 << 4,
	 * 	ME_AUTOSMOOTH              = 1 << 5,
	 * 	ME_SMESH                   = 1 << 6,
	 * 	ME_SUBSURF                 = 1 << 7,
	 * 	ME_OPT_EDGES               = 1 << 8,
	 * 	ME_DS_EXPAND               = 1 << 9,
	 * 	ME_SCULPT_DYNAMIC_TOPOLOGY = 1 << 10,
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1410);
		} else {
			return __io__block.readShort(__io__address + 1242);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * //	ME_ISDONE                  = 1 << 0, 
	 * //	ME_DEPRECATED              = 1 << 1, 
	 * 	ME_TWOSIDED                = 1 << 2,
	 * 	ME_UVEFFECT                = 1 << 3,
	 * 	ME_VCOLEFFECT              = 1 << 4,
	 * 	ME_AUTOSMOOTH              = 1 << 5,
	 * 	ME_SMESH                   = 1 << 6,
	 * 	ME_SUBSURF                 = 1 << 7,
	 * 	ME_OPT_EDGES               = 1 << 8,
	 * 	ME_DS_EXPAND               = 1 << 9,
	 * 	ME_SCULPT_DYNAMIC_TOPOLOGY = 1 << 10,
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1410, flag);
		} else {
			__io__block.writeShort(__io__address + 1242, flag);
		}
	}

	/**
	 * Get method for struct member 'smoothresh'.
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public float getSmoothresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1412);
		} else {
			return __io__block.readFloat(__io__address + 1244);
		}
	}

	/**
	 * Set method for struct member 'smoothresh'.
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public void setSmoothresh(float smoothresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1412, smoothresh);
		} else {
			__io__block.writeFloat(__io__address + 1244, smoothresh);
		}
	}

	/**
	 * Get method for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> customdata flag, for bevel-weight and crease, which are now optional </p>
	 * @see #__DNA__FIELD__cd_flag
	 */
	
	public byte getCd_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1416);
		} else {
			return __io__block.readByte(__io__address + 1248);
		}
	}

	/**
	 * Set method for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> customdata flag, for bevel-weight and crease, which are now optional </p>
	 * @see #__DNA__FIELD__cd_flag
	 */
	
	public void setCd_flag(byte cd_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1416, cd_flag);
		} else {
			__io__block.writeByte(__io__address + 1248, cd_flag);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1417);
		} else {
			return __io__block.readByte(__io__address + 1249);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1417, _pad);
		} else {
			__io__block.writeByte(__io__address + 1249, _pad);
		}
	}

	/**
	 * Get method for struct member 'subdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subdiv
	 */
	
	public byte getSubdiv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1418);
		} else {
			return __io__block.readByte(__io__address + 1250);
		}
	}

	/**
	 * Set method for struct member 'subdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subdiv
	 */
	
	public void setSubdiv(byte subdiv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1418, subdiv);
		} else {
			__io__block.writeByte(__io__address + 1250, subdiv);
		}
	}

	/**
	 * Get method for struct member 'subdivr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subdivr
	 */
	
	public byte getSubdivr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1419);
		} else {
			return __io__block.readByte(__io__address + 1251);
		}
	}

	/**
	 * Set method for struct member 'subdivr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subdivr
	 */
	
	public void setSubdivr(byte subdivr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1419, subdivr);
		} else {
			__io__block.writeByte(__io__address + 1251, subdivr);
		}
	}

	/**
	 * Get method for struct member 'subsurftype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only kept for backwards compat, not used anymore. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subsurftype
	 */
	
	public byte getSubsurftype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1420);
		} else {
			return __io__block.readByte(__io__address + 1252);
		}
	}

	/**
	 * Set method for struct member 'subsurftype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only kept for backwards compat, not used anymore. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subsurftype
	 */
	
	public void setSubsurftype(byte subsurftype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1420, subsurftype);
		} else {
			__io__block.writeByte(__io__address + 1252, subsurftype);
		}
	}

	/**
	 * Get method for struct member 'editflag'.
	 * @see #__DNA__FIELD__editflag
	 */
	
	public byte getEditflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1421);
		} else {
			return __io__block.readByte(__io__address + 1253);
		}
	}

	/**
	 * Set method for struct member 'editflag'.
	 * @see #__DNA__FIELD__editflag
	 */
	
	public void setEditflag(byte editflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1421, editflag);
		} else {
			__io__block.writeByte(__io__address + 1253, editflag);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1422);
		} else {
			return __io__block.readShort(__io__address + 1254);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1422, totcol);
		} else {
			__io__block.writeShort(__io__address + 1254, totcol);
		}
	}

	/**
	 * Get method for struct member 'mr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated multiresolution modeling data, only keep for loading old files. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__mr
	 */
	
	public CPointer<Multires> getMr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Multires.class};
		return new CPointer<Multires>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Multires.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated multiresolution modeling data, only keep for loading old files. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__mr
	 */
	
	public void setMr(CPointer<Multires> mr) throws IOException
	{
		long __address = ((mr == null) ? 0 : mr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1424, __address);
		} else {
			__io__block.writeLong(__io__address + 1256, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1432, __address);
		} else {
			__io__block.writeLong(__io__address + 1260, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Mesh_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Mesh_Runtime(__io__address + 1440, __io__block, __io__blockTable);
		} else {
			return new Mesh_Runtime(__io__address + 1264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Mesh_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1440;
		} else {
			__dna__offset = 1264;
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
	public CPointer<Mesh> __io__addressof() {
		return new CPointer<Mesh>(__io__address, new Class[]{Mesh.class}, __io__block, __io__blockTable);
	}

}
