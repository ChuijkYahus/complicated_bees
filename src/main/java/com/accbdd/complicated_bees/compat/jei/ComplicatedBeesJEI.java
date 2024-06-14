package com.accbdd.complicated_bees.compat.jei;

import com.accbdd.complicated_bees.genetics.Comb;
import com.accbdd.complicated_bees.genetics.Species;
import com.accbdd.complicated_bees.item.BeeItem;
import com.accbdd.complicated_bees.item.CombItem;
import com.accbdd.complicated_bees.registry.ItemsRegistration;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.ingredients.subtypes.IIngredientSubtypeInterpreter;
import mezz.jei.api.registration.ISubtypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import static com.accbdd.complicated_bees.ComplicatedBees.MODID;

@JeiPlugin
public class ComplicatedBeesJEI implements IModPlugin {
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(MODID, "jei_plugin");
    }

    @Override
    public void registerItemSubtypes(ISubtypeRegistration registration) {
        IIngredientSubtypeInterpreter<ItemStack> speciesInterpreter = (stack, context) -> {
            Lazy<Species> species = Lazy.of(() -> BeeItem.getSpecies(stack));
            return species.get().getId();
        };

        IIngredientSubtypeInterpreter<ItemStack> combInterpreter = (stack, context) -> {
            Lazy<Comb> comb = Lazy.of(() -> CombItem.getComb(stack));
            return comb.get().getId();
        };
        registration.registerSubtypeInterpreter(ItemsRegistration.DRONE.get(), speciesInterpreter);
        registration.registerSubtypeInterpreter(ItemsRegistration.QUEEN.get(), speciesInterpreter);
        registration.registerSubtypeInterpreter(ItemsRegistration.PRINCESS.get(), speciesInterpreter);
        registration.registerSubtypeInterpreter(ItemsRegistration.COMB.get(), combInterpreter);
    }
}