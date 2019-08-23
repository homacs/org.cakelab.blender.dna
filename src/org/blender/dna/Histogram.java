package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Histogram'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=5160, size64=5160)
public class Histogram extends CFacade {

	/**
	 * This is the sdna index of the struct Histogram.
	 * <p>
	 * It is required when allocating a new block to store data for Histogram.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 458;

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__channels);
	 * CPointer&lt;Integer&gt; p_channels = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'x_resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__x_resolution);
	 * CPointer&lt;Integer&gt; p_x_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x_resolution = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'data_luma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__data_luma);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_data_luma = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_luma'</li>
	 * <li>Signature: 'float[256]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_luma = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'data_r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__data_r);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_data_r = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_r'</li>
	 * <li>Signature: 'float[256]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_r = new long[]{1032, 1032};

	/**
	 * Field descriptor (offset) for struct member 'data_g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__data_g);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_data_g = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_g'</li>
	 * <li>Signature: 'float[256]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_g = new long[]{2056, 2056};

	/**
	 * Field descriptor (offset) for struct member 'data_b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__data_b);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_data_b = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_b'</li>
	 * <li>Signature: 'float[256]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_b = new long[]{3080, 3080};

	/**
	 * Field descriptor (offset) for struct member 'data_a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__data_a);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_data_a = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_a'</li>
	 * <li>Signature: 'float[256]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_a = new long[]{4104, 4104};

	/**
	 * Field descriptor (offset) for struct member 'xmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__xmax);
	 * CPointer&lt;Float&gt; p_xmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xmax = new long[]{5128, 5128};

	/**
	 * Field descriptor (offset) for struct member 'ymax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__ymax);
	 * CPointer&lt;Float&gt; p_ymax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymax = new long[]{5132, 5132};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Channels to display when drawing the histogram
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{5136, 5136};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{5138, 5138};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__height);
	 * CPointer&lt;Integer&gt; p_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{5140, 5140};

	/**
	 * Field descriptor (offset) for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample line only image coords src -> dst </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Histogram histogram = ...;
	 * CPointer&lt;Object&gt; p = histogram.__dna__addressof(Histogram.__DNA__FIELD__co);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_co = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'co'</li>
	 * <li>Signature: 'float[2][2]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__co = new long[]{5144, 5144};

	public Histogram(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Histogram(Histogram that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public int getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(int channels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, channels);
		} else {
			__io__block.writeInt(__io__address + 0, channels);
		}
	}

	/**
	 * Get method for struct member 'x_resolution'.
	 * @see #__DNA__FIELD__x_resolution
	 */
	
	public int getX_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'x_resolution'.
	 * @see #__DNA__FIELD__x_resolution
	 */
	
	public void setX_resolution(int x_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, x_resolution);
		} else {
			__io__block.writeInt(__io__address + 4, x_resolution);
		}
	}

	/**
	 * Get method for struct member 'data_luma'.
	 * @see #__DNA__FIELD__data_luma
	 */
	
	public CArrayFacade<Float> getData_luma() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data_luma'.
	 * @see #__DNA__FIELD__data_luma
	 */
	
	public void setData_luma(CArrayFacade<Float> data_luma) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(data_luma, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data_luma)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data_luma);
		} else {
			__io__generic__copy( getData_luma(), data_luma);
		}
	}

	/**
	 * Get method for struct member 'data_r'.
	 * @see #__DNA__FIELD__data_r
	 */
	
	public CArrayFacade<Float> getData_r() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1032, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1032, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data_r'.
	 * @see #__DNA__FIELD__data_r
	 */
	
	public void setData_r(CArrayFacade<Float> data_r) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1032;
		} else {
			__dna__offset = 1032;
		}
		if (__io__equals(data_r, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data_r)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data_r);
		} else {
			__io__generic__copy( getData_r(), data_r);
		}
	}

	/**
	 * Get method for struct member 'data_g'.
	 * @see #__DNA__FIELD__data_g
	 */
	
	public CArrayFacade<Float> getData_g() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 2056, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 2056, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data_g'.
	 * @see #__DNA__FIELD__data_g
	 */
	
	public void setData_g(CArrayFacade<Float> data_g) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2056;
		} else {
			__dna__offset = 2056;
		}
		if (__io__equals(data_g, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data_g)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data_g);
		} else {
			__io__generic__copy( getData_g(), data_g);
		}
	}

	/**
	 * Get method for struct member 'data_b'.
	 * @see #__DNA__FIELD__data_b
	 */
	
	public CArrayFacade<Float> getData_b() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 3080, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 3080, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data_b'.
	 * @see #__DNA__FIELD__data_b
	 */
	
	public void setData_b(CArrayFacade<Float> data_b) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3080;
		} else {
			__dna__offset = 3080;
		}
		if (__io__equals(data_b, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data_b)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data_b);
		} else {
			__io__generic__copy( getData_b(), data_b);
		}
	}

	/**
	 * Get method for struct member 'data_a'.
	 * @see #__DNA__FIELD__data_a
	 */
	
	public CArrayFacade<Float> getData_a() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 4104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 4104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data_a'.
	 * @see #__DNA__FIELD__data_a
	 */
	
	public void setData_a(CArrayFacade<Float> data_a) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4104;
		} else {
			__dna__offset = 4104;
		}
		if (__io__equals(data_a, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data_a)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data_a);
		} else {
			__io__generic__copy( getData_a(), data_a);
		}
	}

	/**
	 * Get method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public float getXmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 5128);
		} else {
			return __io__block.readFloat(__io__address + 5128);
		}
	}

	/**
	 * Set method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public void setXmax(float xmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 5128, xmax);
		} else {
			__io__block.writeFloat(__io__address + 5128, xmax);
		}
	}

	/**
	 * Get method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public float getYmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 5132);
		} else {
			return __io__block.readFloat(__io__address + 5132);
		}
	}

	/**
	 * Set method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public void setYmax(float ymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 5132, ymax);
		} else {
			__io__block.writeFloat(__io__address + 5132, ymax);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Channels to display when drawing the histogram
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 5136);
		} else {
			return __io__block.readShort(__io__address + 5136);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Channels to display when drawing the histogram
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 5136, mode);
		} else {
			__io__block.writeShort(__io__address + 5136, mode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 5138);
		} else {
			return __io__block.readShort(__io__address + 5138);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 5138, flag);
		} else {
			__io__block.writeShort(__io__address + 5138, flag);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public int getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 5140);
		} else {
			return __io__block.readInt(__io__address + 5140);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(int height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 5140, height);
		} else {
			__io__block.writeInt(__io__address + 5140, height);
		}
	}

	/**
	 * Get method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample line only image coords src -> dst </p>
	 * @see #__DNA__FIELD__co
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getCo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			2,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 5144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 5144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'co'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample line only image coords src -> dst </p>
	 * @see #__DNA__FIELD__co
	 */
	
	public void setCo(CArrayFacade<CArrayFacade<Float>> co) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5144;
		} else {
			__dna__offset = 5144;
		}
		if (__io__equals(co, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, co)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, co);
		} else {
			__io__generic__copy( getCo(), co);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Histogram> __io__addressof() {
		return new CPointer<Histogram>(__io__address, new Class[]{Histogram.class}, __io__block, __io__blockTable);
	}

}
