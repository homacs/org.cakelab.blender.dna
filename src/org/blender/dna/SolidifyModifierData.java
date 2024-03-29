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
 * Generated facet for DNA struct type 'SolidifyModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=344, size64=360)
public class SolidifyModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SolidifyModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SolidifyModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 358;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 104/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Name of vertex group to use, #MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'shell_defgrp_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__shell_defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_shell_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shell_defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shell_defgrp_name = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member 'rim_defgrp_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__rim_defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_rim_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rim_defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rim_defgrp_name = new long[]{232, 248};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> New surface offset level. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{296, 312};

	/**
	 * Field descriptor (offset) for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Midpoint of the offset. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__offset_fac);
	 * CPointer&lt;Float&gt; p_offset_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_fac = new long[]{300, 316};

	/**
	 * Field descriptor (offset) for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor for the minimum weight to use when vertex-groups are used, avoids 0.0 weights giving duplicate geometry. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__offset_fac_vg);
	 * CPointer&lt;Float&gt; p_offset_fac_vg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_fac_vg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_fac_vg = new long[]{304, 320};

	/**
	 * Field descriptor (offset) for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Clamp offset based on surrounding geometry. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__offset_clamp);
	 * CPointer&lt;Float&gt; p_offset_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_clamp = new long[]{308, 324};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Byte&gt; p_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{312, 328};

	/**
	 * Field descriptor (offset) for struct member 'nonmanifold_offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables for #MOD_SOLIDIFY_MODE_NONMANIFOLD. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__nonmanifold_offset_mode);
	 * CPointer&lt;Byte&gt; p_nonmanifold_offset_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nonmanifold_offset_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nonmanifold_offset_mode = new long[]{313, 329};

	/**
	 * Field descriptor (offset) for struct member 'nonmanifold_boundary_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__nonmanifold_boundary_mode);
	 * CPointer&lt;Byte&gt; p_nonmanifold_boundary_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nonmanifold_boundary_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nonmanifold_boundary_mode = new long[]{314, 330};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{315, 331};

	/**
	 * Field descriptor (offset) for struct member 'crease_inner'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__crease_inner);
	 * CPointer&lt;Float&gt; p_crease_inner = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_inner'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_inner = new long[]{316, 332};

	/**
	 * Field descriptor (offset) for struct member 'crease_outer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__crease_outer);
	 * CPointer&lt;Float&gt; p_crease_outer = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_outer'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_outer = new long[]{320, 336};

	/**
	 * Field descriptor (offset) for struct member 'crease_rim'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__crease_rim);
	 * CPointer&lt;Float&gt; p_crease_rim = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease_rim'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease_rim = new long[]{324, 340};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{328, 344};

	/**
	 * Field descriptor (offset) for struct member 'mat_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__mat_ofs);
	 * CPointer&lt;Short&gt; p_mat_ofs = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_ofs'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_ofs = new long[]{332, 348};

	/**
	 * Field descriptor (offset) for struct member 'mat_ofs_rim'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__mat_ofs_rim);
	 * CPointer&lt;Short&gt; p_mat_ofs_rim = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_ofs_rim'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_ofs_rim = new long[]{334, 350};

	/**
	 * Field descriptor (offset) for struct member 'merge_tolerance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__merge_tolerance);
	 * CPointer&lt;Float&gt; p_merge_tolerance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'merge_tolerance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__merge_tolerance = new long[]{336, 352};

	/**
	 * Field descriptor (offset) for struct member 'bevel_convex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD__bevel_convex);
	 * CPointer&lt;Float&gt; p_bevel_convex = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevel_convex'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevel_convex = new long[]{340, 356};

	public SolidifyModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SolidifyModifierData(SolidifyModifierData that) {
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
	 * <h4>Blender Source Code</h4>
	 * <p> Name of vertex group to use, #MAX_VGROUP_NAME. </p>
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
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Name of vertex group to use, #MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 104;
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
	 * Get method for struct member 'shell_defgrp_name'.
	 * @see #__DNA__FIELD__shell_defgrp_name
	 */
	
	public CArrayFacade<Byte> getShell_defgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shell_defgrp_name'.
	 * @see #__DNA__FIELD__shell_defgrp_name
	 */
	
	public void setShell_defgrp_name(CArrayFacade<Byte> shell_defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(shell_defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shell_defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shell_defgrp_name);
		} else {
			__io__generic__copy( getShell_defgrp_name(), shell_defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'rim_defgrp_name'.
	 * @see #__DNA__FIELD__rim_defgrp_name
	 */
	
	public CArrayFacade<Byte> getRim_defgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rim_defgrp_name'.
	 * @see #__DNA__FIELD__rim_defgrp_name
	 */
	
	public void setRim_defgrp_name(CArrayFacade<Byte> rim_defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(rim_defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rim_defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rim_defgrp_name);
		} else {
			__io__generic__copy( getRim_defgrp_name(), rim_defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> New surface offset level. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> New surface offset level. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, offset);
		} else {
			__io__block.writeFloat(__io__address + 296, offset);
		}
	}

	/**
	 * Get method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Midpoint of the offset. </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public float getOffset_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Midpoint of the offset. </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public void setOffset_fac(float offset_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, offset_fac);
		} else {
			__io__block.writeFloat(__io__address + 300, offset_fac);
		}
	}

	/**
	 * Get method for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor for the minimum weight to use when vertex-groups are used, avoids 0.0 weights giving duplicate geometry. </p>
	 * @see #__DNA__FIELD__offset_fac_vg
	 */
	
	public float getOffset_fac_vg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor for the minimum weight to use when vertex-groups are used, avoids 0.0 weights giving duplicate geometry. </p>
	 * @see #__DNA__FIELD__offset_fac_vg
	 */
	
	public void setOffset_fac_vg(float offset_fac_vg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, offset_fac_vg);
		} else {
			__io__block.writeFloat(__io__address + 304, offset_fac_vg);
		}
	}

	/**
	 * Get method for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Clamp offset based on surrounding geometry. </p>
	 * @see #__DNA__FIELD__offset_clamp
	 */
	
	public float getOffset_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 324);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Clamp offset based on surrounding geometry. </p>
	 * @see #__DNA__FIELD__offset_clamp
	 */
	
	public void setOffset_clamp(float offset_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 324, offset_clamp);
		} else {
			__io__block.writeFloat(__io__address + 308, offset_clamp);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public byte getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 328);
		} else {
			return __io__block.readByte(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(byte mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 328, mode);
		} else {
			__io__block.writeByte(__io__address + 312, mode);
		}
	}

	/**
	 * Get method for struct member 'nonmanifold_offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables for #MOD_SOLIDIFY_MODE_NONMANIFOLD. </p>
	 * @see #__DNA__FIELD__nonmanifold_offset_mode
	 */
	
	public byte getNonmanifold_offset_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 329);
		} else {
			return __io__block.readByte(__io__address + 313);
		}
	}

	/**
	 * Set method for struct member 'nonmanifold_offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables for #MOD_SOLIDIFY_MODE_NONMANIFOLD. </p>
	 * @see #__DNA__FIELD__nonmanifold_offset_mode
	 */
	
	public void setNonmanifold_offset_mode(byte nonmanifold_offset_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 329, nonmanifold_offset_mode);
		} else {
			__io__block.writeByte(__io__address + 313, nonmanifold_offset_mode);
		}
	}

	/**
	 * Get method for struct member 'nonmanifold_boundary_mode'.
	 * @see #__DNA__FIELD__nonmanifold_boundary_mode
	 */
	
	public byte getNonmanifold_boundary_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 330);
		} else {
			return __io__block.readByte(__io__address + 314);
		}
	}

	/**
	 * Set method for struct member 'nonmanifold_boundary_mode'.
	 * @see #__DNA__FIELD__nonmanifold_boundary_mode
	 */
	
	public void setNonmanifold_boundary_mode(byte nonmanifold_boundary_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 330, nonmanifold_boundary_mode);
		} else {
			__io__block.writeByte(__io__address + 314, nonmanifold_boundary_mode);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 331);
		} else {
			return __io__block.readByte(__io__address + 315);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 331, _pad);
		} else {
			__io__block.writeByte(__io__address + 315, _pad);
		}
	}

	/**
	 * Get method for struct member 'crease_inner'.
	 * @see #__DNA__FIELD__crease_inner
	 */
	
	public float getCrease_inner() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'crease_inner'.
	 * @see #__DNA__FIELD__crease_inner
	 */
	
	public void setCrease_inner(float crease_inner) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, crease_inner);
		} else {
			__io__block.writeFloat(__io__address + 316, crease_inner);
		}
	}

	/**
	 * Get method for struct member 'crease_outer'.
	 * @see #__DNA__FIELD__crease_outer
	 */
	
	public float getCrease_outer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'crease_outer'.
	 * @see #__DNA__FIELD__crease_outer
	 */
	
	public void setCrease_outer(float crease_outer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, crease_outer);
		} else {
			__io__block.writeFloat(__io__address + 320, crease_outer);
		}
	}

	/**
	 * Get method for struct member 'crease_rim'.
	 * @see #__DNA__FIELD__crease_rim
	 */
	
	public float getCrease_rim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'crease_rim'.
	 * @see #__DNA__FIELD__crease_rim
	 */
	
	public void setCrease_rim(float crease_rim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, crease_rim);
		} else {
			__io__block.writeFloat(__io__address + 324, crease_rim);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 344);
		} else {
			return __io__block.readInt(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 344, flag);
		} else {
			__io__block.writeInt(__io__address + 328, flag);
		}
	}

	/**
	 * Get method for struct member 'mat_ofs'.
	 * @see #__DNA__FIELD__mat_ofs
	 */
	
	public short getMat_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 348);
		} else {
			return __io__block.readShort(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'mat_ofs'.
	 * @see #__DNA__FIELD__mat_ofs
	 */
	
	public void setMat_ofs(short mat_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 348, mat_ofs);
		} else {
			__io__block.writeShort(__io__address + 332, mat_ofs);
		}
	}

	/**
	 * Get method for struct member 'mat_ofs_rim'.
	 * @see #__DNA__FIELD__mat_ofs_rim
	 */
	
	public short getMat_ofs_rim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 350);
		} else {
			return __io__block.readShort(__io__address + 334);
		}
	}

	/**
	 * Set method for struct member 'mat_ofs_rim'.
	 * @see #__DNA__FIELD__mat_ofs_rim
	 */
	
	public void setMat_ofs_rim(short mat_ofs_rim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 350, mat_ofs_rim);
		} else {
			__io__block.writeShort(__io__address + 334, mat_ofs_rim);
		}
	}

	/**
	 * Get method for struct member 'merge_tolerance'.
	 * @see #__DNA__FIELD__merge_tolerance
	 */
	
	public float getMerge_tolerance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'merge_tolerance'.
	 * @see #__DNA__FIELD__merge_tolerance
	 */
	
	public void setMerge_tolerance(float merge_tolerance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, merge_tolerance);
		} else {
			__io__block.writeFloat(__io__address + 336, merge_tolerance);
		}
	}

	/**
	 * Get method for struct member 'bevel_convex'.
	 * @see #__DNA__FIELD__bevel_convex
	 */
	
	public float getBevel_convex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 356);
		} else {
			return __io__block.readFloat(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'bevel_convex'.
	 * @see #__DNA__FIELD__bevel_convex
	 */
	
	public void setBevel_convex(float bevel_convex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 356, bevel_convex);
		} else {
			__io__block.writeFloat(__io__address + 340, bevel_convex);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SolidifyModifierData> __io__addressof() {
		return new CPointer<SolidifyModifierData>(__io__address, new Class[]{SolidifyModifierData.class}, __io__block, __io__blockTable);
	}

}
