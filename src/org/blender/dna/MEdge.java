package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MEdge'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * An edge defined by two vertices v1 and v2. Vertex order does not tell which side is front facing. @see {@link MLoop}, {@link MVert}
 */

@CMetaData(size32=12, size64=12)
public class MEdge extends CFacade {

	/**
	 * This is the sdna index of the struct MEdge.
	 * <p>
	 * It is required when allocating a new block to store data for MEdge.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 66;

	/**
	 * Field descriptor (offset) for struct member 'v1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * First vertex of the edge (index in vertex array).
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MEdge medge = ...;
	 * CPointer&lt;Object&gt; p = medge.__dna__addressof(MEdge.__DNA__FIELD__v1);
	 * CPointer&lt;Integer&gt; p_v1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v1 = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'v2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Second vertex of the edge (index in vertex array).
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MEdge medge = ...;
	 * CPointer&lt;Object&gt; p = medge.__dna__addressof(MEdge.__DNA__FIELD__v2);
	 * CPointer&lt;Integer&gt; p_v2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'crease'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MEdge medge = ...;
	 * CPointer&lt;Object&gt; p = medge.__dna__addressof(MEdge.__DNA__FIELD__crease);
	 * CPointer&lt;Byte&gt; p_crease = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crease'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crease = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'bweight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MEdge medge = ...;
	 * CPointer&lt;Object&gt; p = medge.__dna__addressof(MEdge.__DNA__FIELD__bweight);
	 * CPointer&lt;Byte&gt; p_bweight = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bweight'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bweight = new long[]{9, 9};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * //	SELECT              = (1 << 0), 
	 * 	ME_EDGEDRAW         = (1 << 1),
	 * 	ME_SEAM             = (1 << 2),
	 * //	ME_HIDE             = (1 << 4), 
	 * 	ME_EDGERENDER       = (1 << 5),
	 * 	ME_LOOSEEDGE        = (1 << 7),
	 * 	ME_EDGE_TMP_TAG     = (1 << 8),
	 * 	ME_SHARP            = (1 << 9),
	 * 				</pre>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MEdge medge = ...;
	 * CPointer&lt;Object&gt; p = medge.__dna__addressof(MEdge.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 10};

	public MEdge(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MEdge(MEdge that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * First vertex of the edge (index in vertex array).
	 * @see #__DNA__FIELD__v1
	 */
	
	public int getV1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'v1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * First vertex of the edge (index in vertex array).
	 * @see #__DNA__FIELD__v1
	 */
	
	public void setV1(int v1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, v1);
		} else {
			__io__block.writeInt(__io__address + 0, v1);
		}
	}

	/**
	 * Get method for struct member 'v2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Second vertex of the edge (index in vertex array).
	 * @see #__DNA__FIELD__v2
	 */
	
	public int getV2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'v2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Second vertex of the edge (index in vertex array).
	 * @see #__DNA__FIELD__v2
	 */
	
	public void setV2(int v2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, v2);
		} else {
			__io__block.writeInt(__io__address + 4, v2);
		}
	}

	/**
	 * Get method for struct member 'crease'.
	 * @see #__DNA__FIELD__crease
	 */
	
	public byte getCrease() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'crease'.
	 * @see #__DNA__FIELD__crease
	 */
	
	public void setCrease(byte crease) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, crease);
		} else {
			__io__block.writeByte(__io__address + 8, crease);
		}
	}

	/**
	 * Get method for struct member 'bweight'.
	 * @see #__DNA__FIELD__bweight
	 */
	
	public byte getBweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'bweight'.
	 * @see #__DNA__FIELD__bweight
	 */
	
	public void setBweight(byte bweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, bweight);
		} else {
			__io__block.writeByte(__io__address + 9, bweight);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * //	SELECT              = (1 << 0), 
	 * 	ME_EDGEDRAW         = (1 << 1),
	 * 	ME_SEAM             = (1 << 2),
	 * //	ME_HIDE             = (1 << 4), 
	 * 	ME_EDGERENDER       = (1 << 5),
	 * 	ME_LOOSEEDGE        = (1 << 7),
	 * 	ME_EDGE_TMP_TAG     = (1 << 8),
	 * 	ME_SHARP            = (1 << 9),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values</h3>
	 * 				<pre>
	 * //	SELECT              = (1 << 0), 
	 * 	ME_EDGEDRAW         = (1 << 1),
	 * 	ME_SEAM             = (1 << 2),
	 * //	ME_HIDE             = (1 << 4), 
	 * 	ME_EDGERENDER       = (1 << 5),
	 * 	ME_LOOSEEDGE        = (1 << 7),
	 * 	ME_EDGE_TMP_TAG     = (1 << 8),
	 * 	ME_SHARP            = (1 << 9),
	 * 				</pre>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, flag);
		} else {
			__io__block.writeShort(__io__address + 10, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MEdge> __io__addressof() {
		return new CPointer<MEdge>(__io__address, new Class[]{MEdge.class}, __io__block, __io__blockTable);
	}

}
