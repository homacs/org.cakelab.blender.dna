package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeKeyingScreenData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class NodeKeyingScreenData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeKeyingScreenData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeKeyingScreenData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 449;

	/**
	 * Field descriptor (offset) for struct member 'tracking_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingScreenData nodekeyingscreendata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingscreendata.__dna__addressof(NodeKeyingScreenData.__DNA__FIELD__tracking_object);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tracking_object = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracking_object'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracking_object = new long[]{0, 0};

	public NodeKeyingScreenData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeKeyingScreenData(NodeKeyingScreenData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tracking_object'.
	 * @see #__DNA__FIELD__tracking_object
	 */
	
	public CArrayFacade<Byte> getTracking_object() throws IOException
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
	 * Set method for struct member 'tracking_object'.
	 * @see #__DNA__FIELD__tracking_object
	 */
	
	public void setTracking_object(CArrayFacade<Byte> tracking_object) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tracking_object, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tracking_object)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tracking_object);
		} else {
			__io__generic__copy( getTracking_object(), tracking_object);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeKeyingScreenData> __io__addressof() {
		return new CPointer<NodeKeyingScreenData>(__io__address, new Class[]{NodeKeyingScreenData.class}, __io__block, __io__blockTable);
	}

}
