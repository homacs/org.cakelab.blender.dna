package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiPanelColors'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class uiPanelColors extends CFacade {

	/**
	 * This is the sdna index of the struct uiPanelColors.
	 * <p>
	 * It is required when allocating a new block to store data for uiPanelColors.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 240;

	/**
	 * Field descriptor (offset) for struct member 'header'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__header);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_header = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'header'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__header = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__back);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_back = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'back'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__back = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'show_header'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__show_header);
	 * CPointer&lt;Short&gt; p_show_header = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'show_header'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__show_header = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'show_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__show_back);
	 * CPointer&lt;Short&gt; p_show_back = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'show_back'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__show_back = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{12, 12};

	public uiPanelColors(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiPanelColors(uiPanelColors that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'header'.
	 * @see #__DNA__FIELD__header
	 */
	
	public CArrayFacade<Byte> getHeader() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'header'.
	 * @see #__DNA__FIELD__header
	 */
	
	public void setHeader(CArrayFacade<Byte> header) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(header, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, header)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, header);
		} else {
			__io__generic__copy( getHeader(), header);
		}
	}

	/**
	 * Get method for struct member 'back'.
	 * @see #__DNA__FIELD__back
	 */
	
	public CArrayFacade<Byte> getBack() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'back'.
	 * @see #__DNA__FIELD__back
	 */
	
	public void setBack(CArrayFacade<Byte> back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, back);
		} else {
			__io__generic__copy( getBack(), back);
		}
	}

	/**
	 * Get method for struct member 'show_header'.
	 * @see #__DNA__FIELD__show_header
	 */
	
	public short getShow_header() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'show_header'.
	 * @see #__DNA__FIELD__show_header
	 */
	
	public void setShow_header(short show_header) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, show_header);
		} else {
			__io__block.writeShort(__io__address + 8, show_header);
		}
	}

	/**
	 * Get method for struct member 'show_back'.
	 * @see #__DNA__FIELD__show_back
	 */
	
	public short getShow_back() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'show_back'.
	 * @see #__DNA__FIELD__show_back
	 */
	
	public void setShow_back(short show_back) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, show_back);
		} else {
			__io__block.writeShort(__io__address + 10, show_back);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, pad);
		} else {
			__io__block.writeInt(__io__address + 12, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiPanelColors> __io__addressof() {
		return new CPointer<uiPanelColors>(__io__address, new Class[]{uiPanelColors.class}, __io__block, __io__blockTable);
	}

}
