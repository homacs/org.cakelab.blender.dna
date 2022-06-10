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
 * Generated facet for DNA struct type 'bUUID'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Universally Unique Identifier according to RFC4122. </p><p><code></code> , because Windows already defines that type. </p>
 */

@CMetaData(size32=16, size64=16)
public class bUUID extends CFacade {

	/**
	 * This is the sdna index of the struct bUUID.
	 * <p>
	 * It is required when allocating a new block to store data for bUUID.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 795;

	/**
	 * Field descriptor (offset) for struct member 'time_low'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__time_low);
	 * CPointer&lt;Integer&gt; p_time_low = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_low'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_low = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'time_mid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__time_mid);
	 * CPointer&lt;Short&gt; p_time_mid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_mid'</li>
	 * <li>Signature: 'ushort'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_mid = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'time_hi_and_version'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__time_hi_and_version);
	 * CPointer&lt;Short&gt; p_time_hi_and_version = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_hi_and_version'</li>
	 * <li>Signature: 'ushort'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_hi_and_version = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'clock_seq_hi_and_reserved'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__clock_seq_hi_and_reserved);
	 * CPointer&lt;Byte&gt; p_clock_seq_hi_and_reserved = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clock_seq_hi_and_reserved'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clock_seq_hi_and_reserved = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'clock_seq_low'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__clock_seq_low);
	 * CPointer&lt;Byte&gt; p_clock_seq_low = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clock_seq_low'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clock_seq_low = new long[]{9, 9};

	/**
	 * Field descriptor (offset) for struct member 'node'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUUID buuid = ...;
	 * CPointer&lt;Object&gt; p = buuid.__dna__addressof(bUUID.__DNA__FIELD__node);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_node = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'node'</li>
	 * <li>Signature: 'uchar[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__node = new long[]{10, 10};

	public bUUID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bUUID(bUUID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'time_low'.
	 * @see #__DNA__FIELD__time_low
	 */
	
	public int getTime_low() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'time_low'.
	 * @see #__DNA__FIELD__time_low
	 */
	
	public void setTime_low(int time_low) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, time_low);
		} else {
			__io__block.writeInt(__io__address + 0, time_low);
		}
	}

	/**
	 * Get method for struct member 'time_mid'.
	 * @see #__DNA__FIELD__time_mid
	 */
	
	public short getTime_mid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'time_mid'.
	 * @see #__DNA__FIELD__time_mid
	 */
	
	public void setTime_mid(short time_mid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, time_mid);
		} else {
			__io__block.writeShort(__io__address + 4, time_mid);
		}
	}

	/**
	 * Get method for struct member 'time_hi_and_version'.
	 * @see #__DNA__FIELD__time_hi_and_version
	 */
	
	public short getTime_hi_and_version() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'time_hi_and_version'.
	 * @see #__DNA__FIELD__time_hi_and_version
	 */
	
	public void setTime_hi_and_version(short time_hi_and_version) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, time_hi_and_version);
		} else {
			__io__block.writeShort(__io__address + 6, time_hi_and_version);
		}
	}

	/**
	 * Get method for struct member 'clock_seq_hi_and_reserved'.
	 * @see #__DNA__FIELD__clock_seq_hi_and_reserved
	 */
	
	public byte getClock_seq_hi_and_reserved() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'clock_seq_hi_and_reserved'.
	 * @see #__DNA__FIELD__clock_seq_hi_and_reserved
	 */
	
	public void setClock_seq_hi_and_reserved(byte clock_seq_hi_and_reserved) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, clock_seq_hi_and_reserved);
		} else {
			__io__block.writeByte(__io__address + 8, clock_seq_hi_and_reserved);
		}
	}

	/**
	 * Get method for struct member 'clock_seq_low'.
	 * @see #__DNA__FIELD__clock_seq_low
	 */
	
	public byte getClock_seq_low() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'clock_seq_low'.
	 * @see #__DNA__FIELD__clock_seq_low
	 */
	
	public void setClock_seq_low(byte clock_seq_low) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, clock_seq_low);
		} else {
			__io__block.writeByte(__io__address + 9, clock_seq_low);
		}
	}

	/**
	 * Get method for struct member 'node'.
	 * @see #__DNA__FIELD__node
	 */
	
	public CArrayFacade<Byte> getNode() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'node'.
	 * @see #__DNA__FIELD__node
	 */
	
	public void setNode(CArrayFacade<Byte> node) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
		}
		if (__io__equals(node, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, node)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, node);
		} else {
			__io__generic__copy( getNode(), node);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bUUID> __io__addressof() {
		return new CPointer<bUUID>(__io__address, new Class[]{bUUID.class}, __io__block, __io__blockTable);
	}

}
