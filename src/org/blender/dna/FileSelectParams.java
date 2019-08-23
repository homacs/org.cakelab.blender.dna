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

@CMetaData(size32=2052, size64=2052)
public class FileSelectParams extends CFacade {

	/**
	 * This is the sdna index of the struct FileSelectParams.
	 * <p>
	 * It is required when allocating a new block to store data for FileSelectParams.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 198;

	/**
	 * Field descriptor (offset) for struct member 'title'.
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
	 * <li>Signature: 'char[1090]'</li>
	 * <li>Actual Size (32bit/64bit): 1090/1090</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dir = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'pad_c1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__pad_c1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad_c1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_c1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_c1 = new long[]{1186, 1186};

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
	public static final long[] __DNA__FIELD__file = new long[]{1188, 1188};

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
	public static final long[] __DNA__FIELD__renamefile = new long[]{1444, 1444};

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
	public static final long[] __DNA__FIELD__renameedit = new long[]{1700, 1700};

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
	public static final long[] __DNA__FIELD__filter_glob = new long[]{1956, 1956};

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
	public static final long[] __DNA__FIELD__active_file = new long[]{2020, 2020};

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
	public static final long[] __DNA__FIELD__sel_first = new long[]{2024, 2024};

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
	public static final long[] __DNA__FIELD__sel_last = new long[]{2028, 2028};

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
	public static final long[] __DNA__FIELD__type = new long[]{2032, 2032};

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
	public static final long[] __DNA__FIELD__flag = new long[]{2034, 2034};

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
	public static final long[] __DNA__FIELD__sort = new long[]{2036, 2036};

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
	public static final long[] __DNA__FIELD__display = new long[]{2038, 2038};

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
	public static final long[] __DNA__FIELD__filter = new long[]{2040, 2040};

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
	public static final long[] __DNA__FIELD__f_fp = new long[]{2042, 2042};

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
	public static final long[] __DNA__FIELD__fp_str = new long[]{2044, 2044};

	public FileSelectParams(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileSelectParams(FileSelectParams that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'title'.
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
			1090
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
	 * Get method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public CArrayFacade<Byte> getPad_c1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad_c1'.
	 * @see #__DNA__FIELD__pad_c1
	 */
	
	public void setPad_c1(CArrayFacade<Byte> pad_c1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1186;
		} else {
			__dna__offset = 1186;
		}
		if (__io__equals(pad_c1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad_c1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad_c1);
		} else {
			__io__generic__copy( getPad_c1(), pad_c1);
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
			return new CArrayFacade<Byte>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1188;
		} else {
			__dna__offset = 1188;
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
			return new CArrayFacade<Byte>(__io__address + 1444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1444;
		} else {
			__dna__offset = 1444;
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
			return new CArrayFacade<Byte>(__io__address + 1700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1700;
		} else {
			__dna__offset = 1700;
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
			return new CArrayFacade<Byte>(__io__address + 1956, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1956, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1956;
		} else {
			__dna__offset = 1956;
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
			return __io__block.readInt(__io__address + 2020);
		} else {
			return __io__block.readInt(__io__address + 2020);
		}
	}

	/**
	 * Set method for struct member 'active_file'.
	 * @see #__DNA__FIELD__active_file
	 */
	
	public void setActive_file(int active_file) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2020, active_file);
		} else {
			__io__block.writeInt(__io__address + 2020, active_file);
		}
	}

	/**
	 * Get method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public int getSel_first() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2024);
		} else {
			return __io__block.readInt(__io__address + 2024);
		}
	}

	/**
	 * Set method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public void setSel_first(int sel_first) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2024, sel_first);
		} else {
			__io__block.writeInt(__io__address + 2024, sel_first);
		}
	}

	/**
	 * Get method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public int getSel_last() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2028);
		} else {
			return __io__block.readInt(__io__address + 2028);
		}
	}

	/**
	 * Set method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public void setSel_last(int sel_last) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2028, sel_last);
		} else {
			__io__block.writeInt(__io__address + 2028, sel_last);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2032);
		} else {
			return __io__block.readShort(__io__address + 2032);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2032, type);
		} else {
			__io__block.writeShort(__io__address + 2032, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2034);
		} else {
			return __io__block.readShort(__io__address + 2034);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2034, flag);
		} else {
			__io__block.writeShort(__io__address + 2034, flag);
		}
	}

	/**
	 * Get method for struct member 'sort'.
	 * @see #__DNA__FIELD__sort
	 */
	
	public short getSort() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2036);
		} else {
			return __io__block.readShort(__io__address + 2036);
		}
	}

	/**
	 * Set method for struct member 'sort'.
	 * @see #__DNA__FIELD__sort
	 */
	
	public void setSort(short sort) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2036, sort);
		} else {
			__io__block.writeShort(__io__address + 2036, sort);
		}
	}

	/**
	 * Get method for struct member 'display'.
	 * @see #__DNA__FIELD__display
	 */
	
	public short getDisplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2038);
		} else {
			return __io__block.readShort(__io__address + 2038);
		}
	}

	/**
	 * Set method for struct member 'display'.
	 * @see #__DNA__FIELD__display
	 */
	
	public void setDisplay(short display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2038, display);
		} else {
			__io__block.writeShort(__io__address + 2038, display);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public short getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2040);
		} else {
			return __io__block.readShort(__io__address + 2040);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(short filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2040, filter);
		} else {
			__io__block.writeShort(__io__address + 2040, filter);
		}
	}

	/**
	 * Get method for struct member 'f_fp'.
	 * @see #__DNA__FIELD__f_fp
	 */
	
	public short getF_fp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2042);
		} else {
			return __io__block.readShort(__io__address + 2042);
		}
	}

	/**
	 * Set method for struct member 'f_fp'.
	 * @see #__DNA__FIELD__f_fp
	 */
	
	public void setF_fp(short f_fp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2042, f_fp);
		} else {
			__io__block.writeShort(__io__address + 2042, f_fp);
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
			return new CArrayFacade<Byte>(__io__address + 2044, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2044, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2044;
		} else {
			__dna__offset = 2044;
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
