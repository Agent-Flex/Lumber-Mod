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
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.lumbermore.Blocks.*;

public class LumberMore implements ModInitializer {

	public static final Item Test_Axe = new Item(new Item.Settings().group(ItemGroup.MISC));

	private static final String MODID = "lumbermore";
	
    //Item Groups
    public static final ItemGroup Lumber = FabricItemGroupBuilder.build(
            new Identifier(MODID, "general"),
            () -> new ItemStack(Blocks.OAK_WOOD));

	public static final Block Test_Wood = new TestWood();
	public static final Block Test_Planks = new TestPlanks();
	public static final Block cherry_log = new cherry_log();
	public static final Block cherry_leaves = new Cherry_Leaves();
	public static final Block Cherry_Planks = new cherry_planks();
	public static final Block cavecrawlerplanks = new cavecrawlerplanks();
	public static final Block cavecrawlerlog = new cavecrawlerlog();
	public static final Block snowglowlog = new snowglowlog();
	private void RegisterItem(Identifier identity, Item item) {
        Registry.register(Registry.ITEM, identity, item);
    }
    private void RegisterBlock(Identifier identity, Block block) {
        Registry.register(Registry.BLOCK, identity, block);
    }

    private void RegisterBlockWithItem(Identifier identity, Block block, BlockItem blockItem) {
        RegisterBlock(identity, block);
        RegisterItem(identity, blockItem);
    }

	@Override
	public void onInitialize() {
		RegisterBlockWithItem(new Identifier(MODID, "test_wood"), Test_Wood, new BlockItem(Test_Wood, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "cherry_leaves"), cherry_leaves, new BlockItem(cherry_leaves, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "cherry_log"), cherry_log, new BlockItem(cherry_log, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "cherry_planks"), Cherry_Planks, new BlockItem(Cherry_Planks, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "test_planks"), Test_Planks, new BlockItem(Test_Planks, new Item.Settings().group(LumberMore.Lumber)));
		RegisterItem(new Identifier(MODID, "test_axe"), new AxeBase(new ToolMaterialWood()));
		RegisterItem(new Identifier(MODID, "rukiry_axe"), new AxeBase(new ToolRukiryaxe()));
		RegisterItem(new Identifier(MODID, "many_axe"), new AxeBase(new ManyAxeTool()));
		RegisterItem(new Identifier(MODID, "fire_axe"), new AxeBase(new FireAxeTool()));
		RegisterItem(new Identifier(MODID, "piss_axe"), new AxeBase(new ToolPissAxe()));
		RegisterBlockWithItem(new Identifier(MODID, "cavecrawlerplanks"), cavecrawlerplanks, new BlockItem(cavecrawlerplanks, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "cavecrawlerlog"), cavecrawlerlog, new BlockItem(cavecrawlerlog, new Item.Settings().group(LumberMore.Lumber)));
		RegisterBlockWithItem(new Identifier(MODID, "snowglowlog"), snowglowlog, new BlockItem(snowglowlog, new Item.Settings().group(LumberMore.Lumber)));
	}
}