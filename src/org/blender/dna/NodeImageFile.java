package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeImageFile'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1280, size64=1288)
public class NodeImageFile extends CFacade {

	/**
	 * This is the sdna index of the struct NodeImageFile.
	 * <p>
	 * It is required when allocating a new block to store data for NodeImageFile.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 385;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageFile nodeimagefile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagefile.__dna__addressof(NodeImageFile.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'im_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageFile nodeimagefile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagefile.__dna__addressof(NodeImageFile.__DNA__FIELD__im_format);
	 * CPointer&lt;ImageFormatData&gt; p_im_format = p.cast(new Class[]{ImageFormatData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'im_format'</li>
	 * <li>Signature: 'ImageFormatData'</li>
	 * <li>Actual Size (32bit/64bit): 248/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__im_format = new long[]{1024, 1024};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageFile nodeimagefile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagefile.__dna__addressof(NodeImageFile.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{1272, 1280};

	/**
	 * Field descriptor (offset) for struct member 'efra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageFile nodeimagefile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagefile.__dna__addressof(NodeImageFile.__DNA__FIELD__efra);
	 * CPointer&lt;Integer&gt; p_efra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'efra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__efra = new long[]{1276, 1284};

	public NodeImageFile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeImageFile(NodeImageFile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	 * Get method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public ImageFormatData getIm_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageFormatData(__io__address + 1024, __io__block, __io__blockTable);
		} else {
			return new ImageFormatData(__io__address + 1024, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'im_format'.
	 * @see #__DNA__FIELD__im_format
	 */
	
	public void setIm_format(ImageFormatData im_format) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1024;
		} else {
			__dna__offset = 1024;
		}
		if (__io__equals(im_format, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, im_format)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, im_format);
		} else {
			__io__generic__copy( getIm_format(), im_format);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1280);
		} else {
			return __io__block.readInt(__io__address + 1272);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1280, sfra);
		} else {
			__io__block.writeInt(__io__address + 1272, sfra);
		}
	}

	/**
	 * Get method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public int getEfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1284);
		} else {
			return __io__block.readInt(__io__address + 1276);
		}
	}

	/**
	 * Set method for struct member 'efra'.
	 * @see #__DNA__FIELD__efra
	 */
	
	public void setEfra(int efra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1284, efra);
		} else {
			__io__block.writeInt(__io__address + 1276, efra);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeImageFile> __io__addressof() {
		return new CPointer<NodeImageFile>(__io__address, new Class[]{NodeImageFile.class}, __io__block, __io__blockTable);
	}

}
