package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FreestyleLineStyle'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=352, size64=496)
public class FreestyleLineStyle extends CFacade {

	/**
	 * This is the sdna index of the struct FreestyleLineStyle.
	 * <p>
	 * It is required when allocating a new block to store data for FreestyleLineStyle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 626;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__id);
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
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base alpha transparency, possibly modified by alpha transparency modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base line thickness, possibly modified by line thickness modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__thickness);
	 * CPointer&lt;Float&gt; p_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'thickness_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness position of silhouettes and border edges (applicable when plain chaining is used with the Same Object option)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__thickness_position);
	 * CPointer&lt;Integer&gt; p_thickness_position = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_position'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_position = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'thickness_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A number between 0 (inside) and 1 (outside) specifying the relative position of stroke thickness
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__thickness_ratio);
	 * CPointer&lt;Float&gt; p_thickness_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_ratio = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the shape of both ends of strokes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__caps);
	 * CPointer&lt;Integer&gt; p_caps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'caps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__caps = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'chaining'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how feature edges are jointed to form chains
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__chaining);
	 * CPointer&lt;Integer&gt; p_chaining = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chaining'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chaining = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in a sketchy multiple touch
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__rounds);
	 * CPointer&lt;Integer&gt; p_rounds = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rounds'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rounds = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'split_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curvilinear 2D length for chain splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_length);
	 * CPointer&lt;Float&gt; p_split_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_length = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'min_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In radians, for splitting. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__min_angle);
	 * CPointer&lt;Float&gt; p_min_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_angle = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'max_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__max_angle);
	 * CPointer&lt;Float&gt; p_max_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_angle = new long[]{176, 212};

	/**
	 * Field descriptor (offset) for struct member 'min_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__min_length);
	 * CPointer&lt;Float&gt; p_min_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_length = new long[]{180, 216};

	/**
	 * Field descriptor (offset) for struct member 'max_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__max_length);
	 * CPointer&lt;Float&gt; p_max_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_length = new long[]{184, 220};

	/**
	 * Field descriptor (offset) for struct member 'chain_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Chain count for the selection of first N chains
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__chain_count);
	 * CPointer&lt;Integer&gt; p_chain_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chain_count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chain_count = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'split_dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_dash1);
	 * CPointer&lt;Short&gt; p_split_dash1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_dash1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_dash1 = new long[]{192, 228};

	/**
	 * Field descriptor (offset) for struct member 'split_gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_gap1);
	 * CPointer&lt;Short&gt; p_split_gap1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_gap1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_gap1 = new long[]{194, 230};

	/**
	 * Field descriptor (offset) for struct member 'split_dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_dash2);
	 * CPointer&lt;Short&gt; p_split_dash2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_dash2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_dash2 = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member 'split_gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_gap2);
	 * CPointer&lt;Short&gt; p_split_gap2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_gap2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_gap2 = new long[]{198, 234};

	/**
	 * Field descriptor (offset) for struct member 'split_dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_dash3);
	 * CPointer&lt;Short&gt; p_split_dash3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_dash3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_dash3 = new long[]{200, 236};

	/**
	 * Field descriptor (offset) for struct member 'split_gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for splitting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__split_gap3);
	 * CPointer&lt;Short&gt; p_split_gap3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_gap3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_gap3 = new long[]{202, 238};

	/**
	 * Field descriptor (offset) for struct member 'sort_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the sort key to determine the stacking order of chains
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__sort_key);
	 * CPointer&lt;Integer&gt; p_sort_key = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sort_key'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sort_key = new long[]{204, 240};

	/**
	 * Field descriptor (offset) for struct member 'integration_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how the sort key is computed for each chain
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__integration_type);
	 * CPointer&lt;Integer&gt; p_integration_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'integration_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__integration_type = new long[]{208, 244};

	/**
	 * Field descriptor (offset) for struct member 'texstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__texstep);
	 * CPointer&lt;Float&gt; p_texstep = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texstep'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texstep = new long[]{212, 248};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__texact);
	 * CPointer&lt;Short&gt; p_texact = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texact'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texact = new long[]{216, 252};

	/**
	 * Field descriptor (offset) for struct member 'pr_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__pr_texture);
	 * CPointer&lt;Short&gt; p_pr_texture = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_texture'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_texture = new long[]{218, 254};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes for the line style
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Short&gt; p_use_nodes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{220, 256};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{222, 258};

	/**
	 * Field descriptor (offset) for struct member 'dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__dash1);
	 * CPointer&lt;Short&gt; p_dash1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash1 = new long[]{228, 264};

	/**
	 * Field descriptor (offset) for struct member 'gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__gap1);
	 * CPointer&lt;Short&gt; p_gap1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gap1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gap1 = new long[]{230, 266};

	/**
	 * Field descriptor (offset) for struct member 'dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__dash2);
	 * CPointer&lt;Short&gt; p_dash2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash2 = new long[]{232, 268};

	/**
	 * Field descriptor (offset) for struct member 'gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__gap2);
	 * CPointer&lt;Short&gt; p_gap2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gap2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gap2 = new long[]{234, 270};

	/**
	 * Field descriptor (offset) for struct member 'dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__dash3);
	 * CPointer&lt;Short&gt; p_dash3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash3 = new long[]{236, 272};

	/**
	 * Field descriptor (offset) for struct member 'gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for dashed lines
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__gap3);
	 * CPointer&lt;Short&gt; p_gap3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gap3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gap3 = new long[]{238, 274};

	/**
	 * Field descriptor (offset) for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the property panel to be shown<h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__panel);
	 * CPointer&lt;Integer&gt; p_panel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panel = new long[]{240, 276};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__mtex);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;MTex&gt;&gt;&gt; p_mtex = p.cast(new Class[]{CArrayFacade.class, CPointer.class, MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex*[18]'</li>
	 * <li>Actual Size (32bit/64bit): 72/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{244, 280};

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
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{316, 424};

	/**
	 * Field descriptor (offset) for struct member 'color_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line color modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__color_modifiers);
	 * CPointer&lt;ListBase&gt; p_color_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_modifiers = new long[]{320, 432};

	/**
	 * Field descriptor (offset) for struct member 'alpha_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of alpha transparency modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__alpha_modifiers);
	 * CPointer&lt;ListBase&gt; p_alpha_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_modifiers = new long[]{328, 448};

	/**
	 * Field descriptor (offset) for struct member 'thickness_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line thickness modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__thickness_modifiers);
	 * CPointer&lt;ListBase&gt; p_thickness_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_modifiers = new long[]{336, 464};

	/**
	 * Field descriptor (offset) for struct member 'geometry_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of stroke geometry modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleLineStyle freestylelinestyle = ...;
	 * CPointer&lt;Object&gt; p = freestylelinestyle.__dna__addressof(FreestyleLineStyle.__DNA__FIELD__geometry_modifiers);
	 * CPointer&lt;ListBase&gt; p_geometry_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'geometry_modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__geometry_modifiers = new long[]{344, 480};

	public FreestyleLineStyle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FreestyleLineStyle(FreestyleLineStyle that) {
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
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, r);
		} else {
			__io__block.writeFloat(__io__address + 124, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, g);
		} else {
			__io__block.writeFloat(__io__address + 128, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, b);
		} else {
			__io__block.writeFloat(__io__address + 132, b);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base alpha transparency, possibly modified by alpha transparency modifiers
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base alpha transparency, possibly modified by alpha transparency modifiers
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, alpha);
		} else {
			__io__block.writeFloat(__io__address + 136, alpha);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base line thickness, possibly modified by line thickness modifiers
	 * @see #__DNA__FIELD__thickness
	 */
	
