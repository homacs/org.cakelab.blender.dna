package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PaintToolSlot'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> We might want to store other things here. </p>
 */

@CMetaData(size32=4, size64=8)
public class PaintToolSlot extends CFacade {

	/**
	 * This is the sdna index of the struct PaintToolSlot.
	 * <p>
	 * It is required when allocating a new block to store data for PaintToolSlot.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 186;

	/**
	 * Field descriptor (offset) for struct member 'brush'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintToolSlot painttoolslot = ...;
	 * CPointer&lt;Object&gt; p = painttoolslot.__dna__addressof(PaintToolSlot.__DNA__FIELD__brush);
	 * CPointer&lt;CPointer&lt;Brush&gt;&gt; p_brush = p.cast(new Class[]{CPointer.class, Brush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush'</li>
	 * <li>Signature: 'Brush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush = new long[]{0, 0};

	public PaintToolSlot(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PaintToolSlot(PaintToolSlot that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'brush'.
	 * @see #__DNA__FIELD__brush
	 */
	
	public CPointer<Brush> getBrush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'brush'.
	 * @see #__DNA__FIELD__brush
	 */
	
	public void setBrush(CPointer<Brush> brush) throws IOException
	{
		long __address = ((brush == null) ? 0 : brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PaintToolSlot> __io__addressof() {
		return new CPointer<PaintToolSlot>(__io__address, new Class[]{PaintToolSlot.class}, __io__block, __io__blockTable);
	}

}
