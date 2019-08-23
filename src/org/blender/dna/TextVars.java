package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TextVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=528, size64=528)
public class TextVars extends CFacade {

	/**
	 * This is the sdna index of the struct TextVars.
	 * <p>
	 * It is required when allocating a new block to store data for TextVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 273;

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'char[512]'</li>
	 * <li>Actual Size (32bit/64bit): 512/512</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'text_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text_size);
	 * CPointer&lt;Integer&gt; p_text_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_size = new long[]{512, 512};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{516, 516};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{524, 524};

	/**
	 * Field descriptor (offset) for struct member 'align'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__align);
	 * CPointer&lt;Byte&gt; p_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align = new long[]{526, 526};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{527, 527};

	public TextVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TextVars(TextVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public CArrayFacade<Byte> getText() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			512
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(CArrayFacade<Byte> text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text);
		} else {
			__io__generic__copy( getText(), text);
		}
	}

	/**
	 * Get method for struct member 'text_size'.
	 * @see #__DNA__FIELD__text_size
	 */
	
	public int getText_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 512);
		} else {
			return __io__block.readInt(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'text_size'.
	 * @see #__DNA__FIELD__text_size
	 */
	
	public void setText_size(int text_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 512, text_size);
		} else {
			__io__block.writeInt(__io__address + 512, text_size);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 516, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 516, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 516;
		} else {
			__dna__offset = 516;
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 524);
		} else {
			return __io__block.readShort(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 524, flag);
		} else {
			__io__block.writeShort(__io__address + 524, flag);
		}
	}

	/**
	 * Get method for struct member 'align'.
	 * @see #__DNA__FIELD__align
	 */
	
	public byte getAlign() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 526);
		} else {
			return __io__block.readByte(__io__address + 526);
		}
	}

	/**
	 * Set method for struct member 'align'.
	 * @see #__DNA__FIELD__align
	 */
	
	public void setAlign(byte align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 526, align);
		} else {
			__io__block.writeByte(__io__address + 526, align);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 527);
		} else {
			return __io__block.readByte(__io__address + 527);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 527, pad);
		} else {
			__io__block.writeByte(__io__address + 527, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TextVars> __io__addressof() {
		return new CPointer<TextVars>(__io__address, new Class[]{TextVars.class}, __io__block, __io__blockTable);
	}

}
