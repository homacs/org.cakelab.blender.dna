package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Bone'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> this system works on different transformation space levels;</p><p> 1) {@link Bone}  Space; with each {@link Bone}  having own (0,0,0) origin 2) Armature Space; the rest position, in {@link Object}  space, Bones Spaces are applied hierarchical 3) Pose Space; the animation position, in {@link Object}  space 4) {@link World}  Space; {@link Object}  matrix applied to Pose or Armature space </p>
 */

@CMetaData(size32=336, size64=360)
public class Bone extends CFacade {

	/**
	 * This is the sdna index of the struct Bone.
	 * <p>
	 * It is required when allocating a new block to store data for Bone.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 342;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Next/prev elements within this list </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-Defined Properties on this {@link Bone}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__prop);
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
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Parent bone (in same Armature)<h4>Blender Source Code:</h4>
	 * <p> Parent (ik parent if appropriate flag is set </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'childbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Children </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__childbase);
	 * CPointer&lt;ListBase&gt; p_childbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childbase = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the bone - must be unique within the armature, MAXBONENAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll is input for editmode, length calculated </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__roll);
	 * CPointer&lt;Float&gt; p_roll = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roll'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roll = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of head end of the bone relative to its parent
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__head);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_head = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'head'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__head = new long[]{92, 116};

	/**
	 * Field descriptor (offset) for struct member 'tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of tail end of the bone<h4>Blender Source Code:</h4>
	 * <p> head/tail and roll in {@link Bone}  Space </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__tail);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tail = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tail'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tail = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'bone_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation derived from head/tail/roll </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__bone_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_bone_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_mat'</li>
	 * <li>Signature: 'float[3][3]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_mat = new long[]{116, 140};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{152, 176};

	/**
	 * Field descriptor (offset) for struct member 'arm_head'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__arm_head);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_arm_head = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arm_head'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arm_head = new long[]{156, 180};

	/**
	 * Field descriptor (offset) for struct member 'arm_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> head/tail in Armature Space (rest pos) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__arm_tail);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_arm_tail = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arm_tail'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arm_tail = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'arm_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix: (bonemat(b)+head(b))*arm_mat(b-1), rest pos </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__arm_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_arm_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arm_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arm_mat = new long[]{180, 204};

	/**
	 * Field descriptor (offset) for struct member 'arm_roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll in Armature Space (rest pos) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__arm_roll);
	 * CPointer&lt;Float&gt; p_arm_roll = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arm_roll'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arm_roll = new long[]{244, 268};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{248, 272};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dist, weight: for non-deformgroup deforms </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{252, 276};

	/**
	 * Field descriptor (offset) for struct member 'xwidth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__xwidth);
	 * CPointer&lt;Float&gt; p_xwidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xwidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xwidth = new long[]{256, 280};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__length);
	 * CPointer&lt;Float&gt; p_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{260, 284};

	/**
	 * Field descriptor (offset) for struct member 'zwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> width: for block bones. keep in this order, transform! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__zwidth);
	 * CPointer&lt;Float&gt; p_zwidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zwidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zwidth = new long[]{264, 288};

	/**
	 * Field descriptor (offset) for struct member 'ease1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__ease1);
	 * CPointer&lt;Float&gt; p_ease1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ease1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ease1 = new long[]{268, 292};

	/**
	 * Field descriptor (offset) for struct member 'ease2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length of bezier handles </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__ease2);
	 * CPointer&lt;Float&gt; p_ease2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ease2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ease2 = new long[]{272, 296};

	/**
	 * Field descriptor (offset) for struct member 'rad_head'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__rad_head);
	 * CPointer&lt;Float&gt; p_rad_head = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rad_head'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rad_head = new long[]{276, 300};

	/**
	 * Field descriptor (offset) for struct member 'rad_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radius for head/tail sphere, defining deform as well, parent->rad_tip overrides rad_head </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__rad_tail);
	 * CPointer&lt;Float&gt; p_rad_tail = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rad_tail'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rad_tail = new long[]{280, 304};

	/**
	 * Field descriptor (offset) for struct member 'roll1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__roll1);
	 * CPointer&lt;Float&gt; p_roll1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roll1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roll1 = new long[]{284, 308};

	/**
	 * Field descriptor (offset) for struct member 'roll2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> curved bones settings - these define the "restpose" for a curved bone </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__roll2);
	 * CPointer&lt;Float&gt; p_roll2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roll2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roll2 = new long[]{288, 312};

	/**
	 * Field descriptor (offset) for struct member 'curveInX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__curveInX);
	 * CPointer&lt;Float&gt; p_curveInX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveInX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveInX = new long[]{292, 316};

	/**
	 * Field descriptor (offset) for struct member 'curveInY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__curveInY);
	 * CPointer&lt;Float&gt; p_curveInY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveInY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveInY = new long[]{296, 320};

	/**
	 * Field descriptor (offset) for struct member 'curveOutX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__curveOutX);
	 * CPointer&lt;Float&gt; p_curveOutX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveOutX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveOutX = new long[]{300, 324};

	/**
	 * Field descriptor (offset) for struct member 'curveOutY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__curveOutY);
	 * CPointer&lt;Float&gt; p_curveOutY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveOutY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveOutY = new long[]{304, 328};

	/**
	 * Field descriptor (offset) for struct member 'scaleIn'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__scaleIn);
	 * CPointer&lt;Float&gt; p_scaleIn = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaleIn'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaleIn = new long[]{308, 332};

	/**
	 * Field descriptor (offset) for struct member 'scaleOut'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__scaleOut);
	 * CPointer&lt;Float&gt; p_scaleOut = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaleOut'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaleOut = new long[]{312, 336};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patch for upward compat, UNUSED! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{316, 340};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layers that bone appears on </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__layer);
	 * CPointer&lt;Integer&gt; p_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{328, 352};

	/**
	 * Field descriptor (offset) for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for B-bones </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__segments);
	 * CPointer&lt;Short&gt; p_segments = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'segments'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__segments = new long[]{332, 356};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Bone bone = ...;
	 * CPointer&lt;Object&gt; p = bone.__dna__addressof(Bone.__DNA__FIELD__pad1);
	 * CPointer&lt;Short&gt; p_pad1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{334, 358};

	public Bone(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Bone(Bone that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Bone> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Bone> next) throws IOException
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Next/prev elements within this list </p>
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<Bone> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Next/prev elements within this list </p>
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Bone> prev) throws IOException
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
	 * <p> User-Defined Properties on this {@link Bone}  </p>
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
	 * <p> User-Defined Properties on this {@link Bone}  </p>
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
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Parent bone (in same Armature)<h4>Blender Source Code:</h4>
	 * <p> Parent (ik parent if appropriate flag is set </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<Bone> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Parent bone (in same Armature)<h4>Blender Source Code:</h4>
	 * <p> Parent (ik parent if appropriate flag is set </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<Bone> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'childbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Children </p>
	 * @see #__DNA__FIELD__childbase
	 */
	
