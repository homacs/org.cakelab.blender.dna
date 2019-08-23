package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderTangent'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=72, size64=72)
public class NodeShaderTangent extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderTangent.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderTangent.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 455;

	/**
	 * Field descriptor (offset) for struct member 'direction_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTangent nodeshadertangent = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertangent.__dna__addressof(NodeShaderTangent.__DNA__FIELD__direction_type);
	 * CPointer&lt;Integer&gt; p_direction_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'direction_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__direction_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTangent nodeshadertangent = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertangent.__dna__addressof(NodeShaderTangent.__DNA__FIELD__axis);
	 * CPointer&lt;Integer&gt; p_axis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'uv_map'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTangent nodeshadertangent = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertangent.__dna__addressof(NodeShaderTangent.__DNA__FIELD__uv_map);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uv_map = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_map'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_map = new long[]{8, 8};

	public NodeShaderTangent(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderTangent(NodeShaderTangent that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'direction_type'.
	 * @see #__DNA__FIELD__direction_type
	 */
	
	public int getDirection_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'direction_type'.
	 * @see #__DNA__FIELD__direction_type
	 */
	
	public void setDirection_type(int direction_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, direction_type);
		} else {
			__io__block.writeInt(__io__address + 0, direction_type);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public int getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(int axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, axis);
		} else {
			__io__block.writeInt(__io__address + 4, axis);
		}
	}

	/**
	 * Get method for struct member 'uv_map'.
	 * @see #__DNA__FIELD__uv_map
	 */
	
	public CArrayFacade<Byte> getUv_map() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_map'.
	 * @see #__DNA__FIELD__uv_map
	 */
	
	public void setUv_map(CArrayFacade<Byte> uv_map) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(uv_map, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_map)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_map);
		} else {
			__io__generic__copy( getUv_map(), uv_map);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeShaderTangent> __io__addressof() {
		return new CPointer<NodeShaderTangent>(__io__address, new Class[]{NodeShaderTangent.class}, __io__block, __io__blockTable);
	}

}
