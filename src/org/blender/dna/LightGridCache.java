package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LightGridCache'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Must match GridData. </p>
 */

@CMetaData(size32=160, size64=160)
public class LightGridCache extends CFacade {

	/**
	 * This is the sdna index of the struct LightGridCache.
	 * <p>
	 * It is required when allocating a new block to store data for LightGridCache.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 642;

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset to the first irradiance sample in the pool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__resolution);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_resolution = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolution'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolution = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__offset);
	 * CPointer&lt;Integer&gt; p_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'corner'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__corner);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_corner = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'corner'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__corner = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'attenuation_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__attenuation_scale);
	 * CPointer&lt;Float&gt; p_attenuation_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation_scale = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'increment_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link World}  space vector between 2 opposite cells. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__increment_x);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_increment_x = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'increment_x'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__increment_x = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'attenuation_bias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__attenuation_bias);
	 * CPointer&lt;Float&gt; p_attenuation_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation_bias = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'increment_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__increment_y);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_increment_y = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'increment_y'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__increment_y = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'level_bias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__level_bias);
	 * CPointer&lt;Float&gt; p_level_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_bias = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'increment_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__increment_z);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_increment_z = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'increment_z'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__increment_z = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD___pad4);
	 * CPointer&lt;Float&gt; p__pad4 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{140, 140};

	/**
	 * Field descriptor (offset) for struct member 'visibility_bias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__visibility_bias);
	 * CPointer&lt;Float&gt; p_visibility_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visibility_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visibility_bias = new long[]{144, 144};

	/**
	 * Field descriptor (offset) for struct member 'visibility_bleed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__visibility_bleed);
	 * CPointer&lt;Float&gt; p_visibility_bleed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visibility_bleed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visibility_bleed = new long[]{148, 148};

	/**
	 * Field descriptor (offset) for struct member 'visibility_range'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD__visibility_range);
	 * CPointer&lt;Float&gt; p_visibility_range = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visibility_range'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visibility_range = new long[]{152, 152};

	/**
	 * Field descriptor (offset) for struct member '_pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightGridCache lightgridcache = ...;
	 * CPointer&lt;Object&gt; p = lightgridcache.__dna__addressof(LightGridCache.__DNA__FIELD___pad5);
	 * CPointer&lt;Float&gt; p__pad5 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad5'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{156, 156};

	public LightGridCache(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightGridCache(LightGridCache that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CArrayFacade<CArrayFacade<Float>> mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mat);
		} else {
			__io__generic__copy( getMat(), mat);
		}
	}

	/**
	 * Get method for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset to the first irradiance sample in the pool. </p>
	 * @see #__DNA__FIELD__resolution
	 */
	
	public CArrayFacade<Integer> getResolution() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset to the first irradiance sample in the pool. </p>
	 * @see #__DNA__FIELD__resolution
	 */
	
