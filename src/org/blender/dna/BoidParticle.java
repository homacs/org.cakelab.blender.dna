package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidParticle'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=52, size64=56)
public class BoidParticle extends CFacade {

	/**
	 * This is the sdna index of the struct BoidParticle.
	 * <p>
	 * It is required when allocating a new block to store data for BoidParticle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 474;

	/**
	 * Field descriptor (offset) for struct member 'ground'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidParticle boidparticle = ...;
	 * CPointer&lt;Object&gt; p = boidparticle.__dna__addressof(BoidParticle.__DNA__FIELD__ground);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ground = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ground'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ground = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidParticle boidparticle = ...;
	 * CPointer&lt;Object&gt; p = boidparticle.__dna__addressof(BoidParticle.__DNA__FIELD__data);
	 * CPointer&lt;BoidData&gt; p_data = p.cast(new Class[]{BoidData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'BoidData'</li>
	 * <li>Actual Size (32bit/64bit): 20/20</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidParticle boidparticle = ...;
	 * CPointer&lt;Object&gt; p = boidparticle.__dna__addressof(BoidParticle.__DNA__FIELD__gravity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gravity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'wander'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidParticle boidparticle = ...;
	 * CPointer&lt;Object&gt; p = boidparticle.__dna__addressof(BoidParticle.__DNA__FIELD__wander);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_wander = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wander'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wander = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidParticle boidparticle = ...;
	 * CPointer&lt;Object&gt; p = boidparticle.__dna__addressof(BoidParticle.__DNA__FIELD__rt);
	 * CPointer&lt;Float&gt; p_rt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{48, 52};

	public BoidParticle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidParticle(BoidParticle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ground'.
	 * @see #__DNA__FIELD__ground
	 */
	
	public CPointer<BlenderObject> getGround() throws IOException
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
	 * Set method for struct member 'ground'.
	 * @see #__DNA__FIELD__ground
	 */
	
	public void setGround(CPointer<BlenderObject> ground) throws IOException
	{
		long __address = ((ground == null) ? 0 : ground.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public BoidData getData() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BoidData(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new BoidData(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(BoidData data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data);
		} else {
			__io__generic__copy( getData(), data);
		}
	}

	/**
	 * Get method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public CArrayFacade<Float> getGravity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(CArrayFacade<Float> gravity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(gravity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gravity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gravity);
		} else {
			__io__generic__copy( getGravity(), gravity);
		}
	}

	/**
	 * Get method for struct member 'wander'.
	 * @see #__DNA__FIELD__wander
	 */
	
	public CArrayFacade<Float> getWander() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wander'.
	 * @see #__DNA__FIELD__wander
	 */
	
	public void setWander(CArrayFacade<Float> wander) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(wander, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wander)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wander);
		} else {
			__io__generic__copy( getWander(), wander);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public float getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(float rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, rt);
		} else {
			__io__block.writeFloat(__io__address + 48, rt);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidParticle> __io__addressof() {
		return new CPointer<BoidParticle>(__io__address, new Class[]{BoidParticle.class}, __io__block, __io__blockTable);
	}

}
