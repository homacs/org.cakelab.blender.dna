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
 * Generated facet for DNA struct type 'NodeConvertColorSpace'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=128)
public class NodeConvertColorSpace extends CFacade {

	/**
	 * This is the sdna index of the struct NodeConvertColorSpace.
	 * <p>
	 * It is required when allocating a new block to store data for NodeConvertColorSpace.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 450;

	/**
	 * Field descriptor (offset) for struct member 'from_color_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeConvertColorSpace nodeconvertcolorspace = ...;
	 * CPointer&lt;Object&gt; p = nodeconvertcolorspace.__dna__addressof(NodeConvertColorSpace.__DNA__FIELD__from_color_space);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_from_color_space = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_color_space'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_color_space = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'to_color_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeConvertColorSpace nodeconvertcolorspace = ...;
	 * CPointer&lt;Object&gt; p = nodeconvertcolorspace.__dna__addressof(NodeConvertColorSpace.__DNA__FIELD__to_color_space);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_to_color_space = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_color_space'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_color_space = new long[]{64, 64};

	public NodeConvertColorSpace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeConvertColorSpace(NodeConvertColorSpace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'from_color_space'.
	 * @see #__DNA__FIELD__from_color_space
	 */
	
	public CArrayFacade<Byte> getFrom_color_space() throws IOException
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
	 * Set method for struct member 'from_color_space'.
	 * @see #__DNA__FIELD__from_color_space
	 */
	
	public void setFrom_color_space(CArrayFacade<Byte> from_color_space) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(from_color_space, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_color_space)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_color_space);
		} else {
			__io__generic__copy( getFrom_color_space(), from_color_space);
		}
	}

	/**
	 * Get method for struct member 'to_color_space'.
	 * @see #__DNA__FIELD__to_color_space
	 */
	
	public CArrayFacade<Byte> getTo_color_space() throws IOException
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
	 * Set method for struct member 'to_color_space'.
	 * @see #__DNA__FIELD__to_color_space
	 */
	
	public void setTo_color_space(CArrayFacade<Byte> to_color_space) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(to_color_space, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_color_space)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_color_space);
		} else {
			__io__generic__copy( getTo_color_space(), to_color_space);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeConvertColorSpace> __io__addressof() {
		return new CPointer<NodeConvertColorSpace>(__io__address, new Class[]{NodeConvertColorSpace.class}, __io__block, __io__blockTable);
	}

}
