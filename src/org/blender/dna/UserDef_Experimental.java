package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UserDef_Experimental'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class UserDef_Experimental extends CFacade {

	/**
	 * This is the sdna index of the struct UserDef_Experimental.
	 * <p>
	 * It is required when allocating a new block to store data for UserDef_Experimental.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 264;

	/**
	 * Field descriptor (offset) for struct member 'use_undo_legacy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_undo_legacy);
	 * CPointer&lt;Byte&gt; p_use_undo_legacy = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_undo_legacy'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_undo_legacy = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'use_menu_search'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_menu_search);
	 * CPointer&lt;Byte&gt; p_use_menu_search = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_menu_search'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_menu_search = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  does not allow empty structs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{2, 2};

	public UserDef_Experimental(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UserDef_Experimental(UserDef_Experimental that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'use_undo_legacy'.
	 * @see #__DNA__FIELD__use_undo_legacy
	 */
	
	public byte getUse_undo_legacy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'use_undo_legacy'.
	 * @see #__DNA__FIELD__use_undo_legacy
	 */
	
	public void setUse_undo_legacy(byte use_undo_legacy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, use_undo_legacy);
		} else {
			__io__block.writeByte(__io__address + 0, use_undo_legacy);
		}
	}

	/**
	 * Get method for struct member 'use_menu_search'.
	 * @see #__DNA__FIELD__use_menu_search
	 */
	
	public byte getUse_menu_search() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'use_menu_search'.
	 * @see #__DNA__FIELD__use_menu_search
	 */
	
	public void setUse_menu_search(byte use_menu_search) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, use_menu_search);
		} else {
			__io__block.writeByte(__io__address + 1, use_menu_search);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  does not allow empty structs. </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  does not allow empty structs. </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2;
		} else {
			__dna__offset = 2;
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
	public CPointer<UserDef_Experimental> __io__addressof() {
		return new CPointer<UserDef_Experimental>(__io__address, new Class[]{UserDef_Experimental.class}, __io__block, __io__blockTable);
	}

}
