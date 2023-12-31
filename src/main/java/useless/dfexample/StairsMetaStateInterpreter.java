package useless.dfexample;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class StairsMetaStateInterpreter extends MetaStateInterpreter {

	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 3;
		int vRotation = meta & 8;
		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"east", "west", "north", "south"}[hRotation]);
		result.put("half",vRotation == 0 ? "bottom" : "top");
		result.put("shape", "straight");
		return result;
	}
}
