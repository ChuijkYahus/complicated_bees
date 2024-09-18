package com.accbdd.complicated_bees.registry;

import com.accbdd.complicated_bees.genetics.BeeHousingModifier;
import com.accbdd.complicated_bees.genetics.gene.enums.EnumTolerance;
import com.accbdd.complicated_bees.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.accbdd.complicated_bees.ComplicatedBees.MODID;

public class ItemsRegistration {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<DroneItem> DRONE = ITEMS.registerItem("drone", DroneItem::new);
    public static final DeferredItem<PrincessItem> PRINCESS = ITEMS.registerItem("princess", PrincessItem::new);
    public static final DeferredItem<QueenItem> QUEEN = ITEMS.registerItem("queen", QueenItem::new);
    public static final DeferredItem<CombItem> COMB = ITEMS.registerItem("comb", CombItem::new);
    public static final DeferredItem<ScoopItem> SCOOP = ITEMS.registerItem("scoop", ScoopItem::new);
    public static final DeferredItem<MeterItem> METER = ITEMS.registerItem("meter", MeterItem::new);
    public static final DeferredItem<AnalyzerItem> ANALYZER = ITEMS.registerItem("analyzer", AnalyzerItem::new);
    public static final DeferredItem<ExpDropItem> EXP_DROP = ITEMS.registerItem("exp_drop", ExpDropItem::new);

    public static final DeferredItem<Item> HONEY_DROPLET = ITEMS.registerSimpleItem("honey_droplet");
    public static final DeferredItem<Item> ROYAL_JELLY = ITEMS.registerSimpleItem("royal_jelly");
    public static final DeferredItem<Item> POLLEN = ITEMS.registerSimpleItem("pollen");
    public static final DeferredItem<Item> PROPOLIS = ITEMS.registerSimpleItem("propolis");
    public static final DeferredItem<BeeswaxItem> BEESWAX = ITEMS.registerItem("beeswax", BeeswaxItem::new);
    public static final DeferredItem<Item> PEARL_SHARD = ITEMS.registerSimpleItem("pearl_shard");

