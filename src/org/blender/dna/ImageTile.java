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
 * Generated facet for DNA struct type 'ImageTile'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=136)
public class ImageTile extends CFacade {

	/**
	 * This is the sdna index of the struct ImageTile.
	 * <p>
	 * It is required when allocating a new block to store data for ImageTile.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 213;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ImageTile&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ImageTile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ImageTile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ImageTile&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ImageTile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ImageTile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__runtime);
	 * CPointer&lt;ImageTile_Runtime&gt; p_runtime = p.cast(new Class[]{ImageTile_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ImageTile_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'tile_number'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__tile_number);
	 * CPointer&lt;Integer&gt; p_tile_number = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile_number'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile_number = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> for generated images </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_x);
	 * CPointer&lt;Integer&gt; p_gen_x = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_x'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_x = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'gen_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_y);
	 * CPointer&lt;Integer&gt; p_gen_y = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_y'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_y = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'gen_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_type);
	 * CPointer&lt;Byte&gt; p_gen_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_type = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'gen_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_flag);
	 * CPointer&lt;Byte&gt; p_gen_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_flag = new long[]{45, 53};

	/**
	 * Field descriptor (offset) for struct member 'gen_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_depth);
	 * CPointer&lt;Short&gt; p_gen_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_depth = new long[]{46, 54};

	/**
	 * Field descriptor (offset) for struct member 'gen_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__gen_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gen_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_color = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'label'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile imagetile = ...;
	 * CPointer&lt;Object&gt; p = imagetile.__dna__addressof(ImageTile.__DNA__FIELD__label);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_label = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'label'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__label = new long[]{64, 72};

	public ImageTile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImageTile(ImageTile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ImageTile> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageTile.class};
		return new CPointer<ImageTile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageTile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ImageTile> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<ImageTile> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageTile.class};
		return new CPointer<ImageTile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageTile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ImageTile> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public ImageTile_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageTile_Runtime(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ImageTile_Runtime(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(ImageTile_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'tile_number'.
	 * @see #__DNA__FIELD__tile_number
	 */
	
	public int getTile_number() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'tile_number'.
	 * @see #__DNA__FIELD__tile_number
	 */
	
	public void setTile_number(int tile_number) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, tile_number);
		} else {
			__io__block.writeInt(__io__address + 32, tile_number);
		}
	}

	/**
	 * Get method for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> for generated images </p>
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public int getGen_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'gen_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> for generated images </p>
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public void setGen_x(int gen_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, gen_x);
		} else {
			__io__block.writeInt(__io__address + 36, gen_x);
		}
	}

	/**
	 * Get method for struct member 'gen_y'.
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public int getGen_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'gen_y'.
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public void setGen_y(int gen_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, gen_y);
		} else {
			__io__block.writeInt(__io__address + 40, gen_y);
		}
	}

	/**
	 * Get method for struct member 'gen_type'.
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public byte getGen_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 52);
		} else {
			return __io__block.readByte(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'gen_type'.
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public void setGen_type(byte gen_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 52, gen_type);
		} else {
			__io__block.writeByte(__io__address + 44, gen_type);
		}
	}

	/**
	 * Get method for struct member 'gen_flag'.
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public byte getGen_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 53);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'gen_flag'.
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public void setGen_flag(byte gen_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 53, gen_flag);
		} else {
			__io__block.writeByte(__io__address + 45, gen_flag);
		}
	}

	/**
	 * Get method for struct member 'gen_depth'.
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public short getGen_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 54);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'gen_depth'.
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public void setGen_depth(short gen_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 54, gen_depth);
		} else {
			__io__block.writeShort(__io__address + 46, gen_depth);
		}
	}

	/**
	 * Get method for struct member 'gen_color'.
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public CArrayFacade<Float> getGen_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gen_color'.
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public void setGen_color(CArrayFacade<Float> gen_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(gen_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gen_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gen_color);
		} else {
			__io__generic__copy( getGen_color(), gen_color);
		}
	}

	/**
	 * Get method for struct member 'label'.
	 * @see #__DNA__FIELD__label
	 */
	
	public CArrayFacade<Byte> getLabel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'label'.
	 * @see #__DNA__FIELD__label
	 */
	
	public void setLabel(CArrayFacade<Byte> label) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(label, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, label)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, label);
		} else {
			__io__generic__copy( getLabel(), label);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImageTile> __io__addressof() {
		return new CPointer<ImageTile>(__io__address, new Class[]{ImageTile.class}, __io__block, __io__blockTable);
	}

}
