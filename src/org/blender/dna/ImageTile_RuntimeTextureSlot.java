package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ImageTile_RuntimeTextureSlot'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class ImageTile_RuntimeTextureSlot extends CFacade {

	/**
	 * This is the sdna index of the struct ImageTile_RuntimeTextureSlot.
	 * <p>
	 * It is required when allocating a new block to store data for ImageTile_RuntimeTextureSlot.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 43;

	/**
	 * Field descriptor (offset) for struct member 'tilearray_layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile_RuntimeTextureSlot imagetile_runtimetextureslot = ...;
	 * CPointer&lt;Object&gt; p = imagetile_runtimetextureslot.__dna__addressof(ImageTile_RuntimeTextureSlot.__DNA__FIELD__tilearray_layer);
	 * CPointer&lt;Integer&gt; p_tilearray_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilearray_layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilearray_layer = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile_RuntimeTextureSlot imagetile_runtimetextureslot = ...;
	 * CPointer&lt;Object&gt; p = imagetile_runtimetextureslot.__dna__addressof(ImageTile_RuntimeTextureSlot.__DNA__FIELD___pad);
	 * CPointer&lt;Integer&gt; p__pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'tilearray_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile_RuntimeTextureSlot imagetile_runtimetextureslot = ...;
	 * CPointer&lt;Object&gt; p = imagetile_runtimetextureslot.__dna__addressof(ImageTile_RuntimeTextureSlot.__DNA__FIELD__tilearray_offset);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_tilearray_offset = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilearray_offset'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilearray_offset = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'tilearray_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile_RuntimeTextureSlot imagetile_runtimetextureslot = ...;
	 * CPointer&lt;Object&gt; p = imagetile_runtimetextureslot.__dna__addressof(ImageTile_RuntimeTextureSlot.__DNA__FIELD__tilearray_size);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_tilearray_size = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilearray_size'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilearray_size = new long[]{16, 16};

	public ImageTile_RuntimeTextureSlot(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImageTile_RuntimeTextureSlot(ImageTile_RuntimeTextureSlot that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tilearray_layer'.
	 * @see #__DNA__FIELD__tilearray_layer
	 */
	
	public int getTilearray_layer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'tilearray_layer'.
	 * @see #__DNA__FIELD__tilearray_layer
	 */
	
	public void setTilearray_layer(int tilearray_layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, tilearray_layer);
		} else {
			__io__block.writeInt(__io__address + 0, tilearray_layer);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public int get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(int _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, _pad);
		} else {
			__io__block.writeInt(__io__address + 4, _pad);
		}
	}

	/**
	 * Get method for struct member 'tilearray_offset'.
	 * @see #__DNA__FIELD__tilearray_offset
	 */
	
	public CArrayFacade<Integer> getTilearray_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tilearray_offset'.
	 * @see #__DNA__FIELD__tilearray_offset
	 */
	
	public void setTilearray_offset(CArrayFacade<Integer> tilearray_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(tilearray_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tilearray_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tilearray_offset);
		} else {
			__io__generic__copy( getTilearray_offset(), tilearray_offset);
		}
	}

	/**
	 * Get method for struct member 'tilearray_size'.
	 * @see #__DNA__FIELD__tilearray_size
	 */
	
	public CArrayFacade<Integer> getTilearray_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tilearray_size'.
	 * @see #__DNA__FIELD__tilearray_size
	 */
	
	public void setTilearray_size(CArrayFacade<Integer> tilearray_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(tilearray_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tilearray_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tilearray_size);
		} else {
			__io__generic__copy( getTilearray_size(), tilearray_size);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImageTile_RuntimeTextureSlot> __io__addressof() {
		return new CPointer<ImageTile_RuntimeTextureSlot>(__io__address, new Class[]{ImageTile_RuntimeTextureSlot.class}, __io__block, __io__blockTable);
	}

}
