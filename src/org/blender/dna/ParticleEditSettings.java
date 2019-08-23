package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleEditSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Particle}  Edit Mode Settings </p>
 */

@CMetaData(size32=160, size64=176)
public class ParticleEditSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleEditSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleEditSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 190;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totrekey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__totrekey);
	 * CPointer&lt;Short&gt; p_totrekey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totrekey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totrekey = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'totaddkey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__totaddkey);
	 * CPointer&lt;Short&gt; p_totaddkey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totaddkey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totaddkey = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'brushtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__brushtype);
	 * CPointer&lt;Short&gt; p_brushtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brushtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brushtype = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'brush'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__brush);
	 * CPointer&lt;CArrayFacade&lt;ParticleBrushData&gt;&gt; p_brush = p.cast(new Class[]{CArrayFacade.class, ParticleBrushData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush'</li>
	 * <li>Signature: 'ParticleBrushData[7]'</li>
	 * <li>Actual Size (32bit/64bit): 112/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__paintcursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paintcursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paintcursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paintcursor = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'emitterdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__emitterdist);
	 * CPointer&lt;Float&gt; p_emitterdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emitterdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emitterdist = new long[]{124, 128};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__rt);
	 * CPointer&lt;Float&gt; p_rt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{128, 132};

	/**
	 * Field descriptor (offset) for struct member 'selectmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__selectmode);
	 * CPointer&lt;Integer&gt; p_selectmode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selectmode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selectmode = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'edittype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__edittype);
	 * CPointer&lt;Integer&gt; p_edittype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edittype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edittype = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'draw_step'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__draw_step);
	 * CPointer&lt;Integer&gt; p_draw_step = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_step'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_step = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'fade_frames'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__fade_frames);
	 * CPointer&lt;Integer&gt; p_fade_frames = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fade_frames'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fade_frames = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{152, 160};

	/**
	 * Field descriptor (offset) for struct member 'shape_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleEditSettings particleeditsettings = ...;
	 * CPointer&lt;Object&gt; p = particleeditsettings.__dna__addressof(ParticleEditSettings.__DNA__FIELD__shape_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_shape_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shape_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shape_object = new long[]{156, 168};

	public ParticleEditSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleEditSettings(ParticleEditSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'totrekey'.
	 * @see #__DNA__FIELD__totrekey
	 */
	
	public short getTotrekey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'totrekey'.
	 * @see #__DNA__FIELD__totrekey
	 */
	
	public void setTotrekey(short totrekey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, totrekey);
		} else {
			__io__block.writeShort(__io__address + 2, totrekey);
		}
	}

	/**
	 * Get method for struct member 'totaddkey'.
	 * @see #__DNA__FIELD__totaddkey
	 */
	
	public short getTotaddkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totaddkey'.
	 * @see #__DNA__FIELD__totaddkey
	 */
	
	public void setTotaddkey(short totaddkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, totaddkey);
		} else {
			__io__block.writeShort(__io__address + 4, totaddkey);
		}
	}

	/**
	 * Get method for struct member 'brushtype'.
	 * @see #__DNA__FIELD__brushtype
	 */
	
	public short getBrushtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'brushtype'.
	 * @see #__DNA__FIELD__brushtype
	 */
	
	public void setBrushtype(short brushtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, brushtype);
		} else {
			__io__block.writeShort(__io__address + 6, brushtype);
		}
	}

	/**
	 * Get method for struct member 'brush'.
	 * @see #__DNA__FIELD__brush
	 */
	
	public CArrayFacade<ParticleBrushData> getBrush() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ParticleBrushData.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ParticleBrushData>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ParticleBrushData>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'brush'.
	 * @see #__DNA__FIELD__brush
	 */
	
	public void setBrush(CArrayFacade<ParticleBrushData> brush) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(brush, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, brush)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, brush);
		} else {
			__io__generic__copy( getBrush(), brush);
		}
	}

	/**
	 * Get method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public CPointer<Object> getPaintcursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public void setPaintcursor(CPointer<Object> paintcursor) throws IOException
	{
		long __address = ((paintcursor == null) ? 0 : paintcursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'emitterdist'.
	 * @see #__DNA__FIELD__emitterdist
	 */
	
	public float getEmitterdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'emitterdist'.
	 * @see #__DNA__FIELD__emitterdist
	 */
	
	public void setEmitterdist(float emitterdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, emitterdist);
		} else {
			__io__block.writeFloat(__io__address + 124, emitterdist);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public float getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(float rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, rt);
		} else {
			__io__block.writeFloat(__io__address + 128, rt);
		}
	}

	/**
	 * Get method for struct member 'selectmode'.
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public int getSelectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'selectmode'.
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public void setSelectmode(int selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, selectmode);
		} else {
			__io__block.writeInt(__io__address + 132, selectmode);
		}
	}

	/**
	 * Get method for struct member 'edittype'.
	 * @see #__DNA__FIELD__edittype
	 */
	
	public int getEdittype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'edittype'.
	 * @see #__DNA__FIELD__edittype
	 */
	
	public void setEdittype(int edittype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, edittype);
		} else {
			__io__block.writeInt(__io__address + 136, edittype);
		}
	}

	/**
	 * Get method for struct member 'draw_step'.
	 * @see #__DNA__FIELD__draw_step
	 */
	
	public int getDraw_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'draw_step'.
	 * @see #__DNA__FIELD__draw_step
	 */
	
	public void setDraw_step(int draw_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, draw_step);
		} else {
			__io__block.writeInt(__io__address + 140, draw_step);
		}
	}

	/**
	 * Get method for struct member 'fade_frames'.
	 * @see #__DNA__FIELD__fade_frames
	 */
	
	public int getFade_frames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'fade_frames'.
	 * @see #__DNA__FIELD__fade_frames
	 */
	
	public void setFade_frames(int fade_frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, fade_frames);
		} else {
			__io__block.writeInt(__io__address + 144, fade_frames);
		}
	}

	/**
	 * Get method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
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
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'shape_object'.
	 * @see #__DNA__FIELD__shape_object
	 */
	
	public CPointer<BlenderObject> getShape_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shape_object'.
	 * @see #__DNA__FIELD__shape_object
	 */
	
	public void setShape_object(CPointer<BlenderObject> shape_object) throws IOException
	{
		long __address = ((shape_object == null) ? 0 : shape_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleEditSettings> __io__addressof() {
		return new CPointer<ParticleEditSettings>(__io__address, new Class[]{ParticleEditSettings.class}, __io__block, __io__blockTable);
	}

}
