package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileSelectParams'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2016, size64=2016)
public class FileSelectParams extends CFacade {

	/**
	 * This is the sdna index of the struct FileSelectParams.
	 * <p>
	 * It is required when allocating a new block to store data for FileSelectParams.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 192;

	/**
	 * Field descriptor (offset) for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Title for the file browser
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__title);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_title = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'title'</li>
	 * <li>Signature: 'char[96]'</li>
	 * <li>Actual Size (32bit/64bit): 96/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__title = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__dir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_dir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dir'</li>
	 * <li>Signature: 'char[1056]'</li>
	 * <li>Actual Size (32bit/64bit): 1056/1056</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dir = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'file'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__file);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_file = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'file'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__file = new long[]{1152, 1152};

	/**
	 * Field descriptor (offset) for struct member 'renamefile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__renamefile);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_renamefile = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renamefile'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renamefile = new long[]{1408, 1408};

	/**
	 * Field descriptor (offset) for struct member 'renameedit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__renameedit);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_renameedit = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renameedit'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renameedit = new long[]{1664, 1664};

	/**
	 * Field descriptor (offset) for struct member 'filter_glob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__filter_glob);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filter_glob = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_glob'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_glob = new long[]{1920, 1920};

	/**
	 * Field descriptor (offset) for struct member 'active_file'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__active_file);
	 * CPointer&lt;Integer&gt; p_active_file = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_file'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_file = new long[]{1984, 1984};

	/**
	 * Field descriptor (offset) for struct member 'sel_first'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__sel_first);
	 * CPointer&lt;Integer&gt; p_sel_first = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sel_first'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sel_first = new long[]{1988, 1988};

	/**
	 * Field descriptor (offset) for struct member 'sel_last'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__sel_last);
	 * CPointer&lt;Integer&gt; p_sel_last = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sel_last'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sel_last = new long[]{1992, 1992};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{1996, 1996};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1998, 1998};

	/**
	 * Field descriptor (offset) for struct member 'sort'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__sort);
	 * CPointer&lt;Short&gt; p_sort = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sort'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sort = new long[]{2000, 2000};

	/**
	 * Field descriptor (offset) for struct member 'display'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__display);
	 * CPointer&lt;Short&gt; p_display = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display = new long[]{2002, 2002};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__filter);
	 * CPointer&lt;Short&gt; p_filter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{2004, 2004};

	/**
	 * Field descriptor (offset) for struct member 'f_fp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__f_fp);
	 * CPointer&lt;Short&gt; p_f_fp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_fp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_fp = new long[]{2006, 2006};

	/**
	 * Field descriptor (offset) for struct member 'fp_str'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__fp_str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_fp_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fp_str'</li>
	 * <li>Signature: 'char[8]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fp_str = new long[]{2008, 2008};

	public FileSelectParams(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileSelectParams(FileSelectParams that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Title for the file browser
	 * @see #__DNA__FIELD__title
	 */
	
	public CArrayFacade<Byte> getTitle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			96
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Title for the file browser
	 * @see #__DNA__FIELD__title
	 */
	
