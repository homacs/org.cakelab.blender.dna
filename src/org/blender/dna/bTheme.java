package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bTheme'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> A theme </p>
 */

@CMetaData(size32=14200, size64=14208)
public class bTheme extends CFacade {

	/**
	 * This is the sdna index of the struct bTheme.
	 * <p>
	 * It is required when allocating a new block to store data for bTheme.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 249;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bTheme&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bTheme.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bTheme*'</li>
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
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bTheme&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bTheme.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bTheme*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[32]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'tui'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tui);
	 * CPointer&lt;ThemeUI&gt; p_tui = p.cast(new Class[]{ThemeUI.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tui'</li>
	 * <li>Signature: 'ThemeUI'</li>
	 * <li>Actual Size (32bit/64bit): 912/912</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tui = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'tbuts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Individual Spacetypes note: ensure UI_THEMESPACE_END is updated when adding </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tbuts);
	 * CPointer&lt;ThemeSpace&gt; p_tbuts = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tbuts'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tbuts = new long[]{952, 960};

	/**
	 * Field descriptor (offset) for struct member 'tv3d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tv3d);
	 * CPointer&lt;ThemeSpace&gt; p_tv3d = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tv3d'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tv3d = new long[]{1712, 1720};

	/**
	 * Field descriptor (offset) for struct member 'tfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tfile);
	 * CPointer&lt;ThemeSpace&gt; p_tfile = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tfile'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tfile = new long[]{2472, 2480};

	/**
	 * Field descriptor (offset) for struct member 'tipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tipo);
	 * CPointer&lt;ThemeSpace&gt; p_tipo = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tipo'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tipo = new long[]{3232, 3240};

	/**
	 * Field descriptor (offset) for struct member 'tinfo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tinfo);
	 * CPointer&lt;ThemeSpace&gt; p_tinfo = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tinfo'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tinfo = new long[]{3992, 4000};

	/**
	 * Field descriptor (offset) for struct member 'tact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tact);
	 * CPointer&lt;ThemeSpace&gt; p_tact = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tact'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tact = new long[]{4752, 4760};

	/**
	 * Field descriptor (offset) for struct member 'tnla'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tnla);
	 * CPointer&lt;ThemeSpace&gt; p_tnla = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tnla'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnla = new long[]{5512, 5520};

	/**
	 * Field descriptor (offset) for struct member 'tseq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tseq);
	 * CPointer&lt;ThemeSpace&gt; p_tseq = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tseq'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tseq = new long[]{6272, 6280};

	/**
	 * Field descriptor (offset) for struct member 'tima'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tima);
	 * CPointer&lt;ThemeSpace&gt; p_tima = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tima'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tima = new long[]{7032, 7040};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__text);
	 * CPointer&lt;ThemeSpace&gt; p_text = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{7792, 7800};

	/**
	 * Field descriptor (offset) for struct member 'toops'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__toops);
	 * CPointer&lt;ThemeSpace&gt; p_toops = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toops'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toops = new long[]{8552, 8560};

	/**
	 * Field descriptor (offset) for struct member 'ttime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__ttime);
	 * CPointer&lt;ThemeSpace&gt; p_ttime = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ttime'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ttime = new long[]{9312, 9320};

	/**
	 * Field descriptor (offset) for struct member 'tnode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tnode);
	 * CPointer&lt;ThemeSpace&gt; p_tnode = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tnode'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnode = new long[]{10072, 10080};

	/**
	 * Field descriptor (offset) for struct member 'tlogic'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tlogic);
	 * CPointer&lt;ThemeSpace&gt; p_tlogic = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tlogic'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tlogic = new long[]{10832, 10840};

	/**
	 * Field descriptor (offset) for struct member 'tuserpref'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tuserpref);
	 * CPointer&lt;ThemeSpace&gt; p_tuserpref = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tuserpref'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tuserpref = new long[]{11592, 11600};

	/**
	 * Field descriptor (offset) for struct member 'tconsole'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tconsole);
	 * CPointer&lt;ThemeSpace&gt; p_tconsole = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tconsole'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tconsole = new long[]{12352, 12360};

	/**
	 * Field descriptor (offset) for struct member 'tclip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tclip);
	 * CPointer&lt;ThemeSpace&gt; p_tclip = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tclip'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 760/760</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tclip = new long[]{13112, 13120};

	/**
	 * Field descriptor (offset) for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tarm);
	 * CPointer&lt;CArrayFacade&lt;ThemeWireColor&gt;&gt; p_tarm = p.cast(new Class[]{CArrayFacade.class, ThemeWireColor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tarm'</li>
	 * <li>Signature: 'ThemeWireColor[20]'</li>
	 * <li>Actual Size (32bit/64bit): 320/320</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tarm = new long[]{13872, 13880};

	/**
	 * Field descriptor (offset) for struct member 'active_theme_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ThemeWireColor}  tobj[20]; </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__active_theme_area);
	 * CPointer&lt;Integer&gt; p_active_theme_area = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_theme_area'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_theme_area = new long[]{14192, 14200};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{14196, 14204};

	public bTheme(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bTheme(bTheme that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bTheme> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bTheme.class};
		return new CPointer<bTheme>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bTheme.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bTheme> next) throws IOException
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
	
	public CPointer<bTheme> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bTheme.class};
		return new CPointer<bTheme>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bTheme.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bTheme> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'tui'.
	 * @see #__DNA__FIELD__tui
	 */
	
