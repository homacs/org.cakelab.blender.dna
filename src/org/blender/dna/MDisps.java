package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MDisps'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=24)
public class MDisps extends CFacade {

	/**
	 * This is the sdna index of the struct MDisps.
	 * <p>
	 * It is required when allocating a new block to store data for MDisps.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 77;

	/**
	 * Field descriptor (offset) for struct member 'totdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strange bug in {@link SDNA} : if disps pointer comes first, it fails to see totdisp </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDisps mdisps = ...;
	 * CPointer&lt;Object&gt; p = mdisps.__dna__addressof(MDisps.__DNA__FIELD__totdisp);
	 * CPointer&lt;Integer&gt; p_totdisp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totdisp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totdisp = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDisps mdisps = ...;
	 * CPointer&lt;Object&gt; p = mdisps.__dna__addressof(MDisps.__DNA__FIELD__level);
	 * CPointer&lt;Integer&gt; p_level = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'hidden'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for hiding parts of a multires mesh. Essentially the multires equivalent of MVert.flag's ME_HIDE bit. NOTE: This is a bitmap, keep in sync with type used in BLI_bitmap.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDisps mdisps = ...;
	 * CPointer&lt;Object&gt; p = mdisps.__dna__addressof(MDisps.__DNA__FIELD__hidden);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_hidden = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hidden'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hidden = new long[]{12, 16};

	public MDisps(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MDisps(MDisps that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'totdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strange bug in {@link SDNA} : if disps pointer comes first, it fails to see totdisp </p>
	 * @see #__DNA__FIELD__totdisp
	 */
	
	public int getTotdisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'totdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strange bug in {@link SDNA} : if disps pointer comes first, it fails to see totdisp </p>
	 * @see #__DNA__FIELD__totdisp
	 */
	
	public void setTotdisp(int totdisp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, totdisp);
		} else {
			__io__block.writeInt(__io__address + 0, totdisp);
		}
	}

	/**
	 * Get method for struct member 'level'.
	 * @see #__DNA__FIELD__level
	 */
	
	public int getLevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'level'.
	 * @see #__DNA__FIELD__level
	 */
	
	public void setLevel(int level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, level);
		} else {
			__io__block.writeInt(__io__address + 4, level);
		}
	}

	/**
	 * Get method for struct member 'hidden'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for hiding parts of a multires mesh. Essentially the multires equivalent of MVert.flag's ME_HIDE bit. NOTE: This is a bitmap, keep in sync with type used in BLI_bitmap.h </p>
	 * @see #__DNA__FIELD__hidden
	 */
	
	public CPointer<Integer> getHidden() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'hidden'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for hiding parts of a multires mesh. Essentially the multires equivalent of MVert.flag's ME_HIDE bit. NOTE: This is a bitmap, keep in sync with type used in BLI_bitmap.h </p>
	 * @see #__DNA__FIELD__hidden
	 */
	
	public void setHidden(CPointer<Integer> hidden) throws IOException
	{
		long __address = ((hidden == null) ? 0 : hidden.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MDisps> __io__addressof() {
		return new CPointer<MDisps>(__io__address, new Class[]{MDisps.class}, __io__block, __io__blockTable);
	}

}
