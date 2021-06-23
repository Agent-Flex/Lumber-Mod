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
import net.lumbermore.items.test_axe;
import net.lumbermore.items.ManyAxe;
import net.lumbermore.items.ManyAxeBase;
import net.lumbermore.items.ManyAxeTool;

public class LumberMore implements ModInitializer {

	public static final Item Test_Axe = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block Test_Wood = new TestWood();
	public static final Block Test_Planks = new TestPlanks();
	public static final Block cherry_log = new CherryWood();

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "test_axe"), Test_Axe);
		Registry.register(Registry.BLOCK, new Identifier("lumbermore", "test_wood"), Test_Wood);
		Registry.register(Registry.BLOCK, new Identifier("lumbermore", "cherry_log"), Cherry_Log);
		Registry.register(Registry.BLOCK, new Identifier("lumbermore", "test_planks"), Test_Planks);
		Registry.register(Registry.BLOCK, new Identifier("lumbermore", "cherry_planks"), Cherry_Planks);
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "cherry_planks"), new BlockItem(Cherry_Planks, new Item.settings().group(ItemGroup.BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "test_planks"), new BlockItem(Test_Planks, new Item.Settings().group(ItemGroup.BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "cherry_log"), new BlockItem(Cherry_Log, new Item.Settings().group(ItemGroup.BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "test_wood"), new BlockItem(Test_Wood, new Item.Settings().group(ItemGroup.BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "test_axe2", new AxeBase(new ToolMaterialWood()));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "Rukiryaxe", new AxeBase(new ToolRukiryaxe()));
		Registry.register(Registry.ITEM, new Identifier("lumbermore", "ManyAxe", new AxeBase(new ManyAxeTool()));
	}
}
