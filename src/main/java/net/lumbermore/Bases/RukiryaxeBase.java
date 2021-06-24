package net.lumbermore.Bases;
import net.lumbermore.LumberMore;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class RukiryaxeBase extends AxeItem {

    public RukiryaxeBase(ToolMaterial material) {
        super(material, -1, -1.8f, new Item.Settings().group(LumberMore.Lumber));
    }
}