package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
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

@CMetaData(size32=1248, size64=1320)
public class bSound extends CFacade {

	/**
	 * This is the sdna index of the struct bSound.
	 * <p>
	 * It is required when allocating a new block to store data for bSound.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 352;

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
	 * <li>Actual Size (32bit/64bit): 152/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'name'.
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
	public static final long[] __DNA__FIELD__name = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__packedfile = new long[]{1176, 1216};

	/**
	 * Field descriptor (offset) for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__handle = new long[]{1180, 1224};

	/**
	 * Field descriptor (offset) for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__newpackedfile = new long[]{1184, 1232};

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
	public static final long[] __DNA__FIELD__ipo = new long[]{1188, 1240};

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
	public static final long[] __DNA__FIELD__volume = new long[]{1192, 1248};

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
	public static final long[] __DNA__FIELD__attenuation = new long[]{1196, 1252};

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
	public static final long[] __DNA__FIELD__pitch = new long[]{1200, 1256};

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
	public static final long[] __DNA__FIELD__min_gain = new long[]{1204, 1260};

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
	public static final long[] __DNA__FIELD__max_gain = new long[]{1208, 1264};

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
	public static final long[] __DNA__FIELD__distance = new long[]{1212, 1268};

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
	public static final long[] __DNA__FIELD__flags = new long[]{1216, 1272};

	/**
	 * Field descriptor (offset) for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__tags = new long[]{1218, 1274};

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
	public static final long[] __DNA__FIELD___pad = new long[]{1220, 1276};

	/**
	 * Field descriptor (offset) for struct member 'offset_time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSound bsound = ...;
	 * CPointer&lt;Object&gt; p = bsound.__dna__addressof(bSound.__DNA__FIELD__offset_time);
	 * CPointer&lt;Double&gt; p_offset_time = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_time'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_time = new long[]{1224, 1280};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> int type; struct {@link bSound}  *child_sound; </p><p> Unused currently. The audaspace handle for cache. </p>
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
	public static final long[] __DNA__FIELD__cache = new long[]{1232, 1288};

	/**
	 * Field descriptor (offset) for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__waveform = new long[]{1236, 1296};

	/**
	 * Field descriptor (offset) for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise its handle </p>
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
	public static final long[] __DNA__FIELD__playback_handle = new long[]{1240, 1304};

	/**
	 * Field descriptor (offset) for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__spinlock = new long[]{1244, 1312};

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
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 152;
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
	 * <h4>Blender Source Code</h4>
	 * <p> The packed file. </p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The packed file. </p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1216, __address);
		} else {
			__io__block.writeLong(__io__address + 1176, __address);
		}
	}

	/**
	 * Get method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The handle for audaspace. </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public CPointer<Object> getHandle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The handle for audaspace. </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public void setHandle(CPointer<Object> handle) throws IOException
	{
		long __address = ((handle == null) ? 0 : handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1224, __address);
		} else {
			__io__block.writeLong(__io__address + 1180, __address);
		}
	}

	/**
	 * Get method for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated; used for loading pre 2.5 files. </p>
	 * @see #__DNA__FIELD__newpackedfile
	 */
	
	public CPointer<PackedFile> getNewpackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'newpackedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated; used for loading pre 2.5 files. </p>
	 * @see #__DNA__FIELD__newpackedfile
	 */
	
