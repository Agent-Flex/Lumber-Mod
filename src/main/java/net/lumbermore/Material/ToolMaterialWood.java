package net.lumbermore.items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

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
        return 4f;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 16;
    }
    }