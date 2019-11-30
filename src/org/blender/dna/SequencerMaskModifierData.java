package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequencerMaskModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=112)
public class SequencerMaskModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SequencerMaskModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SequencerMaskModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 296;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerMaskModifierData sequencermaskmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencermaskmodifierdata.__dna__addressof(SequencerMaskModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;SequenceModifierData&gt; p_modifier = p.cast(new Class[]{SequenceModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'SequenceModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	public SequencerMaskModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequencerMaskModifierData(SequencerMaskModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public SequenceModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SequenceModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new SequenceModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(SequenceModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequencerMaskModifierData> __io__addressof() {
		return new CPointer<SequencerMaskModifierData>(__io__address, new Class[]{SequencerMaskModifierData.class}, __io__block, __io__blockTable);
	}

}
