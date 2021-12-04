package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Collection'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=220, size64=312)
public class Collection extends CFacade {

	/**
	 * This is the sdna index of the struct Collection.
	 * <p>
	 * It is required when allocating a new block to store data for Collection.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 348;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 136/176</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'gobject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CollectionObject} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__gobject);
	 * CPointer&lt;ListBase&gt; p_gobject = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gobject'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gobject = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collections that are immediate children of this collection<h4>Blender Source Code:</h4>
	 * <p>{@link CollectionChild} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__children);
	 * CPointer&lt;ListBase&gt; p_children = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'children'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__children = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{152, 208};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__layer);
	 * CPointer&lt;Integer&gt; p_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'dupli_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__dupli_ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dupli_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupli_ofs'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupli_ofs = new long[]{160, 220};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{172, 232};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> Runtime-only, always cleared on file load. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__tag);
	 * CPointer&lt;Short&gt; p_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{174, 234};

	/**
	 * Field descriptor (offset) for struct member 'lineart_usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to use this collection in line art<h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Usage </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__lineart_usage);
	 * CPointer&lt;Short&gt; p_lineart_usage = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineart_usage'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineart_usage = new long[]{176, 236};

	/**
	 * Field descriptor (offset) for struct member 'lineart_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__lineart_flags);
	 * CPointer&lt;Byte&gt; p_lineart_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineart_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineart_flags = new long[]{178, 238};

	/**
	 * Field descriptor (offset) for struct member 'lineart_intersection_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intersection generated by this collection will have this mask value
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__lineart_intersection_mask);
	 * CPointer&lt;Byte&gt; p_lineart_intersection_mask = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineart_intersection_mask'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineart_intersection_mask = new long[]{179, 239};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{180, 240};

	/**
	 * Field descriptor (offset) for struct member 'color_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color tag for a collection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__color_tag);
	 * CPointer&lt;Short&gt; p_color_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_tag = new long[]{186, 246};

	/**
	 * Field descriptor (offset) for struct member 'object_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. Cache of objects in this collection and all its children. This is created on demand when e.g. some physics simulation needs it, we don't want to have it for every collections due to memory usage reasons. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__object_cache);
	 * CPointer&lt;ListBase&gt; p_object_cache = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_cache'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_cache = new long[]{188, 248};

	/**
	 * Field descriptor (offset) for struct member 'object_cache_instanced'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Need this for line art sub-collection selections. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__object_cache_instanced);
	 * CPointer&lt;ListBase&gt; p_object_cache_instanced = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_cache_instanced'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_cache_instanced = new long[]{196, 264};

	/**
	 * Field descriptor (offset) for struct member 'parents'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. List of collections that are a parent of this datablock. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__parents);
	 * CPointer&lt;ListBase&gt; p_parents = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parents'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parents = new long[]{204, 280};

	/**
	 * Field descriptor (offset) for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__collection);
	 * CPointer&lt;CPointer&lt;SceneCollection&gt;&gt; p_collection = p.cast(new Class[]{CPointer.class, SceneCollection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection'</li>
	 * <li>Signature: 'SceneCollection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection = new long[]{212, 296};

	/**
	 * Field descriptor (offset) for struct member 'view_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Collection collection = ...;
	 * CPointer&lt;Object&gt; p = collection.__dna__addressof(Collection.__DNA__FIELD__view_layer);
	 * CPointer&lt;CPointer&lt;ViewLayer&gt;&gt; p_view_layer = p.cast(new Class[]{CPointer.class, ViewLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_layer'</li>
	 * <li>Signature: 'ViewLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_layer = new long[]{216, 304};

	public Collection(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Collection(Collection that) {
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
	 * Get method for struct member 'gobject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CollectionObject} . </p>
	 * @see #__DNA__FIELD__gobject
	 */
	
