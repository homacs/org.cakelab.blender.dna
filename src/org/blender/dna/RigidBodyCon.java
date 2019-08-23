package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RigidBodyCon'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  RigidBody Constraint RigidBodyConstraint (rbc)</p><p> Represents an constraint connecting two rigid bodies. </p>
 */

@CMetaData(size32=116, size64=128)
public class RigidBodyCon extends CFacade {

	/**
	 * This is the sdna index of the struct RigidBodyCon.
	 * <p>
	 * It is required when allocating a new block to store data for RigidBodyCon.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 570;

	/**
	 * Field descriptor (offset) for struct member 'ob1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> First object influenced by the constraint </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__ob1);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob1 = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob1'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob1 = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ob2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Second object influenced by the constraint </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__ob2);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob2 = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob2'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob2 = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyCon}  (eRigidBodyCon_Type) role of RigidBody in sim </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__type);
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
	 * Field descriptor (offset) for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of constraint solver iterations made per simulation step </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__num_solver_iterations);
	 * CPointer&lt;Short&gt; p_num_solver_iterations = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_solver_iterations'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_solver_iterations = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyCon_Flag) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'breaking_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> breaking impulse threshold </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__breaking_threshold);
	 * CPointer&lt;Float&gt; p_breaking_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'breaking_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__breaking_threshold = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__pad);
	 * CPointer&lt;Float&gt; p_pad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> limits translation limits </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_x_lower);
	 * CPointer&lt;Float&gt; p_limit_lin_x_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_x_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_x_lower = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_x_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_x_upper);
	 * CPointer&lt;Float&gt; p_limit_lin_x_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_x_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_x_upper = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_y_lower'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_y_lower);
	 * CPointer&lt;Float&gt; p_limit_lin_y_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_y_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_y_lower = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_y_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_y_upper);
	 * CPointer&lt;Float&gt; p_limit_lin_y_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_y_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_y_upper = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_z_lower'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_z_lower);
	 * CPointer&lt;Float&gt; p_limit_lin_z_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_z_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_z_lower = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'limit_lin_z_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_lin_z_upper);
	 * CPointer&lt;Float&gt; p_limit_lin_z_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_lin_z_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_lin_z_upper = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation limits </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_x_lower);
	 * CPointer&lt;Float&gt; p_limit_ang_x_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_x_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_x_lower = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_x_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_x_upper);
	 * CPointer&lt;Float&gt; p_limit_ang_x_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_x_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_x_upper = new long[]{52, 60};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_y_lower'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_y_lower);
	 * CPointer&lt;Float&gt; p_limit_ang_y_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_y_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_y_lower = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_y_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_y_upper);
	 * CPointer&lt;Float&gt; p_limit_ang_y_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_y_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_y_upper = new long[]{60, 68};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_z_lower'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_z_lower);
	 * CPointer&lt;Float&gt; p_limit_ang_z_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_z_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_z_lower = new long[]{64, 72};

	/**
	 * Field descriptor (offset) for struct member 'limit_ang_z_upper'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__limit_ang_z_upper);
	 * CPointer&lt;Float&gt; p_limit_ang_z_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_ang_z_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_ang_z_upper = new long[]{68, 76};

	/**
	 * Field descriptor (offset) for struct member 'spring_stiffness_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> spring settings resistance to deformation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_stiffness_x);
	 * CPointer&lt;Float&gt; p_spring_stiffness_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_stiffness_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_stiffness_x = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'spring_stiffness_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_stiffness_y);
	 * CPointer&lt;Float&gt; p_spring_stiffness_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_stiffness_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_stiffness_y = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'spring_stiffness_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_stiffness_z);
	 * CPointer&lt;Float&gt; p_spring_stiffness_z = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_stiffness_z'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_stiffness_z = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'spring_damping_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of velocity lost over time </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_damping_x);
	 * CPointer&lt;Float&gt; p_spring_damping_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_damping_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_damping_x = new long[]{84, 92};

	/**
	 * Field descriptor (offset) for struct member 'spring_damping_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_damping_y);
	 * CPointer&lt;Float&gt; p_spring_damping_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_damping_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_damping_y = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'spring_damping_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__spring_damping_z);
	 * CPointer&lt;Float&gt; p_spring_damping_z = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_damping_z'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_damping_z = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'motor_lin_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motor settings linear velocity the motor tries to hold </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__motor_lin_target_velocity);
	 * CPointer&lt;Float&gt; p_motor_lin_target_velocity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motor_lin_target_velocity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motor_lin_target_velocity = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'motor_ang_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity the motor tries to hold </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__motor_ang_target_velocity);
	 * CPointer&lt;Float&gt; p_motor_ang_target_velocity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motor_ang_target_velocity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motor_ang_target_velocity = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'motor_lin_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach linear target velocity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__motor_lin_max_impulse);
	 * CPointer&lt;Float&gt; p_motor_lin_max_impulse = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motor_lin_max_impulse'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motor_lin_max_impulse = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'motor_ang_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach angular target velocity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__motor_ang_max_impulse);
	 * CPointer&lt;Float&gt; p_motor_ang_max_impulse = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motor_ang_max_impulse'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motor_ang_max_impulse = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'physics_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim object. Exist at runtime only Physics object representation (i.e. btTypedConstraint) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyCon rigidbodycon = ...;
	 * CPointer&lt;Object&gt; p = rigidbodycon.__dna__addressof(RigidBodyCon.__DNA__FIELD__physics_constraint);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_physics_constraint = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physics_constraint'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physics_constraint = new long[]{112, 120};

	public RigidBodyCon(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RigidBodyCon(RigidBodyCon that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ob1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> First object influenced by the constraint </p>
	 * @see #__DNA__FIELD__ob1
	 */
	
