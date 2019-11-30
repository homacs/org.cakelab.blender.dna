package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileGlobal'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * FileGlobal stores a part of the current user-interface settings at the moment of saving, and the file-specific settings.<h4>Blender Source Code:</h4>
 * <p>{@link FileGlobal}  stores a part of the current user-interface settings at the moment of saving, and the file-specific settings. </p>
 */

@CMetaData(size32=1088, size64=1104)
public class FileGlobal extends CFacade {

	/**
	 * This is the sdna index of the struct FileGlobal.
	 * <p>
	 * It is required when allocating a new block to store data for FileGlobal.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 272;

	/**
	 * Field descriptor (offset) for struct member 'subvstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needs to be here, for human fileformat recognition (keep first!). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__subvstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subvstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subvstr'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subvstr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__subversion);
	 * CPointer&lt;Short&gt; p_subversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subversion = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'minversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__minversion);
	 * CPointer&lt;Short&gt; p_minversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minversion = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'minsubversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__minsubversion);
	 * CPointer&lt;Short&gt; p_minsubversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minsubversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minsubversion = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'curscreen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__curscreen);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_curscreen = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curscreen'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curscreen = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'curscene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__curscene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_curscene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curscene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curscene = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'cur_view_layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__cur_view_layer);
	 * CPointer&lt;CPointer&lt;ViewLayer&gt;&gt; p_cur_view_layer = p.cast(new Class[]{CPointer.class, ViewLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_view_layer'</li>
	 * <li>Signature: 'ViewLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_view_layer = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'fileflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3><ul>
	 * 				           <li> G_AUTOPACK               (1 << 0)</li>
	 * 				           <li> G_FILE_COMPRESS          (1 << 1)</li>
	 * 				           <li> G_FILE_AUTOPLAY          (1 << 2)</li>
	 * 				           <li> G_FILE_ENABLE_ALL_FRAMES (1 << 3): deprecated</li>
	 * 				           <li> G_FILE_SHOW_DEBUG_PROPS  (1 << 4): deprecated</li>
	 * 				           <li> G_FILE_SHOW_FRAMERATE    (1 << 5): deprecated</li>
	 * 				           <li> G_FILE_USERPREFS         (1 << 9)</li>
	 * 				           <li> G_FILE_NO_UI             (1 << 10)</li>
	 * 				           <li> G_FILE_GAME_MAT          (1 << 12): deprecated</li>
	 * 				           <li> G_FILE_SHOW_PHYSICS      (1 << 14): deprecated</li>
	 * 				           <li> G_FILE_GAME_MAT_GLSL     (1 << 15): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADERS   (1 << 17): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADOWS   (1 << 18): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_RAMPS     (1 << 19): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_NODES     (1 << 20): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_EXTRA_TEX (1 << 21): deprecated</li>
	 * 				           <li> G_FILE_IGNORE_DEPRECATION_WARNINGS  (1 << 22): deprecated</li>
	 * 				           <li> G_FILE_RECOVER           (1 << 23)</li>
	 * 				           <li> G_FILE_RELATIVE_REMAP    (1 << 24)</li>
	 * 				           <li> G_FILE_HISTORY           (1 << 25)</li>
	 * 				           <li> G_FILE_MESH_COMPAT       (1 << 26)</li>
	 * 				           <li> G_FILE_SAVE_COPY         (1 << 27)</li>
	 * 				           <li> G_FILE_GLSL_NO_ENV_LIGHTING (1 << 28)</li>
	 * 				</ul>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__fileflags);
	 * CPointer&lt;Integer&gt; p_fileflags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fileflags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fileflags = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'globalf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__globalf);
	 * CPointer&lt;Integer&gt; p_globalf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'globalf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__globalf = new long[]{36, 52};

	/**
	 * Field descriptor (offset) for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> Commit timestamp from buildinfo. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__build_commit_timestamp);
	 * CPointer&lt;int64&gt; p_build_commit_timestamp = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'build_commit_timestamp'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__build_commit_timestamp = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> Hash from buildinfo. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__build_hash);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_build_hash = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'build_hash'</li>
	 * <li>Signature: 'char[16]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__build_hash = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path where this was saved, for recover (1024 = FILE_MAX). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__filename);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filename = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filename'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filename = new long[]{64, 80};

	public FileGlobal(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileGlobal(FileGlobal that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'subvstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needs to be here, for human fileformat recognition (keep first!). </p>
	 * @see #__DNA__FIELD__subvstr
	 */
	
