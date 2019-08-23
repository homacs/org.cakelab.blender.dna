package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WeightVGMixModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=396, size64=424)
public class WeightVGMixModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct WeightVGMixModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for WeightVGMixModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 136;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'defgrp_name_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__defgrp_name_a);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name_a = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name_a'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name_a = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of other vertex group to mix in. MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__defgrp_name_b);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name_b = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name_b'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name_b = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'default_weight_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value for first vgroup. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__default_weight_a);
	 * CPointer&lt;Float&gt; p_default_weight_a = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_weight_a'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_weight_a = new long[]{228, 248};

	/**
	 * Field descriptor (offset) for struct member 'default_weight_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value to mix in. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__default_weight_b);
	 * CPointer&lt;Float&gt; p_default_weight_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_weight_b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_weight_b = new long[]{232, 252};

	/**
	 * Field descriptor (offset) for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How second vgroups weights affect first ones. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mix_mode);
	 * CPointer&lt;Byte&gt; p_mix_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_mode = new long[]{236, 256};

	/**
	 * Field descriptor (offset) for struct member 'mix_set'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> What vertices to affect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mix_set);
	 * CPointer&lt;Byte&gt; p_mix_set = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_set'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_set = new long[]{237, 257};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{238, 258};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_constant);
	 * CPointer&lt;Float&gt; p_mask_constant = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_constant'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_constant = new long[]{244, 264};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_defgrp_name = new long[]{248, 268};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_tex_use_channel);
	 * CPointer&lt;Integer&gt; p_mask_tex_use_channel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_use_channel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_use_channel = new long[]{312, 332};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_mask_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_texture = new long[]{316, 336};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_tex_map_obj);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_mask_tex_map_obj = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_map_obj'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_map_obj = new long[]{320, 344};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture!. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_tex_mapping);
	 * CPointer&lt;Integer&gt; p_mask_tex_mapping = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_mapping'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_mapping = new long[]{324, 352};

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
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD__mask_tex_uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_tex_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_uvlayer_name = new long[]{328, 356};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGMixModifierData weightvgmixmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgmixmodifierdata.__dna__addressof(WeightVGMixModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{392, 420};

	public WeightVGMixModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WeightVGMixModifierData(WeightVGMixModifierData that) {
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
	 * Get method for struct member 'defgrp_name_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name_a
	 */
	
	public CArrayFacade<Byte> getDefgrp_name_a() throws IOException
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
	 * Set method for struct member 'defgrp_name_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name_a
	 */
	
	public void setDefgrp_name_a(CArrayFacade<Byte> defgrp_name_a) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(defgrp_name_a, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name_a)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name_a);
		} else {
			__io__generic__copy( getDefgrp_name_a(), defgrp_name_a);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of other vertex group to mix in. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name_b
	 */
	
	public CArrayFacade<Byte> getDefgrp_name_b() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of other vertex group to mix in. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name_b
	 */
	
	public void setDefgrp_name_b(CArrayFacade<Byte> defgrp_name_b) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(defgrp_name_b, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name_b)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name_b);
		} else {
			__io__generic__copy( getDefgrp_name_b(), defgrp_name_b);
		}
	}

	/**
	 * Get method for struct member 'default_weight_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value for first vgroup. </p>
	 * @see #__DNA__FIELD__default_weight_a
	 */
	
	public float getDefault_weight_a() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'default_weight_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value for first vgroup. </p>
	 * @see #__DNA__FIELD__default_weight_a
	 */
	
	public void setDefault_weight_a(float default_weight_a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, default_weight_a);
		} else {
			__io__block.writeFloat(__io__address + 228, default_weight_a);
		}
	}

	/**
	 * Get method for struct member 'default_weight_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value to mix in. </p>
	 * @see #__DNA__FIELD__default_weight_b
	 */
	
	public float getDefault_weight_b() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'default_weight_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default weight value to mix in. </p>
	 * @see #__DNA__FIELD__default_weight_b
	 */
	
	public void setDefault_weight_b(float default_weight_b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, default_weight_b);
		} else {
			__io__block.writeFloat(__io__address + 232, default_weight_b);
		}
	}

	/**
	 * Get method for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How second vgroups weights affect first ones. </p>
	 * @see #__DNA__FIELD__mix_mode
	 */
	
	public byte getMix_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 256);
		} else {
			return __io__block.readByte(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'mix_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How second vgroups weights affect first ones. </p>
	 * @see #__DNA__FIELD__mix_mode
	 */
	
	public void setMix_mode(byte mix_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 256, mix_mode);
		} else {
			__io__block.writeByte(__io__address + 236, mix_mode);
		}
	}

	/**
	 * Get method for struct member 'mix_set'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> What vertices to affect. </p>
	 * @see #__DNA__FIELD__mix_set
	 */
	
	public byte getMix_set() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 257);
		} else {
			return __io__block.readByte(__io__address + 237);
		}
	}

	/**
	 * Set method for struct member 'mix_set'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> What vertices to affect. </p>
	 * @see #__DNA__FIELD__mix_set
	 */
	
	public void setMix_set(byte mix_set) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 257, mix_set);
		} else {
			__io__block.writeByte(__io__address + 237, mix_set);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 258, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 238, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 258;
		} else {
			__dna__offset = 238;
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
	 * Get method for struct member 'mask_constant'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Masking options. The global "influence", if no vgroup nor tex is used as mask. </p>
	 * @see #__DNA__FIELD__mask_constant
	 */
	
	public float getMask_constant() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 244);
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
			__io__block.writeFloat(__io__address + 264, mask_constant);
		} else {
			__io__block.writeFloat(__io__address + 244, mask_constant);
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
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 268;
		} else {
			__dna__offset = 248;
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
			return __io__block.readInt(__io__address + 332);
		} else {
			return __io__block.readInt(__io__address + 312);
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
			__io__block.writeInt(__io__address + 332, mask_tex_use_channel);
		} else {
			__io__block.writeInt(__io__address + 312, mask_tex_use_channel);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 316);
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
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 316, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
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
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 320, __address);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture!. </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public int getMask_tex_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 352);
		} else {
			return __io__block.readInt(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture!. </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public void setMask_tex_mapping(int mask_tex_mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 352, mask_tex_mapping);
		} else {
			__io__block.writeInt(__io__address + 324, mask_tex_mapping);
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
			return new CArrayFacade<Byte>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 356;
		} else {
			__dna__offset = 328;
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
	 * Get method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding... </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 420;
		} else {
			__dna__offset = 392;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WeightVGMixModifierData> __io__addressof() {
		return new CPointer<WeightVGMixModifierData>(__io__address, new Class[]{WeightVGMixModifierData.class}, __io__block, __io__blockTable);
	}

}
