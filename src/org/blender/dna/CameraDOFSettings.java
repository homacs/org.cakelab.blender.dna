package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CameraDOFSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Properties for dof effect. </p>
 */

@CMetaData(size32=28, size64=32)
public class CameraDOFSettings extends CFacade {

	/**
	 * This is the sdna index of the struct CameraDOFSettings.
	 * <p>
	 * It is required when allocating a new block to store data for CameraDOFSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 31;

	/**
	 * Field descriptor (offset) for struct member 'focus_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use this object to define the depth of field focal point<h4>Blender Source Code:</h4>
	 * <p> Focal distance for depth of field. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__focus_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_focus_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'focus_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__focus_object = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance to the focus point for depth of field
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__focus_distance);
	 * CPointer&lt;Float&gt; p_focus_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'focus_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__focus_distance = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'aperture_fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-Stop ratio (lower numbers give more defocus, higher numbers give a sharper image)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__aperture_fstop);
	 * CPointer&lt;Float&gt; p_aperture_fstop = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aperture_fstop'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aperture_fstop = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'aperture_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation of blades in aperture
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__aperture_rotation);
	 * CPointer&lt;Float&gt; p_aperture_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aperture_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aperture_rotation = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'aperture_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion to simulate anamorphic lens bokeh
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__aperture_ratio);
	 * CPointer&lt;Float&gt; p_aperture_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aperture_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aperture_ratio = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'aperture_blades'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of blades in aperture for polygonal bokeh (at least 3)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__aperture_blades);
	 * CPointer&lt;Integer&gt; p_aperture_blades = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aperture_blades'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aperture_blades = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraDOFSettings cameradofsettings = ...;
	 * CPointer&lt;Object&gt; p = cameradofsettings.__dna__addressof(CameraDOFSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{26, 30};

	public CameraDOFSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CameraDOFSettings(CameraDOFSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'focus_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use this object to define the depth of field focal point<h4>Blender Source Code:</h4>
	 * <p> Focal distance for depth of field. </p>
	 * @see #__DNA__FIELD__focus_object
	 */
	
	public CPointer<BlenderObject> getFocus_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'focus_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use this object to define the depth of field focal point<h4>Blender Source Code:</h4>
	 * <p> Focal distance for depth of field. </p>
	 * @see #__DNA__FIELD__focus_object
	 */
	
	public void setFocus_object(CPointer<BlenderObject> focus_object) throws IOException
	{
		long __address = ((focus_object == null) ? 0 : focus_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance to the focus point for depth of field
	 * @see #__DNA__FIELD__focus_distance
	 */
	
	public float getFocus_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance to the focus point for depth of field
	 * @see #__DNA__FIELD__focus_distance
	 */
	
	public void setFocus_distance(float focus_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, focus_distance);
		} else {
			__io__block.writeFloat(__io__address + 4, focus_distance);
		}
	}

	/**
	 * Get method for struct member 'aperture_fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-Stop ratio (lower numbers give more defocus, higher numbers give a sharper image)
	 * @see #__DNA__FIELD__aperture_fstop
	 */
	
	public float getAperture_fstop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'aperture_fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-Stop ratio (lower numbers give more defocus, higher numbers give a sharper image)
	 * @see #__DNA__FIELD__aperture_fstop
	 */
	
	public void setAperture_fstop(float aperture_fstop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, aperture_fstop);
		} else {
			__io__block.writeFloat(__io__address + 8, aperture_fstop);
		}
	}

	/**
	 * Get method for struct member 'aperture_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation of blades in aperture
	 * @see #__DNA__FIELD__aperture_rotation
	 */
	
	public float getAperture_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'aperture_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation of blades in aperture
	 * @see #__DNA__FIELD__aperture_rotation
	 */
	
	public void setAperture_rotation(float aperture_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, aperture_rotation);
		} else {
			__io__block.writeFloat(__io__address + 12, aperture_rotation);
		}
	}

	/**
	 * Get method for struct member 'aperture_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion to simulate anamorphic lens bokeh
	 * @see #__DNA__FIELD__aperture_ratio
	 */
	
	public float getAperture_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'aperture_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion to simulate anamorphic lens bokeh
	 * @see #__DNA__FIELD__aperture_ratio
	 */
	
	public void setAperture_ratio(float aperture_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, aperture_ratio);
		} else {
			__io__block.writeFloat(__io__address + 16, aperture_ratio);
		}
	}

	/**
	 * Get method for struct member 'aperture_blades'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of blades in aperture for polygonal bokeh (at least 3)
	 * @see #__DNA__FIELD__aperture_blades
	 */
	
	public int getAperture_blades() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'aperture_blades'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of blades in aperture for polygonal bokeh (at least 3)
	 * @see #__DNA__FIELD__aperture_blades
	 */
	
	public void setAperture_blades(int aperture_blades) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, aperture_blades);
		} else {
			__io__block.writeInt(__io__address + 20, aperture_blades);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, flag);
		} else {
			__io__block.writeShort(__io__address + 24, flag);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 30, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 30;
		} else {
			__dna__offset = 26;
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
	public CPointer<CameraDOFSettings> __io__addressof() {
		return new CPointer<CameraDOFSettings>(__io__address, new Class[]{CameraDOFSettings.class}, __io__block, __io__blockTable);
	}

}