	public CArrayFacade<Byte> getSubvstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subvstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needs to be here, for human fileformat recognition (keep first!). </p>
	 * @see #__DNA__FIELD__subvstr
	 */
	
	public void setSubvstr(CArrayFacade<Byte> subvstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(subvstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subvstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subvstr);
		} else {
			__io__generic__copy( getSubvstr(), subvstr);
		}
	}

	/**
	 * Get method for struct member 'subversion'.
	 * @see #__DNA__FIELD__subversion
	 */
	
	public short getSubversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'subversion'.
	 * @see #__DNA__FIELD__subversion
	 */
	
	public void setSubversion(short subversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, subversion);
		} else {
			__io__block.writeShort(__io__address + 4, subversion);
		}
	}

	/**
	 * Get method for struct member 'minversion'.
	 * @see #__DNA__FIELD__minversion
	 */
	
	public short getMinversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'minversion'.
	 * @see #__DNA__FIELD__minversion
	 */
	
	public void setMinversion(short minversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, minversion);
		} else {
			__io__block.writeShort(__io__address + 6, minversion);
		}
	}

	/**
	 * Get method for struct member 'minsubversion'.
	 * @see #__DNA__FIELD__minsubversion
	 */
	
	public short getMinsubversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'minsubversion'.
	 * @see #__DNA__FIELD__minsubversion
	 */
	
	public void setMinsubversion(short minsubversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, minsubversion);
		} else {
			__io__block.writeShort(__io__address + 8, minsubversion);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
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
	 * Get method for struct member 'curscreen'.
	 * @see #__DNA__FIELD__curscreen
	 */
	
	public CPointer<bScreen> getCurscreen() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curscreen'.
	 * @see #__DNA__FIELD__curscreen
	 */
	
	public void setCurscreen(CPointer<bScreen> curscreen) throws IOException
	{
		long __address = ((curscreen == null) ? 0 : curscreen.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'curscene'.
	 * @see #__DNA__FIELD__curscene
	 */
	
	public CPointer<Scene> getCurscene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curscene'.
	 * @see #__DNA__FIELD__curscene
	 */
	
	public void setCurscene(CPointer<Scene> curscene) throws IOException
	{
		long __address = ((curscene == null) ? 0 : curscene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'cur_view_layer'.
	 * @see #__DNA__FIELD__cur_view_layer
	 */
	
	public CPointer<ViewLayer> getCur_view_layer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayer.class};
		return new CPointer<ViewLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_view_layer'.
	 * @see #__DNA__FIELD__cur_view_layer
	 */
	
	public void setCur_view_layer(CPointer<ViewLayer> cur_view_layer) throws IOException
	{
		long __address = ((cur_view_layer == null) ? 0 : cur_view_layer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'fileflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3><ul>
	 * 				           <li> G_AUTOPACK               (1 << 0)</li>
	 * 				           <li> G_FILE_COMPRESS          (1 << 1)</li>
	 * 				           <li> G_FILE_AUTOPLAY          (1 << 2)</li>
	 * 				           <li> G_FILE_ENABLE_ALL_FRAMES (1 << 3): deprecated</li>
	 * 				           <li> G_FILE_SHOW_DEBUG_PROPS  (1 << 4): deprecated</li>
	 * 				           <li> G_FILE_SHOW_FRAMERATE    (1 << 5): deprecated</li>
	 * 				           <li> G_FILE_USERPREFS         (1 << 9)</li>
	 * 				           <li> G_FILE_NO_UI             (1 << 10)</li>
	 * 				           <li> G_FILE_GAME_MAT          (1 << 12): deprecated</li>
	 * 				           <li> G_FILE_SHOW_PHYSICS      (1 << 14): deprecated</li>
	 * 				           <li> G_FILE_GAME_MAT_GLSL     (1 << 15): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADERS   (1 << 17): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADOWS   (1 << 18): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_RAMPS     (1 << 19): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_NODES     (1 << 20): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_EXTRA_TEX (1 << 21): deprecated</li>
	 * 				           <li> G_FILE_IGNORE_DEPRECATION_WARNINGS  (1 << 22): deprecated</li>
	 * 				           <li> G_FILE_RECOVER           (1 << 23)</li>
	 * 				           <li> G_FILE_RELATIVE_REMAP    (1 << 24)</li>
	 * 				           <li> G_FILE_HISTORY           (1 << 25)</li>
	 * 				           <li> G_FILE_MESH_COMPAT       (1 << 26)</li>
	 * 				           <li> G_FILE_SAVE_COPY         (1 << 27)</li>
	 * 				           <li> G_FILE_GLSL_NO_ENV_LIGHTING (1 << 28)</li>
	 * 				</ul>
	 * @see #__DNA__FIELD__fileflags
	 */
	
	public int getFileflags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'fileflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3><ul>
	 * 				           <li> G_AUTOPACK               (1 << 0)</li>
	 * 				           <li> G_FILE_COMPRESS          (1 << 1)</li>
	 * 				           <li> G_FILE_AUTOPLAY          (1 << 2)</li>
	 * 				           <li> G_FILE_ENABLE_ALL_FRAMES (1 << 3): deprecated</li>
	 * 				           <li> G_FILE_SHOW_DEBUG_PROPS  (1 << 4): deprecated</li>
	 * 				           <li> G_FILE_SHOW_FRAMERATE    (1 << 5): deprecated</li>
	 * 				           <li> G_FILE_USERPREFS         (1 << 9)</li>
	 * 				           <li> G_FILE_NO_UI             (1 << 10)</li>
	 * 				           <li> G_FILE_GAME_MAT          (1 << 12): deprecated</li>
	 * 				           <li> G_FILE_SHOW_PHYSICS      (1 << 14): deprecated</li>
	 * 				           <li> G_FILE_GAME_MAT_GLSL     (1 << 15): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADERS   (1 << 17): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_SHADOWS   (1 << 18): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_RAMPS     (1 << 19): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_NODES     (1 << 20): deprecated</li>
	 * 				           <li> G_FILE_GLSL_NO_EXTRA_TEX (1 << 21): deprecated</li>
	 * 				           <li> G_FILE_IGNORE_DEPRECATION_WARNINGS  (1 << 22): deprecated</li>
	 * 				           <li> G_FILE_RECOVER           (1 << 23)</li>
	 * 				           <li> G_FILE_RELATIVE_REMAP    (1 << 24)</li>
	 * 				           <li> G_FILE_HISTORY           (1 << 25)</li>
	 * 				           <li> G_FILE_MESH_COMPAT       (1 << 26)</li>
	 * 				           <li> G_FILE_SAVE_COPY         (1 << 27)</li>
	 * 				           <li> G_FILE_GLSL_NO_ENV_LIGHTING (1 << 28)</li>
	 * 				</ul>
	 * @see #__DNA__FIELD__fileflags
	 */
	
	public void setFileflags(int fileflags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, fileflags);
		} else {
			__io__block.writeInt(__io__address + 32, fileflags);
		}
	}

	/**
	 * Get method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public int getGlobalf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public void setGlobalf(int globalf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, globalf);
		} else {
			__io__block.writeInt(__io__address + 36, globalf);
		}
	}

	/**
	 * Get method for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> Commit timestamp from buildinfo. </p>
	 * @see #__DNA__FIELD__build_commit_timestamp
	 */
	
	public long getBuild_commit_timestamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 56);
		} else {
			return __io__block.readInt64(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> Commit timestamp from buildinfo. </p>
	 * @see #__DNA__FIELD__build_commit_timestamp
	 */
	
	public void setBuild_commit_timestamp(long build_commit_timestamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 56, build_commit_timestamp);
		} else {
			__io__block.writeInt64(__io__address + 40, build_commit_timestamp);
		}
	}

	/**
	 * Get method for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> Hash from buildinfo. </p>
	 * @see #__DNA__FIELD__build_hash
	 */
	
	public CArrayFacade<Byte> getBuild_hash() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			16
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> Hash from buildinfo. </p>
	 * @see #__DNA__FIELD__build_hash
	 */
	
	public void setBuild_hash(CArrayFacade<Byte> build_hash) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(build_hash, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, build_hash)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, build_hash);
		} else {
			__io__generic__copy( getBuild_hash(), build_hash);
		}
	}

	/**
	 * Get method for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path where this was saved, for recover (1024 = FILE_MAX). </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public CArrayFacade<Byte> getFilename() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path where this was saved, for recover (1024 = FILE_MAX). </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public void setFilename(CArrayFacade<Byte> filename) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(filename, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filename)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filename);
		} else {
			__io__generic__copy( getFilename(), filename);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileGlobal> __io__addressof() {
		return new CPointer<FileGlobal>(__io__address, new Class[]{FileGlobal.class}, __io__block, __io__blockTable);
	}

}
