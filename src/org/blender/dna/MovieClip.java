package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClip'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2340, size64=2464)
public class MovieClip extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClip.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClip.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 552;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__id);
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
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Where the clip comes from<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  or movie. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__source);
	 * CPointer&lt;Integer&gt; p_source = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{1148, 1184};

	/**
	 * Field descriptor (offset) for struct member 'lastframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last accessed frame number. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__lastframe);
	 * CPointer&lt;Integer&gt; p_lastframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastframe = new long[]{1152, 1188};

	/**
	 * Field descriptor (offset) for struct member 'lastsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of last accessed frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__lastsize);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_lastsize = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastsize'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastsize = new long[]{1156, 1192};

	/**
	 * Field descriptor (offset) for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display aspect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__aspx);
	 * CPointer&lt;Float&gt; p_aspx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspx = new long[]{1164, 1200};

	/**
	 * Field descriptor (offset) for struct member 'aspy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__aspy);
	 * CPointer&lt;Float&gt; p_aspy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspy = new long[]{1168, 1204};

	/**
	 * Field descriptor (offset) for struct member 'anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Movie source data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__anim);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_anim = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim'</li>
	 * <li>Signature: 'anim*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim = new long[]{1172, 1208};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for different stuff, not in file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'MovieClipCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{1176, 1216};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{1180, 1224};

	/**
	 * Field descriptor (offset) for struct member 'tracking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Data for SfM tracking. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__tracking);
	 * CPointer&lt;MovieTracking&gt; p_tracking = p.cast(new Class[]{MovieTracking.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracking'</li>
	 * <li>Signature: 'MovieTracking'</li>
	 * <li>Actual Size (32bit/64bit): 288/352</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracking = new long[]{1184, 1232};

	/**
	 * Field descriptor (offset) for struct member 'tracking_context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context of tracking job used to synchronize data like framenumber in {@link SpaceClip}  clip user. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__tracking_context);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tracking_context = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracking_context'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracking_context = new long[]{1472, 1584};

	/**
	 * Field descriptor (offset) for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Proxy to clip data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__proxy);
	 * CPointer&lt;MovieClipProxy&gt; p_proxy = p.cast(new Class[]{MovieClipProxy.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy'</li>
	 * <li>Signature: 'MovieClipProxy'</li>
	 * <li>Actual Size (32bit/64bit): 776/776</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy = new long[]{1476, 1592};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{2252, 2368};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Length of movie. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__len);
	 * CPointer&lt;Integer&gt; p_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{2256, 2372};

	/**
	 * Field descriptor (offset) for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  frame number footage starts playing at affects all data which is associated with a clip such as motion tracking, camera Reconstruction and so. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__start_frame);
	 * CPointer&lt;Integer&gt; p_start_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_frame = new long[]{2260, 2376};

	/**
	 * Field descriptor (offset) for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of footage first frame relative to it's file name (affects only how footage is loading, does not change data associated with a clip)<h4>Blender Source Code:</h4>
	 * <p> Offset which is adding to a file number when reading frame from a file. affects only a way how scene frame is mapping to a file name and not touches other data associated with a clip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__frame_offset);
	 * CPointer&lt;Integer&gt; p_frame_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_offset = new long[]{2264, 2380};

	/**
	 * Field descriptor (offset) for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__colorspace_settings);
	 * CPointer&lt;ColorManagedColorspaceSettings&gt; p_colorspace_settings = p.cast(new Class[]{ColorManagedColorspaceSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorspace_settings'</li>
	 * <li>Signature: 'ColorManagedColorspaceSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorspace_settings = new long[]{2268, 2384};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip movieclip = ...;
	 * CPointer&lt;Object&gt; p = movieclip.__dna__addressof(MovieClip.__DNA__FIELD__runtime);
	 * CPointer&lt;MovieClip_Runtime&gt; p_runtime = p.cast(new Class[]{MovieClip_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'MovieClip_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{2332, 2448};

	public MovieClip(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClip(MovieClip that) {
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
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
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
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 124;
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
	 * Get method for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Where the clip comes from<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  or movie. </p>
	 * @see #__DNA__FIELD__source
	 */
	
	public int getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1184);
		} else {
			return __io__block.readInt(__io__address + 1148);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Where the clip comes from<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  or movie. </p>
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(int source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1184, source);
		} else {
			__io__block.writeInt(__io__address + 1148, source);
		}
	}

	/**
	 * Get method for struct member 'lastframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last accessed frame number. </p>
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public int getLastframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1188);
		} else {
			return __io__block.readInt(__io__address + 1152);
		}
	}

	/**
	 * Set method for struct member 'lastframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last accessed frame number. </p>
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public void setLastframe(int lastframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1188, lastframe);
		} else {
			__io__block.writeInt(__io__address + 1152, lastframe);
		}
	}

	/**
	 * Get method for struct member 'lastsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of last accessed frame. </p>
	 * @see #__DNA__FIELD__lastsize
	 */
	
	public CArrayFacade<Integer> getLastsize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 1192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 1156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lastsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of last accessed frame. </p>
	 * @see #__DNA__FIELD__lastsize
	 */
	
	public void setLastsize(CArrayFacade<Integer> lastsize) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1192;
		} else {
			__dna__offset = 1156;
		}
		if (__io__equals(lastsize, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lastsize)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lastsize);
		} else {
			__io__generic__copy( getLastsize(), lastsize);
		}
	}

	/**
	 * Get method for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display aspect. </p>
	 * @see #__DNA__FIELD__aspx
	 */
	
	public float getAspx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1200);
		} else {
			return __io__block.readFloat(__io__address + 1164);
		}
	}

	/**
	 * Set method for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display aspect. </p>
	 * @see #__DNA__FIELD__aspx
	 */
	
	public void setAspx(float aspx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1200, aspx);
		} else {
			__io__block.writeFloat(__io__address + 1164, aspx);
		}
	}

	/**
	 * Get method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public float getAspy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1204);
		} else {
			return __io__block.readFloat(__io__address + 1168);
		}
	}

	/**
	 * Set method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public void setAspy(float aspy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1204, aspy);
		} else {
			__io__block.writeFloat(__io__address + 1168, aspy);
		}
	}

	/**
	 * Get method for struct member 'anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Movie source data. </p>
	 * @see #__DNA__FIELD__anim
	 */
	
	public CPointer<Object> getAnim() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Movie source data. </p>
	 * @see #__DNA__FIELD__anim
	 */
	
	public void setAnim(CPointer<Object> anim) throws IOException
	{
		long __address = ((anim == null) ? 0 : anim.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1208, __address);
		} else {
			__io__block.writeLong(__io__address + 1172, __address);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for different stuff, not in file. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for different stuff, not in file. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1216, __address);
		} else {
			__io__block.writeLong(__io__address + 1176, __address);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil data. </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1224, __address);
		} else {
			__io__block.writeLong(__io__address + 1180, __address);
		}
	}

	/**
	 * Get method for struct member 'tracking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Data for SfM tracking. </p>
	 * @see #__DNA__FIELD__tracking
	 */
	
	public MovieTracking getTracking() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTracking(__io__address + 1232, __io__block, __io__blockTable);
		} else {
			return new MovieTracking(__io__address + 1184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tracking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Data for SfM tracking. </p>
	 * @see #__DNA__FIELD__tracking
	 */
	
	public void setTracking(MovieTracking tracking) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1232;
		} else {
			__dna__offset = 1184;
		}
		if (__io__equals(tracking, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tracking)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tracking);
		} else {
			__io__generic__copy( getTracking(), tracking);
		}
	}

	/**
	 * Get method for struct member 'tracking_context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context of tracking job used to synchronize data like framenumber in {@link SpaceClip}  clip user. </p>
	 * @see #__DNA__FIELD__tracking_context
	 */
	
	public CPointer<Object> getTracking_context() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1584);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1472);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tracking_context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context of tracking job used to synchronize data like framenumber in {@link SpaceClip}  clip user. </p>
	 * @see #__DNA__FIELD__tracking_context
	 */
	
	public void setTracking_context(CPointer<Object> tracking_context) throws IOException
	{
		long __address = ((tracking_context == null) ? 0 : tracking_context.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1584, __address);
		} else {
			__io__block.writeLong(__io__address + 1472, __address);
		}
	}

	/**
	 * Get method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Proxy to clip data. </p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public MovieClipProxy getProxy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieClipProxy(__io__address + 1592, __io__block, __io__blockTable);
		} else {
			return new MovieClipProxy(__io__address + 1476, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'proxy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Proxy to clip data. </p>
	 * @see #__DNA__FIELD__proxy
	 */
	
	public void setProxy(MovieClipProxy proxy) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1592;
		} else {
			__dna__offset = 1476;
		}
		if (__io__equals(proxy, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, proxy)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, proxy);
		} else {
			__io__generic__copy( getProxy(), proxy);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2368);
		} else {
			return __io__block.readInt(__io__address + 2252);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2368, flag);
		} else {
			__io__block.writeInt(__io__address + 2252, flag);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Length of movie. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2372);
		} else {
			return __io__block.readInt(__io__address + 2256);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Length of movie. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2372, len);
		} else {
			__io__block.writeInt(__io__address + 2256, len);
		}
	}

	/**
	 * Get method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  frame number footage starts playing at affects all data which is associated with a clip such as motion tracking, camera Reconstruction and so. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public int getStart_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2376);
		} else {
			return __io__block.readInt(__io__address + 2260);
		}
	}

	/**
	 * Set method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  frame number footage starts playing at affects all data which is associated with a clip such as motion tracking, camera Reconstruction and so. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public void setStart_frame(int start_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2376, start_frame);
		} else {
			__io__block.writeInt(__io__address + 2260, start_frame);
		}
	}

	/**
	 * Get method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of footage first frame relative to it's file name (affects only how footage is loading, does not change data associated with a clip)<h4>Blender Source Code:</h4>
	 * <p> Offset which is adding to a file number when reading frame from a file. affects only a way how scene frame is mapping to a file name and not touches other data associated with a clip. </p>
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public int getFrame_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2380);
		} else {
			return __io__block.readInt(__io__address + 2264);
		}
	}

	/**
	 * Set method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of footage first frame relative to it's file name (affects only how footage is loading, does not change data associated with a clip)<h4>Blender Source Code:</h4>
	 * <p> Offset which is adding to a file number when reading frame from a file. affects only a way how scene frame is mapping to a file name and not touches other data associated with a clip. </p>
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public void setFrame_offset(int frame_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2380, frame_offset);
		} else {
			__io__block.writeInt(__io__address + 2264, frame_offset);
		}
	}

	/**
	 * Get method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getColorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 2384, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 2268, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public void setColorspace_settings(ColorManagedColorspaceSettings colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2384;
		} else {
			__dna__offset = 2268;
		}
		if (__io__equals(colorspace_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorspace_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorspace_settings);
		} else {
			__io__generic__copy( getColorspace_settings(), colorspace_settings);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public MovieClip_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieClip_Runtime(__io__address + 2448, __io__block, __io__blockTable);
		} else {
			return new MovieClip_Runtime(__io__address + 2332, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(MovieClip_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2448;
		} else {
			__dna__offset = 2332;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClip> __io__addressof() {
		return new CPointer<MovieClip>(__io__address, new Class[]{MovieClip.class}, __io__block, __io__blockTable);
	}

}