	public ThemeUI getTui() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeUI(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ThemeUI(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tui'.
	 * @see #__DNA__FIELD__tui
	 */
	
	public void setTui(ThemeUI tui) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(tui, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tui)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tui);
		} else {
			__io__generic__copy( getTui(), tui);
		}
	}

	/**
	 * Get method for struct member 'tbuts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Individual Spacetypes note: ensure UI_THEMESPACE_END is updated when adding </p>
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public ThemeSpace getTbuts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 960, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 952, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tbuts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Individual Spacetypes note: ensure UI_THEMESPACE_END is updated when adding </p>
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public void setTbuts(ThemeSpace tbuts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 960;
		} else {
			__dna__offset = 952;
		}
		if (__io__equals(tbuts, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tbuts)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tbuts);
		} else {
			__io__generic__copy( getTbuts(), tbuts);
		}
	}

	/**
	 * Get method for struct member 'tv3d'.
	 * @see #__DNA__FIELD__tv3d
	 */
	
	public ThemeSpace getTv3d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 1720, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 1712, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tv3d'.
	 * @see #__DNA__FIELD__tv3d
	 */
	
	public void setTv3d(ThemeSpace tv3d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1720;
		} else {
			__dna__offset = 1712;
		}
		if (__io__equals(tv3d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tv3d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tv3d);
		} else {
			__io__generic__copy( getTv3d(), tv3d);
		}
	}

	/**
	 * Get method for struct member 'tfile'.
	 * @see #__DNA__FIELD__tfile
	 */
	
	public ThemeSpace getTfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 2480, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 2472, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tfile'.
	 * @see #__DNA__FIELD__tfile
	 */
	
	public void setTfile(ThemeSpace tfile) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2480;
		} else {
			__dna__offset = 2472;
		}
		if (__io__equals(tfile, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tfile)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tfile);
		} else {
			__io__generic__copy( getTfile(), tfile);
		}
	}

	/**
	 * Get method for struct member 'tipo'.
	 * @see #__DNA__FIELD__tipo
	 */
	
	public ThemeSpace getTipo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 3240, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 3232, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tipo'.
	 * @see #__DNA__FIELD__tipo
	 */
	
	public void setTipo(ThemeSpace tipo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3240;
		} else {
			__dna__offset = 3232;
		}
		if (__io__equals(tipo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tipo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tipo);
		} else {
			__io__generic__copy( getTipo(), tipo);
		}
	}

	/**
	 * Get method for struct member 'tinfo'.
	 * @see #__DNA__FIELD__tinfo
	 */
	
	public ThemeSpace getTinfo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 4000, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 3992, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tinfo'.
	 * @see #__DNA__FIELD__tinfo
	 */
	
	public void setTinfo(ThemeSpace tinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4000;
		} else {
			__dna__offset = 3992;
		}
		if (__io__equals(tinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tinfo);
		} else {
			__io__generic__copy( getTinfo(), tinfo);
		}
	}

	/**
	 * Get method for struct member 'tact'.
	 * @see #__DNA__FIELD__tact
	 */
	
	public ThemeSpace getTact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 4760, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 4752, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tact'.
	 * @see #__DNA__FIELD__tact
	 */
	
	public void setTact(ThemeSpace tact) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4760;
		} else {
			__dna__offset = 4752;
		}
		if (__io__equals(tact, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tact)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tact);
		} else {
			__io__generic__copy( getTact(), tact);
		}
	}

	/**
	 * Get method for struct member 'tnla'.
	 * @see #__DNA__FIELD__tnla
	 */
	
	public ThemeSpace getTnla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 5520, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 5512, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tnla'.
	 * @see #__DNA__FIELD__tnla
	 */
	
	public void setTnla(ThemeSpace tnla) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5520;
		} else {
			__dna__offset = 5512;
		}
		if (__io__equals(tnla, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tnla)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tnla);
		} else {
			__io__generic__copy( getTnla(), tnla);
		}
	}

	/**
	 * Get method for struct member 'tseq'.
	 * @see #__DNA__FIELD__tseq
	 */
	
	public ThemeSpace getTseq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 6280, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 6272, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tseq'.
	 * @see #__DNA__FIELD__tseq
	 */
	
	public void setTseq(ThemeSpace tseq) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6280;
		} else {
			__dna__offset = 6272;
		}
		if (__io__equals(tseq, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tseq)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tseq);
		} else {
			__io__generic__copy( getTseq(), tseq);
		}
	}

	/**
	 * Get method for struct member 'tima'.
	 * @see #__DNA__FIELD__tima
	 */
	
	public ThemeSpace getTima() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 7040, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 7032, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tima'.
	 * @see #__DNA__FIELD__tima
	 */
	
	public void setTima(ThemeSpace tima) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 7040;
		} else {
			__dna__offset = 7032;
		}
		if (__io__equals(tima, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tima)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tima);
		} else {
			__io__generic__copy( getTima(), tima);
		}
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public ThemeSpace getText() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 7800, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 7792, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(ThemeSpace text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 7800;
		} else {
			__dna__offset = 7792;
		}
		if (__io__equals(text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text);
		} else {
			__io__generic__copy( getText(), text);
		}
	}

	/**
	 * Get method for struct member 'toops'.
	 * @see #__DNA__FIELD__toops
	 */
	
	public ThemeSpace getToops() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 8560, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 8552, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'toops'.
	 * @see #__DNA__FIELD__toops
	 */
	
	public void setToops(ThemeSpace toops) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8560;
		} else {
			__dna__offset = 8552;
		}
		if (__io__equals(toops, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, toops)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, toops);
		} else {
			__io__generic__copy( getToops(), toops);
		}
	}

	/**
	 * Get method for struct member 'ttime'.
	 * @see #__DNA__FIELD__ttime
	 */
	
	public ThemeSpace getTtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 9320, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 9312, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ttime'.
	 * @see #__DNA__FIELD__ttime
	 */
	
	public void setTtime(ThemeSpace ttime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9320;
		} else {
			__dna__offset = 9312;
		}
		if (__io__equals(ttime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ttime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ttime);
		} else {
			__io__generic__copy( getTtime(), ttime);
		}
	}

	/**
	 * Get method for struct member 'tnode'.
	 * @see #__DNA__FIELD__tnode
	 */
	
	public ThemeSpace getTnode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 10080, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 10072, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tnode'.
	 * @see #__DNA__FIELD__tnode
	 */
	
	public void setTnode(ThemeSpace tnode) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10080;
		} else {
			__dna__offset = 10072;
		}
		if (__io__equals(tnode, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tnode)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tnode);
		} else {
			__io__generic__copy( getTnode(), tnode);
		}
	}

	/**
	 * Get method for struct member 'tlogic'.
	 * @see #__DNA__FIELD__tlogic
	 */
	
	public ThemeSpace getTlogic() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 10840, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 10832, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tlogic'.
	 * @see #__DNA__FIELD__tlogic
	 */
	
	public void setTlogic(ThemeSpace tlogic) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10840;
		} else {
			__dna__offset = 10832;
		}
		if (__io__equals(tlogic, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tlogic)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tlogic);
		} else {
			__io__generic__copy( getTlogic(), tlogic);
		}
	}

	/**
	 * Get method for struct member 'tuserpref'.
	 * @see #__DNA__FIELD__tuserpref
	 */
	
	public ThemeSpace getTuserpref() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 11600, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 11592, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tuserpref'.
	 * @see #__DNA__FIELD__tuserpref
	 */
	
	public void setTuserpref(ThemeSpace tuserpref) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 11600;
		} else {
			__dna__offset = 11592;
		}
		if (__io__equals(tuserpref, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tuserpref)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tuserpref);
		} else {
			__io__generic__copy( getTuserpref(), tuserpref);
		}
	}

	/**
	 * Get method for struct member 'tconsole'.
	 * @see #__DNA__FIELD__tconsole
	 */
	
	public ThemeSpace getTconsole() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 12360, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 12352, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tconsole'.
	 * @see #__DNA__FIELD__tconsole
	 */
	
	public void setTconsole(ThemeSpace tconsole) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12360;
		} else {
			__dna__offset = 12352;
		}
		if (__io__equals(tconsole, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tconsole)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tconsole);
		} else {
			__io__generic__copy( getTconsole(), tconsole);
		}
	}

	/**
	 * Get method for struct member 'tclip'.
	 * @see #__DNA__FIELD__tclip
	 */
	
	public ThemeSpace getTclip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 13120, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 13112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tclip'.
	 * @see #__DNA__FIELD__tclip
	 */
	
	public void setTclip(ThemeSpace tclip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13120;
		} else {
			__dna__offset = 13112;
		}
		if (__io__equals(tclip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tclip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tclip);
		} else {
			__io__generic__copy( getTclip(), tclip);
		}
	}

	/**
	 * Get method for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * @see #__DNA__FIELD__tarm
	 */
	
	public CArrayFacade<ThemeWireColor> getTarm() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ThemeWireColor.class};
		int[] __dna__dimensions = new int[]{
			20
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ThemeWireColor>(__io__address + 13880, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ThemeWireColor>(__io__address + 13872, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * @see #__DNA__FIELD__tarm
	 */
	
	public void setTarm(CArrayFacade<ThemeWireColor> tarm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13880;
		} else {
			__dna__offset = 13872;
		}
		if (__io__equals(tarm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tarm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tarm);
		} else {
			__io__generic__copy( getTarm(), tarm);
		}
	}

	/**
	 * Get method for struct member 'active_theme_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ThemeWireColor}  tobj[20]; </p>
	 * @see #__DNA__FIELD__active_theme_area
	 */
	
	public int getActive_theme_area() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 14200);
		} else {
			return __io__block.readInt(__io__address + 14192);
		}
	}

	/**
	 * Set method for struct member 'active_theme_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ThemeWireColor}  tobj[20]; </p>
	 * @see #__DNA__FIELD__active_theme_area
	 */
	
	public void setActive_theme_area(int active_theme_area) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 14200, active_theme_area);
		} else {
			__io__block.writeInt(__io__address + 14192, active_theme_area);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 14204);
		} else {
			return __io__block.readInt(__io__address + 14196);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 14204, pad);
		} else {
			__io__block.writeInt(__io__address + 14196, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTheme> __io__addressof() {
		return new CPointer<bTheme>(__io__address, new Class[]{bTheme.class}, __io__block, __io__blockTable);
	}

}
