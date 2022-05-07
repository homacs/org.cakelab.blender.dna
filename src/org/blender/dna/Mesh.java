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
 * Generated facet for DNA struct type 'Mesh'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Wrapper for referencing Objects in a Scene
 */

@CMetaData(size32=1648, size64=1888)
public class Mesh extends CFacade {

	/**
	 * This is the sdna index of the struct Mesh.
	 * <p>
	 * It is required when allocating a new block to store data for Mesh.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 71;

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
	 * <li>Actual Size (32bit/64bit): 136/176</li>
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
	public static final long[] __DNA__FIELD__adt = new long[]{136, 176};

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
	public static final long[] __DNA__FIELD__ipo = new long[]{140, 184};

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
	public static final long[] __DNA__FIELD__key = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An array of materials, with length {@link #totcol} . These can be overridden by material slots on {@link Object} . Indices in #MPoly.mat_nr control which material is used for every face. </p>
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
	public static final long[] __DNA__FIELD__mat = new long[]{148, 200};

	/**
	 * Field descriptor (offset) for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by #getVdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of vertices. Edges and faces are defined by indices into this array. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mvert = new long[]{152, 208};

	/**
	 * Field descriptor (offset) for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by #getEdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges, containing vertex indices. For simple triangle or quad meshes, edges could be calculated from the {@link MPoly}  and {@link MLoop}  arrays, however, edges need to be stored explicitly to edge domain attributes and to support loose edges that aren't connected to faces. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. </p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__medge = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Face topology storage of the size and offset of each face's section of the {@link #mloop}<code></code>  attribute. <h2>Note</h2><p> This pointer is for convenient access to the CD_MPOLY  layer in #pdata. </p> This pointer is for convenient access to the CD_MPOLY layer in #pdata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mpoly = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> The vertex and edge index at each face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mloop = new long[]{164, 232};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices ({@link MVert} ) in the mesh, and the size of #vdata. </p>
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
	public static final long[] __DNA__FIELD__totvert = new long[]{168, 240};

	/**
	 * Field descriptor (offset) for struct member 'totedge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of edges ({@link MEdge} ) in the mesh, and the size of #edata. </p>
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
	public static final long[] __DNA__FIELD__totedge = new long[]{172, 244};

	/**
	 * Field descriptor (offset) for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of polygons/faces ({@link MPoly} ) in the mesh, and the size of #pdata. </p>
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
	public static final long[] __DNA__FIELD__totpoly = new long[]{176, 248};

	/**
	 * Field descriptor (offset) for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of face corners ({@link MLoop} ) in the mesh, and the size of #ldata. </p>
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
	public static final long[] __DNA__FIELD__totloop = new long[]{180, 252};

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
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vdata = new long[]{184, 256};

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
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edata = new long[]{420, 504};

	/**
	 * Field descriptor (offset) for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing MTexPolys and {@link MPoly}s.
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
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdata = new long[]{656, 752};

	/**
	 * Field descriptor (offset) for struct member 'ldata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.
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
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ldata = new long[]{892, 1000};

	/**
	 * Field descriptor (offset) for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "Vertex group" vertices. </p>
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
	public static final long[] __DNA__FIELD__dvert = new long[]{1128, 1248};

	/**
	 * Field descriptor (offset) for struct member 'vertex_group_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of vertex group ({@link bDeformGroup} ) names and flags only. Actual weights are stored in dvert. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__vertex_group_names);
	 * CPointer&lt;ListBase&gt; p_vertex_group_names = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_group_names'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_group_names = new long[]{1132, 1256};

	/**
	 * Field descriptor (offset) for struct member 'vertex_group_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active index in the {@link #vertex_group_names}  list. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__vertex_group_active_index);
	 * CPointer&lt;Integer&gt; p_vertex_group_active_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_group_active_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_group_active_index = new long[]{1140, 1272};

	/**
	 * Field descriptor (offset) for struct member 'attributes_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The index of the active attribute in the UI. The attribute list is a combination of the generic type attributes from vertex, edge, face, and corner custom data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__attributes_active_index);
	 * CPointer&lt;Integer&gt; p_attributes_active_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attributes_active_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attributes_active_index = new long[]{1144, 1276};

	/**
	 * Field descriptor (offset) for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> 2D vector data used for UVs. "UV" data can also be stored as generic attributes in #ldata. <h2>Note</h2><p> This pointer is for convenient access to the CD_MLOOPUV  layer in #ldata. </p> This pointer is for convenient access to the CD_MLOOPUV layer in #ldata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mloopuv = new long[]{1148, 1280};

	/**
	 * Field descriptor (offset) for struct member 'mloopcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active vertex corner color layer, if it exists. Also called "Vertex Color" in Blender's UI, even though it is stored per face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mloopcol = new long[]{1152, 1288};

	/**
	 * Field descriptor (offset) for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime storage of the edit mode mesh. If it exists, it generally has the most up-to-date information about the mesh. <h2>Note</h2><p> When the object is available, the preferred access method is #BKE_editmesh_from_object. </p> When the object is available, the preferred access method is #BKE_editmesh_from_object. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__edit_mesh = new long[]{1156, 1296};

	/**
	 * Field descriptor (offset) for struct member 'mselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This array represents the selection order when the user manually picks elements in edit-mode, some tools take advantage of this information. All elements in this array are expected to be selected, see #BKE_mesh_mselect_validate which ensures this. For procedurally created meshes, this is generally empty (selections are stored as boolean attributes in the corresponding custom data). </p>
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
	public static final long[] __DNA__FIELD__mselect = new long[]{1160, 1304};

	/**
	 * Field descriptor (offset) for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see #getMselect()).<h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mselect}  array. </p>
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
	public static final long[] __DNA__FIELD__totselect = new long[]{1164, 1312};

	/**
	 * Field descriptor (offset) for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In most cases the last selected element (see {@link #mselect} ) represents the active element. For faces we make an exception and store the active face separately so it can be active even when no faces are selected. This is done to prevent flickering in the material properties and UV Editor which base the content they display on the current material which is controlled by the active face.</p><p><h2>Note</h2><p> This is mainly stored for use in edit-mode. </p> This is mainly stored for use in edit-mode. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__act_face = new long[]{1168, 1316};

	/**
	 * Field descriptor (offset) for struct member 'texcomesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An optional mesh owned elsewhere (by #Main) that can be used to override the texture space {@link #loc}  and #size. <h2>Note</h2><p> Vertex indices should be aligned for this to work usefully. </p> Vertex indices should be aligned for this to work usefully. 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__texcomesh = new long[]{1172, 1320};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture space location and size, used for procedural coordinates when rendering. </p>
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
	public static final long[] __DNA__FIELD__loc = new long[]{1176, 1328};

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
	public static final long[] __DNA__FIELD__size = new long[]{1188, 1340};

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
	 * CPointer&lt;Byte&gt; p_texflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texflag = new long[]{1200, 1352};

	/**
	 * Field descriptor (offset) for struct member 'editflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various flags used when editing the mesh. </p>
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
	public static final long[] __DNA__FIELD__editflag = new long[]{1201, 1353};

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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Mostly more flags used when editing or displaying the mesh. </p>
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
	public static final long[] __DNA__FIELD__flag = new long[]{1202, 1354};

	/**
	 * Field descriptor (offset) for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  (180 degrees) causes all edges to be smooth. </p>
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
	public static final long[] __DNA__FIELD__smoothresh = new long[]{1204, 1356};

	/**
	 * Field descriptor (offset) for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag for choosing whether or not so store bevel weight and crease as custom data layers in the edit mesh (they are always stored in {@link MVert}  and {@link MEdge}  currently). In the future, this data may be stored as generic named attributes (see T89054 and T93602). </p>
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
	public static final long[] __DNA__FIELD__cd_flag = new long[]{1208, 1360};

	/**
	 * Field descriptor (offset) for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined symmetry flag (eMeshSymmetryType ) that causes editing operations to maintain symmetrical geometry. Supported by operations such as transform and weight-painting. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__symmetry);
	 * CPointer&lt;Byte&gt; p_symmetry = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetry'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetry = new long[]{1209, 1361};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mat}  array. </p>
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
	public static final long[] __DNA__FIELD__totcol = new long[]{1210, 1362};

	/**
	 * Field descriptor (offset) for struct member 'remesh_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Choice between different remesh methods in the UI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__remesh_mode);
	 * CPointer&lt;Byte&gt; p_remesh_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remesh_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remesh_mode = new long[]{1212, 1364};

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
	public static final long[] __DNA__FIELD__subdiv = new long[]{1213, 1365};

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
	public static final long[] __DNA__FIELD__subdivr = new long[]{1214, 1366};

	/**
	 * Field descriptor (offset) for struct member 'subsurftype'.
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
	public static final long[] __DNA__FIELD__subsurftype = new long[]{1215, 1367};

	/**
	 * Field descriptor (offset) for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Store of runtime data for tessellation face UVs and texture.</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mtface = new long[]{1216, 1368};

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
	public static final long[] __DNA__FIELD__tface = new long[]{1220, 1376};

	/**
	 * Field descriptor (offset) for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Array of colors for the tessellated faces, must be number of tessellated faces * 4 in length. This is stored in {@link #fdata} , and deprecated. </p>
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
	public static final long[] __DNA__FIELD__mcol = new long[]{1224, 1384};

	/**
	 * Field descriptor (offset) for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated face storage (quads & triangles only); faces are now pointed to by {@link Mesh#mpoly}  and {@link Mesh#mloop} .</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
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
	public static final long[] __DNA__FIELD__mface = new long[]{1228, 1392};

	/**
	 * Field descriptor (offset) for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.<h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of old faces (only triangles or quads). </p>
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
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fdata = new long[]{1232, 1400};

	/**
	 * Field descriptor (offset) for struct member 'totface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated size of {@link #fdata} . </p>
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
	public static final long[] __DNA__FIELD__totface = new long[]{1468, 1648};

	/**
	 * Field descriptor (offset) for struct member 'remesh_voxel_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the voxel in object space used for volume evaluation. Lower values preserve finer details<h4>Blender Source Code:</h4>
	 * <p> Per-mesh settings for voxel remesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__remesh_voxel_size);
	 * CPointer&lt;Float&gt; p_remesh_voxel_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remesh_voxel_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remesh_voxel_size = new long[]{1472, 1652};

	/**
	 * Field descriptor (offset) for struct member 'remesh_voxel_adaptivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reduces the final face count by simplifying geometry where detail is not needed, generating triangles. A value greater than 0 disables Fix Poles
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__remesh_voxel_adaptivity);
	 * CPointer&lt;Float&gt; p_remesh_voxel_adaptivity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remesh_voxel_adaptivity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remesh_voxel_adaptivity = new long[]{1476, 1656};

	/**
	 * Field descriptor (offset) for struct member 'face_sets_color_seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__face_sets_color_seed);
	 * CPointer&lt;Integer&gt; p_face_sets_color_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_sets_color_seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_sets_color_seed = new long[]{1480, 1660};

	/**
	 * Field descriptor (offset) for struct member 'face_sets_color_default'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stores the initial Face Set to be rendered white. This way the overlay can be enabled by default and Face Sets can be used without affecting the color of the mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD__face_sets_color_default);
	 * CPointer&lt;Integer&gt; p_face_sets_color_default = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_sets_color_default'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_sets_color_default = new long[]{1484, 1664};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1488, 1668};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh mesh = ...;
	 * CPointer&lt;Object&gt; p = mesh.__dna__addressof(Mesh.__DNA__FIELD___pad2);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad2 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1492, 1672};

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
	 * <li>Actual Size (32bit/64bit): 152/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1496, 1680};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
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
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
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
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
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
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An array of materials, with length {@link #totcol} . These can be overridden by material slots on {@link Object} . Indices in #MPoly.mat_nr control which material is used for every face. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An array of materials, with length {@link #totcol} . These can be overridden by material slots on {@link Object} . Indices in #MPoly.mat_nr control which material is used for every face. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by #getVdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of vertices. Edges and faces are defined by indices into this array. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mvert
	 */
	
