package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MetaStack'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=40)
public class MetaStack extends CFacade {

	/**
	 * This is the sdna index of the struct MetaStack.
	 * <p>
	 * It is required when allocating a new block to store data for MetaStack.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 273;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaStack metastack = ...;
	 * CPointer&lt;Object&gt; p = metastack.__dna__addressof(MetaStack.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MetaStack&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MetaStack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MetaStack*'</li>
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
	 * MetaStack metastack = ...;
	 * CPointer&lt;Object&gt; p = metastack.__dna__addressof(MetaStack.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MetaStack&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MetaStack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MetaStack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'oldbasep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaStack metastack = ...;
	 * CPointer&lt;Object&gt; p = metastack.__dna__addressof(MetaStack.__DNA__FIELD__oldbasep);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_oldbasep = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oldbasep'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oldbasep = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'parseq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaStack metastack = ...;
	 * CPointer&lt;Object&gt; p = metastack.__dna__addressof(MetaStack.__DNA__FIELD__parseq);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_parseq = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parseq'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parseq = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'disp_range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the startdisp/enddisp when entering the meta </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MetaStack metastack = ...;
	 * CPointer&lt;Object&gt; p = metastack.__dna__addressof(MetaStack.__DNA__FIELD__disp_range);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_disp_range = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp_range'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp_range = new long[]{16, 32};

	public MetaStack(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MetaStack(MetaStack that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MetaStack> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MetaStack.class};
		return new CPointer<MetaStack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MetaStack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MetaStack> next) throws IOException
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
	
	public CPointer<MetaStack> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MetaStack.class};
		return new CPointer<MetaStack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MetaStack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MetaStack> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'oldbasep'.
	 * @see #__DNA__FIELD__oldbasep
	 */
	
	public CPointer<ListBase> getOldbasep() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'oldbasep'.
	 * @see #__DNA__FIELD__oldbasep
	 */
	
	public void setOldbasep(CPointer<ListBase> oldbasep) throws IOException
	{
		long __address = ((oldbasep == null) ? 0 : oldbasep.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'parseq'.
	 * @see #__DNA__FIELD__parseq
	 */
	
	public CPointer<Sequence> getParseq() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parseq'.
	 * @see #__DNA__FIELD__parseq
	 */
	
	public void setParseq(CPointer<Sequence> parseq) throws IOException
	{
		long __address = ((parseq == null) ? 0 : parseq.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'disp_range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the startdisp/enddisp when entering the meta </p>
	 * @see #__DNA__FIELD__disp_range
	 */
	
	public CArrayFacade<Integer> getDisp_range() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disp_range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the startdisp/enddisp when entering the meta </p>
	 * @see #__DNA__FIELD__disp_range
	 */
	
	public void setDisp_range(CArrayFacade<Integer> disp_range) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(disp_range, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disp_range)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disp_range);
		} else {
			__io__generic__copy( getDisp_range(), disp_range);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MetaStack> __io__addressof() {
		return new CPointer<MetaStack>(__io__address, new Class[]{MetaStack.class}, __io__block, __io__blockTable);
	}

}
