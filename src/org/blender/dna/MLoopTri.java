package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MLoopTri'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link MLoopTri} 's are lightweight triangulation data, for functionality that doesn't support ngons ({@link MPoly} ). This is cache data created from ({@link MPoly} , {@link MLoop}  & {@link MVert}  arrays). There is no attempt to maintain this data's validity over time, any changes to the underlying mesh invalidate the {@link MLoopTri}  array, which will need to be re-calculated.</p><p> Users normally access this via #BKE_mesh_runtime_looptri_ensure. In rare cases its calculated directly, with #BKE_mesh_recalc_looptri.</p><p> Typical usage includes:<ul><li><p> OpenGL drawing.</p></li><li><p> #BVHTree creation.</p></li><li><p> Physics/collision detection.</p></li></ul> 
 * OpenGL drawing.#BVHTree creation.Physics/collision detection.
 * </p><p> Storing loop indices (instead of vertex indices) allows us to directly access UV's, vertex-colors as well as vertices. The index of the source polygon is stored as well, giving access to materials and polygon normals.</p><p><h2>Note</h2><p> This data is runtime only, never written to disk.</p> This data is runtime only, never written to disk.
 * Usage examples: <code>       material. ///accessoriginalmaterial.
 *  short short       mpoly[lt->poly].mat_nr; mat_nr=mpoly[lt->poly].mat_nr;
 * 
 *        locations. ///accessvertexlocations.
 *  float float       { *vtri_co[3]={
 *          mvert[mloop[lt->tri[0]].v].co, mvert[mloop[lt->tri[0]].v].co,
 *          mvert[mloop[lt->tri[1]].v].co, mvert[mloop[lt->tri[1]].v].co,
 *          mvert[mloop[lt->tri[2]].v].co, mvert[mloop[lt->tri[2]].v].co,
 *  }; };
 * 
 *                        etc). ///accessUVcoordinates(worksforallloopdata,vertexcolors...etc).
 *  float float       { *uvtri_co[3]={
 *          mloopuv[lt->tri[0]].uv, mloopuv[lt->tri[0]].uv,
 *          mloopuv[lt->tri[1]].uv, mloopuv[lt->tri[1]].uv,
 *          mloopuv[lt->tri[2]].uv, mloopuv[lt->tri[2]].uv,
 *  }; };
 * </code> ///accessoriginalmaterial.
 * shortmat_nr=mpoly[lt->poly].mat_nr;
 * 
 * ///accessvertexlocations.
 * float*vtri_co[3]={
 * mvert[mloop[lt->tri[0]].v].co,
 * mvert[mloop[lt->tri[1]].v].co,
 * mvert[mloop[lt->tri[2]].v].co,
 * };
 * 
 * ///accessUVcoordinates(worksforallloopdata,vertexcolors...etc).
 * float*uvtri_co[3]={
 * mloopuv[lt->tri[0]].uv,
 * mloopuv[lt->tri[1]].uv,
 * mloopuv[lt->tri[2]].uv,
 * };
 * </p><p>{@link MLoopTri} 's are allocated in an array, where each polygon's {@link MLoopTri} 's are stored contiguously, the number of triangles for each polygon is guaranteed to be ({@link MPoly.totloop}  - 2), even for degenerate geometry. See {@link ME_POLY_TRI_TOT}  macro.</p><p> It's also possible to perform a reverse lookup (find all {@link MLoopTri} 's for any given {@link MPoly} ).</p><p><code>                   i ///loopoveralllooptri'sforagivenpolygon:i
 * {@link MPoly}       &mpoly[i]; *mp=&mpoly[i];
 * {@link MLoopTri}         mp->{@link loopstart} )]; MLoopTri*lt=&looptri[poly_to_tri_count(i,mp->loopstart)];
 *  int int        {@link ME_POLY_TRI_TOT} (mp); j,lt_tot=ME_POLY_TRI_TOT(mp);
 * 
 *  for for                   { (j=0;j<lt_tot;j++,lt++){
 *          unsigned unsigned   int int       { vtri[3]={
 *                  mloop[lt->tri[0]].v, mloop[lt->tri[0]].v,
 *                  mloop[lt->tri[1]].v, mloop[lt->tri[1]].v,
 *                  mloop[lt->tri[2]].v, mloop[lt->tri[2]].v,
 *          }; };
 *          printf( printf(       %u\n" "tri%u%u%u\n"       vtri[2]); ,vtri[0],vtri[1],vtri[2]);
 *  }; };
 * </code> ///loopoveralllooptri'sforagivenpolygon:i
 * MPoly*mp=&mpoly[i];
 * MLoopTri*lt=&looptri[poly_to_tri_count(i,mp->loopstart)];
 * intj,lt_tot=ME_POLY_TRI_TOT(mp);
 * 
 * for(j=0;j<lt_tot;j++,lt++){
 * unsignedintvtri[3]={
 * mloop[lt->tri[0]].v,
 * mloop[lt->tri[1]].v,
 * mloop[lt->tri[2]].v,
 * };
 * printf("tri%u%u%u\n",vtri[0],vtri[1],vtri[2]);
 * };
 * </p><p> It may also be useful to check whether or not two vertices of a triangle form an edge in the underlying mesh.</p><p> This can be done by checking the edge of the referenced loop ({@link MLoop.e} ), the winding of the {@link MLoopTri}  and the {@link MLoop} 's will always match, however the order of vertices in the edge is undefined.</p><p><code>               lt ///printrealedgesfromanMLoopTri:lt
 *  int int     j_next; j,j_next;
 *  for for                           { (j=2,j_next=0;j_next<3;j=j_next++){
 *         {@link MEdge}       &medge[mloop[lt->tri[j]].e]; *ed=&medge[mloop[lt->tri[j]].e];
 *          unsigned unsigned   int int           mloop[lt->tri[j_next]].v}; tri_edge[2]={mloop[lt->tri[j]].v,mloop[lt->tri[j_next]].v};
 * 
 *          if if                 || (((ed->v1==tri_edge[0])&&(ed->v2==tri_edge[1]))||
 *                              tri_edge[0]))) ((ed->v1==tri_edge[1])&&(ed->v2==tri_edge[0])))
 *          { {
 *                  printf( printf(         %u\n" "realedgefound%u%u\n"     tri_edge[1]); ,tri_edge[0],tri_edge[1]);
 *          } }
 *  } }
 * </code> ///printrealedgesfromanMLoopTri:lt
 * intj,j_next;
 * for(j=2,j_next=0;j_next<3;j=j_next++){
 * MEdge*ed=&medge[mloop[lt->tri[j]].e];
 * unsignedinttri_edge[2]={mloop[lt->tri[j]].v,mloop[lt->tri[j_next]].v};
 * 
 * if(((ed->v1==tri_edge[0])&&(ed->v2==tri_edge[1]))||
 * ((ed->v1==tri_edge[1])&&(ed->v2==tri_edge[0])))
 * {
 * printf("realedgefound%u%u\n",tri_edge[0],tri_edge[1]);
 * }
 * }
 * </p><p> See #BKE_mesh_looptri_get_real_edges for a utility that does this.</p><p><h2>Note</h2><p> A {@link MLoopTri}<b></b>  edges. </p> A MLoopTri may be in the middle of an ngon and not reference any edges. 
 * </p>
 */

