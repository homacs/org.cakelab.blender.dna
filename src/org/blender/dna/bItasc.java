package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bItasc'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> bPose->ikparam when bPose->iksolver=1 </p>
 */

@CMetaData(size32=40, size64=40)
public class bItasc extends CFacade {

	/**
	 * This is the sdna index of the struct bItasc.
	 * <p>
	 * It is required when allocating a new block to store data for bItasc.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 346;

	/**
	 * Field descriptor (offset) for struct member 'iksolver'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__iksolver);
	 * CPointer&lt;Integer&gt; p_iksolver = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iksolver'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iksolver = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'precision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__precision);
	 * CPointer&lt;Float&gt; p_precision = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'precision'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__precision = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'numiter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__numiter);
	 * CPointer&lt;Short&gt; p_numiter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numiter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numiter = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'numstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__numstep);
	 * CPointer&lt;Short&gt; p_numstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numstep = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'minstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__minstep);
	 * CPointer&lt;Float&gt; p_minstep = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minstep'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minstep = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'maxstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__maxstep);
	 * CPointer&lt;Float&gt; p_maxstep = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxstep'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxstep = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'solver'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__solver);
	 * CPointer&lt;Short&gt; p_solver = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'feedback'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__feedback);
	 * CPointer&lt;Float&gt; p_feedback = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'feedback'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__feedback = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'maxvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max velocity to SDLS solver </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__maxvel);
	 * CPointer&lt;Float&gt; p_maxvel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxvel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxvel = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'dampmax'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum damping for DLS solver </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__dampmax);
	 * CPointer&lt;Float&gt; p_dampmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dampmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dampmax = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'dampeps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> threshold of singular value from which the damping start progressively </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bItasc bitasc = ...;
	 * CPointer&lt;Object&gt; p = bitasc.__dna__addressof(bItasc.__DNA__FIELD__dampeps);
	 * CPointer&lt;Float&gt; p_dampeps = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dampeps'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dampeps = new long[]{36, 36};

	public bItasc(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bItasc(bItasc that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'iksolver'.
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public int getIksolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'iksolver'.
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public void setIksolver(int iksolver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, iksolver);
		} else {
			__io__block.writeInt(__io__address + 0, iksolver);
		}
	}

	/**
	 * Get method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public float getPrecision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public void setPrecision(float precision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, precision);
		} else {
			__io__block.writeFloat(__io__address + 4, precision);
		}
	}

	/**
	 * Get method for struct member 'numiter'.
	 * @see #__DNA__FIELD__numiter
	 */
	
	public short getNumiter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'numiter'.
	 * @see #__DNA__FIELD__numiter
	 */
	
	public void setNumiter(short numiter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, numiter);
		} else {
			__io__block.writeShort(__io__address + 8, numiter);
		}
	}

	/**
	 * Get method for struct member 'numstep'.
	 * @see #__DNA__FIELD__numstep
	 */
	
	public short getNumstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'numstep'.
	 * @see #__DNA__FIELD__numstep
	 */
	
	public void setNumstep(short numstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, numstep);
		} else {
			__io__block.writeShort(__io__address + 10, numstep);
		}
	}

	/**
	 * Get method for struct member 'minstep'.
	 * @see #__DNA__FIELD__minstep
	 */
	
	public float getMinstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'minstep'.
	 * @see #__DNA__FIELD__minstep
	 */
	
	public void setMinstep(float minstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, minstep);
		} else {
			__io__block.writeFloat(__io__address + 12, minstep);
		}
	}

	/**
	 * Get method for struct member 'maxstep'.
	 * @see #__DNA__FIELD__maxstep
	 */
	
	public float getMaxstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'maxstep'.
	 * @see #__DNA__FIELD__maxstep
	 */
	
	public void setMaxstep(float maxstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, maxstep);
		} else {
			__io__block.writeFloat(__io__address + 16, maxstep);
		}
	}

	/**
	 * Get method for struct member 'solver'.
	 * @see #__DNA__FIELD__solver
	 */
	
	public short getSolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'solver'.
	 * @see #__DNA__FIELD__solver
	 */
	
	public void setSolver(short solver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, solver);
		} else {
			__io__block.writeShort(__io__address + 20, solver);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, flag);
		} else {
			__io__block.writeShort(__io__address + 22, flag);
		}
	}

	/**
	 * Get method for struct member 'feedback'.
	 * @see #__DNA__FIELD__feedback
	 */
	
	public float getFeedback() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'feedback'.
	 * @see #__DNA__FIELD__feedback
	 */
	
	public void setFeedback(float feedback) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, feedback);
		} else {
			__io__block.writeFloat(__io__address + 24, feedback);
		}
	}

	/**
	 * Get method for struct member 'maxvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max velocity to SDLS solver </p>
	 * @see #__DNA__FIELD__maxvel
	 */
	
	public float getMaxvel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'maxvel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max velocity to SDLS solver </p>
	 * @see #__DNA__FIELD__maxvel
	 */
	
	public void setMaxvel(float maxvel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, maxvel);
		} else {
			__io__block.writeFloat(__io__address + 28, maxvel);
		}
	}

	/**
	 * Get method for struct member 'dampmax'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum damping for DLS solver </p>
	 * @see #__DNA__FIELD__dampmax
	 */
	
	public float getDampmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'dampmax'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> maximum damping for DLS solver </p>
	 * @see #__DNA__FIELD__dampmax
	 */
	
	public void setDampmax(float dampmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, dampmax);
		} else {
			__io__block.writeFloat(__io__address + 32, dampmax);
		}
	}

	/**
	 * Get method for struct member 'dampeps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> threshold of singular value from which the damping start progressively </p>
	 * @see #__DNA__FIELD__dampeps
	 */
	
	public float getDampeps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'dampeps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> threshold of singular value from which the damping start progressively </p>
	 * @see #__DNA__FIELD__dampeps
	 */
	
	public void setDampeps(float dampeps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, dampeps);
		} else {
			__io__block.writeFloat(__io__address + 36, dampeps);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bItasc> __io__addressof() {
		return new CPointer<bItasc>(__io__address, new Class[]{bItasc.class}, __io__block, __io__blockTable);
	}

}
