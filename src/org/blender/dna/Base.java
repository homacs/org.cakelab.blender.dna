package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Base'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Wrapper for referencing Objects in a Scene
 */

@CMetaData(size32=44, size64=64)
public class Base extends CFacade {

	/**
	 * This is the sdna index of the struct Base.
	 * <p>
	 * It is required when allocating a new block to store data for Base.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 629;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * next object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Base&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Base*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * previous object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Base&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Base*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag_from_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags which are based on the collections flags evaluation, does not include flags from object's restrictions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__flag_from_collection);
	 * CPointer&lt;Short&gt; p_flag_from_collection = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag_from_collection'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag_from_collection = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	BA_WAS_SEL          (1 << 1)
	 * 	BA_HAS_RECALC_OB    (1 << 2)
	 * 	BA_HAS_RECALC_DATA  (1 << 3)
	 * 	// NOTE: this was used as a proper setting in past, so nullify before using 
	 * 	BA_TEMP_TAG         (1 << 5)
	 * 
	 *     // BA_FROMSET          (1 << 7)  //UNUSED
	 * 
	 * 	BA_TRANSFORM_CHILD  (1 << 8)  // child of a transformed object 
	 * 	BA_TRANSFORM_PARENT (1 << 13)  // parent of a transformed object
	 * 
	 * 
	 * 	// an initial attempt as making selection more specific!
	 * 	BA_DESELECT     0
	 * 	BA_SELECT       1
	 * 
	 * 
	 * 	OB_FROMDUPLI        (1 << 9)
	 * 	OB_DONE             (1 << 10)  // unknown state, clear before use
	 * 	// OB_RADIO            (1 << 11) // deprecated
	 * 	OB_FROMGROUP        (1 << 12)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Final flags, including both accumulated collection flags and object's restriction flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'local_view_bits'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__local_view_bits);
	 * CPointer&lt;Short&gt; p_local_view_bits = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'local_view_bits'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__local_view_bits = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'sx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__sx);
	 * CPointer&lt;Short&gt; p_sx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sx = new long[]{14, 22};

	/**
	 * Field descriptor (offset) for struct member 'sy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__sy);
	 * CPointer&lt;Short&gt; p_sy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sy = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{18, 26};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Layer<h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__lay);
	 * CPointer&lt;Integer&gt; p_lay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'flag_legacy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__flag_legacy);
	 * CPointer&lt;Integer&gt; p_flag_legacy = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag_legacy'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag_legacy = new long[]{32, 44};

	/**
	 * Field descriptor (offset) for struct member 'base_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original base. Is initialized for evaluated view layer. NOTE: Only allowed to be accessed from within active dependency graph. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD__base_orig);
	 * CPointer&lt;CPointer&lt;Base&gt;&gt; p_base_orig = p.cast(new Class[]{CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_orig'</li>
	 * <li>Signature: 'Base*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_orig = new long[]{36, 48};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Base base = ...;
	 * CPointer&lt;Object&gt; p = base.__dna__addressof(Base.__DNA__FIELD___pad);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{40, 56};

	public Base(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Base(Base that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * next object
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Base> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * next object
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Base> next) throws IOException
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
	 * previous object
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<Base> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * previous object
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Base> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'flag_from_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags which are based on the collections flags evaluation, does not include flags from object's restrictions. </p>
	 * @see #__DNA__FIELD__flag_from_collection
	 */
	
	public short getFlag_from_collection() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag_from_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags which are based on the collections flags evaluation, does not include flags from object's restrictions. </p>
	 * @see #__DNA__FIELD__flag_from_collection
	 */
	
