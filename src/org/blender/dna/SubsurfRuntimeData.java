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
 * Generated facet for DNA struct type 'SubsurfRuntimeData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class SubsurfRuntimeData extends CFacade {

	/**
	 * This is the sdna index of the struct SubsurfRuntimeData.
	 * <p>
	 * It is required when allocating a new block to store data for SubsurfRuntimeData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 99;

	/**
	 * Field descriptor (offset) for struct member 'subdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached subdivision surface descriptor, with topology and settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfRuntimeData subsurfruntimedata = ...;
	 * CPointer&lt;Object&gt; p = subsurfruntimedata.__dna__addressof(SubsurfRuntimeData.__DNA__FIELD__subdiv);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_subdiv = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv'</li>
	 * <li>Signature: 'Subdiv*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'set_by_draw_code'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfRuntimeData subsurfruntimedata = ...;
	 * CPointer&lt;Object&gt; p = subsurfruntimedata.__dna__addressof(SubsurfRuntimeData.__DNA__FIELD__set_by_draw_code);
	 * CPointer&lt;Byte&gt; p_set_by_draw_code = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'set_by_draw_code'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__set_by_draw_code = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SubsurfRuntimeData subsurfruntimedata = ...;
	 * CPointer&lt;Object&gt; p = subsurfruntimedata.__dna__addressof(SubsurfRuntimeData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{5, 9};

	public SubsurfRuntimeData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SubsurfRuntimeData(SubsurfRuntimeData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'subdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached subdivision surface descriptor, with topology and settings. </p>
	 * @see #__DNA__FIELD__subdiv
	 */
	
	public CPointer<Object> getSubdiv() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'subdiv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached subdivision surface descriptor, with topology and settings. </p>
	 * @see #__DNA__FIELD__subdiv
	 */
	
	public void setSubdiv(CPointer<Object> subdiv) throws IOException
	{
		long __address = ((subdiv == null) ? 0 : subdiv.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'set_by_draw_code'.
	 * @see #__DNA__FIELD__set_by_draw_code
	 */
	
	public byte getSet_by_draw_code() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'set_by_draw_code'.
	 * @see #__DNA__FIELD__set_by_draw_code
	 */
	
	public void setSet_by_draw_code(byte set_by_draw_code) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, set_by_draw_code);
		} else {
			__io__block.writeByte(__io__address + 4, set_by_draw_code);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 5, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 9;
		} else {
			__dna__offset = 5;
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
	public CPointer<SubsurfRuntimeData> __io__addressof() {
		return new CPointer<SubsurfRuntimeData>(__io__address, new Class[]{SubsurfRuntimeData.class}, __io__block, __io__blockTable);
	}

}
