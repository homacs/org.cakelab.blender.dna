package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderUVMap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class NodeShaderUVMap extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderUVMap.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderUVMap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 453;

	/**
	 * Field descriptor (offset) for struct member 'uv_map'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderUVMap nodeshaderuvmap = ...;
	 * CPointer&lt;Object&gt; p = nodeshaderuvmap.__dna__addressof(NodeShaderUVMap.__DNA__FIELD__uv_map);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uv_map = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_map'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_map = new long[]{0, 0};

	public NodeShaderUVMap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderUVMap(NodeShaderUVMap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
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
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	public CPointer<NodeShaderUVMap> __io__addressof() {
		return new CPointer<NodeShaderUVMap>(__io__address, new Class[]{NodeShaderUVMap.class}, __io__block, __io__blockTable);
	}

}
