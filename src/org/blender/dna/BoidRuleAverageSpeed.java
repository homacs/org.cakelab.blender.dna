package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidRuleAverageSpeed'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=72)
public class BoidRuleAverageSpeed extends CFacade {

	/**
	 * This is the sdna index of the struct BoidRuleAverageSpeed.
	 * <p>
	 * It is required when allocating a new block to store data for BoidRuleAverageSpeed.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 530;

	/**
	 * Field descriptor (offset) for struct member 'rule'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAverageSpeed boidruleaveragespeed = ...;
	 * CPointer&lt;Object&gt; p = boidruleaveragespeed.__dna__addressof(BoidRuleAverageSpeed.__DNA__FIELD__rule);
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
	 * Field descriptor (offset) for struct member 'wander'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast velocity's direction is randomized
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAverageSpeed boidruleaveragespeed = ...;
	 * CPointer&lt;Object&gt; p = boidruleaveragespeed.__dna__addressof(BoidRuleAverageSpeed.__DNA__FIELD__wander);
	 * CPointer&lt;Float&gt; p_wander = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wander'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wander = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much velocity's z-component is kept constant
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAverageSpeed boidruleaveragespeed = ...;
	 * CPointer&lt;Object&gt; p = boidruleaveragespeed.__dna__addressof(BoidRuleAverageSpeed.__DNA__FIELD__level);
	 * CPointer&lt;Float&gt; p_level = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level = new long[]{52, 60};

	/**
	 * Field descriptor (offset) for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Percentage of maximum speed
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAverageSpeed boidruleaveragespeed = ...;
	 * CPointer&lt;Object&gt; p = boidruleaveragespeed.__dna__addressof(BoidRuleAverageSpeed.__DNA__FIELD__speed);
	 * CPointer&lt;Float&gt; p_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAverageSpeed boidruleaveragespeed = ...;
	 * CPointer&lt;Object&gt; p = boidruleaveragespeed.__dna__addressof(BoidRuleAverageSpeed.__DNA__FIELD__rt);
	 * CPointer&lt;Float&gt; p_rt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{60, 68};

	public BoidRuleAverageSpeed(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidRuleAverageSpeed(BoidRuleAverageSpeed that) {
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
	 * Get method for struct member 'wander'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast velocity's direction is randomized
	 * @see #__DNA__FIELD__wander
	 */
	
	public float getWander() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'wander'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How fast velocity's direction is randomized
	 * @see #__DNA__FIELD__wander
	 */
	
	public void setWander(float wander) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, wander);
		} else {
			__io__block.writeFloat(__io__address + 48, wander);
		}
	}

	/**
	 * Get method for struct member 'level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much velocity's z-component is kept constant
	 * @see #__DNA__FIELD__level
	 */
	
	public float getLevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much velocity's z-component is kept constant
	 * @see #__DNA__FIELD__level
	 */
	
	public void setLevel(float level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, level);
		} else {
			__io__block.writeFloat(__io__address + 52, level);
		}
	}

	/**
	 * Get method for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Percentage of maximum speed
	 * @see #__DNA__FIELD__speed
	 */
	
	public float getSpeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Percentage of maximum speed
	 * @see #__DNA__FIELD__speed
	 */
	
	public void setSpeed(float speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, speed);
		} else {
			__io__block.writeFloat(__io__address + 56, speed);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public float getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(float rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, rt);
		} else {
			__io__block.writeFloat(__io__address + 60, rt);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidRuleAverageSpeed> __io__addressof() {
		return new CPointer<BoidRuleAverageSpeed>(__io__address, new Class[]{BoidRuleAverageSpeed.class}, __io__block, __io__blockTable);
	}

}
