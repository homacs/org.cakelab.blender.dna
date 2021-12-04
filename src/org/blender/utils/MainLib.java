package org.blender.utils;

import java.io.IOException;
import org.blender.dna.*;
import org.cakelab.blender.io.BlenderFile;
import org.cakelab.blender.io.FileVersionInfo;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CPointer;
import org.cakelab.blender.utils.MainLibBase;


/**
 * Generated class MainLib derived from blenders BKE_main.h
 * 
 * <p>This class is basically the entry point to all data in a blender
 * file and associated external files (so called libraries).
 * The content of one blender file goes in one main library.
 * While blender can open multiple files, every file gets its own
 * main lib and all main libs are linked to each other.
 * </p>
 * <p>When initialised, it scans all block headers and searches for structs, which
 * contain a variable of class {@link ID} as its first member and attaches
 * them to the appropriate members of the main lib (represented by this class).
 * </p>
 * <p>This class is also vital to check whether a given blender file is compatible
 * with the data model associated with this Main lib class (see {@link #doVersionCheck} and {@link #getfileGlobal).</p>@author homac
 */
public class MainLib extends MainLibBase {

	/**
	 * This is the version of blender, the data model was generated from. It's also called Blender file version and is usually equivalent to the versino of the Blender program.
	 * Implicitly, it is the maximum file version the generated import code can understand.
	 */
	public static final short BLENDER_VERSION = 300;

	/**
	 * This is the subversion of blender, the data model was generated from. It's also called Blender file sub-version, which can differ from the patch-level of the Blender program.
	 * Implicitly, it is the maximum file sub-version the generated import code can understand.
	 */
	public static final short BLENDER_SUBVERSION = 42;

	/**
	 * This is the minimal Blender file version, the generated data model corresponds to.
	 * Every file with a version lower than this needs conversion.
	 * @see #BLENDER_VERSION
	 */
	public static final short BLENDER_MINVERSION = 300;

	/**
	 * This is the minimal Blender file sub-version, the generated data model corresponds to.
	 * Every file with a version lower than this needs conversion.
	 * @see #BLENDER_SUBVERSION
	 */
	public static final short BLENDER_MINSUBVERSION = 42;

	/**
	 * #BLENDER_VERSION and _SUBVERSION as a String.
	 * @see #BLENDER_VERSION
	 * @see #BLENDER_SUBVERSION
	 */
	public static final String BLENDER_VERSION_STRING = "3.00.42";

	/**
	 * #BLENDER_MINVERSION and _MINSUBVERSION as a String.
	 * @see #BLENDER_MINVERSION
	 * @see #BLENDER_MINSUBVERSION
	 */
	public static final String BLENDER_MINVERSION_STRING = "3.00.42";

	/**Linkage between main libraries.
	 */
	private MainLib next;

	/**Linkage between main libraries.
	 */
	private MainLib prev;

	/**Information about the associated file
	 */
	private FileGlobal fileGlobal;

	/**
	 * See {@link Library} for documentation.
	 */
	private Library library;

	/**
	 * See {@link Ipo} for documentation.
	 */
	private Ipo ipo;

	/**
	 * See {@link Key} for documentation.
	 */
	private Key key;

	/**
	 * See {@link Text} for documentation.
	 */
	private Text text;

	/**
	 * See {@link Camera} for documentation.
	 */
	private Camera camera;

	/**
	 * See {@link Image} for documentation.
	 */
	private Image image;

	/**
	 * See {@link Tex} for documentation.
	 */
	private Tex tex;

	/**
	 * See {@link Lamp} for documentation.
	 */
	private Lamp lamp;

	/**
	 * See {@link Material} for documentation.
	 */
	private Material material;

	/**
	 * See {@link VFont} for documentation.
	 */
	private VFont vFont;

	/**
	 * See {@link MetaBall} for documentation.
	 */
	private MetaBall metaBall;

	/**
	 * See {@link Curve} for documentation.
	 */
	private Curve curve;

	/**
	 * See {@link Mesh} for documentation.
	 */
	private Mesh mesh;

	/**
	 * See {@link Lattice} for documentation.
	 */
	private Lattice lattice;

