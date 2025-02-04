package com.accbdd.complicated_bees.registry;

import com.accbdd.complicated_bees.genetics.gene.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryBuilder;

import java.util.function.Supplier;

import static com.accbdd.complicated_bees.ComplicatedBees.MODID;

public class GeneRegistration {
    public static final ResourceLocation GENE_REGISTRY_KEY = new ResourceLocation(MODID, "gene");
    public static final RegistryBuilder<IGene<?>> GENE_REGISTRY = RegistryBuilder.of(GENE_REGISTRY_KEY);

    //every registered gene should be registered as a 'default' value
    public static final DeferredRegister<IGene<?>> GENES = DeferredRegister.create(GENE_REGISTRY_KEY, MODID);
    public static final Supplier<GeneSpecies> SPECIES = GENES.register(GeneSpecies.TAG, GeneSpecies::new);
    public static final Supplier<GeneLifespan> LIFESPAN = GENES.register(GeneLifespan.TAG, GeneLifespan::new);
    public static final Supplier<GeneTemperature> TEMPERATURE = GENES.register(GeneTemperature.TAG, GeneTemperature::new);
    public static final Supplier<GeneHumidity> HUMIDITY = GENES.register(GeneHumidity.TAG, GeneHumidity::new);
    public static final Supplier<GeneFlower> FLOWER = GENES.register(GeneFlower.TAG, GeneFlower::new);
    public static final Supplier<GeneFertility> FERTILITY = GENES.register(GeneFertility.TAG, GeneFertility::new);
    public static final Supplier<GeneProductivity> PRODUCTIVITY = GENES.register(GeneProductivity.TAG, GeneProductivity::new);
    public static final Supplier<GeneTerritory> TERRITORY = GENES.register(GeneTerritory.TAG, GeneTerritory::new);
    public static final Supplier<GeneEffect> EFFECT = GENES.register(GeneEffect.TAG, GeneEffect::new);
    public static final Supplier<GeneActiveTime> ACTIVE_TIME = GENES.register(GeneActiveTime.TAG, GeneActiveTime::new);

    public static final Supplier<GeneBoolean> CAVE_DWELLING = GENES.register("cave_dwelling", () -> new GeneBoolean(false, true));
    public static final Supplier<GeneBoolean> WEATHERPROOF = GENES.register("weatherproof", () -> new GeneBoolean(false, true));
}
