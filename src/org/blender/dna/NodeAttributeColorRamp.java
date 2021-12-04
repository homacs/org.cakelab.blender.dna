package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeColorRamp'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=776, size64=776)
public class NodeAttributeColorRamp extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeColorRamp.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeColorRamp.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 491;

	/**
	 * Field descriptor (offset) for struct member 'color_ramp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeColorRamp nodeattributecolorramp = ...;
	 * CPointer&lt;Object&gt; p = nodeattributecolorramp.__dna__addressof(NodeAttributeColorRamp.__DNA__FIELD__color_ramp);
	 * CPointer&lt;ColorBand&gt; p_color_ramp = p.cast(new Class[]{ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_ramp'</li>
	 * <li>Signature: 'ColorBand'</li>
	 * <li>Actual Size (32bit/64bit): 776/776</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_ramp = new long[]{0, 0};

	public NodeAttributeColorRamp(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeColorRamp(NodeAttributeColorRamp that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'color_ramp'.
	 * @see #__DNA__FIELD__color_ramp
	 */
	
	public ColorBand getColor_ramp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorBand(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ColorBand(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color_ramp'.
	 * @see #__DNA__FIELD__color_ramp
	 */
	
	public void setColor_ramp(ColorBand color_ramp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(color_ramp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color_ramp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color_ramp);
		} else {
			__io__generic__copy( getColor_ramp(), color_ramp);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAttributeColorRamp> __io__addressof() {
		return new CPointer<NodeAttributeColorRamp>(__io__address, new Class[]{NodeAttributeColorRamp.class}, __io__block, __io__blockTable);
	}

}
