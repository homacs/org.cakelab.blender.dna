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
 * Generated facet for DNA struct type 'bGPDcurve_point'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  GP {@link Curve}  Point </p>
 */

@CMetaData(size32=124, size64=124)
public class bGPDcurve_point extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDcurve_point.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDcurve_point.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 533;

	/**
	 * Field descriptor (offset) for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bezier Triple for the handles and control points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__bezt);
	 * CPointer&lt;BezTriple&gt; p_bezt = p.cast(new Class[]{BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bezt'</li>
	 * <li>Signature: 'BezTriple'</li>
	 * <li>Actual Size (32bit/64bit): 72/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bezt = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__pressure);
	 * CPointer&lt;Float&gt; p_pressure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'point_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of corresponding point in gps->points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__point_index);
	 * CPointer&lt;Integer&gt; p_point_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_index = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__uv_fac);
	 * CPointer&lt;Float&gt; p_uv_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_fac = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__uv_rot);
	 * CPointer&lt;Float&gt; p_uv_rot = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_rot'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_rot = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv for fill mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__uv_fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_fill'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_fill = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color RGBA (A=mix factor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD__vert_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vert_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_color = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDcurve_point bgpdcurve_point = ...;
	 * CPointer&lt;Object&gt; p = bgpdcurve_point.__dna__addressof(bGPDcurve_point.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{120, 120};

	public bGPDcurve_point(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDcurve_point(bGPDcurve_point that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bezier Triple for the handles and control points. </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public BezTriple getBezt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bezier Triple for the handles and control points. </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public void setBezt(BezTriple bezt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(bezt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bezt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bezt);
		} else {
			__io__generic__copy( getBezt(), bezt);
		}
	}

	/**
	 * Get method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public float getPressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pressure of input device (from 0 to 1) at this point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public void setPressure(float pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, pressure);
		} else {
			__io__block.writeFloat(__io__address + 72, pressure);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color strength (used for alpha factor). </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, strength);
		} else {
			__io__block.writeFloat(__io__address + 76, strength);
		}
	}

	/**
	 * Get method for struct member 'point_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of corresponding point in gps->points. </p>
	 * @see #__DNA__FIELD__point_index
	 */
	
	public int getPoint_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'point_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Index of corresponding point in gps->points. </p>
	 * @see #__DNA__FIELD__point_index
	 */
	
	public void setPoint_index(int point_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, point_index);
		} else {
			__io__block.writeInt(__io__address + 80, point_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Additional options. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, flag);
		} else {
			__io__block.writeInt(__io__address + 84, flag);
		}
	}

	/**
	 * Get method for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * @see #__DNA__FIELD__uv_fac
	 */
	
	public float getUv_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'uv_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of uv along the stroke. </p>
	 * @see #__DNA__FIELD__uv_fac
	 */
	
	public void setUv_fac(float uv_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, uv_fac);
		} else {
			__io__block.writeFloat(__io__address + 88, uv_fac);
		}
	}

	/**
	 * Get method for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * @see #__DNA__FIELD__uv_rot
	 */
	
	public float getUv_rot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'uv_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv rotation for dot mode. </p>
	 * @see #__DNA__FIELD__uv_rot
	 */
	
	public void setUv_rot(float uv_rot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, uv_rot);
		} else {
			__io__block.writeFloat(__io__address + 92, uv_rot);
		}
	}

	/**
	 * Get method for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv for fill mode. </p>
	 * @see #__DNA__FIELD__uv_fill
	 */
	
	public CArrayFacade<Float> getUv_fill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Uv for fill mode. </p>
	 * @see #__DNA__FIELD__uv_fill
	 */
	
	public void setUv_fill(CArrayFacade<Float> uv_fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
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
	 * <h4>Blender Source Code</h4>
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
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color RGBA (A=mix factor). </p>
	 * @see #__DNA__FIELD__vert_color
	 */
	
	public void setVert_color(CArrayFacade<Float> vert_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 104;
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
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 120;
		} else {
			__dna__offset = 120;
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
	public CPointer<bGPDcurve_point> __io__addressof() {
		return new CPointer<bGPDcurve_point>(__io__address, new Class[]{bGPDcurve_point.class}, __io__block, __io__blockTable);
	}

}
