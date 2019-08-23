package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeLensDist'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> qdn: lens distortion node </p>
 */

@CMetaData(size32=8, size64=8)
public class NodeLensDist extends CFacade {

	/**
	 * This is the sdna index of the struct NodeLensDist.
	 * <p>
	 * It is required when allocating a new block to store data for NodeLensDist.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 396;

	/**
	 * Field descriptor (offset) for struct member 'jit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeLensDist nodelensdist = ...;
	 * CPointer&lt;Object&gt; p = nodelensdist.__dna__addressof(NodeLensDist.__DNA__FIELD__jit);
	 * CPointer&lt;Short&gt; p_jit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jit = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'proj'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeLensDist nodelensdist = ...;
	 * CPointer&lt;Object&gt; p = nodelensdist.__dna__addressof(NodeLensDist.__DNA__FIELD__proj);
	 * CPointer&lt;Short&gt; p_proj = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proj'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proj = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'fit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeLensDist nodelensdist = ...;
	 * CPointer&lt;Object&gt; p = nodelensdist.__dna__addressof(NodeLensDist.__DNA__FIELD__fit);
	 * CPointer&lt;Short&gt; p_fit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fit = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeLensDist nodelensdist = ...;
	 * CPointer&lt;Object&gt; p = nodelensdist.__dna__addressof(NodeLensDist.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{6, 6};

	public NodeLensDist(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeLensDist(NodeLensDist that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'jit'.
	 * @see #__DNA__FIELD__jit
	 */
	
	public short getJit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'jit'.
	 * @see #__DNA__FIELD__jit
	 */
	
	public void setJit(short jit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, jit);
		} else {
			__io__block.writeShort(__io__address + 0, jit);
		}
	}

	/**
	 * Get method for struct member 'proj'.
	 * @see #__DNA__FIELD__proj
	 */
	
	public short getProj() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'proj'.
	 * @see #__DNA__FIELD__proj
	 */
	
	public void setProj(short proj) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, proj);
		} else {
			__io__block.writeShort(__io__address + 2, proj);
		}
	}

	/**
	 * Get method for struct member 'fit'.
	 * @see #__DNA__FIELD__fit
	 */
	
	public short getFit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'fit'.
	 * @see #__DNA__FIELD__fit
	 */
	
	public void setFit(short fit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, fit);
		} else {
			__io__block.writeShort(__io__address + 4, fit);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6;
		} else {
			__dna__offset = 6;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeLensDist> __io__addressof() {
		return new CPointer<NodeLensDist>(__io__address, new Class[]{NodeLensDist.class}, __io__block, __io__blockTable);
	}

}
