package net.lumbermore.Material;

import net.lumbermore.LumberMore;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
public class FUCKFUCKFUCK implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[] {2, 5, 6, 3};
    
    @Override
    public int getDurability(EquipmentSlot arg0) {
        // TODO Auto-generated method stub
        return BASE_DURABILITY[arg0.getEntitySlotId()]*25;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 19;
    }

    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return SoundEvents.ENTITY_ENDER_DRAGON_DEATH;
    }

    @Override
    public float getKnockbackResistance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "god";
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        // TODO Auto-generated method stub
        return PROTECTION_AMOUNT[arg0.getEntitySlotId()];
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(LumberMore.cherry_log);
    }

    @Override
    public float getToughness() {
        // TODO Auto-generated method stub
        return 2;
    }

    
}