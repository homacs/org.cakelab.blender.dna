package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidRuleAvoidCollision'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=56, size64=64)
public class BoidRuleAvoidCollision extends CFacade {

	/**
	 * This is the sdna index of the struct BoidRuleAvoidCollision.
	 * <p>
	 * It is required when allocating a new block to store data for BoidRuleAvoidCollision.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 537;

	/**
	 * Field descriptor (offset) for struct member 'rule'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAvoidCollision boidruleavoidcollision = ...;
	 * CPointer&lt;Object&gt; p = boidruleavoidcollision.__dna__addressof(BoidRuleAvoidCollision.__DNA__FIELD__rule);
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
	 * Field descriptor (offset) for struct member 'options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAvoidCollision boidruleavoidcollision = ...;
	 * CPointer&lt;Object&gt; p = boidruleavoidcollision.__dna__addressof(BoidRuleAvoidCollision.__DNA__FIELD__options);
	 * CPointer&lt;Integer&gt; p_options = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'options'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__options = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'look_ahead'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time to look ahead in seconds
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleAvoidCollision boidruleavoidcollision = ...;
	 * CPointer&lt;Object&gt; p = boidruleavoidcollision.__dna__addressof(BoidRuleAvoidCollision.__DNA__FIELD__look_ahead);
	 * CPointer&lt;Float&gt; p_look_ahead = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'look_ahead'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__look_ahead = new long[]{52, 60};

	public BoidRuleAvoidCollision(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidRuleAvoidCollision(BoidRuleAvoidCollision that) {
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
	 * Get method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public int getOptions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public void setOptions(int options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, options);
		} else {
			__io__block.writeInt(__io__address + 48, options);
		}
	}

	/**
	 * Get method for struct member 'look_ahead'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time to look ahead in seconds
	 * @see #__DNA__FIELD__look_ahead
	 */
	
	public float getLook_ahead() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'look_ahead'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time to look ahead in seconds
	 * @see #__DNA__FIELD__look_ahead
	 */
	
	public void setLook_ahead(float look_ahead) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, look_ahead);
		} else {
			__io__block.writeFloat(__io__address + 52, look_ahead);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidRuleAvoidCollision> __io__addressof() {
		return new CPointer<BoidRuleAvoidCollision>(__io__address, new Class[]{BoidRuleAvoidCollision.class}, __io__block, __io__blockTable);
	}

}
