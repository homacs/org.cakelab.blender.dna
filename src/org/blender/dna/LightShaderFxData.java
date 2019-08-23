package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LightShaderFxData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=156, size64=184)
public class LightShaderFxData extends CFacade {

	/**
	 * This is the sdna index of the struct LightShaderFxData.
	 * <p>
	 * It is required when allocating a new block to store data for LightShaderFxData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 498;

	/**
	 * Field descriptor (offset) for struct member 'shaderfx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__shaderfx);
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
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{92, 104};

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
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'energy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__energy);
	 * CPointer&lt;Float&gt; p_energy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'energy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__energy = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'ambient'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__ambient);
	 * CPointer&lt;Float&gt; p_ambient = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambient'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambient = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal, not visible in rna. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{124, 140};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightShaderFxData lightshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = lightshaderfxdata.__dna__addressof(LightShaderFxData.__DNA__FIELD__runtime);
	 * CPointer&lt;ShaderFxData_Runtime&gt; p_runtime = p.cast(new Class[]{ShaderFxData_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ShaderFxData_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{128, 144};

	public LightShaderFxData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightShaderFxData(LightShaderFxData that) {
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
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
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
			return __io__block.readInt(__io__address + 96);
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
			__io__block.writeInt(__io__address + 96, flag);
		}
	}

	/**
	 * Get method for struct member 'energy'.
	 * @see #__DNA__FIELD__energy
	 */
	
	public float getEnergy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'energy'.
	 * @see #__DNA__FIELD__energy
	 */
	
	public void setEnergy(float energy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, energy);
		} else {
			__io__block.writeFloat(__io__address + 100, energy);
		}
	}

	/**
	 * Get method for struct member 'ambient'.
	 * @see #__DNA__FIELD__ambient
	 */
	
	public float getAmbient() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'ambient'.
	 * @see #__DNA__FIELD__ambient
	 */
	
	public void setAmbient(float ambient) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, ambient);
		} else {
			__io__block.writeFloat(__io__address + 104, ambient);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal, not visible in rna. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Internal, not visible in rna. </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
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
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 140;
		} else {
			__dna__offset = 124;
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
			return new ShaderFxData_Runtime(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData_Runtime(__io__address + 128, __io__block, __io__blockTable);
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
			__dna__offset = 144;
		} else {
			__dna__offset = 128;
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
	public CPointer<LightShaderFxData> __io__addressof() {
		return new CPointer<LightShaderFxData>(__io__address, new Class[]{LightShaderFxData.class}, __io__block, __io__blockTable);
	}

}
