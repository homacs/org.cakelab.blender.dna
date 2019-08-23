package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LightCacheTexture'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> These are used as ubo data. They need to be aligned to size of vec4. ---<mdash/>  Eevee Lightcache ----<mdash/>  </p>
 */

@CMetaData(size32=24, size64=32)
public class LightCacheTexture extends CFacade {

	/**
	 * This is the sdna index of the struct LightCacheTexture.
	 * <p>
	 * It is required when allocating a new block to store data for LightCacheTexture.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 643;

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD__tex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copy of GPU datas to create GPUTextures on file read. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'tex_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD__tex_size);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_tex_size = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_size'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_size = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD__data_type);
	 * CPointer&lt;Byte&gt; p_data_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'components'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD__components);
	 * CPointer&lt;Byte&gt; p_components = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'components'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__components = new long[]{21, 29};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCacheTexture lightcachetexture = ...;
	 * CPointer&lt;Object&gt; p = lightcachetexture.__dna__addressof(LightCacheTexture.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{22, 30};

	public LightCacheTexture(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightCacheTexture(LightCacheTexture that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Object> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Object> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copy of GPU datas to create GPUTextures on file read. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Byte> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copy of GPU datas to create GPUTextures on file read. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Byte> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_size'.
	 * @see #__DNA__FIELD__tex_size
	 */
	
	public CArrayFacade<Integer> getTex_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tex_size'.
	 * @see #__DNA__FIELD__tex_size
	 */
	
	public void setTex_size(CArrayFacade<Integer> tex_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(tex_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tex_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tex_size);
		} else {
			__io__generic__copy( getTex_size(), tex_size);
		}
	}

	/**
	 * Get method for struct member 'data_type'.
	 * @see #__DNA__FIELD__data_type
	 */
	
	public byte getData_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 28);
		} else {
			return __io__block.readByte(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'data_type'.
	 * @see #__DNA__FIELD__data_type
	 */
	
	public void setData_type(byte data_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 28, data_type);
		} else {
			__io__block.writeByte(__io__address + 20, data_type);
		}
	}

	/**
	 * Get method for struct member 'components'.
	 * @see #__DNA__FIELD__components
	 */
	
	public byte getComponents() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 29);
		} else {
			return __io__block.readByte(__io__address + 21);
		}
	}

	/**
	 * Set method for struct member 'components'.
	 * @see #__DNA__FIELD__components
	 */
	
	public void setComponents(byte components) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 29, components);
		} else {
			__io__block.writeByte(__io__address + 21, components);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 30, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 30;
		} else {
			__dna__offset = 22;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LightCacheTexture> __io__addressof() {
		return new CPointer<LightCacheTexture>(__io__address, new Class[]{LightCacheTexture.class}, __io__block, __io__blockTable);
	}

}
