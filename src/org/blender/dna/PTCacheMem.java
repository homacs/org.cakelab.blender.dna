package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PTCacheMem'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=176)
public class PTCacheMem extends CFacade {

	/**
	 * This is the sdna index of the struct PTCacheMem.
	 * <p>
	 * It is required when allocating a new block to store data for PTCacheMem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 166;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;PTCacheMem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, PTCacheMem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'PTCacheMem*'</li>
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
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;PTCacheMem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, PTCacheMem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'PTCacheMem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__frame);
	 * CPointer&lt;Integer&gt; p_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__totpoint);
	 * CPointer&lt;Integer&gt; p_totpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'data_types'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__data_types);
	 * CPointer&lt;Integer&gt; p_data_types = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_types'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_types = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__data);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_data = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__cur);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_cur = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'void*[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{56, 96};

	/**
	 * Field descriptor (offset) for struct member 'extradata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PTCacheMem ptcachemem = ...;
	 * CPointer&lt;Object&gt; p = ptcachemem.__dna__addressof(PTCacheMem.__DNA__FIELD__extradata);
	 * CPointer&lt;ListBase&gt; p_extradata = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extradata'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extradata = new long[]{88, 160};

	public PTCacheMem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PTCacheMem(PTCacheMem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<PTCacheMem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PTCacheMem.class};
		return new CPointer<PTCacheMem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PTCacheMem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<PTCacheMem> next) throws IOException
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
	
	public CPointer<PTCacheMem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PTCacheMem.class};
		return new CPointer<PTCacheMem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PTCacheMem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<PTCacheMem> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'frame'.
	 * @see #__DNA__FIELD__frame
	 */
	
	public int getFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'frame'.
	 * @see #__DNA__FIELD__frame
	 */
	
	public void setFrame(int frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, frame);
		} else {
			__io__block.writeInt(__io__address + 8, frame);
		}
	}

	/**
	 * Get method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public int getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(int totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, totpoint);
		} else {
			__io__block.writeInt(__io__address + 12, totpoint);
		}
	}

	/**
	 * Get method for struct member 'data_types'.
	 * @see #__DNA__FIELD__data_types
	 */
	
	public int getData_types() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'data_types'.
	 * @see #__DNA__FIELD__data_types
	 */
	
	public void setData_types(int data_types) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, data_types);
		} else {
			__io__block.writeInt(__io__address + 16, data_types);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, flag);
		} else {
			__io__block.writeInt(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CArrayFacade<CPointer<Object>> getData() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CArrayFacade<CPointer<Object>> data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data);
		} else {
			__io__generic__copy( getData(), data);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public CArrayFacade<CPointer<Object>> getCur() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BPHYS_TOT_DATA. </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(CArrayFacade<CPointer<Object>> cur) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(cur, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cur)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cur);
		} else {
			__io__generic__copy( getCur(), cur);
		}
	}

	/**
	 * Get method for struct member 'extradata'.
	 * @see #__DNA__FIELD__extradata
	 */
	
	public ListBase getExtradata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'extradata'.
	 * @see #__DNA__FIELD__extradata
	 */
	
	public void setExtradata(ListBase extradata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(extradata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, extradata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, extradata);
		} else {
			__io__generic__copy( getExtradata(), extradata);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PTCacheMem> __io__addressof() {
		return new CPointer<PTCacheMem>(__io__address, new Class[]{PTCacheMem.class}, __io__block, __io__blockTable);
	}

}
