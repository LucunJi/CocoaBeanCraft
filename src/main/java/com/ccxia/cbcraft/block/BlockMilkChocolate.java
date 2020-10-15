package com.ccxia.cbcraft.block;

import com.ccxia.cbcraft.CbCraft;
import com.ccxia.cbcraft.creativetab.CreativeTabsCbCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMilkChocolate extends Block {
	public BlockMilkChocolate() {
		super(Material.ROCK);
		this.setUnlocalizedName(CbCraft.MODID + ".milkChocolateBlock");
		this.setRegistryName("milk_chocolate_block");
		this.setCreativeTab(CreativeTabsCbCraft.tabCbCraft);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
	}
}
