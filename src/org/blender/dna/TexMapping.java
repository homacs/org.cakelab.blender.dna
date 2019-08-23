package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TexMapping'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> used for mapping and texture nodes. note: rot is now in radians </p>
 */

@CMetaData(size32=140, size64=144)
public class TexMapping extends CFacade {

	/**
	 * This is the sdna index of the struct TexMapping.
	 * <p>
	 * It is required when allocating a new block to store data for TexMapping.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 45;

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'projx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__projx);
	 * CPointer&lt;Byte&gt; p_projx = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projx'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projx = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'projy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__projy);
	 * CPointer&lt;Byte&gt; p_projy = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projy'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projy = new long[]{41, 41};

	/**
	 * Field descriptor (offset) for struct member 'projz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__projz);
	 * CPointer&lt;Byte&gt; p_projz = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projz'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projz = new long[]{42, 42};

	/**
	 * Field descriptor (offset) for struct member 'mapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__mapping);
	 * CPointer&lt;Byte&gt; p_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapping = new long[]{43, 43};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum value for clipping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum value for clipping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexMapping texmapping = ...;
	 * CPointer&lt;Object&gt; p = texmapping.__dna__addressof(TexMapping.__DNA__FIELD__ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob = new long[]{136, 136};

	public TexMapping(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TexMapping(TexMapping that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot);
		} else {
			__io__generic__copy( getRot(), rot);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flag);
		} else {
			__io__block.writeInt(__io__address + 36, flag);
		}
	}

	/**
	 * Get method for struct member 'projx'.
	 * @see #__DNA__FIELD__projx
	 */
	
	public byte getProjx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 40);
		} else {
			return __io__block.readByte(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'projx'.
	 * @see #__DNA__FIELD__projx
	 */
	
	public void setProjx(byte projx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 40, projx);
		} else {
			__io__block.writeByte(__io__address + 40, projx);
		}
	}

	/**
	 * Get method for struct member 'projy'.
	 * @see #__DNA__FIELD__projy
	 */
	
	public byte getProjy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 41);
		} else {
			return __io__block.readByte(__io__address + 41);
		}
	}

	/**
	 * Set method for struct member 'projy'.
	 * @see #__DNA__FIELD__projy
	 */
	
	public void setProjy(byte projy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 41, projy);
		} else {
			__io__block.writeByte(__io__address + 41, projy);
		}
	}

	/**
	 * Get method for struct member 'projz'.
	 * @see #__DNA__FIELD__projz
	 */
	
	public byte getProjz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 42);
		} else {
			return __io__block.readByte(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'projz'.
	 * @see #__DNA__FIELD__projz
	 */
	
	public void setProjz(byte projz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 42, projz);
		} else {
			__io__block.writeByte(__io__address + 42, projz);
		}
	}

	/**
	 * Get method for struct member 'mapping'.
	 * @see #__DNA__FIELD__mapping
	 */
	
	public byte getMapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 43);
		} else {
			return __io__block.readByte(__io__address + 43);
		}
	}

	/**
	 * Set method for struct member 'mapping'.
	 * @see #__DNA__FIELD__mapping
	 */
	
	public void setMapping(byte mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 43, mapping);
		} else {
			__io__block.writeByte(__io__address + 43, mapping);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, type);
		} else {
			__io__block.writeInt(__io__address + 44, type);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CArrayFacade<CArrayFacade<Float>> mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mat);
		} else {
			__io__generic__copy( getMat(), mat);
		}
	}

	/**
	 * Get method for struct member 'min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum value for clipping
	 * @see #__DNA__FIELD__min
	 */
	
	public CArrayFacade<Float> getMin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum value for clipping
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(CArrayFacade<Float> min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, min);
		} else {
			__io__generic__copy( getMin(), min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum value for clipping
	 * @see #__DNA__FIELD__max
	 */
	
	public CArrayFacade<Float> getMax() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum value for clipping
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(CArrayFacade<Float> max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, max);
		} else {
			__io__generic__copy( getMax(), max);
		}
	}

	/**
	 * Get method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public CPointer<BlenderObject> getOb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public void setOb(CPointer<BlenderObject> ob) throws IOException
	{
		long __address = ((ob == null) ? 0 : ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TexMapping> __io__addressof() {
		return new CPointer<TexMapping>(__io__address, new Class[]{TexMapping.class}, __io__block, __io__blockTable);
	}

}
