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

@CMetaData(size32=424, size64=536)
public class Lamp extends CFacade {

	/**
	 * This is the sdna index of the struct Lamp.
	 * <p>
	 * It is required when allocating a new block to store data for Lamp.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 42;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of Lamp
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
	public static final long[] __DNA__FIELD__type = new long[]{104, 128};

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
	public static final long[] __DNA__FIELD__flag = new long[]{106, 130};

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
	public static final long[] __DNA__FIELD__mode = new long[]{108, 132};

	/**
	 * Field descriptor (offset) for struct member 'colormodel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__colormodel);
	 * CPointer&lt;Short&gt; p_colormodel = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colormodel'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colormodel = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'totex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__totex);
	 * CPointer&lt;Short&gt; p_totex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totex = new long[]{114, 138};

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
	public static final long[] __DNA__FIELD__r = new long[]{116, 140};

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
	public static final long[] __DNA__FIELD__g = new long[]{120, 144};

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
	public static final long[] __DNA__FIELD__b = new long[]{124, 148};

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
	public static final long[] __DNA__FIELD__k = new long[]{128, 152};

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
	public static final long[] __DNA__FIELD__shdwr = new long[]{132, 156};

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
	public static final long[] __DNA__FIELD__shdwg = new long[]{136, 160};

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
	public static final long[] __DNA__FIELD__shdwb = new long[]{140, 164};

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
	public static final long[] __DNA__FIELD__shdwpad = new long[]{144, 168};

	/**
	 * Field descriptor (offset) for struct member 'energy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light that the lamp emits
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
	public static final long[] __DNA__FIELD__energy = new long[]{148, 172};

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
	public static final long[] __DNA__FIELD__dist = new long[]{152, 176};

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
	public static final long[] __DNA__FIELD__spotsize = new long[]{156, 180};

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
	public static final long[] __DNA__FIELD__spotblend = new long[]{160, 184};

	/**
	 * Field descriptor (offset) for struct member 'haint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__haint);
	 * CPointer&lt;Float&gt; p_haint = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haint'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haint = new long[]{164, 188};

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
	public static final long[] __DNA__FIELD__att1 = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'att2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quad1 and Quad2 attenuation </p>
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
	public static final long[] __DNA__FIELD__att2 = new long[]{172, 196};

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
	public static final long[] __DNA__FIELD__coeff_const = new long[]{176, 200};

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
	public static final long[] __DNA__FIELD__coeff_lin = new long[]{180, 204};

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
	public static final long[] __DNA__FIELD__coeff_quad = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'coeff_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__coeff_pad);
	 * CPointer&lt;Float&gt; p_coeff_pad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coeff_pad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coeff_pad = new long[]{188, 212};

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
	public static final long[] __DNA__FIELD__curfalloff = new long[]{192, 216};

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
	public static final long[] __DNA__FIELD__falloff_type = new long[]{196, 224};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{198, 226};

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
	public static final long[] __DNA__FIELD__clipsta = new long[]{200, 228};

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
	public static final long[] __DNA__FIELD__clipend = new long[]{204, 232};

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
	public static final long[] __DNA__FIELD__bias = new long[]{208, 236};

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
	public static final long[] __DNA__FIELD__soft = new long[]{212, 240};

	/**
	 * Field descriptor (offset) for struct member 'compressthresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__compressthresh);
	 * CPointer&lt;Float&gt; p_compressthresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compressthresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compressthresh = new long[]{216, 244};

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
	public static final long[] __DNA__FIELD__bleedbias = new long[]{220, 248};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__pad5);
	 * CPointer&lt;Float&gt; p_pad5 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{224, 252};

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
	public static final long[] __DNA__FIELD__bufsize = new long[]{228, 256};

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
	public static final long[] __DNA__FIELD__samp = new long[]{230, 258};

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
	public static final long[] __DNA__FIELD__buffers = new long[]{232, 260};

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
	public static final long[] __DNA__FIELD__filtertype = new long[]{234, 262};

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
	public static final long[] __DNA__FIELD__bufflag = new long[]{236, 264};

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
	public static final long[] __DNA__FIELD__buftype = new long[]{237, 265};

	/**
	 * Field descriptor (offset) for struct member 'ray_samp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ray_samp);
	 * CPointer&lt;Short&gt; p_ray_samp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_samp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_samp = new long[]{238, 266};

	/**
	 * Field descriptor (offset) for struct member 'ray_sampy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ray_sampy);
	 * CPointer&lt;Short&gt; p_ray_sampy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_sampy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_sampy = new long[]{240, 268};

	/**
	 * Field descriptor (offset) for struct member 'ray_sampz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ray_sampz);
	 * CPointer&lt;Short&gt; p_ray_sampz = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_sampz'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_sampz = new long[]{242, 270};

	/**
	 * Field descriptor (offset) for struct member 'ray_samp_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ray_samp_type);
	 * CPointer&lt;Short&gt; p_ray_samp_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_samp_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_samp_type = new long[]{244, 272};

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
	public static final long[] __DNA__FIELD__area_shape = new long[]{246, 274};

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
	public static final long[] __DNA__FIELD__area_size = new long[]{248, 276};

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
	public static final long[] __DNA__FIELD__area_sizey = new long[]{252, 280};

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
	public static final long[] __DNA__FIELD__area_sizez = new long[]{256, 284};

	/**
	 * Field descriptor (offset) for struct member 'adapt_thresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__adapt_thresh);
	 * CPointer&lt;Float&gt; p_adapt_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_thresh = new long[]{260, 288};

	/**
	 * Field descriptor (offset) for struct member 'ray_samp_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__ray_samp_method);
	 * CPointer&lt;Short&gt; p_ray_samp_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_samp_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_samp_method = new long[]{264, 292};

	/**
	 * Field descriptor (offset) for struct member 'shadowmap_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shadowmap_type);
	 * CPointer&lt;Short&gt; p_shadowmap_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadowmap_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadowmap_type = new long[]{266, 294};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texact is for buttons </p>
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
	public static final long[] __DNA__FIELD__texact = new long[]{268, 296};

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
	public static final long[] __DNA__FIELD__shadhalostep = new long[]{270, 298};

	/**
	 * Field descriptor (offset) for struct member 'sun_effect_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sun/sky </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sun_effect_type);
	 * CPointer&lt;Short&gt; p_sun_effect_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_effect_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_effect_type = new long[]{272, 300};

	/**
	 * Field descriptor (offset) for struct member 'skyblendtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__skyblendtype);
	 * CPointer&lt;Short&gt; p_skyblendtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skyblendtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skyblendtype = new long[]{274, 302};

	/**
	 * Field descriptor (offset) for struct member 'horizon_brightness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__horizon_brightness);
	 * CPointer&lt;Float&gt; p_horizon_brightness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'horizon_brightness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__horizon_brightness = new long[]{276, 304};

	/**
	 * Field descriptor (offset) for struct member 'spread'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__spread);
	 * CPointer&lt;Float&gt; p_spread = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spread'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spread = new long[]{280, 308};

	/**
	 * Field descriptor (offset) for struct member 'sun_brightness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sun_brightness);
	 * CPointer&lt;Float&gt; p_sun_brightness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_brightness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_brightness = new long[]{284, 312};

	/**
	 * Field descriptor (offset) for struct member 'sun_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sun_size);
	 * CPointer&lt;Float&gt; p_sun_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_size = new long[]{288, 316};

	/**
	 * Field descriptor (offset) for struct member 'backscattered_light'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__backscattered_light);
	 * CPointer&lt;Float&gt; p_backscattered_light = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'backscattered_light'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__backscattered_light = new long[]{292, 320};

	/**
	 * Field descriptor (offset) for struct member 'sun_intensity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sun_intensity);
	 * CPointer&lt;Float&gt; p_sun_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_intensity = new long[]{296, 324};

	/**
	 * Field descriptor (offset) for struct member 'atm_turbidity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__atm_turbidity);
	 * CPointer&lt;Float&gt; p_atm_turbidity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'atm_turbidity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__atm_turbidity = new long[]{300, 328};

	/**
	 * Field descriptor (offset) for struct member 'atm_inscattering_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__atm_inscattering_factor);
	 * CPointer&lt;Float&gt; p_atm_inscattering_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'atm_inscattering_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__atm_inscattering_factor = new long[]{304, 332};

	/**
	 * Field descriptor (offset) for struct member 'atm_extinction_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__atm_extinction_factor);
	 * CPointer&lt;Float&gt; p_atm_extinction_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'atm_extinction_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__atm_extinction_factor = new long[]{308, 336};

	/**
	 * Field descriptor (offset) for struct member 'atm_distance_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__atm_distance_factor);
	 * CPointer&lt;Float&gt; p_atm_distance_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'atm_distance_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__atm_distance_factor = new long[]{312, 340};

	/**
	 * Field descriptor (offset) for struct member 'skyblendfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__skyblendfac);
	 * CPointer&lt;Float&gt; p_skyblendfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skyblendfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skyblendfac = new long[]{316, 344};

	/**
	 * Field descriptor (offset) for struct member 'sky_exposure'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sky_exposure);
	 * CPointer&lt;Float&gt; p_sky_exposure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sky_exposure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sky_exposure = new long[]{320, 348};

	/**
	 * Field descriptor (offset) for struct member 'shadow_frustum_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BGE Only </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__shadow_frustum_size);
	 * CPointer&lt;Float&gt; p_shadow_frustum_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_frustum_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_frustum_size = new long[]{324, 352};

	/**
	 * Field descriptor (offset) for struct member 'sky_colorspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__sky_colorspace);
	 * CPointer&lt;Short&gt; p_sky_colorspace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sky_colorspace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sky_colorspace = new long[]{328, 356};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{330, 358};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
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
	public static final long[] __DNA__FIELD__ipo = new long[]{332, 360};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__mtex);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;MTex&gt;&gt;&gt; p_mtex = p.cast(new Class[]{CArrayFacade.class, CPointer.class, MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex*[18]'</li>
	 * <li>Actual Size (32bit/64bit): 72/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{336, 368};

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
	public static final long[] __DNA__FIELD__pr_texture = new long[]{408, 512};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the lamp
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
	public static final long[] __DNA__FIELD__use_nodes = new long[]{410, 514};

	/**
	 * Field descriptor (offset) for struct member 'pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Lamp lamp = ...;
	 * CPointer&lt;Object&gt; p = lamp.__dna__addressof(Lamp.__DNA__FIELD__pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad6'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad6 = new long[]{412, 516};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> preview </p>
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
	public static final long[] __DNA__FIELD__preview = new long[]{416, 520};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
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
	public static final long[] __DNA__FIELD__nodetree = new long[]{420, 528};

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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of Lamp
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of Lamp
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, type);
		} else {
			__io__block.writeShort(__io__address + 104, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, flag);
		} else {
			__io__block.writeShort(__io__address + 106, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, mode);
		} else {
			__io__block.writeInt(__io__address + 108, mode);
		}
	}

	/**
	 * Get method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public short getColormodel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public void setColormodel(short colormodel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, colormodel);
		} else {
			__io__block.writeShort(__io__address + 112, colormodel);
		}
	}

	/**
	 * Get method for struct member 'totex'.
	 * @see #__DNA__FIELD__totex
	 */
	
