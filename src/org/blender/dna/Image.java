package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Image'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Any kind of image referenced (e.g. texture).
 * 					<h3>Animated Images</h3>
 * 					<p>An image can contain multiple frames, that can be used for animated images (movies). 
 * 					Those frames are ordered in rows and columns (like reading a book). 
 * 					xrep/yrep define the number of columns and rows and twsta and twend the range of 
 * 					frames to be used in the animation.
 * 					</p>
 */

@CMetaData(size32=1356, size64=1464)
public class Image extends CFacade {

	/**
	 * This is the sdna index of the struct Image.
	 * <p>
	 * It is required when allocating a new block to store data for Image.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 39;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'MovieCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{1144, 1176};

	/**
	 * Field descriptor (offset) for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 4 = TEXTARGET_COUNT. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gputexture);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_gputexture = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gputexture'</li>
	 * <li>Signature: 'GPUTexture*[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gputexture = new long[]{1148, 1184};

	/**
	 * Field descriptor (offset) for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sources from: </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__anims);
	 * CPointer&lt;ListBase&gt; p_anims = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anims'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anims = new long[]{1164, 1216};

	/**
	 * Field descriptor (offset) for struct member 'rr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__rr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_rr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rr'</li>
	 * <li>Signature: 'RenderResult*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rr = new long[]{1172, 1232};

	/**
	 * Field descriptor (offset) for struct member 'renderslots'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__renderslots);
	 * CPointer&lt;ListBase&gt; p_renderslots = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderslots'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderslots = new long[]{1176, 1240};

	/**
	 * Field descriptor (offset) for struct member 'render_slot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__render_slot);
	 * CPointer&lt;Short&gt; p_render_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_slot = new long[]{1184, 1256};

	/**
	 * Field descriptor (offset) for struct member 'last_render_slot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__last_render_slot);
	 * CPointer&lt;Short&gt; p_last_render_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_render_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_render_slot = new long[]{1186, 1258};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	IMA_FIELDS              = (1 << 0),
	 * 	IMA_STD_FIELD           = (1 << 1),
	 * 	IMA_DO_PREMUL           = (1 << 2),  // deprecated, should not be used 
	 * 	IMA_REFLECT             = (1 << 4),
	 * 	IMA_NOCOLLECT           = (1 << 5),
	 * 	//IMA_DONE_TAG          = (1 << 6),  // UNUSED
	 * 	IMA_OLD_PREMUL          = (1 << 7),
	 * 	// IMA_CM_PREDIVIDE     = (1 << 8),  // deprecated, should not be used 
	 * 	IMA_USED_FOR_RENDER     = (1 << 9),
	 * 	IMA_USER_FRAME_IN_RANGE = (1 << 10), // for image user, but these flags are mixed 
	 * 	IMA_VIEW_AS_RENDER      = (1 << 11),
	 * 	IMA_IGNORE_ALPHA        = (1 << 12),
	 * 	IMA_DEINTERLACE         = (1 << 13),
	 * 	IMA_USE_VIEWS           = (1 << 14),
	 * 	// IMA_IS_STEREO        = (1 << 15), // deprecated 
	 * 	// IMA_IS_MULTIVIEW     = (1 << 16), // deprecated 
	 * 				
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1188, 1260};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_SRC_CHECK       0
	 * 	IMA_SRC_FILE        1
	 * 	IMA_SRC_SEQUENCE    2
	 * 	IMA_SRC_MOVIE       3
	 * 	IMA_SRC_GENERATED   4
	 * 	IMA_SRC_VIEWER      5
	 * 				</pre><h4>Blender Python API:</h4>
	 * Where the image comes from
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__source);
	 * CPointer&lt;Short&gt; p_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{1192, 1264};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * how to handle/generate it. <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_TYPE_IMAGE      0
	 * 	IMA_TYPE_MULTILAYER 1
	 * // generated 
	 * 	IMA_TYPE_UV_TEST    2
	 * // viewers
	 * 	IMA_TYPE_R_RESULT   4
	 * 	IMA_TYPE_COMPOSITE  5
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    How to generate the image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{1194, 1266};

	/**
	 * Field descriptor (offset) for struct member 'lastframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__lastframe);
	 * CPointer&lt;Integer&gt; p_lastframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastframe = new long[]{1196, 1268};

	/**
	 * Field descriptor (offset) for struct member 'gpuflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GPU texture flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gpuflag);
	 * CPointer&lt;Short&gt; p_gpuflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpuflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpuflag = new long[]{1200, 1272};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1202, 1274};

	/**
	 * Field descriptor (offset) for struct member 'gpuframenr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gpuframenr);
	 * CPointer&lt;Integer&gt; p_gpuframenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpuframenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpuframenr = new long[]{1204, 1276};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{1208, 1280};

	/**
	 * Field descriptor (offset) for struct member 'packedfiles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__packedfiles);
	 * CPointer&lt;ListBase&gt; p_packedfiles = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfiles'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfiles = new long[]{1212, 1288};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{1220, 1304};

	/**
	 * Field descriptor (offset) for struct member 'lastused'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * seconds since 1970.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__lastused);
	 * CPointer&lt;Integer&gt; p_lastused = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastused'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastused = new long[]{1224, 1312};

	/**
	 * Field descriptor (offset) for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: width<h4>Blender Source Code:</h4>
	 * <p> for generated images </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_x);
	 * CPointer&lt;Integer&gt; p_gen_x = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_x'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_x = new long[]{1228, 1316};

	/**
	 * Field descriptor (offset) for struct member 'gen_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: height
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_y);
	 * CPointer&lt;Integer&gt; p_gen_y = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_y'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_y = new long[]{1232, 1320};

	/**
	 * Field descriptor (offset) for struct member 'gen_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GENTYPE_BLANK = 0,
	 * 	IMA_GENTYPE_GRID = 1,
	 * 	IMA_GENTYPE_GRID_COLOR = 2
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_type);
	 * CPointer&lt;Byte&gt; p_gen_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_type = new long[]{1236, 1324};

	/**
	 * Field descriptor (offset) for struct member 'gen_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GEN_FLOAT		1
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_flag);
	 * CPointer&lt;Byte&gt; p_gen_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_flag = new long[]{1237, 1325};

	/**
	 * Field descriptor (offset) for struct member 'gen_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: number of bits per pixel (e.g. 24 for rgb or 32 for rgba)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_depth);
	 * CPointer&lt;Short&gt; p_gen_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_depth = new long[]{1238, 1326};

	/**
	 * Field descriptor (offset) for struct member 'gen_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: Color used to initialize the generated image (e.g. background)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gen_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_color = new long[]{1240, 1328};

	/**
	 * Field descriptor (offset) for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display aspect - for UV editing images resized for faster openGL display </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__aspx);
	 * CPointer&lt;Float&gt; p_aspx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspx = new long[]{1256, 1344};

	/**
	 * Field descriptor (offset) for struct member 'aspy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__aspy);
	 * CPointer&lt;Float&gt; p_aspy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspy = new long[]{1260, 1348};

	/**
	 * Field descriptor (offset) for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__colorspace_settings);
	 * CPointer&lt;ColorManagedColorspaceSettings&gt; p_colorspace_settings = p.cast(new Class[]{ColorManagedColorspaceSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorspace_settings'</li>
	 * <li>Signature: 'ColorManagedColorspaceSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorspace_settings = new long[]{1264, 1352};

	/**
	 * Field descriptor (offset) for struct member 'alpha_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Representation of alpha in the image file, to convert to and from when saving and loading the image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__alpha_mode);
	 * CPointer&lt;Byte&gt; p_alpha_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_mode = new long[]{1328, 1416};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1329, 1417};

	/**
	 * Field descriptor (offset) for struct member 'eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview For viewer node stereoscopy. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__eye);
	 * CPointer&lt;Byte&gt; p_eye = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eye'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eye = new long[]{1330, 1418};

	/**
	 * Field descriptor (offset) for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to load image views
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__views_format);
	 * CPointer&lt;Byte&gt; p_views_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views_format = new long[]{1331, 1419};

	/**
	 * Field descriptor (offset) for struct member 'active_tile_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageTile}  list for UDIMs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__active_tile_index);
	 * CPointer&lt;Integer&gt; p_active_tile_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_tile_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_tile_index = new long[]{1332, 1420};

	/**
	 * Field descriptor (offset) for struct member 'tiles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Tiles of the image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__tiles);
	 * CPointer&lt;ListBase&gt; p_tiles = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tiles'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tiles = new long[]{1336, 1424};

	/**
	 * Field descriptor (offset) for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageView} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__views);
	 * CPointer&lt;ListBase&gt; p_views = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views = new long[]{1344, 1440};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__stereo3d_format);
	 * CPointer&lt;CPointer&lt;Stereo3dFormat&gt;&gt; p_stereo3d_format = p.cast(new Class[]{CPointer.class, Stereo3dFormat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_format'</li>
	 * <li>Signature: 'Stereo3dFormat*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_format = new long[]{1352, 1456};

	public Image(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Image(Image that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name<h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file. </p>
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1176, __address);
		} else {
			__io__block.writeLong(__io__address + 1144, __address);
		}
	}

	/**
	 * Get method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 4 = TEXTARGET_COUNT. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public CArrayFacade<CPointer<Object>> getGputexture() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 1184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 1148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 4 = TEXTARGET_COUNT. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public void setGputexture(CArrayFacade<CPointer<Object>> gputexture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1184;
		} else {
			__dna__offset = 1148;
		}
		if (__io__equals(gputexture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gputexture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gputexture);
		} else {
			__io__generic__copy( getGputexture(), gputexture);
		}
	}

	/**
	 * Get method for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sources from: </p>
	 * @see #__DNA__FIELD__anims
	 */
	
