package net.lumbermore.tree;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ManyAxeBase extends AxeItem {

    public AxeBase() {
        super(toolMaterial_1, -1, -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}