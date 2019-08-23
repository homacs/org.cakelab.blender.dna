package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeTree'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> the basis for a Node tree, all links and nodes reside internal here only re-usable node trees are in the library though, materials and textures allocate own tree struct </p>
 */

@CMetaData(size32=344, size64=464)
public class bNodeTree extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeTree.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeTree.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 366;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__id);
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
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type information. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__typeinfo);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_typeinfo = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeinfo'</li>
	 * <li>Signature: 'bNodeTreeType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeinfo = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type identifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'interface_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime RNA type of the group interface. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__interface_type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_interface_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interface_type'</li>
	 * <li>Signature: 'StructRNA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interface_type = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{196, 240};

	/**
	 * Field descriptor (offset) for struct member 'view_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node tree stores own offset for consistent editor view. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__view_center);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_view_center = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_center'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_center = new long[]{200, 248};

	/**
	 * Field descriptor (offset) for struct member 'nodes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__nodes);
	 * CPointer&lt;ListBase&gt; p_nodes = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodes'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodes = new long[]{208, 256};

	/**
	 * Field descriptor (offset) for struct member 'links'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__links);
	 * CPointer&lt;ListBase&gt; p_links = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'links'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__links = new long[]{216, 272};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set init on fileread. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{224, 288};

	/**
	 * Field descriptor (offset) for struct member 'init'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__init);
	 * CPointer&lt;Integer&gt; p_init = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'init'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__init = new long[]{228, 292};

	/**
	 * Field descriptor (offset) for struct member 'cur_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sockets in groups have unique identifiers, adding new sockets always will increase this counter. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__cur_index);
	 * CPointer&lt;Integer&gt; p_cur_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_index = new long[]{232, 296};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{236, 300};

	/**
	 * Field descriptor (offset) for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Update flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__update);
	 * CPointer&lt;Integer&gt; p_update = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'update'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__update = new long[]{240, 304};

	/**
	 * Field descriptor (offset) for struct member 'is_updating'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag to prevent reentrant update calls. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__is_updating);
	 * CPointer&lt;Short&gt; p_is_updating = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_updating'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_updating = new long[]{244, 308};

	/**
	 * Field descriptor (offset) for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic temporary flag for recursion check (DFS/BFS). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__done);
	 * CPointer&lt;Short&gt; p_done = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'done'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__done = new long[]{246, 310};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{248, 312};

	/**
	 * Field descriptor (offset) for struct member 'nodetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Specific node type this tree is used for. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__nodetype);
	 * CPointer&lt;Integer&gt; p_nodetype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetype = new long[]{252, 316};

	/**
	 * Field descriptor (offset) for struct member 'edit_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when editing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__edit_quality);
	 * CPointer&lt;Short&gt; p_edit_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_quality = new long[]{256, 320};

	/**
	 * Field descriptor (offset) for struct member 'render_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when rendering. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__render_quality);
	 * CPointer&lt;Short&gt; p_render_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_quality = new long[]{258, 322};

	/**
	 * Field descriptor (offset) for struct member 'chunksize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tile size for compositor engine. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__chunksize);
	 * CPointer&lt;Integer&gt; p_chunksize = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chunksize'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chunksize = new long[]{260, 324};

	/**
	 * Field descriptor (offset) for struct member 'viewer_border'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__viewer_border);
	 * CPointer&lt;rctf&gt; p_viewer_border = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewer_border'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewer_border = new long[]{264, 328};

	/**
	 * Field descriptor (offset) for struct member 'inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lists of {@link bNodeSocket}  to hold default values and own_index. Warning! Don't make links to these sockets, input/output nodes are used for that. These sockets are used only for generating external interfaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__inputs);
	 * CPointer&lt;ListBase&gt; p_inputs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inputs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inputs = new long[]{280, 344};

	/**
	 * Field descriptor (offset) for struct member 'outputs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__outputs);
	 * CPointer&lt;ListBase&gt; p_outputs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outputs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outputs = new long[]{288, 360};

	/**
	 * Field descriptor (offset) for struct member 'previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node preview hash table Only available in base node trees (e.g. scene->node_tree) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__previews);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_previews = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'previews'</li>
	 * <li>Signature: 'bNodeInstanceHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__previews = new long[]{296, 376};

	/**
	 * Field descriptor (offset) for struct member 'active_viewer_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines the node tree instance to use for the "active" context, in case multiple different editors are used and make context ambiguous. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__active_viewer_key);
	 * CPointer&lt;bNodeInstanceKey&gt; p_active_viewer_key = p.cast(new Class[]{bNodeInstanceKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_viewer_key'</li>
	 * <li>Signature: 'bNodeInstanceKey'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_viewer_key = new long[]{300, 384};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{304, 388};

	/**
	 * Field descriptor (offset) for struct member 'execdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution data.</p><p> XXX It would be preferable to completely move this data out of the underlying node tree, so node tree execution could finally run independent of the tree itself. This would allow node trees to be merely linked by other data (materials, textures, etc.), as {@link ID}  data is supposed to. Execution data is generated from the tree once at execution start and can then be used as long as necessary, even while the tree is being modified. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__execdata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_execdata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'execdata'</li>
	 * <li>Signature: 'bNodeTreeExec*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__execdata = new long[]{308, 392};

	/**
	 * Field descriptor (offset) for struct member 'tbh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__tbh);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tbh = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tbh'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tbh = new long[]{328, 432};

	/**
	 * Field descriptor (offset) for struct member 'prh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__prh);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_prh = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prh'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prh = new long[]{332, 440};

	/**
	 * Field descriptor (offset) for struct member 'sdh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__sdh);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sdh = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sdh'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sdh = new long[]{336, 448};

	/**
	 * Field descriptor (offset) for struct member 'udh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeTree bnodetree = ...;
	 * CPointer&lt;Object&gt; p = bnodetree.__dna__addressof(bNodeTree.__DNA__FIELD__udh);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_udh = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'udh'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__udh = new long[]{340, 456};

	public bNodeTree(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeTree(bNodeTree that) {
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
	 * Get method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type information. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public CPointer<Object> getTypeinfo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type information. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public void setTypeinfo(CPointer<Object> typeinfo) throws IOException
	{
		long __address = ((typeinfo == null) ? 0 : typeinfo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type identifier. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime type identifier. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname);
		} else {
			__io__generic__copy( getIdname(), idname);
		}
	}

	/**
	 * Get method for struct member 'interface_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime RNA type of the group interface. </p>
	 * @see #__DNA__FIELD__interface_type
	 */
	
	public CPointer<Object> getInterface_type() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'interface_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime RNA type of the group interface. </p>
	 * @see #__DNA__FIELD__interface_type
	 */
	
	public void setInterface_type(CPointer<Object> interface_type) throws IOException
	{
		long __address = ((interface_type == null) ? 0 : interface_type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'view_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node tree stores own offset for consistent editor view. </p>
	 * @see #__DNA__FIELD__view_center
	 */
	
	public CArrayFacade<Float> getView_center() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node tree stores own offset for consistent editor view. </p>
	 * @see #__DNA__FIELD__view_center
	 */
	
	public void setView_center(CArrayFacade<Float> view_center) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(view_center, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_center)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_center);
		} else {
			__io__generic__copy( getView_center(), view_center);
		}
	}

	/**
	 * Get method for struct member 'nodes'.
	 * @see #__DNA__FIELD__nodes
	 */
	
	public ListBase getNodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodes'.
	 * @see #__DNA__FIELD__nodes
	 */
	
	public void setNodes(ListBase nodes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 208;
		}
		if (__io__equals(nodes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodes);
		} else {
			__io__generic__copy( getNodes(), nodes);
		}
	}

	/**
	 * Get method for struct member 'links'.
	 * @see #__DNA__FIELD__links
	 */
	
	public ListBase getLinks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 272, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 216, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'links'.
	 * @see #__DNA__FIELD__links
	 */
	
	public void setLinks(ListBase links) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(links, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, links)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, links);
		} else {
			__io__generic__copy( getLinks(), links);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set init on fileread. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 288);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set init on fileread. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 288, type);
		} else {
			__io__block.writeInt(__io__address + 224, type);
		}
	}

	/**
	 * Get method for struct member 'init'.
	 * @see #__DNA__FIELD__init
	 */
	
	public int getInit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 292);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'init'.
	 * @see #__DNA__FIELD__init
	 */
	
	public void setInit(int init) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 292, init);
		} else {
			__io__block.writeInt(__io__address + 228, init);
		}
	}

	/**
	 * Get method for struct member 'cur_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sockets in groups have unique identifiers, adding new sockets always will increase this counter. </p>
	 * @see #__DNA__FIELD__cur_index
	 */
	
	public int getCur_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 296);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'cur_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sockets in groups have unique identifiers, adding new sockets always will increase this counter. </p>
	 * @see #__DNA__FIELD__cur_index
	 */
	
	public void setCur_index(int cur_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 296, cur_index);
		} else {
			__io__block.writeInt(__io__address + 232, cur_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 300);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 300, flag);
		} else {
			__io__block.writeInt(__io__address + 236, flag);
		}
	}

	/**
	 * Get method for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Update flags. </p>
	 * @see #__DNA__FIELD__update
	 */
	
	public int getUpdate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 304);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Update flags. </p>
	 * @see #__DNA__FIELD__update
	 */
	
	public void setUpdate(int update) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 304, update);
		} else {
			__io__block.writeInt(__io__address + 240, update);
		}
	}

	/**
	 * Get method for struct member 'is_updating'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag to prevent reentrant update calls. </p>
	 * @see #__DNA__FIELD__is_updating
	 */
	
	public short getIs_updating() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 308);
		} else {
			return __io__block.readShort(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'is_updating'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag to prevent reentrant update calls. </p>
	 * @see #__DNA__FIELD__is_updating
	 */
	
	public void setIs_updating(short is_updating) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 308, is_updating);
		} else {
			__io__block.writeShort(__io__address + 244, is_updating);
		}
	}

	/**
	 * Get method for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic temporary flag for recursion check (DFS/BFS). </p>
	 * @see #__DNA__FIELD__done
	 */
	
	public short getDone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 310);
		} else {
			return __io__block.readShort(__io__address + 246);
		}
	}

	/**
	 * Set method for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic temporary flag for recursion check (DFS/BFS). </p>
	 * @see #__DNA__FIELD__done
	 */
	
	public void setDone(short done) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 310, done);
		} else {
			__io__block.writeShort(__io__address + 246, done);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 312;
		} else {
			__dna__offset = 248;
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
	 * Get method for struct member 'nodetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Specific node type this tree is used for. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__nodetype
	 */
	
	public int getNodetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 316);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'nodetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Specific node type this tree is used for. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__nodetype
	 */
	
	public void setNodetype(int nodetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 316, nodetype);
		} else {
			__io__block.writeInt(__io__address + 252, nodetype);
		}
	}

	/**
	 * Get method for struct member 'edit_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when editing. </p>
	 * @see #__DNA__FIELD__edit_quality
	 */
	
	public short getEdit_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 320);
		} else {
			return __io__block.readShort(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'edit_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when editing. </p>
	 * @see #__DNA__FIELD__edit_quality
	 */
	
	public void setEdit_quality(short edit_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 320, edit_quality);
		} else {
			__io__block.writeShort(__io__address + 256, edit_quality);
		}
	}

	/**
	 * Get method for struct member 'render_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when rendering. </p>
	 * @see #__DNA__FIELD__render_quality
	 */
	
	public short getRender_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 322);
		} else {
			return __io__block.readShort(__io__address + 258);
		}
	}

	/**
	 * Set method for struct member 'render_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quality setting when rendering. </p>
	 * @see #__DNA__FIELD__render_quality
	 */
	
	public void setRender_quality(short render_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 322, render_quality);
		} else {
			__io__block.writeShort(__io__address + 258, render_quality);
		}
	}

	/**
	 * Get method for struct member 'chunksize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tile size for compositor engine. </p>
	 * @see #__DNA__FIELD__chunksize
	 */
	
	public int getChunksize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 324);
		} else {
			return __io__block.readInt(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'chunksize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tile size for compositor engine. </p>
	 * @see #__DNA__FIELD__chunksize
	 */
	
	public void setChunksize(int chunksize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 324, chunksize);
		} else {
			__io__block.writeInt(__io__address + 260, chunksize);
		}
	}

	/**
	 * Get method for struct member 'viewer_border'.
	 * @see #__DNA__FIELD__viewer_border
	 */
	
	public rctf getViewer_border() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewer_border'.
	 * @see #__DNA__FIELD__viewer_border
	 */
	
	public void setViewer_border(rctf viewer_border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(viewer_border, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewer_border)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewer_border);
		} else {
			__io__generic__copy( getViewer_border(), viewer_border);
		}
	}

	/**
	 * Get method for struct member 'inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lists of {@link bNodeSocket}  to hold default values and own_index. Warning! Don't make links to these sockets, input/output nodes are used for that. These sockets are used only for generating external interfaces. </p>
	 * @see #__DNA__FIELD__inputs
	 */
	
	public ListBase getInputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 344, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 280, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lists of {@link bNodeSocket}  to hold default values and own_index. Warning! Don't make links to these sockets, input/output nodes are used for that. These sockets are used only for generating external interfaces. </p>
	 * @see #__DNA__FIELD__inputs
	 */
	
	public void setInputs(ListBase inputs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 280;
		}
		if (__io__equals(inputs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inputs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inputs);
		} else {
			__io__generic__copy( getInputs(), inputs);
		}
	}

	/**
	 * Get method for struct member 'outputs'.
	 * @see #__DNA__FIELD__outputs
	 */
	
	public ListBase getOutputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 360, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'outputs'.
	 * @see #__DNA__FIELD__outputs
	 */
	
	public void setOutputs(ListBase outputs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(outputs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, outputs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, outputs);
		} else {
			__io__generic__copy( getOutputs(), outputs);
		}
	}

	/**
	 * Get method for struct member 'previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node preview hash table Only available in base node trees (e.g. scene->node_tree) </p>
	 * @see #__DNA__FIELD__previews
	 */
	
	public CPointer<Object> getPreviews() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node preview hash table Only available in base node trees (e.g. scene->node_tree) </p>
	 * @see #__DNA__FIELD__previews
	 */
	
	public void setPreviews(CPointer<Object> previews) throws IOException
	{
		long __address = ((previews == null) ? 0 : previews.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
		}
	}

	/**
	 * Get method for struct member 'active_viewer_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines the node tree instance to use for the "active" context, in case multiple different editors are used and make context ambiguous. </p>
	 * @see #__DNA__FIELD__active_viewer_key
	 */
	
	public bNodeInstanceKey getActive_viewer_key() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bNodeInstanceKey(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new bNodeInstanceKey(__io__address + 300, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'active_viewer_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines the node tree instance to use for the "active" context, in case multiple different editors are used and make context ambiguous. </p>
	 * @see #__DNA__FIELD__active_viewer_key
	 */
	
	public void setActive_viewer_key(bNodeInstanceKey active_viewer_key) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 300;
		}
		if (__io__equals(active_viewer_key, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, active_viewer_key)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, active_viewer_key);
		} else {
			__io__generic__copy( getActive_viewer_key(), active_viewer_key);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 388;
		} else {
			__dna__offset = 304;
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
	 * Get method for struct member 'execdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution data.</p><p> XXX It would be preferable to completely move this data out of the underlying node tree, so node tree execution could finally run independent of the tree itself. This would allow node trees to be merely linked by other data (materials, textures, etc.), as {@link ID}  data is supposed to. Execution data is generated from the tree once at execution start and can then be used as long as necessary, even while the tree is being modified. </p>
	 * @see #__DNA__FIELD__execdata
	 */
	
	public CPointer<Object> getExecdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 308);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'execdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution data.</p><p> XXX It would be preferable to completely move this data out of the underlying node tree, so node tree execution could finally run independent of the tree itself. This would allow node trees to be merely linked by other data (materials, textures, etc.), as {@link ID}  data is supposed to. Execution data is generated from the tree once at execution start and can then be used as long as necessary, even while the tree is being modified. </p>
	 * @see #__DNA__FIELD__execdata
	 */
	
	public void setExecdata(CPointer<Object> execdata) throws IOException
	{
		long __address = ((execdata == null) ? 0 : execdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 308, __address);
		}
	}

	/**
	 * Get method for struct member 'tbh'.
	 * @see #__DNA__FIELD__tbh
	 */
	
	public CPointer<Object> getTbh() throws IOException
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
	 * Set method for struct member 'tbh'.
	 * @see #__DNA__FIELD__tbh
	 */
	
	public void setTbh(CPointer<Object> tbh) throws IOException
	{
		long __address = ((tbh == null) ? 0 : tbh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 432, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'prh'.
	 * @see #__DNA__FIELD__prh
	 */
	
	public CPointer<Object> getPrh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 440);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prh'.
	 * @see #__DNA__FIELD__prh
	 */
	
	public void setPrh(CPointer<Object> prh) throws IOException
	{
		long __address = ((prh == null) ? 0 : prh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 440, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'sdh'.
	 * @see #__DNA__FIELD__sdh
	 */
	
	public CPointer<Object> getSdh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 448);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sdh'.
	 * @see #__DNA__FIELD__sdh
	 */
	
	public void setSdh(CPointer<Object> sdh) throws IOException
	{
		long __address = ((sdh == null) ? 0 : sdh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 448, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Get method for struct member 'udh'.
	 * @see #__DNA__FIELD__udh
	 */
	
	public CPointer<Object> getUdh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 456);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 340);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'udh'.
	 * @see #__DNA__FIELD__udh
	 */
	
	public void setUdh(CPointer<Object> udh) throws IOException
	{
		long __address = ((udh == null) ? 0 : udh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 456, __address);
		} else {
			__io__block.writeLong(__io__address + 340, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeTree> __io__addressof() {
		return new CPointer<bNodeTree>(__io__address, new Class[]{bNodeTree.class}, __io__block, __io__blockTable);
	}

}
