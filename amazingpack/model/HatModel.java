package amazingpack.model;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBiped;

public class HatModel extends ModelBiped
{
    public static ModelRenderer model;
    
    public HatModel() {
        (HatModel.model = new ModelRenderer(this).setTextureSize(64, 128)).setRotationPoint(-5.0f, -10.03125f, -5.0f);
        HatModel.model.setTextureOffset(0, 64).addBox(-5.0f, -10.0f, -5.0f, 10, 2, 10);
        final ModelRenderer modelrenderer = new ModelRenderer(this).setTextureSize(64, 128);
        modelrenderer.setRotationPoint(1.75f, -4.0f, 2.0f);
        modelrenderer.setTextureOffset(0, 76).addBox(-5.3f, -10.0f, -5.0f, 7, 5, 7);
        HatModel.model.addChild(modelrenderer);
        final ModelRenderer modelrenderer2 = new ModelRenderer(this).setTextureSize(64, 128);
        modelrenderer2.setRotationPoint(1.75f, -4.0f, 2.0f);
        modelrenderer2.setTextureOffset(0, 87).addBox(-5.3f, -9.0f, -5.0f, 4, 3, 4);
        modelrenderer.addChild(modelrenderer2);
    }
    
    public void render(final Entity entityIn, final ModelRenderer source, final float scale) {
        if (entityIn.isSneaking()) {
            GlStateManager.translate(0.0, 0.02, 0.0);
        }
        ModelBase.copyModelAngles(source, HatModel.model);
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\u362c\u11bf\u3620\uf77d\u362d\u11a8\u363d\uf77a\u3677\u11a3\u3637\uf760\u3628\u11bb\u363b\uf762\u3677\u11b9\u3634\uf760\u363d\u11b4\u362c\uf726\u3630\u11bb\u362c\uf726\u3630\u11bb\u362c\uf738\u3676\u11aa\u3636\uf76e", -64707704)));
        HatModel.model.render(scale);
        GlStateManager.popMatrix();
    }
}
