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
 * Generated facet for DNA struct type 'ImageTile_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=48, size64=48)
public class ImageTile_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct ImageTile_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for ImageTile_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 44;

	/**
	 * Field descriptor (offset) for struct member 'slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code><code></code>  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ImageTile_Runtime imagetile_runtime = ...;
	 * CPointer&lt;Object&gt; p = imagetile_runtime.__dna__addressof(ImageTile_Runtime.__DNA__FIELD__slots);
	 * CPointer&lt;CArrayFacade&lt;ImageTile_RuntimeTextureSlot&gt;&gt; p_slots = p.cast(new Class[]{CArrayFacade.class, ImageTile_RuntimeTextureSlot.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slots'</li>
	 * <li>Signature: 'ImageTile_RuntimeTextureSlot[2]'</li>
	 * <li>Actual Size (32bit/64bit): 48/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slots = new long[]{0, 0};

	public ImageTile_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ImageTile_Runtime(ImageTile_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code><code></code>  </p>
	 * @see #__DNA__FIELD__slots
	 */
	
	public CArrayFacade<ImageTile_RuntimeTextureSlot> getSlots() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ImageTile_RuntimeTextureSlot.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ImageTile_RuntimeTextureSlot>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ImageTile_RuntimeTextureSlot>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code><code></code>  </p>
	 * @see #__DNA__FIELD__slots
	 */
	
	public void setSlots(CArrayFacade<ImageTile_RuntimeTextureSlot> slots) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(slots, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, slots)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, slots);
		} else {
			__io__generic__copy( getSlots(), slots);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ImageTile_Runtime> __io__addressof() {
		return new CPointer<ImageTile_Runtime>(__io__address, new Class[]{ImageTile_Runtime.class}, __io__block, __io__blockTable);
	}

}
