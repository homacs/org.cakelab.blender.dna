package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bMessageSensor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=132, size64=136)
public class bMessageSensor extends CFacade {

	/**
	 * This is the sdna index of the struct bMessageSensor.
	 * <p>
	 * It is required when allocating a new block to store data for bMessageSensor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 310;

	/**
	 * Field descriptor (offset) for struct member 'fromObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single sender object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageSensor bmessagesensor = ...;
	 * CPointer&lt;Object&gt; p = bmessagesensor.__dna__addressof(bMessageSensor.__DNA__FIELD__fromObject);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_fromObject = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fromObject'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fromObject = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be used to filter on subjects like this </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageSensor bmessagesensor = ...;
	 * CPointer&lt;Object&gt; p = bmessagesensor.__dna__addressof(bMessageSensor.__DNA__FIELD__subject);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subject = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subject'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subject = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) body to filter on </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMessageSensor bmessagesensor = ...;
	 * CPointer&lt;Object&gt; p = bmessagesensor.__dna__addressof(bMessageSensor.__DNA__FIELD__body);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_body = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'body'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__body = new long[]{68, 72};

	public bMessageSensor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bMessageSensor(bMessageSensor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fromObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single sender object </p>
	 * @see #__DNA__FIELD__fromObject
	 */
	
	public CPointer<BlenderObject> getFromObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fromObject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) pointer to a single sender object </p>
	 * @see #__DNA__FIELD__fromObject
	 */
	
	public void setFromObject(CPointer<BlenderObject> fromObject) throws IOException
	{
		long __address = ((fromObject == null) ? 0 : fromObject.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be used to filter on subjects like this </p>
	 * @see #__DNA__FIELD__subject
	 */
	
	public CArrayFacade<Byte> getSubject() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subject'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Can be used to filter on subjects like this </p>
	 * @see #__DNA__FIELD__subject
	 */
	
	public void setSubject(CArrayFacade<Byte> subject) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
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
	 * Get method for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) body to filter on </p>
	 * @see #__DNA__FIELD__body
	 */
	
	public CArrayFacade<Byte> getBody() throws IOException
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
	 * Set method for struct member 'body'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (Possible future use) body to filter on </p>
	 * @see #__DNA__FIELD__body
	 */
	
	public void setBody(CArrayFacade<Byte> body) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 68;
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
	public CPointer<bMessageSensor> __io__addressof() {
		return new CPointer<bMessageSensor>(__io__address, new Class[]{bMessageSensor.class}, __io__block, __io__blockTable);
	}

}
