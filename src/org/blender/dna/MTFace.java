package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MTFace'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> tessellation uv face data </p>
 */

@CMetaData(size32=44, size64=48)
public class MTFace extends CFacade {

	/**
	 * This is the sdna index of the struct MTFace.
	 * <p>
	 * It is required when allocating a new block to store data for MTFace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 71;

	/**
	 * Field descriptor (offset) for struct member 'uv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__uv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_uv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv'</li>
	 * <li>Signature: 'float[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tpage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__tpage);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_tpage = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tpage'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tpage = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'transp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__transp);
	 * CPointer&lt;Byte&gt; p_transp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transp = new long[]{37, 41};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{38, 42};

	/**
	 * Field descriptor (offset) for struct member 'tile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__tile);
	 * CPointer&lt;Short&gt; p_tile = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'unwrap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTFace mtface = ...;
	 * CPointer&lt;Object&gt; p = mtface.__dna__addressof(MTFace.__DNA__FIELD__unwrap);
	 * CPointer&lt;Short&gt; p_unwrap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unwrap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unwrap = new long[]{42, 46};

	public MTFace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MTFace(MTFace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getUv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public void setUv(CArrayFacade<CArrayFacade<Float>> uv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(uv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv);
		} else {
			__io__generic__copy( getUv(), uv);
		}
	}

	/**
	 * Get method for struct member 'tpage'.
	 * @see #__DNA__FIELD__tpage
	 */
	
	public CPointer<Image> getTpage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tpage'.
	 * @see #__DNA__FIELD__tpage
	 */
	
	public void setTpage(CPointer<Image> tpage) throws IOException
	{
		long __address = ((tpage == null) ? 0 : tpage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 40);
		} else {
			return __io__block.readByte(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 40, flag);
		} else {
			__io__block.writeByte(__io__address + 36, flag);
		}
	}

	/**
	 * Get method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public byte getTransp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 41);
		} else {
			return __io__block.readByte(__io__address + 37);
		}
	}

	/**
	 * Set method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public void setTransp(byte transp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 41, transp);
		} else {
			__io__block.writeByte(__io__address + 37, transp);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 38);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, mode);
		} else {
			__io__block.writeShort(__io__address + 38, mode);
		}
	}

	/**
	 * Get method for struct member 'tile'.
	 * @see #__DNA__FIELD__tile
	 */
	
	public short getTile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'tile'.
	 * @see #__DNA__FIELD__tile
	 */
	
	public void setTile(short tile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, tile);
		} else {
			__io__block.writeShort(__io__address + 40, tile);
		}
	}

	/**
	 * Get method for struct member 'unwrap'.
	 * @see #__DNA__FIELD__unwrap
	 */
	
	public short getUnwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'unwrap'.
	 * @see #__DNA__FIELD__unwrap
	 */
	
	public void setUnwrap(short unwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, unwrap);
		} else {
			__io__block.writeShort(__io__address + 42, unwrap);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MTFace> __io__addressof() {
		return new CPointer<MTFace>(__io__address, new Class[]{MTFace.class}, __io__block, __io__blockTable);
	}

}
