package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'XrSessionSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=980, size64=992)
public class XrSessionSettings extends CFacade {

	/**
	 * This is the sdna index of the struct XrSessionSettings.
	 * <p>
	 * It is required when allocating a new block to store data for XrSessionSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 723;

	/**
	 * Field descriptor (offset) for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Shading settings, struct shared with 3D-View so settings are the same. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__shading);
	 * CPointer&lt;View3DShading&gt; p_shading = p.cast(new Class[]{View3DShading.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shading'</li>
	 * <li>Signature: 'View3DShading'</li>
	 * <li>Actual Size (32bit/64bit): 936/944</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shading = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{936, 944};

	/**
	 * Field descriptor (offset) for struct member 'base_pose_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define where the location and rotation for the VR view come from, to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p> eXRSessionBasePoseType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__base_pose_type);
	 * CPointer&lt;Byte&gt; p_base_pose_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_pose_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_pose_type = new long[]{943, 951};

	/**
	 * Field descriptor (offset) for struct member 'base_pose_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take the location and rotation to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to take the location and rotation as base position from. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__base_pose_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_base_pose_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_pose_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_pose_object = new long[]{944, 952};

	/**
	 * Field descriptor (offset) for struct member 'base_pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Coordinates to apply translation deltas from the VR headset to
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__base_pose_location);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_base_pose_location = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_pose_location'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_pose_location = new long[]{948, 960};

	/**
	 * Field descriptor (offset) for struct member 'base_pose_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle around the Z-Axis to apply the rotation deltas from the VR headset to
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__base_pose_angle);
	 * CPointer&lt;Float&gt; p_base_pose_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_pose_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_pose_angle = new long[]{960, 972};

	/**
	 * Field descriptor (offset) for struct member 'draw_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link View3D}  draw flags (V3D_OFSDRAW_NONE, V3D_OFSDRAW_SHOW_ANNOTATION, ...). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__draw_flags);
	 * CPointer&lt;Byte&gt; p_draw_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_flags = new long[]{964, 976};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{965, 977};

	/**
	 * Field descriptor (offset) for struct member 'clip_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport near clipping distance<h4>Blender Source Code:</h4>
	 * <p> Clipping distance. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__clip_start);
	 * CPointer&lt;Float&gt; p_clip_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_start = new long[]{968, 980};

	/**
	 * Field descriptor (offset) for struct member 'clip_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport far clipping distance
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__clip_end);
	 * CPointer&lt;Float&gt; p_clip_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_end = new long[]{972, 984};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrSessionSettings xrsessionsettings = ...;
	 * CPointer&lt;Object&gt; p = xrsessionsettings.__dna__addressof(XrSessionSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{976, 988};

	public XrSessionSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected XrSessionSettings(XrSessionSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Shading settings, struct shared with 3D-View so settings are the same. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public View3DShading getShading() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3DShading(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new View3DShading(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Shading settings, struct shared with 3D-View so settings are the same. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public void setShading(View3DShading shading) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(shading, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shading)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shading);
		} else {
			__io__generic__copy( getShading(), shading);
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
			return new CArrayFacade<Byte>(__io__address + 944, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 936, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 944;
		} else {
			__dna__offset = 936;
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
	 * Get method for struct member 'base_pose_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define where the location and rotation for the VR view come from, to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p> eXRSessionBasePoseType </p>
	 * @see #__DNA__FIELD__base_pose_type
	 */
	
