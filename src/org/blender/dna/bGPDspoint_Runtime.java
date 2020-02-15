package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDspoint_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class bGPDspoint_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDspoint_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDspoint_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 469;

	/**
	 * Field descriptor (offset) for struct member 'pt_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original point (used to dereference evaluated data) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint_Runtime bgpdspoint_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint_runtime.__dna__addressof(bGPDspoint_Runtime.__DNA__FIELD__pt_orig);
	 * CPointer&lt;CPointer&lt;bGPDspoint&gt;&gt; p_pt_orig = p.cast(new Class[]{CPointer.class, bGPDspoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pt_orig'</li>
	 * <li>Signature: 'bGPDspoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pt_orig = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'idx_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original index array position </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint_Runtime bgpdspoint_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint_runtime.__dna__addressof(bGPDspoint_Runtime.__DNA__FIELD__idx_orig);
	 * CPointer&lt;Integer&gt; p_idx_orig = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idx_orig'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idx_orig = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint_Runtime bgpdspoint_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint_runtime.__dna__addressof(bGPDspoint_Runtime.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{8, 12};

	public bGPDspoint_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDspoint_Runtime(bGPDspoint_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pt_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original point (used to dereference evaluated data) </p>
	 * @see #__DNA__FIELD__pt_orig
	 */
	
	public CPointer<bGPDspoint> getPt_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDspoint.class};
		return new CPointer<bGPDspoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDspoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pt_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original point (used to dereference evaluated data) </p>
	 * @see #__DNA__FIELD__pt_orig
	 */
	
	public void setPt_orig(CPointer<bGPDspoint> pt_orig) throws IOException
	{
		long __address = ((pt_orig == null) ? 0 : pt_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'idx_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original index array position </p>
	 * @see #__DNA__FIELD__idx_orig
	 */
	
	public int getIdx_orig() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'idx_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original index array position </p>
	 * @see #__DNA__FIELD__idx_orig
	 */
	
	public void setIdx_orig(int idx_orig) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, idx_orig);
		} else {
			__io__block.writeInt(__io__address + 4, idx_orig);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDspoint_Runtime> __io__addressof() {
		return new CPointer<bGPDspoint_Runtime>(__io__address, new Class[]{bGPDspoint_Runtime.class}, __io__block, __io__blockTable);
	}

}
