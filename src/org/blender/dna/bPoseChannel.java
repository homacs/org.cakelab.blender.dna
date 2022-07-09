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
 * Generated facet for DNA struct type 'bPoseChannel'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  Poses PoseChannel ---------------------------------<mdash/>  PoseChannel</p><p> A {@link bPoseChannel}  stores the results of Actions and transform information with respect to the rest-position of {@link bArmature}  bones. </p>
 */

@CMetaData(size32=864, size64=960)
public class bPoseChannel extends CFacade {

	/**
	 * This is the sdna index of the struct bPoseChannel.
	 * <p>
	 * It is required when allocating a new block to store data for bPoseChannel.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 361;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
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
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined Properties on this PoseChannel. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__prop);
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
	 * Field descriptor (offset) for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Constraints that act on this PoseChannel. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__constraints);
	 * CPointer&lt;ListBase&gt; p_constraints = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constraints'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constraints = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Need to match bone name length: MAXBONENAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dynamic, for detecting transform changes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'ikflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for IK bones. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__ikflag);
	 * CPointer&lt;Short&gt; p_ikflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ikflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ikflag = new long[]{86, 106};

	/**
	 * Field descriptor (offset) for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Protect channels from being transformed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__protectflag);
	 * CPointer&lt;Short&gt; p_protectflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'protectflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__protectflag = new long[]{88, 108};

	/**
	 * Field descriptor (offset) for struct member 'agrp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of action-group this bone belongs to (0 = default/no group). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__agrp_index);
	 * CPointer&lt;Short&gt; p_agrp_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agrp_index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agrp_index = new long[]{90, 110};

	/**
	 * Field descriptor (offset) for struct member 'constflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For quick detecting which constraints affect this channel. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__constflag);
	 * CPointer&lt;Byte&gt; p_constflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constflag = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'selectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of bone flag, so you can work with library armatures, not for runtime use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__selectflag);
	 * CPointer&lt;Byte&gt; p_selectflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selectflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selectflag = new long[]{93, 113};

	/**
	 * Field descriptor (offset) for struct member 'drawflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__drawflag);
	 * CPointer&lt;Byte&gt; p_drawflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawflag = new long[]{94, 114};

	/**
	 * Field descriptor (offset) for struct member 'bboneflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__bboneflag);
	 * CPointer&lt;Byte&gt; p_bboneflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bboneflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bboneflag = new long[]{95, 115};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{96, 116};

	/**
	 * Field descriptor (offset) for struct member 'bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__bone);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_bone = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'child'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose, the 'ik' child, for b-bones. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__child);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_child = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'iktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> "IK trees" - only while evaluating pose. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__iktree);
	 * CPointer&lt;ListBase&gt; p_iktree = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iktree'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iktree = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'siktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Spline-IK "trees" - only while evaluating pose. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__siktree);
	 * CPointer&lt;ListBase&gt; p_siktree = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'siktree'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__siktree = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this bone. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__mpath);
	 * CPointer&lt;CPointer&lt;bMotionPath&gt;&gt; p_mpath = p.cast(new Class[]{CPointer.class, bMotionPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mpath'</li>
	 * <li>Signature: 'bMotionPath*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mpath = new long[]{128, 176};

	/**
	 * Field descriptor (offset) for struct member 'custom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draws custom object instead of default bone shape. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_custom = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'custom_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Odd feature, display with another bones transform. needed in rare cases for advanced rigs, since the alternative is highly complicated - campbell </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom_tx);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_custom_tx = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_tx'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_tx = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member 'custom_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom_scale);
	 * CPointer&lt;Float&gt; p_custom_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_scale = new long[]{140, 200};

	/**
	 * Field descriptor (offset) for struct member 'custom_scale_xyz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom_scale_xyz);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_custom_scale_xyz = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_scale_xyz'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_scale_xyz = new long[]{144, 204};

	/**
	 * Field descriptor (offset) for struct member 'custom_translation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom_translation);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_custom_translation = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_translation'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_translation = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'custom_rotation_euler'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__custom_rotation_euler);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_custom_rotation_euler = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_rotation_euler'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_rotation_euler = new long[]{168, 228};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Transforms - written in by actions or transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{180, 240};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{192, 252};

	/**
	 * Field descriptor (offset) for struct member 'eul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Rotations - written in by actions or transform (but only one representation gets used at any time) Euler rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__eul);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_eul = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eul'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eul = new long[]{204, 264};

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__quat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_quat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quat = new long[]{216, 276};

	/**
	 * Field descriptor (offset) for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Axis-angle rotation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__rotAxis);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotAxis = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotAxis'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotAxis = new long[]{232, 292};

	/**
	 * Field descriptor (offset) for struct member 'rotAngle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__rotAngle);
	 * CPointer&lt;Float&gt; p_rotAngle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotAngle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotAngle = new long[]{244, 304};

	/**
	 * Field descriptor (offset) for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eRotationModes  - rotation representation to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__rotmode);
	 * CPointer&lt;Short&gt; p_rotmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotmode = new long[]{248, 308};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{250, 310};

	/**
	 * Field descriptor (offset) for struct member 'chan_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  (without {@link Bone#getArm_mat()} ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__chan_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_chan_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chan_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chan_mat = new long[]{252, 312};

	/**
	 * Field descriptor (offset) for struct member 'pose_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  this matrix is object space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__pose_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_pose_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_mat = new long[]{316, 376};

	/**
	 * Field descriptor (offset) for struct member 'disp_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__disp_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_disp_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp_mat = new long[]{380, 440};

	/**
	 * Field descriptor (offset) for struct member 'disp_tail_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied and translated to tail. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__disp_tail_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_disp_tail_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp_tail_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp_tail_mat = new long[]{444, 504};

	/**
	 * Field descriptor (offset) for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of rest-position, parent, and local transform. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__constinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_constinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constinv = new long[]{508, 568};

	/**
	 * Field descriptor (offset) for struct member 'pose_head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Actually pose_mat[3]. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__pose_head);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pose_head = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_head'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_head = new long[]{572, 632};

	/**
	 * Field descriptor (offset) for struct member 'pose_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Also used for drawing help lines. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__pose_tail);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pose_tail = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_tail'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_tail = new long[]{584, 644};

	/**
	 * Field descriptor (offset) for struct member 'limitmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF constraint, note! - these are stored in degrees, not radians. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__limitmin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_limitmin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limitmin'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limitmin = new long[]{596, 656};

	/**
	 * Field descriptor (offset) for struct member 'limitmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__limitmax);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_limitmax = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limitmax'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limitmax = new long[]{608, 668};

	/**
	 * Field descriptor (offset) for struct member 'stiffness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF stiffness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__stiffness);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stiffness = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stiffness'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stiffness = new long[]{620, 680};

	/**
	 * Field descriptor (offset) for struct member 'ikstretch'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__ikstretch);
	 * CPointer&lt;Float&gt; p_ikstretch = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ikstretch'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ikstretch = new long[]{632, 692};

	/**
	 * Field descriptor (offset) for struct member 'ikrotweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint rotation constraint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__ikrotweight);
	 * CPointer&lt;Float&gt; p_ikrotweight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ikrotweight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ikrotweight = new long[]{636, 696};

	/**
	 * Field descriptor (offset) for struct member 'iklinweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint stretch constraint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__iklinweight);
	 * CPointer&lt;Float&gt; p_iklinweight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iklinweight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iklinweight = new long[]{640, 700};

	/**
	 * Field descriptor (offset) for struct member 'roll1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Curved bones settings - these are for animating, and are applied on top of the copies in pchan->bone </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__roll1);
	 * CPointer&lt;Float&gt; p_roll1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roll1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roll1 = new long[]{644, 704};

	/**
	 * Field descriptor (offset) for struct member 'roll2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__roll2);
	 * CPointer&lt;Float&gt; p_roll2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roll2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roll2 = new long[]{648, 708};

	/**
	 * Field descriptor (offset) for struct member 'curveInX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__curveInX);
	 * CPointer&lt;Float&gt; p_curveInX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveInX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveInX = new long[]{652, 712};

	/**
	 * Field descriptor (offset) for struct member 'curveInY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__curveInY);
	 * CPointer&lt;Float&gt; p_curveInY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveInY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveInY = new long[]{656, 716};

	/**
	 * Field descriptor (offset) for struct member 'curveOutX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__curveOutX);
	 * CPointer&lt;Float&gt; p_curveOutX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveOutX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveOutX = new long[]{660, 720};

	/**
	 * Field descriptor (offset) for struct member 'curveOutY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__curveOutY);
	 * CPointer&lt;Float&gt; p_curveOutY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curveOutY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curveOutY = new long[]{664, 724};

	/**
	 * Field descriptor (offset) for struct member 'ease1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__ease1);
	 * CPointer&lt;Float&gt; p_ease1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ease1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ease1 = new long[]{668, 728};

	/**
	 * Field descriptor (offset) for struct member 'ease2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__ease2);
	 * CPointer&lt;Float&gt; p_ease2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ease2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ease2 = new long[]{672, 732};

	/**
	 * Field descriptor (offset) for struct member 'scaleIn'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scaleIn);
	 * CPointer&lt;Float&gt; p_scaleIn = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaleIn'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaleIn = new long[]{676, 736};

	/**
	 * Field descriptor (offset) for struct member 'scale_in_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scale_in_y);
	 * CPointer&lt;Float&gt; p_scale_in_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_in_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_in_y = new long[]{680, 740};

	/**
	 * Field descriptor (offset) for struct member 'scaleOut'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scaleOut);
	 * CPointer&lt;Float&gt; p_scaleOut = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaleOut'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaleOut = new long[]{684, 744};

	/**
	 * Field descriptor (offset) for struct member 'scale_out_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scale_out_y);
	 * CPointer&lt;Float&gt; p_scale_out_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_out_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_out_y = new long[]{688, 748};

	/**
	 * Field descriptor (offset) for struct member 'scale_in'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scale_in);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scale_in = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_in'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_in = new long[]{692, 752};

	/**
	 * Field descriptor (offset) for struct member 'scale_out'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__scale_out);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scale_out = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_out'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_out = new long[]{704, 764};

	/**
	 * Field descriptor (offset) for struct member 'bbone_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> B-Bone custom handles; set on read file or rebuild pose based on pchan->bone data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__bbone_prev);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_bbone_prev = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_prev'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_prev = new long[]{716, 776};

	/**
	 * Field descriptor (offset) for struct member 'bbone_next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__bbone_next);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_bbone_next = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_next'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_next = new long[]{720, 784};

	/**
	 * Field descriptor (offset) for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for outliner. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__temp);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_temp = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp = new long[]{724, 792};

	/**
	 * Field descriptor (offset) for struct member 'draw_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for color and bbone segment matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__draw_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_draw_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_data'</li>
	 * <li>Signature: 'bPoseChannelDrawData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_data = new long[]{728, 800};

	/**
	 * Field descriptor (offset) for struct member 'orig_pchan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Points to an original pose channel. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__orig_pchan);
	 * CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt; p_orig_pchan = p.cast(new Class[]{CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_pchan'</li>
	 * <li>Signature: 'bPoseChannel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_pchan = new long[]{732, 808};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data (keep last). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel bposechannel = ...;
	 * CPointer&lt;Object&gt; p = bposechannel.__dna__addressof(bPoseChannel.__DNA__FIELD__runtime);
	 * CPointer&lt;bPoseChannel_Runtime&gt; p_runtime = p.cast(new Class[]{bPoseChannel_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bPoseChannel_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 128/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{736, 816};

	public bPoseChannel(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bPoseChannel(bPoseChannel that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bPoseChannel> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bPoseChannel> next) throws IOException
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
	
	public CPointer<bPoseChannel> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bPoseChannel> prev) throws IOException
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
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined Properties on this PoseChannel. </p>
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
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined Properties on this PoseChannel. </p>
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
	 * Get method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Constraints that act on this PoseChannel. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public ListBase getConstraints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Constraints that act on this PoseChannel. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public void setConstraints(ListBase constraints) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(constraints, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, constraints)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, constraints);
		} else {
			__io__generic__copy( getConstraints(), constraints);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Need to match bone name length: MAXBONENAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
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
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Need to match bone name length: MAXBONENAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dynamic, for detecting transform changes. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dynamic, for detecting transform changes. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, flag);
		} else {
			__io__block.writeShort(__io__address + 84, flag);
		}
	}

	/**
	 * Get method for struct member 'ikflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for IK bones. </p>
	 * @see #__DNA__FIELD__ikflag
	 */
	
