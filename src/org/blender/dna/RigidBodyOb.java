package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RigidBodyOb'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> RigidBodyObject (rbo)</p><p> Represents an object participating in a RigidBody sim. This is attached to each object that is currently participating in a sim. </p>
 */

@CMetaData(size32=84, size64=88)
public class RigidBodyOb extends CFacade {

	/**
	 * This is the sdna index of the struct RigidBodyOb.
	 * <p>
	 * It is required when allocating a new block to store data for RigidBodyOb.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 581;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyOb}  (eRigidBodyOb_Type) role of RigidBody in sim . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_Shape) collision shape to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__shape);
	 * CPointer&lt;Short&gt; p_shape = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shape'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shape = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyOb_Flag). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'col_groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision groups that determines which rigid bodies can collide with each other. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__col_groups);
	 * CPointer&lt;Integer&gt; p_col_groups = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'col_groups'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__col_groups = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'mesh_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_MeshSource) mesh source for mesh based collision shapes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__mesh_source);
	 * CPointer&lt;Short&gt; p_mesh_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_source = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Physics Parameters How much object 'weighs' (i.e. absolute 'amount of stuff' it holds). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__mass);
	 * CPointer&lt;Float&gt; p_mass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mass = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Resistance of object to movement. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__friction);
	 * CPointer&lt;Float&gt; p_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__friction = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'restitution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How 'bouncy' object is when it collides. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__restitution);
	 * CPointer&lt;Float&gt; p_restitution = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'restitution'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__restitution = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tolerance for detecting collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__margin);
	 * CPointer&lt;Float&gt; p_margin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'lin_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for linear velocities. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__lin_damping);
	 * CPointer&lt;Float&gt; p_lin_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lin_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lin_damping = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'ang_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for angular velocities. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__ang_damping);
	 * CPointer&lt;Float&gt; p_ang_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ang_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ang_damping = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'lin_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for linear velocities. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__lin_sleep_thresh);
	 * CPointer&lt;Float&gt; p_lin_sleep_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lin_sleep_thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lin_sleep_thresh = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'ang_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for angular velocities. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__ang_sleep_thresh);
	 * CPointer&lt;Float&gt; p_ang_sleep_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ang_sleep_thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ang_sleep_thresh = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'orn'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body orientation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__orn);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_orn = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orn'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orn = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body position. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pos'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pos = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'shared'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This pointer is shared between all evaluated copies. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyOb rigidbodyob = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyob.__dna__addressof(RigidBodyOb.__DNA__FIELD__shared);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_shared = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shared'</li>
	 * <li>Signature: 'RigidBodyOb_Shared*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shared = new long[]{80, 80};

	public RigidBodyOb(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RigidBodyOb(RigidBodyOb that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyOb}  (eRigidBodyOb_Type) role of RigidBody in sim . </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings for this {@link RigidBodyOb}  (eRigidBodyOb_Type) role of RigidBody in sim . </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, type);
		} else {
			__io__block.writeShort(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_Shape) collision shape to use. </p>
	 * @see #__DNA__FIELD__shape
	 */
	
