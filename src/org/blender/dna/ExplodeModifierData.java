package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ExplodeModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=176, size64=200)
public class ExplodeModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ExplodeModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ExplodeModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 125;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'facepa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__facepa);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_facepa = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'facepa'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__facepa = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'vgroup'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__vgroup);
	 * CPointer&lt;Short&gt; p_vgroup = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup = new long[]{106, 130};

	/**
	 * Field descriptor (offset) for struct member 'protect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__protect);
	 * CPointer&lt;Float&gt; p_protect = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'protect'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__protect = new long[]{108, 132};

	/**
	 * Field descriptor (offset) for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ExplodeModifierData explodemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = explodemodifierdata.__dna__addressof(ExplodeModifierData.__DNA__FIELD__uvname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvname = new long[]{112, 136};

	public ExplodeModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ExplodeModifierData(ExplodeModifierData that) {
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
	 * Get method for struct member 'facepa'.
	 * @see #__DNA__FIELD__facepa
	 */
	
	public CPointer<Integer> getFacepa() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'facepa'.
	 * @see #__DNA__FIELD__facepa
	 */
	
	public void setFacepa(CPointer<Integer> facepa) throws IOException
	{
		long __address = ((facepa == null) ? 0 : facepa.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, flag);
		} else {
			__io__block.writeShort(__io__address + 104, flag);
		}
	}

	/**
	 * Get method for struct member 'vgroup'.
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public short getVgroup() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'vgroup'.
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public void setVgroup(short vgroup) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, vgroup);
		} else {
			__io__block.writeShort(__io__address + 106, vgroup);
		}
	}

	/**
	 * Get method for struct member 'protect'.
	 * @see #__DNA__FIELD__protect
	 */
	
	public float getProtect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'protect'.
	 * @see #__DNA__FIELD__protect
	 */
	
	public void setProtect(float protect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, protect);
		} else {
			__io__block.writeFloat(__io__address + 108, protect);
		}
	}

	/**
	 * Get method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public CArrayFacade<Byte> getUvname() throws IOException
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
	 * Set method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public void setUvname(CArrayFacade<Byte> uvname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(uvname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvname);
		} else {
			__io__generic__copy( getUvname(), uvname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ExplodeModifierData> __io__addressof() {
		return new CPointer<ExplodeModifierData>(__io__address, new Class[]{ExplodeModifierData.class}, __io__block, __io__blockTable);
	}

}
