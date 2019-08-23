package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskSpaceInfo'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class MaskSpaceInfo extends CFacade {

	/**
	 * This is the sdna index of the struct MaskSpaceInfo.
	 * <p>
	 * It is required when allocating a new block to store data for MaskSpaceInfo.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 225;

	/**
	 * Field descriptor (offset) for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> **** mask editing **** </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpaceInfo maskspaceinfo = ...;
	 * CPointer&lt;Object&gt; p = maskspaceinfo.__dna__addressof(MaskSpaceInfo.__DNA__FIELD__mask);
	 * CPointer&lt;CPointer&lt;Mask&gt;&gt; p_mask = p.cast(new Class[]{CPointer.class, Mask.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask'</li>
	 * <li>Signature: 'Mask*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'draw_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpaceInfo maskspaceinfo = ...;
	 * CPointer&lt;Object&gt; p = maskspaceinfo.__dna__addressof(MaskSpaceInfo.__DNA__FIELD__draw_flag);
	 * CPointer&lt;Byte&gt; p_draw_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'draw_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpaceInfo maskspaceinfo = ...;
	 * CPointer&lt;Object&gt; p = maskspaceinfo.__dna__addressof(MaskSpaceInfo.__DNA__FIELD__draw_type);
	 * CPointer&lt;Byte&gt; p_draw_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_type = new long[]{5, 9};

	/**
	 * Field descriptor (offset) for struct member 'overlay_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpaceInfo maskspaceinfo = ...;
	 * CPointer&lt;Object&gt; p = maskspaceinfo.__dna__addressof(MaskSpaceInfo.__DNA__FIELD__overlay_mode);
	 * CPointer&lt;Byte&gt; p_overlay_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlay_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlay_mode = new long[]{6, 10};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpaceInfo maskspaceinfo = ...;
	 * CPointer&lt;Object&gt; p = maskspaceinfo.__dna__addressof(MaskSpaceInfo.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{7, 11};

	public MaskSpaceInfo(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskSpaceInfo(MaskSpaceInfo that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> **** mask editing **** </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public CPointer<Mask> getMask() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mask.class};
		return new CPointer<Mask>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mask.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> **** mask editing **** </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public void setMask(CPointer<Mask> mask) throws IOException
	{
		long __address = ((mask == null) ? 0 : mask.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'draw_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw options </p>
	 * @see #__DNA__FIELD__draw_flag
	 */
	
	public byte getDraw_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'draw_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw options </p>
	 * @see #__DNA__FIELD__draw_flag
	 */
	
	public void setDraw_flag(byte draw_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, draw_flag);
		} else {
			__io__block.writeByte(__io__address + 4, draw_flag);
		}
	}

	/**
	 * Get method for struct member 'draw_type'.
	 * @see #__DNA__FIELD__draw_type
	 */
	
	public byte getDraw_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'draw_type'.
	 * @see #__DNA__FIELD__draw_type
	 */
	
	public void setDraw_type(byte draw_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, draw_type);
		} else {
			__io__block.writeByte(__io__address + 5, draw_type);
		}
	}

	/**
	 * Get method for struct member 'overlay_mode'.
	 * @see #__DNA__FIELD__overlay_mode
	 */
	
	public byte getOverlay_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'overlay_mode'.
	 * @see #__DNA__FIELD__overlay_mode
	 */
	
	public void setOverlay_mode(byte overlay_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10, overlay_mode);
		} else {
			__io__block.writeByte(__io__address + 6, overlay_mode);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 11, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 7, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 11;
		} else {
			__dna__offset = 7;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskSpaceInfo> __io__addressof() {
		return new CPointer<MaskSpaceInfo>(__io__address, new Class[]{MaskSpaceInfo.class}, __io__block, __io__blockTable);
	}

}
