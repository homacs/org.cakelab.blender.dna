package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDframe_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Frame Runtime temp data for {@link bGPDframe}  </p>
 */

@CMetaData(size32=12, size64=16)
public class bGPDframe_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDframe_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDframe_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 593;

	/**
	 * Field descriptor (offset) for struct member 'frameid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of this frame in the listbase of frames. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDframe_Runtime bgpdframe_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdframe_runtime.__dna__addressof(bGPDframe_Runtime.__DNA__FIELD__frameid);
	 * CPointer&lt;Integer&gt; p_frameid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frameid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frameid = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'onion_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion offset from active frame. 0 if not onion. INT_MAX to bypass frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDframe_Runtime bgpdframe_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdframe_runtime.__dna__addressof(bGPDframe_Runtime.__DNA__FIELD__onion_id);
	 * CPointer&lt;Integer&gt; p_onion_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_id = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'gpf_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original frame (used to dereference evaluated data) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDframe_Runtime bgpdframe_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdframe_runtime.__dna__addressof(bGPDframe_Runtime.__DNA__FIELD__gpf_orig);
	 * CPointer&lt;CPointer&lt;bGPDframe&gt;&gt; p_gpf_orig = p.cast(new Class[]{CPointer.class, bGPDframe.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpf_orig'</li>
	 * <li>Signature: 'bGPDframe*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpf_orig = new long[]{8, 8};

	public bGPDframe_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDframe_Runtime(bGPDframe_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'frameid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of this frame in the listbase of frames. </p>
	 * @see #__DNA__FIELD__frameid
	 */
	
	public int getFrameid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'frameid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of this frame in the listbase of frames. </p>
	 * @see #__DNA__FIELD__frameid
	 */
	
	public void setFrameid(int frameid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, frameid);
		} else {
			__io__block.writeInt(__io__address + 0, frameid);
		}
	}

	/**
	 * Get method for struct member 'onion_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion offset from active frame. 0 if not onion. INT_MAX to bypass frame. </p>
	 * @see #__DNA__FIELD__onion_id
	 */
	
	public int getOnion_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'onion_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion offset from active frame. 0 if not onion. INT_MAX to bypass frame. </p>
	 * @see #__DNA__FIELD__onion_id
	 */
	
	public void setOnion_id(int onion_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, onion_id);
		} else {
			__io__block.writeInt(__io__address + 4, onion_id);
		}
	}

	/**
	 * Get method for struct member 'gpf_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original frame (used to dereference evaluated data) </p>
	 * @see #__DNA__FIELD__gpf_orig
	 */
	
	public CPointer<bGPDframe> getGpf_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDframe.class};
		return new CPointer<bGPDframe>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDframe.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpf_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original frame (used to dereference evaluated data) </p>
	 * @see #__DNA__FIELD__gpf_orig
	 */
	
	public void setGpf_orig(CPointer<bGPDframe> gpf_orig) throws IOException
	{
		long __address = ((gpf_orig == null) ? 0 : gpf_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDframe_Runtime> __io__addressof() {
		return new CPointer<bGPDframe_Runtime>(__io__address, new Class[]{bGPDframe_Runtime.class}, __io__block, __io__blockTable);
	}

}
