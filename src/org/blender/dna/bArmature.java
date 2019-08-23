package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bArmature'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=200, size64=256)
public class bArmature extends CFacade {

	/**
	 * This is the sdna index of the struct bArmature.
	 * <p>
	 * It is required when allocating a new block to store data for bArmature.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 339;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__id);
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
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'bonebase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__bonebase);
	 * CPointer&lt;ListBase&gt; p_bonebase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bonebase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bonebase = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'chainbase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__chainbase);
	 * CPointer&lt;ListBase&gt; p_chainbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chainbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chainbase = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> editbone listbase, we use pointer so we can check state </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__edbo);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_edbo = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edbo'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edbo = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) active bone </p></li></ul> 
	 * active and selection are unrelatedactive & hidden is not allowedfrom the user perspective active == last selectedactive should be ignored when not visible (hidden layer) active bone 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__act_bone);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_act_bone = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_bone'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_bone = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active editbone (in editmode) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__act_edbone);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_act_edbone = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_edbone'</li>
	 * <li>Signature: 'EditBone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_edbone = new long[]{128, 176};

	/**
	 * Field descriptor (offset) for struct member 'sketch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sketch struct for etch-a-ton </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__sketch);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sketch = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sketch'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sketch = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member 'drawtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__drawtype);
	 * CPointer&lt;Integer&gt; p_drawtype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawtype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawtype = new long[]{140, 196};

	/**
	 * Field descriptor (offset) for struct member 'gevertdeformer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how vertex deformation is handled in the ge </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__gevertdeformer);
	 * CPointer&lt;Integer&gt; p_gevertdeformer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gevertdeformer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gevertdeformer = new long[]{144, 200};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{148, 204};

	/**
	 * Field descriptor (offset) for struct member 'deformflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__deformflag);
	 * CPointer&lt;Short&gt; p_deformflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deformflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deformflag = new long[]{152, 208};

	/**
	 * Field descriptor (offset) for struct member 'pathflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathflag);
	 * CPointer&lt;Short&gt; p_pathflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathflag = new long[]{154, 210};

	/**
	 * Field descriptor (offset) for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for UI, to show which layers are there </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer_used);
	 * CPointer&lt;Integer&gt; p_layer_used = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_used'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_used = new long[]{156, 212};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer);
	 * CPointer&lt;Integer&gt; p_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{160, 216};

	/**
	 * Field descriptor (offset) for struct member 'layer_protected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons to work, both variables in this order together </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer_protected);
	 * CPointer&lt;Integer&gt; p_layer_protected = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_protected'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_protected = new long[]{164, 220};

	/**
	 * Field descriptor (offset) for struct member 'ghostep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated... old animaton system (armature only viz) <mdash/> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__ghostep);
	 * CPointer&lt;Short&gt; p_ghostep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostep = new long[]{168, 224};

	/**
	 * Field descriptor (offset) for struct member 'ghostsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames to ghosts to show, and step between them </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__ghostsize);
	 * CPointer&lt;Short&gt; p_ghostsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostsize = new long[]{170, 226};

	/**
	 * Field descriptor (offset) for struct member 'ghosttype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__ghosttype);
	 * CPointer&lt;Short&gt; p_ghosttype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghosttype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghosttype = new long[]{172, 228};

	/**
	 * Field descriptor (offset) for struct member 'pathsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ghost drawing options and number of frames between points of path </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathsize);
	 * CPointer&lt;Short&gt; p_pathsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathsize = new long[]{174, 230};

	/**
	 * Field descriptor (offset) for struct member 'ghostsf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__ghostsf);
	 * CPointer&lt;Integer&gt; p_ghostsf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostsf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostsf = new long[]{176, 232};

	/**
	 * Field descriptor (offset) for struct member 'ghostef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__ghostef);
	 * CPointer&lt;Integer&gt; p_ghostef = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostef'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostef = new long[]{180, 236};

	/**
	 * Field descriptor (offset) for struct member 'pathsf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathsf);
	 * CPointer&lt;Integer&gt; p_pathsf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathsf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathsf = new long[]{184, 240};

	/**
	 * Field descriptor (offset) for struct member 'pathef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range for all bones </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathef);
	 * CPointer&lt;Integer&gt; p_pathef = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathef'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathef = new long[]{188, 244};

	/**
	 * Field descriptor (offset) for struct member 'pathbc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathbc);
	 * CPointer&lt;Integer&gt; p_pathbc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathbc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathbc = new long[]{192, 248};

	/**
	 * Field descriptor (offset) for struct member 'pathac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame of path-calculation for all bones </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathac);
	 * CPointer&lt;Integer&gt; p_pathac = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathac'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathac = new long[]{196, 252};

	public bArmature(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bArmature(bArmature that) {
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
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
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
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'bonebase'.
	 * @see #__DNA__FIELD__bonebase
	 */
	
