package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BezTriple'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Keyframes on F-Curves (allows code reuse of Bezier eval code) and Points on Bezier Curves/Paths are generally BezTriples.</p><p><h2>Note</h2><p>{@link BezTriple.tilt}  location in struct is abused by {@link Key}  system.</p> BezTriple.tilt location in struct is abused by Key system.
 * <h2>Note</h2><p> vec in {@link BezTriple}  looks like this:<ul><li><p> vec[0][0] = x location of handle 1</p></li><li><p> vec[0][1] = y location of handle 1</p></li><li><p> vec[0][2] = z location of handle 1 (not used for {@link FCurve}  Points(2d))</p></li><li><p> vec[1][0] = x location of control point</p></li><li><p> vec[1][1] = y location of control point</p></li><li><p> vec[1][2] = z location of control point</p></li><li><p> vec[2][0] = x location of handle 2</p></li><li><p> vec[2][1] = y location of handle 2</p></li><li><p> vec[2][2] = z location of handle 2 (not used for {@link FCurve}  Points(2d)) </p></li></ul> 
 * vec[0][0] = x location of handle 1vec[0][1] = y location of handle 1vec[0][2] = z location of handle 1 (not used for FCurve Points(2d))vec[1][0] = x location of control pointvec[1][1] = y location of control pointvec[1][2] = z location of control pointvec[2][0] = x location of handle 2vec[2][1] = y location of handle 2vec[2][2] = z location of handle 2 (not used for FCurve Points(2d)) 
 * </p> vec in BezTriple looks like this:
 * vec[0][0] = x location of handle 1vec[0][1] = y location of handle 1vec[0][2] = z location of handle 1 (not used for FCurve Points(2d))vec[1][0] = x location of control pointvec[1][1] = y location of control pointvec[1][2] = z location of control pointvec[2][0] = x location of handle 2vec[2][1] = y location of handle 2vec[2][2] = z location of handle 2 (not used for FCurve Points(2d)) 
 * 
 * </p>
 */

@CMetaData(size32=72, size64=72)
public class BezTriple extends CFacade {

	/**
	 * This is the sdna index of the struct BezTriple.
	 * <p>
	 * It is required when allocating a new block to store data for BezTriple.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 54;

	/**
	 * Field descriptor (offset) for struct member 'vec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__vec);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_vec = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vec'</li>
	 * <li>Signature: 'float[3][3]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vec = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'alfa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__alfa);
	 * CPointer&lt;Float&gt; p_alfa = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alfa'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alfa = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for softbody goal weight. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For bevel tapering & modifiers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__radius);
	 * CPointer&lt;Float&gt; p_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Ipo} : interpolation mode for segment from this {@link BezTriple}  to the next. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__ipo);
	 * CPointer&lt;Byte&gt; p_ipo = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> H1, h2: the handle type of the two handles. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__h1);
	 * CPointer&lt;Byte&gt; p_h1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h1 = new long[]{49, 49};

	/**
	 * Field descriptor (offset) for struct member 'h2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__h2);
	 * CPointer&lt;Byte&gt; p_h2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h2 = new long[]{50, 50};

	/**
	 * Field descriptor (offset) for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F1, f2, f3: used for selection status. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__f1);
	 * CPointer&lt;Byte&gt; p_f1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f1 = new long[]{51, 51};

	/**
	 * Field descriptor (offset) for struct member 'f2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__f2);
	 * CPointer&lt;Byte&gt; p_f2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f2 = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'f3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__f3);
	 * CPointer&lt;Byte&gt; p_f3 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f3'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f3 = new long[]{53, 53};

	/**
	 * Field descriptor (offset) for struct member 'hide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Hide: used to indicate whether {@link BezTriple}  is hidden (3D), type of keyframe (eBezTriple_KeyframeType). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__hide);
	 * CPointer&lt;Byte&gt; p_hide = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hide'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hide = new long[]{54, 54};

	/**
	 * Field descriptor (offset) for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Easing: easing type for interpolation mode (eBezTriple_Easing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__easing);
	 * CPointer&lt;Byte&gt; p_easing = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'easing'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__easing = new long[]{55, 55};

	/**
	 * Field descriptor (offset) for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__back);
	 * CPointer&lt;Float&gt; p_back = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'back'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__back = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__amplitude);
	 * CPointer&lt;Float&gt; p_amplitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amplitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amplitude = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'period'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__period);
	 * CPointer&lt;Float&gt; p_period = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'period'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__period = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'f5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F5: used for auto handle to distinguish between normal handle and exception (extrema). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__f5);
	 * CPointer&lt;Byte&gt; p_f5 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f5'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f5 = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{69, 69};

	public BezTriple(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BezTriple(BezTriple that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vec'.
	 * @see #__DNA__FIELD__vec
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getVec() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			3,
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vec'.
	 * @see #__DNA__FIELD__vec
	 */
	
