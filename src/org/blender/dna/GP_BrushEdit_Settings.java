package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_BrushEdit_Settings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> GPencil Stroke Sculpting Settings </p>
 */

@CMetaData(size32=108, size64=112)
public class GP_BrushEdit_Settings extends CFacade {

	/**
	 * This is the sdna index of the struct GP_BrushEdit_Settings.
	 * <p>
	 * It is required when allocating a new block to store data for GP_BrushEdit_Settings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 193;

	/**
	 * Field descriptor (offset) for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TOT_GP_EDITBRUSH_TYPES </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__brush);
	 * CPointer&lt;CArrayFacade&lt;GP_EditBrush_Data&gt;&gt; p_brush = p.cast(new Class[]{CArrayFacade.class, GP_EditBrush_Data.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush'</li>
	 * <li>Signature: 'GP_EditBrush_Data[11]'</li>
	 * <li>Actual Size (32bit/64bit): 88/88</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__paintcursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paintcursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paintcursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paintcursor = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'brushtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_EditBrush_Types </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__brushtype);
	 * CPointer&lt;Integer&gt; p_brushtype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brushtype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brushtype = new long[]{92, 96};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_BrushEdit_SettingsFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{96, 100};

	/**
	 * Field descriptor (offset) for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lock drawing to one axis </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__lock_axis);
	 * CPointer&lt;Integer&gt; p_lock_axis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock_axis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock_axis = new long[]{100, 104};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alpha factor for selection color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_BrushEdit_Settings gp_brushedit_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_brushedit_settings.__dna__addressof(GP_BrushEdit_Settings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{104, 108};

	public GP_BrushEdit_Settings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_BrushEdit_Settings(GP_BrushEdit_Settings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TOT_GP_EDITBRUSH_TYPES </p>
	 * @see #__DNA__FIELD__brush
	 */
	
	public CArrayFacade<GP_EditBrush_Data> getBrush() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{GP_EditBrush_Data.class};
		int[] __dna__dimensions = new int[]{
			11
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<GP_EditBrush_Data>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<GP_EditBrush_Data>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TOT_GP_EDITBRUSH_TYPES </p>
	 * @see #__DNA__FIELD__brush
	 */
	
	public void setBrush(CArrayFacade<GP_EditBrush_Data> brush) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public CPointer<Object> getPaintcursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public void setPaintcursor(CPointer<Object> paintcursor) throws IOException
	{
		long __address = ((paintcursor == null) ? 0 : paintcursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'brushtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_EditBrush_Types </p>
	 * @see #__DNA__FIELD__brushtype
	 */
	
	public int getBrushtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'brushtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_EditBrush_Types </p>
	 * @see #__DNA__FIELD__brushtype
	 */
	
	public void setBrushtype(int brushtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, brushtype);
		} else {
			__io__block.writeInt(__io__address + 92, brushtype);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_BrushEdit_SettingsFlag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eGP_BrushEdit_SettingsFlag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, flag);
		} else {
			__io__block.writeInt(__io__address + 96, flag);
		}
	}

	/**
	 * Get method for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lock drawing to one axis </p>
	 * @see #__DNA__FIELD__lock_axis
	 */
	
	public int getLock_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lock drawing to one axis </p>
	 * @see #__DNA__FIELD__lock_axis
	 */
	
	public void setLock_axis(int lock_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, lock_axis);
		} else {
			__io__block.writeInt(__io__address + 100, lock_axis);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alpha factor for selection color </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alpha factor for selection color </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, alpha);
		} else {
			__io__block.writeFloat(__io__address + 104, alpha);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GP_BrushEdit_Settings> __io__addressof() {
		return new CPointer<GP_BrushEdit_Settings>(__io__address, new Class[]{GP_BrushEdit_Settings.class}, __io__block, __io__blockTable);
	}

}
