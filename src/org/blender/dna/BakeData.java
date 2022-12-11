package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
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

@CMetaData(size32=1380, size64=1392)
public class BakeData extends CFacade {

	/**
	 * This is the sdna index of the struct BakeData.
	 * <p>
	 * It is required when allocating a new block to store data for BakeData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 579;

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
	 * <li>Actual Size (32bit/64bit): 320/328</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__im_format = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> FILE_MAX. </p>
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
	public static final long[] __DNA__FIELD__filepath = new long[]{320, 328};

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
	public static final long[] __DNA__FIELD__width = new long[]{1344, 1352};

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
	public static final long[] __DNA__FIELD__height = new long[]{1346, 1354};

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
	public static final long[] __DNA__FIELD__margin = new long[]{1348, 1356};

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
	public static final long[] __DNA__FIELD__flag = new long[]{1350, 1358};

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
	public static final long[] __DNA__FIELD__cage_extrusion = new long[]{1352, 1360};

	/**
	 * Field descriptor (offset) for struct member 'max_ray_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__max_ray_distance);
	 * CPointer&lt;Float&gt; p_max_ray_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_ray_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_ray_distance = new long[]{1356, 1364};

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
	public static final long[] __DNA__FIELD__pass_filter = new long[]{1360, 1368};

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
	public static final long[] __DNA__FIELD__normal_swizzle = new long[]{1364, 1372};

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
	public static final long[] __DNA__FIELD__normal_space = new long[]{1367, 1375};

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__target);
	 * CPointer&lt;Byte&gt; p_target = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{1368, 1376};

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
	public static final long[] __DNA__FIELD__save_mode = new long[]{1369, 1377};

	/**
	 * Field descriptor (offset) for struct member 'margin_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__margin_type);
	 * CPointer&lt;Byte&gt; p_margin_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin_type = new long[]{1370, 1378};

	/**
	 * Field descriptor (offset) for struct member 'view_from'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__view_from);
	 * CPointer&lt;Byte&gt; p_view_from = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_from'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_from = new long[]{1371, 1379};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1372, 1380};

	/**
	 * Field descriptor (offset) for struct member 'cage_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BakeData bakedata = ...;
	 * CPointer&lt;Object&gt; p = bakedata.__dna__addressof(BakeData.__DNA__FIELD__cage_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_cage_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cage_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cage_object = new long[]{1376, 1384};

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
	 * <h4>Blender Source Code</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 320;
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
			return __io__block.readShort(__io__address + 1352);
		} else {
			return __io__block.readShort(__io__address + 1344);
		}
	}

	/**
	 * Set method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public void setWidth(short width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1352, width);
		} else {
			__io__block.writeShort(__io__address + 1344, width);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public short getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1354);
		} else {
			return __io__block.readShort(__io__address + 1346);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(short height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1354, height);
		} else {
			__io__block.writeShort(__io__address + 1346, height);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public short getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1356);
		} else {
			return __io__block.readShort(__io__address + 1348);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(short margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1356, margin);
		} else {
			__io__block.writeShort(__io__address + 1348, margin);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1358);
		} else {
			return __io__block.readShort(__io__address + 1350);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1358, flag);
		} else {
			__io__block.writeShort(__io__address + 1350, flag);
		}
	}

	/**
	 * Get method for struct member 'cage_extrusion'.
	 * @see #__DNA__FIELD__cage_extrusion
	 */
	
