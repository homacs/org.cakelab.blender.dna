package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bMinMaxConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Floor Constraint </p>
 */

@CMetaData(size32=84, size64=88)
public class bMinMaxConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bMinMaxConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bMinMaxConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 339;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD__tar);
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
	 * Field descriptor (offset) for struct member 'minmaxflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD__minmaxflag);
	 * CPointer&lt;Integer&gt; p_minmaxflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minmaxflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minmaxflag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMinMaxConstraint bminmaxconstraint = ...;
	 * CPointer&lt;Object&gt; p = bminmaxconstraint.__dna__addressof(bMinMaxConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;Integer&gt; p__pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{80, 84};

	public bMinMaxConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bMinMaxConstraint(bMinMaxConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
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
	 * Get method for struct member 'minmaxflag'.
	 * @see #__DNA__FIELD__minmaxflag
	 */
	
	public int getMinmaxflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'minmaxflag'.
	 * @see #__DNA__FIELD__minmaxflag
	 */
	
	public void setMinmaxflag(int minmaxflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, minmaxflag);
		} else {
			__io__block.writeInt(__io__address + 4, minmaxflag);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, offset);
		} else {
			__io__block.writeFloat(__io__address + 8, offset);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, flag);
		} else {
			__io__block.writeInt(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public int get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(int _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, _pad);
		} else {
			__io__block.writeInt(__io__address + 80, _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bMinMaxConstraint> __io__addressof() {
		return new CPointer<bMinMaxConstraint>(__io__address, new Class[]{bMinMaxConstraint.class}, __io__block, __io__blockTable);
	}

}
