package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WeightVGProximityModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=416, size64=456)
public class WeightVGProximityModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct WeightVGProximityModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for WeightVGProximityModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 139;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__cmap_curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cmap_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cmap_curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cmap_curve = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'proximity_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proximity modes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__proximity_mode);
	 * CPointer&lt;Integer&gt; p_proximity_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proximity_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proximity_mode = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'proximity_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__proximity_flags);
	 * CPointer&lt;Integer&gt; p_proximity_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proximity_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proximity_flags = new long[]{184, 212};

	/**
	 * Field descriptor (offset) for struct member 'proximity_ob_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target object from which to calculate vertices distances. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__proximity_ob_target);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_proximity_ob_target = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proximity_ob_target'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proximity_ob_target = new long[]{188, 216};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_constant);
	 * CPointer&lt;Float&gt; p_mask_constant = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_constant'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_constant = new long[]{192, 224};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_defgrp_name = new long[]{196, 228};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_tex_use_channel);
	 * CPointer&lt;Integer&gt; p_mask_tex_use_channel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_use_channel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_use_channel = new long[]{260, 292};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_mask_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_texture = new long[]{264, 296};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_tex_map_obj);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_mask_tex_map_obj = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_map_obj'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_map_obj = new long[]{268, 304};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_map_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map bone. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_tex_map_bone);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_tex_map_bone = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_map_bone'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_map_bone = new long[]{272, 312};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_tex_mapping);
	 * CPointer&lt;Integer&gt; p_mask_tex_mapping = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_mapping'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_mapping = new long[]{336, 376};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV Map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__mask_tex_uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask_tex_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_uvlayer_name = new long[]{340, 380};

	/**
	 * Field descriptor (offset) for struct member 'min_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distances mapping to 0.0/1.0 weights. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__min_dist);
	 * CPointer&lt;Float&gt; p_min_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_dist = new long[]{404, 444};

	/**
	 * Field descriptor (offset) for struct member 'max_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__max_dist);
	 * CPointer&lt;Float&gt; p_max_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_dist = new long[]{408, 448};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Put here to avoid breaking existing struct... Using MOD_WVG_MAPPING_* enums. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Short&gt; p_falloff_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{412, 452};

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
	 * WeightVGProximityModifierData weightvgproximitymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = weightvgproximitymodifierdata.__dna__addressof(WeightVGProximityModifierData.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{414, 454};

	public WeightVGProximityModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WeightVGProximityModifierData(WeightVGProximityModifierData that) {
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
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to modify/weight. MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 112;
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
	 * Get method for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve. </p>
	 * @see #__DNA__FIELD__cmap_curve
	 */
	
	public CPointer<CurveMapping> getCmap_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cmap_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mapping stuff. The custom mapping curve. </p>
	 * @see #__DNA__FIELD__cmap_curve
	 */
	
	public void setCmap_curve(CPointer<CurveMapping> cmap_curve) throws IOException
	{
		long __address = ((cmap_curve == null) ? 0 : cmap_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'proximity_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proximity modes. </p>
	 * @see #__DNA__FIELD__proximity_mode
	 */
	
	public int getProximity_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 208);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'proximity_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proximity modes. </p>
	 * @see #__DNA__FIELD__proximity_mode
	 */
	
	public void setProximity_mode(int proximity_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 208, proximity_mode);
		} else {
			__io__block.writeInt(__io__address + 180, proximity_mode);
		}
	}

	/**
	 * Get method for struct member 'proximity_flags'.
	 * @see #__DNA__FIELD__proximity_flags
	 */
	
	public int getProximity_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 212);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'proximity_flags'.
	 * @see #__DNA__FIELD__proximity_flags
	 */
	
	public void setProximity_flags(int proximity_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 212, proximity_flags);
		} else {
			__io__block.writeInt(__io__address + 184, proximity_flags);
		}
	}

	/**
	 * Get method for struct member 'proximity_ob_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target object from which to calculate vertices distances. </p>
	 * @see #__DNA__FIELD__proximity_ob_target
	 */
	
	public CPointer<BlenderObject> getProximity_ob_target() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proximity_ob_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target object from which to calculate vertices distances. </p>
	 * @see #__DNA__FIELD__proximity_ob_target
	 */
	
	public void setProximity_ob_target(CPointer<BlenderObject> proximity_ob_target) throws IOException
	{
		long __address = ((proximity_ob_target == null) ? 0 : proximity_ob_target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
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
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 192);
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
			__io__block.writeFloat(__io__address + 224, mask_constant);
		} else {
			__io__block.writeFloat(__io__address + 192, mask_constant);
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
			return new CArrayFacade<Byte>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 228;
		} else {
			__dna__offset = 196;
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
			return __io__block.readInt(__io__address + 292);
		} else {
			return __io__block.readInt(__io__address + 260);
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
			__io__block.writeInt(__io__address + 292, mask_tex_use_channel);
		} else {
			__io__block.writeInt(__io__address + 260, mask_tex_use_channel);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
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
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 264, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 268);
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
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 268, __address);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_map_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map bone. </p>
	 * @see #__DNA__FIELD__mask_tex_map_bone
	 */
	
	public CArrayFacade<Byte> getMask_tex_map_bone() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_map_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the map bone. </p>
	 * @see #__DNA__FIELD__mask_tex_map_bone
	 */
	
	public void setMask_tex_map_bone(CArrayFacade<Byte> mask_tex_map_bone) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(mask_tex_map_bone, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_tex_map_bone)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_tex_map_bone);
		} else {
			__io__generic__copy( getMask_tex_map_bone(), mask_tex_map_bone);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture. </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public int getMask_tex_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 376);
		} else {
			return __io__block.readInt(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How to map the texture. </p>
	 * @see #__DNA__FIELD__mask_tex_mapping
	 */
	
	public void setMask_tex_mapping(int mask_tex_mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 376, mask_tex_mapping);
		} else {
			__io__block.writeInt(__io__address + 336, mask_tex_mapping);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV Map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__mask_tex_uvlayer_name
	 */
	
	public CArrayFacade<Byte> getMask_tex_uvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 340, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the UV Map. MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__mask_tex_uvlayer_name
	 */
	
	public void setMask_tex_uvlayer_name(CArrayFacade<Byte> mask_tex_uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 380;
		} else {
			__dna__offset = 340;
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
	 * Get method for struct member 'min_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distances mapping to 0.0/1.0 weights. </p>
	 * @see #__DNA__FIELD__min_dist
	 */
	
	public float getMin_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 444);
		} else {
			return __io__block.readFloat(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'min_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distances mapping to 0.0/1.0 weights. </p>
	 * @see #__DNA__FIELD__min_dist
	 */
	
	public void setMin_dist(float min_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 444, min_dist);
		} else {
			__io__block.writeFloat(__io__address + 404, min_dist);
		}
	}

	/**
	 * Get method for struct member 'max_dist'.
	 * @see #__DNA__FIELD__max_dist
	 */
	
	public float getMax_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 448);
		} else {
			return __io__block.readFloat(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'max_dist'.
	 * @see #__DNA__FIELD__max_dist
	 */
	
	public void setMax_dist(float max_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 448, max_dist);
		} else {
			__io__block.writeFloat(__io__address + 408, max_dist);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Put here to avoid breaking existing struct... Using MOD_WVG_MAPPING_* enums. </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public short getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 452);
		} else {
			return __io__block.readShort(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Put here to avoid breaking existing struct... Using MOD_WVG_MAPPING_* enums. </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(short falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 452, falloff_type);
		} else {
			__io__block.writeShort(__io__address + 412, falloff_type);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 454, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 414, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 454;
		} else {
			__dna__offset = 414;
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
	public CPointer<WeightVGProximityModifierData> __io__addressof() {
		return new CPointer<WeightVGProximityModifierData>(__io__address, new Class[]{WeightVGProximityModifierData.class}, __io__block, __io__blockTable);
	}

}
