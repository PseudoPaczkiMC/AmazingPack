package amazingpack.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBiped;

public class GuiCrownHat extends ModelBiped
{
    private ModelRenderer crownDiamond;
    private ModelRenderer crown;
    public static boolean s;
    private static final ResourceLocation texture;
    public static boolean u;
    public static float v;
    
    static {
        GuiCrownHat.s = true;
        texture = new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\ucb7b\ud6e8\ucb77\ufddd\ucb7a\ud6ff\ucb6a\ufdda\ucb20\ud6f4\ucb60\ufdc0\ucb7f\ud6ec\ucb6c\ufdc2\ucb20\ud6ee\ucb63\ufdc0\ucb6a\ud6e3\ucb7b\ufd86\ucb67\ud6ec\ucb7b\ufd86\ucb67\ud6ec\ucb7b\ufd9b\ucb21\ud6fd\ucb61\ufdce", -118511150));
        GuiCrownHat.u = true;
        GuiCrownHat.v = 0.02f;
    }
    
    public GuiCrownHat() {
        this.crown = new ModelRenderer(this, 0, 0).setTextureSize(22, 7);
        this.crown.setTextureOffset(4, 0).addBox(-4.0f, 0.0f, -5.0f, 8, 2, 1, GuiCrownHat.v);
        this.crown.setTextureOffset(0, 0).addBox(-5.0f, -2.0f, -5.0f, 1, 4, 1, GuiCrownHat.v);
        this.crown.setTextureOffset(0, 5).addBox(-4.0f, -1.0f, -5.0f, 1, 1, 1, GuiCrownHat.v);
        this.crown.setTextureOffset(0, 5).addBox(3.0f, -1.0f, -5.0f, 1, 1, 1, GuiCrownHat.v);
        this.crown.setTextureOffset(4, 5).addBox(-1.5f, -1.0f, -5.0f, 3, 1, 1, GuiCrownHat.v);
        this.crown.setTextureOffset(0, 5).addBox(-0.5f, -2.0f, -5.0f, 1, 1, 1, GuiCrownHat.v);
        this.crown.isHidden = true;
        (this.crownDiamond = new ModelRenderer(this, 12, 5).setTextureSize(22, 7)).addBox(-0.5f, -0.0f, -6.0f, 1, 1, 1, GuiCrownHat.v);
        this.crownDiamond.rotateAngleZ = 0.8f;
        this.crownDiamond.rotationPointZ = 0.5f;
        this.crownDiamond.rotationPointX = 0.4f;
        this.crownDiamond.isHidden = true;
    }
    
    public void render(final float scale, final Entity entityIn) {
        if (GuiCrownHat.u) {
            final AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)entityIn;
            final float f1 = calculatePosition(abstractclientplayer, GuiCrownHat.v);
            final float f2 = getRotation(abstractclientplayer, GuiCrownHat.v);
            final ResourceLocation resourcelocation = abstractclientplayer.getLocationSkin();
            for (int i = 0; i < 4; ++i) {
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0f, 1.0f, 1.0f);
                GlStateManager.rotate(f1, 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(f2, 1.0f, 0.0f, 0.0f);
                final float f3 = 1.085f;
                GlStateManager.scale(f3, f3, f3);
                if (entityIn.isSneaking()) {
                    final float f4 = entityIn.rotationPitch * -7.0E-4f;
                    GlStateManager.translate(0.0, 0.06f - Math.abs(f4) + 0.02, f4);
                }
                GlStateManager.rotate((float)(90 * i), 0.0f, 1.0f, 0.0f);
                GlStateManager.translate(0.0, -0.4753, 0.0);
                Minecraft.getMinecraft().getTextureManager().bindTexture(GuiCrownHat.texture);
                this.crown.isHidden = false;
                this.crown.render(0.0571f);
                this.crown.isHidden = true;
                this.crownDiamond.isHidden = false;
                this.crownDiamond.rotateAngleZ = 0.8f;
                this.crownDiamond.rotationPointZ = 0.6f;
                this.crownDiamond.rotationPointX = 0.4f;
                GlStateManager.translate(-0.22f, 0.0f, 0.0f);
                GlStateManager.color(1.0f, 1.0f, 1.0f);
                final float f5 = 1.0f;
                GL11.glColor4f(0.01f, 0.01f, 0.01f, 0.5f);
                for (int k1 = 0; k1 < 3; ++k1) {
                    this.crownDiamond.render(0.0561f);
                    GlStateManager.translate(0.218f, 0.0f, 0.0f);
                }
                GL11.glColor3d(1.0, 1.0, 1.0);
                GlStateManager.color(1.0f, 1.0f, 1.0f);
                this.crownDiamond.isHidden = true;
                GlStateManager.popMatrix();
            }
        }
    }

    //info od vexia, gownie jebany veniks na chuj tu static jebany pseudolu

    public static float interpolateRotation(final float par1, final float par2, final float par3) {
        if (Minecraft.getMinecraft().thePlayer != null) {
            float f;
            for (f = par2 - par1; f < -180.0f; f += 360.0f) {}
            while (f >= 180.0f) {
                f -= 360.0f;
            }
            return par1 + par3 * f;
        }
        return 0.0f;
    }
    
    public static float calculatePosition(final AbstractClientPlayer clientPlayer, final float partialTicks) {
        if (Minecraft.getMinecraft().thePlayer != null) {
            float f = interpolateRotation(clientPlayer.prevRenderYawOffset, clientPlayer.renderYawOffset, partialTicks);
            final float f2 = interpolateRotation(clientPlayer.prevRotationYawHead, clientPlayer.rotationYawHead, partialTicks);
            float f3 = f2 - f;
            if (clientPlayer.isRiding() && clientPlayer.ridingEntity instanceof EntityLivingBase) {
                final EntityLivingBase entitylivingbase = (EntityLivingBase)clientPlayer.ridingEntity;
                f = interpolateRotation(entitylivingbase.prevRenderYawOffset, entitylivingbase.renderYawOffset, partialTicks);
                f3 = f2 - f;
                float f4 = MathHelper.wrapAngleTo180_float(f3);
                if (f4 < -85.0f) {
                    f4 = -85.0f;
                }
                if (f4 >= 85.0f) {
                    f4 = 85.0f;
                }
                f = f2 - f4;
                if (f4 * f4 > 2500.0f) {}
            }
            return f3;
        }
        return 0.0f;
    }
    
    public static float getRotation(final AbstractClientPlayer clientPlayer, final float partialTicks) {
        if (Minecraft.getMinecraft().thePlayer != null) {
            return clientPlayer.prevRotationPitch + (clientPlayer.rotationPitch - clientPlayer.prevRotationPitch) * partialTicks;
        }
        return 0.0f;
    }
}
