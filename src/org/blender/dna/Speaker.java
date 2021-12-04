package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Speaker'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=192, size64=240)
public class Speaker extends CFacade {

	/**
	 * This is the sdna index of the struct Speaker.
	 * <p>
	 * It is required when allocating a new block to store data for Speaker.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 674;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 136/176</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sound data-block used by this speaker
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__sound);
	 * CPointer&lt;CPointer&lt;bSound&gt;&gt; p_sound = p.cast(new Class[]{CPointer.class, bSound.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sound'</li>
	 * <li>Signature: 'bSound*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sound = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'volume_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum volume, no matter how near the object is<h4>Blender Source Code:</h4>
	 * <p> not animatable properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__volume_max);
	 * CPointer&lt;Float&gt; p_volume_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume_max = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'volume_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum volume, no matter how far away the object is
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__volume_min);
	 * CPointer&lt;Float&gt; p_volume_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume_min = new long[]{148, 196};

	/**
	 * Field descriptor (offset) for struct member 'distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for volume calculation, no matter how far away the object is
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__distance_max);
	 * CPointer&lt;Float&gt; p_distance_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance_max = new long[]{152, 200};

	/**
	 * Field descriptor (offset) for struct member 'distance_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference distance at which volume is 100%
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__distance_reference);
	 * CPointer&lt;Float&gt; p_distance_reference = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance_reference'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance_reference = new long[]{156, 204};

	/**
	 * Field descriptor (offset) for struct member 'attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong the distance affects volume, depending on distance model
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__attenuation);
	 * CPointer&lt;Float&gt; p_attenuation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation = new long[]{160, 208};

	/**
	 * Field descriptor (offset) for struct member 'cone_angle_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the outer cone, in degrees, outside this cone the volume is the outer cone volume, between inner and outer cone the volume is interpolated
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__cone_angle_outer);
	 * CPointer&lt;Float&gt; p_cone_angle_outer = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_angle_outer'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_angle_outer = new long[]{164, 212};

	/**
	 * Field descriptor (offset) for struct member 'cone_angle_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the inner cone, in degrees, inside the cone the volume is 100%
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__cone_angle_inner);
	 * CPointer&lt;Float&gt; p_cone_angle_inner = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_angle_inner'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_angle_inner = new long[]{168, 216};

	/**
	 * Field descriptor (offset) for struct member 'cone_volume_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume outside the outer cone
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__cone_volume_outer);
	 * CPointer&lt;Float&gt; p_cone_volume_outer = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cone_volume_outer'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cone_volume_outer = new long[]{172, 220};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How loud the sound is<h4>Blender Source Code:</h4>
	 * <p> animatable properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{176, 224};

	/**
	 * Field descriptor (offset) for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Playback pitch of the sound
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__pitch);
	 * CPointer&lt;Float&gt; p_pitch = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pitch'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pitch = new long[]{180, 228};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{184, 232};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Speaker speaker = ...;
	 * CPointer&lt;Object&gt; p = speaker.__dna__addressof(Speaker.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{186, 234};

	public Speaker(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Speaker(Speaker that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sound data-block used by this speaker
	 * @see #__DNA__FIELD__sound
	 */
	
