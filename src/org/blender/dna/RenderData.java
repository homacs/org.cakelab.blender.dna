package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RenderData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=3944, size64=3984)
public class RenderData extends CFacade {

	/**
	 * This is the sdna index of the struct RenderData.
	 * <p>
	 * It is required when allocating a new block to store data for RenderData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 162;

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
	 * <li>Actual Size (32bit/64bit): 240/248</li>
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
	public static final long[] __DNA__FIELD__avicodecdata = new long[]{240, 248};

	/**
	 * Field descriptor (offset) for struct member 'qtcodecdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__qtcodecdata);
	 * CPointer&lt;CPointer&lt;QuicktimeCodecData&gt;&gt; p_qtcodecdata = p.cast(new Class[]{CPointer.class, QuicktimeCodecData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'qtcodecdata'</li>
	 * <li>Signature: 'QuicktimeCodecData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__qtcodecdata = new long[]{244, 256};

	/**
	 * Field descriptor (offset) for struct member 'qtcodecsettings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__qtcodecsettings);
	 * CPointer&lt;QuicktimeCodecSettings&gt; p_qtcodecsettings = p.cast(new Class[]{QuicktimeCodecSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'qtcodecsettings'</li>
	 * <li>Signature: 'QuicktimeCodecSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__qtcodecsettings = new long[]{248, 264};

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
	 * <li>Actual Size (32bit/64bit): 68/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ffcodecdata = new long[]{312, 328};

	/**
	 * Field descriptor (offset) for struct member 'cfra'.
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
	public static final long[] __DNA__FIELD__cfra = new long[]{380, 400};

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
	public static final long[] __DNA__FIELD__sfra = new long[]{384, 404};

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
	public static final long[] __DNA__FIELD__efra = new long[]{388, 408};

	/**
	 * Field descriptor (offset) for struct member 'subframe'.
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
	public static final long[] __DNA__FIELD__subframe = new long[]{392, 412};

	/**
	 * Field descriptor (offset) for struct member 'psfra'.
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
	public static final long[] __DNA__FIELD__psfra = new long[]{396, 416};

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
	public static final long[] __DNA__FIELD__pefra = new long[]{400, 420};

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
	public static final long[] __DNA__FIELD__images = new long[]{404, 424};

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
	public static final long[] __DNA__FIELD__framapto = new long[]{408, 428};

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
	public static final long[] __DNA__FIELD__flag = new long[]{412, 432};

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
	public static final long[] __DNA__FIELD__threads = new long[]{414, 434};

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
	public static final long[] __DNA__FIELD__framelen = new long[]{416, 436};

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
	public static final long[] __DNA__FIELD__blurfac = new long[]{420, 440};

	/**
	 * Field descriptor (offset) for struct member 'edgeR'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__edgeR);
	 * CPointer&lt;Float&gt; p_edgeR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgeR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgeR = new long[]{424, 444};

	/**
	 * Field descriptor (offset) for struct member 'edgeG'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__edgeG);
	 * CPointer&lt;Float&gt; p_edgeG = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgeG'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgeG = new long[]{428, 448};

	/**
	 * Field descriptor (offset) for struct member 'edgeB'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__edgeB);
	 * CPointer&lt;Float&gt; p_edgeB = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgeB'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgeB = new long[]{432, 452};

	/**
	 * Field descriptor (offset) for struct member 'fullscreen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__fullscreen);
	 * CPointer&lt;Short&gt; p_fullscreen = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fullscreen'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fullscreen = new long[]{436, 456};

	/**
	 * Field descriptor (offset) for struct member 'xplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__xplay);
	 * CPointer&lt;Short&gt; p_xplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xplay = new long[]{438, 458};

	/**
	 * Field descriptor (offset) for struct member 'yplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__yplay);
	 * CPointer&lt;Short&gt; p_yplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yplay = new long[]{440, 460};

	/**
	 * Field descriptor (offset) for struct member 'freqplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__freqplay);
	 * CPointer&lt;Short&gt; p_freqplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freqplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freqplay = new long[]{442, 462};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__depth);
	 * CPointer&lt;Short&gt; p_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{444, 464};

	/**
	 * Field descriptor (offset) for struct member 'attrib'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__attrib);
	 * CPointer&lt;Short&gt; p_attrib = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attrib'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attrib = new long[]{446, 466};

	/**
	 * Field descriptor (offset) for struct member 'frame_step'.
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
	public static final long[] __DNA__FIELD__frame_step = new long[]{448, 468};

	/**
	 * Field descriptor (offset) for struct member 'stereomode'.
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
	public static final long[] __DNA__FIELD__stereomode = new long[]{452, 472};

	/**
	 * Field descriptor (offset) for struct member 'dimensionspreset'.
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
	public static final long[] __DNA__FIELD__dimensionspreset = new long[]{454, 474};

	/**
	 * Field descriptor (offset) for struct member 'filtertype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__filtertype);
	 * CPointer&lt;Short&gt; p_filtertype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filtertype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filtertype = new long[]{456, 476};

	/**
	 * Field descriptor (offset) for struct member 'size'.
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
	public static final long[] __DNA__FIELD__size = new long[]{458, 478};

	/**
	 * Field descriptor (offset) for struct member 'maximsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__maximsize);
	 * CPointer&lt;Short&gt; p_maximsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maximsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maximsize = new long[]{460, 480};

	/**
	 * Field descriptor (offset) for struct member 'pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad6);
	 * CPointer&lt;Short&gt; p_pad6 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad6'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad6 = new long[]{462, 482};

	/**
	 * Field descriptor (offset) for struct member 'xsch'.
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
	public static final long[] __DNA__FIELD__xsch = new long[]{464, 484};

	/**
	 * Field descriptor (offset) for struct member 'ysch'.
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
	public static final long[] __DNA__FIELD__ysch = new long[]{468, 488};

	/**
	 * Field descriptor (offset) for struct member 'xparts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__xparts);
	 * CPointer&lt;Short&gt; p_xparts = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xparts'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xparts = new long[]{472, 492};

	/**
	 * Field descriptor (offset) for struct member 'yparts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__yparts);
	 * CPointer&lt;Short&gt; p_yparts = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yparts'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yparts = new long[]{474, 494};

	/**
	 * Field descriptor (offset) for struct member 'tilex'.
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
	public static final long[] __DNA__FIELD__tilex = new long[]{476, 496};

	/**
	 * Field descriptor (offset) for struct member 'tiley'.
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
	public static final long[] __DNA__FIELD__tiley = new long[]{480, 500};

	/**
	 * Field descriptor (offset) for struct member 'planes'.
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
	public static final long[] __DNA__FIELD__planes = new long[]{484, 504};

	/**
	 * Field descriptor (offset) for struct member 'imtype'.
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
	public static final long[] __DNA__FIELD__imtype = new long[]{486, 506};

	/**
	 * Field descriptor (offset) for struct member 'subimtype'.
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
	public static final long[] __DNA__FIELD__subimtype = new long[]{488, 508};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
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
	public static final long[] __DNA__FIELD__quality = new long[]{490, 510};

	/**
	 * Field descriptor (offset) for struct member 'displaymode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__displaymode);
	 * CPointer&lt;Short&gt; p_displaymode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'displaymode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__displaymode = new long[]{492, 512};

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
	public static final long[] __DNA__FIELD__use_lock_interface = new long[]{494, 514};

	/**
	 * Field descriptor (offset) for struct member 'pad7'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad7);
	 * CPointer&lt;Byte&gt; p_pad7 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad7'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad7 = new long[]{495, 515};

	/**
	 * Field descriptor (offset) for struct member 'scemode'.
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
	public static final long[] __DNA__FIELD__scemode = new long[]{496, 516};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
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
	public static final long[] __DNA__FIELD__mode = new long[]{500, 520};

	/**
	 * Field descriptor (offset) for struct member 'raytrace_options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__raytrace_options);
	 * CPointer&lt;Integer&gt; p_raytrace_options = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'raytrace_options'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__raytrace_options = new long[]{504, 524};

	/**
	 * Field descriptor (offset) for struct member 'raytrace_structure'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__raytrace_structure);
	 * CPointer&lt;Short&gt; p_raytrace_structure = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'raytrace_structure'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__raytrace_structure = new long[]{508, 528};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad1);
	 * CPointer&lt;Short&gt; p_pad1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{510, 530};

	/**
	 * Field descriptor (offset) for struct member 'ocres'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__ocres);
	 * CPointer&lt;Short&gt; p_ocres = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ocres'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ocres = new long[]{512, 532};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad4);
	 * CPointer&lt;Short&gt; p_pad4 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{514, 534};

	/**
	 * Field descriptor (offset) for struct member 'alphamode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__alphamode);
	 * CPointer&lt;Short&gt; p_alphamode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alphamode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alphamode = new long[]{516, 536};

	/**
	 * Field descriptor (offset) for struct member 'osa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__osa);
	 * CPointer&lt;Short&gt; p_osa = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'osa'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__osa = new long[]{518, 538};

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
	public static final long[] __DNA__FIELD__frs_sec = new long[]{520, 540};

	/**
	 * Field descriptor (offset) for struct member 'edgeint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__edgeint);
	 * CPointer&lt;Short&gt; p_edgeint = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgeint'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgeint = new long[]{522, 542};

	/**
	 * Field descriptor (offset) for struct member 'safety'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__safety);
	 * CPointer&lt;rctf&gt; p_safety = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'safety'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__safety = new long[]{524, 544};

	/**
	 * Field descriptor (offset) for struct member 'border'.
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
	public static final long[] __DNA__FIELD__border = new long[]{540, 560};

	/**
	 * Field descriptor (offset) for struct member 'disprect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__disprect);
	 * CPointer&lt;rcti&gt; p_disprect = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disprect'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disprect = new long[]{556, 576};

	/**
	 * Field descriptor (offset) for struct member 'layers'.
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
	public static final long[] __DNA__FIELD__layers = new long[]{572, 592};

	/**
	 * Field descriptor (offset) for struct member 'actlay'.
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
	public static final long[] __DNA__FIELD__actlay = new long[]{580, 608};

	/**
	 * Field descriptor (offset) for struct member 'mblur_samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__mblur_samples);
	 * CPointer&lt;Short&gt; p_mblur_samples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mblur_samples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mblur_samples = new long[]{582, 610};

	/**
	 * Field descriptor (offset) for struct member 'xasp'.
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
	public static final long[] __DNA__FIELD__xasp = new long[]{584, 612};

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
	public static final long[] __DNA__FIELD__yasp = new long[]{588, 616};

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
	public static final long[] __DNA__FIELD__frs_sec_base = new long[]{592, 620};

	/**
	 * Field descriptor (offset) for struct member 'gauss'.
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
	public static final long[] __DNA__FIELD__gauss = new long[]{596, 624};

	/**
	 * Field descriptor (offset) for struct member 'color_mgt_flag'.
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
	public static final long[] __DNA__FIELD__color_mgt_flag = new long[]{600, 628};

	/**
	 * Field descriptor (offset) for struct member 'postgamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__postgamma);
	 * CPointer&lt;Float&gt; p_postgamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'postgamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__postgamma = new long[]{604, 632};

	/**
	 * Field descriptor (offset) for struct member 'posthue'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__posthue);
	 * CPointer&lt;Float&gt; p_posthue = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'posthue'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__posthue = new long[]{608, 636};

	/**
	 * Field descriptor (offset) for struct member 'postsat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__postsat);
	 * CPointer&lt;Float&gt; p_postsat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'postsat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__postsat = new long[]{612, 640};

	/**
	 * Field descriptor (offset) for struct member 'dither_intensity'.
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
	public static final long[] __DNA__FIELD__dither_intensity = new long[]{616, 644};

	/**
	 * Field descriptor (offset) for struct member 'bake_osa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_osa);
	 * CPointer&lt;Short&gt; p_bake_osa = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_osa'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_osa = new long[]{620, 648};

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
	public static final long[] __DNA__FIELD__bake_filter = new long[]{622, 650};

	/**
	 * Field descriptor (offset) for struct member 'bake_mode'.
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
	public static final long[] __DNA__FIELD__bake_mode = new long[]{624, 652};

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
	public static final long[] __DNA__FIELD__bake_flag = new long[]{626, 654};

	/**
	 * Field descriptor (offset) for struct member 'bake_normal_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_normal_space);
	 * CPointer&lt;Short&gt; p_bake_normal_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_normal_space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_normal_space = new long[]{628, 656};

	/**
	 * Field descriptor (offset) for struct member 'bake_quad_split'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_quad_split);
	 * CPointer&lt;Short&gt; p_bake_quad_split = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_quad_split'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_quad_split = new long[]{630, 658};

	/**
	 * Field descriptor (offset) for struct member 'bake_maxdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_maxdist);
	 * CPointer&lt;Float&gt; p_bake_maxdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_maxdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_maxdist = new long[]{632, 660};

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
	public static final long[] __DNA__FIELD__bake_biasdist = new long[]{636, 664};

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
	public static final long[] __DNA__FIELD__bake_samples = new long[]{640, 668};

	/**
	 * Field descriptor (offset) for struct member 'bake_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_pad);
	 * CPointer&lt;Short&gt; p_bake_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_pad = new long[]{642, 670};

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
	public static final long[] __DNA__FIELD__bake_user_scale = new long[]{644, 672};

	/**
	 * Field descriptor (offset) for struct member 'bake_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__bake_pad1);
	 * CPointer&lt;Float&gt; p_bake_pad1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bake_pad1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake_pad1 = new long[]{648, 676};

	/**
	 * Field descriptor (offset) for struct member 'pic'.
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
	public static final long[] __DNA__FIELD__pic = new long[]{652, 680};

	/**
	 * Field descriptor (offset) for struct member 'stamp'.
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
	public static final long[] __DNA__FIELD__stamp = new long[]{1676, 1704};

	/**
	 * Field descriptor (offset) for struct member 'stamp_font_id'.
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
	public static final long[] __DNA__FIELD__stamp_font_id = new long[]{1680, 1708};

	/**
	 * Field descriptor (offset) for struct member 'pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad3);
	 * CPointer&lt;Short&gt; p_pad3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad3 = new long[]{1682, 1710};

	/**
	 * Field descriptor (offset) for struct member 'stamp_udata'.
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
	public static final long[] __DNA__FIELD__stamp_udata = new long[]{1684, 1712};

	/**
	 * Field descriptor (offset) for struct member 'fg_stamp'.
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
	public static final long[] __DNA__FIELD__fg_stamp = new long[]{2452, 2480};

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
	public static final long[] __DNA__FIELD__bg_stamp = new long[]{2468, 2496};

	/**
	 * Field descriptor (offset) for struct member 'seq_prev_type'.
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
	public static final long[] __DNA__FIELD__seq_prev_type = new long[]{2484, 2512};

	/**
	 * Field descriptor (offset) for struct member 'seq_rend_type'.
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
	public static final long[] __DNA__FIELD__seq_rend_type = new long[]{2485, 2513};

	/**
	 * Field descriptor (offset) for struct member 'seq_flag'.
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
	public static final long[] __DNA__FIELD__seq_flag = new long[]{2486, 2514};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad5);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad5 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{2487, 2515};

	/**
	 * Field descriptor (offset) for struct member 'simplify_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_flag);
	 * CPointer&lt;Integer&gt; p_simplify_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_flag = new long[]{2492, 2520};

	/**
	 * Field descriptor (offset) for struct member 'simplify_subsurf'.
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
	public static final long[] __DNA__FIELD__simplify_subsurf = new long[]{2496, 2524};

	/**
	 * Field descriptor (offset) for struct member 'simplify_shadowsamples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_shadowsamples);
	 * CPointer&lt;Short&gt; p_simplify_shadowsamples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_shadowsamples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_shadowsamples = new long[]{2498, 2526};

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
	public static final long[] __DNA__FIELD__simplify_particles = new long[]{2500, 2528};

	/**
	 * Field descriptor (offset) for struct member 'simplify_aosss'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__simplify_aosss);
	 * CPointer&lt;Float&gt; p_simplify_aosss = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_aosss'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_aosss = new long[]{2504, 2532};

	/**
	 * Field descriptor (offset) for struct member 'cineonwhite'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__cineonwhite);
	 * CPointer&lt;Short&gt; p_cineonwhite = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineonwhite'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineonwhite = new long[]{2508, 2536};

	/**
	 * Field descriptor (offset) for struct member 'cineonblack'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__cineonblack);
	 * CPointer&lt;Short&gt; p_cineonblack = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineonblack'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineonblack = new long[]{2510, 2538};

	/**
	 * Field descriptor (offset) for struct member 'cineongamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__cineongamma);
	 * CPointer&lt;Float&gt; p_cineongamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cineongamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cineongamma = new long[]{2512, 2540};

	/**
	 * Field descriptor (offset) for struct member 'jp2_preset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__jp2_preset);
	 * CPointer&lt;Short&gt; p_jp2_preset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jp2_preset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jp2_preset = new long[]{2516, 2544};

	/**
	 * Field descriptor (offset) for struct member 'jp2_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__jp2_depth);
	 * CPointer&lt;Short&gt; p_jp2_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jp2_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jp2_depth = new long[]{2518, 2546};

	/**
	 * Field descriptor (offset) for struct member 'rpad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__rpad3);
	 * CPointer&lt;Integer&gt; p_rpad3 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rpad3'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rpad3 = new long[]{2520, 2548};

	/**
	 * Field descriptor (offset) for struct member 'domeres'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__domeres);
	 * CPointer&lt;Short&gt; p_domeres = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domeres'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domeres = new long[]{2524, 2552};

	/**
	 * Field descriptor (offset) for struct member 'domemode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__domemode);
	 * CPointer&lt;Short&gt; p_domemode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domemode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domemode = new long[]{2526, 2554};

	/**
	 * Field descriptor (offset) for struct member 'domeangle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__domeangle);
	 * CPointer&lt;Short&gt; p_domeangle = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domeangle'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domeangle = new long[]{2528, 2556};

	/**
	 * Field descriptor (offset) for struct member 'dometilt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__dometilt);
	 * CPointer&lt;Short&gt; p_dometilt = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dometilt'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dometilt = new long[]{2530, 2558};

	/**
	 * Field descriptor (offset) for struct member 'domeresbuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__domeresbuf);
	 * CPointer&lt;Float&gt; p_domeresbuf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domeresbuf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domeresbuf = new long[]{2532, 2560};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad2);
	 * CPointer&lt;Float&gt; p_pad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{2536, 2564};

	/**
	 * Field descriptor (offset) for struct member 'dometext'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__dometext);
	 * CPointer&lt;CPointer&lt;Text&gt;&gt; p_dometext = p.cast(new Class[]{CPointer.class, Text.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dometext'</li>
	 * <li>Signature: 'Text*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dometext = new long[]{2540, 2568};

	/**
	 * Field descriptor (offset) for struct member 'line_thickness_mode'.
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
	public static final long[] __DNA__FIELD__line_thickness_mode = new long[]{2544, 2576};

	/**
	 * Field descriptor (offset) for struct member 'unit_line_thickness'.
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
	public static final long[] __DNA__FIELD__unit_line_thickness = new long[]{2548, 2580};

	/**
	 * Field descriptor (offset) for struct member 'engine'.
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
	public static final long[] __DNA__FIELD__engine = new long[]{2552, 2584};

	/**
	 * Field descriptor (offset) for struct member 'bake'.
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
	 * <li>Actual Size (32bit/64bit): 1352/1360</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bake = new long[]{2584, 2616};

	/**
	 * Field descriptor (offset) for struct member 'preview_start_resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__preview_start_resolution);
	 * CPointer&lt;Integer&gt; p_preview_start_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_start_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_start_resolution = new long[]{3936, 3976};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RenderData renderdata = ...;
	 * CPointer&lt;Object&gt; p = renderdata.__dna__addressof(RenderData.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{3940, 3980};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
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
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
		}
	}

	/**
	 * Get method for struct member 'qtcodecdata'.
	 * @see #__DNA__FIELD__qtcodecdata
	 */
	
