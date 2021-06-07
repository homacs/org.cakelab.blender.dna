package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeConvert'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeAttributeConvert extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeConvert.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeConvert.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 489;

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CustomDataType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeConvert nodeattributeconvert = ...;
	 * CPointer&lt;Object&gt; p = nodeattributeconvert.__dna__addressof(NodeAttributeConvert.__DNA__FIELD__data_type);
	 * CPointer&lt;Byte&gt; p_data_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeConvert nodeattributeconvert = ...;
	 * CPointer&lt;Object&gt; p = nodeattributeconvert.__dna__addressof(NodeAttributeConvert.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeConvert nodeattributeconvert = ...;
	 * CPointer&lt;Object&gt; p = nodeattributeconvert.__dna__addressof(NodeAttributeConvert.__DNA__FIELD__domain);
	 * CPointer&lt;Short&gt; p_domain = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domain'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domain = new long[]{2, 2};

	public NodeAttributeConvert(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeConvert(NodeAttributeConvert that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CustomDataType. </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public byte getData_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CustomDataType. </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public void setData_type(byte data_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, data_type);
		} else {
			__io__block.writeByte(__io__address + 0, data_type);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1;
		} else {
			__dna__offset = 1;
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
	 * Get method for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * @see #__DNA__FIELD__domain
	 */
	
	public short getDomain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * @see #__DNA__FIELD__domain
	 */
	
	public void setDomain(short domain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, domain);
		} else {
			__io__block.writeShort(__io__address + 2, domain);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAttributeConvert> __io__addressof() {
		return new CPointer<NodeAttributeConvert>(__io__address, new Class[]{NodeAttributeConvert.class}, __io__block, __io__blockTable);
	}

}
