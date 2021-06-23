package net.lumbermore.tree;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class cherry_log extends Block {

    public cherry_log() {
        super(FabricBlockSettings.of(Material.LEAVES).breakByHand(true).sounds(BlockSoundGroup.WOOD).build());
    }


}