	public ListBase getGobject() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gobject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CollectionObject} . </p>
	 * @see #__DNA__FIELD__gobject
	 */
	
	public void setGobject(ListBase gobject) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(gobject, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gobject)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gobject);
		} else {
			__io__generic__copy( getGobject(), gobject);
		}
	}

	/**
	 * Get method for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collections that are immediate children of this collection<h4>Blender Source Code:</h4>
	 * <p>{@link CollectionChild} . </p>
	 * @see #__DNA__FIELD__children
	 */
	
	public ListBase getChildren() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collections that are immediate children of this collection<h4>Blender Source Code:</h4>
	 * <p>{@link CollectionChild} . </p>
	 * @see #__DNA__FIELD__children
	 */
	
	public void setChildren(ListBase children) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(children, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, children)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, children);
		} else {
			__io__generic__copy( getChildren(), children);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (always None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public int getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(int layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, layer);
		} else {
			__io__block.writeInt(__io__address + 156, layer);
		}
	}

	/**
	 * Get method for struct member 'dupli_ofs'.
	 * @see #__DNA__FIELD__dupli_ofs
	 */
	
	public CArrayFacade<Float> getDupli_ofs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dupli_ofs'.
	 * @see #__DNA__FIELD__dupli_ofs
	 */
	
	public void setDupli_ofs(CArrayFacade<Float> dupli_ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(dupli_ofs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dupli_ofs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dupli_ofs);
		} else {
			__io__generic__copy( getDupli_ofs(), dupli_ofs);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, flag);
		} else {
			__io__block.writeShort(__io__address + 172, flag);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> Runtime-only, always cleared on file load. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public short getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Tools can use this to tag data for their own purposes (initial state is undefined)<h4>Blender Source Code:</h4>
	 * <p> Runtime-only, always cleared on file load. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(short tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, tag);
		} else {
			__io__block.writeShort(__io__address + 174, tag);
		}
	}

	/**
	 * Get method for struct member 'lineart_usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to use this collection in line art<h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Usage </p>
	 * @see #__DNA__FIELD__lineart_usage
	 */
	
	public short getLineart_usage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'lineart_usage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to use this collection in line art<h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Usage </p>
	 * @see #__DNA__FIELD__lineart_usage
	 */
	
	public void setLineart_usage(short lineart_usage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, lineart_usage);
		} else {
			__io__block.writeShort(__io__address + 176, lineart_usage);
		}
	}

	/**
	 * Get method for struct member 'lineart_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Flags </p>
	 * @see #__DNA__FIELD__lineart_flags
	 */
	
	public byte getLineart_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 238);
		} else {
			return __io__block.readByte(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'lineart_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCollectionLineArt_Flags </p>
	 * @see #__DNA__FIELD__lineart_flags
	 */
	
	public void setLineart_flags(byte lineart_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 238, lineart_flags);
		} else {
			__io__block.writeByte(__io__address + 178, lineart_flags);
		}
	}

	/**
	 * Get method for struct member 'lineart_intersection_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intersection generated by this collection will have this mask value
	 * @see #__DNA__FIELD__lineart_intersection_mask
	 */
	
	public byte getLineart_intersection_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 239);
		} else {
			return __io__block.readByte(__io__address + 179);
		}
	}

	/**
	 * Set method for struct member 'lineart_intersection_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intersection generated by this collection will have this mask value
	 * @see #__DNA__FIELD__lineart_intersection_mask
	 */
	
	public void setLineart_intersection_mask(byte lineart_intersection_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 239, lineart_intersection_mask);
		} else {
			__io__block.writeByte(__io__address + 179, lineart_intersection_mask);
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
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 240;
		} else {
			__dna__offset = 180;
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
	 * Get method for struct member 'color_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color tag for a collection
	 * @see #__DNA__FIELD__color_tag
	 */
	
	public short getColor_tag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 246);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'color_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color tag for a collection
	 * @see #__DNA__FIELD__color_tag
	 */
	
	public void setColor_tag(short color_tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 246, color_tag);
		} else {
			__io__block.writeShort(__io__address + 186, color_tag);
		}
	}

	/**
	 * Get method for struct member 'object_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. Cache of objects in this collection and all its children. This is created on demand when e.g. some physics simulation needs it, we don't want to have it for every collections due to memory usage reasons. </p>
	 * @see #__DNA__FIELD__object_cache
	 */
	
	public ListBase getObject_cache() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 188, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. Cache of objects in this collection and all its children. This is created on demand when e.g. some physics simulation needs it, we don't want to have it for every collections due to memory usage reasons. </p>
	 * @see #__DNA__FIELD__object_cache
	 */
	
	public void setObject_cache(ListBase object_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(object_cache, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_cache)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_cache);
		} else {
			__io__generic__copy( getObject_cache(), object_cache);
		}
	}

	/**
	 * Get method for struct member 'object_cache_instanced'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Need this for line art sub-collection selections. </p>
	 * @see #__DNA__FIELD__object_cache_instanced
	 */
	
	public ListBase getObject_cache_instanced() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 196, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_cache_instanced'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Need this for line art sub-collection selections. </p>
	 * @see #__DNA__FIELD__object_cache_instanced
	 */
	
	public void setObject_cache_instanced(ListBase object_cache_instanced) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 196;
		}
		if (__io__equals(object_cache_instanced, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_cache_instanced)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_cache_instanced);
		} else {
			__io__generic__copy( getObject_cache_instanced(), object_cache_instanced);
		}
	}

	/**
	 * Get method for struct member 'parents'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. List of collections that are a parent of this datablock. </p>
	 * @see #__DNA__FIELD__parents
	 */
	
	public ListBase getParents() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parents'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. List of collections that are a parent of this datablock. </p>
	 * @see #__DNA__FIELD__parents
	 */
	
	public void setParents(ListBase parents) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(parents, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parents)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parents);
		} else {
			__io__generic__copy( getParents(), parents);
		}
	}

	/**
	 * Get method for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__collection
	 */
	
	public CPointer<SceneCollection> getCollection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneCollection.class};
		return new CPointer<SceneCollection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneCollection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__collection
	 */
	
	public void setCollection(CPointer<SceneCollection> collection) throws IOException
	{
		long __address = ((collection == null) ? 0 : collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Get method for struct member 'view_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__view_layer
	 */
	
	public CPointer<ViewLayer> getView_layer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayer.class};
		return new CPointer<ViewLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'view_layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__view_layer
	 */
	
	public void setView_layer(CPointer<ViewLayer> view_layer) throws IOException
	{
		long __address = ((view_layer == null) ? 0 : view_layer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Collection> __io__addressof() {
		return new CPointer<Collection>(__io__address, new Class[]{Collection.class}, __io__block, __io__blockTable);
	}

}