	public CPointer<BlenderObject> getOb1() throws IOException
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
	 * Set method for struct member 'ob1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> First object influenced by the constraint </p>
	 * @see #__DNA__FIELD__ob1
	 */
	
	public void setOb1(CPointer<BlenderObject> ob1) throws IOException
	{
		long __address = ((ob1 == null) ? 0 : ob1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'ob2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Second object influenced by the constraint </p>
	 * @see #__DNA__FIELD__ob2
	 */
	
	public CPointer<BlenderObject> getOb2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Second object influenced by the constraint </p>
	 * @see #__DNA__FIELD__ob2
	 */
	
	public void setOb2(CPointer<BlenderObject> ob2) throws IOException
	{
		long __address = ((ob2 == null) ? 0 : ob2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyCon}  (eRigidBodyCon_Type) role of RigidBody in sim </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyCon}  (eRigidBodyCon_Type) role of RigidBody in sim </p>
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
	 * Get method for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of constraint solver iterations made per simulation step </p>
	 * @see #__DNA__FIELD__num_solver_iterations
	 */
	
	public short getNum_solver_iterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of constraint solver iterations made per simulation step </p>
	 * @see #__DNA__FIELD__num_solver_iterations
	 */
	
	public void setNum_solver_iterations(short num_solver_iterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, num_solver_iterations);
		} else {
			__io__block.writeShort(__io__address + 10, num_solver_iterations);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyCon_Flag) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyCon_Flag) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, flag);
		} else {
			__io__block.writeInt(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'breaking_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> breaking impulse threshold </p>
	 * @see #__DNA__FIELD__breaking_threshold
	 */
	
	public float getBreaking_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'breaking_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> breaking impulse threshold </p>
	 * @see #__DNA__FIELD__breaking_threshold
	 */
	
	public void setBreaking_threshold(float breaking_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, breaking_threshold);
		} else {
			__io__block.writeFloat(__io__address + 16, breaking_threshold);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public float getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(float pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, pad);
		} else {
			__io__block.writeFloat(__io__address + 20, pad);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> limits translation limits </p>
	 * @see #__DNA__FIELD__limit_lin_x_lower
	 */
	
	public float getLimit_lin_x_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> limits translation limits </p>
	 * @see #__DNA__FIELD__limit_lin_x_lower
	 */
	
	public void setLimit_lin_x_lower(float limit_lin_x_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, limit_lin_x_lower);
		} else {
			__io__block.writeFloat(__io__address + 24, limit_lin_x_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_x_upper'.
	 * @see #__DNA__FIELD__limit_lin_x_upper
	 */
	
	public float getLimit_lin_x_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_x_upper'.
	 * @see #__DNA__FIELD__limit_lin_x_upper
	 */
	
	public void setLimit_lin_x_upper(float limit_lin_x_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, limit_lin_x_upper);
		} else {
			__io__block.writeFloat(__io__address + 28, limit_lin_x_upper);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_y_lower'.
	 * @see #__DNA__FIELD__limit_lin_y_lower
	 */
	
	public float getLimit_lin_y_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_y_lower'.
	 * @see #__DNA__FIELD__limit_lin_y_lower
	 */
	
	public void setLimit_lin_y_lower(float limit_lin_y_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, limit_lin_y_lower);
		} else {
			__io__block.writeFloat(__io__address + 32, limit_lin_y_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_y_upper'.
	 * @see #__DNA__FIELD__limit_lin_y_upper
	 */
	
	public float getLimit_lin_y_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_y_upper'.
	 * @see #__DNA__FIELD__limit_lin_y_upper
	 */
	
	public void setLimit_lin_y_upper(float limit_lin_y_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, limit_lin_y_upper);
		} else {
			__io__block.writeFloat(__io__address + 36, limit_lin_y_upper);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_z_lower'.
	 * @see #__DNA__FIELD__limit_lin_z_lower
	 */
	
	public float getLimit_lin_z_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_z_lower'.
	 * @see #__DNA__FIELD__limit_lin_z_lower
	 */
	
	public void setLimit_lin_z_lower(float limit_lin_z_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, limit_lin_z_lower);
		} else {
			__io__block.writeFloat(__io__address + 40, limit_lin_z_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_lin_z_upper'.
	 * @see #__DNA__FIELD__limit_lin_z_upper
	 */
	
	public float getLimit_lin_z_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'limit_lin_z_upper'.
	 * @see #__DNA__FIELD__limit_lin_z_upper
	 */
	
	public void setLimit_lin_z_upper(float limit_lin_z_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, limit_lin_z_upper);
		} else {
			__io__block.writeFloat(__io__address + 44, limit_lin_z_upper);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation limits </p>
	 * @see #__DNA__FIELD__limit_ang_x_lower
	 */
	
	public float getLimit_ang_x_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_x_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation limits </p>
	 * @see #__DNA__FIELD__limit_ang_x_lower
	 */
	
	public void setLimit_ang_x_lower(float limit_ang_x_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, limit_ang_x_lower);
		} else {
			__io__block.writeFloat(__io__address + 48, limit_ang_x_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_x_upper'.
	 * @see #__DNA__FIELD__limit_ang_x_upper
	 */
	
	public float getLimit_ang_x_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_x_upper'.
	 * @see #__DNA__FIELD__limit_ang_x_upper
	 */
	
	public void setLimit_ang_x_upper(float limit_ang_x_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, limit_ang_x_upper);
		} else {
			__io__block.writeFloat(__io__address + 52, limit_ang_x_upper);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_y_lower'.
	 * @see #__DNA__FIELD__limit_ang_y_lower
	 */
	
	public float getLimit_ang_y_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_y_lower'.
	 * @see #__DNA__FIELD__limit_ang_y_lower
	 */
	
	public void setLimit_ang_y_lower(float limit_ang_y_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, limit_ang_y_lower);
		} else {
			__io__block.writeFloat(__io__address + 56, limit_ang_y_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_y_upper'.
	 * @see #__DNA__FIELD__limit_ang_y_upper
	 */
	
	public float getLimit_ang_y_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_y_upper'.
	 * @see #__DNA__FIELD__limit_ang_y_upper
	 */
	
	public void setLimit_ang_y_upper(float limit_ang_y_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, limit_ang_y_upper);
		} else {
			__io__block.writeFloat(__io__address + 60, limit_ang_y_upper);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_z_lower'.
	 * @see #__DNA__FIELD__limit_ang_z_lower
	 */
	
	public float getLimit_ang_z_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_z_lower'.
	 * @see #__DNA__FIELD__limit_ang_z_lower
	 */
	
	public void setLimit_ang_z_lower(float limit_ang_z_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, limit_ang_z_lower);
		} else {
			__io__block.writeFloat(__io__address + 64, limit_ang_z_lower);
		}
	}

	/**
	 * Get method for struct member 'limit_ang_z_upper'.
	 * @see #__DNA__FIELD__limit_ang_z_upper
	 */
	
	public float getLimit_ang_z_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'limit_ang_z_upper'.
	 * @see #__DNA__FIELD__limit_ang_z_upper
	 */
	
	public void setLimit_ang_z_upper(float limit_ang_z_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, limit_ang_z_upper);
		} else {
			__io__block.writeFloat(__io__address + 68, limit_ang_z_upper);
		}
	}

	/**
	 * Get method for struct member 'spring_stiffness_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> spring settings resistance to deformation </p>
	 * @see #__DNA__FIELD__spring_stiffness_x
	 */
	
	public float getSpring_stiffness_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'spring_stiffness_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> spring settings resistance to deformation </p>
	 * @see #__DNA__FIELD__spring_stiffness_x
	 */
	
	public void setSpring_stiffness_x(float spring_stiffness_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, spring_stiffness_x);
		} else {
			__io__block.writeFloat(__io__address + 72, spring_stiffness_x);
		}
	}

	/**
	 * Get method for struct member 'spring_stiffness_y'.
	 * @see #__DNA__FIELD__spring_stiffness_y
	 */
	
	public float getSpring_stiffness_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'spring_stiffness_y'.
	 * @see #__DNA__FIELD__spring_stiffness_y
	 */
	
	public void setSpring_stiffness_y(float spring_stiffness_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, spring_stiffness_y);
		} else {
			__io__block.writeFloat(__io__address + 76, spring_stiffness_y);
		}
	}

	/**
	 * Get method for struct member 'spring_stiffness_z'.
	 * @see #__DNA__FIELD__spring_stiffness_z
	 */
	
	public float getSpring_stiffness_z() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'spring_stiffness_z'.
	 * @see #__DNA__FIELD__spring_stiffness_z
	 */
	
	public void setSpring_stiffness_z(float spring_stiffness_z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, spring_stiffness_z);
		} else {
			__io__block.writeFloat(__io__address + 80, spring_stiffness_z);
		}
	}

	/**
	 * Get method for struct member 'spring_damping_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of velocity lost over time </p>
	 * @see #__DNA__FIELD__spring_damping_x
	 */
	
	public float getSpring_damping_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'spring_damping_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of velocity lost over time </p>
	 * @see #__DNA__FIELD__spring_damping_x
	 */
	
	public void setSpring_damping_x(float spring_damping_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, spring_damping_x);
		} else {
			__io__block.writeFloat(__io__address + 84, spring_damping_x);
		}
	}

	/**
	 * Get method for struct member 'spring_damping_y'.
	 * @see #__DNA__FIELD__spring_damping_y
	 */
	
	public float getSpring_damping_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'spring_damping_y'.
	 * @see #__DNA__FIELD__spring_damping_y
	 */
	
	public void setSpring_damping_y(float spring_damping_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, spring_damping_y);
		} else {
			__io__block.writeFloat(__io__address + 88, spring_damping_y);
		}
	}

	/**
	 * Get method for struct member 'spring_damping_z'.
	 * @see #__DNA__FIELD__spring_damping_z
	 */
	
	public float getSpring_damping_z() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'spring_damping_z'.
	 * @see #__DNA__FIELD__spring_damping_z
	 */
	
	public void setSpring_damping_z(float spring_damping_z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, spring_damping_z);
		} else {
			__io__block.writeFloat(__io__address + 92, spring_damping_z);
		}
	}

	/**
	 * Get method for struct member 'motor_lin_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motor settings linear velocity the motor tries to hold </p>
	 * @see #__DNA__FIELD__motor_lin_target_velocity
	 */
	
	public float getMotor_lin_target_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'motor_lin_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motor settings linear velocity the motor tries to hold </p>
	 * @see #__DNA__FIELD__motor_lin_target_velocity
	 */
	
	public void setMotor_lin_target_velocity(float motor_lin_target_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, motor_lin_target_velocity);
		} else {
			__io__block.writeFloat(__io__address + 96, motor_lin_target_velocity);
		}
	}

	/**
	 * Get method for struct member 'motor_ang_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity the motor tries to hold </p>
	 * @see #__DNA__FIELD__motor_ang_target_velocity
	 */
	
	public float getMotor_ang_target_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'motor_ang_target_velocity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity the motor tries to hold </p>
	 * @see #__DNA__FIELD__motor_ang_target_velocity
	 */
	
	public void setMotor_ang_target_velocity(float motor_ang_target_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, motor_ang_target_velocity);
		} else {
			__io__block.writeFloat(__io__address + 100, motor_ang_target_velocity);
		}
	}

	/**
	 * Get method for struct member 'motor_lin_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach linear target velocity </p>
	 * @see #__DNA__FIELD__motor_lin_max_impulse
	 */
	
	public float getMotor_lin_max_impulse() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'motor_lin_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach linear target velocity </p>
	 * @see #__DNA__FIELD__motor_lin_max_impulse
	 */
	
	public void setMotor_lin_max_impulse(float motor_lin_max_impulse) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, motor_lin_max_impulse);
		} else {
			__io__block.writeFloat(__io__address + 104, motor_lin_max_impulse);
		}
	}

	/**
	 * Get method for struct member 'motor_ang_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach angular target velocity </p>
	 * @see #__DNA__FIELD__motor_ang_max_impulse
	 */
	
	public float getMotor_ang_max_impulse() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'motor_ang_max_impulse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum force used to reach angular target velocity </p>
	 * @see #__DNA__FIELD__motor_ang_max_impulse
	 */
	
	public void setMotor_ang_max_impulse(float motor_ang_max_impulse) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, motor_ang_max_impulse);
		} else {
			__io__block.writeFloat(__io__address + 108, motor_ang_max_impulse);
		}
	}

	/**
	 * Get method for struct member 'physics_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim object. Exist at runtime only Physics object representation (i.e. btTypedConstraint) </p>
	 * @see #__DNA__FIELD__physics_constraint
	 */
	
	public CPointer<Object> getPhysics_constraint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'physics_constraint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim object. Exist at runtime only Physics object representation (i.e. btTypedConstraint) </p>
	 * @see #__DNA__FIELD__physics_constraint
	 */
	
	public void setPhysics_constraint(CPointer<Object> physics_constraint) throws IOException
	{
		long __address = ((physics_constraint == null) ? 0 : physics_constraint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RigidBodyCon> __io__addressof() {
		return new CPointer<RigidBodyCon>(__io__address, new Class[]{RigidBodyCon.class}, __io__block, __io__blockTable);
	}

}
