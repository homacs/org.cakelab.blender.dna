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
 * <p> A theme.</p><p><h2>Note</h2><p> Currently only a single theme is ever used at once. Different theme presets are stored as external files now. </p> Currently only a single theme is ever used at once. Different theme presets are stored as external files now. 
 * </p>
 */

@CMetaData(size32=16416, size64=16424)
public class bTheme extends CFacade {

	/**
	 * This is the sdna index of the struct bTheme.
	 * <p>
	 * It is required when allocating a new block to store data for bTheme.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 251;

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
	 * <li>Actual Size (32bit/64bit): 952/952</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tui = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'tbuts'.
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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tbuts = new long[]{992, 1000};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tv3d = new long[]{1880, 1888};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tfile = new long[]{2768, 2776};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tipo = new long[]{3656, 3664};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tinfo = new long[]{4544, 4552};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tact = new long[]{5432, 5440};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnla = new long[]{6320, 6328};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tseq = new long[]{7208, 7216};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tima = new long[]{8096, 8104};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{8984, 8992};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toops = new long[]{9872, 9880};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnode = new long[]{10760, 10768};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tuserpref = new long[]{11648, 11656};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tconsole = new long[]{12536, 12544};

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
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tclip = new long[]{13424, 13432};

	/**
	 * Field descriptor (offset) for struct member 'ttopbar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__ttopbar);
	 * CPointer&lt;ThemeSpace&gt; p_ttopbar = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ttopbar'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ttopbar = new long[]{14312, 14320};

	/**
	 * Field descriptor (offset) for struct member 'tstatusbar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tstatusbar);
	 * CPointer&lt;ThemeSpace&gt; p_tstatusbar = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tstatusbar'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tstatusbar = new long[]{15200, 15208};

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
	public static final long[] __DNA__FIELD__tarm = new long[]{16088, 16096};

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
	public static final long[] __DNA__FIELD__active_theme_area = new long[]{16408, 16416};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{16412, 16420};

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
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public ThemeSpace getTbuts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 1000, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 992, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tbuts'.
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public void setTbuts(ThemeSpace tbuts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1000;
		} else {
			__dna__offset = 992;
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
			return new ThemeSpace(__io__address + 1888, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 1880, __io__block, __io__blockTable);
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
			__dna__offset = 1888;
		} else {
			__dna__offset = 1880;
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
			return new ThemeSpace(__io__address + 2776, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 2768, __io__block, __io__blockTable);
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
			__dna__offset = 2776;
		} else {
			__dna__offset = 2768;
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
			return new ThemeSpace(__io__address + 3664, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 3656, __io__block, __io__blockTable);
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
			__dna__offset = 3664;
		} else {
			__dna__offset = 3656;
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
			return new ThemeSpace(__io__address + 4552, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 4544, __io__block, __io__blockTable);
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
			__dna__offset = 4552;
		} else {
			__dna__offset = 4544;
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
			return new ThemeSpace(__io__address + 5440, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 5432, __io__block, __io__blockTable);
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
			__dna__offset = 5440;
		} else {
			__dna__offset = 5432;
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
			return new ThemeSpace(__io__address + 6328, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 6320, __io__block, __io__blockTable);
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
			__dna__offset = 6328;
		} else {
			__dna__offset = 6320;
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
			return new ThemeSpace(__io__address + 7216, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 7208, __io__block, __io__blockTable);
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
			__dna__offset = 7216;
		} else {
			__dna__offset = 7208;
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
			return new ThemeSpace(__io__address + 8104, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 8096, __io__block, __io__blockTable);
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
			__dna__offset = 8104;
		} else {
			__dna__offset = 8096;
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
			return new ThemeSpace(__io__address + 8992, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 8984, __io__block, __io__blockTable);
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
			__dna__offset = 8992;
		} else {
			__dna__offset = 8984;
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
			return new ThemeSpace(__io__address + 9880, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 9872, __io__block, __io__blockTable);
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
			__dna__offset = 9880;
		} else {
			__dna__offset = 9872;
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
	 * Get method for struct member 'tnode'.
	 * @see #__DNA__FIELD__tnode
	 */
	
	public ThemeSpace getTnode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 10768, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 10760, __io__block, __io__blockTable);
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
			__dna__offset = 10768;
		} else {
			__dna__offset = 10760;
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
	 * Get method for struct member 'tuserpref'.
	 * @see #__DNA__FIELD__tuserpref
	 */
	
	public ThemeSpace getTuserpref() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 11656, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 11648, __io__block, __io__blockTable);
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
			__dna__offset = 11656;
		} else {
			__dna__offset = 11648;
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
			return new ThemeSpace(__io__address + 12544, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 12536, __io__block, __io__blockTable);
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
			__dna__offset = 12544;
		} else {
			__dna__offset = 12536;
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
			return new ThemeSpace(__io__address + 13432, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 13424, __io__block, __io__blockTable);
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
			__dna__offset = 13432;
		} else {
			__dna__offset = 13424;
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
	 * Get method for struct member 'ttopbar'.
	 * @see #__DNA__FIELD__ttopbar
	 */
	
	public ThemeSpace getTtopbar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 14320, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 14312, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ttopbar'.
	 * @see #__DNA__FIELD__ttopbar
	 */
	
	public void setTtopbar(ThemeSpace ttopbar) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 14320;
		} else {
			__dna__offset = 14312;
		}
		if (__io__equals(ttopbar, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ttopbar)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ttopbar);
		} else {
			__io__generic__copy( getTtopbar(), ttopbar);
		}
	}

	/**
	 * Get method for struct member 'tstatusbar'.
	 * @see #__DNA__FIELD__tstatusbar
	 */
	
	public ThemeSpace getTstatusbar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 15208, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 15200, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tstatusbar'.
	 * @see #__DNA__FIELD__tstatusbar
	 */
	
	public void setTstatusbar(ThemeSpace tstatusbar) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 15208;
		} else {
			__dna__offset = 15200;
		}
		if (__io__equals(tstatusbar, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tstatusbar)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tstatusbar);
		} else {
			__io__generic__copy( getTstatusbar(), tstatusbar);
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
			return new CArrayFacade<ThemeWireColor>(__io__address + 16096, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ThemeWireColor>(__io__address + 16088, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 16096;
		} else {
			__dna__offset = 16088;
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
			return __io__block.readInt(__io__address + 16416);
		} else {
			return __io__block.readInt(__io__address + 16408);
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
			__io__block.writeInt(__io__address + 16416, active_theme_area);
		} else {
			__io__block.writeInt(__io__address + 16408, active_theme_area);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16420;
		} else {
			__dna__offset = 16412;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTheme> __io__addressof() {
		return new CPointer<bTheme>(__io__address, new Class[]{bTheme.class}, __io__block, __io__blockTable);
	}

}
