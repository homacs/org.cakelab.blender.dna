package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> A Constraint </p>
 */

@CMetaData(size32=172, size64=192)
public class bConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 354;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bConstraint&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bConstraint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bConstraint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bConstraint&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bConstraint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bConstraint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint data (a valid constraint type). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint type. <br/> 
	 *  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag - General Settings. <br/> 
	 *  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{14, 26};

	/**
	 * Field descriptor (offset) for struct member 'ownspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that owner should be evaluated in. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__ownspace);
	 * CPointer&lt;Byte&gt; p_ownspace = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ownspace'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ownspace = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'tarspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that target should be evaluated in (only used if 1 target). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__tarspace);
	 * CPointer&lt;Byte&gt; p_tarspace = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tarspace'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tarspace = new long[]{17, 29};

	/**
	 * Field descriptor (offset) for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An "expand" bit for each of the constraint's (sub)panels (uiPanelDataExpansion). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__ui_expand_flag);
	 * CPointer&lt;Short&gt; p_ui_expand_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_expand_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_expand_flag = new long[]{18, 30};

	/**
	 * Field descriptor (offset) for struct member 'space_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to use as target for Custom Space of owner. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__space_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_space_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_object = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'space_subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtarget for Custom Space of owner - pchan or vgroup name, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__space_subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_space_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_subtarget = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint name, MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'enforce'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of influence exerted by constraint (0.0-1.0). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__enforce);
	 * CPointer&lt;Float&gt; p_enforce = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'enforce'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__enforce = new long[]{152, 168};

	/**
	 * Field descriptor (offset) for struct member 'headtail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  bone where the actual target is. 0=head (default for all), 1=tail. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__headtail);
	 * CPointer&lt;Float&gt; p_headtail = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'headtail'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__headtail = new long[]{156, 172};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5. Local influence ipo or driver 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{160, 176};

	/**
	 * Field descriptor (offset) for struct member 'lin_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> below are readonly fields that are set at runtime by the solver for use in the GE (only IK atm) Residual error on constraint expressed in blender unit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__lin_error);
	 * CPointer&lt;Float&gt; p_lin_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lin_error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lin_error = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'rot_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Residual error on constraint expressed in radiant. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraint bconstraint = ...;
	 * CPointer&lt;Object&gt; p = bconstraint.__dna__addressof(bConstraint.__DNA__FIELD__rot_error);
	 * CPointer&lt;Float&gt; p_rot_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot_error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot_error = new long[]{168, 188};

	public bConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bConstraint(bConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bConstraint> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bConstraint.class};
		return new CPointer<bConstraint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bConstraint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bConstraint> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<bConstraint> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bConstraint.class};
		return new CPointer<bConstraint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bConstraint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bConstraint> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint data (a valid constraint type). </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint data (a valid constraint type). </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint type. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint type. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, type);
		} else {
			__io__block.writeShort(__io__address + 12, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag - General Settings. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag - General Settings. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, flag);
		} else {
			__io__block.writeShort(__io__address + 14, flag);
		}
	}

	/**
	 * Get method for struct member 'ownspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that owner should be evaluated in. </p>
	 * @see #__DNA__FIELD__ownspace
	 */
	
	public byte getOwnspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 28);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'ownspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that owner should be evaluated in. </p>
	 * @see #__DNA__FIELD__ownspace
	 */
	
	public void setOwnspace(byte ownspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 28, ownspace);
		} else {
			__io__block.writeByte(__io__address + 16, ownspace);
		}
	}

	/**
	 * Get method for struct member 'tarspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that target should be evaluated in (only used if 1 target). </p>
	 * @see #__DNA__FIELD__tarspace
	 */
	
	public byte getTarspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 29);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'tarspace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space that target should be evaluated in (only used if 1 target). </p>
	 * @see #__DNA__FIELD__tarspace
	 */
	
	public void setTarspace(byte tarspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 29, tarspace);
		} else {
			__io__block.writeByte(__io__address + 17, tarspace);
		}
	}

	/**
	 * Get method for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An "expand" bit for each of the constraint's (sub)panels (uiPanelDataExpansion). </p>
	 * @see #__DNA__FIELD__ui_expand_flag
	 */
	
	public short getUi_expand_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> An "expand" bit for each of the constraint's (sub)panels (uiPanelDataExpansion). </p>
	 * @see #__DNA__FIELD__ui_expand_flag
	 */
	
	public void setUi_expand_flag(short ui_expand_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, ui_expand_flag);
		} else {
			__io__block.writeShort(__io__address + 18, ui_expand_flag);
		}
	}

	/**
	 * Get method for struct member 'space_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to use as target for Custom Space of owner. </p>
	 * @see #__DNA__FIELD__space_object
	 */
	
	public CPointer<BlenderObject> getSpace_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'space_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to use as target for Custom Space of owner. </p>
	 * @see #__DNA__FIELD__space_object
	 */
	
	public void setSpace_object(CPointer<BlenderObject> space_object) throws IOException
	{
		long __address = ((space_object == null) ? 0 : space_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'space_subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtarget for Custom Space of owner - pchan or vgroup name, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__space_subtarget
	 */
	
	public CArrayFacade<Byte> getSpace_subtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'space_subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtarget for Custom Space of owner - pchan or vgroup name, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__space_subtarget
	 */
	
	public void setSpace_subtarget(CArrayFacade<Byte> space_subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(space_subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, space_subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, space_subtarget);
		} else {
			__io__generic__copy( getSpace_subtarget(), space_subtarget);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint name, MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Constraint name, MAX_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 88;
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
	 * Get method for struct member 'enforce'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of influence exerted by constraint (0.0-1.0). </p>
	 * @see #__DNA__FIELD__enforce
	 */
	
	public float getEnforce() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'enforce'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount of influence exerted by constraint (0.0-1.0). </p>
	 * @see #__DNA__FIELD__enforce
	 */
	
	public void setEnforce(float enforce) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, enforce);
		} else {
			__io__block.writeFloat(__io__address + 152, enforce);
		}
	}

	/**
	 * Get method for struct member 'headtail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  bone where the actual target is. 0=head (default for all), 1=tail. </p>
	 * @see #__DNA__FIELD__headtail
	 */
	
	public float getHeadtail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'headtail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  bone where the actual target is. 0=head (default for all), 1=tail. </p>
	 * @see #__DNA__FIELD__headtail
	 */
	
	public void setHeadtail(float headtail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, headtail);
		} else {
			__io__block.writeFloat(__io__address + 156, headtail);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5. Local influence ipo or driver 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5. Local influence ipo or driver 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'lin_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> below are readonly fields that are set at runtime by the solver for use in the GE (only IK atm) Residual error on constraint expressed in blender unit. </p>
	 * @see #__DNA__FIELD__lin_error
	 */
	
	public float getLin_error() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'lin_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> below are readonly fields that are set at runtime by the solver for use in the GE (only IK atm) Residual error on constraint expressed in blender unit. </p>
	 * @see #__DNA__FIELD__lin_error
	 */
	
	public void setLin_error(float lin_error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, lin_error);
		} else {
			__io__block.writeFloat(__io__address + 164, lin_error);
		}
	}

	/**
	 * Get method for struct member 'rot_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Residual error on constraint expressed in radiant. </p>
	 * @see #__DNA__FIELD__rot_error
	 */
	
	public float getRot_error() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'rot_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Residual error on constraint expressed in radiant. </p>
	 * @see #__DNA__FIELD__rot_error
	 */
	
	public void setRot_error(float rot_error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, rot_error);
		} else {
			__io__block.writeFloat(__io__address + 168, rot_error);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bConstraint> __io__addressof() {
		return new CPointer<bConstraint>(__io__address, new Class[]{bConstraint.class}, __io__block, __io__blockTable);
	}

}
