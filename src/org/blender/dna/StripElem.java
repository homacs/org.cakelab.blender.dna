package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'StripElem'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=264, size64=264)
public class StripElem extends CFacade {

	/**
	 * This is the sdna index of the struct StripElem.
	 * <p>
	 * It is required when allocating a new block to store data for StripElem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 274;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripElem stripelem = ...;
	 * CPointer&lt;Object&gt; p = stripelem.__dna__addressof(StripElem.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'orig_width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripElem stripelem = ...;
	 * CPointer&lt;Object&gt; p = stripelem.__dna__addressof(StripElem.__DNA__FIELD__orig_width);
	 * CPointer&lt;Integer&gt; p_orig_width = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_width'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_width = new long[]{256, 256};

	/**
	 * Field descriptor (offset) for struct member 'orig_height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripElem stripelem = ...;
	 * CPointer&lt;Object&gt; p = stripelem.__dna__addressof(StripElem.__DNA__FIELD__orig_height);
	 * CPointer&lt;Integer&gt; p_orig_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_height = new long[]{260, 260};

	public StripElem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected StripElem(StripElem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'orig_width'.
	 * @see #__DNA__FIELD__orig_width
	 */
	
	public int getOrig_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 256);
		} else {
			return __io__block.readInt(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'orig_width'.
	 * @see #__DNA__FIELD__orig_width
	 */
	
	public void setOrig_width(int orig_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 256, orig_width);
		} else {
			__io__block.writeInt(__io__address + 256, orig_width);
		}
	}

	/**
	 * Get method for struct member 'orig_height'.
	 * @see #__DNA__FIELD__orig_height
	 */
	
	public int getOrig_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 260);
		} else {
			return __io__block.readInt(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'orig_height'.
	 * @see #__DNA__FIELD__orig_height
	 */
	
	public void setOrig_height(int orig_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 260, orig_height);
		} else {
			__io__block.writeInt(__io__address + 260, orig_height);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<StripElem> __io__addressof() {
		return new CPointer<StripElem>(__io__address, new Class[]{StripElem.class}, __io__block, __io__blockTable);
	}

}
