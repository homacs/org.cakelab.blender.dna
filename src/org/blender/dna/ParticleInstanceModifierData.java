package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleInstanceModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=116, size64=136)
public class ParticleInstanceModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleInstanceModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleInstanceModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 118;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__psys);
	 * CPointer&lt;Short&gt; p_psys = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{102, 122};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__axis);
	 * CPointer&lt;Short&gt; p_axis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{106, 126};

	/**
	 * Field descriptor (offset) for struct member 'position'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__position);
	 * CPointer&lt;Float&gt; p_position = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'position'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__position = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'random_position'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__random_position);
	 * CPointer&lt;Float&gt; p_random_position = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_position'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_position = new long[]{112, 132};

	public ParticleInstanceModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleInstanceModifierData(ParticleInstanceModifierData that) {
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
	 * Get method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public CPointer<BlenderObject> getOb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public void setOb(CPointer<BlenderObject> ob) throws IOException
	{
		long __address = ((ob == null) ? 0 : ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public short getPsys() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 120);
		} else {
			return __io__block.readShort(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(short psys) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 120, psys);
		} else {
			__io__block.writeShort(__io__address + 100, psys);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 122);
		} else {
			return __io__block.readShort(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 122, flag);
		} else {
			__io__block.writeShort(__io__address + 102, flag);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public short getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(short axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, axis);
		} else {
			__io__block.writeShort(__io__address + 104, axis);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 126);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 126, pad);
		} else {
			__io__block.writeShort(__io__address + 106, pad);
		}
	}

	/**
	 * Get method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public float getPosition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public void setPosition(float position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, position);
		} else {
			__io__block.writeFloat(__io__address + 108, position);
		}
	}

	/**
	 * Get method for struct member 'random_position'.
	 * @see #__DNA__FIELD__random_position
	 */
	
	public float getRandom_position() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'random_position'.
	 * @see #__DNA__FIELD__random_position
	 */
	
	public void setRandom_position(float random_position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, random_position);
		} else {
			__io__block.writeFloat(__io__address + 112, random_position);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleInstanceModifierData> __io__addressof() {
		return new CPointer<ParticleInstanceModifierData>(__io__address, new Class[]{ParticleInstanceModifierData.class}, __io__block, __io__blockTable);
	}

}