	public ListBase getBonebase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 104, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bonebase'.
	 * @see #__DNA__FIELD__bonebase
	 */
	
	public void setBonebase(ListBase bonebase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(bonebase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bonebase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bonebase);
		} else {
			__io__generic__copy( getBonebase(), bonebase);
		}
	}

	/**
	 * Get method for struct member 'chainbase'.
	 * @see #__DNA__FIELD__chainbase
	 */
	
	public ListBase getChainbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'chainbase'.
	 * @see #__DNA__FIELD__chainbase
	 */
	
	public void setChainbase(ListBase chainbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(chainbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, chainbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, chainbase);
		} else {
			__io__generic__copy( getChainbase(), chainbase);
		}
	}

	/**
	 * Get method for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> editbone listbase, we use pointer so we can check state </p>
	 * @see #__DNA__FIELD__edbo
	 */
	
	public CPointer<ListBase> getEdbo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> editbone listbase, we use pointer so we can check state </p>
	 * @see #__DNA__FIELD__edbo
	 */
	
	public void setEdbo(CPointer<ListBase> edbo) throws IOException
	{
		long __address = ((edbo == null) ? 0 : edbo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) active bone </p></li></ul> 
	 * active and selection are unrelatedactive & hidden is not allowedfrom the user perspective active == last selectedactive should be ignored when not visible (hidden layer) active bone 
	 * </p>
	 * @see #__DNA__FIELD__act_bone
	 */
	
	public CPointer<Bone> getAct_bone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) active bone </p></li></ul> 
	 * active and selection are unrelatedactive & hidden is not allowedfrom the user perspective active == last selectedactive should be ignored when not visible (hidden layer) active bone 
	 * </p>
	 * @see #__DNA__FIELD__act_bone
	 */
	
	public void setAct_bone(CPointer<Bone> act_bone) throws IOException
	{
		long __address = ((act_bone == null) ? 0 : act_bone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active editbone (in editmode) </p>
	 * @see #__DNA__FIELD__act_edbone
	 */
	
	public CPointer<Object> getAct_edbone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active editbone (in editmode) </p>
	 * @see #__DNA__FIELD__act_edbone
	 */
	
	public void setAct_edbone(CPointer<Object> act_edbone) throws IOException
	{
		long __address = ((act_edbone == null) ? 0 : act_edbone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'sketch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sketch struct for etch-a-ton </p>
	 * @see #__DNA__FIELD__sketch
	 */
	
	public CPointer<Object> getSketch() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sketch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sketch struct for etch-a-ton </p>
	 * @see #__DNA__FIELD__sketch
	 */
	
	public void setSketch(CPointer<Object> sketch) throws IOException
	{
		long __address = ((sketch == null) ? 0 : sketch.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, flag);
		} else {
			__io__block.writeInt(__io__address + 136, flag);
		}
	}

	/**
	 * Get method for struct member 'drawtype'.
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public int getDrawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 196);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'drawtype'.
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public void setDrawtype(int drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 196, drawtype);
		} else {
			__io__block.writeInt(__io__address + 140, drawtype);
		}
	}

	/**
	 * Get method for struct member 'gevertdeformer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how vertex deformation is handled in the ge </p>
	 * @see #__DNA__FIELD__gevertdeformer
	 */
	
	public int getGevertdeformer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'gevertdeformer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how vertex deformation is handled in the ge </p>
	 * @see #__DNA__FIELD__gevertdeformer
	 */
	
	public void setGevertdeformer(int gevertdeformer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, gevertdeformer);
		} else {
			__io__block.writeInt(__io__address + 144, gevertdeformer);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, pad);
		} else {
			__io__block.writeInt(__io__address + 148, pad);
		}
	}

	/**
	 * Get method for struct member 'deformflag'.
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public short getDeformflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'deformflag'.
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public void setDeformflag(short deformflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, deformflag);
		} else {
			__io__block.writeShort(__io__address + 152, deformflag);
		}
	}

	/**
	 * Get method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public short getPathflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public void setPathflag(short pathflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, pathflag);
		} else {
			__io__block.writeShort(__io__address + 154, pathflag);
		}
	}

	/**
	 * Get method for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for UI, to show which layers are there </p>
	 * @see #__DNA__FIELD__layer_used
	 */
	
	public int getLayer_used() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 212);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for UI, to show which layers are there </p>
	 * @see #__DNA__FIELD__layer_used
	 */
	
	public void setLayer_used(int layer_used) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 212, layer_used);
		} else {
			__io__block.writeInt(__io__address + 156, layer_used);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public int getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(int layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, layer);
		} else {
			__io__block.writeInt(__io__address + 160, layer);
		}
	}

	/**
	 * Get method for struct member 'layer_protected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons to work, both variables in this order together </p>
	 * @see #__DNA__FIELD__layer_protected
	 */
	
	public int getLayer_protected() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'layer_protected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons to work, both variables in this order together </p>
	 * @see #__DNA__FIELD__layer_protected
	 */
	
	public void setLayer_protected(int layer_protected) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, layer_protected);
		} else {
			__io__block.writeInt(__io__address + 164, layer_protected);
		}
	}

	/**
	 * Get method for struct member 'ghostep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated... old animaton system (armature only viz) <mdash/> . </p>
	 * @see #__DNA__FIELD__ghostep
	 */
	
	public short getGhostep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'ghostep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX deprecated... old animaton system (armature only viz) <mdash/> . </p>
	 * @see #__DNA__FIELD__ghostep
	 */
	
	public void setGhostep(short ghostep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, ghostep);
		} else {
			__io__block.writeShort(__io__address + 168, ghostep);
		}
	}

	/**
	 * Get method for struct member 'ghostsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames to ghosts to show, and step between them </p>
	 * @see #__DNA__FIELD__ghostsize
	 */
	
	public short getGhostsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'ghostsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames to ghosts to show, and step between them </p>
	 * @see #__DNA__FIELD__ghostsize
	 */
	
	public void setGhostsize(short ghostsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, ghostsize);
		} else {
			__io__block.writeShort(__io__address + 170, ghostsize);
		}
	}

	/**
	 * Get method for struct member 'ghosttype'.
	 * @see #__DNA__FIELD__ghosttype
	 */
	
	public short getGhosttype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'ghosttype'.
	 * @see #__DNA__FIELD__ghosttype
	 */
	
	public void setGhosttype(short ghosttype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, ghosttype);
		} else {
			__io__block.writeShort(__io__address + 172, ghosttype);
		}
	}

	/**
	 * Get method for struct member 'pathsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ghost drawing options and number of frames between points of path </p>
	 * @see #__DNA__FIELD__pathsize
	 */
	
	public short getPathsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'pathsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ghost drawing options and number of frames between points of path </p>
	 * @see #__DNA__FIELD__pathsize
	 */
	
	public void setPathsize(short pathsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, pathsize);
		} else {
			__io__block.writeShort(__io__address + 174, pathsize);
		}
	}

	/**
	 * Get method for struct member 'ghostsf'.
	 * @see #__DNA__FIELD__ghostsf
	 */
	
	public int getGhostsf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'ghostsf'.
	 * @see #__DNA__FIELD__ghostsf
	 */
	
	public void setGhostsf(int ghostsf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, ghostsf);
		} else {
			__io__block.writeInt(__io__address + 176, ghostsf);
		}
	}

	/**
	 * Get method for struct member 'ghostef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range </p>
	 * @see #__DNA__FIELD__ghostef
	 */
	
	public int getGhostef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'ghostef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range </p>
	 * @see #__DNA__FIELD__ghostef
	 */
	
	public void setGhostef(int ghostef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, ghostef);
		} else {
			__io__block.writeInt(__io__address + 180, ghostef);
		}
	}

	/**
	 * Get method for struct member 'pathsf'.
	 * @see #__DNA__FIELD__pathsf
	 */
	
	public int getPathsf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'pathsf'.
	 * @see #__DNA__FIELD__pathsf
	 */
	
	public void setPathsf(int pathsf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, pathsf);
		} else {
			__io__block.writeInt(__io__address + 184, pathsf);
		}
	}

	/**
	 * Get method for struct member 'pathef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range for all bones </p>
	 * @see #__DNA__FIELD__pathef
	 */
	
	public int getPathef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'pathef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range for all bones </p>
	 * @see #__DNA__FIELD__pathef
	 */
	
	public void setPathef(int pathef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, pathef);
		} else {
			__io__block.writeInt(__io__address + 188, pathef);
		}
	}

	/**
	 * Get method for struct member 'pathbc'.
	 * @see #__DNA__FIELD__pathbc
	 */
	
	public int getPathbc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'pathbc'.
	 * @see #__DNA__FIELD__pathbc
	 */
	
	public void setPathbc(int pathbc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, pathbc);
		} else {
			__io__block.writeInt(__io__address + 192, pathbc);
		}
	}

	/**
	 * Get method for struct member 'pathac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame of path-calculation for all bones </p>
	 * @see #__DNA__FIELD__pathac
	 */
	
	public int getPathac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'pathac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame of path-calculation for all bones </p>
	 * @see #__DNA__FIELD__pathac
	 */
	
	public void setPathac(int pathac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, pathac);
		} else {
			__io__block.writeInt(__io__address + 196, pathac);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bArmature> __io__addressof() {
		return new CPointer<bArmature>(__io__address, new Class[]{bArmature.class}, __io__block, __io__blockTable);
	}

}
