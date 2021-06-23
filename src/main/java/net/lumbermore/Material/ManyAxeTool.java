package net.lumbermore.items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

public class ManyAxeTool implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 15.1f;
    }

    @Override
    public int getDurability() {

        return 3976;
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
        return 0;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 22;
    }
    }