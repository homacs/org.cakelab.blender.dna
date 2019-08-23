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
 * 
 */

@CMetaData(size32=56, size64=56)
public class BezTriple extends CFacade {

	/**
	 * This is the sdna index of the struct BezTriple.
	 * <p>
	 * It is required when allocating a new block to store data for BezTriple.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 41;

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
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BezTriple beztriple = ...;
	 * CPointer&lt;Object&gt; p = beztriple.__dna__addressof(BezTriple.__DNA__FIELD__ipo);
	 * CPointer&lt;Short&gt; p_ipo = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'h1'.
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
	public static final long[] __DNA__FIELD__h1 = new long[]{50, 50};

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
	public static final long[] __DNA__FIELD__h2 = new long[]{51, 51};

	/**
	 * Field descriptor (offset) for struct member 'f1'.
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
	public static final long[] __DNA__FIELD__f1 = new long[]{52, 52};

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
	public static final long[] __DNA__FIELD__f2 = new long[]{53, 53};

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
	public static final long[] __DNA__FIELD__f3 = new long[]{54, 54};

	/**
	 * Field descriptor (offset) for struct member 'hide'.
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
	public static final long[] __DNA__FIELD__hide = new long[]{55, 55};

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
	 * @see #__DNA__FIELD__ipo
	 */
	
	public short getIpo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 48);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(short ipo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 48, ipo);
		} else {
			__io__block.writeShort(__io__address + 48, ipo);
		}
	}

	/**
	 * Get method for struct member 'h1'.
	 * @see #__DNA__FIELD__h1
	 */
	
	public byte getH1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 50);
		} else {
			return __io__block.readByte(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'h1'.
	 * @see #__DNA__FIELD__h1
	 */
	
	public void setH1(byte h1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 50, h1);
		} else {
			__io__block.writeByte(__io__address + 50, h1);
		}
	}

	/**
	 * Get method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public byte getH2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 51);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public void setH2(byte h2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 51, h2);
		} else {
			__io__block.writeByte(__io__address + 51, h2);
		}
	}

	/**
	 * Get method for struct member 'f1'.
	 * @see #__DNA__FIELD__f1
	 */
	
	public byte getF1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 52);
		} else {
			return __io__block.readByte(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'f1'.
	 * @see #__DNA__FIELD__f1
	 */
	
	public void setF1(byte f1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 52, f1);
		} else {
			__io__block.writeByte(__io__address + 52, f1);
		}
	}

	/**
	 * Get method for struct member 'f2'.
	 * @see #__DNA__FIELD__f2
	 */
	
	public byte getF2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 53);
		} else {
			return __io__block.readByte(__io__address + 53);
		}
	}

	/**
	 * Set method for struct member 'f2'.
	 * @see #__DNA__FIELD__f2
	 */
	
	public void setF2(byte f2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 53, f2);
		} else {
			__io__block.writeByte(__io__address + 53, f2);
		}
	}

	/**
	 * Get method for struct member 'f3'.
	 * @see #__DNA__FIELD__f3
	 */
	
	public byte getF3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 54);
		} else {
			return __io__block.readByte(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'f3'.
	 * @see #__DNA__FIELD__f3
	 */
	
	public void setF3(byte f3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 54, f3);
		} else {
			__io__block.writeByte(__io__address + 54, f3);
		}
	}

	/**
	 * Get method for struct member 'hide'.
	 * @see #__DNA__FIELD__hide
	 */
	
	public byte getHide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 55);
		} else {
			return __io__block.readByte(__io__address + 55);
		}
	}

	/**
	 * Set method for struct member 'hide'.
	 * @see #__DNA__FIELD__hide
	 */
	
	public void setHide(byte hide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 55, hide);
		} else {
			__io__block.writeByte(__io__address + 55, hide);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BezTriple> __io__addressof() {
		return new CPointer<BezTriple>(__io__address, new Class[]{BezTriple.class}, __io__block, __io__blockTable);
	}

}
