package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ViewLayerEngineData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=40)
public class ViewLayerEngineData extends CFacade {

	/**
	 * This is the sdna index of the struct ViewLayerEngineData.
	 * <p>
	 * It is required when allocating a new block to store data for ViewLayerEngineData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 630;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayerEngineData viewlayerenginedata = ...;
	 * CPointer&lt;Object&gt; p = viewlayerenginedata.__dna__addressof(ViewLayerEngineData.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ViewLayerEngineData&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ViewLayerEngineData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ViewLayerEngineData*'</li>
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
	 * ViewLayerEngineData viewlayerenginedata = ...;
	 * CPointer&lt;Object&gt; p = viewlayerenginedata.__dna__addressof(ViewLayerEngineData.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ViewLayerEngineData&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ViewLayerEngineData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ViewLayerEngineData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'engine_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayerEngineData viewlayerenginedata = ...;
	 * CPointer&lt;Object&gt; p = viewlayerenginedata.__dna__addressof(ViewLayerEngineData.__DNA__FIELD__engine_type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_engine_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'engine_type'</li>
	 * <li>Signature: 'DrawEngineType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__engine_type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'storage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayerEngineData viewlayerenginedata = ...;
	 * CPointer&lt;Object&gt; p = viewlayerenginedata.__dna__addressof(ViewLayerEngineData.__DNA__FIELD__storage);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_storage = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storage'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storage = new long[]{12, 24};

	public ViewLayerEngineData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ViewLayerEngineData(ViewLayerEngineData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ViewLayerEngineData> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayerEngineData.class};
		return new CPointer<ViewLayerEngineData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayerEngineData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ViewLayerEngineData> next) throws IOException
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
	
	public CPointer<ViewLayerEngineData> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayerEngineData.class};
		return new CPointer<ViewLayerEngineData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayerEngineData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ViewLayerEngineData> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'engine_type'.
	 * @see #__DNA__FIELD__engine_type
	 */
	
	public CPointer<Object> getEngine_type() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'engine_type'.
	 * @see #__DNA__FIELD__engine_type
	 */
	
	public void setEngine_type(CPointer<Object> engine_type) throws IOException
	{
		long __address = ((engine_type == null) ? 0 : engine_type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'storage'.
	 * @see #__DNA__FIELD__storage
	 */
	
	public CPointer<Object> getStorage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'storage'.
	 * @see #__DNA__FIELD__storage
	 */
	
	public void setStorage(CPointer<Object> storage) throws IOException
	{
		long __address = ((storage == null) ? 0 : storage.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ViewLayerEngineData> __io__addressof() {
		return new CPointer<ViewLayerEngineData>(__io__address, new Class[]{ViewLayerEngineData.class}, __io__block, __io__blockTable);
	}

}
