package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometry'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=128)
public class NodeGeometry extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometry.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometry.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 418;

	/**
	 * Field descriptor (offset) for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometry nodegeometry = ...;
	 * CPointer&lt;Object&gt; p = nodegeometry.__dna__addressof(NodeGeometry.__DNA__FIELD__uvname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvname = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'colname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometry nodegeometry = ...;
	 * CPointer&lt;Object&gt; p = nodegeometry.__dna__addressof(NodeGeometry.__DNA__FIELD__colname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_colname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colname = new long[]{64, 64};

	public NodeGeometry(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometry(NodeGeometry that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public CArrayFacade<Byte> getUvname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public void setUvname(CArrayFacade<Byte> uvname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(uvname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvname);
		} else {
			__io__generic__copy( getUvname(), uvname);
		}
	}

	/**
	 * Get method for struct member 'colname'.
	 * @see #__DNA__FIELD__colname
	 */
	
	public CArrayFacade<Byte> getColname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colname'.
	 * @see #__DNA__FIELD__colname
	 */
	
	public void setColname(CArrayFacade<Byte> colname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(colname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colname);
		} else {
			__io__generic__copy( getColname(), colname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometry> __io__addressof() {
		return new CPointer<NodeGeometry>(__io__address, new Class[]{NodeGeometry.class}, __io__block, __io__blockTable);
	}

}
