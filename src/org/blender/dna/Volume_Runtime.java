package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Volume_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class Volume_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Volume_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Volume_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 728;

	/**
	 * Field descriptor (offset) for struct member 'grids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> OpenVDB Grids </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__grids);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_grids = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grids'</li>
	 * <li>Signature: 'VolumeGridVector*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grids = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current frame in sequence for evaluated volume </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__frame);
	 * CPointer&lt;Integer&gt; p_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'default_simplify_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default simplify level for volume grids loaded from files. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__default_simplify_level);
	 * CPointer&lt;Integer&gt; p_default_simplify_level = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_simplify_level'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_simplify_level = new long[]{8, 12};

	public Volume_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Volume_Runtime(Volume_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'grids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> OpenVDB Grids </p>
	 * @see #__DNA__FIELD__grids
	 */
	
	public CPointer<Object> getGrids() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'grids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> OpenVDB Grids </p>
	 * @see #__DNA__FIELD__grids
	 */
	
	public void setGrids(CPointer<Object> grids) throws IOException
	{
		long __address = ((grids == null) ? 0 : grids.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current frame in sequence for evaluated volume </p>
	 * @see #__DNA__FIELD__frame
	 */
	
	public int getFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current frame in sequence for evaluated volume </p>
	 * @see #__DNA__FIELD__frame
	 */
	
	public void setFrame(int frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, frame);
		} else {
			__io__block.writeInt(__io__address + 4, frame);
		}
	}

	/**
	 * Get method for struct member 'default_simplify_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default simplify level for volume grids loaded from files. </p>
	 * @see #__DNA__FIELD__default_simplify_level
	 */
	
	public int getDefault_simplify_level() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'default_simplify_level'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default simplify level for volume grids loaded from files. </p>
	 * @see #__DNA__FIELD__default_simplify_level
	 */
	
	public void setDefault_simplify_level(int default_simplify_level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, default_simplify_level);
		} else {
			__io__block.writeInt(__io__address + 8, default_simplify_level);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Volume_Runtime> __io__addressof() {
		return new CPointer<Volume_Runtime>(__io__address, new Class[]{Volume_Runtime.class}, __io__block, __io__blockTable);
	}

}
