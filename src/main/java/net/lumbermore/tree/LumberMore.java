package net.lumbermore.tree;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;
import net.lumbermore.items.ToolMaterialWood;
import net.lumbermore.items.AxeBase;
import net.lumbermore.items.ManyAxe;
import net.lumbermore.items.ManyAxeBase;
import net.lumbermore.items.ManyAxeTool;

public class LumberMore implements ModInitializer {

	public static final Item Test_Axe = new Item(new Item.Settings().group(ItemGroup.MISC));

	
    //Item Groups
    public static final ItemGroup Lumber = FabricItemGroupBuilder.build(
            new Identifier(lumbermore, "general"),
            () -> new ItemStack(lumbermore.test_axe2));

	public static final Block Test_Wood = new TestWood();
	public static final Block Test_Planks = new TestPlanks();
	public static final Block cherry_log = new CherryWood();

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
		RegisterBlockWithItem(new Identifier("lumbermore", "test_wood"), Test_Wood, new Identifier("lumbermore", "test_wood"), new BlockItem(Test_Wood, new Item.Settings().group(lumbermore.general)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_leaves"), Cherry_Leaves, new Identifier("lumbermore", "cherry_leaves"), new BlockItem(Cherry_Leaves, new Item.Settings().group(lumbermore.general)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_log"), Cherry_Log, new Identifier("lumbermore", "cherry_log"), new BlockItem(Cherry_Log, new Item.Settings().group(lumbermore.general)));
		RegisterBlockWithItem(new Identifier("lumbermore", "cherry_planks"), Cherry_Planks, new Identifier("lumbermore", "cherry_planks"), new BlockItem(Cherry_Planks, new Item.Settings().group(lumbermore.general)));
		RegisterBlockWithItem(new Identifier("lumbermore", "test_planks"), Test_Planks, new Identifier("lumbermore", "test_planks"), new BlockItem(Test_Planks, new Item.Settings().group(lumbermore.general)));
		RegisterItem(new Identifier("lumbermore", "test_axe2", new AxeBase(new ToolMaterialWood())));
		RegisterItem(new Identifier("lumbermore", "Rukiryaxe", new AxeBase(new ToolRukiryaxe())));
		RegisterItem(new Identifier("lumbermore", "ManyAxe", new AxeBase(new ManyAxeTool())));
		RegisterItem(new Identifier("lumbermore", "FireAxe", new AxeBase(new FireAxeTool())));
		RegisterItem(new Identifier("lumbermore", "PissAxe", new AxeBase(new PissAxeTool())));
	}
}