package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WarpModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=272, size64=312)
public class WarpModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct WarpModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for WarpModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 134;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keep in sync with {@link MappingInfoModifierData}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'map_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__map_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_map_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'map_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__map_object = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_tmp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__uvlayer_tmp);
	 * CPointer&lt;Integer&gt; p_uvlayer_tmp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_tmp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_tmp = new long[]{172, 200};

	/**
	 * Field descriptor (offset) for struct member 'texmapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__texmapping);
	 * CPointer&lt;Integer&gt; p_texmapping = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texmapping'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texmapping = new long[]{176, 204};

	/**
	 * Field descriptor (offset) for struct member 'object_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end {@link MappingInfoModifierData}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__object_from);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object_from = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_from'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_from = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'object_to'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__object_to);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object_to = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_to'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_to = new long[]{184, 216};

	/**
	 * Field descriptor (offset) for struct member 'curfalloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__curfalloff);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curfalloff = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curfalloff'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curfalloff = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'falloff_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__falloff_radius);
	 * CPointer&lt;Float&gt; p_falloff_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_radius = new long[]{260, 300};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not used yet. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{264, 304};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Byte&gt; p_falloff_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{265, 305};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WarpModifierData warpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = warpmodifierdata.__dna__addressof(WarpModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{266, 306};

	public WarpModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WarpModifierData(WarpModifierData that) {
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keep in sync with {@link MappingInfoModifierData}  </p>
	 * @see #__DNA__FIELD__texture
	 */
	
	public CPointer<Tex> getTexture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keep in sync with {@link MappingInfoModifierData}  </p>
	 * @see #__DNA__FIELD__texture
	 */
	
	public void setTexture(CPointer<Tex> texture) throws IOException
	{
		long __address = ((texture == null) ? 0 : texture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'map_object'.
	 * @see #__DNA__FIELD__map_object
	 */
	
	public CPointer<BlenderObject> getMap_object() throws IOException
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
	 * Set method for struct member 'map_object'.
	 * @see #__DNA__FIELD__map_object
	 */
	
	public void setMap_object(CPointer<BlenderObject> map_object) throws IOException
	{
		long __address = ((map_object == null) ? 0 : map_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public CArrayFacade<Byte> getUvlayer_name() throws IOException
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
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvlayer_name);
		} else {
			__io__generic__copy( getUvlayer_name(), uvlayer_name);
		}
	}

	/**
	 * Get method for struct member 'uvlayer_tmp'.
	 * @see #__DNA__FIELD__uvlayer_tmp
	 */
	
	public int getUvlayer_tmp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_tmp'.
	 * @see #__DNA__FIELD__uvlayer_tmp
	 */
	
	public void setUvlayer_tmp(int uvlayer_tmp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, uvlayer_tmp);
		} else {
			__io__block.writeInt(__io__address + 172, uvlayer_tmp);
		}
	}

	/**
	 * Get method for struct member 'texmapping'.
	 * @see #__DNA__FIELD__texmapping
	 */
	
	public int getTexmapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'texmapping'.
	 * @see #__DNA__FIELD__texmapping
	 */
	
	public void setTexmapping(int texmapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, texmapping);
		} else {
			__io__block.writeInt(__io__address + 176, texmapping);
		}
	}

	/**
	 * Get method for struct member 'object_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end {@link MappingInfoModifierData}  </p>
	 * @see #__DNA__FIELD__object_from
	 */
	
	public CPointer<BlenderObject> getObject_from() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end {@link MappingInfoModifierData}  </p>
	 * @see #__DNA__FIELD__object_from
	 */
	
	public void setObject_from(CPointer<BlenderObject> object_from) throws IOException
	{
		long __address = ((object_from == null) ? 0 : object_from.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'object_to'.
	 * @see #__DNA__FIELD__object_to
	 */
	
	public CPointer<BlenderObject> getObject_to() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_to'.
	 * @see #__DNA__FIELD__object_to
	 */
	
	public void setObject_to(CPointer<BlenderObject> object_to) throws IOException
	{
		long __address = ((object_to == null) ? 0 : object_to.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public CPointer<CurveMapping> getCurfalloff() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public void setCurfalloff(CPointer<CurveMapping> curfalloff) throws IOException
	{
		long __address = ((curfalloff == null) ? 0 : curfalloff.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name);
		} else {
			__io__generic__copy( getDefgrp_name(), defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, strength);
		} else {
			__io__block.writeFloat(__io__address + 256, strength);
		}
	}

	/**
	 * Get method for struct member 'falloff_radius'.
	 * @see #__DNA__FIELD__falloff_radius
	 */
	
	public float getFalloff_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'falloff_radius'.
	 * @see #__DNA__FIELD__falloff_radius
	 */
	
	public void setFalloff_radius(float falloff_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, falloff_radius);
		} else {
			__io__block.writeFloat(__io__address + 260, falloff_radius);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not used yet. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 304);
		} else {
			return __io__block.readByte(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Not used yet. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 304, flag);
		} else {
			__io__block.writeByte(__io__address + 264, flag);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public byte getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 305);
		} else {
			return __io__block.readByte(__io__address + 265);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(byte falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 305, falloff_type);
		} else {
			__io__block.writeByte(__io__address + 265, falloff_type);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 306, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 266, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 306;
		} else {
			__dna__offset = 266;
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
	public CPointer<WarpModifierData> __io__addressof() {
		return new CPointer<WarpModifierData>(__io__address, new Class[]{WarpModifierData.class}, __io__block, __io__blockTable);
	}

}