	public void setTitle(CArrayFacade<Byte> title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, title);
		} else {
			__io__generic__copy( getTitle(), title);
		}
	}

	/**
	 * Get method for struct member 'dir'.
	 * @see #__DNA__FIELD__dir
	 */
	
	public CArrayFacade<Byte> getDir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1056
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dir'.
	 * @see #__DNA__FIELD__dir
	 */
	
	public void setDir(CArrayFacade<Byte> dir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(dir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dir);
		} else {
			__io__generic__copy( getDir(), dir);
		}
	}

	/**
	 * Get method for struct member 'file'.
	 * @see #__DNA__FIELD__file
	 */
	
	public CArrayFacade<Byte> getFile() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'file'.
	 * @see #__DNA__FIELD__file
	 */
	
	public void setFile(CArrayFacade<Byte> file) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1152;
		} else {
			__dna__offset = 1152;
		}
		if (__io__equals(file, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, file)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, file);
		} else {
			__io__generic__copy( getFile(), file);
		}
	}

	/**
	 * Get method for struct member 'renamefile'.
	 * @see #__DNA__FIELD__renamefile
	 */
	
	public CArrayFacade<Byte> getRenamefile() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1408, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1408, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'renamefile'.
	 * @see #__DNA__FIELD__renamefile
	 */
	
	public void setRenamefile(CArrayFacade<Byte> renamefile) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1408;
		} else {
			__dna__offset = 1408;
		}
		if (__io__equals(renamefile, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, renamefile)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, renamefile);
		} else {
			__io__generic__copy( getRenamefile(), renamefile);
		}
	}

	/**
	 * Get method for struct member 'renameedit'.
	 * @see #__DNA__FIELD__renameedit
	 */
	
	public CArrayFacade<Byte> getRenameedit() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1664, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1664, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'renameedit'.
	 * @see #__DNA__FIELD__renameedit
	 */
	
	public void setRenameedit(CArrayFacade<Byte> renameedit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1664;
		} else {
			__dna__offset = 1664;
		}
		if (__io__equals(renameedit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, renameedit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, renameedit);
		} else {
			__io__generic__copy( getRenameedit(), renameedit);
		}
	}

	/**
	 * Get method for struct member 'filter_glob'.
	 * @see #__DNA__FIELD__filter_glob
	 */
	
	public CArrayFacade<Byte> getFilter_glob() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1920, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1920, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filter_glob'.
	 * @see #__DNA__FIELD__filter_glob
	 */
	
	public void setFilter_glob(CArrayFacade<Byte> filter_glob) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1920;
		} else {
			__dna__offset = 1920;
		}
		if (__io__equals(filter_glob, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filter_glob)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filter_glob);
		} else {
			__io__generic__copy( getFilter_glob(), filter_glob);
		}
	}

	/**
	 * Get method for struct member 'active_file'.
	 * @see #__DNA__FIELD__active_file
	 */
	
	public int getActive_file() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1984);
		} else {
			return __io__block.readInt(__io__address + 1984);
		}
	}

	/**
	 * Set method for struct member 'active_file'.
	 * @see #__DNA__FIELD__active_file
	 */
	
	public void setActive_file(int active_file) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1984, active_file);
		} else {
			__io__block.writeInt(__io__address + 1984, active_file);
		}
	}

	/**
	 * Get method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public int getSel_first() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1988);
		} else {
			return __io__block.readInt(__io__address + 1988);
		}
	}

	/**
	 * Set method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public void setSel_first(int sel_first) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1988, sel_first);
		} else {
			__io__block.writeInt(__io__address + 1988, sel_first);
		}
	}

	/**
	 * Get method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public int getSel_last() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1992);
		} else {
			return __io__block.readInt(__io__address + 1992);
		}
	}

	/**
	 * Set method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public void setSel_last(int sel_last) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1992, sel_last);
		} else {
			__io__block.writeInt(__io__address + 1992, sel_last);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1996);
		} else {
			return __io__block.readShort(__io__address + 1996);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1996, type);
		} else {
			__io__block.writeShort(__io__address + 1996, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1998);
		} else {
			return __io__block.readShort(__io__address + 1998);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1998, flag);
		} else {
			__io__block.writeShort(__io__address + 1998, flag);
		}
	}

	/**
	 * Get method for struct member 'sort'.
	 * @see #__DNA__FIELD__sort
	 */
	
	public short getSort() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2000);
		} else {
			return __io__block.readShort(__io__address + 2000);
		}
	}

	/**
	 * Set method for struct member 'sort'.
	 * @see #__DNA__FIELD__sort
	 */
	
	public void setSort(short sort) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2000, sort);
		} else {
			__io__block.writeShort(__io__address + 2000, sort);
		}
	}

	/**
	 * Get method for struct member 'display'.
	 * @see #__DNA__FIELD__display
	 */
	
	public short getDisplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2002);
		} else {
			return __io__block.readShort(__io__address + 2002);
		}
	}

	/**
	 * Set method for struct member 'display'.
	 * @see #__DNA__FIELD__display
	 */
	
	public void setDisplay(short display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2002, display);
		} else {
			__io__block.writeShort(__io__address + 2002, display);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public short getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2004);
		} else {
			return __io__block.readShort(__io__address + 2004);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(short filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2004, filter);
		} else {
			__io__block.writeShort(__io__address + 2004, filter);
		}
	}

	/**
	 * Get method for struct member 'f_fp'.
	 * @see #__DNA__FIELD__f_fp
	 */
	
	public short getF_fp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2006);
		} else {
			return __io__block.readShort(__io__address + 2006);
		}
	}

	/**
	 * Set method for struct member 'f_fp'.
	 * @see #__DNA__FIELD__f_fp
	 */
	
	public void setF_fp(short f_fp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2006, f_fp);
		} else {
			__io__block.writeShort(__io__address + 2006, f_fp);
		}
	}

	/**
	 * Get method for struct member 'fp_str'.
	 * @see #__DNA__FIELD__fp_str
	 */
	
	public CArrayFacade<Byte> getFp_str() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2008, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2008, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fp_str'.
	 * @see #__DNA__FIELD__fp_str
	 */
	
	public void setFp_str(CArrayFacade<Byte> fp_str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2008;
		} else {
			__dna__offset = 2008;
		}
		if (__io__equals(fp_str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fp_str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fp_str);
		} else {
			__io__generic__copy( getFp_str(), fp_str);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileSelectParams> __io__addressof() {
		return new CPointer<FileSelectParams>(__io__address, new Class[]{FileSelectParams.class}, __io__block, __io__blockTable);
	}

}
