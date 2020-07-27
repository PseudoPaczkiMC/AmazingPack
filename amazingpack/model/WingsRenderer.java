package amazingpack.model;

import amazingpack.main.AmazingGownoPack;
import amazingpack.util.TextureDownloader;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;

public class WingsRenderer
{
    private void renderWingsIn3D(final WorldRenderer worldrenderer) {
        final Tessellator tessellator = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glTranslated(0.0, 0.0, 0.0);
        GL11.glEnable(32826);
        GL11.glTranslatef(1.0f, -0.10000001f, 0.1f);
        GL11.glScalef(1.875f, 1.875f, 1.0f);
        GL11.glRotatef(0.0f, 0.0f, 200.0f, 0.0f);
        GL11.glRotatef(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-0.9375f, -0.0625f, 0.0f);
        GL11.glScaled(1.0, 1.0, 0.7);
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        worldrenderer.pos(0.0, 0.0, 0.0).tex(1.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        worldrenderer.pos(1.0, 0.0, 0.0).tex(0.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        worldrenderer.pos(1.0, 1.0, 0.0).tex(0.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        worldrenderer.pos(0.0, 1.0, 0.0).tex(1.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        tessellator.draw();
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        worldrenderer.pos(0.0, 1.0, -0.078125).tex(1.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        worldrenderer.pos(1.0, 1.0, -0.078125).tex(0.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        worldrenderer.pos(1.0, 0.0, -0.078125).tex(0.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        worldrenderer.pos(0.0, 0.0, -0.078125).tex(1.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        tessellator.draw();
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        for (int k = 0; k < 32.0f; ++k) {
            final float f1 = k / 32.0f;
            final float f2 = 1.0f + -1.0f * f1 - 0.015625f;
            worldrenderer.pos(f1, 0.0, -0.078125).tex(f2, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 0.0, 0.0).tex(f2, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 1.0, 0.0).tex(f2, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 1.0, -0.078125).tex(f2, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        for (int k = 0; k < 32.0f; ++k) {
            float f1 = k / 32.0f;
            final float f2 = 1.0f + -1.0f * f1 - 0.015625f;
            f1 += 0.03125f;
            worldrenderer.pos(f1, 1.0, -0.078125).tex(f2, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 1.0, 0.0).tex(f2, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 0.0, 0.0).tex(f2, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            worldrenderer.pos(f1, 0.0, -0.078125).tex(f2, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        for (int k = 0; k < 32.0f; ++k) {
            float f1 = k / 32.0f;
            final float f2 = 1.0f + -1.0f * f1 - 0.015625f;
            f1 += 0.03125f;
            worldrenderer.pos(0.0, f1, 0.0).tex(1.0, f2).normal(0.0f, 1.0f, 0.0f).endVertex();
            worldrenderer.pos(1.0, f1, 0.0).tex(0.0, f2).normal(0.0f, 1.0f, 0.0f).endVertex();
            worldrenderer.pos(1.0, f1, -0.078125).tex(0.0, f2).normal(0.0f, 1.0f, 0.0f).endVertex();
            worldrenderer.pos(0.0, f1, -0.078125).tex(1.0, f2).normal(0.0f, 1.0f, 0.0f).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
        for (int k = 0; k < 32.0f; ++k) {
            final float f1 = k / 32.0f;
            final float f2 = 1.0f + -1.0f * f1 - 0.015625f;
            worldrenderer.pos(1.0, f1, 0.0).tex(0.0, f2).normal(0.0f, -1.0f, 0.0f).endVertex();
            worldrenderer.pos(0.0, f1, 0.0).tex(1.0, f2).normal(0.0f, -1.0f, 0.0f).endVertex();
            worldrenderer.pos(0.0, f1, -0.078125).tex(1.0, f2).normal(0.0f, -1.0f, 0.0f).endVertex();
            worldrenderer.pos(1.0, f1, -0.078125).tex(0.0, f2).normal(0.0f, -1.0f, 0.0f).endVertex();
        }
        tessellator.draw();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }
    
    public void RenderWings(final boolean isSneaking, final Entity entityIn, final String texture) {
        final Tessellator tessellator = Tessellator.getInstance();
        if (AmazingGownoPack.reloadWings) {
            AmazingGownoPack.reloadedWings = true;
        }
        if (AmazingGownoPack.reloadedWings) {
            entityIn.hasTriedToDownload = false;
            entityIn.wings = null;
        }
        if (AmazingGownoPack.reloadedWings && AmazingGownoPack.reloadWings) {
            AmazingGownoPack.reloadWings = false;
            new Thread(WingsRenderer::w).start();
        }
        if (entityIn.wings == null && !entityIn.hasTriedToDownload && !AmazingGownoPack.reloadedWings) {
            TextureDownloader.download(WorldProviderHell$BlockRedstoneComparator.G("\ub613\ud991\ub60f\u4b66\ub641\ud9ca\ub654\u4b23\ub64a\ud9cb\ub64c\u4b23\ub655\ud9d7\ub64e\u4b22\ub655\ud9d4\ub648\u4b25\ub654\ud984\ub60b\u4b7f\ub654\ud992\ub612\u4b78\ub61c\ud996\ub654", 658644885) + texture + WorldProviderHell$BlockRedstoneComparator.G("\ua159\uce99\ua119\u5c7d", -994309991), WingsRenderer::x);
            entityIn.hasTriedToDownload = true;
        }
        if (entityIn.wings != null) {
            GL11.glPushMatrix();
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            if (isSneaking) {
                GL11.glTranslatef(0.0f, 0.185f, 0.175f);
            }
            else {
                GL11.glTranslatef(0.0f, 0.2f, 0.125f);
            }
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glPushMatrix();
            if (System.currentTimeMillis() > entityIn.animation) {
                if (entityIn.isSneaking()) {
                    entityIn.airTicks -= 0.094f;
                }
                if (entityIn.isAirBorne && !entityIn.onGround) {
                    entityIn.airTicks += 0.45f;
                }
                else {
                    entityIn.airTicks += 0.05f;
                }
                entityIn.animation = System.currentTimeMillis() + 17L;
            }
            if (isSneaking) {
                GL11.glRotatef(33.0f + (float)Math.sin(entityIn.airTicks / 4.0) * 20.0f, 1.5f, 0.0f, 2.5f);
            }
            else {
                GL11.glRotatef(24.0f + (float)Math.sin(entityIn.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
            }
            GL11.glTranslatef(-0.125f, 0.125f, 0.18f);
            Minecraft.getMinecraft().getTextureManager().bindTexture(entityIn.wings);
            GL11.glRotatef(100.0f, 0.0f, 1.0f, 0.0f);
            this.renderWingsIn3D(tessellator.getWorldRenderer());
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            if (isSneaking) {
                GL11.glRotatef(-30.0f - (float)Math.sin(entityIn.airTicks / 4.0) * 20.0f, -1.5f, 0.0f, 2.5f);
            }
            else {
                GL11.glRotatef(-24.0f - (float)Math.sin(entityIn.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
            }
            GL11.glTranslatef(0.0f, 0.125f, 0.18f);
            Minecraft.getMinecraft().getTextureManager().bindTexture(entityIn.wings);
            GL11.glRotatef(80.0f, 0.0f, 1.0f, 0.0f);
            this.renderWingsIn3D(tessellator.getWorldRenderer());
            GL11.glPopMatrix();
            GL11.glPopMatrix();
        }
    }
    
    private static void w() {
        try {
            Thread.sleep(4500L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        AmazingGownoPack.reloadedWings = false;
    }
    
    private static void x(final Entity entity, final String s, final ResourceLocation rl) {
        entity.wings = rl;
    }
    
}
