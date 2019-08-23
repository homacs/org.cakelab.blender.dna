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

@CMetaData(size32=216, size64=248)
public class Camera extends CFacade {

	/**
	 * This is the sdna index of the struct Camera.
	 * <p>
	 * It is required when allocating a new block to store data for Camera.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 25;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO </p>
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
	public static final long[] __DNA__FIELD__type = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw type extra </p>
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
	public static final long[] __DNA__FIELD__dtx = new long[]{105, 129};

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
	public static final long[] __DNA__FIELD__flag = new long[]{106, 130};

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
	public static final long[] __DNA__FIELD__passepartalpha = new long[]{108, 132};

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
	public static final long[] __DNA__FIELD__clipsta = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__clipend = new long[]{116, 140};

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
	public static final long[] __DNA__FIELD__lens = new long[]{120, 144};

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
	public static final long[] __DNA__FIELD__ortho_scale = new long[]{124, 148};

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
	public static final long[] __DNA__FIELD__drawsize = new long[]{128, 152};

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
	public static final long[] __DNA__FIELD__sensor_x = new long[]{132, 156};

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
	public static final long[] __DNA__FIELD__sensor_y = new long[]{136, 160};

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
	public static final long[] __DNA__FIELD__shiftx = new long[]{140, 164};

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
	public static final long[] __DNA__FIELD__shifty = new long[]{144, 168};

	/**
	 * Field descriptor (offset) for struct member 'YF_dofdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> yafray: dof params qdn: yafray var 'YF_dofdist' now enabled for defocus composite node as well. The name was not changed so that no other files need to be modified </p>
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
	public static final long[] __DNA__FIELD__YF_dofdist = new long[]{148, 172};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
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
	public static final long[] __DNA__FIELD__ipo = new long[]{152, 176};

	/**
	 * Field descriptor (offset) for struct member 'dof_ob'.
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
	public static final long[] __DNA__FIELD__dof_ob = new long[]{156, 184};

	/**
	 * Field descriptor (offset) for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
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
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpu_dof = new long[]{160, 192};

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
	public static final long[] __DNA__FIELD__sensor_fit = new long[]{184, 216};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera camera = ...;
	 * CPointer&lt;Object&gt; p = camera.__dna__addressof(Camera.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{185, 217};

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
	public static final long[] __DNA__FIELD__stereo = new long[]{192, 224};

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
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 128);
		} else {
			return __io__block.readByte(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Camera types<h4>Blender Source Code:</h4>
	 * <p> CAM_PERSP, CAM_ORTHO or CAM_PANO </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 128, type);
		} else {
			__io__block.writeByte(__io__address + 104, type);
		}
	}

	/**
	 * Get method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw type extra </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public byte getDtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 129);
		} else {
			return __io__block.readByte(__io__address + 105);
		}
	}

	/**
	 * Set method for struct member 'dtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw type extra </p>
	 * @see #__DNA__FIELD__dtx
	 */
	
