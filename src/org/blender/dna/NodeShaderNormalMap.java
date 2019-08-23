package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderNormalMap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=68)
public class NodeShaderNormalMap extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderNormalMap.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderNormalMap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 452;

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderNormalMap nodeshadernormalmap = ...;
	 * CPointer&lt;Object&gt; p = nodeshadernormalmap.__dna__addressof(NodeShaderNormalMap.__DNA__FIELD__space);
	 * CPointer&lt;Integer&gt; p_space = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'uv_map'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderNormalMap nodeshadernormalmap = ...;
	 * CPointer&lt;Object&gt; p = nodeshadernormalmap.__dna__addressof(NodeShaderNormalMap.__DNA__FIELD__uv_map);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uv_map = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_map'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_map = new long[]{4, 4};

	public NodeShaderNormalMap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderNormalMap(NodeShaderNormalMap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public int getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(int space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, space);
		} else {
			__io__block.writeInt(__io__address + 0, space);
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
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
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
	public CPointer<NodeShaderNormalMap> __io__addressof() {
		return new CPointer<NodeShaderNormalMap>(__io__address, new Class[]{NodeShaderNormalMap.class}, __io__block, __io__blockTable);
	}

}
