package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ID'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Represents the ID of any element in DNA which 
 * 					 is stored in a library (see {@link Library}). Those 
 * 					 elements are instances of structs which contain an 
 * 					 embedded member of type ID as their first element.<br/>
 * 					 IDs of the same element type are linked in linked list (see {@link Link})<h4>Blender Source Code:</h4>
 * <p> There's a nasty circular dependency here.... 'void *' to the rescue! I really wonder why this is needed. </p>
 */

@CMetaData(size32=136, size64=176)
public class ID extends CFacade {

	/**
	 * This is the sdna index of the struct ID.
	 * <p>
	 * It is required when allocating a new block to store data for ID.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 20;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on the next element in linked list
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on previous element in linked list
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'newid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__newid);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_newid = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'newid'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__newid = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference on the library this library element belongs to.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__lib);
	 * CPointer&lt;CPointer&lt;Library&gt;&gt; p_lib = p.cast(new Class[]{CPointer.class, Library.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lib'</li>
	 * <li>Signature: 'Library*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lib = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'asset_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Additional data for an asset data-block<h4>Blender Source Code:</h4>
	 * <p> If the {@link ID}  is an asset, this pointer is set. Owning pointer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__asset_data);
	 * CPointer&lt;CPointer&lt;AssetMetaData&gt;&gt; p_asset_data = p.cast(new Class[]{CPointer.class, AssetMetaData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asset_data'</li>
	 * <li>Signature: 'AssetMetaData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asset_data = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The name of the element. Names follow a certain convention. 
	 * 				    <p>
	 * 				    Names of library elements which have an specific block code, such as 
	 * 				    Mesh (ME) and Tex (ME), always have the first two ASCII characters of
	 * 				    the block code as its prefix. Data of blocks with unspecified block 
	 * 				    code (i.e. {@link BlockCodes#ID_DATA}) have other names.
	 * 				    </p>
	 * 				    <b>A few examples of names:</b>
	 * 					<table border="1">
	 * 					<tr><th>Element type</th><th>Name prefix</th><tr>
	 * 					<tr><td>{@link BlenderObject}</td><td>"OB"</td></tr>
	 * 					<tr><td>{@link Mesh}</td><td>"ME"</td></tr>
	 * 					<tr><td>{@link Material}</td><td>"MA"</td></tr>
	 * 					<tr><td>{@link Tex}</td><td>"TE"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MPoly}</td><td>"NGon Face"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MLoop}</td><td>"NGon Face-Vertex"</td></tr>
	 * 					</table><h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[66]'</li>
	 * <li>Actual Size (32bit/64bit): 66/66</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * In files usually 1024. One of: <table border="1">
	 * 					<tr><td>LIB_LOCAL</td><td>0</td><td></td><tr>
	 * 					<tr><td>LIB_EXTERN</td><td>1</td><td></td><tr>
	 * 					<tr><td>LIB_INDIRECT</td><td>2</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_EXPAND</td><td>8</td><td></td><tr>
	 * 					<tr><td>LIB_TESTEXT</td><td>(LIB_NEED_EXPAND | LIB_EXTERN)</td><td></td><tr>
	 * 					<tr><td>LIB_TESTIND</td><td>(LIB_NEED_EXPAND | LIB_INDIRECT)</td><td></td><tr>
	 * 					<tr><td>LIB_READ</td><td>16</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_LINK</td><td>32</td><td></td><tr>
	 * 					<tr><td>LIB_NEW</td><td>256</td><td></td><tr>
	 * 					<tr><td>LIB_FAKEUSER</td><td>512</td><td></td><tr>
	 * 					<tr><td>LIB_DOIT</td><td>1024</td><td>free test flag</td><tr>
	 * 					<tr><td>LIB_PRE_EXISTING</td><td>2048</td><td>tag existing data before linking so we know what is new</td><tr>
	 * 					<tr><td>LIB_ID_RECALC</td><td>4096</td><td>runtime</td><tr>
	 * 					<tr><td>LIB_ID_RECALC_DATA</td><td>8192</td><td>runtime</td><tr>
	 * 					</table>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> LIB_... flags report on status of the data-block this {@link ID}  belongs to (persistent, saved to and read from .blend). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{86, 106};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> LIB_TAG_... tags (runtime only, cleared at read time). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__tag);
	 * CPointer&lt;Integer&gt; p_tag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{88, 108};

	/**
	 * Field descriptor (offset) for struct member 'us'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference counter, counts number of references on the corresponding element. If 0, the element will not be stored in a file.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__us);
	 * CPointer&lt;Integer&gt; p_us = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'us'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__us = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Always 0 in files. Will be recalculated base on the library element type when loaded.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__icon_id);
	 * CPointer&lt;Integer&gt; p_icon_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_id = new long[]{96, 116};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__recalc);
	 * CPointer&lt;Integer&gt; p_recalc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'recalc_up_to_undo_push'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by undo code. recalc_after_undo_push contains the changes between the last undo push and the current state. This is accumulated as IDs are tagged for update in the depsgraph, and only cleared on undo push.</p><p> recalc_up_to_undo_push is saved to undo memory, and is the value of recalc_after_undo_push at the time of the undo push. This means it can be used to find the changes between undo states. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__recalc_up_to_undo_push);
	 * CPointer&lt;Integer&gt; p_recalc_up_to_undo_push = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc_up_to_undo_push'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc_up_to_undo_push = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'recalc_after_undo_push'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__recalc_after_undo_push);
	 * CPointer&lt;Integer&gt; p_recalc_after_undo_push = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc_after_undo_push'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc_after_undo_push = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A session-wide unique identifier for a given {@link ID} , that remain the same across potential re-allocations (e.g. due to undo/redo steps). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__session_uuid);
	 * CPointer&lt;Integer&gt; p_session_uuid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'session_uuid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__session_uuid = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * List of associated properties.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'override_library'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Library override data<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__override_library);
	 * CPointer&lt;CPointer&lt;IDOverrideLibrary&gt;&gt; p_override_library = p.cast(new Class[]{CPointer.class, IDOverrideLibrary.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'override_library'</li>
	 * <li>Signature: 'IDOverrideLibrary*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__override_library = new long[]{120, 144};

	/**
	 * Field descriptor (offset) for struct member 'orig_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only set for data-blocks which are coming from copy-on-write, points to the original version of it. Also used temporarily during memfile undo to keep a reference to old {@link ID}  when found. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__orig_id);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_orig_id = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_id'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_id = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the #PyObject reference to the {@link ID}  (initialized on demand).</p><p> This isn't essential, it could be removed however it gives some advantages:</p><p><ul><li><p> Every time the {@link ID}  is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access {@link ID} 's).</p></li><li><p> When this {@link ID}  is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.</p><p> This is of limited benefit though, as it doesn't apply to non {@link ID}  data that references this {@link ID}  (the bones of an armature or the modifiers of an object for e.g.). </p></li></ul> 
	 * Every time the ID is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access ID's).
	 * When this ID is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.
	 * This is of limited benefit though, as it doesn't apply to non ID data that references this ID (the bones of an armature or the modifiers of an object for e.g.). 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__py_instance);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_instance = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_instance'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_instance = new long[]{128, 160};

	/**
	 * Field descriptor (offset) for struct member 'library_weak_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Weak reference to a data-block in another library .blend file (used to re-use already appended data instead of appending new copies)<h4>Blender Source Code:</h4>
	 * <p> Weak reference to an {@link ID}  in a given library file, used to allow re-using already appended data in some cases, instead of appending it again.</p><p> May be NULL. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID id = ...;
	 * CPointer&lt;Object&gt; p = id.__dna__addressof(ID.__DNA__FIELD__library_weak_reference);
	 * CPointer&lt;CPointer&lt;LibraryWeakReference&gt;&gt; p_library_weak_reference = p.cast(new Class[]{CPointer.class, LibraryWeakReference.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'library_weak_reference'</li>
	 * <li>Signature: 'LibraryWeakReference*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__library_weak_reference = new long[]{132, 168};

	public ID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ID(ID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on the next element in linked list
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Object> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on the next element in linked list
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Object> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on previous element in linked list
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<Object> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on previous element in linked list
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Object> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'newid'.
	 * @see #__DNA__FIELD__newid
	 */
	
