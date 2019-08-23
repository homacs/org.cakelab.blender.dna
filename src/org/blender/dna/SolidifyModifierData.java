package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=204, size64=224)
public class SolidifyModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SolidifyModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SolidifyModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 131;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to use, MAX_VGROUP_NAME. </p>
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
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New surface offset leve.l </p>
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
	public static final long[] __DNA__FIELD__offset = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Midpoint of the offset . </p>
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
	public static final long[] __DNA__FIELD__offset_fac = new long[]{168, 188};

	/**
	 * Field descriptor (offset) for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor for the minimum weight to use when vgroups are used, avoids 0.0 weights giving duplicate geometry </p>
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
	public static final long[] __DNA__FIELD__offset_fac_vg = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__offset_clamp = new long[]{176, 196};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SolidifyModifierData solidifymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = solidifymodifierdata.__dna__addressof(SolidifyModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{180, 200};

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
	public static final long[] __DNA__FIELD__crease_inner = new long[]{184, 204};

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
	public static final long[] __DNA__FIELD__crease_outer = new long[]{188, 208};

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
	public static final long[] __DNA__FIELD__crease_rim = new long[]{192, 212};

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
	public static final long[] __DNA__FIELD__flag = new long[]{196, 216};

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
	public static final long[] __DNA__FIELD__mat_ofs = new long[]{200, 220};

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
	public static final long[] __DNA__FIELD__mat_ofs_rim = new long[]{202, 222};

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
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of vertex group to use, MAX_VGROUP_NAME. </p>
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
	 * <p> Name of vertex group to use, MAX_VGROUP_NAME. </p>
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
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New surface offset leve.l </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New surface offset leve.l </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, offset);
		} else {
			__io__block.writeFloat(__io__address + 164, offset);
		}
	}

	/**
	 * Get method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Midpoint of the offset . </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public float getOffset_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Midpoint of the offset . </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public void setOffset_fac(float offset_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, offset_fac);
		} else {
			__io__block.writeFloat(__io__address + 168, offset_fac);
		}
	}

	/**
	 * Get method for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor for the minimum weight to use when vgroups are used, avoids 0.0 weights giving duplicate geometry </p>
	 * @see #__DNA__FIELD__offset_fac_vg
	 */
	
	public float getOffset_fac_vg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'offset_fac_vg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor for the minimum weight to use when vgroups are used, avoids 0.0 weights giving duplicate geometry </p>
	 * @see #__DNA__FIELD__offset_fac_vg
	 */
	
	public void setOffset_fac_vg(float offset_fac_vg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, offset_fac_vg);
		} else {
			__io__block.writeFloat(__io__address + 172, offset_fac_vg);
		}
	}

	/**
	 * Get method for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clamp offset based on surrounding geometry. </p>
	 * @see #__DNA__FIELD__offset_clamp
	 */
	
	public float getOffset_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'offset_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clamp offset based on surrounding geometry. </p>
	 * @see #__DNA__FIELD__offset_clamp
	 */
	
	public void setOffset_clamp(float offset_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, offset_clamp);
		} else {
			__io__block.writeFloat(__io__address + 176, offset_clamp);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Get method for struct member 'crease_inner'.
	 * @see #__DNA__FIELD__crease_inner
	 */
	
	public float getCrease_inner() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'crease_inner'.
	 * @see #__DNA__FIELD__crease_inner
	 */
	
	public void setCrease_inner(float crease_inner) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, crease_inner);
		} else {
			__io__block.writeFloat(__io__address + 184, crease_inner);
		}
	}

	/**
	 * Get method for struct member 'crease_outer'.
	 * @see #__DNA__FIELD__crease_outer
	 */
	
	public float getCrease_outer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'crease_outer'.
	 * @see #__DNA__FIELD__crease_outer
	 */
	
	public void setCrease_outer(float crease_outer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, crease_outer);
		} else {
			__io__block.writeFloat(__io__address + 188, crease_outer);
		}
	}

	/**
	 * Get method for struct member 'crease_rim'.
	 * @see #__DNA__FIELD__crease_rim
	 */
	
	public float getCrease_rim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'crease_rim'.
	 * @see #__DNA__FIELD__crease_rim
	 */
	
	public void setCrease_rim(float crease_rim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, crease_rim);
		} else {
			__io__block.writeFloat(__io__address + 192, crease_rim);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, flag);
		} else {
			__io__block.writeInt(__io__address + 196, flag);
		}
	}

	/**
	 * Get method for struct member 'mat_ofs'.
	 * @see #__DNA__FIELD__mat_ofs
	 */
	
	public short getMat_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'mat_ofs'.
	 * @see #__DNA__FIELD__mat_ofs
	 */
	
	public void setMat_ofs(short mat_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, mat_ofs);
		} else {
			__io__block.writeShort(__io__address + 200, mat_ofs);
		}
	}

	/**
	 * Get method for struct member 'mat_ofs_rim'.
	 * @see #__DNA__FIELD__mat_ofs_rim
	 */
	
	public short getMat_ofs_rim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'mat_ofs_rim'.
	 * @see #__DNA__FIELD__mat_ofs_rim
	 */
	
	public void setMat_ofs_rim(short mat_ofs_rim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, mat_ofs_rim);
		} else {
			__io__block.writeShort(__io__address + 202, mat_ofs_rim);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SolidifyModifierData> __io__addressof() {
		return new CPointer<SolidifyModifierData>(__io__address, new Class[]{SolidifyModifierData.class}, __io__block, __io__blockTable);
	}

}
