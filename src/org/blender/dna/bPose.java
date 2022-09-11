package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bPose'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Pose ---------------------------------<mdash/>  Pose-Object.</p><p> It is only found under ob->pose. It is not library data, even though there is a define for it (hack for the outliner). </p>
 */

@CMetaData(size32=104, size64=136)
public class bPose extends CFacade {

	/**
	 * This is the sdna index of the struct bPose.
	 * <p>
	 * It is required when allocating a new block to store data for bPose.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 23;

	/**
	 * Field descriptor (offset) for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of pose channels, PoseBones in RNA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__chanbase);
	 * CPointer&lt;ListBase&gt; p_chanbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chanbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chanbase = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'chanhash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker string lookups. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__chanhash);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_chanhash = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chanhash'</li>
	 * <li>Signature: 'GHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chanhash = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'chan_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flat array of pose channels. It references pointers from chanbase. Used for quick pose channel lookup from an index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__chan_array);
	 * CPointer&lt;CPointer&lt;CPointer&lt;bPoseChannel&gt;&gt;&gt; p_chan_array = p.cast(new Class[]{CPointer.class, CPointer.class, bPoseChannel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chan_array'</li>
	 * <li>Signature: 'bPoseChannel**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chan_array = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'ctime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Local action time of this pose. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__ctime);
	 * CPointer&lt;Float&gt; p_ctime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ctime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ctime = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'stride_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Applied to object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__stride_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stride_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stride_offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stride_offset = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'cyclic_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Result of match and cycles, applied in BKE_pose_where_is(). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__cyclic_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cyclic_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cyclic_offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cyclic_offset = new long[]{36, 52};

	/**
	 * Field descriptor (offset) for struct member 'agroups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of bActionGroups. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__agroups);
	 * CPointer&lt;ListBase&gt; p_agroups = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agroups'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agroups = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'active_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of active group (starts from 1). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__active_group);
	 * CPointer&lt;Integer&gt; p_active_group = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_group'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_group = new long[]{56, 80};

	/**
	 * Field descriptor (offset) for struct member 'iksolver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ik solver to use, see ePose_IKSolverType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__iksolver);
	 * CPointer&lt;Integer&gt; p_iksolver = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iksolver'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iksolver = new long[]{60, 84};

	/**
	 * Field descriptor (offset) for struct member 'ikdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary IK data, depends on the IK solver. Not saved in file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__ikdata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ikdata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ikdata'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ikdata = new long[]{64, 88};

	/**
	 * Field descriptor (offset) for struct member 'ikparam'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> IK solver parameters, structure depends on iksolver. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__ikparam);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ikparam = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ikparam'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ikparam = new long[]{68, 96};

	/**
	 * Field descriptor (offset) for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of bone animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bPose bpose = ...;
	 * CPointer&lt;Object&gt; p = bpose.__dna__addressof(bPose.__DNA__FIELD__avs);
	 * CPointer&lt;bAnimVizSettings&gt; p_avs = p.cast(new Class[]{bAnimVizSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avs'</li>
	 * <li>Signature: 'bAnimVizSettings'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avs = new long[]{72, 104};

	public bPose(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bPose(bPose that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of pose channels, PoseBones in RNA. </p>
	 * @see #__DNA__FIELD__chanbase
	 */
	
	public ListBase getChanbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of pose channels, PoseBones in RNA. </p>
	 * @see #__DNA__FIELD__chanbase
	 */
	
