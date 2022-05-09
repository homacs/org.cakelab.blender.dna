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
 * Generated facet for DNA struct type 'bArmature'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=200, size64=272)
public class bArmature extends CFacade {

	/**
	 * This is the sdna index of the struct bArmature.
	 * <p>
	 * It is required when allocating a new block to store data for bArmature.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 351;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 136/176</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'bonebase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__bonebase);
	 * CPointer&lt;ListBase&gt; p_bonebase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bonebase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bonebase = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'bonehash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker lookups of bones by name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__bonehash);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bonehash = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bonehash'</li>
	 * <li>Signature: 'GHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bonehash = new long[]{148, 200};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{152, 208};

	/**
	 * Field descriptor (offset) for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #EditBone list (use an allocated pointer so the state can be checked). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__edbo);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_edbo = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edbo'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edbo = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) Active bone. </p></li></ul> 
	 * active and selection are unrelated
	 * active & hidden is not allowed
	 * from the user perspective active == last selected
	 * active should be ignored when not visible (hidden layer) Active bone. 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__act_bone);
	 * CPointer&lt;CPointer&lt;Bone&gt;&gt; p_act_bone = p.cast(new Class[]{CPointer.class, Bone.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_bone'</li>
	 * <li>Signature: 'Bone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_bone = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active edit-bone (in edit-mode). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__act_edbone);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_act_edbone = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_edbone'</li>
	 * <li>Signature: 'EditBone*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_edbone = new long[]{164, 232};

	/**
	 * Field descriptor (offset) for struct member 'needs_flush_to_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ID}  data is older than edit-mode data (TODO: move to edit-mode struct). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__needs_flush_to_id);
	 * CPointer&lt;Byte&gt; p_needs_flush_to_id = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'needs_flush_to_id'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__needs_flush_to_id = new long[]{168, 240};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{169, 241};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{172, 244};

	/**
	 * Field descriptor (offset) for struct member 'drawtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__drawtype);
	 * CPointer&lt;Integer&gt; p_drawtype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawtype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawtype = new long[]{176, 248};

	/**
	 * Field descriptor (offset) for struct member 'deformflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__deformflag);
	 * CPointer&lt;Short&gt; p_deformflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deformflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deformflag = new long[]{180, 252};

	/**
	 * Field descriptor (offset) for struct member 'pathflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__pathflag);
	 * CPointer&lt;Short&gt; p_pathflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathflag = new long[]{182, 254};

	/**
	 * Field descriptor (offset) for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For UI, to show which layers are there. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer_used);
	 * CPointer&lt;Integer&gt; p_layer_used = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_used'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_used = new long[]{184, 256};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For buttons to work, both variables in this order together. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer);
	 * CPointer&lt;Integer&gt; p_layer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{188, 260};

	/**
	 * Field descriptor (offset) for struct member 'layer_protected'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__layer_protected);
	 * CPointer&lt;Integer&gt; p_layer_protected = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_protected'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_protected = new long[]{192, 264};

	/**
	 * Field descriptor (offset) for struct member 'axes_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Relative position of the axes on the bone, from head (0.0f) to tail (1.0f). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bArmature barmature = ...;
	 * CPointer&lt;Object&gt; p = barmature.__dna__addressof(bArmature.__DNA__FIELD__axes_position);
	 * CPointer&lt;Float&gt; p_axes_position = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axes_position'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axes_position = new long[]{196, 268};

	public bArmature(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bArmature(bArmature that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'bonebase'.
	 * @see #__DNA__FIELD__bonebase
	 */
	
	public ListBase getBonebase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bonebase'.
	 * @see #__DNA__FIELD__bonebase
	 */
	
