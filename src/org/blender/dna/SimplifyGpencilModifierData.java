package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SimplifyGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=252, size64=264)
public class SimplifyGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SimplifyGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SimplifyGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 496;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layername = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__materialname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_materialname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'materialname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__materialname = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{220, 232};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{224, 236};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of simplify. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{228, 240};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of simplify. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{232, 244};

	/**
	 * Field descriptor (offset) for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Every n vertex to keep. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__step);
	 * CPointer&lt;Short&gt; p_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__step = new long[]{234, 246};

	/**
	 * Field descriptor (offset) for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__layer_pass);
	 * CPointer&lt;Integer&gt; p_layer_pass = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_pass'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_pass = new long[]{236, 248};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sample length </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__length);
	 * CPointer&lt;Float&gt; p_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{240, 252};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Merge distance </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{244, 256};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimplifyGpencilModifierData simplifygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simplifygpencilmodifierdata.__dna__addressof(SimplifyGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{248, 260};

	public SimplifyGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SimplifyGpencilModifierData(SimplifyGpencilModifierData that) {
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
	 * Get method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public void setLayername(CArrayFacade<Byte> layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
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
	 * Get method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public CArrayFacade<Byte> getMaterialname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public void setMaterialname(CArrayFacade<Byte> materialname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(materialname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, materialname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, materialname);
		} else {
			__io__generic__copy( getMaterialname(), materialname);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, pass_index);
		} else {
			__io__block.writeInt(__io__address + 220, pass_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, flag);
		} else {
			__io__block.writeInt(__io__address + 224, flag);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of simplify. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor of simplify. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, factor);
		} else {
			__io__block.writeFloat(__io__address + 228, factor);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of simplify. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 244);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of simplify. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 244, mode);
		} else {
			__io__block.writeShort(__io__address + 232, mode);
		}
	}

	/**
	 * Get method for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Every n vertex to keep. </p>
	 * @see #__DNA__FIELD__step
	 */
	
	public short getStep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 246);
		} else {
			return __io__block.readShort(__io__address + 234);
		}
	}

	/**
	 * Set method for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Every n vertex to keep. </p>
	 * @see #__DNA__FIELD__step
	 */
	
	public void setStep(short step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 246, step);
		} else {
			__io__block.writeShort(__io__address + 234, step);
		}
	}

	/**
	 * Get method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public int getLayer_pass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public void setLayer_pass(int layer_pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, layer_pass);
		} else {
			__io__block.writeInt(__io__address + 236, layer_pass);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sample length </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public float getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sample length </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(float length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, length);
		} else {
			__io__block.writeFloat(__io__address + 240, length);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Merge distance </p>
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Merge distance </p>
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, distance);
		} else {
			__io__block.writeFloat(__io__address + 244, distance);
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
			return new CArrayFacade<Byte>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 260;
		} else {
			__dna__offset = 248;
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
	public CPointer<SimplifyGpencilModifierData> __io__addressof() {
		return new CPointer<SimplifyGpencilModifierData>(__io__address, new Class[]{SimplifyGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
