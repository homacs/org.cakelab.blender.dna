package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeImageLayer'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> layer info for image node outputs </p>
 */

@CMetaData(size32=68, size64=68)
public class NodeImageLayer extends CFacade {

	/**
	 * This is the sdna index of the struct NodeImageLayer.
	 * <p>
	 * It is required when allocating a new block to store data for NodeImageLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 380;

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index in the Image->layers->passes lists 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageLayer nodeimagelayer = ...;
	 * CPointer&lt;Object&gt; p = nodeimagelayer.__dna__addressof(NodeImageLayer.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pass_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render pass name Amount defined in openexr_multi.h. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageLayer nodeimagelayer = ...;
	 * CPointer&lt;Object&gt; p = nodeimagelayer.__dna__addressof(NodeImageLayer.__DNA__FIELD__pass_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pass_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_name = new long[]{4, 4};

	public NodeImageLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeImageLayer(NodeImageLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index in the Image->layers->passes lists 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index in the Image->layers->passes lists 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, pass_index);
		} else {
			__io__block.writeInt(__io__address + 0, pass_index);
		}
	}

	/**
	 * Get method for struct member 'pass_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render pass name Amount defined in openexr_multi.h. </p>
	 * @see #__DNA__FIELD__pass_name
	 */
	
	public CArrayFacade<Byte> getPass_name() throws IOException
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
	 * Set method for struct member 'pass_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render pass name Amount defined in openexr_multi.h. </p>
	 * @see #__DNA__FIELD__pass_name
	 */
	
	public void setPass_name(CArrayFacade<Byte> pass_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(pass_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pass_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pass_name);
		} else {
			__io__generic__copy( getPass_name(), pass_name);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeImageLayer> __io__addressof() {
		return new CPointer<NodeImageLayer>(__io__address, new Class[]{NodeImageLayer.class}, __io__block, __io__blockTable);
	}

}
