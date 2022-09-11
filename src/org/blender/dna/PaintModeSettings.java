package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PaintModeSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  {@link Paint}  mode settings </p>
 */

@CMetaData(size32=48, size64=56)
public class PaintModeSettings extends CFacade {

	/**
	 * This is the sdna index of the struct PaintModeSettings.
	 * <p>
	 * It is required when allocating a new block to store data for PaintModeSettings.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 584;

	/**
	 * Field descriptor (offset) for struct member 'canvas_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Source to select canvas from
	 * <h4>Blender Source Code</h4>
	 * <p> Source to select canvas from to paint on (ePaintCanvasSource) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintModeSettings paintmodesettings = ...;
	 * CPointer&lt;Object&gt; p = paintmodesettings.__dna__addressof(PaintModeSettings.__DNA__FIELD__canvas_source);
	 * CPointer&lt;Byte&gt; p_canvas_source = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'canvas_source'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__canvas_source = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintModeSettings paintmodesettings = ...;
	 * CPointer&lt;Object&gt; p = paintmodesettings.__dna__addressof(PaintModeSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'canvas_image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Image used as as painting target
	 * <h4>Blender Source Code</h4>
	 * <p> Selected image when canvas_source=PAINT_CANVAS_SOURCE_IMAGE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintModeSettings paintmodesettings = ...;
	 * CPointer&lt;Object&gt; p = paintmodesettings.__dna__addressof(PaintModeSettings.__DNA__FIELD__canvas_image);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_canvas_image = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'canvas_image'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__canvas_image = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'image_user'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintModeSettings paintmodesettings = ...;
	 * CPointer&lt;Object&gt; p = paintmodesettings.__dna__addressof(PaintModeSettings.__DNA__FIELD__image_user);
	 * CPointer&lt;ImageUser&gt; p_image_user = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_user'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_user = new long[]{12, 16};

	public PaintModeSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PaintModeSettings(PaintModeSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'canvas_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Source to select canvas from
	 * <h4>Blender Source Code</h4>
	 * <p> Source to select canvas from to paint on (ePaintCanvasSource) </p>
	 * @see #__DNA__FIELD__canvas_source
	 */
	
	public byte getCanvas_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'canvas_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Source to select canvas from
	 * <h4>Blender Source Code</h4>
	 * <p> Source to select canvas from to paint on (ePaintCanvasSource) </p>
	 * @see #__DNA__FIELD__canvas_source
	 */
	
	public void setCanvas_source(byte canvas_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, canvas_source);
		} else {
			__io__block.writeByte(__io__address + 0, canvas_source);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1;
		} else {
			__dna__offset = 1;
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
	 * Get method for struct member 'canvas_image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Image used as as painting target
	 * <h4>Blender Source Code</h4>
	 * <p> Selected image when canvas_source=PAINT_CANVAS_SOURCE_IMAGE. </p>
	 * @see #__DNA__FIELD__canvas_image
	 */
	
	public CPointer<Image> getCanvas_image() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'canvas_image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Image used as as painting target
	 * <h4>Blender Source Code</h4>
	 * <p> Selected image when canvas_source=PAINT_CANVAS_SOURCE_IMAGE. </p>
	 * @see #__DNA__FIELD__canvas_image
	 */
	
	public void setCanvas_image(CPointer<Image> canvas_image) throws IOException
	{
		long __address = ((canvas_image == null) ? 0 : canvas_image.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'image_user'.
	 * @see #__DNA__FIELD__image_user
	 */
	
	public ImageUser getImage_user() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'image_user'.
	 * @see #__DNA__FIELD__image_user
	 */
	
	public void setImage_user(ImageUser image_user) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(image_user, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, image_user)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, image_user);
		} else {
			__io__generic__copy( getImage_user(), image_user);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PaintModeSettings> __io__addressof() {
		return new CPointer<PaintModeSettings>(__io__address, new Class[]{PaintModeSettings.class}, __io__block, __io__blockTable);
	}

}
