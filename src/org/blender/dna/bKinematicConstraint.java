package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bKinematicConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Inverse-Kinematics (IK) constraint This constraint supports a variety of mode determine by the type field according to eConstraint_IK_Type. Some fields are used by all types, some are specific to some types This is indicated in the comments for each field </p>
 */

@CMetaData(size32=176, size64=184)
public class bKinematicConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bKinematicConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bKinematicConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 330;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: target object in case constraint needs a target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__tar);
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
	 * Field descriptor (offset) for struct member 'iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Maximum number of iterations to try. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__iterations);
	 * CPointer&lt;Short&gt; p_iterations = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iterations'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iterations = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All & CopyPose: some options Like CONSTRAINT_IK_TIP. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{6, 10};

	/**
	 * Field descriptor (offset) for struct member 'rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: index to rootbone, if zero go all the way to mother bone. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__rootbone);
	 * CPointer&lt;Short&gt; p_rootbone = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rootbone'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rootbone = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'max_rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for auto-ik, maximum length of chain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__max_rootbone);
	 * CPointer&lt;Short&gt; p_max_rootbone = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_rootbone'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_rootbone = new long[]{10, 14};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: String to specify sub-object target, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'poletar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__poletar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_poletar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poletar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poletar = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'polesubtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector sub-object target, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__polesubtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_polesubtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'polesubtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__polesubtarget = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'poleangle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector rest angle. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__poleangle);
	 * CPointer&lt;Float&gt; p_poleangle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poleangle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poleangle = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Weight of constraint in IK tree. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{148, 156};

	/**
	 * Field descriptor (offset) for struct member 'orientweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: Amount of rotation a target applies on chain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__orientweight);
	 * CPointer&lt;Float&gt; p_orientweight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orientweight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orientweight = new long[]{152, 160};

	/**
	 * Field descriptor (offset) for struct member 'grabtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for target-less IK. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__grabtarget);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_grabtarget = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grabtarget'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grabtarget = new long[]{156, 164};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtype of IK constraint: eConstraint_IK_Type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{168, 176};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: how to limit in relation to clamping sphere: LIMITDIST_... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{170, 178};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: distance (radius of clamping sphere) from target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKinematicConstraint bkinematicconstraint = ...;
	 * CPointer&lt;Object&gt; p = bkinematicconstraint.__dna__addressof(bKinematicConstraint.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{172, 180};

	public bKinematicConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bKinematicConstraint(bKinematicConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: target object in case constraint needs a target. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: target object in case constraint needs a target. </p>
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
	 * Get method for struct member 'iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Maximum number of iterations to try. </p>
	 * @see #__DNA__FIELD__iterations
	 */
	
	public short getIterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'iterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Maximum number of iterations to try. </p>
	 * @see #__DNA__FIELD__iterations
	 */
	
	public void setIterations(short iterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, iterations);
		} else {
			__io__block.writeShort(__io__address + 4, iterations);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All & CopyPose: some options Like CONSTRAINT_IK_TIP. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All & CopyPose: some options Like CONSTRAINT_IK_TIP. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, flag);
		} else {
			__io__block.writeShort(__io__address + 6, flag);
		}
	}

	/**
	 * Get method for struct member 'rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: index to rootbone, if zero go all the way to mother bone. </p>
	 * @see #__DNA__FIELD__rootbone
	 */
	
	public short getRootbone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: index to rootbone, if zero go all the way to mother bone. </p>
	 * @see #__DNA__FIELD__rootbone
	 */
	
	public void setRootbone(short rootbone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, rootbone);
		} else {
			__io__block.writeShort(__io__address + 8, rootbone);
		}
	}

	/**
	 * Get method for struct member 'max_rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for auto-ik, maximum length of chain. </p>
	 * @see #__DNA__FIELD__max_rootbone
	 */
	
	public short getMax_rootbone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'max_rootbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for auto-ik, maximum length of chain. </p>
	 * @see #__DNA__FIELD__max_rootbone
	 */
	
	public void setMax_rootbone(short max_rootbone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, max_rootbone);
		} else {
			__io__block.writeShort(__io__address + 10, max_rootbone);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: String to specify sub-object target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: String to specify sub-object target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Get method for struct member 'poletar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector target. </p>
	 * @see #__DNA__FIELD__poletar
	 */
	
	public CPointer<BlenderObject> getPoletar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'poletar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector target. </p>
	 * @see #__DNA__FIELD__poletar
	 */
	
	public void setPoletar(CPointer<BlenderObject> poletar) throws IOException
	{
		long __address = ((poletar == null) ? 0 : poletar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'polesubtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector sub-object target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__polesubtarget
	 */
	
	public CArrayFacade<Byte> getPolesubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'polesubtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector sub-object target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__polesubtarget
	 */
	
	public void setPolesubtarget(CArrayFacade<Byte> polesubtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(polesubtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, polesubtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, polesubtarget);
		} else {
			__io__generic__copy( getPolesubtarget(), polesubtarget);
		}
	}

	/**
	 * Get method for struct member 'poleangle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector rest angle. </p>
	 * @see #__DNA__FIELD__poleangle
	 */
	
	public float getPoleangle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'poleangle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Pole vector rest angle. </p>
	 * @see #__DNA__FIELD__poleangle
	 */
	
	public void setPoleangle(float poleangle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, poleangle);
		} else {
			__io__block.writeFloat(__io__address + 144, poleangle);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Weight of constraint in IK tree. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All: Weight of constraint in IK tree. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, weight);
		} else {
			__io__block.writeFloat(__io__address + 148, weight);
		}
	}

	/**
	 * Get method for struct member 'orientweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: Amount of rotation a target applies on chain. </p>
	 * @see #__DNA__FIELD__orientweight
	 */
	
	public float getOrientweight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'orientweight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: Amount of rotation a target applies on chain. </p>
	 * @see #__DNA__FIELD__orientweight
	 */
	
	public void setOrientweight(float orientweight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, orientweight);
		} else {
			__io__block.writeFloat(__io__address + 152, orientweight);
		}
	}

	/**
	 * Get method for struct member 'grabtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for target-less IK. </p>
	 * @see #__DNA__FIELD__grabtarget
	 */
	
	public CArrayFacade<Float> getGrabtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grabtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> CopyPose: for target-less IK. </p>
	 * @see #__DNA__FIELD__grabtarget
	 */
	
	public void setGrabtarget(CArrayFacade<Float> grabtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 164;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(grabtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grabtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grabtarget);
		} else {
			__io__generic__copy( getGrabtarget(), grabtarget);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtype of IK constraint: eConstraint_IK_Type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subtype of IK constraint: eConstraint_IK_Type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, type);
		} else {
			__io__block.writeShort(__io__address + 168, type);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: how to limit in relation to clamping sphere: LIMITDIST_... </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: how to limit in relation to clamping sphere: LIMITDIST_... </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, mode);
		} else {
			__io__block.writeShort(__io__address + 170, mode);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: distance (radius of clamping sphere) from target. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance: distance (radius of clamping sphere) from target. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, dist);
		} else {
			__io__block.writeFloat(__io__address + 172, dist);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bKinematicConstraint> __io__addressof() {
		return new CPointer<bKinematicConstraint>(__io__address, new Class[]{bKinematicConstraint.class}, __io__block, __io__blockTable);
	}

}
