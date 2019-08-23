package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeInstanceHashEntry'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Base}  struct for entries in node instance hash. WARNING: pointers are cast to this struct internally, it must be first member in hash entry structs! </p>
 */

@CMetaData(size32=8, size64=8)
public class bNodeInstanceHashEntry extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeInstanceHashEntry.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeInstanceHashEntry.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 394;

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeInstanceHashEntry bnodeinstancehashentry = ...;
	 * CPointer&lt;Object&gt; p = bnodeinstancehashentry.__dna__addressof(bNodeInstanceHashEntry.__DNA__FIELD__key);
	 * CPointer&lt;bNodeInstanceKey&gt; p_key = p.cast(new Class[]{bNodeInstanceKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'bNodeInstanceKey'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tags for cleaning the cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeInstanceHashEntry bnodeinstancehashentry = ...;
	 * CPointer&lt;Object&gt; p = bnodeinstancehashentry.__dna__addressof(bNodeInstanceHashEntry.__DNA__FIELD__tag);
	 * CPointer&lt;Short&gt; p_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeInstanceHashEntry bnodeinstancehashentry = ...;
	 * CPointer&lt;Object&gt; p = bnodeinstancehashentry.__dna__addressof(bNodeInstanceHashEntry.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{6, 6};

	public bNodeInstanceHashEntry(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeInstanceHashEntry(bNodeInstanceHashEntry that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public bNodeInstanceKey getKey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bNodeInstanceKey(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new bNodeInstanceKey(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(bNodeInstanceKey key) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(key, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, key)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, key);
		} else {
			__io__generic__copy( getKey(), key);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tags for cleaning the cache </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public short getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tags for cleaning the cache </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(short tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, tag);
		} else {
			__io__block.writeShort(__io__address + 4, tag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, pad);
		} else {
			__io__block.writeShort(__io__address + 6, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeInstanceHashEntry> __io__addressof() {
		return new CPointer<bNodeInstanceHashEntry>(__io__address, new Class[]{bNodeInstanceHashEntry.class}, __io__block, __io__blockTable);
	}

}
