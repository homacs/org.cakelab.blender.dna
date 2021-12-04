package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bTransformConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Generic Transform->Transform Constraint </p>
 */

@CMetaData(size32=228, size64=232)
public class bTransformConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bTransformConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bTransformConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 387;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target (i.e. 'driver' object/bone). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be loc(0), rot(1) or size(2). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from);
	 * CPointer&lt;Short&gt; p_from = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'to'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to);
	 * CPointer&lt;Short&gt; p_to = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to = new long[]{70, 74};

	/**
	 * Field descriptor (offset) for struct member 'map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines which target-axis deform is copied by each owner-axis. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__map);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_map = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'map'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__map = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'expo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolate motion? if 0, confine to ranges. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__expo);
	 * CPointer&lt;Byte&gt; p_expo = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expo'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expo = new long[]{75, 79};

	/**
	 * Field descriptor (offset) for struct member 'from_rotation_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input rotation type - uses the same values as driver targets. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_rotation_mode);
	 * CPointer&lt;Byte&gt; p_from_rotation_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_rotation_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_rotation_mode = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'to_euler_order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Output euler order override. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_euler_order);
	 * CPointer&lt;Byte&gt; p_to_euler_order = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_euler_order'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_euler_order = new long[]{77, 81};

	/**
	 * Field descriptor (offset) for struct member 'mix_mode_loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mixing modes for location, rotation, and scale. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__mix_mode_loc);
	 * CPointer&lt;Byte&gt; p_mix_mode_loc = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_mode_loc'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_mode_loc = new long[]{78, 82};

	/**
	 * Field descriptor (offset) for struct member 'mix_mode_rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__mix_mode_rot);
	 * CPointer&lt;Byte&gt; p_mix_mode_rot = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_mode_rot'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_mode_rot = new long[]{79, 83};

	/**
	 * Field descriptor (offset) for struct member 'mix_mode_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__mix_mode_scale);
	 * CPointer&lt;Byte&gt; p_mix_mode_scale = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_mode_scale'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_mode_scale = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{81, 85};

	/**
	 * Field descriptor (offset) for struct member 'from_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_min = new long[]{84, 88};

	/**
	 * Field descriptor (offset) for struct member 'from_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_max = new long[]{96, 100};

	/**
	 * Field descriptor (offset) for struct member 'to_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_min = new long[]{108, 112};

	/**
	 * Field descriptor (offset) for struct member 'to_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_max = new long[]{120, 124};

	/**
	 * Field descriptor (offset) for struct member 'from_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_min_rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_min_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_min_rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_min_rot = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'from_max_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_max_rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_max_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_max_rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_max_rot = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'to_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_min_rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_min_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_min_rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_min_rot = new long[]{156, 160};

	/**
	 * Field descriptor (offset) for struct member 'to_max_rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_max_rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_max_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_max_rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_max_rot = new long[]{168, 172};

	/**
	 * Field descriptor (offset) for struct member 'from_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_min_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_min_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_min_scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_min_scale = new long[]{180, 184};

	/**
	 * Field descriptor (offset) for struct member 'from_max_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_max_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_max_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_max_scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_max_scale = new long[]{192, 196};

	/**
	 * Field descriptor (offset) for struct member 'to_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_min_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_min_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_min_scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_min_scale = new long[]{204, 208};

	/**
	 * Field descriptor (offset) for struct member 'to_max_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_max_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_max_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_max_scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_max_scale = new long[]{216, 220};

	public bTransformConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bTransformConstraint(bTransformConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target (i.e. 'driver' object/bone). </p>
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target (i.e. 'driver' object/bone). </p>
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Get method for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be loc(0), rot(1) or size(2). </p>
	 * @see #__DNA__FIELD__from
	 */
	
	public short getFrom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 72);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be loc(0), rot(1) or size(2). </p>
	 * @see #__DNA__FIELD__from
	 */
	
	public void setFrom(short from) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 72, from);
		} else {
			__io__block.writeShort(__io__address + 68, from);
		}
	}

	/**
	 * Get method for struct member 'to'.
	 * @see #__DNA__FIELD__to
	 */
	
	public short getTo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'to'.
	 * @see #__DNA__FIELD__to
	 */
	
	public void setTo(short to) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, to);
		} else {
			__io__block.writeShort(__io__address + 70, to);
		}
	}

	/**
	 * Get method for struct member 'map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines which target-axis deform is copied by each owner-axis. </p>
	 * @see #__DNA__FIELD__map
	 */
	
	public CArrayFacade<Byte> getMap() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defines which target-axis deform is copied by each owner-axis. </p>
	 * @see #__DNA__FIELD__map
	 */
	
	public void setMap(CArrayFacade<Byte> map) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(map, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, map)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, map);
		} else {
			__io__generic__copy( getMap(), map);
		}
	}

	/**
	 * Get method for struct member 'expo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolate motion? if 0, confine to ranges. </p>
	 * @see #__DNA__FIELD__expo
	 */
	
	public byte getExpo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 79);
		} else {
			return __io__block.readByte(__io__address + 75);
		}
	}

	/**
	 * Set method for struct member 'expo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolate motion? if 0, confine to ranges. </p>
	 * @see #__DNA__FIELD__expo
	 */
	
	public void setExpo(byte expo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 79, expo);
		} else {
			__io__block.writeByte(__io__address + 75, expo);
		}
	}

	/**
	 * Get method for struct member 'from_rotation_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input rotation type - uses the same values as driver targets. </p>
	 * @see #__DNA__FIELD__from_rotation_mode
	 */
	
	public byte getFrom_rotation_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'from_rotation_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input rotation type - uses the same values as driver targets. </p>
	 * @see #__DNA__FIELD__from_rotation_mode
	 */
	
	public void setFrom_rotation_mode(byte from_rotation_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, from_rotation_mode);
		} else {
			__io__block.writeByte(__io__address + 76, from_rotation_mode);
		}
	}

	/**
	 * Get method for struct member 'to_euler_order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Output euler order override. </p>
	 * @see #__DNA__FIELD__to_euler_order
	 */
	
	public byte getTo_euler_order() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 81);
		} else {
			return __io__block.readByte(__io__address + 77);
		}
	}

	/**
	 * Set method for struct member 'to_euler_order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Output euler order override. </p>
	 * @see #__DNA__FIELD__to_euler_order
	 */
	
	public void setTo_euler_order(byte to_euler_order) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 81, to_euler_order);
		} else {
			__io__block.writeByte(__io__address + 77, to_euler_order);
		}
	}

	/**
	 * Get method for struct member 'mix_mode_loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mixing modes for location, rotation, and scale. </p>
	 * @see #__DNA__FIELD__mix_mode_loc
	 */
	
	public byte getMix_mode_loc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 82);
		} else {
			return __io__block.readByte(__io__address + 78);
		}
	}

	/**
	 * Set method for struct member 'mix_mode_loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mixing modes for location, rotation, and scale. </p>
	 * @see #__DNA__FIELD__mix_mode_loc
	 */
	
	public void setMix_mode_loc(byte mix_mode_loc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 82, mix_mode_loc);
		} else {
			__io__block.writeByte(__io__address + 78, mix_mode_loc);
		}
	}

	/**
	 * Get method for struct member 'mix_mode_rot'.
	 * @see #__DNA__FIELD__mix_mode_rot
	 */
	
	public byte getMix_mode_rot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 83);
		} else {
			return __io__block.readByte(__io__address + 79);
		}
	}

	/**
	 * Set method for struct member 'mix_mode_rot'.
	 * @see #__DNA__FIELD__mix_mode_rot
	 */
	
	public void setMix_mode_rot(byte mix_mode_rot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 83, mix_mode_rot);
		} else {
			__io__block.writeByte(__io__address + 79, mix_mode_rot);
		}
	}

	/**
	 * Get method for struct member 'mix_mode_scale'.
	 * @see #__DNA__FIELD__mix_mode_scale
	 */
	
	public byte getMix_mode_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 84);
		} else {
			return __io__block.readByte(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'mix_mode_scale'.
	 * @see #__DNA__FIELD__mix_mode_scale
	 */
	
	public void setMix_mode_scale(byte mix_mode_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 84, mix_mode_scale);
		} else {
			__io__block.writeByte(__io__address + 80, mix_mode_scale);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 85, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 81, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 85;
		} else {
			__dna__offset = 81;
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
	 * Get method for struct member 'from_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min
	 */
	
	public CArrayFacade<Float> getFrom_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min
	 */
	
	public void setFrom_min(CArrayFacade<Float> from_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(from_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_min);
		} else {
			__io__generic__copy( getFrom_min(), from_min);
		}
	}

	/**
	 * Get method for struct member 'from_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max
	 */
	
	public CArrayFacade<Float> getFrom_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max
	 */
	
	public void setFrom_max(CArrayFacade<Float> from_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(from_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_max);
		} else {
			__io__generic__copy( getFrom_max(), from_max);
		}
	}

	/**
	 * Get method for struct member 'to_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min
	 */
	
	public CArrayFacade<Float> getTo_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min
	 */
	
	public void setTo_min(CArrayFacade<Float> to_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(to_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_min);
		} else {
			__io__generic__copy( getTo_min(), to_min);
		}
	}

	/**
	 * Get method for struct member 'to_max'.
	 * @see #__DNA__FIELD__to_max
	 */
	
	public CArrayFacade<Float> getTo_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_max'.
	 * @see #__DNA__FIELD__to_max
	 */
	
	public void setTo_max(CArrayFacade<Float> to_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(to_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_max);
		} else {
			__io__generic__copy( getTo_max(), to_max);
		}
	}

	/**
	 * Get method for struct member 'from_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min_rot
	 */
	
	public CArrayFacade<Float> getFrom_min_rot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min_rot
	 */
	
	public void setFrom_min_rot(CArrayFacade<Float> from_min_rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(from_min_rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_min_rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_min_rot);
		} else {
			__io__generic__copy( getFrom_min_rot(), from_min_rot);
		}
	}

	/**
	 * Get method for struct member 'from_max_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max_rot
	 */
	
	public CArrayFacade<Float> getFrom_max_rot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_max_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max_rot
	 */
	
	public void setFrom_max_rot(CArrayFacade<Float> from_max_rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 148;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(from_max_rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_max_rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_max_rot);
		} else {
			__io__generic__copy( getFrom_max_rot(), from_max_rot);
		}
	}

	/**
	 * Get method for struct member 'to_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min_rot
	 */
	
	public CArrayFacade<Float> getTo_min_rot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_min_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min_rot
	 */
	
	public void setTo_min_rot(CArrayFacade<Float> to_min_rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(to_min_rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_min_rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_min_rot);
		} else {
			__io__generic__copy( getTo_min_rot(), to_min_rot);
		}
	}

	/**
	 * Get method for struct member 'to_max_rot'.
	 * @see #__DNA__FIELD__to_max_rot
	 */
	
	public CArrayFacade<Float> getTo_max_rot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_max_rot'.
	 * @see #__DNA__FIELD__to_max_rot
	 */
	
	public void setTo_max_rot(CArrayFacade<Float> to_max_rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 172;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(to_max_rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_max_rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_max_rot);
		} else {
			__io__generic__copy( getTo_max_rot(), to_max_rot);
		}
	}

	/**
	 * Get method for struct member 'from_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min_scale
	 */
	
	public CArrayFacade<Float> getFrom_min_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From_min/max defines range of target transform. </p>
	 * @see #__DNA__FIELD__from_min_scale
	 */
	
	public void setFrom_min_scale(CArrayFacade<Float> from_min_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(from_min_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_min_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_min_scale);
		} else {
			__io__generic__copy( getFrom_min_scale(), from_min_scale);
		}
	}

	/**
	 * Get method for struct member 'from_max_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max_scale
	 */
	
	public CArrayFacade<Float> getFrom_max_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_max_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> To map on to to_min/max range. </p>
	 * @see #__DNA__FIELD__from_max_scale
	 */
	
	public void setFrom_max_scale(CArrayFacade<Float> from_max_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(from_max_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_max_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_max_scale);
		} else {
			__io__generic__copy( getFrom_max_scale(), from_max_scale);
		}
	}

	/**
	 * Get method for struct member 'to_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min_scale
	 */
	
	public CArrayFacade<Float> getTo_min_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_min_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of motion on owner caused by target. </p>
	 * @see #__DNA__FIELD__to_min_scale
	 */
	
	public void setTo_min_scale(CArrayFacade<Float> to_min_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(to_min_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_min_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_min_scale);
		} else {
			__io__generic__copy( getTo_min_scale(), to_min_scale);
		}
	}

	/**
	 * Get method for struct member 'to_max_scale'.
	 * @see #__DNA__FIELD__to_max_scale
	 */
	
	public CArrayFacade<Float> getTo_max_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_max_scale'.
	 * @see #__DNA__FIELD__to_max_scale
	 */
	
	public void setTo_max_scale(CArrayFacade<Float> to_max_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(to_max_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_max_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_max_scale);
		} else {
			__io__generic__copy( getTo_max_scale(), to_max_scale);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTransformConstraint> __io__addressof() {
		return new CPointer<bTransformConstraint>(__io__address, new Class[]{bTransformConstraint.class}, __io__block, __io__blockTable);
	}

}
