package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Camera'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=496, size64=552)
public class Camera extends CFacade {

	/**
	 * This is the sdna index of the struct Camera.
	 * <p>
	 * It is required when allocating a new block to store data for Camera.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 33;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__id);
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
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw type extra. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__dtx);
	 * CPointer&lt;Byte&gt; p_dtx = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dtx'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dtx = new long[]{125, 161};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{126, 162};

	/**
	 * Field descriptor (offset) for struct member 'passepartalpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__passepartalpha);
	 * CPointer&lt;Float&gt; p_passepartalpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'passepartalpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__passepartalpha = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'clipsta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__clipsta);
	 * CPointer&lt;Float&gt; p_clipsta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipsta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipsta = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'clipend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__clipend);
	 * CPointer&lt;Float&gt; p_clipend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipend = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'lens'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Perspective Camera lens value in millimeters
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__lens);
	 * CPointer&lt;Float&gt; p_lens = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lens'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lens = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'ortho_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Orthographic Camera scale (similar to zoom)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__ortho_scale);
	 * CPointer&lt;Float&gt; p_ortho_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ortho_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ortho_scale = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'drawsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__drawsize);
	 * CPointer&lt;Float&gt; p_drawsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawsize = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'sensor_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__sensor_x);
	 * CPointer&lt;Float&gt; p_sensor_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensor_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensor_x = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'sensor_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__sensor_y);
	 * CPointer&lt;Float&gt; p_sensor_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensor_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensor_y = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'shiftx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__shiftx);
	 * CPointer&lt;Float&gt; p_shiftx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shiftx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shiftx = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'shifty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__shifty);
	 * CPointer&lt;Float&gt; p_shifty = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shifty'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shifty = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'YF_dofdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__YF_dofdist);
	 * CPointer&lt;Float&gt; p_YF_dofdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'YF_dofdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__YF_dofdist = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'dof_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__dof_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_dof_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dof_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dof_ob = new long[]{176, 216};

	/**
	 * Field descriptor (offset) for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__gpu_dof);
	 * CPointer&lt;GPUDOFSettings&gt; p_gpu_dof = p.cast(new Class[]{GPUDOFSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpu_dof'</li>
	 * <li>Signature: 'GPUDOFSettings'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpu_dof = new long[]{180, 224};

	/**
	 * Field descriptor (offset) for struct member 'dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__dof);
	 * CPointer&lt;CameraDOFSettings&gt; p_dof = p.cast(new Class[]{CameraDOFSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dof'</li>
	 * <li>Signature: 'CameraDOFSettings'</li>
	 * <li>Actual Size (32bit/64bit): 28/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dof = new long[]{212, 256};

	/**
	 * Field descriptor (offset) for struct member 'bg_images'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CameraBGImage}  reference images </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__bg_images);
	 * CPointer&lt;ListBase&gt; p_bg_images = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bg_images'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bg_images = new long[]{240, 288};

	/**
	 * Field descriptor (offset) for struct member 'sensor_fit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to fit image and field of view angle inside the sensor
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__sensor_fit);
	 * CPointer&lt;Byte&gt; p_sensor_fit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensor_fit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensor_fit = new long[]{248, 304};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{249, 305};

	/**
	 * Field descriptor (offset) for struct member 'stereo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stereo settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__stereo);
	 * CPointer&lt;CameraStereoSettings&gt; p_stereo = p.cast(new Class[]{CameraStereoSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo'</li>
	 * <li>Signature: 'CameraStereoSettings'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo = new long[]{256, 312};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__runtime);
	 * CPointer&lt;Camera_Runtime&gt; p_runtime = p.cast(new Class[]{Camera_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Camera_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 216/216</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{280, 336};

	public Camera(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Camera(Camera that) {
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
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 160);
		} else {
			return __io__block.readByte(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 160, type);
		} else {
			__io__block.writeByte(__io__address + 124, type);
		}
	}

	/**
	 * Get method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw type extra. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public byte getDtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 161);
		} else {
			return __io__block.readByte(__io__address + 125);
		}
	}

	/**
	 * Set method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw type extra. </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public void setDtx(byte dtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 161, dtx);
		} else {
			__io__block.writeByte(__io__address + 125, dtx);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 162);
		} else {
			return __io__block.readShort(__io__address + 126);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 162, flag);
		} else {
			__io__block.writeShort(__io__address + 126, flag);
		}
	}

	/**
	 * Get method for struct member 'passepartalpha'.
	 * @see #__DNA__FIELD__passepartalpha
	 */
	
