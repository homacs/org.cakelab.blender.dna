package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AudioData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Audio </p>
 */

@CMetaData(size32=32, size64=32)
public class AudioData extends CFacade {

	/**
	 * This is the sdna index of the struct AudioData.
	 * <p>
	 * It is required when allocating a new block to store data for AudioData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 172;

	/**
	 * Field descriptor (offset) for struct member 'mixrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__mixrate);
	 * CPointer&lt;Integer&gt; p_mixrate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mixrate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mixrate = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'main'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__main);
	 * CPointer&lt;Float&gt; p_main = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'main'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__main = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'speed_of_sound'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__speed_of_sound);
	 * CPointer&lt;Float&gt; p_speed_of_sound = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed_of_sound'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed_of_sound = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'doppler_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__doppler_factor);
	 * CPointer&lt;Float&gt; p_doppler_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'doppler_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__doppler_factor = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'distance_model'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__distance_model);
	 * CPointer&lt;Integer&gt; p_distance_model = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance_model'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance_model = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AudioData audiodata = ...;
	 * CPointer&lt;Object&gt; p = audiodata.__dna__addressof(AudioData.__DNA__FIELD__pad2);
	 * CPointer&lt;Float&gt; p_pad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{28, 28};

	public AudioData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AudioData(AudioData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mixrate'.
	 * @see #__DNA__FIELD__mixrate
	 */
	
	public int getMixrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'mixrate'.
	 * @see #__DNA__FIELD__mixrate
	 */
	
	public void setMixrate(int mixrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, mixrate);
		} else {
			__io__block.writeInt(__io__address + 0, mixrate);
		}
	}

	/**
	 * Get method for struct member 'main'.
	 * @see #__DNA__FIELD__main
	 */
	
	public float getMain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'main'.
	 * @see #__DNA__FIELD__main
	 */
	
	public void setMain(float main) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, main);
		} else {
			__io__block.writeFloat(__io__address + 4, main);
		}
	}

	/**
	 * Get method for struct member 'speed_of_sound'.
	 * @see #__DNA__FIELD__speed_of_sound
	 */
	
	public float getSpeed_of_sound() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'speed_of_sound'.
	 * @see #__DNA__FIELD__speed_of_sound
	 */
	
	public void setSpeed_of_sound(float speed_of_sound) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, speed_of_sound);
		} else {
			__io__block.writeFloat(__io__address + 8, speed_of_sound);
		}
	}

	/**
	 * Get method for struct member 'doppler_factor'.
	 * @see #__DNA__FIELD__doppler_factor
	 */
	
	public float getDoppler_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'doppler_factor'.
	 * @see #__DNA__FIELD__doppler_factor
	 */
	
	public void setDoppler_factor(float doppler_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, doppler_factor);
		} else {
			__io__block.writeFloat(__io__address + 12, doppler_factor);
		}
	}

	/**
	 * Get method for struct member 'distance_model'.
	 * @see #__DNA__FIELD__distance_model
	 */
	
	public int getDistance_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'distance_model'.
	 * @see #__DNA__FIELD__distance_model
	 */
	
	public void setDistance_model(int distance_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, distance_model);
		} else {
			__io__block.writeInt(__io__address + 16, distance_model);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, flag);
		} else {
			__io__block.writeShort(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, pad);
		} else {
			__io__block.writeShort(__io__address + 22, pad);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, volume);
		} else {
			__io__block.writeFloat(__io__address + 24, volume);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public float getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(float pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, pad2);
		} else {
			__io__block.writeFloat(__io__address + 28, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AudioData> __io__addressof() {
		return new CPointer<AudioData>(__io__address, new Class[]{AudioData.class}, __io__block, __io__blockTable);
	}

}
