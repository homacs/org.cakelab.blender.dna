package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BakeData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1360, size64=1368)
public class BakeData extends CFacade {

	/**
	 * This is the sdna index of the struct BakeData.
	 * <p>
	 * It is required when allocating a new block to store data for BakeData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 174;

	/**
	 * Field descriptor (offset) for struct member 'im_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__im_format);
	 * CPointer&lt;ImageFormatData&gt; p_im_format = p.cast(new Class[]{ImageFormatData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'im_format'</li>
	 * <li>Signature: 'ImageFormatData'</li>
	 * <li>Actual Size (32bit/64bit): 248/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__im_format = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath = new long[]{248, 256};

	/**
	 * Field descriptor (offset) for struct member 'width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__width);
	 * CPointer&lt;Short&gt; p_width = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'width'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__width = new long[]{1272, 1280};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__height);
	 * CPointer&lt;Short&gt; p_height = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{1274, 1282};

	/**
	 * Field descriptor (offset) for struct member 'margin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__margin);
	 * CPointer&lt;Short&gt; p_margin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin = new long[]{1276, 1284};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1278, 1286};

	/**
	 * Field descriptor (offset) for struct member 'cage_extrusion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__cage_extrusion);
	 * CPointer&lt;Float&gt; p_cage_extrusion = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cage_extrusion'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cage_extrusion = new long[]{1280, 1288};

	/**
	 * Field descriptor (offset) for struct member 'pass_filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__pass_filter);
	 * CPointer&lt;Integer&gt; p_pass_filter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_filter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_filter = new long[]{1284, 1292};

	/**
	 * Field descriptor (offset) for struct member 'normal_swizzle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__normal_swizzle);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_normal_swizzle = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_swizzle'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_swizzle = new long[]{1288, 1296};

	/**
	 * Field descriptor (offset) for struct member 'normal_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__normal_space);
	 * CPointer&lt;Byte&gt; p_normal_space = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_space'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_space = new long[]{1291, 1299};

	/**
	 * Field descriptor (offset) for struct member 'save_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__save_mode);
	 * CPointer&lt;Byte&gt; p_save_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'save_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__save_mode = new long[]{1292, 1300};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{1293, 1301};

	/**
	 * Field descriptor (offset) for struct member 'cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__cage);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_cage = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cage'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cage = new long[]{1296, 1304};

	public BakeData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BakeData(BakeData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public ImageFormatData getIm_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageFormatData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ImageFormatData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public void setIm_format(ImageFormatData im_format) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(im_format, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, im_format)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, im_format);
		} else {
			__io__generic__copy( getIm_format(), im_format);
		}
	}

	/**
	 * Get method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 248;
		}
		if (__io__equals(filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filepath);
		} else {
			__io__generic__copy( getFilepath(), filepath);
		}
	}

	/**
	 * Get method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public short getWidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1280);
		} else {
			return __io__block.readShort(__io__address + 1272);
		}
	}

	/**
	 * Set method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public void setWidth(short width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1280, width);
		} else {
			__io__block.writeShort(__io__address + 1272, width);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public short getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1282);
		} else {
			return __io__block.readShort(__io__address + 1274);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(short height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1282, height);
		} else {
			__io__block.writeShort(__io__address + 1274, height);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public short getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1284);
		} else {
			return __io__block.readShort(__io__address + 1276);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(short margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1284, margin);
		} else {
			__io__block.writeShort(__io__address + 1276, margin);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1286);
		} else {
			return __io__block.readShort(__io__address + 1278);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1286, flag);
		} else {
			__io__block.writeShort(__io__address + 1278, flag);
		}
	}

	/**
	 * Get method for struct member 'cage_extrusion'.
	 * @see #__DNA__FIELD__cage_extrusion
	 */
	
	public float getCage_extrusion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1288);
		} else {
			return __io__block.readFloat(__io__address + 1280);
		}
	}

	/**
	 * Set method for struct member 'cage_extrusion'.
	 * @see #__DNA__FIELD__cage_extrusion
	 */
	
	public void setCage_extrusion(float cage_extrusion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1288, cage_extrusion);
		} else {
			__io__block.writeFloat(__io__address + 1280, cage_extrusion);
		}
	}

	/**
	 * Get method for struct member 'pass_filter'.
	 * @see #__DNA__FIELD__pass_filter
	 */
	
	public int getPass_filter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1292);
		} else {
			return __io__block.readInt(__io__address + 1284);
		}
	}

	/**
	 * Set method for struct member 'pass_filter'.
	 * @see #__DNA__FIELD__pass_filter
	 */
	
	public void setPass_filter(int pass_filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1292, pass_filter);
		} else {
			__io__block.writeInt(__io__address + 1284, pass_filter);
		}
	}

	/**
	 * Get method for struct member 'normal_swizzle'.
	 * @see #__DNA__FIELD__normal_swizzle
	 */
	
	public CArrayFacade<Byte> getNormal_swizzle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'normal_swizzle'.
	 * @see #__DNA__FIELD__normal_swizzle
	 */
	
	public void setNormal_swizzle(CArrayFacade<Byte> normal_swizzle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1296;
		} else {
			__dna__offset = 1288;
		}
		if (__io__equals(normal_swizzle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, normal_swizzle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, normal_swizzle);
		} else {
			__io__generic__copy( getNormal_swizzle(), normal_swizzle);
		}
	}

	/**
	 * Get method for struct member 'normal_space'.
	 * @see #__DNA__FIELD__normal_space
	 */
	
	public byte getNormal_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1299);
		} else {
			return __io__block.readByte(__io__address + 1291);
		}
	}

	/**
	 * Set method for struct member 'normal_space'.
	 * @see #__DNA__FIELD__normal_space
	 */
	
	public void setNormal_space(byte normal_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1299, normal_space);
		} else {
			__io__block.writeByte(__io__address + 1291, normal_space);
		}
	}

	/**
	 * Get method for struct member 'save_mode'.
	 * @see #__DNA__FIELD__save_mode
	 */
	
	public byte getSave_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1300);
		} else {
			return __io__block.readByte(__io__address + 1292);
		}
	}

	/**
	 * Set method for struct member 'save_mode'.
	 * @see #__DNA__FIELD__save_mode
	 */
	
	public void setSave_mode(byte save_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1300, save_mode);
		} else {
			__io__block.writeByte(__io__address + 1292, save_mode);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1301, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1293, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1301;
		} else {
			__dna__offset = 1293;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__cage
	 */
	
	public CArrayFacade<Byte> getCage() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cage'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__cage
	 */
	
	public void setCage(CArrayFacade<Byte> cage) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1304;
		} else {
			__dna__offset = 1296;
		}
		if (__io__equals(cage, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cage)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cage);
		} else {
			__io__generic__copy( getCage(), cage);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BakeData> __io__addressof() {
		return new CPointer<BakeData>(__io__address, new Class[]{BakeData.class}, __io__block, __io__blockTable);
	}

}