    public static final DeferredItem<FrameItem> FRAME = ITEMS.registerItem("frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.NONE, 1.1f, 1f)));
    public static final DeferredItem<FrameItem> THICK_FRAME = ITEMS.registerItem("thick_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.NONE, 1f, 1.1f)));
    public static final DeferredItem<FrameItem> COLD_FRAME = ITEMS.registerItem("cold_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.DOWN_1, EnumTolerance.NONE, 0.8f, 1f)));
    public static final DeferredItem<FrameItem> HOT_FRAME = ITEMS.registerItem("hot_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.UP_1, EnumTolerance.NONE, 0.8f, 1f)));
    public static final DeferredItem<FrameItem> DRY_FRAME = ITEMS.registerItem("dry_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.DOWN_1, 0.8f, 1f)));
    public static final DeferredItem<FrameItem> MOIST_FRAME = ITEMS.registerItem("moist_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.UP_1, 0.8f, 1f)));
    public static final DeferredItem<FrameItem> DEADLY_FRAME = ITEMS.registerItem("deadly_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.NONE, 0.1f, 1f)));
    public static final DeferredItem<FrameItem> RESTRICTIVE_FRAME = ITEMS.registerItem("restrictive_frame",
            (prop) -> new FrameItem(prop.durability(50), new BeeHousingModifier(EnumTolerance.NONE, EnumTolerance.NONE, 1f, 1f)));

    public static final DeferredItem<BlockItem> BEE_NEST = ITEMS.registerItem("bee_nest", BeeNestBlockItem::new);
    public static final DeferredItem<BlockItem> APIARY = ITEMS.registerSimpleBlockItem("apiary", BlocksRegistration.APIARY);
    public static final DeferredItem<BlockItem> CENTRIFUGE = ITEMS.registerSimpleBlockItem("centrifuge", BlocksRegistration.CENTRIFUGE);
    public static final DeferredItem<BlockItem> GENERATOR = ITEMS.registerSimpleBlockItem("generator", BlocksRegistration.GENERATOR);
    public static final DeferredItem<BlockItem> WAX_BLOCK = ITEMS.registerSimpleBlockItem("wax_block", BlocksRegistration.WAX_BLOCK);
    public static final DeferredItem<BlockItem> WAX_BLOCK_STAIRS = ITEMS.registerSimpleBlockItem("wax_block_stairs", BlocksRegistration.WAX_BLOCK_STAIRS);
    public static final DeferredItem<BlockItem> WAX_BLOCK_SLAB = ITEMS.registerSimpleBlockItem("wax_block_slab", BlocksRegistration.WAX_BLOCK_SLAB);
    public static final DeferredItem<BlockItem> WAX_BLOCK_WALL = ITEMS.registerSimpleBlockItem("wax_block_wall", BlocksRegistration.WAX_BLOCK_WALL);
    public static final DeferredItem<BlockItem> SMOOTH_WAX = ITEMS.registerSimpleBlockItem("smooth_wax", BlocksRegistration.SMOOTH_WAX);
    public static final DeferredItem<BlockItem> SMOOTH_WAX_STAIRS = ITEMS.registerSimpleBlockItem("smooth_wax_stairs", BlocksRegistration.SMOOTH_WAX_STAIRS);
    public static final DeferredItem<BlockItem> SMOOTH_WAX_SLAB = ITEMS.registerSimpleBlockItem("smooth_wax_slab", BlocksRegistration.SMOOTH_WAX_SLAB);
    public static final DeferredItem<BlockItem> SMOOTH_WAX_WALL = ITEMS.registerSimpleBlockItem("smooth_wax_wall", BlocksRegistration.SMOOTH_WAX_WALL);
    public static final DeferredItem<BlockItem> WAX_BRICKS = ITEMS.registerSimpleBlockItem("wax_bricks", BlocksRegistration.WAX_BRICKS);
    public static final DeferredItem<BlockItem> WAX_BRICK_STAIRS = ITEMS.registerSimpleBlockItem("wax_brick_stairs", BlocksRegistration.WAX_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> WAX_BRICK_SLAB = ITEMS.registerSimpleBlockItem("wax_brick_slab", BlocksRegistration.WAX_BRICK_SLAB);
    public static final DeferredItem<BlockItem> WAX_BRICK_WALL = ITEMS.registerSimpleBlockItem("wax_brick_wall", BlocksRegistration.WAX_BRICK_WALL);
    public static final DeferredItem<BlockItem> CHISELED_WAX = ITEMS.registerSimpleBlockItem("chiseled_wax", BlocksRegistration.CHISELED_WAX);
    public static final DeferredItem<BlockItem> HONEYED_PLANKS = ITEMS.registerSimpleBlockItem("honeyed_planks", BlocksRegistration.HONEYED_PLANKS);
    public static final DeferredItem<BlockItem> HONEYED_STAIRS = ITEMS.registerSimpleBlockItem("honeyed_stairs", BlocksRegistration.HONEYED_STAIRS);
    public static final DeferredItem<BlockItem> HONEYED_SLAB = ITEMS.registerSimpleBlockItem("honeyed_slab", BlocksRegistration.HONEYED_SLAB);
    public static final DeferredItem<BlockItem> HONEYED_FENCE = ITEMS.registerSimpleBlockItem("honeyed_fence", BlocksRegistration.HONEYED_FENCE);
    public static final DeferredItem<BlockItem> HONEYED_FENCE_GATE = ITEMS.registerSimpleBlockItem("honeyed_fence_gate", BlocksRegistration.HONEYED_FENCE_GATE);
    public static final DeferredItem<BlockItem> HONEYED_BUTTON = ITEMS.registerSimpleBlockItem("honeyed_button", BlocksRegistration.HONEYED_BUTTON);
    public static final DeferredItem<BlockItem> HONEYED_PRESSURE_PLATE = ITEMS.registerSimpleBlockItem("honeyed_pressure_plate", BlocksRegistration.HONEYED_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> HONEYED_DOOR = ITEMS.register("honeyed_door", () -> new DoubleHighBlockItem(BlocksRegistration.HONEYED_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> HONEYED_TRAPDOOR = ITEMS.registerSimpleBlockItem("honeyed_trapdoor", BlocksRegistration.HONEYED_TRAPDOOR);
}
