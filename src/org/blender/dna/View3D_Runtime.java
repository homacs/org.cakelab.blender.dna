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
 * Generated facet for DNA struct type 'View3D_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=24)
public class View3D_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct View3D_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for View3D_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 231;

	/**
	 * Field descriptor (offset) for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D_Runtime view3d_runtime = ...;
	 * CPointer&lt;Object&gt; p = view3d_runtime.__dna__addressof(View3D_Runtime.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D_Runtime view3d_runtime = ...;
	 * CPointer&lt;Object&gt; p = view3d_runtime.__dna__addressof(View3D_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'local_stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only used for overlay stats while in local-view. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3D_Runtime view3d_runtime = ...;
	 * CPointer&lt;Object&gt; p = view3d_runtime.__dna__addressof(View3D_Runtime.__DNA__FIELD__local_stats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_local_stats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'local_stats'</li>
	 * <li>Signature: 'SceneStats*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__local_stats = new long[]{12, 16};

	public View3D_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3D_Runtime(View3D_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'properties_storage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime only flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'local_stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only used for overlay stats while in local-view. </p>
	 * @see #__DNA__FIELD__local_stats
	 */
	
	public CPointer<Object> getLocal_stats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'local_stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only used for overlay stats while in local-view. </p>
	 * @see #__DNA__FIELD__local_stats
	 */
	
	public void setLocal_stats(CPointer<Object> local_stats) throws IOException
	{
		long __address = ((local_stats == null) ? 0 : local_stats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3D_Runtime> __io__addressof() {
		return new CPointer<View3D_Runtime>(__io__address, new Class[]{View3D_Runtime.class}, __io__block, __io__blockTable);
	}

}
