package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Scopes'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=5248, size64=5264)
public class Scopes extends CFacade {

	/**
	 * This is the sdna index of the struct Scopes.
	 * <p>
	 * It is required when allocating a new block to store data for Scopes.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 459;

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__ok);
	 * CPointer&lt;Integer&gt; p_ok = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sample_full'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__sample_full);
	 * CPointer&lt;Integer&gt; p_sample_full = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sample_full'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sample_full = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'sample_lines'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__sample_lines);
	 * CPointer&lt;Integer&gt; p_sample_lines = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sample_lines'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sample_lines = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proportion of original image source pixel lines to sample
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__accuracy);
	 * CPointer&lt;Float&gt; p_accuracy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'accuracy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__accuracy = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'wavefrm_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__wavefrm_mode);
	 * CPointer&lt;Integer&gt; p_wavefrm_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wavefrm_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wavefrm_mode = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'wavefrm_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__wavefrm_alpha);
	 * CPointer&lt;Float&gt; p_wavefrm_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wavefrm_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wavefrm_alpha = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'wavefrm_yfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__wavefrm_yfac);
	 * CPointer&lt;Float&gt; p_wavefrm_yfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wavefrm_yfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wavefrm_yfac = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'wavefrm_height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__wavefrm_height);
	 * CPointer&lt;Integer&gt; p_wavefrm_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wavefrm_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wavefrm_height = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'vecscope_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__vecscope_alpha);
	 * CPointer&lt;Float&gt; p_vecscope_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vecscope_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vecscope_alpha = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'vecscope_height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__vecscope_height);
	 * CPointer&lt;Integer&gt; p_vecscope_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vecscope_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vecscope_height = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'minmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__minmax);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_minmax = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minmax'</li>
	 * <li>Signature: 'float[3][2]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minmax = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'hist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__hist);
	 * CPointer&lt;Histogram&gt; p_hist = p.cast(new Class[]{Histogram.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hist'</li>
	 * <li>Signature: 'Histogram'</li>
	 * <li>Actual Size (32bit/64bit): 5160/5160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hist = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'waveform_1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__waveform_1);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_waveform_1 = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform_1'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform_1 = new long[]{5224, 5224};

	/**
	 * Field descriptor (offset) for struct member 'waveform_2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__waveform_2);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_waveform_2 = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform_2'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform_2 = new long[]{5228, 5232};

	/**
	 * Field descriptor (offset) for struct member 'waveform_3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__waveform_3);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_waveform_3 = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform_3'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform_3 = new long[]{5232, 5240};

	/**
	 * Field descriptor (offset) for struct member 'vecscope'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__vecscope);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_vecscope = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vecscope'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vecscope = new long[]{5236, 5248};

	/**
	 * Field descriptor (offset) for struct member 'waveform_tot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__waveform_tot);
	 * CPointer&lt;Integer&gt; p_waveform_tot = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform_tot'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform_tot = new long[]{5240, 5256};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scopes scopes = ...;
	 * CPointer&lt;Object&gt; p = scopes.__dna__addressof(Scopes.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{5244, 5260};

	public Scopes(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Scopes(Scopes that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public int getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(int ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, ok);
		} else {
			__io__block.writeInt(__io__address + 0, ok);
		}
	}

	/**
	 * Get method for struct member 'sample_full'.
	 * @see #__DNA__FIELD__sample_full
	 */
	
	public int getSample_full() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'sample_full'.
	 * @see #__DNA__FIELD__sample_full
	 */
	
