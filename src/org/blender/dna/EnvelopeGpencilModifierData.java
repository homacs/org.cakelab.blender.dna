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
 * Generated facet for DNA struct type 'EnvelopeGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=264, size64=280)
public class EnvelopeGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct EnvelopeGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for EnvelopeGpencilModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 617;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for filtering. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__material);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_material = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'material'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__material = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Layer name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layername = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__vgname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgname = new long[]{160, 176};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{224, 240};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Several flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{228, 244};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{232, 248};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for the new strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Integer&gt; p_mat_nr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{236, 252};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness multiplier for the new strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__thickness);
	 * CPointer&lt;Float&gt; p_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{240, 256};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Strength multiplier for the new strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{244, 260};

	/**
	 * Field descriptor (offset) for struct member 'skip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of points to skip over. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__skip);
	 * CPointer&lt;Integer&gt; p_skip = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skip'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skip = new long[]{248, 264};

	/**
	 * Field descriptor (offset) for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__layer_pass);
	 * CPointer&lt;Integer&gt; p_layer_pass = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_pass'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_pass = new long[]{252, 268};

	/**
	 * Field descriptor (offset) for struct member 'spread'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Length of the envelope effect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD__spread);
	 * CPointer&lt;Integer&gt; p_spread = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spread'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spread = new long[]{256, 272};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EnvelopeGpencilModifierData envelopegpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = envelopegpencilmodifierdata.__dna__addressof(EnvelopeGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{260, 276};

	public EnvelopeGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected EnvelopeGpencilModifierData(EnvelopeGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
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
	 * Get method for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for filtering. </p>
	 * @see #__DNA__FIELD__material
	 */
	
	public CPointer<Material> getMaterial() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Material.class};
		return new CPointer<Material>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Material.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'material'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for filtering. </p>
	 * @see #__DNA__FIELD__material
	 */
	
	public void setMaterial(CPointer<Material> material) throws IOException
	{
		long __address = ((material == null) ? 0 : material.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public CArrayFacade<Byte> getLayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public void setLayername(CArrayFacade<Byte> layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(layername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layername);
		} else {
			__io__generic__copy( getLayername(), layername);
		}
	}

	/**
	 * Get method for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgname
	 */
	
	public CArrayFacade<Byte> getVgname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgname
	 */
	
	public void setVgname(CArrayFacade<Byte> vgname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(vgname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgname);
		} else {
			__io__generic__copy( getVgname(), vgname);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, pass_index);
		} else {
			__io__block.writeInt(__io__address + 224, pass_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Several flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Several flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, flag);
		} else {
			__io__block.writeInt(__io__address + 228, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, mode);
		} else {
			__io__block.writeInt(__io__address + 232, mode);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for the new strokes. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public int getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  for the new strokes. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(int mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, mat_nr);
		} else {
			__io__block.writeInt(__io__address + 236, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness multiplier for the new strokes. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public float getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness multiplier for the new strokes. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(float thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, thickness);
		} else {
			__io__block.writeFloat(__io__address + 240, thickness);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Strength multiplier for the new strokes. </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Strength multiplier for the new strokes. </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, strength);
		} else {
			__io__block.writeFloat(__io__address + 244, strength);
		}
	}

	/**
	 * Get method for struct member 'skip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of points to skip over. </p>
	 * @see #__DNA__FIELD__skip
	 */
	
	public int getSkip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 264);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'skip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of points to skip over. </p>
	 * @see #__DNA__FIELD__skip
	 */
	
	public void setSkip(int skip) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 264, skip);
		} else {
			__io__block.writeInt(__io__address + 248, skip);
		}
	}

	/**
	 * Get method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public int getLayer_pass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 268);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public void setLayer_pass(int layer_pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 268, layer_pass);
		} else {
			__io__block.writeInt(__io__address + 252, layer_pass);
		}
	}

	/**
	 * Get method for struct member 'spread'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Length of the envelope effect. </p>
	 * @see #__DNA__FIELD__spread
	 */
	
	public int getSpread() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 272);
		} else {
			return __io__block.readInt(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'spread'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Length of the envelope effect. </p>
	 * @see #__DNA__FIELD__spread
	 */
	
	public void setSpread(int spread) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 272, spread);
		} else {
			__io__block.writeInt(__io__address + 256, spread);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 276, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 276;
		} else {
			__dna__offset = 260;
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
	public CPointer<EnvelopeGpencilModifierData> __io__addressof() {
		return new CPointer<EnvelopeGpencilModifierData>(__io__address, new Class[]{EnvelopeGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
