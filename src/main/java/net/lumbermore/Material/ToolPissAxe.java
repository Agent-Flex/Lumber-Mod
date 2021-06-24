package net.lumbermore.Material;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

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
    public int getMiningLevel() {

        return 4;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 15f;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 22;
    }
    }