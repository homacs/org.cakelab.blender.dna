package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VolumeSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> WATCH IT: change type? also make changes in ipo.h </p>
 */

@CMetaData(size32=88, size64=88)
public class VolumeSettings extends CFacade {

	/**
	 * This is the sdna index of the struct VolumeSettings.
	 * <p>
	 * It is required when allocating a new block to store data for VolumeSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 43;

	/**
	 * Field descriptor (offset) for struct member 'density'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__density);
	 * CPointer&lt;Float&gt; p_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'emission'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__emission);
	 * CPointer&lt;Float&gt; p_emission = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emission'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emission = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'scattering'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__scattering);
	 * CPointer&lt;Float&gt; p_scattering = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scattering'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scattering = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'reflection'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__reflection);
	 * CPointer&lt;Float&gt; p_reflection = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reflection'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reflection = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'emission_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__emission_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_emission_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emission_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emission_col = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'transmission_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__transmission_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_transmission_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transmission_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transmission_col = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'reflection_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__reflection_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_reflection_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reflection_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reflection_col = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'density_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__density_scale);
	 * CPointer&lt;Float&gt; p_density_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density_scale = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'depth_cutoff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__depth_cutoff);
	 * CPointer&lt;Float&gt; p_depth_cutoff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth_cutoff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth_cutoff = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'asymmetry'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__asymmetry);
	 * CPointer&lt;Float&gt; p_asymmetry = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asymmetry'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asymmetry = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'stepsize_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__stepsize_type);
	 * CPointer&lt;Short&gt; p_stepsize_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stepsize_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stepsize_type = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'shadeflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__shadeflag);
	 * CPointer&lt;Short&gt; p_shadeflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadeflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadeflag = new long[]{66, 66};

	/**
	 * Field descriptor (offset) for struct member 'shade_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__shade_type);
	 * CPointer&lt;Short&gt; p_shade_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shade_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shade_type = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'precache_resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__precache_resolution);
	 * CPointer&lt;Short&gt; p_precache_resolution = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'precache_resolution'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__precache_resolution = new long[]{70, 70};

	/**
	 * Field descriptor (offset) for struct member 'stepsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__stepsize);
	 * CPointer&lt;Float&gt; p_stepsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stepsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stepsize = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'ms_diff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__ms_diff);
	 * CPointer&lt;Float&gt; p_ms_diff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ms_diff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ms_diff = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'ms_intensity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__ms_intensity);
	 * CPointer&lt;Float&gt; p_ms_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ms_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ms_intensity = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'ms_spread'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeSettings volumesettings = ...;
	 * CPointer&lt;Object&gt; p = volumesettings.__dna__addressof(VolumeSettings.__DNA__FIELD__ms_spread);
	 * CPointer&lt;Float&gt; p_ms_spread = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ms_spread'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ms_spread = new long[]{84, 84};

	public VolumeSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VolumeSettings(VolumeSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'density'.
	 * @see #__DNA__FIELD__density
	 */
	
	public float getDensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'density'.
	 * @see #__DNA__FIELD__density
	 */
	