	/**
	 * See {@link BlenderObject} for documentation.
	 */
	private BlenderObject object;

	/**
	 * See {@link World} for documentation.
	 */
	private World world;

	/**
	 * See {@link Scene} for documentation.
	 */
	private Scene scene;

	/**
	 * See {@link Script} for documentation.
	 */
	private Script script;

	/**
	 * See {@link bScreen} for documentation.
	 */
	private bScreen bScreen;

	/**
	 * See {@link bSound} for documentation.
	 */
	private bSound bSound;

	/**
	 * See {@link Collection} for documentation.
	 */
	private Collection collection;

	/**
	 * See {@link bArmature} for documentation.
	 */
	private bArmature bArmature;

	/**
	 * See {@link bAction} for documentation.
	 */
	private bAction bAction;

	/**
	 * See {@link bNodeTree} for documentation.
	 */
	private bNodeTree bNodeTree;

	/**
	 * See {@link Brush} for documentation.
	 */
	private Brush brush;

	/**
	 * See {@link Palette} for documentation.
	 */
	private Palette palette;

	/**
	 * See {@link PaintCurve} for documentation.
	 */
	private PaintCurve paintCurve;

	/**
	 * See {@link ParticleSettings} for documentation.
	 */
	private ParticleSettings particleSettings;

	/**
	 * See {@link bGPdata} for documentation.
	 */
	private bGPdata bGPdata;

	/**
	 * See {@link wmWindowManager} for documentation.
	 */
	private wmWindowManager wmWindowManager;

	/**
	 * See {@link IdAdtTemplate} for documentation.
	 */
	private IdAdtTemplate idAdtTemplate;

	/**
	 * See {@link Speaker} for documentation.
	 */
	private Speaker speaker;

	/**
	 * See {@link MovieClip} for documentation.
	 */
	private MovieClip movieClip;

	/**
	 * See {@link Mask} for documentation.
	 */
	private Mask mask;

	/**
	 * See {@link FreestyleLineStyle} for documentation.
	 */
	private FreestyleLineStyle freestyleLineStyle;

	/**
	 * See {@link CacheFile} for documentation.
	 */
	private CacheFile cacheFile;

	/**
	 * See {@link WorkSpace} for documentation.
	 */
	private WorkSpace workSpace;

	/**
	 * See {@link LightProbe} for documentation.
	 */
	private LightProbe lightProbe;

	/**
	 * See {@link Hair} for documentation.
	 */
	private Hair hair;

	/**
	 * See {@link PointCloud} for documentation.
	 */
	private PointCloud pointCloud;

	/**
	 * See {@link Volume} for documentation.
	 */
	private Volume volume;

	/**
	 * See {@link Simulation} for documentation.
	 */
	private Simulation simulation;


	public MainLib(BlenderFile blendFile) throws IOException{
		super("org.blender.dna", blendFile);

		fileGlobal = BlenderFactory.getFileGlobal(blendFile);
	}

	/**
	 * 
	 * This method checks whether the given file is of the same version
	 * as the generated data model.
	 * You can get file version info from {@link BlenderFile#readFileGlobal}.
	 */
	public static boolean doVersionCheck(FileVersionInfo fileVersionInfo) throws IOException {
		int version = fileVersionInfo.getVersion().getCode();
		int subversion = fileVersionInfo.getSubversion();
		return (version == BLENDER_VERSION && subversion == BLENDER_SUBVERSION);
	}

	/**
	 * 
	 * This method checks, whether the given blender file complies to the file version range 
	 * (see e.g. #BLENDER_VERSION and #BLENDER_MINVERSION) that could in principle be supported 
	 * by the data model. That means, required structs may exist but the content may have to be 
	 * converted, which is generally not supported by the library.
	 * 
	 * <em>Unless you have added methods to convert the data, you should convert the file with. 
	 * blender before reading it.</em> Conversion code can be found in Blender's source code in files 
	 * <code>source/blender/blenloader/intern/versioning_*.c</code>. These functions 
	 * are not implemeted in Java .Blend.
	 * 
	 * You can get file version info from {@link BlenderFile#readFileGlobal}.
	 * @see #readFileGlobal
	 * @see #doVersionCheck
	 */
	public static boolean doCompatibilityCheck(FileVersionInfo fileVersionInfo) throws IOException {
		int version = fileVersionInfo.getVersion().getCode();
		int subversion = fileVersionInfo.getSubversion();
		return (version > BLENDER_MINVERSION 
				|| (version == BLENDER_MINVERSION && subversion >= BLENDER_MINSUBVERSION))
			&& 
				(version < BLENDER_VERSION 
				|| (version == BLENDER_VERSION && subversion <= BLENDER_SUBVERSION));
	}

