package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpreadsheetContextModifier'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=32)
public class SpreadsheetContextModifier extends CFacade {

	/**
	 * This is the sdna index of the struct SpreadsheetContextModifier.
	 * <p>
	 * It is required when allocating a new block to store data for SpreadsheetContextModifier.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 262;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetContextModifier spreadsheetcontextmodifier = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcontextmodifier.__dna__addressof(SpreadsheetContextModifier.__DNA__FIELD__base);
	 * CPointer&lt;SpreadsheetContext&gt; p_base = p.cast(new Class[]{SpreadsheetContext.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'SpreadsheetContext'</li>
	 * <li>Actual Size (32bit/64bit): 16/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'modifier_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetContextModifier spreadsheetcontextmodifier = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcontextmodifier.__dna__addressof(SpreadsheetContextModifier.__DNA__FIELD__modifier_name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_modifier_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier_name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier_name = new long[]{16, 24};

	public SpreadsheetContextModifier(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpreadsheetContextModifier(SpreadsheetContextModifier that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public SpreadsheetContext getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SpreadsheetContext(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new SpreadsheetContext(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(SpreadsheetContext base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'modifier_name'.
	 * @see #__DNA__FIELD__modifier_name
	 */
	
	public CPointer<Byte> getModifier_name() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'modifier_name'.
	 * @see #__DNA__FIELD__modifier_name
	 */
	
	public void setModifier_name(CPointer<Byte> modifier_name) throws IOException
	{
		long __address = ((modifier_name == null) ? 0 : modifier_name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpreadsheetContextModifier> __io__addressof() {
		return new CPointer<SpreadsheetContextModifier>(__io__address, new Class[]{SpreadsheetContextModifier.class}, __io__block, __io__blockTable);
	}

}
