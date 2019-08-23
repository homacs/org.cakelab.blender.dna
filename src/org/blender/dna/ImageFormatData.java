package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ImageFormatData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Generic image format settings, this is used for {@link NodeImageFile}  and IMAGE_OT_save_as operator too.</p><p> note: its a bit strange that even though this is an image format struct the imtype can still be used to select video formats. RNA ensures these enum's are only selectable for render output. </p>
 */

@CMetaData(size32=248, size64=256)
public class ImageFormatData extends CFacade {

	/**
	 * This is the sdna index of the struct ImageFormatData.
	 * <p>
	 * It is required when allocating a new block to store data for ImageFormatData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 180;

	/**
	 * Field descriptor (offset) for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_IMTYPE_PNG, R_... <h2>Note</h2><p> , video types should only ever be set from this structure when used from {@link RenderData} . </p> , video types should only ever be set from this structure when used from RenderData. 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__imtype);
	 * CPointer&lt;Byte&gt; p_imtype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imtype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imtype = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bits per channel, R_IMF_CHAN_DEPTH_8 -> 32, not a flag, only set 1 at a time. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__depth);
	 * CPointer&lt;Byte&gt; p_depth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_PLANES_BW, R_IMF_PLANES_RGB, R_IMF_PLANES_RGBA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__planes);
	 * CPointer&lt;Byte&gt; p_planes = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'planes'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__planes = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic options for all image types, alpha zbuffer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: jpeg quality. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__quality);
	 * CPointer&lt;Byte&gt; p_quality = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'compress'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: png compression. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__compress);
	 * CPointer&lt;Byte&gt; p_compress = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compress'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compress = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member 'exr_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><mdash/>  format specific <mdash/>  OpenEXR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__exr_codec);
	 * CPointer&lt;Byte&gt; p_exr_codec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'exr_codec'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__exr_codec = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'cineon_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cineon </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__cineon_flag);
	 * CPointer&lt;Byte&gt; p_cineon_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineon_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineon_flag = new long[]{7, 7};

	/**
	 * Field descriptor (offset) for struct member 'cineon_white'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__cineon_white);
	 * CPointer&lt;Short&gt; p_cineon_white = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineon_white'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineon_white = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'cineon_black'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__cineon_black);
	 * CPointer&lt;Short&gt; p_cineon_black = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineon_black'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineon_black = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'cineon_gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__cineon_gamma);
	 * CPointer&lt;Float&gt; p_cineon_gamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineon_gamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineon_gamma = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'jp2_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Jpeg2000 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__jp2_flag);
	 * CPointer&lt;Byte&gt; p_jp2_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jp2_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jp2_flag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'jp2_codec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__jp2_codec);
	 * CPointer&lt;Byte&gt; p_jp2_codec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jp2_codec'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jp2_codec = new long[]{17, 17};

	/**
	 * Field descriptor (offset) for struct member 'tiff_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TIFF </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__tiff_codec);
	 * CPointer&lt;Byte&gt; p_tiff_codec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tiff_codec'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tiff_codec = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{19, 19};

	/**
	 * Field descriptor (offset) for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__views_format);
	 * CPointer&lt;Byte&gt; p_views_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views_format = new long[]{23, 23};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__stereo3d_format);
	 * CPointer&lt;Stereo3dFormat&gt; p_stereo3d_format = p.cast(new Class[]{Stereo3dFormat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_format'</li>
	 * <li>Signature: 'Stereo3dFormat'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_format = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__view_settings);
	 * CPointer&lt;ColorManagedViewSettings&gt; p_view_settings = p.cast(new Class[]{ColorManagedViewSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_settings'</li>
	 * <li>Signature: 'ColorManagedViewSettings'</li>
	 * <li>Actual Size (32bit/64bit): 152/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_settings = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'display_settings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageFormatData imageformatdata = ...;
	 * CPointer&lt;Object&gt; p = imageformatdata.__dna__addressof(ImageFormatData.__DNA__FIELD__display_settings);
	 * CPointer&lt;ColorManagedDisplaySettings&gt; p_display_settings = p.cast(new Class[]{ColorManagedDisplaySettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_settings'</li>
	 * <li>Signature: 'ColorManagedDisplaySettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_settings = new long[]{184, 192};

	public ImageFormatData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImageFormatData(ImageFormatData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_IMTYPE_PNG, R_... <h2>Note</h2><p> , video types should only ever be set from this structure when used from {@link RenderData} . </p> , video types should only ever be set from this structure when used from RenderData. 
	 * </p>
	 * @see #__DNA__FIELD__imtype
	 */
	
