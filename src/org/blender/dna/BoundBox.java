package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoundBox'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * 
 * 			 The following illustrates the orientation of the
 * 			 bounding box in local space.
 * 			 
 * 			 <pre>
 * 			 
 * 			 Z  Y
 * 			 | /
 * 			 |/
 * 			 .-----X
 * 			 
 * 			 
 * 			     2----------6
 * 			    /|         /|
 * 			   / |        / |
 * 			  1----------5  |
 * 			  |  |       |  |
 * 			  |  3-------|--7
 * 			  | /        | /
 * 			  |/         |/
 * 			  0----------4
 * 			 </pre>
 * 			<h4>Blender Source Code:</h4>
 * <p> The following illustrates the orientation of the bounding box in local space</p><p><pre></pre></p><p><pre> Z  Y
 * | /
 * |/
 * .--<mdash/> X
 *     2-------<mdash/> 6
 *    /|         /|
 *   / |        / |
 *  1-------<mdash/> 5  |
 *  |  |       |  |
 *  |  3----<mdash/> |<ndash/> 7
 *  | /        | /
 *  |/         |/
 *  0-------<mdash/></pre>  </p>
 */

@CMetaData(size32=104, size64=104)
public class BoundBox extends CFacade {

	/**
	 * This is the sdna index of the struct BoundBox.
	 * <p>
	 * It is required when allocating a new block to store data for BoundBox.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 158;

	/**
	 * Field descriptor (offset) for struct member 'vec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The 8 vectors with 3 components (xyz) (see class documentation).
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoundBox boundbox = ...;
	 * CPointer&lt;Object&gt; p = boundbox.__dna__addressof(BoundBox.__DNA__FIELD__vec);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_vec = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vec'</li>
	 * <li>Signature: 'float[8][3]'</li>
	 * <li>Actual Size (32bit/64bit): 96/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vec = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * One of: 	
	 * 				<ul><li>BOUNDBOX_DISABLED</td><td>(1 << 0)</li>
	 * 				<li>BOUNDBOX_DIRTY </td><td>(1 << 1)</li>
	 * 				</ul>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoundBox boundbox = ...;
	 * CPointer&lt;Object&gt; p = boundbox.__dna__addressof(BoundBox.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoundBox boundbox = ...;
	 * CPointer&lt;Object&gt; p = boundbox.__dna__addressof(BoundBox.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{100, 100};

	public BoundBox(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoundBox(BoundBox that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The 8 vectors with 3 components (xyz) (see class documentation).
	 * @see #__DNA__FIELD__vec
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getVec() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			8,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * The 8 vectors with 3 components (xyz) (see class documentation).
	 * @see #__DNA__FIELD__vec
	 */
	
	public void setVec(CArrayFacade<CArrayFacade<Float>> vec) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(vec, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vec)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vec);
		} else {
			__io__generic__copy( getVec(), vec);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * One of: 	
	 * 				<ul><li>BOUNDBOX_DISABLED</td><td>(1 << 0)</li>
	 * 				<li>BOUNDBOX_DIRTY </td><td>(1 << 1)</li>
	 * 				</ul>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * One of: 	
	 * 				<ul><li>BOUNDBOX_DISABLED</td><td>(1 << 0)</li>
	 * 				<li>BOUNDBOX_DIRTY </td><td>(1 << 1)</li>
	 * 				</ul>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, flag);
		} else {
			__io__block.writeInt(__io__address + 96, flag);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoundBox> __io__addressof() {
		return new CPointer<BoundBox>(__io__address, new Class[]{BoundBox.class}, __io__block, __io__blockTable);
	}

}
