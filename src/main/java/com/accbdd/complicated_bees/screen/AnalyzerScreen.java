package com.accbdd.complicated_bees.screen;

import com.accbdd.complicated_bees.datagen.ItemTagGenerator;
import com.accbdd.complicated_bees.genetics.GeneticHelper;
import com.accbdd.complicated_bees.genetics.gene.IGene;
import com.accbdd.complicated_bees.registry.GeneRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

import static com.accbdd.complicated_bees.ComplicatedBees.MODID;

public class AnalyzerScreen extends AbstractContainerScreen<AnalyzerMenu> {
    private final ResourceLocation GUI = new ResourceLocation(MODID, "textures/gui/analyzer.png");

    public AnalyzerScreen(AnalyzerMenu container, Inventory inventory, Component title) {
        super(container, inventory, title);
        this.imageWidth = 232;
        this.imageHeight = 216;
    }

    @Override
    protected void renderLabels(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY) {
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTicks, int mouseX, int mouseY) {
        graphics.blit(GUI, leftPos, topPos, 0, 0, this.imageWidth, this.imageHeight);
        renderText(graphics);
    }

    @Override
    public void render(GuiGraphics graphics, int mousex, int mousey, float partialTick) {
        super.render(graphics, mousex, mousey, partialTick);
        renderTooltip(graphics, mousex, mousey);
    }

    @Override
    protected void renderTooltip(GuiGraphics graphics, int mousex, int mousey) {
        super.renderTooltip(graphics, mousex, mousey);
    }

    private void renderText(GuiGraphics graphics) {
        ItemStack bee = getMenu().getSlot(1).getItem();
        if (!bee.is(ItemTagGenerator.BEE)) {
            drawText(graphics, Component.literal("Need bee to analyze!"), 9, 9, 0xFFFFFF);
            return;
        }
        drawText(graphics, Component.literal("Active"), 69, 9, 0xFFFFFF);
        drawText(graphics, Component.literal("Inactive"), 128, 9, 0xFFFFFF);

        drawText(graphics, Component.literal("Lifespan"), 9, 24, 0xFFFFFF);
        drawGeneValues(graphics, bee, GeneRegistration.LIFESPAN.get(), 69, 128, 24);
    }

    private void drawText(GuiGraphics graphics, Component component, int x, int y, int color) {
        graphics.drawString(Minecraft.getInstance().font, component, x + leftPos, y + topPos, color, false);
    }

    private void drawGeneValues(GuiGraphics graphics, ItemStack bee, IGene<?> gene, int x, int x2, int y) {
        IGene<?> active = GeneticHelper.getGene(bee, GeneRegistration.GENE_REGISTRY.getKey(gene), true);
        IGene<?> inactive = GeneticHelper.getGene(bee, GeneRegistration.GENE_REGISTRY.getKey(gene), false);
        drawText(graphics, active.getTranslationKey(), x, y, active.isDominant() ? 0xE63225 : 0x257FE6);
        drawText(graphics, inactive.getTranslationKey(), x2, y, inactive.isDominant() ? 0xE63225 : 0x257FE6);
    }
}