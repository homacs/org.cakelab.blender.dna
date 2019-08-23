package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BevelModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=204, size64=224)
public class BevelModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct BevelModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for BevelModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 105;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The "raw" bevel value (distance/amount to bevel). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__value);
	 * CPointer&lt;Float&gt; p_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The resolution (as originally coded, it is the number of recursive bevels). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__res);
	 * CPointer&lt;Integer&gt; p_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General option flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'val_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to interpret the bevel value. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__val_flags);
	 * CPointer&lt;Short&gt; p_val_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'val_flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__val_flags = new long[]{110, 130};

	/**
	 * Field descriptor (offset) for struct member 'lim_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to tell the tool how to limit the bevel. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__lim_flags);
	 * CPointer&lt;Short&gt; p_lim_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lim_flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lim_flags = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'e_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to direct how edge weights are applied to verts. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__e_flags);
	 * CPointer&lt;Short&gt; p_e_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'e_flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__e_flags = new long[]{114, 134};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index if >= 0, else material inherited from surrounding faces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__mat);
	 * CPointer&lt;Short&gt; p_mat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'edge_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__edge_flags);
	 * CPointer&lt;Short&gt; p_edge_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_flags = new long[]{118, 138};

	/**
	 * Field descriptor (offset) for struct member 'face_str_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__face_str_mode);
	 * CPointer&lt;Short&gt; p_face_str_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_str_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_str_mode = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'miter_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patterns to use for mitering non-reflex and reflex miter edges </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__miter_inner);
	 * CPointer&lt;Short&gt; p_miter_inner = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'miter_inner'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__miter_inner = new long[]{122, 142};

	/**
	 * Field descriptor (offset) for struct member 'miter_outer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__miter_outer);
	 * CPointer&lt;Short&gt; p_miter_outer = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'miter_outer'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__miter_outer = new long[]{124, 144};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{126, 146};

	/**
	 * Field descriptor (offset) for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls profile shape (0->1, .5 is round). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__profile);
	 * CPointer&lt;Float&gt; p_profile = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'profile'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__profile = new long[]{128, 148};

	/**
	 * Field descriptor (offset) for struct member 'bevel_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_ANGLE is set, this will be how "sharp" an edge must be before it gets beveled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__bevel_angle);
	 * CPointer&lt;Float&gt; p_bevel_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevel_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevel_angle = new long[]{132, 152};

	/**
	 * Field descriptor (offset) for struct member 'spread'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__spread);
	 * CPointer&lt;Float&gt; p_spread = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spread'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spread = new long[]{136, 156};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_VWEIGHT option is set, this will be the name of the vert group, MAX_VGROUP_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BevelModifierData bevelmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = bevelmodifierdata.__dna__addressof(BevelModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{140, 160};

	public BevelModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BevelModifierData(BevelModifierData that) {
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
	 * Get method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The "raw" bevel value (distance/amount to bevel). </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public float getValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The "raw" bevel value (distance/amount to bevel). </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(float value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, value);
		} else {
			__io__block.writeFloat(__io__address + 100, value);
		}
	}

	/**
	 * Get method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The resolution (as originally coded, it is the number of recursive bevels). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public int getRes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The resolution (as originally coded, it is the number of recursive bevels). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public void setRes(int res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, res);
		} else {
			__io__block.writeInt(__io__address + 104, res);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General option flags. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General option flags. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, flags);
		} else {
			__io__block.writeShort(__io__address + 108, flags);
		}
	}

	/**
	 * Get method for struct member 'val_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to interpret the bevel value. </p>
	 * @see #__DNA__FIELD__val_flags
	 */
	
	public short getVal_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'val_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to interpret the bevel value. </p>
	 * @see #__DNA__FIELD__val_flags
	 */
	
	public void setVal_flags(short val_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, val_flags);
		} else {
			__io__block.writeShort(__io__address + 110, val_flags);
		}
	}

	/**
	 * Get method for struct member 'lim_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to tell the tool how to limit the bevel. </p>
	 * @see #__DNA__FIELD__lim_flags
	 */
	
	public short getLim_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'lim_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to tell the tool how to limit the bevel. </p>
	 * @see #__DNA__FIELD__lim_flags
	 */
	
	public void setLim_flags(short lim_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, lim_flags);
		} else {
			__io__block.writeShort(__io__address + 112, lim_flags);
		}
	}

	/**
	 * Get method for struct member 'e_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to direct how edge weights are applied to verts. </p>
	 * @see #__DNA__FIELD__e_flags
	 */
	
	public short getE_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 134);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'e_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags to direct how edge weights are applied to verts. </p>
	 * @see #__DNA__FIELD__e_flags
	 */
	
	public void setE_flags(short e_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 134, e_flags);
		} else {
			__io__block.writeShort(__io__address + 114, e_flags);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index if >= 0, else material inherited from surrounding faces. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public short getMat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index if >= 0, else material inherited from surrounding faces. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(short mat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, mat);
		} else {
			__io__block.writeShort(__io__address + 116, mat);
		}
	}

	/**
	 * Get method for struct member 'edge_flags'.
	 * @see #__DNA__FIELD__edge_flags
	 */
	
	public short getEdge_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 118);
		}
	}

	/**
	 * Set method for struct member 'edge_flags'.
	 * @see #__DNA__FIELD__edge_flags
	 */
	
	public void setEdge_flags(short edge_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 138, edge_flags);
		} else {
			__io__block.writeShort(__io__address + 118, edge_flags);
		}
	}

	/**
	 * Get method for struct member 'face_str_mode'.
	 * @see #__DNA__FIELD__face_str_mode
	 */
	
	public short getFace_str_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 140);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'face_str_mode'.
	 * @see #__DNA__FIELD__face_str_mode
	 */
	
	public void setFace_str_mode(short face_str_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 140, face_str_mode);
		} else {
			__io__block.writeShort(__io__address + 120, face_str_mode);
		}
	}

	/**
	 * Get method for struct member 'miter_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patterns to use for mitering non-reflex and reflex miter edges </p>
	 * @see #__DNA__FIELD__miter_inner
	 */
	
	public short getMiter_inner() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 142);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'miter_inner'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> patterns to use for mitering non-reflex and reflex miter edges </p>
	 * @see #__DNA__FIELD__miter_inner
	 */
	
	public void setMiter_inner(short miter_inner) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 142, miter_inner);
		} else {
			__io__block.writeShort(__io__address + 122, miter_inner);
		}
	}

	/**
	 * Get method for struct member 'miter_outer'.
	 * @see #__DNA__FIELD__miter_outer
	 */
	
	public short getMiter_outer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'miter_outer'.
	 * @see #__DNA__FIELD__miter_outer
	 */
	
	public void setMiter_outer(short miter_outer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 144, miter_outer);
		} else {
			__io__block.writeShort(__io__address + 124, miter_outer);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 146, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 126, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 146;
		} else {
			__dna__offset = 126;
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
	 * Get method for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls profile shape (0->1, .5 is round). </p>
	 * @see #__DNA__FIELD__profile
	 */
	
	public float getProfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls profile shape (0->1, .5 is round). </p>
	 * @see #__DNA__FIELD__profile
	 */
	
	public void setProfile(float profile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, profile);
		} else {
			__io__block.writeFloat(__io__address + 128, profile);
		}
	}

	/**
	 * Get method for struct member 'bevel_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_ANGLE is set, this will be how "sharp" an edge must be before it gets beveled </p>
	 * @see #__DNA__FIELD__bevel_angle
	 */
	
	public float getBevel_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'bevel_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_ANGLE is set, this will be how "sharp" an edge must be before it gets beveled </p>
	 * @see #__DNA__FIELD__bevel_angle
	 */
	
	public void setBevel_angle(float bevel_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, bevel_angle);
		} else {
			__io__block.writeFloat(__io__address + 132, bevel_angle);
		}
	}

	/**
	 * Get method for struct member 'spread'.
	 * @see #__DNA__FIELD__spread
	 */
	
	public float getSpread() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'spread'.
	 * @see #__DNA__FIELD__spread
	 */
	
	public void setSpread(float spread) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, spread);
		} else {
			__io__block.writeFloat(__io__address + 136, spread);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_VWEIGHT option is set, this will be the name of the vert group, MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if the MOD_BEVEL_VWEIGHT option is set, this will be the name of the vert group, MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 140;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BevelModifierData> __io__addressof() {
		return new CPointer<BevelModifierData>(__io__address, new Class[]{BevelModifierData.class}, __io__block, __io__blockTable);
	}

}
