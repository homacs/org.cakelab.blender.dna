package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Sound3D'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class Sound3D extends CFacade {

	/**
	 * This is the sdna index of the struct Sound3D.
	 * <p>
	 * It is required when allocating a new block to store data for Sound3D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 314;

	/**
	 * Field descriptor (offset) for struct member 'min_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__min_gain);
	 * CPointer&lt;Float&gt; p_min_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_gain = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'max_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__max_gain);
	 * CPointer&lt;Float&gt; p_max_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_gain = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'reference_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__reference_distance);
	 * CPointer&lt;Float&gt; p_reference_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference_distance = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'max_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__max_distance);
	 * CPointer&lt;Float&gt; p_max_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_distance = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rolloff_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__rolloff_factor);
	 * CPointer&lt;Float&gt; p_rolloff_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rolloff_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rolloff_factor = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'cone_inner_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__cone_inner_angle);
	 * CPointer&lt;Float&gt; p_cone_inner_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_inner_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_inner_angle = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'cone_outer_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__cone_outer_angle);
	 * CPointer&lt;Float&gt; p_cone_outer_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_outer_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_outer_angle = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'cone_outer_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sound3D sound3d = ...;
	 * CPointer&lt;Object&gt; p = sound3d.__dna__addressof(Sound3D.__DNA__FIELD__cone_outer_gain);
	 * CPointer&lt;Float&gt; p_cone_outer_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_outer_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_outer_gain = new long[]{28, 28};

	public Sound3D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Sound3D(Sound3D that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public float getMin_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public void setMin_gain(float min_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, min_gain);
		} else {
			__io__block.writeFloat(__io__address + 0, min_gain);
		}
	}

	/**
	 * Get method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public float getMax_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public void setMax_gain(float max_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, max_gain);
		} else {
			__io__block.writeFloat(__io__address + 4, max_gain);
		}
	}

	/**
	 * Get method for struct member 'reference_distance'.
	 * @see #__DNA__FIELD__reference_distance
	 */
	
	public float getReference_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'reference_distance'.
	 * @see #__DNA__FIELD__reference_distance
	 */
	
	public void setReference_distance(float reference_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, reference_distance);
		} else {
			__io__block.writeFloat(__io__address + 8, reference_distance);
		}
	}

	/**
	 * Get method for struct member 'max_distance'.
	 * @see #__DNA__FIELD__max_distance
	 */
	
	public float getMax_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'max_distance'.
	 * @see #__DNA__FIELD__max_distance
	 */
	
	public void setMax_distance(float max_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, max_distance);
		} else {
			__io__block.writeFloat(__io__address + 12, max_distance);
		}
	}

	/**
	 * Get method for struct member 'rolloff_factor'.
	 * @see #__DNA__FIELD__rolloff_factor
	 */
	
	public float getRolloff_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'rolloff_factor'.
	 * @see #__DNA__FIELD__rolloff_factor
	 */
	
	public void setRolloff_factor(float rolloff_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, rolloff_factor);
		} else {
			__io__block.writeFloat(__io__address + 16, rolloff_factor);
		}
	}

	/**
	 * Get method for struct member 'cone_inner_angle'.
	 * @see #__DNA__FIELD__cone_inner_angle
	 */
	
	public float getCone_inner_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'cone_inner_angle'.
	 * @see #__DNA__FIELD__cone_inner_angle
	 */
	
	public void setCone_inner_angle(float cone_inner_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, cone_inner_angle);
		} else {
			__io__block.writeFloat(__io__address + 20, cone_inner_angle);
		}
	}

	/**
	 * Get method for struct member 'cone_outer_angle'.
	 * @see #__DNA__FIELD__cone_outer_angle
	 */
	
	public float getCone_outer_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'cone_outer_angle'.
	 * @see #__DNA__FIELD__cone_outer_angle
	 */
	
	public void setCone_outer_angle(float cone_outer_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, cone_outer_angle);
		} else {
			__io__block.writeFloat(__io__address + 24, cone_outer_angle);
		}
	}

	/**
	 * Get method for struct member 'cone_outer_gain'.
	 * @see #__DNA__FIELD__cone_outer_gain
	 */
	
	public float getCone_outer_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'cone_outer_gain'.
	 * @see #__DNA__FIELD__cone_outer_gain
	 */
	
	public void setCone_outer_gain(float cone_outer_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, cone_outer_gain);
		} else {
			__io__block.writeFloat(__io__address + 28, cone_outer_gain);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Sound3D> __io__addressof() {
		return new CPointer<Sound3D>(__io__address, new Class[]{Sound3D.class}, __io__block, __io__blockTable);
	}

}
