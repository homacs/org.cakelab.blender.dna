package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bAnimVizSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Visualization General ------------------<mdash/><mdash/><mdash/>  for Objects or Poses (but NOT PoseChannels) Animation Visualization Settings (avs) </p>
 */

@CMetaData(size32=48, size64=48)
public class bAnimVizSettings extends CFacade {

	/**
	 * This is the sdna index of the struct bAnimVizSettings.
	 * <p>
	 * It is required when allocating a new block to store data for bAnimVizSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 342;

	/**
	 * Field descriptor (offset) for struct member 'ghost_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion-Skinning Settings --------------<mdash/>  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_sf);
	 * CPointer&lt;Integer&gt; p_ghost_sf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_sf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_sf = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ghost_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range (only used for GHOST_TYPE_RANGE) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_ef);
	 * CPointer&lt;Integer&gt; p_ghost_ef = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_ef'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_ef = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'ghost_bc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_bc);
	 * CPointer&lt;Integer&gt; p_ghost_bc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_bc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_bc = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'ghost_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_ac);
	 * CPointer&lt;Integer&gt; p_ghost_ac = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_ac'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_ac = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'ghost_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Types </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_type);
	 * CPointer&lt;Short&gt; p_ghost_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_type = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'ghost_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between each ghost shown (not for GHOST_TYPE_KEYS) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_step);
	 * CPointer&lt;Short&gt; p_ghost_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_step = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'ghost_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__ghost_flag);
	 * CPointer&lt;Short&gt; p_ghost_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghost_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghost_flag = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  eAnimViz_RecalcFlags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__recalc);
	 * CPointer&lt;Short&gt; p_recalc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  eMotionPath_Types </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_type);
	 * CPointer&lt;Short&gt; p_path_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_type = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between points indicated on the paths </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_step);
	 * CPointer&lt;Short&gt; p_path_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_step = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_ViewFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_viewflag);
	 * CPointer&lt;Short&gt; p_path_viewflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_viewflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_viewflag = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_BakeFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_bakeflag);
	 * CPointer&lt;Short&gt; p_path_bakeflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_bakeflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_bakeflag = new long[]{30, 30};

	/**
	 * Field descriptor (offset) for struct member 'path_sf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_sf);
	 * CPointer&lt;Integer&gt; p_path_sf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_sf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_sf = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'path_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_ef);
	 * CPointer&lt;Integer&gt; p_path_ef = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_ef'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_ef = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'path_bc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_bc);
	 * CPointer&lt;Integer&gt; p_path_bc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_bc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_bc = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'path_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD__path_ac);
	 * CPointer&lt;Integer&gt; p_path_ac = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_ac'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_ac = new long[]{44, 44};

	public bAnimVizSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bAnimVizSettings(bAnimVizSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ghost_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion-Skinning Settings --------------<mdash/>  </p>
	 * @see #__DNA__FIELD__ghost_sf
	 */
	
	public int getGhost_sf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'ghost_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion-Skinning Settings --------------<mdash/>  </p>
	 * @see #__DNA__FIELD__ghost_sf
	 */
	
