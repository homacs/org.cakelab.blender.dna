package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RigidBodyWorld'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link RigidBodyWorld}  (rbw)</p><p> Represents a "simulation scene" existing within the parent scene. </p>
 */

@CMetaData(size32=56, size64=88)
public class RigidBodyWorld extends CFacade {

	/**
	 * This is the sdna index of the struct RigidBodyWorld.
	 * <p>
	 * It is required when allocating a new block to store data for RigidBodyWorld.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 707;

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Sim {@link World}  Settings ----------------------------------------------------------<mdash/>  Effectors info. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Bodies. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array to access group objects by index, only used at runtime. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__objects);
	 * CPointer&lt;CPointer&lt;CPointer&lt;BlenderObject&gt;&gt;&gt; p_objects = p.cast(new Class[]{CPointer.class, CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'objects'</li>
	 * <li>Signature: 'Object**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__objects = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Collection containing rigid body constraint objects<h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Body Constraints. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__constraints);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_constraints = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constraints'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constraints = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'ltime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last frame world was evaluated for (internal). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__ltime);
	 * CPointer&lt;Float&gt; p_ltime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ltime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ltime = new long[]{20, 36};

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
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__shared);
	 * CPointer&lt;CPointer&lt;RigidBodyWorld_Shared&gt;&gt; p_shared = p.cast(new Class[]{CPointer.class, RigidBodyWorld_Shared.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shared'</li>
	 * <li>Signature: 'RigidBodyWorld_Shared*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shared = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__pointcache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_pointcache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointcache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointcache = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{32, 56};

	/**
	 * Field descriptor (offset) for struct member 'numbodies'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of objects in rigid body group. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__numbodies);
	 * CPointer&lt;Integer&gt; p_numbodies = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numbodies'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numbodies = new long[]{40, 72};

	/**
	 * Field descriptor (offset) for struct member 'steps_per_second'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__steps_per_second);
	 * CPointer&lt;Short&gt; p_steps_per_second = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'steps_per_second'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__steps_per_second = new long[]{44, 76};

	/**
	 * Field descriptor (offset) for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of constraint solver iterations made per simulation step. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__num_solver_iterations);
	 * CPointer&lt;Short&gt; p_num_solver_iterations = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_solver_iterations'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_solver_iterations = new long[]{46, 78};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link eRigidBodyWorld_Flag} ) settings for this {@link RigidBodyWorld} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{48, 80};

	/**
	 * Field descriptor (offset) for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the speed of the simulation<h4>Blender Source Code:</h4>
	 * <p> Used to speed up or slow down the simulation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld rigidbodyworld = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld.__dna__addressof(RigidBodyWorld.__DNA__FIELD__time_scale);
	 * CPointer&lt;Float&gt; p_time_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_scale = new long[]{52, 84};

	public RigidBodyWorld(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RigidBodyWorld(RigidBodyWorld that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Sim {@link World}  Settings ----------------------------------------------------------<mdash/>  Effectors info. </p>
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Sim {@link World}  Settings ----------------------------------------------------------<mdash/>  Effectors info. </p>
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Bodies. </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public CPointer<Collection> getGroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Bodies. </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CPointer<Collection> group) throws IOException
	{
		long __address = ((group == null) ? 0 : group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array to access group objects by index, only used at runtime. </p>
	 * @see #__DNA__FIELD__objects
	 */
	
