package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bPoseChannel_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=136)
public class bPoseChannel_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bPoseChannel_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bPoseChannel_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 315;

	/**
	 * Field descriptor (offset) for struct member 'deform_dual_quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached dual quaternion for deformation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__deform_dual_quat);
	 * CPointer&lt;DualQuat&gt; p_deform_dual_quat = p.cast(new Class[]{DualQuat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deform_dual_quat'</li>
	 * <li>Signature: 'DualQuat'</li>
	 * <li>Actual Size (32bit/64bit): 100/100</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deform_dual_quat = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'bbone_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> B-Bone shape data: copy of the segment count for validation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__bbone_segments);
	 * CPointer&lt;Integer&gt; p_bbone_segments = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_segments'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_segments = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'bbone_rest_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rest and posed matrices for segments. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__bbone_rest_mats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bbone_rest_mats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_rest_mats'</li>
	 * <li>Signature: 'Mat4*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_rest_mats = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member 'bbone_pose_mats'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__bbone_pose_mats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bbone_pose_mats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_pose_mats'</li>
	 * <li>Signature: 'Mat4*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_pose_mats = new long[]{108, 112};

	/**
	 * Field descriptor (offset) for struct member 'bbone_deform_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Delta from rest to pose in matrix and {@link DualQuat}  form. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__bbone_deform_mats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bbone_deform_mats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_deform_mats'</li>
	 * <li>Signature: 'Mat4*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_deform_mats = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member 'bbone_dual_quats'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPoseChannel_Runtime bposechannel_runtime = ...;
	 * CPointer&lt;Object&gt; p = bposechannel_runtime.__dna__addressof(bPoseChannel_Runtime.__DNA__FIELD__bbone_dual_quats);
	 * CPointer&lt;CPointer&lt;DualQuat&gt;&gt; p_bbone_dual_quats = p.cast(new Class[]{CPointer.class, DualQuat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbone_dual_quats'</li>
	 * <li>Signature: 'DualQuat*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbone_dual_quats = new long[]{116, 128};

	public bPoseChannel_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bPoseChannel_Runtime(bPoseChannel_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'deform_dual_quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached dual quaternion for deformation. </p>
	 * @see #__DNA__FIELD__deform_dual_quat
	 */
	
	public DualQuat getDeform_dual_quat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DualQuat(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new DualQuat(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'deform_dual_quat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached dual quaternion for deformation. </p>
	 * @see #__DNA__FIELD__deform_dual_quat
	 */
	
	public void setDeform_dual_quat(DualQuat deform_dual_quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(deform_dual_quat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, deform_dual_quat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, deform_dual_quat);
		} else {
			__io__generic__copy( getDeform_dual_quat(), deform_dual_quat);
		}
	}

	/**
	 * Get method for struct member 'bbone_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> B-Bone shape data: copy of the segment count for validation. </p>
	 * @see #__DNA__FIELD__bbone_segments
	 */
	
	public int getBbone_segments() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'bbone_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> B-Bone shape data: copy of the segment count for validation. </p>
	 * @see #__DNA__FIELD__bbone_segments
	 */
	
	public void setBbone_segments(int bbone_segments) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, bbone_segments);
		} else {
			__io__block.writeInt(__io__address + 100, bbone_segments);
		}
	}

	/**
	 * Get method for struct member 'bbone_rest_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rest and posed matrices for segments. </p>
	 * @see #__DNA__FIELD__bbone_rest_mats
	 */
	
	public CPointer<Object> getBbone_rest_mats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_rest_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rest and posed matrices for segments. </p>
	 * @see #__DNA__FIELD__bbone_rest_mats
	 */
	
	public void setBbone_rest_mats(CPointer<Object> bbone_rest_mats) throws IOException
	{
		long __address = ((bbone_rest_mats == null) ? 0 : bbone_rest_mats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'bbone_pose_mats'.
	 * @see #__DNA__FIELD__bbone_pose_mats
	 */
	
	public CPointer<Object> getBbone_pose_mats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_pose_mats'.
	 * @see #__DNA__FIELD__bbone_pose_mats
	 */
	
	public void setBbone_pose_mats(CPointer<Object> bbone_pose_mats) throws IOException
	{
		long __address = ((bbone_pose_mats == null) ? 0 : bbone_pose_mats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'bbone_deform_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Delta from rest to pose in matrix and {@link DualQuat}  form. </p>
	 * @see #__DNA__FIELD__bbone_deform_mats
	 */
	
	public CPointer<Object> getBbone_deform_mats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_deform_mats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Delta from rest to pose in matrix and {@link DualQuat}  form. </p>
	 * @see #__DNA__FIELD__bbone_deform_mats
	 */
	
	public void setBbone_deform_mats(CPointer<Object> bbone_deform_mats) throws IOException
	{
		long __address = ((bbone_deform_mats == null) ? 0 : bbone_deform_mats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'bbone_dual_quats'.
	 * @see #__DNA__FIELD__bbone_dual_quats
	 */
	
	public CPointer<DualQuat> getBbone_dual_quats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DualQuat.class};
		return new CPointer<DualQuat>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DualQuat.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bbone_dual_quats'.
	 * @see #__DNA__FIELD__bbone_dual_quats
	 */
	
	public void setBbone_dual_quats(CPointer<DualQuat> bbone_dual_quats) throws IOException
	{
		long __address = ((bbone_dual_quats == null) ? 0 : bbone_dual_quats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bPoseChannel_Runtime> __io__addressof() {
		return new CPointer<bPoseChannel_Runtime>(__io__address, new Class[]{bPoseChannel_Runtime.class}, __io__block, __io__blockTable);
	}

}
