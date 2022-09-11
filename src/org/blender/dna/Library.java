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
 * Generated facet for DNA struct type 'Library'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> For each library file used, a {@link Library}  struct is added to Main WARNING: readfile.c, expand_doit() reads this struct without DNA check! </p>
 */

@CMetaData(size32=2232, size64=2288)
public class Library extends CFacade {

	/**
	 * This is the sdna index of the struct Library.
	 * <p>
	 * It is required when allocating a new block to store data for Library.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 15;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__id);
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
	 * Field descriptor (offset) for struct member 'filedata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__filedata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_filedata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filedata'</li>
	 * <li>Signature: 'FileData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filedata = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'filepath_abs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  is the real path used on file read but in some cases its useful to access the absolute one.</p><p><code></code>  directly and it will be kept in sync - campbell </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__filepath_abs);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath_abs = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath_abs'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath_abs = new long[]{1180, 1224};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Set for indirectly linked libs, used in the outliner and while reading. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;Library&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, Library.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'Library*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{2204, 2248};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{2208, 2256};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__tag);
	 * CPointer&lt;Short&gt; p_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'ushort'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{2212, 2264};

	/**
	 * Field descriptor (offset) for struct member '_pad_0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD___pad_0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad_0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad_0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad_0 = new long[]{2214, 2266};

	/**
	 * Field descriptor (offset) for struct member 'temp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp data needed by read/write code, and lib-override recursive re-synchronized. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__temp_index);
	 * CPointer&lt;Integer&gt; p_temp_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp_index = new long[]{2220, 2272};

	/**
	 * Field descriptor (offset) for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See BLENDER_FILE_VERSION, BLENDER_FILE_SUBVERSION, needed for do_versions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__versionfile);
	 * CPointer&lt;Short&gt; p_versionfile = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'versionfile'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__versionfile = new long[]{2224, 2276};

	/**
	 * Field descriptor (offset) for struct member 'subversionfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__subversionfile);
	 * CPointer&lt;Short&gt; p_subversionfile = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subversionfile'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subversionfile = new long[]{2226, 2278};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library library = ...;
	 * CPointer&lt;Object&gt; p = library.__dna__addressof(Library.__DNA__FIELD__runtime);
	 * CPointer&lt;Library_Runtime&gt; p_runtime = p.cast(new Class[]{Library_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Library_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{2228, 2280};

	public Library(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Library(Library that) {
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
	 * Get method for struct member 'filedata'.
	 * @see #__DNA__FIELD__filedata
	 */
	
	public CPointer<Object> getFiledata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'filedata'.
	 * @see #__DNA__FIELD__filedata
	 */
	
	public void setFiledata(CPointer<Object> filedata) throws IOException
	{
		long __address = ((filedata == null) ? 0 : filedata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
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
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 200;
		} else {
			__dna__offset = 156;
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
	 * Get method for struct member 'filepath_abs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  is the real path used on file read but in some cases its useful to access the absolute one.</p><p><code></code>  directly and it will be kept in sync - campbell </p>
	 * @see #__DNA__FIELD__filepath_abs
	 */
	
	public CArrayFacade<Byte> getFilepath_abs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath_abs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  is the real path used on file read but in some cases its useful to access the absolute one.</p><p><code></code>  directly and it will be kept in sync - campbell </p>
	 * @see #__DNA__FIELD__filepath_abs
	 */
	
	public void setFilepath_abs(CArrayFacade<Byte> filepath_abs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1224;
		} else {
			__dna__offset = 1180;
		}
		if (__io__equals(filepath_abs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filepath_abs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filepath_abs);
		} else {
			__io__generic__copy( getFilepath_abs(), filepath_abs);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Set for indirectly linked libs, used in the outliner and while reading. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<Library> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Library.class};
		return new CPointer<Library>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Library.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Set for indirectly linked libs, used in the outliner and while reading. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<Library> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2248, __address);
		} else {
			__io__block.writeLong(__io__address + 2204, __address);
		}
	}

	/**
	 * Get method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2256, __address);
		} else {
			__io__block.writeLong(__io__address + 2208, __address);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * @see #__DNA__FIELD__tag
	 */
	
	public short getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2264);
		} else {
			return __io__block.readShort(__io__address + 2212);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(short tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2264, tag);
		} else {
			__io__block.writeShort(__io__address + 2212, tag);
		}
	}

	/**
	 * Get method for struct member '_pad_0'.
	 * @see #__DNA__FIELD___pad_0
	 */
	
	public CArrayFacade<Byte> get_pad_0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2266, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2214, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad_0'.
	 * @see #__DNA__FIELD___pad_0
	 */
	
	public void set_pad_0(CArrayFacade<Byte> _pad_0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2266;
		} else {
			__dna__offset = 2214;
		}
		if (__io__equals(_pad_0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad_0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad_0);
		} else {
			__io__generic__copy( get_pad_0(), _pad_0);
		}
	}

	/**
	 * Get method for struct member 'temp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp data needed by read/write code, and lib-override recursive re-synchronized. </p>
	 * @see #__DNA__FIELD__temp_index
	 */
	
	public int getTemp_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2272);
		} else {
			return __io__block.readInt(__io__address + 2220);
		}
	}

	/**
	 * Set method for struct member 'temp_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp data needed by read/write code, and lib-override recursive re-synchronized. </p>
	 * @see #__DNA__FIELD__temp_index
	 */
	
	public void setTemp_index(int temp_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2272, temp_index);
		} else {
			__io__block.writeInt(__io__address + 2220, temp_index);
		}
	}

	/**
	 * Get method for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See BLENDER_FILE_VERSION, BLENDER_FILE_SUBVERSION, needed for do_versions. </p>
	 * @see #__DNA__FIELD__versionfile
	 */
	
	public short getVersionfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2276);
		} else {
			return __io__block.readShort(__io__address + 2224);
		}
	}

	/**
	 * Set method for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See BLENDER_FILE_VERSION, BLENDER_FILE_SUBVERSION, needed for do_versions. </p>
	 * @see #__DNA__FIELD__versionfile
	 */
	
	public void setVersionfile(short versionfile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2276, versionfile);
		} else {
			__io__block.writeShort(__io__address + 2224, versionfile);
		}
	}

	/**
	 * Get method for struct member 'subversionfile'.
	 * @see #__DNA__FIELD__subversionfile
	 */
	
	public short getSubversionfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2278);
		} else {
			return __io__block.readShort(__io__address + 2226);
		}
	}

	/**
	 * Set method for struct member 'subversionfile'.
	 * @see #__DNA__FIELD__subversionfile
	 */
	
	public void setSubversionfile(short subversionfile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2278, subversionfile);
		} else {
			__io__block.writeShort(__io__address + 2226, subversionfile);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Library_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Library_Runtime(__io__address + 2280, __io__block, __io__blockTable);
		} else {
			return new Library_Runtime(__io__address + 2228, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Library_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2280;
		} else {
			__dna__offset = 2228;
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
	public CPointer<Library> __io__addressof() {
		return new CPointer<Library>(__io__address, new Class[]{Library.class}, __io__block, __io__blockTable);
	}

}
