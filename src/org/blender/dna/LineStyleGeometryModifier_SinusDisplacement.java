package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_SinusDisplacement'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=104, size64=112)
public class LineStyleGeometryModifier_SinusDisplacement extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_SinusDisplacement.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_SinusDisplacement.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 613;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_SinusDisplacement linestylegeometrymodifier_sinusdisplacement = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_sinusdisplacement.__dna__addressof(LineStyleGeometryModifier_SinusDisplacement.__DNA__FIELD__modifier);
	 * CPointer&lt;LineStyleModifier&gt; p_modifier = p.cast(new Class[]{LineStyleModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'LineStyleModifier'</li>
	 * <li>Actual Size (32bit/64bit): 88/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'wavelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wavelength of the sinus displacement
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_SinusDisplacement linestylegeometrymodifier_sinusdisplacement = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_sinusdisplacement.__dna__addressof(LineStyleGeometryModifier_SinusDisplacement.__DNA__FIELD__wavelength);
	 * CPointer&lt;Float&gt; p_wavelength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wavelength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wavelength = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amplitude of the sinus displacement
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_SinusDisplacement linestylegeometrymodifier_sinusdisplacement = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_sinusdisplacement.__dna__addressof(LineStyleGeometryModifier_SinusDisplacement.__DNA__FIELD__amplitude);
	 * CPointer&lt;Float&gt; p_amplitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amplitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amplitude = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'phase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Phase of the sinus displacement
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_SinusDisplacement linestylegeometrymodifier_sinusdisplacement = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_sinusdisplacement.__dna__addressof(LineStyleGeometryModifier_SinusDisplacement.__DNA__FIELD__phase);
	 * CPointer&lt;Float&gt; p_phase = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'phase'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__phase = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_SinusDisplacement linestylegeometrymodifier_sinusdisplacement = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_sinusdisplacement.__dna__addressof(LineStyleGeometryModifier_SinusDisplacement.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{100, 108};

	public LineStyleGeometryModifier_SinusDisplacement(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_SinusDisplacement(LineStyleGeometryModifier_SinusDisplacement that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public LineStyleModifier getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(LineStyleModifier modifier) throws IOException
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
	 * Get method for struct member 'wavelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wavelength of the sinus displacement
	 * @see #__DNA__FIELD__wavelength
	 */
	
	public float getWavelength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'wavelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Wavelength of the sinus displacement
	 * @see #__DNA__FIELD__wavelength
	 */
	
	public void setWavelength(float wavelength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, wavelength);
		} else {
			__io__block.writeFloat(__io__address + 88, wavelength);
		}
	}

	/**
	 * Get method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amplitude of the sinus displacement
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public float getAmplitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amplitude of the sinus displacement
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public void setAmplitude(float amplitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, amplitude);
		} else {
			__io__block.writeFloat(__io__address + 92, amplitude);
		}
	}

	/**
	 * Get method for struct member 'phase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Phase of the sinus displacement
	 * @see #__DNA__FIELD__phase
	 */
	
	public float getPhase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'phase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Phase of the sinus displacement
	 * @see #__DNA__FIELD__phase
	 */
	
	public void setPhase(float phase) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, phase);
		} else {
			__io__block.writeFloat(__io__address + 96, phase);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleGeometryModifier_SinusDisplacement> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_SinusDisplacement>(__io__address, new Class[]{LineStyleGeometryModifier_SinusDisplacement.class}, __io__block, __io__blockTable);
	}

}
