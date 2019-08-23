package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Lamp'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=332, size64=384)
public class Lamp extends CFacade {

	/**
	 * This is the sdna index of the struct Lamp.
	 * <p>
	 * It is required when allocating a new block to store data for Lamp.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 47;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__id);
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
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{126, 162};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'k'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__k);
	 * CPointer&lt;Float&gt; p_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__k = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'shdwr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shdwr);
	 * CPointer&lt;Float&gt; p_shdwr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shdwr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shdwr = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'shdwg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shdwg);
	 * CPointer&lt;Float&gt; p_shdwg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shdwg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shdwg = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'shdwb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shdwb);
	 * CPointer&lt;Float&gt; p_shdwb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shdwb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shdwb = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'shdwpad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shdwpad);
	 * CPointer&lt;Float&gt; p_shdwpad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shdwpad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shdwpad = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'energy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__energy);
	 * CPointer&lt;Float&gt; p_energy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'energy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__energy = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'spotsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__spotsize);
	 * CPointer&lt;Float&gt; p_spotsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spotsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spotsize = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'spotblend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__spotblend);
	 * CPointer&lt;Float&gt; p_spotblend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spotblend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spotblend = new long[]{176, 212};

	/**
	 * Field descriptor (offset) for struct member 'att1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__att1);
	 * CPointer&lt;Float&gt; p_att1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'att1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__att1 = new long[]{180, 216};

	/**
	 * Field descriptor (offset) for struct member 'att2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__att2);
	 * CPointer&lt;Float&gt; p_att2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'att2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__att2 = new long[]{184, 220};

	/**
	 * Field descriptor (offset) for struct member 'coeff_const'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__coeff_const);
	 * CPointer&lt;Float&gt; p_coeff_const = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coeff_const'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coeff_const = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'coeff_lin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__coeff_lin);
	 * CPointer&lt;Float&gt; p_coeff_lin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coeff_lin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coeff_lin = new long[]{192, 228};

	/**
	 * Field descriptor (offset) for struct member 'coeff_quad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__coeff_quad);
	 * CPointer&lt;Float&gt; p_coeff_quad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coeff_quad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coeff_quad = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{200, 236};

	/**
	 * Field descriptor (offset) for struct member 'curfalloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__curfalloff);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curfalloff = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curfalloff'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curfalloff = new long[]{204, 240};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Short&gt; p_falloff_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{208, 248};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{210, 250};

	/**
	 * Field descriptor (offset) for struct member 'clipsta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__clipsta);
	 * CPointer&lt;Float&gt; p_clipsta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipsta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipsta = new long[]{212, 252};

	/**
	 * Field descriptor (offset) for struct member 'clipend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__clipend);
	 * CPointer&lt;Float&gt; p_clipend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipend = new long[]{216, 256};

	/**
	 * Field descriptor (offset) for struct member 'bias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__bias);
	 * CPointer&lt;Float&gt; p_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bias = new long[]{220, 260};

	/**
	 * Field descriptor (offset) for struct member 'soft'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__soft);
	 * CPointer&lt;Float&gt; p_soft = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'soft'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__soft = new long[]{224, 264};

	/**
	 * Field descriptor (offset) for struct member 'bleedbias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__bleedbias);
	 * CPointer&lt;Float&gt; p_bleedbias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bleedbias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bleedbias = new long[]{228, 268};

	/**
	 * Field descriptor (offset) for struct member 'bleedexp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__bleedexp);
	 * CPointer&lt;Float&gt; p_bleedexp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bleedexp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bleedexp = new long[]{232, 272};

	/**
	 * Field descriptor (offset) for struct member 'bufsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__bufsize);
	 * CPointer&lt;Short&gt; p_bufsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bufsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bufsize = new long[]{236, 276};

	/**
	 * Field descriptor (offset) for struct member 'samp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__samp);
	 * CPointer&lt;Short&gt; p_samp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samp = new long[]{238, 278};

	/**
	 * Field descriptor (offset) for struct member 'buffers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__buffers);
	 * CPointer&lt;Short&gt; p_buffers = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buffers'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buffers = new long[]{240, 280};

	/**
	 * Field descriptor (offset) for struct member 'filtertype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__filtertype);
	 * CPointer&lt;Short&gt; p_filtertype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filtertype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filtertype = new long[]{242, 282};

	/**
	 * Field descriptor (offset) for struct member 'bufflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__bufflag);
	 * CPointer&lt;Byte&gt; p_bufflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bufflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bufflag = new long[]{244, 284};

	/**
	 * Field descriptor (offset) for struct member 'buftype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__buftype);
	 * CPointer&lt;Byte&gt; p_buftype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buftype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buftype = new long[]{245, 285};

	/**
	 * Field descriptor (offset) for struct member 'area_shape'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__area_shape);
	 * CPointer&lt;Short&gt; p_area_shape = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'area_shape'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__area_shape = new long[]{246, 286};

	/**
	 * Field descriptor (offset) for struct member 'area_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__area_size);
	 * CPointer&lt;Float&gt; p_area_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'area_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__area_size = new long[]{248, 288};

	/**
	 * Field descriptor (offset) for struct member 'area_sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__area_sizey);
	 * CPointer&lt;Float&gt; p_area_sizey = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'area_sizey'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__area_sizey = new long[]{252, 292};

	/**
	 * Field descriptor (offset) for struct member 'area_sizez'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__area_sizez);
	 * CPointer&lt;Float&gt; p_area_sizez = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'area_sizez'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__area_sizez = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'sun_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sun_angle);
	 * CPointer&lt;Float&gt; p_sun_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_angle = new long[]{260, 300};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{264, 304};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__texact);
	 * CPointer&lt;Short&gt; p_texact = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texact'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texact = new long[]{268, 308};

	/**
	 * Field descriptor (offset) for struct member 'shadhalostep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shadhalostep);
	 * CPointer&lt;Short&gt; p_shadhalostep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadhalostep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadhalostep = new long[]{270, 310};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{272, 312};

	/**
	 * Field descriptor (offset) for struct member 'pr_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__pr_texture);
	 * CPointer&lt;Short&gt; p_pr_texture = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_texture'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_texture = new long[]{276, 320};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Short&gt; p_use_nodes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{278, 322};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD___pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{280, 324};

	/**
	 * Field descriptor (offset) for struct member 'cascade_max_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__cascade_max_dist);
	 * CPointer&lt;Float&gt; p_cascade_max_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cascade_max_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cascade_max_dist = new long[]{284, 328};

	/**
	 * Field descriptor (offset) for struct member 'cascade_exponent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__cascade_exponent);
	 * CPointer&lt;Float&gt; p_cascade_exponent = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cascade_exponent'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cascade_exponent = new long[]{288, 332};

	/**
	 * Field descriptor (offset) for struct member 'cascade_fade'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__cascade_fade);
	 * CPointer&lt;Float&gt; p_cascade_fade = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cascade_fade'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cascade_fade = new long[]{292, 336};

	/**
	 * Field descriptor (offset) for struct member 'cascade_count'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__cascade_count);
	 * CPointer&lt;Integer&gt; p_cascade_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cascade_count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cascade_count = new long[]{296, 340};

	/**
	 * Field descriptor (offset) for struct member 'contact_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__contact_dist);
	 * CPointer&lt;Float&gt; p_contact_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contact_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contact_dist = new long[]{300, 344};

	/**
	 * Field descriptor (offset) for struct member 'contact_bias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__contact_bias);
	 * CPointer&lt;Float&gt; p_contact_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contact_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contact_bias = new long[]{304, 348};

	/**
	 * Field descriptor (offset) for struct member 'contact_spread'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__contact_spread);
	 * CPointer&lt;Float&gt; p_contact_spread = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contact_spread'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contact_spread = new long[]{308, 352};

	/**
	 * Field descriptor (offset) for struct member 'contact_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__contact_thickness);
	 * CPointer&lt;Float&gt; p_contact_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contact_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contact_thickness = new long[]{312, 356};

	/**
	 * Field descriptor (offset) for struct member 'spec_fac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__spec_fac);
	 * CPointer&lt;Float&gt; p_spec_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spec_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spec_fac = new long[]{316, 360};

	/**
	 * Field descriptor (offset) for struct member 'att_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__att_dist);
	 * CPointer&lt;Float&gt; p_att_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'att_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__att_dist = new long[]{320, 364};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{324, 368};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{328, 376};

	public Lamp(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Lamp(Lamp that) {
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
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 124);
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
			__io__block.writeShort(__io__address + 124, type);
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
			return __io__block.readShort(__io__address + 126);
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
			__io__block.writeShort(__io__address + 126, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, mode);
		} else {
			__io__block.writeInt(__io__address + 128, mode);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, r);
		} else {
			__io__block.writeFloat(__io__address + 132, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, g);
		} else {
			__io__block.writeFloat(__io__address + 136, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, b);
		} else {
			__io__block.writeFloat(__io__address + 140, b);
		}
	}

	/**
	 * Get method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public float getK() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public void setK(float k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, k);
		} else {
			__io__block.writeFloat(__io__address + 144, k);
		}
	}

	/**
	 * Get method for struct member 'shdwr'.
	 * @see #__DNA__FIELD__shdwr
	 */
	
