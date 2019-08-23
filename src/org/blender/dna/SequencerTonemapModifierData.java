package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequencerTonemapModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=144)
public class SequencerTonemapModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SequencerTonemapModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SequencerTonemapModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 289;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The value the average luminance is mapped to
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__key);
	 * CPointer&lt;Float&gt; p_key = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normally always 1, but can be used as an extra control to alter the brightness curve
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If not used, set to 1
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__gamma);
	 * CPointer&lt;Float&gt; p_gamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If less than zero, darkens image; otherwise, makes it brighter
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__intensity);
	 * CPointer&lt;Float&gt; p_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__intensity = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Set to 0 to use estimate from input image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__contrast);
	 * CPointer&lt;Float&gt; p_contrast = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contrast'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contrast = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member 'adaptation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, global; if 1, based on pixel intensity
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__adaptation);
	 * CPointer&lt;Float&gt; p_adaptation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adaptation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adaptation = new long[]{116, 132};

	/**
	 * Field descriptor (offset) for struct member 'correction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, same for all channels; if 1, each independent
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__correction);
	 * CPointer&lt;Float&gt; p_correction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'correction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__correction = new long[]{120, 136};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerTonemapModifierData sequencertonemapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = sequencertonemapmodifierdata.__dna__addressof(SequencerTonemapModifierData.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{124, 140};

	public SequencerTonemapModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequencerTonemapModifierData(SequencerTonemapModifierData that) {
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
	 * Get method for struct member 'key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The value the average luminance is mapped to
	 * @see #__DNA__FIELD__key
	 */
	
	public float getKey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'key'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The value the average luminance is mapped to
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(float key) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, key);
		} else {
			__io__block.writeFloat(__io__address + 96, key);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normally always 1, but can be used as an extra control to alter the brightness curve
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normally always 1, but can be used as an extra control to alter the brightness curve
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, offset);
		} else {
			__io__block.writeFloat(__io__address + 100, offset);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If not used, set to 1
	 * @see #__DNA__FIELD__gamma
	 */
	
	public float getGamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If not used, set to 1
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(float gamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, gamma);
		} else {
			__io__block.writeFloat(__io__address + 104, gamma);
		}
	}

	/**
	 * Get method for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If less than zero, darkens image; otherwise, makes it brighter
	 * @see #__DNA__FIELD__intensity
	 */
	
	public float getIntensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If less than zero, darkens image; otherwise, makes it brighter
	 * @see #__DNA__FIELD__intensity
	 */
	
	public void setIntensity(float intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, intensity);
		} else {
			__io__block.writeFloat(__io__address + 108, intensity);
		}
	}

	/**
	 * Get method for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Set to 0 to use estimate from input image
	 * @see #__DNA__FIELD__contrast
	 */
	
	public float getContrast() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Set to 0 to use estimate from input image
	 * @see #__DNA__FIELD__contrast
	 */
	
	public void setContrast(float contrast) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, contrast);
		} else {
			__io__block.writeFloat(__io__address + 112, contrast);
		}
	}

	/**
	 * Get method for struct member 'adaptation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, global; if 1, based on pixel intensity
	 * @see #__DNA__FIELD__adaptation
	 */
	
	public float getAdaptation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'adaptation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, global; if 1, based on pixel intensity
	 * @see #__DNA__FIELD__adaptation
	 */
	
	public void setAdaptation(float adaptation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, adaptation);
		} else {
			__io__block.writeFloat(__io__address + 116, adaptation);
		}
	}

	/**
	 * Get method for struct member 'correction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, same for all channels; if 1, each independent
	 * @see #__DNA__FIELD__correction
	 */
	
	public float getCorrection() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'correction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * If 0, same for all channels; if 1, each independent
	 * @see #__DNA__FIELD__correction
	 */
	
	public void setCorrection(float correction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, correction);
		} else {
			__io__block.writeFloat(__io__address + 120, correction);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, type);
		} else {
			__io__block.writeInt(__io__address + 124, type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequencerTonemapModifierData> __io__addressof() {
		return new CPointer<SequencerTonemapModifierData>(__io__address, new Class[]{SequencerTonemapModifierData.class}, __io__block, __io__blockTable);
	}

}
