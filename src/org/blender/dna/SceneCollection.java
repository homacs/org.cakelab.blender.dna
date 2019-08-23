package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SceneCollection'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=120)
public class SceneCollection extends CFacade {

	/**
	 * This is the sdna index of the struct SceneCollection.
	 * <p>
	 * It is required when allocating a new block to store data for SceneCollection.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 633;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SceneCollection&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SceneCollection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SceneCollection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SceneCollection&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SceneCollection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SceneCollection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'active_object_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__active_object_index);
	 * CPointer&lt;Integer&gt; p_active_object_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_object_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_object_index = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{78, 86};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{79, 87};

	/**
	 * Field descriptor (offset) for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link Object}  *)LinkData->data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__objects);
	 * CPointer&lt;ListBase&gt; p_objects = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'objects'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__objects = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'scene_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nested collections. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneCollection scenecollection = ...;
	 * CPointer&lt;Object&gt; p = scenecollection.__dna__addressof(SceneCollection.__DNA__FIELD__scene_collections);
	 * CPointer&lt;ListBase&gt; p_scene_collections = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene_collections'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene_collections = new long[]{88, 104};

	public SceneCollection(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SceneCollection(SceneCollection that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SceneCollection> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneCollection.class};
		return new CPointer<SceneCollection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneCollection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SceneCollection> next) throws IOException
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
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<SceneCollection> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneCollection.class};
		return new CPointer<SceneCollection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneCollection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SceneCollection> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'active_object_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * @see #__DNA__FIELD__active_object_index
	 */
	
	public int getActive_object_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'active_object_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For UI. </p>
	 * @see #__DNA__FIELD__active_object_index
	 */
	
	public void setActive_object_index(int active_object_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, active_object_index);
		} else {
			__io__block.writeInt(__io__address + 72, active_object_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 84);
		} else {
			return __io__block.readShort(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 84, flag);
		} else {
			__io__block.writeShort(__io__address + 76, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 86);
		} else {
			return __io__block.readByte(__io__address + 78);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 86, type);
		} else {
			__io__block.writeByte(__io__address + 78, type);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 87);
		} else {
			return __io__block.readByte(__io__address + 79);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 87, _pad);
		} else {
			__io__block.writeByte(__io__address + 79, _pad);
		}
	}

	/**
	 * Get method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link Object}  *)LinkData->data. </p>
	 * @see #__DNA__FIELD__objects
	 */
	
	public ListBase getObjects() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ({@link Object}  *)LinkData->data. </p>
	 * @see #__DNA__FIELD__objects
	 */
	
	public void setObjects(ListBase objects) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(objects, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, objects)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, objects);
		} else {
			__io__generic__copy( getObjects(), objects);
		}
	}

	/**
	 * Get method for struct member 'scene_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nested collections. </p>
	 * @see #__DNA__FIELD__scene_collections
	 */
	
	public ListBase getScene_collections() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scene_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nested collections. </p>
	 * @see #__DNA__FIELD__scene_collections
	 */
	
	public void setScene_collections(ListBase scene_collections) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(scene_collections, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scene_collections)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scene_collections);
		} else {
			__io__generic__copy( getScene_collections(), scene_collections);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SceneCollection> __io__addressof() {
		return new CPointer<SceneCollection>(__io__address, new Class[]{SceneCollection.class}, __io__block, __io__blockTable);
	}

}
