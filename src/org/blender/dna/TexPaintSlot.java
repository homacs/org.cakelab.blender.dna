package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TexPaintSlot'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> WATCH IT: change type? also make changes in ipo.h </p>
 */

@CMetaData(size32=24, size64=40)
public class TexPaintSlot extends CFacade {

	/**
	 * This is the sdna index of the struct TexPaintSlot.
	 * <p>
	 * It is required when allocating a new block to store data for TexPaintSlot.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 288;

	/**
	 * Field descriptor (offset) for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to be painted on. Mutual exclusive with attribute_name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__ima);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_ima = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ima'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ima = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'image_user'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__image_user);
	 * CPointer&lt;CPointer&lt;ImageUser&gt;&gt; p_image_user = p.cast(new Class[]{CPointer.class, ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_user'</li>
	 * <li>Signature: 'ImageUser*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_user = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom-data index for uv layer, MAX_NAME . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__uvname);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_uvname = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvname'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvname = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color attribute name when painting using color attributes. Mutual exclusive with ima. Points to the name of a {@link CustomDataLayer} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__attribute_name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_attribute_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attribute_name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attribute_name = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Do we have a valid image and UV map or attribute. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__valid);
	 * CPointer&lt;Integer&gt; p_valid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'valid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__valid = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of node interpolation setting. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TexPaintSlot texpaintslot = ...;
	 * CPointer&lt;Object&gt; p = texpaintslot.__dna__addressof(TexPaintSlot.__DNA__FIELD__interp);
	 * CPointer&lt;Integer&gt; p_interp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp = new long[]{20, 36};

	public TexPaintSlot(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TexPaintSlot(TexPaintSlot that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to be painted on. Mutual exclusive with attribute_name. </p>
	 * @see #__DNA__FIELD__ima
	 */
	
	public CPointer<Image> getIma() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to be painted on. Mutual exclusive with attribute_name. </p>
	 * @see #__DNA__FIELD__ima
	 */
	
	public void setIma(CPointer<Image> ima) throws IOException
	{
		long __address = ((ima == null) ? 0 : ima.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'image_user'.
	 * @see #__DNA__FIELD__image_user
	 */
	
	public CPointer<ImageUser> getImage_user() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ImageUser.class};
		return new CPointer<ImageUser>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ImageUser.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'image_user'.
	 * @see #__DNA__FIELD__image_user
	 */
	
	public void setImage_user(CPointer<ImageUser> image_user) throws IOException
	{
		long __address = ((image_user == null) ? 0 : image_user.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom-data index for uv layer, MAX_NAME . </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public CPointer<Byte> getUvname() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom-data index for uv layer, MAX_NAME . </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public void setUvname(CPointer<Byte> uvname) throws IOException
	{
		long __address = ((uvname == null) ? 0 : uvname.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color attribute name when painting using color attributes. Mutual exclusive with ima. Points to the name of a {@link CustomDataLayer} . </p>
	 * @see #__DNA__FIELD__attribute_name
	 */
	
	public CPointer<Byte> getAttribute_name() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color attribute name when painting using color attributes. Mutual exclusive with ima. Points to the name of a {@link CustomDataLayer} . </p>
	 * @see #__DNA__FIELD__attribute_name
	 */
	
	public void setAttribute_name(CPointer<Byte> attribute_name) throws IOException
	{
		long __address = ((attribute_name == null) ? 0 : attribute_name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Do we have a valid image and UV map or attribute. </p>
	 * @see #__DNA__FIELD__valid
	 */
	
	public int getValid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Do we have a valid image and UV map or attribute. </p>
	 * @see #__DNA__FIELD__valid
	 */
	
	public void setValid(int valid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, valid);
		} else {
			__io__block.writeInt(__io__address + 16, valid);
		}
	}

	/**
	 * Get method for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of node interpolation setting. </p>
	 * @see #__DNA__FIELD__interp
	 */
	
	public int getInterp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Copy of node interpolation setting. </p>
	 * @see #__DNA__FIELD__interp
	 */
	
	public void setInterp(int interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, interp);
		} else {
			__io__block.writeInt(__io__address + 20, interp);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TexPaintSlot> __io__addressof() {
		return new CPointer<TexPaintSlot>(__io__address, new Class[]{TexPaintSlot.class}, __io__block, __io__blockTable);
	}

}
