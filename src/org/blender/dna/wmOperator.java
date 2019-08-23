package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmOperator'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> This one is the operator itself, stored in files for macros etc. operator + operator-type should be able to redo entirely, but for different context's. </p>
 */

@CMetaData(size32=120, size64=168)
public class wmOperator extends CFacade {

	/**
	 * This is the sdna index of the struct wmOperator.
	 * <p>
	 * It is required when allocating a new block to store data for wmOperator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 512;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmOperator&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmOperator.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmOperator*'</li>
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
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmOperator&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmOperator.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmOperator*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved Used to retrieve type pointer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Saved, user-settable properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Operator type definition from idname. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'wmOperatorType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'customdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom storage, only while operator runs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__customdata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_customdata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Python stores the class instance here. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__py_instance);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_instance = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_instance'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_instance = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__ptr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ptr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptr'</li>
	 * <li>Signature: 'PointerRNA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptr = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Errors and warnings storage. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__reports);
	 * CPointer&lt;CPointer&lt;ReportList&gt;&gt; p_reports = p.cast(new Class[]{CPointer.class, ReportList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reports'</li>
	 * <li>Signature: 'ReportList*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reports = new long[]{92, 120};

	/**
	 * Field descriptor (offset) for struct member 'macro'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of operators, can be a tree. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__macro);
	 * CPointer&lt;ListBase&gt; p_macro = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'macro'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__macro = new long[]{96, 128};

	/**
	 * Field descriptor (offset) for struct member 'opm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current running macro, not saved. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__opm);
	 * CPointer&lt;CPointer&lt;wmOperator&gt;&gt; p_opm = p.cast(new Class[]{CPointer.class, wmOperator.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opm'</li>
	 * <li>Signature: 'wmOperator*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opm = new long[]{104, 144};

	/**
	 * Field descriptor (offset) for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__layout);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_layout = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layout'</li>
	 * <li>Signature: 'uiLayout*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layout = new long[]{108, 152};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{112, 160};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmOperator wmoperator = ...;
	 * CPointer&lt;Object&gt; p = wmoperator.__dna__addressof(wmOperator.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{114, 162};

	public wmOperator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmOperator(wmOperator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmOperator> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmOperator.class};
		return new CPointer<wmOperator>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmOperator.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmOperator> next) throws IOException
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
	
	public CPointer<wmOperator> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmOperator.class};
		return new CPointer<wmOperator>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmOperator.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmOperator> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved Used to retrieve type pointer. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved Used to retrieve type pointer. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname);
		} else {
			__io__generic__copy( getIdname(), idname);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Saved, user-settable properties. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Saved, user-settable properties. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Operator type definition from idname. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Operator type definition from idname. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'customdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom storage, only while operator runs. </p>
	 * @see #__DNA__FIELD__customdata
	 */
	
	public CPointer<Object> getCustomdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'customdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom storage, only while operator runs. </p>
	 * @see #__DNA__FIELD__customdata
	 */
	
	public void setCustomdata(CPointer<Object> customdata) throws IOException
	{
		long __address = ((customdata == null) ? 0 : customdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Python stores the class instance here. </p>
	 * @see #__DNA__FIELD__py_instance
	 */
	
	public CPointer<Object> getPy_instance() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_instance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Python stores the class instance here. </p>
	 * @see #__DNA__FIELD__py_instance
	 */
	
	public void setPy_instance(CPointer<Object> py_instance) throws IOException
	{
		long __address = ((py_instance == null) ? 0 : py_instance.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * @see #__DNA__FIELD__ptr
	 */
	
	public CPointer<Object> getPtr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * @see #__DNA__FIELD__ptr
	 */
	
	public void setPtr(CPointer<Object> ptr) throws IOException
	{
		long __address = ((ptr == null) ? 0 : ptr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Errors and warnings storage. </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public CPointer<ReportList> getReports() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ReportList.class};
		return new CPointer<ReportList>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ReportList.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Errors and warnings storage. </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public void setReports(CPointer<ReportList> reports) throws IOException
	{
		long __address = ((reports == null) ? 0 : reports.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'macro'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of operators, can be a tree. </p>
	 * @see #__DNA__FIELD__macro
	 */
	
	public ListBase getMacro() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'macro'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of operators, can be a tree. </p>
	 * @see #__DNA__FIELD__macro
	 */
	
	public void setMacro(ListBase macro) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(macro, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, macro)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, macro);
		} else {
			__io__generic__copy( getMacro(), macro);
		}
	}

	/**
	 * Get method for struct member 'opm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current running macro, not saved. </p>
	 * @see #__DNA__FIELD__opm
	 */
	
	public CPointer<wmOperator> getOpm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmOperator.class};
		return new CPointer<wmOperator>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmOperator.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'opm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current running macro, not saved. </p>
	 * @see #__DNA__FIELD__opm
	 */
	
	public void setOpm(CPointer<wmOperator> opm) throws IOException
	{
		long __address = ((opm == null) ? 0 : opm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for drawing. </p>
	 * @see #__DNA__FIELD__layout
	 */
	
	public CPointer<Object> getLayout() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for drawing. </p>
	 * @see #__DNA__FIELD__layout
	 */
	
	public void setLayout(CPointer<Object> layout) throws IOException
	{
		long __address = ((layout == null) ? 0 : layout.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, flag);
		} else {
			__io__block.writeShort(__io__address + 112, flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 162, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 114, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 162;
		} else {
			__dna__offset = 114;
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
	public CPointer<wmOperator> __io__addressof() {
		return new CPointer<wmOperator>(__io__address, new Class[]{wmOperator.class}, __io__block, __io__blockTable);
	}

}
