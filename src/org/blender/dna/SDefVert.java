package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SDefVert'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class SDefVert extends CFacade {

	/**
	 * This is the sdna index of the struct SDefVert.
	 * <p>
	 * It is required when allocating a new block to store data for SDefVert.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 158;

	/**
	 * Field descriptor (offset) for struct member 'binds'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefVert sdefvert = ...;
	 * CPointer&lt;Object&gt; p = sdefvert.__dna__addressof(SDefVert.__DNA__FIELD__binds);
	 * CPointer&lt;CPointer&lt;SDefBind&gt;&gt; p_binds = p.cast(new Class[]{CPointer.class, SDefBind.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'binds'</li>
	 * <li>Signature: 'SDefBind*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__binds = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'numbinds'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefVert sdefvert = ...;
	 * CPointer&lt;Object&gt; p = sdefvert.__dna__addressof(SDefVert.__DNA__FIELD__numbinds);
	 * CPointer&lt;Integer&gt; p_numbinds = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numbinds'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numbinds = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'vertex_idx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefVert sdefvert = ...;
	 * CPointer&lt;Object&gt; p = sdefvert.__dna__addressof(SDefVert.__DNA__FIELD__vertex_idx);
	 * CPointer&lt;Integer&gt; p_vertex_idx = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_idx'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_idx = new long[]{8, 12};

	public SDefVert(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SDefVert(SDefVert that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'binds'.
	 * @see #__DNA__FIELD__binds
	 */
	
	public CPointer<SDefBind> getBinds() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SDefBind.class};
		return new CPointer<SDefBind>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SDefBind.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'binds'.
	 * @see #__DNA__FIELD__binds
	 */
	
	public void setBinds(CPointer<SDefBind> binds) throws IOException
	{
		long __address = ((binds == null) ? 0 : binds.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'numbinds'.
	 * @see #__DNA__FIELD__numbinds
	 */
	
	public int getNumbinds() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'numbinds'.
	 * @see #__DNA__FIELD__numbinds
	 */
	
	public void setNumbinds(int numbinds) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, numbinds);
		} else {
			__io__block.writeInt(__io__address + 4, numbinds);
		}
	}

	/**
	 * Get method for struct member 'vertex_idx'.
	 * @see #__DNA__FIELD__vertex_idx
	 */
	
	public int getVertex_idx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'vertex_idx'.
	 * @see #__DNA__FIELD__vertex_idx
	 */
	
	public void setVertex_idx(int vertex_idx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, vertex_idx);
		} else {
			__io__block.writeInt(__io__address + 8, vertex_idx);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SDefVert> __io__addressof() {
		return new CPointer<SDefVert>(__io__address, new Class[]{SDefVert.class}, __io__block, __io__blockTable);
	}

}
