package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=104, size64=120)
public class MultiresModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MultiresModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MultiresModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
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
	 * <li>Actual Size (32bit/64bit): 96/112</li>
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
	public static final long[] __DNA__FIELD__lvl = new long[]{96, 112};

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
	public static final long[] __DNA__FIELD__sculptlvl = new long[]{97, 113};

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
	public static final long[] __DNA__FIELD__renderlvl = new long[]{98, 114};

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
	public static final long[] __DNA__FIELD__totlvl = new long[]{99, 115};

	/**
	 * Field descriptor (offset) for struct member 'simple'.
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
	public static final long[] __DNA__FIELD__simple = new long[]{100, 116};

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
	public static final long[] __DNA__FIELD__flags = new long[]{101, 117};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresModifierData multiresmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiresmodifierdata.__dna__addressof(MultiresModifierData.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{102, 118};

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
			return __io__block.readByte(__io__address + 112);
		} else {
			return __io__block.readByte(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'lvl'.
	 * @see #__DNA__FIELD__lvl
	 */
	
	public void setLvl(byte lvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 112, lvl);
		} else {
			__io__block.writeByte(__io__address + 96, lvl);
		}
	}

	/**
	 * Get method for struct member 'sculptlvl'.
	 * @see #__DNA__FIELD__sculptlvl
	 */
	
	public byte getSculptlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 113);
		} else {
			return __io__block.readByte(__io__address + 97);
		}
	}

	/**
	 * Set method for struct member 'sculptlvl'.
	 * @see #__DNA__FIELD__sculptlvl
	 */
	
	public void setSculptlvl(byte sculptlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 113, sculptlvl);
		} else {
			__io__block.writeByte(__io__address + 97, sculptlvl);
		}
	}

	/**
	 * Get method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public byte getRenderlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 114);
		} else {
			return __io__block.readByte(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public void setRenderlvl(byte renderlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 114, renderlvl);
		} else {
			__io__block.writeByte(__io__address + 98, renderlvl);
		}
	}

	/**
	 * Get method for struct member 'totlvl'.
	 * @see #__DNA__FIELD__totlvl
	 */
	
	public byte getTotlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 115);
		} else {
			return __io__block.readByte(__io__address + 99);
		}
	}

	/**
	 * Set method for struct member 'totlvl'.
	 * @see #__DNA__FIELD__totlvl
	 */
	
	public void setTotlvl(byte totlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 115, totlvl);
		} else {
			__io__block.writeByte(__io__address + 99, totlvl);
		}
	}

	/**
	 * Get method for struct member 'simple'.
	 * @see #__DNA__FIELD__simple
	 */
	
	public byte getSimple() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 116);
		} else {
			return __io__block.readByte(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'simple'.
	 * @see #__DNA__FIELD__simple
	 */
	
	public void setSimple(byte simple) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 116, simple);
		} else {
			__io__block.writeByte(__io__address + 100, simple);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public byte getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 117);
		} else {
			return __io__block.readByte(__io__address + 101);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(byte flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 117, flags);
		} else {
			__io__block.writeByte(__io__address + 101, flags);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 118, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 102, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 118;
		} else {
			__dna__offset = 102;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiresModifierData> __io__addressof() {
		return new CPointer<MultiresModifierData>(__io__address, new Class[]{MultiresModifierData.class}, __io__block, __io__blockTable);
	}

}
