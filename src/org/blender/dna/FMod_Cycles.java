package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FMod_Cycles'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> TODO: we can only do complete cycles... </p><p> cycling/repetition modifier data </p>
 */

@CMetaData(size32=8, size64=8)
public class FMod_Cycles extends CFacade {

	/**
	 * This is the sdna index of the struct FMod_Cycles.
	 * <p>
	 * It is required when allocating a new block to store data for FMod_Cycles.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 507;

	/**
	 * Field descriptor (offset) for struct member 'before_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use before first keyframe </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_Cycles fmod_cycles = ...;
	 * CPointer&lt;Object&gt; p = fmod_cycles.__dna__addressof(FMod_Cycles.__DNA__FIELD__before_mode);
	 * CPointer&lt;Short&gt; p_before_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'before_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__before_mode = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'after_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use after last keyframe </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_Cycles fmod_cycles = ...;
	 * CPointer&lt;Object&gt; p = fmod_cycles.__dna__addressof(FMod_Cycles.__DNA__FIELD__after_mode);
	 * CPointer&lt;Short&gt; p_after_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'after_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__after_mode = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'before_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' before first keyframe to do </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_Cycles fmod_cycles = ...;
	 * CPointer&lt;Object&gt; p = fmod_cycles.__dna__addressof(FMod_Cycles.__DNA__FIELD__before_cycles);
	 * CPointer&lt;Short&gt; p_before_cycles = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'before_cycles'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__before_cycles = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'after_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' after last keyframe to do </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_Cycles fmod_cycles = ...;
	 * CPointer&lt;Object&gt; p = fmod_cycles.__dna__addressof(FMod_Cycles.__DNA__FIELD__after_cycles);
	 * CPointer&lt;Short&gt; p_after_cycles = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'after_cycles'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__after_cycles = new long[]{6, 6};

	public FMod_Cycles(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FMod_Cycles(FMod_Cycles that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'before_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use before first keyframe </p>
	 * @see #__DNA__FIELD__before_mode
	 */
	
	public short getBefore_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'before_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use before first keyframe </p>
	 * @see #__DNA__FIELD__before_mode
	 */
	
	public void setBefore_mode(short before_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, before_mode);
		} else {
			__io__block.writeShort(__io__address + 0, before_mode);
		}
	}

	/**
	 * Get method for struct member 'after_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use after last keyframe </p>
	 * @see #__DNA__FIELD__after_mode
	 */
	
	public short getAfter_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'after_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extrapolation mode to use after last keyframe </p>
	 * @see #__DNA__FIELD__after_mode
	 */
	
	public void setAfter_mode(short after_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, after_mode);
		} else {
			__io__block.writeShort(__io__address + 2, after_mode);
		}
	}

	/**
	 * Get method for struct member 'before_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' before first keyframe to do </p>
	 * @see #__DNA__FIELD__before_cycles
	 */
	
	public short getBefore_cycles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'before_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' before first keyframe to do </p>
	 * @see #__DNA__FIELD__before_cycles
	 */
	
	public void setBefore_cycles(short before_cycles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, before_cycles);
		} else {
			__io__block.writeShort(__io__address + 4, before_cycles);
		}
	}

	/**
	 * Get method for struct member 'after_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' after last keyframe to do </p>
	 * @see #__DNA__FIELD__after_cycles
	 */
	
	public short getAfter_cycles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'after_cycles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of 'cycles' after last keyframe to do </p>
	 * @see #__DNA__FIELD__after_cycles
	 */
	
	public void setAfter_cycles(short after_cycles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, after_cycles);
		} else {
			__io__block.writeShort(__io__address + 6, after_cycles);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FMod_Cycles> __io__addressof() {
		return new CPointer<FMod_Cycles>(__io__address, new Class[]{FMod_Cycles.class}, __io__block, __io__blockTable);
	}

}
