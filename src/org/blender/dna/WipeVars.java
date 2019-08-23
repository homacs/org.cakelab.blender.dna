package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WipeVars'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> ************* {@link Effect}  Variable Structs ********* </p>
 */

@CMetaData(size32=12, size64=12)
public class WipeVars extends CFacade {

	/**
	 * This is the sdna index of the struct WipeVars.
	 * <p>
	 * It is required when allocating a new block to store data for WipeVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 271;

	/**
	 * Field descriptor (offset) for struct member 'edgeWidth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WipeVars wipevars = ...;
	 * CPointer&lt;Object&gt; p = wipevars.__dna__addressof(WipeVars.__DNA__FIELD__edgeWidth);
	 * CPointer&lt;Float&gt; p_edgeWidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgeWidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgeWidth = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WipeVars wipevars = ...;
	 * CPointer&lt;Object&gt; p = wipevars.__dna__addressof(WipeVars.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'forward'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WipeVars wipevars = ...;
	 * CPointer&lt;Object&gt; p = wipevars.__dna__addressof(WipeVars.__DNA__FIELD__forward);
	 * CPointer&lt;Short&gt; p_forward = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forward'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forward = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'wipetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WipeVars wipevars = ...;
	 * CPointer&lt;Object&gt; p = wipevars.__dna__addressof(WipeVars.__DNA__FIELD__wipetype);
	 * CPointer&lt;Short&gt; p_wipetype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wipetype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wipetype = new long[]{10, 10};

	public WipeVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WipeVars(WipeVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'edgeWidth'.
	 * @see #__DNA__FIELD__edgeWidth
	 */
	
	public float getEdgeWidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'edgeWidth'.
	 * @see #__DNA__FIELD__edgeWidth
	 */
	
	public void setEdgeWidth(float edgeWidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, edgeWidth);
		} else {
			__io__block.writeFloat(__io__address + 0, edgeWidth);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, angle);
		} else {
			__io__block.writeFloat(__io__address + 4, angle);
		}
	}

	/**
	 * Get method for struct member 'forward'.
	 * @see #__DNA__FIELD__forward
	 */
	
	public short getForward() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'forward'.
	 * @see #__DNA__FIELD__forward
	 */
	
	public void setForward(short forward) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, forward);
		} else {
			__io__block.writeShort(__io__address + 8, forward);
		}
	}

	/**
	 * Get method for struct member 'wipetype'.
	 * @see #__DNA__FIELD__wipetype
	 */
	
	public short getWipetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'wipetype'.
	 * @see #__DNA__FIELD__wipetype
	 */
	
	public void setWipetype(short wipetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, wipetype);
		} else {
			__io__block.writeShort(__io__address + 10, wipetype);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WipeVars> __io__addressof() {
		return new CPointer<WipeVars>(__io__address, new Class[]{WipeVars.class}, __io__block, __io__blockTable);
	}

}
