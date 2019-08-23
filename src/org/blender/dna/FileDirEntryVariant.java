package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileDirEntryVariant'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Container for a variant, only relevant in asset context. In case there are no variants, a single one shall exist, with NULL name/description. </p>
 */

@CMetaData(size32=48, size64=72)
public class FileDirEntryVariant extends CFacade {

	/**
	 * This is the sdna index of the struct FileDirEntryVariant.
	 * <p>
	 * It is required when allocating a new block to store data for FileDirEntryVariant.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 225;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;FileDirEntryVariant&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, FileDirEntryVariant.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FileDirEntryVariant*'</li>
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
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;FileDirEntryVariant&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, FileDirEntryVariant.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FileDirEntryVariant*'</li>
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
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__uuid);
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
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__name);
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
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__description);
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
	 * Field descriptor (offset) for struct member 'revisions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__revisions);
	 * CPointer&lt;ListBase&gt; p_revisions = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'revisions'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__revisions = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'nbr_revisions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__nbr_revisions);
	 * CPointer&lt;Integer&gt; p_nbr_revisions = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_revisions'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_revisions = new long[]{40, 64};

	/**
	 * Field descriptor (offset) for struct member 'act_revision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryVariant filedirentryvariant = ...;
	 * CPointer&lt;Object&gt; p = filedirentryvariant.__dna__addressof(FileDirEntryVariant.__DNA__FIELD__act_revision);
	 * CPointer&lt;Integer&gt; p_act_revision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_revision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_revision = new long[]{44, 68};

	public FileDirEntryVariant(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileDirEntryVariant(FileDirEntryVariant that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<FileDirEntryVariant> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntryVariant.class};
		return new CPointer<FileDirEntryVariant>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntryVariant.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<FileDirEntryVariant> next) throws IOException
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
	
	public CPointer<FileDirEntryVariant> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntryVariant.class};
		return new CPointer<FileDirEntryVariant>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntryVariant.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<FileDirEntryVariant> prev) throws IOException
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
	 * Get method for struct member 'revisions'.
	 * @see #__DNA__FIELD__revisions
	 */
	
	public ListBase getRevisions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'revisions'.
	 * @see #__DNA__FIELD__revisions
	 */
	
	public void setRevisions(ListBase revisions) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(revisions, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, revisions)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, revisions);
		} else {
			__io__generic__copy( getRevisions(), revisions);
		}
	}

	/**
	 * Get method for struct member 'nbr_revisions'.
	 * @see #__DNA__FIELD__nbr_revisions
	 */
	
	public int getNbr_revisions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'nbr_revisions'.
	 * @see #__DNA__FIELD__nbr_revisions
	 */
	
	public void setNbr_revisions(int nbr_revisions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, nbr_revisions);
		} else {
			__io__block.writeInt(__io__address + 40, nbr_revisions);
		}
	}

	/**
	 * Get method for struct member 'act_revision'.
	 * @see #__DNA__FIELD__act_revision
	 */
	
	public int getAct_revision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 68);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'act_revision'.
	 * @see #__DNA__FIELD__act_revision
	 */
	
	public void setAct_revision(int act_revision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 68, act_revision);
		} else {
			__io__block.writeInt(__io__address + 44, act_revision);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileDirEntryVariant> __io__addressof() {
		return new CPointer<FileDirEntryVariant>(__io__address, new Class[]{FileDirEntryVariant.class}, __io__block, __io__blockTable);
	}

}
