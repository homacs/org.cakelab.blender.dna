package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DynamicPaintCanvasSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Canvas settings </p>
 */

@CMetaData(size32=84, size64=96)
public class DynamicPaintCanvasSettings extends CFacade {

	/**
	 * This is the sdna index of the struct DynamicPaintCanvasSettings.
	 * <p>
	 * It is required when allocating a new block to store data for DynamicPaintCanvasSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 570;

	/**
	 * Field descriptor (offset) for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD__pmd);
	 * CPointer&lt;CPointer&lt;DynamicPaintModifierData&gt;&gt; p_pmd = p.cast(new Class[]{CPointer.class, DynamicPaintModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmd'</li>
	 * <li>Signature: 'DynamicPaintModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'surfaces'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD__surfaces);
	 * CPointer&lt;ListBase&gt; p_surfaces = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surfaces'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surfaces = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'active_sur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD__active_sur);
	 * CPointer&lt;Short&gt; p_active_sur = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_sur'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_sur = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{14, 26};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintCanvasSettings dynamicpaintcanvassettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintcanvassettings.__dna__addressof(DynamicPaintCanvasSettings.__DNA__FIELD__error);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_error = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error = new long[]{20, 32};

	public DynamicPaintCanvasSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DynamicPaintCanvasSettings(DynamicPaintCanvasSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__pmd
	 */
	
	public CPointer<DynamicPaintModifierData> getPmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DynamicPaintModifierData.class};
		return new CPointer<DynamicPaintModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DynamicPaintModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__pmd
	 */
	
	public void setPmd(CPointer<DynamicPaintModifierData> pmd) throws IOException
	{
		long __address = ((pmd == null) ? 0 : pmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'surfaces'.
	 * @see #__DNA__FIELD__surfaces
	 */
	
	public ListBase getSurfaces() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'surfaces'.
	 * @see #__DNA__FIELD__surfaces
	 */
	
	public void setSurfaces(ListBase surfaces) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(surfaces, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, surfaces)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, surfaces);
		} else {
			__io__generic__copy( getSurfaces(), surfaces);
		}
	}

	/**
	 * Get method for struct member 'active_sur'.
	 * @see #__DNA__FIELD__active_sur
	 */
	
	public short getActive_sur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'active_sur'.
	 * @see #__DNA__FIELD__active_sur
	 */
	
	public void setActive_sur(short active_sur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, active_sur);
		} else {
			__io__block.writeShort(__io__address + 12, active_sur);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, flags);
		} else {
			__io__block.writeShort(__io__address + 14, flags);
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
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public CArrayFacade<Byte> getError() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public void setError(CArrayFacade<Byte> error) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(error, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, error)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, error);
		} else {
			__io__generic__copy( getError(), error);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DynamicPaintCanvasSettings> __io__addressof() {
		return new CPointer<DynamicPaintCanvasSettings>(__io__address, new Class[]{DynamicPaintCanvasSettings.class}, __io__block, __io__blockTable);
	}

}