	public void setDtx(byte dtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 129, dtx);
		} else {
			__io__block.writeByte(__io__address + 105, dtx);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, flag);
		} else {
			__io__block.writeShort(__io__address + 106, flag);
		}
	}

	/**
	 * Get method for struct member 'passepartalpha'.
	 * @see #__DNA__FIELD__passepartalpha
	 */
	
	public float getPassepartalpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'passepartalpha'.
	 * @see #__DNA__FIELD__passepartalpha
	 */
	
	public void setPassepartalpha(float passepartalpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, passepartalpha);
		} else {
			__io__block.writeFloat(__io__address + 108, passepartalpha);
		}
	}

	/**
	 * Get method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public float getClipsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public void setClipsta(float clipsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, clipsta);
		} else {
			__io__block.writeFloat(__io__address + 112, clipsta);
		}
	}

	/**
	 * Get method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public float getClipend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public void setClipend(float clipend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, clipend);
		} else {
			__io__block.writeFloat(__io__address + 116, clipend);
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
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 120);
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
			__io__block.writeFloat(__io__address + 144, lens);
		} else {
			__io__block.writeFloat(__io__address + 120, lens);
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
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 124);
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
			__io__block.writeFloat(__io__address + 148, ortho_scale);
		} else {
			__io__block.writeFloat(__io__address + 124, ortho_scale);
		}
	}

	/**
	 * Get method for struct member 'drawsize'.
	 * @see #__DNA__FIELD__drawsize
	 */
	
	public float getDrawsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'drawsize'.
	 * @see #__DNA__FIELD__drawsize
	 */
	
	public void setDrawsize(float drawsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, drawsize);
		} else {
			__io__block.writeFloat(__io__address + 128, drawsize);
		}
	}

	/**
	 * Get method for struct member 'sensor_x'.
	 * @see #__DNA__FIELD__sensor_x
	 */
	
	public float getSensor_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'sensor_x'.
	 * @see #__DNA__FIELD__sensor_x
	 */
	
	public void setSensor_x(float sensor_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, sensor_x);
		} else {
			__io__block.writeFloat(__io__address + 132, sensor_x);
		}
	}

	/**
	 * Get method for struct member 'sensor_y'.
	 * @see #__DNA__FIELD__sensor_y
	 */
	
	public float getSensor_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'sensor_y'.
	 * @see #__DNA__FIELD__sensor_y
	 */
	
	public void setSensor_y(float sensor_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, sensor_y);
		} else {
			__io__block.writeFloat(__io__address + 136, sensor_y);
		}
	}

	/**
	 * Get method for struct member 'shiftx'.
	 * @see #__DNA__FIELD__shiftx
	 */
	
	public float getShiftx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'shiftx'.
	 * @see #__DNA__FIELD__shiftx
	 */
	
	public void setShiftx(float shiftx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, shiftx);
		} else {
			__io__block.writeFloat(__io__address + 140, shiftx);
		}
	}

	/**
	 * Get method for struct member 'shifty'.
	 * @see #__DNA__FIELD__shifty
	 */
	
	public float getShifty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'shifty'.
	 * @see #__DNA__FIELD__shifty
	 */
	
	public void setShifty(float shifty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, shifty);
		} else {
			__io__block.writeFloat(__io__address + 144, shifty);
		}
	}

	/**
	 * Get method for struct member 'YF_dofdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> yafray: dof params qdn: yafray var 'YF_dofdist' now enabled for defocus composite node as well. The name was not changed so that no other files need to be modified </p>
	 * @see #__DNA__FIELD__YF_dofdist
	 */
	
	public float getYF_dofdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'YF_dofdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> yafray: dof params qdn: yafray var 'YF_dofdist' now enabled for defocus composite node as well. The name was not changed so that no other files need to be modified </p>
	 * @see #__DNA__FIELD__YF_dofdist
	 */
	
	public void setYF_dofdist(float YF_dofdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, YF_dofdist);
		} else {
			__io__block.writeFloat(__io__address + 148, YF_dofdist);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'dof_ob'.
	 * @see #__DNA__FIELD__dof_ob
	 */
	
	public CPointer<BlenderObject> getDof_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dof_ob'.
	 * @see #__DNA__FIELD__dof_ob
	 */
	
	public void setDof_ob(CPointer<BlenderObject> dof_ob) throws IOException
	{
		long __address = ((dof_ob == null) ? 0 : dof_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__gpu_dof
	 */
	
	public GPUDOFSettings getGpu_dof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GPUDOFSettings(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new GPUDOFSettings(__io__address + 160, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpu_dof'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__gpu_dof
	 */
	
	public void setGpu_dof(GPUDOFSettings gpu_dof) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 160;
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
	 * Get method for struct member 'sensor_fit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to fit image and field of view angle inside the sensor
	 * @see #__DNA__FIELD__sensor_fit
	 */
	
	public byte getSensor_fit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 216);
		} else {
			return __io__block.readByte(__io__address + 184);
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
			__io__block.writeByte(__io__address + 216, sensor_fit);
		} else {
			__io__block.writeByte(__io__address + 184, sensor_fit);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 217, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 185, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 217;
		} else {
			__dna__offset = 185;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
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
			return new CameraStereoSettings(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new CameraStereoSettings(__io__address + 192, __io__block, __io__blockTable);
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
			__dna__offset = 224;
		} else {
			__dna__offset = 192;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Camera> __io__addressof() {
		return new CPointer<Camera>(__io__address, new Class[]{Camera.class}, __io__block, __io__blockTable);
	}

}
