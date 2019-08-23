package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Group'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=152)
public class Group extends CFacade {

	/**
	 * This is the sdna index of the struct Group.
	 * <p>
	 * It is required when allocating a new block to store data for Group.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 309;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Group group = ...;
	 * CPointer&lt;Object&gt; p = group.__dna__addressof(Group.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'gobject'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Group group = ...;
	 * CPointer&lt;Object&gt; p = group.__dna__addressof(Group.__DNA__FIELD__gobject);
	 * CPointer&lt;ListBase&gt; p_gobject = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gobject'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gobject = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Group group = ...;
	 * CPointer&lt;Object&gt; p = group.__dna__addressof(Group.__DNA__FIELD__layer);
	 * CPointer&lt;Integer&gt; p_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'dupli_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Group group = ...;
	 * CPointer&lt;Object&gt; p = group.__dna__addressof(Group.__DNA__FIELD__dupli_ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dupli_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupli_ofs'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupli_ofs = new long[]{112, 140};

	public Group(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Group(Group that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'gobject'.
	 * @see #__DNA__FIELD__gobject
	 */
	
	public ListBase getGobject() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 100, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gobject'.
	 * @see #__DNA__FIELD__gobject
	 */
	
	public void setGobject(ListBase gobject) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(gobject, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gobject)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gobject);
		} else {
			__io__generic__copy( getGobject(), gobject);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public int getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(int layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, layer);
		} else {
			__io__block.writeInt(__io__address + 108, layer);
		}
	}

	/**
	 * Get method for struct member 'dupli_ofs'.
	 * @see #__DNA__FIELD__dupli_ofs
	 */
	
	public CArrayFacade<Float> getDupli_ofs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dupli_ofs'.
	 * @see #__DNA__FIELD__dupli_ofs
	 */
	
	public void setDupli_ofs(CArrayFacade<Float> dupli_ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 140;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(dupli_ofs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dupli_ofs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dupli_ofs);
		} else {
			__io__generic__copy( getDupli_ofs(), dupli_ofs);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Group> __io__addressof() {
		return new CPointer<Group>(__io__address, new Class[]{Group.class}, __io__block, __io__blockTable);
	}

}
