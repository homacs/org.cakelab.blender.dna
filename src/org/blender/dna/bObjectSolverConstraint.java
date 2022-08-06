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
 * Generated facet for DNA struct type 'bObjectSolverConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p>{@link Camera}  Solver constraints </p>
 */

@CMetaData(size32=144, size64=152)
public class bObjectSolverConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bObjectSolverConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bObjectSolverConstraint.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 384;

	/**
	 * Field descriptor (offset) for struct member 'clip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD__clip);
	 * CPointer&lt;CPointer&lt;MovieClip&gt;&gt; p_clip = p.cast(new Class[]{CPointer.class, MovieClip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip'</li>
	 * <li>Signature: 'MovieClip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD__object);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_object = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'invmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent-inverse matrix to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD__invmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_invmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'invmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__invmat = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectSolverConstraint bobjectsolverconstraint = ...;
	 * CPointer&lt;Object&gt; p = bobjectsolverconstraint.__dna__addressof(bObjectSolverConstraint.__DNA__FIELD__camera);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_camera = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera = new long[]{140, 144};

	public bObjectSolverConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bObjectSolverConstraint(bObjectSolverConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public CPointer<MovieClip> getClip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieClip.class};
		return new CPointer<MovieClip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieClip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CPointer<MovieClip> clip) throws IOException
	{
		long __address = ((clip == null) ? 0 : clip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 12;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public CArrayFacade<Byte> getObject() throws IOException
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
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CArrayFacade<Byte> object) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(object, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object);
		} else {
			__io__generic__copy( getObject(), object);
		}
	}

	/**
	 * Get method for struct member 'invmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent-inverse matrix to use. </p>
	 * @see #__DNA__FIELD__invmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getInvmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'invmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent-inverse matrix to use. </p>
	 * @see #__DNA__FIELD__invmat
	 */
	
	public void setInvmat(CArrayFacade<CArrayFacade<Float>> invmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(invmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, invmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, invmat);
		} else {
			__io__generic__copy( getInvmat(), invmat);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public CPointer<BlenderObject> getCamera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(CPointer<BlenderObject> camera) throws IOException
	{
		long __address = ((camera == null) ? 0 : camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bObjectSolverConstraint> __io__addressof() {
		return new CPointer<bObjectSolverConstraint>(__io__address, new Class[]{bObjectSolverConstraint.class}, __io__block, __io__blockTable);
	}

}
