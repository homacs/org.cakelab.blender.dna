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
 * Generated facet for DNA struct type 'XrActionMapBinding'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=368, size64=384)
public class XrActionMapBinding extends CFacade {

	/**
	 * This is the sdna index of the struct XrActionMapBinding.
	 * <p>
	 * It is required when allocating a new block to store data for XrActionMapBinding.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 802;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;XrActionMapBinding&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, XrActionMapBinding.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'XrActionMapBinding*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;XrActionMapBinding&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, XrActionMapBinding.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'XrActionMapBinding*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the action map binding
	 * <h4>Blender Source Code</h4>
	 * <p> Unique name. MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR interaction profile path
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR interaction profile path. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__profile);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_profile = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'profile'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__profile = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'component_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    OpenXR component paths
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR component paths. {@link XrComponentPath}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__component_paths);
	 * CPointer&lt;ListBase&gt; p_component_paths = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'component_paths'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__component_paths = new long[]{328, 336};

	/**
	 * Field descriptor (offset) for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input threshold/region. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__float_threshold);
	 * CPointer&lt;Float&gt; p_float_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'float_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__float_threshold = new long[]{336, 352};

	/**
	 * Field descriptor (offset) for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eXrAxisFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__axis_flag);
	 * CPointer&lt;Short&gt; p_axis_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_flag = new long[]{340, 356};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{342, 358};

	/**
	 * Field descriptor (offset) for struct member 'pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pose action properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__pose_location);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pose_location = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_location'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_location = new long[]{344, 360};

	/**
	 * Field descriptor (offset) for struct member 'pose_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__pose_rotation);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pose_rotation = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_rotation'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_rotation = new long[]{356, 372};

	public XrActionMapBinding(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected XrActionMapBinding(XrActionMapBinding that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<XrActionMapBinding> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrActionMapBinding.class};
		return new CPointer<XrActionMapBinding>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrActionMapBinding.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<XrActionMapBinding> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<XrActionMapBinding> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrActionMapBinding.class};
		return new CPointer<XrActionMapBinding>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrActionMapBinding.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<XrActionMapBinding> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the action map binding
	 * <h4>Blender Source Code</h4>
	 * <p> Unique name. MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the action map binding
	 * <h4>Blender Source Code</h4>
	 * <p> Unique name. MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR interaction profile path
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR interaction profile path. </p>
	 * @see #__DNA__FIELD__profile
	 */
	
	public CArrayFacade<Byte> getProfile() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'profile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR interaction profile path
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR interaction profile path. </p>
	 * @see #__DNA__FIELD__profile
	 */
	
	public void setProfile(CArrayFacade<Byte> profile) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(profile, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, profile)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, profile);
		} else {
			__io__generic__copy( getProfile(), profile);
		}
	}

	/**
	 * Get method for struct member 'component_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    OpenXR component paths
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR component paths. {@link XrComponentPath}  </p>
	 * @see #__DNA__FIELD__component_paths
	 */
	
	public ListBase getComponent_paths() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 336, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 328, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'component_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    OpenXR component paths
	 * <h4>Blender Source Code</h4>
	 * <p> OpenXR component paths. {@link XrComponentPath}  </p>
	 * @see #__DNA__FIELD__component_paths
	 */
	
	public void setComponent_paths(ListBase component_paths) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 328;
		}
		if (__io__equals(component_paths, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, component_paths)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, component_paths);
		} else {
			__io__generic__copy( getComponent_paths(), component_paths);
		}
	}

	/**
	 * Get method for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input threshold/region. </p>
	 * @see #__DNA__FIELD__float_threshold
	 */
	
	public float getFloat_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input threshold/region. </p>
	 * @see #__DNA__FIELD__float_threshold
	 */
	
	public void setFloat_threshold(float float_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, float_threshold);
		} else {
			__io__block.writeFloat(__io__address + 336, float_threshold);
		}
	}

	/**
	 * Get method for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eXrAxisFlag </p>
	 * @see #__DNA__FIELD__axis_flag
	 */
	
	public short getAxis_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 356);
		} else {
			return __io__block.readShort(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eXrAxisFlag </p>
	 * @see #__DNA__FIELD__axis_flag
	 */
	
	public void setAxis_flag(short axis_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 356, axis_flag);
		} else {
			__io__block.writeShort(__io__address + 340, axis_flag);
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
			return new CArrayFacade<Byte>(__io__address + 358, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 342, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 358;
		} else {
			__dna__offset = 342;
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
	 * Get method for struct member 'pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pose action properties. </p>
	 * @see #__DNA__FIELD__pose_location
	 */
	
	public CArrayFacade<Float> getPose_location() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pose action properties. </p>
	 * @see #__DNA__FIELD__pose_location
	 */
	
	public void setPose_location(CArrayFacade<Float> pose_location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 344;
		}
		if (__io__equals(pose_location, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pose_location)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pose_location);
		} else {
			__io__generic__copy( getPose_location(), pose_location);
		}
	}

	/**
	 * Get method for struct member 'pose_rotation'.
	 * @see #__DNA__FIELD__pose_rotation
	 */
	
	public CArrayFacade<Float> getPose_rotation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_rotation'.
	 * @see #__DNA__FIELD__pose_rotation
	 */
	
	public void setPose_rotation(CArrayFacade<Float> pose_rotation) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 372;
		} else {
			__dna__offset = 356;
		}
		if (__io__equals(pose_rotation, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pose_rotation)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pose_rotation);
		} else {
			__io__generic__copy( getPose_rotation(), pose_rotation);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<XrActionMapBinding> __io__addressof() {
		return new CPointer<XrActionMapBinding>(__io__address, new Class[]{XrActionMapBinding.class}, __io__block, __io__blockTable);
	}

}
