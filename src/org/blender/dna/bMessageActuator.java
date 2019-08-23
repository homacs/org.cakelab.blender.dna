package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bMessageActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=204, size64=208)
public class bMessageActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bMessageActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bMessageActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 325;

	/**
	 * Field descriptor (offset) for struct member 'toPropName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Send to all objects with this propertyname. Empty to broadcast. MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__toPropName);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_toPropName = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toPropName'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toPropName = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'toObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single destination object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__toObject);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_toObject = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toObject'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toObject = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Message Subject to send. MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__subject);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subject = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subject'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subject = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'bodyType'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__bodyType);
	 * CPointer&lt;Short&gt; p_bodyType = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bodyType'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bodyType = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bodyType is either 'User defined text' or PropName </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__pad1);
	 * CPointer&lt;Short&gt; p_pad1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{134, 138};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either User Defined {@link Text}  or our PropName to send value of, MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageActuator bmessageactuator = ...;
	 * CPointer&lt;Object&gt; p = bmessageactuator.__dna__addressof(bMessageActuator.__DNA__FIELD__body);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_body = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'body'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__body = new long[]{140, 144};

	public bMessageActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bMessageActuator(bMessageActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'toPropName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Send to all objects with this propertyname. Empty to broadcast. MAX_NAME. </p>
	 * @see #__DNA__FIELD__toPropName
	 */
	
	public CArrayFacade<Byte> getToPropName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'toPropName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Send to all objects with this propertyname. Empty to broadcast. MAX_NAME. </p>
	 * @see #__DNA__FIELD__toPropName
	 */
	
	public void setToPropName(CArrayFacade<Byte> toPropName) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(toPropName, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, toPropName)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, toPropName);
		} else {
			__io__generic__copy( getToPropName(), toPropName);
		}
	}

	/**
	 * Get method for struct member 'toObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single destination object. </p>
	 * @see #__DNA__FIELD__toObject
	 */
	
	public CPointer<BlenderObject> getToObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'toObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single destination object. </p>
	 * @see #__DNA__FIELD__toObject
	 */
	
	public void setToObject(CPointer<BlenderObject> toObject) throws IOException
	{
		long __address = ((toObject == null) ? 0 : toObject.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Message Subject to send. MAX_NAME. </p>
	 * @see #__DNA__FIELD__subject
	 */
	
	public CArrayFacade<Byte> getSubject() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Message Subject to send. MAX_NAME. </p>
	 * @see #__DNA__FIELD__subject
	 */
	
	public void setSubject(CArrayFacade<Byte> subject) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(subject, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subject)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subject);
		} else {
			__io__generic__copy( getSubject(), subject);
		}
	}

	/**
	 * Get method for struct member 'bodyType'.
	 * @see #__DNA__FIELD__bodyType
	 */
	
	public short getBodyType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'bodyType'.
	 * @see #__DNA__FIELD__bodyType
	 */
	
	public void setBodyType(short bodyType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, bodyType);
		} else {
			__io__block.writeShort(__io__address + 132, bodyType);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bodyType is either 'User defined text' or PropName </p>
	 * @see #__DNA__FIELD__pad1
	 */
	
	public short getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bodyType is either 'User defined text' or PropName </p>
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(short pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 138, pad1);
		} else {
			__io__block.writeShort(__io__address + 134, pad1);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, pad2);
		} else {
			__io__block.writeInt(__io__address + 136, pad2);
		}
	}

	/**
	 * Get method for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either User Defined {@link Text}  or our PropName to send value of, MAX_NAME </p>
	 * @see #__DNA__FIELD__body
	 */
	
	public CArrayFacade<Byte> getBody() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either User Defined {@link Text}  or our PropName to send value of, MAX_NAME </p>
	 * @see #__DNA__FIELD__body
	 */
	
	public void setBody(CArrayFacade<Byte> body) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(body, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, body)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, body);
		} else {
			__io__generic__copy( getBody(), body);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bMessageActuator> __io__addressof() {
		return new CPointer<bMessageActuator>(__io__address, new Class[]{bMessageActuator.class}, __io__block, __io__blockTable);
	}

}
