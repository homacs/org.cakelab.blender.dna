package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Image_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=24)
public class Image_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Image_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Image_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 48;

	/**
	 * Field descriptor (offset) for struct member 'cache_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mutex used to guarantee thread-safe access to the cached ImBuf of the corresponding image {@link ID} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image_Runtime image_runtime = ...;
	 * CPointer&lt;Object&gt; p = image_runtime.__dna__addressof(Image_Runtime.__DNA__FIELD__cache_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_mutex = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'partial_update_register'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Register containing partial updates. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image_Runtime image_runtime = ...;
	 * CPointer&lt;Object&gt; p = image_runtime.__dna__addressof(Image_Runtime.__DNA__FIELD__partial_update_register);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_partial_update_register = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partial_update_register'</li>
	 * <li>Signature: 'PartialUpdateRegister*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partial_update_register = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'partial_update_user'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Partial update user for GPUTextures stored inside the {@link Image} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image_Runtime image_runtime = ...;
	 * CPointer&lt;Object&gt; p = image_runtime.__dna__addressof(Image_Runtime.__DNA__FIELD__partial_update_user);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_partial_update_user = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partial_update_user'</li>
	 * <li>Signature: 'PartialUpdateUser*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partial_update_user = new long[]{8, 16};

	public Image_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Image_Runtime(Image_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cache_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mutex used to guarantee thread-safe access to the cached ImBuf of the corresponding image {@link ID} . </p>
	 * @see #__DNA__FIELD__cache_mutex
	 */
	
	public CPointer<Object> getCache_mutex() throws IOException
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
	 * Set method for struct member 'cache_mutex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mutex used to guarantee thread-safe access to the cached ImBuf of the corresponding image {@link ID} . </p>
	 * @see #__DNA__FIELD__cache_mutex
	 */
	
	public void setCache_mutex(CPointer<Object> cache_mutex) throws IOException
	{
		long __address = ((cache_mutex == null) ? 0 : cache_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'partial_update_register'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Register containing partial updates. </p>
	 * @see #__DNA__FIELD__partial_update_register
	 */
	
	public CPointer<Object> getPartial_update_register() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'partial_update_register'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Register containing partial updates. </p>
	 * @see #__DNA__FIELD__partial_update_register
	 */
	
	public void setPartial_update_register(CPointer<Object> partial_update_register) throws IOException
	{
		long __address = ((partial_update_register == null) ? 0 : partial_update_register.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'partial_update_user'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Partial update user for GPUTextures stored inside the {@link Image} . </p>
	 * @see #__DNA__FIELD__partial_update_user
	 */
	
	public CPointer<Object> getPartial_update_user() throws IOException
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
	 * Set method for struct member 'partial_update_user'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Partial update user for GPUTextures stored inside the {@link Image} . </p>
	 * @see #__DNA__FIELD__partial_update_user
	 */
	
	public void setPartial_update_user(CPointer<Object> partial_update_user) throws IOException
	{
		long __address = ((partial_update_user == null) ? 0 : partial_update_user.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Image_Runtime> __io__addressof() {
		return new CPointer<Image_Runtime>(__io__address, new Class[]{Image_Runtime.class}, __io__block, __io__blockTable);
	}

}
