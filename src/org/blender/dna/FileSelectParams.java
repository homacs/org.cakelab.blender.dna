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
 * Generated facet for DNA struct type 'FileSelectParams'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Config and Input for File Selector. </p>
 */

@CMetaData(size32=2080, size64=2088)
public class FileSelectParams extends CFacade {

	/**
	 * This is the sdna index of the struct FileSelectParams.
	 * <p>
	 * It is required when allocating a new block to store data for FileSelectParams.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 241;

	/**
	 * Field descriptor (offset) for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Title for the file browser<h4>Blender Source Code:</h4>
	 * <p> Title, also used for the text of the execute button. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Directory, FILE_MAX_LIBEXTRA, 1024 + 66, this is for extreme case when 1023 length path needs to be linked in, where foo.blend/Armature need adding </p>
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
	public static final long[] __DNA__FIELD__file = new long[]{1186, 1186};

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
	public static final long[] __DNA__FIELD__renamefile = new long[]{1442, 1442};

	/**
	 * Field descriptor (offset) for struct member 'rename_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__rename_flag);
	 * CPointer&lt;Short&gt; p_rename_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rename_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rename_flag = new long[]{1698, 1698};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1700, 1700};

	/**
	 * Field descriptor (offset) for struct member 'rename_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An {@link ID}<code></code>  but for local IDs (takes precedence). Don't keep this stored across handlers! Would break on undo. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__rename_id);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_rename_id = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rename_id'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rename_id = new long[]{1704, 1704};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD___pad3);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad3 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{1708, 1712};

	/**
	 * Field descriptor (offset) for struct member 'filter_glob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * UNIX shell-like filename patterns matching, supports wildcards ('*') and list of patterns separated by ';'<h4>Blender Source Code:</h4>
	 * <p> List of file-types to filter (#FILE_MAXFILE). </p>
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
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_glob = new long[]{1712, 1720};

	/**
	 * Field descriptor (offset) for struct member 'filter_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filter by name, supports '*' wildcard<h4>Blender Source Code:</h4>
	 * <p>{@link Text}  items name must match to be shown. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__filter_search);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filter_search = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_search'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_search = new long[]{1968, 1976};

	/**
	 * Field descriptor (offset) for struct member 'filter_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Which ID types to show/hide, when browsing a library<h4>Blender Source Code:</h4>
	 * <p> Same as filter, but for {@link ID}  types (aka library groups). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__filter_id);
	 * CPointer&lt;int64&gt; p_filter_id = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_id'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_id = new long[]{2032, 2040};

	/**
	 * Field descriptor (offset) for struct member 'active_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active file used for keyboard navigation. </p>
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
	public static final long[] __DNA__FIELD__active_file = new long[]{2040, 2048};

	/**
	 * Field descriptor (offset) for struct member 'highlight_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File under cursor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__highlight_file);
	 * CPointer&lt;Integer&gt; p_highlight_file = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'highlight_file'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__highlight_file = new long[]{2044, 2052};

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
	public static final long[] __DNA__FIELD__sel_first = new long[]{2048, 2056};

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
	public static final long[] __DNA__FIELD__sel_last = new long[]{2052, 2060};

	/**
	 * Field descriptor (offset) for struct member 'thumbnail_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__thumbnail_size);
	 * CPointer&lt;Short&gt; p_thumbnail_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thumbnail_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thumbnail_size = new long[]{2056, 2064};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{2058, 2066};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> short XXXXX for now store type here, should be moved to the operator. eFileSelectType </p>
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
	public static final long[] __DNA__FIELD__type = new long[]{2060, 2068};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for filter, hiding dots files. </p>
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
	public static final long[] __DNA__FIELD__flag = new long[]{2062, 2070};

	/**
	 * Field descriptor (offset) for struct member 'sort'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sort order. </p>
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
	public static final long[] __DNA__FIELD__sort = new long[]{2064, 2072};

	/**
	 * Field descriptor (offset) for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display mode flag. </p>
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
	public static final long[] __DNA__FIELD__display = new long[]{2066, 2074};

	/**
	 * Field descriptor (offset) for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Details toggles (file size, creation date, etc.) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__details_flags);
	 * CPointer&lt;Byte&gt; p_details_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'details_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__details_flags = new long[]{2068, 2076};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{2069, 2077};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filter when (flags & FILE_FILTER) is true. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__filter);
	 * CPointer&lt;Integer&gt; p_filter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{2072, 2080};

	/**
	 * Field descriptor (offset) for struct member 'recursion_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Numbers of dirtree levels to show simultaneously<h4>Blender Source Code:</h4>
	 * <p> Max number of levels in dirtree to show at once, 0 to disable recursion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD__recursion_level);
	 * CPointer&lt;Short&gt; p_recursion_level = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recursion_level'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recursion_level = new long[]{2076, 2084};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectParams fileselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileselectparams.__dna__addressof(FileSelectParams.__DNA__FIELD___pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{2078, 2086};

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
	 * (read-only)    Title for the file browser<h4>Blender Source Code:</h4>
	 * <p> Title, also used for the text of the execute button. </p>
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
	 * (read-only)    Title for the file browser<h4>Blender Source Code:</h4>
	 * <p> Title, also used for the text of the execute button. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Directory, FILE_MAX_LIBEXTRA, 1024 + 66, this is for extreme case when 1023 length path needs to be linked in, where foo.blend/Armature need adding </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Directory, FILE_MAX_LIBEXTRA, 1024 + 66, this is for extreme case when 1023 length path needs to be linked in, where foo.blend/Armature need adding </p>
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
			return new CArrayFacade<Byte>(__io__address + 1186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1186;
		} else {
			__dna__offset = 1186;
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
			return new CArrayFacade<Byte>(__io__address + 1442, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1442, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1442;
		} else {
			__dna__offset = 1442;
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
	 * Get method for struct member 'rename_flag'.
	 * @see #__DNA__FIELD__rename_flag
	 */
	
