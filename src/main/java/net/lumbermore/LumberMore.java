package net.lumbermore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lumbermore.Bases.AxeBase;
import net.lumbermore.Material.FireAxeTool;
import net.lumbermore.Material.ManyAxeTool;
import net.lumbermore.Material.ToolMaterialWood;
import net.lumbermore.Material.ToolPissAxe;
import net.lumbermore.Material.ToolRukiryaxe;
import net.lumbermore.Blocks.TestPlanks;
import net.lumbermore.Blocks.TestWood;
import net.lumbermore.Blocks.Cherry_Leaves;
import net.lumbermore.Blocks.cherry_log;
import net.lumbermore.Blocks.cherry_planks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LumberMore implements ModInitializer {

	public static final Item Test_Axe = new Item(new Item.Settings().group(ItemGroup.MISC));

	
    //Item Groups
    public static final ItemGroup Lumber = FabricItemGroupBuilder.build(
            new Identifier("lumbermore", "general"),
            () -> new ItemStack(null));

	public static final Block Test_Wood = new TestWood();
	public static final Block Test_Planks = new TestPlanks();
	public static final Block cherry_log = new cherry_log();
	public static final Block cherry_leaves = new Cherry_Leaves();
	public static final Block Cherry_Planks = new cherry_planks();

	private void RegisterItem(Identifier identity, Item item) {
        Registry.register(Registry.ITEM, identity, item);
    }
    private void RegisterBlock(Identifier identity, Block block) {
        Registry.register(Registry.BLOCK, identity, block);
    }

    private void RegisterBlockWithItem(Identifier blockIdentity, Block block, Identifier itemIdentity, BlockItem blockItem) {
        RegisterBlock(blockIdentity, block);
        RegisterItem(itemIdentity, blockItem);
    }

	@Override
	public void onInitialize() {
		RegisterBlockWithItem(new Identifier("lumbermore", "test_wood"), Test_Wood, new Identifier("lumbermore", "test_wood"), new BlockItem(Test_Wood, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_leaves"), cherry_leaves, new Identifier("lumbermore", "cherry_leaves"), new BlockItem(cherry_leaves, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_log"), cherry_log, new Identifier("lumbermore", "cherry_log"), new BlockItem(cherry_log, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_planks"), Cherry_Planks, new Identifier("lumbermore", "cherry_planks"), new BlockItem(Cherry_Planks, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier("lumbermore", "test_planks"), Test_Planks, new Identifier("lumbermore", "test_planks"), new BlockItem(Test_Planks, new Item.Settings().group(LumberMore.Lumber)));
		RegisterItem(new Identifier("lumbermore", "test_axe2"), new AxeBase(new ToolMaterialWood()));
		RegisterItem(new Identifier("lumbermore", "Rukiryaxe"), new AxeBase(new ToolRukiryaxe()));
		RegisterItem(new Identifier("lumbermore", "ManyAxe"), new AxeBase(new ManyAxeTool()));
		RegisterItem(new Identifier("lumbermore", "FireAxe"), new AxeBase(new FireAxeTool()));
		RegisterItem(new Identifier("lumbermore", "PissAxe"), new AxeBase(new ToolPissAxe()));
	}
}