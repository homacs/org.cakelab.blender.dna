package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bAction'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Actions --------------------------------<mdash/><mdash/>  Action - reusable F-Curve 'bag' (act)</p><p> This contains F-Curves that may affect settings from more than one {@link ID}  blocktype and/or datablock (i.e. sub-data linked/used directly to the {@link ID}  block that the animation data is linked to), but with the restriction that the other unrelated data (i.e. data that is not directly used or linked to by the source {@link ID}  block).</p><p> It serves as a 'unit' of reusable animation information (i.e. keyframes/motion data), that affects a group of related settings (as defined by the user). </p>
 */

@CMetaData(size32=168, size64=232)
public class bAction extends CFacade {

	/**
	 * This is the sdna index of the struct bAction.
	 * <p>
	 * It is required when allocating a new block to store data for bAction.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 321;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -serialisation for relinking. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'curves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Function-curves ({@link FCurve} ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__curves);
	 * CPointer&lt;ListBase&gt; p_curves = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curves'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curves = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy data - Action Channels ({@link bActionChannel} ) in pre-2.5 animation system. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__chanbase);
	 * CPointer&lt;ListBase&gt; p_chanbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chanbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chanbase = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Groups of function-curves ({@link bActionGroup} ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__groups);
	 * CPointer&lt;ListBase&gt; p_groups = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'groups'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__groups = new long[]{136, 184};

	/**
	 * Field descriptor (offset) for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Markers local to the Action (used to provide Pose-Libraries). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__markers);
	 * CPointer&lt;ListBase&gt; p_markers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markers = new long[]{144, 200};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{152, 216};

	/**
	 * Field descriptor (offset) for struct member 'active_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active marker. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__active_marker);
	 * CPointer&lt;Integer&gt; p_active_marker = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_marker'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_marker = new long[]{156, 220};

	/**
	 * Field descriptor (offset) for struct member 'idroot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-blocks that action can be assigned to (if 0, will be set to whatever {@link ID}  first evaluates it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD__idroot);
	 * CPointer&lt;Integer&gt; p_idroot = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idroot'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idroot = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bAction baction = ...;
	 * CPointer&lt;Object&gt; p = baction.__dna__addressof(bAction.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{164, 228};

	public bAction(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bAction(bAction that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -serialisation for relinking. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -serialisation for relinking. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'curves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Function-curves ({@link FCurve} ). </p>
	 * @see #__DNA__FIELD__curves
	 */
	
	public ListBase getCurves() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Function-curves ({@link FCurve} ). </p>
	 * @see #__DNA__FIELD__curves
	 */
	
	public void setCurves(ListBase curves) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(curves, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curves)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curves);
		} else {
			__io__generic__copy( getCurves(), curves);
		}
	}

	/**
	 * Get method for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy data - Action Channels ({@link bActionChannel} ) in pre-2.5 animation system. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__chanbase
	 */
	
	public ListBase getChanbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'chanbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy data - Action Channels ({@link bActionChannel} ) in pre-2.5 animation system. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__chanbase
	 */
	
	public void setChanbase(ListBase chanbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(chanbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, chanbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, chanbase);
		} else {
			__io__generic__copy( getChanbase(), chanbase);
		}
	}

	/**
	 * Get method for struct member 'groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Groups of function-curves ({@link bActionGroup} ). </p>
	 * @see #__DNA__FIELD__groups
	 */
	
	public ListBase getGroups() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'groups'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Groups of function-curves ({@link bActionGroup} ). </p>
	 * @see #__DNA__FIELD__groups
	 */
	
	public void setGroups(ListBase groups) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(groups, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, groups)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, groups);
		} else {
			__io__generic__copy( getGroups(), groups);
		}
	}

	/**
	 * Get method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Markers local to the Action (used to provide Pose-Libraries). </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public ListBase getMarkers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Markers local to the Action (used to provide Pose-Libraries). </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public void setMarkers(ListBase markers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(markers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, markers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, markers);
		} else {
			__io__generic__copy( getMarkers(), markers);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, flag);
		} else {
			__io__block.writeInt(__io__address + 152, flag);
		}
	}

	/**
	 * Get method for struct member 'active_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active marker. </p>
	 * @see #__DNA__FIELD__active_marker
	 */
	
	public int getActive_marker() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'active_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active marker. </p>
	 * @see #__DNA__FIELD__active_marker
	 */
	
	public void setActive_marker(int active_marker) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, active_marker);
		} else {
			__io__block.writeInt(__io__address + 156, active_marker);
		}
	}

	/**
	 * Get method for struct member 'idroot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-blocks that action can be assigned to (if 0, will be set to whatever {@link ID}  first evaluates it). </p>
	 * @see #__DNA__FIELD__idroot
	 */
	
	public int getIdroot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'idroot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of ID-blocks that action can be assigned to (if 0, will be set to whatever {@link ID}  first evaluates it). </p>
	 * @see #__DNA__FIELD__idroot
	 */
	
	public void setIdroot(int idroot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, idroot);
		} else {
			__io__block.writeInt(__io__address + 160, idroot);
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
			return new CArrayFacade<Byte>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 228;
		} else {
			__dna__offset = 164;
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
	public CPointer<bAction> __io__addressof() {
		return new CPointer<bAction>(__io__address, new Class[]{bAction.class}, __io__block, __io__blockTable);
	}

}
