package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ViewerPath'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=16)
public class ViewerPath extends CFacade {

	/**
	 * This is the sdna index of the struct ViewerPath.
	 * <p>
	 * It is required when allocating a new block to store data for ViewerPath.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 778;

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ViewerPathElem} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewerPath viewerpath = ...;
	 * CPointer&lt;Object&gt; p = viewerpath.__dna__addressof(ViewerPath.__DNA__FIELD__path);
	 * CPointer&lt;ListBase&gt; p_path = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{0, 0};

	public ViewerPath(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ViewerPath(ViewerPath that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ViewerPathElem} . </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public ListBase getPath() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> List of {@link ViewerPathElem} . </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(ListBase path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path);
		} else {
			__io__generic__copy( getPath(), path);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ViewerPath> __io__addressof() {
		return new CPointer<ViewerPath>(__io__address, new Class[]{ViewerPath.class}, __io__block, __io__blockTable);
	}

}
