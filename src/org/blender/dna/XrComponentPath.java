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
 * Generated facet for DNA struct type 'XrComponentPath'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  </p>
 */

@CMetaData(size32=200, size64=208)
public class XrComponentPath extends CFacade {

	/**
	 * This is the sdna index of the struct XrComponentPath.
	 * <p>
	 * It is required when allocating a new block to store data for XrComponentPath.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 779;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrComponentPath xrcomponentpath = ...;
	 * CPointer&lt;Object&gt; p = xrcomponentpath.__dna__addressof(XrComponentPath.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;XrComponentPath&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, XrComponentPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'XrComponentPath*'</li>
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
	 * XrComponentPath xrcomponentpath = ...;
	 * CPointer&lt;Object&gt; p = xrcomponentpath.__dna__addressof(XrComponentPath.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;XrComponentPath&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, XrComponentPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'XrComponentPath*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR component path
	 * <h4>Blender Source Code</h4>
	 * <p> XR_MAX_COMPONENT_PATH_LENGTH </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrComponentPath xrcomponentpath = ...;
	 * CPointer&lt;Object&gt; p = xrcomponentpath.__dna__addressof(XrComponentPath.__DNA__FIELD__path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'char[192]'</li>
	 * <li>Actual Size (32bit/64bit): 192/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{8, 16};

	public XrComponentPath(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected XrComponentPath(XrComponentPath that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<XrComponentPath> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrComponentPath.class};
		return new CPointer<XrComponentPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrComponentPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<XrComponentPath> next) throws IOException
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
	
	public CPointer<XrComponentPath> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrComponentPath.class};
		return new CPointer<XrComponentPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrComponentPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<XrComponentPath> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR component path
	 * <h4>Blender Source Code</h4>
	 * <p> XR_MAX_COMPONENT_PATH_LENGTH </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public CArrayFacade<Byte> getPath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			192
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * OpenXR component path
	 * <h4>Blender Source Code</h4>
	 * <p> XR_MAX_COMPONENT_PATH_LENGTH </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CArrayFacade<Byte> path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path);
		} else {
			__io__generic__copy( getPath(), path);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<XrComponentPath> __io__addressof() {
		return new CPointer<XrComponentPath>(__io__address, new Class[]{XrComponentPath.class}, __io__block, __io__blockTable);
	}

}
