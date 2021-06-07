package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FluidEffectorSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Collision objects (filled with smoke). </p>
 */

@CMetaData(size32=44, size64=56)
public class FluidEffectorSettings extends CFacade {

	/**
	 * This is the sdna index of the struct FluidEffectorSettings.
	 * <p>
	 * It is required when allocating a new block to store data for FluidEffectorSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 620;

	/**
	 * Field descriptor (offset) for struct member 'fmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__fmd);
	 * CPointer&lt;CPointer&lt;FluidModifierData&gt;&gt; p_fmd = p.cast(new Class[]{CPointer.class, FluidModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fmd'</li>
	 * <li>Signature: 'FluidModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fmd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__mesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'verts_old'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__verts_old);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_verts_old = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'verts_old'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__verts_old = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional distance around mesh surface to consider as effector<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Thickness of mesh surface, used in obstacle sdf. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__surface_distance);
	 * CPointer&lt;Float&gt; p_surface_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_distance = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving effector objects
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__subframes);
	 * CPointer&lt;Integer&gt; p_subframes = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subframes'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subframes = new long[]{24, 36};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{30, 42};

	/**
	 * Field descriptor (offset) for struct member 'vel_multi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guiding options. Multiplier for object velocity. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__vel_multi);
	 * CPointer&lt;Float&gt; p_vel_multi = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_multi'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_multi = new long[]{36, 48};

	/**
	 * Field descriptor (offset) for struct member 'guiding_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD__guiding_mode);
	 * CPointer&lt;Short&gt; p_guiding_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_mode = new long[]{40, 52};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidEffectorSettings fluideffectorsettings = ...;
	 * CPointer&lt;Object&gt; p = fluideffectorsettings.__dna__addressof(FluidEffectorSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{42, 54};

	public FluidEffectorSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FluidEffectorSettings(FluidEffectorSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * @see #__DNA__FIELD__fmd
	 */
	
	public CPointer<FluidModifierData> getFmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidModifierData.class};
		return new CPointer<FluidModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * @see #__DNA__FIELD__fmd
	 */
	
	public void setFmd(CPointer<FluidModifierData> fmd) throws IOException
	{
		long __address = ((fmd == null) ? 0 : fmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh'.
	 * @see #__DNA__FIELD__mesh
	 */
	
	public CPointer<Mesh> getMesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh'.
	 * @see #__DNA__FIELD__mesh
	 */
	
	public void setMesh(CPointer<Mesh> mesh) throws IOException
	{
		long __address = ((mesh == null) ? 0 : mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'verts_old'.
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public CPointer<Float> getVerts_old() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'verts_old'.
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public void setVerts_old(CPointer<Float> verts_old) throws IOException
	{
		long __address = ((verts_old == null) ? 0 : verts_old.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, numverts);
		} else {
			__io__block.writeInt(__io__address + 12, numverts);
		}
	}

	/**
	 * Get method for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional distance around mesh surface to consider as effector<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Thickness of mesh surface, used in obstacle sdf. </p>
	 * @see #__DNA__FIELD__surface_distance
	 */
	
	public float getSurface_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional distance around mesh surface to consider as effector<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Thickness of mesh surface, used in obstacle sdf. </p>
	 * @see #__DNA__FIELD__surface_distance
	 */
	
	public void setSurface_distance(float surface_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, surface_distance);
		} else {
			__io__block.writeFloat(__io__address + 16, surface_distance);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, flags);
		} else {
			__io__block.writeInt(__io__address + 20, flags);
		}
	}

	/**
	 * Get method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving effector objects
	 * @see #__DNA__FIELD__subframes
	 */
	
	public int getSubframes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving effector objects
	 * @see #__DNA__FIELD__subframes
	 */
	
	public void setSubframes(int subframes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, subframes);
		} else {
			__io__block.writeInt(__io__address + 24, subframes);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, type);
		} else {
			__io__block.writeShort(__io__address + 28, type);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 42, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 30, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 42;
		} else {
			__dna__offset = 30;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'vel_multi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guiding options. Multiplier for object velocity. </p>
	 * @see #__DNA__FIELD__vel_multi
	 */
	
	public float getVel_multi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'vel_multi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guiding options. Multiplier for object velocity. </p>
	 * @see #__DNA__FIELD__vel_multi
	 */
	
	public void setVel_multi(float vel_multi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, vel_multi);
		} else {
			__io__block.writeFloat(__io__address + 36, vel_multi);
		}
	}

	/**
	 * Get method for struct member 'guiding_mode'.
	 * @see #__DNA__FIELD__guiding_mode
	 */
	
	public short getGuiding_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 52);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'guiding_mode'.
	 * @see #__DNA__FIELD__guiding_mode
	 */
	
	public void setGuiding_mode(short guiding_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 52, guiding_mode);
		} else {
			__io__block.writeShort(__io__address + 40, guiding_mode);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 54, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 42, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 54;
		} else {
			__dna__offset = 42;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FluidEffectorSettings> __io__addressof() {
		return new CPointer<FluidEffectorSettings>(__io__address, new Class[]{FluidEffectorSettings.class}, __io__block, __io__blockTable);
	}

}
