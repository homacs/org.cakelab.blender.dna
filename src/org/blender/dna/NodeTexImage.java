package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexImage'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1016, size64=1024)
public class NodeTexImage extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexImage.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexImage.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 403;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__base);
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
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__iuser);
	 * CPointer&lt;ImageUser&gt; p_iuser = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{956, 960};

	/**
	 * Field descriptor (offset) for struct member 'color_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__color_space);
	 * CPointer&lt;Integer&gt; p_color_space = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_space'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_space = new long[]{992, 1000};

	/**
	 * Field descriptor (offset) for struct member 'projection'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__projection);
	 * CPointer&lt;Integer&gt; p_projection = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projection'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projection = new long[]{996, 1004};

	/**
	 * Field descriptor (offset) for struct member 'projection_blend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__projection_blend);
	 * CPointer&lt;Float&gt; p_projection_blend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projection_blend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projection_blend = new long[]{1000, 1008};

	/**
	 * Field descriptor (offset) for struct member 'interpolation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__interpolation);
	 * CPointer&lt;Integer&gt; p_interpolation = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation = new long[]{1004, 1012};

	/**
	 * Field descriptor (offset) for struct member 'extension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD__extension);
	 * CPointer&lt;Integer&gt; p_extension = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extension'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extension = new long[]{1008, 1016};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexImage nodeteximage = ...;
	 * CPointer&lt;Object&gt; p = nodeteximage.__dna__addressof(NodeTexImage.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1012, 1020};

	public NodeTexImage(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexImage(NodeTexImage that) {
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
	 * Get method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 960, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 956, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(ImageUser iuser) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 960;
		} else {
			__dna__offset = 956;
		}
		if (__io__equals(iuser, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iuser)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iuser);
		} else {
			__io__generic__copy( getIuser(), iuser);
		}
	}

	/**
	 * Get method for struct member 'color_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__color_space
	 */
	
	public int getColor_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1000);
		} else {
			return __io__block.readInt(__io__address + 992);
		}
	}

	/**
	 * Set method for struct member 'color_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__color_space
	 */
	
	public void setColor_space(int color_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1000, color_space);
		} else {
			__io__block.writeInt(__io__address + 992, color_space);
		}
	}

	/**
	 * Get method for struct member 'projection'.
	 * @see #__DNA__FIELD__projection
	 */
	
	public int getProjection() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1004);
		} else {
			return __io__block.readInt(__io__address + 996);
		}
	}

	/**
	 * Set method for struct member 'projection'.
	 * @see #__DNA__FIELD__projection
	 */
	
	public void setProjection(int projection) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1004, projection);
		} else {
			__io__block.writeInt(__io__address + 996, projection);
		}
	}

	/**
	 * Get method for struct member 'projection_blend'.
	 * @see #__DNA__FIELD__projection_blend
	 */
	
	public float getProjection_blend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1008);
		} else {
			return __io__block.readFloat(__io__address + 1000);
		}
	}

	/**
	 * Set method for struct member 'projection_blend'.
	 * @see #__DNA__FIELD__projection_blend
	 */
	
	public void setProjection_blend(float projection_blend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1008, projection_blend);
		} else {
			__io__block.writeFloat(__io__address + 1000, projection_blend);
		}
	}

	/**
	 * Get method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public int getInterpolation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1012);
		} else {
			return __io__block.readInt(__io__address + 1004);
		}
	}

	/**
	 * Set method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public void setInterpolation(int interpolation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1012, interpolation);
		} else {
			__io__block.writeInt(__io__address + 1004, interpolation);
		}
	}

	/**
	 * Get method for struct member 'extension'.
	 * @see #__DNA__FIELD__extension
	 */
	
	public int getExtension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1016);
		} else {
			return __io__block.readInt(__io__address + 1008);
		}
	}

	/**
	 * Set method for struct member 'extension'.
	 * @see #__DNA__FIELD__extension
	 */
	
	public void setExtension(int extension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1016, extension);
		} else {
			__io__block.writeInt(__io__address + 1008, extension);
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
			return new CArrayFacade<Byte>(__io__address + 1020, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1012, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1020;
		} else {
			__dna__offset = 1012;
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
	public CPointer<NodeTexImage> __io__addressof() {
		return new CPointer<NodeTexImage>(__io__address, new Class[]{NodeTexImage.class}, __io__block, __io__blockTable);
	}

}