	public float getCage_extrusion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1360);
		} else {
			return __io__block.readFloat(__io__address + 1352);
		}
	}

	/**
	 * Set method for struct member 'cage_extrusion'.
	 * @see #__DNA__FIELD__cage_extrusion
	 */
	
	public void setCage_extrusion(float cage_extrusion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1360, cage_extrusion);
		} else {
			__io__block.writeFloat(__io__address + 1352, cage_extrusion);
		}
	}

	/**
	 * Get method for struct member 'max_ray_distance'.
	 * @see #__DNA__FIELD__max_ray_distance
	 */
	
	public float getMax_ray_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1364);
		} else {
			return __io__block.readFloat(__io__address + 1356);
		}
	}

	/**
	 * Set method for struct member 'max_ray_distance'.
	 * @see #__DNA__FIELD__max_ray_distance
	 */
	
	public void setMax_ray_distance(float max_ray_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1364, max_ray_distance);
		} else {
			__io__block.writeFloat(__io__address + 1356, max_ray_distance);
		}
	}

	/**
	 * Get method for struct member 'pass_filter'.
	 * @see #__DNA__FIELD__pass_filter
	 */
	
	public int getPass_filter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1368);
		} else {
			return __io__block.readInt(__io__address + 1360);
		}
	}

	/**
	 * Set method for struct member 'pass_filter'.
	 * @see #__DNA__FIELD__pass_filter
	 */
	
	public void setPass_filter(int pass_filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1368, pass_filter);
		} else {
			__io__block.writeInt(__io__address + 1360, pass_filter);
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
			return new CArrayFacade<Byte>(__io__address + 1372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1372;
		} else {
			__dna__offset = 1364;
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
			return __io__block.readByte(__io__address + 1375);
		} else {
			return __io__block.readByte(__io__address + 1367);
		}
	}

	/**
	 * Set method for struct member 'normal_space'.
	 * @see #__DNA__FIELD__normal_space
	 */
	
	public void setNormal_space(byte normal_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1375, normal_space);
		} else {
			__io__block.writeByte(__io__address + 1367, normal_space);
		}
	}

	/**
	 * Get method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public byte getTarget() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1376);
		} else {
			return __io__block.readByte(__io__address + 1368);
		}
	}

	/**
	 * Set method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(byte target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1376, target);
		} else {
			__io__block.writeByte(__io__address + 1368, target);
		}
	}

	/**
	 * Get method for struct member 'save_mode'.
	 * @see #__DNA__FIELD__save_mode
	 */
	
	public byte getSave_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1377);
		} else {
			return __io__block.readByte(__io__address + 1369);
		}
	}

	/**
	 * Set method for struct member 'save_mode'.
	 * @see #__DNA__FIELD__save_mode
	 */
	
	public void setSave_mode(byte save_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1377, save_mode);
		} else {
			__io__block.writeByte(__io__address + 1369, save_mode);
		}
	}

	/**
	 * Get method for struct member 'margin_type'.
	 * @see #__DNA__FIELD__margin_type
	 */
	
	public byte getMargin_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1378);
		} else {
			return __io__block.readByte(__io__address + 1370);
		}
	}

	/**
	 * Set method for struct member 'margin_type'.
	 * @see #__DNA__FIELD__margin_type
	 */
	
	public void setMargin_type(byte margin_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1378, margin_type);
		} else {
			__io__block.writeByte(__io__address + 1370, margin_type);
		}
	}

	/**
	 * Get method for struct member 'view_from'.
	 * @see #__DNA__FIELD__view_from
	 */
	
	public byte getView_from() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1379);
		} else {
			return __io__block.readByte(__io__address + 1371);
		}
	}

	/**
	 * Set method for struct member 'view_from'.
	 * @see #__DNA__FIELD__view_from
	 */
	
	public void setView_from(byte view_from) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1379, view_from);
		} else {
			__io__block.writeByte(__io__address + 1371, view_from);
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
			return new CArrayFacade<Byte>(__io__address + 1380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1380;
		} else {
			__dna__offset = 1372;
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
	 * Get method for struct member 'cage_object'.
	 * @see #__DNA__FIELD__cage_object
	 */
	
	public CPointer<BlenderObject> getCage_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1376);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cage_object'.
	 * @see #__DNA__FIELD__cage_object
	 */
	
	public void setCage_object(CPointer<BlenderObject> cage_object) throws IOException
	{
		long __address = ((cage_object == null) ? 0 : cage_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1384, __address);
		} else {
			__io__block.writeLong(__io__address + 1376, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BakeData> __io__addressof() {
		return new CPointer<BakeData>(__io__address, new Class[]{BakeData.class}, __io__block, __io__blockTable);
	}

}
