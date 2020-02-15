package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Lattice'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=260, size64=320)
public class Lattice extends CFacade {

	/**
	 * This is the sdna index of the struct Lattice.
	 * <p>
	 * It is required when allocating a new block to store data for Lattice.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 155;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__id);
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
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'pntsu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__pntsu);
	 * CPointer&lt;Short&gt; p_pntsu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pntsu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pntsu = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'pntsv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__pntsv);
	 * CPointer&lt;Short&gt; p_pntsv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pntsv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pntsv = new long[]{126, 162};

	/**
	 * Field descriptor (offset) for struct member 'pntsw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__pntsw);
	 * CPointer&lt;Short&gt; p_pntsw = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pntsw'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pntsw = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{130, 166};

	/**
	 * Field descriptor (offset) for struct member 'opntsu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__opntsu);
	 * CPointer&lt;Short&gt; p_opntsu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opntsu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opntsu = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'opntsv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__opntsv);
	 * CPointer&lt;Short&gt; p_opntsv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opntsv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opntsv = new long[]{134, 170};

	/**
	 * Field descriptor (offset) for struct member 'opntsw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__opntsw);
	 * CPointer&lt;Short&gt; p_opntsw = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opntsw'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opntsw = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{138, 174};

	/**
	 * Field descriptor (offset) for struct member 'typeu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__typeu);
	 * CPointer&lt;Byte&gt; p_typeu = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeu'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeu = new long[]{141, 177};

	/**
	 * Field descriptor (offset) for struct member 'typev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__typev);
	 * CPointer&lt;Byte&gt; p_typev = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typev'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typev = new long[]{142, 178};

	/**
	 * Field descriptor (offset) for struct member 'typew'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__typew);
	 * CPointer&lt;Byte&gt; p_typew = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typew'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typew = new long[]{143, 179};

	/**
	 * Field descriptor (offset) for struct member 'actbp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active element index, unset with LT_ACTBP_NONE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__actbp);
	 * CPointer&lt;Integer&gt; p_actbp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actbp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actbp = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'fu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__fu);
	 * CPointer&lt;Float&gt; p_fu = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fu'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fu = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'fv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__fv);
	 * CPointer&lt;Float&gt; p_fv = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fv'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fv = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'fw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__fw);
	 * CPointer&lt;Float&gt; p_fw = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fw'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fw = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'du'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__du);
	 * CPointer&lt;Float&gt; p_du = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'du'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__du = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'dv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__dv);
	 * CPointer&lt;Float&gt; p_dv = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dv'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dv = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'dw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__dw);
	 * CPointer&lt;Float&gt; p_dw = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dw'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dw = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'def'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__def);
	 * CPointer&lt;CPointer&lt;BPoint&gt;&gt; p_def = p.cast(new Class[]{CPointer.class, BPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'def'</li>
	 * <li>Signature: 'BPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__def = new long[]{172, 208};

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
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{176, 216};

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__key);
	 * CPointer&lt;CPointer&lt;Key&gt;&gt; p_key = p.cast(new Class[]{CPointer.class, Key.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'Key*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{180, 224};

	/**
	 * Field descriptor (offset) for struct member 'dvert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__dvert);
	 * CPointer&lt;CPointer&lt;MDeformVert&gt;&gt; p_dvert = p.cast(new Class[]{CPointer.class, MDeformVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dvert'</li>
	 * <li>Signature: 'MDeformVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dvert = new long[]{184, 232};

	/**
	 * Field descriptor (offset) for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiply the influence, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__vgroup);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup = new long[]{188, 240};

	/**
	 * Field descriptor (offset) for struct member 'editlatt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__editlatt);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_editlatt = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editlatt'</li>
	 * <li>Signature: 'EditLatt*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editlatt = new long[]{252, 304};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lattice lattice = ...;
	 * CPointer&lt;Object&gt; p = lattice.__dna__addressof(Lattice.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{256, 312};

	public Lattice(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Lattice(Lattice that) {
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
	 * Get method for struct member 'pntsu'.
	 * @see #__DNA__FIELD__pntsu
	 */
	