	public void setBonebase(ListBase bonebase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(bonebase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bonebase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bonebase);
		} else {
			__io__generic__copy( getBonebase(), bonebase);
		}
	}

	/**
	 * Get method for struct member 'bonehash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker lookups of bones by name. </p>
	 * @see #__DNA__FIELD__bonehash
	 */
	
	public CPointer<Object> getBonehash() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bonehash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use a hash-table for quicker lookups of bones by name. </p>
	 * @see #__DNA__FIELD__bonehash
	 */
	
	public void setBonehash(CPointer<Object> bonehash) throws IOException
	{
		long __address = ((bonehash == null) ? 0 : bonehash.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #EditBone list (use an allocated pointer so the state can be checked). </p>
	 * @see #__DNA__FIELD__edbo
	 */
	
	public CPointer<ListBase> getEdbo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #EditBone list (use an allocated pointer so the state can be checked). </p>
	 * @see #__DNA__FIELD__edbo
	 */
	
	public void setEdbo(CPointer<ListBase> edbo) throws IOException
	{
		long __address = ((edbo == null) ? 0 : edbo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) Active bone. </p></li></ul> 
	 * active and selection are unrelated
	 * active & hidden is not allowed
	 * from the user perspective active == last selected
	 * active should be ignored when not visible (hidden layer) Active bone. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__act_bone
	 */
	
	public CPointer<Bone> getAct_bone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Bone.class};
		return new CPointer<Bone>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Bone.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_bone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> active bones should work like active object where possible<ul><li><p> active and selection are unrelated</p></li><li><p> active & hidden is not allowed</p></li><li><p> from the user perspective active == last selected</p></li><li><p> active should be ignored when not visible (hidden layer) Active bone. </p></li></ul> 
	 * active and selection are unrelated
	 * active & hidden is not allowed
	 * from the user perspective active == last selected
	 * active should be ignored when not visible (hidden layer) Active bone. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__act_bone
	 */
	
	public void setAct_bone(CPointer<Bone> act_bone) throws IOException
	{
		long __address = ((act_bone == null) ? 0 : act_bone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active edit-bone (in edit-mode). </p>
	 * @see #__DNA__FIELD__act_edbone
	 */
	
	public CPointer<Object> getAct_edbone() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_edbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active edit-bone (in edit-mode). </p>
	 * @see #__DNA__FIELD__act_edbone
	 */
	
	public void setAct_edbone(CPointer<Object> act_edbone) throws IOException
	{
		long __address = ((act_edbone == null) ? 0 : act_edbone.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'needs_flush_to_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ID}  data is older than edit-mode data (TODO: move to edit-mode struct). </p>
	 * @see #__DNA__FIELD__needs_flush_to_id
	 */
	
	public byte getNeeds_flush_to_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 240);
		} else {
			return __io__block.readByte(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'needs_flush_to_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ID}  data is older than edit-mode data (TODO: move to edit-mode struct). </p>
	 * @see #__DNA__FIELD__needs_flush_to_id
	 */
	
	public void setNeeds_flush_to_id(byte needs_flush_to_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 240, needs_flush_to_id);
		} else {
			__io__block.writeByte(__io__address + 168, needs_flush_to_id);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 241, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 169, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 241;
		} else {
			__dna__offset = 169;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, flag);
		} else {
			__io__block.writeInt(__io__address + 172, flag);
		}
	}

	/**
	 * Get method for struct member 'drawtype'.
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public int getDrawtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'drawtype'.
	 * @see #__DNA__FIELD__drawtype
	 */
	
	public void setDrawtype(int drawtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, drawtype);
		} else {
			__io__block.writeInt(__io__address + 176, drawtype);
		}
	}

	/**
	 * Get method for struct member 'deformflag'.
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public short getDeformflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 252);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'deformflag'.
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public void setDeformflag(short deformflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 252, deformflag);
		} else {
			__io__block.writeShort(__io__address + 180, deformflag);
		}
	}

	/**
	 * Get method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public short getPathflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 254);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public void setPathflag(short pathflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 254, pathflag);
		} else {
			__io__block.writeShort(__io__address + 182, pathflag);
		}
	}

	/**
	 * Get method for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For UI, to show which layers are there. </p>
	 * @see #__DNA__FIELD__layer_used
	 */
	
	public int getLayer_used() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 256);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'layer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For UI, to show which layers are there. </p>
	 * @see #__DNA__FIELD__layer_used
	 */
	
	public void setLayer_used(int layer_used) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 256, layer_used);
		} else {
			__io__block.writeInt(__io__address + 184, layer_used);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For buttons to work, both variables in this order together. </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public int getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 260);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For buttons to work, both variables in this order together. </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(int layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 260, layer);
		} else {
			__io__block.writeInt(__io__address + 188, layer);
		}
	}

	/**
	 * Get method for struct member 'layer_protected'.
	 * @see #__DNA__FIELD__layer_protected
	 */
	
	public int getLayer_protected() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 264);
		} else {
			return __io__block.readInt(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'layer_protected'.
	 * @see #__DNA__FIELD__layer_protected
	 */
	
	public void setLayer_protected(int layer_protected) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 264, layer_protected);
		} else {
			__io__block.writeInt(__io__address + 192, layer_protected);
		}
	}

	/**
	 * Get method for struct member 'axes_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Relative position of the axes on the bone, from head (0.0f) to tail (1.0f). </p>
	 * @see #__DNA__FIELD__axes_position
	 */
	
	public float getAxes_position() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'axes_position'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Relative position of the axes on the bone, from head (0.0f) to tail (1.0f). </p>
	 * @see #__DNA__FIELD__axes_position
	 */
	
	public void setAxes_position(float axes_position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, axes_position);
		} else {
			__io__block.writeFloat(__io__address + 196, axes_position);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bArmature> __io__addressof() {
		return new CPointer<bArmature>(__io__address, new Class[]{bArmature.class}, __io__block, __io__blockTable);
	}

}
