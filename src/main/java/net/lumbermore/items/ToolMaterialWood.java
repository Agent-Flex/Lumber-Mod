package net.lumbermore.tree;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Item;

public class ToolMaterialWood implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 12.1f;
    }

    @Override
    public int getDurability() {

        return 2098;
    }

    @Override
    public int getEnchantablility() {

        return 16;
    }

    @Override
    public int getMiningLevel() {

        return 4;
    }

    @Override
    public float getMiningSpeed() {

        return 9.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }
    }