
package com.esmods.keepersofthestonestwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CursedStoneBricksSlabBlock extends SlabBlock {
	public CursedStoneBricksSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.TUFF).strength(2.5f, 3f).dynamicShape());
	}
}
