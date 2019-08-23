package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodePreview'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=24)
public class bNodePreview extends CFacade {

	/**
	 * This is the sdna index of the struct bNodePreview.
	 * <p>
	 * It is required when allocating a new block to store data for bNodePreview.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 391;

	/**
	 * Field descriptor (offset) for struct member 'hash_entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> must be first </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodePreview bnodepreview = ...;
	 * CPointer&lt;Object&gt; p = bnodepreview.__dna__addressof(bNodePreview.__DNA__FIELD__hash_entry);
	 * CPointer&lt;bNodeInstanceHashEntry&gt; p_hash_entry = p.cast(new Class[]{bNodeInstanceHashEntry.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hash_entry'</li>
	 * <li>Signature: 'bNodeInstanceHashEntry'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hash_entry = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'rect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodePreview bnodepreview = ...;
	 * CPointer&lt;Object&gt; p = bnodepreview.__dna__addressof(bNodePreview.__DNA__FIELD__rect);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_rect = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rect'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rect = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'xsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodePreview bnodepreview = ...;
	 * CPointer&lt;Object&gt; p = bnodepreview.__dna__addressof(bNodePreview.__DNA__FIELD__xsize);
	 * CPointer&lt;Short&gt; p_xsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xsize = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'ysize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodePreview bnodepreview = ...;
	 * CPointer&lt;Object&gt; p = bnodepreview.__dna__addressof(bNodePreview.__DNA__FIELD__ysize);
	 * CPointer&lt;Short&gt; p_ysize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ysize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ysize = new long[]{14, 18};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodePreview bnodepreview = ...;
	 * CPointer&lt;Object&gt; p = bnodepreview.__dna__addressof(bNodePreview.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{16, 20};

	public bNodePreview(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodePreview(bNodePreview that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'hash_entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> must be first </p>
	 * @see #__DNA__FIELD__hash_entry
	 */
	
	public bNodeInstanceHashEntry getHash_entry() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bNodeInstanceHashEntry(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new bNodeInstanceHashEntry(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hash_entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> must be first </p>
	 * @see #__DNA__FIELD__hash_entry
	 */
	
	public void setHash_entry(bNodeInstanceHashEntry hash_entry) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(hash_entry, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hash_entry)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hash_entry);
		} else {
			__io__generic__copy( getHash_entry(), hash_entry);
		}
	}

	/**
	 * Get method for struct member 'rect'.
	 * @see #__DNA__FIELD__rect
	 */
	
	public CPointer<Byte> getRect() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rect'.
	 * @see #__DNA__FIELD__rect
	 */
	
	public void setRect(CPointer<Byte> rect) throws IOException
	{
		long __address = ((rect == null) ? 0 : rect.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'xsize'.
	 * @see #__DNA__FIELD__xsize
	 */
	
	public short getXsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'xsize'.
	 * @see #__DNA__FIELD__xsize
	 */
	
	public void setXsize(short xsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, xsize);
		} else {
			__io__block.writeShort(__io__address + 12, xsize);
		}
	}

	/**
	 * Get method for struct member 'ysize'.
	 * @see #__DNA__FIELD__ysize
	 */
	
	public short getYsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'ysize'.
	 * @see #__DNA__FIELD__ysize
	 */
	
	public void setYsize(short ysize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, ysize);
		} else {
			__io__block.writeShort(__io__address + 14, ysize);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, pad);
		} else {
			__io__block.writeInt(__io__address + 16, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodePreview> __io__addressof() {
		return new CPointer<bNodePreview>(__io__address, new Class[]{bNodePreview.class}, __io__block, __io__blockTable);
	}

}
