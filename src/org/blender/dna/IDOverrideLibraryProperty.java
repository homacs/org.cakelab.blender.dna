package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDOverrideLibraryProperty'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> A single overridden property, contain all operations on this one. </p>
 */

@CMetaData(size32=20, size64=40)
public class IDOverrideLibraryProperty extends CFacade {

	/**
	 * This is the sdna index of the struct IDOverrideLibraryProperty.
	 * <p>
	 * It is required when allocating a new block to store data for IDOverrideLibraryProperty.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 13;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryProperty idoverridelibraryproperty = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibraryproperty.__dna__addressof(IDOverrideLibraryProperty.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;IDOverrideLibraryProperty&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, IDOverrideLibraryProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'IDOverrideLibraryProperty*'</li>
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
	 * IDOverrideLibraryProperty idoverridelibraryproperty = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibraryproperty.__dna__addressof(IDOverrideLibraryProperty.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;IDOverrideLibraryProperty&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, IDOverrideLibraryProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'IDOverrideLibraryProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    RNA path leading to that property, from owning ID<h4>Blender Source Code:</h4>
	 * <p>{@link Path}  from {@link ID}<em></em>  include indices/names for final arrays/collections items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryProperty idoverridelibraryproperty = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibraryproperty.__dna__addressof(IDOverrideLibraryProperty.__DNA__FIELD__rna_path);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_rna_path = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rna_path'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rna_path = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'operations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overriding operations for a property<h4>Blender Source Code:</h4>
	 * <p> List of overriding operations (IDOverridePropertyOperation) applied to this property. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryProperty idoverridelibraryproperty = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibraryproperty.__dna__addressof(IDOverrideLibraryProperty.__DNA__FIELD__operations);
	 * CPointer&lt;ListBase&gt; p_operations = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operations'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operations = new long[]{12, 24};

	public IDOverrideLibraryProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDOverrideLibraryProperty(IDOverrideLibraryProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<IDOverrideLibraryProperty> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDOverrideLibraryProperty.class};
		return new CPointer<IDOverrideLibraryProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDOverrideLibraryProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<IDOverrideLibraryProperty> next) throws IOException
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
	
	public CPointer<IDOverrideLibraryProperty> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDOverrideLibraryProperty.class};
		return new CPointer<IDOverrideLibraryProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDOverrideLibraryProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<IDOverrideLibraryProperty> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    RNA path leading to that property, from owning ID<h4>Blender Source Code:</h4>
	 * <p>{@link Path}  from {@link ID}<em></em>  include indices/names for final arrays/collections items. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public CPointer<Byte> getRna_path() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    RNA path leading to that property, from owning ID<h4>Blender Source Code:</h4>
	 * <p>{@link Path}  from {@link ID}<em></em>  include indices/names for final arrays/collections items. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public void setRna_path(CPointer<Byte> rna_path) throws IOException
	{
		long __address = ((rna_path == null) ? 0 : rna_path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'operations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overriding operations for a property<h4>Blender Source Code:</h4>
	 * <p> List of overriding operations (IDOverridePropertyOperation) applied to this property. </p>
	 * @see #__DNA__FIELD__operations
	 */
	
	public ListBase getOperations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'operations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overriding operations for a property<h4>Blender Source Code:</h4>
	 * <p> List of overriding operations (IDOverridePropertyOperation) applied to this property. </p>
	 * @see #__DNA__FIELD__operations
	 */
	
	public void setOperations(ListBase operations) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(operations, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, operations)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, operations);
		} else {
			__io__generic__copy( getOperations(), operations);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDOverrideLibraryProperty> __io__addressof() {
		return new CPointer<IDOverrideLibraryProperty>(__io__address, new Class[]{IDOverrideLibraryProperty.class}, __io__block, __io__blockTable);
	}

}
