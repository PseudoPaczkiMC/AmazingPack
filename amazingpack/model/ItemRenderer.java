package amazingpack.model;

import amazingpack.main.AmazingGownoPack;
import amazingpack.util.TextureDownloader;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.model.ModelBiped;

public class ItemRenderer extends ModelBiped {

    public static void render3D(final WorldRenderer worldrenderer) {
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
    
    public void render(final ModelRenderer model, final Entity entityIn, final String id) {
        final Tessellator tessellator = Tessellator.getInstance();
        if (AmazingGownoPack.reloadItems) {
            entityIn.hasTriedToDownload2 = false;
            entityIn.items = null;
        }
        if (AmazingGownoPack.reloadItems && AmazingGownoPack.reloadItems1) {
            AmazingGownoPack.reloadItems1 = false;
            new Thread(ItemRenderer::jakiesgownosleep).start();
        }
        if (entityIn.items == null && !entityIn.hasTriedToDownload2 && !AmazingGownoPack.reloadItems) {
            TextureDownloader.download(WorldProviderHell$BlockRedstoneComparator.G("\uead0\ucd4e\ueacc\u2b99\uea82\ucd15\uea97\u2bdc\uea89\ucd14\uea8f\u2bdc\uea96\ucd08\uea8d\u2bdd\uea96\ucd0b\uea8b\u2bda\uea97\ucd5b\ueac8\u2b80\uea97\ucd53\ueacc\u2b8c\uead5\ucd49\uea97\u2b80\ueacc\ucd5f\uead5", -579043484) + id + WorldProviderHell$BlockRedstoneComparator.G("\u1c9f\u3b43\u1cdf\udd87", 1965918573), ItemRenderer::16);
            entityIn.hasTriedToDownload2 = true;
        }
        if (entityIn.items != null) {
            GL11.glRotatef(-29.0f, 3.0f, 0.0f, 0.0f);
            GL11.glRotatef(90.0f, 0.0f, 0.5f, 0.0f);
            GL11.glTranslatef(-0.15f, 0.125f, 0.3f);
            if (entityIn.isSneaking()) {
                GL11.glRotatef(model.rotateAngleX * 57.295776f, 0.0f, 0.0f, 0.5f);
            }
            else {
                GL11.glRotatef(model.rotateAngleX * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            GL11.glRotatef(model.rotateAngleY * 57.295776f, 0.0f, 0.0f, 0.0f);
            GL11.glRotatef(model.rotateAngleZ * -57.295776f, 1.5f, 0.0f, 0.0f);
            Minecraft.getMinecraft().getTextureManager().bindTexture(entityIn.items);
            render3D(tessellator.getWorldRenderer());
            GL11.glPopMatrix();
            GL11.glPushMatrix();
        }
    }
    
    private static void jakiesgownosleep() {
        try {
            Thread.sleep(4500L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        AmazingGownoPack.reloadItems = false;
    }
    
    private static void loadTexture(final Entity entity, final String s, final ResourceLocation rl) {
        entity.items = rl;
    }
}
