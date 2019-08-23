package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RigidBodyWorld_Shared'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  RigidBody {@link World}  Container for data shared by original and evaluated copies of {@link RigidBodyWorld}  </p>
 */

@CMetaData(size32=16, size64=32)
public class RigidBodyWorld_Shared extends CFacade {

	/**
	 * This is the sdna index of the struct RigidBodyWorld_Shared.
	 * <p>
	 * It is required when allocating a new block to store data for RigidBodyWorld_Shared.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 579;

	/**
	 * Field descriptor (offset) for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld_Shared rigidbodyworld_shared = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld_shared.__dna__addressof(RigidBodyWorld_Shared.__DNA__FIELD__pointcache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_pointcache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointcache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointcache = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld_Shared rigidbodyworld_shared = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld_shared.__dna__addressof(RigidBodyWorld_Shared.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'physics_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim objects. Exist at runtime only ----------------<mdash/><mdash/>  Physics sim world (i.e. btDiscreteDynamicsWorld). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RigidBodyWorld_Shared rigidbodyworld_shared = ...;
	 * CPointer&lt;Object&gt; p = rigidbodyworld_shared.__dna__addressof(RigidBodyWorld_Shared.__DNA__FIELD__physics_world);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_physics_world = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physics_world'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physics_world = new long[]{12, 24};

	public RigidBodyWorld_Shared(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RigidBodyWorld_Shared(RigidBodyWorld_Shared that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public CPointer<PointCache> getPointcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache </p>
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public void setPointcache(CPointer<PointCache> pointcache) throws IOException
	{
		long __address = ((pointcache == null) ? 0 : pointcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4, __io__block, __io__blockTable);
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
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
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
	 * Get method for struct member 'physics_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim objects. Exist at runtime only ----------------<mdash/><mdash/>  Physics sim world (i.e. btDiscreteDynamicsWorld). </p>
	 * @see #__DNA__FIELD__physics_world
	 */
	
	public CPointer<Object> getPhysics_world() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'physics_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> References to Physics Sim objects. Exist at runtime only ----------------<mdash/><mdash/>  Physics sim world (i.e. btDiscreteDynamicsWorld). </p>
	 * @see #__DNA__FIELD__physics_world
	 */
	
	public void setPhysics_world(CPointer<Object> physics_world) throws IOException
	{
		long __address = ((physics_world == null) ? 0 : physics_world.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RigidBodyWorld_Shared> __io__addressof() {
		return new CPointer<RigidBodyWorld_Shared>(__io__address, new Class[]{RigidBodyWorld_Shared.class}, __io__block, __io__blockTable);
	}

}
