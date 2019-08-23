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
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  {@link Image}  {@link Paint}  Texture/Image Editor </p>
 */

@CMetaData(size32=124, size64=160)
public class ImagePaintSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ImagePaintSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ImagePaintSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 188;

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
	 * <li>Actual Size (32bit/64bit): 68/88</li>
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
	public static final long[] __DNA__FIELD__flag = new long[]{68, 88};

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
	public static final long[] __DNA__FIELD__missing_data = new long[]{70, 90};

	/**
	 * Field descriptor (offset) for struct member 'seam_bleed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for projection painting only </p>
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
	public static final long[] __DNA__FIELD__seam_bleed = new long[]{72, 92};

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
	public static final long[] __DNA__FIELD__normal_angle = new long[]{74, 94};

	/**
	 * Field descriptor (offset) for struct member 'screen_grab_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Capture size for re-projection. </p>
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
	public static final long[] __DNA__FIELD__screen_grab_size = new long[]{76, 96};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mode used for texture painting. </p>
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
	public static final long[] __DNA__FIELD__mode = new long[]{80, 100};

	/**
	 * Field descriptor (offset) for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Wm handle. </p>
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
	public static final long[] __DNA__FIELD__paintcursor = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'stencil'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Workaround until we support true layer masks. </p>
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
	public static final long[] __DNA__FIELD__stencil = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clone layer for image mode for projective texture painting. </p>
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
	public static final long[] __DNA__FIELD__clone = new long[]{92, 120};

	/**
	 * Field descriptor (offset) for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Canvas when the explicit system is used for painting. </p>
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
	public static final long[] __DNA__FIELD__canvas = new long[]{96, 128};

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
	public static final long[] __DNA__FIELD__stencil_col = new long[]{100, 136};

	/**
	 * Field descriptor (offset) for struct member 'dither'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dither amount used when painting on byte images. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__dither);
	 * CPointer&lt;Float&gt; p_dither = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dither'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dither = new long[]{112, 148};

	/**
	 * Field descriptor (offset) for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display texture interpolation method. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD__interp);
	 * CPointer&lt;Integer&gt; p_interp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePaintSettings imagepaintsettings = ...;
	 * CPointer&lt;Object&gt; p = imagepaintsettings.__dna__addressof(ImagePaintSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{120, 156};

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
			return __io__block.readShort(__io__address + 88);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 88, flag);
		} else {
			__io__block.writeShort(__io__address + 68, flag);
		}
	}

	/**
	 * Get method for struct member 'missing_data'.
	 * @see #__DNA__FIELD__missing_data
	 */
	
	public short getMissing_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 90);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'missing_data'.
	 * @see #__DNA__FIELD__missing_data
	 */
	
	public void setMissing_data(short missing_data) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 90, missing_data);
		} else {
			__io__block.writeShort(__io__address + 70, missing_data);
		}
	}

	/**
	 * Get method for struct member 'seam_bleed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for projection painting only </p>
	 * @see #__DNA__FIELD__seam_bleed
	 */
	
	public short getSeam_bleed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 92);
		} else {
			return __io__block.readShort(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'seam_bleed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for projection painting only </p>
	 * @see #__DNA__FIELD__seam_bleed
	 */
	
	public void setSeam_bleed(short seam_bleed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 92, seam_bleed);
		} else {
			__io__block.writeShort(__io__address + 72, seam_bleed);
		}
	}

	/**
	 * Get method for struct member 'normal_angle'.
	 * @see #__DNA__FIELD__normal_angle
	 */
	
	public short getNormal_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 94);
		} else {
			return __io__block.readShort(__io__address + 74);
		}
	}

	/**
	 * Set method for struct member 'normal_angle'.
	 * @see #__DNA__FIELD__normal_angle
	 */
	
	public void setNormal_angle(short normal_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 94, normal_angle);
		} else {
			__io__block.writeShort(__io__address + 74, normal_angle);
		}
	}

	/**
	 * Get method for struct member 'screen_grab_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Capture size for re-projection. </p>
	 * @see #__DNA__FIELD__screen_grab_size
	 */
	
	public CArrayFacade<Short> getScreen_grab_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'screen_grab_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Capture size for re-projection. </p>
	 * @see #__DNA__FIELD__screen_grab_size
	 */
	
	public void setScreen_grab_size(CArrayFacade<Short> screen_grab_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 76;
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mode used for texture painting. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mode used for texture painting. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, mode);
		} else {
			__io__block.writeInt(__io__address + 80, mode);
		}
	}

	/**
	 * Get method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Wm handle. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public CPointer<Object> getPaintcursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Wm handle. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public void setPaintcursor(CPointer<Object> paintcursor) throws IOException
	{
		long __address = ((paintcursor == null) ? 0 : paintcursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'stencil'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Workaround until we support true layer masks. </p>
	 * @see #__DNA__FIELD__stencil
	 */
	
	public CPointer<Image> getStencil() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stencil'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Workaround until we support true layer masks. </p>
	 * @see #__DNA__FIELD__stencil
	 */
	
	public void setStencil(CPointer<Image> stencil) throws IOException
	{
		long __address = ((stencil == null) ? 0 : stencil.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clone layer for image mode for projective texture painting. </p>
	 * @see #__DNA__FIELD__clone
	 */
	
	public CPointer<Image> getClone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Clone layer for image mode for projective texture painting. </p>
	 * @see #__DNA__FIELD__clone
	 */
	
	public void setClone(CPointer<Image> clone) throws IOException
	{
		long __address = ((clone == null) ? 0 : clone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Canvas when the explicit system is used for painting. </p>
	 * @see #__DNA__FIELD__canvas
	 */
	
	public CPointer<Image> getCanvas() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'canvas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Canvas when the explicit system is used for painting. </p>
	 * @see #__DNA__FIELD__canvas
	 */
	
	public void setCanvas(CPointer<Image> canvas) throws IOException
	{
		long __address = ((canvas == null) ? 0 : canvas.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
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
			return new CArrayFacade<Float>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 136;
		} else {
			__dna__offset = 100;
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
	 * Get method for struct member 'dither'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dither amount used when painting on byte images. </p>
	 * @see #__DNA__FIELD__dither
	 */
	
	public float getDither() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'dither'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dither amount used when painting on byte images. </p>
	 * @see #__DNA__FIELD__dither
	 */
	
	public void setDither(float dither) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, dither);
		} else {
			__io__block.writeFloat(__io__address + 112, dither);
		}
	}

	/**
	 * Get method for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display texture interpolation method. </p>
	 * @see #__DNA__FIELD__interp
	 */
	
	public int getInterp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display texture interpolation method. </p>
	 * @see #__DNA__FIELD__interp
	 */
	
	public void setInterp(int interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, interp);
		} else {
			__io__block.writeInt(__io__address + 116, interp);
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
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 156;
		} else {
			__dna__offset = 120;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImagePaintSettings> __io__addressof() {
		return new CPointer<ImagePaintSettings>(__io__address, new Class[]{ImagePaintSettings.class}, __io__block, __io__blockTable);
	}

}
