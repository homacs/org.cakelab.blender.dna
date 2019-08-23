package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleKey'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=56, size64=56)
public class ParticleKey extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleKey.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleKey.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 477;

	/**
	 * Field descriptor (offset) for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> when changed update size of struct to copy_particleKey()!! location </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleKey particlekey = ...;
	 * CPointer&lt;Object&gt; p = particlekey.__dna__addressof(ParticleKey.__DNA__FIELD__co);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_co = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'co'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__co = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> velocity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleKey particlekey = ...;
	 * CPointer&lt;Object&gt; p = particlekey.__dna__addressof(ParticleKey.__DNA__FIELD__vel);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vel = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation quaternion </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleKey particlekey = ...;
	 * CPointer&lt;Object&gt; p = particlekey.__dna__addressof(ParticleKey.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'ave'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleKey particlekey = ...;
	 * CPointer&lt;Object&gt; p = particlekey.__dna__addressof(ParticleKey.__DNA__FIELD__ave);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ave = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ave'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ave = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time of key over the simulation<h4>Blender Source Code:</h4>
	 * <p> when this key happens </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleKey particlekey = ...;
	 * CPointer&lt;Object&gt; p = particlekey.__dna__addressof(ParticleKey.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{52, 52};

	public ParticleKey(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleKey(ParticleKey that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> when changed update size of struct to copy_particleKey()!! location </p>
	 * @see #__DNA__FIELD__co
	 */
	
	public CArrayFacade<Float> getCo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> when changed update size of struct to copy_particleKey()!! location </p>
	 * @see #__DNA__FIELD__co
	 */
	
	public void setCo(CArrayFacade<Float> co) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(co, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, co)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, co);
		} else {
			__io__generic__copy( getCo(), co);
		}
	}

	/**
	 * Get method for struct member 'vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> velocity </p>
	 * @see #__DNA__FIELD__vel
	 */
	
	public CArrayFacade<Float> getVel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> velocity </p>
	 * @see #__DNA__FIELD__vel
	 */
	
	public void setVel(CArrayFacade<Float> vel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(vel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vel);
		} else {
			__io__generic__copy( getVel(), vel);
		}
	}

	/**
	 * Get method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation quaternion </p>
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rotation quaternion </p>
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot);
		} else {
			__io__generic__copy( getRot(), rot);
		}
	}

	/**
	 * Get method for struct member 'ave'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity </p>
	 * @see #__DNA__FIELD__ave
	 */
	
	public CArrayFacade<Float> getAve() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ave'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular velocity </p>
	 * @see #__DNA__FIELD__ave
	 */
	
	public void setAve(CArrayFacade<Float> ave) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(ave, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ave)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ave);
		} else {
			__io__generic__copy( getAve(), ave);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time of key over the simulation<h4>Blender Source Code:</h4>
	 * <p> when this key happens </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time of key over the simulation<h4>Blender Source Code:</h4>
	 * <p> when this key happens </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, time);
		} else {
			__io__block.writeFloat(__io__address + 52, time);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleKey> __io__addressof() {
		return new CPointer<ParticleKey>(__io__address, new Class[]{ParticleKey.class}, __io__block, __io__blockTable);
	}

}
