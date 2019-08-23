package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidRuleFollowLeader'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=92, size64=104)
public class BoidRuleFollowLeader extends CFacade {

	/**
	 * This is the sdna index of the struct BoidRuleFollowLeader.
	 * <p>
	 * It is required when allocating a new block to store data for BoidRuleFollowLeader.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 533;

	/**
	 * Field descriptor (offset) for struct member 'rule'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__rule);
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
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__ob);
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
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{52, 64};

	/**
	 * Field descriptor (offset) for struct member 'oloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__oloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_oloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oloc = new long[]{64, 76};

	/**
	 * Field descriptor (offset) for struct member 'cfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__cfra);
	 * CPointer&lt;Float&gt; p_cfra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cfra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cfra = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance behind leader to follow
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{80, 92};

	/**
	 * Field descriptor (offset) for struct member 'options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__options);
	 * CPointer&lt;Integer&gt; p_options = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'options'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__options = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'queue_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidRuleFollowLeader boidrulefollowleader = ...;
	 * CPointer&lt;Object&gt; p = boidrulefollowleader.__dna__addressof(BoidRuleFollowLeader.__DNA__FIELD__queue_size);
	 * CPointer&lt;Integer&gt; p_queue_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'queue_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__queue_size = new long[]{88, 100};

	public BoidRuleFollowLeader(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidRuleFollowLeader(BoidRuleFollowLeader that) {
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
	 * Get method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'oloc'.
	 * @see #__DNA__FIELD__oloc
	 */
	
	public CArrayFacade<Float> getOloc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'oloc'.
	 * @see #__DNA__FIELD__oloc
	 */
	
	public void setOloc(CArrayFacade<Float> oloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(oloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, oloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, oloc);
		} else {
			__io__generic__copy( getOloc(), oloc);
		}
	}

	/**
	 * Get method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public float getCfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public void setCfra(float cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, cfra);
		} else {
			__io__block.writeFloat(__io__address + 76, cfra);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance behind leader to follow
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance behind leader to follow
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, distance);
		} else {
			__io__block.writeFloat(__io__address + 80, distance);
		}
	}

	/**
	 * Get method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public int getOptions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public void setOptions(int options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, options);
		} else {
			__io__block.writeInt(__io__address + 84, options);
		}
	}

	/**
	 * Get method for struct member 'queue_size'.
	 * @see #__DNA__FIELD__queue_size
	 */
	
	public int getQueue_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'queue_size'.
	 * @see #__DNA__FIELD__queue_size
	 */
	
	public void setQueue_size(int queue_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, queue_size);
		} else {
			__io__block.writeInt(__io__address + 88, queue_size);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidRuleFollowLeader> __io__addressof() {
		return new CPointer<BoidRuleFollowLeader>(__io__address, new Class[]{BoidRuleFollowLeader.class}, __io__block, __io__blockTable);
	}

}
