package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View3D_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class View3D_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct View3D_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for View3D_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 214;

	/**
	 * Field descriptor (offset) for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D_Runtime view3d_runtime = ...;
	 * CPointer&lt;Object&gt; p = view3d_runtime.__dna__addressof(View3D_Runtime.__DNA__FIELD__properties_storage);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_properties_storage = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties_storage'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties_storage = new long[]{0, 0};

	public View3D_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3D_Runtime(View3D_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here. </p>
	 * @see #__DNA__FIELD__properties_storage
	 */
	
	public CPointer<Object> getProperties_storage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Nkey panel stores stuff here. </p>
	 * @see #__DNA__FIELD__properties_storage
	 */
	
	public void setProperties_storage(CPointer<Object> properties_storage) throws IOException
	{
		long __address = ((properties_storage == null) ? 0 : properties_storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3D_Runtime> __io__addressof() {
		return new CPointer<View3D_Runtime>(__io__address, new Class[]{View3D_Runtime.class}, __io__block, __io__blockTable);
	}

}
