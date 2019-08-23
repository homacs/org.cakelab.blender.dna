package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PreviewImage'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=48, size64=64)
public class PreviewImage extends CFacade {

	/**
	 * This is the sdna index of the struct PreviewImage.
	 * <p>
	 * It is required when allocating a new block to store data for PreviewImage.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 17;

	/**
	 * Field descriptor (offset) for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All values of 2 are really NUM_ICON_SIZES </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__w);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_w = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'w'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__w = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'h'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__h);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_h = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__flag);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_flag = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'changed_timestamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__changed_timestamp);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_changed_timestamp = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'changed_timestamp'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__changed_timestamp = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'rect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__rect);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Integer&gt;&gt;&gt; p_rect = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rect'</li>
	 * <li>Signature: 'int*[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rect = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__gputexture);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_gputexture = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gputexture'</li>
	 * <li>Signature: 'GPUTexture*[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gputexture = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by previews outside of {@link ID}  context. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__icon_id);
	 * CPointer&lt;Integer&gt; p_icon_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_id = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD__tag);
	 * CPointer&lt;Short&gt; p_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag = new long[]{44, 60};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PreviewImage previewimage = ...;
	 * CPointer&lt;Object&gt; p = previewimage.__dna__addressof(PreviewImage.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{46, 62};

	public PreviewImage(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PreviewImage(PreviewImage that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All values of 2 are really NUM_ICON_SIZES </p>
	 * @see #__DNA__FIELD__w
	 */
	
	public CArrayFacade<Integer> getW() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All values of 2 are really NUM_ICON_SIZES </p>
	 * @see #__DNA__FIELD__w
	 */
	
	public void setW(CArrayFacade<Integer> w) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(w, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, w)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, w);
		} else {
			__io__generic__copy( getW(), w);
		}
	}

	/**
	 * Get method for struct member 'h'.
	 * @see #__DNA__FIELD__h
	 */
	
	public CArrayFacade<Integer> getH() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'h'.
	 * @see #__DNA__FIELD__h
	 */
	
	public void setH(CArrayFacade<Integer> h) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(h, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, h)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, h);
		} else {
			__io__generic__copy( getH(), h);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public CArrayFacade<Short> getFlag() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(CArrayFacade<Short> flag) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(flag, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, flag)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, flag);
		} else {
			__io__generic__copy( getFlag(), flag);
		}
	}

	/**
	 * Get method for struct member 'changed_timestamp'.
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public CArrayFacade<Short> getChanged_timestamp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'changed_timestamp'.
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public void setChanged_timestamp(CArrayFacade<Short> changed_timestamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(changed_timestamp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, changed_timestamp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, changed_timestamp);
		} else {
			__io__generic__copy( getChanged_timestamp(), changed_timestamp);
		}
	}

	/**
	 * Get method for struct member 'rect'.
	 * @see #__DNA__FIELD__rect
	 */
	
	public CArrayFacade<CPointer<Integer>> getRect() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Integer>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Integer>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rect'.
	 * @see #__DNA__FIELD__rect
	 */
	
	public void setRect(CArrayFacade<CPointer<Integer>> rect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(rect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rect);
		} else {
			__io__generic__copy( getRect(), rect);
		}
	}

	/**
	 * Get method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only data. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public CArrayFacade<CPointer<Object>> getGputexture() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gputexture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime-only data. </p>
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public void setGputexture(CArrayFacade<CPointer<Object>> gputexture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(gputexture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gputexture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gputexture);
		} else {
			__io__generic__copy( getGputexture(), gputexture);
		}
	}

	/**
	 * Get method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by previews outside of {@link ID}  context. </p>
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public int getIcon_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'icon_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used by previews outside of {@link ID}  context. </p>
	 * @see #__DNA__FIELD__icon_id
	 */
	
	public void setIcon_id(int icon_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, icon_id);
		} else {
			__io__block.writeInt(__io__address + 40, icon_id);
		}
	}

	/**
	 * Get method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public short getTag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data. </p>
	 * @see #__DNA__FIELD__tag
	 */
	
	public void setTag(short tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, tag);
		} else {
			__io__block.writeShort(__io__address + 44, tag);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 62, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 46, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 62;
		} else {
			__dna__offset = 46;
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
	public CPointer<PreviewImage> __io__addressof() {
		return new CPointer<PreviewImage>(__io__address, new Class[]{PreviewImage.class}, __io__block, __io__blockTable);
	}

}
