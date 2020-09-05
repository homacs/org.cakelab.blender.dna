package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Panel_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class Panel_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Panel_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Panel_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 269;

	/**
	 * Field descriptor (offset) for struct member 'region_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Applied to {@link Panel.ofsx} , but saved separately so we can track changes between redraws. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel_Runtime panel_runtime = ...;
	 * CPointer&lt;Object&gt; p = panel_runtime.__dna__addressof(Panel_Runtime.__DNA__FIELD__region_ofsx);
	 * CPointer&lt;Integer&gt; p_region_ofsx = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'region_ofsx'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__region_ofsx = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'list_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For instanced panels: Index of the list item the panel corresponds to. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel_Runtime panel_runtime = ...;
	 * CPointer&lt;Object&gt; p = panel_runtime.__dna__addressof(Panel_Runtime.__DNA__FIELD__list_index);
	 * CPointer&lt;Integer&gt; p_list_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_index = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'custom_data_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer for storing which data the panel corresponds to. Useful when there can be multiple instances of the same panel type.</p><p><h2>Note</h2><p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. </p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel_Runtime panel_runtime = ...;
	 * CPointer&lt;Object&gt; p = panel_runtime.__dna__addressof(Panel_Runtime.__DNA__FIELD__custom_data_ptr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_custom_data_ptr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_data_ptr'</li>
	 * <li>Signature: 'PointerRNA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_data_ptr = new long[]{8, 8};

	public Panel_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Panel_Runtime(Panel_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'region_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Applied to {@link Panel.ofsx} , but saved separately so we can track changes between redraws. </p>
	 * @see #__DNA__FIELD__region_ofsx
	 */
	
	public int getRegion_ofsx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'region_ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Applied to {@link Panel.ofsx} , but saved separately so we can track changes between redraws. </p>
	 * @see #__DNA__FIELD__region_ofsx
	 */
	
	public void setRegion_ofsx(int region_ofsx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, region_ofsx);
		} else {
			__io__block.writeInt(__io__address + 0, region_ofsx);
		}
	}

	/**
	 * Get method for struct member 'list_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For instanced panels: Index of the list item the panel corresponds to. </p>
	 * @see #__DNA__FIELD__list_index
	 */
	
	public int getList_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'list_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For instanced panels: Index of the list item the panel corresponds to. </p>
	 * @see #__DNA__FIELD__list_index
	 */
	
	public void setList_index(int list_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, list_index);
		} else {
			__io__block.writeInt(__io__address + 4, list_index);
		}
	}

	/**
	 * Get method for struct member 'custom_data_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer for storing which data the panel corresponds to. Useful when there can be multiple instances of the same panel type.</p><p><h2>Note</h2><p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. </p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. 
	 * </p>
	 * @see #__DNA__FIELD__custom_data_ptr
	 */
	
	public CPointer<Object> getCustom_data_ptr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_data_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer for storing which data the panel corresponds to. Useful when there can be multiple instances of the same panel type.</p><p><h2>Note</h2><p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. </p> A panel and its sub-panels share the same custom data pointer. This avoids freeing the same pointer twice when panels are removed. 
	 * </p>
	 * @see #__DNA__FIELD__custom_data_ptr
	 */
	
	public void setCustom_data_ptr(CPointer<Object> custom_data_ptr) throws IOException
	{
		long __address = ((custom_data_ptr == null) ? 0 : custom_data_ptr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Panel_Runtime> __io__addressof() {
		return new CPointer<Panel_Runtime>(__io__address, new Class[]{Panel_Runtime.class}, __io__block, __io__blockTable);
	}

}
