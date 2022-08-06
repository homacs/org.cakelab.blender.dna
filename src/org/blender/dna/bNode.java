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
 * Generated facet for DNA struct type 'bNode'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> limit data in {@link bNode}  to what we want to see saved? </p>
 */

@CMetaData(size32=400, size64=464)
public class bNode extends CFacade {

	/**
	 * This is the sdna index of the struct bNode.
	 * <p>
	 * It is required when allocating a new block to store data for bNode.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 390;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bNode&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bNode.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bNode*'</li>
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
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bNode&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bNode.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'new_node'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__new_node);
	 * CPointer&lt;CPointer&lt;bNode&gt;&gt; p_new_node = p.cast(new Class[]{CPointer.class, bNode.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'new_node'</li>
	 * <li>Signature: 'bNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__new_node = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__prop);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_prop = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime type information. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__typeinfo);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_typeinfo = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeinfo'</li>
	 * <li>Signature: 'bNodeType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeinfo = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime type identifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{148, 168};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{152, 172};

	/**
	 * Field descriptor (offset) for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Both for dependency and sorting. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__done);
	 * CPointer&lt;Short&gt; p_done = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'done'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__done = new long[]{154, 174};

	/**
	 * Field descriptor (offset) for struct member 'level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__level);
	 * CPointer&lt;Short&gt; p_level = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'need_exec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as a boolean for execution. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__need_exec);
	 * CPointer&lt;Byte&gt; p_need_exec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'need_exec'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__need_exec = new long[]{158, 178};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{159, 179};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{160, 180};

	/**
	 * Field descriptor (offset) for struct member 'inputs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__inputs);
	 * CPointer&lt;ListBase&gt; p_inputs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inputs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inputs = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'outputs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__outputs);
	 * CPointer&lt;ListBase&gt; p_outputs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outputs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outputs = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent node. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;bNode&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, bNode.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'bNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional link to libdata. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__id);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_id = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom data, must be struct, for storage in file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__storage);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_storage = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storage'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storage = new long[]{196, 240};

	/**
	 * Field descriptor (offset) for struct member 'original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The original node in the tree (for localized tree). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__original);
	 * CPointer&lt;CPointer&lt;bNode&gt;&gt; p_original = p.cast(new Class[]{CPointer.class, bNode.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'original'</li>
	 * <li>Signature: 'bNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__original = new long[]{200, 248};

	/**
	 * Field descriptor (offset) for struct member 'internal_links'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of cached internal links (input to output), for muted nodes and operators. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__internal_links);
	 * CPointer&lt;ListBase&gt; p_internal_links = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'internal_links'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__internal_links = new long[]{204, 256};

	/**
	 * Field descriptor (offset) for struct member 'locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Root offset for drawing (parent space). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__locx);
	 * CPointer&lt;Float&gt; p_locx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'locx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__locx = new long[]{212, 272};

	/**
	 * Field descriptor (offset) for struct member 'locy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__locy);
	 * CPointer&lt;Float&gt; p_locy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'locy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__locy = new long[]{216, 276};

	/**
	 * Field descriptor (offset) for struct member 'width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node custom width and height. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__width);
	 * CPointer&lt;Float&gt; p_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__width = new long[]{220, 280};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__height);
	 * CPointer&lt;Float&gt; p_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{224, 284};

	/**
	 * Field descriptor (offset) for struct member 'miniwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node width if hidden. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__miniwidth);
	 * CPointer&lt;Float&gt; p_miniwidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'miniwidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__miniwidth = new long[]{228, 288};

	/**
	 * Field descriptor (offset) for struct member 'offsetx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional offset from loc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__offsetx);
	 * CPointer&lt;Float&gt; p_offsetx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offsetx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offsetx = new long[]{232, 292};

	/**
	 * Field descriptor (offset) for struct member 'offsety'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__offsety);
	 * CPointer&lt;Float&gt; p_offsety = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offsety'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offsety = new long[]{236, 296};

	/**
	 * Field descriptor (offset) for struct member 'anim_init_locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Initial locx for insert offset animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__anim_init_locx);
	 * CPointer&lt;Float&gt; p_anim_init_locx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_init_locx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_init_locx = new long[]{240, 300};

	/**
	 * Field descriptor (offset) for struct member 'anim_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset that will be added to locx for insert offset animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__anim_ofsx);
	 * CPointer&lt;Float&gt; p_anim_ofsx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_ofsx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_ofsx = new long[]{244, 304};

	/**
	 * Field descriptor (offset) for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Update flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__update);
	 * CPointer&lt;Integer&gt; p_update = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'update'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__update = new long[]{248, 308};

	/**
	 * Field descriptor (offset) for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined label, MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__label);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_label = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'label'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__label = new long[]{252, 312};

	/**
	 * Field descriptor (offset) for struct member 'custom1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To be abused for buttons. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__custom1);
	 * CPointer&lt;Short&gt; p_custom1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom1 = new long[]{316, 376};

	/**
	 * Field descriptor (offset) for struct member 'custom2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__custom2);
	 * CPointer&lt;Short&gt; p_custom2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom2 = new long[]{318, 378};

	/**
	 * Field descriptor (offset) for struct member 'custom3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__custom3);
	 * CPointer&lt;Float&gt; p_custom3 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom3'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom3 = new long[]{320, 380};

	/**
	 * Field descriptor (offset) for struct member 'custom4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__custom4);
	 * CPointer&lt;Float&gt; p_custom4 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom4'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom4 = new long[]{324, 384};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{328, 388};

	/**
	 * Field descriptor (offset) for struct member 'totr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Entire boundbox (worldspace). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__totr);
	 * CPointer&lt;rctf&gt; p_totr = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totr'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totr = new long[]{332, 392};

	/**
	 * Field descriptor (offset) for struct member 'butr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional buttons area. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__butr);
	 * CPointer&lt;rctf&gt; p_butr = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'butr'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__butr = new long[]{348, 408};

	/**
	 * Field descriptor (offset) for struct member 'prvr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional preview area. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__prvr);
	 * CPointer&lt;rctf&gt; p_prvr = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prvr'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prvr = new long[]{364, 424};

	/**
	 * Field descriptor (offset) for struct member 'preview_xsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX TODO Node totr size depends on the prvr size, which in turn is determined from preview size. In earlier versions bNodePreview  was stored directly in nodes, but since now there can be multiple instances using different preview images it is possible that required node size varies between instances. preview_xsize, preview_ysize defines a common reserved size for preview rect for now, could be replaced by more accurate node instance drawing, but that requires removing totr from DNA and replacing all uses with per-instance data. Reserved size of the preview rect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__preview_xsize);
	 * CPointer&lt;Short&gt; p_preview_xsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_xsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_xsize = new long[]{380, 440};

	/**
	 * Field descriptor (offset) for struct member 'preview_ysize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__preview_ysize);
	 * CPointer&lt;Short&gt; p_preview_ysize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_ysize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_ysize = new long[]{382, 442};

	/**
	 * Field descriptor (offset) for struct member 'tmp_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when going through the tree. Initialize before use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__tmp_flag);
	 * CPointer&lt;Short&gt; p_tmp_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp_flag = new long[]{384, 444};

	/**
	 * Field descriptor (offset) for struct member 'branch_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime to tag derivatives branches. EEVEE only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__branch_tag);
	 * CPointer&lt;Byte&gt; p_branch_tag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'branch_tag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__branch_tag = new long[]{386, 446};

	/**
	 * Field descriptor (offset) for struct member 'iter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when iterating over node branches. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__iter_flag);
	 * CPointer&lt;Byte&gt; p_iter_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter_flag = new long[]{387, 447};

	/**
	 * Field descriptor (offset) for struct member 'block'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime during drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__block);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_block = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'block'</li>
	 * <li>Signature: 'uiBlock*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__block = new long[]{388, 448};

	/**
	 * Field descriptor (offset) for struct member 'ssr_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen space reflection layer, needs to be a float to feed GPU_uniform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__ssr_id);
	 * CPointer&lt;Float&gt; p_ssr_id = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_id'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_id = new long[]{392, 456};

	/**
	 * Field descriptor (offset) for struct member 'sss_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen subsurface scatter layer, needs to be a float to feed GPU_uniform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNode bnode = ...;
	 * CPointer&lt;Object&gt; p = bnode.__dna__addressof(bNode.__DNA__FIELD__sss_id);
	 * CPointer&lt;Float&gt; p_sss_id = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_id'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_id = new long[]{396, 460};

	public bNode(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNode(bNode that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bNode> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNode.class};
		return new CPointer<bNode>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNode.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bNode> next) throws IOException
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
	
	public CPointer<bNode> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNode.class};
		return new CPointer<bNode>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNode.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bNode> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'new_node'.
	 * @see #__DNA__FIELD__new_node
	 */
	
