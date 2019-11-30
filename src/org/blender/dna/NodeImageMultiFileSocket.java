package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeImageMultiFileSocket'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1312, size64=1320)
public class NodeImageMultiFileSocket extends CFacade {

	/**
	 * This is the sdna index of the struct NodeImageMultiFileSocket.
	 * <p>
	 * It is required when allocating a new block to store data for NodeImageMultiFileSocket.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 387;

	/**
	 * Field descriptor (offset) for struct member 'use_render_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> single layer file output 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__use_render_format);
	 * CPointer&lt;Short&gt; p_use_render_format = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_render_format'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_render_format = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'use_node_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use overall node image format. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__use_node_format);
	 * CPointer&lt;Short&gt; p_use_node_format = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_node_format'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_node_format = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__format);
	 * CPointer&lt;ImageFormatData&gt; p_format = p.cast(new Class[]{ImageFormatData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'format'</li>
	 * <li>Signature: 'ImageFormatData'</li>
	 * <li>Actual Size (32bit/64bit): 248/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__format = new long[]{1032, 1032};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__layer);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layer = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'char[30]'</li>
	 * <li>Actual Size (32bit/64bit): 30/30</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{1280, 1288};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1310, 1318};

	public NodeImageMultiFileSocket(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeImageMultiFileSocket(NodeImageMultiFileSocket that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'use_render_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> single layer file output 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__use_render_format
	 */
	
	public short getUse_render_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'use_render_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> single layer file output 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__use_render_format
	 */
	
	public void setUse_render_format(short use_render_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, use_render_format);
		} else {
			__io__block.writeShort(__io__address + 0, use_render_format);
		}
	}

	/**
	 * Get method for struct member 'use_node_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use overall node image format. </p>
	 * @see #__DNA__FIELD__use_node_format
	 */
	
	public short getUse_node_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'use_node_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use overall node image format. </p>
	 * @see #__DNA__FIELD__use_node_format
	 */
	
	public void setUse_node_format(short use_node_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, use_node_format);
		} else {
			__io__block.writeShort(__io__address + 2, use_node_format);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
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
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public CArrayFacade<Byte> getPath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CArrayFacade<Byte> path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path);
		} else {
			__io__generic__copy( getPath(), path);
		}
	}

	/**
	 * Get method for struct member 'format'.
	 * @see #__DNA__FIELD__format
	 */
	
	public ImageFormatData getFormat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageFormatData(__io__address + 1032, __io__block, __io__blockTable);
		} else {
			return new ImageFormatData(__io__address + 1032, __io__block, __io__blockTable);
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
			__dna__offset = 1032;
		} else {
			__dna__offset = 1032;
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
	 * Get method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended). </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public CArrayFacade<Byte> getLayer() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			30
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended). </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(CArrayFacade<Byte> layer) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1288;
		} else {
			__dna__offset = 1280;
		}
		if (__io__equals(layer, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer);
		} else {
			__io__generic__copy( getLayer(), layer);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1318, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1310, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1318;
		} else {
			__dna__offset = 1310;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeImageMultiFileSocket> __io__addressof() {
		return new CPointer<NodeImageMultiFileSocket>(__io__address, new Class[]{NodeImageMultiFileSocket.class}, __io__block, __io__blockTable);
	}

}
