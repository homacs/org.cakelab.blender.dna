package org.blender.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.blender.dna.*;
import org.cakelab.blender.io.BlenderFile;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockCodes;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.utils.BlenderFactoryBase;


/**
 * Factory class to create blender files and blocks in it.
 * 
 */
public class BlenderFactory extends BlenderFactoryBase {

	static class BlenderFileImpl extends BlenderFileImplBase {
		
		private FileGlobal global;
		
		protected BlenderFileImpl(File file, StructDNA sdna, int blenderVersion) throws IOException {
			super(file, sdna, blenderVersion);
			BlockTable blockTable = getBlockTable();
			Block block = blockTable.allocate(BlockCodes.ID_GLOB, FileGlobal.__io__sizeof(FileGlobal.class, getEncoding().getAddressWidth()), FileGlobal.__DNA__SDNA_INDEX, 1);
			global = new FileGlobal(block.header.getAddress(), block, blockTable);
			String filename = file.getCanonicalPath();
			global.getFilename().fromString(filename);
			global.setMinsubversion(MainLib.BLENDER_MINSUBVERSION);
			global.setMinversion(MainLib.BLENDER_MINVERSION);
			global.setSubversion(MainLib.BLENDER_SUBVERSION);
			add(block);
		}
		
	}

	/**Struct dna of the generated data model.
	 */
	protected static StructDNA sdna;


	public BlenderFactory(BlenderFile blend) throws IOException {
		super(blend);
	}

	public static FileGlobal getFileGlobal(BlenderFile blend) throws IOException {
		BlockTable blockTable = blend.getBlockTable();
		List<Block> globalBlock = blockTable.getBlocks(BlockCodes.ID_GLOB);
		FileGlobal fileGlobal = null;
		if (globalBlock.size() == 1) {
			Block b = globalBlock.get(0);
			fileGlobal = new FileGlobal(b.header.getAddress(), b, blockTable);
		}
		return fileGlobal;
	}

	public FileGlobal getFileGlobal() throws IOException {
		return getFileGlobal(blend);
	}

	public static BlenderFile newBlenderFile(File file) throws IOException {
		StructDNA sdna = getStructDNA();
		BlenderFileImpl blend = new BlenderFileImpl(file, sdna, MainLib.BLENDER_VERSION);
		return blend;
	}

	public static StructDNA getStructDNA() throws IOException {
		if (sdna == null) {
			sdna = createStructDNA("org/blender/utils/resources/sdna.blend");
		}
		return sdna;
	}

}
