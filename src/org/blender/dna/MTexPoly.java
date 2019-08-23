package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MTexPoly'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Assigns a texture to a polygon (face). If a {@link Mesh} has UV coordinates, each entry in mpoly (defining the face) has a corresponding mtexpoly entry to assign a texture to it.
 */

@CMetaData(size32=12, size64=16)
public class MTexPoly extends CFacade {

	/**
	 * This is the sdna index of the struct MTexPoly.
	 * <p>
	 * It is required when allocating a new block to store data for MTexPoly.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 67;

	/**
	 * Field descriptor (offset) for struct member 'tpage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the assigned texture.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__tpage);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_tpage = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tpage'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tpage = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// TF_SELECT = (1 << 0),  // use MFace hide flag (after 2.43), should be able to reuse after 2.44 
	 * 	// TF_ACTIVE = (1 << 1),  // deprecated! 
	 * 	TF_SEL1   = (1 << 2),
	 * 	TF_SEL2   = (1 << 3),
	 * 	TF_SEL3   = (1 << 4),
	 * 	TF_SEL4   = (1 << 5),
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'transp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__transp);
	 * CPointer&lt;Byte&gt; p_transp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transp = new long[]{5, 9};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{6, 10};

	/**
	 * Field descriptor (offset) for struct member 'tile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__tile);
	 * CPointer&lt;Short&gt; p_tile = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTexPoly mtexpoly = ...;
	 * CPointer&lt;Object&gt; p = mtexpoly.__dna__addressof(MTexPoly.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{10, 14};

	public MTexPoly(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MTexPoly(MTexPoly that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tpage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the assigned texture.
	 * @see #__DNA__FIELD__tpage
	 */
	
	public CPointer<Image> getTpage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tpage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the assigned texture.
	 * @see #__DNA__FIELD__tpage
	 */
	
	public void setTpage(CPointer<Image> tpage) throws IOException
	{
		long __address = ((tpage == null) ? 0 : tpage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// TF_SELECT = (1 << 0),  // use MFace hide flag (after 2.43), should be able to reuse after 2.44 
	 * 	// TF_ACTIVE = (1 << 1),  // deprecated! 
	 * 	TF_SEL1   = (1 << 2),
	 * 	TF_SEL2   = (1 << 3),
	 * 	TF_SEL3   = (1 << 4),
	 * 	TF_SEL4   = (1 << 5),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// TF_SELECT = (1 << 0),  // use MFace hide flag (after 2.43), should be able to reuse after 2.44 
	 * 	// TF_ACTIVE = (1 << 1),  // deprecated! 
	 * 	TF_SEL1   = (1 << 2),
	 * 	TF_SEL2   = (1 << 3),
	 * 	TF_SEL3   = (1 << 4),
	 * 	TF_SEL4   = (1 << 5),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, flag);
		} else {
			__io__block.writeByte(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public byte getTransp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'transp'.
	 * @see #__DNA__FIELD__transp
	 */
	
	public void setTransp(byte transp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, transp);
		} else {
			__io__block.writeByte(__io__address + 5, transp);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, mode);
		} else {
			__io__block.writeShort(__io__address + 6, mode);
		}
	}

	/**
	 * Get method for struct member 'tile'.
	 * @see #__DNA__FIELD__tile
	 */
	
	public short getTile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'tile'.
	 * @see #__DNA__FIELD__tile
	 */
	
	public void setTile(short tile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, tile);
		} else {
			__io__block.writeShort(__io__address + 8, tile);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, pad);
		} else {
			__io__block.writeShort(__io__address + 10, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MTexPoly> __io__addressof() {
		return new CPointer<MTexPoly>(__io__address, new Class[]{MTexPoly.class}, __io__block, __io__blockTable);
	}

}
