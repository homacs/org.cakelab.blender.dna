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
 * Generated facet for DNA struct type 'ImagePackedFile'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1044, size64=1056)
public class ImagePackedFile extends CFacade {

	/**
	 * This is the sdna index of the struct ImagePackedFile.
	 * <p>
	 * It is required when allocating a new block to store data for ImagePackedFile.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 210;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ImagePackedFile&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ImagePackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ImagePackedFile*'</li>
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
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ImagePackedFile&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ImagePackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ImagePackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Which view and tile this {@link ImagePackedFile}  represents. Normal images will use 0 and 1001 respectively when creating their {@link ImagePackedFile} . Must be provided for each packed image. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__view);
	 * CPointer&lt;Integer&gt; p_view = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'tile_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__tile_number);
	 * CPointer&lt;Integer&gt; p_tile_number = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile_number'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile_number = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImagePackedFile imagepackedfile = ...;
	 * CPointer&lt;Object&gt; p = imagepackedfile.__dna__addressof(ImagePackedFile.__DNA__FIELD__filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath = new long[]{20, 32};

	public ImagePackedFile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImagePackedFile(ImagePackedFile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ImagePackedFile> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImagePackedFile.class};
		return new CPointer<ImagePackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImagePackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ImagePackedFile> next) throws IOException
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
	
	public CPointer<ImagePackedFile> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImagePackedFile.class};
		return new CPointer<ImagePackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImagePackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ImagePackedFile> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Which view and tile this {@link ImagePackedFile}  represents. Normal images will use 0 and 1001 respectively when creating their {@link ImagePackedFile} . Must be provided for each packed image. </p>
	 * @see #__DNA__FIELD__view
	 */
	
	public int getView() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'view'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Which view and tile this {@link ImagePackedFile}  represents. Normal images will use 0 and 1001 respectively when creating their {@link ImagePackedFile} . Must be provided for each packed image. </p>
	 * @see #__DNA__FIELD__view
	 */
	
	public void setView(int view) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, view);
		} else {
			__io__block.writeInt(__io__address + 12, view);
		}
	}

	/**
	 * Get method for struct member 'tile_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__tile_number
	 */
	
	public int getTile_number() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'tile_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__tile_number
	 */
	
	public void setTile_number(int tile_number) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, tile_number);
		} else {
			__io__block.writeInt(__io__address + 16, tile_number);
		}
	}

	/**
	 * Get method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImagePackedFile> __io__addressof() {
		return new CPointer<ImagePackedFile>(__io__address, new Class[]{ImagePackedFile.class}, __io__block, __io__blockTable);
	}

}