	public void setNewpackedfile(CPointer<PackedFile> newpackedfile) throws IOException
	{
		long __address = ((newpackedfile == null) ? 0 : newpackedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1232, __address);
		} else {
			__io__block.writeLong(__io__address + 1184, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1188);
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
			__io__block.writeLong(__io__address + 1240, __address);
		} else {
			__io__block.writeLong(__io__address + 1188, __address);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1248);
		} else {
			return __io__block.readFloat(__io__address + 1192);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1248, volume);
		} else {
			__io__block.writeFloat(__io__address + 1192, volume);
		}
	}

	/**
	 * Get method for struct member 'attenuation'.
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public float getAttenuation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1252);
		} else {
			return __io__block.readFloat(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'attenuation'.
	 * @see #__DNA__FIELD__attenuation
	 */
	
	public void setAttenuation(float attenuation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1252, attenuation);
		} else {
			__io__block.writeFloat(__io__address + 1196, attenuation);
		}
	}

	/**
	 * Get method for struct member 'pitch'.
	 * @see #__DNA__FIELD__pitch
	 */
	
	public float getPitch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1256);
		} else {
			return __io__block.readFloat(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'pitch'.
	 * @see #__DNA__FIELD__pitch
	 */
	
	public void setPitch(float pitch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1256, pitch);
		} else {
			__io__block.writeFloat(__io__address + 1200, pitch);
		}
	}

	/**
	 * Get method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public float getMin_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1260);
		} else {
			return __io__block.readFloat(__io__address + 1204);
		}
	}

	/**
	 * Set method for struct member 'min_gain'.
	 * @see #__DNA__FIELD__min_gain
	 */
	
	public void setMin_gain(float min_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1260, min_gain);
		} else {
			__io__block.writeFloat(__io__address + 1204, min_gain);
		}
	}

	/**
	 * Get method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public float getMax_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1264);
		} else {
			return __io__block.readFloat(__io__address + 1208);
		}
	}

	/**
	 * Set method for struct member 'max_gain'.
	 * @see #__DNA__FIELD__max_gain
	 */
	
	public void setMax_gain(float max_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1264, max_gain);
		} else {
			__io__block.writeFloat(__io__address + 1208, max_gain);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1268);
		} else {
			return __io__block.readFloat(__io__address + 1212);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1268, distance);
		} else {
			__io__block.writeFloat(__io__address + 1212, distance);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1272);
		} else {
			return __io__block.readShort(__io__address + 1216);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1272, flags);
		} else {
			__io__block.writeShort(__io__address + 1216, flags);
		}
	}

	/**
	 * Get method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only, always reset in readfile. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public short getTags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1274);
		} else {
			return __io__block.readShort(__io__address + 1218);
		}
	}

	/**
	 * Set method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only, always reset in readfile. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public void setTags(short tags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1274, tags);
		} else {
			__io__block.writeShort(__io__address + 1218, tags);
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
			return new CArrayFacade<Byte>(__io__address + 1276, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1276;
		} else {
			__dna__offset = 1220;
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
	 * Get method for struct member 'offset_time'.
	 * @see #__DNA__FIELD__offset_time
	 */
	
	public double getOffset_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 1280);
		} else {
			return __io__block.readDouble(__io__address + 1224);
		}
	}

	/**
	 * Set method for struct member 'offset_time'.
	 * @see #__DNA__FIELD__offset_time
	 */
	
	public void setOffset_time(double offset_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 1280, offset_time);
		} else {
			__io__block.writeDouble(__io__address + 1224, offset_time);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> int type; struct {@link bSound}  *child_sound; </p><p> Unused currently. The audaspace handle for cache. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1232);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> int type; struct {@link bSound}  *child_sound; </p><p> Unused currently. The audaspace handle for cache. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1288, __address);
		} else {
			__io__block.writeLong(__io__address + 1232, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Waveform display data. </p>
	 * @see #__DNA__FIELD__waveform
	 */
	
	public CPointer<Object> getWaveform() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1236);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'waveform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Waveform display data. </p>
	 * @see #__DNA__FIELD__waveform
	 */
	
	public void setWaveform(CPointer<Object> waveform) throws IOException
	{
		long __address = ((waveform == null) ? 0 : waveform.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1296, __address);
		} else {
			__io__block.writeLong(__io__address + 1236, __address);
		}
	}

	/**
	 * Get method for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise its handle </p>
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public CPointer<Object> getPlayback_handle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'playback_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The audaspace handle that should actually be played back. Should be cache if cache != NULL; otherwise its handle </p>
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public void setPlayback_handle(CPointer<Object> playback_handle) throws IOException
	{
		long __address = ((playback_handle == null) ? 0 : playback_handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1304, __address);
		} else {
			__io__block.writeLong(__io__address + 1240, __address);
		}
	}

	/**
	 * Get method for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Spin-lock for asynchronous loading of sounds. </p>
	 * @see #__DNA__FIELD__spinlock
	 */
	
	public CPointer<Object> getSpinlock() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1244);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'spinlock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Spin-lock for asynchronous loading of sounds. </p>
	 * @see #__DNA__FIELD__spinlock
	 */
	
	public void setSpinlock(CPointer<Object> spinlock) throws IOException
	{
		long __address = ((spinlock == null) ? 0 : spinlock.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1312, __address);
		} else {
			__io__block.writeLong(__io__address + 1244, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bSound> __io__addressof() {
		return new CPointer<bSound>(__io__address, new Class[]{bSound.class}, __io__block, __io__blockTable);
	}

}