	public void setSample_full(int sample_full) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, sample_full);
		} else {
			__io__block.writeInt(__io__address + 4, sample_full);
		}
	}

	/**
	 * Get method for struct member 'sample_lines'.
	 * @see #__DNA__FIELD__sample_lines
	 */
	
	public int getSample_lines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'sample_lines'.
	 * @see #__DNA__FIELD__sample_lines
	 */
	
	public void setSample_lines(int sample_lines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, sample_lines);
		} else {
			__io__block.writeInt(__io__address + 8, sample_lines);
		}
	}

	/**
	 * Get method for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proportion of original image source pixel lines to sample
	 * @see #__DNA__FIELD__accuracy
	 */
	
	public float getAccuracy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proportion of original image source pixel lines to sample
	 * @see #__DNA__FIELD__accuracy
	 */
	
	public void setAccuracy(float accuracy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, accuracy);
		} else {
			__io__block.writeFloat(__io__address + 12, accuracy);
		}
	}

	/**
	 * Get method for struct member 'wavefrm_mode'.
	 * @see #__DNA__FIELD__wavefrm_mode
	 */
	
	public int getWavefrm_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'wavefrm_mode'.
	 * @see #__DNA__FIELD__wavefrm_mode
	 */
	
	public void setWavefrm_mode(int wavefrm_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, wavefrm_mode);
		} else {
			__io__block.writeInt(__io__address + 16, wavefrm_mode);
		}
	}

	/**
	 * Get method for struct member 'wavefrm_alpha'.
	 * @see #__DNA__FIELD__wavefrm_alpha
	 */
	
	public float getWavefrm_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'wavefrm_alpha'.
	 * @see #__DNA__FIELD__wavefrm_alpha
	 */
	
	public void setWavefrm_alpha(float wavefrm_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, wavefrm_alpha);
		} else {
			__io__block.writeFloat(__io__address + 20, wavefrm_alpha);
		}
	}

	/**
	 * Get method for struct member 'wavefrm_yfac'.
	 * @see #__DNA__FIELD__wavefrm_yfac
	 */
	
	public float getWavefrm_yfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'wavefrm_yfac'.
	 * @see #__DNA__FIELD__wavefrm_yfac
	 */
	
	public void setWavefrm_yfac(float wavefrm_yfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, wavefrm_yfac);
		} else {
			__io__block.writeFloat(__io__address + 24, wavefrm_yfac);
		}
	}

	/**
	 * Get method for struct member 'wavefrm_height'.
	 * @see #__DNA__FIELD__wavefrm_height
	 */
	
	public int getWavefrm_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'wavefrm_height'.
	 * @see #__DNA__FIELD__wavefrm_height
	 */
	
	public void setWavefrm_height(int wavefrm_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, wavefrm_height);
		} else {
			__io__block.writeInt(__io__address + 28, wavefrm_height);
		}
	}

	/**
	 * Get method for struct member 'vecscope_alpha'.
	 * @see #__DNA__FIELD__vecscope_alpha
	 */
	
	public float getVecscope_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'vecscope_alpha'.
	 * @see #__DNA__FIELD__vecscope_alpha
	 */
	
	public void setVecscope_alpha(float vecscope_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, vecscope_alpha);
		} else {
			__io__block.writeFloat(__io__address + 32, vecscope_alpha);
		}
	}

	/**
	 * Get method for struct member 'vecscope_height'.
	 * @see #__DNA__FIELD__vecscope_height
	 */
	
	public int getVecscope_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'vecscope_height'.
	 * @see #__DNA__FIELD__vecscope_height
	 */
	
	public void setVecscope_height(int vecscope_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, vecscope_height);
		} else {
			__io__block.writeInt(__io__address + 36, vecscope_height);
		}
	}

	/**
	 * Get method for struct member 'minmax'.
	 * @see #__DNA__FIELD__minmax
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMinmax() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'minmax'.
	 * @see #__DNA__FIELD__minmax
	 */
	
	public void setMinmax(CArrayFacade<CArrayFacade<Float>> minmax) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(minmax, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, minmax)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, minmax);
		} else {
			__io__generic__copy( getMinmax(), minmax);
		}
	}

	/**
	 * Get method for struct member 'hist'.
	 * @see #__DNA__FIELD__hist
	 */
	
	public Histogram getHist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Histogram(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new Histogram(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hist'.
	 * @see #__DNA__FIELD__hist
	 */
	
	public void setHist(Histogram hist) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(hist, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hist)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hist);
		} else {
			__io__generic__copy( getHist(), hist);
		}
	}

	/**
	 * Get method for struct member 'waveform_1'.
	 * @see #__DNA__FIELD__waveform_1
	 */
	
	public CPointer<Float> getWaveform_1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5224);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'waveform_1'.
	 * @see #__DNA__FIELD__waveform_1
	 */
	
	public void setWaveform_1(CPointer<Float> waveform_1) throws IOException
	{
		long __address = ((waveform_1 == null) ? 0 : waveform_1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5224, __address);
		} else {
			__io__block.writeLong(__io__address + 5224, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform_2'.
	 * @see #__DNA__FIELD__waveform_2
	 */
	
	public CPointer<Float> getWaveform_2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'waveform_2'.
	 * @see #__DNA__FIELD__waveform_2
	 */
	
	public void setWaveform_2(CPointer<Float> waveform_2) throws IOException
	{
		long __address = ((waveform_2 == null) ? 0 : waveform_2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5232, __address);
		} else {
			__io__block.writeLong(__io__address + 5228, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform_3'.
	 * @see #__DNA__FIELD__waveform_3
	 */
	
	public CPointer<Float> getWaveform_3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5232);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'waveform_3'.
	 * @see #__DNA__FIELD__waveform_3
	 */
	
	public void setWaveform_3(CPointer<Float> waveform_3) throws IOException
	{
		long __address = ((waveform_3 == null) ? 0 : waveform_3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5240, __address);
		} else {
			__io__block.writeLong(__io__address + 5232, __address);
		}
	}

	/**
	 * Get method for struct member 'vecscope'.
	 * @see #__DNA__FIELD__vecscope
	 */
	
	public CPointer<Float> getVecscope() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5236);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vecscope'.
	 * @see #__DNA__FIELD__vecscope
	 */
	
	public void setVecscope(CPointer<Float> vecscope) throws IOException
	{
		long __address = ((vecscope == null) ? 0 : vecscope.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5248, __address);
		} else {
			__io__block.writeLong(__io__address + 5236, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform_tot'.
	 * @see #__DNA__FIELD__waveform_tot
	 */
	
	public int getWaveform_tot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 5256);
		} else {
			return __io__block.readInt(__io__address + 5240);
		}
	}

	/**
	 * Set method for struct member 'waveform_tot'.
	 * @see #__DNA__FIELD__waveform_tot
	 */
	
	public void setWaveform_tot(int waveform_tot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 5256, waveform_tot);
		} else {
			__io__block.writeInt(__io__address + 5240, waveform_tot);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 5260);
		} else {
			return __io__block.readInt(__io__address + 5244);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 5260, pad);
		} else {
			__io__block.writeInt(__io__address + 5244, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Scopes> __io__addressof() {
		return new CPointer<Scopes>(__io__address, new Class[]{Scopes.class}, __io__block, __io__blockTable);
	}

}
