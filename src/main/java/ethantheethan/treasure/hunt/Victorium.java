package ethantheethan.treasure.hunt;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class Victorium implements ArmorMaterial{
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
		return Ingredient.ofItems(RegisterItems.X);
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "name";
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

public static class RegisterItems {
     
    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new Victorium();
    public static final Item CUSTOM_MATERIAL = new Victorium(new Item.Settings().group(TreasureHunt.ITEM_GROUP));
    // If you made a new material, this is where you would note it.
    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(TreasureHunt.ITEM_GROUP));
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(TreasureHunt.ITEM_GROUP));
    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(TreasureHunt.ITEM_GROUP));
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(TreasureHunt.ITEM_GROUP));
 
}