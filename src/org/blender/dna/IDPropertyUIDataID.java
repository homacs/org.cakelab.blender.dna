package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDPropertyUIDataID'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> IDP_UI_DATA_TYPE_ID </p>
 */

@CMetaData(size32=12, size64=16)
public class IDPropertyUIDataID extends CFacade {

	/**
	 * This is the sdna index of the struct IDPropertyUIDataID.
	 * <p>
	 * It is required when allocating a new block to store data for IDPropertyUIDataID.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 14;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataID idpropertyuidataid = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidataid.__dna__addressof(IDPropertyUIDataID.__DNA__FIELD__base);
	 * CPointer&lt;IDPropertyUIData&gt; p_base = p.cast(new Class[]{IDPropertyUIData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'IDPropertyUIData'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	public IDPropertyUIDataID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDPropertyUIDataID(IDPropertyUIDataID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public IDPropertyUIData getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new IDPropertyUIData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new IDPropertyUIData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(IDPropertyUIData base) throws IOException
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDPropertyUIDataID> __io__addressof() {
		return new CPointer<IDPropertyUIDataID>(__io__address, new Class[]{IDPropertyUIDataID.class}, __io__block, __io__blockTable);
	}

}
