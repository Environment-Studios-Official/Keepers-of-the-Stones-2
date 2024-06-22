
package com.esmods.keepersofthestonestwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class CursedStoneStairsBlock extends StairBlock {
	public CursedStoneStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.TUFF).strength(2.5f, 3f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
