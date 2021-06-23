package net.lumbermore.tree;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class PissAxeBase extends AxeItem {

    public AxeBase() {
        super(toolMaterial_1, -1, -1.2f, new Item.Settings().group(lumbermore.general));
    }
}