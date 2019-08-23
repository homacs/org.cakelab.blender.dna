package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileDirEntry'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Container for mere direntry, with additional asset-related data. </p>
 */

@CMetaData(size32=84, size64=128)
public class FileDirEntry extends CFacade {

	/**
	 * This is the sdna index of the struct FileDirEntry.
	 * <p>
	 * It is required when allocating a new block to store data for FileDirEntry.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 222;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;FileDirEntry&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, FileDirEntry.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FileDirEntry*'</li>
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
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;FileDirEntry&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, FileDirEntry.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FileDirEntry*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'uuid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__uuid);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_uuid = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'description'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__description);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_description = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'description'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__description = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either point to active variant/revision if available, or own entry (in mere filebrowser case). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__entry);
	 * CPointer&lt;CPointer&lt;FileDirEntryRevision&gt;&gt; p_entry = p.cast(new Class[]{CPointer.class, FileDirEntryRevision.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'entry'</li>
	 * <li>Signature: 'FileDirEntryRevision*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__entry = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'typeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileSel_File_Types </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__typeflag);
	 * CPointer&lt;Integer&gt; p_typeflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeflag = new long[]{36, 56};

	/**
	 * Field descriptor (offset) for struct member 'blentype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ID}  type, in case typeflag has FILE_TYPE_BLENDERLIB set. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__blentype);
	 * CPointer&lt;Integer&gt; p_blentype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blentype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blentype = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'relpath'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__relpath);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_relpath = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'relpath'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__relpath = new long[]{44, 64};

	/**
	 * Field descriptor (offset) for struct member 'poin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO: make this a real {@link ID}  pointer? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__poin);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_poin = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poin'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poin = new long[]{48, 72};

	/**
	 * Field descriptor (offset) for struct member 'image'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__image);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_image = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image = new long[]{52, 80};

	/**
	 * Field descriptor (offset) for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tags are for info only, most of filtering is done in asset engine. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__tags);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Byte&gt;&gt;&gt; p_tags = p.cast(new Class[]{CPointer.class, CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tags'</li>
	 * <li>Signature: 'char**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tags = new long[]{56, 88};

	/**
	 * Field descriptor (offset) for struct member 'nbr_tags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__nbr_tags);
	 * CPointer&lt;Integer&gt; p_nbr_tags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_tags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_tags = new long[]{60, 96};

	/**
	 * Field descriptor (offset) for struct member 'status'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__status);
	 * CPointer&lt;Short&gt; p_status = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'status'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__status = new long[]{64, 100};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{66, 102};

	/**
	 * Field descriptor (offset) for struct member 'variants'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__variants);
	 * CPointer&lt;ListBase&gt; p_variants = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'variants'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__variants = new long[]{68, 104};

	/**
	 * Field descriptor (offset) for struct member 'nbr_variants'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__nbr_variants);
	 * CPointer&lt;Integer&gt; p_nbr_variants = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_variants'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_variants = new long[]{76, 120};

	/**
	 * Field descriptor (offset) for struct member 'act_variant'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntry filedirentry = ...;
	 * CPointer&lt;Object&gt; p = filedirentry.__dna__addressof(FileDirEntry.__DNA__FIELD__act_variant);
	 * CPointer&lt;Integer&gt; p_act_variant = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_variant'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_variant = new long[]{80, 124};

	public FileDirEntry(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileDirEntry(FileDirEntry that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<FileDirEntry> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntry.class};
		return new CPointer<FileDirEntry>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntry.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<FileDirEntry> next) throws IOException
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
	
	public CPointer<FileDirEntry> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntry.class};
		return new CPointer<FileDirEntry>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntry.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<FileDirEntry> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'uuid'.
	 * @see #__DNA__FIELD__uuid
	 */
	
	public CArrayFacade<Integer> getUuid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uuid'.
	 * @see #__DNA__FIELD__uuid
	 */
	
