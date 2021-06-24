package net.lumbermore.Bases;
import net.lumbermore.LumberMore;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class PissAxeBase extends AxeItem {

    public PissAxeBase(ToolMaterial material) {
        super(material, -1, -1f, new Item.Settings().group(LumberMore.Lumber));
    }
}