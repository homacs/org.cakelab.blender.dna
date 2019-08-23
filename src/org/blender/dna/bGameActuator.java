package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGameActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=140, size64=140)
public class bGameActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bGameActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bGameActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 326;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'sta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__sta);
	 * CPointer&lt;Integer&gt; p_sta = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sta'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sta = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__end);
	 * CPointer&lt;Integer&gt; p_end = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'filename'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__filename);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filename = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filename'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filename = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'loadaniname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGameActuator bgameactuator = ...;
	 * CPointer&lt;Object&gt; p = bgameactuator.__dna__addressof(bGameActuator.__DNA__FIELD__loadaniname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_loadaniname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loadaniname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loadaniname = new long[]{76, 76};

	public bGameActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGameActuator(bGameActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, type);
		} else {
			__io__block.writeShort(__io__address + 2, type);
		}
	}

	/**
	 * Get method for struct member 'sta'.
	 * @see #__DNA__FIELD__sta
	 */
	
	public int getSta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'sta'.
	 * @see #__DNA__FIELD__sta
	 */
	
	public void setSta(int sta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, sta);
		} else {
			__io__block.writeInt(__io__address + 4, sta);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public int getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(int end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, end);
		} else {
			__io__block.writeInt(__io__address + 8, end);
		}
	}

	/**
	 * Get method for struct member 'filename'.
	 * @see #__DNA__FIELD__filename
	 */
	
	public CArrayFacade<Byte> getFilename() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filename'.
	 * @see #__DNA__FIELD__filename
	 */
	
	public void setFilename(CArrayFacade<Byte> filename) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(filename, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filename)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filename);
		} else {
			__io__generic__copy( getFilename(), filename);
		}
	}

	/**
	 * Get method for struct member 'loadaniname'.
	 * @see #__DNA__FIELD__loadaniname
	 */
	
	public CArrayFacade<Byte> getLoadaniname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loadaniname'.
	 * @see #__DNA__FIELD__loadaniname
	 */
	
	public void setLoadaniname(CArrayFacade<Byte> loadaniname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(loadaniname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loadaniname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loadaniname);
		} else {
			__io__generic__copy( getLoadaniname(), loadaniname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGameActuator> __io__addressof() {
		return new CPointer<bGameActuator>(__io__address, new Class[]{bGameActuator.class}, __io__block, __io__blockTable);
	}

}