	public void setUuid(CArrayFacade<Integer> uuid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(uuid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uuid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uuid);
		} else {
			__io__generic__copy( getUuid(), uuid);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CPointer<Byte> getName() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CPointer<Byte> name) throws IOException
	{
		long __address = ((name == null) ? 0 : name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'description'.
	 * @see #__DNA__FIELD__description
	 */
	
	public CPointer<Byte> getDescription() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'description'.
	 * @see #__DNA__FIELD__description
	 */
	
	public void setDescription(CPointer<Byte> description) throws IOException
	{
		long __address = ((description == null) ? 0 : description.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either point to active variant/revision if available, or own entry (in mere filebrowser case). </p>
	 * @see #__DNA__FIELD__entry
	 */
	
	public CPointer<FileDirEntryRevision> getEntry() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntryRevision.class};
		return new CPointer<FileDirEntryRevision>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntryRevision.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'entry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Either point to active variant/revision if available, or own entry (in mere filebrowser case). </p>
	 * @see #__DNA__FIELD__entry
	 */
	
	public void setEntry(CPointer<FileDirEntryRevision> entry) throws IOException
	{
		long __address = ((entry == null) ? 0 : entry.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'typeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileSel_File_Types </p>
	 * @see #__DNA__FIELD__typeflag
	 */
	
	public int getTypeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'typeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileSel_File_Types </p>
	 * @see #__DNA__FIELD__typeflag
	 */
	
	public void setTypeflag(int typeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, typeflag);
		} else {
			__io__block.writeInt(__io__address + 36, typeflag);
		}
	}

	/**
	 * Get method for struct member 'blentype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ID}  type, in case typeflag has FILE_TYPE_BLENDERLIB set. </p>
	 * @see #__DNA__FIELD__blentype
	 */
	
	public int getBlentype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'blentype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ID}  type, in case typeflag has FILE_TYPE_BLENDERLIB set. </p>
	 * @see #__DNA__FIELD__blentype
	 */
	
	public void setBlentype(int blentype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, blentype);
		} else {
			__io__block.writeInt(__io__address + 40, blentype);
		}
	}

	/**
	 * Get method for struct member 'relpath'.
	 * @see #__DNA__FIELD__relpath
	 */
	
	public CPointer<Byte> getRelpath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'relpath'.
	 * @see #__DNA__FIELD__relpath
	 */
	
	public void setRelpath(CPointer<Byte> relpath) throws IOException
	{
		long __address = ((relpath == null) ? 0 : relpath.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'poin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO: make this a real {@link ID}  pointer? </p>
	 * @see #__DNA__FIELD__poin
	 */
	
	public CPointer<Object> getPoin() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'poin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO: make this a real {@link ID}  pointer? </p>
	 * @see #__DNA__FIELD__poin
	 */
	
	public void setPoin(CPointer<Object> poin) throws IOException
	{
		long __address = ((poin == null) ? 0 : poin.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public CPointer<Object> getImage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public void setImage(CPointer<Object> image) throws IOException
	{
		long __address = ((image == null) ? 0 : image.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tags are for info only, most of filtering is done in asset engine. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public CPointer<CPointer<Byte>> getTags() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Byte.class};
		return new CPointer<CPointer<Byte>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tags are for info only, most of filtering is done in asset engine. </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public void setTags(CPointer<CPointer<Byte>> tags) throws IOException
	{
		long __address = ((tags == null) ? 0 : tags.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'nbr_tags'.
	 * @see #__DNA__FIELD__nbr_tags
	 */
	
	public int getNbr_tags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'nbr_tags'.
	 * @see #__DNA__FIELD__nbr_tags
	 */
	
	public void setNbr_tags(int nbr_tags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, nbr_tags);
		} else {
			__io__block.writeInt(__io__address + 60, nbr_tags);
		}
	}

	/**
	 * Get method for struct member 'status'.
	 * @see #__DNA__FIELD__status
	 */
	
	public short getStatus() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 100);
		} else {
			return __io__block.readShort(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'status'.
	 * @see #__DNA__FIELD__status
	 */
	
	public void setStatus(short status) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 100, status);
		} else {
			__io__block.writeShort(__io__address + 64, status);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 102);
		} else {
			return __io__block.readShort(__io__address + 66);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 102, flags);
		} else {
			__io__block.writeShort(__io__address + 66, flags);
		}
	}

	/**
	 * Get method for struct member 'variants'.
	 * @see #__DNA__FIELD__variants
	 */
	
	public ListBase getVariants() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 68, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'variants'.
	 * @see #__DNA__FIELD__variants
	 */
	
	public void setVariants(ListBase variants) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(variants, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, variants)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, variants);
		} else {
			__io__generic__copy( getVariants(), variants);
		}
	}

	/**
	 * Get method for struct member 'nbr_variants'.
	 * @see #__DNA__FIELD__nbr_variants
	 */
	
	public int getNbr_variants() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'nbr_variants'.
	 * @see #__DNA__FIELD__nbr_variants
	 */
	
	public void setNbr_variants(int nbr_variants) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, nbr_variants);
		} else {
			__io__block.writeInt(__io__address + 76, nbr_variants);
		}
	}

	/**
	 * Get method for struct member 'act_variant'.
	 * @see #__DNA__FIELD__act_variant
	 */
	
	public int getAct_variant() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'act_variant'.
	 * @see #__DNA__FIELD__act_variant
	 */
	
	public void setAct_variant(int act_variant) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, act_variant);
		} else {
			__io__block.writeInt(__io__address + 80, act_variant);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileDirEntry> __io__addressof() {
		return new CPointer<FileDirEntry>(__io__address, new Class[]{FileDirEntry.class}, __io__block, __io__blockTable);
	}

}
