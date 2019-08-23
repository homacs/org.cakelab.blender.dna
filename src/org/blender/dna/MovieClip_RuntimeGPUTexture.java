package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClip_RuntimeGPUTexture'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=40)
public class MovieClip_RuntimeGPUTexture extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClip_RuntimeGPUTexture.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClip_RuntimeGPUTexture.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 550;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip_RuntimeGPUTexture movieclip_runtimegputexture = ...;
	 * CPointer&lt;Object&gt; p = movieclip_runtimegputexture.__dna__addressof(MovieClip_RuntimeGPUTexture.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'void*'</li>
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
	 * MovieClip_RuntimeGPUTexture movieclip_runtimegputexture = ...;
	 * CPointer&lt;Object&gt; p = movieclip_runtimegputexture.__dna__addressof(MovieClip_RuntimeGPUTexture.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'user'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip_RuntimeGPUTexture movieclip_runtimegputexture = ...;
	 * CPointer&lt;Object&gt; p = movieclip_runtimegputexture.__dna__addressof(MovieClip_RuntimeGPUTexture.__DNA__FIELD__user);
	 * CPointer&lt;MovieClipUser&gt; p_user = p.cast(new Class[]{MovieClipUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user'</li>
	 * <li>Signature: 'MovieClipUser'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 2 = TEXTARGET_COUNT. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip_RuntimeGPUTexture movieclip_runtimegputexture = ...;
	 * CPointer&lt;Object&gt; p = movieclip_runtimegputexture.__dna__addressof(MovieClip_RuntimeGPUTexture.__DNA__FIELD__gputexture);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_gputexture = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gputexture'</li>
	 * <li>Signature: 'GPUTexture*[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gputexture = new long[]{16, 24};

	public MovieClip_RuntimeGPUTexture(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClip_RuntimeGPUTexture(MovieClip_RuntimeGPUTexture that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Object> getNext() throws IOException
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
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Object> next) throws IOException
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
	
	public CPointer<Object> getPrev() throws IOException
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
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Object> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'user'.
	 * @see #__DNA__FIELD__user
	 */
	
	public MovieClipUser getUser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieClipUser(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new MovieClipUser(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user'.
	 * @see #__DNA__FIELD__user
	 */
	
	public void setUser(MovieClipUser user) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(user, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user);
		} else {
			__io__generic__copy( getUser(), user);
		}
	}

	/**
	 * Get method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 2 = TEXTARGET_COUNT. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public CArrayFacade<CPointer<Object>> getGputexture() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not written in file 2 = TEXTARGET_COUNT. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public void setGputexture(CArrayFacade<CPointer<Object>> gputexture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(gputexture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gputexture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gputexture);
		} else {
			__io__generic__copy( getGputexture(), gputexture);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClip_RuntimeGPUTexture> __io__addressof() {
		return new CPointer<MovieClip_RuntimeGPUTexture>(__io__address, new Class[]{MovieClip_RuntimeGPUTexture.class}, __io__block, __io__blockTable);
	}

}
