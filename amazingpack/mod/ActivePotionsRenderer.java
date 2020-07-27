package amazingpack.mod;

import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.Minecraft;

public class ActivePotionsRenderer
{
    private final Minecraft mc;
    public boolean showIcon;
    public int x;
    public int y;
    
    public ActivePotionsRenderer(final Minecraft mc) {
        this.showIcon = true;
        this.x = 1;
        this.y = 1;
        this.mc = mc;
    }
    
    public static void draw(final int x, final int y, final int u, final int v, final int width, final int height, final float zLevel) {
        final float f = 0.00390625f;
        final float f2 = 0.00390625f;
        final Tessellator tessellator = Tessellator.getInstance();
        final WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_TEX);
        worldRenderer.pos(x, y + height, zLevel).tex(u * f, (v + height) * f2).endVertex();
        worldRenderer.pos(x + width, y + height, zLevel).tex((u + width) * f, (v + height) * f2).endVertex();
        worldRenderer.pos(x + width, y, zLevel).tex((u + width) * f, v * f2).endVertex();
        worldRenderer.pos(x, y, zLevel).tex(u * f, v * f2).endVertex();
        tessellator.draw();
    }
    
    public void render() {
        if (!this.mc.thePlayer.getActivePotionEffects().isEmpty()) {
            final int l = 33;
            int l2 = 0;
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableLighting();
            for (final PotionEffect effect : this.mc.thePlayer.getActivePotionEffects()) {
                final Potion potion = Potion.potionTypes[effect.getPotionID()];
                if (this.showIcon && potion.hasStatusIcon()) {
                    final int i1 = potion.getStatusIconIndex();
                    this.mc.getTextureManager().bindTexture(new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\u2ed9\u0946\u2ed5\uef06\u2ed8\u0951\u2ec8\uef01\u2e82\u0944\u2ed8\uef1b\u2e82\u0940\u2ec2\uef1c\u2ed9\u0942\u2ec4\uef1c\u2ec8\u0951\u2e82\uef1b\u2ec3\u0955\u2ec8\uef1c\u2ed9\u094c\u2edf\uef0b\u2e83\u0953\u2ec3\uef15", -590038214)));
                    draw(this.x + 6, this.y + l2 + 7, i1 % 8 * 18, 198 + i1 / 8 * 18, 18, 18, -150.0f);
                }
                String s1 = I18n.format(potion.getName(), new Object[0]);
                if (effect.getAmplifier() == 1) {
                    s1 = String.valueOf(s1) + WorldProviderHell$BlockRedstoneComparator.G("\ubedd\u993a\ubeb4", -1497617558);
                }
                else if (effect.getAmplifier() == 2) {
                    s1 = String.valueOf(s1) + WorldProviderHell$BlockRedstoneComparator.G("\uee3d\uc9da\uee54\u2f8b", 1824226186);
                }
                else if (effect.getAmplifier() == 3) {
                    s1 = String.valueOf(s1) + WorldProviderHell$BlockRedstoneComparator.G("\u89bf\uae58\u89c9", 741219336);
                }
                Minecraft.fontRendererObj.drawStringWithShadow(s1, (float)(this.x + 10 + 18), (float)(this.y + l2 + 6), 16777215);
                final String s2 = Potion.getDurationString(effect);
                Minecraft.fontRendererObj.drawStringWithShadow(s2, (float)(this.x + 10 + 18), (float)(this.y + l2 + 6 + 10), 8355711);
                l2 += l;
            }
        }
    }
}
