package ethantheethan.treasure.hunt;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class Victorium implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {1, 1, 0, 0};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 1;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 0;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems();
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "victorium";
	}
 
	@Override
	public float getToughness() {
		return 0;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}

