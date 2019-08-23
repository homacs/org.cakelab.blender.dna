package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MeshStatVis'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Stats Stats for Meshes </p>
 */

@CMetaData(size32=40, size64=40)
public class MeshStatVis extends CFacade {

	/**
	 * This is the sdna index of the struct MeshStatVis.
	 * <p>
	 * It is required when allocating a new block to store data for MeshStatVis.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 194;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of data to visualize/check
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'overhang_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overhang </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__overhang_axis);
	 * CPointer&lt;Byte&gt; p_overhang_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overhang_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overhang_axis = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'overhang_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__overhang_min);
	 * CPointer&lt;Float&gt; p_overhang_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overhang_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overhang_min = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'overhang_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__overhang_max);
	 * CPointer&lt;Float&gt; p_overhang_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overhang_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overhang_max = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'thickness_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum for measuring thickness<h4>Blender Source Code:</h4>
	 * <p> thickness </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__thickness_min);
	 * CPointer&lt;Float&gt; p_thickness_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_min = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'thickness_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum for measuring thickness
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__thickness_max);
	 * CPointer&lt;Float&gt; p_thickness_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_max = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'thickness_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to test per face
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__thickness_samples);
	 * CPointer&lt;Byte&gt; p_thickness_samples = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness_samples'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness_samples = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{21, 21};

	/**
	 * Field descriptor (offset) for struct member 'distort_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> distort </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__distort_min);
	 * CPointer&lt;Float&gt; p_distort_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distort_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distort_min = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'distort_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__distort_max);
	 * CPointer&lt;Float&gt; p_distort_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distort_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distort_max = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'sharp_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> sharp </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__sharp_min);
	 * CPointer&lt;Float&gt; p_sharp_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sharp_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sharp_min = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'sharp_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshStatVis meshstatvis = ...;
	 * CPointer&lt;Object&gt; p = meshstatvis.__dna__addressof(MeshStatVis.__DNA__FIELD__sharp_max);
	 * CPointer&lt;Float&gt; p_sharp_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sharp_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sharp_max = new long[]{36, 36};

	public MeshStatVis(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MeshStatVis(MeshStatVis that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of data to visualize/check
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of data to visualize/check
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, type);
		} else {
			__io__block.writeByte(__io__address + 0, type);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1;
		} else {
			__dna__offset = 1;
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
	 * Get method for struct member 'overhang_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overhang </p>
	 * @see #__DNA__FIELD__overhang_axis
	 */
	
	public byte getOverhang_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'overhang_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> overhang </p>
	 * @see #__DNA__FIELD__overhang_axis
	 */
	
	public void setOverhang_axis(byte overhang_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, overhang_axis);
		} else {
			__io__block.writeByte(__io__address + 3, overhang_axis);
		}
	}

	/**
	 * Get method for struct member 'overhang_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display
	 * @see #__DNA__FIELD__overhang_min
	 */
	
	public float getOverhang_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'overhang_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display
	 * @see #__DNA__FIELD__overhang_min
	 */
	
	public void setOverhang_min(float overhang_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, overhang_min);
		} else {
			__io__block.writeFloat(__io__address + 4, overhang_min);
		}
	}

	/**
	 * Get method for struct member 'overhang_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__overhang_max
	 */
	
	public float getOverhang_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'overhang_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__overhang_max
	 */
	
	public void setOverhang_max(float overhang_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, overhang_max);
		} else {
			__io__block.writeFloat(__io__address + 8, overhang_max);
		}
	}

	/**
	 * Get method for struct member 'thickness_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum for measuring thickness<h4>Blender Source Code:</h4>
	 * <p> thickness </p>
	 * @see #__DNA__FIELD__thickness_min
	 */
	
	public float getThickness_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'thickness_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum for measuring thickness<h4>Blender Source Code:</h4>
	 * <p> thickness </p>
	 * @see #__DNA__FIELD__thickness_min
	 */
	
	public void setThickness_min(float thickness_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, thickness_min);
		} else {
			__io__block.writeFloat(__io__address + 12, thickness_min);
		}
	}

	/**
	 * Get method for struct member 'thickness_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum for measuring thickness
	 * @see #__DNA__FIELD__thickness_max
	 */
	
	public float getThickness_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'thickness_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum for measuring thickness
	 * @see #__DNA__FIELD__thickness_max
	 */
	
	public void setThickness_max(float thickness_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, thickness_max);
		} else {
			__io__block.writeFloat(__io__address + 16, thickness_max);
		}
	}

	/**
	 * Get method for struct member 'thickness_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to test per face
	 * @see #__DNA__FIELD__thickness_samples
	 */
	
	public byte getThickness_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 20);
		} else {
			return __io__block.readByte(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'thickness_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to test per face
	 * @see #__DNA__FIELD__thickness_samples
	 */
	
	public void setThickness_samples(byte thickness_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 20, thickness_samples);
		} else {
			__io__block.writeByte(__io__address + 20, thickness_samples);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 21, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 21, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 21;
		} else {
			__dna__offset = 21;
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
	 * Get method for struct member 'distort_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> distort </p>
	 * @see #__DNA__FIELD__distort_min
	 */
	
	public float getDistort_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'distort_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> distort </p>
	 * @see #__DNA__FIELD__distort_min
	 */
	
	public void setDistort_min(float distort_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, distort_min);
		} else {
			__io__block.writeFloat(__io__address + 24, distort_min);
		}
	}

	/**
	 * Get method for struct member 'distort_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__distort_max
	 */
	
	public float getDistort_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'distort_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__distort_max
	 */
	
	public void setDistort_max(float distort_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, distort_max);
		} else {
			__io__block.writeFloat(__io__address + 28, distort_max);
		}
	}

	/**
	 * Get method for struct member 'sharp_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> sharp </p>
	 * @see #__DNA__FIELD__sharp_min
	 */
	
	public float getSharp_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'sharp_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum angle to display<h4>Blender Source Code:</h4>
	 * <p> sharp </p>
	 * @see #__DNA__FIELD__sharp_min
	 */
	
	public void setSharp_min(float sharp_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, sharp_min);
		} else {
			__io__block.writeFloat(__io__address + 32, sharp_min);
		}
	}

	/**
	 * Get method for struct member 'sharp_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__sharp_max
	 */
	
	public float getSharp_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'sharp_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum angle to display
	 * @see #__DNA__FIELD__sharp_max
	 */
	
	public void setSharp_max(float sharp_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, sharp_max);
		} else {
			__io__block.writeFloat(__io__address + 36, sharp_max);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshStatVis> __io__addressof() {
		return new CPointer<MeshStatVis>(__io__address, new Class[]{MeshStatVis.class}, __io__block, __io__blockTable);
	}

}
