package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SoftBody'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=444, size64=480)
public class SoftBody extends CFacade {

	/**
	 * This is the sdna index of the struct SoftBody.
	 * <p>
	 * It is required when allocating a new block to store data for SoftBody.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 163;

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__totpoint);
	 * CPointer&lt;Integer&gt; p_totpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totspring'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__totspring);
	 * CPointer&lt;Integer&gt; p_totspring = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totspring'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totspring = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'bpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__bpoint);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bpoint = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bpoint'</li>
	 * <li>Signature: 'BodyPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bpoint = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'bspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__bspring);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bspring = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bspring'</li>
	 * <li>Signature: 'BodySpring*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bspring = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'msg_lock'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__msg_lock);
	 * CPointer&lt;Byte&gt; p_msg_lock = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'msg_lock'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__msg_lock = new long[]{17, 25};

	/**
	 * Field descriptor (offset) for struct member 'msg_value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__msg_value);
	 * CPointer&lt;Short&gt; p_msg_value = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'msg_value'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__msg_value = new long[]{18, 26};

	/**
	 * Field descriptor (offset) for struct member 'nodemass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__nodemass);
	 * CPointer&lt;Float&gt; p_nodemass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodemass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodemass = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'namedVG_Mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__namedVG_Mass);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_namedVG_Mass = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'namedVG_Mass'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__namedVG_Mass = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'grav'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce mass painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 softbody amount of gravitaion to apply </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__grav);
	 * CPointer&lt;Float&gt; p_grav = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grav'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grav = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'mediafrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction to env </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__mediafrict);
	 * CPointer&lt;Float&gt; p_mediafrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mediafrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mediafrict = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'rklimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> error limit for ODE solver </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__rklimit);
	 * CPointer&lt;Float&gt; p_rklimit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rklimit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rklimit = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'physics_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user control over simulation speed </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__physics_speed);
	 * CPointer&lt;Float&gt; p_physics_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physics_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physics_speed = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'goalspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> goal softbody goal springs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__goalspring);
	 * CPointer&lt;Float&gt; p_goalspring = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'goalspring'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__goalspring = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'goalfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody goal springs friction </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__goalfrict);
	 * CPointer&lt;Float&gt; p_goalfrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'goalfrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__goalfrict = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'mingoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> quick limits for goal </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__mingoal);
	 * CPointer&lt;Float&gt; p_mingoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mingoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mingoal = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member 'maxgoal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__maxgoal);
	 * CPointer&lt;Float&gt; p_maxgoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxgoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxgoal = new long[]{116, 124};

	/**
	 * Field descriptor (offset) for struct member 'defgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default goal for vertices without vgroup </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__defgoal);
	 * CPointer&lt;Float&gt; p_defgoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgoal = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'vertgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index starting at 1 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__vertgroup);
	 * CPointer&lt;Short&gt; p_vertgroup = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertgroup'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertgroup = new long[]{124, 132};

	/**
	 * Field descriptor (offset) for struct member 'namedVG_Softgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__namedVG_Softgoal);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_namedVG_Softgoal = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'namedVG_Softgoal'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__namedVG_Softgoal = new long[]{126, 134};

	/**
	 * Field descriptor (offset) for struct member 'fuzzyness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__fuzzyness);
	 * CPointer&lt;Short&gt; p_fuzzyness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fuzzyness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fuzzyness = new long[]{190, 198};

	/**
	 * Field descriptor (offset) for struct member 'inspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> springs softbody inner springs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__inspring);
	 * CPointer&lt;Float&gt; p_inspring = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inspring'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inspring = new long[]{192, 200};

	/**
	 * Field descriptor (offset) for struct member 'infrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody inner springs friction </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__infrict);
	 * CPointer&lt;Float&gt; p_infrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'infrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__infrict = new long[]{196, 204};

	/**
	 * Field descriptor (offset) for struct member 'namedVG_Spring_K'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__namedVG_Spring_K);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_namedVG_Spring_K = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'namedVG_Spring_K'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__namedVG_Spring_K = new long[]{200, 208};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce Spring_K painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 baking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{264, 272};

	/**
	 * Field descriptor (offset) for struct member 'efra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__efra);
	 * CPointer&lt;Integer&gt; p_efra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'efra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__efra = new long[]{268, 276};

	/**
	 * Field descriptor (offset) for struct member 'interval'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__interval);
	 * CPointer&lt;Integer&gt; p_interval = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interval'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interval = new long[]{272, 280};

	/**
	 * Field descriptor (offset) for struct member 'local'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__local);
	 * CPointer&lt;Short&gt; p_local = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'local'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__local = new long[]{276, 284};

	/**
	 * Field descriptor (offset) for struct member 'solverflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> local==1: use local coords for baking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__solverflags);
	 * CPointer&lt;Short&gt; p_solverflags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solverflags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solverflags = new long[]{278, 286};

	/**
	 * Field descriptor (offset) for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  these must be kept for backwards compatibility <ndash/>  array of size totpointkey </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__keys);
	 * CPointer&lt;CPointer&lt;CPointer&lt;SBVertex&gt;&gt;&gt; p_keys = p.cast(new Class[]{CPointer.class, CPointer.class, SBVertex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keys'</li>
	 * <li>Signature: 'SBVertex**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keys = new long[]{280, 288};

	/**
	 * Field descriptor (offset) for struct member 'totpointkey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__totpointkey);
	 * CPointer&lt;Integer&gt; p_totpointkey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpointkey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpointkey = new long[]{284, 296};

	/**
	 * Field descriptor (offset) for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if totpointkey != totpoint or totkey!- (efra-sfra)/interval -> free keys </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__totkey);
	 * CPointer&lt;Integer&gt; p_totkey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totkey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totkey = new long[]{288, 300};

	/**
	 * Field descriptor (offset) for struct member 'secondspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><hr/> 
	 *  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__secondspring);
	 * CPointer&lt;Float&gt; p_secondspring = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'secondspring'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__secondspring = new long[]{292, 304};

	/**
	 * Field descriptor (offset) for struct member 'colball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> self collision fixed collision ball size if > 0 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__colball);
	 * CPointer&lt;Float&gt; p_colball = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colball'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colball = new long[]{296, 308};

	/**
	 * Field descriptor (offset) for struct member 'balldamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cooling down collision response </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__balldamp);
	 * CPointer&lt;Float&gt; p_balldamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'balldamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__balldamp = new long[]{300, 312};

	/**
	 * Field descriptor (offset) for struct member 'ballstiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pressure the ball is loaded with </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__ballstiff);
	 * CPointer&lt;Float&gt; p_ballstiff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ballstiff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ballstiff = new long[]{304, 316};

	/**
	 * Field descriptor (offset) for struct member 'sbc_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__sbc_mode);
	 * CPointer&lt;Short&gt; p_sbc_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbc_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbc_mode = new long[]{308, 320};

	/**
	 * Field descriptor (offset) for struct member 'aeroedge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__aeroedge);
	 * CPointer&lt;Short&gt; p_aeroedge = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aeroedge'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aeroedge = new long[]{310, 322};

	/**
	 * Field descriptor (offset) for struct member 'minloops'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__minloops);
	 * CPointer&lt;Short&gt; p_minloops = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minloops'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minloops = new long[]{312, 324};

	/**
	 * Field descriptor (offset) for struct member 'maxloops'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__maxloops);
	 * CPointer&lt;Short&gt; p_maxloops = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxloops'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxloops = new long[]{314, 326};

	/**
	 * Field descriptor (offset) for struct member 'choke'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__choke);
	 * CPointer&lt;Short&gt; p_choke = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'choke'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__choke = new long[]{316, 328};

	/**
	 * Field descriptor (offset) for struct member 'solver_ID'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__solver_ID);
	 * CPointer&lt;Short&gt; p_solver_ID = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver_ID'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver_ID = new long[]{318, 330};

	/**
	 * Field descriptor (offset) for struct member 'plastic'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__plastic);
	 * CPointer&lt;Short&gt; p_plastic = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plastic'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plastic = new long[]{320, 332};

	/**
	 * Field descriptor (offset) for struct member 'springpreload'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__springpreload);
	 * CPointer&lt;Short&gt; p_springpreload = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'springpreload'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__springpreload = new long[]{322, 334};

	/**
	 * Field descriptor (offset) for struct member 'scratch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scratch pad/cache on live time not saved in file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__scratch);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_scratch = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scratch'</li>
	 * <li>Signature: 'SBScratch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scratch = new long[]{324, 336};

	/**
	 * Field descriptor (offset) for struct member 'shearstiff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__shearstiff);
	 * CPointer&lt;Float&gt; p_shearstiff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shearstiff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shearstiff = new long[]{328, 344};

	/**
	 * Field descriptor (offset) for struct member 'inpush'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__inpush);
	 * CPointer&lt;Float&gt; p_inpush = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inpush'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inpush = new long[]{332, 348};

	/**
	 * Field descriptor (offset) for struct member 'pointcache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__pointcache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_pointcache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointcache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointcache = new long[]{336, 352};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{340, 360};

	/**
	 * Field descriptor (offset) for struct member 'collision_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__collision_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_collision_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision_group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision_group = new long[]{348, 376};

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{352, 384};

	/**
	 * Field descriptor (offset) for struct member 'lcom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reverse esimated obmatrix .. no need to store in blend file .. how ever who cares </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__lcom);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lcom = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lcom'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lcom = new long[]{356, 392};

	/**
	 * Field descriptor (offset) for struct member 'lrot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__lrot);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_lrot = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lrot'</li>
	 * <li>Signature: 'float[3][3]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lrot = new long[]{368, 404};

	/**
	 * Field descriptor (offset) for struct member 'lscale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__lscale);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_lscale = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lscale'</li>
	 * <li>Signature: 'float[3][3]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lscale = new long[]{404, 440};

	/**
	 * Field descriptor (offset) for struct member 'last_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SoftBody softbody = ...;
	 * CPointer&lt;Object&gt; p = softbody.__dna__addressof(SoftBody.__DNA__FIELD__last_frame);
	 * CPointer&lt;Integer&gt; p_last_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_frame = new long[]{440, 476};

	public SoftBody(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SoftBody(SoftBody that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic data </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public int getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic data </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(int totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, totpoint);
		} else {
			__io__block.writeInt(__io__address + 0, totpoint);
		}
	}

	/**
	 * Get method for struct member 'totspring'.
	 * @see #__DNA__FIELD__totspring
	 */
	
