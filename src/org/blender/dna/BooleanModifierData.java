package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BooleanModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=144)
public class BooleanModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct BooleanModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for BooleanModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 122;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 104/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'collection'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__collection);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_collection = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'double_threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__double_threshold);
	 * CPointer&lt;Float&gt; p_double_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'double_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__double_threshold = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'operation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__operation);
	 * CPointer&lt;Byte&gt; p_operation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operation'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operation = new long[]{116, 140};

	/**
	 * Field descriptor (offset) for struct member 'solver'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__solver);
	 * CPointer&lt;Byte&gt; p_solver = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver = new long[]{117, 141};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{118, 142};

	/**
	 * Field descriptor (offset) for struct member 'bm_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BooleanModifierData booleanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = booleanmodifierdata.__dna__addressof(BooleanModifierData.__DNA__FIELD__bm_flag);
	 * CPointer&lt;Byte&gt; p_bm_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bm_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bm_flag = new long[]{119, 143};

	public BooleanModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BooleanModifierData(BooleanModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'collection'.
	 * @see #__DNA__FIELD__collection
	 */
	
	public CPointer<Collection> getCollection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collection'.
	 * @see #__DNA__FIELD__collection
	 */
	
	public void setCollection(CPointer<Collection> collection) throws IOException
	{
		long __address = ((collection == null) ? 0 : collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'double_threshold'.
	 * @see #__DNA__FIELD__double_threshold
	 */
	
	public float getDouble_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'double_threshold'.
	 * @see #__DNA__FIELD__double_threshold
	 */
	
	public void setDouble_threshold(float double_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, double_threshold);
		} else {
			__io__block.writeFloat(__io__address + 112, double_threshold);
		}
	}

	/**
	 * Get method for struct member 'operation'.
	 * @see #__DNA__FIELD__operation
	 */
	
	public byte getOperation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 140);
		} else {
			return __io__block.readByte(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'operation'.
	 * @see #__DNA__FIELD__operation
	 */
	
	public void setOperation(byte operation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 140, operation);
		} else {
			__io__block.writeByte(__io__address + 116, operation);
		}
	}

	/**
	 * Get method for struct member 'solver'.
	 * @see #__DNA__FIELD__solver
	 */
	
	public byte getSolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 141);
		} else {
			return __io__block.readByte(__io__address + 117);
		}
	}

	/**
	 * Set method for struct member 'solver'.
	 * @see #__DNA__FIELD__solver
	 */
	
	public void setSolver(byte solver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 141, solver);
		} else {
			__io__block.writeByte(__io__address + 117, solver);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 142);
		} else {
			return __io__block.readByte(__io__address + 118);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 142, flag);
		} else {
			__io__block.writeByte(__io__address + 118, flag);
		}
	}

	/**
	 * Get method for struct member 'bm_flag'.
	 * @see #__DNA__FIELD__bm_flag
	 */
	
	public byte getBm_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 143);
		} else {
			return __io__block.readByte(__io__address + 119);
		}
	}

	/**
	 * Set method for struct member 'bm_flag'.
	 * @see #__DNA__FIELD__bm_flag
	 */
	
	public void setBm_flag(byte bm_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 143, bm_flag);
		} else {
			__io__block.writeByte(__io__address + 119, bm_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BooleanModifierData> __io__addressof() {
		return new CPointer<BooleanModifierData>(__io__address, new Class[]{BooleanModifierData.class}, __io__block, __io__blockTable);
	}

}
