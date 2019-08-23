package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'HookModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=336, size64=368)
public class HookModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct HookModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for HookModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 114;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use enums from WarpModifier (exact same functionality). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Byte&gt; p_falloff_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{169, 193};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{170, 194};

	/**
	 * Field descriptor (offset) for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix making current transform unmodified. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__parentinv);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_parentinv = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parentinv'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parentinv = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'cent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Visualization of hook. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__cent);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cent = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cent'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cent = new long[]{240, 264};

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If not zero, falloff is distance where influence zero. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__falloff);
	 * CPointer&lt;Float&gt; p_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{252, 276};

	/**
	 * Field descriptor (offset) for struct member 'curfalloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__curfalloff);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curfalloff = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curfalloff'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curfalloff = new long[]{256, 280};

	/**
	 * Field descriptor (offset) for struct member 'indexar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If NULL, it's using vertexgroup. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__indexar);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_indexar = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'indexar'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__indexar = new long[]{260, 288};

	/**
	 * Field descriptor (offset) for struct member 'totindex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__totindex);
	 * CPointer&lt;Integer&gt; p_totindex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totindex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totindex = new long[]{264, 296};

	/**
	 * Field descriptor (offset) for struct member 'force'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__force);
	 * CPointer&lt;Float&gt; p_force = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'force'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__force = new long[]{268, 300};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HookModifierData hookmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = hookmodifierdata.__dna__addressof(HookModifierData.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{272, 304};

	public HookModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected HookModifierData(HookModifierData that) {
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
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 192);
		} else {
			return __io__block.readByte(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 192, flag);
		} else {
			__io__block.writeByte(__io__address + 168, flag);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use enums from WarpModifier (exact same functionality). </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public byte getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 193);
		} else {
			return __io__block.readByte(__io__address + 169);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use enums from WarpModifier (exact same functionality). </p>
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(byte falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 193, falloff_type);
		} else {
			__io__block.writeByte(__io__address + 169, falloff_type);
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
			return new CArrayFacade<Byte>(__io__address + 194, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 170, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 194;
		} else {
			__dna__offset = 170;
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
	 * Get method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix making current transform unmodified. </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getParentinv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parentinv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix making current transform unmodified. </p>
	 * @see #__DNA__FIELD__parentinv
	 */
	
	public void setParentinv(CArrayFacade<CArrayFacade<Float>> parentinv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(parentinv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parentinv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parentinv);
		} else {
			__io__generic__copy( getParentinv(), parentinv);
		}
	}

	/**
	 * Get method for struct member 'cent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Visualization of hook. </p>
	 * @see #__DNA__FIELD__cent
	 */
	
	public CArrayFacade<Float> getCent() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Visualization of hook. </p>
	 * @see #__DNA__FIELD__cent
	 */
	
	public void setCent(CArrayFacade<Float> cent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(cent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cent);
		} else {
			__io__generic__copy( getCent(), cent);
		}
	}

	/**
	 * Get method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If not zero, falloff is distance where influence zero. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public float getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If not zero, falloff is distance where influence zero. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(float falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, falloff);
		} else {
			__io__block.writeFloat(__io__address + 252, falloff);
		}
	}

	/**
	 * Get method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public CPointer<CurveMapping> getCurfalloff() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curfalloff'.
	 * @see #__DNA__FIELD__curfalloff
	 */
	
	public void setCurfalloff(CPointer<CurveMapping> curfalloff) throws IOException
	{
		long __address = ((curfalloff == null) ? 0 : curfalloff.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'indexar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If NULL, it's using vertexgroup. </p>
	 * @see #__DNA__FIELD__indexar
	 */
	
	public CPointer<Integer> getIndexar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'indexar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If NULL, it's using vertexgroup. </p>
	 * @see #__DNA__FIELD__indexar
	 */
	
	public void setIndexar(CPointer<Integer> indexar) throws IOException
	{
		long __address = ((indexar == null) ? 0 : indexar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 260, __address);
		}
	}

	/**
	 * Get method for struct member 'totindex'.
	 * @see #__DNA__FIELD__totindex
	 */
	
	public int getTotindex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 296);
		} else {
			return __io__block.readInt(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'totindex'.
	 * @see #__DNA__FIELD__totindex
	 */
	
	public void setTotindex(int totindex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 296, totindex);
		} else {
			__io__block.writeInt(__io__address + 264, totindex);
		}
	}

	/**
	 * Get method for struct member 'force'.
	 * @see #__DNA__FIELD__force
	 */
	
	public float getForce() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'force'.
	 * @see #__DNA__FIELD__force
	 */
	
	public void setForce(float force) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, force);
		} else {
			__io__block.writeFloat(__io__address + 268, force);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<HookModifierData> __io__addressof() {
		return new CPointer<HookModifierData>(__io__address, new Class[]{HookModifierData.class}, __io__block, __io__blockTable);
	}

}
