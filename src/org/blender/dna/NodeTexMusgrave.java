package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexMusgrave'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=964, size64=968)
public class NodeTexMusgrave extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexMusgrave.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexMusgrave.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 463;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMusgrave nodetexmusgrave = ...;
	 * CPointer&lt;Object&gt; p = nodetexmusgrave.__dna__addressof(NodeTexMusgrave.__DNA__FIELD__base);
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
	 * Field descriptor (offset) for struct member 'musgrave_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMusgrave nodetexmusgrave = ...;
	 * CPointer&lt;Object&gt; p = nodetexmusgrave.__dna__addressof(NodeTexMusgrave.__DNA__FIELD__musgrave_type);
	 * CPointer&lt;Integer&gt; p_musgrave_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'musgrave_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__musgrave_type = new long[]{956, 960};

	/**
	 * Field descriptor (offset) for struct member 'dimensions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMusgrave nodetexmusgrave = ...;
	 * CPointer&lt;Object&gt; p = nodetexmusgrave.__dna__addressof(NodeTexMusgrave.__DNA__FIELD__dimensions);
	 * CPointer&lt;Integer&gt; p_dimensions = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dimensions'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dimensions = new long[]{960, 964};

	public NodeTexMusgrave(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexMusgrave(NodeTexMusgrave that) {
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
	 * Get method for struct member 'musgrave_type'.
	 * @see #__DNA__FIELD__musgrave_type
	 */
	
	public int getMusgrave_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 960);
		} else {
			return __io__block.readInt(__io__address + 956);
		}
	}

	/**
	 * Set method for struct member 'musgrave_type'.
	 * @see #__DNA__FIELD__musgrave_type
	 */
	
	public void setMusgrave_type(int musgrave_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 960, musgrave_type);
		} else {
			__io__block.writeInt(__io__address + 956, musgrave_type);
		}
	}

	/**
	 * Get method for struct member 'dimensions'.
	 * @see #__DNA__FIELD__dimensions
	 */
	
	public int getDimensions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 964);
		} else {
			return __io__block.readInt(__io__address + 960);
		}
	}

	/**
	 * Set method for struct member 'dimensions'.
	 * @see #__DNA__FIELD__dimensions
	 */
	
	public void setDimensions(int dimensions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 964, dimensions);
		} else {
			__io__block.writeInt(__io__address + 960, dimensions);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexMusgrave> __io__addressof() {
		return new CPointer<NodeTexMusgrave>(__io__address, new Class[]{NodeTexMusgrave.class}, __io__block, __io__blockTable);
	}

}
