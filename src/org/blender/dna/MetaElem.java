package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MetaElem'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=84, size64=104)
public class MetaElem extends CFacade {

	/**
	 * This is the sdna index of the struct MetaElem.
	 * <p>
	 * It is required when allocating a new block to store data for MetaElem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 52;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MetaElem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MetaElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MetaElem*'</li>
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
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MetaElem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MetaElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MetaElem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bound Box of {@link MetaElem} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{14, 26};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position of center of {@link MetaElem} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__x);
	 * CPointer&lt;Float&gt; p_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__y);
	 * CPointer&lt;Float&gt; p_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y = new long[]{24, 36};

	/**
	 * Field descriptor (offset) for struct member 'z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__z);
	 * CPointer&lt;Float&gt; p_z = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'z'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__z = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of {@link MetaElem}  (MUST be kept normalized). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__quat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_quat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quat = new long[]{32, 44};

	/**
	 * Field descriptor (offset) for struct member 'expx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension parameters, used for some types like cubes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__expx);
	 * CPointer&lt;Float&gt; p_expx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expx = new long[]{48, 60};

	/**
	 * Field descriptor (offset) for struct member 'expy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__expy);
	 * CPointer&lt;Float&gt; p_expy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expy = new long[]{52, 64};

	/**
	 * Field descriptor (offset) for struct member 'expz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__expz);
	 * CPointer&lt;Float&gt; p_expz = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expz'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expz = new long[]{56, 68};

	/**
	 * Field descriptor (offset) for struct member 'rad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the meta element. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__rad);
	 * CPointer&lt;Float&gt; p_rad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rad = new long[]{60, 72};

	/**
	 * Field descriptor (offset) for struct member 'rad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp field, used only while processing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__rad2);
	 * CPointer&lt;Float&gt; p_rad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rad2 = new long[]{64, 76};

	/**
	 * Field descriptor (offset) for struct member 's'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stiffness, how much of the element to fill. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__s);
	 * CPointer&lt;Float&gt; p_s = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 's'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__s = new long[]{68, 80};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old, only used for backwards compat. use dimensions now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__len);
	 * CPointer&lt;Float&gt; p_len = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{72, 84};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix and inverted matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaElem metaelem = ...;
	 * CPointer&lt;Object&gt; p = metaelem.__dna__addressof(MetaElem.__DNA__FIELD__imat);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_imat = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{80, 96};

	public MetaElem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MetaElem(MetaElem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MetaElem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MetaElem.class};
		return new CPointer<MetaElem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MetaElem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MetaElem> next) throws IOException
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
	
	public CPointer<MetaElem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MetaElem.class};
		return new CPointer<MetaElem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MetaElem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MetaElem> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bound Box of {@link MetaElem} . </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bound Box of {@link MetaElem} . </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, type);
		} else {
			__io__block.writeShort(__io__address + 12, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, flag);
		} else {
			__io__block.writeShort(__io__address + 14, flag);
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
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position of center of {@link MetaElem} . </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public float getX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position of center of {@link MetaElem} . </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(float x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, x);
		} else {
			__io__block.writeFloat(__io__address + 20, x);
		}
	}

	/**
	 * Get method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public float getY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public void setY(float y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, y);
		} else {
			__io__block.writeFloat(__io__address + 24, y);
		}
	}

	/**
	 * Get method for struct member 'z'.
	 * @see #__DNA__FIELD__z
	 */
	
	public float getZ() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'z'.
	 * @see #__DNA__FIELD__z
	 */
	
	public void setZ(float z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, z);
		} else {
			__io__block.writeFloat(__io__address + 28, z);
		}
	}

	/**
	 * Get method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of {@link MetaElem}  (MUST be kept normalized). </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public CArrayFacade<Float> getQuat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of {@link MetaElem}  (MUST be kept normalized). </p>
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(quat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, quat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, quat);
		} else {
			__io__generic__copy( getQuat(), quat);
		}
	}

	/**
	 * Get method for struct member 'expx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension parameters, used for some types like cubes. </p>
	 * @see #__DNA__FIELD__expx
	 */
	
	public float getExpx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'expx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension parameters, used for some types like cubes. </p>
	 * @see #__DNA__FIELD__expx
	 */
	
	public void setExpx(float expx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, expx);
		} else {
			__io__block.writeFloat(__io__address + 48, expx);
		}
	}

	/**
	 * Get method for struct member 'expy'.
	 * @see #__DNA__FIELD__expy
	 */
	
	public float getExpy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'expy'.
	 * @see #__DNA__FIELD__expy
	 */
	
	public void setExpy(float expy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, expy);
		} else {
			__io__block.writeFloat(__io__address + 52, expy);
		}
	}

	/**
	 * Get method for struct member 'expz'.
	 * @see #__DNA__FIELD__expz
	 */
	
	public float getExpz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'expz'.
	 * @see #__DNA__FIELD__expz
	 */
	
	public void setExpz(float expz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, expz);
		} else {
			__io__block.writeFloat(__io__address + 56, expz);
		}
	}

	/**
	 * Get method for struct member 'rad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the meta element. </p>
	 * @see #__DNA__FIELD__rad
	 */
	
	public float getRad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'rad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the meta element. </p>
	 * @see #__DNA__FIELD__rad
	 */
	
	public void setRad(float rad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, rad);
		} else {
			__io__block.writeFloat(__io__address + 60, rad);
		}
	}

	/**
	 * Get method for struct member 'rad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp field, used only while processing. </p>
	 * @see #__DNA__FIELD__rad2
	 */
	
	public float getRad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'rad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp field, used only while processing. </p>
	 * @see #__DNA__FIELD__rad2
	 */
	
	public void setRad2(float rad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, rad2);
		} else {
			__io__block.writeFloat(__io__address + 64, rad2);
		}
	}

	/**
	 * Get method for struct member 's'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stiffness, how much of the element to fill. </p>
	 * @see #__DNA__FIELD__s
	 */
	
	public float getS() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 's'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stiffness, how much of the element to fill. </p>
	 * @see #__DNA__FIELD__s
	 */
	
	public void setS(float s) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, s);
		} else {
			__io__block.writeFloat(__io__address + 68, s);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old, only used for backwards compat. use dimensions now. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public float getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old, only used for backwards compat. use dimensions now. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(float len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, len);
		} else {
			__io__block.writeFloat(__io__address + 72, len);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix and inverted matrix. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<Float> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix and inverted matrix. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<Float> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'imat'.
	 * @see #__DNA__FIELD__imat
	 */
	
	public CPointer<Float> getImat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'imat'.
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CPointer<Float> imat) throws IOException
	{
		long __address = ((imat == null) ? 0 : imat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MetaElem> __io__addressof() {
		return new CPointer<MetaElem>(__io__address, new Class[]{MetaElem.class}, __io__block, __io__blockTable);
	}

}
