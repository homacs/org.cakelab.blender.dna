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
 * Generated facet for DNA struct type 'NodeTexSky'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1020, size64=1024)
public class NodeTexSky extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexSky.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexSky.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 456;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 956/960</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sky_model'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sky_model);
	 * CPointer&lt;Integer&gt; p_sky_model = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sky_model'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sky_model = new long[]{956, 960};

	/**
	 * Field descriptor (offset) for struct member 'sun_direction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_direction);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sun_direction = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_direction'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_direction = new long[]{960, 964};

	/**
	 * Field descriptor (offset) for struct member 'turbidity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__turbidity);
	 * CPointer&lt;Float&gt; p_turbidity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'turbidity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__turbidity = new long[]{972, 976};

	/**
	 * Field descriptor (offset) for struct member 'ground_albedo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__ground_albedo);
	 * CPointer&lt;Float&gt; p_ground_albedo = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ground_albedo'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ground_albedo = new long[]{976, 980};

	/**
	 * Field descriptor (offset) for struct member 'sun_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_size);
	 * CPointer&lt;Float&gt; p_sun_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_size = new long[]{980, 984};

	/**
	 * Field descriptor (offset) for struct member 'sun_intensity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_intensity);
	 * CPointer&lt;Float&gt; p_sun_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_intensity = new long[]{984, 988};

	/**
	 * Field descriptor (offset) for struct member 'sun_elevation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_elevation);
	 * CPointer&lt;Float&gt; p_sun_elevation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_elevation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_elevation = new long[]{988, 992};

	/**
	 * Field descriptor (offset) for struct member 'sun_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_rotation);
	 * CPointer&lt;Float&gt; p_sun_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_rotation = new long[]{992, 996};

	/**
	 * Field descriptor (offset) for struct member 'altitude'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__altitude);
	 * CPointer&lt;Float&gt; p_altitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'altitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__altitude = new long[]{996, 1000};

	/**
	 * Field descriptor (offset) for struct member 'air_density'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__air_density);
	 * CPointer&lt;Float&gt; p_air_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_density = new long[]{1000, 1004};

	/**
	 * Field descriptor (offset) for struct member 'dust_density'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__dust_density);
	 * CPointer&lt;Float&gt; p_dust_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dust_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dust_density = new long[]{1004, 1008};

	/**
	 * Field descriptor (offset) for struct member 'ozone_density'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__ozone_density);
	 * CPointer&lt;Float&gt; p_ozone_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ozone_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ozone_density = new long[]{1008, 1012};

	/**
	 * Field descriptor (offset) for struct member 'sun_disc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD__sun_disc);
	 * CPointer&lt;Byte&gt; p_sun_disc = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sun_disc'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sun_disc = new long[]{1012, 1016};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexSky nodetexsky = ...;
	 * CPointer&lt;Object&gt; p = nodetexsky.__dna__addressof(NodeTexSky.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1013, 1017};

	public NodeTexSky(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexSky(NodeTexSky that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public NodeTexBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(NodeTexBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'sky_model'.
	 * @see #__DNA__FIELD__sky_model
	 */
	
	public int getSky_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 960);
		} else {
			return __io__block.readInt(__io__address + 956);
		}
	}

	/**
	 * Set method for struct member 'sky_model'.
	 * @see #__DNA__FIELD__sky_model
	 */
	
	public void setSky_model(int sky_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 960, sky_model);
		} else {
			__io__block.writeInt(__io__address + 956, sky_model);
		}
	}

	/**
	 * Get method for struct member 'sun_direction'.
	 * @see #__DNA__FIELD__sun_direction
	 */
	
	public CArrayFacade<Float> getSun_direction() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 964, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 960, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sun_direction'.
	 * @see #__DNA__FIELD__sun_direction
	 */
	
	public void setSun_direction(CArrayFacade<Float> sun_direction) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 964;
		} else {
			__dna__offset = 960;
		}
		if (__io__equals(sun_direction, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sun_direction)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sun_direction);
		} else {
			__io__generic__copy( getSun_direction(), sun_direction);
		}
	}

	/**
	 * Get method for struct member 'turbidity'.
	 * @see #__DNA__FIELD__turbidity
	 */
	
	public float getTurbidity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 976);
		} else {
			return __io__block.readFloat(__io__address + 972);
		}
	}

	/**
	 * Set method for struct member 'turbidity'.
	 * @see #__DNA__FIELD__turbidity
	 */
	
	public void setTurbidity(float turbidity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 976, turbidity);
		} else {
			__io__block.writeFloat(__io__address + 972, turbidity);
		}
	}

	/**
	 * Get method for struct member 'ground_albedo'.
	 * @see #__DNA__FIELD__ground_albedo
	 */
	
	public float getGround_albedo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 980);
		} else {
			return __io__block.readFloat(__io__address + 976);
		}
	}

	/**
	 * Set method for struct member 'ground_albedo'.
	 * @see #__DNA__FIELD__ground_albedo
	 */
	
	public void setGround_albedo(float ground_albedo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 980, ground_albedo);
		} else {
			__io__block.writeFloat(__io__address + 976, ground_albedo);
		}
	}

	/**
	 * Get method for struct member 'sun_size'.
	 * @see #__DNA__FIELD__sun_size
	 */
	
	public float getSun_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 984);
		} else {
			return __io__block.readFloat(__io__address + 980);
		}
	}

	/**
	 * Set method for struct member 'sun_size'.
	 * @see #__DNA__FIELD__sun_size
	 */
	
	public void setSun_size(float sun_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 984, sun_size);
		} else {
			__io__block.writeFloat(__io__address + 980, sun_size);
		}
	}

	/**
	 * Get method for struct member 'sun_intensity'.
	 * @see #__DNA__FIELD__sun_intensity
	 */
	
	public float getSun_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 988);
		} else {
			return __io__block.readFloat(__io__address + 984);
		}
	}

	/**
	 * Set method for struct member 'sun_intensity'.
	 * @see #__DNA__FIELD__sun_intensity
	 */
	
	public void setSun_intensity(float sun_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 988, sun_intensity);
		} else {
			__io__block.writeFloat(__io__address + 984, sun_intensity);
		}
	}

	/**
	 * Get method for struct member 'sun_elevation'.
	 * @see #__DNA__FIELD__sun_elevation
	 */
	
	public float getSun_elevation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 992);
		} else {
			return __io__block.readFloat(__io__address + 988);
		}
	}

	/**
	 * Set method for struct member 'sun_elevation'.
	 * @see #__DNA__FIELD__sun_elevation
	 */
	
	public void setSun_elevation(float sun_elevation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 992, sun_elevation);
		} else {
			__io__block.writeFloat(__io__address + 988, sun_elevation);
		}
	}

	/**
	 * Get method for struct member 'sun_rotation'.
	 * @see #__DNA__FIELD__sun_rotation
	 */
	
	public float getSun_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 996);
		} else {
			return __io__block.readFloat(__io__address + 992);
		}
	}

	/**
	 * Set method for struct member 'sun_rotation'.
	 * @see #__DNA__FIELD__sun_rotation
	 */
	
	public void setSun_rotation(float sun_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 996, sun_rotation);
		} else {
			__io__block.writeFloat(__io__address + 992, sun_rotation);
		}
	}

	/**
	 * Get method for struct member 'altitude'.
	 * @see #__DNA__FIELD__altitude
	 */
	
	public float getAltitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1000);
		} else {
			return __io__block.readFloat(__io__address + 996);
		}
	}

	/**
	 * Set method for struct member 'altitude'.
	 * @see #__DNA__FIELD__altitude
	 */
	
	public void setAltitude(float altitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1000, altitude);
		} else {
			__io__block.writeFloat(__io__address + 996, altitude);
		}
	}

	/**
	 * Get method for struct member 'air_density'.
	 * @see #__DNA__FIELD__air_density
	 */
	
	public float getAir_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1004);
		} else {
			return __io__block.readFloat(__io__address + 1000);
		}
	}

	/**
	 * Set method for struct member 'air_density'.
	 * @see #__DNA__FIELD__air_density
	 */
	
	public void setAir_density(float air_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1004, air_density);
		} else {
			__io__block.writeFloat(__io__address + 1000, air_density);
		}
	}

	/**
	 * Get method for struct member 'dust_density'.
	 * @see #__DNA__FIELD__dust_density
	 */
	
	public float getDust_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1008);
		} else {
			return __io__block.readFloat(__io__address + 1004);
		}
	}

	/**
	 * Set method for struct member 'dust_density'.
	 * @see #__DNA__FIELD__dust_density
	 */
	
	public void setDust_density(float dust_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1008, dust_density);
		} else {
			__io__block.writeFloat(__io__address + 1004, dust_density);
		}
	}

	/**
	 * Get method for struct member 'ozone_density'.
	 * @see #__DNA__FIELD__ozone_density
	 */
	
	public float getOzone_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1012);
		} else {
			return __io__block.readFloat(__io__address + 1008);
		}
	}

	/**
	 * Set method for struct member 'ozone_density'.
	 * @see #__DNA__FIELD__ozone_density
	 */
	
	public void setOzone_density(float ozone_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1012, ozone_density);
		} else {
			__io__block.writeFloat(__io__address + 1008, ozone_density);
		}
	}

	/**
	 * Get method for struct member 'sun_disc'.
	 * @see #__DNA__FIELD__sun_disc
	 */
	
	public byte getSun_disc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1016);
		} else {
			return __io__block.readByte(__io__address + 1012);
		}
	}

	/**
	 * Set method for struct member 'sun_disc'.
	 * @see #__DNA__FIELD__sun_disc
	 */
	
	public void setSun_disc(byte sun_disc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1016, sun_disc);
		} else {
			__io__block.writeByte(__io__address + 1012, sun_disc);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1017, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1013, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1017;
		} else {
			__dna__offset = 1013;
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
	public CPointer<NodeTexSky> __io__addressof() {
		return new CPointer<NodeTexSky>(__io__address, new Class[]{NodeTexSky.class}, __io__block, __io__blockTable);
	}

}
