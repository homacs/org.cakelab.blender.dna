package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDProperty'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * ID properties are a generic method to store a linked 
 * 					list of additional information at IDs (see {@link ID}.
 */

@CMetaData(size32=108, size64=128)
public class IDProperty extends CFacade {

	/**
	 * This is the sdna index of the struct IDProperty.
	 * <p>
	 * It is required when allocating a new block to store data for IDProperty.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 9;

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
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'IDProperty*'</li>
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
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Type of the property data. One of
	 * 						<pre>
	 * 								IDP_STRING		0
	 * 								IDP_INT			1
	 * 								IDP_FLOAT		2
	 * 								IDP_ARRAY		5
	 * 								IDP_GROUP		6
	 * 								IDP_ID			7
	 * 								IDP_DOUBLE		8
	 * 								IDP_IDPARRAY	9
	 * 								IDP_NUMTYPES	10
	 * 						</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Subtype of the property data. One of
	 * 						<pre>
	 * 							IDP_STRING_SUB_UTF8  0 ( default )
	 * 							IDP_STRING_SUB_BYTE  1 ( arbitrary byte array, _not_ null terminated )
	 * 						</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__subtype);
	 * CPointer&lt;Byte&gt; p_subtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtype = new long[]{9, 17};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__flag);
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
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' name<h4>Blender Source Code:</h4>
	 * <p> MAX_IDPROP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * saved is used to indicate if this struct has been saved yet.<h4>Blender Source Code:</h4>
	 * <p> saved is used to indicate if this struct has been saved yet. seemed like a good idea as a pad var was needed anyway :) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__saved);
	 * CPointer&lt;Integer&gt; p_saved = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'saved'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__saved = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' data. note, alignment for 64 bits<h4>Blender Source Code:</h4>
	 * <p> note, alignment for 64 bits </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__data);
	 * CPointer&lt;IDPropertyData&gt; p_data = p.cast(new Class[]{IDPropertyData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'IDPropertyData'</li>
	 * <li>Actual Size (32bit/64bit): 20/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * array length, also (this is important!) string length + 1.
	 * 	          			the idea is to be able to reuse array realloc functions on strings.<h4>Blender Source Code:</h4>
	 * <p> array length, also (this is important!) string length + 1. the idea is to be able to reuse array realloc functions on strings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__len);
	 * CPointer&lt;Integer&gt; p_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'totallen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * totallen is total length of allocated array/string, including a buffer.
	 * 	 							Note that the buffering is mild; the code comes from python's list 
	 * 	 							implementation. Strings and arrays are both buffered, though the buffer
	 * 								isn't saved.<h4>Blender Source Code:</h4>
	 * <p> Strings and arrays are both buffered, though the buffer isn't saved. totallen is total length of allocated array/string, including a buffer. Note that the buffering is mild; the code comes from python's list implementation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDProperty idproperty = ...;
	 * CPointer&lt;Object&gt; p = idproperty.__dna__addressof(IDProperty.__DNA__FIELD__totallen);
	 * CPointer&lt;Integer&gt; p_totallen = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totallen'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totallen = new long[]{104, 124};

	public IDProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDProperty(IDProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on the next element in linked list
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<IDProperty> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on the next element in linked list
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<IDProperty> next) throws IOException
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
	
	public CPointer<IDProperty> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * reference on previous element in linked list
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<IDProperty> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Type of the property data. One of
	 * 						<pre>
	 * 								IDP_STRING		0
	 * 								IDP_INT			1
	 * 								IDP_FLOAT		2
	 * 								IDP_ARRAY		5
	 * 								IDP_GROUP		6
	 * 								IDP_ID			7
	 * 								IDP_DOUBLE		8
	 * 								IDP_IDPARRAY	9
	 * 								IDP_NUMTYPES	10
	 * 						</pre>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 16);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Type of the property data. One of
	 * 						<pre>
	 * 								IDP_STRING		0
	 * 								IDP_INT			1
	 * 								IDP_FLOAT		2
	 * 								IDP_ARRAY		5
	 * 								IDP_GROUP		6
	 * 								IDP_ID			7
	 * 								IDP_DOUBLE		8
	 * 								IDP_IDPARRAY	9
	 * 								IDP_NUMTYPES	10
	 * 						</pre>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 16, type);
		} else {
			__io__block.writeByte(__io__address + 8, type);
		}
	}

	/**
	 * Get method for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Subtype of the property data. One of
	 * 						<pre>
	 * 							IDP_STRING_SUB_UTF8  0 ( default )
	 * 							IDP_STRING_SUB_BYTE  1 ( arbitrary byte array, _not_ null terminated )
	 * 						</pre>
	 * @see #__DNA__FIELD__subtype
	 */
	
	public byte getSubtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 17);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Subtype of the property data. One of
	 * 						<pre>
	 * 							IDP_STRING_SUB_UTF8  0 ( default )
	 * 							IDP_STRING_SUB_BYTE  1 ( arbitrary byte array, _not_ null terminated )
	 * 						</pre>
	 * @see #__DNA__FIELD__subtype
	 */
	
	public void setSubtype(byte subtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 17, subtype);
		} else {
			__io__block.writeByte(__io__address + 9, subtype);
		}
	}

	/**
	 * Get method for struct member 'flag'.
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
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' name<h4>Blender Source Code:</h4>
	 * <p> MAX_IDPROP_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' name<h4>Blender Source Code:</h4>
	 * <p> MAX_IDPROP_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 12;
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
	 * Get method for struct member 'saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * saved is used to indicate if this struct has been saved yet.<h4>Blender Source Code:</h4>
	 * <p> saved is used to indicate if this struct has been saved yet. seemed like a good idea as a pad var was needed anyway :) </p>
	 * @see #__DNA__FIELD__saved
	 */
	
	public int getSaved() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * saved is used to indicate if this struct has been saved yet.<h4>Blender Source Code:</h4>
	 * <p> saved is used to indicate if this struct has been saved yet. seemed like a good idea as a pad var was needed anyway :) </p>
	 * @see #__DNA__FIELD__saved
	 */
	
	public void setSaved(int saved) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, saved);
		} else {
			__io__block.writeInt(__io__address + 76, saved);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' data. note, alignment for 64 bits<h4>Blender Source Code:</h4>
	 * <p> note, alignment for 64 bits </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public IDPropertyData getData() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new IDPropertyData(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new IDPropertyData(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * properties' data. note, alignment for 64 bits<h4>Blender Source Code:</h4>
	 * <p> note, alignment for 64 bits </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(IDPropertyData data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data);
		} else {
			__io__generic__copy( getData(), data);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * array length, also (this is important!) string length + 1.
	 * 	          			the idea is to be able to reuse array realloc functions on strings.<h4>Blender Source Code:</h4>
	 * <p> array length, also (this is important!) string length + 1. the idea is to be able to reuse array realloc functions on strings. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * array length, also (this is important!) string length + 1.
	 * 	          			the idea is to be able to reuse array realloc functions on strings.<h4>Blender Source Code:</h4>
	 * <p> array length, also (this is important!) string length + 1. the idea is to be able to reuse array realloc functions on strings. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, len);
		} else {
			__io__block.writeInt(__io__address + 100, len);
		}
	}

	/**
	 * Get method for struct member 'totallen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * totallen is total length of allocated array/string, including a buffer.
	 * 	 							Note that the buffering is mild; the code comes from python's list 
	 * 	 							implementation. Strings and arrays are both buffered, though the buffer
	 * 								isn't saved.<h4>Blender Source Code:</h4>
	 * <p> Strings and arrays are both buffered, though the buffer isn't saved. totallen is total length of allocated array/string, including a buffer. Note that the buffering is mild; the code comes from python's list implementation. </p>
	 * @see #__DNA__FIELD__totallen
	 */
	
	public int getTotallen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'totallen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * totallen is total length of allocated array/string, including a buffer.
	 * 	 							Note that the buffering is mild; the code comes from python's list 
	 * 	 							implementation. Strings and arrays are both buffered, though the buffer
	 * 								isn't saved.<h4>Blender Source Code:</h4>
	 * <p> Strings and arrays are both buffered, though the buffer isn't saved. totallen is total length of allocated array/string, including a buffer. Note that the buffering is mild; the code comes from python's list implementation. </p>
	 * @see #__DNA__FIELD__totallen
	 */
	
	public void setTotallen(int totallen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, totallen);
		} else {
			__io__block.writeInt(__io__address + 104, totallen);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDProperty> __io__addressof() {
		return new CPointer<IDProperty>(__io__address, new Class[]{IDProperty.class}, __io__block, __io__blockTable);
	}

}
