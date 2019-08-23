package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskLayer'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=112, size64=144)
public class MaskLayer extends CFacade {

	/**
	 * This is the sdna index of the struct MaskLayer.
	 * <p>
	 * It is required when allocating a new block to store data for MaskLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 567;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MaskLayer&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MaskLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MaskLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MaskLayer&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MaskLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MaskLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of layer<h4>Blender Source Code:</h4>
	 * <p> name of the mask layer (64 = MAD_ID_NAME - 2) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'splines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of splines which defines this layer<h4>Blender Source Code:</h4>
	 * <p> list of splines which defines this mask layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__splines);
	 * CPointer&lt;ListBase&gt; p_splines = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'splines'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__splines = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'splines_shapes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__splines_shapes);
	 * CPointer&lt;ListBase&gt; p_splines_shapes = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'splines_shapes'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__splines_shapes = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'act_spline'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active spline </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__act_spline);
	 * CPointer&lt;CPointer&lt;MaskSpline&gt;&gt; p_act_spline = p.cast(new Class[]{CPointer.class, MaskSpline.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_spline'</li>
	 * <li>Signature: 'MaskSpline*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_spline = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'act_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__act_point);
	 * CPointer&lt;CPointer&lt;MaskSplinePoint&gt;&gt; p_act_point = p.cast(new Class[]{CPointer.class, MaskSplinePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_point'</li>
	 * <li>Signature: 'MaskSplinePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_point = new long[]{92, 120};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render Opacity<h4>Blender Source Code:</h4>
	 * <p> blending options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{96, 128};

	/**
	 * Field descriptor (offset) for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of blending mask layers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__blend);
	 * CPointer&lt;Byte&gt; p_blend = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend = new long[]{100, 132};

	/**
	 * Field descriptor (offset) for struct member 'blend_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__blend_flag);
	 * CPointer&lt;Byte&gt; p_blend_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_flag = new long[]{101, 133};

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Falloff type the feather
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__falloff);
	 * CPointer&lt;Byte&gt; p_falloff = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{102, 134};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{103, 135};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for animation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{110, 142};

	/**
	 * Field descriptor (offset) for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matching '{@link Object} ' flag of the same name - eventually use in the outliner </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskLayer masklayer = ...;
	 * CPointer&lt;Object&gt; p = masklayer.__dna__addressof(MaskLayer.__DNA__FIELD__restrictflag);
	 * CPointer&lt;Byte&gt; p_restrictflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'restrictflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__restrictflag = new long[]{111, 143};

	public MaskLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskLayer(MaskLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MaskLayer> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskLayer.class};
		return new CPointer<MaskLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MaskLayer> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<MaskLayer> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskLayer.class};
		return new CPointer<MaskLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MaskLayer> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of layer<h4>Blender Source Code:</h4>
	 * <p> name of the mask layer (64 = MAD_ID_NAME - 2) </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of layer<h4>Blender Source Code:</h4>
	 * <p> name of the mask layer (64 = MAD_ID_NAME - 2) </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'splines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of splines which defines this layer<h4>Blender Source Code:</h4>
	 * <p> list of splines which defines this mask layer </p>
	 * @see #__DNA__FIELD__splines
	 */
	
	public ListBase getSplines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'splines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of splines which defines this layer<h4>Blender Source Code:</h4>
	 * <p> list of splines which defines this mask layer </p>
	 * @see #__DNA__FIELD__splines
	 */
	
	public void setSplines(ListBase splines) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(splines, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, splines)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, splines);
		} else {
			__io__generic__copy( getSplines(), splines);
		}
	}

	/**
	 * Get method for struct member 'splines_shapes'.
	 * @see #__DNA__FIELD__splines_shapes
	 */
	
	public ListBase getSplines_shapes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'splines_shapes'.
	 * @see #__DNA__FIELD__splines_shapes
	 */
	
	public void setSplines_shapes(ListBase splines_shapes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(splines_shapes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, splines_shapes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, splines_shapes);
		} else {
			__io__generic__copy( getSplines_shapes(), splines_shapes);
		}
	}

	/**
	 * Get method for struct member 'act_spline'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active spline </p>
	 * @see #__DNA__FIELD__act_spline
	 */
	
	public CPointer<MaskSpline> getAct_spline() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSpline.class};
		return new CPointer<MaskSpline>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSpline.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_spline'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active spline </p>
	 * @see #__DNA__FIELD__act_spline
	 */
	
	public void setAct_spline(CPointer<MaskSpline> act_spline) throws IOException
	{
		long __address = ((act_spline == null) ? 0 : act_spline.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'act_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active point </p>
	 * @see #__DNA__FIELD__act_point
	 */
	
	public CPointer<MaskSplinePoint> getAct_point() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSplinePoint.class};
		return new CPointer<MaskSplinePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSplinePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active point </p>
	 * @see #__DNA__FIELD__act_point
	 */
	
	public void setAct_point(CPointer<MaskSplinePoint> act_point) throws IOException
	{
		long __address = ((act_point == null) ? 0 : act_point.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render Opacity<h4>Blender Source Code:</h4>
	 * <p> blending options </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render Opacity<h4>Blender Source Code:</h4>
	 * <p> blending options </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, alpha);
		} else {
			__io__block.writeFloat(__io__address + 96, alpha);
		}
	}

	/**
	 * Get method for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of blending mask layers
	 * @see #__DNA__FIELD__blend
	 */
	
	public byte getBlend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 132);
		} else {
			return __io__block.readByte(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'blend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of blending mask layers
	 * @see #__DNA__FIELD__blend
	 */
	
	public void setBlend(byte blend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 132, blend);
		} else {
			__io__block.writeByte(__io__address + 100, blend);
		}
	}

	/**
	 * Get method for struct member 'blend_flag'.
	 * @see #__DNA__FIELD__blend_flag
	 */
	
	public byte getBlend_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 133);
		} else {
			return __io__block.readByte(__io__address + 101);
		}
	}

	/**
	 * Set method for struct member 'blend_flag'.
	 * @see #__DNA__FIELD__blend_flag
	 */
	
	public void setBlend_flag(byte blend_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 133, blend_flag);
		} else {
			__io__block.writeByte(__io__address + 101, blend_flag);
		}
	}

	/**
	 * Get method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Falloff type the feather
	 * @see #__DNA__FIELD__falloff
	 */
	
	public byte getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 134);
		} else {
			return __io__block.readByte(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Falloff type the feather
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(byte falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 134, falloff);
		} else {
			__io__block.writeByte(__io__address + 102, falloff);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 135, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 103, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 135;
		} else {
			__dna__offset = 103;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for animation </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 142);
		} else {
			return __io__block.readByte(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for animation </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 142, flag);
		} else {
			__io__block.writeByte(__io__address + 110, flag);
		}
	}

	/**
	 * Get method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matching '{@link Object} ' flag of the same name - eventually use in the outliner </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public byte getRestrictflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 143);
		} else {
			return __io__block.readByte(__io__address + 111);
		}
	}

	/**
	 * Set method for struct member 'restrictflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matching '{@link Object} ' flag of the same name - eventually use in the outliner </p>
	 * @see #__DNA__FIELD__restrictflag
	 */
	
	public void setRestrictflag(byte restrictflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 143, restrictflag);
		} else {
			__io__block.writeByte(__io__address + 111, restrictflag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskLayer> __io__addressof() {
		return new CPointer<MaskLayer>(__io__address, new Class[]{MaskLayer.class}, __io__block, __io__blockTable);
	}

}
