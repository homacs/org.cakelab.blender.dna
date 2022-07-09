package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderVertexColor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class NodeShaderVertexColor extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderVertexColor.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderVertexColor.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 480;

	/**
	 * Field descriptor (offset) for struct member 'layer_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderVertexColor nodeshadervertexcolor = ...;
	 * CPointer&lt;Object&gt; p = nodeshadervertexcolor.__dna__addressof(NodeShaderVertexColor.__DNA__FIELD__layer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_name = new long[]{0, 0};

	public NodeShaderVertexColor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderVertexColor(NodeShaderVertexColor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'layer_name'.
	 * @see #__DNA__FIELD__layer_name
	 */
	
	public CArrayFacade<Byte> getLayer_name() throws IOException
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
	 * Set method for struct member 'layer_name'.
	 * @see #__DNA__FIELD__layer_name
	 */
	
	public void setLayer_name(CArrayFacade<Byte> layer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(layer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer_name);
		} else {
			__io__generic__copy( getLayer_name(), layer_name);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeShaderVertexColor> __io__addressof() {
		return new CPointer<NodeShaderVertexColor>(__io__address, new Class[]{NodeShaderVertexColor.class}, __io__block, __io__blockTable);
	}

}
