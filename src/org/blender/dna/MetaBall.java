package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MetaBall'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=216, size64=288)
public class MetaBall extends CFacade {

	/**
	 * This is the sdna index of the struct MetaBall.
	 * <p>
	 * It is required when allocating a new block to store data for MetaBall.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 53;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'elems'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__elems);
	 * CPointer&lt;ListBase&gt; p_elems = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'elems'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__elems = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'disp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__disp);
	 * CPointer&lt;ListBase&gt; p_disp = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'editelems'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not saved in files, note we use pointer for editmode check. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__editelems);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_editelems = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editelems'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editelems = new long[]{140, 192};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{144, 200};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material of the mother ball will define the material used of all others </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{148, 208};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag is enum for updates, flag2 is bitflags for settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{152, 216};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__flag2);
	 * CPointer&lt;Byte&gt; p_flag2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{153, 217};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{154, 218};

	/**
	 * Field descriptor (offset) for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to store MB_AUTOSPACE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__texflag);
	 * CPointer&lt;Short&gt; p_texflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texflag = new long[]{156, 220};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{158, 222};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{172, 236};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{184, 248};

	/**
	 * Field descriptor (offset) for struct member 'wiresize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and render res. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__wiresize);
	 * CPointer&lt;Float&gt; p_wiresize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wiresize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wiresize = new long[]{196, 260};

	/**
	 * Field descriptor (offset) for struct member 'rendersize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__rendersize);
	 * CPointer&lt;Float&gt; p_rendersize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rendersize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rendersize = new long[]{200, 264};

	/**
	 * Field descriptor (offset) for struct member 'thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bias elements to have an offset volume. mother ball changes will effect other objects thresholds, but these may also have their own thresh as an offset </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__thresh);
	 * CPointer&lt;Float&gt; p_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thresh = new long[]{204, 268};

	/**
	 * Field descriptor (offset) for struct member 'lastelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used in editmode {@link ListBase}  edit_elems; </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__lastelem);
	 * CPointer&lt;CPointer&lt;MetaElem&gt;&gt; p_lastelem = p.cast(new Class[]{CPointer.class, MetaElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastelem'</li>
	 * <li>Signature: 'MetaElem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastelem = new long[]{208, 272};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaBall metaball = ...;
	 * CPointer&lt;Object&gt; p = metaball.__dna__addressof(MetaBall.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{212, 280};

	public MetaBall(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MetaBall(MetaBall that) {
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
	 * Get method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'elems'.
	 * @see #__DNA__FIELD__elems
	 */
	
	public ListBase getElems() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'elems'.
	 * @see #__DNA__FIELD__elems
	 */
	
	public void setElems(ListBase elems) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(elems, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, elems)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, elems);
		} else {
			__io__generic__copy( getElems(), elems);
		}
	}

	/**
	 * Get method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public ListBase getDisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 132, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public void setDisp(ListBase disp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(disp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disp);
		} else {
			__io__generic__copy( getDisp(), disp);
		}
	}

	/**
	 * Get method for struct member 'editelems'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not saved in files, note we use pointer for editmode check. </p>
	 * @see #__DNA__FIELD__editelems
	 */
	
	public CPointer<ListBase> getEditelems() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editelems'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not saved in files, note we use pointer for editmode check. </p>
	 * @see #__DNA__FIELD__editelems
	 */
	
	public void setEditelems(CPointer<ListBase> editelems) throws IOException
	{
		long __address = ((editelems == null) ? 0 : editelems.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material of the mother ball will define the material used of all others </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material of the mother ball will define the material used of all others </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag is enum for updates, flag2 is bitflags for settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 216);
		} else {
			return __io__block.readByte(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag is enum for updates, flag2 is bitflags for settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 216, flag);
		} else {
			__io__block.writeByte(__io__address + 152, flag);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public byte getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 217);
		} else {
			return __io__block.readByte(__io__address + 153);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(byte flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 217, flag2);
		} else {
			__io__block.writeByte(__io__address + 153, flag2);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, totcol);
		} else {
			__io__block.writeShort(__io__address + 154, totcol);
		}
	}

	/**
	 * Get method for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to store MB_AUTOSPACE. </p>
	 * @see #__DNA__FIELD__texflag
	 */
	
	public short getTexflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'texflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to store MB_AUTOSPACE. </p>
	 * @see #__DNA__FIELD__texflag
	 */
	
	public void setTexflag(short texflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, texflag);
		} else {
			__io__block.writeShort(__io__address + 156, texflag);
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
			return new CArrayFacade<Byte>(__io__address + 222, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 158, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 222;
		} else {
			__dna__offset = 158;
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
	 * Get method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture space, copied as one block in editobject.c </p>
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 236;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot);
		} else {
			__io__generic__copy( getRot(), rot);
		}
	}

	/**
	 * Get method for struct member 'wiresize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and render res. </p>
	 * @see #__DNA__FIELD__wiresize
	 */
	
	public float getWiresize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'wiresize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and render res. </p>
	 * @see #__DNA__FIELD__wiresize
	 */
	
	public void setWiresize(float wiresize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, wiresize);
		} else {
			__io__block.writeFloat(__io__address + 196, wiresize);
		}
	}

	/**
	 * Get method for struct member 'rendersize'.
	 * @see #__DNA__FIELD__rendersize
	 */
	
	public float getRendersize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'rendersize'.
	 * @see #__DNA__FIELD__rendersize
	 */
	
	public void setRendersize(float rendersize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, rendersize);
		} else {
			__io__block.writeFloat(__io__address + 200, rendersize);
		}
	}

	/**
	 * Get method for struct member 'thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bias elements to have an offset volume. mother ball changes will effect other objects thresholds, but these may also have their own thresh as an offset </p>
	 * @see #__DNA__FIELD__thresh
	 */
	
	public float getThresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bias elements to have an offset volume. mother ball changes will effect other objects thresholds, but these may also have their own thresh as an offset </p>
	 * @see #__DNA__FIELD__thresh
	 */
	
	public void setThresh(float thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, thresh);
		} else {
			__io__block.writeFloat(__io__address + 204, thresh);
		}
	}

	/**
	 * Get method for struct member 'lastelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used in editmode {@link ListBase}  edit_elems; </p>
	 * @see #__DNA__FIELD__lastelem
	 */
	
	public CPointer<MetaElem> getLastelem() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MetaElem.class};
		return new CPointer<MetaElem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MetaElem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lastelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used in editmode {@link ListBase}  edit_elems; </p>
	 * @see #__DNA__FIELD__lastelem
	 */
	
	public void setLastelem(CPointer<MetaElem> lastelem) throws IOException
	{
		long __address = ((lastelem == null) ? 0 : lastelem.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MetaBall> __io__addressof() {
		return new CPointer<MetaBall>(__io__address, new Class[]{MetaBall.class}, __io__block, __io__blockTable);
	}

}
