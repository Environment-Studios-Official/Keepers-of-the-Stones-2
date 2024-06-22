
package com.esmods.keepersofthestonestwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PolishedCursedStoneBlock extends Block {
	public PolishedCursedStoneBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.TUFF).strength(2.5f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