	public CPointer<bNode> getNew_node() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNode.class};
		return new CPointer<bNode>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNode.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'new_node'.
	 * @see #__DNA__FIELD__new_node
	 */
	
	public void setNew_node(CPointer<bNode> new_node) throws IOException
	{
		long __address = ((new_node == null) ? 0 : new_node.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined properties. </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public CPointer<IDProperty> getProp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined properties. </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(CPointer<IDProperty> prop) throws IOException
	{
		long __address = ((prop == null) ? 0 : prop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime type information. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public CPointer<Object> getTypeinfo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime type information. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public void setTypeinfo(CPointer<Object> typeinfo) throws IOException
	{
		long __address = ((typeinfo == null) ? 0 : typeinfo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime type identifier. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
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
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, flag);
		} else {
			__io__block.writeInt(__io__address + 148, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, type);
		} else {
			__io__block.writeShort(__io__address + 152, type);
		}
	}

	/**
	 * Get method for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Both for dependency and sorting. </p>
	 * @see #__DNA__FIELD__done
	 */
	
	public short getDone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'done'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Both for dependency and sorting. </p>
	 * @see #__DNA__FIELD__done
	 */
	
	public void setDone(short done) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, done);
		} else {
			__io__block.writeShort(__io__address + 154, done);
		}
	}

	/**
	 * Get method for struct member 'level'.
	 * @see #__DNA__FIELD__level
	 */
	
	public short getLevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'level'.
	 * @see #__DNA__FIELD__level
	 */
	
	public void setLevel(short level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, level);
		} else {
			__io__block.writeShort(__io__address + 156, level);
		}
	}

	/**
	 * Get method for struct member 'need_exec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as a boolean for execution. </p>
	 * @see #__DNA__FIELD__need_exec
	 */
	
	public byte getNeed_exec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 178);
		} else {
			return __io__block.readByte(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'need_exec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as a boolean for execution. </p>
	 * @see #__DNA__FIELD__need_exec
	 */
	
	public void setNeed_exec(byte need_exec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 178, need_exec);
		} else {
			__io__block.writeByte(__io__address + 158, need_exec);
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
			return new CArrayFacade<Byte>(__io__address + 179, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 159, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 179;
		} else {
			__dna__offset = 159;
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
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined color. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined color. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'inputs'.
	 * @see #__DNA__FIELD__inputs
	 */
	
	public ListBase getInputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 172, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inputs'.
	 * @see #__DNA__FIELD__inputs
	 */
	
	public void setInputs(ListBase inputs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 172;
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
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 180, __io__block, __io__blockTable);
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
			__dna__offset = 208;
		} else {
			__dna__offset = 180;
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
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent node. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<bNode> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNode.class};
		return new CPointer<bNode>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNode.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent node. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<bNode> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional link to libdata. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public CPointer<ID> getId() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional link to libdata. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(CPointer<ID> id) throws IOException
	{
		long __address = ((id == null) ? 0 : id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom data, must be struct, for storage in file. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public CPointer<Object> getStorage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom data, must be struct, for storage in file. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public void setStorage(CPointer<Object> storage) throws IOException
	{
		long __address = ((storage == null) ? 0 : storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The original node in the tree (for localized tree). </p>
	 * @see #__DNA__FIELD__original
	 */
	
	public CPointer<bNode> getOriginal() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNode.class};
		return new CPointer<bNode>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNode.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The original node in the tree (for localized tree). </p>
	 * @see #__DNA__FIELD__original
	 */
	
	public void setOriginal(CPointer<bNode> original) throws IOException
	{
		long __address = ((original == null) ? 0 : original.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'internal_links'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of cached internal links (input to output), for muted nodes and operators. </p>
	 * @see #__DNA__FIELD__internal_links
	 */
	
	public ListBase getInternal_links() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'internal_links'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of cached internal links (input to output), for muted nodes and operators. </p>
	 * @see #__DNA__FIELD__internal_links
	 */
	
	public void setInternal_links(ListBase internal_links) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(internal_links, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, internal_links)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, internal_links);
		} else {
			__io__generic__copy( getInternal_links(), internal_links);
		}
	}

	/**
	 * Get method for struct member 'locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Root offset for drawing (parent space). </p>
	 * @see #__DNA__FIELD__locx
	 */
	
	public float getLocx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Root offset for drawing (parent space). </p>
	 * @see #__DNA__FIELD__locx
	 */
	
	public void setLocx(float locx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, locx);
		} else {
			__io__block.writeFloat(__io__address + 212, locx);
		}
	}

	/**
	 * Get method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public float getLocy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public void setLocy(float locy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, locy);
		} else {
			__io__block.writeFloat(__io__address + 216, locy);
		}
	}

	/**
	 * Get method for struct member 'width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node custom width and height. </p>
	 * @see #__DNA__FIELD__width
	 */
	
	public float getWidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node custom width and height. </p>
	 * @see #__DNA__FIELD__width
	 */
	
	public void setWidth(float width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, width);
		} else {
			__io__block.writeFloat(__io__address + 220, width);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public float getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(float height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, height);
		} else {
			__io__block.writeFloat(__io__address + 224, height);
		}
	}

	/**
	 * Get method for struct member 'miniwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node width if hidden. </p>
	 * @see #__DNA__FIELD__miniwidth
	 */
	
	public float getMiniwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'miniwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Node width if hidden. </p>
	 * @see #__DNA__FIELD__miniwidth
	 */
	
	public void setMiniwidth(float miniwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, miniwidth);
		} else {
			__io__block.writeFloat(__io__address + 228, miniwidth);
		}
	}

	/**
	 * Get method for struct member 'offsetx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional offset from loc. </p>
	 * @see #__DNA__FIELD__offsetx
	 */
	
	public float getOffsetx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'offsetx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional offset from loc. </p>
	 * @see #__DNA__FIELD__offsetx
	 */
	
	public void setOffsetx(float offsetx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, offsetx);
		} else {
			__io__block.writeFloat(__io__address + 232, offsetx);
		}
	}

	/**
	 * Get method for struct member 'offsety'.
	 * @see #__DNA__FIELD__offsety
	 */
	
	public float getOffsety() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'offsety'.
	 * @see #__DNA__FIELD__offsety
	 */
	
	public void setOffsety(float offsety) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, offsety);
		} else {
			__io__block.writeFloat(__io__address + 236, offsety);
		}
	}

	/**
	 * Get method for struct member 'anim_init_locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Initial locx for insert offset animation. </p>
	 * @see #__DNA__FIELD__anim_init_locx
	 */
	
	public float getAnim_init_locx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'anim_init_locx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Initial locx for insert offset animation. </p>
	 * @see #__DNA__FIELD__anim_init_locx
	 */
	
	public void setAnim_init_locx(float anim_init_locx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, anim_init_locx);
		} else {
			__io__block.writeFloat(__io__address + 240, anim_init_locx);
		}
	}

	/**
	 * Get method for struct member 'anim_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset that will be added to locx for insert offset animation. </p>
	 * @see #__DNA__FIELD__anim_ofsx
	 */
	
	public float getAnim_ofsx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'anim_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset that will be added to locx for insert offset animation. </p>
	 * @see #__DNA__FIELD__anim_ofsx
	 */
	
	public void setAnim_ofsx(float anim_ofsx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, anim_ofsx);
		} else {
			__io__block.writeFloat(__io__address + 244, anim_ofsx);
		}
	}

	/**
	 * Get method for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Update flags. </p>
	 * @see #__DNA__FIELD__update
	 */
	
	public int getUpdate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 308);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'update'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Update flags. </p>
	 * @see #__DNA__FIELD__update
	 */
	
	public void setUpdate(int update) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 308, update);
		} else {
			__io__block.writeInt(__io__address + 248, update);
		}
	}

	/**
	 * Get method for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined label, MAX_NAME. </p>
	 * @see #__DNA__FIELD__label
	 */
	
	public CArrayFacade<Byte> getLabel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom user-defined label, MAX_NAME. </p>
	 * @see #__DNA__FIELD__label
	 */
	
	public void setLabel(CArrayFacade<Byte> label) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 252;
		}
		if (__io__equals(label, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, label)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, label);
		} else {
			__io__generic__copy( getLabel(), label);
		}
	}

	/**
	 * Get method for struct member 'custom1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To be abused for buttons. </p>
	 * @see #__DNA__FIELD__custom1
	 */
	
	public short getCustom1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 376);
		} else {
			return __io__block.readShort(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'custom1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To be abused for buttons. </p>
	 * @see #__DNA__FIELD__custom1
	 */
	
	public void setCustom1(short custom1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 376, custom1);
		} else {
			__io__block.writeShort(__io__address + 316, custom1);
		}
	}

	/**
	 * Get method for struct member 'custom2'.
	 * @see #__DNA__FIELD__custom2
	 */
	
	public short getCustom2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 378);
		} else {
			return __io__block.readShort(__io__address + 318);
		}
	}

	/**
	 * Set method for struct member 'custom2'.
	 * @see #__DNA__FIELD__custom2
	 */
	
	public void setCustom2(short custom2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 378, custom2);
		} else {
			__io__block.writeShort(__io__address + 318, custom2);
		}
	}

	/**
	 * Get method for struct member 'custom3'.
	 * @see #__DNA__FIELD__custom3
	 */
	
	public float getCustom3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 380);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'custom3'.
	 * @see #__DNA__FIELD__custom3
	 */
	
	public void setCustom3(float custom3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 380, custom3);
		} else {
			__io__block.writeFloat(__io__address + 320, custom3);
		}
	}

	/**
	 * Get method for struct member 'custom4'.
	 * @see #__DNA__FIELD__custom4
	 */
	
	public float getCustom4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 384);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'custom4'.
	 * @see #__DNA__FIELD__custom4
	 */
	
	public void setCustom4(float custom4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 384, custom4);
		} else {
			__io__block.writeFloat(__io__address + 324, custom4);
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
			return new CArrayFacade<Byte>(__io__address + 388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 388;
		} else {
			__dna__offset = 328;
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
	 * Get method for struct member 'totr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Entire boundbox (worldspace). </p>
	 * @see #__DNA__FIELD__totr
	 */
	
	public rctf getTotr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 392, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 332, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'totr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Entire boundbox (worldspace). </p>
	 * @see #__DNA__FIELD__totr
	 */
	
	public void setTotr(rctf totr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 332;
		}
		if (__io__equals(totr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, totr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, totr);
		} else {
			__io__generic__copy( getTotr(), totr);
		}
	}

	/**
	 * Get method for struct member 'butr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional buttons area. </p>
	 * @see #__DNA__FIELD__butr
	 */
	
	public rctf getButr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 408, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 348, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'butr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional buttons area. </p>
	 * @see #__DNA__FIELD__butr
	 */
	
	public void setButr(rctf butr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 408;
		} else {
			__dna__offset = 348;
		}
		if (__io__equals(butr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, butr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, butr);
		} else {
			__io__generic__copy( getButr(), butr);
		}
	}

	/**
	 * Get method for struct member 'prvr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional preview area. </p>
	 * @see #__DNA__FIELD__prvr
	 */
	
	public rctf getPrvr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 424, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 364, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prvr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional preview area. </p>
	 * @see #__DNA__FIELD__prvr
	 */
	
	public void setPrvr(rctf prvr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 424;
		} else {
			__dna__offset = 364;
		}
		if (__io__equals(prvr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prvr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prvr);
		} else {
			__io__generic__copy( getPrvr(), prvr);
		}
	}

	/**
	 * Get method for struct member 'preview_xsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX TODO Node totr size depends on the prvr size, which in turn is determined from preview size. In earlier versions bNodePreview  was stored directly in nodes, but since now there can be multiple instances using different preview images it is possible that required node size varies between instances. preview_xsize, preview_ysize defines a common reserved size for preview rect for now, could be replaced by more accurate node instance drawing, but that requires removing totr from DNA and replacing all uses with per-instance data. Reserved size of the preview rect. </p>
	 * @see #__DNA__FIELD__preview_xsize
	 */
	
	public short getPreview_xsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 440);
		} else {
			return __io__block.readShort(__io__address + 380);
		}
	}

	/**
	 * Set method for struct member 'preview_xsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX TODO Node totr size depends on the prvr size, which in turn is determined from preview size. In earlier versions bNodePreview  was stored directly in nodes, but since now there can be multiple instances using different preview images it is possible that required node size varies between instances. preview_xsize, preview_ysize defines a common reserved size for preview rect for now, could be replaced by more accurate node instance drawing, but that requires removing totr from DNA and replacing all uses with per-instance data. Reserved size of the preview rect. </p>
	 * @see #__DNA__FIELD__preview_xsize
	 */
	
	public void setPreview_xsize(short preview_xsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 440, preview_xsize);
		} else {
			__io__block.writeShort(__io__address + 380, preview_xsize);
		}
	}

	/**
	 * Get method for struct member 'preview_ysize'.
	 * @see #__DNA__FIELD__preview_ysize
	 */
	
	public short getPreview_ysize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 442);
		} else {
			return __io__block.readShort(__io__address + 382);
		}
	}

	/**
	 * Set method for struct member 'preview_ysize'.
	 * @see #__DNA__FIELD__preview_ysize
	 */
	
	public void setPreview_ysize(short preview_ysize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 442, preview_ysize);
		} else {
			__io__block.writeShort(__io__address + 382, preview_ysize);
		}
	}

	/**
	 * Get method for struct member 'tmp_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when going through the tree. Initialize before use. </p>
	 * @see #__DNA__FIELD__tmp_flag
	 */
	
	public short getTmp_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 444);
		} else {
			return __io__block.readShort(__io__address + 384);
		}
	}

	/**
	 * Set method for struct member 'tmp_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when going through the tree. Initialize before use. </p>
	 * @see #__DNA__FIELD__tmp_flag
	 */
	
	public void setTmp_flag(short tmp_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 444, tmp_flag);
		} else {
			__io__block.writeShort(__io__address + 384, tmp_flag);
		}
	}

	/**
	 * Get method for struct member 'branch_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime to tag derivatives branches. EEVEE only. </p>
	 * @see #__DNA__FIELD__branch_tag
	 */
	
	public byte getBranch_tag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 446);
		} else {
			return __io__block.readByte(__io__address + 386);
		}
	}

	/**
	 * Set method for struct member 'branch_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime to tag derivatives branches. EEVEE only. </p>
	 * @see #__DNA__FIELD__branch_tag
	 */
	
	public void setBranch_tag(byte branch_tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 446, branch_tag);
		} else {
			__io__block.writeByte(__io__address + 386, branch_tag);
		}
	}

	/**
	 * Get method for struct member 'iter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when iterating over node branches. </p>
	 * @see #__DNA__FIELD__iter_flag
	 */
	
	public byte getIter_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 447);
		} else {
			return __io__block.readByte(__io__address + 387);
		}
	}

	/**
	 * Set method for struct member 'iter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used at runtime when iterating over node branches. </p>
	 * @see #__DNA__FIELD__iter_flag
	 */
	
	public void setIter_flag(byte iter_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 447, iter_flag);
		} else {
			__io__block.writeByte(__io__address + 387, iter_flag);
		}
	}

	/**
	 * Get method for struct member 'block'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime during drawing. </p>
	 * @see #__DNA__FIELD__block
	 */
	
	public CPointer<Object> getBlock() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 448);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 388);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'block'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime during drawing. </p>
	 * @see #__DNA__FIELD__block
	 */
	
	public void setBlock(CPointer<Object> block) throws IOException
	{
		long __address = ((block == null) ? 0 : block.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 448, __address);
		} else {
			__io__block.writeLong(__io__address + 388, __address);
		}
	}

	/**
	 * Get method for struct member 'ssr_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen space reflection layer, needs to be a float to feed GPU_uniform. </p>
	 * @see #__DNA__FIELD__ssr_id
	 */
	
	public float getSsr_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 456);
		} else {
			return __io__block.readFloat(__io__address + 392);
		}
	}

	/**
	 * Set method for struct member 'ssr_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen space reflection layer, needs to be a float to feed GPU_uniform. </p>
	 * @see #__DNA__FIELD__ssr_id
	 */
	
	public void setSsr_id(float ssr_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 456, ssr_id);
		} else {
			__io__block.writeFloat(__io__address + 392, ssr_id);
		}
	}

	/**
	 * Get method for struct member 'sss_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen subsurface scatter layer, needs to be a float to feed GPU_uniform. </p>
	 * @see #__DNA__FIELD__sss_id
	 */
	
	public float getSss_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 460);
		} else {
			return __io__block.readFloat(__io__address + 396);
		}
	}

	/**
	 * Set method for struct member 'sss_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: eevee only, id of screen subsurface scatter layer, needs to be a float to feed GPU_uniform. </p>
	 * @see #__DNA__FIELD__sss_id
	 */
	
	public void setSss_id(float sss_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 460, sss_id);
		} else {
			__io__block.writeFloat(__io__address + 396, sss_id);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNode> __io__addressof() {
		return new CPointer<bNode>(__io__address, new Class[]{bNode.class}, __io__block, __io__blockTable);
	}

}
