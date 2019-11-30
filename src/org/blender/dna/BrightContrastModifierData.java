package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BrightContrastModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=104, size64=120)
public class BrightContrastModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct BrightContrastModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for BrightContrastModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 295;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrightContrastModifierData brightcontrastmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = brightcontrastmodifierdata.__dna__addressof(BrightContrastModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'bright'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrightContrastModifierData brightcontrastmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = brightcontrastmodifierdata.__dna__addressof(BrightContrastModifierData.__DNA__FIELD__bright);
	 * CPointer&lt;Float&gt; p_bright = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bright'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bright = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'contrast'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BrightContrastModifierData brightcontrastmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = brightcontrastmodifierdata.__dna__addressof(BrightContrastModifierData.__DNA__FIELD__contrast);
	 * CPointer&lt;Float&gt; p_contrast = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contrast'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contrast = new long[]{100, 116};

	public BrightContrastModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BrightContrastModifierData(BrightContrastModifierData that) {
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
	 * Get method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public float getBright() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public void setBright(float bright) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, bright);
		} else {
			__io__block.writeFloat(__io__address + 96, bright);
		}
	}

	/**
	 * Get method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public float getContrast() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public void setContrast(float contrast) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, contrast);
		} else {
			__io__block.writeFloat(__io__address + 100, contrast);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BrightContrastModifierData> __io__addressof() {
		return new CPointer<BrightContrastModifierData>(__io__address, new Class[]{BrightContrastModifierData.class}, __io__block, __io__blockTable);
	}

}
