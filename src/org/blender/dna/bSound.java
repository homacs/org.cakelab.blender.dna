package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bSound'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1208, size64=1272)
public class bSound extends CFacade {

	/**
	 * This is the sdna index of the struct bSound.
	 * <p>
	 * It is required when allocating a new block to store data for bSound.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 306;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The path to the sound file.1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The packed file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{1144, 1176};

	/**
	 * Field descriptor (offset) for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle for audaspace. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle = new long[]{1148, 1184};

	/**
	 * Field descriptor (offset) for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated; used for loading pre 2.5 files. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__newpackedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_newpackedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'newpackedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__newpackedfile = new long[]{1152, 1192};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{1156, 1200};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{1160, 1208};

	/**
	 * Field descriptor (offset) for struct member 'attenuation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__attenuation);
	 * CPointer&lt;Float&gt; p_attenuation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation = new long[]{1164, 1212};

	/**
	 * Field descriptor (offset) for struct member 'pitch'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__pitch);
	 * CPointer&lt;Float&gt; p_pitch = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pitch'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pitch = new long[]{1168, 1216};

	/**
	 * Field descriptor (offset) for struct member 'min_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__min_gain);
	 * CPointer&lt;Float&gt; p_min_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_gain = new long[]{1172, 1220};

	/**
	 * Field descriptor (offset) for struct member 'max_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__max_gain);
	 * CPointer&lt;Float&gt; p_max_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_gain = new long[]{1176, 1224};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{1180, 1228};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{1184, 1232};

	/**
	 * Field descriptor (offset) for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only, always reset in readfile. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__tags);
	 * CPointer&lt;Short&gt; p_tags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tags = new long[]{1186, 1234};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1188, 1236};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused currently int type; struct {@link bSound}  *child_sound; The audaspace handle for cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{1192, 1240};

	/**
	 * Field descriptor (offset) for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Waveform display data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__waveform);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_waveform = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform = new long[]{1196, 1248};

	/**
	 * Field descriptor (offset) for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise it's handle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__playback_handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_playback_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'playback_handle'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__playback_handle = new long[]{1200, 1256};

	/**
	 * Field descriptor (offset) for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spin-lock for asynchronous loading of sounds. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__spinlock);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_spinlock = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spinlock'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spinlock = new long[]{1204, 1264};

	public bSound(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bSound(bSound that) {
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
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The path to the sound file.1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The path to the sound file.1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The packed file. </p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The packed file. </p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1176, __address);
		} else {
			__io__block.writeLong(__io__address + 1144, __address);
		}
	}

	/**
	 * Get method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle for audaspace. </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public CPointer<Object> getHandle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle for audaspace. </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public void setHandle(CPointer<Object> handle) throws IOException
	{
		long __address = ((handle == null) ? 0 : handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1184, __address);
		} else {
			__io__block.writeLong(__io__address + 1148, __address);
		}
	}

	/**
	 * Get method for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated; used for loading pre 2.5 files. </p>
	 * @see #__DNA__FIELD__newpackedfile
	 */
	
	public CPointer<PackedFile> getNewpackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated; used for loading pre 2.5 files. </p>
	 * @see #__DNA__FIELD__newpackedfile
	 */
	
