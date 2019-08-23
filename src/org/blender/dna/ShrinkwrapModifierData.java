package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ShrinkwrapModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=216)
public class ShrinkwrapModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ShrinkwrapModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ShrinkwrapModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 128;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__target);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_target = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'auxTarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional shrink target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__auxTarget);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_auxTarget = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'auxTarget'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__auxTarget = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__vgroup_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_name = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'keepDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance offset to keep from mesh/projection point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__keepDist);
	 * CPointer&lt;Float&gt; p_keepDist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keepDist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keepDist = new long[]{172, 200};

	/**
	 * Field descriptor (offset) for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type projection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__shrinkType);
	 * CPointer&lt;Short&gt; p_shrinkType = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkType'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkType = new long[]{176, 204};

	/**
	 * Field descriptor (offset) for struct member 'shrinkOpts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__shrinkOpts);
	 * CPointer&lt;Byte&gt; p_shrinkOpts = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkOpts'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkOpts = new long[]{178, 206};

	/**
	 * Field descriptor (offset) for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink to surface mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__shrinkMode);
	 * CPointer&lt;Byte&gt; p_shrinkMode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkMode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkMode = new long[]{179, 207};

	/**
	 * Field descriptor (offset) for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Limit the projection ray cast. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__projLimit);
	 * CPointer&lt;Float&gt; p_projLimit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projLimit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projLimit = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project over. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__projAxis);
	 * CPointer&lt;Byte&gt; p_projAxis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projAxis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projAxis = new long[]{184, 212};

	/**
	 * Field descriptor (offset) for struct member 'subsurfLevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If using projection over vertex normal this controls the level of subsurface that must be done before getting the vertex coordinates and normal </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__subsurfLevels);
	 * CPointer&lt;Byte&gt; p_subsurfLevels = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurfLevels'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurfLevels = new long[]{185, 213};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{186, 214};

	public ShrinkwrapModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ShrinkwrapModifierData(ShrinkwrapModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink target. </p>
	 * @see #__DNA__FIELD__target
	 */
	
	public CPointer<BlenderObject> getTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink target. </p>
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(CPointer<BlenderObject> target) throws IOException
	{
		long __address = ((target == null) ? 0 : target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'auxTarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional shrink target. </p>
	 * @see #__DNA__FIELD__auxTarget
	 */
	
	public CPointer<BlenderObject> getAuxTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'auxTarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional shrink target. </p>
	 * @see #__DNA__FIELD__auxTarget
	 */
	
	public void setAuxTarget(CPointer<BlenderObject> auxTarget) throws IOException
	{
		long __address = ((auxTarget == null) ? 0 : auxTarget.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public CArrayFacade<Byte> getVgroup_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public void setVgroup_name(CArrayFacade<Byte> vgroup_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(vgroup_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup_name);
		} else {
			__io__generic__copy( getVgroup_name(), vgroup_name);
		}
	}

	/**
	 * Get method for struct member 'keepDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance offset to keep from mesh/projection point. </p>
	 * @see #__DNA__FIELD__keepDist
	 */
	
	public float getKeepDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'keepDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Distance offset to keep from mesh/projection point. </p>
	 * @see #__DNA__FIELD__keepDist
	 */
	
	public void setKeepDist(float keepDist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, keepDist);
		} else {
			__io__block.writeFloat(__io__address + 172, keepDist);
		}
	}

	/**
	 * Get method for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type projection. </p>
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public short getShrinkType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'shrinkType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink type projection. </p>
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public void setShrinkType(short shrinkType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, shrinkType);
		} else {
			__io__block.writeShort(__io__address + 176, shrinkType);
		}
	}

	/**
	 * Get method for struct member 'shrinkOpts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink options. </p>
	 * @see #__DNA__FIELD__shrinkOpts
	 */
	
	public byte getShrinkOpts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 206);
		} else {
			return __io__block.readByte(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'shrinkOpts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink options. </p>
	 * @see #__DNA__FIELD__shrinkOpts
	 */
	
	public void setShrinkOpts(byte shrinkOpts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 206, shrinkOpts);
		} else {
			__io__block.writeByte(__io__address + 178, shrinkOpts);
		}
	}

	/**
	 * Get method for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink to surface mode. </p>
	 * @see #__DNA__FIELD__shrinkMode
	 */
	
	public byte getShrinkMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 207);
		} else {
			return __io__block.readByte(__io__address + 179);
		}
	}

	/**
	 * Set method for struct member 'shrinkMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shrink to surface mode. </p>
	 * @see #__DNA__FIELD__shrinkMode
	 */
	
	public void setShrinkMode(byte shrinkMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 207, shrinkMode);
		} else {
			__io__block.writeByte(__io__address + 179, shrinkMode);
		}
	}

	/**
	 * Get method for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Limit the projection ray cast. </p>
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public float getProjLimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'projLimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Limit the projection ray cast. </p>
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public void setProjLimit(float projLimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, projLimit);
		} else {
			__io__block.writeFloat(__io__address + 180, projLimit);
		}
	}

	/**
	 * Get method for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project over. </p>
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public byte getProjAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 212);
		} else {
			return __io__block.readByte(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'projAxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to project over. </p>
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public void setProjAxis(byte projAxis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 212, projAxis);
		} else {
			__io__block.writeByte(__io__address + 184, projAxis);
		}
	}

	/**
	 * Get method for struct member 'subsurfLevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If using projection over vertex normal this controls the level of subsurface that must be done before getting the vertex coordinates and normal </p>
	 * @see #__DNA__FIELD__subsurfLevels
	 */
	
	public byte getSubsurfLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 213);
		} else {
			return __io__block.readByte(__io__address + 185);
		}
	}

	/**
	 * Set method for struct member 'subsurfLevels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If using projection over vertex normal this controls the level of subsurface that must be done before getting the vertex coordinates and normal </p>
	 * @see #__DNA__FIELD__subsurfLevels
	 */
	
	public void setSubsurfLevels(byte subsurfLevels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 213, subsurfLevels);
		} else {
			__io__block.writeByte(__io__address + 185, subsurfLevels);
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
			return new CArrayFacade<Byte>(__io__address + 214, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 214;
		} else {
			__dna__offset = 186;
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
	public CPointer<ShrinkwrapModifierData> __io__addressof() {
		return new CPointer<ShrinkwrapModifierData>(__io__address, new Class[]{ShrinkwrapModifierData.class}, __io__block, __io__blockTable);
	}

}
