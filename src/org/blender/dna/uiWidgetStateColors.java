package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiWidgetStateColors'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class uiWidgetStateColors extends CFacade {

	/**
	 * This is the sdna index of the struct uiWidgetStateColors.
	 * <p>
	 * It is required when allocating a new block to store data for uiWidgetStateColors.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 243;

	/**
	 * Field descriptor (offset) for struct member 'inner_anim'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_anim);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_anim = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_anim'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_anim = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'inner_anim_sel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_anim_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_anim_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_anim_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_anim_sel = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'inner_key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_key);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_key = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_key'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_key = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'inner_key_sel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_key_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_key_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_key_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_key_sel = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'inner_driven'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_driven);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_driven = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_driven'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_driven = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'inner_driven_sel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__inner_driven_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_driven_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_driven_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_driven_sel = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'blend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__blend);
	 * CPointer&lt;Float&gt; p_blend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetStateColors uiwidgetstatecolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetstatecolors.__dna__addressof(uiWidgetStateColors.__DNA__FIELD__pad);
	 * CPointer&lt;Float&gt; p_pad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{28, 28};

	public uiWidgetStateColors(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiWidgetStateColors(uiWidgetStateColors that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'inner_anim'.
	 * @see #__DNA__FIELD__inner_anim
	 */
	
	public CArrayFacade<Byte> getInner_anim() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_anim'.
	 * @see #__DNA__FIELD__inner_anim
	 */
	
	public void setInner_anim(CArrayFacade<Byte> inner_anim) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(inner_anim, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_anim)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_anim);
		} else {
			__io__generic__copy( getInner_anim(), inner_anim);
		}
	}

	/**
	 * Get method for struct member 'inner_anim_sel'.
	 * @see #__DNA__FIELD__inner_anim_sel
	 */
	
	public CArrayFacade<Byte> getInner_anim_sel() throws IOException
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
	 * Set method for struct member 'inner_anim_sel'.
	 * @see #__DNA__FIELD__inner_anim_sel
	 */
	
	public void setInner_anim_sel(CArrayFacade<Byte> inner_anim_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(inner_anim_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_anim_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_anim_sel);
		} else {
			__io__generic__copy( getInner_anim_sel(), inner_anim_sel);
		}
	}

	/**
	 * Get method for struct member 'inner_key'.
	 * @see #__DNA__FIELD__inner_key
	 */
	
	public CArrayFacade<Byte> getInner_key() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_key'.
	 * @see #__DNA__FIELD__inner_key
	 */
	
	public void setInner_key(CArrayFacade<Byte> inner_key) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(inner_key, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_key)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_key);
		} else {
			__io__generic__copy( getInner_key(), inner_key);
		}
	}

	/**
	 * Get method for struct member 'inner_key_sel'.
	 * @see #__DNA__FIELD__inner_key_sel
	 */
	
	public CArrayFacade<Byte> getInner_key_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_key_sel'.
	 * @see #__DNA__FIELD__inner_key_sel
	 */
	
	public void setInner_key_sel(CArrayFacade<Byte> inner_key_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(inner_key_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_key_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_key_sel);
		} else {
			__io__generic__copy( getInner_key_sel(), inner_key_sel);
		}
	}

	/**
	 * Get method for struct member 'inner_driven'.
	 * @see #__DNA__FIELD__inner_driven
	 */
	
	public CArrayFacade<Byte> getInner_driven() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_driven'.
	 * @see #__DNA__FIELD__inner_driven
	 */
	
	public void setInner_driven(CArrayFacade<Byte> inner_driven) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(inner_driven, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_driven)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_driven);
		} else {
			__io__generic__copy( getInner_driven(), inner_driven);
		}
	}

	/**
	 * Get method for struct member 'inner_driven_sel'.
	 * @see #__DNA__FIELD__inner_driven_sel
	 */
	
	public CArrayFacade<Byte> getInner_driven_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_driven_sel'.
	 * @see #__DNA__FIELD__inner_driven_sel
	 */
	
	public void setInner_driven_sel(CArrayFacade<Byte> inner_driven_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(inner_driven_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_driven_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_driven_sel);
		} else {
			__io__generic__copy( getInner_driven_sel(), inner_driven_sel);
		}
	}

	/**
	 * Get method for struct member 'blend'.
	 * @see #__DNA__FIELD__blend
	 */
	
	public float getBlend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'blend'.
	 * @see #__DNA__FIELD__blend
	 */
	
	public void setBlend(float blend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, blend);
		} else {
			__io__block.writeFloat(__io__address + 24, blend);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public float getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(float pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, pad);
		} else {
			__io__block.writeFloat(__io__address + 28, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiWidgetStateColors> __io__addressof() {
		return new CPointer<uiWidgetStateColors>(__io__address, new Class[]{uiWidgetStateColors.class}, __io__block, __io__blockTable);
	}

}
