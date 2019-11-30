package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ScrArea_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class ScrArea_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct ScrArea_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for ScrArea_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 268;

	/**
	 * Field descriptor (offset) for struct member 'tool'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea_Runtime scrarea_runtime = ...;
	 * CPointer&lt;Object&gt; p = scrarea_runtime.__dna__addressof(ScrArea_Runtime.__DNA__FIELD__tool);
	 * CPointer&lt;CPointer&lt;bToolRef&gt;&gt; p_tool = p.cast(new Class[]{CPointer.class, bToolRef.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tool'</li>
	 * <li>Signature: 'bToolRef*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tool = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'is_tool_set'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea_Runtime scrarea_runtime = ...;
	 * CPointer&lt;Object&gt; p = scrarea_runtime.__dna__addressof(ScrArea_Runtime.__DNA__FIELD__is_tool_set);
	 * CPointer&lt;Byte&gt; p_is_tool_set = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_tool_set'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_tool_set = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea_Runtime scrarea_runtime = ...;
	 * CPointer&lt;Object&gt; p = scrarea_runtime.__dna__addressof(ScrArea_Runtime.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{5, 9};

	public ScrArea_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ScrArea_Runtime(ScrArea_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tool'.
	 * @see #__DNA__FIELD__tool
	 */
	
	public CPointer<bToolRef> getTool() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bToolRef.class};
		return new CPointer<bToolRef>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bToolRef.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tool'.
	 * @see #__DNA__FIELD__tool
	 */
	
	public void setTool(CPointer<bToolRef> tool) throws IOException
	{
		long __address = ((tool == null) ? 0 : tool.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'is_tool_set'.
	 * @see #__DNA__FIELD__is_tool_set
	 */
	
	public byte getIs_tool_set() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'is_tool_set'.
	 * @see #__DNA__FIELD__is_tool_set
	 */
	
	public void setIs_tool_set(byte is_tool_set) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, is_tool_set);
		} else {
			__io__block.writeByte(__io__address + 4, is_tool_set);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 5, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9;
		} else {
			__dna__offset = 5;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ScrArea_Runtime> __io__addressof() {
		return new CPointer<ScrArea_Runtime>(__io__address, new Class[]{ScrArea_Runtime.class}, __io__block, __io__blockTable);
	}

}
