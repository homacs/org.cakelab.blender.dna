package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Multires'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=420, size64=464)
public class Multires extends CFacade {

	/**
	 * This is the sdna index of the struct Multires.
	 * <p>
	 * It is required when allocating a new block to store data for Multires.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 89;

	/**
	 * Field descriptor (offset) for struct member 'levels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__levels);
	 * CPointer&lt;ListBase&gt; p_levels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'levels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__levels = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'verts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__verts);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_verts = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'verts'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__verts = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'level_count'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__level_count);
	 * CPointer&lt;Byte&gt; p_level_count = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'level_count'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__level_count = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'current'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__current);
	 * CPointer&lt;Byte&gt; p_current = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'current'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__current = new long[]{13, 25};

	/**
	 * Field descriptor (offset) for struct member 'newlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__newlvl);
	 * CPointer&lt;Byte&gt; p_newlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'newlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__newlvl = new long[]{14, 26};

	/**
	 * Field descriptor (offset) for struct member 'edgelvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__edgelvl);
	 * CPointer&lt;Byte&gt; p_edgelvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgelvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgelvl = new long[]{15, 27};

	/**
	 * Field descriptor (offset) for struct member 'pinlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__pinlvl);
	 * CPointer&lt;Byte&gt; p_pinlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pinlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pinlvl = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'renderlvl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__renderlvl);
	 * CPointer&lt;Byte&gt; p_renderlvl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderlvl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderlvl = new long[]{17, 29};

	/**
	 * Field descriptor (offset) for struct member 'use_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__use_col);
	 * CPointer&lt;Byte&gt; p_use_col = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_col'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_col = new long[]{18, 30};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{19, 31};

	/**
	 * Field descriptor (offset) for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Special level 1 data that cannot be modified from other levels </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__vdata);
	 * CPointer&lt;CustomData&gt; p_vdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vdata = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'fdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__fdata);
	 * CPointer&lt;CustomData&gt; p_fdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 196/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fdata = new long[]{216, 240};

	/**
	 * Field descriptor (offset) for struct member 'edge_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__edge_flags);
	 * CPointer&lt;CPointer&lt;Short&gt;&gt; p_edge_flags = p.cast(new Class[]{CPointer.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_flags'</li>
	 * <li>Signature: 'short*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_flags = new long[]{412, 448};

	/**
	 * Field descriptor (offset) for struct member 'edge_creases'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Multires multires = ...;
	 * CPointer&lt;Object&gt; p = multires.__dna__addressof(Multires.__DNA__FIELD__edge_creases);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_edge_creases = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_creases'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_creases = new long[]{416, 456};

	public Multires(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Multires(Multires that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public ListBase getLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'levels'.
	 * @see #__DNA__FIELD__levels
	 */
	