	public short getRename_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1698);
		} else {
			return __io__block.readShort(__io__address + 1698);
		}
	}

	/**
	 * Set method for struct member 'rename_flag'.
	 * @see #__DNA__FIELD__rename_flag
	 */
	
	public void setRename_flag(short rename_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1698, rename_flag);
		} else {
			__io__block.writeShort(__io__address + 1698, rename_flag);
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
			return new CArrayFacade<Byte>(__io__address + 1700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1700;
		} else {
			__dna__offset = 1700;
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
	 * Get method for struct member 'rename_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An {@link ID}<code></code>  but for local IDs (takes precedence). Don't keep this stored across handlers! Would break on undo. </p>
	 * @see #__DNA__FIELD__rename_id
	 */
	
	public CPointer<ID> getRename_id() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1704);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1704);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rename_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An {@link ID}<code></code>  but for local IDs (takes precedence). Don't keep this stored across handlers! Would break on undo. </p>
	 * @see #__DNA__FIELD__rename_id
	 */
	
	public void setRename_id(CPointer<ID> rename_id) throws IOException
	{
		long __address = ((rename_id == null) ? 0 : rename_id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1704, __address);
		} else {
			__io__block.writeLong(__io__address + 1704, __address);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CPointer<Object> get_pad3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1712);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1708);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CPointer<Object> _pad3) throws IOException
	{
		long __address = ((_pad3 == null) ? 0 : _pad3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1712, __address);
		} else {
			__io__block.writeLong(__io__address + 1708, __address);
		}
	}

	/**
	 * Get method for struct member 'filter_glob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * UNIX shell-like filename patterns matching, supports wildcards ('*') and list of patterns separated by ';'<h4>Blender Source Code:</h4>
	 * <p> List of file-types to filter (#FILE_MAXFILE). </p>
	 * @see #__DNA__FIELD__filter_glob
	 */
	
	public CArrayFacade<Byte> getFilter_glob() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filter_glob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * UNIX shell-like filename patterns matching, supports wildcards ('*') and list of patterns separated by ';'<h4>Blender Source Code:</h4>
	 * <p> List of file-types to filter (#FILE_MAXFILE). </p>
	 * @see #__DNA__FIELD__filter_glob
	 */
	
	public void setFilter_glob(CArrayFacade<Byte> filter_glob) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1720;
		} else {
			__dna__offset = 1712;
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
	 * Get method for struct member 'filter_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filter by name, supports '*' wildcard<h4>Blender Source Code:</h4>
	 * <p>{@link Text}  items name must match to be shown. </p>
	 * @see #__DNA__FIELD__filter_search
	 */
	
	public CArrayFacade<Byte> getFilter_search() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1976, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1968, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filter_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filter by name, supports '*' wildcard<h4>Blender Source Code:</h4>
	 * <p>{@link Text}  items name must match to be shown. </p>
	 * @see #__DNA__FIELD__filter_search
	 */
	
	public void setFilter_search(CArrayFacade<Byte> filter_search) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1976;
		} else {
			__dna__offset = 1968;
		}
		if (__io__equals(filter_search, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filter_search)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filter_search);
		} else {
			__io__generic__copy( getFilter_search(), filter_search);
		}
	}

	/**
	 * Get method for struct member 'filter_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Which ID types to show/hide, when browsing a library<h4>Blender Source Code:</h4>
	 * <p> Same as filter, but for {@link ID}  types (aka library groups). </p>
	 * @see #__DNA__FIELD__filter_id
	 */
	
	public long getFilter_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 2040);
		} else {
			return __io__block.readInt64(__io__address + 2032);
		}
	}

	/**
	 * Set method for struct member 'filter_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Which ID types to show/hide, when browsing a library<h4>Blender Source Code:</h4>
	 * <p> Same as filter, but for {@link ID}  types (aka library groups). </p>
	 * @see #__DNA__FIELD__filter_id
	 */
	
	public void setFilter_id(long filter_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 2040, filter_id);
		} else {
			__io__block.writeInt64(__io__address + 2032, filter_id);
		}
	}

	/**
	 * Get method for struct member 'active_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active file used for keyboard navigation. </p>
	 * @see #__DNA__FIELD__active_file
	 */
	
	public int getActive_file() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2048);
		} else {
			return __io__block.readInt(__io__address + 2040);
		}
	}

	/**
	 * Set method for struct member 'active_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active file used for keyboard navigation. </p>
	 * @see #__DNA__FIELD__active_file
	 */
	
	public void setActive_file(int active_file) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2048, active_file);
		} else {
			__io__block.writeInt(__io__address + 2040, active_file);
		}
	}

	/**
	 * Get method for struct member 'highlight_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File under cursor. </p>
	 * @see #__DNA__FIELD__highlight_file
	 */
	
	public int getHighlight_file() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2052);
		} else {
			return __io__block.readInt(__io__address + 2044);
		}
	}

	/**
	 * Set method for struct member 'highlight_file'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File under cursor. </p>
	 * @see #__DNA__FIELD__highlight_file
	 */
	
	public void setHighlight_file(int highlight_file) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2052, highlight_file);
		} else {
			__io__block.writeInt(__io__address + 2044, highlight_file);
		}
	}

	/**
	 * Get method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public int getSel_first() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2056);
		} else {
			return __io__block.readInt(__io__address + 2048);
		}
	}

	/**
	 * Set method for struct member 'sel_first'.
	 * @see #__DNA__FIELD__sel_first
	 */
	
	public void setSel_first(int sel_first) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2056, sel_first);
		} else {
			__io__block.writeInt(__io__address + 2048, sel_first);
		}
	}

	/**
	 * Get method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public int getSel_last() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2060);
		} else {
			return __io__block.readInt(__io__address + 2052);
		}
	}

	/**
	 * Set method for struct member 'sel_last'.
	 * @see #__DNA__FIELD__sel_last
	 */
	
	public void setSel_last(int sel_last) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2060, sel_last);
		} else {
			__io__block.writeInt(__io__address + 2052, sel_last);
		}
	}

	/**
	 * Get method for struct member 'thumbnail_size'.
	 * @see #__DNA__FIELD__thumbnail_size
	 */
	
	public short getThumbnail_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2064);
		} else {
			return __io__block.readShort(__io__address + 2056);
		}
	}

	/**
	 * Set method for struct member 'thumbnail_size'.
	 * @see #__DNA__FIELD__thumbnail_size
	 */
	
	public void setThumbnail_size(short thumbnail_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2064, thumbnail_size);
		} else {
			__io__block.writeShort(__io__address + 2056, thumbnail_size);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2066, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2058, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2066;
		} else {
			__dna__offset = 2058;
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
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> short XXXXX for now store type here, should be moved to the operator. eFileSelectType </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2068);
		} else {
			return __io__block.readShort(__io__address + 2060);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> short XXXXX for now store type here, should be moved to the operator. eFileSelectType </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2068, type);
		} else {
			__io__block.writeShort(__io__address + 2060, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for filter, hiding dots files. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2070);
		} else {
			return __io__block.readShort(__io__address + 2062);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for filter, hiding dots files. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2070, flag);
		} else {
			__io__block.writeShort(__io__address + 2062, flag);
		}
	}

	/**
	 * Get method for struct member 'sort'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sort order. </p>
	 * @see #__DNA__FIELD__sort
	 */
	
	public short getSort() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2072);
		} else {
			return __io__block.readShort(__io__address + 2064);
		}
	}

	/**
	 * Set method for struct member 'sort'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sort order. </p>
	 * @see #__DNA__FIELD__sort
	 */
	
	public void setSort(short sort) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2072, sort);
		} else {
			__io__block.writeShort(__io__address + 2064, sort);
		}
	}

	/**
	 * Get method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display mode flag. </p>
	 * @see #__DNA__FIELD__display
	 */
	
	public short getDisplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2074);
		} else {
			return __io__block.readShort(__io__address + 2066);
		}
	}

	/**
	 * Set method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display mode flag. </p>
	 * @see #__DNA__FIELD__display
	 */
	
	public void setDisplay(short display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2074, display);
		} else {
			__io__block.writeShort(__io__address + 2066, display);
		}
	}

	/**
	 * Get method for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Details toggles (file size, creation date, etc.) </p>
	 * @see #__DNA__FIELD__details_flags
	 */
	
	public byte getDetails_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2076);
		} else {
			return __io__block.readByte(__io__address + 2068);
		}
	}

	/**
	 * Set method for struct member 'details_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Details toggles (file size, creation date, etc.) </p>
	 * @see #__DNA__FIELD__details_flags
	 */
	
	public void setDetails_flags(byte details_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2076, details_flags);
		} else {
			__io__block.writeByte(__io__address + 2068, details_flags);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2077, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2069, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2077;
		} else {
			__dna__offset = 2069;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filter when (flags & FILE_FILTER) is true. </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public int getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2080);
		} else {
			return __io__block.readInt(__io__address + 2072);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filter when (flags & FILE_FILTER) is true. </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(int filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2080, filter);
		} else {
			__io__block.writeInt(__io__address + 2072, filter);
		}
	}

	/**
	 * Get method for struct member 'recursion_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Numbers of dirtree levels to show simultaneously<h4>Blender Source Code:</h4>
	 * <p> Max number of levels in dirtree to show at once, 0 to disable recursion. </p>
	 * @see #__DNA__FIELD__recursion_level
	 */
	
	public short getRecursion_level() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2084);
		} else {
			return __io__block.readShort(__io__address + 2076);
		}
	}

	/**
	 * Set method for struct member 'recursion_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Numbers of dirtree levels to show simultaneously<h4>Blender Source Code:</h4>
	 * <p> Max number of levels in dirtree to show at once, 0 to disable recursion. </p>
	 * @see #__DNA__FIELD__recursion_level
	 */
	
	public void setRecursion_level(short recursion_level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2084, recursion_level);
		} else {
			__io__block.writeShort(__io__address + 2076, recursion_level);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public CArrayFacade<Byte> get_pad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2086, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2078, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(CArrayFacade<Byte> _pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2086;
		} else {
			__dna__offset = 2078;
		}
		if (__io__equals(_pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad4);
		} else {
			__io__generic__copy( get_pad4(), _pad4);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileSelectParams> __io__addressof() {
		return new CPointer<FileSelectParams>(__io__address, new Class[]{FileSelectParams.class}, __io__block, __io__blockTable);
	}

}
