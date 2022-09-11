package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ID_Runtime_Remap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Status used and counters created during id-remapping. </p>
 */

@CMetaData(size32=16, size64=16)
public class ID_Runtime_Remap extends CFacade {

	/**
	 * This is the sdna index of the struct ID_Runtime_Remap.
	 * <p>
	 * It is required when allocating a new block to store data for ID_Runtime_Remap.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 11;

	/**
	 * Field descriptor (offset) for struct member 'status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Status during {@link ID}  remapping. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID_Runtime_Remap id_runtime_remap = ...;
	 * CPointer&lt;Object&gt; p = id_runtime_remap.__dna__addressof(ID_Runtime_Remap.__DNA__FIELD__status);
	 * CPointer&lt;Integer&gt; p_status = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'status'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__status = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'skipped_refcounted'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of skipped use cases that refcount the data-block. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID_Runtime_Remap id_runtime_remap = ...;
	 * CPointer&lt;Object&gt; p = id_runtime_remap.__dna__addressof(ID_Runtime_Remap.__DNA__FIELD__skipped_refcounted);
	 * CPointer&lt;Integer&gt; p_skipped_refcounted = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skipped_refcounted'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skipped_refcounted = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'skipped_direct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of direct use cases that could be remapped (e.g. obdata when in edit mode). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID_Runtime_Remap id_runtime_remap = ...;
	 * CPointer&lt;Object&gt; p = id_runtime_remap.__dna__addressof(ID_Runtime_Remap.__DNA__FIELD__skipped_direct);
	 * CPointer&lt;Integer&gt; p_skipped_direct = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skipped_direct'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skipped_direct = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'skipped_indirect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping, the number of indirect use cases that could not be remapped. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID_Runtime_Remap id_runtime_remap = ...;
	 * CPointer&lt;Object&gt; p = id_runtime_remap.__dna__addressof(ID_Runtime_Remap.__DNA__FIELD__skipped_indirect);
	 * CPointer&lt;Integer&gt; p_skipped_indirect = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skipped_indirect'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skipped_indirect = new long[]{12, 12};

	public ID_Runtime_Remap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ID_Runtime_Remap(ID_Runtime_Remap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Status during {@link ID}  remapping. </p>
	 * @see #__DNA__FIELD__status
	 */
	
	public int getStatus() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Status during {@link ID}  remapping. </p>
	 * @see #__DNA__FIELD__status
	 */
	
	public void setStatus(int status) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, status);
		} else {
			__io__block.writeInt(__io__address + 0, status);
		}
	}

	/**
	 * Get method for struct member 'skipped_refcounted'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of skipped use cases that refcount the data-block. </p>
	 * @see #__DNA__FIELD__skipped_refcounted
	 */
	
	public int getSkipped_refcounted() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'skipped_refcounted'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of skipped use cases that refcount the data-block. </p>
	 * @see #__DNA__FIELD__skipped_refcounted
	 */
	
	public void setSkipped_refcounted(int skipped_refcounted) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, skipped_refcounted);
		} else {
			__io__block.writeInt(__io__address + 4, skipped_refcounted);
		}
	}

	/**
	 * Get method for struct member 'skipped_direct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of direct use cases that could be remapped (e.g. obdata when in edit mode). </p>
	 * @see #__DNA__FIELD__skipped_direct
	 */
	
	public int getSkipped_direct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'skipped_direct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping the number of direct use cases that could be remapped (e.g. obdata when in edit mode). </p>
	 * @see #__DNA__FIELD__skipped_direct
	 */
	
	public void setSkipped_direct(int skipped_direct) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, skipped_direct);
		} else {
			__io__block.writeInt(__io__address + 8, skipped_direct);
		}
	}

	/**
	 * Get method for struct member 'skipped_indirect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping, the number of indirect use cases that could not be remapped. </p>
	 * @see #__DNA__FIELD__skipped_indirect
	 */
	
	public int getSkipped_indirect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'skipped_indirect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> During {@link ID}  remapping, the number of indirect use cases that could not be remapped. </p>
	 * @see #__DNA__FIELD__skipped_indirect
	 */
	
	public void setSkipped_indirect(int skipped_indirect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, skipped_indirect);
		} else {
			__io__block.writeInt(__io__address + 12, skipped_indirect);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ID_Runtime_Remap> __io__addressof() {
		return new CPointer<ID_Runtime_Remap>(__io__address, new Class[]{ID_Runtime_Remap.class}, __io__block, __io__blockTable);
	}

}
