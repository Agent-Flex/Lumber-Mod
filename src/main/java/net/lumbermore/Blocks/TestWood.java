package net.lumbermore.tree;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TestWood extends Block {

    public TestWood() {
        super(FabricBlockSettings.of(Material.WOOD).breakByHand(false).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD).strength(4, 0.9f).build());
    }


}