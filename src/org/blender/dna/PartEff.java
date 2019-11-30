package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PartEff'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=376, size64=392)
public class PartEff extends CFacade {

	/**
	 * This is the sdna index of the struct PartEff.
	 * <p>
	 * It is required when allocating a new block to store data for PartEff.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 302;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;PartEff&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, PartEff.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'PartEff*'</li>
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
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;PartEff&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, PartEff.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'PartEff*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'buttype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__buttype);
	 * CPointer&lt;Short&gt; p_buttype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buttype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buttype = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'stype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__stype);
	 * CPointer&lt;Short&gt; p_stype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stype = new long[]{14, 22};

	/**
	 * Field descriptor (offset) for struct member 'vertgroup'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__vertgroup);
	 * CPointer&lt;Short&gt; p_vertgroup = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertgroup'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertgroup = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'userjit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__userjit);
	 * CPointer&lt;Short&gt; p_userjit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'userjit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__userjit = new long[]{18, 26};

	/**
	 * Field descriptor (offset) for struct member 'sta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__sta);
	 * CPointer&lt;Float&gt; p_sta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sta = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__end);
	 * CPointer&lt;Float&gt; p_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'lifetime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__lifetime);
	 * CPointer&lt;Float&gt; p_lifetime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lifetime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lifetime = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'totpart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__totpart);
	 * CPointer&lt;Integer&gt; p_totpart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpart = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'totkey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__totkey);
	 * CPointer&lt;Integer&gt; p_totkey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totkey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totkey = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'normfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__normfac);
	 * CPointer&lt;Float&gt; p_normfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normfac = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'obfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__obfac);
	 * CPointer&lt;Float&gt; p_obfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obfac = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'randfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__randfac);
	 * CPointer&lt;Float&gt; p_randfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randfac = new long[]{52, 60};

	/**
	 * Field descriptor (offset) for struct member 'texfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__texfac);
	 * CPointer&lt;Float&gt; p_texfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texfac = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'randlife'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__randlife);
	 * CPointer&lt;Float&gt; p_randlife = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randlife'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randlife = new long[]{60, 68};

	/**
	 * Field descriptor (offset) for struct member 'force'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__force);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_force = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'force'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__force = new long[]{64, 72};

	/**
	 * Field descriptor (offset) for struct member 'damp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__damp);
	 * CPointer&lt;Float&gt; p_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damp = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'nabla'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__nabla);
	 * CPointer&lt;Float&gt; p_nabla = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nabla'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nabla = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'vectsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__vectsize);
	 * CPointer&lt;Float&gt; p_vectsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vectsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vectsize = new long[]{84, 92};

	/**
	 * Field descriptor (offset) for struct member 'maxlen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__maxlen);
	 * CPointer&lt;Float&gt; p_maxlen = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxlen'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxlen = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'defvec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__defvec);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_defvec = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defvec'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defvec = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'mult'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__mult);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mult = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mult'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mult = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'life'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__life);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_life = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'life'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__life = new long[]{124, 132};

	/**
	 * Field descriptor (offset) for struct member 'child'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__child);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_child = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child'</li>
	 * <li>Signature: 'short[4]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child = new long[]{140, 148};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__mat);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_mat = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'short[4]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{148, 156};

	/**
	 * Field descriptor (offset) for struct member 'texmap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__texmap);
	 * CPointer&lt;Short&gt; p_texmap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texmap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texmap = new long[]{156, 164};

	/**
	 * Field descriptor (offset) for struct member 'curmult'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__curmult);
	 * CPointer&lt;Short&gt; p_curmult = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curmult'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curmult = new long[]{158, 166};

	/**
	 * Field descriptor (offset) for struct member 'staticstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__staticstep);
	 * CPointer&lt;Short&gt; p_staticstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'staticstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__staticstep = new long[]{160, 168};

	/**
	 * Field descriptor (offset) for struct member 'omat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__omat);
	 * CPointer&lt;Short&gt; p_omat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'omat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__omat = new long[]{162, 170};

	/**
	 * Field descriptor (offset) for struct member 'timetex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__timetex);
	 * CPointer&lt;Short&gt; p_timetex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timetex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timetex = new long[]{164, 172};

	/**
	 * Field descriptor (offset) for struct member 'speedtex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__speedtex);
	 * CPointer&lt;Short&gt; p_speedtex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speedtex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speedtex = new long[]{166, 174};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__flag2);
	 * CPointer&lt;Short&gt; p_flag2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{168, 176};

	/**
	 * Field descriptor (offset) for struct member 'flag2neg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__flag2neg);
	 * CPointer&lt;Short&gt; p_flag2neg = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2neg'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2neg = new long[]{170, 178};

	/**
	 * Field descriptor (offset) for struct member 'disp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__disp);
	 * CPointer&lt;Short&gt; p_disp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp = new long[]{172, 180};

	/**
	 * Field descriptor (offset) for struct member 'vertgroup_v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__vertgroup_v);
	 * CPointer&lt;Short&gt; p_vertgroup_v = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertgroup_v'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertgroup_v = new long[]{174, 182};

	/**
	 * Field descriptor (offset) for struct member 'vgroupname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__vgroupname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroupname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroupname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroupname = new long[]{176, 184};

	/**
	 * Field descriptor (offset) for struct member 'vgroupname_v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__vgroupname_v);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroupname_v = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroupname_v'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroupname_v = new long[]{240, 248};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix of parent {@link Object} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__imat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{304, 312};

	/**
	 * Field descriptor (offset) for struct member 'keys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__keys);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_keys = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keys'</li>
	 * <li>Signature: 'Particle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keys = new long[]{368, 376};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartEff parteff = ...;
	 * CPointer&lt;Object&gt; p = parteff.__dna__addressof(PartEff.__DNA__FIELD__group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{372, 384};

	public PartEff(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PartEff(PartEff that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<PartEff> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartEff.class};
		return new CPointer<PartEff>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartEff.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<PartEff> next) throws IOException
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
	
	public CPointer<PartEff> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartEff.class};
		return new CPointer<PartEff>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartEff.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<PartEff> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, type);
		} else {
			__io__block.writeShort(__io__address + 8, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, flag);
		} else {
			__io__block.writeShort(__io__address + 10, flag);
		}
	}

	/**
	 * Get method for struct member 'buttype'.
	 * @see #__DNA__FIELD__buttype
	 */
	
