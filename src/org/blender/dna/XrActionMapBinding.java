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
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  </p>
 */

@CMetaData(size32=744, size64=752)
public class XrActionMapBinding extends CFacade {

	/**
	 * This is the sdna index of the struct XrActionMapBinding.
	 * <p>
	 * It is required when allocating a new block to store data for XrActionMapBinding.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 786;

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
	 * <h4>Blender Python API:</h4>
	 * Name of the action map binding<h4>Blender Source Code:</h4>
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
	 * <h4>Blender Python API:</h4>
	 * OpenXR interaction profile path<h4>Blender Source Code:</h4>
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
	 * Field descriptor (offset) for struct member 'component_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path<h4>Blender Source Code:</h4>
	 * <p> OpenXR component paths. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__component_path0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_component_path0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'component_path0'</li>
	 * <li>Signature: 'char[192]'</li>
	 * <li>Actual Size (32bit/64bit): 192/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__component_path0 = new long[]{328, 336};

	/**
	 * Field descriptor (offset) for struct member 'component_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapBinding xractionmapbinding = ...;
	 * CPointer&lt;Object&gt; p = xractionmapbinding.__dna__addressof(XrActionMapBinding.__DNA__FIELD__component_path1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_component_path1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'component_path1'</li>
	 * <li>Signature: 'char[192]'</li>
	 * <li>Actual Size (32bit/64bit): 192/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__component_path1 = new long[]{520, 528};

	/**
	 * Field descriptor (offset) for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__float_threshold = new long[]{712, 720};

	/**
	 * Field descriptor (offset) for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__axis_flag = new long[]{716, 724};

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
	public static final long[] __DNA__FIELD___pad = new long[]{718, 726};

	/**
	 * Field descriptor (offset) for struct member 'pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__pose_location = new long[]{720, 728};

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
	public static final long[] __DNA__FIELD__pose_rotation = new long[]{732, 740};

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
	 * <h4>Blender Python API:</h4>
	 * Name of the action map binding<h4>Blender Source Code:</h4>
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
	 * <h4>Blender Python API:</h4>
	 * Name of the action map binding<h4>Blender Source Code:</h4>
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
	 * <h4>Blender Python API:</h4>
	 * OpenXR interaction profile path<h4>Blender Source Code:</h4>
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
	 * <h4>Blender Python API:</h4>
	 * OpenXR interaction profile path<h4>Blender Source Code:</h4>
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
	 * Get method for struct member 'component_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path<h4>Blender Source Code:</h4>
	 * <p> OpenXR component paths. </p>
	 * @see #__DNA__FIELD__component_path0
	 */
	
	public CArrayFacade<Byte> getComponent_path0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			192
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'component_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path<h4>Blender Source Code:</h4>
	 * <p> OpenXR component paths. </p>
	 * @see #__DNA__FIELD__component_path0
	 */
	
	public void setComponent_path0(CArrayFacade<Byte> component_path0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 328;
		}
		if (__io__equals(component_path0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, component_path0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, component_path0);
		} else {
			__io__generic__copy( getComponent_path0(), component_path0);
		}
	}

	/**
	 * Get method for struct member 'component_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path
	 * @see #__DNA__FIELD__component_path1
	 */
	
	public CArrayFacade<Byte> getComponent_path1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			192
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'component_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR component path
	 * @see #__DNA__FIELD__component_path1
	 */
	
	public void setComponent_path1(CArrayFacade<Byte> component_path1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 520;
		}
		if (__io__equals(component_path1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, component_path1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, component_path1);
		} else {
			__io__generic__copy( getComponent_path1(), component_path1);
		}
	}

	/**
	 * Get method for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input threshold/region. </p>
	 * @see #__DNA__FIELD__float_threshold
	 */
	
	public float getFloat_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 720);
		} else {
			return __io__block.readFloat(__io__address + 712);
		}
	}

	/**
	 * Set method for struct member 'float_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Input threshold/region. </p>
	 * @see #__DNA__FIELD__float_threshold
	 */
	
	public void setFloat_threshold(float float_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 720, float_threshold);
		} else {
			__io__block.writeFloat(__io__address + 712, float_threshold);
		}
	}

	/**
	 * Get method for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrAxisFlag </p>
	 * @see #__DNA__FIELD__axis_flag
	 */
	
	public short getAxis_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 724);
		} else {
			return __io__block.readShort(__io__address + 716);
		}
	}

	/**
	 * Set method for struct member 'axis_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrAxisFlag </p>
	 * @see #__DNA__FIELD__axis_flag
	 */
	
	public void setAxis_flag(short axis_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 724, axis_flag);
		} else {
			__io__block.writeShort(__io__address + 716, axis_flag);
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
			return new CArrayFacade<Byte>(__io__address + 726, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 718, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 726;
		} else {
			__dna__offset = 718;
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
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 728, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pose_location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose action properties. </p>
	 * @see #__DNA__FIELD__pose_location
	 */
	
	public void setPose_location(CArrayFacade<Float> pose_location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 728;
		} else {
			__dna__offset = 720;
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
			return new CArrayFacade<Float>(__io__address + 740, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 732, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 740;
		} else {
			__dna__offset = 732;
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
