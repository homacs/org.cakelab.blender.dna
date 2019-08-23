package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MPoly'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Defines a polygon based on a subset of the loop entries of the {@link Mesh}.<h4>Blender Source Code:</h4>
 * <p> new face structure, replaces {@link MFace} , which is now only used for storing tessellations. </p>
 */

@CMetaData(size32=12, size64=12)
public class MPoly extends CFacade {

	/**
	 * This is the sdna index of the struct MPoly.
	 * <p>
	 * It is required when allocating a new block to store data for MPoly.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 65;

	/**
	 * Field descriptor (offset) for struct member 'loopstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset in loop array ({@link #getMLoop})<h4>Blender Source Code:</h4>
	 * <p> offset into loop array and number of loops in the face </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MPoly mpoly = ...;
	 * CPointer&lt;Object&gt; p = mpoly.__dna__addressof(MPoly.__DNA__FIELD__loopstart);
	 * CPointer&lt;Integer&gt; p_loopstart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loopstart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loopstart = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of loop entries from loopstart<h4>Blender Source Code:</h4>
	 * <p> keep signed since we need to subtract when getting the previous loop </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MPoly mpoly = ...;
	 * CPointer&lt;Object&gt; p = mpoly.__dna__addressof(MPoly.__DNA__FIELD__totloop);
	 * CPointer&lt;Integer&gt; p_totloop = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totloop'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totloop = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MPoly mpoly = ...;
	 * CPointer&lt;Object&gt; p = mpoly.__dna__addressof(MPoly.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Short&gt; p_mat_nr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_SMOOTH   = (1 << 0),
	 * 	ME_FACE_SEL = (1 << 1),
	 * //	ME_HIDE     = (1 << 4), 
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MPoly mpoly = ...;
	 * CPointer&lt;Object&gt; p = mpoly.__dna__addressof(MPoly.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MPoly mpoly = ...;
	 * CPointer&lt;Object&gt; p = mpoly.__dna__addressof(MPoly.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{11, 11};

	public MPoly(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MPoly(MPoly that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'loopstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset in loop array ({@link #getMLoop})<h4>Blender Source Code:</h4>
	 * <p> offset into loop array and number of loops in the face </p>
	 * @see #__DNA__FIELD__loopstart
	 */
	
	public int getLoopstart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'loopstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * offset in loop array ({@link #getMLoop})<h4>Blender Source Code:</h4>
	 * <p> offset into loop array and number of loops in the face </p>
	 * @see #__DNA__FIELD__loopstart
	 */
	
	public void setLoopstart(int loopstart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, loopstart);
		} else {
			__io__block.writeInt(__io__address + 0, loopstart);
		}
	}

	/**
	 * Get method for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of loop entries from loopstart<h4>Blender Source Code:</h4>
	 * <p> keep signed since we need to subtract when getting the previous loop </p>
	 * @see #__DNA__FIELD__totloop
	 */
	
	public int getTotloop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totloop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Number of loop entries from loopstart<h4>Blender Source Code:</h4>
	 * <p> keep signed since we need to subtract when getting the previous loop </p>
	 * @see #__DNA__FIELD__totloop
	 */
	
	public void setTotloop(int totloop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, totloop);
		} else {
			__io__block.writeInt(__io__address + 4, totloop);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public short getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(short mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, mat_nr);
		} else {
			__io__block.writeShort(__io__address + 8, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_SMOOTH   = (1 << 0),
	 * 	ME_FACE_SEL = (1 << 1),
	 * //	ME_HIDE     = (1 << 4), 
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10);
		} else {
			return __io__block.readByte(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	ME_SMOOTH   = (1 << 0),
	 * 	ME_FACE_SEL = (1 << 1),
	 * //	ME_HIDE     = (1 << 4), 
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10, flag);
		} else {
			__io__block.writeByte(__io__address + 10, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 11);
		} else {
			return __io__block.readByte(__io__address + 11);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 11, pad);
		} else {
			__io__block.writeByte(__io__address + 11, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MPoly> __io__addressof() {
		return new CPointer<MPoly>(__io__address, new Class[]{MPoly.class}, __io__block, __io__blockTable);
	}

}
