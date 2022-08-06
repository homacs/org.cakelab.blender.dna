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
 * Generated facet for DNA struct type 'ParticleInstanceModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=280, size64=312)
public class ParticleInstanceModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleInstanceModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleInstanceModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
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
	 * <li>Actual Size (32bit/64bit): 112/136</li>
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
	public static final long[] __DNA__FIELD__ob = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__psys = new long[]{116, 144};

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
	public static final long[] __DNA__FIELD__flag = new long[]{118, 146};

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
	public static final long[] __DNA__FIELD__axis = new long[]{120, 148};

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__space);
	 * CPointer&lt;Short&gt; p_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{122, 150};

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
	public static final long[] __DNA__FIELD__position = new long[]{124, 152};

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
	public static final long[] __DNA__FIELD__random_position = new long[]{128, 156};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{132, 160};

	/**
	 * Field descriptor (offset) for struct member 'random_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__random_rotation);
	 * CPointer&lt;Float&gt; p_random_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_rotation = new long[]{136, 164};

	/**
	 * Field descriptor (offset) for struct member 'particle_amount'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__particle_amount);
	 * CPointer&lt;Float&gt; p_particle_amount = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_amount'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_amount = new long[]{140, 168};

	/**
	 * Field descriptor (offset) for struct member 'particle_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__particle_offset);
	 * CPointer&lt;Float&gt; p_particle_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_offset = new long[]{144, 172};

	/**
	 * Field descriptor (offset) for struct member 'index_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__index_layer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_index_layer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index_layer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index_layer_name = new long[]{148, 176};

	/**
	 * Field descriptor (offset) for struct member 'value_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD__value_layer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_value_layer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_layer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_layer_name = new long[]{212, 240};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleInstanceModifierData particleinstancemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particleinstancemodifierdata.__dna__addressof(ParticleInstanceModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{276, 304};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
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
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public short getPsys() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(short psys) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 144, psys);
		} else {
			__io__block.writeShort(__io__address + 116, psys);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 146);
		} else {
			return __io__block.readShort(__io__address + 118);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 146, flag);
		} else {
			__io__block.writeShort(__io__address + 118, flag);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public short getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 148);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(short axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 148, axis);
		} else {
			__io__block.writeShort(__io__address + 120, axis);
		}
	}

	/**
	 * Get method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public short getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 150);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(short space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 150, space);
		} else {
			__io__block.writeShort(__io__address + 122, space);
		}
	}

	/**
	 * Get method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public float getPosition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public void setPosition(float position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, position);
		} else {
			__io__block.writeFloat(__io__address + 124, position);
		}
	}

	/**
	 * Get method for struct member 'random_position'.
	 * @see #__DNA__FIELD__random_position
	 */
	
	public float getRandom_position() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'random_position'.
	 * @see #__DNA__FIELD__random_position
	 */
	
	public void setRandom_position(float random_position) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, random_position);
		} else {
			__io__block.writeFloat(__io__address + 128, random_position);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, rotation);
		} else {
			__io__block.writeFloat(__io__address + 132, rotation);
		}
	}

	/**
	 * Get method for struct member 'random_rotation'.
	 * @see #__DNA__FIELD__random_rotation
	 */
	
	public float getRandom_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'random_rotation'.
	 * @see #__DNA__FIELD__random_rotation
	 */
	
	public void setRandom_rotation(float random_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, random_rotation);
		} else {
			__io__block.writeFloat(__io__address + 136, random_rotation);
		}
	}

	/**
	 * Get method for struct member 'particle_amount'.
	 * @see #__DNA__FIELD__particle_amount
	 */
	
	public float getParticle_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'particle_amount'.
	 * @see #__DNA__FIELD__particle_amount
	 */
	
	public void setParticle_amount(float particle_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, particle_amount);
		} else {
			__io__block.writeFloat(__io__address + 140, particle_amount);
		}
	}

	/**
	 * Get method for struct member 'particle_offset'.
	 * @see #__DNA__FIELD__particle_offset
	 */
	
	public float getParticle_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'particle_offset'.
	 * @see #__DNA__FIELD__particle_offset
	 */
	
	public void setParticle_offset(float particle_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, particle_offset);
		} else {
			__io__block.writeFloat(__io__address + 144, particle_offset);
		}
	}

	/**
	 * Get method for struct member 'index_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__index_layer_name
	 */
	
	public CArrayFacade<Byte> getIndex_layer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'index_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__index_layer_name
	 */
	
	public void setIndex_layer_name(CArrayFacade<Byte> index_layer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(index_layer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, index_layer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, index_layer_name);
		} else {
			__io__generic__copy( getIndex_layer_name(), index_layer_name);
		}
	}

	/**
	 * Get method for struct member 'value_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__value_layer_name
	 */
	
	public CArrayFacade<Byte> getValue_layer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'value_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__value_layer_name
	 */
	
	public void setValue_layer_name(CArrayFacade<Byte> value_layer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 212;
		}
		if (__io__equals(value_layer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, value_layer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, value_layer_name);
		} else {
			__io__generic__copy( getValue_layer_name(), value_layer_name);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
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
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleInstanceModifierData> __io__addressof() {
		return new CPointer<ParticleInstanceModifierData>(__io__address, new Class[]{ParticleInstanceModifierData.class}, __io__block, __io__blockTable);
	}

}
