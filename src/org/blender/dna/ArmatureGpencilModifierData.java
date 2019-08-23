package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ArmatureGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=172, size64=192)
public class ArmatureGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ArmatureGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ArmatureGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 491;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'deformflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformflag replaces armature->deformflag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__deformflag);
	 * CPointer&lt;Short&gt; p_deformflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deformflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deformflag = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'multi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__multi);
	 * CPointer&lt;Short&gt; p_multi = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multi'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multi = new long[]{94, 106};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;Integer&gt; p__pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{96, 108};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'prevCos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stored input of previous modifier, for vertexgroup blending. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__prevCos);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_prevCos = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prevCos'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prevCos = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArmatureGpencilModifierData armaturegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = armaturegpencilmodifierdata.__dna__addressof(ArmatureGpencilModifierData.__DNA__FIELD__vgname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgname = new long[]{108, 128};

	public ArmatureGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ArmatureGpencilModifierData(ArmatureGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
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
	 * Get method for struct member 'deformflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformflag replaces armature->deformflag. </p>
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public short getDeformflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'deformflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deformflag replaces armature->deformflag. </p>
	 * @see #__DNA__FIELD__deformflag
	 */
	
	public void setDeformflag(short deformflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, deformflag);
		} else {
			__io__block.writeShort(__io__address + 92, deformflag);
		}
	}

	/**
	 * Get method for struct member 'multi'.
	 * @see #__DNA__FIELD__multi
	 */
	
	public short getMulti() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 94);
		}
	}

	/**
	 * Set method for struct member 'multi'.
	 * @see #__DNA__FIELD__multi
	 */
	
	public void setMulti(short multi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, multi);
		} else {
			__io__block.writeShort(__io__address + 94, multi);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public int get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(int _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, _pad);
		} else {
			__io__block.writeInt(__io__address + 96, _pad);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'prevCos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stored input of previous modifier, for vertexgroup blending. </p>
	 * @see #__DNA__FIELD__prevCos
	 */
	
	public CPointer<Float> getPrevCos() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prevCos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stored input of previous modifier, for vertexgroup blending. </p>
	 * @see #__DNA__FIELD__prevCos
	 */
	
	public void setPrevCos(CPointer<Float> prevCos) throws IOException
	{
		long __address = ((prevCos == null) ? 0 : prevCos.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgname
	 */
	
	public CArrayFacade<Byte> getVgname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgname
	 */
	
	public void setVgname(CArrayFacade<Byte> vgname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(vgname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgname);
		} else {
			__io__generic__copy( getVgname(), vgname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ArmatureGpencilModifierData> __io__addressof() {
		return new CPointer<ArmatureGpencilModifierData>(__io__address, new Class[]{ArmatureGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
