package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorBalanceModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=160)
public class ColorBalanceModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ColorBalanceModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ColorBalanceModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 279;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBalanceModifierData colorbalancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = colorbalancemodifierdata.__dna__addressof(ColorBalanceModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'color_balance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBalanceModifierData colorbalancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = colorbalancemodifierdata.__dna__addressof(ColorBalanceModifierData.__DNA__FIELD__color_balance);
	 * CPointer&lt;StripColorBalance&gt; p_color_balance = p.cast(new Class[]{StripColorBalance.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_balance'</li>
	 * <li>Signature: 'StripColorBalance'</li>
	 * <li>Actual Size (32bit/64bit): 44/44</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_balance = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'color_multiply'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBalanceModifierData colorbalancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = colorbalancemodifierdata.__dna__addressof(ColorBalanceModifierData.__DNA__FIELD__color_multiply);
	 * CPointer&lt;Float&gt; p_color_multiply = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_multiply'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_multiply = new long[]{140, 156};

	public ColorBalanceModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorBalanceModifierData(ColorBalanceModifierData that) {
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
	 * Get method for struct member 'color_balance'.
	 * @see #__DNA__FIELD__color_balance
	 */
	
	public StripColorBalance getColor_balance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new StripColorBalance(__io__address + 112, __io__block, __io__blockTable);
		} else {
			return new StripColorBalance(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color_balance'.
	 * @see #__DNA__FIELD__color_balance
	 */
	
	public void setColor_balance(StripColorBalance color_balance) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(color_balance, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color_balance)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color_balance);
		} else {
			__io__generic__copy( getColor_balance(), color_balance);
		}
	}

	/**
	 * Get method for struct member 'color_multiply'.
	 * @see #__DNA__FIELD__color_multiply
	 */
	
	public float getColor_multiply() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'color_multiply'.
	 * @see #__DNA__FIELD__color_multiply
	 */
	
	public void setColor_multiply(float color_multiply) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, color_multiply);
		} else {
			__io__block.writeFloat(__io__address + 140, color_multiply);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorBalanceModifierData> __io__addressof() {
		return new CPointer<ColorBalanceModifierData>(__io__address, new Class[]{ColorBalanceModifierData.class}, __io__block, __io__blockTable);
	}

}
