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

@CMetaData(size32=444, size64=488)
public class bNodeSocket extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocket.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocket.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 402;

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
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined properties. </p>
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
	public static final long[] __DNA__FIELD__prop = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier for mapping. </p>
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
	public static final long[] __DNA__FIELD__identifier = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
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
	public static final long[] __DNA__FIELD__name = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point. Custom storage. </p>
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
	public static final long[] __DNA__FIELD__storage = new long[]{140, 152};

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
	public static final long[] __DNA__FIELD__type = new long[]{144, 160};

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
	public static final long[] __DNA__FIELD__flag = new long[]{146, 162};

	/**
	 * Field descriptor (offset) for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Max. number of links. Read via nodeSocketLinkLimit, because the limit might be defined on the socket type. </p>
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
	public static final long[] __DNA__FIELD__limit = new long[]{148, 164};

	/**
	 * Field descriptor (offset) for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input/output type. </p>
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
	public static final long[] __DNA__FIELD__in_out = new long[]{150, 166};

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
	public static final long[] __DNA__FIELD__typeinfo = new long[]{152, 168};

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
	public static final long[] __DNA__FIELD__idname = new long[]{156, 176};

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
	public static final long[] __DNA__FIELD__locx = new long[]{220, 240};

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
	public static final long[] __DNA__FIELD__locy = new long[]{224, 244};

	/**
	 * Field descriptor (offset) for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default input value used for unlinked sockets. </p>
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
	public static final long[] __DNA__FIELD__default_value = new long[]{228, 248};

	/**
	 * Field descriptor (offset) for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data Local stack index. </p>
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
	public static final long[] __DNA__FIELD__stack_index = new long[]{232, 256};

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
	public static final long[] __DNA__FIELD__stack_type = new long[]{234, 258};

	/**
	 * Field descriptor (offset) for struct member 'display_shape'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__display_shape);
	 * CPointer&lt;Byte&gt; p_display_shape = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_shape'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_shape = new long[]{236, 260};

	/**
	 * Field descriptor (offset) for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #AttributeDomain used when the geometry nodes modifier creates an attribute for a group output. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__attribute_domain);
	 * CPointer&lt;Byte&gt; p_attribute_domain = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attribute_domain'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attribute_domain = new long[]{237, 261};

	/**
	 * Field descriptor (offset) for struct member 'total_inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only cache of the number of input links, for multi-input sockets. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__total_inputs);
	 * CPointer&lt;Short&gt; p_total_inputs = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'total_inputs'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__total_inputs = new long[]{238, 262};

	/**
	 * Field descriptor (offset) for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom dynamic defined label, MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__label);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_label = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'label'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__label = new long[]{240, 264};

	/**
	 * Field descriptor (offset) for struct member 'description'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__description);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_description = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'description'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__description = new long[]{304, 328};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached data from execution. </p>
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
	public static final long[] __DNA__FIELD__cache = new long[]{368, 392};

	/**
	 * Field descriptor (offset) for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead Group socket identifiers, to find matching pairs after reading files. 
	 * @deprecated
	 *  Deprecated</p>
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
	public static final long[] __DNA__FIELD__own_index = new long[]{372, 400};

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
	public static final long[] __DNA__FIELD__to_index = new long[]{376, 404};

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
	public static final long[] __DNA__FIELD__groupsock = new long[]{380, 408};

	/**
	 * Field descriptor (offset) for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A link pointer, set in ntreeUpdateTree. </p>
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
	public static final long[] __DNA__FIELD__link = new long[]{384, 416};

	/**
	 * Field descriptor (offset) for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility Custom data for inputs, only UI writes in this. 
	 * @deprecated
	 *  Deprecated</p>
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
	public static final long[] __DNA__FIELD__ns = new long[]{388, 424};

	/**
	 * Field descriptor (offset) for struct member 'declaration'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__declaration);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_declaration = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'declaration'</li>
	 * <li>Signature: 'SocketDeclarationHandle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__declaration = new long[]{432, 472};

	/**
	 * Field descriptor (offset) for struct member 'changed_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD__changed_flag);
	 * CPointer&lt;Integer&gt; p_changed_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'changed_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__changed_flag = new long[]{436, 480};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocket bnodesocket = ...;
	 * CPointer&lt;Object&gt; p = bnodesocket.__dna__addressof(bNodeSocket.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{440, 484};

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
	 * Get method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined properties. </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public CPointer<IDProperty> getProp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-defined properties. </p>
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(CPointer<IDProperty> prop) throws IOException
	{
		long __address = ((prop == null) ? 0 : prop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier for mapping. </p>
	 * @see #__DNA__FIELD__identifier
	 */
	
	public CArrayFacade<Byte> getIdentifier() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'identifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier for mapping. </p>
	 * @see #__DNA__FIELD__identifier
	 */
	
	public void setIdentifier(CArrayFacade<Byte> identifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
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
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 76;
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
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point. Custom storage. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public CPointer<Object> getStorage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, only used for the {@link Image}  and OutputFile nodes, should be removed at some point. Custom storage. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public void setStorage(CPointer<Object> storage) throws IOException
	{
		long __address = ((storage == null) ? 0 : storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, type);
		} else {
			__io__block.writeShort(__io__address + 144, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 162);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 162, flag);
		} else {
			__io__block.writeShort(__io__address + 146, flag);
		}
	}

	/**
	 * Get method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Max. number of links. Read via nodeSocketLinkLimit, because the limit might be defined on the socket type. </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public short getLimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 164);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Max. number of links. Read via nodeSocketLinkLimit, because the limit might be defined on the socket type. </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public void setLimit(short limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 164, limit);
		} else {
			__io__block.writeShort(__io__address + 148, limit);
		}
	}

	/**
	 * Get method for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input/output type. </p>
	 * @see #__DNA__FIELD__in_out
	 */
	
	public short getIn_out() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 166);
		} else {
			return __io__block.readShort(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'in_out'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input/output type. </p>
	 * @see #__DNA__FIELD__in_out
	 */
	
	public void setIn_out(short in_out) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 166, in_out);
		} else {
			__io__block.writeShort(__io__address + 150, in_out);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
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
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
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
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 176;
		} else {
			__dna__offset = 156;
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
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'locx'.
	 * @see #__DNA__FIELD__locx
	 */
	
	public void setLocx(float locx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, locx);
		} else {
			__io__block.writeFloat(__io__address + 220, locx);
		}
	}

	/**
	 * Get method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public float getLocy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'locy'.
	 * @see #__DNA__FIELD__locy
	 */
	
	public void setLocy(float locy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, locy);
		} else {
			__io__block.writeFloat(__io__address + 224, locy);
		}
	}

	/**
	 * Get method for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default input value used for unlinked sockets. </p>
	 * @see #__DNA__FIELD__default_value
	 */
	
	public CPointer<Object> getDefault_value() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'default_value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default input value used for unlinked sockets. </p>
	 * @see #__DNA__FIELD__default_value
	 */
	
	public void setDefault_value(CPointer<Object> default_value) throws IOException
	{
		long __address = ((default_value == null) ? 0 : default_value.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 228, __address);
		}
	}

	/**
	 * Get method for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data Local stack index. </p>
	 * @see #__DNA__FIELD__stack_index
	 */
	
	public short getStack_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 256);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'stack_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> execution data Local stack index. </p>
	 * @see #__DNA__FIELD__stack_index
	 */
	
	public void setStack_index(short stack_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 256, stack_index);
		} else {
			__io__block.writeShort(__io__address + 232, stack_index);
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
			return __io__block.readShort(__io__address + 258);
		} else {
			return __io__block.readShort(__io__address + 234);
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
			__io__block.writeShort(__io__address + 258, stack_type);
		} else {
			__io__block.writeShort(__io__address + 234, stack_type);
		}
	}

	/**
	 * Get method for struct member 'display_shape'.
	 * @see #__DNA__FIELD__display_shape
	 */
	
	public byte getDisplay_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 260);
		} else {
			return __io__block.readByte(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'display_shape'.
	 * @see #__DNA__FIELD__display_shape
	 */
	
	public void setDisplay_shape(byte display_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 260, display_shape);
		} else {
			__io__block.writeByte(__io__address + 236, display_shape);
		}
	}

	/**
	 * Get method for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #AttributeDomain used when the geometry nodes modifier creates an attribute for a group output. </p>
	 * @see #__DNA__FIELD__attribute_domain
	 */
	
	public byte getAttribute_domain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 261);
		} else {
			return __io__block.readByte(__io__address + 237);
		}
	}

	/**
	 * Set method for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #AttributeDomain used when the geometry nodes modifier creates an attribute for a group output. </p>
	 * @see #__DNA__FIELD__attribute_domain
	 */
	
	public void setAttribute_domain(byte attribute_domain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 261, attribute_domain);
		} else {
			__io__block.writeByte(__io__address + 237, attribute_domain);
		}
	}

	/**
	 * Get method for struct member 'total_inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only cache of the number of input links, for multi-input sockets. </p>
	 * @see #__DNA__FIELD__total_inputs
	 */
	
	public short getTotal_inputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 262);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'total_inputs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only cache of the number of input links, for multi-input sockets. </p>
	 * @see #__DNA__FIELD__total_inputs
	 */
	
	public void setTotal_inputs(short total_inputs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 262, total_inputs);
		} else {
			__io__block.writeShort(__io__address + 238, total_inputs);
		}
	}

	/**
	 * Get method for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom dynamic defined label, MAX_NAME. </p>
	 * @see #__DNA__FIELD__label
	 */
	
	public CArrayFacade<Byte> getLabel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'label'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom dynamic defined label, MAX_NAME. </p>
	 * @see #__DNA__FIELD__label
	 */
	
	public void setLabel(CArrayFacade<Byte> label) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 240;
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
	 * Get method for struct member 'description'.
	 * @see #__DNA__FIELD__description
	 */
	
	public CArrayFacade<Byte> getDescription() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'description'.
	 * @see #__DNA__FIELD__description
	 */
	
	public void setDescription(CArrayFacade<Byte> description) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 304;
		}
		if (__io__equals(description, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, description)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, description);
		} else {
			__io__generic__copy( getDescription(), description);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached data from execution. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached data from execution. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 368, __address);
		}
	}

	/**
	 * Get method for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead Group socket identifiers, to find matching pairs after reading files. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__own_index
	 */
	
	public int getOwn_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 400);
		} else {
			return __io__block.readInt(__io__address + 372);
		}
	}

	/**
	 * Set method for struct member 'own_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> internal data to retrieve relations and groups DEPRECATED, now uses the generic identifier string instead Group socket identifiers, to find matching pairs after reading files. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__own_index
	 */
	
	public void setOwn_index(int own_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 400, own_index);
		} else {
			__io__block.writeInt(__io__address + 372, own_index);
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
			return __io__block.readInt(__io__address + 404);
		} else {
			return __io__block.readInt(__io__address + 376);
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
			__io__block.writeInt(__io__address + 404, to_index);
		} else {
			__io__block.writeInt(__io__address + 376, to_index);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 408);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 380);
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
			__io__block.writeLong(__io__address + 408, __address);
		} else {
			__io__block.writeLong(__io__address + 380, __address);
		}
	}

	/**
	 * Get method for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A link pointer, set in ntreeUpdateTree. </p>
	 * @see #__DNA__FIELD__link
	 */
	
	public CPointer<bNodeLink> getLink() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 416);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeLink.class};
		return new CPointer<bNodeLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'link'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A link pointer, set in ntreeUpdateTree. </p>
	 * @see #__DNA__FIELD__link
	 */
	
	public void setLink(CPointer<bNodeLink> link) throws IOException
	{
		long __address = ((link == null) ? 0 : link.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 416, __address);
		} else {
			__io__block.writeLong(__io__address + 384, __address);
		}
	}

	/**
	 * Get method for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility Custom data for inputs, only UI writes in this. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ns
	 */
	
	public bNodeStack getNs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bNodeStack(__io__address + 424, __io__block, __io__blockTable);
		} else {
			return new bNodeStack(__io__address + 388, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated, socket input values are stored in default_value now. kept for forward compatibility Custom data for inputs, only UI writes in this. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ns
	 */
	
	public void setNs(bNodeStack ns) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 424;
		} else {
			__dna__offset = 388;
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
	 * Get method for struct member 'declaration'.
	 * @see #__DNA__FIELD__declaration
	 */
	
	public CPointer<Object> getDeclaration() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 472);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 432);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'declaration'.
	 * @see #__DNA__FIELD__declaration
	 */
	
	public void setDeclaration(CPointer<Object> declaration) throws IOException
	{
		long __address = ((declaration == null) ? 0 : declaration.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 472, __address);
		} else {
			__io__block.writeLong(__io__address + 432, __address);
		}
	}

	/**
	 * Get method for struct member 'changed_flag'.
	 * @see #__DNA__FIELD__changed_flag
	 */
	
	public int getChanged_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 480);
		} else {
			return __io__block.readInt(__io__address + 436);
		}
	}

	/**
	 * Set method for struct member 'changed_flag'.
	 * @see #__DNA__FIELD__changed_flag
	 */
	
	public void setChanged_flag(int changed_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 480, changed_flag);
		} else {
			__io__block.writeInt(__io__address + 436, changed_flag);
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
			return new CArrayFacade<Byte>(__io__address + 484, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 484;
		} else {
			__dna__offset = 440;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeSocket> __io__addressof() {
		return new CPointer<bNodeSocket>(__io__address, new Class[]{bNodeSocket.class}, __io__block, __io__blockTable);
	}

}
