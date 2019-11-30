package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bShrinkwrapConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> ShrinkWrap Constraint </p>
 */

@CMetaData(size32=20, size64=24)
public class bShrinkwrapConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bShrinkwrapConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bShrinkwrapConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 354;

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__target);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_target = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to kept from target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type (look on MOD shrinkwrap for values). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__shrinkType);
	 * CPointer&lt;Short&gt; p_shrinkType = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkType'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkType = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project/constrain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__projAxis);
	 * CPointer&lt;Byte&gt; p_projAxis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projAxis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projAxis = new long[]{10, 14};

	/**
	 * Field descriptor (offset) for struct member 'projAxisSpace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space to project axis in. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__projAxisSpace);
	 * CPointer&lt;Byte&gt; p_projAxisSpace = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projAxisSpace'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projAxisSpace = new long[]{11, 15};

	/**
	 * Field descriptor (offset) for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to search. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__projLimit);
	 * CPointer&lt;Float&gt; p_projLimit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projLimit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projLimit = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inside/outside/on surface (see MOD shrinkwrap). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__shrinkMode);
	 * CPointer&lt;Byte&gt; p_shrinkMode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkMode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkMode = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{17, 21};

	/**
	 * Field descriptor (offset) for struct member 'trackAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to align to normal. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD__trackAxis);
	 * CPointer&lt;Byte&gt; p_trackAxis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'trackAxis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__trackAxis = new long[]{18, 22};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bShrinkwrapConstraint bshrinkwrapconstraint = ...;
	 * CPointer&lt;Object&gt; p = bshrinkwrapconstraint.__dna__addressof(bShrinkwrapConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;Byte&gt; p__pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{19, 23};

	public bShrinkwrapConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bShrinkwrapConstraint(bShrinkwrapConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public CPointer<BlenderObject> getTarget() throws IOException
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
	 * Set method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(CPointer<BlenderObject> target) throws IOException
	{
		long __address = ((target == null) ? 0 : target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to kept from target. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to kept from target. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, dist);
		} else {
			__io__block.writeFloat(__io__address + 4, dist);
		}
	}

	/**
	 * Get method for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type (look on MOD shrinkwrap for values). </p>
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public short getShrinkType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type (look on MOD shrinkwrap for values). </p>
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public void setShrinkType(short shrinkType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, shrinkType);
		} else {
			__io__block.writeShort(__io__address + 8, shrinkType);
		}
	}

	/**
	 * Get method for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project/constrain. </p>
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public byte getProjAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 14);
		} else {
			return __io__block.readByte(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project/constrain. </p>
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public void setProjAxis(byte projAxis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 14, projAxis);
		} else {
			__io__block.writeByte(__io__address + 10, projAxis);
		}
	}

	/**
	 * Get method for struct member 'projAxisSpace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space to project axis in. </p>
	 * @see #__DNA__FIELD__projAxisSpace
	 */
	
	public byte getProjAxisSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 15);
		} else {
			return __io__block.readByte(__io__address + 11);
		}
	}

	/**
	 * Set method for struct member 'projAxisSpace'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Space to project axis in. </p>
	 * @see #__DNA__FIELD__projAxisSpace
	 */
	
	public void setProjAxisSpace(byte projAxisSpace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 15, projAxisSpace);
		} else {
			__io__block.writeByte(__io__address + 11, projAxisSpace);
		}
	}

	/**
	 * Get method for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to search. </p>
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public float getProjLimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance to search. </p>
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public void setProjLimit(float projLimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, projLimit);
		} else {
			__io__block.writeFloat(__io__address + 12, projLimit);
		}
	}

	/**
	 * Get method for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inside/outside/on surface (see MOD shrinkwrap). </p>
	 * @see #__DNA__FIELD__shrinkMode
	 */
	
	public byte getShrinkMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 20);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inside/outside/on surface (see MOD shrinkwrap). </p>
	 * @see #__DNA__FIELD__shrinkMode
	 */
	
	public void setShrinkMode(byte shrinkMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 20, shrinkMode);
		} else {
			__io__block.writeByte(__io__address + 16, shrinkMode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 21);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 21, flag);
		} else {
			__io__block.writeByte(__io__address + 17, flag);
		}
	}

	/**
	 * Get method for struct member 'trackAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to align to normal. </p>
	 * @see #__DNA__FIELD__trackAxis
	 */
	
	public byte getTrackAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 22);
		} else {
			return __io__block.readByte(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'trackAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to align to normal. </p>
	 * @see #__DNA__FIELD__trackAxis
	 */
	
	public void setTrackAxis(byte trackAxis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 22, trackAxis);
		} else {
			__io__block.writeByte(__io__address + 18, trackAxis);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public byte get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 23);
		} else {
			return __io__block.readByte(__io__address + 19);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(byte _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 23, _pad);
		} else {
			__io__block.writeByte(__io__address + 19, _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bShrinkwrapConstraint> __io__addressof() {
		return new CPointer<bShrinkwrapConstraint>(__io__address, new Class[]{bShrinkwrapConstraint.class}, __io__block, __io__blockTable);
	}

}
