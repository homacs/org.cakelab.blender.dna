package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Library_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class Library_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Library_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Library_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 14;

	/**
	 * Field descriptor (offset) for struct member 'name_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for efficient calculations of unique names. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Library_Runtime library_runtime = ...;
	 * CPointer&lt;Object&gt; p = library_runtime.__dna__addressof(Library_Runtime.__DNA__FIELD__name_map);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_name_map = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name_map'</li>
	 * <li>Signature: 'UniqueName_Map*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name_map = new long[]{0, 0};

	public Library_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Library_Runtime(Library_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for efficient calculations of unique names. </p>
	 * @see #__DNA__FIELD__name_map
	 */
	
	public CPointer<Object> getName_map() throws IOException
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
	 * Set method for struct member 'name_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for efficient calculations of unique names. </p>
	 * @see #__DNA__FIELD__name_map
	 */
	
	public void setName_map(CPointer<Object> name_map) throws IOException
	{
		long __address = ((name_map == null) ? 0 : name_map.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Library_Runtime> __io__addressof() {
		return new CPointer<Library_Runtime>(__io__address, new Class[]{Library_Runtime.class}, __io__block, __io__blockTable);
	}

}
