package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VoxelData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1080, size64=1088)
public class VoxelData extends CFacade {

	/**
	 * This is the sdna index of the struct VoxelData.
	 * <p>
	 * It is required when allocating a new block to store data for VoxelData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 37;

	/**
	 * Field descriptor (offset) for struct member 'resol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__resol);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_resol = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resol'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resol = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'interp_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__interp_type);
	 * CPointer&lt;Integer&gt; p_interp_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp_type = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Format of the source data set to render
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__file_format);
	 * CPointer&lt;Short&gt; p_file_format = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'file_format'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__file_format = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'extend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__extend);
	 * CPointer&lt;Short&gt; p_extend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extend = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'smoked_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__smoked_type);
	 * CPointer&lt;Short&gt; p_smoked_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smoked_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smoked_type = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'hair_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__hair_type);
	 * CPointer&lt;Short&gt; p_hair_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_type = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__data_type);
	 * CPointer&lt;Short&gt; p_data_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD___pad);
	 * CPointer&lt;Integer&gt; p__pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for rendering smoke sims </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'int_multiplier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__int_multiplier);
	 * CPointer&lt;Float&gt; p_int_multiplier = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'int_multiplier'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__int_multiplier = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'still_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The frame number to always use
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__still_frame);
	 * CPointer&lt;Integer&gt; p_still_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'still_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__still_frame = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'source_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__source_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_source_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source_path = new long[]{44, 48};

	/**
	 * Field descriptor (offset) for struct member 'dataset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__dataset);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_dataset = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dataset'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dataset = new long[]{1068, 1072};

	/**
	 * Field descriptor (offset) for struct member 'cachedframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__cachedframe);
	 * CPointer&lt;Integer&gt; p_cachedframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cachedframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cachedframe = new long[]{1072, 1080};

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VoxelData voxeldata = ...;
	 * CPointer&lt;Object&gt; p = voxeldata.__dna__addressof(VoxelData.__DNA__FIELD__ok);
	 * CPointer&lt;Integer&gt; p_ok = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{1076, 1084};

	public VoxelData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VoxelData(VoxelData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'resol'.
	 * @see #__DNA__FIELD__resol
	 */
	
	public CArrayFacade<Integer> getResol() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'resol'.
	 * @see #__DNA__FIELD__resol
	 */
	
	public void setResol(CArrayFacade<Integer> resol) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(resol, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, resol)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, resol);
		} else {
			__io__generic__copy( getResol(), resol);
		}
	}

	/**
	 * Get method for struct member 'interp_type'.
	 * @see #__DNA__FIELD__interp_type
	 */
	
	public int getInterp_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'interp_type'.
	 * @see #__DNA__FIELD__interp_type
	 */
	
	public void setInterp_type(int interp_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, interp_type);
		} else {
			__io__block.writeInt(__io__address + 12, interp_type);
		}
	}

	/**
	 * Get method for struct member 'file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Format of the source data set to render
	 * @see #__DNA__FIELD__file_format
	 */
	
	public short getFile_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Format of the source data set to render
	 * @see #__DNA__FIELD__file_format
	 */
	
	public void setFile_format(short file_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, file_format);
		} else {
			__io__block.writeShort(__io__address + 16, file_format);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, flag);
		} else {
			__io__block.writeShort(__io__address + 18, flag);
		}
	}

	/**
	 * Get method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public short getExtend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public void setExtend(short extend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, extend);
		} else {
			__io__block.writeShort(__io__address + 20, extend);
		}
	}

	/**
	 * Get method for struct member 'smoked_type'.
	 * @see #__DNA__FIELD__smoked_type
	 */
	
	public short getSmoked_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'smoked_type'.
	 * @see #__DNA__FIELD__smoked_type
	 */
	
	public void setSmoked_type(short smoked_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, smoked_type);
		} else {
			__io__block.writeShort(__io__address + 22, smoked_type);
		}
	}

	/**
	 * Get method for struct member 'hair_type'.
	 * @see #__DNA__FIELD__hair_type
	 */
	
	public short getHair_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'hair_type'.
	 * @see #__DNA__FIELD__hair_type
	 */
	
	public void setHair_type(short hair_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, hair_type);
		} else {
			__io__block.writeShort(__io__address + 24, hair_type);
		}
	}

	/**
	 * Get method for struct member 'data_type'.
	 * @see #__DNA__FIELD__data_type
	 */
	
	public short getData_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'data_type'.
	 * @see #__DNA__FIELD__data_type
	 */
	
	public void setData_type(short data_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, data_type);
		} else {
			__io__block.writeShort(__io__address + 26, data_type);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public int get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(int _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, _pad);
		} else {
			__io__block.writeInt(__io__address + 28, _pad);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for rendering smoke sims </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for rendering smoke sims </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'int_multiplier'.
	 * @see #__DNA__FIELD__int_multiplier
	 */
	
	public float getInt_multiplier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'int_multiplier'.
	 * @see #__DNA__FIELD__int_multiplier
	 */
	
	public void setInt_multiplier(float int_multiplier) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, int_multiplier);
		} else {
			__io__block.writeFloat(__io__address + 36, int_multiplier);
		}
	}

	/**
	 * Get method for struct member 'still_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The frame number to always use
	 * @see #__DNA__FIELD__still_frame
	 */
	
	public int getStill_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'still_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The frame number to always use
	 * @see #__DNA__FIELD__still_frame
	 */
	
	public void setStill_frame(int still_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, still_frame);
		} else {
			__io__block.writeInt(__io__address + 40, still_frame);
		}
	}

	/**
	 * Get method for struct member 'source_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__source_path
	 */
	
	public CArrayFacade<Byte> getSource_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'source_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__source_path
	 */
	
	public void setSource_path(CArrayFacade<Byte> source_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(source_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, source_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, source_path);
		} else {
			__io__generic__copy( getSource_path(), source_path);
		}
	}

	/**
	 * Get method for struct member 'dataset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary data </p>
	 * @see #__DNA__FIELD__dataset
	 */
	
	public CPointer<Float> getDataset() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1072);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1068);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dataset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary data </p>
	 * @see #__DNA__FIELD__dataset
	 */
	
	public void setDataset(CPointer<Float> dataset) throws IOException
	{
		long __address = ((dataset == null) ? 0 : dataset.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1072, __address);
		} else {
			__io__block.writeLong(__io__address + 1068, __address);
		}
	}

	/**
	 * Get method for struct member 'cachedframe'.
	 * @see #__DNA__FIELD__cachedframe
	 */
	
	public int getCachedframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1080);
		} else {
			return __io__block.readInt(__io__address + 1072);
		}
	}

	/**
	 * Set method for struct member 'cachedframe'.
	 * @see #__DNA__FIELD__cachedframe
	 */
	
	public void setCachedframe(int cachedframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1080, cachedframe);
		} else {
			__io__block.writeInt(__io__address + 1072, cachedframe);
		}
	}

	/**
	 * Get method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public int getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1084);
		} else {
			return __io__block.readInt(__io__address + 1076);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(int ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1084, ok);
		} else {
			__io__block.writeInt(__io__address + 1076, ok);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<VoxelData> __io__addressof() {
		return new CPointer<VoxelData>(__io__address, new Class[]{VoxelData.class}, __io__block, __io__blockTable);
	}

}
