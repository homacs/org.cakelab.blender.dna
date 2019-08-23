package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClipUser'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class MovieClipUser extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClipUser.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClipUser.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 548;

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame number. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipUser movieclipuser = ...;
	 * CPointer&lt;Object&gt; p = movieclipuser.__dna__addressof(MovieClipUser.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'render_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proxy render size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipUser movieclipuser = ...;
	 * CPointer&lt;Object&gt; p = movieclipuser.__dna__addressof(MovieClipUser.__DNA__FIELD__render_size);
	 * CPointer&lt;Short&gt; p_render_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_size = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'render_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipUser movieclipuser = ...;
	 * CPointer&lt;Object&gt; p = movieclipuser.__dna__addressof(MovieClipUser.__DNA__FIELD__render_flag);
	 * CPointer&lt;Short&gt; p_render_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_flag = new long[]{6, 6};

	public MovieClipUser(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClipUser(MovieClipUser that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame number. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame number. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, framenr);
		} else {
			__io__block.writeInt(__io__address + 0, framenr);
		}
	}

	/**
	 * Get method for struct member 'render_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proxy render size. </p>
	 * @see #__DNA__FIELD__render_size
	 */
	
	public short getRender_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'render_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proxy render size. </p>
	 * @see #__DNA__FIELD__render_size
	 */
	
	public void setRender_size(short render_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, render_size);
		} else {
			__io__block.writeShort(__io__address + 4, render_size);
		}
	}

	/**
	 * Get method for struct member 'render_flag'.
	 * @see #__DNA__FIELD__render_flag
	 */
	
	public short getRender_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'render_flag'.
	 * @see #__DNA__FIELD__render_flag
	 */
	
	public void setRender_flag(short render_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, render_flag);
		} else {
			__io__block.writeShort(__io__address + 6, render_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClipUser> __io__addressof() {
		return new CPointer<MovieClipUser>(__io__address, new Class[]{MovieClipUser.class}, __io__block, __io__blockTable);
	}

}
