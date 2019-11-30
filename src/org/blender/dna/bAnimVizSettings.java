package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
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

@CMetaData(size32=32, size64=32)
public class bAnimVizSettings extends CFacade {

	/**
	 * This is the sdna index of the struct bAnimVizSettings.
	 * <p>
	 * It is required when allocating a new block to store data for bAnimVizSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 314;

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  {@link eAnimViz_RecalcFlags} . </p>
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
	public static final long[] __DNA__FIELD__recalc = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  {@link eMotionPath_Types} . </p>
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
	public static final long[] __DNA__FIELD__path_type = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames between points indicated on the paths. </p>
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
	public static final long[] __DNA__FIELD__path_step = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_ViewFlag} . </p>
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
	public static final long[] __DNA__FIELD__path_viewflag = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_BakeFlag} . </p>
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
	public static final long[] __DNA__FIELD__path_bakeflag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAnimVizSettings banimvizsettings = ...;
	 * CPointer&lt;Object&gt; p = banimvizsettings.__dna__addressof(bAnimVizSettings.__DNA__FIELD___pad);
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

	/**
	 * Field descriptor (offset) for struct member 'path_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start and end frames of path-calculation range. </p>
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
	public static final long[] __DNA__FIELD__path_sf = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'path_ef'.
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
	public static final long[] __DNA__FIELD__path_ef = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'path_bc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames before/after current frame to show. </p>
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
	public static final long[] __DNA__FIELD__path_bc = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'path_ac'.
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
	public static final long[] __DNA__FIELD__path_ac = new long[]{28, 28};

	public bAnimVizSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bAnimVizSettings(bAnimVizSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  {@link eAnimViz_RecalcFlags} . </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public short getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General Settings ------------------<mdash/><mdash/>  {@link eAnimViz_RecalcFlags} . </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(short recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, recalc);
		} else {
			__io__block.writeShort(__io__address + 0, recalc);
		}
	}

	/**
	 * Get method for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  {@link eMotionPath_Types} . </p>
	 * @see #__DNA__FIELD__path_type
	 */
	
	public short getPath_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'path_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Motion {@link Path}  Settings -------------<mdash/><mdash/>  {@link eMotionPath_Types} . </p>
	 * @see #__DNA__FIELD__path_type
	 */
	
	public void setPath_type(short path_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, path_type);
		} else {
			__io__block.writeShort(__io__address + 2, path_type);
		}
	}

	/**
	 * Get method for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames between points indicated on the paths. </p>
	 * @see #__DNA__FIELD__path_step
	 */
	
	public short getPath_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'path_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames between points indicated on the paths. </p>
	 * @see #__DNA__FIELD__path_step
	 */
	
	public void setPath_step(short path_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, path_step);
		} else {
			__io__block.writeShort(__io__address + 4, path_step);
		}
	}

	/**
	 * Get method for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_ViewFlag} . </p>
	 * @see #__DNA__FIELD__path_viewflag
	 */
	
	public short getPath_viewflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'path_viewflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_ViewFlag} . </p>
	 * @see #__DNA__FIELD__path_viewflag
	 */
	
	public void setPath_viewflag(short path_viewflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, path_viewflag);
		} else {
			__io__block.writeShort(__io__address + 6, path_viewflag);
		}
	}

	/**
	 * Get method for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_BakeFlag} . </p>
	 * @see #__DNA__FIELD__path_bakeflag
	 */
	
	public short getPath_bakeflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'path_bakeflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eMotionPaths_BakeFlag} . </p>
	 * @see #__DNA__FIELD__path_bakeflag
	 */
	
	public void setPath_bakeflag(short path_bakeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, path_bakeflag);
		} else {
			__io__block.writeShort(__io__address + 8, path_bakeflag);
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
	 * Get method for struct member 'path_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start and end frames of path-calculation range. </p>
	 * @see #__DNA__FIELD__path_sf
	 */
	
	public int getPath_sf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'path_sf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start and end frames of path-calculation range. </p>
	 * @see #__DNA__FIELD__path_sf
	 */
	
	public void setPath_sf(int path_sf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, path_sf);
		} else {
			__io__block.writeInt(__io__address + 16, path_sf);
		}
	}

	/**
	 * Get method for struct member 'path_ef'.
	 * @see #__DNA__FIELD__path_ef
	 */
	
	public int getPath_ef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'path_ef'.
	 * @see #__DNA__FIELD__path_ef
	 */
	
	public void setPath_ef(int path_ef) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, path_ef);
		} else {
			__io__block.writeInt(__io__address + 20, path_ef);
		}
	}

	/**
	 * Get method for struct member 'path_bc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames before/after current frame to show. </p>
	 * @see #__DNA__FIELD__path_bc
	 */
	
	public int getPath_bc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'path_bc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames before/after current frame to show. </p>
	 * @see #__DNA__FIELD__path_bc
	 */
	
	public void setPath_bc(int path_bc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, path_bc);
		} else {
			__io__block.writeInt(__io__address + 24, path_bc);
		}
	}

	/**
	 * Get method for struct member 'path_ac'.
	 * @see #__DNA__FIELD__path_ac
	 */
	
	public int getPath_ac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'path_ac'.
	 * @see #__DNA__FIELD__path_ac
	 */
	
	public void setPath_ac(int path_ac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, path_ac);
		} else {
			__io__block.writeInt(__io__address + 28, path_ac);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bAnimVizSettings> __io__addressof() {
		return new CPointer<bAnimVizSettings>(__io__address, new Class[]{bAnimVizSettings.class}, __io__block, __io__blockTable);
	}

}
