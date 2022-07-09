
package com.blocklegend001.vanillahammers.item;

import com.blocklegend001.vanillahammers.init.ModCreativeModeTab;
import com.blocklegend001.vanillahammers.procedures.HammerDestroy3x3;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.world.item.Items.DIAMOND;

public class DiamondHammer extends PickaxeItem {
	public DiamondHammer() {
		super(new Tier() {
			public int getUses() { return 12350; }

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}


				  public Ingredient getRepairIngredient() {
					  return Ingredient.of(new ItemStack(Items.DIAMOND));
				  }
			  },

				1, -3.3f,

				new Item.Properties().tab(ModCreativeModeTab.VANILLAHAMMERS_TAB).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		HammerDestroy3x3.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
