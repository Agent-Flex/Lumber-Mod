package net.lumbermore.items;

import net.lumbermore.tree.LumberMore;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class FireAxeBase extends AxeItem {

    public FireAxeBase(ToolMaterial material) {
        super(material, -1, -2.2f, new Item.Settings().group(LumberMore.Lumber));
    }
}