	public void setChanbase(ListBase chanbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(chanbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, chanbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, chanbase);
		} else {
			__io__generic__copy( getChanbase(), chanbase);
		}
	}

	/**
	 * Get method for struct member 'chanhash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker string lookups. </p>
	 * @see #__DNA__FIELD__chanhash
	 */
	
	public CPointer<Object> getChanhash() throws IOException
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
	 * Set method for struct member 'chanhash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker string lookups. </p>
	 * @see #__DNA__FIELD__chanhash
	 */
	
	public void setChanhash(CPointer<Object> chanhash) throws IOException
	{
		long __address = ((chanhash == null) ? 0 : chanhash.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'chan_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flat array of pose channels. It references pointers from chanbase. Used for quick pose channel lookup from an index. </p>
	 * @see #__DNA__FIELD__chan_array
	 */
	
	public CPointer<CPointer<bPoseChannel>> getChan_array() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, bPoseChannel.class};
		return new CPointer<CPointer<bPoseChannel>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'chan_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flat array of pose channels. It references pointers from chanbase. Used for quick pose channel lookup from an index. </p>
	 * @see #__DNA__FIELD__chan_array
	 */
	
	public void setChan_array(CPointer<CPointer<bPoseChannel>> chan_array) throws IOException
	{
		long __address = ((chan_array == null) ? 0 : chan_array.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 32);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 32, flag);
		} else {
			__io__block.writeShort(__io__address + 16, flag);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'ctime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Local action time of this pose. </p>
	 * @see #__DNA__FIELD__ctime
	 */
	
	public float getCtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'ctime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Local action time of this pose. </p>
	 * @see #__DNA__FIELD__ctime
	 */
	
	public void setCtime(float ctime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, ctime);
		} else {
			__io__block.writeFloat(__io__address + 20, ctime);
		}
	}

	/**
	 * Get method for struct member 'stride_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Applied to object. </p>
	 * @see #__DNA__FIELD__stride_offset
	 */
	
	public CArrayFacade<Float> getStride_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stride_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Applied to object. </p>
	 * @see #__DNA__FIELD__stride_offset
	 */
	
	public void setStride_offset(CArrayFacade<Float> stride_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(stride_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stride_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stride_offset);
		} else {
			__io__generic__copy( getStride_offset(), stride_offset);
		}
	}

	/**
	 * Get method for struct member 'cyclic_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Result of match and cycles, applied in BKE_pose_where_is(). </p>
	 * @see #__DNA__FIELD__cyclic_offset
	 */
	
	public CArrayFacade<Float> getCyclic_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cyclic_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Result of match and cycles, applied in BKE_pose_where_is(). </p>
	 * @see #__DNA__FIELD__cyclic_offset
	 */
	
	public void setCyclic_offset(CArrayFacade<Float> cyclic_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(cyclic_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cyclic_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cyclic_offset);
		} else {
			__io__generic__copy( getCyclic_offset(), cyclic_offset);
		}
	}

	/**
	 * Get method for struct member 'agroups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of bActionGroups. </p>
	 * @see #__DNA__FIELD__agroups
	 */
	
	public ListBase getAgroups() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 48, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'agroups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> List of bActionGroups. </p>
	 * @see #__DNA__FIELD__agroups
	 */
	
	public void setAgroups(ListBase agroups) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(agroups, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, agroups)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, agroups);
		} else {
			__io__generic__copy( getAgroups(), agroups);
		}
	}

	/**
	 * Get method for struct member 'active_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of active group (starts from 1). </p>
	 * @see #__DNA__FIELD__active_group
	 */
	
	public int getActive_group() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'active_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of active group (starts from 1). </p>
	 * @see #__DNA__FIELD__active_group
	 */
	
	public void setActive_group(int active_group) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, active_group);
		} else {
			__io__block.writeInt(__io__address + 56, active_group);
		}
	}

	/**
	 * Get method for struct member 'iksolver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ik solver to use, see ePose_IKSolverType. </p>
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public int getIksolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'iksolver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Ik solver to use, see ePose_IKSolverType. </p>
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public void setIksolver(int iksolver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, iksolver);
		} else {
			__io__block.writeInt(__io__address + 60, iksolver);
		}
	}

	/**
	 * Get method for struct member 'ikdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary IK data, depends on the IK solver. Not saved in file. </p>
	 * @see #__DNA__FIELD__ikdata
	 */
	
	public CPointer<Object> getIkdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ikdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary IK data, depends on the IK solver. Not saved in file. </p>
	 * @see #__DNA__FIELD__ikdata
	 */
	
	public void setIkdata(CPointer<Object> ikdata) throws IOException
	{
		long __address = ((ikdata == null) ? 0 : ikdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'ikparam'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> IK solver parameters, structure depends on iksolver. </p>
	 * @see #__DNA__FIELD__ikparam
	 */
	
	public CPointer<Object> getIkparam() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ikparam'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> IK solver parameters, structure depends on iksolver. </p>
	 * @see #__DNA__FIELD__ikparam
	 */
	
	public void setIkparam(CPointer<Object> ikparam) throws IOException
	{
		long __address = ((ikparam == null) ? 0 : ikparam.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of bone animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public bAnimVizSettings getAvs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bAnimVizSettings(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new bAnimVizSettings(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'avs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for visualization of bone animation. </p>
	 * @see #__DNA__FIELD__avs
	 */
	
	public void setAvs(bAnimVizSettings avs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(avs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, avs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, avs);
		} else {
			__io__generic__copy( getAvs(), avs);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bPose> __io__addressof() {
		return new CPointer<bPose>(__io__address, new Class[]{bPose.class}, __io__block, __io__blockTable);
	}

}
