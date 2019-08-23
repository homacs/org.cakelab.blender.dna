package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BlurShaderFxData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=152, size64=176)
public class BlurShaderFxData extends CFacade {

	/**
	 * This is the sdna index of the struct BlurShaderFxData.
	 * <p>
	 * It is required when allocating a new block to store data for BlurShaderFxData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 494;

	/**
	 * Field descriptor (offset) for struct member 'shaderfx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__shaderfx);
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
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__radius);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_radius = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{92, 104};

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
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of samples. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__samples);
	 * CPointer&lt;Integer&gt; p_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samples = new long[]{104, 116};

	/**
	 * Field descriptor (offset) for struct member 'coc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Circle of confusion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__coc);
	 * CPointer&lt;Float&gt; p_coc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coc = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'blur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not visible in rna. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__blur);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_blur = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur = new long[]{112, 124};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{120, 132};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BlurShaderFxData blurshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = blurshaderfxdata.__dna__addressof(BlurShaderFxData.__DNA__FIELD__runtime);
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

	public BlurShaderFxData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BlurShaderFxData(BlurShaderFxData that) {
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
	 * Get method for struct member 'radius'.
	 * @see #__DNA__FIELD__radius
	 */
	
	public CArrayFacade<Integer> getRadius() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(CArrayFacade<Integer> radius) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(radius, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, radius)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, radius);
		} else {
			__io__generic__copy( getRadius(), radius);
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
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 100);
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
			__io__block.writeInt(__io__address + 112, flag);
		} else {
			__io__block.writeInt(__io__address + 100, flag);
		}
	}

	/**
	 * Get method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of samples. </p>
	 * @see #__DNA__FIELD__samples
	 */
	
	public int getSamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of samples. </p>
	 * @see #__DNA__FIELD__samples
	 */
	
	public void setSamples(int samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, samples);
		} else {
			__io__block.writeInt(__io__address + 104, samples);
		}
	}

	/**
	 * Get method for struct member 'coc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Circle of confusion. </p>
	 * @see #__DNA__FIELD__coc
	 */
	
	public float getCoc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'coc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Circle of confusion. </p>
	 * @see #__DNA__FIELD__coc
	 */
	
	public void setCoc(float coc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, coc);
		} else {
			__io__block.writeFloat(__io__address + 108, coc);
		}
	}

	/**
	 * Get method for struct member 'blur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not visible in rna. </p>
	 * @see #__DNA__FIELD__blur
	 */
	
	public CArrayFacade<Integer> getBlur() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not visible in rna. </p>
	 * @see #__DNA__FIELD__blur
	 */
	
	public void setBlur(CArrayFacade<Integer> blur) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(blur, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blur)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blur);
		} else {
			__io__generic__copy( getBlur(), blur);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
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
	public CPointer<BlurShaderFxData> __io__addressof() {
		return new CPointer<BlurShaderFxData>(__io__address, new Class[]{BlurShaderFxData.class}, __io__block, __io__blockTable);
	}

}
