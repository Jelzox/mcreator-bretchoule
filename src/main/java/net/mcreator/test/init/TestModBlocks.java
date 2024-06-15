
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.WarpedWallBlock;
import net.mcreator.test.block.SpruceWallBlock;
import net.mcreator.test.block.SpruceLadderBlockBlock;
import net.mcreator.test.block.SmallPileOfStickBlock;
import net.mcreator.test.block.SimpleStickBlock;
import net.mcreator.test.block.OakWallBlock;
import net.mcreator.test.block.OakSecretTrapdoorBlock;
import net.mcreator.test.block.OakSecretDoorBlock;
import net.mcreator.test.block.OakAltSlabBlock;
import net.mcreator.test.block.NormalPileOfStickBlock;
import net.mcreator.test.block.LadderBlockBlock;
import net.mcreator.test.block.JungleWallBlock;
import net.mcreator.test.block.JungleLadderBlockBlock;
import net.mcreator.test.block.GrassSlabBlock;
import net.mcreator.test.block.GlassTrapdoorBlock;
import net.mcreator.test.block.GlassDoorBlock;
import net.mcreator.test.block.ExpeditionBlockBlock;
import net.mcreator.test.block.DirtSlabBlock;
import net.mcreator.test.block.DarkOakWallBlock;
import net.mcreator.test.block.CrimsonWallBlock;
import net.mcreator.test.block.BlockOfStickBlock;
import net.mcreator.test.block.BirchWallBlock;
import net.mcreator.test.block.BirchLadderBlockBlock;
import net.mcreator.test.block.BirchAltSlabBlock;
import net.mcreator.test.block.BigPileOfStickBlock;
import net.mcreator.test.block.AcaciaWallBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> OAK_ALT_SLAB = REGISTRY.register("oak_alt_slab", () -> new OakAltSlabBlock());
	public static final RegistryObject<Block> GLASS_DOOR = REGISTRY.register("glass_door", () -> new GlassDoorBlock());
	public static final RegistryObject<Block> GLASS_TRAPDOOR = REGISTRY.register("glass_trapdoor", () -> new GlassTrapdoorBlock());
	public static final RegistryObject<Block> OAK_SECRET_DOOR = REGISTRY.register("oak_secret_door", () -> new OakSecretDoorBlock());
	public static final RegistryObject<Block> OAK_SECRET_TRAPDOOR = REGISTRY.register("oak_secret_trapdoor", () -> new OakSecretTrapdoorBlock());
	public static final RegistryObject<Block> BIRCH_ALT_SLAB = REGISTRY.register("birch_alt_slab", () -> new BirchAltSlabBlock());
	public static final RegistryObject<Block> OAK_WALL = REGISTRY.register("oak_wall", () -> new OakWallBlock());
	public static final RegistryObject<Block> BIRCH_WALL = REGISTRY.register("birch_wall", () -> new BirchWallBlock());
	public static final RegistryObject<Block> JUNGLE_WALL = REGISTRY.register("jungle_wall", () -> new JungleWallBlock());
	public static final RegistryObject<Block> SPRUCE_WALL = REGISTRY.register("spruce_wall", () -> new SpruceWallBlock());
	public static final RegistryObject<Block> ACACIA_WALL = REGISTRY.register("acacia_wall", () -> new AcaciaWallBlock());
	public static final RegistryObject<Block> CRIMSON_WALL = REGISTRY.register("crimson_wall", () -> new CrimsonWallBlock());
	public static final RegistryObject<Block> WARPED_WALL = REGISTRY.register("warped_wall", () -> new WarpedWallBlock());
	public static final RegistryObject<Block> DIRT_SLAB = REGISTRY.register("dirt_slab", () -> new DirtSlabBlock());
	public static final RegistryObject<Block> EXPEDITION_BLOCK = REGISTRY.register("expedition_block", () -> new ExpeditionBlockBlock());
	public static final RegistryObject<Block> GRASS_SLAB = REGISTRY.register("grass_slab", () -> new GrassSlabBlock());
	public static final RegistryObject<Block> DARK_OAK_WALL = REGISTRY.register("dark_oak_wall", () -> new DarkOakWallBlock());
	public static final RegistryObject<Block> SMALL_PILE_OF_STICK = REGISTRY.register("small_pile_of_stick", () -> new SmallPileOfStickBlock());
	public static final RegistryObject<Block> NORMAL_PILE_OF_STICK = REGISTRY.register("normal_pile_of_stick", () -> new NormalPileOfStickBlock());
	public static final RegistryObject<Block> BIG_PILE_OF_STICK = REGISTRY.register("big_pile_of_stick", () -> new BigPileOfStickBlock());
	public static final RegistryObject<Block> SIMPLE_STICK = REGISTRY.register("simple_stick", () -> new SimpleStickBlock());
	public static final RegistryObject<Block> BLOCK_OF_STICK = REGISTRY.register("block_of_stick", () -> new BlockOfStickBlock());
	public static final RegistryObject<Block> LADDER_BLOCK = REGISTRY.register("ladder_block", () -> new LadderBlockBlock());
	public static final RegistryObject<Block> BIRCH_LADDER_BLOCK = REGISTRY.register("birch_ladder_block", () -> new BirchLadderBlockBlock());
	public static final RegistryObject<Block> SPRUCE_LADDER_BLOCK = REGISTRY.register("spruce_ladder_block", () -> new SpruceLadderBlockBlock());
	public static final RegistryObject<Block> JUNGLE_LADDER_BLOCK = REGISTRY.register("jungle_ladder_block", () -> new JungleLadderBlockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrassSlabBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			GrassSlabBlock.itemColorLoad(event);
		}
	}
}
