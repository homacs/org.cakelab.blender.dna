package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VolumeDisplaceModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=176)
public class VolumeDisplaceModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct VolumeDisplaceModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for VolumeDisplaceModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 162;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'texture_map_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__texture_map_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_texture_map_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_map_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_map_object = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'texture_map_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__texture_map_mode);
	 * CPointer&lt;Integer&gt; p_texture_map_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_map_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_map_mode = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{124, 156};

	/**
	 * Field descriptor (offset) for struct member 'texture_mid_level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__texture_mid_level);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_texture_mid_level = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_mid_level'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_mid_level = new long[]{128, 160};

	/**
	 * Field descriptor (offset) for struct member 'texture_sample_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplaceModifierData volumedisplacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = volumedisplacemodifierdata.__dna__addressof(VolumeDisplaceModifierData.__DNA__FIELD__texture_sample_radius);
	 * CPointer&lt;Float&gt; p_texture_sample_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_sample_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_sample_radius = new long[]{140, 172};

	public VolumeDisplaceModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VolumeDisplaceModifierData(VolumeDisplaceModifierData that) {
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
	 * Get method for struct member 'texture'.
	 * @see #__DNA__FIELD__texture
	 */
	
	public CPointer<Tex> getTexture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texture'.
	 * @see #__DNA__FIELD__texture
	 */
	
	public void setTexture(CPointer<Tex> texture) throws IOException
	{
		long __address = ((texture == null) ? 0 : texture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'texture_map_object'.
	 * @see #__DNA__FIELD__texture_map_object
	 */
	
	public CPointer<BlenderObject> getTexture_map_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texture_map_object'.
	 * @see #__DNA__FIELD__texture_map_object
	 */
	
	public void setTexture_map_object(CPointer<BlenderObject> texture_map_object) throws IOException
	{
		long __address = ((texture_map_object == null) ? 0 : texture_map_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'texture_map_mode'.
	 * @see #__DNA__FIELD__texture_map_mode
	 */
	
	public int getTexture_map_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'texture_map_mode'.
	 * @see #__DNA__FIELD__texture_map_mode
	 */
	
	public void setTexture_map_mode(int texture_map_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, texture_map_mode);
		} else {
			__io__block.writeInt(__io__address + 120, texture_map_mode);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, strength);
		} else {
			__io__block.writeFloat(__io__address + 124, strength);
		}
	}

	/**
	 * Get method for struct member 'texture_mid_level'.
	 * @see #__DNA__FIELD__texture_mid_level
	 */
	
	public CArrayFacade<Float> getTexture_mid_level() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'texture_mid_level'.
	 * @see #__DNA__FIELD__texture_mid_level
	 */
	
	public void setTexture_mid_level(CArrayFacade<Float> texture_mid_level) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(texture_mid_level, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, texture_mid_level)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, texture_mid_level);
		} else {
			__io__generic__copy( getTexture_mid_level(), texture_mid_level);
		}
	}

	/**
	 * Get method for struct member 'texture_sample_radius'.
	 * @see #__DNA__FIELD__texture_sample_radius
	 */
	
	public float getTexture_sample_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'texture_sample_radius'.
	 * @see #__DNA__FIELD__texture_sample_radius
	 */
	
	public void setTexture_sample_radius(float texture_sample_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, texture_sample_radius);
		} else {
			__io__block.writeFloat(__io__address + 140, texture_sample_radius);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<VolumeDisplaceModifierData> __io__addressof() {
		return new CPointer<VolumeDisplaceModifierData>(__io__address, new Class[]{VolumeDisplaceModifierData.class}, __io__block, __io__blockTable);
	}

}
