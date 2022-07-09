
package com.blocklegend001.vanillahammers.item;

import com.blocklegend001.vanillahammers.init.ModCreativeModeTab;
import com.blocklegend001.vanillahammers.procedures.HammerDestroy3x3;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class LapisHammer extends PickaxeItem {
	public LapisHammer() {
		super(new Tier() {
			public int getUses() {
				return 1126;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

				  public Ingredient getRepairIngredient() {
					  return Ingredient.of(new ItemStack(Items.LAPIS_LAZULI));
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
