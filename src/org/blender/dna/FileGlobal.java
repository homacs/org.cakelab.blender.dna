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

@CMetaData(size32=1080, size64=1088)
public class FileGlobal extends CFacade {

	/**
	 * This is the sdna index of the struct FileGlobal.
	 * <p>
	 * It is required when allocating a new block to store data for FileGlobal.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 260;

	/**
	 * Field descriptor (offset) for struct member 'subvstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> needs to be here, for human fileformat recognition </p>
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
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{10, 10};

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
	public static final long[] __DNA__FIELD__fileflags = new long[]{24, 32};

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
	public static final long[] __DNA__FIELD__globalf = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> commit timestamp from buildinfo </p>
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
	public static final long[] __DNA__FIELD__build_commit_timestamp = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> hash from buildinfo </p>
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
	public static final long[] __DNA__FIELD__build_hash = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> file path where this was saved, for recover 1024 = FILE_MAX </p>
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
	public static final long[] __DNA__FIELD__filename = new long[]{56, 64};

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
	 * <p> needs to be here, for human fileformat recognition </p>
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
	 * <p> needs to be here, for human fileformat recognition </p>
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
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
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
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
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
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
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
			__io__block.writeInt(__io__address + 32, fileflags);
		} else {
			__io__block.writeInt(__io__address + 24, fileflags);
		}
	}

	/**
	 * Get method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public int getGlobalf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public void setGlobalf(int globalf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, globalf);
		} else {
			__io__block.writeInt(__io__address + 28, globalf);
		}
	}

	/**
	 * Get method for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> commit timestamp from buildinfo </p>
	 * @see #__DNA__FIELD__build_commit_timestamp
	 */
	
	public long getBuild_commit_timestamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 40);
		} else {
			return __io__block.readInt64(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'build_commit_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * time when code of the blender binary was commit. Provides more detail to version info.<h4>Blender Source Code:</h4>
	 * <p> commit timestamp from buildinfo </p>
	 * @see #__DNA__FIELD__build_commit_timestamp
	 */
	
	public void setBuild_commit_timestamp(long build_commit_timestamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 40, build_commit_timestamp);
		} else {
			__io__block.writeInt64(__io__address + 32, build_commit_timestamp);
		}
	}

	/**
	 * Get method for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> hash from buildinfo </p>
	 * @see #__DNA__FIELD__build_hash
	 */
	
	public CArrayFacade<Byte> getBuild_hash() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			16
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'build_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * unique identifier from build info<h4>Blender Source Code:</h4>
	 * <p> hash from buildinfo </p>
	 * @see #__DNA__FIELD__build_hash
	 */
	
	public void setBuild_hash(CArrayFacade<Byte> build_hash) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
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
	 * <p> file path where this was saved, for recover 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public CArrayFacade<Byte> getFilename() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> file path where this was saved, for recover 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public void setFilename(CArrayFacade<Byte> filename) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 56;
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