	public void setResolution(CArrayFacade<Integer> resolution) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(resolution, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, resolution)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, resolution);
		} else {
			__io__generic__copy( getResolution(), resolution);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, offset);
		} else {
			__io__block.writeInt(__io__address + 76, offset);
		}
	}

	/**
	 * Get method for struct member 'corner'.
	 * @see #__DNA__FIELD__corner
	 */
	
	public CArrayFacade<Float> getCorner() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'corner'.
	 * @see #__DNA__FIELD__corner
	 */
	
	public void setCorner(CArrayFacade<Float> corner) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(corner, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, corner)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, corner);
		} else {
			__io__generic__copy( getCorner(), corner);
		}
	}

	/**
	 * Get method for struct member 'attenuation_scale'.
	 * @see #__DNA__FIELD__attenuation_scale
	 */
	
	public float getAttenuation_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'attenuation_scale'.
	 * @see #__DNA__FIELD__attenuation_scale
	 */
	
	public void setAttenuation_scale(float attenuation_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, attenuation_scale);
		} else {
			__io__block.writeFloat(__io__address + 92, attenuation_scale);
		}
	}

	/**
	 * Get method for struct member 'increment_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link World}  space vector between 2 opposite cells. </p>
	 * @see #__DNA__FIELD__increment_x
	 */
	
	public CArrayFacade<Float> getIncrement_x() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'increment_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link World}  space vector between 2 opposite cells. </p>
	 * @see #__DNA__FIELD__increment_x
	 */
	
	public void setIncrement_x(CArrayFacade<Float> increment_x) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(increment_x, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, increment_x)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, increment_x);
		} else {
			__io__generic__copy( getIncrement_x(), increment_x);
		}
	}

	/**
	 * Get method for struct member 'attenuation_bias'.
	 * @see #__DNA__FIELD__attenuation_bias
	 */
	
	public float getAttenuation_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'attenuation_bias'.
	 * @see #__DNA__FIELD__attenuation_bias
	 */
	
	public void setAttenuation_bias(float attenuation_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, attenuation_bias);
		} else {
			__io__block.writeFloat(__io__address + 108, attenuation_bias);
		}
	}

	/**
	 * Get method for struct member 'increment_y'.
	 * @see #__DNA__FIELD__increment_y
	 */
	
	public CArrayFacade<Float> getIncrement_y() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'increment_y'.
	 * @see #__DNA__FIELD__increment_y
	 */
	
	public void setIncrement_y(CArrayFacade<Float> increment_y) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(increment_y, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, increment_y)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, increment_y);
		} else {
			__io__generic__copy( getIncrement_y(), increment_y);
		}
	}

	/**
	 * Get method for struct member 'level_bias'.
	 * @see #__DNA__FIELD__level_bias
	 */
	
	public float getLevel_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'level_bias'.
	 * @see #__DNA__FIELD__level_bias
	 */
	
	public void setLevel_bias(float level_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, level_bias);
		} else {
			__io__block.writeFloat(__io__address + 124, level_bias);
		}
	}

	/**
	 * Get method for struct member 'increment_z'.
	 * @see #__DNA__FIELD__increment_z
	 */
	
	public CArrayFacade<Float> getIncrement_z() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'increment_z'.
	 * @see #__DNA__FIELD__increment_z
	 */
	
	public void setIncrement_z(CArrayFacade<Float> increment_z) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(increment_z, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, increment_z)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, increment_z);
		} else {
			__io__generic__copy( getIncrement_z(), increment_z);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public float get_pad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(float _pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, _pad4);
		} else {
			__io__block.writeFloat(__io__address + 140, _pad4);
		}
	}

	/**
	 * Get method for struct member 'visibility_bias'.
	 * @see #__DNA__FIELD__visibility_bias
	 */
	
	public float getVisibility_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'visibility_bias'.
	 * @see #__DNA__FIELD__visibility_bias
	 */
	
	public void setVisibility_bias(float visibility_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, visibility_bias);
		} else {
			__io__block.writeFloat(__io__address + 144, visibility_bias);
		}
	}

	/**
	 * Get method for struct member 'visibility_bleed'.
	 * @see #__DNA__FIELD__visibility_bleed
	 */
	
	public float getVisibility_bleed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'visibility_bleed'.
	 * @see #__DNA__FIELD__visibility_bleed
	 */
	
	public void setVisibility_bleed(float visibility_bleed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, visibility_bleed);
		} else {
			__io__block.writeFloat(__io__address + 148, visibility_bleed);
		}
	}

	/**
	 * Get method for struct member 'visibility_range'.
	 * @see #__DNA__FIELD__visibility_range
	 */
	
	public float getVisibility_range() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'visibility_range'.
	 * @see #__DNA__FIELD__visibility_range
	 */
	
	public void setVisibility_range(float visibility_range) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, visibility_range);
		} else {
			__io__block.writeFloat(__io__address + 152, visibility_range);
		}
	}

	/**
	 * Get method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public float get_pad5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public void set_pad5(float _pad5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, _pad5);
		} else {
			__io__block.writeFloat(__io__address + 156, _pad5);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LightGridCache> __io__addressof() {
		return new CPointer<LightGridCache>(__io__address, new Class[]{LightGridCache.class}, __io__block, __io__blockTable);
	}

}
