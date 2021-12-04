package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ClothCollSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=72)
public class ClothCollSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ClothCollSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ClothCollSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 575;

	/**
	 * Field descriptor (offset) for struct member 'collision_list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> E.g. pointer to temp memory for collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__collision_list);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_collision_list = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision_list'</li>
	 * <li>Signature: 'LinkNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision_list = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'epsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Min distance for collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__epsilon);
	 * CPointer&lt;Float&gt; p_epsilon = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'epsilon'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__epsilon = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'self_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fiction/damping with self contact. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__self_friction);
	 * CPointer&lt;Float&gt; p_self_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'self_friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__self_friction = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction/damping applied on contact with other object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__friction);
	 * CPointer&lt;Float&gt; p_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__friction = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision restitution on contact with other object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__damping);
	 * CPointer&lt;Float&gt; p_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damping = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'selfepsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For selfcollision. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__selfepsilon);
	 * CPointer&lt;Float&gt; p_selfepsilon = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selfepsilon'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selfepsilon = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'repel_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__repel_force);
	 * CPointer&lt;Float&gt; p_repel_force = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repel_force'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repel_force = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'distance_repel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__distance_repel);
	 * CPointer&lt;Float&gt; p_distance_repel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance_repel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance_repel = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision flags defined in BKE_cloth.h. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'self_loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the selfcollision loop. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__self_loop_count);
	 * CPointer&lt;Short&gt; p_self_loop_count = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'self_loop_count'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__self_loop_count = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the collision loop. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__loop_count);
	 * CPointer&lt;Short&gt; p_loop_count = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loop_count'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loop_count = new long[]{38, 42};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use colliders from this group of objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{44, 48};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_selfcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for self collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__vgroup_selfcol);
	 * CPointer&lt;Short&gt; p_vgroup_selfcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_selfcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_selfcol = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_objcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for object collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__vgroup_objcol);
	 * CPointer&lt;Short&gt; p_vgroup_objcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_objcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_objcol = new long[]{50, 58};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{52, 60};

	/**
	 * Field descriptor (offset) for struct member 'clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for object collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__clamp);
	 * CPointer&lt;Float&gt; p_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clamp = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'self_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for self collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__self_clamp);
	 * CPointer&lt;Float&gt; p_self_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'self_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__self_clamp = new long[]{60, 68};

	public ClothCollSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ClothCollSettings(ClothCollSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'collision_list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> E.g. pointer to temp memory for collisions. </p>
	 * @see #__DNA__FIELD__collision_list
	 */
	
	public CPointer<Object> getCollision_list() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collision_list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> E.g. pointer to temp memory for collisions. </p>
	 * @see #__DNA__FIELD__collision_list
	 */
	
	public void setCollision_list(CPointer<Object> collision_list) throws IOException
	{
		long __address = ((collision_list == null) ? 0 : collision_list.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'epsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Min distance for collisions. </p>
	 * @see #__DNA__FIELD__epsilon
	 */
	
	public float getEpsilon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'epsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Min distance for collisions. </p>
	 * @see #__DNA__FIELD__epsilon
	 */
	
	public void setEpsilon(float epsilon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, epsilon);
		} else {
			__io__block.writeFloat(__io__address + 4, epsilon);
		}
	}

	/**
	 * Get method for struct member 'self_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fiction/damping with self contact. </p>
	 * @see #__DNA__FIELD__self_friction
	 */
	
	public float getSelf_friction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'self_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fiction/damping with self contact. </p>
	 * @see #__DNA__FIELD__self_friction
	 */
	
	public void setSelf_friction(float self_friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, self_friction);
		} else {
			__io__block.writeFloat(__io__address + 8, self_friction);
		}
	}

	/**
	 * Get method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction/damping applied on contact with other object. </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public float getFriction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction/damping applied on contact with other object. </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public void setFriction(float friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, friction);
		} else {
			__io__block.writeFloat(__io__address + 12, friction);
		}
	}

	/**
	 * Get method for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision restitution on contact with other object. </p>
	 * @see #__DNA__FIELD__damping
	 */
	
	public float getDamping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision restitution on contact with other object. </p>
	 * @see #__DNA__FIELD__damping
	 */
	
	public void setDamping(float damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, damping);
		} else {
			__io__block.writeFloat(__io__address + 16, damping);
		}
	}

	/**
	 * Get method for struct member 'selfepsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For selfcollision. </p>
	 * @see #__DNA__FIELD__selfepsilon
	 */
	
	public float getSelfepsilon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'selfepsilon'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For selfcollision. </p>
	 * @see #__DNA__FIELD__selfepsilon
	 */
	
	public void setSelfepsilon(float selfepsilon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, selfepsilon);
		} else {
			__io__block.writeFloat(__io__address + 20, selfepsilon);
		}
	}

	/**
	 * Get method for struct member 'repel_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__repel_force
	 */
	
	public float getRepel_force() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'repel_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__repel_force
	 */
	
	public void setRepel_force(float repel_force) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, repel_force);
		} else {
			__io__block.writeFloat(__io__address + 24, repel_force);
		}
	}

	/**
	 * Get method for struct member 'distance_repel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__distance_repel
	 */
	
	public float getDistance_repel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'distance_repel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__distance_repel
	 */
	
	public void setDistance_repel(float distance_repel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, distance_repel);
		} else {
			__io__block.writeFloat(__io__address + 28, distance_repel);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision flags defined in BKE_cloth.h. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision flags defined in BKE_cloth.h. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flags);
		} else {
			__io__block.writeInt(__io__address + 32, flags);
		}
	}

	/**
	 * Get method for struct member 'self_loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the selfcollision loop. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__self_loop_count
	 */
	
	public short getSelf_loop_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'self_loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the selfcollision loop. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__self_loop_count
	 */
	
	public void setSelf_loop_count(short self_loop_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, self_loop_count);
		} else {
			__io__block.writeShort(__io__address + 36, self_loop_count);
		}
	}

	/**
	 * Get method for struct member 'loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the collision loop. </p>
	 * @see #__DNA__FIELD__loop_count
	 */
	
	public short getLoop_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 38);
		}
	}

	/**
	 * Set method for struct member 'loop_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many iterations for the collision loop. </p>
	 * @see #__DNA__FIELD__loop_count
	 */
	
	public void setLoop_count(short loop_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, loop_count);
		} else {
			__io__block.writeShort(__io__address + 38, loop_count);
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
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 44;
		} else {
			__dna__offset = 40;
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
	 * Get method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use colliders from this group of objects. </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public CPointer<Collection> getGroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use colliders from this group of objects. </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CPointer<Collection> group) throws IOException
	{
		long __address = ((group == null) ? 0 : group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_selfcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for self collisions. </p>
	 * @see #__DNA__FIELD__vgroup_selfcol
	 */
	
	public short getVgroup_selfcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 56);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'vgroup_selfcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for self collisions. </p>
	 * @see #__DNA__FIELD__vgroup_selfcol
	 */
	
	public void setVgroup_selfcol(short vgroup_selfcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 56, vgroup_selfcol);
		} else {
			__io__block.writeShort(__io__address + 48, vgroup_selfcol);
		}
	}

	/**
	 * Get method for struct member 'vgroup_objcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for object collisions. </p>
	 * @see #__DNA__FIELD__vgroup_objcol
	 */
	
	public short getVgroup_objcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 58);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'vgroup_objcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vgroup to paint which vertices are not used for object collisions. </p>
	 * @see #__DNA__FIELD__vgroup_objcol
	 */
	
	public void setVgroup_objcol(short vgroup_objcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 58, vgroup_objcol);
		} else {
			__io__block.writeShort(__io__address + 50, vgroup_objcol);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for object collisions. </p>
	 * @see #__DNA__FIELD__clamp
	 */
	
	public float getClamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for object collisions. </p>
	 * @see #__DNA__FIELD__clamp
	 */
	
	public void setClamp(float clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, clamp);
		} else {
			__io__block.writeFloat(__io__address + 56, clamp);
		}
	}

	/**
	 * Get method for struct member 'self_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for self collisions. </p>
	 * @see #__DNA__FIELD__self_clamp
	 */
	
	public float getSelf_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'self_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Impulse clamp for self collisions. </p>
	 * @see #__DNA__FIELD__self_clamp
	 */
	
	public void setSelf_clamp(float self_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, self_clamp);
		} else {
			__io__block.writeFloat(__io__address + 60, self_clamp);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothCollSettings> __io__addressof() {
		return new CPointer<ClothCollSettings>(__io__address, new Class[]{ClothCollSettings.class}, __io__block, __io__blockTable);
	}

}
