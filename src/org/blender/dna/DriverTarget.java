package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DriverTarget'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Drivers --------------------------------<mdash/><mdash/>  Driver Target (dtar)</p><p> Defines how to access a dependency needed for a driver variable. </p>
 */

@CMetaData(size32=80, size64=88)
public class DriverTarget extends CFacade {

	/**
	 * This is the sdna index of the struct DriverTarget.
	 * <p>
	 * It is required when allocating a new block to store data for DriverTarget.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 523;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block that the specific property used can be found from (id_type property must be set first)<h4>Blender Source Code:</h4>
	 * <p> ID-block which owns the target, no user count. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__id);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_id = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA path defining the setting to use (for DVAR_TYPE_SINGLE_PROP). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__rna_path);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_rna_path = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rna_path'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rna_path = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'pchan_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the posebone to use (for vars where DTAR_FLAG_STRUCT_REF is used) - MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__pchan_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pchan_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pchan_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pchan_name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'transChan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform channel index (for DVAR_TYPE_TRANSFORM_CHAN.) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__transChan);
	 * CPointer&lt;Short&gt; p_transChan = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transChan'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transChan = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the validity of the target (NOTE: these get reset every time the types change). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{74, 82};

	/**
	 * Field descriptor (offset) for struct member 'idtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-block that this target can use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverTarget drivertarget = ...;
	 * CPointer&lt;Object&gt; p = drivertarget.__dna__addressof(DriverTarget.__DNA__FIELD__idtype);
	 * CPointer&lt;Integer&gt; p_idtype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idtype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idtype = new long[]{76, 84};

	public DriverTarget(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DriverTarget(DriverTarget that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block that the specific property used can be found from (id_type property must be set first)<h4>Blender Source Code:</h4>
	 * <p> ID-block which owns the target, no user count. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public CPointer<ID> getId() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block that the specific property used can be found from (id_type property must be set first)<h4>Blender Source Code:</h4>
	 * <p> ID-block which owns the target, no user count. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(CPointer<ID> id) throws IOException
	{
		long __address = ((id == null) ? 0 : id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA path defining the setting to use (for DVAR_TYPE_SINGLE_PROP). </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public CPointer<Byte> getRna_path() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA path defining the setting to use (for DVAR_TYPE_SINGLE_PROP). </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public void setRna_path(CPointer<Byte> rna_path) throws IOException
	{
		long __address = ((rna_path == null) ? 0 : rna_path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'pchan_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the posebone to use (for vars where DTAR_FLAG_STRUCT_REF is used) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__pchan_name
	 */
	
	public CArrayFacade<Byte> getPchan_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pchan_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the posebone to use (for vars where DTAR_FLAG_STRUCT_REF is used) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__pchan_name
	 */
	
	public void setPchan_name(CArrayFacade<Byte> pchan_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(pchan_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pchan_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pchan_name);
		} else {
			__io__generic__copy( getPchan_name(), pchan_name);
		}
	}

	/**
	 * Get method for struct member 'transChan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform channel index (for DVAR_TYPE_TRANSFORM_CHAN.) </p>
	 * @see #__DNA__FIELD__transChan
	 */
	
	public short getTransChan() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 80);
		} else {
			return __io__block.readShort(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'transChan'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform channel index (for DVAR_TYPE_TRANSFORM_CHAN.) </p>
	 * @see #__DNA__FIELD__transChan
	 */
	
	public void setTransChan(short transChan) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 80, transChan);
		} else {
			__io__block.writeShort(__io__address + 72, transChan);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the validity of the target (NOTE: these get reset every time the types change). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 82);
		} else {
			return __io__block.readShort(__io__address + 74);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the validity of the target (NOTE: these get reset every time the types change). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 82, flag);
		} else {
			__io__block.writeShort(__io__address + 74, flag);
		}
	}

	/**
	 * Get method for struct member 'idtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-block that this target can use. </p>
	 * @see #__DNA__FIELD__idtype
	 */
	
	public int getIdtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'idtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-block that this target can use. </p>
	 * @see #__DNA__FIELD__idtype
	 */
	
	public void setIdtype(int idtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, idtype);
		} else {
			__io__block.writeInt(__io__address + 76, idtype);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DriverTarget> __io__addressof() {
		return new CPointer<DriverTarget>(__io__address, new Class[]{DriverTarget.class}, __io__block, __io__blockTable);
	}

}
