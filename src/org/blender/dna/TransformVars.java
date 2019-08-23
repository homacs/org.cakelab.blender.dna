package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TransformVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class TransformVars extends CFacade {

	/**
	 * This is the sdna index of the struct TransformVars.
	 * <p>
	 * It is required when allocating a new block to store data for TransformVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 277;

	/**
	 * Field descriptor (offset) for struct member 'ScalexIni'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__ScalexIni);
	 * CPointer&lt;Float&gt; p_ScalexIni = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ScalexIni'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ScalexIni = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ScaleyIni'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__ScaleyIni);
	 * CPointer&lt;Float&gt; p_ScaleyIni = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ScaleyIni'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ScaleyIni = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'xIni'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__xIni);
	 * CPointer&lt;Float&gt; p_xIni = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xIni'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xIni = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'yIni'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__yIni);
	 * CPointer&lt;Float&gt; p_yIni = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yIni'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yIni = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rotIni'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__rotIni);
	 * CPointer&lt;Float&gt; p_rotIni = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotIni'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotIni = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'percent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__percent);
	 * CPointer&lt;Integer&gt; p_percent = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'percent'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__percent = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'interpolation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__interpolation);
	 * CPointer&lt;Integer&gt; p_interpolation = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'uniform_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> preserve aspect/ratio when scaling </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformVars transformvars = ...;
	 * CPointer&lt;Object&gt; p = transformvars.__dna__addressof(TransformVars.__DNA__FIELD__uniform_scale);
	 * CPointer&lt;Integer&gt; p_uniform_scale = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uniform_scale'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uniform_scale = new long[]{28, 28};

	public TransformVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TransformVars(TransformVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ScalexIni'.
	 * @see #__DNA__FIELD__ScalexIni
	 */
	
	public float getScalexIni() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'ScalexIni'.
	 * @see #__DNA__FIELD__ScalexIni
	 */
	
	public void setScalexIni(float ScalexIni) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, ScalexIni);
		} else {
			__io__block.writeFloat(__io__address + 0, ScalexIni);
		}
	}

	/**
	 * Get method for struct member 'ScaleyIni'.
	 * @see #__DNA__FIELD__ScaleyIni
	 */
	
	public float getScaleyIni() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'ScaleyIni'.
	 * @see #__DNA__FIELD__ScaleyIni
	 */
	
	public void setScaleyIni(float ScaleyIni) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, ScaleyIni);
		} else {
			__io__block.writeFloat(__io__address + 4, ScaleyIni);
		}
	}

	/**
	 * Get method for struct member 'xIni'.
	 * @see #__DNA__FIELD__xIni
	 */
	
	public float getXIni() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'xIni'.
	 * @see #__DNA__FIELD__xIni
	 */
	
	public void setXIni(float xIni) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, xIni);
		} else {
			__io__block.writeFloat(__io__address + 8, xIni);
		}
	}

	/**
	 * Get method for struct member 'yIni'.
	 * @see #__DNA__FIELD__yIni
	 */
	
	public float getYIni() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'yIni'.
	 * @see #__DNA__FIELD__yIni
	 */
	
	public void setYIni(float yIni) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, yIni);
		} else {
			__io__block.writeFloat(__io__address + 12, yIni);
		}
	}

	/**
	 * Get method for struct member 'rotIni'.
	 * @see #__DNA__FIELD__rotIni
	 */
	
	public float getRotIni() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'rotIni'.
	 * @see #__DNA__FIELD__rotIni
	 */
	
	public void setRotIni(float rotIni) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, rotIni);
		} else {
			__io__block.writeFloat(__io__address + 16, rotIni);
		}
	}

	/**
	 * Get method for struct member 'percent'.
	 * @see #__DNA__FIELD__percent
	 */
	
	public int getPercent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'percent'.
	 * @see #__DNA__FIELD__percent
	 */
	
	public void setPercent(int percent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, percent);
		} else {
			__io__block.writeInt(__io__address + 20, percent);
		}
	}

	/**
	 * Get method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public int getInterpolation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public void setInterpolation(int interpolation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, interpolation);
		} else {
			__io__block.writeInt(__io__address + 24, interpolation);
		}
	}

	/**
	 * Get method for struct member 'uniform_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> preserve aspect/ratio when scaling </p>
	 * @see #__DNA__FIELD__uniform_scale
	 */
	
	public int getUniform_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'uniform_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> preserve aspect/ratio when scaling </p>
	 * @see #__DNA__FIELD__uniform_scale
	 */
	
	public void setUniform_scale(int uniform_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, uniform_scale);
		} else {
			__io__block.writeInt(__io__address + 28, uniform_scale);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TransformVars> __io__addressof() {
		return new CPointer<TransformVars>(__io__address, new Class[]{TransformVars.class}, __io__block, __io__blockTable);
	}

}