	public short getButtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'buttype'.
	 * @see #__DNA__FIELD__buttype
	 */
	
	public void setButtype(short buttype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, buttype);
		} else {
			__io__block.writeShort(__io__address + 12, buttype);
		}
	}

	/**
	 * Get method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public short getStype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public void setStype(short stype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, stype);
		} else {
			__io__block.writeShort(__io__address + 14, stype);
		}
	}

	/**
	 * Get method for struct member 'vertgroup'.
	 * @see #__DNA__FIELD__vertgroup
	 */
	
	public short getVertgroup() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'vertgroup'.
	 * @see #__DNA__FIELD__vertgroup
	 */
	
	public void setVertgroup(short vertgroup) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, vertgroup);
		} else {
			__io__block.writeShort(__io__address + 16, vertgroup);
		}
	}

	/**
	 * Get method for struct member 'userjit'.
	 * @see #__DNA__FIELD__userjit
	 */
	
	public short getUserjit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'userjit'.
	 * @see #__DNA__FIELD__userjit
	 */
	
	public void setUserjit(short userjit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, userjit);
		} else {
			__io__block.writeShort(__io__address + 18, userjit);
		}
	}

	/**
	 * Get method for struct member 'sta'.
	 * @see #__DNA__FIELD__sta
	 */
	
	public float getSta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'sta'.
	 * @see #__DNA__FIELD__sta
	 */
	
	public void setSta(float sta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, sta);
		} else {
			__io__block.writeFloat(__io__address + 20, sta);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public float getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(float end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, end);
		} else {
			__io__block.writeFloat(__io__address + 24, end);
		}
	}

	/**
	 * Get method for struct member 'lifetime'.
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public float getLifetime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'lifetime'.
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public void setLifetime(float lifetime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, lifetime);
		} else {
			__io__block.writeFloat(__io__address + 28, lifetime);
		}
	}

	/**
	 * Get method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public int getTotpart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public void setTotpart(int totpart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, totpart);
		} else {
			__io__block.writeInt(__io__address + 32, totpart);
		}
	}

	/**
	 * Get method for struct member 'totkey'.
	 * @see #__DNA__FIELD__totkey
	 */
	
	public int getTotkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'totkey'.
	 * @see #__DNA__FIELD__totkey
	 */
	
	public void setTotkey(int totkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, totkey);
		} else {
			__io__block.writeInt(__io__address + 36, totkey);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, seed);
		} else {
			__io__block.writeInt(__io__address + 40, seed);
		}
	}

	/**
	 * Get method for struct member 'normfac'.
	 * @see #__DNA__FIELD__normfac
	 */
	
	public float getNormfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'normfac'.
	 * @see #__DNA__FIELD__normfac
	 */
	
	public void setNormfac(float normfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, normfac);
		} else {
			__io__block.writeFloat(__io__address + 44, normfac);
		}
	}

	/**
	 * Get method for struct member 'obfac'.
	 * @see #__DNA__FIELD__obfac
	 */
	
	public float getObfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'obfac'.
	 * @see #__DNA__FIELD__obfac
	 */
	
	public void setObfac(float obfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, obfac);
		} else {
			__io__block.writeFloat(__io__address + 48, obfac);
		}
	}

	/**
	 * Get method for struct member 'randfac'.
	 * @see #__DNA__FIELD__randfac
	 */
	
	public float getRandfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'randfac'.
	 * @see #__DNA__FIELD__randfac
	 */
	
	public void setRandfac(float randfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, randfac);
		} else {
			__io__block.writeFloat(__io__address + 52, randfac);
		}
	}

	/**
	 * Get method for struct member 'texfac'.
	 * @see #__DNA__FIELD__texfac
	 */
	
	public float getTexfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'texfac'.
	 * @see #__DNA__FIELD__texfac
	 */
	
	public void setTexfac(float texfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, texfac);
		} else {
			__io__block.writeFloat(__io__address + 56, texfac);
		}
	}

	/**
	 * Get method for struct member 'randlife'.
	 * @see #__DNA__FIELD__randlife
	 */
	
	public float getRandlife() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'randlife'.
	 * @see #__DNA__FIELD__randlife
	 */
	
	public void setRandlife(float randlife) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, randlife);
		} else {
			__io__block.writeFloat(__io__address + 60, randlife);
		}
	}

	/**
	 * Get method for struct member 'force'.
	 * @see #__DNA__FIELD__force
	 */
	
	public CArrayFacade<Float> getForce() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'force'.
	 * @see #__DNA__FIELD__force
	 */
	
	public void setForce(CArrayFacade<Float> force) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(force, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, force)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, force);
		} else {
			__io__generic__copy( getForce(), force);
		}
	}

	/**
	 * Get method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public float getDamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public void setDamp(float damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, damp);
		} else {
			__io__block.writeFloat(__io__address + 76, damp);
		}
	}

	/**
	 * Get method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public float getNabla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public void setNabla(float nabla) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, nabla);
		} else {
			__io__block.writeFloat(__io__address + 80, nabla);
		}
	}

	/**
	 * Get method for struct member 'vectsize'.
	 * @see #__DNA__FIELD__vectsize
	 */
	
	public float getVectsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'vectsize'.
	 * @see #__DNA__FIELD__vectsize
	 */
	
	public void setVectsize(float vectsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, vectsize);
		} else {
			__io__block.writeFloat(__io__address + 84, vectsize);
		}
	}

	/**
	 * Get method for struct member 'maxlen'.
	 * @see #__DNA__FIELD__maxlen
	 */
	
	public float getMaxlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'maxlen'.
	 * @see #__DNA__FIELD__maxlen
	 */
	
	public void setMaxlen(float maxlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, maxlen);
		} else {
			__io__block.writeFloat(__io__address + 88, maxlen);
		}
	}

	/**
	 * Get method for struct member 'defvec'.
	 * @see #__DNA__FIELD__defvec
	 */
	
	public CArrayFacade<Float> getDefvec() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defvec'.
	 * @see #__DNA__FIELD__defvec
	 */
	
	public void setDefvec(CArrayFacade<Float> defvec) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(defvec, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defvec)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defvec);
		} else {
			__io__generic__copy( getDefvec(), defvec);
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
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 112;
		} else {
			__dna__offset = 104;
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
	 * Get method for struct member 'mult'.
	 * @see #__DNA__FIELD__mult
	 */
	
	public CArrayFacade<Float> getMult() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mult'.
	 * @see #__DNA__FIELD__mult
	 */
	
	public void setMult(CArrayFacade<Float> mult) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(mult, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mult)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mult);
		} else {
			__io__generic__copy( getMult(), mult);
		}
	}

	/**
	 * Get method for struct member 'life'.
	 * @see #__DNA__FIELD__life
	 */
	
	public CArrayFacade<Float> getLife() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'life'.
	 * @see #__DNA__FIELD__life
	 */
	
	public void setLife(CArrayFacade<Float> life) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(life, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, life)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, life);
		} else {
			__io__generic__copy( getLife(), life);
		}
	}

	/**
	 * Get method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public CArrayFacade<Short> getChild() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public void setChild(CArrayFacade<Short> child) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 148;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(child, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, child)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, child);
		} else {
			__io__generic__copy( getChild(), child);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CArrayFacade<Short> getMat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CArrayFacade<Short> mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 156;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mat);
		} else {
			__io__generic__copy( getMat(), mat);
		}
	}

	/**
	 * Get method for struct member 'texmap'.
	 * @see #__DNA__FIELD__texmap
	 */
	
	public short getTexmap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 164);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'texmap'.
	 * @see #__DNA__FIELD__texmap
	 */
	
	public void setTexmap(short texmap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 164, texmap);
		} else {
			__io__block.writeShort(__io__address + 156, texmap);
		}
	}

	/**
	 * Get method for struct member 'curmult'.
	 * @see #__DNA__FIELD__curmult
	 */
	
	public short getCurmult() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 166);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'curmult'.
	 * @see #__DNA__FIELD__curmult
	 */
	
	public void setCurmult(short curmult) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 166, curmult);
		} else {
			__io__block.writeShort(__io__address + 158, curmult);
		}
	}

	/**
	 * Get method for struct member 'staticstep'.
	 * @see #__DNA__FIELD__staticstep
	 */
	
	public short getStaticstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'staticstep'.
	 * @see #__DNA__FIELD__staticstep
	 */
	
	public void setStaticstep(short staticstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, staticstep);
		} else {
			__io__block.writeShort(__io__address + 160, staticstep);
		}
	}

	/**
	 * Get method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public short getOmat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 162);
		}
	}

	/**
	 * Set method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public void setOmat(short omat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, omat);
		} else {
			__io__block.writeShort(__io__address + 162, omat);
		}
	}

	/**
	 * Get method for struct member 'timetex'.
	 * @see #__DNA__FIELD__timetex
	 */
	
	public short getTimetex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'timetex'.
	 * @see #__DNA__FIELD__timetex
	 */
	
	public void setTimetex(short timetex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, timetex);
		} else {
			__io__block.writeShort(__io__address + 164, timetex);
		}
	}

	/**
	 * Get method for struct member 'speedtex'.
	 * @see #__DNA__FIELD__speedtex
	 */
	
	public short getSpeedtex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'speedtex'.
	 * @see #__DNA__FIELD__speedtex
	 */
	
	public void setSpeedtex(short speedtex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, speedtex);
		} else {
			__io__block.writeShort(__io__address + 166, speedtex);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public short getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(short flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, flag2);
		} else {
			__io__block.writeShort(__io__address + 168, flag2);
		}
	}

	/**
	 * Get method for struct member 'flag2neg'.
	 * @see #__DNA__FIELD__flag2neg
	 */
	
	public short getFlag2neg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'flag2neg'.
	 * @see #__DNA__FIELD__flag2neg
	 */
	
	public void setFlag2neg(short flag2neg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, flag2neg);
		} else {
			__io__block.writeShort(__io__address + 170, flag2neg);
		}
	}

	/**
	 * Get method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public short getDisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public void setDisp(short disp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, disp);
		} else {
			__io__block.writeShort(__io__address + 172, disp);
		}
	}

	/**
	 * Get method for struct member 'vertgroup_v'.
	 * @see #__DNA__FIELD__vertgroup_v
	 */
	
	public short getVertgroup_v() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'vertgroup_v'.
	 * @see #__DNA__FIELD__vertgroup_v
	 */
	
	public void setVertgroup_v(short vertgroup_v) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, vertgroup_v);
		} else {
			__io__block.writeShort(__io__address + 174, vertgroup_v);
		}
	}

	/**
	 * Get method for struct member 'vgroupname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroupname
	 */
	
	public CArrayFacade<Byte> getVgroupname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroupname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroupname
	 */
	
	public void setVgroupname(CArrayFacade<Byte> vgroupname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(vgroupname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroupname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroupname);
		} else {
			__io__generic__copy( getVgroupname(), vgroupname);
		}
	}

	/**
	 * Get method for struct member 'vgroupname_v'.
	 * @see #__DNA__FIELD__vgroupname_v
	 */
	
	public CArrayFacade<Byte> getVgroupname_v() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroupname_v'.
	 * @see #__DNA__FIELD__vgroupname_v
	 */
	
	public void setVgroupname_v(CArrayFacade<Byte> vgroupname_v) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(vgroupname_v, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroupname_v)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroupname_v);
		} else {
			__io__generic__copy( getVgroupname_v(), vgroupname_v);
		}
	}

	/**
	 * Get method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix of parent {@link Object} . </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix of parent {@link Object} . </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 304;
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
	 * Get method for struct member 'keys'.
	 * @see #__DNA__FIELD__keys
	 */
	
	public CPointer<Object> getKeys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'keys'.
	 * @see #__DNA__FIELD__keys
	 */
	
	public void setKeys(CPointer<Object> keys) throws IOException
	{
		long __address = ((keys == null) ? 0 : keys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 368, __address);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public CPointer<Collection> getGroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 372);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CPointer<Collection> group) throws IOException
	{
		long __address = ((group == null) ? 0 : group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 372, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PartEff> __io__addressof() {
		return new CPointer<PartEff>(__io__address, new Class[]{PartEff.class}, __io__block, __io__blockTable);
	}

}
