package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexBrick'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=980, size64=984)
public class NodeTexBrick extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexBrick.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexBrick.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 437;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBrick nodetexbrick = ...;
	 * CPointer&lt;Object&gt; p = nodetexbrick.__dna__addressof(NodeTexBrick.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 964/968</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset_freq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBrick nodetexbrick = ...;
	 * CPointer&lt;Object&gt; p = nodetexbrick.__dna__addressof(NodeTexBrick.__DNA__FIELD__offset_freq);
	 * CPointer&lt;Integer&gt; p_offset_freq = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_freq'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_freq = new long[]{964, 968};

	/**
	 * Field descriptor (offset) for struct member 'squash_freq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBrick nodetexbrick = ...;
	 * CPointer&lt;Object&gt; p = nodetexbrick.__dna__addressof(NodeTexBrick.__DNA__FIELD__squash_freq);
	 * CPointer&lt;Integer&gt; p_squash_freq = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'squash_freq'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__squash_freq = new long[]{968, 972};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBrick nodetexbrick = ...;
	 * CPointer&lt;Object&gt; p = nodetexbrick.__dna__addressof(NodeTexBrick.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{972, 976};

	/**
	 * Field descriptor (offset) for struct member 'squash'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBrick nodetexbrick = ...;
	 * CPointer&lt;Object&gt; p = nodetexbrick.__dna__addressof(NodeTexBrick.__DNA__FIELD__squash);
	 * CPointer&lt;Float&gt; p_squash = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'squash'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__squash = new long[]{976, 980};

	public NodeTexBrick(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexBrick(NodeTexBrick that) {
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
	 * Get method for struct member 'offset_freq'.
	 * @see #__DNA__FIELD__offset_freq
	 */
	
	public int getOffset_freq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 968);
		} else {
			return __io__block.readInt(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'offset_freq'.
	 * @see #__DNA__FIELD__offset_freq
	 */
	
	public void setOffset_freq(int offset_freq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 968, offset_freq);
		} else {
			__io__block.writeInt(__io__address + 964, offset_freq);
		}
	}

	/**
	 * Get method for struct member 'squash_freq'.
	 * @see #__DNA__FIELD__squash_freq
	 */
	
	public int getSquash_freq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 972);
		} else {
			return __io__block.readInt(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'squash_freq'.
	 * @see #__DNA__FIELD__squash_freq
	 */
	
	public void setSquash_freq(int squash_freq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 972, squash_freq);
		} else {
			__io__block.writeInt(__io__address + 968, squash_freq);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 976);
		} else {
			return __io__block.readFloat(__io__address + 972);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 976, offset);
		} else {
			__io__block.writeFloat(__io__address + 972, offset);
		}
	}

	/**
	 * Get method for struct member 'squash'.
	 * @see #__DNA__FIELD__squash
	 */
	
	public float getSquash() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 980);
		} else {
			return __io__block.readFloat(__io__address + 976);
		}
	}

	/**
	 * Set method for struct member 'squash'.
	 * @see #__DNA__FIELD__squash
	 */
	
	public void setSquash(float squash) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 980, squash);
		} else {
			__io__block.writeFloat(__io__address + 976, squash);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexBrick> __io__addressof() {
		return new CPointer<NodeTexBrick>(__io__address, new Class[]{NodeTexBrick.class}, __io__block, __io__blockTable);
	}

}