@CMetaData(size32=16, size64=16)
public class MLoopTri extends CFacade {

	/**
	 * This is the sdna index of the struct MLoopTri.
	 * <p>
	 * It is required when allocating a new block to store data for MLoopTri.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 73;

	/**
	 * Field descriptor (offset) for struct member 'tri'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri mlooptri = ...;
	 * CPointer&lt;Object&gt; p = mlooptri.__dna__addressof(MLoopTri.__DNA__FIELD__tri);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_tri = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tri'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tri = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'poly'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri mlooptri = ...;
	 * CPointer&lt;Object&gt; p = mlooptri.__dna__addressof(MLoopTri.__DNA__FIELD__poly);
	 * CPointer&lt;Integer&gt; p_poly = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poly'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poly = new long[]{12, 12};

	public MLoopTri(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MLoopTri(MLoopTri that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tri'.
	 * @see #__DNA__FIELD__tri
	 */
	
	public CArrayFacade<Integer> getTri() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tri'.
	 * @see #__DNA__FIELD__tri
	 */
	
	public void setTri(CArrayFacade<Integer> tri) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tri, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tri)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tri);
		} else {
			__io__generic__copy( getTri(), tri);
		}
	}

	/**
	 * Get method for struct member 'poly'.
	 * @see #__DNA__FIELD__poly
	 */
	
	public int getPoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'poly'.
	 * @see #__DNA__FIELD__poly
	 */
	
	public void setPoly(int poly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, poly);
		} else {
			__io__block.writeInt(__io__address + 12, poly);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MLoopTri> __io__addressof() {
		return new CPointer<MLoopTri>(__io__address, new Class[]{MLoopTri.class}, __io__block, __io__blockTable);
	}

}