	public void setDensity(float density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, density);
		} else {
			__io__block.writeFloat(__io__address + 0, density);
		}
	}

	/**
	 * Get method for struct member 'emission'.
	 * @see #__DNA__FIELD__emission
	 */
	
	public float getEmission() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'emission'.
	 * @see #__DNA__FIELD__emission
	 */
	
	public void setEmission(float emission) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, emission);
		} else {
			__io__block.writeFloat(__io__address + 4, emission);
		}
	}

	/**
	 * Get method for struct member 'scattering'.
	 * @see #__DNA__FIELD__scattering
	 */
	
	public float getScattering() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'scattering'.
	 * @see #__DNA__FIELD__scattering
	 */
	
	public void setScattering(float scattering) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, scattering);
		} else {
			__io__block.writeFloat(__io__address + 8, scattering);
		}
	}

	/**
	 * Get method for struct member 'reflection'.
	 * @see #__DNA__FIELD__reflection
	 */
	
	public float getReflection() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'reflection'.
	 * @see #__DNA__FIELD__reflection
	 */
	
	public void setReflection(float reflection) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, reflection);
		} else {
			__io__block.writeFloat(__io__address + 12, reflection);
		}
	}

	/**
	 * Get method for struct member 'emission_col'.
	 * @see #__DNA__FIELD__emission_col
	 */
	
	public CArrayFacade<Float> getEmission_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'emission_col'.
	 * @see #__DNA__FIELD__emission_col
	 */
	
	public void setEmission_col(CArrayFacade<Float> emission_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(emission_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, emission_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, emission_col);
		} else {
			__io__generic__copy( getEmission_col(), emission_col);
		}
	}

	/**
	 * Get method for struct member 'transmission_col'.
	 * @see #__DNA__FIELD__transmission_col
	 */
	
	public CArrayFacade<Float> getTransmission_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'transmission_col'.
	 * @see #__DNA__FIELD__transmission_col
	 */
	
	public void setTransmission_col(CArrayFacade<Float> transmission_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(transmission_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, transmission_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, transmission_col);
		} else {
			__io__generic__copy( getTransmission_col(), transmission_col);
		}
	}

	/**
	 * Get method for struct member 'reflection_col'.
	 * @see #__DNA__FIELD__reflection_col
	 */
	
	public CArrayFacade<Float> getReflection_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reflection_col'.
	 * @see #__DNA__FIELD__reflection_col
	 */
	
	public void setReflection_col(CArrayFacade<Float> reflection_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(reflection_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, reflection_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, reflection_col);
		} else {
			__io__generic__copy( getReflection_col(), reflection_col);
		}
	}

	/**
	 * Get method for struct member 'density_scale'.
	 * @see #__DNA__FIELD__density_scale
	 */
	
	public float getDensity_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'density_scale'.
	 * @see #__DNA__FIELD__density_scale
	 */
	
	public void setDensity_scale(float density_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, density_scale);
		} else {
			__io__block.writeFloat(__io__address + 52, density_scale);
		}
	}

	/**
	 * Get method for struct member 'depth_cutoff'.
	 * @see #__DNA__FIELD__depth_cutoff
	 */
	
	public float getDepth_cutoff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'depth_cutoff'.
	 * @see #__DNA__FIELD__depth_cutoff
	 */
	
	public void setDepth_cutoff(float depth_cutoff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, depth_cutoff);
		} else {
			__io__block.writeFloat(__io__address + 56, depth_cutoff);
		}
	}

	/**
	 * Get method for struct member 'asymmetry'.
	 * @see #__DNA__FIELD__asymmetry
	 */
	
	public float getAsymmetry() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'asymmetry'.
	 * @see #__DNA__FIELD__asymmetry
	 */
	
	public void setAsymmetry(float asymmetry) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, asymmetry);
		} else {
			__io__block.writeFloat(__io__address + 60, asymmetry);
		}
	}

	/**
	 * Get method for struct member 'stepsize_type'.
	 * @see #__DNA__FIELD__stepsize_type
	 */
	
	public short getStepsize_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 64);
		} else {
			return __io__block.readShort(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'stepsize_type'.
	 * @see #__DNA__FIELD__stepsize_type
	 */
	
	public void setStepsize_type(short stepsize_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 64, stepsize_type);
		} else {
			__io__block.writeShort(__io__address + 64, stepsize_type);
		}
	}

	/**
	 * Get method for struct member 'shadeflag'.
	 * @see #__DNA__FIELD__shadeflag
	 */
	
	public short getShadeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 66);
		} else {
			return __io__block.readShort(__io__address + 66);
		}
	}

	/**
	 * Set method for struct member 'shadeflag'.
	 * @see #__DNA__FIELD__shadeflag
	 */
	
	public void setShadeflag(short shadeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 66, shadeflag);
		} else {
			__io__block.writeShort(__io__address + 66, shadeflag);
		}
	}

	/**
	 * Get method for struct member 'shade_type'.
	 * @see #__DNA__FIELD__shade_type
	 */
	
	public short getShade_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 68);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'shade_type'.
	 * @see #__DNA__FIELD__shade_type
	 */
	
	public void setShade_type(short shade_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 68, shade_type);
		} else {
			__io__block.writeShort(__io__address + 68, shade_type);
		}
	}

	/**
	 * Get method for struct member 'precache_resolution'.
	 * @see #__DNA__FIELD__precache_resolution
	 */
	
	public short getPrecache_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 70);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'precache_resolution'.
	 * @see #__DNA__FIELD__precache_resolution
	 */
	
	public void setPrecache_resolution(short precache_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 70, precache_resolution);
		} else {
			__io__block.writeShort(__io__address + 70, precache_resolution);
		}
	}

	/**
	 * Get method for struct member 'stepsize'.
	 * @see #__DNA__FIELD__stepsize
	 */
	
	public float getStepsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'stepsize'.
	 * @see #__DNA__FIELD__stepsize
	 */
	
	public void setStepsize(float stepsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, stepsize);
		} else {
			__io__block.writeFloat(__io__address + 72, stepsize);
		}
	}

	/**
	 * Get method for struct member 'ms_diff'.
	 * @see #__DNA__FIELD__ms_diff
	 */
	
	public float getMs_diff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'ms_diff'.
	 * @see #__DNA__FIELD__ms_diff
	 */
	
	public void setMs_diff(float ms_diff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, ms_diff);
		} else {
			__io__block.writeFloat(__io__address + 76, ms_diff);
		}
	}

	/**
	 * Get method for struct member 'ms_intensity'.
	 * @see #__DNA__FIELD__ms_intensity
	 */
	
	public float getMs_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'ms_intensity'.
	 * @see #__DNA__FIELD__ms_intensity
	 */
	
	public void setMs_intensity(float ms_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, ms_intensity);
		} else {
			__io__block.writeFloat(__io__address + 80, ms_intensity);
		}
	}

	/**
	 * Get method for struct member 'ms_spread'.
	 * @see #__DNA__FIELD__ms_spread
	 */
	
	public float getMs_spread() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'ms_spread'.
	 * @see #__DNA__FIELD__ms_spread
	 */
	
	public void setMs_spread(float ms_spread) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, ms_spread);
		} else {
			__io__block.writeFloat(__io__address + 84, ms_spread);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<VolumeSettings> __io__addressof() {
		return new CPointer<VolumeSettings>(__io__address, new Class[]{VolumeSettings.class}, __io__block, __io__blockTable);
	}

}
