package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidRuleGoalAvoid'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=80)
public class BoidRuleGoalAvoid extends CFacade {

	/**
	 * This is the sdna index of the struct BoidRuleGoalAvoid.
	 * <p>
	 * It is required when allocating a new block to store data for BoidRuleGoalAvoid.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 527;

	/**
	 * Field descriptor (offset) for struct member 'rule'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__rule);
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
	 * Field descriptor (offset) for struct member 'ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__options);
	 * CPointer&lt;Integer&gt; p_options = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'options'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__options = new long[]{52, 64};

	/**
	 * Field descriptor (offset) for struct member 'fear_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__fear_factor);
	 * CPointer&lt;Float&gt; p_fear_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fear_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fear_factor = new long[]{56, 68};

	/**
	 * Field descriptor (offset) for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signals </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__signal_id);
	 * CPointer&lt;Integer&gt; p_signal_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'signal_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__signal_id = new long[]{60, 72};

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleGoalAvoid boidrulegoalavoid = ...;
	 * CPointer&lt;Object&gt; p = boidrulegoalavoid.__dna__addressof(BoidRuleGoalAvoid.__DNA__FIELD__channels);
	 * CPointer&lt;Integer&gt; p_channels = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{64, 76};

	public BoidRuleGoalAvoid(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidRuleGoalAvoid(BoidRuleGoalAvoid that) {
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
	 * Get method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public CPointer<BlenderObject> getOb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public void setOb(CPointer<BlenderObject> ob) throws IOException
	{
		long __address = ((ob == null) ? 0 : ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public int getOptions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public void setOptions(int options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, options);
		} else {
			__io__block.writeInt(__io__address + 52, options);
		}
	}

	/**
	 * Get method for struct member 'fear_factor'.
	 * @see #__DNA__FIELD__fear_factor
	 */
	
	public float getFear_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'fear_factor'.
	 * @see #__DNA__FIELD__fear_factor
	 */
	
	public void setFear_factor(float fear_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, fear_factor);
		} else {
			__io__block.writeFloat(__io__address + 56, fear_factor);
		}
	}

	/**
	 * Get method for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signals </p>
	 * @see #__DNA__FIELD__signal_id
	 */
	
	public int getSignal_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signals </p>
	 * @see #__DNA__FIELD__signal_id
	 */
	
	public void setSignal_id(int signal_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, signal_id);
		} else {
			__io__block.writeInt(__io__address + 60, signal_id);
		}
	}

	/**
	 * Get method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public int getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(int channels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, channels);
		} else {
			__io__block.writeInt(__io__address + 64, channels);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidRuleGoalAvoid> __io__addressof() {
		return new CPointer<BoidRuleGoalAvoid>(__io__address, new Class[]{BoidRuleGoalAvoid.class}, __io__block, __io__blockTable);
	}

}