	/**returns the first library element in the list of ids which the given libElem is a part of.
	 */
	@Override
	protected CFacade getFirst(CFacade libElem) throws IOException {
		CPointer<?> p = CFacade.__io__addressof(libElem);
		ID id = p.cast(ID.class).get();
		while(id.getPrev().isValid()) id = id.getPrev().cast(ID.class).get();
		return id.__io__addressof().cast(libElem.getClass()).get();
	}

	/**Linkage between main libraries.
	 */
	public MainLib getNext(){
		return next;
	}

	/**Linkage between main libraries.
	 */
	public MainLib getPrev(){
		return prev;
	}

	/**Information about the associated file
	 */
	public FileGlobal getFileGlobal(){
		return fileGlobal;
	}

	/**
	 * See {@link Library} for documentation.
	 */
	public Library getLibrary(){
		return library;
	}

	/**
	 * See {@link Library} for documentation.
	 */
	public void setLibrary(Library library) {
		this.library = library;
	}

	/**
	 * See {@link Ipo} for documentation.
	 */
	public Ipo getIpo(){
		return ipo;
	}

	/**
	 * See {@link Ipo} for documentation.
	 */
	public void setIpo(Ipo ipo) {
		this.ipo = ipo;
	}

	/**
	 * See {@link Key} for documentation.
	 */
	public Key getKey(){
		return key;
	}

	/**
	 * See {@link Key} for documentation.
	 */
	public void setKey(Key key) {
		this.key = key;
	}

	/**
	 * See {@link Text} for documentation.
	 */
	public Text getText(){
		return text;
	}

	/**
	 * See {@link Text} for documentation.
	 */
	public void setText(Text text) {
		this.text = text;
	}

	/**
	 * See {@link Camera} for documentation.
	 */
	public Camera getCamera(){
		return camera;
	}

	/**
	 * See {@link Camera} for documentation.
	 */
	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	/**
	 * See {@link Image} for documentation.
	 */
	public Image getImage(){
		return image;
	}

	/**
	 * See {@link Image} for documentation.
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * See {@link Tex} for documentation.
	 */
	public Tex getTex(){
		return tex;
	}

	/**
	 * See {@link Tex} for documentation.
	 */
	public void setTex(Tex tex) {
		this.tex = tex;
	}

	/**
	 * See {@link Lamp} for documentation.
	 */
	public Lamp getLamp(){
		return lamp;
	}

