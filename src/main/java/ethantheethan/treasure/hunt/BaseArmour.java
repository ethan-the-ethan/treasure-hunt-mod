package ethantheethan.treasure.hunt;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class BaseArmour extends ArmorItem {
	public BaseArmour(ArmorMaterial material, EquipmentSlot slot) {
		super(material, slot, new Item.Settings().group(TreasureHunt.ITEM_GROUP).rarity(Rarity.RARE));
	}
}