	public void setGhost_sf(int ghost_sf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, ghost_sf);
		} else {
			__io__block.writeInt(__io__address + 0, ghost_sf);
		}
	}

	/**
	 * Get method for struct member 'ghost_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range (only used for GHOST_TYPE_RANGE) </p>
	 * @see #__DNA__FIELD__ghost_ef
	 */
	
	public int getGhost_ef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'ghost_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of ghost-drawing range (only used for GHOST_TYPE_RANGE) </p>
	 * @see #__DNA__FIELD__ghost_ef
	 */
	
	public void setGhost_ef(int ghost_ef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, ghost_ef);
		} else {
			__io__block.writeInt(__io__address + 4, ghost_ef);
		}
	}

	/**
	 * Get method for struct member 'ghost_bc'.
	 * @see #__DNA__FIELD__ghost_bc
	 */
	
	public int getGhost_bc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'ghost_bc'.
	 * @see #__DNA__FIELD__ghost_bc
	 */
	
	public void setGhost_bc(int ghost_bc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, ghost_bc);
		} else {
			__io__block.writeInt(__io__address + 8, ghost_bc);
		}
	}

	/**
	 * Get method for struct member 'ghost_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * @see #__DNA__FIELD__ghost_ac
	 */
	
	public int getGhost_ac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'ghost_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * @see #__DNA__FIELD__ghost_ac
	 */
	
	public void setGhost_ac(int ghost_ac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, ghost_ac);
		} else {
			__io__block.writeInt(__io__address + 12, ghost_ac);
		}
	}

	/**
	 * Get method for struct member 'ghost_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Types </p>
	 * @see #__DNA__FIELD__ghost_type
	 */
	
	public short getGhost_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'ghost_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Types </p>
	 * @see #__DNA__FIELD__ghost_type
	 */
	
	public void setGhost_type(short ghost_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, ghost_type);
		} else {
			__io__block.writeShort(__io__address + 16, ghost_type);
		}
	}

	/**
	 * Get method for struct member 'ghost_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between each ghost shown (not for GHOST_TYPE_KEYS) </p>
	 * @see #__DNA__FIELD__ghost_step
	 */
	
	public short getGhost_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'ghost_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between each ghost shown (not for GHOST_TYPE_KEYS) </p>
	 * @see #__DNA__FIELD__ghost_step
	 */
	
	public void setGhost_step(short ghost_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, ghost_step);
		} else {
			__io__block.writeShort(__io__address + 18, ghost_step);
		}
	}

	/**
	 * Get method for struct member 'ghost_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Flag </p>
	 * @see #__DNA__FIELD__ghost_flag
	 */
	
	public short getGhost_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'ghost_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eOnionSkin_Flag </p>
	 * @see #__DNA__FIELD__ghost_flag
	 */
	
	public void setGhost_flag(short ghost_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, ghost_flag);
		} else {
			__io__block.writeShort(__io__address + 20, ghost_flag);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  eAnimViz_RecalcFlags </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public short getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  eAnimViz_RecalcFlags </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(short recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, recalc);
		} else {
			__io__block.writeShort(__io__address + 22, recalc);
		}
	}

	/**
	 * Get method for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  eMotionPath_Types </p>
	 * @see #__DNA__FIELD__path_type
	 */
	
	public short getPath_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  eMotionPath_Types </p>
	 * @see #__DNA__FIELD__path_type
	 */
	
	public void setPath_type(short path_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, path_type);
		} else {
			__io__block.writeShort(__io__address + 24, path_type);
		}
	}

	/**
	 * Get method for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between points indicated on the paths </p>
	 * @see #__DNA__FIELD__path_step
	 */
	
	public short getPath_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames between points indicated on the paths </p>
	 * @see #__DNA__FIELD__path_step
	 */
	
	public void setPath_step(short path_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, path_step);
		} else {
			__io__block.writeShort(__io__address + 26, path_step);
		}
	}

	/**
	 * Get method for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_ViewFlag </p>
	 * @see #__DNA__FIELD__path_viewflag
	 */
	
	public short getPath_viewflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_ViewFlag </p>
	 * @see #__DNA__FIELD__path_viewflag
	 */
	
	public void setPath_viewflag(short path_viewflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, path_viewflag);
		} else {
			__io__block.writeShort(__io__address + 28, path_viewflag);
		}
	}

	/**
	 * Get method for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_BakeFlag </p>
	 * @see #__DNA__FIELD__path_bakeflag
	 */
	
	public short getPath_bakeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMotionPaths_BakeFlag </p>
	 * @see #__DNA__FIELD__path_bakeflag
	 */
	
	public void setPath_bakeflag(short path_bakeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, path_bakeflag);
		} else {
			__io__block.writeShort(__io__address + 30, path_bakeflag);
		}
	}

	/**
	 * Get method for struct member 'path_sf'.
	 * @see #__DNA__FIELD__path_sf
	 */
	
	public int getPath_sf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'path_sf'.
	 * @see #__DNA__FIELD__path_sf
	 */
	
	public void setPath_sf(int path_sf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, path_sf);
		} else {
			__io__block.writeInt(__io__address + 32, path_sf);
		}
	}

	/**
	 * Get method for struct member 'path_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range </p>
	 * @see #__DNA__FIELD__path_ef
	 */
	
	public int getPath_ef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'path_ef'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> start and end frames of path-calculation range </p>
	 * @see #__DNA__FIELD__path_ef
	 */
	
	public void setPath_ef(int path_ef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, path_ef);
		} else {
			__io__block.writeInt(__io__address + 36, path_ef);
		}
	}

	/**
	 * Get method for struct member 'path_bc'.
	 * @see #__DNA__FIELD__path_bc
	 */
	
	public int getPath_bc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'path_bc'.
	 * @see #__DNA__FIELD__path_bc
	 */
	
	public void setPath_bc(int path_bc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, path_bc);
		} else {
			__io__block.writeInt(__io__address + 40, path_bc);
		}
	}

	/**
	 * Get method for struct member 'path_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * @see #__DNA__FIELD__path_ac
	 */
	
	public int getPath_ac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'path_ac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frames before/after current frame to show </p>
	 * @see #__DNA__FIELD__path_ac
	 */
	
	public void setPath_ac(int path_ac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, path_ac);
		} else {
			__io__block.writeInt(__io__address + 44, path_ac);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bAnimVizSettings> __io__addressof() {
		return new CPointer<bAnimVizSettings>(__io__address, new Class[]{bAnimVizSettings.class}, __io__block, __io__blockTable);
	}

}
