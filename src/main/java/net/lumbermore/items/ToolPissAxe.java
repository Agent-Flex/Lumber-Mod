package net.lumbermore.tree;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Item;

public class ToolPissAxe implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 20.1f;
    }

    @Override
    public int getDurability() {

        return 21196;
    }

    @Override
    public int getEnchantablility() {

        return 22;
    }

    @Override
    public int getMiningLevel() {

        return 4;
    }

    @Override
    public float getMiningSpeed() {

        return 15.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }
    }