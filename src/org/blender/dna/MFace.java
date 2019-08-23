package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MFace'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> tessellation face, see MLoop/MPoly for the real face data </p>
 */

@CMetaData(size32=20, size64=20)
public class MFace extends CFacade {

	/**
	 * This is the sdna index of the struct MFace.
	 * <p>
	 * It is required when allocating a new block to store data for MFace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 59;

	/**
	 * Field descriptor (offset) for struct member 'v1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__v1);
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
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__v2);
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
	 * Field descriptor (offset) for struct member 'v3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__v3);
	 * CPointer&lt;Integer&gt; p_v3 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v3'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v3 = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'v4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__v4);
	 * CPointer&lt;Integer&gt; p_v4 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v4'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v4 = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Short&gt; p_mat_nr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'edcode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__edcode);
	 * CPointer&lt;Byte&gt; p_edcode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edcode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edcode = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> we keep edcode, for conversion to edges draw flags in old files </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFace mface = ...;
	 * CPointer&lt;Object&gt; p = mface.__dna__addressof(MFace.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{19, 19};

	public MFace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MFace(MFace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v1'.
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
	 * Get method for struct member 'v3'.
	 * @see #__DNA__FIELD__v3
	 */
	
	public int getV3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'v3'.
	 * @see #__DNA__FIELD__v3
	 */
	
	public void setV3(int v3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, v3);
		} else {
			__io__block.writeInt(__io__address + 8, v3);
		}
	}

	/**
	 * Get method for struct member 'v4'.
	 * @see #__DNA__FIELD__v4
	 */
	
	public int getV4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'v4'.
	 * @see #__DNA__FIELD__v4
	 */
	
	public void setV4(int v4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, v4);
		} else {
			__io__block.writeInt(__io__address + 12, v4);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public short getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(short mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, mat_nr);
		} else {
			__io__block.writeShort(__io__address + 16, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'edcode'.
	 * @see #__DNA__FIELD__edcode
	 */
	
	public byte getEdcode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 18);
		} else {
			return __io__block.readByte(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'edcode'.
	 * @see #__DNA__FIELD__edcode
	 */
	
	public void setEdcode(byte edcode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 18, edcode);
		} else {
			__io__block.writeByte(__io__address + 18, edcode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> we keep edcode, for conversion to edges draw flags in old files </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 19);
		} else {
			return __io__block.readByte(__io__address + 19);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> we keep edcode, for conversion to edges draw flags in old files </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 19, flag);
		} else {
			__io__block.writeByte(__io__address + 19, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MFace> __io__addressof() {
		return new CPointer<MFace>(__io__address, new Class[]{MFace.class}, __io__block, __io__blockTable);
	}

}
