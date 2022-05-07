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
 * Generated facet for DNA struct type 'LibraryWeakReference'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> A weak library/ID reference for local data that has been appended, to allow re-using that local data instead of creating a new copy of it in future appends.</p><p> NOTE: This is by design a week reference, in other words code should be totally fine and perform a regular append if it cannot find a valid matching local {@link ID} .</p><p> NOTE: There should always be only one single {@link ID}  in current Main matching a given linked reference. </p>
 */

@CMetaData(size32=1092, size64=1092)
public class LibraryWeakReference extends CFacade {

	/**
	 * This is the sdna index of the struct LibraryWeakReference.
	 * <p>
	 * It is required when allocating a new block to store data for LibraryWeakReference.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 22;

	/**
	 * Field descriptor (offset) for struct member 'library_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Expected to match a Library.filepath</code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LibraryWeakReference libraryweakreference = ...;
	 * CPointer&lt;Object&gt; p = libraryweakreference.__dna__addressof(LibraryWeakReference.__DNA__FIELD__library_filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_library_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'library_filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__library_filepath = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'library_id_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. May be different from the current local {@link ID}  name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LibraryWeakReference libraryweakreference = ...;
	 * CPointer&lt;Object&gt; p = libraryweakreference.__dna__addressof(LibraryWeakReference.__DNA__FIELD__library_id_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_library_id_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'library_id_name'</li>
	 * <li>Signature: 'char[66]'</li>
	 * <li>Actual Size (32bit/64bit): 66/66</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__library_id_name = new long[]{1024, 1024};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LibraryWeakReference libraryweakreference = ...;
	 * CPointer&lt;Object&gt; p = libraryweakreference.__dna__addressof(LibraryWeakReference.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1090, 1090};

	public LibraryWeakReference(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LibraryWeakReference(LibraryWeakReference that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'library_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Expected to match a Library.filepath</code> . </p>
	 * @see #__DNA__FIELD__library_filepath
	 */
	
	public CArrayFacade<Byte> getLibrary_filepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'library_filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Expected to match a Library.filepath</code> . </p>
	 * @see #__DNA__FIELD__library_filepath
	 */
	
	public void setLibrary_filepath(CArrayFacade<Byte> library_filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(library_filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, library_filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, library_filepath);
		} else {
			__io__generic__copy( getLibrary_filepath(), library_filepath);
		}
	}

	/**
	 * Get method for struct member 'library_id_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. May be different from the current local {@link ID}  name. </p>
	 * @see #__DNA__FIELD__library_id_name
	 */
	
	public CArrayFacade<Byte> getLibrary_id_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			66
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1024, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1024, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'library_id_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME. May be different from the current local {@link ID}  name. </p>
	 * @see #__DNA__FIELD__library_id_name
	 */
	
	public void setLibrary_id_name(CArrayFacade<Byte> library_id_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1024;
		} else {
			__dna__offset = 1024;
		}
		if (__io__equals(library_id_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, library_id_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, library_id_name);
		} else {
			__io__generic__copy( getLibrary_id_name(), library_id_name);
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
			return new CArrayFacade<Byte>(__io__address + 1090, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1090, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1090;
		} else {
			__dna__offset = 1090;
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
	public CPointer<LibraryWeakReference> __io__addressof() {
		return new CPointer<LibraryWeakReference>(__io__address, new Class[]{LibraryWeakReference.class}, __io__block, __io__blockTable);
	}

}
