package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SubsurfModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=112, size64=136)
public class SubsurfModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SubsurfModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SubsurfModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 82;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'subdivType'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__subdivType);
	 * CPointer&lt;Short&gt; p_subdivType = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdivType'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdivType = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'levels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__levels);
	 * CPointer&lt;Short&gt; p_levels = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'levels'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__levels = new long[]{98, 114};

	/**
	 * Field descriptor (offset) for struct member 'renderLevels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__renderLevels);
	 * CPointer&lt;Short&gt; p_renderLevels = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderLevels'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderLevels = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{102, 118};

	/**
	 * Field descriptor (offset) for struct member 'emCache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__emCache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_emCache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emCache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emCache = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'mCache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__mCache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_mCache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mCache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mCache = new long[]{108, 128};

	public SubsurfModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SubsurfModifierData(SubsurfModifierData that) {
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
	 * Get method for struct member 'subdivType'.
	 * @see #__DNA__FIELD__subdivType
	 */
	
	public short getSubdivType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 112);
		} else {
			return __io__block.readShort(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'subdivType'.
	 * @see #__DNA__FIELD__subdivType
	 */
	
	public void setSubdivType(short subdivType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 112, subdivType);
		} else {
			__io__block.writeShort(__io__address + 96, subdivType);
		}
	}

	/**
	 * Get method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public short getLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 114);
		} else {
			return __io__block.readShort(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public void setLevels(short levels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 114, levels);
		} else {
			__io__block.writeShort(__io__address + 98, levels);
		}
	}

	/**
	 * Get method for struct member 'renderLevels'.
	 * @see #__DNA__FIELD__renderLevels
	 */
	
	public short getRenderLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 116);
		} else {
			return __io__block.readShort(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'renderLevels'.
	 * @see #__DNA__FIELD__renderLevels
	 */
	
	public void setRenderLevels(short renderLevels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 116, renderLevels);
		} else {
			__io__block.writeShort(__io__address + 100, renderLevels);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 118);
		} else {
			return __io__block.readShort(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 118, flags);
		} else {
			__io__block.writeShort(__io__address + 102, flags);
		}
	}

	/**
	 * Get method for struct member 'emCache'.
	 * @see #__DNA__FIELD__emCache
	 */
	
	public CPointer<Object> getEmCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'emCache'.
	 * @see #__DNA__FIELD__emCache
	 */
	
	public void setEmCache(CPointer<Object> emCache) throws IOException
	{
		long __address = ((emCache == null) ? 0 : emCache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'mCache'.
	 * @see #__DNA__FIELD__mCache
	 */
	
	public CPointer<Object> getMCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mCache'.
	 * @see #__DNA__FIELD__mCache
	 */
	
	public void setMCache(CPointer<Object> mCache) throws IOException
	{
		long __address = ((mCache == null) ? 0 : mCache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SubsurfModifierData> __io__addressof() {
		return new CPointer<SubsurfModifierData>(__io__address, new Class[]{SubsurfModifierData.class}, __io__block, __io__blockTable);
	}

}
