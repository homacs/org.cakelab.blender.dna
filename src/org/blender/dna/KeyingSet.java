package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'KeyingSet'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 * </p><p>{@link KeyingSet}  definition (ks)</p><p> A {@link KeyingSet}  defines a group of properties that should be keyframed together, providing a convenient way for animators to insert keyframes without resorting to Auto-Keyframing.</p><p> A few 'generic' (non-absolute and dependent on templates) KeyingSets are defined 'built-in' to facilitate easy animating for the casual animator without the need to add extra steps to the rigging process. </p>
 */

@CMetaData(size32=464, size64=480)
public class KeyingSet extends CFacade {

	/**
	 * This is the sdna index of the struct KeyingSet.
	 * <p>
	 * It is required when allocating a new block to store data for KeyingSet.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 531;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;KeyingSet&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, KeyingSet.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'KeyingSet*'</li>
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
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;KeyingSet&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, KeyingSet.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'KeyingSet*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Keying Set Paths to define settings that get keyframed together<h4>Blender Source Code:</h4>
	 * <p> ({@link KS_Path} ) paths to keyframe to. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__paths);
	 * CPointer&lt;ListBase&gt; p_paths = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paths'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paths = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique name (for search, etc.) - MAX_ID_NAME-2 . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-viewable name for {@link KeyingSet}  (for menus, etc.) - MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (RNA_DYN_DESCR_MAX) short help text. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__description);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_description = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'description'</li>
	 * <li>Signature: 'char[240]'</li>
	 * <li>Actual Size (32bit/64bit): 240/240</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__description = new long[]{144, 160};

	/**
	 * Field descriptor (offset) for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the typeinfo data used for the relative paths - MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__typeinfo);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_typeinfo = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeinfo'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeinfo = new long[]{384, 400};

	/**
	 * Field descriptor (offset) for struct member 'active_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active path. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__active_path);
	 * CPointer&lt;Integer&gt; p_active_path = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_path'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_path = new long[]{448, 464};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for {@link KeyingSet} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{452, 468};

	/**
	 * Field descriptor (offset) for struct member 'keyingflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) settings to supply insertkey() with. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__keyingflag);
	 * CPointer&lt;Short&gt; p_keyingflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyingflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyingflag = new long[]{454, 470};

	/**
	 * Field descriptor (offset) for struct member 'keyingoverride'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) for each flag set, the relevant keyingflag bit overrides the default. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD__keyingoverride);
	 * CPointer&lt;Short&gt; p_keyingoverride = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyingoverride'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyingoverride = new long[]{456, 472};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyingSet keyingset = ...;
	 * CPointer&lt;Object&gt; p = keyingset.__dna__addressof(KeyingSet.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{458, 474};

	public KeyingSet(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected KeyingSet(KeyingSet that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<KeyingSet> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{KeyingSet.class};
		return new CPointer<KeyingSet>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, KeyingSet.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<KeyingSet> next) throws IOException
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
	
	public CPointer<KeyingSet> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{KeyingSet.class};
		return new CPointer<KeyingSet>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, KeyingSet.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<KeyingSet> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Keying Set Paths to define settings that get keyframed together<h4>Blender Source Code:</h4>
	 * <p> ({@link KS_Path} ) paths to keyframe to. </p>
	 * @see #__DNA__FIELD__paths
	 */
	
	public ListBase getPaths() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Keying Set Paths to define settings that get keyframed together<h4>Blender Source Code:</h4>
	 * <p> ({@link KS_Path} ) paths to keyframe to. </p>
	 * @see #__DNA__FIELD__paths
	 */
	
	public void setPaths(ListBase paths) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(paths, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paths)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paths);
		} else {
			__io__generic__copy( getPaths(), paths);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique name (for search, etc.) - MAX_ID_NAME-2 . </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
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
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique name (for search, etc.) - MAX_ID_NAME-2 . </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname);
		} else {
			__io__generic__copy( getIdname(), idname);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-viewable name for {@link KeyingSet}  (for menus, etc.) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-viewable name for {@link KeyingSet}  (for menus, etc.) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 80;
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
	 * Get method for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (RNA_DYN_DESCR_MAX) short help text. </p>
	 * @see #__DNA__FIELD__description
	 */
	
	public CArrayFacade<Byte> getDescription() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			240
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (RNA_DYN_DESCR_MAX) short help text. </p>
	 * @see #__DNA__FIELD__description
	 */
	
	public void setDescription(CArrayFacade<Byte> description) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(description, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, description)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, description);
		} else {
			__io__generic__copy( getDescription(), description);
		}
	}

	/**
	 * Get method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the typeinfo data used for the relative paths - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public CArrayFacade<Byte> getTypeinfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'typeinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the typeinfo data used for the relative paths - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__typeinfo
	 */
	
	public void setTypeinfo(CArrayFacade<Byte> typeinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 384;
		}
		if (__io__equals(typeinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, typeinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, typeinfo);
		} else {
			__io__generic__copy( getTypeinfo(), typeinfo);
		}
	}

	/**
	 * Get method for struct member 'active_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active path. </p>
	 * @see #__DNA__FIELD__active_path
	 */
	
	public int getActive_path() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 464);
		} else {
			return __io__block.readInt(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'active_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of the active path. </p>
	 * @see #__DNA__FIELD__active_path
	 */
	
	public void setActive_path(int active_path) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 464, active_path);
		} else {
			__io__block.writeInt(__io__address + 448, active_path);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for {@link KeyingSet} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 468);
		} else {
			return __io__block.readShort(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for {@link KeyingSet} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 468, flag);
		} else {
			__io__block.writeShort(__io__address + 452, flag);
		}
	}

	/**
	 * Get method for struct member 'keyingflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) settings to supply insertkey() with. </p>
	 * @see #__DNA__FIELD__keyingflag
	 */
	
	public short getKeyingflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 470);
		} else {
			return __io__block.readShort(__io__address + 454);
		}
	}

	/**
	 * Set method for struct member 'keyingflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) settings to supply insertkey() with. </p>
	 * @see #__DNA__FIELD__keyingflag
	 */
	
	public void setKeyingflag(short keyingflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 470, keyingflag);
		} else {
			__io__block.writeShort(__io__address + 454, keyingflag);
		}
	}

	/**
	 * Get method for struct member 'keyingoverride'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) for each flag set, the relevant keyingflag bit overrides the default. </p>
	 * @see #__DNA__FIELD__keyingoverride
	 */
	
	public short getKeyingoverride() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 472);
		} else {
			return __io__block.readShort(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'keyingoverride'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eInsertKeyFlags) for each flag set, the relevant keyingflag bit overrides the default. </p>
	 * @see #__DNA__FIELD__keyingoverride
	 */
	
	public void setKeyingoverride(short keyingoverride) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 472, keyingoverride);
		} else {
			__io__block.writeShort(__io__address + 456, keyingoverride);
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
			return new CArrayFacade<Byte>(__io__address + 474, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 458, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 474;
		} else {
			__dna__offset = 458;
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
	public CPointer<KeyingSet> __io__addressof() {
		return new CPointer<KeyingSet>(__io__address, new Class[]{KeyingSet.class}, __io__block, __io__blockTable);
	}

}
