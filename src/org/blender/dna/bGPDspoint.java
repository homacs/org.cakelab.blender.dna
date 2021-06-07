package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDspoint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Grease-Pencil Annotations - 'Stroke Point' -> Coordinates may either be 2d or 3d depending on settings at the time -> Coordinates of point on stroke, in proportions of window size This assumes that the bottom-left corner is (0,0) </p>
 */

@CMetaData(size32=76, size64=80)
public class bGPDspoint extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDspoint.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDspoint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 529;

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Co-ordinates of point (usually 2d, but can be 3d as well). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__x);
	 * CPointer&lt;Float&gt; p_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__y);
	 * CPointer&lt;Float&gt; p_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__z);
	 * CPointer&lt;Float&gt; p_z = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'z'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__z = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__pressure);
	 * CPointer&lt;Float&gt; p_pressure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds since start of stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__uv_fac);
	 * CPointer&lt;Float&gt; p_uv_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_fac = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__uv_rot);
	 * CPointer&lt;Float&gt; p_uv_rot = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_rot'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_rot = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv for fill mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__uv_fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_fill'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_fill = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color RGBA (A=mix factor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__vert_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vert_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_color = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDspoint bgpdspoint = ...;
	 * CPointer&lt;Object&gt; p = bgpdspoint.__dna__addressof(bGPDspoint.__DNA__FIELD__runtime);
	 * CPointer&lt;bGPDspoint_Runtime&gt; p_runtime = p.cast(new Class[]{bGPDspoint_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bGPDspoint_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{64, 64};

	public bGPDspoint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDspoint(bGPDspoint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Co-ordinates of point (usually 2d, but can be 3d as well). </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public float getX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Co-ordinates of point (usually 2d, but can be 3d as well). </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(float x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, x);
		} else {
			__io__block.writeFloat(__io__address + 0, x);
		}
	}

	/**
	 * Get method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public float getY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public void setY(float y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, y);
		} else {
			__io__block.writeFloat(__io__address + 4, y);
		}
	}

	/**
	 * Get method for struct member 'z'.
	 * @see #__DNA__FIELD__z
	 */
	
	public float getZ() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'z'.
	 * @see #__DNA__FIELD__z
	 */
	
	public void setZ(float z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, z);
		} else {
			__io__block.writeFloat(__io__address + 8, z);
		}
	}

	/**
	 * Get method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public float getPressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public void setPressure(float pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, pressure);
		} else {
			__io__block.writeFloat(__io__address + 12, pressure);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, strength);
		} else {
			__io__block.writeFloat(__io__address + 16, strength);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds since start of stroke. </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds since start of stroke. </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, time);
		} else {
			__io__block.writeFloat(__io__address + 20, time);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Additional options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, flag);
		} else {
			__io__block.writeInt(__io__address + 24, flag);
		}
	}

	/**
	 * Get method for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * @see #__DNA__FIELD__uv_fac
	 */
	
	public float getUv_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * @see #__DNA__FIELD__uv_fac
	 */
	
	public void setUv_fac(float uv_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, uv_fac);
		} else {
			__io__block.writeFloat(__io__address + 28, uv_fac);
		}
	}

	/**
	 * Get method for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * @see #__DNA__FIELD__uv_rot
	 */
	
	public float getUv_rot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * @see #__DNA__FIELD__uv_rot
	 */
	
	public void setUv_rot(float uv_rot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, uv_rot);
		} else {
			__io__block.writeFloat(__io__address + 32, uv_rot);
		}
	}

	/**
	 * Get method for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv for fill mode </p>
	 * @see #__DNA__FIELD__uv_fill
	 */
	
	public CArrayFacade<Float> getUv_fill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv for fill mode </p>
	 * @see #__DNA__FIELD__uv_fill
	 */
	
	public void setUv_fill(CArrayFacade<Float> uv_fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(uv_fill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_fill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_fill);
		} else {
			__io__generic__copy( getUv_fill(), uv_fill);
		}
	}

	/**
	 * Get method for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color RGBA (A=mix factor). </p>
	 * @see #__DNA__FIELD__vert_color
	 */
	
	public CArrayFacade<Float> getVert_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color RGBA (A=mix factor). </p>
	 * @see #__DNA__FIELD__vert_color
	 */
	
	public void setVert_color(CArrayFacade<Float> vert_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(vert_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vert_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vert_color);
		} else {
			__io__generic__copy( getVert_color(), vert_color);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
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
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bGPDspoint_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPDspoint_Runtime(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new bGPDspoint_Runtime(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bGPDspoint_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDspoint> __io__addressof() {
		return new CPointer<bGPDspoint>(__io__address, new Class[]{bGPDspoint.class}, __io__block, __io__blockTable);
	}

}
