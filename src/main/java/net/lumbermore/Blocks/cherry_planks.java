package net.lumbermore.Blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class cherry_planks extends Block {

    public cherry_planks() {
        super(FabricBlockSettings.of(Material.WOOD).breakByHand(true).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).strength(3, 0.2f).build());
    }


}