	public float getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base line thickness, possibly modified by line thickness modifiers
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(float thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, thickness);
		} else {
			__io__block.writeFloat(__io__address + 140, thickness);
		}
	}

	/**
	 * Get method for struct member 'thickness_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness position of silhouettes and border edges (applicable when plain chaining is used with the Same Object option)
	 * @see #__DNA__FIELD__thickness_position
	 */
	
	public int getThickness_position() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'thickness_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness position of silhouettes and border edges (applicable when plain chaining is used with the Same Object option)
	 * @see #__DNA__FIELD__thickness_position
	 */
	
	public void setThickness_position(int thickness_position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, thickness_position);
		} else {
			__io__block.writeInt(__io__address + 144, thickness_position);
		}
	}

	/**
	 * Get method for struct member 'thickness_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A number between 0 (inside) and 1 (outside) specifying the relative position of stroke thickness
	 * @see #__DNA__FIELD__thickness_ratio
	 */
	
	public float getThickness_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'thickness_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A number between 0 (inside) and 1 (outside) specifying the relative position of stroke thickness
	 * @see #__DNA__FIELD__thickness_ratio
	 */
	
	public void setThickness_ratio(float thickness_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, thickness_ratio);
		} else {
			__io__block.writeFloat(__io__address + 148, thickness_ratio);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, flag);
		} else {
			__io__block.writeInt(__io__address + 152, flag);
		}
	}

	/**
	 * Get method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the shape of both ends of strokes
	 * @see #__DNA__FIELD__caps
	 */
	
	public int getCaps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the shape of both ends of strokes
	 * @see #__DNA__FIELD__caps
	 */
	
	public void setCaps(int caps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, caps);
		} else {
			__io__block.writeInt(__io__address + 156, caps);
		}
	}

	/**
	 * Get method for struct member 'chaining'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how feature edges are jointed to form chains
	 * @see #__DNA__FIELD__chaining
	 */
	
	public int getChaining() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 196);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'chaining'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how feature edges are jointed to form chains
	 * @see #__DNA__FIELD__chaining
	 */
	
	public void setChaining(int chaining) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 196, chaining);
		} else {
			__io__block.writeInt(__io__address + 160, chaining);
		}
	}

	/**
	 * Get method for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in a sketchy multiple touch
	 * @see #__DNA__FIELD__rounds
	 */
	
	public int getRounds() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in a sketchy multiple touch
	 * @see #__DNA__FIELD__rounds
	 */
	
	public void setRounds(int rounds) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, rounds);
		} else {
			__io__block.writeInt(__io__address + 164, rounds);
		}
	}

	/**
	 * Get method for struct member 'split_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curvilinear 2D length for chain splitting
	 * @see #__DNA__FIELD__split_length
	 */
	
	public float getSplit_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'split_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Curvilinear 2D length for chain splitting
	 * @see #__DNA__FIELD__split_length
	 */
	
	public void setSplit_length(float split_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, split_length);
		} else {
			__io__block.writeFloat(__io__address + 168, split_length);
		}
	}

	/**
	 * Get method for struct member 'min_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In radians, for splitting. </p>
	 * @see #__DNA__FIELD__min_angle
	 */
	
	public float getMin_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'min_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In radians, for splitting. </p>
	 * @see #__DNA__FIELD__min_angle
	 */
	
	public void setMin_angle(float min_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, min_angle);
		} else {
			__io__block.writeFloat(__io__address + 172, min_angle);
		}
	}

	/**
	 * Get method for struct member 'max_angle'.
	 * @see #__DNA__FIELD__max_angle
	 */
	
	public float getMax_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'max_angle'.
	 * @see #__DNA__FIELD__max_angle
	 */
	
	public void setMax_angle(float max_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, max_angle);
		} else {
			__io__block.writeFloat(__io__address + 176, max_angle);
		}
	}

	/**
	 * Get method for struct member 'min_length'.
	 * @see #__DNA__FIELD__min_length
	 */
	
	public float getMin_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'min_length'.
	 * @see #__DNA__FIELD__min_length
	 */
	
	public void setMin_length(float min_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, min_length);
		} else {
			__io__block.writeFloat(__io__address + 180, min_length);
		}
	}

	/**
	 * Get method for struct member 'max_length'.
	 * @see #__DNA__FIELD__max_length
	 */
	
	public float getMax_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'max_length'.
	 * @see #__DNA__FIELD__max_length
	 */
	
	public void setMax_length(float max_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, max_length);
		} else {
			__io__block.writeFloat(__io__address + 184, max_length);
		}
	}

	/**
	 * Get method for struct member 'chain_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Chain count for the selection of first N chains
	 * @see #__DNA__FIELD__chain_count
	 */
	
	public int getChain_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'chain_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Chain count for the selection of first N chains
	 * @see #__DNA__FIELD__chain_count
	 */
	
	public void setChain_count(int chain_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, chain_count);
		} else {
			__io__block.writeInt(__io__address + 188, chain_count);
		}
	}

	/**
	 * Get method for struct member 'split_dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for splitting
	 * @see #__DNA__FIELD__split_dash1
	 */
	
	public short getSplit_dash1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'split_dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for splitting
	 * @see #__DNA__FIELD__split_dash1
	 */
	
	public void setSplit_dash1(short split_dash1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, split_dash1);
		} else {
			__io__block.writeShort(__io__address + 192, split_dash1);
		}
	}

	/**
	 * Get method for struct member 'split_gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for splitting
	 * @see #__DNA__FIELD__split_gap1
	 */
	
	public short getSplit_gap1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'split_gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for splitting
	 * @see #__DNA__FIELD__split_gap1
	 */
	
	public void setSplit_gap1(short split_gap1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, split_gap1);
		} else {
			__io__block.writeShort(__io__address + 194, split_gap1);
		}
	}

	/**
	 * Get method for struct member 'split_dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for splitting
	 * @see #__DNA__FIELD__split_dash2
	 */
	
	public short getSplit_dash2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'split_dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for splitting
	 * @see #__DNA__FIELD__split_dash2
	 */
	
	public void setSplit_dash2(short split_dash2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, split_dash2);
		} else {
			__io__block.writeShort(__io__address + 196, split_dash2);
		}
	}

	/**
	 * Get method for struct member 'split_gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for splitting
	 * @see #__DNA__FIELD__split_gap2
	 */
	
	public short getSplit_gap2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'split_gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for splitting
	 * @see #__DNA__FIELD__split_gap2
	 */
	
	public void setSplit_gap2(short split_gap2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, split_gap2);
		} else {
			__io__block.writeShort(__io__address + 198, split_gap2);
		}
	}

	/**
	 * Get method for struct member 'split_dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for splitting
	 * @see #__DNA__FIELD__split_dash3
	 */
	
	public short getSplit_dash3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'split_dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for splitting
	 * @see #__DNA__FIELD__split_dash3
	 */
	
	public void setSplit_dash3(short split_dash3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, split_dash3);
		} else {
			__io__block.writeShort(__io__address + 200, split_dash3);
		}
	}

	/**
	 * Get method for struct member 'split_gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for splitting
	 * @see #__DNA__FIELD__split_gap3
	 */
	
	public short getSplit_gap3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 238);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'split_gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for splitting
	 * @see #__DNA__FIELD__split_gap3
	 */
	
	public void setSplit_gap3(short split_gap3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 238, split_gap3);
		} else {
			__io__block.writeShort(__io__address + 202, split_gap3);
		}
	}

	/**
	 * Get method for struct member 'sort_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the sort key to determine the stacking order of chains
	 * @see #__DNA__FIELD__sort_key
	 */
	
	public int getSort_key() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'sort_key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the sort key to determine the stacking order of chains
	 * @see #__DNA__FIELD__sort_key
	 */
	
	public void setSort_key(int sort_key) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, sort_key);
		} else {
			__io__block.writeInt(__io__address + 204, sort_key);
		}
	}

	/**
	 * Get method for struct member 'integration_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how the sort key is computed for each chain
	 * @see #__DNA__FIELD__integration_type
	 */
	
	public int getIntegration_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'integration_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the way how the sort key is computed for each chain
	 * @see #__DNA__FIELD__integration_type
	 */
	
	public void setIntegration_type(int integration_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, integration_type);
		} else {
			__io__block.writeInt(__io__address + 208, integration_type);
		}
	}

	/**
	 * Get method for struct member 'texstep'.
	 * @see #__DNA__FIELD__texstep
	 */
	
	public float getTexstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'texstep'.
	 * @see #__DNA__FIELD__texstep
	 */
	
	public void setTexstep(float texstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, texstep);
		} else {
			__io__block.writeFloat(__io__address + 212, texstep);
		}
	}

	/**
	 * Get method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public short getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 252);
		} else {
			return __io__block.readShort(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(short texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 252, texact);
		} else {
			__io__block.writeShort(__io__address + 216, texact);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 254);
		} else {
			return __io__block.readShort(__io__address + 218);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 254, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 218, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes for the line style
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public short getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 256);
		} else {
			return __io__block.readShort(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes for the line style
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(short use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 256, use_nodes);
		} else {
			__io__block.writeShort(__io__address + 220, use_nodes);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 258, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 222, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 258;
		} else {
			__dna__offset = 222;
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
	 * Get method for struct member 'dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for dashed lines
	 * @see #__DNA__FIELD__dash1
	 */
	
	public short getDash1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'dash1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st dash for dashed lines
	 * @see #__DNA__FIELD__dash1
	 */
	
	public void setDash1(short dash1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, dash1);
		} else {
			__io__block.writeShort(__io__address + 228, dash1);
		}
	}

	/**
	 * Get method for struct member 'gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for dashed lines
	 * @see #__DNA__FIELD__gap1
	 */
	
	public short getGap1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 230);
		}
	}

	/**
	 * Set method for struct member 'gap1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 1st gap for dashed lines
	 * @see #__DNA__FIELD__gap1
	 */
	
	public void setGap1(short gap1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, gap1);
		} else {
			__io__block.writeShort(__io__address + 230, gap1);
		}
	}

	/**
	 * Get method for struct member 'dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for dashed lines
	 * @see #__DNA__FIELD__dash2
	 */
	
	public short getDash2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 268);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'dash2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd dash for dashed lines
	 * @see #__DNA__FIELD__dash2
	 */
	
	public void setDash2(short dash2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 268, dash2);
		} else {
			__io__block.writeShort(__io__address + 232, dash2);
		}
	}

	/**
	 * Get method for struct member 'gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for dashed lines
	 * @see #__DNA__FIELD__gap2
	 */
	
	public short getGap2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 270);
		} else {
			return __io__block.readShort(__io__address + 234);
		}
	}

	/**
	 * Set method for struct member 'gap2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 2nd gap for dashed lines
	 * @see #__DNA__FIELD__gap2
	 */
	
	public void setGap2(short gap2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 270, gap2);
		} else {
			__io__block.writeShort(__io__address + 234, gap2);
		}
	}

	/**
	 * Get method for struct member 'dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for dashed lines
	 * @see #__DNA__FIELD__dash3
	 */
	
	public short getDash3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 272);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'dash3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd dash for dashed lines
	 * @see #__DNA__FIELD__dash3
	 */
	
	public void setDash3(short dash3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 272, dash3);
		} else {
			__io__block.writeShort(__io__address + 236, dash3);
		}
	}

	/**
	 * Get method for struct member 'gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for dashed lines
	 * @see #__DNA__FIELD__gap3
	 */
	
	public short getGap3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 274);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'gap3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Length of the 3rd gap for dashed lines
	 * @see #__DNA__FIELD__gap3
	 */
	
	public void setGap3(short gap3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 274, gap3);
		} else {
			__io__block.writeShort(__io__address + 238, gap3);
		}
	}

	/**
	 * Get method for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the property panel to be shown<h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * @see #__DNA__FIELD__panel
	 */
	
	public int getPanel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 276);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the property panel to be shown<h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * @see #__DNA__FIELD__panel
	 */
	
	public void setPanel(int panel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 276, panel);
		} else {
			__io__block.writeInt(__io__address + 240, panel);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX. </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public CArrayFacade<CPointer<MTex>> getMtex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MTex.class};
		int[] __dna__dimensions = new int[]{
			18
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX. </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(CArrayFacade<CPointer<MTex>> mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 244;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 316);
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
			__io__block.writeLong(__io__address + 424, __address);
		} else {
			__io__block.writeLong(__io__address + 316, __address);
		}
	}

	/**
	 * Get method for struct member 'color_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line color modifiers
	 * @see #__DNA__FIELD__color_modifiers
	 */
	
	public ListBase getColor_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 432, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 320, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line color modifiers
	 * @see #__DNA__FIELD__color_modifiers
	 */
	
	public void setColor_modifiers(ListBase color_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 432;
		} else {
			__dna__offset = 320;
		}
		if (__io__equals(color_modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color_modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color_modifiers);
		} else {
			__io__generic__copy( getColor_modifiers(), color_modifiers);
		}
	}

	/**
	 * Get method for struct member 'alpha_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of alpha transparency modifiers
	 * @see #__DNA__FIELD__alpha_modifiers
	 */
	
	public ListBase getAlpha_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 448, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 328, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'alpha_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of alpha transparency modifiers
	 * @see #__DNA__FIELD__alpha_modifiers
	 */
	
	public void setAlpha_modifiers(ListBase alpha_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 448;
		} else {
			__dna__offset = 328;
		}
		if (__io__equals(alpha_modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, alpha_modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, alpha_modifiers);
		} else {
			__io__generic__copy( getAlpha_modifiers(), alpha_modifiers);
		}
	}

	/**
	 * Get method for struct member 'thickness_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line thickness modifiers
	 * @see #__DNA__FIELD__thickness_modifiers
	 */
	
	public ListBase getThickness_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 464, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 336, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'thickness_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of line thickness modifiers
	 * @see #__DNA__FIELD__thickness_modifiers
	 */
	
	public void setThickness_modifiers(ListBase thickness_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(thickness_modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, thickness_modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, thickness_modifiers);
		} else {
			__io__generic__copy( getThickness_modifiers(), thickness_modifiers);
		}
	}

	/**
	 * Get method for struct member 'geometry_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of stroke geometry modifiers
	 * @see #__DNA__FIELD__geometry_modifiers
	 */
	
	public ListBase getGeometry_modifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 480, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 344, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'geometry_modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of stroke geometry modifiers
	 * @see #__DNA__FIELD__geometry_modifiers
	 */
	
	public void setGeometry_modifiers(ListBase geometry_modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 480;
		} else {
			__dna__offset = 344;
		}
		if (__io__equals(geometry_modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, geometry_modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, geometry_modifiers);
		} else {
			__io__generic__copy( getGeometry_modifiers(), geometry_modifiers);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FreestyleLineStyle> __io__addressof() {
		return new CPointer<FreestyleLineStyle>(__io__address, new Class[]{FreestyleLineStyle.class}, __io__block, __io__blockTable);
	}

}
