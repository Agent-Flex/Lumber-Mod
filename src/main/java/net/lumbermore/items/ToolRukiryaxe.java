package net.lumbermore.tree;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Item;

public class ToolRukiryaxe implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 10.1f;
    }

    @Override
    public int getDurability() {

        return 2196;
    }

    @Override
    public int getEnchantablility() {

        return 22;
    }

    @Override
    public int getMiningLevel() {

        return 3;
    }

    @Override
    public float getMiningSpeed() {

        return 10.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }
    }