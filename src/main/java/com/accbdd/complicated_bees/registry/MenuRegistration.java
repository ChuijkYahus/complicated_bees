package com.accbdd.complicated_bees.registry;

import com.accbdd.complicated_bees.screen.*;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

import static com.accbdd.complicated_bees.ComplicatedBees.MODID;

public class MenuRegistration {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MODID);

    public static final Supplier<MenuType<CentrifugeMenu>> CENTRIFUGE_MENU = MENU_TYPES.register("centrifuge",
            () -> IForgeMenuType.create((windowId, inv, data) -> new CentrifugeMenu(windowId, inv.player, data.readBlockPos())));
    public static final Supplier<MenuType<ApiaryMenu>> APIARY_MENU = MENU_TYPES.register("apiary",
            () -> IForgeMenuType.create((windowId, inv, data) -> new ApiaryMenu(windowId, inv.player, data.readBlockPos())));
    public static final Supplier<MenuType<GeneratorMenu>> GENERATOR_MENU = MENU_TYPES.register("generator",
            () -> IForgeMenuType.create(((windowId, inv, data) -> new GeneratorMenu(windowId, inv.player, data.readBlockPos()))));
    public static final Supplier<MenuType<MicroscopeMenu>> MICROSCOPE_MENU = MENU_TYPES.register("microscope",
            () -> IForgeMenuType.create((windowId, inv, data) -> new MicroscopeMenu(windowId, inv.player, data.readBlockPos())));
    public static final Supplier<MenuType<AnalyzerMenu>> ANALYZER_MENU = MENU_TYPES.register("analyzer",
            () -> IForgeMenuType.create((windowId, playerInv, data) -> AnalyzerMenu.fromNetwork(windowId, playerInv)));

}
