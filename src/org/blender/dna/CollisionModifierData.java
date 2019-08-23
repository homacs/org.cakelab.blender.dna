package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CollisionModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=192)
public class CollisionModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct CollisionModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for CollisionModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 104;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__x);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_x = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'xnew'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__xnew);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_xnew = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xnew'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xnew = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'xold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__xold);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_xold = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xold'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xold = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'current_xnew'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__current_xnew);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_current_xnew = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'current_xnew'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__current_xnew = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'current_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__current_x);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_current_x = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'current_x'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__current_x = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'current_v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__current_v);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_current_v = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'current_v'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__current_v = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'mfaces'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__mfaces);
	 * CPointer&lt;CPointer&lt;MFace&gt;&gt; p_mfaces = p.cast(new Class[]{CPointer.class, MFace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mfaces'</li>
	 * <li>Signature: 'MFace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mfaces = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'numfaces'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__numfaces);
	 * CPointer&lt;Integer&gt; p_numfaces = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numfaces'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numfaces = new long[]{128, 172};

	/**
	 * Field descriptor (offset) for struct member 'time_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__time_x);
	 * CPointer&lt;Float&gt; p_time_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_x = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'time_xnew'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__time_xnew);
	 * CPointer&lt;Float&gt; p_time_xnew = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_xnew'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_xnew = new long[]{136, 180};

	/**
	 * Field descriptor (offset) for struct member 'bvhtree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__bvhtree);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bvhtree = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvhtree'</li>
	 * <li>Signature: 'BVHTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvhtree = new long[]{140, 184};

	public CollisionModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CollisionModifierData(CollisionModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'x'.
	 * @see #__DNA__FIELD__x
	 */
	
	public CPointer<MVert> getX() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'x'.
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(CPointer<MVert> x) throws IOException
	{
		long __address = ((x == null) ? 0 : x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'xnew'.
	 * @see #__DNA__FIELD__xnew
	 */
	
	public CPointer<MVert> getXnew() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'xnew'.
	 * @see #__DNA__FIELD__xnew
	 */
	
	public void setXnew(CPointer<MVert> xnew) throws IOException
	{
		long __address = ((xnew == null) ? 0 : xnew.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'xold'.
	 * @see #__DNA__FIELD__xold
	 */
	
	public CPointer<MVert> getXold() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'xold'.
	 * @see #__DNA__FIELD__xold
	 */
	
	public void setXold(CPointer<MVert> xold) throws IOException
	{
		long __address = ((xold == null) ? 0 : xold.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'current_xnew'.
	 * @see #__DNA__FIELD__current_xnew
	 */
	
	public CPointer<MVert> getCurrent_xnew() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'current_xnew'.
	 * @see #__DNA__FIELD__current_xnew
	 */
	
	public void setCurrent_xnew(CPointer<MVert> current_xnew) throws IOException
	{
		long __address = ((current_xnew == null) ? 0 : current_xnew.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'current_x'.
	 * @see #__DNA__FIELD__current_x
	 */
	
	public CPointer<MVert> getCurrent_x() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'current_x'.
	 * @see #__DNA__FIELD__current_x
	 */
	
	public void setCurrent_x(CPointer<MVert> current_x) throws IOException
	{
		long __address = ((current_x == null) ? 0 : current_x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'current_v'.
	 * @see #__DNA__FIELD__current_v
	 */
	
	public CPointer<MVert> getCurrent_v() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'current_v'.
	 * @see #__DNA__FIELD__current_v
	 */
	
	public void setCurrent_v(CPointer<MVert> current_v) throws IOException
	{
		long __address = ((current_v == null) ? 0 : current_v.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'mfaces'.
	 * @see #__DNA__FIELD__mfaces
	 */
	
	public CPointer<MFace> getMfaces() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MFace.class};
		return new CPointer<MFace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MFace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mfaces'.
	 * @see #__DNA__FIELD__mfaces
	 */
	
	public void setMfaces(CPointer<MFace> mfaces) throws IOException
	{
		long __address = ((mfaces == null) ? 0 : mfaces.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, numverts);
		} else {
			__io__block.writeInt(__io__address + 124, numverts);
		}
	}

	/**
	 * Get method for struct member 'numfaces'.
	 * @see #__DNA__FIELD__numfaces
	 */
	
	public int getNumfaces() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'numfaces'.
	 * @see #__DNA__FIELD__numfaces
	 */
	
	public void setNumfaces(int numfaces) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, numfaces);
		} else {
			__io__block.writeInt(__io__address + 128, numfaces);
		}
	}

	/**
	 * Get method for struct member 'time_x'.
	 * @see #__DNA__FIELD__time_x
	 */
	
	public float getTime_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'time_x'.
	 * @see #__DNA__FIELD__time_x
	 */
	
	public void setTime_x(float time_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, time_x);
		} else {
			__io__block.writeFloat(__io__address + 132, time_x);
		}
	}

	/**
	 * Get method for struct member 'time_xnew'.
	 * @see #__DNA__FIELD__time_xnew
	 */
	
	public float getTime_xnew() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'time_xnew'.
	 * @see #__DNA__FIELD__time_xnew
	 */
	
	public void setTime_xnew(float time_xnew) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, time_xnew);
		} else {
			__io__block.writeFloat(__io__address + 136, time_xnew);
		}
	}

	/**
	 * Get method for struct member 'bvhtree'.
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public CPointer<Object> getBvhtree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvhtree'.
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public void setBvhtree(CPointer<Object> bvhtree) throws IOException
	{
		long __address = ((bvhtree == null) ? 0 : bvhtree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CollisionModifierData> __io__addressof() {
		return new CPointer<CollisionModifierData>(__io__address, new Class[]{CollisionModifierData.class}, __io__block, __io__blockTable);
	}

}