	public short getIkflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 86);
		}
	}

	/**
	 * Set method for struct member 'ikflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for IK bones. </p>
	 * @see #__DNA__FIELD__ikflag
	 */
	
	public void setIkflag(short ikflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, ikflag);
		} else {
			__io__block.writeShort(__io__address + 86, ikflag);
		}
	}

	/**
	 * Get method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Protect channels from being transformed. </p>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public short getProtectflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 108);
		} else {
			return __io__block.readShort(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'protectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Protect channels from being transformed. </p>
	 * @see #__DNA__FIELD__protectflag
	 */
	
	public void setProtectflag(short protectflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 108, protectflag);
		} else {
			__io__block.writeShort(__io__address + 88, protectflag);
		}
	}

	/**
	 * Get method for struct member 'agrp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of action-group this bone belongs to (0 = default/no group). </p>
	 * @see #__DNA__FIELD__agrp_index
	 */
	
	public short getAgrp_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 110);
		} else {
			return __io__block.readShort(__io__address + 90);
		}
	}

	/**
	 * Set method for struct member 'agrp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of action-group this bone belongs to (0 = default/no group). </p>
	 * @see #__DNA__FIELD__agrp_index
	 */
	
	public void setAgrp_index(short agrp_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 110, agrp_index);
		} else {
			__io__block.writeShort(__io__address + 90, agrp_index);
		}
	}

	/**
	 * Get method for struct member 'constflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For quick detecting which constraints affect this channel. </p>
	 * @see #__DNA__FIELD__constflag
	 */
	
	public byte getConstflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 112);
		} else {
			return __io__block.readByte(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'constflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For quick detecting which constraints affect this channel. </p>
	 * @see #__DNA__FIELD__constflag
	 */
	
	public void setConstflag(byte constflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 112, constflag);
		} else {
			__io__block.writeByte(__io__address + 92, constflag);
		}
	}

	/**
	 * Get method for struct member 'selectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of bone flag, so you can work with library armatures, not for runtime use. </p>
	 * @see #__DNA__FIELD__selectflag
	 */
	
	public byte getSelectflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 113);
		} else {
			return __io__block.readByte(__io__address + 93);
		}
	}

	/**
	 * Set method for struct member 'selectflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of bone flag, so you can work with library armatures, not for runtime use. </p>
	 * @see #__DNA__FIELD__selectflag
	 */
	
	public void setSelectflag(byte selectflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 113, selectflag);
		} else {
			__io__block.writeByte(__io__address + 93, selectflag);
		}
	}

	/**
	 * Get method for struct member 'drawflag'.
	 * @see #__DNA__FIELD__drawflag
	 */
	
	public byte getDrawflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 114);
		} else {
			return __io__block.readByte(__io__address + 94);
		}
	}

	/**
	 * Set method for struct member 'drawflag'.
	 * @see #__DNA__FIELD__drawflag
	 */
	
	public void setDrawflag(byte drawflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 114, drawflag);
		} else {
			__io__block.writeByte(__io__address + 94, drawflag);
		}
	}

	/**
	 * Get method for struct member 'bboneflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__bboneflag
	 */
	
	public byte getBboneflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 115);
		} else {
			return __io__block.readByte(__io__address + 95);
		}
	}

	/**
	 * Set method for struct member 'bboneflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__bboneflag
	 */
	
	public void setBboneflag(byte bboneflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 115, bboneflag);
		} else {
			__io__block.writeByte(__io__address + 95, bboneflag);
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
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 116;
		} else {
			__dna__offset = 96;
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
	 * Get method for struct member 'bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * @see #__DNA__FIELD__bone
	 */
	
	public CPointer<Bone> getBone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * @see #__DNA__FIELD__bone
	 */
	
	public void setBone(CPointer<Bone> bone) throws IOException
	{
		long __address = ((bone == null) ? 0 : bone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<bPoseChannel> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<bPoseChannel> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'child'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose, the 'ik' child, for b-bones. </p>
	 * @see #__DNA__FIELD__child
	 */
	
	public CPointer<bPoseChannel> getChild() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'child'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on read file or rebuild pose, the 'ik' child, for b-bones. </p>
	 * @see #__DNA__FIELD__child
	 */
	
	public void setChild(CPointer<bPoseChannel> child) throws IOException
	{
		long __address = ((child == null) ? 0 : child.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'iktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> "IK trees" - only while evaluating pose. </p>
	 * @see #__DNA__FIELD__iktree
	 */
	
	public ListBase getIktree() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> "IK trees" - only while evaluating pose. </p>
	 * @see #__DNA__FIELD__iktree
	 */
	
	public void setIktree(ListBase iktree) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(iktree, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iktree)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iktree);
		} else {
			__io__generic__copy( getIktree(), iktree);
		}
	}

	/**
	 * Get method for struct member 'siktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Spline-IK "trees" - only while evaluating pose. </p>
	 * @see #__DNA__FIELD__siktree
	 */
	
	public ListBase getSiktree() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'siktree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Spline-IK "trees" - only while evaluating pose. </p>
	 * @see #__DNA__FIELD__siktree
	 */
	
	public void setSiktree(ListBase siktree) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(siktree, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, siktree)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, siktree);
		} else {
			__io__generic__copy( getSiktree(), siktree);
		}
	}

	/**
	 * Get method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this bone. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public CPointer<bMotionPath> getMpath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bMotionPath.class};
		return new CPointer<bMotionPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bMotionPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mpath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion path cache for this bone. </p>
	 * @see #__DNA__FIELD__mpath
	 */
	
	public void setMpath(CPointer<bMotionPath> mpath) throws IOException
	{
		long __address = ((mpath == null) ? 0 : mpath.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'custom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draws custom object instead of default bone shape. </p>
	 * @see #__DNA__FIELD__custom
	 */
	
	public CPointer<BlenderObject> getCustom() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draws custom object instead of default bone shape. </p>
	 * @see #__DNA__FIELD__custom
	 */
	
	public void setCustom(CPointer<BlenderObject> custom) throws IOException
	{
		long __address = ((custom == null) ? 0 : custom.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'custom_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Odd feature, display with another bones transform. needed in rare cases for advanced rigs, since the alternative is highly complicated - campbell </p>
	 * @see #__DNA__FIELD__custom_tx
	 */
	
	public CPointer<bPoseChannel> getCustom_tx() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Odd feature, display with another bones transform. needed in rare cases for advanced rigs, since the alternative is highly complicated - campbell </p>
	 * @see #__DNA__FIELD__custom_tx
	 */
	
	public void setCustom_tx(CPointer<bPoseChannel> custom_tx) throws IOException
	{
		long __address = ((custom_tx == null) ? 0 : custom_tx.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'custom_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated </p>
	 * @see #__DNA__FIELD__custom_scale
	 */
	
	public float getCustom_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'custom_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated </p>
	 * @see #__DNA__FIELD__custom_scale
	 */
	
	public void setCustom_scale(float custom_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, custom_scale);
		} else {
			__io__block.writeFloat(__io__address + 140, custom_scale);
		}
	}

	/**
	 * Get method for struct member 'custom_scale_xyz'.
	 * @see #__DNA__FIELD__custom_scale_xyz
	 */
	
	public CArrayFacade<Float> getCustom_scale_xyz() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'custom_scale_xyz'.
	 * @see #__DNA__FIELD__custom_scale_xyz
	 */
	
	public void setCustom_scale_xyz(CArrayFacade<Float> custom_scale_xyz) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(custom_scale_xyz, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, custom_scale_xyz)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, custom_scale_xyz);
		} else {
			__io__generic__copy( getCustom_scale_xyz(), custom_scale_xyz);
		}
	}

	/**
	 * Get method for struct member 'custom_translation'.
	 * @see #__DNA__FIELD__custom_translation
	 */
	
	public CArrayFacade<Float> getCustom_translation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'custom_translation'.
	 * @see #__DNA__FIELD__custom_translation
	 */
	
	public void setCustom_translation(CArrayFacade<Float> custom_translation) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(custom_translation, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, custom_translation)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, custom_translation);
		} else {
			__io__generic__copy( getCustom_translation(), custom_translation);
		}
	}

	/**
	 * Get method for struct member 'custom_rotation_euler'.
	 * @see #__DNA__FIELD__custom_rotation_euler
	 */
	
	public CArrayFacade<Float> getCustom_rotation_euler() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'custom_rotation_euler'.
	 * @see #__DNA__FIELD__custom_rotation_euler
	 */
	
	public void setCustom_rotation_euler(CArrayFacade<Float> custom_rotation_euler) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 228;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(custom_rotation_euler, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, custom_rotation_euler)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, custom_rotation_euler);
		} else {
			__io__generic__copy( getCustom_rotation_euler(), custom_rotation_euler);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Transforms - written in by actions or transform. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Transforms - written in by actions or transform. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 252;
		} else {
			__dna__offset = 192;
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
	 * Get method for struct member 'eul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Rotations - written in by actions or transform (but only one representation gets used at any time) Euler rotation. </p>
	 * @see #__DNA__FIELD__eul
	 */
	
	public CArrayFacade<Float> getEul() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'eul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Rotations - written in by actions or transform (but only one representation gets used at any time) Euler rotation. </p>
	 * @see #__DNA__FIELD__eul
	 */
	
	public void setEul(CArrayFacade<Float> eul) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(eul, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, eul)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, eul);
		} else {
			__io__generic__copy( getEul(), eul);
		}
	}

	/**
	 * Get method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public CArrayFacade<Float> getQuat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 276, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Quaternion rotation. </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 276;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(quat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, quat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, quat);
		} else {
			__io__generic__copy( getQuat(), quat);
		}
	}

	/**
	 * Get method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Axis-angle rotation. </p>
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public CArrayFacade<Float> getRotAxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Axis-angle rotation. </p>
	 * @see #__DNA__FIELD__rotAxis
	 */
	
	public void setRotAxis(CArrayFacade<Float> rotAxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 292;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(rotAxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotAxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotAxis);
		} else {
			__io__generic__copy( getRotAxis(), rotAxis);
		}
	}

	/**
	 * Get method for struct member 'rotAngle'.
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public float getRotAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'rotAngle'.
	 * @see #__DNA__FIELD__rotAngle
	 */
	
	public void setRotAngle(float rotAngle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, rotAngle);
		} else {
			__io__block.writeFloat(__io__address + 244, rotAngle);
		}
	}

	/**
	 * Get method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eRotationModes  - rotation representation to use. </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public short getRotmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 308);
		} else {
			return __io__block.readShort(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'rotmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>eRotationModes  - rotation representation to use. </p>
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public void setRotmode(short rotmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 308, rotmode);
		} else {
			__io__block.writeShort(__io__address + 248, rotmode);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 310, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 250, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 310;
		} else {
			__dna__offset = 250;
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
	 * Get method for struct member 'chan_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  (without {@link Bone#getArm_mat()} ). </p>
	 * @see #__DNA__FIELD__chan_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getChan_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'chan_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  (without {@link Bone#getArm_mat()} ). </p>
	 * @see #__DNA__FIELD__chan_mat
	 */
	
	public void setChan_mat(CArrayFacade<CArrayFacade<Float>> chan_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 252;
		}
		if (__io__equals(chan_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, chan_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, chan_mat);
		} else {
			__io__generic__copy( getChan_mat(), chan_mat);
		}
	}

	/**
	 * Get method for struct member 'pose_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  this matrix is object space. </p>
	 * @see #__DNA__FIELD__pose_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getPose_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 376, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  this matrix is object space. </p>
	 * @see #__DNA__FIELD__pose_mat
	 */
	
	public void setPose_mat(CArrayFacade<CArrayFacade<Float>> pose_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 376;
		} else {
			__dna__offset = 316;
		}
		if (__io__equals(pose_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pose_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pose_mat);
		} else {
			__io__generic__copy( getPose_mat(), pose_mat);
		}
	}

	/**
	 * Get method for struct member 'disp_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied. </p>
	 * @see #__DNA__FIELD__disp_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getDisp_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disp_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied. </p>
	 * @see #__DNA__FIELD__disp_mat
	 */
	
	public void setDisp_mat(CArrayFacade<CArrayFacade<Float>> disp_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 440;
		} else {
			__dna__offset = 380;
		}
		if (__io__equals(disp_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disp_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disp_mat);
		} else {
			__io__generic__copy( getDisp_mat(), disp_mat);
		}
	}

	/**
	 * Get method for struct member 'disp_tail_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied and translated to tail. </p>
	 * @see #__DNA__FIELD__disp_tail_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getDisp_tail_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 504, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disp_tail_mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For display, pose_mat with bone length applied and translated to tail. </p>
	 * @see #__DNA__FIELD__disp_tail_mat
	 */
	
	public void setDisp_tail_mat(CArrayFacade<CArrayFacade<Float>> disp_tail_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 504;
		} else {
			__dna__offset = 444;
		}
		if (__io__equals(disp_tail_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disp_tail_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disp_tail_mat);
		} else {
			__io__generic__copy( getDisp_tail_mat(), disp_tail_mat);
		}
	}

	/**
	 * Get method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of rest-position, parent, and local transform. </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getConstinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 568, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'constinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Inverse result of constraints. doesn't include effect of rest-position, parent, and local transform. </p>
	 * @see #__DNA__FIELD__constinv
	 */
	
	public void setConstinv(CArrayFacade<CArrayFacade<Float>> constinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 568;
		} else {
			__dna__offset = 508;
		}
		if (__io__equals(constinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, constinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, constinv);
		} else {
			__io__generic__copy( getConstinv(), constinv);
		}
	}

	/**
	 * Get method for struct member 'pose_head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Actually pose_mat[3]. </p>
	 * @see #__DNA__FIELD__pose_head
	 */
	
	public CArrayFacade<Float> getPose_head() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 572, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_head'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Actually pose_mat[3]. </p>
	 * @see #__DNA__FIELD__pose_head
	 */
	
	public void setPose_head(CArrayFacade<Float> pose_head) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 632;
		} else {
			__dna__offset = 572;
		}
		if (__io__equals(pose_head, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pose_head)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pose_head);
		} else {
			__io__generic__copy( getPose_head(), pose_head);
		}
	}

	/**
	 * Get method for struct member 'pose_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Also used for drawing help lines. </p>
	 * @see #__DNA__FIELD__pose_tail
	 */
	
	public CArrayFacade<Float> getPose_tail() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 644, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_tail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Also used for drawing help lines. </p>
	 * @see #__DNA__FIELD__pose_tail
	 */
	
	public void setPose_tail(CArrayFacade<Float> pose_tail) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 644;
		} else {
			__dna__offset = 584;
		}
		if (__io__equals(pose_tail, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pose_tail)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pose_tail);
		} else {
			__io__generic__copy( getPose_tail(), pose_tail);
		}
	}

	/**
	 * Get method for struct member 'limitmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF constraint, note! - these are stored in degrees, not radians. </p>
	 * @see #__DNA__FIELD__limitmin
	 */
	
	public CArrayFacade<Float> getLimitmin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 596, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'limitmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF constraint, note! - these are stored in degrees, not radians. </p>
	 * @see #__DNA__FIELD__limitmin
	 */
	
	public void setLimitmin(CArrayFacade<Float> limitmin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 656;
		} else {
			__dna__offset = 596;
		}
		if (__io__equals(limitmin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, limitmin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, limitmin);
		} else {
			__io__generic__copy( getLimitmin(), limitmin);
		}
	}

	/**
	 * Get method for struct member 'limitmax'.
	 * @see #__DNA__FIELD__limitmax
	 */
	
	public CArrayFacade<Float> getLimitmax() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 668, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 608, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'limitmax'.
	 * @see #__DNA__FIELD__limitmax
	 */
	
	public void setLimitmax(CArrayFacade<Float> limitmax) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 668;
		} else {
			__dna__offset = 608;
		}
		if (__io__equals(limitmax, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, limitmax)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, limitmax);
		} else {
			__io__generic__copy( getLimitmax(), limitmax);
		}
	}

	/**
	 * Get method for struct member 'stiffness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF stiffness. </p>
	 * @see #__DNA__FIELD__stiffness
	 */
	
	public CArrayFacade<Float> getStiffness() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 680, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stiffness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> DOF stiffness. </p>
	 * @see #__DNA__FIELD__stiffness
	 */
	
	public void setStiffness(CArrayFacade<Float> stiffness) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 680;
		} else {
			__dna__offset = 620;
		}
		if (__io__equals(stiffness, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stiffness)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stiffness);
		} else {
			__io__generic__copy( getStiffness(), stiffness);
		}
	}

	/**
	 * Get method for struct member 'ikstretch'.
	 * @see #__DNA__FIELD__ikstretch
	 */
	
	public float getIkstretch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 692);
		} else {
			return __io__block.readFloat(__io__address + 632);
		}
	}

	/**
	 * Set method for struct member 'ikstretch'.
	 * @see #__DNA__FIELD__ikstretch
	 */
	
	public void setIkstretch(float ikstretch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 692, ikstretch);
		} else {
			__io__block.writeFloat(__io__address + 632, ikstretch);
		}
	}

	/**
	 * Get method for struct member 'ikrotweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint rotation constraint. </p>
	 * @see #__DNA__FIELD__ikrotweight
	 */
	
	public float getIkrotweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 696);
		} else {
			return __io__block.readFloat(__io__address + 636);
		}
	}

	/**
	 * Set method for struct member 'ikrotweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint rotation constraint. </p>
	 * @see #__DNA__FIELD__ikrotweight
	 */
	
	public void setIkrotweight(float ikrotweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 696, ikrotweight);
		} else {
			__io__block.writeFloat(__io__address + 636, ikrotweight);
		}
	}

	/**
	 * Get method for struct member 'iklinweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint stretch constraint. </p>
	 * @see #__DNA__FIELD__iklinweight
	 */
	
	public float getIklinweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 700);
		} else {
			return __io__block.readFloat(__io__address + 640);
		}
	}

	/**
	 * Set method for struct member 'iklinweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Weight of joint stretch constraint. </p>
	 * @see #__DNA__FIELD__iklinweight
	 */
	
	public void setIklinweight(float iklinweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 700, iklinweight);
		} else {
			__io__block.writeFloat(__io__address + 640, iklinweight);
		}
	}

	/**
	 * Get method for struct member 'roll1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Curved bones settings - these are for animating, and are applied on top of the copies in pchan->bone </p>
	 * @see #__DNA__FIELD__roll1
	 */
	
	public float getRoll1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 704);
		} else {
			return __io__block.readFloat(__io__address + 644);
		}
	}

	/**
	 * Set method for struct member 'roll1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Curved bones settings - these are for animating, and are applied on top of the copies in pchan->bone </p>
	 * @see #__DNA__FIELD__roll1
	 */
	
	public void setRoll1(float roll1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 704, roll1);
		} else {
			__io__block.writeFloat(__io__address + 644, roll1);
		}
	}

	/**
	 * Get method for struct member 'roll2'.
	 * @see #__DNA__FIELD__roll2
	 */
	
	public float getRoll2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 708);
		} else {
			return __io__block.readFloat(__io__address + 648);
		}
	}

	/**
	 * Set method for struct member 'roll2'.
	 * @see #__DNA__FIELD__roll2
	 */
	
	public void setRoll2(float roll2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 708, roll2);
		} else {
			__io__block.writeFloat(__io__address + 648, roll2);
		}
	}

	/**
	 * Get method for struct member 'curveInX'.
	 * @see #__DNA__FIELD__curveInX
	 */
	
	public float getCurveInX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 712);
		} else {
			return __io__block.readFloat(__io__address + 652);
		}
	}

	/**
	 * Set method for struct member 'curveInX'.
	 * @see #__DNA__FIELD__curveInX
	 */
	
	public void setCurveInX(float curveInX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 712, curveInX);
		} else {
			__io__block.writeFloat(__io__address + 652, curveInX);
		}
	}

	/**
	 * Get method for struct member 'curveInY'.
	 * @see #__DNA__FIELD__curveInY
	 */
	
	public float getCurveInY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 716);
		} else {
			return __io__block.readFloat(__io__address + 656);
		}
	}

	/**
	 * Set method for struct member 'curveInY'.
	 * @see #__DNA__FIELD__curveInY
	 */
	
	public void setCurveInY(float curveInY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 716, curveInY);
		} else {
			__io__block.writeFloat(__io__address + 656, curveInY);
		}
	}

	/**
	 * Get method for struct member 'curveOutX'.
	 * @see #__DNA__FIELD__curveOutX
	 */
	
	public float getCurveOutX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 720);
		} else {
			return __io__block.readFloat(__io__address + 660);
		}
	}

	/**
	 * Set method for struct member 'curveOutX'.
	 * @see #__DNA__FIELD__curveOutX
	 */
	
	public void setCurveOutX(float curveOutX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 720, curveOutX);
		} else {
			__io__block.writeFloat(__io__address + 660, curveOutX);
		}
	}

	/**
	 * Get method for struct member 'curveOutY'.
	 * @see #__DNA__FIELD__curveOutY
	 */
	
	public float getCurveOutY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 724);
		} else {
			return __io__block.readFloat(__io__address + 664);
		}
	}

	/**
	 * Set method for struct member 'curveOutY'.
	 * @see #__DNA__FIELD__curveOutY
	 */
	
	public void setCurveOutY(float curveOutY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 724, curveOutY);
		} else {
			__io__block.writeFloat(__io__address + 664, curveOutY);
		}
	}

	/**
	 * Get method for struct member 'ease1'.
	 * @see #__DNA__FIELD__ease1
	 */
	
	public float getEase1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 728);
		} else {
			return __io__block.readFloat(__io__address + 668);
		}
	}

	/**
	 * Set method for struct member 'ease1'.
	 * @see #__DNA__FIELD__ease1
	 */
	
	public void setEase1(float ease1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 728, ease1);
		} else {
			__io__block.writeFloat(__io__address + 668, ease1);
		}
	}

	/**
	 * Get method for struct member 'ease2'.
	 * @see #__DNA__FIELD__ease2
	 */
	
	public float getEase2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 732);
		} else {
			return __io__block.readFloat(__io__address + 672);
		}
	}

	/**
	 * Set method for struct member 'ease2'.
	 * @see #__DNA__FIELD__ease2
	 */
	
	public void setEase2(float ease2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 732, ease2);
		} else {
			__io__block.writeFloat(__io__address + 672, ease2);
		}
	}

	/**
	 * Get method for struct member 'scaleIn'.
	 * @see #__DNA__FIELD__scaleIn
	 */
	
	public float getScaleIn() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 736);
		} else {
			return __io__block.readFloat(__io__address + 676);
		}
	}

	/**
	 * Set method for struct member 'scaleIn'.
	 * @see #__DNA__FIELD__scaleIn
	 */
	
	public void setScaleIn(float scaleIn) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 736, scaleIn);
		} else {
			__io__block.writeFloat(__io__address + 676, scaleIn);
		}
	}

	/**
	 * Get method for struct member 'scale_in_y'.
	 * @see #__DNA__FIELD__scale_in_y
	 */
	
	public float getScale_in_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 740);
		} else {
			return __io__block.readFloat(__io__address + 680);
		}
	}

	/**
	 * Set method for struct member 'scale_in_y'.
	 * @see #__DNA__FIELD__scale_in_y
	 */
	
	public void setScale_in_y(float scale_in_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 740, scale_in_y);
		} else {
			__io__block.writeFloat(__io__address + 680, scale_in_y);
		}
	}

	/**
	 * Get method for struct member 'scaleOut'.
	 * @see #__DNA__FIELD__scaleOut
	 */
	
	public float getScaleOut() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 744);
		} else {
			return __io__block.readFloat(__io__address + 684);
		}
	}

	/**
	 * Set method for struct member 'scaleOut'.
	 * @see #__DNA__FIELD__scaleOut
	 */
	
	public void setScaleOut(float scaleOut) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 744, scaleOut);
		} else {
			__io__block.writeFloat(__io__address + 684, scaleOut);
		}
	}

	/**
	 * Get method for struct member 'scale_out_y'.
	 * @see #__DNA__FIELD__scale_out_y
	 */
	
	public float getScale_out_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 748);
		} else {
			return __io__block.readFloat(__io__address + 688);
		}
	}

	/**
	 * Set method for struct member 'scale_out_y'.
	 * @see #__DNA__FIELD__scale_out_y
	 */
	
	public void setScale_out_y(float scale_out_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 748, scale_out_y);
		} else {
			__io__block.writeFloat(__io__address + 688, scale_out_y);
		}
	}

	/**
	 * Get method for struct member 'scale_in'.
	 * @see #__DNA__FIELD__scale_in
	 */
	
	public CArrayFacade<Float> getScale_in() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 752, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 692, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale_in'.
	 * @see #__DNA__FIELD__scale_in
	 */
	
	public void setScale_in(CArrayFacade<Float> scale_in) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 752;
		} else {
			__dna__offset = 692;
		}
		if (__io__equals(scale_in, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale_in)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale_in);
		} else {
			__io__generic__copy( getScale_in(), scale_in);
		}
	}

	/**
	 * Get method for struct member 'scale_out'.
	 * @see #__DNA__FIELD__scale_out
	 */
	
	public CArrayFacade<Float> getScale_out() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 764, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 704, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale_out'.
	 * @see #__DNA__FIELD__scale_out
	 */
	
	public void setScale_out(CArrayFacade<Float> scale_out) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 764;
		} else {
			__dna__offset = 704;
		}
		if (__io__equals(scale_out, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale_out)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale_out);
		} else {
			__io__generic__copy( getScale_out(), scale_out);
		}
	}

	/**
	 * Get method for struct member 'bbone_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> B-Bone custom handles; set on read file or rebuild pose based on pchan->bone data. </p>
	 * @see #__DNA__FIELD__bbone_prev
	 */
	
	public CPointer<bPoseChannel> getBbone_prev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 776);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 716);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> B-Bone custom handles; set on read file or rebuild pose based on pchan->bone data. </p>
	 * @see #__DNA__FIELD__bbone_prev
	 */
	
	public void setBbone_prev(CPointer<bPoseChannel> bbone_prev) throws IOException
	{
		long __address = ((bbone_prev == null) ? 0 : bbone_prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 776, __address);
		} else {
			__io__block.writeLong(__io__address + 716, __address);
		}
	}

	/**
	 * Get method for struct member 'bbone_next'.
	 * @see #__DNA__FIELD__bbone_next
	 */
	
	public CPointer<bPoseChannel> getBbone_next() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 784);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 720);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_next'.
	 * @see #__DNA__FIELD__bbone_next
	 */
	
	public void setBbone_next(CPointer<bPoseChannel> bbone_next) throws IOException
	{
		long __address = ((bbone_next == null) ? 0 : bbone_next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 784, __address);
		} else {
			__io__block.writeLong(__io__address + 720, __address);
		}
	}

	/**
	 * Get method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for outliner. </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public CPointer<Object> getTemp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 792);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 724);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for outliner. </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public void setTemp(CPointer<Object> temp) throws IOException
	{
		long __address = ((temp == null) ? 0 : temp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 792, __address);
		} else {
			__io__block.writeLong(__io__address + 724, __address);
		}
	}

	/**
	 * Get method for struct member 'draw_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for color and bbone segment matrix. </p>
	 * @see #__DNA__FIELD__draw_data
	 */
	
	public CPointer<Object> getDraw_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 800);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 728);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'draw_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for color and bbone segment matrix. </p>
	 * @see #__DNA__FIELD__draw_data
	 */
	
	public void setDraw_data(CPointer<Object> draw_data) throws IOException
	{
		long __address = ((draw_data == null) ? 0 : draw_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 800, __address);
		} else {
			__io__block.writeLong(__io__address + 728, __address);
		}
	}

	/**
	 * Get method for struct member 'orig_pchan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Points to an original pose channel. </p>
	 * @see #__DNA__FIELD__orig_pchan
	 */
	
	public CPointer<bPoseChannel> getOrig_pchan() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 808);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 732);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bPoseChannel.class};
		return new CPointer<bPoseChannel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bPoseChannel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'orig_pchan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Points to an original pose channel. </p>
	 * @see #__DNA__FIELD__orig_pchan
	 */
	
	public void setOrig_pchan(CPointer<bPoseChannel> orig_pchan) throws IOException
	{
		long __address = ((orig_pchan == null) ? 0 : orig_pchan.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 808, __address);
		} else {
			__io__block.writeLong(__io__address + 732, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bPoseChannel_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bPoseChannel_Runtime(__io__address + 816, __io__block, __io__blockTable);
		} else {
			return new bPoseChannel_Runtime(__io__address + 736, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bPoseChannel_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 816;
		} else {
			__dna__offset = 736;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bPoseChannel> __io__addressof() {
		return new CPointer<bPoseChannel>(__io__address, new Class[]{bPoseChannel.class}, __io__block, __io__blockTable);
	}

}
