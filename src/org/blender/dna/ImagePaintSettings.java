package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ImagePaintSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=76, size64=104)
public class ImagePaintSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ImagePaintSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ImagePaintSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 170;

	/**
	 * Field descriptor (offset) for struct member 'paint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__paint);
	 * CPointer&lt;Paint&gt; p_paint = p.cast(new Class[]{Paint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint'</li>
	 * <li>Signature: 'Paint'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'missing_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__missing_data);
	 * CPointer&lt;Short&gt; p_missing_data = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'missing_data'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__missing_data = new long[]{30, 42};

	/**
	 * Field descriptor (offset) for struct member 'seam_bleed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__seam_bleed);
	 * CPointer&lt;Short&gt; p_seam_bleed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seam_bleed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seam_bleed = new long[]{32, 44};

	/**
	 * Field descriptor (offset) for struct member 'normal_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__normal_angle);
	 * CPointer&lt;Short&gt; p_normal_angle = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_angle'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_angle = new long[]{34, 46};

	/**
	 * Field descriptor (offset) for struct member 'screen_grab_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__screen_grab_size);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_screen_grab_size = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screen_grab_size'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screen_grab_size = new long[]{36, 48};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{40, 52};

	/**
	 * Field descriptor (offset) for struct member 'paintcursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__paintcursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paintcursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paintcursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paintcursor = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member 'stencil'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__stencil);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_stencil = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stencil'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stencil = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'clone'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__clone);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_clone = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clone'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clone = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'canvas'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__canvas);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_canvas = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'canvas'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__canvas = new long[]{56, 80};

	/**
	 * Field descriptor (offset) for struct member 'stencil_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__stencil_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stencil_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stencil_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stencil_col = new long[]{60, 88};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__pad1);
	 * CPointer&lt;Float&gt; p_pad1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{72, 100};

	public ImagePaintSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImagePaintSettings(ImagePaintSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public Paint getPaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public void setPaint(Paint paint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(paint, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint);
		} else {
			__io__generic__copy( getPaint(), paint);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, flag);
		} else {
			__io__block.writeShort(__io__address + 28, flag);
		}
	}

	/**
	 * Get method for struct member 'missing_data'.
	 * @see #__DNA__FIELD__missing_data
	 */
	
	public short getMissing_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'missing_data'.
	 * @see #__DNA__FIELD__missing_data
	 */
	
	public void setMissing_data(short missing_data) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, missing_data);
		} else {
			__io__block.writeShort(__io__address + 30, missing_data);
		}
	}

	/**
	 * Get method for struct member 'seam_bleed'.
	 * @see #__DNA__FIELD__seam_bleed
	 */
	
	public short getSeam_bleed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'seam_bleed'.
	 * @see #__DNA__FIELD__seam_bleed
	 */
	
	public void setSeam_bleed(short seam_bleed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, seam_bleed);
		} else {
			__io__block.writeShort(__io__address + 32, seam_bleed);
		}
	}

	/**
	 * Get method for struct member 'normal_angle'.
	 * @see #__DNA__FIELD__normal_angle
	 */
	
	public short getNormal_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'normal_angle'.
	 * @see #__DNA__FIELD__normal_angle
	 */
	
	public void setNormal_angle(short normal_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, normal_angle);
		} else {
			__io__block.writeShort(__io__address + 34, normal_angle);
		}
	}

	/**
	 * Get method for struct member 'screen_grab_size'.
	 * @see #__DNA__FIELD__screen_grab_size
	 */
	
	public CArrayFacade<Short> getScreen_grab_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'screen_grab_size'.
	 * @see #__DNA__FIELD__screen_grab_size
	 */
	
	public void setScreen_grab_size(CArrayFacade<Short> screen_grab_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(screen_grab_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, screen_grab_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, screen_grab_size);
		} else {
			__io__generic__copy( getScreen_grab_size(), screen_grab_size);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, mode);
		} else {
			__io__block.writeInt(__io__address + 40, mode);
		}
	}

	/**
	 * Get method for struct member 'paintcursor'.
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public CPointer<Object> getPaintcursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paintcursor'.
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public void setPaintcursor(CPointer<Object> paintcursor) throws IOException
	{
		long __address = ((paintcursor == null) ? 0 : paintcursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'stencil'.
	 * @see #__DNA__FIELD__stencil
	 */
	
	public CPointer<Image> getStencil() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stencil'.
	 * @see #__DNA__FIELD__stencil
	 */
	
	public void setStencil(CPointer<Image> stencil) throws IOException
	{
		long __address = ((stencil == null) ? 0 : stencil.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'clone'.
	 * @see #__DNA__FIELD__clone
	 */
	
	public CPointer<Image> getClone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clone'.
	 * @see #__DNA__FIELD__clone
	 */
	
	public void setClone(CPointer<Image> clone) throws IOException
	{
		long __address = ((clone == null) ? 0 : clone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'canvas'.
	 * @see #__DNA__FIELD__canvas
	 */
	
	public CPointer<Image> getCanvas() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'canvas'.
	 * @see #__DNA__FIELD__canvas
	 */
	
	public void setCanvas(CPointer<Image> canvas) throws IOException
	{
		long __address = ((canvas == null) ? 0 : canvas.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'stencil_col'.
	 * @see #__DNA__FIELD__stencil_col
	 */
	
	public CArrayFacade<Float> getStencil_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stencil_col'.
	 * @see #__DNA__FIELD__stencil_col
	 */
	
	public void setStencil_col(CArrayFacade<Float> stencil_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(stencil_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stencil_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stencil_col);
		} else {
			__io__generic__copy( getStencil_col(), stencil_col);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public float getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(float pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, pad1);
		} else {
			__io__block.writeFloat(__io__address + 72, pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImagePaintSettings> __io__addressof() {
		return new CPointer<ImagePaintSettings>(__io__address, new Class[]{ImagePaintSettings.class}, __io__block, __io__blockTable);
	}

}