	public ListBase getAnims() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1216, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1164, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sources from: </p>
	 * @see #__DNA__FIELD__anims
	 */
	
	public void setAnims(ListBase anims) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1216;
		} else {
			__dna__offset = 1164;
		}
		if (__io__equals(anims, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anims)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anims);
		} else {
			__io__generic__copy( getAnims(), anims);
		}
	}

	/**
	 * Get method for struct member 'rr'.
	 * @see #__DNA__FIELD__rr
	 */
	
	public CPointer<Object> getRr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rr'.
	 * @see #__DNA__FIELD__rr
	 */
	
	public void setRr(CPointer<Object> rr) throws IOException
	{
		long __address = ((rr == null) ? 0 : rr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1232, __address);
		} else {
			__io__block.writeLong(__io__address + 1172, __address);
		}
	}

	/**
	 * Get method for struct member 'renderslots'.
	 * @see #__DNA__FIELD__renderslots
	 */
	
	public ListBase getRenderslots() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1240, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'renderslots'.
	 * @see #__DNA__FIELD__renderslots
	 */
	
	public void setRenderslots(ListBase renderslots) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1240;
		} else {
			__dna__offset = 1176;
		}
		if (__io__equals(renderslots, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, renderslots)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, renderslots);
		} else {
			__io__generic__copy( getRenderslots(), renderslots);
		}
	}

	/**
	 * Get method for struct member 'render_slot'.
	 * @see #__DNA__FIELD__render_slot
	 */
	
	public short getRender_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1256);
		} else {
			return __io__block.readShort(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'render_slot'.
	 * @see #__DNA__FIELD__render_slot
	 */
	
	public void setRender_slot(short render_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1256, render_slot);
		} else {
			__io__block.writeShort(__io__address + 1184, render_slot);
		}
	}

	/**
	 * Get method for struct member 'last_render_slot'.
	 * @see #__DNA__FIELD__last_render_slot
	 */
	
	public short getLast_render_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1258);
		} else {
			return __io__block.readShort(__io__address + 1186);
		}
	}

	/**
	 * Set method for struct member 'last_render_slot'.
	 * @see #__DNA__FIELD__last_render_slot
	 */
	
	public void setLast_render_slot(short last_render_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1258, last_render_slot);
		} else {
			__io__block.writeShort(__io__address + 1186, last_render_slot);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	IMA_FIELDS              = (1 << 0),
	 * 	IMA_STD_FIELD           = (1 << 1),
	 * 	IMA_DO_PREMUL           = (1 << 2),  // deprecated, should not be used 
	 * 	IMA_REFLECT             = (1 << 4),
	 * 	IMA_NOCOLLECT           = (1 << 5),
	 * 	//IMA_DONE_TAG          = (1 << 6),  // UNUSED
	 * 	IMA_OLD_PREMUL          = (1 << 7),
	 * 	// IMA_CM_PREDIVIDE     = (1 << 8),  // deprecated, should not be used 
	 * 	IMA_USED_FOR_RENDER     = (1 << 9),
	 * 	IMA_USER_FRAME_IN_RANGE = (1 << 10), // for image user, but these flags are mixed 
	 * 	IMA_VIEW_AS_RENDER      = (1 << 11),
	 * 	IMA_IGNORE_ALPHA        = (1 << 12),
	 * 	IMA_DEINTERLACE         = (1 << 13),
	 * 	IMA_USE_VIEWS           = (1 << 14),
	 * 	// IMA_IS_STEREO        = (1 << 15), // deprecated 
	 * 	// IMA_IS_MULTIVIEW     = (1 << 16), // deprecated 
	 * 				
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1260);
		} else {
			return __io__block.readInt(__io__address + 1188);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * 	IMA_FIELDS              = (1 << 0),
	 * 	IMA_STD_FIELD           = (1 << 1),
	 * 	IMA_DO_PREMUL           = (1 << 2),  // deprecated, should not be used 
	 * 	IMA_REFLECT             = (1 << 4),
	 * 	IMA_NOCOLLECT           = (1 << 5),
	 * 	//IMA_DONE_TAG          = (1 << 6),  // UNUSED
	 * 	IMA_OLD_PREMUL          = (1 << 7),
	 * 	// IMA_CM_PREDIVIDE     = (1 << 8),  // deprecated, should not be used 
	 * 	IMA_USED_FOR_RENDER     = (1 << 9),
	 * 	IMA_USER_FRAME_IN_RANGE = (1 << 10), // for image user, but these flags are mixed 
	 * 	IMA_VIEW_AS_RENDER      = (1 << 11),
	 * 	IMA_IGNORE_ALPHA        = (1 << 12),
	 * 	IMA_DEINTERLACE         = (1 << 13),
	 * 	IMA_USE_VIEWS           = (1 << 14),
	 * 	// IMA_IS_STEREO        = (1 << 15), // deprecated 
	 * 	// IMA_IS_MULTIVIEW     = (1 << 16), // deprecated 
	 * 				
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1260, flag);
		} else {
			__io__block.writeInt(__io__address + 1188, flag);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_SRC_CHECK       0
	 * 	IMA_SRC_FILE        1
	 * 	IMA_SRC_SEQUENCE    2
	 * 	IMA_SRC_MOVIE       3
	 * 	IMA_SRC_GENERATED   4
	 * 	IMA_SRC_VIEWER      5
	 * 				</pre><h4>Blender Python API:</h4>
	 * Where the image comes from
	 * @see #__DNA__FIELD__source
	 */
	
	public short getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1264);
		} else {
			return __io__block.readShort(__io__address + 1192);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_SRC_CHECK       0
	 * 	IMA_SRC_FILE        1
	 * 	IMA_SRC_SEQUENCE    2
	 * 	IMA_SRC_MOVIE       3
	 * 	IMA_SRC_GENERATED   4
	 * 	IMA_SRC_VIEWER      5
	 * 				</pre><h4>Blender Python API:</h4>
	 * Where the image comes from
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(short source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1264, source);
		} else {
			__io__block.writeShort(__io__address + 1192, source);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * how to handle/generate it. <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_TYPE_IMAGE      0
	 * 	IMA_TYPE_MULTILAYER 1
	 * // generated 
	 * 	IMA_TYPE_UV_TEST    2
	 * // viewers
	 * 	IMA_TYPE_R_RESULT   4
	 * 	IMA_TYPE_COMPOSITE  5
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    How to generate the image
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1266);
		} else {
			return __io__block.readShort(__io__address + 1194);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * how to handle/generate it. <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_TYPE_IMAGE      0
	 * 	IMA_TYPE_MULTILAYER 1
	 * // generated 
	 * 	IMA_TYPE_UV_TEST    2
	 * // viewers
	 * 	IMA_TYPE_R_RESULT   4
	 * 	IMA_TYPE_COMPOSITE  5
	 * 				</pre><h4>Blender Python API:</h4>
	 * (read-only)    How to generate the image
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1266, type);
		} else {
			__io__block.writeShort(__io__address + 1194, type);
		}
	}

	/**
	 * Get method for struct member 'lastframe'.
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public int getLastframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1268);
		} else {
			return __io__block.readInt(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'lastframe'.
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public void setLastframe(int lastframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1268, lastframe);
		} else {
			__io__block.writeInt(__io__address + 1196, lastframe);
		}
	}

	/**
	 * Get method for struct member 'gpuflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GPU texture flag. </p>
	 * @see #__DNA__FIELD__gpuflag
	 */
	
	public short getGpuflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1272);
		} else {
			return __io__block.readShort(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'gpuflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GPU texture flag. </p>
	 * @see #__DNA__FIELD__gpuflag
	 */
	
	public void setGpuflag(short gpuflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1272, gpuflag);
		} else {
			__io__block.writeShort(__io__address + 1200, gpuflag);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1274, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1202, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1274;
		} else {
			__dna__offset = 1202;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'gpuframenr'.
	 * @see #__DNA__FIELD__gpuframenr
	 */
	
	public int getGpuframenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1276);
		} else {
			return __io__block.readInt(__io__address + 1204);
		}
	}

	/**
	 * Set method for struct member 'gpuframenr'.
	 * @see #__DNA__FIELD__gpuframenr
	 */
	
	public void setGpuframenr(int gpuframenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1276, gpuframenr);
		} else {
			__io__block.writeInt(__io__address + 1204, gpuframenr);
		}
	}

	/**
	 * Get method for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1280, __address);
		} else {
			__io__block.writeLong(__io__address + 1208, __address);
		}
	}

	/**
	 * Get method for struct member 'packedfiles'.
	 * @see #__DNA__FIELD__packedfiles
	 */
	
	public ListBase getPackedfiles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1288, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1212, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'packedfiles'.
	 * @see #__DNA__FIELD__packedfiles
	 */
	
	public void setPackedfiles(ListBase packedfiles) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1288;
		} else {
			__dna__offset = 1212;
		}
		if (__io__equals(packedfiles, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, packedfiles)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, packedfiles);
		} else {
			__io__generic__copy( getPackedfiles(), packedfiles);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1220);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1304, __address);
		} else {
			__io__block.writeLong(__io__address + 1220, __address);
		}
	}

	/**
	 * Get method for struct member 'lastused'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * seconds since 1970.
	 * @see #__DNA__FIELD__lastused
	 */
	
	public int getLastused() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1312);
		} else {
			return __io__block.readInt(__io__address + 1224);
		}
	}

	/**
	 * Set method for struct member 'lastused'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * seconds since 1970.
	 * @see #__DNA__FIELD__lastused
	 */
	
	public void setLastused(int lastused) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1312, lastused);
		} else {
			__io__block.writeInt(__io__address + 1224, lastused);
		}
	}

	/**
	 * Get method for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: width<h4>Blender Source Code:</h4>
	 * <p> for generated images </p>
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public int getGen_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1316);
		} else {
			return __io__block.readInt(__io__address + 1228);
		}
	}

	/**
	 * Set method for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: width<h4>Blender Source Code:</h4>
	 * <p> for generated images </p>
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public void setGen_x(int gen_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1316, gen_x);
		} else {
			__io__block.writeInt(__io__address + 1228, gen_x);
		}
	}

	/**
	 * Get method for struct member 'gen_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: height
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public int getGen_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1320);
		} else {
			return __io__block.readInt(__io__address + 1232);
		}
	}

	/**
	 * Set method for struct member 'gen_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: height
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public void setGen_y(int gen_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1320, gen_y);
		} else {
			__io__block.writeInt(__io__address + 1232, gen_y);
		}
	}

	/**
	 * Get method for struct member 'gen_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GENTYPE_BLANK = 0,
	 * 	IMA_GENTYPE_GRID = 1,
	 * 	IMA_GENTYPE_GRID_COLOR = 2
	 * 				</pre>
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public byte getGen_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1324);
		} else {
			return __io__block.readByte(__io__address + 1236);
		}
	}

	/**
	 * Set method for struct member 'gen_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GENTYPE_BLANK = 0,
	 * 	IMA_GENTYPE_GRID = 1,
	 * 	IMA_GENTYPE_GRID_COLOR = 2
	 * 				</pre>
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public void setGen_type(byte gen_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1324, gen_type);
		} else {
			__io__block.writeByte(__io__address + 1236, gen_type);
		}
	}

	/**
	 * Get method for struct member 'gen_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GEN_FLOAT		1
	 * 				</pre>
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public byte getGen_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1325);
		} else {
			return __io__block.readByte(__io__address + 1237);
		}
	}

	/**
	 * Set method for struct member 'gen_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: <h3>Values:</h3>
	 * 				<pre>
	 * 	IMA_GEN_FLOAT		1
	 * 				</pre>
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public void setGen_flag(byte gen_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1325, gen_flag);
		} else {
			__io__block.writeByte(__io__address + 1237, gen_flag);
		}
	}

	/**
	 * Get method for struct member 'gen_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: number of bits per pixel (e.g. 24 for rgb or 32 for rgba)
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public short getGen_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1326);
		} else {
			return __io__block.readShort(__io__address + 1238);
		}
	}

	/**
	 * Set method for struct member 'gen_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: number of bits per pixel (e.g. 24 for rgb or 32 for rgba)
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public void setGen_depth(short gen_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1326, gen_depth);
		} else {
			__io__block.writeShort(__io__address + 1238, gen_depth);
		}
	}

	/**
	 * Get method for struct member 'gen_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: Color used to initialize the generated image (e.g. background)
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public CArrayFacade<Float> getGen_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gen_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * For generated images: Color used to initialize the generated image (e.g. background)
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public void setGen_color(CArrayFacade<Float> gen_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1328;
		} else {
			__dna__offset = 1240;
		}
		if (__io__equals(gen_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gen_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gen_color);
		} else {
			__io__generic__copy( getGen_color(), gen_color);
		}
	}

	/**
	 * Get method for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display aspect - for UV editing images resized for faster openGL display </p>
	 * @see #__DNA__FIELD__aspx
	 */
	
	public float getAspx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1344);
		} else {
			return __io__block.readFloat(__io__address + 1256);
		}
	}

	/**
	 * Set method for struct member 'aspx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> display aspect - for UV editing images resized for faster openGL display </p>
	 * @see #__DNA__FIELD__aspx
	 */
	
	public void setAspx(float aspx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1344, aspx);
		} else {
			__io__block.writeFloat(__io__address + 1256, aspx);
		}
	}

	/**
	 * Get method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public float getAspy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1348);
		} else {
			return __io__block.readFloat(__io__address + 1260);
		}
	}

	/**
	 * Set method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public void setAspy(float aspy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1348, aspy);
		} else {
			__io__block.writeFloat(__io__address + 1260, aspy);
		}
	}

	/**
	 * Get method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getColorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 1352, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 1264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Input color space settings<h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public void setColorspace_settings(ColorManagedColorspaceSettings colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1352;
		} else {
			__dna__offset = 1264;
		}
		if (__io__equals(colorspace_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorspace_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorspace_settings);
		} else {
			__io__generic__copy( getColorspace_settings(), colorspace_settings);
		}
	}

	/**
	 * Get method for struct member 'alpha_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Representation of alpha in the image file, to convert to and from when saving and loading the image
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public byte getAlpha_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1416);
		} else {
			return __io__block.readByte(__io__address + 1328);
		}
	}

	/**
	 * Set method for struct member 'alpha_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Representation of alpha in the image file, to convert to and from when saving and loading the image
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public void setAlpha_mode(byte alpha_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1416, alpha_mode);
		} else {
			__io__block.writeByte(__io__address + 1328, alpha_mode);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1417);
		} else {
			return __io__block.readByte(__io__address + 1329);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1417, _pad);
		} else {
			__io__block.writeByte(__io__address + 1329, _pad);
		}
	}

	/**
	 * Get method for struct member 'eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview For viewer node stereoscopy. </p>
	 * @see #__DNA__FIELD__eye
	 */
	
	public byte getEye() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1418);
		} else {
			return __io__block.readByte(__io__address + 1330);
		}
	}

	/**
	 * Set method for struct member 'eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview For viewer node stereoscopy. </p>
	 * @see #__DNA__FIELD__eye
	 */
	
	public void setEye(byte eye) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1418, eye);
		} else {
			__io__block.writeByte(__io__address + 1330, eye);
		}
	}

	/**
	 * Get method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to load image views
	 * @see #__DNA__FIELD__views_format
	 */
	
	public byte getViews_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1419);
		} else {
			return __io__block.readByte(__io__address + 1331);
		}
	}

	/**
	 * Set method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode to load image views
	 * @see #__DNA__FIELD__views_format
	 */
	
	public void setViews_format(byte views_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1419, views_format);
		} else {
			__io__block.writeByte(__io__address + 1331, views_format);
		}
	}

	/**
	 * Get method for struct member 'active_tile_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageTile}  list for UDIMs. </p>
	 * @see #__DNA__FIELD__active_tile_index
	 */
	
	public int getActive_tile_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1420);
		} else {
			return __io__block.readInt(__io__address + 1332);
		}
	}

	/**
	 * Set method for struct member 'active_tile_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageTile}  list for UDIMs. </p>
	 * @see #__DNA__FIELD__active_tile_index
	 */
	
	public void setActive_tile_index(int active_tile_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1420, active_tile_index);
		} else {
			__io__block.writeInt(__io__address + 1332, active_tile_index);
		}
	}

	/**
	 * Get method for struct member 'tiles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Tiles of the image
	 * @see #__DNA__FIELD__tiles
	 */
	
	public ListBase getTiles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1424, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1336, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tiles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Tiles of the image
	 * @see #__DNA__FIELD__tiles
	 */
	
	public void setTiles(ListBase tiles) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1424;
		} else {
			__dna__offset = 1336;
		}
		if (__io__equals(tiles, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tiles)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tiles);
		} else {
			__io__generic__copy( getTiles(), tiles);
		}
	}

	/**
	 * Get method for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageView} . </p>
	 * @see #__DNA__FIELD__views
	 */
	
	public ListBase getViews() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1440, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1344, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ImageView} . </p>
	 * @see #__DNA__FIELD__views
	 */
	
	public void setViews(ListBase views) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1440;
		} else {
			__dna__offset = 1344;
		}
		if (__io__equals(views, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, views)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, views);
		} else {
			__io__generic__copy( getViews(), views);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public CPointer<Stereo3dFormat> getStereo3d_format() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1456);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1352);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Stereo3dFormat.class};
		return new CPointer<Stereo3dFormat>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Stereo3dFormat.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public void setStereo3d_format(CPointer<Stereo3dFormat> stereo3d_format) throws IOException
	{
		long __address = ((stereo3d_format == null) ? 0 : stereo3d_format.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1456, __address);
		} else {
			__io__block.writeLong(__io__address + 1352, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Image> __io__addressof() {
		return new CPointer<Image>(__io__address, new Class[]{Image.class}, __io__block, __io__blockTable);
	}

}