	public byte getImtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_IMTYPE_PNG, R_... <h2>Note</h2><p> , video types should only ever be set from this structure when used from {@link RenderData} . </p> , video types should only ever be set from this structure when used from RenderData. 
	 * </p>
	 * @see #__DNA__FIELD__imtype
	 */
	
	public void setImtype(byte imtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, imtype);
		} else {
			__io__block.writeByte(__io__address + 0, imtype);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bits per channel, R_IMF_CHAN_DEPTH_8 -> 32, not a flag, only set 1 at a time. </p>
	 * @see #__DNA__FIELD__depth
	 */
	
	public byte getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bits per channel, R_IMF_CHAN_DEPTH_8 -> 32, not a flag, only set 1 at a time. </p>
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(byte depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, depth);
		} else {
			__io__block.writeByte(__io__address + 1, depth);
		}
	}

	/**
	 * Get method for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_PLANES_BW, R_IMF_PLANES_RGB, R_IMF_PLANES_RGBA. </p>
	 * @see #__DNA__FIELD__planes
	 */
	
	public byte getPlanes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> R_IMF_PLANES_BW, R_IMF_PLANES_RGB, R_IMF_PLANES_RGBA. </p>
	 * @see #__DNA__FIELD__planes
	 */
	
	public void setPlanes(byte planes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, planes);
		} else {
			__io__block.writeByte(__io__address + 2, planes);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic options for all image types, alpha zbuffer. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic options for all image types, alpha zbuffer. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, flag);
		} else {
			__io__block.writeByte(__io__address + 3, flag);
		}
	}

	/**
	 * Get method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: jpeg quality. </p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public byte getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: jpeg quality. </p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(byte quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, quality);
		} else {
			__io__block.writeByte(__io__address + 4, quality);
		}
	}

	/**
	 * Get method for struct member 'compress'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: png compression. </p>
	 * @see #__DNA__FIELD__compress
	 */
	
	public byte getCompress() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'compress'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (0 - 100), eg: png compression. </p>
	 * @see #__DNA__FIELD__compress
	 */
	
	public void setCompress(byte compress) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, compress);
		} else {
			__io__block.writeByte(__io__address + 5, compress);
		}
	}

	/**
	 * Get method for struct member 'exr_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><mdash/>  format specific <mdash/>  OpenEXR </p>
	 * @see #__DNA__FIELD__exr_codec
	 */
	
	public byte getExr_codec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 6);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'exr_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><mdash/>  format specific <mdash/>  OpenEXR </p>
	 * @see #__DNA__FIELD__exr_codec
	 */
	
	public void setExr_codec(byte exr_codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 6, exr_codec);
		} else {
			__io__block.writeByte(__io__address + 6, exr_codec);
		}
	}

	/**
	 * Get method for struct member 'cineon_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cineon </p>
	 * @see #__DNA__FIELD__cineon_flag
	 */
	
	public byte getCineon_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 7);
		} else {
			return __io__block.readByte(__io__address + 7);
		}
	}

	/**
	 * Set method for struct member 'cineon_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cineon </p>
	 * @see #__DNA__FIELD__cineon_flag
	 */
	
	public void setCineon_flag(byte cineon_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 7, cineon_flag);
		} else {
			__io__block.writeByte(__io__address + 7, cineon_flag);
		}
	}

	/**
	 * Get method for struct member 'cineon_white'.
	 * @see #__DNA__FIELD__cineon_white
	 */
	
	public short getCineon_white() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'cineon_white'.
	 * @see #__DNA__FIELD__cineon_white
	 */
	
	public void setCineon_white(short cineon_white) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, cineon_white);
		} else {
			__io__block.writeShort(__io__address + 8, cineon_white);
		}
	}

	/**
	 * Get method for struct member 'cineon_black'.
	 * @see #__DNA__FIELD__cineon_black
	 */
	
	public short getCineon_black() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'cineon_black'.
	 * @see #__DNA__FIELD__cineon_black
	 */
	
	public void setCineon_black(short cineon_black) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, cineon_black);
		} else {
			__io__block.writeShort(__io__address + 10, cineon_black);
		}
	}

	/**
	 * Get method for struct member 'cineon_gamma'.
	 * @see #__DNA__FIELD__cineon_gamma
	 */
	
	public float getCineon_gamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'cineon_gamma'.
	 * @see #__DNA__FIELD__cineon_gamma
	 */
	
	public void setCineon_gamma(float cineon_gamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, cineon_gamma);
		} else {
			__io__block.writeFloat(__io__address + 12, cineon_gamma);
		}
	}

	/**
	 * Get method for struct member 'jp2_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Jpeg2000 </p>
	 * @see #__DNA__FIELD__jp2_flag
	 */
	
	public byte getJp2_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 16);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'jp2_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Jpeg2000 </p>
	 * @see #__DNA__FIELD__jp2_flag
	 */
	
	public void setJp2_flag(byte jp2_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 16, jp2_flag);
		} else {
			__io__block.writeByte(__io__address + 16, jp2_flag);
		}
	}

	/**
	 * Get method for struct member 'jp2_codec'.
	 * @see #__DNA__FIELD__jp2_codec
	 */
	
	public byte getJp2_codec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 17);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'jp2_codec'.
	 * @see #__DNA__FIELD__jp2_codec
	 */
	
	public void setJp2_codec(byte jp2_codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 17, jp2_codec);
		} else {
			__io__block.writeByte(__io__address + 17, jp2_codec);
		}
	}

	/**
	 * Get method for struct member 'tiff_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TIFF </p>
	 * @see #__DNA__FIELD__tiff_codec
	 */
	
	public byte getTiff_codec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 18);
		} else {
			return __io__block.readByte(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'tiff_codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TIFF </p>
	 * @see #__DNA__FIELD__tiff_codec
	 */
	
	public void setTiff_codec(byte tiff_codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 18, tiff_codec);
		} else {
			__io__block.writeByte(__io__address + 18, tiff_codec);
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
			return new CArrayFacade<Byte>(__io__address + 19, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 19, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 19;
		} else {
			__dna__offset = 19;
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
	 * Get method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * @see #__DNA__FIELD__views_format
	 */
	
	public byte getViews_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 23);
		} else {
			return __io__block.readByte(__io__address + 23);
		}
	}

	/**
	 * Set method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * @see #__DNA__FIELD__views_format
	 */
	
	public void setViews_format(byte views_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 23, views_format);
		} else {
			__io__block.writeByte(__io__address + 23, views_format);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public Stereo3dFormat getStereo3d_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Stereo3dFormat(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new Stereo3dFormat(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public void setStereo3d_format(Stereo3dFormat stereo3d_format) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(stereo3d_format, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stereo3d_format)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stereo3d_format);
		} else {
			__io__generic__copy( getStereo3d_format(), stereo3d_format);
		}
	}

	/**
	 * Get method for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public ColorManagedViewSettings getView_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedViewSettings(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ColorManagedViewSettings(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public void setView_settings(ColorManagedViewSettings view_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(view_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_settings);
		} else {
			__io__generic__copy( getView_settings(), view_settings);
		}
	}

	/**
	 * Get method for struct member 'display_settings'.
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public ColorManagedDisplaySettings getDisplay_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedDisplaySettings(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ColorManagedDisplaySettings(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display_settings'.
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public void setDisplay_settings(ColorManagedDisplaySettings display_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(display_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, display_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, display_settings);
		} else {
			__io__generic__copy( getDisplay_settings(), display_settings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImageFormatData> __io__addressof() {
		return new CPointer<ImageFormatData>(__io__address, new Class[]{ImageFormatData.class}, __io__block, __io__blockTable);
	}

}
