package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeSocket'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=308, size64=352)
public class bNodeSocket extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocket.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocket.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 391;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bNodeSocket&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bNodeSocket.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bNodeSocket*'</li>
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
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bNodeSocket&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bNodeSocket.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bNodeSocket*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'new_sock'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__new_sock);
	 * CPointer&lt;CPointer&lt;bNodeSocket&gt;&gt; p_new_sock = p.cast(new Class[]{CPointer.class, bNodeSocket.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'new_sock'</li>
	 * <li>Signature: 'bNodeSocket*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__new_sock = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user-defined properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__prop);
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
	 * Field descriptor (offset) for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unique identifier for mapping </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__identifier);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_identifier = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'identifier'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__identifier = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point.custom storage </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__storage);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_storage = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storage'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storage = new long[]{144, 160};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{148, 168};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{150, 170};

	/**
	 * Field descriptor (offset) for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max. number of links </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__limit);
	 * CPointer&lt;Short&gt; p_limit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit = new long[]{152, 172};

	/**
	 * Field descriptor (offset) for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> input/output type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__in_out);
	 * CPointer&lt;Short&gt; p_in_out = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'in_out'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__in_out = new long[]{154, 174};

	/**
	 * Field descriptor (offset) for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type information </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__typeinfo);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_typeinfo = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeinfo'</li>
	 * <li>Signature: 'bNodeSocketType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeinfo = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type identifier </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{160, 184};

	/**
	 * Field descriptor (offset) for struct member 'locx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__locx);
	 * CPointer&lt;Float&gt; p_locx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'locx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__locx = new long[]{224, 248};

	/**
	 * Field descriptor (offset) for struct member 'locy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__locy);
	 * CPointer&lt;Float&gt; p_locy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'locy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__locy = new long[]{228, 252};

	/**
	 * Field descriptor (offset) for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default input value used for unlinked sockets </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__default_value);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_default_value = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_value'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_value = new long[]{232, 256};

	/**
	 * Field descriptor (offset) for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data local stack index </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__stack_index);
	 * CPointer&lt;Short&gt; p_stack_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stack_index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stack_index = new long[]{236, 264};

	/**
	 * Field descriptor (offset) for struct member 'stack_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, kept for forward compatibility 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__stack_type);
	 * CPointer&lt;Short&gt; p_stack_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stack_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stack_type = new long[]{238, 266};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{240, 268};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached data from execution </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{244, 272};

	/**
	 * Field descriptor (offset) for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead<p> group socket identifiers, to find matching pairs after reading files </p>
	 * @deprecated
	 *  Deprecatedgroup socket identifiers, to find matching pairs after reading files </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__own_index);
	 * CPointer&lt;Integer&gt; p_own_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'own_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__own_index = new long[]{248, 280};

	/**
	 * Field descriptor (offset) for struct member 'to_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for restoring old group node links 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__to_index);
	 * CPointer&lt;Integer&gt; p_to_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_index = new long[]{252, 284};

	/**
	 * Field descriptor (offset) for struct member 'groupsock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, still forward compatible since verification restores pointer from matching own_index. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__groupsock);
	 * CPointer&lt;CPointer&lt;bNodeSocket&gt;&gt; p_groupsock = p.cast(new Class[]{CPointer.class, bNodeSocket.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'groupsock'</li>
	 * <li>Signature: 'bNodeSocket*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__groupsock = new long[]{256, 288};

	/**
	 * Field descriptor (offset) for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a link pointer, set in ntreeUpdateTree </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__link);
	 * CPointer&lt;CPointer&lt;bNodeLink&gt;&gt; p_link = p.cast(new Class[]{CPointer.class, bNodeLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link'</li>
	 * <li>Signature: 'bNodeLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link = new long[]{260, 296};

	/**
	 * Field descriptor (offset) for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility <p> custom data for inputs, only UI writes in this </p>
	 * @deprecated
	 *  Deprecatedcustom data for inputs, only UI writes in this </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__ns);
	 * CPointer&lt;bNodeStack&gt; p_ns = p.cast(new Class[]{bNodeStack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ns'</li>
	 * <li>Signature: 'bNodeStack'</li>
	 * <li>Actual Size (32bit/64bit): 44/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ns = new long[]{264, 304};

	public bNodeSocket(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeSocket(bNodeSocket that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bNodeSocket> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeSocket.class};
		return new CPointer<bNodeSocket>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeSocket.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bNodeSocket> next) throws IOException
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
	
	public CPointer<bNodeSocket> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeSocket.class};
		return new CPointer<bNodeSocket>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeSocket.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bNodeSocket> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'new_sock'.
	 * @see #__DNA__FIELD__new_sock
	 */
	
	public CPointer<bNodeSocket> getNew_sock() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeSocket.class};
		return new CPointer<bNodeSocket>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeSocket.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'new_sock'.
	 * @see #__DNA__FIELD__new_sock
	 */
	
	public void setNew_sock(CPointer<bNodeSocket> new_sock) throws IOException
	{
		long __address = ((new_sock == null) ? 0 : new_sock.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user-defined properties </p>
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
	 * <h4>Blender Source Code:</h4>
	 * <p> user-defined properties </p>
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
	 * Get method for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unique identifier for mapping </p>
	 * @see #__DNA__FIELD__identifier
	 */
	
	public CArrayFacade<Byte> getIdentifier() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unique identifier for mapping </p>
	 * @see #__DNA__FIELD__identifier
	 */
	
	public void setIdentifier(CArrayFacade<Byte> identifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(identifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, identifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, identifier);
		} else {
			__io__generic__copy( getIdentifier(), identifier);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 80;
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
	 * Get method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point.custom storage </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public CPointer<Object> getStorage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point.custom storage </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public void setStorage(CPointer<Object> storage) throws IOException
	{
		long __address = ((storage == null) ? 0 : storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, type);
		} else {
			__io__block.writeShort(__io__address + 148, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, flag);
		} else {
			__io__block.writeShort(__io__address + 150, flag);
		}
	}

	/**
	 * Get method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max. number of links </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public short getLimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max. number of links </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public void setLimit(short limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, limit);
		} else {
			__io__block.writeShort(__io__address + 152, limit);
		}
	}

	/**
	 * Get method for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> input/output type </p>
	 * @see #__DNA__FIELD__in_out
	 */
	
	public short getIn_out() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> input/output type </p>
	 * @see #__DNA__FIELD__in_out
	 */
	
	public void setIn_out(short in_out) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, in_out);
		} else {
			__io__block.writeShort(__io__address + 154, in_out);
		}
	}

	/**
	 * Get method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type information </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public CPointer<Object> getTypeinfo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type information </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public void setTypeinfo(CPointer<Object> typeinfo) throws IOException
	{
		long __address = ((typeinfo == null) ? 0 : typeinfo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type identifier </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime type identifier </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 160;
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
	 * Get method for struct member 'locx'.
	 * @see #__DNA__FIELD__locx
	 */
	
	public float getLocx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'locx'.
	 * @see #__DNA__FIELD__locx
	 */
	
	public void setLocx(float locx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, locx);
		} else {
			__io__block.writeFloat(__io__address + 224, locx);
		}
	}

	/**
	 * Get method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public float getLocy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public void setLocy(float locy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, locy);
		} else {
			__io__block.writeFloat(__io__address + 228, locy);
		}
	}

	/**
	 * Get method for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default input value used for unlinked sockets </p>
	 * @see #__DNA__FIELD__default_value
	 */
	
	public CPointer<Object> getDefault_value() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default input value used for unlinked sockets </p>
	 * @see #__DNA__FIELD__default_value
	 */
	
	public void setDefault_value(CPointer<Object> default_value) throws IOException
	{
		long __address = ((default_value == null) ? 0 : default_value.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 232, __address);
		}
	}

	/**
	 * Get method for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data local stack index </p>
	 * @see #__DNA__FIELD__stack_index
	 */
	
	public short getStack_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data local stack index </p>
	 * @see #__DNA__FIELD__stack_index
	 */
	
	public void setStack_index(short stack_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, stack_index);
		} else {
			__io__block.writeShort(__io__address + 236, stack_index);
		}
	}

	/**
	 * Get method for struct member 'stack_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, kept for forward compatibility 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stack_type
	 */
	
	public short getStack_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'stack_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, kept for forward compatibility 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stack_type
	 */
	
	public void setStack_type(short stack_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, stack_type);
		} else {
			__io__block.writeShort(__io__address + 238, stack_type);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 268);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 268, pad);
		} else {
			__io__block.writeInt(__io__address + 240, pad);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached data from execution </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 244);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached data from execution </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 244, __address);
		}
	}

	/**
	 * Get method for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead<p> group socket identifiers, to find matching pairs after reading files </p>
	 * @deprecated
	 *  Deprecatedgroup socket identifiers, to find matching pairs after reading files </p>
	 * @see #__DNA__FIELD__own_index
	 */
	
	public int getOwn_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 280);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead<p> group socket identifiers, to find matching pairs after reading files </p>
	 * @deprecated
	 *  Deprecatedgroup socket identifiers, to find matching pairs after reading files </p>
	 * @see #__DNA__FIELD__own_index
	 */
	
	public void setOwn_index(int own_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 280, own_index);
		} else {
			__io__block.writeInt(__io__address + 248, own_index);
		}
	}

	/**
	 * Get method for struct member 'to_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for restoring old group node links 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__to_index
	 */
	
	public int getTo_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 284);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'to_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for restoring old group node links 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__to_index
	 */
	
	public void setTo_index(int to_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 284, to_index);
		} else {
			__io__block.writeInt(__io__address + 252, to_index);
		}
	}

	/**
	 * Get method for struct member 'groupsock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, still forward compatible since verification restores pointer from matching own_index. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__groupsock
	 */
	
	public CPointer<bNodeSocket> getGroupsock() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeSocket.class};
		return new CPointer<bNodeSocket>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeSocket.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'groupsock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, still forward compatible since verification restores pointer from matching own_index. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__groupsock
	 */
	
	public void setGroupsock(CPointer<bNodeSocket> groupsock) throws IOException
	{
		long __address = ((groupsock == null) ? 0 : groupsock.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a link pointer, set in ntreeUpdateTree </p>
	 * @see #__DNA__FIELD__link
	 */
	
	public CPointer<bNodeLink> getLink() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeLink.class};
		return new CPointer<bNodeLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a link pointer, set in ntreeUpdateTree </p>
	 * @see #__DNA__FIELD__link
	 */
	
	public void setLink(CPointer<bNodeLink> link) throws IOException
	{
		long __address = ((link == null) ? 0 : link.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 260, __address);
		}
	}

	/**
	 * Get method for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility <p> custom data for inputs, only UI writes in this </p>
	 * @deprecated
	 *  Deprecatedcustom data for inputs, only UI writes in this </p>
	 * @see #__DNA__FIELD__ns
	 */
	
	public bNodeStack getNs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bNodeStack(__io__address + 304, __io__block, __io__blockTable);
		} else {
			return new bNodeStack(__io__address + 264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility <p> custom data for inputs, only UI writes in this </p>
	 * @deprecated
	 *  Deprecatedcustom data for inputs, only UI writes in this </p>
	 * @see #__DNA__FIELD__ns
	 */
	
	public void setNs(bNodeStack ns) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(ns, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ns)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ns);
		} else {
			__io__generic__copy( getNs(), ns);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeSocket> __io__addressof() {
		return new CPointer<bNodeSocket>(__io__address, new Class[]{bNodeSocket.class}, __io__block, __io__blockTable);
	}

}
