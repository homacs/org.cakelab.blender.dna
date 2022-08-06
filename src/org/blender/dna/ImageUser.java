package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ImageUser'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p>{@link ImageUser}  is in Texture, in Nodes, Background {@link Image} , {@link Image}  Window, .... should be used in conjunction with an {@link ID}  * to {@link Image} . </p>
 */

@CMetaData(size32=44, size64=48)
public class ImageUser extends CFacade {

	/**
	 * This is the sdna index of the struct ImageUser.
	 * <p>
	 * It is required when allocating a new block to store data for ImageUser.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 32;

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To retrieve render result. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movies, sequences: current to display. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Total amount of frames to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__frames);
	 * CPointer&lt;Integer&gt; p_frames = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frames'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frames = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset within movie, start frame in global time. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__offset);
	 * CPointer&lt;Integer&gt; p_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cyclic flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD___pad0);
	 * CPointer&lt;Byte&gt; p__pad0 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'cycl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__cycl);
	 * CPointer&lt;Byte&gt; p_cycl = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cycl'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cycl = new long[]{21, 25};

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__ok);
	 * CPointer&lt;Byte&gt; p_ok = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{22, 26};

	/**
	 * Field descriptor (offset) for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multiview current eye - for internal use of drawing routines. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__multiview_eye);
	 * CPointer&lt;Byte&gt; p_multiview_eye = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multiview_eye'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multiview_eye = new long[]{23, 27};

	/**
	 * Field descriptor (offset) for struct member 'pass'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__pass);
	 * CPointer&lt;Short&gt; p_pass = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{26, 30};

	/**
	 * Field descriptor (offset) for struct member 'tile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Tile in tiled image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__tile);
	 * CPointer&lt;Integer&gt; p_tile = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD___pad2);
	 * CPointer&lt;Integer&gt; p__pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'multi_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Listbase indices, for menu browsing or retrieve buffer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__multi_index);
	 * CPointer&lt;Short&gt; p_multi_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multi_index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multi_index = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'view'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__view);
	 * CPointer&lt;Short&gt; p_view = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view = new long[]{38, 42};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__layer);
	 * CPointer&lt;Short&gt; p_layer = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageUser imageuser = ...;
	 * CPointer&lt;Object&gt; p = imageuser.__dna__addressof(ImageUser.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{42, 46};

	public ImageUser(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImageUser(ImageUser that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To retrieve render result. </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> To retrieve render result. </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movies, sequences: current to display. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movies, sequences: current to display. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, framenr);
		} else {
			__io__block.writeInt(__io__address + 4, framenr);
		}
	}

	/**
	 * Get method for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Total amount of frames to use. </p>
	 * @see #__DNA__FIELD__frames
	 */
	
	public int getFrames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Total amount of frames to use. </p>
	 * @see #__DNA__FIELD__frames
	 */
	
	public void setFrames(int frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, frames);
		} else {
			__io__block.writeInt(__io__address + 8, frames);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset within movie, start frame in global time. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Offset within movie, start frame in global time. </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, offset);
		} else {
			__io__block.writeInt(__io__address + 12, offset);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, sfra);
		} else {
			__io__block.writeInt(__io__address + 16, sfra);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cyclic flag. </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public byte get_pad0() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 24);
		} else {
			return __io__block.readByte(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cyclic flag. </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(byte _pad0) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 24, _pad0);
		} else {
			__io__block.writeByte(__io__address + 20, _pad0);
		}
	}

	/**
	 * Get method for struct member 'cycl'.
	 * @see #__DNA__FIELD__cycl
	 */
	
	public byte getCycl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 25);
		} else {
			return __io__block.readByte(__io__address + 21);
		}
	}

	/**
	 * Set method for struct member 'cycl'.
	 * @see #__DNA__FIELD__cycl
	 */
	
	public void setCycl(byte cycl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 25, cycl);
		} else {
			__io__block.writeByte(__io__address + 21, cycl);
		}
	}

	/**
	 * Get method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public byte getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 26);
		} else {
			return __io__block.readByte(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(byte ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 26, ok);
		} else {
			__io__block.writeByte(__io__address + 22, ok);
		}
	}

	/**
	 * Get method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multiview current eye - for internal use of drawing routines. </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public byte getMultiview_eye() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 27);
		} else {
			return __io__block.readByte(__io__address + 23);
		}
	}

	/**
	 * Set method for struct member 'multiview_eye'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multiview current eye - for internal use of drawing routines. </p>
	 * @see #__DNA__FIELD__multiview_eye
	 */
	
	public void setMultiview_eye(byte multiview_eye) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 27, multiview_eye);
		} else {
			__io__block.writeByte(__io__address + 23, multiview_eye);
		}
	}

	/**
	 * Get method for struct member 'pass'.
	 * @see #__DNA__FIELD__pass
	 */
	
	public short getPass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'pass'.
	 * @see #__DNA__FIELD__pass
	 */
	
	public void setPass(short pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, pass);
		} else {
			__io__block.writeShort(__io__address + 24, pass);
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
			return new CArrayFacade<Byte>(__io__address + 30, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 30;
		} else {
			__dna__offset = 26;
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
	 * Get method for struct member 'tile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Tile in tiled image
	 * @see #__DNA__FIELD__tile
	 */
	
	public int getTile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'tile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Tile in tiled image
	 * @see #__DNA__FIELD__tile
	 */
	
	public void setTile(int tile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, tile);
		} else {
			__io__block.writeInt(__io__address + 28, tile);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public int get_pad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(int _pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, _pad2);
		} else {
			__io__block.writeInt(__io__address + 32, _pad2);
		}
	}

	/**
	 * Get method for struct member 'multi_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Listbase indices, for menu browsing or retrieve buffer. </p>
	 * @see #__DNA__FIELD__multi_index
	 */
	
	public short getMulti_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'multi_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Listbase indices, for menu browsing or retrieve buffer. </p>
	 * @see #__DNA__FIELD__multi_index
	 */
	
	public void setMulti_index(short multi_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, multi_index);
		} else {
			__io__block.writeShort(__io__address + 36, multi_index);
		}
	}

	/**
	 * Get method for struct member 'view'.
	 * @see #__DNA__FIELD__view
	 */
	
	public short getView() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 38);
		}
	}

	/**
	 * Set method for struct member 'view'.
	 * @see #__DNA__FIELD__view
	 */
	
	public void setView(short view) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, view);
		} else {
			__io__block.writeShort(__io__address + 38, view);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public short getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(short layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, layer);
		} else {
			__io__block.writeShort(__io__address + 40, layer);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, flag);
		} else {
			__io__block.writeShort(__io__address + 42, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImageUser> __io__addressof() {
		return new CPointer<ImageUser>(__io__address, new Class[]{ImageUser.class}, __io__block, __io__blockTable);
	}

}