	public void setLevels(ListBase levels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(levels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, levels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, levels);
		} else {
			__io__generic__copy( getLevels(), levels);
		}
	}

	/**
	 * Get method for struct member 'verts'.
	 * @see #__DNA__FIELD__verts
	 */
	
	public CPointer<MVert> getVerts() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'verts'.
	 * @see #__DNA__FIELD__verts
	 */
	
	public void setVerts(CPointer<MVert> verts) throws IOException
	{
		long __address = ((verts == null) ? 0 : verts.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'level_count'.
	 * @see #__DNA__FIELD__level_count
	 */
	
	public byte getLevel_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 24);
		} else {
			return __io__block.readByte(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'level_count'.
	 * @see #__DNA__FIELD__level_count
	 */
	
	public void setLevel_count(byte level_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 24, level_count);
		} else {
			__io__block.writeByte(__io__address + 12, level_count);
		}
	}

	/**
	 * Get method for struct member 'current'.
	 * @see #__DNA__FIELD__current
	 */
	
	public byte getCurrent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 25);
		} else {
			return __io__block.readByte(__io__address + 13);
		}
	}

	/**
	 * Set method for struct member 'current'.
	 * @see #__DNA__FIELD__current
	 */
	
	public void setCurrent(byte current) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 25, current);
		} else {
			__io__block.writeByte(__io__address + 13, current);
		}
	}

	/**
	 * Get method for struct member 'newlvl'.
	 * @see #__DNA__FIELD__newlvl
	 */
	
	public byte getNewlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 26);
		} else {
			return __io__block.readByte(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'newlvl'.
	 * @see #__DNA__FIELD__newlvl
	 */
	
	public void setNewlvl(byte newlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 26, newlvl);
		} else {
			__io__block.writeByte(__io__address + 14, newlvl);
		}
	}

	/**
	 * Get method for struct member 'edgelvl'.
	 * @see #__DNA__FIELD__edgelvl
	 */
	
	public byte getEdgelvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 27);
		} else {
			return __io__block.readByte(__io__address + 15);
		}
	}

	/**
	 * Set method for struct member 'edgelvl'.
	 * @see #__DNA__FIELD__edgelvl
	 */
	
	public void setEdgelvl(byte edgelvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 27, edgelvl);
		} else {
			__io__block.writeByte(__io__address + 15, edgelvl);
		}
	}

	/**
	 * Get method for struct member 'pinlvl'.
	 * @see #__DNA__FIELD__pinlvl
	 */
	
	public byte getPinlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 28);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pinlvl'.
	 * @see #__DNA__FIELD__pinlvl
	 */
	
	public void setPinlvl(byte pinlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 28, pinlvl);
		} else {
			__io__block.writeByte(__io__address + 16, pinlvl);
		}
	}

	/**
	 * Get method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public byte getRenderlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 29);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'renderlvl'.
	 * @see #__DNA__FIELD__renderlvl
	 */
	
	public void setRenderlvl(byte renderlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 29, renderlvl);
		} else {
			__io__block.writeByte(__io__address + 17, renderlvl);
		}
	}

	/**
	 * Get method for struct member 'use_col'.
	 * @see #__DNA__FIELD__use_col
	 */
	
	public byte getUse_col() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 30);
		} else {
			return __io__block.readByte(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'use_col'.
	 * @see #__DNA__FIELD__use_col
	 */
	
	public void setUse_col(byte use_col) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 30, use_col);
		} else {
			__io__block.writeByte(__io__address + 18, use_col);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 31);
		} else {
			return __io__block.readByte(__io__address + 19);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 31, flag);
		} else {
			__io__block.writeByte(__io__address + 19, flag);
		}
	}

	/**
	 * Get method for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Special level 1 data that cannot be modified from other levels </p>
	 * @see #__DNA__FIELD__vdata
	 */
	
	public CustomData getVdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 20, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Special level 1 data that cannot be modified from other levels </p>
	 * @see #__DNA__FIELD__vdata
	 */
	
	public void setVdata(CustomData vdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(vdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vdata);
		} else {
			__io__generic__copy( getVdata(), vdata);
		}
	}

	/**
	 * Get method for struct member 'fdata'.
	 * @see #__DNA__FIELD__fdata
	 */
	
	public CustomData getFdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 240, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 216, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fdata'.
	 * @see #__DNA__FIELD__fdata
	 */
	
	public void setFdata(CustomData fdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(fdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fdata);
		} else {
			__io__generic__copy( getFdata(), fdata);
		}
	}

	/**
	 * Get method for struct member 'edge_flags'.
	 * @see #__DNA__FIELD__edge_flags
	 */
	
	public CPointer<Short> getEdge_flags() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 448);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 412);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		return new CPointer<Short>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edge_flags'.
	 * @see #__DNA__FIELD__edge_flags
	 */
	
	public void setEdge_flags(CPointer<Short> edge_flags) throws IOException
	{
		long __address = ((edge_flags == null) ? 0 : edge_flags.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 448, __address);
		} else {
			__io__block.writeLong(__io__address + 412, __address);
		}
	}

	/**
	 * Get method for struct member 'edge_creases'.
	 * @see #__DNA__FIELD__edge_creases
	 */
	
	public CPointer<Byte> getEdge_creases() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 456);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 416);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edge_creases'.
	 * @see #__DNA__FIELD__edge_creases
	 */
	
	public void setEdge_creases(CPointer<Byte> edge_creases) throws IOException
	{
		long __address = ((edge_creases == null) ? 0 : edge_creases.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 456, __address);
		} else {
			__io__block.writeLong(__io__address + 416, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Multires> __io__addressof() {
		return new CPointer<Multires>(__io__address, new Class[]{Multires.class}, __io__block, __io__blockTable);
	}

}
