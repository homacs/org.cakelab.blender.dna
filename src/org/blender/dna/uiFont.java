package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiFont'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> default fonts to load/initalize first font is the default (index 0), others optional </p>
 */

@CMetaData(size32=1040, size64=1048)
public class uiFont extends CFacade {

	/**
	 * This is the sdna index of the struct uiFont.
	 * <p>
	 * It is required when allocating a new block to store data for uiFont.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 235;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;uiFont&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, uiFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'uiFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;uiFont&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, uiFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'uiFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__filename);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filename = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filename'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filename = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'blf_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> from blfont lib </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__blf_id);
	 * CPointer&lt;Short&gt; p_blf_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blf_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blf_id = new long[]{1032, 1040};

	/**
	 * Field descriptor (offset) for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> own id </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__uifont_id);
	 * CPointer&lt;Short&gt; p_uifont_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uifont_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uifont_id = new long[]{1034, 1042};

	/**
	 * Field descriptor (offset) for struct member 'r_to_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fonts that read from left to right </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__r_to_l);
	 * CPointer&lt;Short&gt; p_r_to_l = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r_to_l'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r_to_l = new long[]{1036, 1044};

	/**
	 * Field descriptor (offset) for struct member 'hinting'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFont uifont = ...;
	 * CPointer&lt;Object&gt; p = uifont.__dna__addressof(uiFont.__DNA__FIELD__hinting);
	 * CPointer&lt;Short&gt; p_hinting = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hinting'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hinting = new long[]{1038, 1046};

	public uiFont(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiFont(uiFont that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<uiFont> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiFont.class};
		return new CPointer<uiFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<uiFont> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<uiFont> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiFont.class};
		return new CPointer<uiFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<uiFont> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public CArrayFacade<Byte> getFilename() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filename'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filename
	 */
	
	public void setFilename(CArrayFacade<Byte> filename) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(filename, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filename)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filename);
		} else {
			__io__generic__copy( getFilename(), filename);
		}
	}

	/**
	 * Get method for struct member 'blf_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> from blfont lib </p>
	 * @see #__DNA__FIELD__blf_id
	 */
	
	public short getBlf_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1040);
		} else {
			return __io__block.readShort(__io__address + 1032);
		}
	}

	/**
	 * Set method for struct member 'blf_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> from blfont lib </p>
	 * @see #__DNA__FIELD__blf_id
	 */
	
	public void setBlf_id(short blf_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1040, blf_id);
		} else {
			__io__block.writeShort(__io__address + 1032, blf_id);
		}
	}

	/**
	 * Get method for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> own id </p>
	 * @see #__DNA__FIELD__uifont_id
	 */
	
	public short getUifont_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1042);
		} else {
			return __io__block.readShort(__io__address + 1034);
		}
	}

	/**
	 * Set method for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> own id </p>
	 * @see #__DNA__FIELD__uifont_id
	 */
	
	public void setUifont_id(short uifont_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1042, uifont_id);
		} else {
			__io__block.writeShort(__io__address + 1034, uifont_id);
		}
	}

	/**
	 * Get method for struct member 'r_to_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fonts that read from left to right </p>
	 * @see #__DNA__FIELD__r_to_l
	 */
	
	public short getR_to_l() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1044);
		} else {
			return __io__block.readShort(__io__address + 1036);
		}
	}

	/**
	 * Set method for struct member 'r_to_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fonts that read from left to right </p>
	 * @see #__DNA__FIELD__r_to_l
	 */
	
	public void setR_to_l(short r_to_l) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1044, r_to_l);
		} else {
			__io__block.writeShort(__io__address + 1036, r_to_l);
		}
	}

	/**
	 * Get method for struct member 'hinting'.
	 * @see #__DNA__FIELD__hinting
	 */
	
	public short getHinting() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1046);
		} else {
			return __io__block.readShort(__io__address + 1038);
		}
	}

	/**
	 * Set method for struct member 'hinting'.
	 * @see #__DNA__FIELD__hinting
	 */
	
	public void setHinting(short hinting) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1046, hinting);
		} else {
			__io__block.writeShort(__io__address + 1038, hinting);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiFont> __io__addressof() {
		return new CPointer<uiFont>(__io__address, new Class[]{uiFont.class}, __io__block, __io__blockTable);
	}

}
