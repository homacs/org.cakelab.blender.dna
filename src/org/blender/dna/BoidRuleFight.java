package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidRuleFight'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=56, size64=64)
public class BoidRuleFight extends CFacade {

	/**
	 * This is the sdna index of the struct BoidRuleFight.
	 * <p>
	 * It is required when allocating a new block to store data for BoidRuleFight.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 540;

	/**
	 * Field descriptor (offset) for struct member 'rule'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFight boidrulefight = ...;
	 * CPointer&lt;Object&gt; p = boidrulefight.__dna__addressof(BoidRuleFight.__DNA__FIELD__rule);
	 * CPointer&lt;BoidRule&gt; p_rule = p.cast(new Class[]{BoidRule.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rule'</li>
	 * <li>Signature: 'BoidRule'</li>
	 * <li>Actual Size (32bit/64bit): 48/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rule = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attack boids at max this distance
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFight boidrulefight = ...;
	 * CPointer&lt;Object&gt; p = boidrulefight.__dna__addressof(BoidRuleFight.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'flee_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Flee to this distance
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFight boidrulefight = ...;
	 * CPointer&lt;Object&gt; p = boidrulefight.__dna__addressof(BoidRuleFight.__DNA__FIELD__flee_distance);
	 * CPointer&lt;Float&gt; p_flee_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flee_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flee_distance = new long[]{52, 60};

	public BoidRuleFight(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidRuleFight(BoidRuleFight that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'rule'.
	 * @see #__DNA__FIELD__rule
	 */
	
	public BoidRule getRule() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BoidRule(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new BoidRule(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rule'.
	 * @see #__DNA__FIELD__rule
	 */
	
	public void setRule(BoidRule rule) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(rule, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rule)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rule);
		} else {
			__io__generic__copy( getRule(), rule);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attack boids at max this distance
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attack boids at max this distance
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, distance);
		} else {
			__io__block.writeFloat(__io__address + 48, distance);
		}
	}

	/**
	 * Get method for struct member 'flee_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Flee to this distance
	 * @see #__DNA__FIELD__flee_distance
	 */
	
	public float getFlee_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'flee_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Flee to this distance
	 * @see #__DNA__FIELD__flee_distance
	 */
	
	public void setFlee_distance(float flee_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, flee_distance);
		} else {
			__io__block.writeFloat(__io__address + 52, flee_distance);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidRuleFight> __io__addressof() {
		return new CPointer<BoidRuleFight>(__io__address, new Class[]{BoidRuleFight.class}, __io__block, __io__blockTable);
	}

}
