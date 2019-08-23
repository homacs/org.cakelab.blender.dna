package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FMod_FunctionGenerator'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> 'Built-In Function' Generator modifier data</p><p> This uses the general equation for equations: y = amplitude * fn(phase_multiplier*x + phase_offset) + y_offset</p><p> where amplitude, phase_multiplier/offset, y_offset are user-defined coefficients, x is the evaluation 'time', and 'y' is the resultant value </p>
 */

@CMetaData(size32=24, size64=24)
public class FMod_FunctionGenerator extends CFacade {

	/**
	 * This is the sdna index of the struct FMod_FunctionGenerator.
	 * <p>
	 * It is required when allocating a new block to store data for FMod_FunctionGenerator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 508;

	/**
	 * Field descriptor (offset) for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coefficients for general equation (as above) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__amplitude);
	 * CPointer&lt;Float&gt; p_amplitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amplitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amplitude = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'phase_multiplier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__phase_multiplier);
	 * CPointer&lt;Float&gt; p_phase_multiplier = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'phase_multiplier'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__phase_multiplier = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'phase_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__phase_offset);
	 * CPointer&lt;Float&gt; p_phase_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'phase_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__phase_offset = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'value_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__value_offset);
	 * CPointer&lt;Float&gt; p_value_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_offset = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags eFMod_Generator_Functions </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFMod_Generator_flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FMod_FunctionGenerator fmod_functiongenerator = ...;
	 * CPointer&lt;Object&gt; p = fmod_functiongenerator.__dna__addressof(FMod_FunctionGenerator.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 20};

	public FMod_FunctionGenerator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FMod_FunctionGenerator(FMod_FunctionGenerator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coefficients for general equation (as above) </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public float getAmplitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coefficients for general equation (as above) </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public void setAmplitude(float amplitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, amplitude);
		} else {
			__io__block.writeFloat(__io__address + 0, amplitude);
		}
	}

	/**
	 * Get method for struct member 'phase_multiplier'.
	 * @see #__DNA__FIELD__phase_multiplier
	 */
	
	public float getPhase_multiplier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'phase_multiplier'.
	 * @see #__DNA__FIELD__phase_multiplier
	 */
	
	public void setPhase_multiplier(float phase_multiplier) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, phase_multiplier);
		} else {
			__io__block.writeFloat(__io__address + 4, phase_multiplier);
		}
	}

	/**
	 * Get method for struct member 'phase_offset'.
	 * @see #__DNA__FIELD__phase_offset
	 */
	
	public float getPhase_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'phase_offset'.
	 * @see #__DNA__FIELD__phase_offset
	 */
	
	public void setPhase_offset(float phase_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, phase_offset);
		} else {
			__io__block.writeFloat(__io__address + 8, phase_offset);
		}
	}

	/**
	 * Get method for struct member 'value_offset'.
	 * @see #__DNA__FIELD__value_offset
	 */
	
	public float getValue_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'value_offset'.
	 * @see #__DNA__FIELD__value_offset
	 */
	
	public void setValue_offset(float value_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, value_offset);
		} else {
			__io__block.writeFloat(__io__address + 12, value_offset);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags eFMod_Generator_Functions </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags eFMod_Generator_Functions </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, type);
		} else {
			__io__block.writeInt(__io__address + 16, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFMod_Generator_flags </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFMod_Generator_flags </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, flag);
		} else {
			__io__block.writeInt(__io__address + 20, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FMod_FunctionGenerator> __io__addressof() {
		return new CPointer<FMod_FunctionGenerator>(__io__address, new Class[]{FMod_FunctionGenerator.class}, __io__block, __io__blockTable);
	}

}
