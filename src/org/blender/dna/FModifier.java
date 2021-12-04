package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FModifier'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  F-Curve DataTypes Modifiers -----------------------------------<mdash/>  F-Curve Modifiers (fcm)</p><p> These alter the way F-Curves behave, by altering the value that is returned when evaluating the curve's data at some time (t). </p>
 */

@CMetaData(size32=112, size64=128)
public class FModifier extends CFacade {

	/**
	 * This is the sdna index of the struct FModifier.
	 * <p>
	 * It is required when allocating a new block to store data for FModifier.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 640;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;FModifier&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, FModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FModifier*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;FModifier&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, FModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FModifier*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Containing curve, only used for updates to CYCLES. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__curve);
	 * CPointer&lt;CPointer&lt;FCurve&gt;&gt; p_curve = p.cast(new Class[]{CPointer.class, FCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'FCurve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to modifier data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curve Modifier Type<h4>Blender Source Code:</h4>
	 * <p> Type of f-curve modifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for the modifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{82, 98};

	/**
	 * Field descriptor (offset) for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  total panels). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__ui_expand_flag);
	 * CPointer&lt;Short&gt; p_ui_expand_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_expand_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_expand_flag = new long[]{84, 100};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{86, 102};

	/**
	 * Field descriptor (offset) for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of influence F-Curve Modifier will have when not fading in/out<h4>Blender Source Code:</h4>
	 * <p> The amount that the modifier should influence the value. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__influence);
	 * CPointer&lt;Float&gt; p_influence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'influence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__influence = new long[]{92, 108};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of restricted frame-range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__sfra);
	 * CPointer&lt;Float&gt; p_sfra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'efra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End frame of restricted frame-range. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__efra);
	 * CPointer&lt;Float&gt; p_efra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'efra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__efra = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from sfra before modifier takes full influence. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__blendin);
	 * CPointer&lt;Float&gt; p_blendin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendin = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'blendout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from efra before modifier fades out. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FModifier fmodifier = ...;
	 * CPointer&lt;Object&gt; p = fmodifier.__dna__addressof(FModifier.__DNA__FIELD__blendout);
	 * CPointer&lt;Float&gt; p_blendout = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendout'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendout = new long[]{108, 124};

	public FModifier(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FModifier(FModifier that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<FModifier> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FModifier.class};
		return new CPointer<FModifier>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FModifier.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<FModifier> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<FModifier> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FModifier.class};
		return new CPointer<FModifier>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FModifier.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<FModifier> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Containing curve, only used for updates to CYCLES. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public CPointer<FCurve> getCurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FCurve.class};
		return new CPointer<FCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Containing curve, only used for updates to CYCLES. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(CPointer<FCurve> curve) throws IOException
	{
		long __address = ((curve == null) ? 0 : curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to modifier data. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to modifier data. </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curve Modifier Type<h4>Blender Source Code:</h4>
	 * <p> Type of f-curve modifier. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 96);
		} else {
			return __io__block.readShort(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curve Modifier Type<h4>Blender Source Code:</h4>
	 * <p> Type of f-curve modifier. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 96, type);
		} else {
			__io__block.writeShort(__io__address + 80, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for the modifier. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 98);
		} else {
			return __io__block.readShort(__io__address + 82);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for the modifier. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 98, flag);
		} else {
			__io__block.writeShort(__io__address + 82, flag);
		}
	}

	/**
	 * Get method for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  total panels). </p>
	 * @see #__DNA__FIELD__ui_expand_flag
	 */
	
	public short getUi_expand_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 100);
		} else {
			return __io__block.readShort(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'ui_expand_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  total panels). </p>
	 * @see #__DNA__FIELD__ui_expand_flag
	 */
	
	public void setUi_expand_flag(short ui_expand_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 100, ui_expand_flag);
		} else {
			__io__block.writeShort(__io__address + 84, ui_expand_flag);
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
			return new CArrayFacade<Byte>(__io__address + 102, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 86, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 102;
		} else {
			__dna__offset = 86;
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
	 * Get method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of influence F-Curve Modifier will have when not fading in/out<h4>Blender Source Code:</h4>
	 * <p> The amount that the modifier should influence the value. </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public float getInfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of influence F-Curve Modifier will have when not fading in/out<h4>Blender Source Code:</h4>
	 * <p> The amount that the modifier should influence the value. </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public void setInfluence(float influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, influence);
		} else {
			__io__block.writeFloat(__io__address + 92, influence);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of restricted frame-range. </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public float getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of restricted frame-range. </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(float sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, sfra);
		} else {
			__io__block.writeFloat(__io__address + 96, sfra);
		}
	}

	/**
	 * Get method for struct member 'efra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End frame of restricted frame-range. </p>
	 * @see #__DNA__FIELD__efra
	 */
	
	public float getEfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'efra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End frame of restricted frame-range. </p>
	 * @see #__DNA__FIELD__efra
	 */
	
	public void setEfra(float efra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, efra);
		} else {
			__io__block.writeFloat(__io__address + 100, efra);
		}
	}

	/**
	 * Get method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from sfra before modifier takes full influence. </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public float getBlendin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from sfra before modifier takes full influence. </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public void setBlendin(float blendin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, blendin);
		} else {
			__io__block.writeFloat(__io__address + 104, blendin);
		}
	}

	/**
	 * Get method for struct member 'blendout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from efra before modifier fades out. </p>
	 * @see #__DNA__FIELD__blendout
	 */
	
	public float getBlendout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'blendout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames from efra before modifier fades out. </p>
	 * @see #__DNA__FIELD__blendout
	 */
	
	public void setBlendout(float blendout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, blendout);
		} else {
			__io__block.writeFloat(__io__address + 108, blendout);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FModifier> __io__addressof() {
		return new CPointer<FModifier>(__io__address, new Class[]{FModifier.class}, __io__block, __io__blockTable);
	}

}