	public short getTotex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'totex'.
	 * @see #__DNA__FIELD__totex
	 */
	
	public void setTotex(short totex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 138, totex);
		} else {
			__io__block.writeShort(__io__address + 114, totex);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, r);
		} else {
			__io__block.writeFloat(__io__address + 116, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, g);
		} else {
			__io__block.writeFloat(__io__address + 120, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, b);
		} else {
			__io__block.writeFloat(__io__address + 124, b);
		}
	}

	/**
	 * Get method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public float getK() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public void setK(float k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, k);
		} else {
			__io__block.writeFloat(__io__address + 128, k);
		}
	}

	/**
	 * Get method for struct member 'shdwr'.
	 * @see #__DNA__FIELD__shdwr
	 */
	
	public float getShdwr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'shdwr'.
	 * @see #__DNA__FIELD__shdwr
	 */
	
	public void setShdwr(float shdwr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, shdwr);
		} else {
			__io__block.writeFloat(__io__address + 132, shdwr);
		}
	}

	/**
	 * Get method for struct member 'shdwg'.
	 * @see #__DNA__FIELD__shdwg
	 */
	
	public float getShdwg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'shdwg'.
	 * @see #__DNA__FIELD__shdwg
	 */
	
	public void setShdwg(float shdwg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, shdwg);
		} else {
			__io__block.writeFloat(__io__address + 136, shdwg);
		}
	}

	/**
	 * Get method for struct member 'shdwb'.
	 * @see #__DNA__FIELD__shdwb
	 */
	
	public float getShdwb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'shdwb'.
	 * @see #__DNA__FIELD__shdwb
	 */
	
	public void setShdwb(float shdwb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, shdwb);
		} else {
			__io__block.writeFloat(__io__address + 140, shdwb);
		}
	}

	/**
	 * Get method for struct member 'shdwpad'.
	 * @see #__DNA__FIELD__shdwpad
	 */
	
	public float getShdwpad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'shdwpad'.
	 * @see #__DNA__FIELD__shdwpad
	 */
	
	public void setShdwpad(float shdwpad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, shdwpad);
		} else {
			__io__block.writeFloat(__io__address + 144, shdwpad);
		}
	}

	/**
	 * Get method for struct member 'energy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light that the lamp emits
	 * @see #__DNA__FIELD__energy
	 */
	
	public float getEnergy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'energy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light that the lamp emits
	 * @see #__DNA__FIELD__energy
	 */
	
	public void setEnergy(float energy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, energy);
		} else {
			__io__block.writeFloat(__io__address + 148, energy);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, dist);
		} else {
			__io__block.writeFloat(__io__address + 152, dist);
		}
	}

	/**
	 * Get method for struct member 'spotsize'.
	 * @see #__DNA__FIELD__spotsize
	 */
	
	public float getSpotsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'spotsize'.
	 * @see #__DNA__FIELD__spotsize
	 */
	
	public void setSpotsize(float spotsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, spotsize);
		} else {
			__io__block.writeFloat(__io__address + 156, spotsize);
		}
	}

	/**
	 * Get method for struct member 'spotblend'.
	 * @see #__DNA__FIELD__spotblend
	 */
	
	public float getSpotblend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'spotblend'.
	 * @see #__DNA__FIELD__spotblend
	 */
	
	public void setSpotblend(float spotblend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, spotblend);
		} else {
			__io__block.writeFloat(__io__address + 160, spotblend);
		}
	}

	/**
	 * Get method for struct member 'haint'.
	 * @see #__DNA__FIELD__haint
	 */
	
	public float getHaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'haint'.
	 * @see #__DNA__FIELD__haint
	 */
	
	public void setHaint(float haint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, haint);
		} else {
			__io__block.writeFloat(__io__address + 164, haint);
		}
	}

	/**
	 * Get method for struct member 'att1'.
	 * @see #__DNA__FIELD__att1
	 */
	
	public float getAtt1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'att1'.
	 * @see #__DNA__FIELD__att1
	 */
	
	public void setAtt1(float att1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, att1);
		} else {
			__io__block.writeFloat(__io__address + 168, att1);
		}
	}

	/**
	 * Get method for struct member 'att2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quad1 and Quad2 attenuation </p>
	 * @see #__DNA__FIELD__att2
	 */
	
	public float getAtt2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'att2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quad1 and Quad2 attenuation </p>
	 * @see #__DNA__FIELD__att2
	 */
	
	public void setAtt2(float att2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, att2);
		} else {
			__io__block.writeFloat(__io__address + 172, att2);
		}
	}

	/**
	 * Get method for struct member 'coeff_const'.
	 * @see #__DNA__FIELD__coeff_const
	 */
	
	public float getCoeff_const() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'coeff_const'.
	 * @see #__DNA__FIELD__coeff_const
	 */
	
	public void setCoeff_const(float coeff_const) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, coeff_const);
		} else {
			__io__block.writeFloat(__io__address + 176, coeff_const);
		}
	}

	/**
	 * Get method for struct member 'coeff_lin'.
	 * @see #__DNA__FIELD__coeff_lin
	 */
	
	public float getCoeff_lin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'coeff_lin'.
	 * @see #__DNA__FIELD__coeff_lin
	 */
	
	public void setCoeff_lin(float coeff_lin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, coeff_lin);
		} else {
			__io__block.writeFloat(__io__address + 180, coeff_lin);
		}
	}

	/**
	 * Get method for struct member 'coeff_quad'.
	 * @see #__DNA__FIELD__coeff_quad
	 */
	
	public float getCoeff_quad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'coeff_quad'.
	 * @see #__DNA__FIELD__coeff_quad
	 */
	
	public void setCoeff_quad(float coeff_quad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, coeff_quad);
		} else {
			__io__block.writeFloat(__io__address + 184, coeff_quad);
		}
	}

	/**
	 * Get method for struct member 'coeff_pad'.
	 * @see #__DNA__FIELD__coeff_pad
	 */
	
	public float getCoeff_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'coeff_pad'.
	 * @see #__DNA__FIELD__coeff_pad
	 */
	
	public void setCoeff_pad(float coeff_pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, coeff_pad);
		} else {
			__io__block.writeFloat(__io__address + 188, coeff_pad);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
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
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public short getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(short falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, falloff_type);
		} else {
			__io__block.writeShort(__io__address + 196, falloff_type);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, pad2);
		} else {
			__io__block.writeShort(__io__address + 198, pad2);
		}
	}

	/**
	 * Get method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public float getClipsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public void setClipsta(float clipsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, clipsta);
		} else {
			__io__block.writeFloat(__io__address + 200, clipsta);
		}
	}

	/**
	 * Get method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public float getClipend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public void setClipend(float clipend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, clipend);
		} else {
			__io__block.writeFloat(__io__address + 204, clipend);
		}
	}

	/**
	 * Get method for struct member 'bias'.
	 * @see #__DNA__FIELD__bias
	 */
	
	public float getBias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'bias'.
	 * @see #__DNA__FIELD__bias
	 */
	
	public void setBias(float bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, bias);
		} else {
			__io__block.writeFloat(__io__address + 208, bias);
		}
	}

	/**
	 * Get method for struct member 'soft'.
	 * @see #__DNA__FIELD__soft
	 */
	
	public float getSoft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'soft'.
	 * @see #__DNA__FIELD__soft
	 */
	
	public void setSoft(float soft) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, soft);
		} else {
			__io__block.writeFloat(__io__address + 212, soft);
		}
	}

	/**
	 * Get method for struct member 'compressthresh'.
	 * @see #__DNA__FIELD__compressthresh
	 */
	
	public float getCompressthresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'compressthresh'.
	 * @see #__DNA__FIELD__compressthresh
	 */
	
	public void setCompressthresh(float compressthresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, compressthresh);
		} else {
			__io__block.writeFloat(__io__address + 216, compressthresh);
		}
	}

	/**
	 * Get method for struct member 'bleedbias'.
	 * @see #__DNA__FIELD__bleedbias
	 */
	
	public float getBleedbias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'bleedbias'.
	 * @see #__DNA__FIELD__bleedbias
	 */
	
	public void setBleedbias(float bleedbias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, bleedbias);
		} else {
			__io__block.writeFloat(__io__address + 220, bleedbias);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public float getPad5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(float pad5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, pad5);
		} else {
			__io__block.writeFloat(__io__address + 224, pad5);
		}
	}

	/**
	 * Get method for struct member 'bufsize'.
	 * @see #__DNA__FIELD__bufsize
	 */
	
	public short getBufsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 256);
		} else {
			return __io__block.readShort(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'bufsize'.
	 * @see #__DNA__FIELD__bufsize
	 */
	
	public void setBufsize(short bufsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 256, bufsize);
		} else {
			__io__block.writeShort(__io__address + 228, bufsize);
		}
	}

	/**
	 * Get method for struct member 'samp'.
	 * @see #__DNA__FIELD__samp
	 */
	
	public short getSamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 258);
		} else {
			return __io__block.readShort(__io__address + 230);
		}
	}

	/**
	 * Set method for struct member 'samp'.
	 * @see #__DNA__FIELD__samp
	 */
	
	public void setSamp(short samp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 258, samp);
		} else {
			__io__block.writeShort(__io__address + 230, samp);
		}
	}

	/**
	 * Get method for struct member 'buffers'.
	 * @see #__DNA__FIELD__buffers
	 */
	
	public short getBuffers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 260);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'buffers'.
	 * @see #__DNA__FIELD__buffers
	 */
	
	public void setBuffers(short buffers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 260, buffers);
		} else {
			__io__block.writeShort(__io__address + 232, buffers);
		}
	}

	/**
	 * Get method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public short getFiltertype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 262);
		} else {
			return __io__block.readShort(__io__address + 234);
		}
	}

	/**
	 * Set method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public void setFiltertype(short filtertype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 262, filtertype);
		} else {
			__io__block.writeShort(__io__address + 234, filtertype);
		}
	}

	/**
	 * Get method for struct member 'bufflag'.
	 * @see #__DNA__FIELD__bufflag
	 */
	
	public byte getBufflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 264);
		} else {
			return __io__block.readByte(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'bufflag'.
	 * @see #__DNA__FIELD__bufflag
	 */
	
	public void setBufflag(byte bufflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 264, bufflag);
		} else {
			__io__block.writeByte(__io__address + 236, bufflag);
		}
	}

	/**
	 * Get method for struct member 'buftype'.
	 * @see #__DNA__FIELD__buftype
	 */
	
	public byte getBuftype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 265);
		} else {
			return __io__block.readByte(__io__address + 237);
		}
	}

	/**
	 * Set method for struct member 'buftype'.
	 * @see #__DNA__FIELD__buftype
	 */
	
	public void setBuftype(byte buftype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 265, buftype);
		} else {
			__io__block.writeByte(__io__address + 237, buftype);
		}
	}

	/**
	 * Get method for struct member 'ray_samp'.
	 * @see #__DNA__FIELD__ray_samp
	 */
	
	public short getRay_samp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'ray_samp'.
	 * @see #__DNA__FIELD__ray_samp
	 */
	
	public void setRay_samp(short ray_samp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, ray_samp);
		} else {
			__io__block.writeShort(__io__address + 238, ray_samp);
		}
	}

	/**
	 * Get method for struct member 'ray_sampy'.
	 * @see #__DNA__FIELD__ray_sampy
	 */
	
	public short getRay_sampy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 268);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'ray_sampy'.
	 * @see #__DNA__FIELD__ray_sampy
	 */
	
	public void setRay_sampy(short ray_sampy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 268, ray_sampy);
		} else {
			__io__block.writeShort(__io__address + 240, ray_sampy);
		}
	}

	/**
	 * Get method for struct member 'ray_sampz'.
	 * @see #__DNA__FIELD__ray_sampz
	 */
	
	public short getRay_sampz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 270);
		} else {
			return __io__block.readShort(__io__address + 242);
		}
	}

	/**
	 * Set method for struct member 'ray_sampz'.
	 * @see #__DNA__FIELD__ray_sampz
	 */
	
	public void setRay_sampz(short ray_sampz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 270, ray_sampz);
		} else {
			__io__block.writeShort(__io__address + 242, ray_sampz);
		}
	}

	/**
	 * Get method for struct member 'ray_samp_type'.
	 * @see #__DNA__FIELD__ray_samp_type
	 */
	
	public short getRay_samp_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 272);
		} else {
			return __io__block.readShort(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'ray_samp_type'.
	 * @see #__DNA__FIELD__ray_samp_type
	 */
	
	public void setRay_samp_type(short ray_samp_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 272, ray_samp_type);
		} else {
			__io__block.writeShort(__io__address + 244, ray_samp_type);
		}
	}

	/**
	 * Get method for struct member 'area_shape'.
	 * @see #__DNA__FIELD__area_shape
	 */
	
	public short getArea_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 274);
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
			__io__block.writeShort(__io__address + 274, area_shape);
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
			return __io__block.readFloat(__io__address + 276);
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
			__io__block.writeFloat(__io__address + 276, area_size);
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
			return __io__block.readFloat(__io__address + 280);
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
			__io__block.writeFloat(__io__address + 280, area_sizey);
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
			return __io__block.readFloat(__io__address + 284);
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
			__io__block.writeFloat(__io__address + 284, area_sizez);
		} else {
			__io__block.writeFloat(__io__address + 256, area_sizez);
		}
	}

	/**
	 * Get method for struct member 'adapt_thresh'.
	 * @see #__DNA__FIELD__adapt_thresh
	 */
	
	public float getAdapt_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'adapt_thresh'.
	 * @see #__DNA__FIELD__adapt_thresh
	 */
	
	public void setAdapt_thresh(float adapt_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, adapt_thresh);
		} else {
			__io__block.writeFloat(__io__address + 260, adapt_thresh);
		}
	}

	/**
	 * Get method for struct member 'ray_samp_method'.
	 * @see #__DNA__FIELD__ray_samp_method
	 */
	
	public short getRay_samp_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 292);
		} else {
			return __io__block.readShort(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'ray_samp_method'.
	 * @see #__DNA__FIELD__ray_samp_method
	 */
	
	public void setRay_samp_method(short ray_samp_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 292, ray_samp_method);
		} else {
			__io__block.writeShort(__io__address + 264, ray_samp_method);
		}
	}

	/**
	 * Get method for struct member 'shadowmap_type'.
	 * @see #__DNA__FIELD__shadowmap_type
	 */
	
	public short getShadowmap_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 294);
		} else {
			return __io__block.readShort(__io__address + 266);
		}
	}

	/**
	 * Set method for struct member 'shadowmap_type'.
	 * @see #__DNA__FIELD__shadowmap_type
	 */
	
	public void setShadowmap_type(short shadowmap_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 294, shadowmap_type);
		} else {
			__io__block.writeShort(__io__address + 266, shadowmap_type);
		}
	}

	/**
	 * Get method for struct member 'texact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texact is for buttons </p>
	 * @see #__DNA__FIELD__texact
	 */
	
	public short getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 296);
		} else {
			return __io__block.readShort(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texact is for buttons </p>
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(short texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 296, texact);
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
			return __io__block.readShort(__io__address + 298);
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
			__io__block.writeShort(__io__address + 298, shadhalostep);
		} else {
			__io__block.writeShort(__io__address + 270, shadhalostep);
		}
	}

	/**
	 * Get method for struct member 'sun_effect_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sun/sky </p>
	 * @see #__DNA__FIELD__sun_effect_type
	 */
	
	public short getSun_effect_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 300);
		} else {
			return __io__block.readShort(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'sun_effect_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sun/sky </p>
	 * @see #__DNA__FIELD__sun_effect_type
	 */
	
	public void setSun_effect_type(short sun_effect_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 300, sun_effect_type);
		} else {
			__io__block.writeShort(__io__address + 272, sun_effect_type);
		}
	}

	/**
	 * Get method for struct member 'skyblendtype'.
	 * @see #__DNA__FIELD__skyblendtype
	 */
	
	public short getSkyblendtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 302);
		} else {
			return __io__block.readShort(__io__address + 274);
		}
	}

	/**
	 * Set method for struct member 'skyblendtype'.
	 * @see #__DNA__FIELD__skyblendtype
	 */
	
	public void setSkyblendtype(short skyblendtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 302, skyblendtype);
		} else {
			__io__block.writeShort(__io__address + 274, skyblendtype);
		}
	}

	/**
	 * Get method for struct member 'horizon_brightness'.
	 * @see #__DNA__FIELD__horizon_brightness
	 */
	
	public float getHorizon_brightness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'horizon_brightness'.
	 * @see #__DNA__FIELD__horizon_brightness
	 */
	
	public void setHorizon_brightness(float horizon_brightness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, horizon_brightness);
		} else {
			__io__block.writeFloat(__io__address + 276, horizon_brightness);
		}
	}

	/**
	 * Get method for struct member 'spread'.
	 * @see #__DNA__FIELD__spread
	 */
	
	public float getSpread() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'spread'.
	 * @see #__DNA__FIELD__spread
	 */
	
	public void setSpread(float spread) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, spread);
		} else {
			__io__block.writeFloat(__io__address + 280, spread);
		}
	}

	/**
	 * Get method for struct member 'sun_brightness'.
	 * @see #__DNA__FIELD__sun_brightness
	 */
	
	public float getSun_brightness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'sun_brightness'.
	 * @see #__DNA__FIELD__sun_brightness
	 */
	
	public void setSun_brightness(float sun_brightness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, sun_brightness);
		} else {
			__io__block.writeFloat(__io__address + 284, sun_brightness);
		}
	}

	/**
	 * Get method for struct member 'sun_size'.
	 * @see #__DNA__FIELD__sun_size
	 */
	
	public float getSun_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'sun_size'.
	 * @see #__DNA__FIELD__sun_size
	 */
	
	public void setSun_size(float sun_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, sun_size);
		} else {
			__io__block.writeFloat(__io__address + 288, sun_size);
		}
	}

	/**
	 * Get method for struct member 'backscattered_light'.
	 * @see #__DNA__FIELD__backscattered_light
	 */
	
	public float getBackscattered_light() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'backscattered_light'.
	 * @see #__DNA__FIELD__backscattered_light
	 */
	
	public void setBackscattered_light(float backscattered_light) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, backscattered_light);
		} else {
			__io__block.writeFloat(__io__address + 292, backscattered_light);
		}
	}

	/**
	 * Get method for struct member 'sun_intensity'.
	 * @see #__DNA__FIELD__sun_intensity
	 */
	
	public float getSun_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 324);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'sun_intensity'.
	 * @see #__DNA__FIELD__sun_intensity
	 */
	
	public void setSun_intensity(float sun_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 324, sun_intensity);
		} else {
			__io__block.writeFloat(__io__address + 296, sun_intensity);
		}
	}

	/**
	 * Get method for struct member 'atm_turbidity'.
	 * @see #__DNA__FIELD__atm_turbidity
	 */
	
	public float getAtm_turbidity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'atm_turbidity'.
	 * @see #__DNA__FIELD__atm_turbidity
	 */
	
	public void setAtm_turbidity(float atm_turbidity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, atm_turbidity);
		} else {
			__io__block.writeFloat(__io__address + 300, atm_turbidity);
		}
	}

	/**
	 * Get method for struct member 'atm_inscattering_factor'.
	 * @see #__DNA__FIELD__atm_inscattering_factor
	 */
	
	public float getAtm_inscattering_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'atm_inscattering_factor'.
	 * @see #__DNA__FIELD__atm_inscattering_factor
	 */
	
	public void setAtm_inscattering_factor(float atm_inscattering_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, atm_inscattering_factor);
		} else {
			__io__block.writeFloat(__io__address + 304, atm_inscattering_factor);
		}
	}

	/**
	 * Get method for struct member 'atm_extinction_factor'.
	 * @see #__DNA__FIELD__atm_extinction_factor
	 */
	
	public float getAtm_extinction_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'atm_extinction_factor'.
	 * @see #__DNA__FIELD__atm_extinction_factor
	 */
	
	public void setAtm_extinction_factor(float atm_extinction_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, atm_extinction_factor);
		} else {
			__io__block.writeFloat(__io__address + 308, atm_extinction_factor);
		}
	}

	/**
	 * Get method for struct member 'atm_distance_factor'.
	 * @see #__DNA__FIELD__atm_distance_factor
	 */
	
	public float getAtm_distance_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'atm_distance_factor'.
	 * @see #__DNA__FIELD__atm_distance_factor
	 */
	
	public void setAtm_distance_factor(float atm_distance_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, atm_distance_factor);
		} else {
			__io__block.writeFloat(__io__address + 312, atm_distance_factor);
		}
	}

	/**
	 * Get method for struct member 'skyblendfac'.
	 * @see #__DNA__FIELD__skyblendfac
	 */
	
	public float getSkyblendfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'skyblendfac'.
	 * @see #__DNA__FIELD__skyblendfac
	 */
	
	public void setSkyblendfac(float skyblendfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, skyblendfac);
		} else {
			__io__block.writeFloat(__io__address + 316, skyblendfac);
		}
	}

	/**
	 * Get method for struct member 'sky_exposure'.
	 * @see #__DNA__FIELD__sky_exposure
	 */
	
	public float getSky_exposure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 348);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'sky_exposure'.
	 * @see #__DNA__FIELD__sky_exposure
	 */
	
	public void setSky_exposure(float sky_exposure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 348, sky_exposure);
		} else {
			__io__block.writeFloat(__io__address + 320, sky_exposure);
		}
	}

	/**
	 * Get method for struct member 'shadow_frustum_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BGE Only </p>
	 * @see #__DNA__FIELD__shadow_frustum_size
	 */
	
	public float getShadow_frustum_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'shadow_frustum_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BGE Only </p>
	 * @see #__DNA__FIELD__shadow_frustum_size
	 */
	
	public void setShadow_frustum_size(float shadow_frustum_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, shadow_frustum_size);
		} else {
			__io__block.writeFloat(__io__address + 324, shadow_frustum_size);
		}
	}

	/**
	 * Get method for struct member 'sky_colorspace'.
	 * @see #__DNA__FIELD__sky_colorspace
	 */
	
	public short getSky_colorspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 356);
		} else {
			return __io__block.readShort(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'sky_colorspace'.
	 * @see #__DNA__FIELD__sky_colorspace
	 */
	
	public void setSky_colorspace(short sky_colorspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 356, sky_colorspace);
		} else {
			__io__block.writeShort(__io__address + 328, sky_colorspace);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public CArrayFacade<Byte> getPad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 358, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 330, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(CArrayFacade<Byte> pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 358;
		} else {
			__dna__offset = 330;
		}
		if (__io__equals(pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad4);
		} else {
			__io__generic__copy( getPad4(), pad4);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public CArrayFacade<CPointer<MTex>> getMtex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MTex.class};
		int[] __dna__dimensions = new int[]{
			18
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(CArrayFacade<CPointer<MTex>> mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 368;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mtex);
		} else {
			__io__generic__copy( getMtex(), mtex);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 512);
		} else {
			return __io__block.readShort(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 512, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 408, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the lamp
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public short getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 514);
		} else {
			return __io__block.readShort(__io__address + 410);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the lamp
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(short use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 514, use_nodes);
		} else {
			__io__block.writeShort(__io__address + 410, use_nodes);
		}
	}

	/**
	 * Get method for struct member 'pad6'.
	 * @see #__DNA__FIELD__pad6
	 */
	
	public CArrayFacade<Byte> getPad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 516, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad6'.
	 * @see #__DNA__FIELD__pad6
	 */
	
	public void setPad6(CArrayFacade<Byte> pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 516;
		} else {
			__dna__offset = 412;
		}
		if (__io__equals(pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad6);
		} else {
			__io__generic__copy( getPad6(), pad6);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> preview </p>
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 520);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 416);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> preview </p>
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 520, __address);
		} else {
			__io__block.writeLong(__io__address + 416, __address);
		}
	}

	/**
	 * Get method for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public CPointer<bNodeTree> getNodetree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 528);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 420);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeTree.class};
		return new CPointer<bNodeTree>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeTree.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public void setNodetree(CPointer<bNodeTree> nodetree) throws IOException
	{
		long __address = ((nodetree == null) ? 0 : nodetree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 528, __address);
		} else {
			__io__block.writeLong(__io__address + 420, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Lamp> __io__addressof() {
		return new CPointer<Lamp>(__io__address, new Class[]{Lamp.class}, __io__block, __io__blockTable);
	}

}