	public byte getBase_pose_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 951);
		} else {
			return __io__block.readByte(__io__address + 943);
		}
	}

	/**
	 * Set method for struct member 'base_pose_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define where the location and rotation for the VR view come from, to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p> eXRSessionBasePoseType </p>
	 * @see #__DNA__FIELD__base_pose_type
	 */
	
	public void setBase_pose_type(byte base_pose_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 951, base_pose_type);
		} else {
			__io__block.writeByte(__io__address + 943, base_pose_type);
		}
	}

	/**
	 * Get method for struct member 'base_pose_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take the location and rotation to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to take the location and rotation as base position from. </p>
	 * @see #__DNA__FIELD__base_pose_object
	 */
	
	public CPointer<BlenderObject> getBase_pose_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 952);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 944);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'base_pose_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take the location and rotation to which translation and rotation deltas from the VR headset will be applied to<h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to take the location and rotation as base position from. </p>
	 * @see #__DNA__FIELD__base_pose_object
	 */
	
	public void setBase_pose_object(CPointer<BlenderObject> base_pose_object) throws IOException
	{
		long __address = ((base_pose_object == null) ? 0 : base_pose_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 952, __address);
		} else {
			__io__block.writeLong(__io__address + 944, __address);
		}
	}

	/**
	 * Get method for struct member 'base_pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Coordinates to apply translation deltas from the VR headset to
	 * @see #__DNA__FIELD__base_pose_location
	 */
	
	public CArrayFacade<Float> getBase_pose_location() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 960, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 948, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base_pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Coordinates to apply translation deltas from the VR headset to
	 * @see #__DNA__FIELD__base_pose_location
	 */
	
	public void setBase_pose_location(CArrayFacade<Float> base_pose_location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 960;
		} else {
			__dna__offset = 948;
		}
		if (__io__equals(base_pose_location, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base_pose_location)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base_pose_location);
		} else {
			__io__generic__copy( getBase_pose_location(), base_pose_location);
		}
	}

	/**
	 * Get method for struct member 'base_pose_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle around the Z-Axis to apply the rotation deltas from the VR headset to
	 * @see #__DNA__FIELD__base_pose_angle
	 */
	
	public float getBase_pose_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 972);
		} else {
			return __io__block.readFloat(__io__address + 960);
		}
	}

	/**
	 * Set method for struct member 'base_pose_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle around the Z-Axis to apply the rotation deltas from the VR headset to
	 * @see #__DNA__FIELD__base_pose_angle
	 */
	
	public void setBase_pose_angle(float base_pose_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 972, base_pose_angle);
		} else {
			__io__block.writeFloat(__io__address + 960, base_pose_angle);
		}
	}

	/**
	 * Get method for struct member 'draw_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link View3D}  draw flags (V3D_OFSDRAW_NONE, V3D_OFSDRAW_SHOW_ANNOTATION, ...). </p>
	 * @see #__DNA__FIELD__draw_flags
	 */
	
	public byte getDraw_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 976);
		} else {
			return __io__block.readByte(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'draw_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link View3D}  draw flags (V3D_OFSDRAW_NONE, V3D_OFSDRAW_SHOW_ANNOTATION, ...). </p>
	 * @see #__DNA__FIELD__draw_flags
	 */
	
	public void setDraw_flags(byte draw_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 976, draw_flags);
		} else {
			__io__block.writeByte(__io__address + 964, draw_flags);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 977, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 965, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 977;
		} else {
			__dna__offset = 965;
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
	 * Get method for struct member 'clip_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport near clipping distance<h4>Blender Source Code:</h4>
	 * <p> Clipping distance. </p>
	 * @see #__DNA__FIELD__clip_start
	 */
	
	public float getClip_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 980);
		} else {
			return __io__block.readFloat(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'clip_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport near clipping distance<h4>Blender Source Code:</h4>
	 * <p> Clipping distance. </p>
	 * @see #__DNA__FIELD__clip_start
	 */
	
	public void setClip_start(float clip_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 980, clip_start);
		} else {
			__io__block.writeFloat(__io__address + 968, clip_start);
		}
	}

	/**
	 * Get method for struct member 'clip_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport far clipping distance
	 * @see #__DNA__FIELD__clip_end
	 */
	
	public float getClip_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 984);
		} else {
			return __io__block.readFloat(__io__address + 972);
		}
	}

	/**
	 * Set method for struct member 'clip_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * VR viewport far clipping distance
	 * @see #__DNA__FIELD__clip_end
	 */
	
	public void setClip_end(float clip_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 984, clip_end);
		} else {
			__io__block.writeFloat(__io__address + 972, clip_end);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 988);
		} else {
			return __io__block.readInt(__io__address + 976);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 988, flag);
		} else {
			__io__block.writeInt(__io__address + 976, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<XrSessionSettings> __io__addressof() {
		return new CPointer<XrSessionSettings>(__io__address, new Class[]{XrSessionSettings.class}, __io__block, __io__blockTable);
	}

}