	public CPointer<CPointer<BlenderObject>> getObjects() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, BlenderObject.class};
		return new CPointer<CPointer<BlenderObject>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array to access group objects by index, only used at runtime. </p>
	 * @see #__DNA__FIELD__objects
	 */
	
	public void setObjects(CPointer<CPointer<BlenderObject>> objects) throws IOException
	{
		long __address = ((objects == null) ? 0 : objects.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Collection containing rigid body constraint objects<h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Body Constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public CPointer<Collection> getConstraints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'constraints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Collection containing rigid body constraint objects<h4>Blender Source Code:</h4>
	 * <p> Group containing objects to use for Rigid Body Constraints. </p>
	 * @see #__DNA__FIELD__constraints
	 */
	
	public void setConstraints(CPointer<Collection> constraints) throws IOException
	{
		long __address = ((constraints == null) ? 0 : constraints.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'ltime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last frame world was evaluated for (internal). </p>
	 * @see #__DNA__FIELD__ltime
	 */
	
	public float getLtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'ltime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last frame world was evaluated for (internal). </p>
	 * @see #__DNA__FIELD__ltime
	 */
	
	public void setLtime(float ltime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, ltime);
		} else {
			__io__block.writeFloat(__io__address + 20, ltime);
		}
	}

	/**
	 * Get method for struct member 'shared'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This pointer is shared between all evaluated copies. </p>
	 * @see #__DNA__FIELD__shared
	 */
	
	public CPointer<RigidBodyWorld_Shared> getShared() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyWorld_Shared.class};
		return new CPointer<RigidBodyWorld_Shared>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyWorld_Shared.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shared'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This pointer is shared between all evaluated copies. </p>
	 * @see #__DNA__FIELD__shared
	 */
	
	public void setShared(CPointer<RigidBodyWorld_Shared> shared) throws IOException
	{
		long __address = ((shared == null) ? 0 : shared.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public CPointer<PointCache> getPointcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public void setPointcache(CPointer<PointCache> pointcache) throws IOException
	{
		long __address = ((pointcache == null) ? 0 : pointcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(ListBase ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 32;
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
	 * Get method for struct member 'numbodies'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of objects in rigid body group. </p>
	 * @see #__DNA__FIELD__numbodies
	 */
	
	public int getNumbodies() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'numbodies'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of objects in rigid body group. </p>
	 * @see #__DNA__FIELD__numbodies
	 */
	
	public void setNumbodies(int numbodies) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, numbodies);
		} else {
			__io__block.writeInt(__io__address + 40, numbodies);
		}
	}

	/**
	 * Get method for struct member 'steps_per_second'.
	 * @see #__DNA__FIELD__steps_per_second
	 */
	
	public short getSteps_per_second() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'steps_per_second'.
	 * @see #__DNA__FIELD__steps_per_second
	 */
	
	public void setSteps_per_second(short steps_per_second) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, steps_per_second);
		} else {
			__io__block.writeShort(__io__address + 44, steps_per_second);
		}
	}

	/**
	 * Get method for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of constraint solver iterations made per simulation step. </p>
	 * @see #__DNA__FIELD__num_solver_iterations
	 */
	
	public short getNum_solver_iterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 78);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'num_solver_iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of constraint solver iterations made per simulation step. </p>
	 * @see #__DNA__FIELD__num_solver_iterations
	 */
	
	public void setNum_solver_iterations(short num_solver_iterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 78, num_solver_iterations);
		} else {
			__io__block.writeShort(__io__address + 46, num_solver_iterations);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link eRigidBodyWorld_Flag} ) settings for this {@link RigidBodyWorld} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link eRigidBodyWorld_Flag} ) settings for this {@link RigidBodyWorld} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, flag);
		} else {
			__io__block.writeInt(__io__address + 48, flag);
		}
	}

	/**
	 * Get method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the speed of the simulation<h4>Blender Source Code:</h4>
	 * <p> Used to speed up or slow down the simulation. </p>
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public float getTime_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the speed of the simulation<h4>Blender Source Code:</h4>
	 * <p> Used to speed up or slow down the simulation. </p>
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public void setTime_scale(float time_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, time_scale);
		} else {
			__io__block.writeFloat(__io__address + 52, time_scale);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RigidBodyWorld> __io__addressof() {
		return new CPointer<RigidBodyWorld>(__io__address, new Class[]{RigidBodyWorld.class}, __io__block, __io__blockTable);
	}

}
