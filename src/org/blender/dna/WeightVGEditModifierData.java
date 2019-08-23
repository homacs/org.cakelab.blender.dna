package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WeightVGEditModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=336, size64=368)
public class WeightVGEditModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct WeightVGEditModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for WeightVGEditModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 135;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to edit. MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'edit_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_EDIT_* flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__edit_flags);
	 * CPointer&lt;Short&gt; p_edit_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_flags = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_MAPPING_* defines. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Short&gt; p_falloff_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{166, 186};

	/**
	 * Field descriptor (offset) for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight for vertices not in vgroup. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__default_weight);
	 * CPointer&lt;Float&gt; p_default_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_weight = new long[]{168, 188};

	/**
	 * Field descriptor (offset) for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve!. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__cmap_curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cmap_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cmap_curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cmap_curve = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'add_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The add/remove vertices weight thresholds. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__add_threshold);
	 * CPointer&lt;Float&gt; p_add_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_threshold = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'rem_threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__rem_threshold);
	 * CPointer&lt;Float&gt; p_rem_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rem_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rem_threshold = new long[]{180, 204};

	/**
	 * Field descriptor (offset) for struct member 'mask_constant'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Masking options. The global "influence", if no vgroup nor tex is used as mask. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_constant);
	 * CPointer&lt;Float&gt; p_mask_constant = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_constant'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_constant = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'mask_defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of mask vertex group from which to get weight factors. MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_defgrp_name = new long[]{188, 212};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_use_channel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture masking. Which channel to use as weightf. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_tex_use_channel);
	 * CPointer&lt;Integer&gt; p_mask_tex_use_channel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_use_channel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_use_channel = new long[]{252, 276};

	/**
	 * Field descriptor (offset) for struct member 'mask_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The texture. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_mask_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_texture = new long[]{256, 280};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_map_obj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_tex_map_obj);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_mask_tex_map_obj = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_map_obj'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_map_obj = new long[]{260, 288};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture (using MOD_DISP_MAP_* enums). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_tex_mapping);
	 * CPointer&lt;Integer&gt; p_mask_tex_mapping = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_mapping'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_mapping = new long[]{264, 296};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD__mask_tex_uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_tex_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_uvlayer_name = new long[]{268, 300};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGEditModifierData weightvgeditmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgeditmodifierdata.__dna__addressof(WeightVGEditModifierData.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{332, 364};

	public WeightVGEditModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WeightVGEditModifierData(WeightVGEditModifierData that) {
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
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to edit. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to edit. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
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
	 * Get method for struct member 'edit_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_EDIT_* flags. </p>
	 * @see #__DNA__FIELD__edit_flags
	 */
	
	public short getEdit_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'edit_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_EDIT_* flags. </p>
	 * @see #__DNA__FIELD__edit_flags
	 */
	
	public void setEdit_flags(short edit_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, edit_flags);
		} else {
			__io__block.writeShort(__io__address + 164, edit_flags);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_MAPPING_* defines. </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public short getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Using MOD_WVG_MAPPING_* defines. </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(short falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 186, falloff_type);
		} else {
			__io__block.writeShort(__io__address + 166, falloff_type);
		}
	}

	/**
	 * Get method for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight for vertices not in vgroup. </p>
	 * @see #__DNA__FIELD__default_weight
	 */
	
	public float getDefault_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight for vertices not in vgroup. </p>
	 * @see #__DNA__FIELD__default_weight
	 */
	
	public void setDefault_weight(float default_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, default_weight);
		} else {
			__io__block.writeFloat(__io__address + 168, default_weight);
		}
	}

	/**
	 * Get method for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve!. </p>
	 * @see #__DNA__FIELD__cmap_curve
	 */
	
	public CPointer<CurveMapping> getCmap_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve!. </p>
	 * @see #__DNA__FIELD__cmap_curve
	 */
	
	public void setCmap_curve(CPointer<CurveMapping> cmap_curve) throws IOException
	{
		long __address = ((cmap_curve == null) ? 0 : cmap_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'add_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The add/remove vertices weight thresholds. </p>
	 * @see #__DNA__FIELD__add_threshold
	 */
	
	public float getAdd_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'add_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The add/remove vertices weight thresholds. </p>
	 * @see #__DNA__FIELD__add_threshold
	 */
	
	public void setAdd_threshold(float add_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, add_threshold);
		} else {
			__io__block.writeFloat(__io__address + 176, add_threshold);
		}
	}

	/**
	 * Get method for struct member 'rem_threshold'.
	 * @see #__DNA__FIELD__rem_threshold
	 */
	
	public float getRem_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'rem_threshold'.
	 * @see #__DNA__FIELD__rem_threshold
	 */
	
	public void setRem_threshold(float rem_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, rem_threshold);
		} else {
			__io__block.writeFloat(__io__address + 180, rem_threshold);
		}
	}

	/**
	 * Get method for struct member 'mask_constant'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Masking options. The global "influence", if no vgroup nor tex is used as mask. </p>
	 * @see #__DNA__FIELD__mask_constant
	 */
	
	public float getMask_constant() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'mask_constant'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Masking options. The global "influence", if no vgroup nor tex is used as mask. </p>
	 * @see #__DNA__FIELD__mask_constant
	 */
	
	public void setMask_constant(float mask_constant) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, mask_constant);
		} else {
			__io__block.writeFloat(__io__address + 184, mask_constant);
		}
	}

	/**
	 * Get method for struct member 'mask_defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of mask vertex group from which to get weight factors. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__mask_defgrp_name
	 */
	
	public CArrayFacade<Byte> getMask_defgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of mask vertex group from which to get weight factors. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__mask_defgrp_name
	 */
	
	public void setMask_defgrp_name(CArrayFacade<Byte> mask_defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 212;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(mask_defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_defgrp_name);
		} else {
			__io__generic__copy( getMask_defgrp_name(), mask_defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_use_channel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture masking. Which channel to use as weightf. </p>
	 * @see #__DNA__FIELD__mask_tex_use_channel
	 */
	
	public int getMask_tex_use_channel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 276);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_use_channel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture masking. Which channel to use as weightf. </p>
	 * @see #__DNA__FIELD__mask_tex_use_channel
	 */
	
	public void setMask_tex_use_channel(int mask_tex_use_channel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 276, mask_tex_use_channel);
		} else {
			__io__block.writeInt(__io__address + 252, mask_tex_use_channel);
		}
	}

	/**
	 * Get method for struct member 'mask_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The texture. </p>
	 * @see #__DNA__FIELD__mask_texture
	 */
	
	public CPointer<Tex> getMask_texture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mask_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The texture. </p>
	 * @see #__DNA__FIELD__mask_texture
	 */
	
	public void setMask_texture(CPointer<Tex> mask_texture) throws IOException
	{
		long __address = ((mask_texture == null) ? 0 : mask_texture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_map_obj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map object. </p>
	 * @see #__DNA__FIELD__mask_tex_map_obj
	 */
	
	public CPointer<BlenderObject> getMask_tex_map_obj() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mask_tex_map_obj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map object. </p>
	 * @see #__DNA__FIELD__mask_tex_map_obj
	 */
	
	public void setMask_tex_map_obj(CPointer<BlenderObject> mask_tex_map_obj) throws IOException
	{
		long __address = ((mask_tex_map_obj == null) ? 0 : mask_tex_map_obj.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 260, __address);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture (using MOD_DISP_MAP_* enums). </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public int getMask_tex_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 296);
		} else {
			return __io__block.readInt(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture (using MOD_DISP_MAP_* enums). </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public void setMask_tex_mapping(int mask_tex_mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 296, mask_tex_mapping);
		} else {
			__io__block.writeInt(__io__address + 264, mask_tex_mapping);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__mask_tex_uvlayer_name
	 */
	
	public CArrayFacade<Byte> getMask_tex_uvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 300, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__mask_tex_uvlayer_name
	 */
	
	public void setMask_tex_uvlayer_name(CArrayFacade<Byte> mask_tex_uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 300;
		} else {
			__dna__offset = 268;
		}
		if (__io__equals(mask_tex_uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_tex_uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_tex_uvlayer_name);
		} else {
			__io__generic__copy( getMask_tex_uvlayer_name(), mask_tex_uvlayer_name);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 364;
		} else {
			__dna__offset = 332;
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
	public CPointer<WeightVGEditModifierData> __io__addressof() {
		return new CPointer<WeightVGEditModifierData>(__io__address, new Class[]{WeightVGEditModifierData.class}, __io__block, __io__blockTable);
	}

}
