package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexWave'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=964, size64=968)
public class NodeTexWave extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexWave.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexWave.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 411;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexWave nodetexwave = ...;
	 * CPointer&lt;Object&gt; p = nodetexwave.__dna__addressof(NodeTexWave.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 956/960</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'wave_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexWave nodetexwave = ...;
	 * CPointer&lt;Object&gt; p = nodetexwave.__dna__addressof(NodeTexWave.__DNA__FIELD__wave_type);
	 * CPointer&lt;Integer&gt; p_wave_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_type = new long[]{956, 960};

	/**
	 * Field descriptor (offset) for struct member 'wave_profile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexWave nodetexwave = ...;
	 * CPointer&lt;Object&gt; p = nodetexwave.__dna__addressof(NodeTexWave.__DNA__FIELD__wave_profile);
	 * CPointer&lt;Integer&gt; p_wave_profile = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_profile'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_profile = new long[]{960, 964};

	public NodeTexWave(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexWave(NodeTexWave that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public NodeTexBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(NodeTexBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'wave_type'.
	 * @see #__DNA__FIELD__wave_type
	 */
	
	public int getWave_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 960);
		} else {
			return __io__block.readInt(__io__address + 956);
		}
	}

	/**
	 * Set method for struct member 'wave_type'.
	 * @see #__DNA__FIELD__wave_type
	 */
	
	public void setWave_type(int wave_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 960, wave_type);
		} else {
			__io__block.writeInt(__io__address + 956, wave_type);
		}
	}

	/**
	 * Get method for struct member 'wave_profile'.
	 * @see #__DNA__FIELD__wave_profile
	 */
	
	public int getWave_profile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 964);
		} else {
			return __io__block.readInt(__io__address + 960);
		}
	}

	/**
	 * Set method for struct member 'wave_profile'.
	 * @see #__DNA__FIELD__wave_profile
	 */
	
	public void setWave_profile(int wave_profile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 964, wave_profile);
		} else {
			__io__block.writeInt(__io__address + 960, wave_profile);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexWave> __io__addressof() {
		return new CPointer<NodeTexWave>(__io__address, new Class[]{NodeTexWave.class}, __io__block, __io__blockTable);
	}

}
