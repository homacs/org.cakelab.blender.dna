package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FreestyleConfig'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=40, size64=56)
public class FreestyleConfig extends CFacade {

	/**
	 * This is the sdna index of the struct FreestyleConfig.
	 * <p>
	 * It is required when allocating a new block to store data for FreestyleConfig.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 573;

	/**
	 * Field descriptor (offset) for struct member 'modules'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__modules);
	 * CPointer&lt;ListBase&gt; p_modules = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modules'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modules = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scripting, editor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'raycasting_algorithm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__raycasting_algorithm);
	 * CPointer&lt;Integer&gt; p_raycasting_algorithm = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'raycasting_algorithm'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__raycasting_algorithm = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> suggestive contours, ridges/valleys, material boundaries </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'sphere_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__sphere_radius);
	 * CPointer&lt;Float&gt; p_sphere_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sphere_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sphere_radius = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'dkr_epsilon'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__dkr_epsilon);
	 * CPointer&lt;Float&gt; p_dkr_epsilon = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dkr_epsilon'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dkr_epsilon = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'crease_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__crease_angle);
	 * CPointer&lt;Float&gt; p_crease_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_angle = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'linesets'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FreestyleConfig freestyleconfig = ...;
	 * CPointer&lt;Object&gt; p = freestyleconfig.__dna__addressof(FreestyleConfig.__DNA__FIELD__linesets);
	 * CPointer&lt;ListBase&gt; p_linesets = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linesets'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linesets = new long[]{32, 40};

	public FreestyleConfig(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FreestyleConfig(FreestyleConfig that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modules'.
	 * @see #__DNA__FIELD__modules
	 */
	
	public ListBase getModules() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modules'.
	 * @see #__DNA__FIELD__modules
	 */
	
	public void setModules(ListBase modules) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modules, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modules)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modules);
		} else {
			__io__generic__copy( getModules(), modules);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scripting, editor </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scripting, editor </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, mode);
		} else {
			__io__block.writeInt(__io__address + 8, mode);
		}
	}

	/**
	 * Get method for struct member 'raycasting_algorithm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__raycasting_algorithm
	 */
	
	public int getRaycasting_algorithm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'raycasting_algorithm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__raycasting_algorithm
	 */
	
	public void setRaycasting_algorithm(int raycasting_algorithm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, raycasting_algorithm);
		} else {
			__io__block.writeInt(__io__address + 12, raycasting_algorithm);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> suggestive contours, ridges/valleys, material boundaries </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> suggestive contours, ridges/valleys, material boundaries </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, flags);
		} else {
			__io__block.writeInt(__io__address + 16, flags);
		}
	}

	/**
	 * Get method for struct member 'sphere_radius'.
	 * @see #__DNA__FIELD__sphere_radius
	 */
	
	public float getSphere_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'sphere_radius'.
	 * @see #__DNA__FIELD__sphere_radius
	 */
	
	public void setSphere_radius(float sphere_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, sphere_radius);
		} else {
			__io__block.writeFloat(__io__address + 20, sphere_radius);
		}
	}

	/**
	 * Get method for struct member 'dkr_epsilon'.
	 * @see #__DNA__FIELD__dkr_epsilon
	 */
	
	public float getDkr_epsilon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'dkr_epsilon'.
	 * @see #__DNA__FIELD__dkr_epsilon
	 */
	
	public void setDkr_epsilon(float dkr_epsilon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, dkr_epsilon);
		} else {
			__io__block.writeFloat(__io__address + 24, dkr_epsilon);
		}
	}

	/**
	 * Get method for struct member 'crease_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * @see #__DNA__FIELD__crease_angle
	 */
	
	public float getCrease_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'crease_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * @see #__DNA__FIELD__crease_angle
	 */
	
	public void setCrease_angle(float crease_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, crease_angle);
		} else {
			__io__block.writeFloat(__io__address + 28, crease_angle);
		}
	}

	/**
	 * Get method for struct member 'linesets'.
	 * @see #__DNA__FIELD__linesets
	 */
	
	public ListBase getLinesets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'linesets'.
	 * @see #__DNA__FIELD__linesets
	 */
	
	public void setLinesets(ListBase linesets) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(linesets, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, linesets)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, linesets);
		} else {
			__io__generic__copy( getLinesets(), linesets);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FreestyleConfig> __io__addressof() {
		return new CPointer<FreestyleConfig>(__io__address, new Class[]{FreestyleConfig.class}, __io__block, __io__blockTable);
	}

}
