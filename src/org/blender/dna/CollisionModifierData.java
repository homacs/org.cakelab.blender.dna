package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CollisionModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=156, size64=208)
public class CollisionModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct CollisionModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for CollisionModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 117;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the beginning of the frame. </p>
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
	public static final long[] __DNA__FIELD__x = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the end of the frame. </p>
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
	public static final long[] __DNA__FIELD__xnew = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'xold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused atm, but was discussed during sprint. </p>
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
	public static final long[] __DNA__FIELD__xold = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'current_xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New position at the actual inter-frame step. </p>
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
	public static final long[] __DNA__FIELD__current_xnew = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'current_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the actual inter-frame step. </p>
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
	public static final long[] __DNA__FIELD__current_x = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'current_v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (xnew - x) at the actual inter-frame step. </p>
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
	public static final long[] __DNA__FIELD__current_v = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'tri'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__tri);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tri = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tri'</li>
	 * <li>Signature: 'MVertTri*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tri = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'mvert_num'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__mvert_num);
	 * CPointer&lt;Integer&gt; p_mvert_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mvert_num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mvert_num = new long[]{128, 176};

	/**
	 * Field descriptor (offset) for struct member 'tri_num'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__tri_num);
	 * CPointer&lt;Integer&gt; p_tri_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tri_num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tri_num = new long[]{132, 180};

	/**
	 * Field descriptor (offset) for struct member 'time_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cfra time of modifier. </p>
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
	public static final long[] __DNA__FIELD__time_x = new long[]{136, 184};

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
	public static final long[] __DNA__FIELD__time_xnew = new long[]{140, 188};

	/**
	 * Field descriptor (offset) for struct member 'is_static'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collider doesn't move this frame, i.e. x[].co==xnew[].co. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD__is_static);
	 * CPointer&lt;Byte&gt; p_is_static = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_static'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_static = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CollisionModifierData collisionmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = collisionmodifierdata.__dna__addressof(CollisionModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{145, 193};

	/**
	 * Field descriptor (offset) for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy for this cloth object. </p>
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
	public static final long[] __DNA__FIELD__bvhtree = new long[]{152, 200};

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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the beginning of the frame. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public CPointer<MVert> getX() throws IOException
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
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the beginning of the frame. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(CPointer<MVert> x) throws IOException
	{
		long __address = ((x == null) ? 0 : x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the end of the frame. </p>
	 * @see #__DNA__FIELD__xnew
	 */
	
	public CPointer<MVert> getXnew() throws IOException
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
	 * Set method for struct member 'xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the end of the frame. </p>
	 * @see #__DNA__FIELD__xnew
	 */
	
	public void setXnew(CPointer<MVert> xnew) throws IOException
	{
		long __address = ((xnew == null) ? 0 : xnew.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'xold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused atm, but was discussed during sprint. </p>
	 * @see #__DNA__FIELD__xold
	 */
	
	public CPointer<MVert> getXold() throws IOException
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
	 * Set method for struct member 'xold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused atm, but was discussed during sprint. </p>
	 * @see #__DNA__FIELD__xold
	 */
	
	public void setXold(CPointer<MVert> xold) throws IOException
	{
		long __address = ((xold == null) ? 0 : xold.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'current_xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New position at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_xnew
	 */
	
	public CPointer<MVert> getCurrent_xnew() throws IOException
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
	 * Set method for struct member 'current_xnew'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> New position at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_xnew
	 */
	
	public void setCurrent_xnew(CPointer<MVert> current_xnew) throws IOException
	{
		long __address = ((current_xnew == null) ? 0 : current_xnew.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'current_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_x
	 */
	
	public CPointer<MVert> getCurrent_x() throws IOException
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
	 * Set method for struct member 'current_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Position at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_x
	 */
	
	public void setCurrent_x(CPointer<MVert> current_x) throws IOException
	{
		long __address = ((current_x == null) ? 0 : current_x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'current_v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (xnew - x) at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_v
	 */
	
	public CPointer<MVert> getCurrent_v() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'current_v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (xnew - x) at the actual inter-frame step. </p>
	 * @see #__DNA__FIELD__current_v
	 */
	
	public void setCurrent_v(CPointer<MVert> current_v) throws IOException
	{
		long __address = ((current_v == null) ? 0 : current_v.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'tri'.
	 * @see #__DNA__FIELD__tri
	 */
	
	public CPointer<Object> getTri() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tri'.
	 * @see #__DNA__FIELD__tri
	 */
	
	public void setTri(CPointer<Object> tri) throws IOException
	{
		long __address = ((tri == null) ? 0 : tri.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'mvert_num'.
	 * @see #__DNA__FIELD__mvert_num
	 */
	
	public int getMvert_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'mvert_num'.
	 * @see #__DNA__FIELD__mvert_num
	 */
	
	public void setMvert_num(int mvert_num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 176, mvert_num);
		} else {
			__io__block.writeInt(__io__address + 128, mvert_num);
		}
	}

	/**
	 * Get method for struct member 'tri_num'.
	 * @see #__DNA__FIELD__tri_num
	 */
	
	public int getTri_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'tri_num'.
	 * @see #__DNA__FIELD__tri_num
	 */
	
	public void setTri_num(int tri_num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, tri_num);
		} else {
			__io__block.writeInt(__io__address + 132, tri_num);
		}
	}

	/**
	 * Get method for struct member 'time_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cfra time of modifier. </p>
	 * @see #__DNA__FIELD__time_x
	 */
	
	public float getTime_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'time_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cfra time of modifier. </p>
	 * @see #__DNA__FIELD__time_x
	 */
	
	public void setTime_x(float time_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, time_x);
		} else {
			__io__block.writeFloat(__io__address + 136, time_x);
		}
	}

	/**
	 * Get method for struct member 'time_xnew'.
	 * @see #__DNA__FIELD__time_xnew
	 */
	
	public float getTime_xnew() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'time_xnew'.
	 * @see #__DNA__FIELD__time_xnew
	 */
	
	public void setTime_xnew(float time_xnew) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, time_xnew);
		} else {
			__io__block.writeFloat(__io__address + 140, time_xnew);
		}
	}

	/**
	 * Get method for struct member 'is_static'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collider doesn't move this frame, i.e. x[].co==xnew[].co. </p>
	 * @see #__DNA__FIELD__is_static
	 */
	
	public byte getIs_static() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 192);
		} else {
			return __io__block.readByte(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'is_static'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collider doesn't move this frame, i.e. x[].co==xnew[].co. </p>
	 * @see #__DNA__FIELD__is_static
	 */
	
	public void setIs_static(byte is_static) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 192, is_static);
		} else {
			__io__block.writeByte(__io__address + 144, is_static);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 193, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 145, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 193;
		} else {
			__dna__offset = 145;
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
	 * Get method for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy for this cloth object. </p>
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public CPointer<Object> getBvhtree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy for this cloth object. </p>
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public void setBvhtree(CPointer<Object> bvhtree) throws IOException
	{
		long __address = ((bvhtree == null) ? 0 : bvhtree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CollisionModifierData> __io__addressof() {
		return new CPointer<CollisionModifierData>(__io__address, new Class[]{CollisionModifierData.class}, __io__block, __io__blockTable);
	}

}
