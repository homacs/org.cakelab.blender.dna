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
 * Generated facet for DNA struct type 'bToolRef'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><h2>Note</h2><p> Stored per mode. </p> Stored per mode. 
 * 
 * </p>
 */

@CMetaData(size32=152, size64=168)
public class bToolRef extends CFacade {

	/**
	 * This is the sdna index of the struct bToolRef.
	 * <p>
	 * It is required when allocating a new block to store data for bToolRef.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 765;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bToolRef&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bToolRef.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bToolRef*'</li>
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
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bToolRef&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bToolRef.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bToolRef*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'idname_fallback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optionally use these when not interacting directly with the primary tools gizmo. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__idname_fallback);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname_fallback = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname_fallback'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname_fallback = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use to avoid initializing the same tool multiple times. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__tag);
	 * CPointer&lt;Short&gt; p_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{136, 144};

	/**
	 * Field descriptor (offset) for struct member 'space_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #bToolKey (spacetype, mode), used in 'WM_api.h' </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__space_type);
	 * CPointer&lt;Short&gt; p_space_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_type = new long[]{138, 146};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value depends on the 'space_type', object mode for 3D view, image editor has own mode too. RNA needs to handle using item function. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{140, 148};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for tool options, each group's name must match a tool name:</p><p> {"Tool Name": {"SOME_OT_operator": {...}, ..}, ..}</p><p> This is done since different tools may call the same operators with their own options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables needed to operate the tool. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bToolRef btoolref = ...;
	 * CPointer&lt;Object&gt; p = btoolref.__dna__addressof(bToolRef.__DNA__FIELD__runtime);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_runtime = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bToolRef_Runtime*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{148, 160};

	public bToolRef(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bToolRef(bToolRef that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bToolRef> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bToolRef.class};
		return new CPointer<bToolRef>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bToolRef.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bToolRef> next) throws IOException
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
	
	public CPointer<bToolRef> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bToolRef.class};
		return new CPointer<bToolRef>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bToolRef.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bToolRef> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
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
	 * Set method for struct member 'idname'.
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname);
		} else {
			__io__generic__copy( getIdname(), idname);
		}
	}

	/**
	 * Get method for struct member 'idname_fallback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optionally use these when not interacting directly with the primary tools gizmo. </p>
	 * @see #__DNA__FIELD__idname_fallback
	 */
	
	public CArrayFacade<Byte> getIdname_fallback() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname_fallback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optionally use these when not interacting directly with the primary tools gizmo. </p>
	 * @see #__DNA__FIELD__idname_fallback
	 */
	
	public void setIdname_fallback(CArrayFacade<Byte> idname_fallback) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(idname_fallback, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname_fallback)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname_fallback);
		} else {
			__io__generic__copy( getIdname_fallback(), idname_fallback);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use to avoid initializing the same tool multiple times. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public short getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use to avoid initializing the same tool multiple times. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(short tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 144, tag);
		} else {
			__io__block.writeShort(__io__address + 136, tag);
		}
	}

	/**
	 * Get method for struct member 'space_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #bToolKey (spacetype, mode), used in 'WM_api.h' </p>
	 * @see #__DNA__FIELD__space_type
	 */
	
	public short getSpace_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 146);
		} else {
			return __io__block.readShort(__io__address + 138);
		}
	}

	/**
	 * Set method for struct member 'space_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #bToolKey (spacetype, mode), used in 'WM_api.h' </p>
	 * @see #__DNA__FIELD__space_type
	 */
	
	public void setSpace_type(short space_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 146, space_type);
		} else {
			__io__block.writeShort(__io__address + 138, space_type);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value depends on the 'space_type', object mode for 3D view, image editor has own mode too. RNA needs to handle using item function. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value depends on the 'space_type', object mode for 3D view, image editor has own mode too. RNA needs to handle using item function. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, mode);
		} else {
			__io__block.writeInt(__io__address + 140, mode);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for tool options, each group's name must match a tool name:</p><p> {"Tool Name": {"SOME_OT_operator": {...}, ..}, ..}</p><p> This is done since different tools may call the same operators with their own options. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use for tool options, each group's name must match a tool name:</p><p> {"Tool Name": {"SOME_OT_operator": {...}, ..}, ..}</p><p> This is done since different tools may call the same operators with their own options. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables needed to operate the tool. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public CPointer<Object> getRuntime() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Variables needed to operate the tool. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(CPointer<Object> runtime) throws IOException
	{
		long __address = ((runtime == null) ? 0 : runtime.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bToolRef> __io__addressof() {
		return new CPointer<bToolRef>(__io__address, new Class[]{bToolRef.class}, __io__block, __io__blockTable);
	}

}
