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
	public static final int __DNA__SDNA_INDEX = 414;

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
	 * <p> use overall node image format </p>
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
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__pad1);
	 * CPointer&lt;Integer&gt; p_pad1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
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
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended) </p>
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
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageMultiFileSocket nodeimagemultifilesocket = ...;
	 * CPointer&lt;Object&gt; p = nodeimagemultifilesocket.__dna__addressof(NodeImageMultiFileSocket.__DNA__FIELD__pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{1310, 1318};

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
	 * <p> use overall node image format </p>
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
	 * <p> use overall node image format </p>
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
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public int getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(int pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, pad1);
		} else {
			__io__block.writeInt(__io__address + 4, pad1);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
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
	 * <p> 1024 = FILE_MAX </p>
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
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended) </p>
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
	 * <p> multilayer output EXR_TOT_MAXNAME-2 ('.' and channel char are appended) </p>
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
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public CArrayFacade<Byte> getPad2() throws IOException
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
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(CArrayFacade<Byte> pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1318;
		} else {
			__dna__offset = 1310;
		}
		if (__io__equals(pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad2);
		} else {
			__io__generic__copy( getPad2(), pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeImageMultiFileSocket> __io__addressof() {
		return new CPointer<NodeImageMultiFileSocket>(__io__address, new Class[]{NodeImageMultiFileSocket.class}, __io__block, __io__blockTable);
	}

}