	public void setFlag_from_collection(short flag_from_collection) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, flag_from_collection);
		} else {
			__io__block.writeShort(__io__address + 8, flag_from_collection);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	BA_WAS_SEL          (1 << 1)
	 * 	BA_HAS_RECALC_OB    (1 << 2)
	 * 	BA_HAS_RECALC_DATA  (1 << 3)
	 * 	// NOTE: this was used as a proper setting in past, so nullify before using 
	 * 	BA_TEMP_TAG         (1 << 5)
	 * 
	 *     // BA_FROMSET          (1 << 7)  //UNUSED
	 * 
	 * 	BA_TRANSFORM_CHILD  (1 << 8)  // child of a transformed object 
	 * 	BA_TRANSFORM_PARENT (1 << 13)  // parent of a transformed object
	 * 
	 * 
	 * 	// an initial attempt as making selection more specific!
	 * 	BA_DESELECT     0
	 * 	BA_SELECT       1
	 * 
	 * 
	 * 	OB_FROMDUPLI        (1 << 9)
	 * 	OB_DONE             (1 << 10)  // unknown state, clear before use
	 * 	// OB_RADIO            (1 << 11) // deprecated
	 * 	OB_FROMGROUP        (1 << 12)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Final flags, including both accumulated collection flags and object's restriction flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	BA_WAS_SEL          (1 << 1)
	 * 	BA_HAS_RECALC_OB    (1 << 2)
	 * 	BA_HAS_RECALC_DATA  (1 << 3)
	 * 	// NOTE: this was used as a proper setting in past, so nullify before using 
	 * 	BA_TEMP_TAG         (1 << 5)
	 * 
	 *     // BA_FROMSET          (1 << 7)  //UNUSED
	 * 
	 * 	BA_TRANSFORM_CHILD  (1 << 8)  // child of a transformed object 
	 * 	BA_TRANSFORM_PARENT (1 << 13)  // parent of a transformed object
	 * 
	 * 
	 * 	// an initial attempt as making selection more specific!
	 * 	BA_DESELECT     0
	 * 	BA_SELECT       1
	 * 
	 * 
	 * 	OB_FROMDUPLI        (1 << 9)
	 * 	OB_DONE             (1 << 10)  // unknown state, clear before use
	 * 	// OB_RADIO            (1 << 11) // deprecated
	 * 	OB_FROMGROUP        (1 << 12)
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> Final flags, including both accumulated collection flags and object's restriction flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, flag);
		} else {
			__io__block.writeShort(__io__address + 10, flag);
		}
	}

	/**
	 * Get method for struct member 'local_view_bits'.
	 * @see #__DNA__FIELD__local_view_bits
	 */
	
	public short getLocal_view_bits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'local_view_bits'.
	 * @see #__DNA__FIELD__local_view_bits
	 */
	
	public void setLocal_view_bits(short local_view_bits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, local_view_bits);
		} else {
			__io__block.writeShort(__io__address + 12, local_view_bits);
		}
	}

	/**
	 * Get method for struct member 'sx'.
	 * @see #__DNA__FIELD__sx
	 */
	
	public short getSx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'sx'.
	 * @see #__DNA__FIELD__sx
	 */
	
	public void setSx(short sx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, sx);
		} else {
			__io__block.writeShort(__io__address + 14, sx);
		}
	}

	/**
	 * Get method for struct member 'sy'.
	 * @see #__DNA__FIELD__sy
	 */
	
	public short getSy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'sy'.
	 * @see #__DNA__FIELD__sy
	 */
	
	public void setSy(short sy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, sy);
		} else {
			__io__block.writeShort(__io__address + 16, sy);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 26;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this object
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * this object
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Layer<h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Layer<h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, lay);
		} else {
			__io__block.writeInt(__io__address + 28, lay);
		}
	}

	/**
	 * Get method for struct member 'flag_legacy'.
	 * @see #__DNA__FIELD__flag_legacy
	 */
	
	public int getFlag_legacy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'flag_legacy'.
	 * @see #__DNA__FIELD__flag_legacy
	 */
	
	public void setFlag_legacy(int flag_legacy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, flag_legacy);
		} else {
			__io__block.writeInt(__io__address + 32, flag_legacy);
		}
	}

	/**
	 * Get method for struct member 'base_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original base. Is initialized for evaluated view layer. NOTE: Only allowed to be accessed from within active dependency graph. </p>
	 * @see #__DNA__FIELD__base_orig
	 */
	
	public CPointer<Base> getBase_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'base_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original base. Is initialized for evaluated view layer. NOTE: Only allowed to be accessed from within active dependency graph. </p>
	 * @see #__DNA__FIELD__base_orig
	 */
	
	public void setBase_orig(CPointer<Base> base_orig) throws IOException
	{
		long __address = ((base_orig == null) ? 0 : base_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CPointer<Object> get_pad() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CPointer<Object> _pad) throws IOException
	{
		long __address = ((_pad == null) ? 0 : _pad.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Base> __io__addressof() {
		return new CPointer<Base>(__io__address, new Class[]{Base.class}, __io__block, __io__blockTable);
	}

}
