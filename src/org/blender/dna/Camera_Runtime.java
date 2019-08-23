package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Camera_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=216, size64=216)
public class Camera_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Camera_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Camera_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 32;

	/**
	 * Field descriptor (offset) for struct member 'drw_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For draw manager. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera_Runtime camera_runtime = ...;
	 * CPointer&lt;Object&gt; p = camera_runtime.__dna__addressof(Camera_Runtime.__DNA__FIELD__drw_corners);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt;&gt; p_drw_corners = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drw_corners'</li>
	 * <li>Signature: 'float[2][4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drw_corners = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'drw_tria'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera_Runtime camera_runtime = ...;
	 * CPointer&lt;Object&gt; p = camera_runtime.__dna__addressof(Camera_Runtime.__DNA__FIELD__drw_tria);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_drw_tria = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drw_tria'</li>
	 * <li>Signature: 'float[2][2]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drw_tria = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'drw_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera_Runtime camera_runtime = ...;
	 * CPointer&lt;Object&gt; p = camera_runtime.__dna__addressof(Camera_Runtime.__DNA__FIELD__drw_depth);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drw_depth = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drw_depth'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drw_depth = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'drw_focusmat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera_Runtime camera_runtime = ...;
	 * CPointer&lt;Object&gt; p = camera_runtime.__dna__addressof(Camera_Runtime.__DNA__FIELD__drw_focusmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_drw_focusmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drw_focusmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drw_focusmat = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'drw_normalmat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Camera_Runtime camera_runtime = ...;
	 * CPointer&lt;Object&gt; p = camera_runtime.__dna__addressof(Camera_Runtime.__DNA__FIELD__drw_normalmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_drw_normalmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drw_normalmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drw_normalmat = new long[]{152, 152};

	public Camera_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Camera_Runtime(Camera_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'drw_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For draw manager. </p>
	 * @see #__DNA__FIELD__drw_corners
	 */
	
	public CArrayFacade<CArrayFacade<CArrayFacade<Float>>> getDrw_corners() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			2,
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<CArrayFacade<Float>>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<CArrayFacade<Float>>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drw_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For draw manager. </p>
	 * @see #__DNA__FIELD__drw_corners
	 */
	
	public void setDrw_corners(CArrayFacade<CArrayFacade<CArrayFacade<Float>>> drw_corners) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(drw_corners, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drw_corners)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drw_corners);
		} else {
			__io__generic__copy( getDrw_corners(), drw_corners);
		}
	}

	/**
	 * Get method for struct member 'drw_tria'.
	 * @see #__DNA__FIELD__drw_tria
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getDrw_tria() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			2,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drw_tria'.
	 * @see #__DNA__FIELD__drw_tria
	 */
	
	public void setDrw_tria(CArrayFacade<CArrayFacade<Float>> drw_tria) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(drw_tria, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drw_tria)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drw_tria);
		} else {
			__io__generic__copy( getDrw_tria(), drw_tria);
		}
	}

	/**
	 * Get method for struct member 'drw_depth'.
	 * @see #__DNA__FIELD__drw_depth
	 */
	
	public CArrayFacade<Float> getDrw_depth() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drw_depth'.
	 * @see #__DNA__FIELD__drw_depth
	 */
	
	public void setDrw_depth(CArrayFacade<Float> drw_depth) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(drw_depth, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drw_depth)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drw_depth);
		} else {
			__io__generic__copy( getDrw_depth(), drw_depth);
		}
	}

	/**
	 * Get method for struct member 'drw_focusmat'.
	 * @see #__DNA__FIELD__drw_focusmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getDrw_focusmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drw_focusmat'.
	 * @see #__DNA__FIELD__drw_focusmat
	 */
	
	public void setDrw_focusmat(CArrayFacade<CArrayFacade<Float>> drw_focusmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(drw_focusmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drw_focusmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drw_focusmat);
		} else {
			__io__generic__copy( getDrw_focusmat(), drw_focusmat);
		}
	}

	/**
	 * Get method for struct member 'drw_normalmat'.
	 * @see #__DNA__FIELD__drw_normalmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getDrw_normalmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drw_normalmat'.
	 * @see #__DNA__FIELD__drw_normalmat
	 */
	
	public void setDrw_normalmat(CArrayFacade<CArrayFacade<Float>> drw_normalmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(drw_normalmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drw_normalmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drw_normalmat);
		} else {
			__io__generic__copy( getDrw_normalmat(), drw_normalmat);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Camera_Runtime> __io__addressof() {
		return new CPointer<Camera_Runtime>(__io__address, new Class[]{Camera_Runtime.class}, __io__block, __io__blockTable);
	}

}
