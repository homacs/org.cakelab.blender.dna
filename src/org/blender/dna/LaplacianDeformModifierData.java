package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LaplacianDeformModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=216)
public class LaplacianDeformModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct LaplacianDeformModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for LaplacianDeformModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 146;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'anchor_grp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__anchor_grp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_anchor_grp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchor_grp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchor_grp_name = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'total_verts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__total_verts);
	 * CPointer&lt;Integer&gt; p_total_verts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'total_verts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__total_verts = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'repeat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__repeat);
	 * CPointer&lt;Integer&gt; p_repeat = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat = new long[]{168, 188};

	/**
	 * Field descriptor (offset) for struct member 'vertexco'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__vertexco);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_vertexco = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertexco'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertexco = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'cache_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__cache_system);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache_system = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_system'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_system = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LaplacianDeformModifierData laplaciandeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = laplaciandeformmodifierdata.__dna__addressof(LaplacianDeformModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{182, 210};

	public LaplacianDeformModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LaplacianDeformModifierData(LaplacianDeformModifierData that) {
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
	 * Get method for struct member 'anchor_grp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__anchor_grp_name
	 */
	
	public CArrayFacade<Byte> getAnchor_grp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anchor_grp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__anchor_grp_name
	 */
	
	public void setAnchor_grp_name(CArrayFacade<Byte> anchor_grp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(anchor_grp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anchor_grp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anchor_grp_name);
		} else {
			__io__generic__copy( getAnchor_grp_name(), anchor_grp_name);
		}
	}

	/**
	 * Get method for struct member 'total_verts'.
	 * @see #__DNA__FIELD__total_verts
	 */
	
	public int getTotal_verts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'total_verts'.
	 * @see #__DNA__FIELD__total_verts
	 */
	
	public void setTotal_verts(int total_verts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, total_verts);
		} else {
			__io__block.writeInt(__io__address + 164, total_verts);
		}
	}

	/**
	 * Get method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public int getRepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public void setRepeat(int repeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, repeat);
		} else {
			__io__block.writeInt(__io__address + 168, repeat);
		}
	}

	/**
	 * Get method for struct member 'vertexco'.
	 * @see #__DNA__FIELD__vertexco
	 */
	
	public CPointer<Float> getVertexco() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vertexco'.
	 * @see #__DNA__FIELD__vertexco
	 */
	
	public void setVertexco(CPointer<Float> vertexco) throws IOException
	{
		long __address = ((vertexco == null) ? 0 : vertexco.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'cache_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__cache_system
	 */
	
	public CPointer<Object> getCache_system() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__cache_system
	 */
	
	public void setCache_system(CPointer<Object> cache_system) throws IOException
	{
		long __address = ((cache_system == null) ? 0 : cache_system.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, flag);
		} else {
			__io__block.writeShort(__io__address + 180, flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 210, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 182, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 210;
		} else {
			__dna__offset = 182;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LaplacianDeformModifierData> __io__addressof() {
		return new CPointer<LaplacianDeformModifierData>(__io__address, new Class[]{LaplacianDeformModifierData.class}, __io__block, __io__blockTable);
	}

}
