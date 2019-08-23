package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidState'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=128)
public class BoidState extends CFacade {

	/**
	 * This is the sdna index of the struct BoidState.
	 * <p>
	 * It is required when allocating a new block to store data for BoidState.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 537;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;BoidState&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, BoidState.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'BoidState*'</li>
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
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;BoidState&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, BoidState.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'BoidState*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'rules'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__rules);
	 * CPointer&lt;ListBase&gt; p_rules = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rules'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rules = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'conditions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__conditions);
	 * CPointer&lt;ListBase&gt; p_conditions = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'conditions'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__conditions = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'actions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__actions);
	 * CPointer&lt;ListBase&gt; p_actions = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actions'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actions = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid state name
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[32]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__id);
	 * CPointer&lt;Integer&gt; p_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{64, 96};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{68, 100};

	/**
	 * Field descriptor (offset) for struct member 'ruleset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the rules in the list are evaluated<h4>Blender Source Code:</h4>
	 * <p> rules </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__ruleset_type);
	 * CPointer&lt;Integer&gt; p_ruleset_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ruleset_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ruleset_type = new long[]{72, 104};

	/**
	 * Field descriptor (offset) for struct member 'rule_fuzziness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__rule_fuzziness);
	 * CPointer&lt;Float&gt; p_rule_fuzziness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rule_fuzziness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rule_fuzziness = new long[]{76, 108};

	/**
	 * Field descriptor (offset) for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signal </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__signal_id);
	 * CPointer&lt;Integer&gt; p_signal_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'signal_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__signal_id = new long[]{80, 112};

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__channels);
	 * CPointer&lt;Integer&gt; p_channels = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{84, 116};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{88, 120};

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidState boidstate = ...;
	 * CPointer&lt;Object&gt; p = boidstate.__dna__addressof(BoidState.__DNA__FIELD__falloff);
	 * CPointer&lt;Float&gt; p_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{92, 124};

	public BoidState(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidState(BoidState that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<BoidState> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoidState.class};
		return new CPointer<BoidState>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoidState.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<BoidState> next) throws IOException
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
	
	public CPointer<BoidState> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoidState.class};
		return new CPointer<BoidState>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoidState.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<BoidState> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'rules'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__rules
	 */
	
	public ListBase getRules() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rules'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__rules
	 */
	
	public void setRules(ListBase rules) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(rules, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rules)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rules);
		} else {
			__io__generic__copy( getRules(), rules);
		}
	}

	/**
	 * Get method for struct member 'conditions'.
	 * @see #__DNA__FIELD__conditions
	 */
	
	public ListBase getConditions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'conditions'.
	 * @see #__DNA__FIELD__conditions
	 */
	
	public void setConditions(ListBase conditions) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(conditions, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, conditions)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, conditions);
		} else {
			__io__generic__copy( getConditions(), conditions);
		}
	}

	/**
	 * Get method for struct member 'actions'.
	 * @see #__DNA__FIELD__actions
	 */
	
	public ListBase getActions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'actions'.
	 * @see #__DNA__FIELD__actions
	 */
	
	public void setActions(ListBase actions) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(actions, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, actions)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, actions);
		} else {
			__io__generic__copy( getActions(), actions);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid state name
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid state name
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 32;
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
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public int getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(int id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, id);
		} else {
			__io__block.writeInt(__io__address + 64, id);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, flag);
		} else {
			__io__block.writeInt(__io__address + 68, flag);
		}
	}

	/**
	 * Get method for struct member 'ruleset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the rules in the list are evaluated<h4>Blender Source Code:</h4>
	 * <p> rules </p>
	 * @see #__DNA__FIELD__ruleset_type
	 */
	
	public int getRuleset_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'ruleset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How the rules in the list are evaluated<h4>Blender Source Code:</h4>
	 * <p> rules </p>
	 * @see #__DNA__FIELD__ruleset_type
	 */
	
	public void setRuleset_type(int ruleset_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, ruleset_type);
		} else {
			__io__block.writeInt(__io__address + 72, ruleset_type);
		}
	}

	/**
	 * Get method for struct member 'rule_fuzziness'.
	 * @see #__DNA__FIELD__rule_fuzziness
	 */
	
	public float getRule_fuzziness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'rule_fuzziness'.
	 * @see #__DNA__FIELD__rule_fuzziness
	 */
	
	public void setRule_fuzziness(float rule_fuzziness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, rule_fuzziness);
		} else {
			__io__block.writeFloat(__io__address + 76, rule_fuzziness);
		}
	}

	/**
	 * Get method for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signal </p>
	 * @see #__DNA__FIELD__signal_id
	 */
	
	public int getSignal_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'signal_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> signal </p>
	 * @see #__DNA__FIELD__signal_id
	 */
	
	public void setSignal_id(int signal_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, signal_id);
		} else {
			__io__block.writeInt(__io__address + 80, signal_id);
		}
	}

	/**
	 * Get method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public int getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(int channels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, channels);
		} else {
			__io__block.writeInt(__io__address + 84, channels);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, volume);
		} else {
			__io__block.writeFloat(__io__address + 88, volume);
		}
	}

	/**
	 * Get method for struct member 'falloff'.
	 * @see #__DNA__FIELD__falloff
	 */
	
	public float getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(float falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, falloff);
		} else {
			__io__block.writeFloat(__io__address + 92, falloff);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidState> __io__addressof() {
		return new CPointer<BoidState>(__io__address, new Class[]{BoidState.class}, __io__block, __io__blockTable);
	}

}
