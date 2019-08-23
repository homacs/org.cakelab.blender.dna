package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ThemeWireColor'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> set of colors for use as a custom color set for Objects/Bones wire drawing </p>
 */

@CMetaData(size32=16, size64=16)
public class ThemeWireColor extends CFacade {

	/**
	 * This is the sdna index of the struct ThemeWireColor.
	 * <p>
	 * It is required when allocating a new block to store data for ThemeWireColor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 248;

	/**
	 * Field descriptor (offset) for struct member 'solid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeWireColor themewirecolor = ...;
	 * CPointer&lt;Object&gt; p = themewirecolor.__dna__addressof(ThemeWireColor.__DNA__FIELD__solid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_solid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solid'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solid = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeWireColor themewirecolor = ...;
	 * CPointer&lt;Object&gt; p = themewirecolor.__dna__addressof(ThemeWireColor.__DNA__FIELD__select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeWireColor themewirecolor = ...;
	 * CPointer&lt;Object&gt; p = themewirecolor.__dna__addressof(ThemeWireColor.__DNA__FIELD__active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eWireColor_Flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeWireColor themewirecolor = ...;
	 * CPointer&lt;Object&gt; p = themewirecolor.__dna__addressof(ThemeWireColor.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeWireColor themewirecolor = ...;
	 * CPointer&lt;Object&gt; p = themewirecolor.__dna__addressof(ThemeWireColor.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{14, 14};

	public ThemeWireColor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ThemeWireColor(ThemeWireColor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'solid'.
	 * @see #__DNA__FIELD__solid
	 */
	
	public CArrayFacade<Byte> getSolid() throws IOException
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
	 * Set method for struct member 'solid'.
	 * @see #__DNA__FIELD__solid
	 */
	
	public void setSolid(CArrayFacade<Byte> solid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(solid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, solid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, solid);
		} else {
			__io__generic__copy( getSolid(), solid);
		}
	}

	/**
	 * Get method for struct member 'select'.
	 * @see #__DNA__FIELD__select
	 */
	
	public CArrayFacade<Byte> getSelect() throws IOException
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
	 * Set method for struct member 'select'.
	 * @see #__DNA__FIELD__select
	 */
	
	public void setSelect(CArrayFacade<Byte> select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, select);
		} else {
			__io__generic__copy( getSelect(), select);
		}
	}

	/**
	 * Get method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public CArrayFacade<Byte> getActive() throws IOException
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
	 * Set method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(CArrayFacade<Byte> active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, active);
		} else {
			__io__generic__copy( getActive(), active);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eWireColor_Flags </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eWireColor_Flags </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, flag);
		} else {
			__io__block.writeShort(__io__address + 12, flag);
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
			return __io__block.readShort(__io__address + 14);
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
			__io__block.writeShort(__io__address + 14, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ThemeWireColor> __io__addressof() {
		return new CPointer<ThemeWireColor>(__io__address, new Class[]{ThemeWireColor.class}, __io__block, __io__blockTable);
	}

}
