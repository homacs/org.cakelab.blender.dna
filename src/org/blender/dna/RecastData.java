package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'RecastData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=56, size64=56)
public class RecastData extends CFacade {

	/**
	 * This is the sdna index of the struct RecastData.
	 * <p>
	 * It is required when allocating a new block to store data for RecastData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 179;

	/**
	 * Field descriptor (offset) for struct member 'cellsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__cellsize);
	 * CPointer&lt;Float&gt; p_cellsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cellsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cellsize = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cellheight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__cellheight);
	 * CPointer&lt;Float&gt; p_cellheight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cellheight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cellheight = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'agentmaxslope'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__agentmaxslope);
	 * CPointer&lt;Float&gt; p_agentmaxslope = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agentmaxslope'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agentmaxslope = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'agentmaxclimb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__agentmaxclimb);
	 * CPointer&lt;Float&gt; p_agentmaxclimb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agentmaxclimb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agentmaxclimb = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'agentheight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__agentheight);
	 * CPointer&lt;Float&gt; p_agentheight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agentheight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agentheight = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'agentradius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__agentradius);
	 * CPointer&lt;Float&gt; p_agentradius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'agentradius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__agentradius = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'edgemaxlen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__edgemaxlen);
	 * CPointer&lt;Float&gt; p_edgemaxlen = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgemaxlen'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgemaxlen = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'edgemaxerror'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__edgemaxerror);
	 * CPointer&lt;Float&gt; p_edgemaxerror = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgemaxerror'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgemaxerror = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'regionminsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__regionminsize);
	 * CPointer&lt;Float&gt; p_regionminsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionminsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionminsize = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'regionmergesize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__regionmergesize);
	 * CPointer&lt;Float&gt; p_regionmergesize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionmergesize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionmergesize = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'vertsperpoly'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__vertsperpoly);
	 * CPointer&lt;Integer&gt; p_vertsperpoly = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertsperpoly'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertsperpoly = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'detailsampledist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__detailsampledist);
	 * CPointer&lt;Float&gt; p_detailsampledist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'detailsampledist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__detailsampledist = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'detailsamplemaxerror'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__detailsamplemaxerror);
	 * CPointer&lt;Float&gt; p_detailsamplemaxerror = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'detailsamplemaxerror'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__detailsamplemaxerror = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'partitioning'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__partitioning);
	 * CPointer&lt;Byte&gt; p_partitioning = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partitioning'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partitioning = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__pad1);
	 * CPointer&lt;Byte&gt; p_pad1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{53, 53};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * RecastData recastdata = ...;
	 * CPointer&lt;Object&gt; p = recastdata.__dna__addressof(RecastData.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{54, 54};

	public RecastData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected RecastData(RecastData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cellsize'.
	 * @see #__DNA__FIELD__cellsize
	 */
	
	public float getCellsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'cellsize'.
	 * @see #__DNA__FIELD__cellsize
	 */
	
