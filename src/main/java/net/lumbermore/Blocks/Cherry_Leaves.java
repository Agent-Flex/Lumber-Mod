package net.lumbermore.Blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class Cherry_Leaves extends Block {

    public Cherry_Leaves() {
        super(FabricBlockSettings.of(Material.LEAVES).breakByHand(true).sounds(BlockSoundGroup.WOOD).build());
    }


}