package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MDeformVert'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class MDeformVert extends CFacade {

	/**
	 * This is the sdna index of the struct MDeformVert.
	 * <p>
	 * It is required when allocating a new block to store data for MDeformVert.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 62;

	/**
	 * Field descriptor (offset) for struct member 'dw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDeformVert mdeformvert = ...;
	 * CPointer&lt;Object&gt; p = mdeformvert.__dna__addressof(MDeformVert.__DNA__FIELD__dw);
	 * CPointer&lt;CPointer&lt;MDeformWeight&gt;&gt; p_dw = p.cast(new Class[]{CPointer.class, MDeformWeight.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dw'</li>
	 * <li>Signature: 'MDeformWeight*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dw = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totweight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDeformVert mdeformvert = ...;
	 * CPointer&lt;Object&gt; p = mdeformvert.__dna__addressof(MDeformVert.__DNA__FIELD__totweight);
	 * CPointer&lt;Integer&gt; p_totweight = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totweight'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totweight = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag only in use for weightpaint now </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDeformVert mdeformvert = ...;
	 * CPointer&lt;Object&gt; p = mdeformvert.__dna__addressof(MDeformVert.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 12};

	public MDeformVert(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MDeformVert(MDeformVert that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'dw'.
	 * @see #__DNA__FIELD__dw
	 */
	
	public CPointer<MDeformWeight> getDw() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformWeight.class};
		return new CPointer<MDeformWeight>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformWeight.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dw'.
	 * @see #__DNA__FIELD__dw
	 */
	
	public void setDw(CPointer<MDeformWeight> dw) throws IOException
	{
		long __address = ((dw == null) ? 0 : dw.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'totweight'.
	 * @see #__DNA__FIELD__totweight
	 */
	
	public int getTotweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totweight'.
	 * @see #__DNA__FIELD__totweight
	 */
	
	public void setTotweight(int totweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, totweight);
		} else {
			__io__block.writeInt(__io__address + 4, totweight);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag only in use for weightpaint now </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag only in use for weightpaint now </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MDeformVert> __io__addressof() {
		return new CPointer<MDeformVert>(__io__address, new Class[]{MDeformVert.class}, __io__block, __io__blockTable);
	}

}
