package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bRigidBodyJointConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Rigid Body constraint </p>
 */

@CMetaData(size32=96, size64=104)
public class bRigidBodyJointConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bRigidBodyJointConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bRigidBodyJointConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 345;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'child'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__child);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_child = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'pivX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__pivX);
	 * CPointer&lt;Float&gt; p_pivX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivX = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'pivY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__pivY);
	 * CPointer&lt;Float&gt; p_pivY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivY = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pivZ'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__pivZ);
	 * CPointer&lt;Float&gt; p_pivZ = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivZ'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivZ = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'axX'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__axX);
	 * CPointer&lt;Float&gt; p_axX = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axX'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axX = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'axY'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__axY);
	 * CPointer&lt;Float&gt; p_axY = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axY'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axY = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'axZ'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__axZ);
	 * CPointer&lt;Float&gt; p_axZ = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axZ'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axZ = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'minLimit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__minLimit);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_minLimit = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minLimit'</li>
	 * <li>Signature: 'float[6]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minLimit = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'maxLimit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__maxLimit);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_maxLimit = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxLimit'</li>
	 * <li>Signature: 'float[6]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxLimit = new long[]{60, 68};

	/**
	 * Field descriptor (offset) for struct member 'extraFz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__extraFz);
	 * CPointer&lt;Float&gt; p_extraFz = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extraFz'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extraFz = new long[]{84, 92};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRigidBodyJointConstraint brigidbodyjointconstraint = ...;
	 * CPointer&lt;Object&gt; p = brigidbodyjointconstraint.__dna__addressof(bRigidBodyJointConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{90, 98};

	public bRigidBodyJointConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bRigidBodyJointConstraint(bRigidBodyJointConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public CPointer<BlenderObject> getChild() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public void setChild(CPointer<BlenderObject> child) throws IOException
	{
		long __address = ((child == null) ? 0 : child.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, type);
		} else {
			__io__block.writeInt(__io__address + 8, type);
		}
	}

	/**
	 * Get method for struct member 'pivX'.
	 * @see #__DNA__FIELD__pivX
	 */
	
	public float getPivX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pivX'.
	 * @see #__DNA__FIELD__pivX
	 */
	
	public void setPivX(float pivX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, pivX);
		} else {
			__io__block.writeFloat(__io__address + 12, pivX);
		}
	}

	/**
	 * Get method for struct member 'pivY'.
	 * @see #__DNA__FIELD__pivY
	 */
	
	public float getPivY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pivY'.
	 * @see #__DNA__FIELD__pivY
	 */
	
	public void setPivY(float pivY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, pivY);
		} else {
			__io__block.writeFloat(__io__address + 16, pivY);
		}
	}

	/**
	 * Get method for struct member 'pivZ'.
	 * @see #__DNA__FIELD__pivZ
	 */
	
	public float getPivZ() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pivZ'.
	 * @see #__DNA__FIELD__pivZ
	 */
	
	public void setPivZ(float pivZ) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, pivZ);
		} else {
			__io__block.writeFloat(__io__address + 20, pivZ);
		}
	}

	/**
	 * Get method for struct member 'axX'.
	 * @see #__DNA__FIELD__axX
	 */
	
	public float getAxX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'axX'.
	 * @see #__DNA__FIELD__axX
	 */
	
	public void setAxX(float axX) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, axX);
		} else {
			__io__block.writeFloat(__io__address + 24, axX);
		}
	}

	/**
	 * Get method for struct member 'axY'.
	 * @see #__DNA__FIELD__axY
	 */
	
	public float getAxY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'axY'.
	 * @see #__DNA__FIELD__axY
	 */
	
	public void setAxY(float axY) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, axY);
		} else {
			__io__block.writeFloat(__io__address + 28, axY);
		}
	}

	/**
	 * Get method for struct member 'axZ'.
	 * @see #__DNA__FIELD__axZ
	 */
	
	public float getAxZ() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'axZ'.
	 * @see #__DNA__FIELD__axZ
	 */
	
	public void setAxZ(float axZ) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, axZ);
		} else {
			__io__block.writeFloat(__io__address + 32, axZ);
		}
	}

	/**
	 * Get method for struct member 'minLimit'.
	 * @see #__DNA__FIELD__minLimit
	 */
	
	public CArrayFacade<Float> getMinLimit() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'minLimit'.
	 * @see #__DNA__FIELD__minLimit
	 */
	
	public void setMinLimit(CArrayFacade<Float> minLimit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(minLimit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, minLimit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, minLimit);
		} else {
			__io__generic__copy( getMinLimit(), minLimit);
		}
	}

	/**
	 * Get method for struct member 'maxLimit'.
	 * @see #__DNA__FIELD__maxLimit
	 */
	
	public CArrayFacade<Float> getMaxLimit() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'maxLimit'.
	 * @see #__DNA__FIELD__maxLimit
	 */
	
	public void setMaxLimit(CArrayFacade<Float> maxLimit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(maxLimit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, maxLimit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, maxLimit);
		} else {
			__io__generic__copy( getMaxLimit(), maxLimit);
		}
	}

	/**
	 * Get method for struct member 'extraFz'.
	 * @see #__DNA__FIELD__extraFz
	 */
	
	public float getExtraFz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'extraFz'.
	 * @see #__DNA__FIELD__extraFz
	 */
	
	public void setExtraFz(float extraFz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, extraFz);
		} else {
			__io__block.writeFloat(__io__address + 84, extraFz);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 96);
		} else {
			return __io__block.readShort(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 96, flag);
		} else {
			__io__block.writeShort(__io__address + 88, flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 98, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 90, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 98;
		} else {
			__dna__offset = 90;
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
	public CPointer<bRigidBodyJointConstraint> __io__addressof() {
		return new CPointer<bRigidBodyJointConstraint>(__io__address, new Class[]{bRigidBodyJointConstraint.class}, __io__block, __io__blockTable);
	}

}
