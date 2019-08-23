package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PixelShaderFxData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=152, size64=176)
public class PixelShaderFxData extends CFacade {

	/**
	 * This is the sdna index of the struct PixelShaderFxData.
	 * <p>
	 * It is required when allocating a new block to store data for PixelShaderFxData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 499;

	/**
	 * Field descriptor (offset) for struct member 'shaderfx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PixelShaderFxData pixelshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = pixelshaderfxdata.__dna__addressof(PixelShaderFxData.__DNA__FIELD__shaderfx);
	 * CPointer&lt;ShaderFxData&gt; p_shaderfx = p.cast(new Class[]{ShaderFxData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shaderfx'</li>
	 * <li>Signature: 'ShaderFxData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shaderfx = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last element used for shader only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PixelShaderFxData pixelshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = pixelshaderfxdata.__dna__addressof(PixelShaderFxData.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PixelShaderFxData pixelshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = pixelshaderfxdata.__dna__addressof(PixelShaderFxData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{104, 116};

	/**
	 * Field descriptor (offset) for struct member 'rgba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PixelShaderFxData pixelshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = pixelshaderfxdata.__dna__addressof(PixelShaderFxData.__DNA__FIELD__rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgba = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PixelShaderFxData pixelshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = pixelshaderfxdata.__dna__addressof(PixelShaderFxData.__DNA__FIELD__runtime);
	 * CPointer&lt;ShaderFxData_Runtime&gt; p_runtime = p.cast(new Class[]{ShaderFxData_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ShaderFxData_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{124, 136};

	public PixelShaderFxData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PixelShaderFxData(PixelShaderFxData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'shaderfx'.
	 * @see #__DNA__FIELD__shaderfx
	 */
	
	public ShaderFxData getShaderfx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ShaderFxData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shaderfx'.
	 * @see #__DNA__FIELD__shaderfx
	 */
	
	public void setShaderfx(ShaderFxData shaderfx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(shaderfx, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shaderfx)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shaderfx);
		} else {
			__io__generic__copy( getShaderfx(), shaderfx);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last element used for shader only. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Integer> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last element used for shader only. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Integer> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, flag);
		} else {
			__io__block.writeInt(__io__address + 104, flag);
		}
	}

	/**
	 * Get method for struct member 'rgba'.
	 * @see #__DNA__FIELD__rgba
	 */
	
	public CArrayFacade<Float> getRgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rgba'.
	 * @see #__DNA__FIELD__rgba
	 */
	
	public void setRgba(CArrayFacade<Float> rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rgba);
		} else {
			__io__generic__copy( getRgba(), rgba);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public ShaderFxData_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ShaderFxData_Runtime(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData_Runtime(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(ShaderFxData_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PixelShaderFxData> __io__addressof() {
		return new CPointer<PixelShaderFxData>(__io__address, new Class[]{PixelShaderFxData.class}, __io__block, __io__blockTable);
	}

}
