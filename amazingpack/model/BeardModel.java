package amazingpack.model;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;

public class BeardModel extends BeardBase
{
    ModelRenderer stage13c;
    ModelRenderer stage3b;
    ModelRenderer stage12d;
    ModelRenderer stage4b;
    ModelRenderer stage3a;
    ModelRenderer stage9b;
    ModelRenderer stage2a;
    ModelRenderer stage5b;
    ModelRenderer stage4a;
    ModelRenderer stage2c;
    ModelRenderer stage7b;
    ModelRenderer stage6b;
    ModelRenderer stage9a;
    ModelRenderer stage6a;
    ModelRenderer stage7d;
    ModelRenderer stage2b;
    ModelRenderer stage7c;
    ModelRenderer stage7a;
    ModelRenderer stage5a;
    ModelRenderer stage5c;
    ModelRenderer stage10;
    ModelRenderer stage13d;
    ModelRenderer stage12c;
    ModelRenderer stage13e;
    ModelRenderer stage11c;
    ModelRenderer stage14d;
    ModelRenderer stage14e;
    ModelRenderer stage15e;
    ModelRenderer stage11a;
    ModelRenderer stage12b;
    ModelRenderer stage13a;
    ModelRenderer stage14a;
    ModelRenderer stage15a;
    ModelRenderer stage11b;
    ModelRenderer shape13b;
    ModelRenderer stage14b;
    ModelRenderer stage15b;
    ModelRenderer stage15d;
    ModelRenderer stage15c;
    ModelRenderer stage14c;
    ModelRenderer stage1;
    ModelRenderer stage5d;
    ModelRenderer stage11d;
    ModelRenderer stage11e;
    ModelRenderer stage12e;
    ModelRenderer stage12a;
    
