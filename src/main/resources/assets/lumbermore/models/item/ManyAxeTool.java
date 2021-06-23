package net.lumbermore.tree;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Item;

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
    public int getEnchantablility() {

        return 22;
    }

    @Override
    public int getMiningLevel() {

        return 3;
    }

    @Override
    public float getMiningSpeed() {

        return 3.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIRT);
    }
    }