	public void setCellsize(float cellsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, cellsize);
		} else {
			__io__block.writeFloat(__io__address + 0, cellsize);
		}
	}

	/**
	 * Get method for struct member 'cellheight'.
	 * @see #__DNA__FIELD__cellheight
	 */
	
	public float getCellheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'cellheight'.
	 * @see #__DNA__FIELD__cellheight
	 */
	
	public void setCellheight(float cellheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, cellheight);
		} else {
			__io__block.writeFloat(__io__address + 4, cellheight);
		}
	}

	/**
	 * Get method for struct member 'agentmaxslope'.
	 * @see #__DNA__FIELD__agentmaxslope
	 */
	
	public float getAgentmaxslope() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'agentmaxslope'.
	 * @see #__DNA__FIELD__agentmaxslope
	 */
	
	public void setAgentmaxslope(float agentmaxslope) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, agentmaxslope);
		} else {
			__io__block.writeFloat(__io__address + 8, agentmaxslope);
		}
	}

	/**
	 * Get method for struct member 'agentmaxclimb'.
	 * @see #__DNA__FIELD__agentmaxclimb
	 */
	
	public float getAgentmaxclimb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'agentmaxclimb'.
	 * @see #__DNA__FIELD__agentmaxclimb
	 */
	
	public void setAgentmaxclimb(float agentmaxclimb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, agentmaxclimb);
		} else {
			__io__block.writeFloat(__io__address + 12, agentmaxclimb);
		}
	}

	/**
	 * Get method for struct member 'agentheight'.
	 * @see #__DNA__FIELD__agentheight
	 */
	
	public float getAgentheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'agentheight'.
	 * @see #__DNA__FIELD__agentheight
	 */
	
	public void setAgentheight(float agentheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, agentheight);
		} else {
			__io__block.writeFloat(__io__address + 16, agentheight);
		}
	}

	/**
	 * Get method for struct member 'agentradius'.
	 * @see #__DNA__FIELD__agentradius
	 */
	
	public float getAgentradius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'agentradius'.
	 * @see #__DNA__FIELD__agentradius
	 */
	
	public void setAgentradius(float agentradius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, agentradius);
		} else {
			__io__block.writeFloat(__io__address + 20, agentradius);
		}
	}

	/**
	 * Get method for struct member 'edgemaxlen'.
	 * @see #__DNA__FIELD__edgemaxlen
	 */
	
	public float getEdgemaxlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'edgemaxlen'.
	 * @see #__DNA__FIELD__edgemaxlen
	 */
	
	public void setEdgemaxlen(float edgemaxlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, edgemaxlen);
		} else {
			__io__block.writeFloat(__io__address + 24, edgemaxlen);
		}
	}

	/**
	 * Get method for struct member 'edgemaxerror'.
	 * @see #__DNA__FIELD__edgemaxerror
	 */
	
	public float getEdgemaxerror() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'edgemaxerror'.
	 * @see #__DNA__FIELD__edgemaxerror
	 */
	
	public void setEdgemaxerror(float edgemaxerror) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, edgemaxerror);
		} else {
			__io__block.writeFloat(__io__address + 28, edgemaxerror);
		}
	}

	/**
	 * Get method for struct member 'regionminsize'.
	 * @see #__DNA__FIELD__regionminsize
	 */
	
	public float getRegionminsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'regionminsize'.
	 * @see #__DNA__FIELD__regionminsize
	 */
	
	public void setRegionminsize(float regionminsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, regionminsize);
		} else {
			__io__block.writeFloat(__io__address + 32, regionminsize);
		}
	}

	/**
	 * Get method for struct member 'regionmergesize'.
	 * @see #__DNA__FIELD__regionmergesize
	 */
	
	public float getRegionmergesize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'regionmergesize'.
	 * @see #__DNA__FIELD__regionmergesize
	 */
	
	public void setRegionmergesize(float regionmergesize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, regionmergesize);
		} else {
			__io__block.writeFloat(__io__address + 36, regionmergesize);
		}
	}

	/**
	 * Get method for struct member 'vertsperpoly'.
	 * @see #__DNA__FIELD__vertsperpoly
	 */
	
	public int getVertsperpoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'vertsperpoly'.
	 * @see #__DNA__FIELD__vertsperpoly
	 */
	
	public void setVertsperpoly(int vertsperpoly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, vertsperpoly);
		} else {
			__io__block.writeInt(__io__address + 40, vertsperpoly);
		}
	}

	/**
	 * Get method for struct member 'detailsampledist'.
	 * @see #__DNA__FIELD__detailsampledist
	 */
	
	public float getDetailsampledist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'detailsampledist'.
	 * @see #__DNA__FIELD__detailsampledist
	 */
	
	public void setDetailsampledist(float detailsampledist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, detailsampledist);
		} else {
			__io__block.writeFloat(__io__address + 44, detailsampledist);
		}
	}

	/**
	 * Get method for struct member 'detailsamplemaxerror'.
	 * @see #__DNA__FIELD__detailsamplemaxerror
	 */
	
	public float getDetailsamplemaxerror() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'detailsamplemaxerror'.
	 * @see #__DNA__FIELD__detailsamplemaxerror
	 */
	
	public void setDetailsamplemaxerror(float detailsamplemaxerror) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, detailsamplemaxerror);
		} else {
			__io__block.writeFloat(__io__address + 48, detailsamplemaxerror);
		}
	}

	/**
	 * Get method for struct member 'partitioning'.
	 * @see #__DNA__FIELD__partitioning
	 */
	
	public byte getPartitioning() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 52);
		} else {
			return __io__block.readByte(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'partitioning'.
	 * @see #__DNA__FIELD__partitioning
	 */
	
	public void setPartitioning(byte partitioning) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 52, partitioning);
		} else {
			__io__block.writeByte(__io__address + 52, partitioning);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public byte getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 53);
		} else {
			return __io__block.readByte(__io__address + 53);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(byte pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 53, pad1);
		} else {
			__io__block.writeByte(__io__address + 53, pad1);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 54);
		} else {
			return __io__block.readShort(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 54, pad2);
		} else {
			__io__block.writeShort(__io__address + 54, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<RecastData> __io__addressof() {
		return new CPointer<RecastData>(__io__address, new Class[]{RecastData.class}, __io__block, __io__blockTable);
	}

}
