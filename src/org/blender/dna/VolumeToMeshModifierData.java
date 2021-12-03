package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VolumeToMeshModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=208, size64=240)
public class VolumeToMeshModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct VolumeToMeshModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for VolumeToMeshModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 157;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 112/136</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the volume object that is supposed to be converted to a mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__threshold);
	 * CPointer&lt;Float&gt; p_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'adaptivity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__adaptivity);
	 * CPointer&lt;Float&gt; p_adaptivity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adaptivity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adaptivity = new long[]{120, 148};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__resolution_mode);
	 * CPointer&lt;Integer&gt; p_resolution_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolution_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolution_mode = new long[]{128, 156};

	/**
	 * Field descriptor (offset) for struct member 'voxel_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__voxel_size);
	 * CPointer&lt;Float&gt; p_voxel_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'voxel_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__voxel_size = new long[]{132, 160};

	/**
	 * Field descriptor (offset) for struct member 'voxel_amount'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__voxel_amount);
	 * CPointer&lt;Integer&gt; p_voxel_amount = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'voxel_amount'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__voxel_amount = new long[]{136, 164};

	/**
	 * Field descriptor (offset) for struct member 'grid_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD__grid_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_grid_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_name = new long[]{140, 168};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeToMeshModifierData volumetomeshmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumetomeshmodifierdata.__dna__addressof(VolumeToMeshModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{204, 232};

	public VolumeToMeshModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VolumeToMeshModifierData(VolumeToMeshModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the volume object that is supposed to be converted to a mesh. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the volume object that is supposed to be converted to a mesh. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public float getThreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(float threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, threshold);
		} else {
			__io__block.writeFloat(__io__address + 116, threshold);
		}
	}

	/**
	 * Get method for struct member 'adaptivity'.
	 * @see #__DNA__FIELD__adaptivity
	 */
	
	public float getAdaptivity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'adaptivity'.
	 * @see #__DNA__FIELD__adaptivity
	 */
	
	public void setAdaptivity(float adaptivity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, adaptivity);
		} else {
			__io__block.writeFloat(__io__address + 120, adaptivity);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshFlag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshFlag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, flag);
		} else {
			__io__block.writeInt(__io__address + 124, flag);
		}
	}

	/**
	 * Get method for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * @see #__DNA__FIELD__resolution_mode
	 */
	
	public int getResolution_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * @see #__DNA__FIELD__resolution_mode
	 */
	
	public void setResolution_mode(int resolution_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, resolution_mode);
		} else {
			__io__block.writeInt(__io__address + 128, resolution_mode);
		}
	}

	/**
	 * Get method for struct member 'voxel_size'.
	 * @see #__DNA__FIELD__voxel_size
	 */
	
	public float getVoxel_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'voxel_size'.
	 * @see #__DNA__FIELD__voxel_size
	 */
	
	public void setVoxel_size(float voxel_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, voxel_size);
		} else {
			__io__block.writeFloat(__io__address + 132, voxel_size);
		}
	}

	/**
	 * Get method for struct member 'voxel_amount'.
	 * @see #__DNA__FIELD__voxel_amount
	 */
	
	public int getVoxel_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'voxel_amount'.
	 * @see #__DNA__FIELD__voxel_amount
	 */
	
	public void setVoxel_amount(int voxel_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, voxel_amount);
		} else {
			__io__block.writeInt(__io__address + 136, voxel_amount);
		}
	}

	/**
	 * Get method for struct member 'grid_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__grid_name
	 */
	
	public CArrayFacade<Byte> getGrid_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grid_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__grid_name
	 */
	
	public void setGrid_name(CArrayFacade<Byte> grid_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(grid_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grid_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grid_name);
		} else {
			__io__generic__copy( getGrid_name(), grid_name);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<VolumeToMeshModifierData> __io__addressof() {
		return new CPointer<VolumeToMeshModifierData>(__io__address, new Class[]{VolumeToMeshModifierData.class}, __io__block, __io__blockTable);
	}

}
