package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CameraBGImage'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Background Picture </p>
 */

@CMetaData(size32=84, size64=104)
public class CameraBGImage extends CFacade {

	/**
	 * This is the sdna index of the struct CameraBGImage.
	 * <p>
	 * It is required when allocating a new block to store data for CameraBGImage.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 30;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;CameraBGImage&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, CameraBGImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'CameraBGImage*'</li>
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
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;CameraBGImage&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, CameraBGImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'CameraBGImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'ima'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__ima);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_ima = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ima'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ima = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__iuser);
	 * CPointer&lt;ImageUser&gt; p_iuser = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'clip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__clip);
	 * CPointer&lt;CPointer&lt;MovieClip&gt;&gt; p_clip = p.cast(new Class[]{CPointer.class, MovieClip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip'</li>
	 * <li>Signature: 'MovieClip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'cuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__cuser);
	 * CPointer&lt;MovieClipUser&gt; p_cuser = p.cast(new Class[]{MovieClipUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cuser'</li>
	 * <li>Signature: 'MovieClipUser'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cuser = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{60, 80};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{68, 88};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{72, 92};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{76, 96};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{80, 100};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraBGImage camerabgimage = ...;
	 * CPointer&lt;Object&gt; p = camerabgimage.__dna__addressof(CameraBGImage.__DNA__FIELD__source);
	 * CPointer&lt;Short&gt; p_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{82, 102};

	public CameraBGImage(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CameraBGImage(CameraBGImage that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<CameraBGImage> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CameraBGImage.class};
		return new CPointer<CameraBGImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CameraBGImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<CameraBGImage> next) throws IOException
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
	
	public CPointer<CameraBGImage> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CameraBGImage.class};
		return new CPointer<CameraBGImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CameraBGImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<CameraBGImage> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'ima'.
	 * @see #__DNA__FIELD__ima
	 */
	
	public CPointer<Image> getIma() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ima'.
	 * @see #__DNA__FIELD__ima
	 */
	
	public void setIma(CPointer<Image> ima) throws IOException
	{
		long __address = ((ima == null) ? 0 : ima.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 12, __io__block, __io__blockTable);
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
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
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
	 * Get method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public CPointer<MovieClip> getClip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieClip.class};
		return new CPointer<MovieClip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieClip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CPointer<MovieClip> clip) throws IOException
	{
		long __address = ((clip == null) ? 0 : clip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'cuser'.
	 * @see #__DNA__FIELD__cuser
	 */
	
	public MovieClipUser getCuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieClipUser(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new MovieClipUser(__io__address + 52, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cuser'.
	 * @see #__DNA__FIELD__cuser
	 */
	
	public void setCuser(MovieClipUser cuser) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(cuser, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cuser)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cuser);
		} else {
			__io__generic__copy( getCuser(), cuser);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, scale);
		} else {
			__io__block.writeFloat(__io__address + 68, scale);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, rotation);
		} else {
			__io__block.writeFloat(__io__address + 72, rotation);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, alpha);
		} else {
			__io__block.writeFloat(__io__address + 76, alpha);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 100);
		} else {
			return __io__block.readShort(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 100, flag);
		} else {
			__io__block.writeShort(__io__address + 80, flag);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public short getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 102);
		} else {
			return __io__block.readShort(__io__address + 82);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(short source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 102, source);
		} else {
			__io__block.writeShort(__io__address + 82, source);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CameraBGImage> __io__addressof() {
		return new CPointer<CameraBGImage>(__io__address, new Class[]{CameraBGImage.class}, __io__block, __io__blockTable);
	}

}