	public CPointer<QuicktimeCodecData> getQtcodecdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 244);
		}
		Class<?>[] __dna__targetTypes = new Class[]{QuicktimeCodecData.class};
		return new CPointer<QuicktimeCodecData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, QuicktimeCodecData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'qtcodecdata'.
	 * @see #__DNA__FIELD__qtcodecdata
	 */
	
	public void setQtcodecdata(CPointer<QuicktimeCodecData> qtcodecdata) throws IOException
	{
		long __address = ((qtcodecdata == null) ? 0 : qtcodecdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 244, __address);
		}
	}

	/**
	 * Get method for struct member 'qtcodecsettings'.
	 * @see #__DNA__FIELD__qtcodecsettings
	 */
	
	public QuicktimeCodecSettings getQtcodecsettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new QuicktimeCodecSettings(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new QuicktimeCodecSettings(__io__address + 248, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'qtcodecsettings'.
	 * @see #__DNA__FIELD__qtcodecsettings
	 */
	
	public void setQtcodecsettings(QuicktimeCodecSettings qtcodecsettings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 248;
		}
		if (__io__equals(qtcodecsettings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, qtcodecsettings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, qtcodecsettings);
		} else {
			__io__generic__copy( getQtcodecsettings(), qtcodecsettings);
		}
	}

	/**
	 * Get method for struct member 'ffcodecdata'.
	 * @see #__DNA__FIELD__ffcodecdata
	 */
	
	public FFMpegCodecData getFfcodecdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FFMpegCodecData(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new FFMpegCodecData(__io__address + 312, __io__block, __io__blockTable);
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
			__dna__offset = 328;
		} else {
			__dna__offset = 312;
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
	 * @see #__DNA__FIELD__cfra
	 */
	
	public int getCfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 400);
		} else {
			return __io__block.readInt(__io__address + 380);
		}
	}

	/**
	 * Set method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public void setCfra(int cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 400, cfra);
		} else {
			__io__block.writeInt(__io__address + 380, cfra);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 404);
		} else {
			return __io__block.readInt(__io__address + 384);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 404, sfra);
		} else {
			__io__block.writeInt(__io__address + 384, sfra);
		}
	}

	/**
	 * Get method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public int getEfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 408);
		} else {
			return __io__block.readInt(__io__address + 388);
		}
	}

	/**
	 * Set method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public void setEfra(int efra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 408, efra);
		} else {
			__io__block.writeInt(__io__address + 388, efra);
		}
	}

	/**
	 * Get method for struct member 'subframe'.
	 * @see #__DNA__FIELD__subframe
	 */
	
	public float getSubframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 412);
		} else {
			return __io__block.readFloat(__io__address + 392);
		}
	}

	/**
	 * Set method for struct member 'subframe'.
	 * @see #__DNA__FIELD__subframe
	 */
	
	public void setSubframe(float subframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 412, subframe);
		} else {
			__io__block.writeFloat(__io__address + 392, subframe);
		}
	}

	/**
	 * Get method for struct member 'psfra'.
	 * @see #__DNA__FIELD__psfra
	 */
	
	public int getPsfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 416);
		} else {
			return __io__block.readInt(__io__address + 396);
		}
	}

	/**
	 * Set method for struct member 'psfra'.
	 * @see #__DNA__FIELD__psfra
	 */
	
	public void setPsfra(int psfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 416, psfra);
		} else {
			__io__block.writeInt(__io__address + 396, psfra);
		}
	}

	/**
	 * Get method for struct member 'pefra'.
	 * @see #__DNA__FIELD__pefra
	 */
	
	public int getPefra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 420);
		} else {
			return __io__block.readInt(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'pefra'.
	 * @see #__DNA__FIELD__pefra
	 */
	
	public void setPefra(int pefra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 420, pefra);
		} else {
			__io__block.writeInt(__io__address + 400, pefra);
		}
	}

	/**
	 * Get method for struct member 'images'.
	 * @see #__DNA__FIELD__images
	 */
	
	public int getImages() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 424);
		} else {
			return __io__block.readInt(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'images'.
	 * @see #__DNA__FIELD__images
	 */
	
	public void setImages(int images) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 424, images);
		} else {
			__io__block.writeInt(__io__address + 404, images);
		}
	}

	/**
	 * Get method for struct member 'framapto'.
	 * @see #__DNA__FIELD__framapto
	 */
	
	public int getFramapto() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 428);
		} else {
			return __io__block.readInt(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'framapto'.
	 * @see #__DNA__FIELD__framapto
	 */
	
	public void setFramapto(int framapto) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 428, framapto);
		} else {
			__io__block.writeInt(__io__address + 408, framapto);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 432);
		} else {
			return __io__block.readShort(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 432, flag);
		} else {
			__io__block.writeShort(__io__address + 412, flag);
		}
	}

	/**
	 * Get method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public short getThreads() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 434);
		} else {
			return __io__block.readShort(__io__address + 414);
		}
	}

	/**
	 * Set method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public void setThreads(short threads) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 434, threads);
		} else {
			__io__block.writeShort(__io__address + 414, threads);
		}
	}

	/**
	 * Get method for struct member 'framelen'.
	 * @see #__DNA__FIELD__framelen
	 */
	
	public float getFramelen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 436);
		} else {
			return __io__block.readFloat(__io__address + 416);
		}
	}

	/**
	 * Set method for struct member 'framelen'.
	 * @see #__DNA__FIELD__framelen
	 */
	
	public void setFramelen(float framelen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 436, framelen);
		} else {
			__io__block.writeFloat(__io__address + 416, framelen);
		}
	}

	/**
	 * Get method for struct member 'blurfac'.
	 * @see #__DNA__FIELD__blurfac
	 */
	
	public float getBlurfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 440);
		} else {
			return __io__block.readFloat(__io__address + 420);
		}
	}

	/**
	 * Set method for struct member 'blurfac'.
	 * @see #__DNA__FIELD__blurfac
	 */
	
	public void setBlurfac(float blurfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 440, blurfac);
		} else {
			__io__block.writeFloat(__io__address + 420, blurfac);
		}
	}

	/**
	 * Get method for struct member 'edgeR'.
	 * @see #__DNA__FIELD__edgeR
	 */
	
	public float getEdgeR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 444);
		} else {
			return __io__block.readFloat(__io__address + 424);
		}
	}

	/**
	 * Set method for struct member 'edgeR'.
	 * @see #__DNA__FIELD__edgeR
	 */
	
	public void setEdgeR(float edgeR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 444, edgeR);
		} else {
			__io__block.writeFloat(__io__address + 424, edgeR);
		}
	}

	/**
	 * Get method for struct member 'edgeG'.
	 * @see #__DNA__FIELD__edgeG
	 */
	
	public float getEdgeG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 448);
		} else {
			return __io__block.readFloat(__io__address + 428);
		}
	}

	/**
	 * Set method for struct member 'edgeG'.
	 * @see #__DNA__FIELD__edgeG
	 */
	
	public void setEdgeG(float edgeG) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 448, edgeG);
		} else {
			__io__block.writeFloat(__io__address + 428, edgeG);
		}
	}

	/**
	 * Get method for struct member 'edgeB'.
	 * @see #__DNA__FIELD__edgeB
	 */
	
	public float getEdgeB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 452);
		} else {
			return __io__block.readFloat(__io__address + 432);
		}
	}

	/**
	 * Set method for struct member 'edgeB'.
	 * @see #__DNA__FIELD__edgeB
	 */
	
	public void setEdgeB(float edgeB) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 452, edgeB);
		} else {
			__io__block.writeFloat(__io__address + 432, edgeB);
		}
	}

	/**
	 * Get method for struct member 'fullscreen'.
	 * @see #__DNA__FIELD__fullscreen
	 */
	
	public short getFullscreen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 456);
		} else {
			return __io__block.readShort(__io__address + 436);
		}
	}

	/**
	 * Set method for struct member 'fullscreen'.
	 * @see #__DNA__FIELD__fullscreen
	 */
	
	public void setFullscreen(short fullscreen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 456, fullscreen);
		} else {
			__io__block.writeShort(__io__address + 436, fullscreen);
		}
	}

	/**
	 * Get method for struct member 'xplay'.
	 * @see #__DNA__FIELD__xplay
	 */
	
	public short getXplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 458);
		} else {
			return __io__block.readShort(__io__address + 438);
		}
	}

	/**
	 * Set method for struct member 'xplay'.
	 * @see #__DNA__FIELD__xplay
	 */
	
	public void setXplay(short xplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 458, xplay);
		} else {
			__io__block.writeShort(__io__address + 438, xplay);
		}
	}

	/**
	 * Get method for struct member 'yplay'.
	 * @see #__DNA__FIELD__yplay
	 */
	
	public short getYplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 460);
		} else {
			return __io__block.readShort(__io__address + 440);
		}
	}

	/**
	 * Set method for struct member 'yplay'.
	 * @see #__DNA__FIELD__yplay
	 */
	
	public void setYplay(short yplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 460, yplay);
		} else {
			__io__block.writeShort(__io__address + 440, yplay);
		}
	}

	/**
	 * Get method for struct member 'freqplay'.
	 * @see #__DNA__FIELD__freqplay
	 */
	
	public short getFreqplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 462);
		} else {
			return __io__block.readShort(__io__address + 442);
		}
	}

	/**
	 * Set method for struct member 'freqplay'.
	 * @see #__DNA__FIELD__freqplay
	 */
	
	public void setFreqplay(short freqplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 462, freqplay);
		} else {
			__io__block.writeShort(__io__address + 442, freqplay);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public short getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 464);
		} else {
			return __io__block.readShort(__io__address + 444);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(short depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 464, depth);
		} else {
			__io__block.writeShort(__io__address + 444, depth);
		}
	}

	/**
	 * Get method for struct member 'attrib'.
	 * @see #__DNA__FIELD__attrib
	 */
	
	public short getAttrib() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 466);
		} else {
			return __io__block.readShort(__io__address + 446);
		}
	}

	/**
	 * Set method for struct member 'attrib'.
	 * @see #__DNA__FIELD__attrib
	 */
	
	public void setAttrib(short attrib) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 466, attrib);
		} else {
			__io__block.writeShort(__io__address + 446, attrib);
		}
	}

	/**
	 * Get method for struct member 'frame_step'.
	 * @see #__DNA__FIELD__frame_step
	 */
	
	public int getFrame_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 468);
		} else {
			return __io__block.readInt(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'frame_step'.
	 * @see #__DNA__FIELD__frame_step
	 */
	
	public void setFrame_step(int frame_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 468, frame_step);
		} else {
			__io__block.writeInt(__io__address + 448, frame_step);
		}
	}

	/**
	 * Get method for struct member 'stereomode'.
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public short getStereomode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 472);
		} else {
			return __io__block.readShort(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'stereomode'.
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public void setStereomode(short stereomode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 472, stereomode);
		} else {
			__io__block.writeShort(__io__address + 452, stereomode);
		}
	}

	/**
	 * Get method for struct member 'dimensionspreset'.
	 * @see #__DNA__FIELD__dimensionspreset
	 */
	
	public short getDimensionspreset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 474);
		} else {
			return __io__block.readShort(__io__address + 454);
		}
	}

	/**
	 * Set method for struct member 'dimensionspreset'.
	 * @see #__DNA__FIELD__dimensionspreset
	 */
	
	public void setDimensionspreset(short dimensionspreset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 474, dimensionspreset);
		} else {
			__io__block.writeShort(__io__address + 454, dimensionspreset);
		}
	}

	/**
	 * Get method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public short getFiltertype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 476);
		} else {
			return __io__block.readShort(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'filtertype'.
	 * @see #__DNA__FIELD__filtertype
	 */
	
	public void setFiltertype(short filtertype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 476, filtertype);
		} else {
			__io__block.writeShort(__io__address + 456, filtertype);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public short getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 478);
		} else {
			return __io__block.readShort(__io__address + 458);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(short size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 478, size);
		} else {
			__io__block.writeShort(__io__address + 458, size);
		}
	}

	/**
	 * Get method for struct member 'maximsize'.
	 * @see #__DNA__FIELD__maximsize
	 */
	
	public short getMaximsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 480);
		} else {
			return __io__block.readShort(__io__address + 460);
		}
	}

	/**
	 * Set method for struct member 'maximsize'.
	 * @see #__DNA__FIELD__maximsize
	 */
	
	public void setMaximsize(short maximsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 480, maximsize);
		} else {
			__io__block.writeShort(__io__address + 460, maximsize);
		}
	}

	/**
	 * Get method for struct member 'pad6'.
	 * @see #__DNA__FIELD__pad6
	 */
	
	public short getPad6() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 482);
		} else {
			return __io__block.readShort(__io__address + 462);
		}
	}

	/**
	 * Set method for struct member 'pad6'.
	 * @see #__DNA__FIELD__pad6
	 */
	
	public void setPad6(short pad6) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 482, pad6);
		} else {
			__io__block.writeShort(__io__address + 462, pad6);
		}
	}

	/**
	 * Get method for struct member 'xsch'.
	 * @see #__DNA__FIELD__xsch
	 */
	
	public int getXsch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 484);
		} else {
			return __io__block.readInt(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'xsch'.
	 * @see #__DNA__FIELD__xsch
	 */
	
	public void setXsch(int xsch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 484, xsch);
		} else {
			__io__block.writeInt(__io__address + 464, xsch);
		}
	}

	/**
	 * Get method for struct member 'ysch'.
	 * @see #__DNA__FIELD__ysch
	 */
	
	public int getYsch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 488);
		} else {
			return __io__block.readInt(__io__address + 468);
		}
	}

	/**
	 * Set method for struct member 'ysch'.
	 * @see #__DNA__FIELD__ysch
	 */
	
	public void setYsch(int ysch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 488, ysch);
		} else {
			__io__block.writeInt(__io__address + 468, ysch);
		}
	}

	/**
	 * Get method for struct member 'xparts'.
	 * @see #__DNA__FIELD__xparts
	 */
	
	public short getXparts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 492);
		} else {
			return __io__block.readShort(__io__address + 472);
		}
	}

	/**
	 * Set method for struct member 'xparts'.
	 * @see #__DNA__FIELD__xparts
	 */
	
	public void setXparts(short xparts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 492, xparts);
		} else {
			__io__block.writeShort(__io__address + 472, xparts);
		}
	}

	/**
	 * Get method for struct member 'yparts'.
	 * @see #__DNA__FIELD__yparts
	 */
	
	public short getYparts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 494);
		} else {
			return __io__block.readShort(__io__address + 474);
		}
	}

	/**
	 * Set method for struct member 'yparts'.
	 * @see #__DNA__FIELD__yparts
	 */
	
	public void setYparts(short yparts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 494, yparts);
		} else {
			__io__block.writeShort(__io__address + 474, yparts);
		}
	}

	/**
	 * Get method for struct member 'tilex'.
	 * @see #__DNA__FIELD__tilex
	 */
	
	public int getTilex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 496);
		} else {
			return __io__block.readInt(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'tilex'.
	 * @see #__DNA__FIELD__tilex
	 */
	
	public void setTilex(int tilex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 496, tilex);
		} else {
			__io__block.writeInt(__io__address + 476, tilex);
		}
	}

	/**
	 * Get method for struct member 'tiley'.
	 * @see #__DNA__FIELD__tiley
	 */
	
	public int getTiley() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 500);
		} else {
			return __io__block.readInt(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'tiley'.
	 * @see #__DNA__FIELD__tiley
	 */
	
	public void setTiley(int tiley) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 500, tiley);
		} else {
			__io__block.writeInt(__io__address + 480, tiley);
		}
	}

	/**
	 * Get method for struct member 'planes'.
	 * @see #__DNA__FIELD__planes
	 */
	
	public short getPlanes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 504);
		} else {
			return __io__block.readShort(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'planes'.
	 * @see #__DNA__FIELD__planes
	 */
	
	public void setPlanes(short planes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 504, planes);
		} else {
			__io__block.writeShort(__io__address + 484, planes);
		}
	}

	/**
	 * Get method for struct member 'imtype'.
	 * @see #__DNA__FIELD__imtype
	 */
	
	public short getImtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 506);
		} else {
			return __io__block.readShort(__io__address + 486);
		}
	}

	/**
	 * Set method for struct member 'imtype'.
	 * @see #__DNA__FIELD__imtype
	 */
	
	public void setImtype(short imtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 506, imtype);
		} else {
			__io__block.writeShort(__io__address + 486, imtype);
		}
	}

	/**
	 * Get method for struct member 'subimtype'.
	 * @see #__DNA__FIELD__subimtype
	 */
	
	public short getSubimtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 508);
		} else {
			return __io__block.readShort(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'subimtype'.
	 * @see #__DNA__FIELD__subimtype
	 */
	
	public void setSubimtype(short subimtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 508, subimtype);
		} else {
			__io__block.writeShort(__io__address + 488, subimtype);
		}
	}

	/**
	 * Get method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public short getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 510);
		} else {
			return __io__block.readShort(__io__address + 490);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(short quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 510, quality);
		} else {
			__io__block.writeShort(__io__address + 490, quality);
		}
	}

	/**
	 * Get method for struct member 'displaymode'.
	 * @see #__DNA__FIELD__displaymode
	 */
	
	public short getDisplaymode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 512);
		} else {
			return __io__block.readShort(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'displaymode'.
	 * @see #__DNA__FIELD__displaymode
	 */
	
	public void setDisplaymode(short displaymode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 512, displaymode);
		} else {
			__io__block.writeShort(__io__address + 492, displaymode);
		}
	}

	/**
	 * Get method for struct member 'use_lock_interface'.
	 * @see #__DNA__FIELD__use_lock_interface
	 */
	
	public byte getUse_lock_interface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 514);
		} else {
			return __io__block.readByte(__io__address + 494);
		}
	}

	/**
	 * Set method for struct member 'use_lock_interface'.
	 * @see #__DNA__FIELD__use_lock_interface
	 */
	
	public void setUse_lock_interface(byte use_lock_interface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 514, use_lock_interface);
		} else {
			__io__block.writeByte(__io__address + 494, use_lock_interface);
		}
	}

	/**
	 * Get method for struct member 'pad7'.
	 * @see #__DNA__FIELD__pad7
	 */
	
	public byte getPad7() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 515);
		} else {
			return __io__block.readByte(__io__address + 495);
		}
	}

	/**
	 * Set method for struct member 'pad7'.
	 * @see #__DNA__FIELD__pad7
	 */
	
	public void setPad7(byte pad7) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 515, pad7);
		} else {
			__io__block.writeByte(__io__address + 495, pad7);
		}
	}

	/**
	 * Get method for struct member 'scemode'.
	 * @see #__DNA__FIELD__scemode
	 */
	
	public int getScemode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 516);
		} else {
			return __io__block.readInt(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'scemode'.
	 * @see #__DNA__FIELD__scemode
	 */
	
	public void setScemode(int scemode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 516, scemode);
		} else {
			__io__block.writeInt(__io__address + 496, scemode);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 520);
		} else {
			return __io__block.readInt(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 520, mode);
		} else {
			__io__block.writeInt(__io__address + 500, mode);
		}
	}

	/**
	 * Get method for struct member 'raytrace_options'.
	 * @see #__DNA__FIELD__raytrace_options
	 */
	
	public int getRaytrace_options() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 524);
		} else {
			return __io__block.readInt(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'raytrace_options'.
	 * @see #__DNA__FIELD__raytrace_options
	 */
	
	public void setRaytrace_options(int raytrace_options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 524, raytrace_options);
		} else {
			__io__block.writeInt(__io__address + 504, raytrace_options);
		}
	}

	/**
	 * Get method for struct member 'raytrace_structure'.
	 * @see #__DNA__FIELD__raytrace_structure
	 */
	
	public short getRaytrace_structure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 528);
		} else {
			return __io__block.readShort(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'raytrace_structure'.
	 * @see #__DNA__FIELD__raytrace_structure
	 */
	
	public void setRaytrace_structure(short raytrace_structure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 528, raytrace_structure);
		} else {
			__io__block.writeShort(__io__address + 508, raytrace_structure);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public short getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 530);
		} else {
			return __io__block.readShort(__io__address + 510);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(short pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 530, pad1);
		} else {
			__io__block.writeShort(__io__address + 510, pad1);
		}
	}

	/**
	 * Get method for struct member 'ocres'.
	 * @see #__DNA__FIELD__ocres
	 */
	
	public short getOcres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 532);
		} else {
			return __io__block.readShort(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'ocres'.
	 * @see #__DNA__FIELD__ocres
	 */
	
	public void setOcres(short ocres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 532, ocres);
		} else {
			__io__block.writeShort(__io__address + 512, ocres);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public short getPad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 534);
		} else {
			return __io__block.readShort(__io__address + 514);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(short pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 534, pad4);
		} else {
			__io__block.writeShort(__io__address + 514, pad4);
		}
	}

	/**
	 * Get method for struct member 'alphamode'.
	 * @see #__DNA__FIELD__alphamode
	 */
	
	public short getAlphamode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 536);
		} else {
			return __io__block.readShort(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'alphamode'.
	 * @see #__DNA__FIELD__alphamode
	 */
	
	public void setAlphamode(short alphamode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 536, alphamode);
		} else {
			__io__block.writeShort(__io__address + 516, alphamode);
		}
	}

	/**
	 * Get method for struct member 'osa'.
	 * @see #__DNA__FIELD__osa
	 */
	
	public short getOsa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 538);
		} else {
			return __io__block.readShort(__io__address + 518);
		}
	}

	/**
	 * Set method for struct member 'osa'.
	 * @see #__DNA__FIELD__osa
	 */
	
	public void setOsa(short osa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 538, osa);
		} else {
			__io__block.writeShort(__io__address + 518, osa);
		}
	}

	/**
	 * Get method for struct member 'frs_sec'.
	 * @see #__DNA__FIELD__frs_sec
	 */
	
	public short getFrs_sec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 540);
		} else {
			return __io__block.readShort(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'frs_sec'.
	 * @see #__DNA__FIELD__frs_sec
	 */
	
	public void setFrs_sec(short frs_sec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 540, frs_sec);
		} else {
			__io__block.writeShort(__io__address + 520, frs_sec);
		}
	}

	/**
	 * Get method for struct member 'edgeint'.
	 * @see #__DNA__FIELD__edgeint
	 */
	
	public short getEdgeint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 542);
		} else {
			return __io__block.readShort(__io__address + 522);
		}
	}

	/**
	 * Set method for struct member 'edgeint'.
	 * @see #__DNA__FIELD__edgeint
	 */
	
	public void setEdgeint(short edgeint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 542, edgeint);
		} else {
			__io__block.writeShort(__io__address + 522, edgeint);
		}
	}

	/**
	 * Get method for struct member 'safety'.
	 * @see #__DNA__FIELD__safety
	 */
	
	public rctf getSafety() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 544, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 524, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'safety'.
	 * @see #__DNA__FIELD__safety
	 */
	
	public void setSafety(rctf safety) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 544;
		} else {
			__dna__offset = 524;
		}
		if (__io__equals(safety, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, safety)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, safety);
		} else {
			__io__generic__copy( getSafety(), safety);
		}
	}

	/**
	 * Get method for struct member 'border'.
	 * @see #__DNA__FIELD__border
	 */
	
	public rctf getBorder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 560, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 540, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'border'.
	 * @see #__DNA__FIELD__border
	 */
	
	public void setBorder(rctf border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 560;
		} else {
			__dna__offset = 540;
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
	 * Get method for struct member 'disprect'.
	 * @see #__DNA__FIELD__disprect
	 */
	
	public rcti getDisprect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 576, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 556, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disprect'.
	 * @see #__DNA__FIELD__disprect
	 */
	
	public void setDisprect(rcti disprect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 576;
		} else {
			__dna__offset = 556;
		}
		if (__io__equals(disprect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disprect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disprect);
		} else {
			__io__generic__copy( getDisprect(), disprect);
		}
	}

	/**
	 * Get method for struct member 'layers'.
	 * @see #__DNA__FIELD__layers
	 */
	
	public ListBase getLayers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 592, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 572, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers'.
	 * @see #__DNA__FIELD__layers
	 */
	
	public void setLayers(ListBase layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 592;
		} else {
			__dna__offset = 572;
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
	 * @see #__DNA__FIELD__actlay
	 */
	
	public short getActlay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 608);
		} else {
			return __io__block.readShort(__io__address + 580);
		}
	}

	/**
	 * Set method for struct member 'actlay'.
	 * @see #__DNA__FIELD__actlay
	 */
	
	public void setActlay(short actlay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 608, actlay);
		} else {
			__io__block.writeShort(__io__address + 580, actlay);
		}
	}

	/**
	 * Get method for struct member 'mblur_samples'.
	 * @see #__DNA__FIELD__mblur_samples
	 */
	
	public short getMblur_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 610);
		} else {
			return __io__block.readShort(__io__address + 582);
		}
	}

	/**
	 * Set method for struct member 'mblur_samples'.
	 * @see #__DNA__FIELD__mblur_samples
	 */
	
	public void setMblur_samples(short mblur_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 610, mblur_samples);
		} else {
			__io__block.writeShort(__io__address + 582, mblur_samples);
		}
	}

	/**
	 * Get method for struct member 'xasp'.
	 * @see #__DNA__FIELD__xasp
	 */
	
	public float getXasp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 612);
		} else {
			return __io__block.readFloat(__io__address + 584);
		}
	}

	/**
	 * Set method for struct member 'xasp'.
	 * @see #__DNA__FIELD__xasp
	 */
	
	public void setXasp(float xasp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 612, xasp);
		} else {
			__io__block.writeFloat(__io__address + 584, xasp);
		}
	}

	/**
	 * Get method for struct member 'yasp'.
	 * @see #__DNA__FIELD__yasp
	 */
	
	public float getYasp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 616);
		} else {
			return __io__block.readFloat(__io__address + 588);
		}
	}

	/**
	 * Set method for struct member 'yasp'.
	 * @see #__DNA__FIELD__yasp
	 */
	
	public void setYasp(float yasp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 616, yasp);
		} else {
			__io__block.writeFloat(__io__address + 588, yasp);
		}
	}

	/**
	 * Get method for struct member 'frs_sec_base'.
	 * @see #__DNA__FIELD__frs_sec_base
	 */
	
	public float getFrs_sec_base() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 620);
		} else {
			return __io__block.readFloat(__io__address + 592);
		}
	}

	/**
	 * Set method for struct member 'frs_sec_base'.
	 * @see #__DNA__FIELD__frs_sec_base
	 */
	
	public void setFrs_sec_base(float frs_sec_base) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 620, frs_sec_base);
		} else {
			__io__block.writeFloat(__io__address + 592, frs_sec_base);
		}
	}

	/**
	 * Get method for struct member 'gauss'.
	 * @see #__DNA__FIELD__gauss
	 */
	
	public float getGauss() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 624);
		} else {
			return __io__block.readFloat(__io__address + 596);
		}
	}

	/**
	 * Set method for struct member 'gauss'.
	 * @see #__DNA__FIELD__gauss
	 */
	
	public void setGauss(float gauss) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 624, gauss);
		} else {
			__io__block.writeFloat(__io__address + 596, gauss);
		}
	}

	/**
	 * Get method for struct member 'color_mgt_flag'.
	 * @see #__DNA__FIELD__color_mgt_flag
	 */
	
	public int getColor_mgt_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 628);
		} else {
			return __io__block.readInt(__io__address + 600);
		}
	}

	/**
	 * Set method for struct member 'color_mgt_flag'.
	 * @see #__DNA__FIELD__color_mgt_flag
	 */
	
	public void setColor_mgt_flag(int color_mgt_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 628, color_mgt_flag);
		} else {
			__io__block.writeInt(__io__address + 600, color_mgt_flag);
		}
	}

	/**
	 * Get method for struct member 'postgamma'.
	 * @see #__DNA__FIELD__postgamma
	 */
	
	public float getPostgamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 632);
		} else {
			return __io__block.readFloat(__io__address + 604);
		}
	}

	/**
	 * Set method for struct member 'postgamma'.
	 * @see #__DNA__FIELD__postgamma
	 */
	
	public void setPostgamma(float postgamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 632, postgamma);
		} else {
			__io__block.writeFloat(__io__address + 604, postgamma);
		}
	}

	/**
	 * Get method for struct member 'posthue'.
	 * @see #__DNA__FIELD__posthue
	 */
	
	public float getPosthue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 636);
		} else {
			return __io__block.readFloat(__io__address + 608);
		}
	}

	/**
	 * Set method for struct member 'posthue'.
	 * @see #__DNA__FIELD__posthue
	 */
	
	public void setPosthue(float posthue) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 636, posthue);
		} else {
			__io__block.writeFloat(__io__address + 608, posthue);
		}
	}

	/**
	 * Get method for struct member 'postsat'.
	 * @see #__DNA__FIELD__postsat
	 */
	
	public float getPostsat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 640);
		} else {
			return __io__block.readFloat(__io__address + 612);
		}
	}

	/**
	 * Set method for struct member 'postsat'.
	 * @see #__DNA__FIELD__postsat
	 */
	
	public void setPostsat(float postsat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 640, postsat);
		} else {
			__io__block.writeFloat(__io__address + 612, postsat);
		}
	}

	/**
	 * Get method for struct member 'dither_intensity'.
	 * @see #__DNA__FIELD__dither_intensity
	 */
	
	public float getDither_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 644);
		} else {
			return __io__block.readFloat(__io__address + 616);
		}
	}

	/**
	 * Set method for struct member 'dither_intensity'.
	 * @see #__DNA__FIELD__dither_intensity
	 */
	
	public void setDither_intensity(float dither_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 644, dither_intensity);
		} else {
			__io__block.writeFloat(__io__address + 616, dither_intensity);
		}
	}

	/**
	 * Get method for struct member 'bake_osa'.
	 * @see #__DNA__FIELD__bake_osa
	 */
	
	public short getBake_osa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 648);
		} else {
			return __io__block.readShort(__io__address + 620);
		}
	}

	/**
	 * Set method for struct member 'bake_osa'.
	 * @see #__DNA__FIELD__bake_osa
	 */
	
	public void setBake_osa(short bake_osa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 648, bake_osa);
		} else {
			__io__block.writeShort(__io__address + 620, bake_osa);
		}
	}

	/**
	 * Get method for struct member 'bake_filter'.
	 * @see #__DNA__FIELD__bake_filter
	 */
	
	public short getBake_filter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 650);
		} else {
			return __io__block.readShort(__io__address + 622);
		}
	}

	/**
	 * Set method for struct member 'bake_filter'.
	 * @see #__DNA__FIELD__bake_filter
	 */
	
	public void setBake_filter(short bake_filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 650, bake_filter);
		} else {
			__io__block.writeShort(__io__address + 622, bake_filter);
		}
	}

	/**
	 * Get method for struct member 'bake_mode'.
	 * @see #__DNA__FIELD__bake_mode
	 */
	
	public short getBake_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 652);
		} else {
			return __io__block.readShort(__io__address + 624);
		}
	}

	/**
	 * Set method for struct member 'bake_mode'.
	 * @see #__DNA__FIELD__bake_mode
	 */
	
	public void setBake_mode(short bake_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 652, bake_mode);
		} else {
			__io__block.writeShort(__io__address + 624, bake_mode);
		}
	}

	/**
	 * Get method for struct member 'bake_flag'.
	 * @see #__DNA__FIELD__bake_flag
	 */
	
	public short getBake_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 654);
		} else {
			return __io__block.readShort(__io__address + 626);
		}
	}

	/**
	 * Set method for struct member 'bake_flag'.
	 * @see #__DNA__FIELD__bake_flag
	 */
	
	public void setBake_flag(short bake_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 654, bake_flag);
		} else {
			__io__block.writeShort(__io__address + 626, bake_flag);
		}
	}

	/**
	 * Get method for struct member 'bake_normal_space'.
	 * @see #__DNA__FIELD__bake_normal_space
	 */
	
	public short getBake_normal_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 656);
		} else {
			return __io__block.readShort(__io__address + 628);
		}
	}

	/**
	 * Set method for struct member 'bake_normal_space'.
	 * @see #__DNA__FIELD__bake_normal_space
	 */
	
	public void setBake_normal_space(short bake_normal_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 656, bake_normal_space);
		} else {
			__io__block.writeShort(__io__address + 628, bake_normal_space);
		}
	}

	/**
	 * Get method for struct member 'bake_quad_split'.
	 * @see #__DNA__FIELD__bake_quad_split
	 */
	
	public short getBake_quad_split() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 658);
		} else {
			return __io__block.readShort(__io__address + 630);
		}
	}

	/**
	 * Set method for struct member 'bake_quad_split'.
	 * @see #__DNA__FIELD__bake_quad_split
	 */
	
	public void setBake_quad_split(short bake_quad_split) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 658, bake_quad_split);
		} else {
			__io__block.writeShort(__io__address + 630, bake_quad_split);
		}
	}

	/**
	 * Get method for struct member 'bake_maxdist'.
	 * @see #__DNA__FIELD__bake_maxdist
	 */
	
	public float getBake_maxdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 660);
		} else {
			return __io__block.readFloat(__io__address + 632);
		}
	}

	/**
	 * Set method for struct member 'bake_maxdist'.
	 * @see #__DNA__FIELD__bake_maxdist
	 */
	
	public void setBake_maxdist(float bake_maxdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 660, bake_maxdist);
		} else {
			__io__block.writeFloat(__io__address + 632, bake_maxdist);
		}
	}

	/**
	 * Get method for struct member 'bake_biasdist'.
	 * @see #__DNA__FIELD__bake_biasdist
	 */
	
	public float getBake_biasdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 664);
		} else {
			return __io__block.readFloat(__io__address + 636);
		}
	}

	/**
	 * Set method for struct member 'bake_biasdist'.
	 * @see #__DNA__FIELD__bake_biasdist
	 */
	
	public void setBake_biasdist(float bake_biasdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 664, bake_biasdist);
		} else {
			__io__block.writeFloat(__io__address + 636, bake_biasdist);
		}
	}

	/**
	 * Get method for struct member 'bake_samples'.
	 * @see #__DNA__FIELD__bake_samples
	 */
	
	public short getBake_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 668);
		} else {
			return __io__block.readShort(__io__address + 640);
		}
	}

	/**
	 * Set method for struct member 'bake_samples'.
	 * @see #__DNA__FIELD__bake_samples
	 */
	
	public void setBake_samples(short bake_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 668, bake_samples);
		} else {
			__io__block.writeShort(__io__address + 640, bake_samples);
		}
	}

	/**
	 * Get method for struct member 'bake_pad'.
	 * @see #__DNA__FIELD__bake_pad
	 */
	
	public short getBake_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 670);
		} else {
			return __io__block.readShort(__io__address + 642);
		}
	}

	/**
	 * Set method for struct member 'bake_pad'.
	 * @see #__DNA__FIELD__bake_pad
	 */
	
	public void setBake_pad(short bake_pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 670, bake_pad);
		} else {
			__io__block.writeShort(__io__address + 642, bake_pad);
		}
	}

	/**
	 * Get method for struct member 'bake_user_scale'.
	 * @see #__DNA__FIELD__bake_user_scale
	 */
	
	public float getBake_user_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 672);
		} else {
			return __io__block.readFloat(__io__address + 644);
		}
	}

	/**
	 * Set method for struct member 'bake_user_scale'.
	 * @see #__DNA__FIELD__bake_user_scale
	 */
	
	public void setBake_user_scale(float bake_user_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 672, bake_user_scale);
		} else {
			__io__block.writeFloat(__io__address + 644, bake_user_scale);
		}
	}

	/**
	 * Get method for struct member 'bake_pad1'.
	 * @see #__DNA__FIELD__bake_pad1
	 */
	
	public float getBake_pad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 676);
		} else {
			return __io__block.readFloat(__io__address + 648);
		}
	}

	/**
	 * Set method for struct member 'bake_pad1'.
	 * @see #__DNA__FIELD__bake_pad1
	 */
	
	public void setBake_pad1(float bake_pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 676, bake_pad1);
		} else {
			__io__block.writeFloat(__io__address + 648, bake_pad1);
		}
	}

	/**
	 * Get method for struct member 'pic'.
	 * @see #__DNA__FIELD__pic
	 */
	
	public CArrayFacade<Byte> getPic() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 680, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 652, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pic'.
	 * @see #__DNA__FIELD__pic
	 */
	
	public void setPic(CArrayFacade<Byte> pic) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 680;
		} else {
			__dna__offset = 652;
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
	 * @see #__DNA__FIELD__stamp
	 */
	
	public int getStamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1704);
		} else {
			return __io__block.readInt(__io__address + 1676);
		}
	}

	/**
	 * Set method for struct member 'stamp'.
	 * @see #__DNA__FIELD__stamp
	 */
	
	public void setStamp(int stamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1704, stamp);
		} else {
			__io__block.writeInt(__io__address + 1676, stamp);
		}
	}

	/**
	 * Get method for struct member 'stamp_font_id'.
	 * @see #__DNA__FIELD__stamp_font_id
	 */
	
	public short getStamp_font_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1708);
		} else {
			return __io__block.readShort(__io__address + 1680);
		}
	}

	/**
	 * Set method for struct member 'stamp_font_id'.
	 * @see #__DNA__FIELD__stamp_font_id
	 */
	
	public void setStamp_font_id(short stamp_font_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1708, stamp_font_id);
		} else {
			__io__block.writeShort(__io__address + 1680, stamp_font_id);
		}
	}

	/**
	 * Get method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public short getPad3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1710);
		} else {
			return __io__block.readShort(__io__address + 1682);
		}
	}

	/**
	 * Set method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public void setPad3(short pad3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1710, pad3);
		} else {
			__io__block.writeShort(__io__address + 1682, pad3);
		}
	}

	/**
	 * Get method for struct member 'stamp_udata'.
	 * @see #__DNA__FIELD__stamp_udata
	 */
	
	public CArrayFacade<Byte> getStamp_udata() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1684, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stamp_udata'.
	 * @see #__DNA__FIELD__stamp_udata
	 */
	
	public void setStamp_udata(CArrayFacade<Byte> stamp_udata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1712;
		} else {
			__dna__offset = 1684;
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
	 * @see #__DNA__FIELD__fg_stamp
	 */
	
	public CArrayFacade<Float> getFg_stamp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2452, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fg_stamp'.
	 * @see #__DNA__FIELD__fg_stamp
	 */
	
	public void setFg_stamp(CArrayFacade<Float> fg_stamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2480;
		} else {
			__dna__offset = 2452;
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
			return new CArrayFacade<Float>(__io__address + 2496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2496;
		} else {
			__dna__offset = 2468;
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
	 * @see #__DNA__FIELD__seq_prev_type
	 */
	
	public byte getSeq_prev_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2512);
		} else {
			return __io__block.readByte(__io__address + 2484);
		}
	}

	/**
	 * Set method for struct member 'seq_prev_type'.
	 * @see #__DNA__FIELD__seq_prev_type
	 */
	
	public void setSeq_prev_type(byte seq_prev_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2512, seq_prev_type);
		} else {
			__io__block.writeByte(__io__address + 2484, seq_prev_type);
		}
	}

	/**
	 * Get method for struct member 'seq_rend_type'.
	 * @see #__DNA__FIELD__seq_rend_type
	 */
	
	public byte getSeq_rend_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2513);
		} else {
			return __io__block.readByte(__io__address + 2485);
		}
	}

	/**
	 * Set method for struct member 'seq_rend_type'.
	 * @see #__DNA__FIELD__seq_rend_type
	 */
	
	public void setSeq_rend_type(byte seq_rend_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2513, seq_rend_type);
		} else {
			__io__block.writeByte(__io__address + 2485, seq_rend_type);
		}
	}

	/**
	 * Get method for struct member 'seq_flag'.
	 * @see #__DNA__FIELD__seq_flag
	 */
	
	public byte getSeq_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2514);
		} else {
			return __io__block.readByte(__io__address + 2486);
		}
	}

	/**
	 * Set method for struct member 'seq_flag'.
	 * @see #__DNA__FIELD__seq_flag
	 */
	
	public void setSeq_flag(byte seq_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2514, seq_flag);
		} else {
			__io__block.writeByte(__io__address + 2486, seq_flag);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public CArrayFacade<Byte> getPad5() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2515, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2487, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(CArrayFacade<Byte> pad5) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2515;
		} else {
			__dna__offset = 2487;
		}
		if (__io__equals(pad5, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad5)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad5);
		} else {
			__io__generic__copy( getPad5(), pad5);
		}
	}

	/**
	 * Get method for struct member 'simplify_flag'.
	 * @see #__DNA__FIELD__simplify_flag
	 */
	
	public int getSimplify_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2520);
		} else {
			return __io__block.readInt(__io__address + 2492);
		}
	}

	/**
	 * Set method for struct member 'simplify_flag'.
	 * @see #__DNA__FIELD__simplify_flag
	 */
	
	public void setSimplify_flag(int simplify_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2520, simplify_flag);
		} else {
			__io__block.writeInt(__io__address + 2492, simplify_flag);
		}
	}

	/**
	 * Get method for struct member 'simplify_subsurf'.
	 * @see #__DNA__FIELD__simplify_subsurf
	 */
	
	public short getSimplify_subsurf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2524);
		} else {
			return __io__block.readShort(__io__address + 2496);
		}
	}

	/**
	 * Set method for struct member 'simplify_subsurf'.
	 * @see #__DNA__FIELD__simplify_subsurf
	 */
	
	public void setSimplify_subsurf(short simplify_subsurf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2524, simplify_subsurf);
		} else {
			__io__block.writeShort(__io__address + 2496, simplify_subsurf);
		}
	}

	/**
	 * Get method for struct member 'simplify_shadowsamples'.
	 * @see #__DNA__FIELD__simplify_shadowsamples
	 */
	
	public short getSimplify_shadowsamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2526);
		} else {
			return __io__block.readShort(__io__address + 2498);
		}
	}

	/**
	 * Set method for struct member 'simplify_shadowsamples'.
	 * @see #__DNA__FIELD__simplify_shadowsamples
	 */
	
	public void setSimplify_shadowsamples(short simplify_shadowsamples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2526, simplify_shadowsamples);
		} else {
			__io__block.writeShort(__io__address + 2498, simplify_shadowsamples);
		}
	}

	/**
	 * Get method for struct member 'simplify_particles'.
	 * @see #__DNA__FIELD__simplify_particles
	 */
	
	public float getSimplify_particles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2528);
		} else {
			return __io__block.readFloat(__io__address + 2500);
		}
	}

	/**
	 * Set method for struct member 'simplify_particles'.
	 * @see #__DNA__FIELD__simplify_particles
	 */
	
	public void setSimplify_particles(float simplify_particles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2528, simplify_particles);
		} else {
			__io__block.writeFloat(__io__address + 2500, simplify_particles);
		}
	}

	/**
	 * Get method for struct member 'simplify_aosss'.
	 * @see #__DNA__FIELD__simplify_aosss
	 */
	
	public float getSimplify_aosss() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2532);
		} else {
			return __io__block.readFloat(__io__address + 2504);
		}
	}

	/**
	 * Set method for struct member 'simplify_aosss'.
	 * @see #__DNA__FIELD__simplify_aosss
	 */
	
	public void setSimplify_aosss(float simplify_aosss) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2532, simplify_aosss);
		} else {
			__io__block.writeFloat(__io__address + 2504, simplify_aosss);
		}
	}

	/**
	 * Get method for struct member 'cineonwhite'.
	 * @see #__DNA__FIELD__cineonwhite
	 */
	
	public short getCineonwhite() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2536);
		} else {
			return __io__block.readShort(__io__address + 2508);
		}
	}

	/**
	 * Set method for struct member 'cineonwhite'.
	 * @see #__DNA__FIELD__cineonwhite
	 */
	
	public void setCineonwhite(short cineonwhite) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2536, cineonwhite);
		} else {
			__io__block.writeShort(__io__address + 2508, cineonwhite);
		}
	}

	/**
	 * Get method for struct member 'cineonblack'.
	 * @see #__DNA__FIELD__cineonblack
	 */
	
	public short getCineonblack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2538);
		} else {
			return __io__block.readShort(__io__address + 2510);
		}
	}

	/**
	 * Set method for struct member 'cineonblack'.
	 * @see #__DNA__FIELD__cineonblack
	 */
	
	public void setCineonblack(short cineonblack) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2538, cineonblack);
		} else {
			__io__block.writeShort(__io__address + 2510, cineonblack);
		}
	}

	/**
	 * Get method for struct member 'cineongamma'.
	 * @see #__DNA__FIELD__cineongamma
	 */
	
	public float getCineongamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2540);
		} else {
			return __io__block.readFloat(__io__address + 2512);
		}
	}

	/**
	 * Set method for struct member 'cineongamma'.
	 * @see #__DNA__FIELD__cineongamma
	 */
	
	public void setCineongamma(float cineongamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2540, cineongamma);
		} else {
			__io__block.writeFloat(__io__address + 2512, cineongamma);
		}
	}

	/**
	 * Get method for struct member 'jp2_preset'.
	 * @see #__DNA__FIELD__jp2_preset
	 */
	
	public short getJp2_preset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2544);
		} else {
			return __io__block.readShort(__io__address + 2516);
		}
	}

	/**
	 * Set method for struct member 'jp2_preset'.
	 * @see #__DNA__FIELD__jp2_preset
	 */
	
	public void setJp2_preset(short jp2_preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2544, jp2_preset);
		} else {
			__io__block.writeShort(__io__address + 2516, jp2_preset);
		}
	}

	/**
	 * Get method for struct member 'jp2_depth'.
	 * @see #__DNA__FIELD__jp2_depth
	 */
	
	public short getJp2_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2546);
		} else {
			return __io__block.readShort(__io__address + 2518);
		}
	}

	/**
	 * Set method for struct member 'jp2_depth'.
	 * @see #__DNA__FIELD__jp2_depth
	 */
	
	public void setJp2_depth(short jp2_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2546, jp2_depth);
		} else {
			__io__block.writeShort(__io__address + 2518, jp2_depth);
		}
	}

	/**
	 * Get method for struct member 'rpad3'.
	 * @see #__DNA__FIELD__rpad3
	 */
	
	public int getRpad3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2548);
		} else {
			return __io__block.readInt(__io__address + 2520);
		}
	}

	/**
	 * Set method for struct member 'rpad3'.
	 * @see #__DNA__FIELD__rpad3
	 */
	
	public void setRpad3(int rpad3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2548, rpad3);
		} else {
			__io__block.writeInt(__io__address + 2520, rpad3);
		}
	}

	/**
	 * Get method for struct member 'domeres'.
	 * @see #__DNA__FIELD__domeres
	 */
	
	public short getDomeres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2552);
		} else {
			return __io__block.readShort(__io__address + 2524);
		}
	}

	/**
	 * Set method for struct member 'domeres'.
	 * @see #__DNA__FIELD__domeres
	 */
	
	public void setDomeres(short domeres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2552, domeres);
		} else {
			__io__block.writeShort(__io__address + 2524, domeres);
		}
	}

	/**
	 * Get method for struct member 'domemode'.
	 * @see #__DNA__FIELD__domemode
	 */
	
	public short getDomemode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2554);
		} else {
			return __io__block.readShort(__io__address + 2526);
		}
	}

	/**
	 * Set method for struct member 'domemode'.
	 * @see #__DNA__FIELD__domemode
	 */
	
	public void setDomemode(short domemode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2554, domemode);
		} else {
			__io__block.writeShort(__io__address + 2526, domemode);
		}
	}

	/**
	 * Get method for struct member 'domeangle'.
	 * @see #__DNA__FIELD__domeangle
	 */
	
	public short getDomeangle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2556);
		} else {
			return __io__block.readShort(__io__address + 2528);
		}
	}

	/**
	 * Set method for struct member 'domeangle'.
	 * @see #__DNA__FIELD__domeangle
	 */
	
	public void setDomeangle(short domeangle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2556, domeangle);
		} else {
			__io__block.writeShort(__io__address + 2528, domeangle);
		}
	}

	/**
	 * Get method for struct member 'dometilt'.
	 * @see #__DNA__FIELD__dometilt
	 */
	
	public short getDometilt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2558);
		} else {
			return __io__block.readShort(__io__address + 2530);
		}
	}

	/**
	 * Set method for struct member 'dometilt'.
	 * @see #__DNA__FIELD__dometilt
	 */
	
	public void setDometilt(short dometilt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2558, dometilt);
		} else {
			__io__block.writeShort(__io__address + 2530, dometilt);
		}
	}

	/**
	 * Get method for struct member 'domeresbuf'.
	 * @see #__DNA__FIELD__domeresbuf
	 */
	
	public float getDomeresbuf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2560);
		} else {
			return __io__block.readFloat(__io__address + 2532);
		}
	}

	/**
	 * Set method for struct member 'domeresbuf'.
	 * @see #__DNA__FIELD__domeresbuf
	 */
	
	public void setDomeresbuf(float domeresbuf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2560, domeresbuf);
		} else {
			__io__block.writeFloat(__io__address + 2532, domeresbuf);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public float getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2564);
		} else {
			return __io__block.readFloat(__io__address + 2536);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(float pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2564, pad2);
		} else {
			__io__block.writeFloat(__io__address + 2536, pad2);
		}
	}

	/**
	 * Get method for struct member 'dometext'.
	 * @see #__DNA__FIELD__dometext
	 */
	
	public CPointer<Text> getDometext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2568);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2540);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Text.class};
		return new CPointer<Text>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Text.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dometext'.
	 * @see #__DNA__FIELD__dometext
	 */
	
	public void setDometext(CPointer<Text> dometext) throws IOException
	{
		long __address = ((dometext == null) ? 0 : dometext.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2568, __address);
		} else {
			__io__block.writeLong(__io__address + 2540, __address);
		}
	}

	/**
	 * Get method for struct member 'line_thickness_mode'.
	 * @see #__DNA__FIELD__line_thickness_mode
	 */
	
	public int getLine_thickness_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2576);
		} else {
			return __io__block.readInt(__io__address + 2544);
		}
	}

	/**
	 * Set method for struct member 'line_thickness_mode'.
	 * @see #__DNA__FIELD__line_thickness_mode
	 */
	
	public void setLine_thickness_mode(int line_thickness_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2576, line_thickness_mode);
		} else {
			__io__block.writeInt(__io__address + 2544, line_thickness_mode);
		}
	}

	/**
	 * Get method for struct member 'unit_line_thickness'.
	 * @see #__DNA__FIELD__unit_line_thickness
	 */
	
	public float getUnit_line_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2580);
		} else {
			return __io__block.readFloat(__io__address + 2548);
		}
	}

	/**
	 * Set method for struct member 'unit_line_thickness'.
	 * @see #__DNA__FIELD__unit_line_thickness
	 */
	
	public void setUnit_line_thickness(float unit_line_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2580, unit_line_thickness);
		} else {
			__io__block.writeFloat(__io__address + 2548, unit_line_thickness);
		}
	}

	/**
	 * Get method for struct member 'engine'.
	 * @see #__DNA__FIELD__engine
	 */
	
	public CArrayFacade<Byte> getEngine() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2552, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'engine'.
	 * @see #__DNA__FIELD__engine
	 */
	
	public void setEngine(CArrayFacade<Byte> engine) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2584;
		} else {
			__dna__offset = 2552;
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
	 * Get method for struct member 'bake'.
	 * @see #__DNA__FIELD__bake
	 */
	
	public BakeData getBake() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BakeData(__io__address + 2616, __io__block, __io__blockTable);
		} else {
			return new BakeData(__io__address + 2584, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bake'.
	 * @see #__DNA__FIELD__bake
	 */
	
	public void setBake(BakeData bake) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2616;
		} else {
			__dna__offset = 2584;
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
	 * Get method for struct member 'preview_start_resolution'.
	 * @see #__DNA__FIELD__preview_start_resolution
	 */
	
	public int getPreview_start_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3976);
		} else {
			return __io__block.readInt(__io__address + 3936);
		}
	}

	/**
	 * Set method for struct member 'preview_start_resolution'.
	 * @see #__DNA__FIELD__preview_start_resolution
	 */
	
	public void setPreview_start_resolution(int preview_start_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3976, preview_start_resolution);
		} else {
			__io__block.writeInt(__io__address + 3936, preview_start_resolution);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3980);
		} else {
			return __io__block.readInt(__io__address + 3940);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3980, pad);
		} else {
			__io__block.writeInt(__io__address + 3940, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RenderData> __io__addressof() {
		return new CPointer<RenderData>(__io__address, new Class[]{RenderData.class}, __io__block, __io__blockTable);
	}

}
