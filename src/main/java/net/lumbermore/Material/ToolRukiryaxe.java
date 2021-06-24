package net.lumbermore.Material;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

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
    public int getMiningLevel() {

        return 3;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 10f;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 22;
    }
    }