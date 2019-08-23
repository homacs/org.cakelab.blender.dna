package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'HueCorrectModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=432, size64=496)
public class HueCorrectModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct HueCorrectModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for HueCorrectModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 285;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HueCorrectModifierData huecorrectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = huecorrectmodifierdata.__dna__addressof(HueCorrectModifierData.__DNA__FIELD__modifier);
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

	/**
	 * Field descriptor (offset) for struct member 'curve_mapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HueCorrectModifierData huecorrectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = huecorrectmodifierdata.__dna__addressof(HueCorrectModifierData.__DNA__FIELD__curve_mapping);
	 * CPointer&lt;CurveMapping&gt; p_curve_mapping = p.cast(new Class[]{CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_mapping'</li>
	 * <li>Signature: 'CurveMapping'</li>
	 * <li>Actual Size (32bit/64bit): 336/384</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_mapping = new long[]{96, 112};

	public HueCorrectModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected HueCorrectModifierData(HueCorrectModifierData that) {
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
	 * Get method for struct member 'curve_mapping'.
	 * @see #__DNA__FIELD__curve_mapping
	 */
	
	public CurveMapping getCurve_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CurveMapping(__io__address + 112, __io__block, __io__blockTable);
		} else {
			return new CurveMapping(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curve_mapping'.
	 * @see #__DNA__FIELD__curve_mapping
	 */
	
	public void setCurve_mapping(CurveMapping curve_mapping) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(curve_mapping, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curve_mapping)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curve_mapping);
		} else {
			__io__generic__copy( getCurve_mapping(), curve_mapping);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<HueCorrectModifierData> __io__addressof() {
		return new CPointer<HueCorrectModifierData>(__io__address, new Class[]{HueCorrectModifierData.class}, __io__block, __io__blockTable);
	}

}
