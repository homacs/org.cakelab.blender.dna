package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_PerlinNoise2D'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=112, size64=120)
public class LineStyleGeometryModifier_PerlinNoise2D extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_PerlinNoise2D.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_PerlinNoise2D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 616;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the Perlin noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__frequency);
	 * CPointer&lt;Float&gt; p_frequency = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frequency'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frequency = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amplitude of the Perlin noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__amplitude);
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
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement direction<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'octaves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of octaves (i.e., the amount of detail of the Perlin noise)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__octaves);
	 * CPointer&lt;Integer&gt; p_octaves = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'octaves'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__octaves = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Seed for random number generation (if negative, time is used as a seed instead)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_PerlinNoise2D linestylegeometrymodifier_perlinnoise2d = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_perlinnoise2d.__dna__addressof(LineStyleGeometryModifier_PerlinNoise2D.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{108, 116};

	public LineStyleGeometryModifier_PerlinNoise2D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_PerlinNoise2D(LineStyleGeometryModifier_PerlinNoise2D that) {
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
	 * Get method for struct member 'frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the Perlin noise
	 * @see #__DNA__FIELD__frequency
	 */
	
	public float getFrequency() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the Perlin noise
	 * @see #__DNA__FIELD__frequency
	 */
	
	public void setFrequency(float frequency) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, frequency);
		} else {
			__io__block.writeFloat(__io__address + 88, frequency);
		}
	}

	/**
	 * Get method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amplitude of the Perlin noise
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
	 * Amplitude of the Perlin noise
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
	 * Get method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement direction<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement direction<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, angle);
		} else {
			__io__block.writeFloat(__io__address + 96, angle);
		}
	}

	/**
	 * Get method for struct member 'octaves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of octaves (i.e., the amount of detail of the Perlin noise)
	 * @see #__DNA__FIELD__octaves
	 */
	
	public int getOctaves() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'octaves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of octaves (i.e., the amount of detail of the Perlin noise)
	 * @see #__DNA__FIELD__octaves
	 */
	
	public void setOctaves(int octaves) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, octaves);
		} else {
			__io__block.writeInt(__io__address + 100, octaves);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Seed for random number generation (if negative, time is used as a seed instead)
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Seed for random number generation (if negative, time is used as a seed instead)
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, seed);
		} else {
			__io__block.writeInt(__io__address + 104, seed);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleGeometryModifier_PerlinNoise2D> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_PerlinNoise2D>(__io__address, new Class[]{LineStyleGeometryModifier_PerlinNoise2D.class}, __io__block, __io__blockTable);
	}

}
