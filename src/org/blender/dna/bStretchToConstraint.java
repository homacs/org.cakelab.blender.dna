package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bStretchToConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Stretch to constraint </p>
 */

@CMetaData(size32=100, size64=104)
public class bStretchToConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bStretchToConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bStretchToConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 344;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'volmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__volmode);
	 * CPointer&lt;Integer&gt; p_volmode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volmode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volmode = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'plane'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__plane);
	 * CPointer&lt;Integer&gt; p_plane = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plane'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plane = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'orglength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__orglength);
	 * CPointer&lt;Float&gt; p_orglength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orglength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orglength = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'bulge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__bulge);
	 * CPointer&lt;Float&gt; p_bulge = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'bulge_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__bulge_min);
	 * CPointer&lt;Float&gt; p_bulge_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_min = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'bulge_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__bulge_max);
	 * CPointer&lt;Float&gt; p_bulge_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_max = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'bulge_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__bulge_smooth);
	 * CPointer&lt;Float&gt; p_bulge_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_smooth = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStretchToConstraint bstretchtoconstraint = ...;
	 * CPointer&lt;Object&gt; p = bstretchtoconstraint.__dna__addressof(bStretchToConstraint.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{36, 40};

	public bStretchToConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bStretchToConstraint(bStretchToConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'volmode'.
	 * @see #__DNA__FIELD__volmode
	 */
	
	public int getVolmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'volmode'.
	 * @see #__DNA__FIELD__volmode
	 */
	
	public void setVolmode(int volmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, volmode);
		} else {
			__io__block.writeInt(__io__address + 8, volmode);
		}
	}

	/**
	 * Get method for struct member 'plane'.
	 * @see #__DNA__FIELD__plane
	 */
	
	public int getPlane() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'plane'.
	 * @see #__DNA__FIELD__plane
	 */
	
	public void setPlane(int plane) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, plane);
		} else {
			__io__block.writeInt(__io__address + 12, plane);
		}
	}

	/**
	 * Get method for struct member 'orglength'.
	 * @see #__DNA__FIELD__orglength
	 */
	
	public float getOrglength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'orglength'.
	 * @see #__DNA__FIELD__orglength
	 */
	
	public void setOrglength(float orglength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, orglength);
		} else {
			__io__block.writeFloat(__io__address + 16, orglength);
		}
	}

	/**
	 * Get method for struct member 'bulge'.
	 * @see #__DNA__FIELD__bulge
	 */
	
	public float getBulge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'bulge'.
	 * @see #__DNA__FIELD__bulge
	 */
	
	public void setBulge(float bulge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, bulge);
		} else {
			__io__block.writeFloat(__io__address + 20, bulge);
		}
	}

	/**
	 * Get method for struct member 'bulge_min'.
	 * @see #__DNA__FIELD__bulge_min
	 */
	
	public float getBulge_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'bulge_min'.
	 * @see #__DNA__FIELD__bulge_min
	 */
	
	public void setBulge_min(float bulge_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, bulge_min);
		} else {
			__io__block.writeFloat(__io__address + 24, bulge_min);
		}
	}

	/**
	 * Get method for struct member 'bulge_max'.
	 * @see #__DNA__FIELD__bulge_max
	 */
	
	public float getBulge_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'bulge_max'.
	 * @see #__DNA__FIELD__bulge_max
	 */
	
	public void setBulge_max(float bulge_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, bulge_max);
		} else {
			__io__block.writeFloat(__io__address + 28, bulge_max);
		}
	}

	/**
	 * Get method for struct member 'bulge_smooth'.
	 * @see #__DNA__FIELD__bulge_smooth
	 */
	
	public float getBulge_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'bulge_smooth'.
	 * @see #__DNA__FIELD__bulge_smooth
	 */
	
	public void setBulge_smooth(float bulge_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, bulge_smooth);
		} else {
			__io__block.writeFloat(__io__address + 32, bulge_smooth);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bStretchToConstraint> __io__addressof() {
		return new CPointer<bStretchToConstraint>(__io__address, new Class[]{bStretchToConstraint.class}, __io__block, __io__blockTable);
	}

}
