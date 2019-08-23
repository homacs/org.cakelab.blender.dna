package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeImageMultiFile'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> XXX first struct fields should match {@link NodeImageFile}  to ensure forward compatibility </p>
 */

@CMetaData(size32=1288, size64=1296)
public class NodeImageMultiFile extends CFacade {

	/**
	 * This is the sdna index of the struct NodeImageMultiFile.
	 * <p>
	 * It is required when allocating a new block to store data for NodeImageMultiFile.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 386;

	/**
	 * Field descriptor (offset) for struct member 'base_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD__base_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_base_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_path = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD__format);
	 * CPointer&lt;ImageFormatData&gt; p_format = p.cast(new Class[]{ImageFormatData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'format'</li>
	 * <li>Signature: 'ImageFormatData'</li>
	 * <li>Actual Size (32bit/64bit): 248/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__format = new long[]{1024, 1024};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX old frame rand values from {@link NodeImageFile}  for forward compatibility. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD__sfra);
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
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD__efra);
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

	/**
	 * Field descriptor (offset) for struct member 'active_input'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selected input in details view list. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD__active_input);
	 * CPointer&lt;Integer&gt; p_active_input = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_input'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_input = new long[]{1280, 1288};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFile nodeimagemultifile = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifile.__dna__addressof(NodeImageMultiFile.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1284, 1292};

	public NodeImageMultiFile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeImageMultiFile(NodeImageMultiFile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__base_path
	 */
	
	public CArrayFacade<Byte> getBase_path() throws IOException
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
	 * Set method for struct member 'base_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__base_path
	 */
	
	public void setBase_path(CArrayFacade<Byte> base_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base_path);
		} else {
			__io__generic__copy( getBase_path(), base_path);
		}
	}

	/**
	 * Get method for struct member 'format'.
	 * @see #__DNA__FIELD__format
	 */
	
	public ImageFormatData getFormat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageFormatData(__io__address + 1024, __io__block, __io__blockTable);
		} else {
			return new ImageFormatData(__io__address + 1024, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'format'.
	 * @see #__DNA__FIELD__format
	 */
	
	public void setFormat(ImageFormatData format) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1024;
		} else {
			__dna__offset = 1024;
		}
		if (__io__equals(format, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, format)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, format);
		} else {
			__io__generic__copy( getFormat(), format);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX old frame rand values from {@link NodeImageFile}  for forward compatibility. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX old frame rand values from {@link NodeImageFile}  for forward compatibility. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
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
	 * Get method for struct member 'active_input'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selected input in details view list. </p>
	 * @see #__DNA__FIELD__active_input
	 */
	
	public int getActive_input() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1288);
		} else {
			return __io__block.readInt(__io__address + 1280);
		}
	}

	/**
	 * Set method for struct member 'active_input'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selected input in details view list. </p>
	 * @see #__DNA__FIELD__active_input
	 */
	
	public void setActive_input(int active_input) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1288, active_input);
		} else {
			__io__block.writeInt(__io__address + 1280, active_input);
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
			return new CArrayFacade<Byte>(__io__address + 1292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1292;
		} else {
			__dna__offset = 1284;
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
	public CPointer<NodeImageMultiFile> __io__addressof() {
		return new CPointer<NodeImageMultiFile>(__io__address, new Class[]{NodeImageMultiFile.class}, __io__block, __io__blockTable);
	}

}
