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
 * Generated facet for DNA struct type 'RenderData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  Render Data </p>
 */

@CMetaData(size32=4220, size64=4312)
public class RenderData extends CFacade {

	/**
	 * This is the sdna index of the struct RenderData.
	 * <p>
	 * It is required when allocating a new block to store data for RenderData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 193;

	/**
	 * Field descriptor (offset) for struct member 'im_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__im_format);
	 * CPointer&lt;ImageFormatData&gt; p_im_format = p.cast(new Class[]{ImageFormatData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'im_format'</li>
	 * <li>Signature: 'ImageFormatData'</li>
	 * <li>Actual Size (32bit/64bit): 320/328</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__im_format = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'avicodecdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__avicodecdata);
	 * CPointer&lt;CPointer&lt;AviCodecData&gt;&gt; p_avicodecdata = p.cast(new Class[]{CPointer.class, AviCodecData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avicodecdata'</li>
	 * <li>Signature: 'AviCodecData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avicodecdata = new long[]{320, 328};

	/**
	 * Field descriptor (offset) for struct member 'ffcodecdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__ffcodecdata);
	 * CPointer&lt;FFMpegCodecData&gt; p_ffcodecdata = p.cast(new Class[]{FFMpegCodecData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ffcodecdata'</li>
	 * <li>Signature: 'FFMpegCodecData'</li>
	 * <li>Actual Size (32bit/64bit): 76/80</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ffcodecdata = new long[]{324, 336};

	/**
	 * Field descriptor (offset) for struct member 'cfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames as in 'images'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__cfra);
	 * CPointer&lt;Integer&gt; p_cfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cfra = new long[]{400, 416};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{404, 420};

	/**
	 * Field descriptor (offset) for struct member 'efra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__efra);
	 * CPointer&lt;Integer&gt; p_efra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'efra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__efra = new long[]{408, 424};

	/**
	 * Field descriptor (offset) for struct member 'subframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Subframe offset from cfra, in 0.0-1.0. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__subframe);
	 * CPointer&lt;Float&gt; p_subframe = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subframe'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subframe = new long[]{412, 428};

	/**
	 * Field descriptor (offset) for struct member 'psfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Start+end frames of preview range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__psfra);
	 * CPointer&lt;Integer&gt; p_psfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psfra = new long[]{416, 432};

	/**
	 * Field descriptor (offset) for struct member 'pefra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pefra);
	 * CPointer&lt;Integer&gt; p_pefra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pefra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pefra = new long[]{420, 436};

	/**
	 * Field descriptor (offset) for struct member 'images'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__images);
	 * CPointer&lt;Integer&gt; p_images = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'images'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__images = new long[]{424, 440};

	/**
	 * Field descriptor (offset) for struct member 'framapto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__framapto);
	 * CPointer&lt;Integer&gt; p_framapto = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framapto'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framapto = new long[]{428, 444};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{432, 448};

	/**
	 * Field descriptor (offset) for struct member 'threads'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__threads);
	 * CPointer&lt;Short&gt; p_threads = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threads'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threads = new long[]{434, 450};

	/**
	 * Field descriptor (offset) for struct member 'framelen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__framelen);
	 * CPointer&lt;Float&gt; p_framelen = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framelen'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framelen = new long[]{436, 452};

	/**
	 * Field descriptor (offset) for struct member 'blurfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__blurfac);
	 * CPointer&lt;Float&gt; p_blurfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blurfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blurfac = new long[]{440, 456};

	/**
	 * Field descriptor (offset) for struct member 'frame_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames to jump during render/playback. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__frame_step);
	 * CPointer&lt;Integer&gt; p_frame_step = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_step'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_step = new long[]{444, 460};

	/**
	 * Field descriptor (offset) for struct member 'stereomode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Standalone player stereo settings XXX deprecated since .2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__stereomode);
	 * CPointer&lt;Short&gt; p_stereomode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereomode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereomode = new long[]{448, 464};

	/**
	 * Field descriptor (offset) for struct member 'dimensionspreset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For the dimensions presets menu. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__dimensionspreset);
	 * CPointer&lt;Short&gt; p_dimensionspreset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dimensionspreset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dimensionspreset = new long[]{450, 466};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size in %. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__size);
	 * CPointer&lt;Short&gt; p_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{452, 468};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{454, 470};

	/**
	 * Field descriptor (offset) for struct member 'xsch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> from buttons: The desired number of pixels in the x direction </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__xsch);
	 * CPointer&lt;Integer&gt; p_xsch = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xsch'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xsch = new long[]{456, 472};

	/**
	 * Field descriptor (offset) for struct member 'ysch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The desired number of pixels in the y direction </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__ysch);
	 * CPointer&lt;Integer&gt; p_ysch = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ysch'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ysch = new long[]{460, 476};

	/**
	 * Field descriptor (offset) for struct member 'tilex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render tile dimensions 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__tilex);
	 * CPointer&lt;Integer&gt; p_tilex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilex = new long[]{464, 480};

	/**
	 * Field descriptor (offset) for struct member 'tiley'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__tiley);
	 * CPointer&lt;Integer&gt; p_tiley = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tiley'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tiley = new long[]{468, 484};

	/**
	 * Field descriptor (offset) for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__planes);
	 * CPointer&lt;Short&gt; p_planes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'planes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__planes = new long[]{472, 488};

	/**
	 * Field descriptor (offset) for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__imtype);
	 * CPointer&lt;Short&gt; p_imtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imtype = new long[]{474, 490};

	/**
	 * Field descriptor (offset) for struct member 'subimtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__subimtype);
	 * CPointer&lt;Short&gt; p_subimtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subimtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subimtype = new long[]{476, 492};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__quality);
	 * CPointer&lt;Short&gt; p_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{478, 494};

	/**
	 * Field descriptor (offset) for struct member 'use_lock_interface'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__use_lock_interface);
	 * CPointer&lt;Byte&gt; p_use_lock_interface = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_lock_interface'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_lock_interface = new long[]{480, 496};

	/**
	 * Field descriptor (offset) for struct member '_pad7'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad7);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad7 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad7'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad7 = new long[]{481, 497};

	/**
	 * Field descriptor (offset) for struct member 'scemode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__scemode);
	 * CPointer&lt;Integer&gt; p_scemode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scemode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scemode = new long[]{484, 500};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{488, 504};

	/**
	 * Field descriptor (offset) for struct member 'frs_sec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__frs_sec);
	 * CPointer&lt;Short&gt; p_frs_sec = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frs_sec'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frs_sec = new long[]{492, 508};

	/**
	 * Field descriptor (offset) for struct member 'alphamode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> What to do with the sky/background. Picks sky/premul blending for the background. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__alphamode);
	 * CPointer&lt;Byte&gt; p_alphamode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alphamode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alphamode = new long[]{494, 510};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{495, 511};

	/**
	 * Field descriptor (offset) for struct member 'border'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Render border to render sub-resions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__border);
	 * CPointer&lt;rctf&gt; p_border = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'border'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__border = new long[]{496, 512};

	/**
	 * Field descriptor (offset) for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> information on different layers to be rendered Converted to Scene->view_layers. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__layers);
	 * CPointer&lt;ListBase&gt; p_layers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers = new long[]{512, 528};

	/**
	 * Field descriptor (offset) for struct member 'actlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Converted to Scene->active_layer. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__actlay);
	 * CPointer&lt;Short&gt; p_actlay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actlay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actlay = new long[]{520, 544};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{522, 546};

	/**
	 * Field descriptor (offset) for struct member 'xasp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Adjustment factors for the aspect ratio in the x direction, was a short in 2.45 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__xasp);
	 * CPointer&lt;Float&gt; p_xasp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xasp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xasp = new long[]{524, 548};

	/**
	 * Field descriptor (offset) for struct member 'yasp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__yasp);
	 * CPointer&lt;Float&gt; p_yasp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yasp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yasp = new long[]{528, 552};

	/**
	 * Field descriptor (offset) for struct member 'frs_sec_base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__frs_sec_base);
	 * CPointer&lt;Float&gt; p_frs_sec_base = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frs_sec_base'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frs_sec_base = new long[]{532, 556};

	/**
	 * Field descriptor (offset) for struct member 'gauss'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value used to define filter size for all filter options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__gauss);
	 * CPointer&lt;Float&gt; p_gauss = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gauss'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gauss = new long[]{536, 560};

	/**
	 * Field descriptor (offset) for struct member 'color_mgt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> color management settings - color profiles, gamma correction, etc </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__color_mgt_flag);
	 * CPointer&lt;Integer&gt; p_color_mgt_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_mgt_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_mgt_flag = new long[]{540, 564};

	/**
	 * Field descriptor (offset) for struct member 'dither_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dither noise intensity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__dither_intensity);
	 * CPointer&lt;Float&gt; p_dither_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dither_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dither_intensity = new long[]{544, 568};

	/**
	 * Field descriptor (offset) for struct member 'bake_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bake Render options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_mode);
	 * CPointer&lt;Short&gt; p_bake_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_mode = new long[]{548, 572};

	/**
	 * Field descriptor (offset) for struct member 'bake_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_flag);
	 * CPointer&lt;Short&gt; p_bake_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_flag = new long[]{550, 574};

	/**
	 * Field descriptor (offset) for struct member 'bake_filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_filter);
	 * CPointer&lt;Short&gt; p_bake_filter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_filter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_filter = new long[]{552, 576};

	/**
	 * Field descriptor (offset) for struct member 'bake_samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_samples);
	 * CPointer&lt;Short&gt; p_bake_samples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_samples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_samples = new long[]{554, 578};

	/**
	 * Field descriptor (offset) for struct member 'bake_margin_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_margin_type);
	 * CPointer&lt;Short&gt; p_bake_margin_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_margin_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_margin_type = new long[]{556, 580};

	/**
	 * Field descriptor (offset) for struct member '_pad9'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad9);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad9 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad9'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad9 = new long[]{558, 582};

	/**
	 * Field descriptor (offset) for struct member 'bake_biasdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_biasdist);
	 * CPointer&lt;Float&gt; p_bake_biasdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_biasdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_biasdist = new long[]{564, 588};

	/**
	 * Field descriptor (offset) for struct member 'bake_user_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_user_scale);
	 * CPointer&lt;Float&gt; p_bake_user_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_user_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_user_scale = new long[]{568, 592};

	/**
	 * Field descriptor (offset) for struct member 'pic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code>  code. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pic);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pic = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pic'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pic = new long[]{572, 596};

	/**
	 * Field descriptor (offset) for struct member 'stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamps flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__stamp);
	 * CPointer&lt;Integer&gt; p_stamp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stamp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stamp = new long[]{1596, 1620};

	/**
	 * Field descriptor (offset) for struct member 'stamp_font_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Select one of blenders bitmap fonts. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__stamp_font_id);
	 * CPointer&lt;Short&gt; p_stamp_font_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stamp_font_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stamp_font_id = new long[]{1600, 1624};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{1602, 1626};

	/**
	 * Field descriptor (offset) for struct member 'stamp_udata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamp info user data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__stamp_udata);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_stamp_udata = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stamp_udata'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stamp_udata = new long[]{1604, 1628};

	/**
	 * Field descriptor (offset) for struct member 'fg_stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> foreground/background color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__fg_stamp);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fg_stamp = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fg_stamp'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fg_stamp = new long[]{2372, 2396};

	/**
	 * Field descriptor (offset) for struct member 'bg_stamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bg_stamp);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bg_stamp = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bg_stamp'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bg_stamp = new long[]{2388, 2412};

	/**
	 * Field descriptor (offset) for struct member 'seq_prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> sequencer options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__seq_prev_type);
	 * CPointer&lt;Byte&gt; p_seq_prev_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq_prev_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq_prev_type = new long[]{2404, 2428};

	/**
	 * Field descriptor (offset) for struct member 'seq_rend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UNUSED. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__seq_rend_type);
	 * CPointer&lt;Byte&gt; p_seq_rend_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq_rend_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq_rend_type = new long[]{2405, 2429};

	/**
	 * Field descriptor (offset) for struct member 'seq_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag use for sequence render/draw. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__seq_flag);
	 * CPointer&lt;Byte&gt; p_seq_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq_flag = new long[]{2406, 2430};

	/**
	 * Field descriptor (offset) for struct member '_pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad5);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad5 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad5'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{2407, 2431};

	/**
	 * Field descriptor (offset) for struct member 'simplify_subsurf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render simplify </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_subsurf);
	 * CPointer&lt;Short&gt; p_simplify_subsurf = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_subsurf'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_subsurf = new long[]{2410, 2434};

	/**
	 * Field descriptor (offset) for struct member 'simplify_subsurf_render'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_subsurf_render);
	 * CPointer&lt;Short&gt; p_simplify_subsurf_render = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_subsurf_render'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_subsurf_render = new long[]{2412, 2436};

	/**
	 * Field descriptor (offset) for struct member 'simplify_gpencil'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_gpencil);
	 * CPointer&lt;Short&gt; p_simplify_gpencil = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_gpencil'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_gpencil = new long[]{2414, 2438};

	/**
	 * Field descriptor (offset) for struct member 'simplify_particles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_particles);
	 * CPointer&lt;Float&gt; p_simplify_particles = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_particles'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_particles = new long[]{2416, 2440};

	/**
	 * Field descriptor (offset) for struct member 'simplify_particles_render'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_particles_render);
	 * CPointer&lt;Float&gt; p_simplify_particles_render = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_particles_render'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_particles_render = new long[]{2420, 2444};

	/**
	 * Field descriptor (offset) for struct member 'simplify_volumes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_volumes);
	 * CPointer&lt;Float&gt; p_simplify_volumes = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_volumes'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_volumes = new long[]{2424, 2448};

	/**
	 * Field descriptor (offset) for struct member 'line_thickness_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Freestyle line thickness options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__line_thickness_mode);
	 * CPointer&lt;Integer&gt; p_line_thickness_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_thickness_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_thickness_mode = new long[]{2428, 2452};

	/**
	 * Field descriptor (offset) for struct member 'unit_line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In pixels. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__unit_line_thickness);
	 * CPointer&lt;Float&gt; p_unit_line_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unit_line_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unit_line_thickness = new long[]{2432, 2456};

	/**
	 * Field descriptor (offset) for struct member 'engine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render engine </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__engine);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_engine = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'engine'</li>
	 * <li>Signature: 'char[32]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__engine = new long[]{2436, 2460};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{2468, 2492};

	/**
	 * Field descriptor (offset) for struct member 'perf_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Performance Options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__perf_flag);
	 * CPointer&lt;Short&gt; p_perf_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'perf_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__perf_flag = new long[]{2470, 2494};

	/**
	 * Field descriptor (offset) for struct member 'bake'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cycles baking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake);
	 * CPointer&lt;BakeData&gt; p_bake = p.cast(new Class[]{BakeData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake'</li>
	 * <li>Signature: 'BakeData'</li>
	 * <li>Actual Size (32bit/64bit): 1380/1392</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake = new long[]{2472, 2496};

	/**
	 * Field descriptor (offset) for struct member '_pad8'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad8);
	 * CPointer&lt;Integer&gt; p__pad8 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad8'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{3852, 3888};

	/**
	 * Field descriptor (offset) for struct member 'preview_pixel_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__preview_pixel_size);
	 * CPointer&lt;Short&gt; p_preview_pixel_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_pixel_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_pixel_size = new long[]{3856, 3892};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD___pad4);
	 * CPointer&lt;Short&gt; p__pad4 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{3858, 3894};

	/**
	 * Field descriptor (offset) for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MultiView {@link SceneRenderView} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__views);
	 * CPointer&lt;ListBase&gt; p_views = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views = new long[]{3860, 3896};

	/**
	 * Field descriptor (offset) for struct member 'actview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__actview);
	 * CPointer&lt;Short&gt; p_actview = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actview'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actview = new long[]{3868, 3912};

	/**
	 * Field descriptor (offset) for struct member 'views_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__views_format);
	 * CPointer&lt;Short&gt; p_views_format = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views_format'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views_format = new long[]{3870, 3914};

	/**
	 * Field descriptor (offset) for struct member 'hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hair Display </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__hair_type);
	 * CPointer&lt;Short&gt; p_hair_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_type = new long[]{3872, 3916};

	/**
	 * Field descriptor (offset) for struct member 'hair_subdiv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__hair_subdiv);
	 * CPointer&lt;Short&gt; p_hair_subdiv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_subdiv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_subdiv = new long[]{3874, 3918};

	/**
	 * Field descriptor (offset) for struct member 'mblur_shutter_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion blur shutter </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__mblur_shutter_curve);
	 * CPointer&lt;CurveMapping&gt; p_mblur_shutter_curve = p.cast(new Class[]{CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mblur_shutter_curve'</li>
	 * <li>Signature: 'CurveMapping'</li>
	 * <li>Actual Size (32bit/64bit): 344/392</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mblur_shutter_curve = new long[]{3876, 3920};

	public RenderData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RenderData(RenderData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public ImageFormatData getIm_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageFormatData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ImageFormatData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public void setIm_format(ImageFormatData im_format) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(im_format, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, im_format)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, im_format);
		} else {
			__io__generic__copy( getIm_format(), im_format);
		}
	}

	/**
	 * Get method for struct member 'avicodecdata'.
	 * @see #__DNA__FIELD__avicodecdata
	 */
	