	public ListBase getChildbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'childbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Children </p>
	 * @see #__DNA__FIELD__childbase
	 */
	
	public void setChildbase(ListBase childbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(childbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, childbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, childbase);
		} else {
			__io__generic__copy( getChildbase(), childbase);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the bone - must be unique within the armature, MAXBONENAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the bone - must be unique within the armature, MAXBONENAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll is input for editmode, length calculated </p>
	 * @see #__DNA__FIELD__roll
	 */
	
	public float getRoll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll is input for editmode, length calculated </p>
	 * @see #__DNA__FIELD__roll
	 */
	
	public void setRoll(float roll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, roll);
		} else {
			__io__block.writeFloat(__io__address + 88, roll);
		}
	}

	/**
	 * Get method for struct member 'head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of head end of the bone relative to its parent
	 * @see #__DNA__FIELD__head
	 */
	
	public CArrayFacade<Float> getHead() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of head end of the bone relative to its parent
	 * @see #__DNA__FIELD__head
	 */
	
	public void setHead(CArrayFacade<Float> head) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(head, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, head)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, head);
		} else {
			__io__generic__copy( getHead(), head);
		}
	}

	/**
	 * Get method for struct member 'tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of tail end of the bone<h4>Blender Source Code:</h4>
	 * <p> head/tail and roll in {@link Bone}  Space </p>
	 * @see #__DNA__FIELD__tail
	 */
	
	public CArrayFacade<Float> getTail() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Location of tail end of the bone<h4>Blender Source Code:</h4>
	 * <p> head/tail and roll in {@link Bone}  Space </p>
	 * @see #__DNA__FIELD__tail
	 */
	
	public void setTail(CArrayFacade<Float> tail) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(tail, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tail)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tail);
		} else {
			__io__generic__copy( getTail(), tail);
		}
	}

	/**
	 * Get method for struct member 'bone_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation derived from head/tail/roll </p>
	 * @see #__DNA__FIELD__bone_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getBone_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation derived from head/tail/roll </p>
	 * @see #__DNA__FIELD__bone_mat
	 */
	
	public void setBone_mat(CArrayFacade<CArrayFacade<Float>> bone_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 140;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(bone_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_mat);
		} else {
			__io__generic__copy( getBone_mat(), bone_mat);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
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
			__io__block.writeInt(__io__address + 176, flag);
		} else {
			__io__block.writeInt(__io__address + 152, flag);
		}
	}

	/**
	 * Get method for struct member 'arm_head'.
	 * @see #__DNA__FIELD__arm_head
	 */
	
	public CArrayFacade<Float> getArm_head() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'arm_head'.
	 * @see #__DNA__FIELD__arm_head
	 */
	
	public void setArm_head(CArrayFacade<Float> arm_head) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(arm_head, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, arm_head)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, arm_head);
		} else {
			__io__generic__copy( getArm_head(), arm_head);
		}
	}

	/**
	 * Get method for struct member 'arm_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> head/tail in Armature Space (rest pos) </p>
	 * @see #__DNA__FIELD__arm_tail
	 */
	
	public CArrayFacade<Float> getArm_tail() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'arm_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> head/tail in Armature Space (rest pos) </p>
	 * @see #__DNA__FIELD__arm_tail
	 */
	
	public void setArm_tail(CArrayFacade<Float> arm_tail) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(arm_tail, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, arm_tail)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, arm_tail);
		} else {
			__io__generic__copy( getArm_tail(), arm_tail);
		}
	}

	/**
	 * Get method for struct member 'arm_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix: (bonemat(b)+head(b))*arm_mat(b-1), rest pos </p>
	 * @see #__DNA__FIELD__arm_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getArm_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'arm_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix: (bonemat(b)+head(b))*arm_mat(b-1), rest pos </p>
	 * @see #__DNA__FIELD__arm_mat
	 */
	
	public void setArm_mat(CArrayFacade<CArrayFacade<Float>> arm_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(arm_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, arm_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, arm_mat);
		} else {
			__io__generic__copy( getArm_mat(), arm_mat);
		}
	}

	/**
	 * Get method for struct member 'arm_roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll in Armature Space (rest pos) </p>
	 * @see #__DNA__FIELD__arm_roll
	 */
	
	public float getArm_roll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'arm_roll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> roll in Armature Space (rest pos) </p>
	 * @see #__DNA__FIELD__arm_roll
	 */
	
	public void setArm_roll(float arm_roll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, arm_roll);
		} else {
			__io__block.writeFloat(__io__address + 244, arm_roll);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, dist);
		} else {
			__io__block.writeFloat(__io__address + 248, dist);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dist, weight: for non-deformgroup deforms </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dist, weight: for non-deformgroup deforms </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, weight);
		} else {
			__io__block.writeFloat(__io__address + 252, weight);
		}
	}

	/**
	 * Get method for struct member 'xwidth'.
	 * @see #__DNA__FIELD__xwidth
	 */
	
	public float getXwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'xwidth'.
	 * @see #__DNA__FIELD__xwidth
	 */
	
	public void setXwidth(float xwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, xwidth);
		} else {
			__io__block.writeFloat(__io__address + 256, xwidth);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public float getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(float length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, length);
		} else {
			__io__block.writeFloat(__io__address + 260, length);
		}
	}

	/**
	 * Get method for struct member 'zwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> width: for block bones. keep in this order, transform! </p>
	 * @see #__DNA__FIELD__zwidth
	 */
	
	public float getZwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'zwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> width: for block bones. keep in this order, transform! </p>
	 * @see #__DNA__FIELD__zwidth
	 */
	
	public void setZwidth(float zwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, zwidth);
		} else {
			__io__block.writeFloat(__io__address + 264, zwidth);
		}
	}

	/**
	 * Get method for struct member 'ease1'.
	 * @see #__DNA__FIELD__ease1
	 */
	
	public float getEase1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'ease1'.
	 * @see #__DNA__FIELD__ease1
	 */
	
	public void setEase1(float ease1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, ease1);
		} else {
			__io__block.writeFloat(__io__address + 268, ease1);
		}
	}

	/**
	 * Get method for struct member 'ease2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length of bezier handles </p>
	 * @see #__DNA__FIELD__ease2
	 */
	
	public float getEase2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'ease2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length of bezier handles </p>
	 * @see #__DNA__FIELD__ease2
	 */
	
	public void setEase2(float ease2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, ease2);
		} else {
			__io__block.writeFloat(__io__address + 272, ease2);
		}
	}

	/**
	 * Get method for struct member 'rad_head'.
	 * @see #__DNA__FIELD__rad_head
	 */
	
	public float getRad_head() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'rad_head'.
	 * @see #__DNA__FIELD__rad_head
	 */
	
	public void setRad_head(float rad_head) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, rad_head);
		} else {
			__io__block.writeFloat(__io__address + 276, rad_head);
		}
	}

	/**
	 * Get method for struct member 'rad_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radius for head/tail sphere, defining deform as well, parent->rad_tip overrides rad_head </p>
	 * @see #__DNA__FIELD__rad_tail
	 */
	
	public float getRad_tail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'rad_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radius for head/tail sphere, defining deform as well, parent->rad_tip overrides rad_head </p>
	 * @see #__DNA__FIELD__rad_tail
	 */
	
	public void setRad_tail(float rad_tail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, rad_tail);
		} else {
			__io__block.writeFloat(__io__address + 280, rad_tail);
		}
	}

	/**
	 * Get method for struct member 'roll1'.
	 * @see #__DNA__FIELD__roll1
	 */
	
	public float getRoll1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'roll1'.
	 * @see #__DNA__FIELD__roll1
	 */
	
	public void setRoll1(float roll1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, roll1);
		} else {
			__io__block.writeFloat(__io__address + 284, roll1);
		}
	}

	/**
	 * Get method for struct member 'roll2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> curved bones settings - these define the "restpose" for a curved bone </p>
	 * @see #__DNA__FIELD__roll2
	 */
	
	public float getRoll2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'roll2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> curved bones settings - these define the "restpose" for a curved bone </p>
	 * @see #__DNA__FIELD__roll2
	 */
	
	public void setRoll2(float roll2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, roll2);
		} else {
			__io__block.writeFloat(__io__address + 288, roll2);
		}
	}

	/**
	 * Get method for struct member 'curveInX'.
	 * @see #__DNA__FIELD__curveInX
	 */
	
	public float getCurveInX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'curveInX'.
	 * @see #__DNA__FIELD__curveInX
	 */
	
	public void setCurveInX(float curveInX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, curveInX);
		} else {
			__io__block.writeFloat(__io__address + 292, curveInX);
		}
	}

	/**
	 * Get method for struct member 'curveInY'.
	 * @see #__DNA__FIELD__curveInY
	 */
	
	public float getCurveInY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'curveInY'.
	 * @see #__DNA__FIELD__curveInY
	 */
	
	public void setCurveInY(float curveInY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, curveInY);
		} else {
			__io__block.writeFloat(__io__address + 296, curveInY);
		}
	}

	/**
	 * Get method for struct member 'curveOutX'.
	 * @see #__DNA__FIELD__curveOutX
	 */
	
	public float getCurveOutX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 324);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'curveOutX'.
	 * @see #__DNA__FIELD__curveOutX
	 */
	
	public void setCurveOutX(float curveOutX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 324, curveOutX);
		} else {
			__io__block.writeFloat(__io__address + 300, curveOutX);
		}
	}

	/**
	 * Get method for struct member 'curveOutY'.
	 * @see #__DNA__FIELD__curveOutY
	 */
	
	public float getCurveOutY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'curveOutY'.
	 * @see #__DNA__FIELD__curveOutY
	 */
	
	public void setCurveOutY(float curveOutY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, curveOutY);
		} else {
			__io__block.writeFloat(__io__address + 304, curveOutY);
		}
	}

	/**
	 * Get method for struct member 'scaleIn'.
	 * @see #__DNA__FIELD__scaleIn
	 */
	
	public float getScaleIn() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'scaleIn'.
	 * @see #__DNA__FIELD__scaleIn
	 */
	
	public void setScaleIn(float scaleIn) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, scaleIn);
		} else {
			__io__block.writeFloat(__io__address + 308, scaleIn);
		}
	}

	/**
	 * Get method for struct member 'scaleOut'.
	 * @see #__DNA__FIELD__scaleOut
	 */
	
	public float getScaleOut() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'scaleOut'.
	 * @see #__DNA__FIELD__scaleOut
	 */
	
	public void setScaleOut(float scaleOut) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, scaleOut);
		} else {
			__io__block.writeFloat(__io__address + 312, scaleOut);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patch for upward compat, UNUSED! </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 340, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patch for upward compat, UNUSED! </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 340;
		} else {
			__dna__offset = 316;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layers that bone appears on </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public int getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 352);
		} else {
			return __io__block.readInt(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layers that bone appears on </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(int layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 352, layer);
		} else {
			__io__block.writeInt(__io__address + 328, layer);
		}
	}

	/**
	 * Get method for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for B-bones </p>
	 * @see #__DNA__FIELD__segments
	 */
	
	public short getSegments() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 356);
		} else {
			return __io__block.readShort(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for B-bones </p>
	 * @see #__DNA__FIELD__segments
	 */
	
	public void setSegments(short segments) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 356, segments);
		} else {
			__io__block.writeShort(__io__address + 332, segments);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public short getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 358);
		} else {
			return __io__block.readShort(__io__address + 334);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(short pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 358, pad1);
		} else {
			__io__block.writeShort(__io__address + 334, pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Bone> __io__addressof() {
		return new CPointer<Bone>(__io__address, new Class[]{Bone.class}, __io__block, __io__blockTable);
	}

}