	public int getTotspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totspring'.
	 * @see #__DNA__FIELD__totspring
	 */
	
	public void setTotspring(int totspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, totspring);
		} else {
			__io__block.writeInt(__io__address + 4, totspring);
		}
	}

	/**
	 * Get method for struct member 'bpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * @see #__DNA__FIELD__bpoint
	 */
	
	public CPointer<Object> getBpoint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * @see #__DNA__FIELD__bpoint
	 */
	
	public void setBpoint(CPointer<Object> bpoint) throws IOException
	{
		long __address = ((bpoint == null) ? 0 : bpoint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'bspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * @see #__DNA__FIELD__bspring
	 */
	
	public CPointer<Object> getBspring() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not saved in file </p>
	 * @see #__DNA__FIELD__bspring
	 */
	
	public void setBspring(CPointer<Object> bspring) throws IOException
	{
		long __address = ((bspring == null) ? 0 : bspring.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 24);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 24, pad);
		} else {
			__io__block.writeByte(__io__address + 16, pad);
		}
	}

	/**
	 * Get method for struct member 'msg_lock'.
	 * @see #__DNA__FIELD__msg_lock
	 */
	
	public byte getMsg_lock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 25);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'msg_lock'.
	 * @see #__DNA__FIELD__msg_lock
	 */
	
	public void setMsg_lock(byte msg_lock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 25, msg_lock);
		} else {
			__io__block.writeByte(__io__address + 17, msg_lock);
		}
	}

	/**
	 * Get method for struct member 'msg_value'.
	 * @see #__DNA__FIELD__msg_value
	 */
	
	public short getMsg_value() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'msg_value'.
	 * @see #__DNA__FIELD__msg_value
	 */
	
	public void setMsg_value(short msg_value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, msg_value);
		} else {
			__io__block.writeShort(__io__address + 18, msg_value);
		}
	}

	/**
	 * Get method for struct member 'nodemass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  </p>
	 * @see #__DNA__FIELD__nodemass
	 */
	
	public float getNodemass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'nodemass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><em></em>  </p>
	 * @see #__DNA__FIELD__nodemass
	 */
	
	public void setNodemass(float nodemass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, nodemass);
		} else {
			__io__block.writeFloat(__io__address + 20, nodemass);
		}
	}

	/**
	 * Get method for struct member 'namedVG_Mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Mass
	 */
	
	public CArrayFacade<Byte> getNamedVG_Mass() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'namedVG_Mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Mass
	 */
	
	public void setNamedVG_Mass(CArrayFacade<Byte> namedVG_Mass) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(namedVG_Mass, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, namedVG_Mass)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, namedVG_Mass);
		} else {
			__io__generic__copy( getNamedVG_Mass(), namedVG_Mass);
		}
	}

	/**
	 * Get method for struct member 'grav'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce mass painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 softbody amount of gravitaion to apply </p>
	 * @see #__DNA__FIELD__grav
	 */
	
	public float getGrav() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'grav'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce mass painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 softbody amount of gravitaion to apply </p>
	 * @see #__DNA__FIELD__grav
	 */
	
	public void setGrav(float grav) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, grav);
		} else {
			__io__block.writeFloat(__io__address + 88, grav);
		}
	}

	/**
	 * Get method for struct member 'mediafrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction to env </p>
	 * @see #__DNA__FIELD__mediafrict
	 */
	
	public float getMediafrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'mediafrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction to env </p>
	 * @see #__DNA__FIELD__mediafrict
	 */
	
	public void setMediafrict(float mediafrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, mediafrict);
		} else {
			__io__block.writeFloat(__io__address + 92, mediafrict);
		}
	}

	/**
	 * Get method for struct member 'rklimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> error limit for ODE solver </p>
	 * @see #__DNA__FIELD__rklimit
	 */
	
	public float getRklimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'rklimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> error limit for ODE solver </p>
	 * @see #__DNA__FIELD__rklimit
	 */
	
	public void setRklimit(float rklimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, rklimit);
		} else {
			__io__block.writeFloat(__io__address + 96, rklimit);
		}
	}

	/**
	 * Get method for struct member 'physics_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user control over simulation speed </p>
	 * @see #__DNA__FIELD__physics_speed
	 */
	
	public float getPhysics_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'physics_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user control over simulation speed </p>
	 * @see #__DNA__FIELD__physics_speed
	 */
	
	public void setPhysics_speed(float physics_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, physics_speed);
		} else {
			__io__block.writeFloat(__io__address + 100, physics_speed);
		}
	}

	/**
	 * Get method for struct member 'goalspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> goal softbody goal springs </p>
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public float getGoalspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'goalspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> goal softbody goal springs </p>
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public void setGoalspring(float goalspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, goalspring);
		} else {
			__io__block.writeFloat(__io__address + 104, goalspring);
		}
	}

	/**
	 * Get method for struct member 'goalfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody goal springs friction </p>
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public float getGoalfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'goalfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody goal springs friction </p>
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public void setGoalfrict(float goalfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, goalfrict);
		} else {
			__io__block.writeFloat(__io__address + 108, goalfrict);
		}
	}

	/**
	 * Get method for struct member 'mingoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> quick limits for goal </p>
	 * @see #__DNA__FIELD__mingoal
	 */
	
	public float getMingoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'mingoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> quick limits for goal </p>
	 * @see #__DNA__FIELD__mingoal
	 */
	
	public void setMingoal(float mingoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, mingoal);
		} else {
			__io__block.writeFloat(__io__address + 112, mingoal);
		}
	}

	/**
	 * Get method for struct member 'maxgoal'.
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public float getMaxgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'maxgoal'.
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public void setMaxgoal(float maxgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, maxgoal);
		} else {
			__io__block.writeFloat(__io__address + 116, maxgoal);
		}
	}

	/**
	 * Get method for struct member 'defgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default goal for vertices without vgroup </p>
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public float getDefgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'defgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default goal for vertices without vgroup </p>
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public void setDefgoal(float defgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, defgoal);
		} else {
			__io__block.writeFloat(__io__address + 120, defgoal);
		}
	}

	/**
	 * Get method for struct member 'vertgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index starting at 1 </p>
	 * @see #__DNA__FIELD__vertgroup
	 */
	
	public short getVertgroup() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'vertgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index starting at 1 </p>
	 * @see #__DNA__FIELD__vertgroup
	 */
	
	public void setVertgroup(short vertgroup) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, vertgroup);
		} else {
			__io__block.writeShort(__io__address + 124, vertgroup);
		}
	}

	/**
	 * Get method for struct member 'namedVG_Softgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Softgoal
	 */
	
	public CArrayFacade<Byte> getNamedVG_Softgoal() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 134, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 126, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'namedVG_Softgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Softgoal
	 */
	
	public void setNamedVG_Softgoal(CArrayFacade<Byte> namedVG_Softgoal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 134;
		} else {
			__dna__offset = 126;
		}
		if (__io__equals(namedVG_Softgoal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, namedVG_Softgoal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, namedVG_Softgoal);
		} else {
			__io__generic__copy( getNamedVG_Softgoal(), namedVG_Softgoal);
		}
	}

	/**
	 * Get method for struct member 'fuzzyness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 </p>
	 * @see #__DNA__FIELD__fuzzyness
	 */
	
	public short getFuzzyness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'fuzzyness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 </p>
	 * @see #__DNA__FIELD__fuzzyness
	 */
	
	public void setFuzzyness(short fuzzyness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, fuzzyness);
		} else {
			__io__block.writeShort(__io__address + 190, fuzzyness);
		}
	}

	/**
	 * Get method for struct member 'inspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> springs softbody inner springs </p>
	 * @see #__DNA__FIELD__inspring
	 */
	
	public float getInspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'inspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> springs softbody inner springs </p>
	 * @see #__DNA__FIELD__inspring
	 */
	
	public void setInspring(float inspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, inspring);
		} else {
			__io__block.writeFloat(__io__address + 192, inspring);
		}
	}

	/**
	 * Get method for struct member 'infrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody inner springs friction </p>
	 * @see #__DNA__FIELD__infrict
	 */
	
	public float getInfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'infrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody inner springs friction </p>
	 * @see #__DNA__FIELD__infrict
	 */
	
	public void setInfrict(float infrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, infrict);
		} else {
			__io__block.writeFloat(__io__address + 196, infrict);
		}
	}

	/**
	 * Get method for struct member 'namedVG_Spring_K'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Spring_K
	 */
	
	public CArrayFacade<Byte> getNamedVG_Spring_K() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'namedVG_Spring_K'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__namedVG_Spring_K
	 */
	
	public void setNamedVG_Spring_K(CArrayFacade<Byte> namedVG_Spring_K) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(namedVG_Spring_K, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, namedVG_Spring_K)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, namedVG_Spring_K);
		} else {
			__io__generic__copy( getNamedVG_Spring_K(), namedVG_Spring_K);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce Spring_K painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 baking </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 272);
		} else {
			return __io__block.readInt(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> along with it introduce Spring_K painting starting to fix old bug .. nastiness that VG are indexes rather find them by name tag to find it -> jow20090613 baking </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 272, sfra);
		} else {
			__io__block.writeInt(__io__address + 264, sfra);
		}
	}

	/**
	 * Get method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public int getEfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 276);
		} else {
			return __io__block.readInt(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public void setEfra(int efra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 276, efra);
		} else {
			__io__block.writeInt(__io__address + 268, efra);
		}
	}

	/**
	 * Get method for struct member 'interval'.
	 * @see #__DNA__FIELD__interval
	 */
	
	public int getInterval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 280);
		} else {
			return __io__block.readInt(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'interval'.
	 * @see #__DNA__FIELD__interval
	 */
	
	public void setInterval(int interval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 280, interval);
		} else {
			__io__block.writeInt(__io__address + 272, interval);
		}
	}

	/**
	 * Get method for struct member 'local'.
	 * @see #__DNA__FIELD__local
	 */
	
	public short getLocal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 284);
		} else {
			return __io__block.readShort(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'local'.
	 * @see #__DNA__FIELD__local
	 */
	
	public void setLocal(short local) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 284, local);
		} else {
			__io__block.writeShort(__io__address + 276, local);
		}
	}

	/**
	 * Get method for struct member 'solverflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> local==1: use local coords for baking </p>
	 * @see #__DNA__FIELD__solverflags
	 */
	
	public short getSolverflags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 286);
		} else {
			return __io__block.readShort(__io__address + 278);
		}
	}

	/**
	 * Set method for struct member 'solverflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> local==1: use local coords for baking </p>
	 * @see #__DNA__FIELD__solverflags
	 */
	
	public void setSolverflags(short solverflags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 286, solverflags);
		} else {
			__io__block.writeShort(__io__address + 278, solverflags);
		}
	}

	/**
	 * Get method for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  these must be kept for backwards compatibility <ndash/>  array of size totpointkey </p>
	 * @see #__DNA__FIELD__keys
	 */
	
	public CPointer<CPointer<SBVertex>> getKeys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, SBVertex.class};
		return new CPointer<CPointer<SBVertex>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  these must be kept for backwards compatibility <ndash/>  array of size totpointkey </p>
	 * @see #__DNA__FIELD__keys
	 */
	
	public void setKeys(CPointer<CPointer<SBVertex>> keys) throws IOException
	{
		long __address = ((keys == null) ? 0 : keys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 280, __address);
		}
	}

	/**
	 * Get method for struct member 'totpointkey'.
	 * @see #__DNA__FIELD__totpointkey
	 */
	
	public int getTotpointkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 296);
		} else {
			return __io__block.readInt(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'totpointkey'.
	 * @see #__DNA__FIELD__totpointkey
	 */
	
	public void setTotpointkey(int totpointkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 296, totpointkey);
		} else {
			__io__block.writeInt(__io__address + 284, totpointkey);
		}
	}

	/**
	 * Get method for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if totpointkey != totpoint or totkey!- (efra-sfra)/interval -> free keys </p>
	 * @see #__DNA__FIELD__totkey
	 */
	
	public int getTotkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 300);
		} else {
			return __io__block.readInt(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if totpointkey != totpoint or totkey!- (efra-sfra)/interval -> free keys </p>
	 * @see #__DNA__FIELD__totkey
	 */
	
	public void setTotkey(int totkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 300, totkey);
		} else {
			__io__block.writeInt(__io__address + 288, totkey);
		}
	}

	/**
	 * Get method for struct member 'secondspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><hr/> 
	 *  </p>
	 * @see #__DNA__FIELD__secondspring
	 */
	
	public float getSecondspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'secondspring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><hr/> 
	 *  </p>
	 * @see #__DNA__FIELD__secondspring
	 */
	
	public void setSecondspring(float secondspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, secondspring);
		} else {
			__io__block.writeFloat(__io__address + 292, secondspring);
		}
	}

	/**
	 * Get method for struct member 'colball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> self collision fixed collision ball size if > 0 </p>
	 * @see #__DNA__FIELD__colball
	 */
	
	public float getColball() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'colball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> self collision fixed collision ball size if > 0 </p>
	 * @see #__DNA__FIELD__colball
	 */
	
	public void setColball(float colball) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, colball);
		} else {
			__io__block.writeFloat(__io__address + 296, colball);
		}
	}

	/**
	 * Get method for struct member 'balldamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cooling down collision response </p>
	 * @see #__DNA__FIELD__balldamp
	 */
	
	public float getBalldamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'balldamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cooling down collision response </p>
	 * @see #__DNA__FIELD__balldamp
	 */
	
	public void setBalldamp(float balldamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, balldamp);
		} else {
			__io__block.writeFloat(__io__address + 300, balldamp);
		}
	}

	/**
	 * Get method for struct member 'ballstiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pressure the ball is loaded with </p>
	 * @see #__DNA__FIELD__ballstiff
	 */
	
	public float getBallstiff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'ballstiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pressure the ball is loaded with </p>
	 * @see #__DNA__FIELD__ballstiff
	 */
	
	public void setBallstiff(float ballstiff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, ballstiff);
		} else {
			__io__block.writeFloat(__io__address + 304, ballstiff);
		}
	}

	/**
	 * Get method for struct member 'sbc_mode'.
	 * @see #__DNA__FIELD__sbc_mode
	 */
	
	public short getSbc_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 320);
		} else {
			return __io__block.readShort(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'sbc_mode'.
	 * @see #__DNA__FIELD__sbc_mode
	 */
	
	public void setSbc_mode(short sbc_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 320, sbc_mode);
		} else {
			__io__block.writeShort(__io__address + 308, sbc_mode);
		}
	}

	/**
	 * Get method for struct member 'aeroedge'.
	 * @see #__DNA__FIELD__aeroedge
	 */
	
	public short getAeroedge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 322);
		} else {
			return __io__block.readShort(__io__address + 310);
		}
	}

	/**
	 * Set method for struct member 'aeroedge'.
	 * @see #__DNA__FIELD__aeroedge
	 */
	
	public void setAeroedge(short aeroedge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 322, aeroedge);
		} else {
			__io__block.writeShort(__io__address + 310, aeroedge);
		}
	}

	/**
	 * Get method for struct member 'minloops'.
	 * @see #__DNA__FIELD__minloops
	 */
	
	public short getMinloops() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 324);
		} else {
			return __io__block.readShort(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'minloops'.
	 * @see #__DNA__FIELD__minloops
	 */
	
	public void setMinloops(short minloops) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 324, minloops);
		} else {
			__io__block.writeShort(__io__address + 312, minloops);
		}
	}

	/**
	 * Get method for struct member 'maxloops'.
	 * @see #__DNA__FIELD__maxloops
	 */
	
	public short getMaxloops() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 326);
		} else {
			return __io__block.readShort(__io__address + 314);
		}
	}

	/**
	 * Set method for struct member 'maxloops'.
	 * @see #__DNA__FIELD__maxloops
	 */
	
	public void setMaxloops(short maxloops) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 326, maxloops);
		} else {
			__io__block.writeShort(__io__address + 314, maxloops);
		}
	}

	/**
	 * Get method for struct member 'choke'.
	 * @see #__DNA__FIELD__choke
	 */
	
	public short getChoke() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 328);
		} else {
			return __io__block.readShort(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'choke'.
	 * @see #__DNA__FIELD__choke
	 */
	
	public void setChoke(short choke) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 328, choke);
		} else {
			__io__block.writeShort(__io__address + 316, choke);
		}
	}

	/**
	 * Get method for struct member 'solver_ID'.
	 * @see #__DNA__FIELD__solver_ID
	 */
	
	public short getSolver_ID() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 330);
		} else {
			return __io__block.readShort(__io__address + 318);
		}
	}

	/**
	 * Set method for struct member 'solver_ID'.
	 * @see #__DNA__FIELD__solver_ID
	 */
	
	public void setSolver_ID(short solver_ID) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 330, solver_ID);
		} else {
			__io__block.writeShort(__io__address + 318, solver_ID);
		}
	}

	/**
	 * Get method for struct member 'plastic'.
	 * @see #__DNA__FIELD__plastic
	 */
	
	public short getPlastic() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 332);
		} else {
			return __io__block.readShort(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'plastic'.
	 * @see #__DNA__FIELD__plastic
	 */
	
	public void setPlastic(short plastic) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 332, plastic);
		} else {
			__io__block.writeShort(__io__address + 320, plastic);
		}
	}

	/**
	 * Get method for struct member 'springpreload'.
	 * @see #__DNA__FIELD__springpreload
	 */
	
	public short getSpringpreload() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 334);
		} else {
			return __io__block.readShort(__io__address + 322);
		}
	}

	/**
	 * Set method for struct member 'springpreload'.
	 * @see #__DNA__FIELD__springpreload
	 */
	
	public void setSpringpreload(short springpreload) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 334, springpreload);
		} else {
			__io__block.writeShort(__io__address + 322, springpreload);
		}
	}

	/**
	 * Get method for struct member 'scratch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scratch pad/cache on live time not saved in file </p>
	 * @see #__DNA__FIELD__scratch
	 */
	
	public CPointer<Object> getScratch() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 324);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scratch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scratch pad/cache on live time not saved in file </p>
	 * @see #__DNA__FIELD__scratch
	 */
	
	public void setScratch(CPointer<Object> scratch) throws IOException
	{
		long __address = ((scratch == null) ? 0 : scratch.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 324, __address);
		}
	}

	/**
	 * Get method for struct member 'shearstiff'.
	 * @see #__DNA__FIELD__shearstiff
	 */
	
	public float getShearstiff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'shearstiff'.
	 * @see #__DNA__FIELD__shearstiff
	 */
	
	public void setShearstiff(float shearstiff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, shearstiff);
		} else {
			__io__block.writeFloat(__io__address + 328, shearstiff);
		}
	}

	/**
	 * Get method for struct member 'inpush'.
	 * @see #__DNA__FIELD__inpush
	 */
	
	public float getInpush() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 348);
		} else {
			return __io__block.readFloat(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'inpush'.
	 * @see #__DNA__FIELD__inpush
	 */
	
	public void setInpush(float inpush) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 348, inpush);
		} else {
			__io__block.writeFloat(__io__address + 332, inpush);
		}
	}

	/**
	 * Get method for struct member 'pointcache'.
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public CPointer<PointCache> getPointcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointcache'.
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public void setPointcache(CPointer<PointCache> pointcache) throws IOException
	{
		long __address = ((pointcache == null) ? 0 : pointcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 360, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 340, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(ListBase ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 340;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
		}
	}

	/**
	 * Get method for struct member 'collision_group'.
	 * @see #__DNA__FIELD__collision_group
	 */
	
	public CPointer<Group> getCollision_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 348);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collision_group'.
	 * @see #__DNA__FIELD__collision_group
	 */
	
	public void setCollision_group(CPointer<Group> collision_group) throws IOException
	{
		long __address = ((collision_group == null) ? 0 : collision_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 348, __address);
		}
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 352, __address);
		}
	}

	/**
	 * Get method for struct member 'lcom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reverse esimated obmatrix .. no need to store in blend file .. how ever who cares </p>
	 * @see #__DNA__FIELD__lcom
	 */
	
	public CArrayFacade<Float> getLcom() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lcom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reverse esimated obmatrix .. no need to store in blend file .. how ever who cares </p>
	 * @see #__DNA__FIELD__lcom
	 */
	
	public void setLcom(CArrayFacade<Float> lcom) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 356;
		}
		if (__io__equals(lcom, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lcom)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lcom);
		} else {
			__io__generic__copy( getLcom(), lcom);
		}
	}

	/**
	 * Get method for struct member 'lrot'.
	 * @see #__DNA__FIELD__lrot
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getLrot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lrot'.
	 * @see #__DNA__FIELD__lrot
	 */
	
	public void setLrot(CArrayFacade<CArrayFacade<Float>> lrot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 404;
		} else {
			__dna__offset = 368;
		}
		if (__io__equals(lrot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lrot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lrot);
		} else {
			__io__generic__copy( getLrot(), lrot);
		}
	}

	/**
	 * Get method for struct member 'lscale'.
	 * @see #__DNA__FIELD__lscale
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getLscale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lscale'.
	 * @see #__DNA__FIELD__lscale
	 */
	
	public void setLscale(CArrayFacade<CArrayFacade<Float>> lscale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 440;
		} else {
			__dna__offset = 404;
		}
		if (__io__equals(lscale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lscale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lscale);
		} else {
			__io__generic__copy( getLscale(), lscale);
		}
	}

	/**
	 * Get method for struct member 'last_frame'.
	 * @see #__DNA__FIELD__last_frame
	 */
	
	public int getLast_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 476);
		} else {
			return __io__block.readInt(__io__address + 440);
		}
	}

	/**
	 * Set method for struct member 'last_frame'.
	 * @see #__DNA__FIELD__last_frame
	 */
	
	public void setLast_frame(int last_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 476, last_frame);
		} else {
			__io__block.writeInt(__io__address + 440, last_frame);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SoftBody> __io__addressof() {
		return new CPointer<SoftBody>(__io__address, new Class[]{SoftBody.class}, __io__block, __io__blockTable);
	}

}
