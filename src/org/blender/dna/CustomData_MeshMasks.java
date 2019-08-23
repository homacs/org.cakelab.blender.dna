package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CustomData_MeshMasks'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=40, size64=40)
public class CustomData_MeshMasks extends CFacade {

	/**
	 * This is the sdna index of the struct CustomData_MeshMasks.
	 * <p>
	 * It is required when allocating a new block to store data for CustomData_MeshMasks.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 447;

	/**
	 * Field descriptor (offset) for struct member 'vmask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData_MeshMasks customdata_meshmasks = ...;
	 * CPointer&lt;Object&gt; p = customdata_meshmasks.__dna__addressof(CustomData_MeshMasks.__DNA__FIELD__vmask);
	 * CPointer&lt;int64&gt; p_vmask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vmask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vmask = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'emask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData_MeshMasks customdata_meshmasks = ...;
	 * CPointer&lt;Object&gt; p = customdata_meshmasks.__dna__addressof(CustomData_MeshMasks.__DNA__FIELD__emask);
	 * CPointer&lt;int64&gt; p_emask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emask = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'fmask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData_MeshMasks customdata_meshmasks = ...;
	 * CPointer&lt;Object&gt; p = customdata_meshmasks.__dna__addressof(CustomData_MeshMasks.__DNA__FIELD__fmask);
	 * CPointer&lt;int64&gt; p_fmask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fmask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fmask = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'pmask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData_MeshMasks customdata_meshmasks = ...;
	 * CPointer&lt;Object&gt; p = customdata_meshmasks.__dna__addressof(CustomData_MeshMasks.__DNA__FIELD__pmask);
	 * CPointer&lt;int64&gt; p_pmask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmask = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'lmask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData_MeshMasks customdata_meshmasks = ...;
	 * CPointer&lt;Object&gt; p = customdata_meshmasks.__dna__addressof(CustomData_MeshMasks.__DNA__FIELD__lmask);
	 * CPointer&lt;int64&gt; p_lmask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lmask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lmask = new long[]{32, 32};

	public CustomData_MeshMasks(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CustomData_MeshMasks(CustomData_MeshMasks that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vmask'.
	 * @see #__DNA__FIELD__vmask
	 */
	
	public long getVmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 0);
		} else {
			return __io__block.readInt64(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'vmask'.
	 * @see #__DNA__FIELD__vmask
	 */
	
	public void setVmask(long vmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 0, vmask);
		} else {
			__io__block.writeInt64(__io__address + 0, vmask);
		}
	}

	/**
	 * Get method for struct member 'emask'.
	 * @see #__DNA__FIELD__emask
	 */
	
	public long getEmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 8);
		} else {
			return __io__block.readInt64(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'emask'.
	 * @see #__DNA__FIELD__emask
	 */
	
	public void setEmask(long emask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 8, emask);
		} else {
			__io__block.writeInt64(__io__address + 8, emask);
		}
	}

	/**
	 * Get method for struct member 'fmask'.
	 * @see #__DNA__FIELD__fmask
	 */
	
	public long getFmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 16);
		} else {
			return __io__block.readInt64(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'fmask'.
	 * @see #__DNA__FIELD__fmask
	 */
	
	public void setFmask(long fmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 16, fmask);
		} else {
			__io__block.writeInt64(__io__address + 16, fmask);
		}
	}

	/**
	 * Get method for struct member 'pmask'.
	 * @see #__DNA__FIELD__pmask
	 */
	
	public long getPmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 24);
		} else {
			return __io__block.readInt64(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'pmask'.
	 * @see #__DNA__FIELD__pmask
	 */
	
	public void setPmask(long pmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 24, pmask);
		} else {
			__io__block.writeInt64(__io__address + 24, pmask);
		}
	}

	/**
	 * Get method for struct member 'lmask'.
	 * @see #__DNA__FIELD__lmask
	 */
	
	public long getLmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 32);
		} else {
			return __io__block.readInt64(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'lmask'.
	 * @see #__DNA__FIELD__lmask
	 */
	
	public void setLmask(long lmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 32, lmask);
		} else {
			__io__block.writeInt64(__io__address + 32, lmask);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CustomData_MeshMasks> __io__addressof() {
		return new CPointer<CustomData_MeshMasks>(__io__address, new Class[]{CustomData_MeshMasks.class}, __io__block, __io__blockTable);
	}

}
