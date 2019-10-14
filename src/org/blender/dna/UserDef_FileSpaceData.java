package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UserDef_FileSpaceData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Storage for UI data that to keep it even after the window was closed. (Similar to {@link UserDef_SpaceData} .) </p>
 */

@CMetaData(size32=32, size64=32)
public class UserDef_FileSpaceData extends CFacade {

	/**
	 * This is the sdna index of the struct UserDef_FileSpaceData.
	 * <p>
	 * It is required when allocating a new block to store data for UserDef_FileSpaceData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 260;

	/**
	 * Field descriptor (offset) for struct member 'display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.display}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__display_type);
	 * CPointer&lt;Integer&gt; p_display_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'thumbnail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FileSelectParams.thumbnail_size </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__thumbnail_size);
	 * CPointer&lt;Integer&gt; p_thumbnail_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thumbnail_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thumbnail_size = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'sort_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.sort}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__sort_type);
	 * CPointer&lt;Integer&gt; p_sort_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sort_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sort_type = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.details_flags}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__details_flags);
	 * CPointer&lt;Integer&gt; p_details_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'details_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__details_flags = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.flag}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'temp_win_sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info used when creating the file browser in a temporary window. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__temp_win_sizex);
	 * CPointer&lt;Integer&gt; p_temp_win_sizex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp_win_sizex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp_win_sizex = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'temp_win_sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_FileSpaceData userdef_filespacedata = ...;
	 * CPointer&lt;Object&gt; p = userdef_filespacedata.__dna__addressof(UserDef_FileSpaceData.__DNA__FIELD__temp_win_sizey);
	 * CPointer&lt;Integer&gt; p_temp_win_sizey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp_win_sizey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp_win_sizey = new long[]{28, 28};

	public UserDef_FileSpaceData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UserDef_FileSpaceData(UserDef_FileSpaceData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.display}  </p>
	 * @see #__DNA__FIELD__display_type
	 */
	
	public int getDisplay_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.display}  </p>
	 * @see #__DNA__FIELD__display_type
	 */
	
	public void setDisplay_type(int display_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, display_type);
		} else {
			__io__block.writeInt(__io__address + 0, display_type);
		}
	}

	/**
	 * Get method for struct member 'thumbnail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FileSelectParams.thumbnail_size </p>
	 * @see #__DNA__FIELD__thumbnail_size
	 */
	
	public int getThumbnail_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'thumbnail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FileSelectParams.thumbnail_size </p>
	 * @see #__DNA__FIELD__thumbnail_size
	 */
	
	public void setThumbnail_size(int thumbnail_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, thumbnail_size);
		} else {
			__io__block.writeInt(__io__address + 4, thumbnail_size);
		}
	}

	/**
	 * Get method for struct member 'sort_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.sort}  </p>
	 * @see #__DNA__FIELD__sort_type
	 */
	
	public int getSort_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'sort_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.sort}  </p>
	 * @see #__DNA__FIELD__sort_type
	 */
	
	public void setSort_type(int sort_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, sort_type);
		} else {
			__io__block.writeInt(__io__address + 8, sort_type);
		}
	}

	/**
	 * Get method for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.details_flags}  </p>
	 * @see #__DNA__FIELD__details_flags
	 */
	
	public int getDetails_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.details_flags}  </p>
	 * @see #__DNA__FIELD__details_flags
	 */
	
	public void setDetails_flags(int details_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, details_flags);
		} else {
			__io__block.writeInt(__io__address + 12, details_flags);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.flag}  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link FileSelectParams.flag}  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, flag);
		} else {
			__io__block.writeInt(__io__address + 16, flag);
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
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
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
	 * Get method for struct member 'temp_win_sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info used when creating the file browser in a temporary window. </p>
	 * @see #__DNA__FIELD__temp_win_sizex
	 */
	
	public int getTemp_win_sizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'temp_win_sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info used when creating the file browser in a temporary window. </p>
	 * @see #__DNA__FIELD__temp_win_sizex
	 */
	
	public void setTemp_win_sizex(int temp_win_sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, temp_win_sizex);
		} else {
			__io__block.writeInt(__io__address + 24, temp_win_sizex);
		}
	}

	/**
	 * Get method for struct member 'temp_win_sizey'.
	 * @see #__DNA__FIELD__temp_win_sizey
	 */
	
	public int getTemp_win_sizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'temp_win_sizey'.
	 * @see #__DNA__FIELD__temp_win_sizey
	 */
	
	public void setTemp_win_sizey(int temp_win_sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, temp_win_sizey);
		} else {
			__io__block.writeInt(__io__address + 28, temp_win_sizey);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UserDef_FileSpaceData> __io__addressof() {
		return new CPointer<UserDef_FileSpaceData>(__io__address, new Class[]{UserDef_FileSpaceData.class}, __io__block, __io__blockTable);
	}

}
