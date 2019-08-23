package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DataTransferModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=244, size64=264)
public class DataTransferModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct DataTransferModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for DataTransferModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 142;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ob_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__ob_source);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob_source = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_source'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_source = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'data_types'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See DT_TYPE_ enum in ED_object.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__data_types);
	 * CPointer&lt;Integer&gt; p_data_types = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_types'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_types = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'vmap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See MREMAP_MODE_ enum in BKE_mesh_mapping.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__vmap_mode);
	 * CPointer&lt;Integer&gt; p_vmap_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vmap_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vmap_mode = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'emap_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__emap_mode);
	 * CPointer&lt;Integer&gt; p_emap_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emap_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emap_mode = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'lmap_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__lmap_mode);
	 * CPointer&lt;Integer&gt; p_lmap_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lmap_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lmap_mode = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'pmap_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__pmap_mode);
	 * CPointer&lt;Integer&gt; p_pmap_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmap_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmap_mode = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'map_max_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__map_max_distance);
	 * CPointer&lt;Float&gt; p_map_max_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'map_max_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__map_max_distance = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'map_ray_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__map_ray_radius);
	 * CPointer&lt;Float&gt; p_map_ray_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'map_ray_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__map_ray_radius = new long[]{124, 144};

	/**
	 * Field descriptor (offset) for struct member 'islands_precision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__islands_precision);
	 * CPointer&lt;Float&gt; p_islands_precision = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'islands_precision'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__islands_precision = new long[]{128, 148};

	/**
	 * Field descriptor (offset) for struct member 'pad_i1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__pad_i1);
	 * CPointer&lt;Integer&gt; p_pad_i1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_i1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_i1 = new long[]{132, 152};

	/**
	 * Field descriptor (offset) for struct member 'layers_select_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_FROMLAYERS_ enum in ED_object.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__layers_select_src);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_layers_select_src = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers_select_src'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers_select_src = new long[]{136, 156};

	/**
	 * Field descriptor (offset) for struct member 'layers_select_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_TOLAYERS_ enum in ED_object.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__layers_select_dst);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_layers_select_dst = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers_select_dst'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers_select_dst = new long[]{152, 172};

	/**
	 * Field descriptor (offset) for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See CDT_MIX_ enum in BKE_customdata.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__mix_mode);
	 * CPointer&lt;Integer&gt; p_mix_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_mode = new long[]{168, 188};

	/**
	 * Field descriptor (offset) for struct member 'mix_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__mix_factor);
	 * CPointer&lt;Float&gt; p_mix_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_factor = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{176, 196};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DataTransferModifierData datatransfermodifierdata = ...;
	 * CPointer&lt;Object&gt; p = datatransfermodifierdata.__dna__addressof(DataTransferModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{240, 260};

	public DataTransferModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DataTransferModifierData(DataTransferModifierData that) {
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
	 * Get method for struct member 'ob_source'.
	 * @see #__DNA__FIELD__ob_source
	 */
	
	public CPointer<BlenderObject> getOb_source() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob_source'.
	 * @see #__DNA__FIELD__ob_source
	 */
	
	public void setOb_source(CPointer<BlenderObject> ob_source) throws IOException
	{
		long __address = ((ob_source == null) ? 0 : ob_source.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'data_types'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See DT_TYPE_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__data_types
	 */
	
	public int getData_types() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'data_types'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See DT_TYPE_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__data_types
	 */
	
	public void setData_types(int data_types) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, data_types);
		} else {
			__io__block.writeInt(__io__address + 100, data_types);
		}
	}

	/**
	 * Get method for struct member 'vmap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See MREMAP_MODE_ enum in BKE_mesh_mapping.h </p>
	 * @see #__DNA__FIELD__vmap_mode
	 */
	
	public int getVmap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'vmap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See MREMAP_MODE_ enum in BKE_mesh_mapping.h </p>
	 * @see #__DNA__FIELD__vmap_mode
	 */
	
	public void setVmap_mode(int vmap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, vmap_mode);
		} else {
			__io__block.writeInt(__io__address + 104, vmap_mode);
		}
	}

	/**
	 * Get method for struct member 'emap_mode'.
	 * @see #__DNA__FIELD__emap_mode
	 */
	
	public int getEmap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'emap_mode'.
	 * @see #__DNA__FIELD__emap_mode
	 */
	
	public void setEmap_mode(int emap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, emap_mode);
		} else {
			__io__block.writeInt(__io__address + 108, emap_mode);
		}
	}

	/**
	 * Get method for struct member 'lmap_mode'.
	 * @see #__DNA__FIELD__lmap_mode
	 */
	
	public int getLmap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'lmap_mode'.
	 * @see #__DNA__FIELD__lmap_mode
	 */
	
	public void setLmap_mode(int lmap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, lmap_mode);
		} else {
			__io__block.writeInt(__io__address + 112, lmap_mode);
		}
	}

	/**
	 * Get method for struct member 'pmap_mode'.
	 * @see #__DNA__FIELD__pmap_mode
	 */
	
	public int getPmap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'pmap_mode'.
	 * @see #__DNA__FIELD__pmap_mode
	 */
	
	public void setPmap_mode(int pmap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, pmap_mode);
		} else {
			__io__block.writeInt(__io__address + 116, pmap_mode);
		}
	}

	/**
	 * Get method for struct member 'map_max_distance'.
	 * @see #__DNA__FIELD__map_max_distance
	 */
	
	public float getMap_max_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'map_max_distance'.
	 * @see #__DNA__FIELD__map_max_distance
	 */
	
	public void setMap_max_distance(float map_max_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, map_max_distance);
		} else {
			__io__block.writeFloat(__io__address + 120, map_max_distance);
		}
	}

	/**
	 * Get method for struct member 'map_ray_radius'.
	 * @see #__DNA__FIELD__map_ray_radius
	 */
	
	public float getMap_ray_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'map_ray_radius'.
	 * @see #__DNA__FIELD__map_ray_radius
	 */
	
	public void setMap_ray_radius(float map_ray_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, map_ray_radius);
		} else {
			__io__block.writeFloat(__io__address + 124, map_ray_radius);
		}
	}

	/**
	 * Get method for struct member 'islands_precision'.
	 * @see #__DNA__FIELD__islands_precision
	 */
	
	public float getIslands_precision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'islands_precision'.
	 * @see #__DNA__FIELD__islands_precision
	 */
	
	public void setIslands_precision(float islands_precision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, islands_precision);
		} else {
			__io__block.writeFloat(__io__address + 128, islands_precision);
		}
	}

	/**
	 * Get method for struct member 'pad_i1'.
	 * @see #__DNA__FIELD__pad_i1
	 */
	
	public int getPad_i1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'pad_i1'.
	 * @see #__DNA__FIELD__pad_i1
	 */
	
	public void setPad_i1(int pad_i1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, pad_i1);
		} else {
			__io__block.writeInt(__io__address + 132, pad_i1);
		}
	}

	/**
	 * Get method for struct member 'layers_select_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_FROMLAYERS_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__layers_select_src
	 */
	
	public CArrayFacade<Integer> getLayers_select_src() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers_select_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_FROMLAYERS_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__layers_select_src
	 */
	
	public void setLayers_select_src(CArrayFacade<Integer> layers_select_src) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 156;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(layers_select_src, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layers_select_src)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layers_select_src);
		} else {
			__io__generic__copy( getLayers_select_src(), layers_select_src);
		}
	}

	/**
	 * Get method for struct member 'layers_select_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_TOLAYERS_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__layers_select_dst
	 */
	
	public CArrayFacade<Integer> getLayers_select_dst() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers_select_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> DT_MULTILAYER_INDEX_MAX; See DT_TOLAYERS_ enum in ED_object.h </p>
	 * @see #__DNA__FIELD__layers_select_dst
	 */
	
	public void setLayers_select_dst(CArrayFacade<Integer> layers_select_dst) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 172;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(layers_select_dst, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layers_select_dst)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layers_select_dst);
		} else {
			__io__generic__copy( getLayers_select_dst(), layers_select_dst);
		}
	}

	/**
	 * Get method for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See CDT_MIX_ enum in BKE_customdata.h </p>
	 * @see #__DNA__FIELD__mix_mode
	 */
	
	public int getMix_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See CDT_MIX_ enum in BKE_customdata.h </p>
	 * @see #__DNA__FIELD__mix_mode
	 */
	
	public void setMix_mode(int mix_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, mix_mode);
		} else {
			__io__block.writeInt(__io__address + 168, mix_mode);
		}
	}

	/**
	 * Get method for struct member 'mix_factor'.
	 * @see #__DNA__FIELD__mix_factor
	 */
	
	public float getMix_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'mix_factor'.
	 * @see #__DNA__FIELD__mix_factor
	 */
	
	public void setMix_factor(float mix_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, mix_factor);
		} else {
			__io__block.writeFloat(__io__address + 172, mix_factor);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name);
		} else {
			__io__generic__copy( getDefgrp_name(), defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 260);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 260, flags);
		} else {
			__io__block.writeInt(__io__address + 240, flags);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DataTransferModifierData> __io__addressof() {
		return new CPointer<DataTransferModifierData>(__io__address, new Class[]{DataTransferModifierData.class}, __io__block, __io__blockTable);
	}

}