	public CPointer<ID> getNewid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'newid'.
	 * @see #__DNA__FIELD__newid
	 */
	
	public void setNewid(CPointer<ID> newid) throws IOException
	{
		long __address = ((newid == null) ? 0 : newid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference on the library this library element belongs to.
	 * @see #__DNA__FIELD__lib
	 */
	
	public CPointer<Library> getLib() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Library.class};
		return new CPointer<Library>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Library.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference on the library this library element belongs to.
	 * @see #__DNA__FIELD__lib
	 */
	
	public void setLib(CPointer<Library> lib) throws IOException
	{
		long __address = ((lib == null) ? 0 : lib.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'asset_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Additional data for an asset data-block<h4>Blender Source Code:</h4>
	 * <p> If the {@link ID}  is an asset, this pointer is set. Owning pointer. </p>
	 * @see #__DNA__FIELD__asset_data
	 */
	
	public CPointer<AssetMetaData> getAsset_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AssetMetaData.class};
		return new CPointer<AssetMetaData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AssetMetaData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'asset_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Additional data for an asset data-block<h4>Blender Source Code:</h4>
	 * <p> If the {@link ID}  is an asset, this pointer is set. Owning pointer. </p>
	 * @see #__DNA__FIELD__asset_data
	 */
	
	public void setAsset_data(CPointer<AssetMetaData> asset_data) throws IOException
	{
		long __address = ((asset_data == null) ? 0 : asset_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The name of the element. Names follow a certain convention. 
	 * 				    <p>
	 * 				    Names of library elements which have an specific block code, such as 
	 * 				    Mesh (ME) and Tex (ME), always have the first two ASCII characters of
	 * 				    the block code as its prefix. Data of blocks with unspecified block 
	 * 				    code (i.e. {@link BlockCodes#ID_DATA}) have other names.
	 * 				    </p>
	 * 				    <b>A few examples of names:</b>
	 * 					<table border="1">
	 * 					<tr><th>Element type</th><th>Name prefix</th><tr>
	 * 					<tr><td>{@link BlenderObject}</td><td>"OB"</td></tr>
	 * 					<tr><td>{@link Mesh}</td><td>"ME"</td></tr>
	 * 					<tr><td>{@link Material}</td><td>"MA"</td></tr>
	 * 					<tr><td>{@link Tex}</td><td>"TE"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MPoly}</td><td>"NGon Face"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MLoop}</td><td>"NGon Face-Vertex"</td></tr>
	 * 					</table><h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			66
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The name of the element. Names follow a certain convention. 
	 * 				    <p>
	 * 				    Names of library elements which have an specific block code, such as 
	 * 				    Mesh (ME) and Tex (ME), always have the first two ASCII characters of
	 * 				    the block code as its prefix. Data of blocks with unspecified block 
	 * 				    code (i.e. {@link BlockCodes#ID_DATA}) have other names.
	 * 				    </p>
	 * 				    <b>A few examples of names:</b>
	 * 					<table border="1">
	 * 					<tr><th>Element type</th><th>Name prefix</th><tr>
	 * 					<tr><td>{@link BlenderObject}</td><td>"OB"</td></tr>
	 * 					<tr><td>{@link Mesh}</td><td>"ME"</td></tr>
	 * 					<tr><td>{@link Material}</td><td>"MA"</td></tr>
	 * 					<tr><td>{@link Tex}</td><td>"TE"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MPoly}</td><td>"NGon Face"</td></tr>
	 * 					<tr><td>{@link CustomDataLayer} for {@link MLoop}</td><td>"NGon Face-Vertex"</td></tr>
	 * 					</table><h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * In files usually 1024. One of: <table border="1">
	 * 					<tr><td>LIB_LOCAL</td><td>0</td><td></td><tr>
	 * 					<tr><td>LIB_EXTERN</td><td>1</td><td></td><tr>
	 * 					<tr><td>LIB_INDIRECT</td><td>2</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_EXPAND</td><td>8</td><td></td><tr>
	 * 					<tr><td>LIB_TESTEXT</td><td>(LIB_NEED_EXPAND | LIB_EXTERN)</td><td></td><tr>
	 * 					<tr><td>LIB_TESTIND</td><td>(LIB_NEED_EXPAND | LIB_INDIRECT)</td><td></td><tr>
	 * 					<tr><td>LIB_READ</td><td>16</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_LINK</td><td>32</td><td></td><tr>
	 * 					<tr><td>LIB_NEW</td><td>256</td><td></td><tr>
	 * 					<tr><td>LIB_FAKEUSER</td><td>512</td><td></td><tr>
	 * 					<tr><td>LIB_DOIT</td><td>1024</td><td>free test flag</td><tr>
	 * 					<tr><td>LIB_PRE_EXISTING</td><td>2048</td><td>tag existing data before linking so we know what is new</td><tr>
	 * 					<tr><td>LIB_ID_RECALC</td><td>4096</td><td>runtime</td><tr>
	 * 					<tr><td>LIB_ID_RECALC_DATA</td><td>8192</td><td>runtime</td><tr>
	 * 					</table>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> LIB_... flags report on status of the data-block this {@link ID}  belongs to (persistent, saved to and read from .blend). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 86);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * In files usually 1024. One of: <table border="1">
	 * 					<tr><td>LIB_LOCAL</td><td>0</td><td></td><tr>
	 * 					<tr><td>LIB_EXTERN</td><td>1</td><td></td><tr>
	 * 					<tr><td>LIB_INDIRECT</td><td>2</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_EXPAND</td><td>8</td><td></td><tr>
	 * 					<tr><td>LIB_TESTEXT</td><td>(LIB_NEED_EXPAND | LIB_EXTERN)</td><td></td><tr>
	 * 					<tr><td>LIB_TESTIND</td><td>(LIB_NEED_EXPAND | LIB_INDIRECT)</td><td></td><tr>
	 * 					<tr><td>LIB_READ</td><td>16</td><td></td><tr>
	 * 					<tr><td>LIB_NEED_LINK</td><td>32</td><td></td><tr>
	 * 					<tr><td>LIB_NEW</td><td>256</td><td></td><tr>
	 * 					<tr><td>LIB_FAKEUSER</td><td>512</td><td></td><tr>
	 * 					<tr><td>LIB_DOIT</td><td>1024</td><td>free test flag</td><tr>
	 * 					<tr><td>LIB_PRE_EXISTING</td><td>2048</td><td>tag existing data before linking so we know what is new</td><tr>
	 * 					<tr><td>LIB_ID_RECALC</td><td>4096</td><td>runtime</td><tr>
	 * 					<tr><td>LIB_ID_RECALC_DATA</td><td>8192</td><td>runtime</td><tr>
	 * 					</table>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> LIB_... flags report on status of the data-block this {@link ID}  belongs to (persistent, saved to and read from .blend). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, flag);
		} else {
			__io__block.writeShort(__io__address + 86, flag);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> LIB_TAG_... tags (runtime only, cleared at read time). </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public int getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> LIB_TAG_... tags (runtime only, cleared at read time). </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(int tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, tag);
		} else {
			__io__block.writeInt(__io__address + 88, tag);
		}
	}

	/**
	 * Get method for struct member 'us'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference counter, counts number of references on the corresponding element. If 0, the element will not be stored in a file.
	 * @see #__DNA__FIELD__us
	 */
	
	public int getUs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'us'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Reference counter, counts number of references on the corresponding element. If 0, the element will not be stored in a file.
	 * @see #__DNA__FIELD__us
	 */
	
	public void setUs(int us) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, us);
		} else {
			__io__block.writeInt(__io__address + 92, us);
		}
	}

	/**
	 * Get method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Always 0 in files. Will be recalculated base on the library element type when loaded.
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public int getIcon_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Always 0 in files. Will be recalculated base on the library element type when loaded.
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public void setIcon_id(int icon_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, icon_id);
		} else {
			__io__block.writeInt(__io__address + 96, icon_id);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public int getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(int recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, recalc);
		} else {
			__io__block.writeInt(__io__address + 100, recalc);
		}
	}

	/**
	 * Get method for struct member 'recalc_up_to_undo_push'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by undo code. recalc_after_undo_push contains the changes between the last undo push and the current state. This is accumulated as IDs are tagged for update in the depsgraph, and only cleared on undo push.</p><p> recalc_up_to_undo_push is saved to undo memory, and is the value of recalc_after_undo_push at the time of the undo push. This means it can be used to find the changes between undo states. </p>
	 * @see #__DNA__FIELD__recalc_up_to_undo_push
	 */
	
	public int getRecalc_up_to_undo_push() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'recalc_up_to_undo_push'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by undo code. recalc_after_undo_push contains the changes between the last undo push and the current state. This is accumulated as IDs are tagged for update in the depsgraph, and only cleared on undo push.</p><p> recalc_up_to_undo_push is saved to undo memory, and is the value of recalc_after_undo_push at the time of the undo push. This means it can be used to find the changes between undo states. </p>
	 * @see #__DNA__FIELD__recalc_up_to_undo_push
	 */
	
	public void setRecalc_up_to_undo_push(int recalc_up_to_undo_push) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, recalc_up_to_undo_push);
		} else {
			__io__block.writeInt(__io__address + 104, recalc_up_to_undo_push);
		}
	}

	/**
	 * Get method for struct member 'recalc_after_undo_push'.
	 * @see #__DNA__FIELD__recalc_after_undo_push
	 */
	
	public int getRecalc_after_undo_push() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'recalc_after_undo_push'.
	 * @see #__DNA__FIELD__recalc_after_undo_push
	 */
	
	public void setRecalc_after_undo_push(int recalc_after_undo_push) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, recalc_after_undo_push);
		} else {
			__io__block.writeInt(__io__address + 108, recalc_after_undo_push);
		}
	}

	/**
	 * Get method for struct member 'session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A session-wide unique identifier for a given {@link ID} , that remain the same across potential re-allocations (e.g. due to undo/redo steps). </p>
	 * @see #__DNA__FIELD__session_uuid
	 */
	
	public int getSession_uuid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'session_uuid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A session-wide unique identifier for a given {@link ID} , that remain the same across potential re-allocations (e.g. due to undo/redo steps). </p>
	 * @see #__DNA__FIELD__session_uuid
	 */
	
	public void setSession_uuid(int session_uuid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, session_uuid);
		} else {
			__io__block.writeInt(__io__address + 112, session_uuid);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * List of associated properties.
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * List of associated properties.
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'override_library'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Library override data<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * @see #__DNA__FIELD__override_library
	 */
	
	public CPointer<IDOverrideLibrary> getOverride_library() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDOverrideLibrary.class};
		return new CPointer<IDOverrideLibrary>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDOverrideLibrary.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'override_library'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Library override data<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * @see #__DNA__FIELD__override_library
	 */
	
	public void setOverride_library(CPointer<IDOverrideLibrary> override_library) throws IOException
	{
		long __address = ((override_library == null) ? 0 : override_library.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'orig_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only set for data-blocks which are coming from copy-on-write, points to the original version of it. Also used temporarily during memfile undo to keep a reference to old {@link ID}  when found. </p>
	 * @see #__DNA__FIELD__orig_id
	 */
	
	public CPointer<ID> getOrig_id() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'orig_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only set for data-blocks which are coming from copy-on-write, points to the original version of it. Also used temporarily during memfile undo to keep a reference to old {@link ID}  when found. </p>
	 * @see #__DNA__FIELD__orig_id
	 */
	
	public void setOrig_id(CPointer<ID> orig_id) throws IOException
	{
		long __address = ((orig_id == null) ? 0 : orig_id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the #PyObject reference to the {@link ID}  (initialized on demand).</p><p> This isn't essential, it could be removed however it gives some advantages:</p><p><ul><li><p> Every time the {@link ID}  is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access {@link ID} 's).</p></li><li><p> When this {@link ID}  is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.</p><p> This is of limited benefit though, as it doesn't apply to non {@link ID}  data that references this {@link ID}  (the bones of an armature or the modifiers of an object for e.g.). </p></li></ul> 
	 * Every time the ID is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access ID's).
	 * When this ID is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.
	 * This is of limited benefit though, as it doesn't apply to non ID data that references this ID (the bones of an armature or the modifiers of an object for e.g.). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__py_instance
	 */
	
	public CPointer<Object> getPy_instance() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the #PyObject reference to the {@link ID}  (initialized on demand).</p><p> This isn't essential, it could be removed however it gives some advantages:</p><p><ul><li><p> Every time the {@link ID}  is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access {@link ID} 's).</p></li><li><p> When this {@link ID}  is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.</p><p> This is of limited benefit though, as it doesn't apply to non {@link ID}  data that references this {@link ID}  (the bones of an armature or the modifiers of an object for e.g.). </p></li></ul> 
	 * Every time the ID is accessed a #BPy_StructRNA doesn't have to be created & destroyed (consider all the polling and drawing functions that access ID's).
	 * When this ID is deleted, the #BPy_StructRNA can be invalidated so accessing it from Python raises an exception instead of crashing.
	 * This is of limited benefit though, as it doesn't apply to non ID data that references this ID (the bones of an armature or the modifiers of an object for e.g.). 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__py_instance
	 */
	
	public void setPy_instance(CPointer<Object> py_instance) throws IOException
	{
		long __address = ((py_instance == null) ? 0 : py_instance.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'library_weak_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Weak reference to a data-block in another library .blend file (used to re-use already appended data instead of appending new copies)<h4>Blender Source Code:</h4>
	 * <p> Weak reference to an {@link ID}  in a given library file, used to allow re-using already appended data in some cases, instead of appending it again.</p><p> May be NULL. </p>
	 * @see #__DNA__FIELD__library_weak_reference
	 */
	
	public CPointer<LibraryWeakReference> getLibrary_weak_reference() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LibraryWeakReference.class};
		return new CPointer<LibraryWeakReference>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LibraryWeakReference.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'library_weak_reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Weak reference to a data-block in another library .blend file (used to re-use already appended data instead of appending new copies)<h4>Blender Source Code:</h4>
	 * <p> Weak reference to an {@link ID}  in a given library file, used to allow re-using already appended data in some cases, instead of appending it again.</p><p> May be NULL. </p>
	 * @see #__DNA__FIELD__library_weak_reference
	 */
	
	public void setLibrary_weak_reference(CPointer<LibraryWeakReference> library_weak_reference) throws IOException
	{
		long __address = ((library_weak_reference == null) ? 0 : library_weak_reference.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ID> __io__addressof() {
		return new CPointer<ID>(__io__address, new Class[]{ID.class}, __io__block, __io__blockTable);
	}

}