	public short getPntsu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'pntsu'.
	 * @see #__DNA__FIELD__pntsu
	 */
	
	public void setPntsu(short pntsu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, pntsu);
		} else {
			__io__block.writeShort(__io__address + 124, pntsu);
		}
	}

	/**
	 * Get method for struct member 'pntsv'.
	 * @see #__DNA__FIELD__pntsv
	 */
	
	public short getPntsv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 162);
		} else {
			return __io__block.readShort(__io__address + 126);
		}
	}

	/**
	 * Set method for struct member 'pntsv'.
	 * @see #__DNA__FIELD__pntsv
	 */
	
	public void setPntsv(short pntsv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 162, pntsv);
		} else {
			__io__block.writeShort(__io__address + 126, pntsv);
		}
	}

	/**
	 * Get method for struct member 'pntsw'.
	 * @see #__DNA__FIELD__pntsw
	 */
	
	public short getPntsw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 164);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'pntsw'.
	 * @see #__DNA__FIELD__pntsw
	 */
	
	public void setPntsw(short pntsw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 164, pntsw);
		} else {
			__io__block.writeShort(__io__address + 128, pntsw);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 166);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 166, flag);
		} else {
			__io__block.writeShort(__io__address + 130, flag);
		}
	}

	/**
	 * Get method for struct member 'opntsu'.
	 * @see #__DNA__FIELD__opntsu
	 */
	
	public short getOpntsu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'opntsu'.
	 * @see #__DNA__FIELD__opntsu
	 */
	
	public void setOpntsu(short opntsu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, opntsu);
		} else {
			__io__block.writeShort(__io__address + 132, opntsu);
		}
	}

	/**
	 * Get method for struct member 'opntsv'.
	 * @see #__DNA__FIELD__opntsv
	 */
	
	public short getOpntsv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'opntsv'.
	 * @see #__DNA__FIELD__opntsv
	 */
	
	public void setOpntsv(short opntsv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, opntsv);
		} else {
			__io__block.writeShort(__io__address + 134, opntsv);
		}
	}

	/**
	 * Get method for struct member 'opntsw'.
	 * @see #__DNA__FIELD__opntsw
	 */
	
	public short getOpntsw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'opntsw'.
	 * @see #__DNA__FIELD__opntsw
	 */
	
	public void setOpntsw(short opntsw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, opntsw);
		} else {
			__io__block.writeShort(__io__address + 136, opntsw);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 174, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 138, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 174;
		} else {
			__dna__offset = 138;
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
	 * Get method for struct member 'typeu'.
	 * @see #__DNA__FIELD__typeu
	 */
	
	public byte getTypeu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 177);
		} else {
			return __io__block.readByte(__io__address + 141);
		}
	}

	/**
	 * Set method for struct member 'typeu'.
	 * @see #__DNA__FIELD__typeu
	 */
	
	public void setTypeu(byte typeu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 177, typeu);
		} else {
			__io__block.writeByte(__io__address + 141, typeu);
		}
	}

	/**
	 * Get method for struct member 'typev'.
	 * @see #__DNA__FIELD__typev
	 */
	
	public byte getTypev() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 178);
		} else {
			return __io__block.readByte(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'typev'.
	 * @see #__DNA__FIELD__typev
	 */
	
	public void setTypev(byte typev) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 178, typev);
		} else {
			__io__block.writeByte(__io__address + 142, typev);
		}
	}

	/**
	 * Get method for struct member 'typew'.
	 * @see #__DNA__FIELD__typew
	 */
	
	public byte getTypew() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 179);
		} else {
			return __io__block.readByte(__io__address + 143);
		}
	}

	/**
	 * Set method for struct member 'typew'.
	 * @see #__DNA__FIELD__typew
	 */
	
	public void setTypew(byte typew) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 179, typew);
		} else {
			__io__block.writeByte(__io__address + 143, typew);
		}
	}

	/**
	 * Get method for struct member 'actbp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active element index, unset with LT_ACTBP_NONE. </p>
	 * @see #__DNA__FIELD__actbp
	 */
	
	public int getActbp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'actbp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active element index, unset with LT_ACTBP_NONE. </p>
	 * @see #__DNA__FIELD__actbp
	 */
	
	public void setActbp(int actbp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, actbp);
		} else {
			__io__block.writeInt(__io__address + 144, actbp);
		}
	}

	/**
	 * Get method for struct member 'fu'.
	 * @see #__DNA__FIELD__fu
	 */
	
	public float getFu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'fu'.
	 * @see #__DNA__FIELD__fu
	 */
	
	public void setFu(float fu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, fu);
		} else {
			__io__block.writeFloat(__io__address + 148, fu);
		}
	}

	/**
	 * Get method for struct member 'fv'.
	 * @see #__DNA__FIELD__fv
	 */
	
	public float getFv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'fv'.
	 * @see #__DNA__FIELD__fv
	 */
	
	public void setFv(float fv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, fv);
		} else {
			__io__block.writeFloat(__io__address + 152, fv);
		}
	}

	/**
	 * Get method for struct member 'fw'.
	 * @see #__DNA__FIELD__fw
	 */
	
	public float getFw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'fw'.
	 * @see #__DNA__FIELD__fw
	 */
	
	public void setFw(float fw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, fw);
		} else {
			__io__block.writeFloat(__io__address + 156, fw);
		}
	}

	/**
	 * Get method for struct member 'du'.
	 * @see #__DNA__FIELD__du
	 */
	
	public float getDu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'du'.
	 * @see #__DNA__FIELD__du
	 */
	
	public void setDu(float du) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, du);
		} else {
			__io__block.writeFloat(__io__address + 160, du);
		}
	}

	/**
	 * Get method for struct member 'dv'.
	 * @see #__DNA__FIELD__dv
	 */
	
	public float getDv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'dv'.
	 * @see #__DNA__FIELD__dv
	 */
	
	public void setDv(float dv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, dv);
		} else {
			__io__block.writeFloat(__io__address + 164, dv);
		}
	}

	/**
	 * Get method for struct member 'dw'.
	 * @see #__DNA__FIELD__dw
	 */
	
	public float getDw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'dw'.
	 * @see #__DNA__FIELD__dw
	 */
	
	public void setDw(float dw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, dw);
		} else {
			__io__block.writeFloat(__io__address + 168, dw);
		}
	}

	/**
	 * Get method for struct member 'def'.
	 * @see #__DNA__FIELD__def
	 */
	
	public CPointer<BPoint> getDef() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BPoint.class};
		return new CPointer<BPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'def'.
	 * @see #__DNA__FIELD__def
	 */
	
	public void setDef(CPointer<BPoint> def) throws IOException
	{
		long __address = ((def == null) ? 0 : def.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
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
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
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
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'dvert'.
	 * @see #__DNA__FIELD__dvert
	 */
	
	public CPointer<MDeformVert> getDvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformVert.class};
		return new CPointer<MDeformVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dvert'.
	 * @see #__DNA__FIELD__dvert
	 */
	
	public void setDvert(CPointer<MDeformVert> dvert) throws IOException
	{
		long __address = ((dvert == null) ? 0 : dvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiply the influence, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public CArrayFacade<Byte> getVgroup() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiply the influence, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public void setVgroup(CArrayFacade<Byte> vgroup) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(vgroup, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup);
		} else {
			__io__generic__copy( getVgroup(), vgroup);
		}
	}

	/**
	 * Get method for struct member 'editlatt'.
	 * @see #__DNA__FIELD__editlatt
	 */
	
	public CPointer<Object> getEditlatt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editlatt'.
	 * @see #__DNA__FIELD__editlatt
	 */
	
	public void setEditlatt(CPointer<Object> editlatt) throws IOException
	{
		long __address = ((editlatt == null) ? 0 : editlatt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Lattice> __io__addressof() {
		return new CPointer<Lattice>(__io__address, new Class[]{Lattice.class}, __io__block, __io__blockTable);
	}

}