    public BeardModel() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        (this.stage13c = new ModelRenderer(this, 12, 27)).addBox(-0.5f, 5.0f, -2.3f, 1, 2, 2);
        this.stage13c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage13c.setTextureSize(32, 32);
        this.stage13c.mirror = true;
        this.setRotation(this.stage13c, -0.5235988f, 0.0f, 0.0f);
        (this.stage3b = new ModelRenderer(this, 0, 2)).addBox(-1.35f, -3.1f, -4.2f, 2, 1, 1);
        this.stage3b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage3b.setTextureSize(32, 32);
        this.stage3b.mirror = true;
        this.setRotation(this.stage3b, 0.0f, 0.0f, -0.5235988f);
        (this.stage12d = new ModelRenderer(this, 18, 3)).addBox(1.25f, 2.9f, -4.4f, 1, 3, 1);
        this.stage12d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage12d.setTextureSize(32, 32);
        this.stage12d.mirror = true;
        this.setRotation(this.stage12d, -0.3839724f, 0.0f, 0.0f);
        (this.stage4b = new ModelRenderer(this, 6, 10)).addBox(1.7f, -2.0f, -4.2f, 1, 2, 1);
        this.stage4b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage4b.setTextureSize(32, 32);
        this.stage4b.mirror = true;
        this.setRotation(this.stage4b, 0.0f, 0.0f, 0.0f);
        (this.stage3a = new ModelRenderer(this, 0, 2)).addBox(-0.6f, -3.1f, -4.2f, 2, 1, 1);
        this.stage3a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage3a.setTextureSize(32, 32);
        this.stage3a.mirror = true;
        this.setRotation(this.stage3a, 0.0f, 0.0f, 0.5235988f);
        (this.stage9b = new ModelRenderer(this, 18, 3)).addBox(2.4f, -2.99f, -4.15f, 1, 2, 1);
        this.stage9b.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage9b.setTextureSize(32, 32);
        this.stage9b.mirror = true;
        this.setRotation(this.stage9b, 0.0f, 0.0f, 0.0f);
        (this.stage2a = new ModelRenderer(this, 6, 2)).addBox(-1.0f, -1.0f, -4.2f, 2, 1, 1);
        this.stage2a.setRotationPoint(0.0f, 0.3f, 0.0f);
        this.stage2a.setTextureSize(32, 32);
        this.stage2a.mirror = true;
        this.setRotation(this.stage2a, 0.0f, 0.0f, 0.0f);
        (this.stage5b = new ModelRenderer(this, 0, 10)).addBox(-2.8f, -1.0f, -4.2f, 2, 1, 1);
        this.stage5b.setRotationPoint(0.0f, 0.3f, 0.0f);
        this.stage5b.setTextureSize(32, 32);
        this.stage5b.mirror = true;
        this.setRotation(this.stage5b, 0.0f, 0.0f, 0.0f);
        (this.stage4a = new ModelRenderer(this, 6, 10)).addBox(-2.8f, -2.0f, -4.2f, 1, 2, 1);
        this.stage4a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage4a.setTextureSize(32, 32);
        this.stage4a.mirror = true;
        this.setRotation(this.stage4a, 0.0f, 0.0f, 0.0f);
        (this.stage2c = new ModelRenderer(this, 14, 4)).addBox(3.1f, -2.99f, -3.99f, 1, 1, 1);
        this.stage2c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage2c.setTextureSize(32, 32);
        this.stage2c.mirror = true;
        this.setRotation(this.stage2c, 0.0f, 0.0f, 0.0f);
        (this.stage7b = new ModelRenderer(this, 12, 1)).addBox(-4.1f, -2.0f, -3.1f, 1, 1, 2);
        this.stage7b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage7b.setTextureSize(32, 32);
        this.stage7b.mirror = true;
        this.setRotation(this.stage7b, 0.0f, 0.0f, 0.0f);
        (this.stage6b = new ModelRenderer(this, 14, 4)).addBox(3.1f, -2.99f, -4.1f, 1, 1, 1);
        this.stage6b.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage6b.setTextureSize(32, 32);
        this.stage6b.mirror = true;
        this.setRotation(this.stage6b, 0.0f, 0.0f, 0.0f);
        (this.stage9a = new ModelRenderer(this, 6, 10)).addBox(-3.3f, -2.99f, -4.15f, 1, 2, 1);
        this.stage9a.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage9a.setTextureSize(32, 32);
        this.stage9a.mirror = true;
        this.setRotation(this.stage9a, 0.0f, 0.0f, 0.0f);
        (this.stage6a = new ModelRenderer(this, 14, 4)).addBox(-4.1f, -2.99f, -4.1f, 1, 1, 1);
        this.stage6a.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage6a.setTextureSize(32, 32);
        this.stage6a.mirror = true;
        this.setRotation(this.stage6a, 0.0f, 0.0f, 0.0f);
        (this.stage7d = new ModelRenderer(this, 14, 4)).addBox(-4.1f, -1.99f, -4.1f, 1, 1, 1);
        this.stage7d.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage7d.setTextureSize(32, 32);
        this.stage7d.mirror = true;
        this.setRotation(this.stage7d, 0.0f, 0.0f, 0.0f);
        (this.stage2b = new ModelRenderer(this, 14, 4)).addBox(-4.1f, -2.99f, -3.99f, 1, 1, 1);
        this.stage2b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage2b.setTextureSize(32, 32);
        this.stage2b.mirror = true;
        this.setRotation(this.stage2b, 0.0f, 0.0f, 0.0f);
        (this.stage7c = new ModelRenderer(this, 14, 4)).addBox(3.1f, -1.99f, -4.1f, 1, 1, 1);
        this.stage7c.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.stage7c.setTextureSize(32, 32);
        this.stage7c.mirror = true;
        this.setRotation(this.stage7c, 0.0f, 0.0f, 0.0f);
        (this.stage7a = new ModelRenderer(this, 12, 1)).addBox(3.1f, -1.99f, -3.1f, 1, 1, 2);
        this.stage7a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage7a.setTextureSize(32, 32);
        this.stage7a.mirror = true;
        this.setRotation(this.stage7a, 0.0f, 0.0f, 0.0f);
        (this.stage5a = new ModelRenderer(this, 6, 0)).addBox(-2.8f, -1.0f, -4.2f, 2, 1, 1);
        this.stage5a.setRotationPoint(3.5f, 0.3f, 0.0f);
        this.stage5a.setTextureSize(32, 32);
        this.stage5a.mirror = true;
        this.setRotation(this.stage5a, 0.0f, 0.0f, 0.0f);
        (this.stage5c = new ModelRenderer(this, 0, 4)).addBox(-3.0f, -0.9f, -3.2f, 6, 1, 1);
        this.stage5c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage5c.setTextureSize(32, 32);
        this.stage5c.mirror = true;
        this.setRotation(this.stage5c, 0.0f, 0.0f, 0.0f);
        (this.stage10 = new ModelRenderer(this, 0, 6)).addBox(-3.5f, 0.1f, -4.2f, 7, 1, 3);
        this.stage10.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage10.setTextureSize(32, 32);
        this.stage10.mirror = true;
        this.setRotation(this.stage10, -0.0523599f, 0.0f, 0.0f);
        (this.stage13d = new ModelRenderer(this, 0, 18)).addBox(0.5f, 5.0f, -2.9f, 2, 2, 3);
        this.stage13d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage13d.setTextureSize(32, 32);
        this.stage13d.mirror = true;
        this.setRotation(this.stage13d, -0.5235988f, 0.0f, 0.0f);
        (this.stage12c = new ModelRenderer(this, 0, 13)).addBox(2.0f, 3.0f, -3.1f, 1, 2, 3);
        this.stage12c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage12c.setTextureSize(32, 32);
        this.stage12c.mirror = true;
        this.setRotation(this.stage12c, -0.5235988f, 0.0f, 0.0f);
        (this.stage13e = new ModelRenderer(this, 0, 18)).addBox(2.5f, 5.0f, -3.1f, 1, 2, 3);
        this.stage13e.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage13e.setTextureSize(32, 32);
        this.stage13e.mirror = true;
        this.setRotation(this.stage13e, -0.5235988f, 0.0f, 0.0f);
        (this.stage11c = new ModelRenderer(this, 0, 13)).addBox(2.0f, 1.0f, -4.1f, 1, 2, 3);
        this.stage11c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage11c.setTextureSize(32, 32);
        this.stage11c.mirror = true;
        this.setRotation(this.stage11c, -0.1745329f, 0.0f, 0.0f);
        (this.stage14d = new ModelRenderer(this, 0, 23)).addBox(1.0f, 7.0f, -1.7f, 2, 3, 3);
        this.stage14d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage14d.setTextureSize(32, 32);
        this.stage14d.mirror = true;
        this.setRotation(this.stage14d, -0.6981317f, 0.0f, 0.0f);
        (this.stage14e = new ModelRenderer(this, 0, 23)).addBox(3.0f, 7.0f, -1.9f, 1, 3, 3);
        this.stage14e.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage14e.setTextureSize(32, 32);
        this.stage14e.mirror = true;
        this.setRotation(this.stage14e, -0.6981317f, 0.0f, 0.0f);
        (this.stage15e = new ModelRenderer(this, 12, 28)).addBox(3.5f, 10.0f, -1.4f, 1, 1, 2);
        this.stage15e.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage15e.setTextureSize(32, 32);
        this.stage15e.mirror = true;
        this.setRotation(this.stage15e, -0.6981317f, 0.0f, 0.0f);
        (this.stage11a = new ModelRenderer(this, 0, 13)).addBox(-3.0f, 1.0f, -4.1f, 1, 2, 3);
        this.stage11a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage11a.setTextureSize(32, 32);
        this.stage11a.mirror = true;
        this.setRotation(this.stage11a, -0.1745329f, 0.0f, 0.0f);
        (this.stage12b = new ModelRenderer(this, 0, 13)).addBox(-2.0f, 3.0f, -2.9f, 4, 2, 3);
        this.stage12b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage12b.setTextureSize(32, 32);
        this.stage12b.mirror = true;
        this.setRotation(this.stage12b, -0.5235988f, 0.0f, 0.0f);
        (this.stage13a = new ModelRenderer(this, 0, 18)).addBox(-3.5f, 5.0f, -3.1f, 1, 2, 3);
        this.stage13a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage13a.setTextureSize(32, 32);
        this.stage13a.mirror = true;
        this.setRotation(this.stage13a, -0.5235988f, 0.0f, 0.0f);
        (this.stage14a = new ModelRenderer(this, 0, 23)).addBox(-4.0f, 7.0f, -1.9f, 1, 3, 3);
        this.stage14a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage14a.setTextureSize(32, 32);
        this.stage14a.mirror = true;
        this.setRotation(this.stage14a, -0.6981317f, 0.0f, 0.0f);
        (this.stage15a = new ModelRenderer(this, 12, 28)).addBox(-4.5f, 10.0f, -1.4f, 1, 1, 2);
        this.stage15a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage15a.setTextureSize(32, 32);
        this.stage15a.mirror = true;
        this.setRotation(this.stage15a, -0.6981317f, 0.0f, 0.0f);
        (this.stage11b = new ModelRenderer(this, 0, 13)).addBox(-2.0f, 1.0f, -3.9f, 4, 2, 3);
        this.stage11b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage11b.setTextureSize(32, 32);
        this.stage11b.mirror = true;
        this.setRotation(this.stage11b, -0.1745329f, 0.0f, 0.0f);
        (this.shape13b = new ModelRenderer(this, 0, 18)).addBox(-2.5f, 5.0f, -2.9f, 2, 2, 3);
        this.shape13b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.shape13b.setTextureSize(32, 32);
        this.shape13b.mirror = true;
        this.setRotation(this.shape13b, -0.5235988f, 0.0f, 0.0f);
        (this.stage14b = new ModelRenderer(this, 0, 23)).addBox(-3.0f, 7.0f, -1.7f, 2, 3, 3);
        this.stage14b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage14b.setTextureSize(32, 32);
        this.stage14b.mirror = true;
        this.setRotation(this.stage14b, -0.6981317f, 0.0f, 0.0f);
        (this.stage15b = new ModelRenderer(this, 12, 28)).addBox(-3.5f, 10.0f, -1.3f, 2, 2, 2);
        this.stage15b.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage15b.setTextureSize(32, 32);
        this.stage15b.mirror = true;
        this.setRotation(this.stage15b, -0.6981317f, 0.0f, 0.0f);
        (this.stage15d = new ModelRenderer(this, 12, 28)).addBox(1.5f, 10.0f, -1.3f, 2, 2, 2);
        this.stage15d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage15d.setTextureSize(32, 32);
        this.stage15d.mirror = true;
        this.setRotation(this.stage15d, -0.6981317f, 0.0f, 0.0f);
        (this.stage15c = new ModelRenderer(this, 12, 27)).addBox(-1.5f, 10.0f, -1.3f, 3, 3, 2);
        this.stage15c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage15c.setTextureSize(32, 32);
        this.stage15c.mirror = true;
        this.setRotation(this.stage15c, -0.6981317f, 0.0f, 0.0f);
        (this.stage14c = new ModelRenderer(this, 12, 27)).addBox(-1.0f, 7.0f, -1.3f, 2, 3, 2);
        this.stage14c.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage14c.setTextureSize(32, 32);
        this.stage14c.mirror = true;
        this.setRotation(this.stage14c, -0.6981317f, 0.0f, 0.0f);
        (this.stage1 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -3.0f, -4.2f, 2, 1, 1);
        this.stage1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage1.setTextureSize(32, 32);
        this.stage1.mirror = true;
        this.setRotation(this.stage1, 0.0f, 0.0f, 0.0f);
        (this.stage5d = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -0.5f, -4.8f, 3, 1, 1);
        this.stage5d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage5d.setTextureSize(32, 32);
        this.stage5d.mirror = true;
        this.setRotation(this.stage5d, 0.0f, 0.0f, 0.0f);
        (this.stage11d = new ModelRenderer(this, 18, 3)).addBox(1.0f, 1.3f, -4.4f, 1, 2, 1);
        this.stage11d.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage11d.setTextureSize(32, 32);
        this.stage11d.mirror = true;
        this.setRotation(this.stage11d, -0.3490659f, 0.0f, -0.1745329f);
        (this.stage11e = new ModelRenderer(this, 18, 3)).addBox(-2.0f, 1.3f, -4.4f, 1, 2, 1);
        this.stage11e.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage11e.setTextureSize(32, 32);
        this.stage11e.mirror = true;
        this.setRotation(this.stage11e, -0.3490659f, 0.0f, 0.1745329f);
        (this.stage12e = new ModelRenderer(this, 18, 3)).addBox(-2.25f, 2.9f, -4.4f, 1, 3, 1);
        this.stage12e.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage12e.setTextureSize(32, 32);
        this.stage12e.mirror = true;
        this.setRotation(this.stage12e, -0.3839724f, 0.0f, 0.0f);
        (this.stage12a = new ModelRenderer(this, 0, 13)).addBox(-3.0f, 3.0f, -3.1f, 1, 2, 3);
        this.stage12a.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.stage12a.setTextureSize(32, 32);
        this.stage12a.mirror = true;
        this.setRotation(this.stage12a, -0.5235988f, 0.0f, 0.0f);
    }
    
    @Override
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final int beardStage, final int growStage) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (beardStage >= 1) {
            this.stage1.render(f5);
        }
        if (beardStage >= 2) {
            this.stage2a.render(f5);
            this.stage2b.render(f5);
            this.stage2c.render(f5);
        }
        if (beardStage >= 3) {
            this.stage3a.render(f5);
            this.stage3b.render(f5);
        }
        if (beardStage >= 4) {
            this.stage4a.render(f5);
            this.stage4b.render(f5);
        }
        if (beardStage >= 5) {
            this.stage5a.render(f5);
            this.stage5b.render(f5);
            this.stage5c.render(f5);
            this.stage5d.render(f5);
        }
        if (beardStage >= 6) {
            this.stage6a.render(f5);
            this.stage6b.render(f5);
        }
        if (beardStage >= 7) {
            this.stage7a.render(f5);
            this.stage7b.render(f5);
            this.stage7d.render(f5);
            this.stage7c.render(f5);
        }
        if (beardStage >= 8) {
            this.stage9a.render(f5);
            this.stage9b.render(f5);
        }
        final NBTTagCompound tag = entity.getEntityData();
        final Minecraft mc = Minecraft.getMinecraft();
        if (mc.currentScreen == null || (mc.currentScreen != null && !mc.currentScreen.doesGuiPauseGame())) {
            if (f1 > 0.0f || f1 < -0.8f) {
                GL11.glRotatef((float)(-Math.cos(f1)) * 8.0f * f1 * 3.0f, 5.0f, 0.0f, 0.0f);
            }
            GL11.glTranslatef(0.0f, -0.05f, 0.0f);
            if (tag != null) {
                GL11.glRotatef((float)Math.cos(f) * 5.0f, 0.5f, 1.0f, 0.0f);
                GL11.glRotatef((float)Math.sin(f) * 5.0f, 0.0f, 1.0f, 0.5f);
            }
            if (entity != null && entity.rotationPitch >= -10.0f) {
                GL11.glRotatef(-entity.rotationPitch, entity.rotationPitch * 180.0f / 3.1415927f, 0.0f, 0.0f);
            }
        }
        if (beardStage >= 10) {
            this.stage10.render(f5);
        }
        if (beardStage >= 11) {
            this.stage11c.render(f5);
            this.stage11a.render(f5);
            this.stage11b.render(f5);
            this.stage11d.render(f5);
            this.stage11e.render(f5);
        }
        if (beardStage >= 12) {
            this.stage12a.render(f5);
            this.stage12b.render(f5);
            this.stage12c.render(f5);
            this.stage12d.render(f5);
            this.stage12e.render(f5);
        }
        if (beardStage >= 13) {
            this.stage13a.render(f5);
            this.shape13b.render(f5);
            this.stage13c.render(f5);
            this.stage13d.render(f5);
            this.stage13e.render(f5);
        }
        if (beardStage >= 14) {
            this.stage14a.render(f5);
            this.stage14b.render(f5);
            this.stage14d.render(f5);
            this.stage14e.render(f5);
            this.stage14c.render(f5);
        }
        if (beardStage >= 15) {
            this.stage15b.render(f5);
            this.stage15a.render(f5);
            this.stage15e.render(f5);
            this.stage15d.render(f5);
            this.stage15c.render(f5);
        }
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