	public CPointer<AviCodecData> getAvicodecdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AviCodecData.class};
		return new CPointer<AviCodecData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AviCodecData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'avicodecdata'.
	 * @see #__DNA__FIELD__avicodecdata
	 */
	
	public void setAvicodecdata(CPointer<AviCodecData> avicodecdata) throws IOException
	{
		long __address = ((avicodecdata == null) ? 0 : avicodecdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 328, __address);
		} else {
			__io__block.writeLong(__io__address + 320, __address);
		}
	}

	/**
	 * Get method for struct member 'ffcodecdata'.
	 * @see #__DNA__FIELD__ffcodecdata
	 */
	
	public FFMpegCodecData getFfcodecdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FFMpegCodecData(__io__address + 336, __io__block, __io__blockTable);
		} else {
			return new FFMpegCodecData(__io__address + 324, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ffcodecdata'.
	 * @see #__DNA__FIELD__ffcodecdata
	 */
	
	public void setFfcodecdata(FFMpegCodecData ffcodecdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 324;
		}
		if (__io__equals(ffcodecdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ffcodecdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ffcodecdata);
		} else {
			__io__generic__copy( getFfcodecdata(), ffcodecdata);
		}
	}

	/**
	 * Get method for struct member 'cfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames as in 'images'. </p>
	 * @see #__DNA__FIELD__cfra
	 */
	
	public int getCfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 416);
		} else {
			return __io__block.readInt(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'cfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames as in 'images'. </p>
	 * @see #__DNA__FIELD__cfra
	 */
	
	public void setCfra(int cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 416, cfra);
		} else {
			__io__block.writeInt(__io__address + 400, cfra);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 420);
		} else {
			return __io__block.readInt(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 420, sfra);
		} else {
			__io__block.writeInt(__io__address + 404, sfra);
		}
	}

	/**
	 * Get method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public int getEfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 424);
		} else {
			return __io__block.readInt(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public void setEfra(int efra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 424, efra);
		} else {
			__io__block.writeInt(__io__address + 408, efra);
		}
	}

	/**
	 * Get method for struct member 'subframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Subframe offset from cfra, in 0.0-1.0. </p>
	 * @see #__DNA__FIELD__subframe
	 */
	
	public float getSubframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 428);
		} else {
			return __io__block.readFloat(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'subframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Subframe offset from cfra, in 0.0-1.0. </p>
	 * @see #__DNA__FIELD__subframe
	 */
	
	public void setSubframe(float subframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 428, subframe);
		} else {
			__io__block.writeFloat(__io__address + 412, subframe);
		}
	}

	/**
	 * Get method for struct member 'psfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Start+end frames of preview range. </p>
	 * @see #__DNA__FIELD__psfra
	 */
	
	public int getPsfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 432);
		} else {
			return __io__block.readInt(__io__address + 416);
		}
	}

	/**
	 * Set method for struct member 'psfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Start+end frames of preview range. </p>
	 * @see #__DNA__FIELD__psfra
	 */
	
	public void setPsfra(int psfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 432, psfra);
		} else {
			__io__block.writeInt(__io__address + 416, psfra);
		}
	}

	/**
	 * Get method for struct member 'pefra'.
	 * @see #__DNA__FIELD__pefra
	 */
	
	public int getPefra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 436);
		} else {
			return __io__block.readInt(__io__address + 420);
		}
	}

	/**
	 * Set method for struct member 'pefra'.
	 * @see #__DNA__FIELD__pefra
	 */
	
	public void setPefra(int pefra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 436, pefra);
		} else {
			__io__block.writeInt(__io__address + 420, pefra);
		}
	}

	/**
	 * Get method for struct member 'images'.
	 * @see #__DNA__FIELD__images
	 */
	
	public int getImages() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 440);
		} else {
			return __io__block.readInt(__io__address + 424);
		}
	}

	/**
	 * Set method for struct member 'images'.
	 * @see #__DNA__FIELD__images
	 */
	
	public void setImages(int images) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 440, images);
		} else {
			__io__block.writeInt(__io__address + 424, images);
		}
	}

	/**
	 * Get method for struct member 'framapto'.
	 * @see #__DNA__FIELD__framapto
	 */
	
	public int getFramapto() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 444);
		} else {
			return __io__block.readInt(__io__address + 428);
		}
	}

	/**
	 * Set method for struct member 'framapto'.
	 * @see #__DNA__FIELD__framapto
	 */
	
	public void setFramapto(int framapto) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 444, framapto);
		} else {
			__io__block.writeInt(__io__address + 428, framapto);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 448);
		} else {
			return __io__block.readShort(__io__address + 432);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 448, flag);
		} else {
			__io__block.writeShort(__io__address + 432, flag);
		}
	}

	/**
	 * Get method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public short getThreads() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 450);
		} else {
			return __io__block.readShort(__io__address + 434);
		}
	}

	/**
	 * Set method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public void setThreads(short threads) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 450, threads);
		} else {
			__io__block.writeShort(__io__address + 434, threads);
		}
	}

	/**
	 * Get method for struct member 'framelen'.
	 * @see #__DNA__FIELD__framelen
	 */
	
	public float getFramelen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 452);
		} else {
			return __io__block.readFloat(__io__address + 436);
		}
	}

	/**
	 * Set method for struct member 'framelen'.
	 * @see #__DNA__FIELD__framelen
	 */
	
	public void setFramelen(float framelen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 452, framelen);
		} else {
			__io__block.writeFloat(__io__address + 436, framelen);
		}
	}

	/**
	 * Get method for struct member 'blurfac'.
	 * @see #__DNA__FIELD__blurfac
	 */
	
	public float getBlurfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 456);
		} else {
			return __io__block.readFloat(__io__address + 440);
		}
	}

	/**
	 * Set method for struct member 'blurfac'.
	 * @see #__DNA__FIELD__blurfac
	 */
	
	public void setBlurfac(float blurfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 456, blurfac);
		} else {
			__io__block.writeFloat(__io__address + 440, blurfac);
		}
	}

	/**
	 * Get method for struct member 'frame_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames to jump during render/playback. </p>
	 * @see #__DNA__FIELD__frame_step
	 */
	
	public int getFrame_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 444);
		}
	}

	/**
	 * Set method for struct member 'frame_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Frames to jump during render/playback. </p>
	 * @see #__DNA__FIELD__frame_step
	 */
	
	public void setFrame_step(int frame_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, frame_step);
		} else {
			__io__block.writeInt(__io__address + 444, frame_step);
		}
	}

	/**
	 * Get method for struct member 'stereomode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Standalone player stereo settings XXX deprecated since .2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public short getStereomode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 464);
		} else {
			return __io__block.readShort(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'stereomode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Standalone player stereo settings XXX deprecated since .2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public void setStereomode(short stereomode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 464, stereomode);
		} else {
			__io__block.writeShort(__io__address + 448, stereomode);
		}
	}

	/**
	 * Get method for struct member 'dimensionspreset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For the dimensions presets menu. </p>
	 * @see #__DNA__FIELD__dimensionspreset
	 */
	
	public short getDimensionspreset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 466);
		} else {
			return __io__block.readShort(__io__address + 450);
		}
	}

	/**
	 * Set method for struct member 'dimensionspreset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For the dimensions presets menu. </p>
	 * @see #__DNA__FIELD__dimensionspreset
	 */
	
	public void setDimensionspreset(short dimensionspreset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 466, dimensionspreset);
		} else {
			__io__block.writeShort(__io__address + 450, dimensionspreset);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size in %. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public short getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 468);
		} else {
			return __io__block.readShort(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size in %. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(short size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 468, size);
		} else {
			__io__block.writeShort(__io__address + 452, size);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public CArrayFacade<Byte> get_pad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 470, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 454, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(CArrayFacade<Byte> _pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 470;
		} else {
			__dna__offset = 454;
		}
		if (__io__equals(_pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad6);
		} else {
			__io__generic__copy( get_pad6(), _pad6);
		}
	}

	/**
	 * Get method for struct member 'xsch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> from buttons: The desired number of pixels in the x direction </p>
	 * @see #__DNA__FIELD__xsch
	 */
	
	public int getXsch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 472);
		} else {
			return __io__block.readInt(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'xsch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> from buttons: The desired number of pixels in the x direction </p>
	 * @see #__DNA__FIELD__xsch
	 */
	
	public void setXsch(int xsch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 472, xsch);
		} else {
			__io__block.writeInt(__io__address + 456, xsch);
		}
	}

	/**
	 * Get method for struct member 'ysch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The desired number of pixels in the y direction </p>
	 * @see #__DNA__FIELD__ysch
	 */
	
	public int getYsch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 476);
		} else {
			return __io__block.readInt(__io__address + 460);
		}
	}

	/**
	 * Set method for struct member 'ysch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The desired number of pixels in the y direction </p>
	 * @see #__DNA__FIELD__ysch
	 */
	
	public void setYsch(int ysch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 476, ysch);
		} else {
			__io__block.writeInt(__io__address + 460, ysch);
		}
	}

	/**
	 * Get method for struct member 'tilex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render tile dimensions 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tilex
	 */
	
	public int getTilex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 480);
		} else {
			return __io__block.readInt(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'tilex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render tile dimensions 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tilex
	 */
	
	public void setTilex(int tilex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 480, tilex);
		} else {
			__io__block.writeInt(__io__address + 464, tilex);
		}
	}

	/**
	 * Get method for struct member 'tiley'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tiley
	 */
	
	public int getTiley() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 484);
		} else {
			return __io__block.readInt(__io__address + 468);
		}
	}

	/**
	 * Set method for struct member 'tiley'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__tiley
	 */
	
	public void setTiley(int tiley) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 484, tiley);
		} else {
			__io__block.writeInt(__io__address + 468, tiley);
		}
	}

	/**
	 * Get method for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__planes
	 */
	
	public short getPlanes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 488);
		} else {
			return __io__block.readShort(__io__address + 472);
		}
	}

	/**
	 * Set method for struct member 'planes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__planes
	 */
	
	public void setPlanes(short planes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 488, planes);
		} else {
			__io__block.writeShort(__io__address + 472, planes);
		}
	}

	/**
	 * Get method for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__imtype
	 */
	
	public short getImtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 490);
		} else {
			return __io__block.readShort(__io__address + 474);
		}
	}

	/**
	 * Set method for struct member 'imtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__imtype
	 */
	
	public void setImtype(short imtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 490, imtype);
		} else {
			__io__block.writeShort(__io__address + 474, imtype);
		}
	}

	/**
	 * Get method for struct member 'subimtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subimtype
	 */
	
	public short getSubimtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 492);
		} else {
			return __io__block.readShort(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'subimtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__subimtype
	 */
	
	public void setSubimtype(short subimtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 492, subimtype);
		} else {
			__io__block.writeShort(__io__address + 476, subimtype);
		}
	}

	/**
	 * Get method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public short getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 494);
		} else {
			return __io__block.readShort(__io__address + 478);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(short quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 494, quality);
		} else {
			__io__block.writeShort(__io__address + 478, quality);
		}
	}

	/**
	 * Get method for struct member 'use_lock_interface'.
	 * @see #__DNA__FIELD__use_lock_interface
	 */
	
	public byte getUse_lock_interface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 496);
		} else {
			return __io__block.readByte(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'use_lock_interface'.
	 * @see #__DNA__FIELD__use_lock_interface
	 */
	
	public void setUse_lock_interface(byte use_lock_interface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 496, use_lock_interface);
		} else {
			__io__block.writeByte(__io__address + 480, use_lock_interface);
		}
	}

	/**
	 * Get method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public CArrayFacade<Byte> get_pad7() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 497, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 481, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public void set_pad7(CArrayFacade<Byte> _pad7) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 497;
		} else {
			__dna__offset = 481;
		}
		if (__io__equals(_pad7, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad7)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad7);
		} else {
			__io__generic__copy( get_pad7(), _pad7);
		}
	}

	/**
	 * Get method for struct member 'scemode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * @see #__DNA__FIELD__scemode
	 */
	
	public int getScemode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 500);
		} else {
			return __io__block.readInt(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'scemode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * @see #__DNA__FIELD__scemode
	 */
	
	public void setScemode(int scemode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 500, scemode);
		} else {
			__io__block.writeInt(__io__address + 484, scemode);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 504);
		} else {
			return __io__block.readInt(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flags for render settings. Use bit-masking to access the settings. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 504, mode);
		} else {
			__io__block.writeInt(__io__address + 488, mode);
		}
	}

	/**
	 * Get method for struct member 'frs_sec'.
	 * @see #__DNA__FIELD__frs_sec
	 */
	
	public short getFrs_sec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 508);
		} else {
			return __io__block.readShort(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'frs_sec'.
	 * @see #__DNA__FIELD__frs_sec
	 */
	
	public void setFrs_sec(short frs_sec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 508, frs_sec);
		} else {
			__io__block.writeShort(__io__address + 492, frs_sec);
		}
	}

	/**
	 * Get method for struct member 'alphamode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> What to do with the sky/background. Picks sky/premul blending for the background. </p>
	 * @see #__DNA__FIELD__alphamode
	 */
	
	public byte getAlphamode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 510);
		} else {
			return __io__block.readByte(__io__address + 494);
		}
	}

	/**
	 * Set method for struct member 'alphamode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> What to do with the sky/background. Picks sky/premul blending for the background. </p>
	 * @see #__DNA__FIELD__alphamode
	 */
	
	public void setAlphamode(byte alphamode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 510, alphamode);
		} else {
			__io__block.writeByte(__io__address + 494, alphamode);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 511, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 495, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 511;
		} else {
			__dna__offset = 495;
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
	 * Get method for struct member 'border'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Render border to render sub-resions. </p>
	 * @see #__DNA__FIELD__border
	 */
	
	public rctf getBorder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 512, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 496, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'border'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Render border to render sub-resions. </p>
	 * @see #__DNA__FIELD__border
	 */
	
	public void setBorder(rctf border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 512;
		} else {
			__dna__offset = 496;
		}
		if (__io__equals(border, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, border)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, border);
		} else {
			__io__generic__copy( getBorder(), border);
		}
	}

	/**
	 * Get method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> information on different layers to be rendered Converted to Scene->view_layers. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public ListBase getLayers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 528, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 512, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> information on different layers to be rendered Converted to Scene->view_layers. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public void setLayers(ListBase layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 512;
		}
		if (__io__equals(layers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layers);
		} else {
			__io__generic__copy( getLayers(), layers);
		}
	}

	/**
	 * Get method for struct member 'actlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Converted to Scene->active_layer. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__actlay
	 */
	
	public short getActlay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 544);
		} else {
			return __io__block.readShort(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'actlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Converted to Scene->active_layer. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__actlay
	 */
	
	public void setActlay(short actlay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 544, actlay);
		} else {
			__io__block.writeShort(__io__address + 520, actlay);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 546, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 522, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 546;
		} else {
			__dna__offset = 522;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'xasp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Adjustment factors for the aspect ratio in the x direction, was a short in 2.45 </p>
	 * @see #__DNA__FIELD__xasp
	 */
	
	public float getXasp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 548);
		} else {
			return __io__block.readFloat(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'xasp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Adjustment factors for the aspect ratio in the x direction, was a short in 2.45 </p>
	 * @see #__DNA__FIELD__xasp
	 */
	
	public void setXasp(float xasp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 548, xasp);
		} else {
			__io__block.writeFloat(__io__address + 524, xasp);
		}
	}

	/**
	 * Get method for struct member 'yasp'.
	 * @see #__DNA__FIELD__yasp
	 */
	
	public float getYasp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 552);
		} else {
			return __io__block.readFloat(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'yasp'.
	 * @see #__DNA__FIELD__yasp
	 */
	
	public void setYasp(float yasp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 552, yasp);
		} else {
			__io__block.writeFloat(__io__address + 528, yasp);
		}
	}

	/**
	 * Get method for struct member 'frs_sec_base'.
	 * @see #__DNA__FIELD__frs_sec_base
	 */
	
	public float getFrs_sec_base() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 556);
		} else {
			return __io__block.readFloat(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'frs_sec_base'.
	 * @see #__DNA__FIELD__frs_sec_base
	 */
	
	public void setFrs_sec_base(float frs_sec_base) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 556, frs_sec_base);
		} else {
			__io__block.writeFloat(__io__address + 532, frs_sec_base);
		}
	}

	/**
	 * Get method for struct member 'gauss'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value used to define filter size for all filter options. </p>
	 * @see #__DNA__FIELD__gauss
	 */
	
	public float getGauss() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'gauss'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value used to define filter size for all filter options. </p>
	 * @see #__DNA__FIELD__gauss
	 */
	
	public void setGauss(float gauss) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 560, gauss);
		} else {
			__io__block.writeFloat(__io__address + 536, gauss);
		}
	}

	/**
	 * Get method for struct member 'color_mgt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> color management settings - color profiles, gamma correction, etc </p>
	 * @see #__DNA__FIELD__color_mgt_flag
	 */
	
	public int getColor_mgt_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 564);
		} else {
			return __io__block.readInt(__io__address + 540);
		}
	}

	/**
	 * Set method for struct member 'color_mgt_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> color management settings - color profiles, gamma correction, etc </p>
	 * @see #__DNA__FIELD__color_mgt_flag
	 */
	
	public void setColor_mgt_flag(int color_mgt_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 564, color_mgt_flag);
		} else {
			__io__block.writeInt(__io__address + 540, color_mgt_flag);
		}
	}

	/**
	 * Get method for struct member 'dither_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dither noise intensity </p>
	 * @see #__DNA__FIELD__dither_intensity
	 */
	
	public float getDither_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 568);
		} else {
			return __io__block.readFloat(__io__address + 544);
		}
	}

	/**
	 * Set method for struct member 'dither_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Dither noise intensity </p>
	 * @see #__DNA__FIELD__dither_intensity
	 */
	
	public void setDither_intensity(float dither_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 568, dither_intensity);
		} else {
			__io__block.writeFloat(__io__address + 544, dither_intensity);
		}
	}

	/**
	 * Get method for struct member 'bake_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bake Render options </p>
	 * @see #__DNA__FIELD__bake_mode
	 */
	
	public short getBake_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 572);
		} else {
			return __io__block.readShort(__io__address + 548);
		}
	}

	/**
	 * Set method for struct member 'bake_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bake Render options </p>
	 * @see #__DNA__FIELD__bake_mode
	 */
	
	public void setBake_mode(short bake_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 572, bake_mode);
		} else {
			__io__block.writeShort(__io__address + 548, bake_mode);
		}
	}

	/**
	 * Get method for struct member 'bake_flag'.
	 * @see #__DNA__FIELD__bake_flag
	 */
	
	public short getBake_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 574);
		} else {
			return __io__block.readShort(__io__address + 550);
		}
	}

	/**
	 * Set method for struct member 'bake_flag'.
	 * @see #__DNA__FIELD__bake_flag
	 */
	
	public void setBake_flag(short bake_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 574, bake_flag);
		} else {
			__io__block.writeShort(__io__address + 550, bake_flag);
		}
	}

	/**
	 * Get method for struct member 'bake_filter'.
	 * @see #__DNA__FIELD__bake_filter
	 */
	
	public short getBake_filter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 576);
		} else {
			return __io__block.readShort(__io__address + 552);
		}
	}

	/**
	 * Set method for struct member 'bake_filter'.
	 * @see #__DNA__FIELD__bake_filter
	 */
	
	public void setBake_filter(short bake_filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 576, bake_filter);
		} else {
			__io__block.writeShort(__io__address + 552, bake_filter);
		}
	}

	/**
	 * Get method for struct member 'bake_samples'.
	 * @see #__DNA__FIELD__bake_samples
	 */
	
	public short getBake_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 578);
		} else {
			return __io__block.readShort(__io__address + 554);
		}
	}

	/**
	 * Set method for struct member 'bake_samples'.
	 * @see #__DNA__FIELD__bake_samples
	 */
	
	public void setBake_samples(short bake_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 578, bake_samples);
		} else {
			__io__block.writeShort(__io__address + 554, bake_samples);
		}
	}

	/**
	 * Get method for struct member 'bake_margin_type'.
	 * @see #__DNA__FIELD__bake_margin_type
	 */
	
	public short getBake_margin_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 580);
		} else {
			return __io__block.readShort(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'bake_margin_type'.
	 * @see #__DNA__FIELD__bake_margin_type
	 */
	
	public void setBake_margin_type(short bake_margin_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 580, bake_margin_type);
		} else {
			__io__block.writeShort(__io__address + 556, bake_margin_type);
		}
	}

	/**
	 * Get method for struct member '_pad9'.
	 * @see #__DNA__FIELD___pad9
	 */
	
	public CArrayFacade<Byte> get_pad9() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 582, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 558, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad9'.
	 * @see #__DNA__FIELD___pad9
	 */
	
	public void set_pad9(CArrayFacade<Byte> _pad9) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 582;
		} else {
			__dna__offset = 558;
		}
		if (__io__equals(_pad9, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad9)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad9);
		} else {
			__io__generic__copy( get_pad9(), _pad9);
		}
	}

	/**
	 * Get method for struct member 'bake_biasdist'.
	 * @see #__DNA__FIELD__bake_biasdist
	 */
	
	public float getBake_biasdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 588);
		} else {
			return __io__block.readFloat(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'bake_biasdist'.
	 * @see #__DNA__FIELD__bake_biasdist
	 */
	
	public void setBake_biasdist(float bake_biasdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 588, bake_biasdist);
		} else {
			__io__block.writeFloat(__io__address + 564, bake_biasdist);
		}
	}

	/**
	 * Get method for struct member 'bake_user_scale'.
	 * @see #__DNA__FIELD__bake_user_scale
	 */
	
	public float getBake_user_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 592);
		} else {
			return __io__block.readFloat(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'bake_user_scale'.
	 * @see #__DNA__FIELD__bake_user_scale
	 */
	
	public void setBake_user_scale(float bake_user_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 592, bake_user_scale);
		} else {
			__io__block.writeFloat(__io__address + 568, bake_user_scale);
		}
	}

	/**
	 * Get method for struct member 'pic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code>  code. </p>
	 * @see #__DNA__FIELD__pic
	 */
	
	public CArrayFacade<Byte> getPic() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 596, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 572, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code>  code. </p>
	 * @see #__DNA__FIELD__pic
	 */
	
	public void setPic(CArrayFacade<Byte> pic) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 596;
		} else {
			__dna__offset = 572;
		}
		if (__io__equals(pic, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pic)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pic);
		} else {
			__io__generic__copy( getPic(), pic);
		}
	}

	/**
	 * Get method for struct member 'stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamps flags. </p>
	 * @see #__DNA__FIELD__stamp
	 */
	
	public int getStamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1620);
		} else {
			return __io__block.readInt(__io__address + 1596);
		}
	}

	/**
	 * Set method for struct member 'stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamps flags. </p>
	 * @see #__DNA__FIELD__stamp
	 */
	
	public void setStamp(int stamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1620, stamp);
		} else {
			__io__block.writeInt(__io__address + 1596, stamp);
		}
	}

	/**
	 * Get method for struct member 'stamp_font_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Select one of blenders bitmap fonts. </p>
	 * @see #__DNA__FIELD__stamp_font_id
	 */
	
	public short getStamp_font_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1624);
		} else {
			return __io__block.readShort(__io__address + 1600);
		}
	}

	/**
	 * Set method for struct member 'stamp_font_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Select one of blenders bitmap fonts. </p>
	 * @see #__DNA__FIELD__stamp_font_id
	 */
	
	public void setStamp_font_id(short stamp_font_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1624, stamp_font_id);
		} else {
			__io__block.writeShort(__io__address + 1600, stamp_font_id);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1626, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1602, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1626;
		} else {
			__dna__offset = 1602;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'stamp_udata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamp info user data. </p>
	 * @see #__DNA__FIELD__stamp_udata
	 */
	
	public CArrayFacade<Byte> getStamp_udata() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1628, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1604, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stamp_udata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> stamp info user data. </p>
	 * @see #__DNA__FIELD__stamp_udata
	 */
	
	public void setStamp_udata(CArrayFacade<Byte> stamp_udata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1628;
		} else {
			__dna__offset = 1604;
		}
		if (__io__equals(stamp_udata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stamp_udata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stamp_udata);
		} else {
			__io__generic__copy( getStamp_udata(), stamp_udata);
		}
	}

	/**
	 * Get method for struct member 'fg_stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> foreground/background color. </p>
	 * @see #__DNA__FIELD__fg_stamp
	 */
	
	public CArrayFacade<Float> getFg_stamp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fg_stamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> foreground/background color. </p>
	 * @see #__DNA__FIELD__fg_stamp
	 */
	
	public void setFg_stamp(CArrayFacade<Float> fg_stamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2396;
		} else {
			__dna__offset = 2372;
		}
		if (__io__equals(fg_stamp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fg_stamp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fg_stamp);
		} else {
			__io__generic__copy( getFg_stamp(), fg_stamp);
		}
	}

	/**
	 * Get method for struct member 'bg_stamp'.
	 * @see #__DNA__FIELD__bg_stamp
	 */
	
	public CArrayFacade<Float> getBg_stamp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bg_stamp'.
	 * @see #__DNA__FIELD__bg_stamp
	 */
	
	public void setBg_stamp(CArrayFacade<Float> bg_stamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2412;
		} else {
			__dna__offset = 2388;
		}
		if (__io__equals(bg_stamp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bg_stamp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bg_stamp);
		} else {
			__io__generic__copy( getBg_stamp(), bg_stamp);
		}
	}

	/**
	 * Get method for struct member 'seq_prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> sequencer options </p>
	 * @see #__DNA__FIELD__seq_prev_type
	 */
	
	public byte getSeq_prev_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2428);
		} else {
			return __io__block.readByte(__io__address + 2404);
		}
	}

	/**
	 * Set method for struct member 'seq_prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> sequencer options </p>
	 * @see #__DNA__FIELD__seq_prev_type
	 */
	
	public void setSeq_prev_type(byte seq_prev_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2428, seq_prev_type);
		} else {
			__io__block.writeByte(__io__address + 2404, seq_prev_type);
		}
	}

	/**
	 * Get method for struct member 'seq_rend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UNUSED. </p>
	 * @see #__DNA__FIELD__seq_rend_type
	 */
	
	public byte getSeq_rend_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2429);
		} else {
			return __io__block.readByte(__io__address + 2405);
		}
	}

	/**
	 * Set method for struct member 'seq_rend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UNUSED. </p>
	 * @see #__DNA__FIELD__seq_rend_type
	 */
	
	public void setSeq_rend_type(byte seq_rend_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2429, seq_rend_type);
		} else {
			__io__block.writeByte(__io__address + 2405, seq_rend_type);
		}
	}

	/**
	 * Get method for struct member 'seq_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag use for sequence render/draw. </p>
	 * @see #__DNA__FIELD__seq_flag
	 */
	
	public byte getSeq_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2430);
		} else {
			return __io__block.readByte(__io__address + 2406);
		}
	}

	/**
	 * Set method for struct member 'seq_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag use for sequence render/draw. </p>
	 * @see #__DNA__FIELD__seq_flag
	 */
	
	public void setSeq_flag(byte seq_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2430, seq_flag);
		} else {
			__io__block.writeByte(__io__address + 2406, seq_flag);
		}
	}

	/**
	 * Get method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public CArrayFacade<Byte> get_pad5() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2431, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2407, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public void set_pad5(CArrayFacade<Byte> _pad5) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2431;
		} else {
			__dna__offset = 2407;
		}
		if (__io__equals(_pad5, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad5)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad5);
		} else {
			__io__generic__copy( get_pad5(), _pad5);
		}
	}

	/**
	 * Get method for struct member 'simplify_subsurf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render simplify </p>
	 * @see #__DNA__FIELD__simplify_subsurf
	 */
	
	public short getSimplify_subsurf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2434);
		} else {
			return __io__block.readShort(__io__address + 2410);
		}
	}

	/**
	 * Set method for struct member 'simplify_subsurf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render simplify </p>
	 * @see #__DNA__FIELD__simplify_subsurf
	 */
	
	public void setSimplify_subsurf(short simplify_subsurf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2434, simplify_subsurf);
		} else {
			__io__block.writeShort(__io__address + 2410, simplify_subsurf);
		}
	}

	/**
	 * Get method for struct member 'simplify_subsurf_render'.
	 * @see #__DNA__FIELD__simplify_subsurf_render
	 */
	
	public short getSimplify_subsurf_render() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2436);
		} else {
			return __io__block.readShort(__io__address + 2412);
		}
	}

	/**
	 * Set method for struct member 'simplify_subsurf_render'.
	 * @see #__DNA__FIELD__simplify_subsurf_render
	 */
	
	public void setSimplify_subsurf_render(short simplify_subsurf_render) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2436, simplify_subsurf_render);
		} else {
			__io__block.writeShort(__io__address + 2412, simplify_subsurf_render);
		}
	}

	/**
	 * Get method for struct member 'simplify_gpencil'.
	 * @see #__DNA__FIELD__simplify_gpencil
	 */
	
	public short getSimplify_gpencil() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2438);
		} else {
			return __io__block.readShort(__io__address + 2414);
		}
	}

	/**
	 * Set method for struct member 'simplify_gpencil'.
	 * @see #__DNA__FIELD__simplify_gpencil
	 */
	
	public void setSimplify_gpencil(short simplify_gpencil) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2438, simplify_gpencil);
		} else {
			__io__block.writeShort(__io__address + 2414, simplify_gpencil);
		}
	}

	/**
	 * Get method for struct member 'simplify_particles'.
	 * @see #__DNA__FIELD__simplify_particles
	 */
	
	public float getSimplify_particles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2440);
		} else {
			return __io__block.readFloat(__io__address + 2416);
		}
	}

	/**
	 * Set method for struct member 'simplify_particles'.
	 * @see #__DNA__FIELD__simplify_particles
	 */
	
	public void setSimplify_particles(float simplify_particles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2440, simplify_particles);
		} else {
			__io__block.writeFloat(__io__address + 2416, simplify_particles);
		}
	}

	/**
	 * Get method for struct member 'simplify_particles_render'.
	 * @see #__DNA__FIELD__simplify_particles_render
	 */
	
	public float getSimplify_particles_render() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2444);
		} else {
			return __io__block.readFloat(__io__address + 2420);
		}
	}

	/**
	 * Set method for struct member 'simplify_particles_render'.
	 * @see #__DNA__FIELD__simplify_particles_render
	 */
	
	public void setSimplify_particles_render(float simplify_particles_render) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2444, simplify_particles_render);
		} else {
			__io__block.writeFloat(__io__address + 2420, simplify_particles_render);
		}
	}

	/**
	 * Get method for struct member 'simplify_volumes'.
	 * @see #__DNA__FIELD__simplify_volumes
	 */
	
	public float getSimplify_volumes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2448);
		} else {
			return __io__block.readFloat(__io__address + 2424);
		}
	}

	/**
	 * Set method for struct member 'simplify_volumes'.
	 * @see #__DNA__FIELD__simplify_volumes
	 */
	
	public void setSimplify_volumes(float simplify_volumes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2448, simplify_volumes);
		} else {
			__io__block.writeFloat(__io__address + 2424, simplify_volumes);
		}
	}

	/**
	 * Get method for struct member 'line_thickness_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Freestyle line thickness options </p>
	 * @see #__DNA__FIELD__line_thickness_mode
	 */
	
	public int getLine_thickness_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2452);
		} else {
			return __io__block.readInt(__io__address + 2428);
		}
	}

	/**
	 * Set method for struct member 'line_thickness_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Freestyle line thickness options </p>
	 * @see #__DNA__FIELD__line_thickness_mode
	 */
	
	public void setLine_thickness_mode(int line_thickness_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2452, line_thickness_mode);
		} else {
			__io__block.writeInt(__io__address + 2428, line_thickness_mode);
		}
	}

	/**
	 * Get method for struct member 'unit_line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In pixels. </p>
	 * @see #__DNA__FIELD__unit_line_thickness
	 */
	
	public float getUnit_line_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2456);
		} else {
			return __io__block.readFloat(__io__address + 2432);
		}
	}

	/**
	 * Set method for struct member 'unit_line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In pixels. </p>
	 * @see #__DNA__FIELD__unit_line_thickness
	 */
	
	public void setUnit_line_thickness(float unit_line_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2456, unit_line_thickness);
		} else {
			__io__block.writeFloat(__io__address + 2432, unit_line_thickness);
		}
	}

	/**
	 * Get method for struct member 'engine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render engine </p>
	 * @see #__DNA__FIELD__engine
	 */
	
	public CArrayFacade<Byte> getEngine() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2436, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'engine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> render engine </p>
	 * @see #__DNA__FIELD__engine
	 */
	
	public void setEngine(CArrayFacade<Byte> engine) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2460;
		} else {
			__dna__offset = 2436;
		}
		if (__io__equals(engine, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, engine)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, engine);
		} else {
			__io__generic__copy( getEngine(), engine);
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
			return new CArrayFacade<Byte>(__io__address + 2492, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2492;
		} else {
			__dna__offset = 2468;
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
	 * Get method for struct member 'perf_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Performance Options </p>
	 * @see #__DNA__FIELD__perf_flag
	 */
	
	public short getPerf_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2494);
		} else {
			return __io__block.readShort(__io__address + 2470);
		}
	}

	/**
	 * Set method for struct member 'perf_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Performance Options </p>
	 * @see #__DNA__FIELD__perf_flag
	 */
	
	public void setPerf_flag(short perf_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2494, perf_flag);
		} else {
			__io__block.writeShort(__io__address + 2470, perf_flag);
		}
	}

	/**
	 * Get method for struct member 'bake'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cycles baking </p>
	 * @see #__DNA__FIELD__bake
	 */
	
	public BakeData getBake() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BakeData(__io__address + 2496, __io__block, __io__blockTable);
		} else {
			return new BakeData(__io__address + 2472, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bake'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cycles baking </p>
	 * @see #__DNA__FIELD__bake
	 */
	
	public void setBake(BakeData bake) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2496;
		} else {
			__dna__offset = 2472;
		}
		if (__io__equals(bake, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bake)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bake);
		} else {
			__io__generic__copy( getBake(), bake);
		}
	}

	/**
	 * Get method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public int get_pad8() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3888);
		} else {
			return __io__block.readInt(__io__address + 3852);
		}
	}

	/**
	 * Set method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public void set_pad8(int _pad8) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3888, _pad8);
		} else {
			__io__block.writeInt(__io__address + 3852, _pad8);
		}
	}

	/**
	 * Get method for struct member 'preview_pixel_size'.
	 * @see #__DNA__FIELD__preview_pixel_size
	 */
	
	public short getPreview_pixel_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3892);
		} else {
			return __io__block.readShort(__io__address + 3856);
		}
	}

	/**
	 * Set method for struct member 'preview_pixel_size'.
	 * @see #__DNA__FIELD__preview_pixel_size
	 */
	
	public void setPreview_pixel_size(short preview_pixel_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3892, preview_pixel_size);
		} else {
			__io__block.writeShort(__io__address + 3856, preview_pixel_size);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public short get_pad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3894);
		} else {
			return __io__block.readShort(__io__address + 3858);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(short _pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3894, _pad4);
		} else {
			__io__block.writeShort(__io__address + 3858, _pad4);
		}
	}

	/**
	 * Get method for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MultiView {@link SceneRenderView} . </p>
	 * @see #__DNA__FIELD__views
	 */
	
	public ListBase getViews() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 3896, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 3860, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'views'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MultiView {@link SceneRenderView} . </p>
	 * @see #__DNA__FIELD__views
	 */
	
	public void setViews(ListBase views) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3896;
		} else {
			__dna__offset = 3860;
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
	 * Get method for struct member 'actview'.
	 * @see #__DNA__FIELD__actview
	 */
	
	public short getActview() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3912);
		} else {
			return __io__block.readShort(__io__address + 3868);
		}
	}

	/**
	 * Set method for struct member 'actview'.
	 * @see #__DNA__FIELD__actview
	 */
	
	public void setActview(short actview) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3912, actview);
		} else {
			__io__block.writeShort(__io__address + 3868, actview);
		}
	}

	/**
	 * Get method for struct member 'views_format'.
	 * @see #__DNA__FIELD__views_format
	 */
	
	public short getViews_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3914);
		} else {
			return __io__block.readShort(__io__address + 3870);
		}
	}

	/**
	 * Set method for struct member 'views_format'.
	 * @see #__DNA__FIELD__views_format
	 */
	
	public void setViews_format(short views_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3914, views_format);
		} else {
			__io__block.writeShort(__io__address + 3870, views_format);
		}
	}

	/**
	 * Get method for struct member 'hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hair Display </p>
	 * @see #__DNA__FIELD__hair_type
	 */
	
	public short getHair_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3916);
		} else {
			return __io__block.readShort(__io__address + 3872);
		}
	}

	/**
	 * Set method for struct member 'hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hair Display </p>
	 * @see #__DNA__FIELD__hair_type
	 */
	
	public void setHair_type(short hair_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3916, hair_type);
		} else {
			__io__block.writeShort(__io__address + 3872, hair_type);
		}
	}

	/**
	 * Get method for struct member 'hair_subdiv'.
	 * @see #__DNA__FIELD__hair_subdiv
	 */
	
	public short getHair_subdiv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 3918);
		} else {
			return __io__block.readShort(__io__address + 3874);
		}
	}

	/**
	 * Set method for struct member 'hair_subdiv'.
	 * @see #__DNA__FIELD__hair_subdiv
	 */
	
	public void setHair_subdiv(short hair_subdiv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 3918, hair_subdiv);
		} else {
			__io__block.writeShort(__io__address + 3874, hair_subdiv);
		}
	}

	/**
	 * Get method for struct member 'mblur_shutter_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion blur shutter </p>
	 * @see #__DNA__FIELD__mblur_shutter_curve
	 */
	
	public CurveMapping getMblur_shutter_curve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CurveMapping(__io__address + 3920, __io__block, __io__blockTable);
		} else {
			return new CurveMapping(__io__address + 3876, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mblur_shutter_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Motion blur shutter </p>
	 * @see #__DNA__FIELD__mblur_shutter_curve
	 */
	
	public void setMblur_shutter_curve(CurveMapping mblur_shutter_curve) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3920;
		} else {
			__dna__offset = 3876;
		}
		if (__io__equals(mblur_shutter_curve, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mblur_shutter_curve)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mblur_shutter_curve);
		} else {
			__io__generic__copy( getMblur_shutter_curve(), mblur_shutter_curve);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RenderData> __io__addressof() {
		return new CPointer<RenderData>(__io__address, new Class[]{RenderData.class}, __io__block, __io__blockTable);
	}

}
