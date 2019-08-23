package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeBilateralBlurData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class NodeBilateralBlurData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeBilateralBlurData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeBilateralBlurData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 383;

	/**
	 * Field descriptor (offset) for struct member 'sigma_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBilateralBlurData nodebilateralblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodebilateralblurdata.__dna__addressof(NodeBilateralBlurData.__DNA__FIELD__sigma_color);
	 * CPointer&lt;Float&gt; p_sigma_color = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sigma_color'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sigma_color = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sigma_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBilateralBlurData nodebilateralblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodebilateralblurdata.__dna__addressof(NodeBilateralBlurData.__DNA__FIELD__sigma_space);
	 * CPointer&lt;Float&gt; p_sigma_space = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sigma_space'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sigma_space = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'iter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBilateralBlurData nodebilateralblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodebilateralblurdata.__dna__addressof(NodeBilateralBlurData.__DNA__FIELD__iter);
	 * CPointer&lt;Short&gt; p_iter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeBilateralBlurData nodebilateralblurdata = ...;
	 * CPointer&lt;Object&gt; p = nodebilateralblurdata.__dna__addressof(NodeBilateralBlurData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{10, 10};

	public NodeBilateralBlurData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeBilateralBlurData(NodeBilateralBlurData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sigma_color'.
	 * @see #__DNA__FIELD__sigma_color
	 */
	
	public float getSigma_color() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'sigma_color'.
	 * @see #__DNA__FIELD__sigma_color
	 */
	
	public void setSigma_color(float sigma_color) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, sigma_color);
		} else {
			__io__block.writeFloat(__io__address + 0, sigma_color);
		}
	}

	/**
	 * Get method for struct member 'sigma_space'.
	 * @see #__DNA__FIELD__sigma_space
	 */
	
	public float getSigma_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'sigma_space'.
	 * @see #__DNA__FIELD__sigma_space
	 */
	
	public void setSigma_space(float sigma_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, sigma_space);
		} else {
			__io__block.writeFloat(__io__address + 4, sigma_space);
		}
	}

	/**
	 * Get method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public short getIter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public void setIter(short iter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, iter);
		} else {
			__io__block.writeShort(__io__address + 8, iter);
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
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
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
	public CPointer<NodeBilateralBlurData> __io__addressof() {
		return new CPointer<NodeBilateralBlurData>(__io__address, new Class[]{NodeBilateralBlurData.class}, __io__block, __io__blockTable);
	}

}
