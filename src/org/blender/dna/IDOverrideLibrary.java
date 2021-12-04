package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDOverrideLibrary'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Main container for all overriding data info of a data-block. </p>
 */

@CMetaData(size32=20, size64=40)
public class IDOverrideLibrary extends CFacade {

	/**
	 * This is the sdna index of the struct IDOverrideLibrary.
	 * <p>
	 * It is required when allocating a new block to store data for IDOverrideLibrary.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 19;

	/**
	 * Field descriptor (offset) for struct member 'reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Linked ID used as reference by this override<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibrary idoverridelibrary = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrary.__dna__addressof(IDOverrideLibrary.__DNA__FIELD__reference);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_reference = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overridden properties<h4>Blender Source Code:</h4>
	 * <p> List of {@link IDOverrideLibraryProperty}  structs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibrary idoverridelibrary = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrary.__dna__addressof(IDOverrideLibrary.__DNA__FIELD__properties);
	 * CPointer&lt;ListBase&gt; p_properties = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Read/write data. Temp {@link ID}  storing extra override data (used for differential operations only currently). Always NULL outside of read/write context. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibrary idoverridelibrary = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrary.__dna__addressof(IDOverrideLibrary.__DNA__FIELD__storage);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_storage = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storage'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storage = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibrary idoverridelibrary = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrary.__dna__addressof(IDOverrideLibrary.__DNA__FIELD__runtime);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_runtime = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'IDOverrideLibraryRuntime*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{16, 32};

	public IDOverrideLibrary(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDOverrideLibrary(IDOverrideLibrary that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Linked ID used as reference by this override<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * @see #__DNA__FIELD__reference
	 */
	
	public CPointer<ID> getReference() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reference'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Linked ID used as reference by this override<h4>Blender Source Code:</h4>
	 * <p> Reference linked {@link ID}  which this one overrides. </p>
	 * @see #__DNA__FIELD__reference
	 */
	
	public void setReference(CPointer<ID> reference) throws IOException
	{
		long __address = ((reference == null) ? 0 : reference.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overridden properties<h4>Blender Source Code:</h4>
	 * <p> List of {@link IDOverrideLibraryProperty}  structs. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public ListBase getProperties() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    List of overridden properties<h4>Blender Source Code:</h4>
	 * <p> List of {@link IDOverrideLibraryProperty}  structs. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(ListBase properties) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(properties, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, properties)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, properties);
		} else {
			__io__generic__copy( getProperties(), properties);
		}
	}

	/**
	 * Get method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Read/write data. Temp {@link ID}  storing extra override data (used for differential operations only currently). Always NULL outside of read/write context. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public CPointer<ID> getStorage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Read/write data. Temp {@link ID}  storing extra override data (used for differential operations only currently). Always NULL outside of read/write context. </p>
	 * @see #__DNA__FIELD__storage
	 */
	
	public void setStorage(CPointer<ID> storage) throws IOException
	{
		long __address = ((storage == null) ? 0 : storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public CPointer<Object> getRuntime() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(CPointer<Object> runtime) throws IOException
	{
		long __address = ((runtime == null) ? 0 : runtime.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDOverrideLibrary> __io__addressof() {
		return new CPointer<IDOverrideLibrary>(__io__address, new Class[]{IDOverrideLibrary.class}, __io__block, __io__blockTable);
	}

}
