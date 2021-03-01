package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DisplaySafeAreas'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Safe Area options used in {@link Camera}  View & Sequencer </p>
 */

@CMetaData(size32=32, size64=32)
public class DisplaySafeAreas extends CFacade {

	/**
	 * This is the sdna index of the struct DisplaySafeAreas.
	 * <p>
	 * It is required when allocating a new block to store data for DisplaySafeAreas.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 205;

	/**
	 * Field descriptor (offset) for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics<h4>Blender Source Code:</h4>
	 * <p> each value represents the (x,y) margins as a multiplier. 'center' in this context is just the name for a different kind of safe-area Title Safe. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DisplaySafeAreas displaysafeareas = ...;
	 * CPointer&lt;Object&gt; p = displaysafeareas.__dna__addressof(DisplaySafeAreas.__DNA__FIELD__title);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_title = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'title'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__title = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements<h4>Blender Source Code:</h4>
	 * <p> Image/Graphics Safe. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DisplaySafeAreas displaysafeareas = ...;
	 * CPointer&lt;Object&gt; p = displaysafeareas.__dna__addressof(DisplaySafeAreas.__DNA__FIELD__action);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_action = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'title_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics in a different aspect ratio<h4>Blender Source Code:</h4>
	 * <p> use for alternate aspect ratio </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DisplaySafeAreas displaysafeareas = ...;
	 * CPointer&lt;Object&gt; p = displaysafeareas.__dna__addressof(DisplaySafeAreas.__DNA__FIELD__title_center);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_title_center = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'title_center'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__title_center = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'action_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements in a different aspect ratio
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DisplaySafeAreas displaysafeareas = ...;
	 * CPointer&lt;Object&gt; p = displaysafeareas.__dna__addressof(DisplaySafeAreas.__DNA__FIELD__action_center);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_action_center = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action_center'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action_center = new long[]{24, 24};

	public DisplaySafeAreas(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DisplaySafeAreas(DisplaySafeAreas that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics<h4>Blender Source Code:</h4>
	 * <p> each value represents the (x,y) margins as a multiplier. 'center' in this context is just the name for a different kind of safe-area Title Safe. </p>
	 * @see #__DNA__FIELD__title
	 */
	
	public CArrayFacade<Float> getTitle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics<h4>Blender Source Code:</h4>
	 * <p> each value represents the (x,y) margins as a multiplier. 'center' in this context is just the name for a different kind of safe-area Title Safe. </p>
	 * @see #__DNA__FIELD__title
	 */
	
	public void setTitle(CArrayFacade<Float> title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, title);
		} else {
			__io__generic__copy( getTitle(), title);
		}
	}

	/**
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements<h4>Blender Source Code:</h4>
	 * <p> Image/Graphics Safe. </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public CArrayFacade<Float> getAction() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements<h4>Blender Source Code:</h4>
	 * <p> Image/Graphics Safe. </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CArrayFacade<Float> action) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(action, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, action)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, action);
		} else {
			__io__generic__copy( getAction(), action);
		}
	}

	/**
	 * Get method for struct member 'title_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics in a different aspect ratio<h4>Blender Source Code:</h4>
	 * <p> use for alternate aspect ratio </p>
	 * @see #__DNA__FIELD__title_center
	 */
	
	public CArrayFacade<Float> getTitle_center() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'title_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for text and graphics in a different aspect ratio<h4>Blender Source Code:</h4>
	 * <p> use for alternate aspect ratio </p>
	 * @see #__DNA__FIELD__title_center
	 */
	
	public void setTitle_center(CArrayFacade<Float> title_center) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(title_center, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, title_center)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, title_center);
		} else {
			__io__generic__copy( getTitle_center(), title_center);
		}
	}

	/**
	 * Get method for struct member 'action_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements in a different aspect ratio
	 * @see #__DNA__FIELD__action_center
	 */
	
	public CArrayFacade<Float> getAction_center() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'action_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Safe area for general elements in a different aspect ratio
	 * @see #__DNA__FIELD__action_center
	 */
	
	public void setAction_center(CArrayFacade<Float> action_center) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(action_center, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, action_center)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, action_center);
		} else {
			__io__generic__copy( getAction_center(), action_center);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DisplaySafeAreas> __io__addressof() {
		return new CPointer<DisplaySafeAreas>(__io__address, new Class[]{DisplaySafeAreas.class}, __io__block, __io__blockTable);
	}

}