	/**
	 * See {@link Lamp} for documentation.
	 */
	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}

	/**
	 * See {@link Material} for documentation.
	 */
	public Material getMaterial(){
		return material;
	}

	/**
	 * See {@link Material} for documentation.
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}

	/**
	 * See {@link VFont} for documentation.
	 */
	public VFont getVFont(){
		return vFont;
	}

	/**
	 * See {@link VFont} for documentation.
	 */
	public void setVFont(VFont vFont) {
		this.vFont = vFont;
	}

	/**
	 * See {@link MetaBall} for documentation.
	 */
	public MetaBall getMetaBall(){
		return metaBall;
	}

	/**
	 * See {@link MetaBall} for documentation.
	 */
	public void setMetaBall(MetaBall metaBall) {
		this.metaBall = metaBall;
	}

	/**
	 * See {@link Curve} for documentation.
	 */
	public Curve getCurve(){
		return curve;
	}

	/**
	 * See {@link Curve} for documentation.
	 */
	public void setCurve(Curve curve) {
		this.curve = curve;
	}

	/**
	 * See {@link Mesh} for documentation.
	 */
	public Mesh getMesh(){
		return mesh;
	}

	/**
	 * See {@link Mesh} for documentation.
	 */
	public void setMesh(Mesh mesh) {
		this.mesh = mesh;
	}

	/**
	 * See {@link Lattice} for documentation.
	 */
	public Lattice getLattice(){
		return lattice;
	}

	/**
	 * See {@link Lattice} for documentation.
	 */
	public void setLattice(Lattice lattice) {
		this.lattice = lattice;
	}

	/**
	 * See {@link BlenderObject} for documentation.
	 */
	public BlenderObject getObject(){
		return object;
	}

	/**
	 * See {@link BlenderObject} for documentation.
	 */
	public void setObject(BlenderObject object) {
		this.object = object;
	}

	/**
	 * See {@link World} for documentation.
	 */
	public World getWorld(){
		return world;
	}

	/**
	 * See {@link World} for documentation.
	 */
	public void setWorld(World world) {
		this.world = world;
	}

	/**
	 * See {@link Scene} for documentation.
	 */
	public Scene getScene(){
		return scene;
	}

	/**
	 * See {@link Scene} for documentation.
	 */
	public void setScene(Scene scene) {
		this.scene = scene;
	}

	/**
	 * See {@link Script} for documentation.
	 */
	public Script getScript(){
		return script;
	}

	/**
	 * See {@link Script} for documentation.
	 */
	public void setScript(Script script) {
		this.script = script;
	}

	/**
	 * See {@link bScreen} for documentation.
	 */
	public bScreen getBScreen(){
		return bScreen;
	}

	/**
	 * See {@link bScreen} for documentation.
	 */
	public void setBScreen(bScreen bScreen) {
		this.bScreen = bScreen;
	}

	/**
	 * See {@link bSound} for documentation.
	 */
	public bSound getBSound(){
		return bSound;
	}

	/**
	 * See {@link bSound} for documentation.
	 */
	public void setBSound(bSound bSound) {
		this.bSound = bSound;
	}

	/**
	 * See {@link Collection} for documentation.
	 */
	public Collection getCollection(){
		return collection;
	}

	/**
	 * See {@link Collection} for documentation.
	 */
	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	/**
	 * See {@link bArmature} for documentation.
	 */
	public bArmature getBArmature(){
		return bArmature;
	}

	/**
	 * See {@link bArmature} for documentation.
	 */
	public void setBArmature(bArmature bArmature) {
		this.bArmature = bArmature;
	}

	/**
	 * See {@link bAction} for documentation.
	 */
	public bAction getBAction(){
		return bAction;
	}

	/**
	 * See {@link bAction} for documentation.
	 */
	public void setBAction(bAction bAction) {
		this.bAction = bAction;
	}

	/**
	 * See {@link bNodeTree} for documentation.
	 */
	public bNodeTree getBNodeTree(){
		return bNodeTree;
	}

	/**
	 * See {@link bNodeTree} for documentation.
	 */
	public void setBNodeTree(bNodeTree bNodeTree) {
		this.bNodeTree = bNodeTree;
	}

	/**
	 * See {@link Brush} for documentation.
	 */
	public Brush getBrush(){
		return brush;
	}

	/**
	 * See {@link Brush} for documentation.
	 */
	public void setBrush(Brush brush) {
		this.brush = brush;
	}

	/**
	 * See {@link Palette} for documentation.
	 */
	public Palette getPalette(){
		return palette;
	}

	/**
	 * See {@link Palette} for documentation.
	 */
	public void setPalette(Palette palette) {
		this.palette = palette;
	}

	/**
	 * See {@link PaintCurve} for documentation.
	 */
	public PaintCurve getPaintCurve(){
		return paintCurve;
	}

	/**
	 * See {@link PaintCurve} for documentation.
	 */
	public void setPaintCurve(PaintCurve paintCurve) {
		this.paintCurve = paintCurve;
	}

	/**
	 * See {@link ParticleSettings} for documentation.
	 */
	public ParticleSettings getParticleSettings(){
		return particleSettings;
	}

	/**
	 * See {@link ParticleSettings} for documentation.
	 */
	public void setParticleSettings(ParticleSettings particleSettings) {
		this.particleSettings = particleSettings;
	}

	/**
	 * See {@link bGPdata} for documentation.
	 */
	public bGPdata getBGPdata(){
		return bGPdata;
	}

	/**
	 * See {@link bGPdata} for documentation.
	 */
	public void setBGPdata(bGPdata bGPdata) {
		this.bGPdata = bGPdata;
	}

	/**
	 * See {@link wmWindowManager} for documentation.
	 */
	public wmWindowManager getWmWindowManager(){
		return wmWindowManager;
	}

	/**
	 * See {@link wmWindowManager} for documentation.
	 */
	public void setWmWindowManager(wmWindowManager wmWindowManager) {
		this.wmWindowManager = wmWindowManager;
	}

	/**
	 * See {@link IdAdtTemplate} for documentation.
	 */
	public IdAdtTemplate getIdAdtTemplate(){
		return idAdtTemplate;
	}

	/**
	 * See {@link IdAdtTemplate} for documentation.
	 */
	public void setIdAdtTemplate(IdAdtTemplate idAdtTemplate) {
		this.idAdtTemplate = idAdtTemplate;
	}

	/**
	 * See {@link Speaker} for documentation.
	 */
	public Speaker getSpeaker(){
		return speaker;
	}

	/**
	 * See {@link Speaker} for documentation.
	 */
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	/**
	 * See {@link MovieClip} for documentation.
	 */
	public MovieClip getMovieClip(){
		return movieClip;
	}

	/**
	 * See {@link MovieClip} for documentation.
	 */
	public void setMovieClip(MovieClip movieClip) {
		this.movieClip = movieClip;
	}

	/**
	 * See {@link Mask} for documentation.
	 */
	public Mask getMask(){
		return mask;
	}

	/**
	 * See {@link Mask} for documentation.
	 */
	public void setMask(Mask mask) {
		this.mask = mask;
	}

	/**
	 * See {@link FreestyleLineStyle} for documentation.
	 */
	public FreestyleLineStyle getFreestyleLineStyle(){
		return freestyleLineStyle;
	}

	/**
	 * See {@link FreestyleLineStyle} for documentation.
	 */
	public void setFreestyleLineStyle(FreestyleLineStyle freestyleLineStyle) {
		this.freestyleLineStyle = freestyleLineStyle;
	}

	/**
	 * See {@link CacheFile} for documentation.
	 */
	public CacheFile getCacheFile(){
		return cacheFile;
	}

	/**
	 * See {@link CacheFile} for documentation.
	 */
	public void setCacheFile(CacheFile cacheFile) {
		this.cacheFile = cacheFile;
	}

	/**
	 * See {@link WorkSpace} for documentation.
	 */
	public WorkSpace getWorkSpace(){
		return workSpace;
	}

	/**
	 * See {@link WorkSpace} for documentation.
	 */
	public void setWorkSpace(WorkSpace workSpace) {
		this.workSpace = workSpace;
	}

	/**
	 * See {@link LightProbe} for documentation.
	 */
	public LightProbe getLightProbe(){
		return lightProbe;
	}

	/**
	 * See {@link LightProbe} for documentation.
	 */
	public void setLightProbe(LightProbe lightProbe) {
		this.lightProbe = lightProbe;
	}

	/**
	 * See {@link Hair} for documentation.
	 */
	public Hair getHair(){
		return hair;
	}

	/**
	 * See {@link Hair} for documentation.
	 */
	public void setHair(Hair hair) {
		this.hair = hair;
	}

	/**
	 * See {@link PointCloud} for documentation.
	 */
	public PointCloud getPointCloud(){
		return pointCloud;
	}

	/**
	 * See {@link PointCloud} for documentation.
	 */
	public void setPointCloud(PointCloud pointCloud) {
		this.pointCloud = pointCloud;
	}

	/**
	 * See {@link Volume} for documentation.
	 */
	public Volume getVolume(){
		return volume;
	}

	/**
	 * See {@link Volume} for documentation.
	 */
	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	/**
	 * See {@link Simulation} for documentation.
	 */
	public Simulation getSimulation(){
		return simulation;
	}

	/**
	 * See {@link Simulation} for documentation.
	 */
	public void setSimulation(Simulation simulation) {
		this.simulation = simulation;
	}

}