	public float getPassepartalpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'passepartalpha'.
	 * @see #__DNA__FIELD__passepartalpha
	 */
	
	public void setPassepartalpha(float passepartalpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, passepartalpha);
		} else {
			__io__block.writeFloat(__io__address + 128, passepartalpha);
		}
	}

	/**
	 * Get method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public float getClipsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public void setClipsta(float clipsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, clipsta);
		} else {
			__io__block.writeFloat(__io__address + 132, clipsta);
		}
	}

	/**
	 * Get method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public float getClipend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public void setClipend(float clipend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, clipend);
		} else {
			__io__block.writeFloat(__io__address + 136, clipend);
		}
	}

	/**
	 * Get method for struct member 'lens'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Perspective Camera lens value in millimeters
	 * @see #__DNA__FIELD__lens
	 */
	
	public float getLens() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'lens'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Perspective Camera lens value in millimeters
	 * @see #__DNA__FIELD__lens
	 */
	
	public void setLens(float lens) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, lens);
		} else {
			__io__block.writeFloat(__io__address + 140, lens);
		}
	}

	/**
	 * Get method for struct member 'ortho_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Orthographic Camera scale (similar to zoom)
	 * @see #__DNA__FIELD__ortho_scale
	 */
	
	public float getOrtho_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'ortho_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Orthographic Camera scale (similar to zoom)
	 * @see #__DNA__FIELD__ortho_scale
	 */
	
	public void setOrtho_scale(float ortho_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, ortho_scale);
		} else {
			__io__block.writeFloat(__io__address + 144, ortho_scale);
		}
	}

	/**
	 * Get method for struct member 'drawsize'.
	 * @see #__DNA__FIELD__drawsize
	 */
	
	public float getDrawsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'drawsize'.
	 * @see #__DNA__FIELD__drawsize
	 */
	
	public void setDrawsize(float drawsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, drawsize);
		} else {
			__io__block.writeFloat(__io__address + 148, drawsize);
		}
	}

	/**
	 * Get method for struct member 'sensor_x'.
	 * @see #__DNA__FIELD__sensor_x
	 */
	
	public float getSensor_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'sensor_x'.
	 * @see #__DNA__FIELD__sensor_x
	 */
	
	public void setSensor_x(float sensor_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, sensor_x);
		} else {
			__io__block.writeFloat(__io__address + 152, sensor_x);
		}
	}

	/**
	 * Get method for struct member 'sensor_y'.
	 * @see #__DNA__FIELD__sensor_y
	 */
	
	public float getSensor_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'sensor_y'.
	 * @see #__DNA__FIELD__sensor_y
	 */
	
	public void setSensor_y(float sensor_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, sensor_y);
		} else {
			__io__block.writeFloat(__io__address + 156, sensor_y);
		}
	}

	/**
	 * Get method for struct member 'shiftx'.
	 * @see #__DNA__FIELD__shiftx
	 */
	
	public float getShiftx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'shiftx'.
	 * @see #__DNA__FIELD__shiftx
	 */
	
	public void setShiftx(float shiftx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, shiftx);
		} else {
			__io__block.writeFloat(__io__address + 160, shiftx);
		}
	}

	/**
	 * Get method for struct member 'shifty'.
	 * @see #__DNA__FIELD__shifty
	 */
	
	public float getShifty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'shifty'.
	 * @see #__DNA__FIELD__shifty
	 */
	
	public void setShifty(float shifty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, shifty);
		} else {
			__io__block.writeFloat(__io__address + 164, shifty);
		}
	}

	/**
	 * Get method for struct member 'YF_dofdist'.
	 * @see #__DNA__FIELD__YF_dofdist
	 */
	
	public float getYF_dofdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'YF_dofdist'.
	 * @see #__DNA__FIELD__YF_dofdist
	 */
	
	public void setYF_dofdist(float YF_dofdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, YF_dofdist);
		} else {
			__io__block.writeFloat(__io__address + 168, YF_dofdist);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'dof_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dof_ob
	 */
	
	public CPointer<BlenderObject> getDof_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dof_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__dof_ob
	 */
	
	public void setDof_ob(CPointer<BlenderObject> dof_ob) throws IOException
	{
		long __address = ((dof_ob == null) ? 0 : dof_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpu_dof
	 */
	
	public GPUDOFSettings getGpu_dof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GPUDOFSettings(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new GPUDOFSettings(__io__address + 180, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpu_dof
	 */
	
	public void setGpu_dof(GPUDOFSettings gpu_dof) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(gpu_dof, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gpu_dof)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gpu_dof);
		} else {
			__io__generic__copy( getGpu_dof(), gpu_dof);
		}
	}

	/**
	 * Get method for struct member 'dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__dof
	 */
	
	public CameraDOFSettings getDof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CameraDOFSettings(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new CameraDOFSettings(__io__address + 212, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__dof
	 */
	
	public void setDof(CameraDOFSettings dof) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 212;
		}
		if (__io__equals(dof, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dof)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dof);
		} else {
			__io__generic__copy( getDof(), dof);
		}
	}

	/**
	 * Get method for struct member 'bg_images'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CameraBGImage}  reference images </p>
	 * @see #__DNA__FIELD__bg_images
	 */
	
	public ListBase getBg_images() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 288, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 240, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bg_images'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link CameraBGImage}  reference images </p>
	 * @see #__DNA__FIELD__bg_images
	 */
	
	public void setBg_images(ListBase bg_images) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 288;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(bg_images, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bg_images)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bg_images);
		} else {
			__io__generic__copy( getBg_images(), bg_images);
		}
	}

	/**
	 * Get method for struct member 'sensor_fit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to fit image and field of view angle inside the sensor
	 * @see #__DNA__FIELD__sensor_fit
	 */
	
	public byte getSensor_fit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 304);
		} else {
			return __io__block.readByte(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'sensor_fit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to fit image and field of view angle inside the sensor
	 * @see #__DNA__FIELD__sensor_fit
	 */
	
	public void setSensor_fit(byte sensor_fit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 304, sensor_fit);
		} else {
			__io__block.writeByte(__io__address + 248, sensor_fit);
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
			return new CArrayFacade<Byte>(__io__address + 305, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 249, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 305;
		} else {
			__dna__offset = 249;
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
	 * Get method for struct member 'stereo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stereo settings </p>
	 * @see #__DNA__FIELD__stereo
	 */
	
	public CameraStereoSettings getStereo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CameraStereoSettings(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new CameraStereoSettings(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stereo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stereo settings </p>
	 * @see #__DNA__FIELD__stereo
	 */
	
	public void setStereo(CameraStereoSettings stereo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(stereo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stereo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stereo);
		} else {
			__io__generic__copy( getStereo(), stereo);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Camera_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Camera_Runtime(__io__address + 336, __io__block, __io__blockTable);
		} else {
			return new Camera_Runtime(__io__address + 280, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Camera_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 280;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Camera> __io__addressof() {
		return new CPointer<Camera>(__io__address, new Class[]{Camera.class}, __io__block, __io__blockTable);
	}

}
