package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UserDef_Experimental'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class UserDef_Experimental extends CFacade {

	/**
	 * This is the sdna index of the struct UserDef_Experimental.
	 * <p>
	 * It is required when allocating a new block to store data for UserDef_Experimental.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 280;

	/**
	 * Field descriptor (offset) for struct member 'use_undo_legacy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Debug options, always available. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_undo_legacy);
	 * CPointer&lt;Byte&gt; p_use_undo_legacy = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_undo_legacy'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_undo_legacy = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'no_override_auto_resync'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__no_override_auto_resync);
	 * CPointer&lt;Byte&gt; p_no_override_auto_resync = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'no_override_auto_resync'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__no_override_auto_resync = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'use_cycles_debug'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_cycles_debug);
	 * CPointer&lt;Byte&gt; p_use_cycles_debug = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_cycles_debug'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_cycles_debug = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'SANITIZE_AFTER_HERE'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__SANITIZE_AFTER_HERE);
	 * CPointer&lt;Byte&gt; p_SANITIZE_AFTER_HERE = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'SANITIZE_AFTER_HERE'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__SANITIZE_AFTER_HERE = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'use_new_hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The following options are automatically sanitized (set to 0) when the release cycle is not alpha. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_new_hair_type);
	 * CPointer&lt;Byte&gt; p_use_new_hair_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_new_hair_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_new_hair_type = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'use_new_point_cloud_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_new_point_cloud_type);
	 * CPointer&lt;Byte&gt; p_use_new_point_cloud_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_new_point_cloud_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_new_point_cloud_type = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member 'use_sculpt_vertex_colors'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_sculpt_vertex_colors);
	 * CPointer&lt;Byte&gt; p_use_sculpt_vertex_colors = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_sculpt_vertex_colors'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_sculpt_vertex_colors = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'use_sculpt_tools_tilt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_sculpt_tools_tilt);
	 * CPointer&lt;Byte&gt; p_use_sculpt_tools_tilt = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_sculpt_tools_tilt'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_sculpt_tools_tilt = new long[]{7, 7};

	/**
	 * Field descriptor (offset) for struct member 'use_asset_browser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_asset_browser);
	 * CPointer&lt;Byte&gt; p_use_asset_browser = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_asset_browser'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_asset_browser = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'use_override_templates'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD__use_override_templates);
	 * CPointer&lt;Byte&gt; p_use_override_templates = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_override_templates'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_override_templates = new long[]{9, 9};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef_Experimental userdef_experimental = ...;
	 * CPointer&lt;Object&gt; p = userdef_experimental.__dna__addressof(UserDef_Experimental.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{10, 10};

	public UserDef_Experimental(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UserDef_Experimental(UserDef_Experimental that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'use_undo_legacy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Debug options, always available. </p>
	 * @see #__DNA__FIELD__use_undo_legacy
	 */
	
	public byte getUse_undo_legacy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'use_undo_legacy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Debug options, always available. </p>
	 * @see #__DNA__FIELD__use_undo_legacy
	 */
	
	public void setUse_undo_legacy(byte use_undo_legacy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, use_undo_legacy);
		} else {
			__io__block.writeByte(__io__address + 0, use_undo_legacy);
		}
	}

	/**
	 * Get method for struct member 'no_override_auto_resync'.
	 * @see #__DNA__FIELD__no_override_auto_resync
	 */
	
	public byte getNo_override_auto_resync() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'no_override_auto_resync'.
	 * @see #__DNA__FIELD__no_override_auto_resync
	 */
	
	public void setNo_override_auto_resync(byte no_override_auto_resync) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, no_override_auto_resync);
		} else {
			__io__block.writeByte(__io__address + 1, no_override_auto_resync);
		}
	}

	/**
	 * Get method for struct member 'use_cycles_debug'.
	 * @see #__DNA__FIELD__use_cycles_debug
	 */
	
	public byte getUse_cycles_debug() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'use_cycles_debug'.
	 * @see #__DNA__FIELD__use_cycles_debug
	 */
	
	public void setUse_cycles_debug(byte use_cycles_debug) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, use_cycles_debug);
		} else {
			__io__block.writeByte(__io__address + 2, use_cycles_debug);
		}
	}

	/**
	 * Get method for struct member 'SANITIZE_AFTER_HERE'.
	 * @see #__DNA__FIELD__SANITIZE_AFTER_HERE
	 */
	
	public byte getSANITIZE_AFTER_HERE() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'SANITIZE_AFTER_HERE'.
	 * @see #__DNA__FIELD__SANITIZE_AFTER_HERE
	 */
	
	public void setSANITIZE_AFTER_HERE(byte SANITIZE_AFTER_HERE) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, SANITIZE_AFTER_HERE);
		} else {
			__io__block.writeByte(__io__address + 3, SANITIZE_AFTER_HERE);
		}
	}

	/**
	 * Get method for struct member 'use_new_hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The following options are automatically sanitized (set to 0) when the release cycle is not alpha. </p>
	 * @see #__DNA__FIELD__use_new_hair_type
	 */
	
	public byte getUse_new_hair_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'use_new_hair_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The following options are automatically sanitized (set to 0) when the release cycle is not alpha. </p>
	 * @see #__DNA__FIELD__use_new_hair_type
	 */
	
	public void setUse_new_hair_type(byte use_new_hair_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, use_new_hair_type);
		} else {
			__io__block.writeByte(__io__address + 4, use_new_hair_type);
		}
	}

	/**
	 * Get method for struct member 'use_new_point_cloud_type'.
	 * @see #__DNA__FIELD__use_new_point_cloud_type
	 */
	
	public byte getUse_new_point_cloud_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'use_new_point_cloud_type'.
	 * @see #__DNA__FIELD__use_new_point_cloud_type
	 */
	
	public void setUse_new_point_cloud_type(byte use_new_point_cloud_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, use_new_point_cloud_type);
		} else {
			__io__block.writeByte(__io__address + 5, use_new_point_cloud_type);
		}
	}

	/**
	 * Get method for struct member 'use_sculpt_vertex_colors'.
	 * @see #__DNA__FIELD__use_sculpt_vertex_colors
	 */
	
	public byte getUse_sculpt_vertex_colors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 6);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'use_sculpt_vertex_colors'.
	 * @see #__DNA__FIELD__use_sculpt_vertex_colors
	 */
	
	public void setUse_sculpt_vertex_colors(byte use_sculpt_vertex_colors) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 6, use_sculpt_vertex_colors);
		} else {
			__io__block.writeByte(__io__address + 6, use_sculpt_vertex_colors);
		}
	}

	/**
	 * Get method for struct member 'use_sculpt_tools_tilt'.
	 * @see #__DNA__FIELD__use_sculpt_tools_tilt
	 */
	
	public byte getUse_sculpt_tools_tilt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 7);
		} else {
			return __io__block.readByte(__io__address + 7);
		}
	}

	/**
	 * Set method for struct member 'use_sculpt_tools_tilt'.
	 * @see #__DNA__FIELD__use_sculpt_tools_tilt
	 */
	
	public void setUse_sculpt_tools_tilt(byte use_sculpt_tools_tilt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 7, use_sculpt_tools_tilt);
		} else {
			__io__block.writeByte(__io__address + 7, use_sculpt_tools_tilt);
		}
	}

	/**
	 * Get method for struct member 'use_asset_browser'.
	 * @see #__DNA__FIELD__use_asset_browser
	 */
	
	public byte getUse_asset_browser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'use_asset_browser'.
	 * @see #__DNA__FIELD__use_asset_browser
	 */
	
	public void setUse_asset_browser(byte use_asset_browser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, use_asset_browser);
		} else {
			__io__block.writeByte(__io__address + 8, use_asset_browser);
		}
	}

	/**
	 * Get method for struct member 'use_override_templates'.
	 * @see #__DNA__FIELD__use_override_templates
	 */
	
	public byte getUse_override_templates() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'use_override_templates'.
	 * @see #__DNA__FIELD__use_override_templates
	 */
	
	public void setUse_override_templates(byte use_override_templates) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, use_override_templates);
		} else {
			__io__block.writeByte(__io__address + 9, use_override_templates);
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
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
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
	public CPointer<UserDef_Experimental> __io__addressof() {
		return new CPointer<UserDef_Experimental>(__io__address, new Class[]{UserDef_Experimental.class}, __io__block, __io__blockTable);
	}

}
