package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ChannelDriver'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Channel Driver (i.e. Drivers / Expressions) (driver)</p><p> Channel Drivers are part of the dependency system, and are executed in addition to normal user-defined animation. They take the animation result of some channel(s), and use that (optionally combined with its own F-Curve for modification of results) to define the value of some setting semi-procedurally.</p><p> Drivers are stored as part of F-Curve data, so that the F-Curve's RNA-path settings (for storing what setting the driver will affect). The order in which they are stored defines the order that they're evaluated in. This order is set by the Depsgraph's sorting stuff. </p>
 */

@CMetaData(size32=284, size64=296)
public class ChannelDriver extends CFacade {

	/**
	 * This is the sdna index of the struct ChannelDriver.
	 * <p>
	 * It is required when allocating a new block to store data for ChannelDriver.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 518;

	/**
	 * Field descriptor (offset) for struct member 'variables'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> targets for this driver (i.e. list of {@link DriverVar} ) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__variables);
	 * CPointer&lt;ListBase&gt; p_variables = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'variables'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__variables = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'expression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> python expression to execute (may call functions defined in an accessory file) which relates the target 'variables' in some way to yield a single usable valueexpression to compile for evaluation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__expression);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_expression = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expression'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expression = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'expr_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> PyObject - compiled expression, don't save this </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__expr_comp);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_expr_comp = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expr_comp'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expr_comp = new long[]{264, 272};

	/**
	 * Field descriptor (offset) for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of previous evaluation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__curval);
	 * CPointer&lt;Float&gt; p_curval = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curval'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curval = new long[]{268, 280};

	/**
	 * Field descriptor (offset) for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of driver on result </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__influence);
	 * CPointer&lt;Float&gt; p_influence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'influence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__influence = new long[]{272, 284};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX to be implemented... this is like the constraint influence setting. </p><p> general settings type of driver </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{276, 288};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings of driver </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChannelDriver channeldriver = ...;
	 * CPointer&lt;Object&gt; p = channeldriver.__dna__addressof(ChannelDriver.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{280, 292};

	public ChannelDriver(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ChannelDriver(ChannelDriver that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'variables'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> targets for this driver (i.e. list of {@link DriverVar} ) </p>
	 * @see #__DNA__FIELD__variables
	 */
	
	public ListBase getVariables() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'variables'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> targets for this driver (i.e. list of {@link DriverVar} ) </p>
	 * @see #__DNA__FIELD__variables
	 */
	
	public void setVariables(ListBase variables) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(variables, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, variables)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, variables);
		} else {
			__io__generic__copy( getVariables(), variables);
		}
	}

	/**
	 * Get method for struct member 'expression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> python expression to execute (may call functions defined in an accessory file) which relates the target 'variables' in some way to yield a single usable valueexpression to compile for evaluation </p>
	 * @see #__DNA__FIELD__expression
	 */
	
	public CArrayFacade<Byte> getExpression() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'expression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> python expression to execute (may call functions defined in an accessory file) which relates the target 'variables' in some way to yield a single usable valueexpression to compile for evaluation </p>
	 * @see #__DNA__FIELD__expression
	 */
	
	public void setExpression(CArrayFacade<Byte> expression) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(expression, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, expression)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, expression);
		} else {
			__io__generic__copy( getExpression(), expression);
		}
	}

	/**
	 * Get method for struct member 'expr_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> PyObject - compiled expression, don't save this </p>
	 * @see #__DNA__FIELD__expr_comp
	 */
	
	public CPointer<Object> getExpr_comp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'expr_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> PyObject - compiled expression, don't save this </p>
	 * @see #__DNA__FIELD__expr_comp
	 */
	
	public void setExpr_comp(CPointer<Object> expr_comp) throws IOException
	{
		long __address = ((expr_comp == null) ? 0 : expr_comp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 264, __address);
		}
	}

	/**
	 * Get method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of previous evaluation </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public float getCurval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of previous evaluation </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public void setCurval(float curval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, curval);
		} else {
			__io__block.writeFloat(__io__address + 268, curval);
		}
	}

	/**
	 * Get method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of driver on result </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public float getInfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of driver on result </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public void setInfluence(float influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, influence);
		} else {
			__io__block.writeFloat(__io__address + 272, influence);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX to be implemented... this is like the constraint influence setting. </p><p> general settings type of driver </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 288);
		} else {
			return __io__block.readInt(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX to be implemented... this is like the constraint influence setting. </p><p> general settings type of driver </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 288, type);
		} else {
			__io__block.writeInt(__io__address + 276, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings of driver </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 292);
		} else {
			return __io__block.readInt(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings of driver </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 292, flag);
		} else {
			__io__block.writeInt(__io__address + 280, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ChannelDriver> __io__addressof() {
		return new CPointer<ChannelDriver>(__io__address, new Class[]{ChannelDriver.class}, __io__block, __io__blockTable);
	}

}
