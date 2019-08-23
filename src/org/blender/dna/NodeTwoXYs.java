package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTwoXYs'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class NodeTwoXYs extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTwoXYs.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTwoXYs.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 389;

	/**
	 * Field descriptor (offset) for struct member 'x1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__x1);
	 * CPointer&lt;Short&gt; p_x1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x1 = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'x2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__x2);
	 * CPointer&lt;Short&gt; p_x2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x2 = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'y1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__y1);
	 * CPointer&lt;Short&gt; p_y1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y1 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'y2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__y2);
	 * CPointer&lt;Short&gt; p_y2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y2 = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'fac_x1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__fac_x1);
	 * CPointer&lt;Float&gt; p_fac_x1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fac_x1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fac_x1 = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'fac_x2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__fac_x2);
	 * CPointer&lt;Float&gt; p_fac_x2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fac_x2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fac_x2 = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'fac_y1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__fac_y1);
	 * CPointer&lt;Float&gt; p_fac_y1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fac_y1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fac_y1 = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'fac_y2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTwoXYs nodetwoxys = ...;
	 * CPointer&lt;Object&gt; p = nodetwoxys.__dna__addressof(NodeTwoXYs.__DNA__FIELD__fac_y2);
	 * CPointer&lt;Float&gt; p_fac_y2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fac_y2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fac_y2 = new long[]{20, 20};

	public NodeTwoXYs(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTwoXYs(NodeTwoXYs that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'x1'.
	 * @see #__DNA__FIELD__x1
	 */
	
	public short getX1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'x1'.
	 * @see #__DNA__FIELD__x1
	 */
	
	public void setX1(short x1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, x1);
		} else {
			__io__block.writeShort(__io__address + 0, x1);
		}
	}

	/**
	 * Get method for struct member 'x2'.
	 * @see #__DNA__FIELD__x2
	 */
	
	public short getX2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'x2'.
	 * @see #__DNA__FIELD__x2
	 */
	
	public void setX2(short x2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, x2);
		} else {
			__io__block.writeShort(__io__address + 2, x2);
		}
	}

	/**
	 * Get method for struct member 'y1'.
	 * @see #__DNA__FIELD__y1
	 */
	
	public short getY1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'y1'.
	 * @see #__DNA__FIELD__y1
	 */
	
	public void setY1(short y1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, y1);
		} else {
			__io__block.writeShort(__io__address + 4, y1);
		}
	}

	/**
	 * Get method for struct member 'y2'.
	 * @see #__DNA__FIELD__y2
	 */
	
	public short getY2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'y2'.
	 * @see #__DNA__FIELD__y2
	 */
	
	public void setY2(short y2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, y2);
		} else {
			__io__block.writeShort(__io__address + 6, y2);
		}
	}

	/**
	 * Get method for struct member 'fac_x1'.
	 * @see #__DNA__FIELD__fac_x1
	 */
	
	public float getFac_x1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'fac_x1'.
	 * @see #__DNA__FIELD__fac_x1
	 */
	
	public void setFac_x1(float fac_x1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, fac_x1);
		} else {
			__io__block.writeFloat(__io__address + 8, fac_x1);
		}
	}

	/**
	 * Get method for struct member 'fac_x2'.
	 * @see #__DNA__FIELD__fac_x2
	 */
	
	public float getFac_x2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'fac_x2'.
	 * @see #__DNA__FIELD__fac_x2
	 */
	
	public void setFac_x2(float fac_x2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, fac_x2);
		} else {
			__io__block.writeFloat(__io__address + 12, fac_x2);
		}
	}

	/**
	 * Get method for struct member 'fac_y1'.
	 * @see #__DNA__FIELD__fac_y1
	 */
	
	public float getFac_y1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'fac_y1'.
	 * @see #__DNA__FIELD__fac_y1
	 */
	
	public void setFac_y1(float fac_y1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, fac_y1);
		} else {
			__io__block.writeFloat(__io__address + 16, fac_y1);
		}
	}

	/**
	 * Get method for struct member 'fac_y2'.
	 * @see #__DNA__FIELD__fac_y2
	 */
	
	public float getFac_y2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'fac_y2'.
	 * @see #__DNA__FIELD__fac_y2
	 */
	
	public void setFac_y2(float fac_y2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, fac_y2);
		} else {
			__io__block.writeFloat(__io__address + 20, fac_y2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTwoXYs> __io__addressof() {
		return new CPointer<NodeTwoXYs>(__io__address, new Class[]{NodeTwoXYs.class}, __io__block, __io__blockTable);
	}

}
