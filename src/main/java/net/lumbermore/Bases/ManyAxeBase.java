package net.lumbermore.items;
import net.lumbermore.tree.LumberMore;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ManyAxeBase extends AxeItem {
    public ManyAxeBase(ToolMaterial material) {
        super(material, -1, -2.2f, new Item.Settings().group(LumberMore.Lumber));
        //TODO Auto-generated constructor stub
    }

    /*public AxeBase(ToolMaterial mat) {
        super(mat, -1, -2.2f, new Item.Settings().group(lumbermore.general));
    }*/
}