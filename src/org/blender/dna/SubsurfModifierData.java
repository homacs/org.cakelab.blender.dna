package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SubsurfModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=152)
public class SubsurfModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SubsurfModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SubsurfModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 97;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
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
	public static final long[] __DNA__FIELD__subdivType = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__levels = new long[]{102, 122};

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
	public static final long[] __DNA__FIELD__renderLevels = new long[]{104, 124};

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
	public static final long[] __DNA__FIELD__flags = new long[]{106, 126};

	/**
	 * Field descriptor (offset) for struct member 'uv_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__uv_smooth);
	 * CPointer&lt;Short&gt; p_uv_smooth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_smooth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_smooth = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD__quality);
	 * CPointer&lt;Short&gt; p_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{110, 130};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfModifierData subsurfmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = subsurfmodifierdata.__dna__addressof(SubsurfModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'emCache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO(sergey): Get rid of those with the old CCG subdivision code. </p>
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
	public static final long[] __DNA__FIELD__emCache = new long[]{116, 136};

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
	public static final long[] __DNA__FIELD__mCache = new long[]{120, 144};

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
			return __io__block.readShort(__io__address + 120);
		} else {
			return __io__block.readShort(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'subdivType'.
	 * @see #__DNA__FIELD__subdivType
	 */
	
	public void setSubdivType(short subdivType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 120, subdivType);
		} else {
			__io__block.writeShort(__io__address + 100, subdivType);
		}
	}

	/**
	 * Get method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public short getLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 122);
		} else {
			return __io__block.readShort(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public void setLevels(short levels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 122, levels);
		} else {
			__io__block.writeShort(__io__address + 102, levels);
		}
	}

	/**
	 * Get method for struct member 'renderLevels'.
	 * @see #__DNA__FIELD__renderLevels
	 */
	
	public short getRenderLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'renderLevels'.
	 * @see #__DNA__FIELD__renderLevels
	 */
	
	public void setRenderLevels(short renderLevels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, renderLevels);
		} else {
			__io__block.writeShort(__io__address + 104, renderLevels);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 126);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 126, flags);
		} else {
			__io__block.writeShort(__io__address + 106, flags);
		}
	}

	/**
	 * Get method for struct member 'uv_smooth'.
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public short getUv_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'uv_smooth'.
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public void setUv_smooth(short uv_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, uv_smooth);
		} else {
			__io__block.writeShort(__io__address + 108, uv_smooth);
		}
	}

	/**
	 * Get method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public short getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(short quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, quality);
		} else {
			__io__block.writeShort(__io__address + 110, quality);
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
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 132;
		} else {
			__dna__offset = 112;
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
	 * Get method for struct member 'emCache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO(sergey): Get rid of those with the old CCG subdivision code. </p>
	 * @see #__DNA__FIELD__emCache
	 */
	
	public CPointer<Object> getEmCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'emCache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO(sergey): Get rid of those with the old CCG subdivision code. </p>
	 * @see #__DNA__FIELD__emCache
	 */
	
	public void setEmCache(CPointer<Object> emCache) throws IOException
	{
		long __address = ((emCache == null) ? 0 : emCache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
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
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SubsurfModifierData> __io__addressof() {
		return new CPointer<SubsurfModifierData>(__io__address, new Class[]{SubsurfModifierData.class}, __io__block, __io__blockTable);
	}

}
