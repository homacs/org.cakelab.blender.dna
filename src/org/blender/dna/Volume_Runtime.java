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
 * Generated facet for DNA struct type 'Volume_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=204, size64=208)
public class Volume_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Volume_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Volume_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 786;

	/**
	 * Field descriptor (offset) for struct member 'grids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> OpenVDB Grids. </p>
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
	 * <p> Current frame in sequence for evaluated volume. </p>
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

	/**
	 * Field descriptor (offset) for struct member 'velocity_x_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Names for scalar grids which would need to be merged to recompose the velocity grid. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__velocity_x_grid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_velocity_x_grid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_x_grid'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_x_grid = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'velocity_y_grid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__velocity_y_grid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_velocity_y_grid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_y_grid'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_y_grid = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'velocity_z_grid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume_Runtime volume_runtime = ...;
	 * CPointer&lt;Object&gt; p = volume_runtime.__dna__addressof(Volume_Runtime.__DNA__FIELD__velocity_z_grid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_velocity_z_grid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_z_grid'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_z_grid = new long[]{140, 144};

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
	 * <p> OpenVDB Grids. </p>
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
	 * <p> OpenVDB Grids. </p>
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
	 * <p> Current frame in sequence for evaluated volume. </p>
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
	 * <p> Current frame in sequence for evaluated volume. </p>
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
	 * Get method for struct member 'velocity_x_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Names for scalar grids which would need to be merged to recompose the velocity grid. </p>
	 * @see #__DNA__FIELD__velocity_x_grid
	 */
	
	public CArrayFacade<Byte> getVelocity_x_grid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'velocity_x_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Names for scalar grids which would need to be merged to recompose the velocity grid. </p>
	 * @see #__DNA__FIELD__velocity_x_grid
	 */
	
	public void setVelocity_x_grid(CArrayFacade<Byte> velocity_x_grid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(velocity_x_grid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, velocity_x_grid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, velocity_x_grid);
		} else {
			__io__generic__copy( getVelocity_x_grid(), velocity_x_grid);
		}
	}

	/**
	 * Get method for struct member 'velocity_y_grid'.
	 * @see #__DNA__FIELD__velocity_y_grid
	 */
	
	public CArrayFacade<Byte> getVelocity_y_grid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'velocity_y_grid'.
	 * @see #__DNA__FIELD__velocity_y_grid
	 */
	
	public void setVelocity_y_grid(CArrayFacade<Byte> velocity_y_grid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(velocity_y_grid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, velocity_y_grid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, velocity_y_grid);
		} else {
			__io__generic__copy( getVelocity_y_grid(), velocity_y_grid);
		}
	}

	/**
	 * Get method for struct member 'velocity_z_grid'.
	 * @see #__DNA__FIELD__velocity_z_grid
	 */
	
	public CArrayFacade<Byte> getVelocity_z_grid() throws IOException
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
	 * Set method for struct member 'velocity_z_grid'.
	 * @see #__DNA__FIELD__velocity_z_grid
	 */
	
	public void setVelocity_z_grid(CArrayFacade<Byte> velocity_z_grid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(velocity_z_grid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, velocity_z_grid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, velocity_z_grid);
		} else {
			__io__generic__copy( getVelocity_z_grid(), velocity_z_grid);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Volume_Runtime> __io__addressof() {
		return new CPointer<Volume_Runtime>(__io__address, new Class[]{Volume_Runtime.class}, __io__block, __io__blockTable);
	}

}