	public float getShdwr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'shdwr'.
	 * @see #__DNA__FIELD__shdwr
	 */
	
	public void setShdwr(float shdwr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, shdwr);
		} else {
			__io__block.writeFloat(__io__address + 148, shdwr);
		}
	}

	/**
	 * Get method for struct member 'shdwg'.
	 * @see #__DNA__FIELD__shdwg
	 */
	
	public float getShdwg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'shdwg'.
	 * @see #__DNA__FIELD__shdwg
	 */
	
	public void setShdwg(float shdwg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, shdwg);
		} else {
			__io__block.writeFloat(__io__address + 152, shdwg);
		}
	}

	/**
	 * Get method for struct member 'shdwb'.
	 * @see #__DNA__FIELD__shdwb
	 */
	
	public float getShdwb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'shdwb'.
	 * @see #__DNA__FIELD__shdwb
	 */
	
	public void setShdwb(float shdwb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, shdwb);
		} else {
			__io__block.writeFloat(__io__address + 156, shdwb);
		}
	}

	/**
	 * Get method for struct member 'shdwpad'.
	 * @see #__DNA__FIELD__shdwpad
	 */
	
	public float getShdwpad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'shdwpad'.
	 * @see #__DNA__FIELD__shdwpad
	 */
	
	public void setShdwpad(float shdwpad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, shdwpad);
		} else {
			__io__block.writeFloat(__io__address + 160, shdwpad);
		}
	}

	/**
	 * Get method for struct member 'energy'.
	 * @see #__DNA__FIELD__energy
	 */
	
	public float getEnergy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'energy'.
	 * @see #__DNA__FIELD__energy
	 */
	
	public void setEnergy(float energy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, energy);
		} else {
			__io__block.writeFloat(__io__address + 164, energy);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, dist);
		} else {
			__io__block.writeFloat(__io__address + 168, dist);
		}
	}

	/**
	 * Get method for struct member 'spotsize'.
	 * @see #__DNA__FIELD__spotsize
	 */
	
	public float getSpotsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'spotsize'.
	 * @see #__DNA__FIELD__spotsize
	 */
	
	public void setSpotsize(float spotsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, spotsize);
		} else {
			__io__block.writeFloat(__io__address + 172, spotsize);
		}
	}

	/**
	 * Get method for struct member 'spotblend'.
	 * @see #__DNA__FIELD__spotblend
	 */
	
	public float getSpotblend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'spotblend'.
	 * @see #__DNA__FIELD__spotblend
	 */
	
	public void setSpotblend(float spotblend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, spotblend);
		} else {
			__io__block.writeFloat(__io__address + 176, spotblend);
		}
	}

	/**
	 * Get method for struct member 'att1'.
	 * @see #__DNA__FIELD__att1
	 */
	
	public float getAtt1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'att1'.
	 * @see #__DNA__FIELD__att1
	 */
	
	public void setAtt1(float att1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, att1);
		} else {
			__io__block.writeFloat(__io__address + 180, att1);
		}
	}

	/**
	 * Get method for struct member 'att2'.
	 * @see #__DNA__FIELD__att2
	 */
	
	public float getAtt2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'att2'.
	 * @see #__DNA__FIELD__att2
	 */
	
	public void setAtt2(float att2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, att2);
		} else {
			__io__block.writeFloat(__io__address + 184, att2);
		}
	}

	/**
	 * Get method for struct member 'coeff_const'.
	 * @see #__DNA__FIELD__coeff_const
	 */
	
	public float getCoeff_const() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'coeff_const'.
	 * @see #__DNA__FIELD__coeff_const
	 */
	
	public void setCoeff_const(float coeff_const) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, coeff_const);
		} else {
			__io__block.writeFloat(__io__address + 188, coeff_const);
		}
	}

	/**
	 * Get method for struct member 'coeff_lin'.
	 * @see #__DNA__FIELD__coeff_lin
	 */
	
	public float getCoeff_lin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'coeff_lin'.
	 * @see #__DNA__FIELD__coeff_lin
	 */
	
	public void setCoeff_lin(float coeff_lin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, coeff_lin);
		} else {
			__io__block.writeFloat(__io__address + 192, coeff_lin);
		}
	}

	/**
	 * Get method for struct member 'coeff_quad'.
	 * @see #__DNA__FIELD__coeff_quad
	 */
	
	public float getCoeff_quad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'coeff_quad'.
	 * @see #__DNA__FIELD__coeff_quad
	 */
	
	public void setCoeff_quad(float coeff_quad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, coeff_quad);
		} else {
			__io__block.writeFloat(__io__address + 196, coeff_quad);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 236;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public CPointer<CurveMapping> getCurfalloff() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public void setCurfalloff(CPointer<CurveMapping> curfalloff) throws IOException
	{
		long __address = ((curfalloff == null) ? 0 : curfalloff.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public short getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 248);
		} else {
			return __io__block.readShort(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(short falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 248, falloff_type);
		} else {
			__io__block.writeShort(__io__address + 208, falloff_type);
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
			return new CArrayFacade<Byte>(__io__address + 250, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 210, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 250;
		} else {
			__dna__offset = 210;
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
	 * Get method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public float getClipsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public void setClipsta(float clipsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, clipsta);
		} else {
			__io__block.writeFloat(__io__address + 212, clipsta);
		}
	}

	/**
	 * Get method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public float getClipend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public void setClipend(float clipend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, clipend);
		} else {
			__io__block.writeFloat(__io__address + 216, clipend);
		}
	}

	/**
	 * Get method for struct member 'bias'.
	 * @see #__DNA__FIELD__bias
	 */
	
	public float getBias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'bias'.
	 * @see #__DNA__FIELD__bias
	 */
	
	public void setBias(float bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, bias);
		} else {
			__io__block.writeFloat(__io__address + 220, bias);
		}
	}

	/**
	 * Get method for struct member 'soft'.
	 * @see #__DNA__FIELD__soft
	 */
	
	public float getSoft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'soft'.
	 * @see #__DNA__FIELD__soft
	 */
	
	public void setSoft(float soft) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, soft);
		} else {
			__io__block.writeFloat(__io__address + 224, soft);
		}
	}

	/**
	 * Get method for struct member 'bleedbias'.
	 * @see #__DNA__FIELD__bleedbias
	 */
	
	public float getBleedbias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'bleedbias'.
	 * @see #__DNA__FIELD__bleedbias
	 */
	
	public void setBleedbias(float bleedbias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, bleedbias);
		} else {
			__io__block.writeFloat(__io__address + 228, bleedbias);
		}
	}

	/**
	 * Get method for struct member 'bleedexp'.
	 * @see #__DNA__FIELD__bleedexp
	 */
	
	public float getBleedexp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'bleedexp'.
	 * @see #__DNA__FIELD__bleedexp
	 */
	
	public void setBleedexp(float bleedexp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, bleedexp);
		} else {
			__io__block.writeFloat(__io__address + 232, bleedexp);
		}
	}

	/**
	 * Get method for struct member 'bufsize'.
	 * @see #__DNA__FIELD__bufsize
	 */
	
	public short getBufsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 276);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'bufsize'.
	 * @see #__DNA__FIELD__bufsize
	 */
	
	public void setBufsize(short bufsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 276, bufsize);
		} else {
			__io__block.writeShort(__io__address + 236, bufsize);
		}
	}

	/**
	 * Get method for struct member 'samp'.
	 * @see #__DNA__FIELD__samp
	 */
	
	public short getSamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 278);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'samp'.
	 * @see #__DNA__FIELD__samp
	 */
	
	public void setSamp(short samp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 278, samp);
		} else {
			__io__block.writeShort(__io__address + 238, samp);
		}
	}

	/**
	 * Get method for struct member 'buffers'.
	 * @see #__DNA__FIELD__buffers
	 */
	
	public short getBuffers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 280);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'buffers'.
	 * @see #__DNA__FIELD__buffers
	 */
	
	public void setBuffers(short buffers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 280, buffers);
		} else {
			__io__block.writeShort(__io__address + 240, buffers);
		}
	}

	/**
	 * Get method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public short getFiltertype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 282);
		} else {
			return __io__block.readShort(__io__address + 242);
		}
	}

	/**
	 * Set method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public void setFiltertype(short filtertype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 282, filtertype);
		} else {
			__io__block.writeShort(__io__address + 242, filtertype);
		}
	}

	/**
	 * Get method for struct member 'bufflag'.
	 * @see #__DNA__FIELD__bufflag
	 */
	
	public byte getBufflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 284);
		} else {
			return __io__block.readByte(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'bufflag'.
	 * @see #__DNA__FIELD__bufflag
	 */
	
	public void setBufflag(byte bufflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 284, bufflag);
		} else {
			__io__block.writeByte(__io__address + 244, bufflag);
		}
	}

	/**
	 * Get method for struct member 'buftype'.
	 * @see #__DNA__FIELD__buftype
	 */
	
	public byte getBuftype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 285);
		} else {
			return __io__block.readByte(__io__address + 245);
		}
	}

	/**
	 * Set method for struct member 'buftype'.
	 * @see #__DNA__FIELD__buftype
	 */
	
	public void setBuftype(byte buftype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 285, buftype);
		} else {
			__io__block.writeByte(__io__address + 245, buftype);
		}
	}

	/**
	 * Get method for struct member 'area_shape'.
	 * @see #__DNA__FIELD__area_shape
	 */
	
	public short getArea_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 286);
		} else {
			return __io__block.readShort(__io__address + 246);
		}
	}

	/**
	 * Set method for struct member 'area_shape'.
	 * @see #__DNA__FIELD__area_shape
	 */
	
	public void setArea_shape(short area_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 286, area_shape);
		} else {
			__io__block.writeShort(__io__address + 246, area_shape);
		}
	}

	/**
	 * Get method for struct member 'area_size'.
	 * @see #__DNA__FIELD__area_size
	 */
	
	public float getArea_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'area_size'.
	 * @see #__DNA__FIELD__area_size
	 */
	
	public void setArea_size(float area_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, area_size);
		} else {
			__io__block.writeFloat(__io__address + 248, area_size);
		}
	}

	/**
	 * Get method for struct member 'area_sizey'.
	 * @see #__DNA__FIELD__area_sizey
	 */
	
	public float getArea_sizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'area_sizey'.
	 * @see #__DNA__FIELD__area_sizey
	 */
	
	public void setArea_sizey(float area_sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, area_sizey);
		} else {
			__io__block.writeFloat(__io__address + 252, area_sizey);
		}
	}

	/**
	 * Get method for struct member 'area_sizez'.
	 * @see #__DNA__FIELD__area_sizez
	 */
	
	public float getArea_sizez() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'area_sizez'.
	 * @see #__DNA__FIELD__area_sizez
	 */
	
	public void setArea_sizez(float area_sizez) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, area_sizez);
		} else {
			__io__block.writeFloat(__io__address + 256, area_sizez);
		}
	}

	/**
	 * Get method for struct member 'sun_angle'.
	 * @see #__DNA__FIELD__sun_angle
	 */
	
	public float getSun_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'sun_angle'.
	 * @see #__DNA__FIELD__sun_angle
	 */
	
	public void setSun_angle(float sun_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, sun_angle);
		} else {
			__io__block.writeFloat(__io__address + 260, sun_angle);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 304;
		} else {
			__dna__offset = 264;
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
	 * Get method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public short getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 308);
		} else {
			return __io__block.readShort(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(short texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 308, texact);
		} else {
			__io__block.writeShort(__io__address + 268, texact);
		}
	}

	/**
	 * Get method for struct member 'shadhalostep'.
	 * @see #__DNA__FIELD__shadhalostep
	 */
	
	public short getShadhalostep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 310);
		} else {
			return __io__block.readShort(__io__address + 270);
		}
	}

	/**
	 * Set method for struct member 'shadhalostep'.
	 * @see #__DNA__FIELD__shadhalostep
	 */
	
	public void setShadhalostep(short shadhalostep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 310, shadhalostep);
		} else {
			__io__block.writeShort(__io__address + 270, shadhalostep);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 320);
		} else {
			return __io__block.readShort(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 320, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 276, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public short getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 322);
		} else {
			return __io__block.readShort(__io__address + 278);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(short use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 322, use_nodes);
		} else {
			__io__block.writeShort(__io__address + 278, use_nodes);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public CArrayFacade<Byte> get_pad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(CArrayFacade<Byte> _pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 324;
		} else {
			__dna__offset = 280;
		}
		if (__io__equals(_pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad6);
		} else {
			__io__generic__copy( get_pad6(), _pad6);
		}
	}

	/**
	 * Get method for struct member 'cascade_max_dist'.
	 * @see #__DNA__FIELD__cascade_max_dist
	 */
	
	public float getCascade_max_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'cascade_max_dist'.
	 * @see #__DNA__FIELD__cascade_max_dist
	 */
	
	public void setCascade_max_dist(float cascade_max_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, cascade_max_dist);
		} else {
			__io__block.writeFloat(__io__address + 284, cascade_max_dist);
		}
	}

	/**
	 * Get method for struct member 'cascade_exponent'.
	 * @see #__DNA__FIELD__cascade_exponent
	 */
	
	public float getCascade_exponent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'cascade_exponent'.
	 * @see #__DNA__FIELD__cascade_exponent
	 */
	
	public void setCascade_exponent(float cascade_exponent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, cascade_exponent);
		} else {
			__io__block.writeFloat(__io__address + 288, cascade_exponent);
		}
	}

	/**
	 * Get method for struct member 'cascade_fade'.
	 * @see #__DNA__FIELD__cascade_fade
	 */
	
	public float getCascade_fade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'cascade_fade'.
	 * @see #__DNA__FIELD__cascade_fade
	 */
	
	public void setCascade_fade(float cascade_fade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, cascade_fade);
		} else {
			__io__block.writeFloat(__io__address + 292, cascade_fade);
		}
	}

	/**
	 * Get method for struct member 'cascade_count'.
	 * @see #__DNA__FIELD__cascade_count
	 */
	
	public int getCascade_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 340);
		} else {
			return __io__block.readInt(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'cascade_count'.
	 * @see #__DNA__FIELD__cascade_count
	 */
	
	public void setCascade_count(int cascade_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 340, cascade_count);
		} else {
			__io__block.writeInt(__io__address + 296, cascade_count);
		}
	}

	/**
	 * Get method for struct member 'contact_dist'.
	 * @see #__DNA__FIELD__contact_dist
	 */
	
	public float getContact_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'contact_dist'.
	 * @see #__DNA__FIELD__contact_dist
	 */
	
	public void setContact_dist(float contact_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, contact_dist);
		} else {
			__io__block.writeFloat(__io__address + 300, contact_dist);
		}
	}

	/**
	 * Get method for struct member 'contact_bias'.
	 * @see #__DNA__FIELD__contact_bias
	 */
	
	public float getContact_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 348);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'contact_bias'.
	 * @see #__DNA__FIELD__contact_bias
	 */
	
	public void setContact_bias(float contact_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 348, contact_bias);
		} else {
			__io__block.writeFloat(__io__address + 304, contact_bias);
		}
	}

	/**
	 * Get method for struct member 'contact_spread'.
	 * @see #__DNA__FIELD__contact_spread
	 */
	
	public float getContact_spread() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'contact_spread'.
	 * @see #__DNA__FIELD__contact_spread
	 */
	
	public void setContact_spread(float contact_spread) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, contact_spread);
		} else {
			__io__block.writeFloat(__io__address + 308, contact_spread);
		}
	}

	/**
	 * Get method for struct member 'contact_thickness'.
	 * @see #__DNA__FIELD__contact_thickness
	 */
	
	public float getContact_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 356);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'contact_thickness'.
	 * @see #__DNA__FIELD__contact_thickness
	 */
	
	public void setContact_thickness(float contact_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 356, contact_thickness);
		} else {
			__io__block.writeFloat(__io__address + 312, contact_thickness);
		}
	}

	/**
	 * Get method for struct member 'spec_fac'.
	 * @see #__DNA__FIELD__spec_fac
	 */
	
	public float getSpec_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 360);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'spec_fac'.
	 * @see #__DNA__FIELD__spec_fac
	 */
	
	public void setSpec_fac(float spec_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 360, spec_fac);
		} else {
			__io__block.writeFloat(__io__address + 316, spec_fac);
		}
	}

	/**
	 * Get method for struct member 'att_dist'.
	 * @see #__DNA__FIELD__att_dist
	 */
	
	public float getAtt_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'att_dist'.
	 * @see #__DNA__FIELD__att_dist
	 */
	
	public void setAtt_dist(float att_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, att_dist);
		} else {
			__io__block.writeFloat(__io__address + 320, att_dist);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 324);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 324, __address);
		}
	}

	/**
	 * Get method for struct member 'nodetree'.
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public CPointer<bNodeTree> getNodetree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeTree.class};
		return new CPointer<bNodeTree>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeTree.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'nodetree'.
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public void setNodetree(CPointer<bNodeTree> nodetree) throws IOException
	{
		long __address = ((nodetree == null) ? 0 : nodetree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Lamp> __io__addressof() {
		return new CPointer<Lamp>(__io__address, new Class[]{Lamp.class}, __io__block, __io__blockTable);
	}

}