	public CPointer<bSound> getSound() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bSound.class};
		return new CPointer<bSound>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bSound.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sound data-block used by this speaker
	 * @see #__DNA__FIELD__sound
	 */
	
	public void setSound(CPointer<bSound> sound) throws IOException
	{
		long __address = ((sound == null) ? 0 : sound.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'volume_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum volume, no matter how near the object is<h4>Blender Source Code:</h4>
	 * <p> not animatable properties </p>
	 * @see #__DNA__FIELD__volume_max
	 */
	
	public float getVolume_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'volume_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum volume, no matter how near the object is<h4>Blender Source Code:</h4>
	 * <p> not animatable properties </p>
	 * @see #__DNA__FIELD__volume_max
	 */
	
	public void setVolume_max(float volume_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, volume_max);
		} else {
			__io__block.writeFloat(__io__address + 144, volume_max);
		}
	}

	/**
	 * Get method for struct member 'volume_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum volume, no matter how far away the object is
	 * @see #__DNA__FIELD__volume_min
	 */
	
	public float getVolume_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'volume_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum volume, no matter how far away the object is
	 * @see #__DNA__FIELD__volume_min
	 */
	
	public void setVolume_min(float volume_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, volume_min);
		} else {
			__io__block.writeFloat(__io__address + 148, volume_min);
		}
	}

	/**
	 * Get method for struct member 'distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for volume calculation, no matter how far away the object is
	 * @see #__DNA__FIELD__distance_max
	 */
	
	public float getDistance_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'distance_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for volume calculation, no matter how far away the object is
	 * @see #__DNA__FIELD__distance_max
	 */
	
	public void setDistance_max(float distance_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, distance_max);
		} else {
			__io__block.writeFloat(__io__address + 152, distance_max);
		}
	}

	/**
	 * Get method for struct member 'distance_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference distance at which volume is 100%
	 * @see #__DNA__FIELD__distance_reference
	 */
	
	public float getDistance_reference() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'distance_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference distance at which volume is 100%
	 * @see #__DNA__FIELD__distance_reference
	 */
	
	public void setDistance_reference(float distance_reference) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, distance_reference);
		} else {
			__io__block.writeFloat(__io__address + 156, distance_reference);
		}
	}

	/**
	 * Get method for struct member 'attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong the distance affects volume, depending on distance model
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public float getAttenuation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong the distance affects volume, depending on distance model
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public void setAttenuation(float attenuation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, attenuation);
		} else {
			__io__block.writeFloat(__io__address + 160, attenuation);
		}
	}

	/**
	 * Get method for struct member 'cone_angle_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the outer cone, in degrees, outside this cone the volume is the outer cone volume, between inner and outer cone the volume is interpolated
	 * @see #__DNA__FIELD__cone_angle_outer
	 */
	
	public float getCone_angle_outer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'cone_angle_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the outer cone, in degrees, outside this cone the volume is the outer cone volume, between inner and outer cone the volume is interpolated
	 * @see #__DNA__FIELD__cone_angle_outer
	 */
	
	public void setCone_angle_outer(float cone_angle_outer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, cone_angle_outer);
		} else {
			__io__block.writeFloat(__io__address + 164, cone_angle_outer);
		}
	}

	/**
	 * Get method for struct member 'cone_angle_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the inner cone, in degrees, inside the cone the volume is 100%
	 * @see #__DNA__FIELD__cone_angle_inner
	 */
	
	public float getCone_angle_inner() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'cone_angle_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the inner cone, in degrees, inside the cone the volume is 100%
	 * @see #__DNA__FIELD__cone_angle_inner
	 */
	
	public void setCone_angle_inner(float cone_angle_inner) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, cone_angle_inner);
		} else {
			__io__block.writeFloat(__io__address + 168, cone_angle_inner);
		}
	}

	/**
	 * Get method for struct member 'cone_volume_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume outside the outer cone
	 * @see #__DNA__FIELD__cone_volume_outer
	 */
	
	public float getCone_volume_outer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'cone_volume_outer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume outside the outer cone
	 * @see #__DNA__FIELD__cone_volume_outer
	 */
	
	public void setCone_volume_outer(float cone_volume_outer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, cone_volume_outer);
		} else {
			__io__block.writeFloat(__io__address + 172, cone_volume_outer);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How loud the sound is<h4>Blender Source Code:</h4>
	 * <p> animatable properties </p>
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How loud the sound is<h4>Blender Source Code:</h4>
	 * <p> animatable properties </p>
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, volume);
		} else {
			__io__block.writeFloat(__io__address + 176, volume);
		}
	}

	/**
	 * Get method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Playback pitch of the sound
	 * @see #__DNA__FIELD__pitch
	 */
	
	public float getPitch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Playback pitch of the sound
	 * @see #__DNA__FIELD__pitch
	 */
	
	public void setPitch(float pitch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, pitch);
		} else {
			__io__block.writeFloat(__io__address + 180, pitch);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, flag);
		} else {
			__io__block.writeShort(__io__address + 184, flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 234, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 234;
		} else {
			__dna__offset = 186;
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
	public CPointer<Speaker> __io__addressof() {
		return new CPointer<Speaker>(__io__address, new Class[]{Speaker.class}, __io__block, __io__blockTable);
	}

}
