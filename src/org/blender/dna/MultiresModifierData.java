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
 * Generated facet for DNA struct type 'MultiresModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=152)
public class MultiresModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MultiresModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MultiresModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 120;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'lvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__lvl);
	 * CPointer&lt;Byte&gt; p_lvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lvl = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'sculptlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__sculptlvl);
	 * CPointer&lt;Byte&gt; p_sculptlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculptlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculptlvl = new long[]{113, 137};

	/**
	 * Field descriptor (offset) for struct member 'renderlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__renderlvl);
	 * CPointer&lt;Byte&gt; p_renderlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderlvl = new long[]{114, 138};

	/**
	 * Field descriptor (offset) for struct member 'totlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__totlvl);
	 * CPointer&lt;Byte&gt; p_totlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totlvl = new long[]{115, 139};

	/**
	 * Field descriptor (offset) for struct member 'simple'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__simple);
	 * CPointer&lt;Byte&gt; p_simple = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simple'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simple = new long[]{116, 140};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Byte&gt; p_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{117, 141};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{118, 142};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__quality);
	 * CPointer&lt;Short&gt; p_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{120, 144};

	/**
	 * Field descriptor (offset) for struct member 'uv_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__uv_smooth);
	 * CPointer&lt;Short&gt; p_uv_smooth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_smooth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_smooth = new long[]{122, 146};

	/**
	 * Field descriptor (offset) for struct member 'boundary_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__boundary_smooth);
	 * CPointer&lt;Short&gt; p_boundary_smooth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_smooth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_smooth = new long[]{124, 148};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{126, 150};

	public MultiresModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MultiresModifierData(MultiresModifierData that) {
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
	 * Get method for struct member 'lvl'.
	 * @see #__DNA__FIELD__lvl
	 */
	
	public byte getLvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 136);
		} else {
			return __io__block.readByte(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'lvl'.
	 * @see #__DNA__FIELD__lvl
	 */
	
	public void setLvl(byte lvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 136, lvl);
		} else {
			__io__block.writeByte(__io__address + 112, lvl);
		}
	}

	/**
	 * Get method for struct member 'sculptlvl'.
	 * @see #__DNA__FIELD__sculptlvl
	 */
	
	public byte getSculptlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 137);
		} else {
			return __io__block.readByte(__io__address + 113);
		}
	}

	/**
	 * Set method for struct member 'sculptlvl'.
	 * @see #__DNA__FIELD__sculptlvl
	 */
	
	public void setSculptlvl(byte sculptlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 137, sculptlvl);
		} else {
			__io__block.writeByte(__io__address + 113, sculptlvl);
		}
	}

	/**
	 * Get method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public byte getRenderlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 138);
		} else {
			return __io__block.readByte(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public void setRenderlvl(byte renderlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 138, renderlvl);
		} else {
			__io__block.writeByte(__io__address + 114, renderlvl);
		}
	}

	/**
	 * Get method for struct member 'totlvl'.
	 * @see #__DNA__FIELD__totlvl
	 */
	
	public byte getTotlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 139);
		} else {
			return __io__block.readByte(__io__address + 115);
		}
	}

	/**
	 * Set method for struct member 'totlvl'.
	 * @see #__DNA__FIELD__totlvl
	 */
	
	public void setTotlvl(byte totlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 139, totlvl);
		} else {
			__io__block.writeByte(__io__address + 115, totlvl);
		}
	}

	/**
	 * Get method for struct member 'simple'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__simple
	 */
	
	public byte getSimple() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 140);
		} else {
			return __io__block.readByte(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'simple'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__simple
	 */
	
	public void setSimple(byte simple) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 140, simple);
		} else {
			__io__block.writeByte(__io__address + 116, simple);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public byte getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 141);
		} else {
			return __io__block.readByte(__io__address + 117);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(byte flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 141, flags);
		} else {
			__io__block.writeByte(__io__address + 117, flags);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 142, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 118, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 142;
		} else {
			__dna__offset = 118;
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
	 * Get method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public short getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(short quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 144, quality);
		} else {
			__io__block.writeShort(__io__address + 120, quality);
		}
	}

	/**
	 * Get method for struct member 'uv_smooth'.
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public short getUv_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 146);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'uv_smooth'.
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public void setUv_smooth(short uv_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 146, uv_smooth);
		} else {
			__io__block.writeShort(__io__address + 122, uv_smooth);
		}
	}

	/**
	 * Get method for struct member 'boundary_smooth'.
	 * @see #__DNA__FIELD__boundary_smooth
	 */
	
	public short getBoundary_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 148);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'boundary_smooth'.
	 * @see #__DNA__FIELD__boundary_smooth
	 */
	
	public void setBoundary_smooth(short boundary_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 148, boundary_smooth);
		} else {
			__io__block.writeShort(__io__address + 124, boundary_smooth);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 150, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 126, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 150;
		} else {
			__dna__offset = 126;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiresModifierData> __io__addressof() {
		return new CPointer<MultiresModifierData>(__io__address, new Class[]{MultiresModifierData.class}, __io__block, __io__blockTable);
	}

}
