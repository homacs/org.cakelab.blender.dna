package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bFollowPathConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Follow {@link Path}  constraints </p>
 */

@CMetaData(size32=20, size64=24)
public class bFollowPathConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bFollowPathConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bFollowPathConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 343;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Must be path object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset in time on the path (in frames), when NOT using 'fixed position'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parametric offset factor defining position along path, when using 'fixed position'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__offset_fac);
	 * CPointer&lt;Float&gt; p_offset_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_fac = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'followflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__followflag);
	 * CPointer&lt;Integer&gt; p_followflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'followflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__followflag = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'trackflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__trackflag);
	 * CPointer&lt;Short&gt; p_trackflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'trackflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__trackflag = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'upflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bFollowPathConstraint bfollowpathconstraint = ...;
	 * CPointer&lt;Object&gt; p = bfollowpathconstraint.__dna__addressof(bFollowPathConstraint.__DNA__FIELD__upflag);
	 * CPointer&lt;Short&gt; p_upflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'upflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__upflag = new long[]{18, 22};

	public bFollowPathConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bFollowPathConstraint(bFollowPathConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Must be path object. </p>
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Must be path object. </p>
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset in time on the path (in frames), when NOT using 'fixed position'. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset in time on the path (in frames), when NOT using 'fixed position'. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, offset);
		} else {
			__io__block.writeFloat(__io__address + 4, offset);
		}
	}

	/**
	 * Get method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parametric offset factor defining position along path, when using 'fixed position'. </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public float getOffset_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'offset_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parametric offset factor defining position along path, when using 'fixed position'. </p>
	 * @see #__DNA__FIELD__offset_fac
	 */
	
	public void setOffset_fac(float offset_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, offset_fac);
		} else {
			__io__block.writeFloat(__io__address + 8, offset_fac);
		}
	}

	/**
	 * Get method for struct member 'followflag'.
	 * @see #__DNA__FIELD__followflag
	 */
	
	public int getFollowflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'followflag'.
	 * @see #__DNA__FIELD__followflag
	 */
	
	public void setFollowflag(int followflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, followflag);
		} else {
			__io__block.writeInt(__io__address + 12, followflag);
		}
	}

	/**
	 * Get method for struct member 'trackflag'.
	 * @see #__DNA__FIELD__trackflag
	 */
	
	public short getTrackflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'trackflag'.
	 * @see #__DNA__FIELD__trackflag
	 */
	
	public void setTrackflag(short trackflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, trackflag);
		} else {
			__io__block.writeShort(__io__address + 16, trackflag);
		}
	}

	/**
	 * Get method for struct member 'upflag'.
	 * @see #__DNA__FIELD__upflag
	 */
	
	public short getUpflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'upflag'.
	 * @see #__DNA__FIELD__upflag
	 */
	
	public void setUpflag(short upflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, upflag);
		} else {
			__io__block.writeShort(__io__address + 18, upflag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bFollowPathConstraint> __io__addressof() {
		return new CPointer<bFollowPathConstraint>(__io__address, new Class[]{bFollowPathConstraint.class}, __io__block, __io__blockTable);
	}

}