	public void setVec(CArrayFacade<CArrayFacade<Float>> vec) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(vec, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vec)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vec);
		} else {
			__io__generic__copy( getVec(), vec);
		}
	}

	/**
	 * Get method for struct member 'alfa'.
	 * @see #__DNA__FIELD__alfa
	 */
	
	public float getAlfa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'alfa'.
	 * @see #__DNA__FIELD__alfa
	 */
	
	public void setAlfa(float alfa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, alfa);
		} else {
			__io__block.writeFloat(__io__address + 36, alfa);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for softbody goal weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for softbody goal weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, weight);
		} else {
			__io__block.writeFloat(__io__address + 40, weight);
		}
	}

	/**
	 * Get method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For bevel tapering & modifiers. </p>
	 * @see #__DNA__FIELD__radius
	 */
	
	public float getRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For bevel tapering & modifiers. </p>
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(float radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, radius);
		} else {
			__io__block.writeFloat(__io__address + 44, radius);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Ipo} : interpolation mode for segment from this {@link BezTriple}  to the next. </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public byte getIpo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 48);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Ipo} : interpolation mode for segment from this {@link BezTriple}  to the next. </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(byte ipo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 48, ipo);
		} else {
			__io__block.writeByte(__io__address + 48, ipo);
		}
	}

	/**
	 * Get method for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> H1, h2: the handle type of the two handles. </p>
	 * @see #__DNA__FIELD__h1
	 */
	
	public byte getH1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 49);
		} else {
			return __io__block.readByte(__io__address + 49);
		}
	}

	/**
	 * Set method for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> H1, h2: the handle type of the two handles. </p>
	 * @see #__DNA__FIELD__h1
	 */
	
	public void setH1(byte h1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 49, h1);
		} else {
			__io__block.writeByte(__io__address + 49, h1);
		}
	}

	/**
	 * Get method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public byte getH2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 50);
		} else {
			return __io__block.readByte(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public void setH2(byte h2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 50, h2);
		} else {
			__io__block.writeByte(__io__address + 50, h2);
		}
	}

	/**
	 * Get method for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F1, f2, f3: used for selection status. </p>
	 * @see #__DNA__FIELD__f1
	 */
	
	public byte getF1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 51);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F1, f2, f3: used for selection status. </p>
	 * @see #__DNA__FIELD__f1
	 */
	
	public void setF1(byte f1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 51, f1);
		} else {
			__io__block.writeByte(__io__address + 51, f1);
		}
	}

	/**
	 * Get method for struct member 'f2'.
	 * @see #__DNA__FIELD__f2
	 */
	
	public byte getF2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 52);
		} else {
			return __io__block.readByte(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'f2'.
	 * @see #__DNA__FIELD__f2
	 */
	
	public void setF2(byte f2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 52, f2);
		} else {
			__io__block.writeByte(__io__address + 52, f2);
		}
	}

	/**
	 * Get method for struct member 'f3'.
	 * @see #__DNA__FIELD__f3
	 */
	
	public byte getF3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 53);
		} else {
			return __io__block.readByte(__io__address + 53);
		}
	}

	/**
	 * Set method for struct member 'f3'.
	 * @see #__DNA__FIELD__f3
	 */
	
	public void setF3(byte f3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 53, f3);
		} else {
			__io__block.writeByte(__io__address + 53, f3);
		}
	}

	/**
	 * Get method for struct member 'hide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Hide: used to indicate whether {@link BezTriple}  is hidden (3D), type of keyframe (eBezTriple_KeyframeType). </p>
	 * @see #__DNA__FIELD__hide
	 */
	
	public byte getHide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 54);
		} else {
			return __io__block.readByte(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'hide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Hide: used to indicate whether {@link BezTriple}  is hidden (3D), type of keyframe (eBezTriple_KeyframeType). </p>
	 * @see #__DNA__FIELD__hide
	 */
	
	public void setHide(byte hide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 54, hide);
		} else {
			__io__block.writeByte(__io__address + 54, hide);
		}
	}

	/**
	 * Get method for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Easing: easing type for interpolation mode (eBezTriple_Easing). </p>
	 * @see #__DNA__FIELD__easing
	 */
	
	public byte getEasing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 55);
		} else {
			return __io__block.readByte(__io__address + 55);
		}
	}

	/**
	 * Set method for struct member 'easing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Easing: easing type for interpolation mode (eBezTriple_Easing). </p>
	 * @see #__DNA__FIELD__easing
	 */
	
	public void setEasing(byte easing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 55, easing);
		} else {
			__io__block.writeByte(__io__address + 55, easing);
		}
	}

	/**
	 * Get method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public float getBack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_BACK. </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public void setBack(float back) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, back);
		} else {
			__io__block.writeFloat(__io__address + 56, back);
		}
	}

	/**
	 * Get method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public float getAmplitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> BEZT_IPO_ELASTIC. </p>
	 * @see #__DNA__FIELD__amplitude
	 */
	
	public void setAmplitude(float amplitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, amplitude);
		} else {
			__io__block.writeFloat(__io__address + 60, amplitude);
		}
	}

	/**
	 * Get method for struct member 'period'.
	 * @see #__DNA__FIELD__period
	 */
	
	public float getPeriod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'period'.
	 * @see #__DNA__FIELD__period
	 */
	
	public void setPeriod(float period) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, period);
		} else {
			__io__block.writeFloat(__io__address + 64, period);
		}
	}

	/**
	 * Get method for struct member 'f5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F5: used for auto handle to distinguish between normal handle and exception (extrema). </p>
	 * @see #__DNA__FIELD__f5
	 */
	
	public byte getF5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 68);
		} else {
			return __io__block.readByte(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'f5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> F5: used for auto handle to distinguish between normal handle and exception (extrema). </p>
	 * @see #__DNA__FIELD__f5
	 */
	
	public void setF5(byte f5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 68, f5);
		} else {
			__io__block.writeByte(__io__address + 68, f5);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 69, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 69, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 69;
		} else {
			__dna__offset = 69;
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
	public CPointer<BezTriple> __io__addressof() {
		return new CPointer<BezTriple>(__io__address, new Class[]{BezTriple.class}, __io__block, __io__blockTable);
	}

}
