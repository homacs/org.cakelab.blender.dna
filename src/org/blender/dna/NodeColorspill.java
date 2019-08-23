package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeColorspill'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=20)
public class NodeColorspill extends CFacade {

	/**
	 * This is the sdna index of the struct NodeColorspill.
	 * <p>
	 * It is required when allocating a new block to store data for NodeColorspill.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 430;

	/**
	 * Field descriptor (offset) for struct member 'limchan'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__limchan);
	 * CPointer&lt;Short&gt; p_limchan = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limchan'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limchan = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'unspill'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__unspill);
	 * CPointer&lt;Short&gt; p_unspill = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unspill'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unspill = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'limscale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__limscale);
	 * CPointer&lt;Float&gt; p_limscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limscale = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'uspillr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__uspillr);
	 * CPointer&lt;Float&gt; p_uspillr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uspillr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uspillr = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'uspillg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__uspillg);
	 * CPointer&lt;Float&gt; p_uspillg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uspillg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uspillg = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'uspillb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorspill nodecolorspill = ...;
	 * CPointer&lt;Object&gt; p = nodecolorspill.__dna__addressof(NodeColorspill.__DNA__FIELD__uspillb);
	 * CPointer&lt;Float&gt; p_uspillb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uspillb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uspillb = new long[]{16, 16};

	public NodeColorspill(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeColorspill(NodeColorspill that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'limchan'.
	 * @see #__DNA__FIELD__limchan
	 */
	
	public short getLimchan() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'limchan'.
	 * @see #__DNA__FIELD__limchan
	 */
	
	public void setLimchan(short limchan) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, limchan);
		} else {
			__io__block.writeShort(__io__address + 0, limchan);
		}
	}

	/**
	 * Get method for struct member 'unspill'.
	 * @see #__DNA__FIELD__unspill
	 */
	
	public short getUnspill() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'unspill'.
	 * @see #__DNA__FIELD__unspill
	 */
	
	public void setUnspill(short unspill) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, unspill);
		} else {
			__io__block.writeShort(__io__address + 2, unspill);
		}
	}

	/**
	 * Get method for struct member 'limscale'.
	 * @see #__DNA__FIELD__limscale
	 */
	
	public float getLimscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'limscale'.
	 * @see #__DNA__FIELD__limscale
	 */
	
	public void setLimscale(float limscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, limscale);
		} else {
			__io__block.writeFloat(__io__address + 4, limscale);
		}
	}

	/**
	 * Get method for struct member 'uspillr'.
	 * @see #__DNA__FIELD__uspillr
	 */
	
	public float getUspillr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'uspillr'.
	 * @see #__DNA__FIELD__uspillr
	 */
	
	public void setUspillr(float uspillr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, uspillr);
		} else {
			__io__block.writeFloat(__io__address + 8, uspillr);
		}
	}

	/**
	 * Get method for struct member 'uspillg'.
	 * @see #__DNA__FIELD__uspillg
	 */
	
	public float getUspillg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'uspillg'.
	 * @see #__DNA__FIELD__uspillg
	 */
	
	public void setUspillg(float uspillg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, uspillg);
		} else {
			__io__block.writeFloat(__io__address + 12, uspillg);
		}
	}

	/**
	 * Get method for struct member 'uspillb'.
	 * @see #__DNA__FIELD__uspillb
	 */
	
	public float getUspillb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'uspillb'.
	 * @see #__DNA__FIELD__uspillb
	 */
	
	public void setUspillb(float uspillb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, uspillb);
		} else {
			__io__block.writeFloat(__io__address + 16, uspillb);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeColorspill> __io__addressof() {
		return new CPointer<NodeColorspill>(__io__address, new Class[]{NodeColorspill.class}, __io__block, __io__blockTable);
	}

}