	public short getShape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_Shape) collision shape to use. </p>
	 * @see #__DNA__FIELD__shape
	 */
	
	public void setShape(short shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, shape);
		} else {
			__io__block.writeShort(__io__address + 2, shape);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyOb_Flag). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBodyOb_Flag). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'col_groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision groups that determines which rigid bodies can collide with each other. </p>
	 * @see #__DNA__FIELD__col_groups
	 */
	
	public int getCol_groups() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'col_groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision groups that determines which rigid bodies can collide with each other. </p>
	 * @see #__DNA__FIELD__col_groups
	 */
	
	public void setCol_groups(int col_groups) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, col_groups);
		} else {
			__io__block.writeInt(__io__address + 8, col_groups);
		}
	}

	/**
	 * Get method for struct member 'mesh_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_MeshSource) mesh source for mesh based collision shapes. </p>
	 * @see #__DNA__FIELD__mesh_source
	 */
	
	public short getMesh_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'mesh_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eRigidBody_MeshSource) mesh source for mesh based collision shapes. </p>
	 * @see #__DNA__FIELD__mesh_source
	 */
	
	public void setMesh_source(short mesh_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, mesh_source);
		} else {
			__io__block.writeShort(__io__address + 12, mesh_source);
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
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 14;
		} else {
			__dna__offset = 14;
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
	 * Get method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Physics Parameters How much object 'weighs' (i.e. absolute 'amount of stuff' it holds). </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public float getMass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Physics Parameters How much object 'weighs' (i.e. absolute 'amount of stuff' it holds). </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public void setMass(float mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, mass);
		} else {
			__io__block.writeFloat(__io__address + 16, mass);
		}
	}

	/**
	 * Get method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Resistance of object to movement. </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public float getFriction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Resistance of object to movement. </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public void setFriction(float friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, friction);
		} else {
			__io__block.writeFloat(__io__address + 20, friction);
		}
	}

	/**
	 * Get method for struct member 'restitution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How 'bouncy' object is when it collides. </p>
	 * @see #__DNA__FIELD__restitution
	 */
	
	public float getRestitution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'restitution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How 'bouncy' object is when it collides. </p>
	 * @see #__DNA__FIELD__restitution
	 */
	
	public void setRestitution(float restitution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, restitution);
		} else {
			__io__block.writeFloat(__io__address + 24, restitution);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tolerance for detecting collisions. </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public float getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tolerance for detecting collisions. </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(float margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, margin);
		} else {
			__io__block.writeFloat(__io__address + 28, margin);
		}
	}

	/**
	 * Get method for struct member 'lin_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for linear velocities. </p>
	 * @see #__DNA__FIELD__lin_damping
	 */
	
	public float getLin_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'lin_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for linear velocities. </p>
	 * @see #__DNA__FIELD__lin_damping
	 */
	
	public void setLin_damping(float lin_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, lin_damping);
		} else {
			__io__block.writeFloat(__io__address + 32, lin_damping);
		}
	}

	/**
	 * Get method for struct member 'ang_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for angular velocities. </p>
	 * @see #__DNA__FIELD__ang_damping
	 */
	
	public float getAng_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'ang_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping for angular velocities. </p>
	 * @see #__DNA__FIELD__ang_damping
	 */
	
	public void setAng_damping(float ang_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, ang_damping);
		} else {
			__io__block.writeFloat(__io__address + 36, ang_damping);
		}
	}

	/**
	 * Get method for struct member 'lin_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for linear velocities. </p>
	 * @see #__DNA__FIELD__lin_sleep_thresh
	 */
	
	public float getLin_sleep_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'lin_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for linear velocities. </p>
	 * @see #__DNA__FIELD__lin_sleep_thresh
	 */
	
	public void setLin_sleep_thresh(float lin_sleep_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, lin_sleep_thresh);
		} else {
			__io__block.writeFloat(__io__address + 40, lin_sleep_thresh);
		}
	}

	/**
	 * Get method for struct member 'ang_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for angular velocities. </p>
	 * @see #__DNA__FIELD__ang_sleep_thresh
	 */
	
	public float getAng_sleep_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'ang_sleep_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deactivation threshold for angular velocities. </p>
	 * @see #__DNA__FIELD__ang_sleep_thresh
	 */
	
	public void setAng_sleep_thresh(float ang_sleep_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, ang_sleep_thresh);
		} else {
			__io__block.writeFloat(__io__address + 44, ang_sleep_thresh);
		}
	}

	/**
	 * Get method for struct member 'orn'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body orientation. </p>
	 * @see #__DNA__FIELD__orn
	 */
	
	public CArrayFacade<Float> getOrn() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'orn'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body orientation. </p>
	 * @see #__DNA__FIELD__orn
	 */
	
	public void setOrn(CArrayFacade<Float> orn) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(orn, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, orn)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, orn);
		} else {
			__io__generic__copy( getOrn(), orn);
		}
	}

	/**
	 * Get method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body position. </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public CArrayFacade<Float> getPos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid body position. </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public void setPos(CArrayFacade<Float> pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pos);
		} else {
			__io__generic__copy( getPos(), pos);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'shared'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This pointer is shared between all evaluated copies. </p>
	 * @see #__DNA__FIELD__shared
	 */
	
	public CPointer<Object> getShared() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shared'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This pointer is shared between all evaluated copies. </p>
	 * @see #__DNA__FIELD__shared
	 */
	
	public void setShared(CPointer<Object> shared) throws IOException
	{
		long __address = ((shared == null) ? 0 : shared.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RigidBodyOb> __io__addressof() {
		return new CPointer<RigidBodyOb>(__io__address, new Class[]{RigidBodyOb.class}, __io__block, __io__blockTable);
	}

}