	public void setNewpackedfile(CPointer<PackedFile> newpackedfile) throws IOException
	{
		long __address = ((newpackedfile == null) ? 0 : newpackedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1192, __address);
		} else {
			__io__block.writeLong(__io__address + 1152, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1200, __address);
		} else {
			__io__block.writeLong(__io__address + 1156, __address);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1208);
		} else {
			return __io__block.readFloat(__io__address + 1160);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1208, volume);
		} else {
			__io__block.writeFloat(__io__address + 1160, volume);
		}
	}

	/**
	 * Get method for struct member 'attenuation'.
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public float getAttenuation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1212);
		} else {
			return __io__block.readFloat(__io__address + 1164);
		}
	}

	/**
	 * Set method for struct member 'attenuation'.
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public void setAttenuation(float attenuation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1212, attenuation);
		} else {
			__io__block.writeFloat(__io__address + 1164, attenuation);
		}
	}

	/**
	 * Get method for struct member 'pitch'.
	 * @see #__DNA__FIELD__pitch
	 */
	
	public float getPitch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1216);
		} else {
			return __io__block.readFloat(__io__address + 1168);
		}
	}

	/**
	 * Set method for struct member 'pitch'.
	 * @see #__DNA__FIELD__pitch
	 */
	
	public void setPitch(float pitch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1216, pitch);
		} else {
			__io__block.writeFloat(__io__address + 1168, pitch);
		}
	}

	/**
	 * Get method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public float getMin_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1220);
		} else {
			return __io__block.readFloat(__io__address + 1172);
		}
	}

	/**
	 * Set method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public void setMin_gain(float min_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1220, min_gain);
		} else {
			__io__block.writeFloat(__io__address + 1172, min_gain);
		}
	}

	/**
	 * Get method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public float getMax_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1224);
		} else {
			return __io__block.readFloat(__io__address + 1176);
		}
	}

	/**
	 * Set method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public void setMax_gain(float max_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1224, max_gain);
		} else {
			__io__block.writeFloat(__io__address + 1176, max_gain);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1228);
		} else {
			return __io__block.readFloat(__io__address + 1180);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1228, distance);
		} else {
			__io__block.writeFloat(__io__address + 1180, distance);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1232);
		} else {
			return __io__block.readShort(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1232, flags);
		} else {
			__io__block.writeShort(__io__address + 1184, flags);
		}
	}

	/**
	 * Get method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only, always reset in readfile. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public short getTags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1234);
		} else {
			return __io__block.readShort(__io__address + 1186);
		}
	}

	/**
	 * Set method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only, always reset in readfile. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public void setTags(short tags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1234, tags);
		} else {
			__io__block.writeShort(__io__address + 1186, tags);
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
			return new CArrayFacade<Byte>(__io__address + 1236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1236;
		} else {
			__dna__offset = 1188;
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
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused currently int type; struct {@link bSound}  *child_sound; The audaspace handle for cache. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused currently int type; struct {@link bSound}  *child_sound; The audaspace handle for cache. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1240, __address);
		} else {
			__io__block.writeLong(__io__address + 1192, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Waveform display data. </p>
	 * @see #__DNA__FIELD__waveform
	 */
	
	public CPointer<Object> getWaveform() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Waveform display data. </p>
	 * @see #__DNA__FIELD__waveform
	 */
	
	public void setWaveform(CPointer<Object> waveform) throws IOException
	{
		long __address = ((waveform == null) ? 0 : waveform.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1248, __address);
		} else {
			__io__block.writeLong(__io__address + 1196, __address);
		}
	}

	/**
	 * Get method for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise it's handle </p>
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public CPointer<Object> getPlayback_handle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise it's handle </p>
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public void setPlayback_handle(CPointer<Object> playback_handle) throws IOException
	{
		long __address = ((playback_handle == null) ? 0 : playback_handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1256, __address);
		} else {
			__io__block.writeLong(__io__address + 1200, __address);
		}
	}

	/**
	 * Get method for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spin-lock for asynchronous loading of sounds. </p>
	 * @see #__DNA__FIELD__spinlock
	 */
	
	public CPointer<Object> getSpinlock() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spin-lock for asynchronous loading of sounds. </p>
	 * @see #__DNA__FIELD__spinlock
	 */
	
	public void setSpinlock(CPointer<Object> spinlock) throws IOException
	{
		long __address = ((spinlock == null) ? 0 : spinlock.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1264, __address);
		} else {
			__io__block.writeLong(__io__address + 1204, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bSound> __io__addressof() {
		return new CPointer<bSound>(__io__address, new Class[]{bSound.class}, __io__block, __io__blockTable);
	}

}