	public CPointer<MVert> getMvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with vertices, which is contained in a custom data layer referenced by #getVdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of vertices. Edges and faces are defined by indices into this array. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MVERT layer in #vdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mvert
	 */
	
	public void setMvert(CPointer<MVert> mvert) throws IOException
	{
		long __address = ((mvert == null) ? 0 : mvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by #getEdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges, containing vertex indices. For simple triangle or quad meshes, edges could be calculated from the {@link MPoly}  and {@link MLoop}  arrays, however, edges need to be stored explicitly to edge domain attributes and to support loose edges that aren't connected to faces. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. </p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__medge
	 */
	
	public CPointer<MEdge> getMedge() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MEdge.class};
		return new CPointer<MEdge>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MEdge.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'medge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with edges, which is contained in a custom data layer referenced by #getEdata()]</p><h4>Blender Source Code:</h4>
	 * <p> Array of edges, containing vertex indices. For simple triangle or quad meshes, edges could be calculated from the {@link MPoly}  and {@link MLoop}  arrays, however, edges need to be stored explicitly to edge domain attributes and to support loose edges that aren't connected to faces. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. </p> This pointer is for convenient access to the #CD_MEDGE layer in #edata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__medge
	 */
	
	public void setMedge(CPointer<MEdge> medge) throws IOException
	{
		long __address = ((medge == null) ? 0 : medge.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Face topology storage of the size and offset of each face's section of the {@link #mloop}<code></code>  attribute. <h2>Note</h2><p> This pointer is for convenient access to the CD_MPOLY  layer in #pdata. </p> This pointer is for convenient access to the CD_MPOLY layer in #pdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mpoly
	 */
	
	public CPointer<MPoly> getMpoly() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MPoly.class};
		return new CPointer<MPoly>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MPoly.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Face topology storage of the size and offset of each face's section of the {@link #mloop}<code></code>  attribute. <h2>Note</h2><p> This pointer is for convenient access to the CD_MPOLY  layer in #pdata. </p> This pointer is for convenient access to the CD_MPOLY layer in #pdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mpoly
	 */
	
	public void setMpoly(CPointer<MPoly> mpoly) throws IOException
	{
		long __address = ((mpoly == null) ? 0 : mpoly.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> The vertex and edge index at each face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloop
	 */
	
	public CPointer<MLoop> getMloop() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoop.class};
		return new CPointer<MLoop>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoop.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with loops, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> The vertex and edge index at each face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOP layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloop
	 */
	
	public void setMloop(CPointer<MLoop> mloop) throws IOException
	{
		long __address = ((mloop == null) ? 0 : mloop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices ({@link MVert} ) in the mesh, and the size of #vdata. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices ({@link MVert} ) in the mesh, and the size of #vdata. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, totvert);
		} else {
			__io__block.writeInt(__io__address + 168, totvert);
		}
	}

	/**
	 * Get method for struct member 'totedge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of edges ({@link MEdge} ) in the mesh, and the size of #edata. </p>
	 * @see #__DNA__FIELD__totedge
	 */
	
	public int getTotedge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'totedge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of edges ({@link MEdge} ) in the mesh, and the size of #edata. </p>
	 * @see #__DNA__FIELD__totedge
	 */
	
	public void setTotedge(int totedge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, totedge);
		} else {
			__io__block.writeInt(__io__address + 172, totedge);
		}
	}

	/**
	 * Get method for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of polygons/faces ({@link MPoly} ) in the mesh, and the size of #pdata. </p>
	 * @see #__DNA__FIELD__totpoly
	 */
	
	public int getTotpoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'totpoly'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of polygons/faces ({@link MPoly} ) in the mesh, and the size of #pdata. </p>
	 * @see #__DNA__FIELD__totpoly
	 */
	
	public void setTotpoly(int totpoly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, totpoly);
		} else {
			__io__block.writeInt(__io__address + 176, totpoly);
		}
	}

	/**
	 * Get method for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of face corners ({@link MLoop} ) in the mesh, and the size of #ldata. </p>
	 * @see #__DNA__FIELD__totloop
	 */
	
	public int getTotloop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of face corners ({@link MLoop} ) in the mesh, and the size of #ldata. </p>
	 * @see #__DNA__FIELD__totloop
	 */
	
	public void setTotloop(int totloop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, totloop);
		} else {
			__io__block.writeInt(__io__address + 180, totloop);
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
			return new CustomData(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 184, __io__block, __io__blockTable);
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
			__dna__offset = 256;
		} else {
			__dna__offset = 184;
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
			return new CustomData(__io__address + 504, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 420, __io__block, __io__blockTable);
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
			__dna__offset = 504;
		} else {
			__dna__offset = 420;
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
	 * Get method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing MTexPolys and {@link MPoly}s.
	 * @see #__DNA__FIELD__pdata
	 */
	
	public CustomData getPdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 752, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 656, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing MTexPolys and {@link MPoly}s.
	 * @see #__DNA__FIELD__pdata
	 */
	
	public void setPdata(CustomData pdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 752;
		} else {
			__dna__offset = 656;
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
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.
	 * @see #__DNA__FIELD__ldata
	 */
	
	public CustomData getLdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 1000, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 892, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ldata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MLoopUV}s and {@link MLoop}s.
	 * @see #__DNA__FIELD__ldata
	 */
	
	public void setLdata(CustomData ldata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1000;
		} else {
			__dna__offset = 892;
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
	 * Get method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "Vertex group" vertices. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public CPointer<MDeformVert> getDvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformVert.class};
		return new CPointer<MDeformVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "Vertex group" vertices. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public void setDvert(CPointer<MDeformVert> dvert) throws IOException
	{
		long __address = ((dvert == null) ? 0 : dvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1248, __address);
		} else {
			__io__block.writeLong(__io__address + 1128, __address);
		}
	}

	/**
	 * Get method for struct member 'vertex_group_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of vertex group ({@link bDeformGroup} ) names and flags only. Actual weights are stored in dvert. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__vertex_group_names
	 */
	
	public ListBase getVertex_group_names() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1132, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_group_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of vertex group ({@link bDeformGroup} ) names and flags only. Actual weights are stored in dvert. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. </p> This pointer is for convenient access to the #CD_MDEFORMVERT layer in #vdata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__vertex_group_names
	 */
	
	public void setVertex_group_names(ListBase vertex_group_names) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1256;
		} else {
			__dna__offset = 1132;
		}
		if (__io__equals(vertex_group_names, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_group_names)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_group_names);
		} else {
			__io__generic__copy( getVertex_group_names(), vertex_group_names);
		}
	}

	/**
	 * Get method for struct member 'vertex_group_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active index in the {@link #vertex_group_names}  list. </p>
	 * @see #__DNA__FIELD__vertex_group_active_index
	 */
	
	public int getVertex_group_active_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1272);
		} else {
			return __io__block.readInt(__io__address + 1140);
		}
	}

	/**
	 * Set method for struct member 'vertex_group_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active index in the {@link #vertex_group_names}  list. </p>
	 * @see #__DNA__FIELD__vertex_group_active_index
	 */
	
	public void setVertex_group_active_index(int vertex_group_active_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1272, vertex_group_active_index);
		} else {
			__io__block.writeInt(__io__address + 1140, vertex_group_active_index);
		}
	}

	/**
	 * Get method for struct member 'attributes_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The index of the active attribute in the UI. The attribute list is a combination of the generic type attributes from vertex, edge, face, and corner custom data. </p>
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public int getAttributes_active_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1276);
		} else {
			return __io__block.readInt(__io__address + 1144);
		}
	}

	/**
	 * Set method for struct member 'attributes_active_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The index of the active attribute in the UI. The attribute list is a combination of the generic type attributes from vertex, edge, face, and corner custom data. </p>
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public void setAttributes_active_index(int attributes_active_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1276, attributes_active_index);
		} else {
			__io__block.writeInt(__io__address + 1144, attributes_active_index);
		}
	}

	/**
	 * Get method for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> 2D vector data used for UVs. "UV" data can also be stored as generic attributes in #ldata. <h2>Note</h2><p> This pointer is for convenient access to the CD_MLOOPUV  layer in #ldata. </p> This pointer is for convenient access to the CD_MLOOPUV layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloopuv
	 */
	
	public CPointer<MLoopUV> getMloopuv() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopUV.class};
		return new CPointer<MLoopUV>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopUV.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloopuv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <p>pointer on array with UV coordinates, which is contained in a custom data layer referenced by #getLdata()]</p><h4>Blender Source Code:</h4>
	 * <p> 2D vector data used for UVs. "UV" data can also be stored as generic attributes in #ldata. <h2>Note</h2><p> This pointer is for convenient access to the CD_MLOOPUV  layer in #ldata. </p> This pointer is for convenient access to the CD_MLOOPUV layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloopuv
	 */
	
	public void setMloopuv(CPointer<MLoopUV> mloopuv) throws IOException
	{
		long __address = ((mloopuv == null) ? 0 : mloopuv.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1280, __address);
		} else {
			__io__block.writeLong(__io__address + 1148, __address);
		}
	}

	/**
	 * Get method for struct member 'mloopcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active vertex corner color layer, if it exists. Also called "Vertex Color" in Blender's UI, even though it is stored per face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloopcol
	 */
	
	public CPointer<MLoopCol> getMloopcol() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopCol.class};
		return new CPointer<MLoopCol>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopCol.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mloopcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The active vertex corner color layer, if it exists. Also called "Vertex Color" in Blender's UI, even though it is stored per face corner. <h2>Note</h2><p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. </p> This pointer is for convenient access to the #CD_MLOOPCOL layer in #ldata. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mloopcol
	 */
	
	public void setMloopcol(CPointer<MLoopCol> mloopcol) throws IOException
	{
		long __address = ((mloopcol == null) ? 0 : mloopcol.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1288, __address);
		} else {
			__io__block.writeLong(__io__address + 1152, __address);
		}
	}

	/**
	 * Get method for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime storage of the edit mode mesh. If it exists, it generally has the most up-to-date information about the mesh. <h2>Note</h2><p> When the object is available, the preferred access method is #BKE_editmesh_from_object. </p> When the object is available, the preferred access method is #BKE_editmesh_from_object. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__edit_mesh
	 */
	
	public CPointer<Object> getEdit_mesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edit_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime storage of the edit mode mesh. If it exists, it generally has the most up-to-date information about the mesh. <h2>Note</h2><p> When the object is available, the preferred access method is #BKE_editmesh_from_object. </p> When the object is available, the preferred access method is #BKE_editmesh_from_object. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__edit_mesh
	 */
	
	public void setEdit_mesh(CPointer<Object> edit_mesh) throws IOException
	{
		long __address = ((edit_mesh == null) ? 0 : edit_mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1296, __address);
		} else {
			__io__block.writeLong(__io__address + 1156, __address);
		}
	}

	/**
	 * Get method for struct member 'mselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This array represents the selection order when the user manually picks elements in edit-mode, some tools take advantage of this information. All elements in this array are expected to be selected, see #BKE_mesh_mselect_validate which ensures this. For procedurally created meshes, this is generally empty (selections are stored as boolean attributes in the corresponding custom data). </p>
	 * @see #__DNA__FIELD__mselect
	 */
	
	public CPointer<MSelect> getMselect() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MSelect.class};
		return new CPointer<MSelect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MSelect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This array represents the selection order when the user manually picks elements in edit-mode, some tools take advantage of this information. All elements in this array are expected to be selected, see #BKE_mesh_mselect_validate which ensures this. For procedurally created meshes, this is generally empty (selections are stored as boolean attributes in the corresponding custom data). </p>
	 * @see #__DNA__FIELD__mselect
	 */
	
	public void setMselect(CPointer<MSelect> mselect) throws IOException
	{
		long __address = ((mselect == null) ? 0 : mselect.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1304, __address);
		} else {
			__io__block.writeLong(__io__address + 1160, __address);
		}
	}

	/**
	 * Get method for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see #getMselect()).<h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mselect}  array. </p>
	 * @see #__DNA__FIELD__totselect
	 */
	
	public int getTotselect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1312);
		} else {
			return __io__block.readInt(__io__address + 1164);
		}
	}

	/**
	 * Set method for struct member 'totselect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of entries in mselect (see #getMselect()).<h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mselect}  array. </p>
	 * @see #__DNA__FIELD__totselect
	 */
	
	public void setTotselect(int totselect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1312, totselect);
		} else {
			__io__block.writeInt(__io__address + 1164, totselect);
		}
	}

	/**
	 * Get method for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In most cases the last selected element (see {@link #mselect} ) represents the active element. For faces we make an exception and store the active face separately so it can be active even when no faces are selected. This is done to prevent flickering in the material properties and UV Editor which base the content they display on the current material which is controlled by the active face.</p><p><h2>Note</h2><p> This is mainly stored for use in edit-mode. </p> This is mainly stored for use in edit-mode. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__act_face
	 */
	
	public int getAct_face() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1316);
		} else {
			return __io__block.readInt(__io__address + 1168);
		}
	}

	/**
	 * Set method for struct member 'act_face'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In most cases the last selected element (see {@link #mselect} ) represents the active element. For faces we make an exception and store the active face separately so it can be active even when no faces are selected. This is done to prevent flickering in the material properties and UV Editor which base the content they display on the current material which is controlled by the active face.</p><p><h2>Note</h2><p> This is mainly stored for use in edit-mode. </p> This is mainly stored for use in edit-mode. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__act_face
	 */
	
	public void setAct_face(int act_face) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1316, act_face);
		} else {
			__io__block.writeInt(__io__address + 1168, act_face);
		}
	}

	/**
	 * Get method for struct member 'texcomesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An optional mesh owned elsewhere (by #Main) that can be used to override the texture space {@link #loc}  and #size. <h2>Note</h2><p> Vertex indices should be aligned for this to work usefully. </p> Vertex indices should be aligned for this to work usefully. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__texcomesh
	 */
	
	public CPointer<Mesh> getTexcomesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1320);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texcomesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An optional mesh owned elsewhere (by #Main) that can be used to override the texture space {@link #loc}  and #size. <h2>Note</h2><p> Vertex indices should be aligned for this to work usefully. </p> Vertex indices should be aligned for this to work usefully. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__texcomesh
	 */
	
	public void setTexcomesh(CPointer<Mesh> texcomesh) throws IOException
	{
		long __address = ((texcomesh == null) ? 0 : texcomesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1320, __address);
		} else {
			__io__block.writeLong(__io__address + 1172, __address);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture space location and size, used for procedural coordinates when rendering. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture space location and size, used for procedural coordinates when rendering. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1328;
		} else {
			__dna__offset = 1176;
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
			return new CArrayFacade<Float>(__io__address + 1340, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1340;
		} else {
			__dna__offset = 1188;
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
	 * Get method for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_AUTOSPACE = 1
	 * 				</pre>
	 * @see #__DNA__FIELD__texflag
	 */
	
	public byte getTexflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1352);
		} else {
			return __io__block.readByte(__io__address + 1200);
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
	
	public void setTexflag(byte texflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1352, texflag);
		} else {
			__io__block.writeByte(__io__address + 1200, texflag);
		}
	}

	/**
	 * Get method for struct member 'editflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various flags used when editing the mesh. </p>
	 * @see #__DNA__FIELD__editflag
	 */
	
	public byte getEditflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1353);
		} else {
			return __io__block.readByte(__io__address + 1201);
		}
	}

	/**
	 * Set method for struct member 'editflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various flags used when editing the mesh. </p>
	 * @see #__DNA__FIELD__editflag
	 */
	
	public void setEditflag(byte editflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1353, editflag);
		} else {
			__io__block.writeByte(__io__address + 1201, editflag);
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Mostly more flags used when editing or displaying the mesh. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1354);
		} else {
			return __io__block.readShort(__io__address + 1202);
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
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Mostly more flags used when editing or displaying the mesh. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1354, flag);
		} else {
			__io__block.writeShort(__io__address + 1202, flag);
		}
	}

	/**
	 * Get method for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  (180 degrees) causes all edges to be smooth. </p>
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public float getSmoothresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1356);
		} else {
			return __io__block.readFloat(__io__address + 1204);
		}
	}

	/**
	 * Set method for struct member 'smoothresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  (180 degrees) causes all edges to be smooth. </p>
	 * @see #__DNA__FIELD__smoothresh
	 */
	
	public void setSmoothresh(float smoothresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1356, smoothresh);
		} else {
			__io__block.writeFloat(__io__address + 1204, smoothresh);
		}
	}

	/**
	 * Get method for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag for choosing whether or not so store bevel weight and crease as custom data layers in the edit mesh (they are always stored in {@link MVert}  and {@link MEdge}  currently). In the future, this data may be stored as generic named attributes (see T89054 and T93602). </p>
	 * @see #__DNA__FIELD__cd_flag
	 */
	
	public byte getCd_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1360);
		} else {
			return __io__block.readByte(__io__address + 1208);
		}
	}

	/**
	 * Set method for struct member 'cd_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag for choosing whether or not so store bevel weight and crease as custom data layers in the edit mesh (they are always stored in {@link MVert}  and {@link MEdge}  currently). In the future, this data may be stored as generic named attributes (see T89054 and T93602). </p>
	 * @see #__DNA__FIELD__cd_flag
	 */
	
	public void setCd_flag(byte cd_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1360, cd_flag);
		} else {
			__io__block.writeByte(__io__address + 1208, cd_flag);
		}
	}

	/**
	 * Get method for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined symmetry flag (eMeshSymmetryType ) that causes editing operations to maintain symmetrical geometry. Supported by operations such as transform and weight-painting. </p>
	 * @see #__DNA__FIELD__symmetry
	 */
	
	public byte getSymmetry() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1361);
		} else {
			return __io__block.readByte(__io__address + 1209);
		}
	}

	/**
	 * Set method for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined symmetry flag (eMeshSymmetryType ) that causes editing operations to maintain symmetrical geometry. Supported by operations such as transform and weight-painting. </p>
	 * @see #__DNA__FIELD__symmetry
	 */
	
	public void setSymmetry(byte symmetry) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1361, symmetry);
		} else {
			__io__block.writeByte(__io__address + 1209, symmetry);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mat}  array. </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1362);
		} else {
			return __io__block.readShort(__io__address + 1210);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the {@link #mat}  array. </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1362, totcol);
		} else {
			__io__block.writeShort(__io__address + 1210, totcol);
		}
	}

	/**
	 * Get method for struct member 'remesh_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Choice between different remesh methods in the UI. </p>
	 * @see #__DNA__FIELD__remesh_mode
	 */
	
	public byte getRemesh_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1364);
		} else {
			return __io__block.readByte(__io__address + 1212);
		}
	}

	/**
	 * Set method for struct member 'remesh_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Choice between different remesh methods in the UI. </p>
	 * @see #__DNA__FIELD__remesh_mode
	 */
	
	public void setRemesh_mode(byte remesh_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1364, remesh_mode);
		} else {
			__io__block.writeByte(__io__address + 1212, remesh_mode);
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
			return __io__block.readByte(__io__address + 1365);
		} else {
			return __io__block.readByte(__io__address + 1213);
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
			__io__block.writeByte(__io__address + 1365, subdiv);
		} else {
			__io__block.writeByte(__io__address + 1213, subdiv);
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
			return __io__block.readByte(__io__address + 1366);
		} else {
			return __io__block.readByte(__io__address + 1214);
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
			__io__block.writeByte(__io__address + 1366, subdivr);
		} else {
			__io__block.writeByte(__io__address + 1214, subdivr);
		}
	}

	/**
	 * Get method for struct member 'subsurftype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subsurftype
	 */
	
	public byte getSubsurftype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1367);
		} else {
			return __io__block.readByte(__io__address + 1215);
		}
	}

	/**
	 * Set method for struct member 'subsurftype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subsurftype
	 */
	
	public void setSubsurftype(byte subsurftype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1367, subsurftype);
		} else {
			__io__block.writeByte(__io__address + 1215, subsurftype);
		}
	}

	/**
	 * Get method for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Store of runtime data for tessellation face UVs and texture.</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mtface
	 */
	
	public CPointer<MTFace> getMtface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MTFace.class};
		return new CPointer<MTFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MTFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mtface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Store of runtime data for tessellation face UVs and texture.</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mtface
	 */
	
	public void setMtface(CPointer<MTFace> mtface) throws IOException
	{
		long __address = ((mtface == null) ? 0 : mtface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1368, __address);
		} else {
			__io__block.writeLong(__io__address + 1216, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1220);
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
			__io__block.writeLong(__io__address + 1376, __address);
		} else {
			__io__block.writeLong(__io__address + 1220, __address);
		}
	}

	/**
	 * Get method for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Array of colors for the tessellated faces, must be number of tessellated faces * 4 in length. This is stored in {@link #fdata} , and deprecated. </p>
	 * @see #__DNA__FIELD__mcol
	 */
	
	public CPointer<MCol> getMcol() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1224);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MCol.class};
		return new CPointer<MCol>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MCol.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. Array of colors for the tessellated faces, must be number of tessellated faces * 4 in length. This is stored in {@link #fdata} , and deprecated. </p>
	 * @see #__DNA__FIELD__mcol
	 */
	
	public void setMcol(CPointer<MCol> mcol) throws IOException
	{
		long __address = ((mcol == null) ? 0 : mcol.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1384, __address);
		} else {
			__io__block.writeLong(__io__address + 1224, __address);
		}
	}

	/**
	 * Get method for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated face storage (quads & triangles only); faces are now pointed to by {@link Mesh#mpoly}  and {@link Mesh#mloop} .</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mface
	 */
	
	public CPointer<MFace> getMface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MFace.class};
		return new CPointer<MFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated face storage (quads & triangles only); faces are now pointed to by {@link Mesh#mpoly}  and {@link Mesh#mloop} .</p><p><h2>Note</h2><p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). </p> This would be marked deprecated, however the particles still use this at run-time for placing particles on the mesh (something which should be eventually upgraded). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__mface
	 */
	
	public void setMface(CPointer<MFace> mface) throws IOException
	{
		long __address = ((mface == null) ? 0 : mface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1392, __address);
		} else {
			__io__block.writeLong(__io__address + 1228, __address);
		}
	}

	/**
	 * Get method for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.<h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of old faces (only triangles or quads). </p>
	 * @see #__DNA__FIELD__fdata
	 */
	
	public CustomData getFdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 1400, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 1232, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Custom data layers containing {@link MFace}.<h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of old faces (only triangles or quads). </p>
	 * @see #__DNA__FIELD__fdata
	 */
	
	public void setFdata(CustomData fdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1400;
		} else {
			__dna__offset = 1232;
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
	 * Get method for struct member 'totface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated size of {@link #fdata} . </p>
	 * @see #__DNA__FIELD__totface
	 */
	
	public int getTotface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1648);
		} else {
			return __io__block.readInt(__io__address + 1468);
		}
	}

	/**
	 * Set method for struct member 'totface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated size of {@link #fdata} . </p>
	 * @see #__DNA__FIELD__totface
	 */
	
	public void setTotface(int totface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1648, totface);
		} else {
			__io__block.writeInt(__io__address + 1468, totface);
		}
	}

	/**
	 * Get method for struct member 'remesh_voxel_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the voxel in object space used for volume evaluation. Lower values preserve finer details<h4>Blender Source Code:</h4>
	 * <p> Per-mesh settings for voxel remesh. </p>
	 * @see #__DNA__FIELD__remesh_voxel_size
	 */
	
	public float getRemesh_voxel_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1652);
		} else {
			return __io__block.readFloat(__io__address + 1472);
		}
	}

	/**
	 * Set method for struct member 'remesh_voxel_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the voxel in object space used for volume evaluation. Lower values preserve finer details<h4>Blender Source Code:</h4>
	 * <p> Per-mesh settings for voxel remesh. </p>
	 * @see #__DNA__FIELD__remesh_voxel_size
	 */
	
	public void setRemesh_voxel_size(float remesh_voxel_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1652, remesh_voxel_size);
		} else {
			__io__block.writeFloat(__io__address + 1472, remesh_voxel_size);
		}
	}

	/**
	 * Get method for struct member 'remesh_voxel_adaptivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reduces the final face count by simplifying geometry where detail is not needed, generating triangles. A value greater than 0 disables Fix Poles
	 * @see #__DNA__FIELD__remesh_voxel_adaptivity
	 */
	
	public float getRemesh_voxel_adaptivity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1656);
		} else {
			return __io__block.readFloat(__io__address + 1476);
		}
	}

	/**
	 * Set method for struct member 'remesh_voxel_adaptivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reduces the final face count by simplifying geometry where detail is not needed, generating triangles. A value greater than 0 disables Fix Poles
	 * @see #__DNA__FIELD__remesh_voxel_adaptivity
	 */
	
	public void setRemesh_voxel_adaptivity(float remesh_voxel_adaptivity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1656, remesh_voxel_adaptivity);
		} else {
			__io__block.writeFloat(__io__address + 1476, remesh_voxel_adaptivity);
		}
	}

	/**
	 * Get method for struct member 'face_sets_color_seed'.
	 * @see #__DNA__FIELD__face_sets_color_seed
	 */
	
	public int getFace_sets_color_seed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1660);
		} else {
			return __io__block.readInt(__io__address + 1480);
		}
	}

	/**
	 * Set method for struct member 'face_sets_color_seed'.
	 * @see #__DNA__FIELD__face_sets_color_seed
	 */
	
	public void setFace_sets_color_seed(int face_sets_color_seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1660, face_sets_color_seed);
		} else {
			__io__block.writeInt(__io__address + 1480, face_sets_color_seed);
		}
	}

	/**
	 * Get method for struct member 'face_sets_color_default'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stores the initial Face Set to be rendered white. This way the overlay can be enabled by default and Face Sets can be used without affecting the color of the mesh. </p>
	 * @see #__DNA__FIELD__face_sets_color_default
	 */
	
	public int getFace_sets_color_default() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1664);
		} else {
			return __io__block.readInt(__io__address + 1484);
		}
	}

	/**
	 * Set method for struct member 'face_sets_color_default'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stores the initial Face Set to be rendered white. This way the overlay can be enabled by default and Face Sets can be used without affecting the color of the mesh. </p>
	 * @see #__DNA__FIELD__face_sets_color_default
	 */
	
	public void setFace_sets_color_default(int face_sets_color_default) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1664, face_sets_color_default);
		} else {
			__io__block.writeInt(__io__address + 1484, face_sets_color_default);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1668, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1668;
		} else {
			__dna__offset = 1488;
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
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CPointer<Object> get_pad2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1672);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1492);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CPointer<Object> _pad2) throws IOException
	{
		long __address = ((_pad2 == null) ? 0 : _pad2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1672, __address);
		} else {
			__io__block.writeLong(__io__address + 1492, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Mesh_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Mesh_Runtime(__io__address + 1680, __io__block, __io__blockTable);
		} else {
			return new Mesh_Runtime(__io__address + 1496, __io__block, __io__blockTable);
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
			__dna__offset = 1680;
		} else {
			__dna__offset = 1496;
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
