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
	public static final int __DNA__SDNA_INDEX = 243;

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
	 * Field descriptor (offset) for struct member 'sub_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD__sub_back);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_sub_back = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sub_back'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sub_back = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiPanelColors uipanelcolors = ...;
	 * CPointer&lt;Object&gt; p = uipanelcolors.__dna__addressof(uiPanelColors.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{12, 12};

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
	 * Get method for struct member 'sub_back'.
	 * @see #__DNA__FIELD__sub_back
	 */
	
	public CArrayFacade<Byte> getSub_back() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sub_back'.
	 * @see #__DNA__FIELD__sub_back
	 */
	
	public void setSub_back(CArrayFacade<Byte> sub_back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(sub_back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sub_back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sub_back);
		} else {
			__io__generic__copy( getSub_back(), sub_back);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiPanelColors> __io__addressof() {
		return new CPointer<uiPanelColors>(__io__address, new Class[]{uiPanelColors.class}, __io__block, __io__blockTable);
	}

}
