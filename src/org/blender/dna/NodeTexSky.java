package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=988, size64=992)
public class NodeTexSky extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexSky.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexSky.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 434;

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
	 * <li>Actual Size (32bit/64bit): 964/968</li>
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
	public static final long[] __DNA__FIELD__sky_model = new long[]{964, 968};

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
	public static final long[] __DNA__FIELD__sun_direction = new long[]{968, 972};

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
	public static final long[] __DNA__FIELD__turbidity = new long[]{980, 984};

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
	public static final long[] __DNA__FIELD__ground_albedo = new long[]{984, 988};

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
			return __io__block.readInt(__io__address + 968);
		} else {
			return __io__block.readInt(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'sky_model'.
	 * @see #__DNA__FIELD__sky_model
	 */
	
	public void setSky_model(int sky_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 968, sky_model);
		} else {
			__io__block.writeInt(__io__address + 964, sky_model);
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
			return new CArrayFacade<Float>(__io__address + 972, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 968, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 972;
		} else {
			__dna__offset = 968;
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
			return __io__block.readFloat(__io__address + 984);
		} else {
			return __io__block.readFloat(__io__address + 980);
		}
	}

	/**
	 * Set method for struct member 'turbidity'.
	 * @see #__DNA__FIELD__turbidity
	 */
	
	public void setTurbidity(float turbidity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 984, turbidity);
		} else {
			__io__block.writeFloat(__io__address + 980, turbidity);
		}
	}

	/**
	 * Get method for struct member 'ground_albedo'.
	 * @see #__DNA__FIELD__ground_albedo
	 */
	
	public float getGround_albedo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 988);
		} else {
			return __io__block.readFloat(__io__address + 984);
		}
	}

	/**
	 * Set method for struct member 'ground_albedo'.
	 * @see #__DNA__FIELD__ground_albedo
	 */
	
	public void setGround_albedo(float ground_albedo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 988, ground_albedo);
		} else {
			__io__block.writeFloat(__io__address + 984, ground_albedo);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexSky> __io__addressof() {
		return new CPointer<NodeTexSky>(__io__address, new Class[]{NodeTexSky.class}, __io__block, __io__blockTable);
	}

}
