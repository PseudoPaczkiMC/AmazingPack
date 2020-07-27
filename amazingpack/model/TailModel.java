package amazingpack.model;

import java.lang.management.ManagementFactory;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class TailModel extends ModelBase
{
    private ModelRenderer tail1;
    private ModelRenderer tail2;
    private ModelRenderer tail3;
    
    public TailModel() {
        this.tail1 = new ModelRenderer(this, 0, 0);
        this.tail2 = new ModelRenderer(this, 0, 0);
        this.tail3 = new ModelRenderer(this, 0, 0);
        this.tail1.addBox(-1.034f, 10.4f, 0.1f, 2, 2, 10, 0.001f);
        this.tail2.addBox(-1.034f, 12.5f, 3.761f, 2, 2, 8, 0.001f);
        this.tail3.addBox(-1.034f, 16.469f, 3.9f, 2, 2, 7, 0.001f);
        GlStateManager.enableTexture2D();
        this.tail1.rotateAngleX = 6.64f;
        this.tail2.rotateAngleX = 6.9455557f;
        this.tail3.rotateAngleX = 7.44f;
        this.tail1.setRotationPoint(0.0f, -1.0f, -1.0f);
        this.tail1.setTextureSize(16, 64);
        this.tail2.setRotationPoint(0.0f, -1.0f, -1.0f);
        this.tail2.setTextureSize(16, 64);
        this.tail3.setRotationPoint(0.0f, -1.0f, -1.0f);
        this.tail3.setTextureSize(16, 64);
    }
    
    public void render(final String id) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\uc726\ue0b1\uc72a\u06f1\uc727\ue0a6\uc737\u06f6\uc77d\ue0ad\uc73d\u06ec\uc722\ue0b5\uc731\u06ee\uc77d\ue0b7\uc73e\u06ec\uc737\ue0ba\uc726\u06aa\uc726\ue0b5\uc73b\u06e9\uc721\ue0fb\uc726\u06e4\uc73b\ue0b8", -1885121855) + id + WorldProviderHell$BlockRedstoneComparator.G("\u7093\u574b\u70d3\ub10d", -1138629330)));
        this.postRender();
    }
    
    private void postRender() {
        GL11.glPushMatrix();
        this.renderWings();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    private void renderWings() {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, -0.0125f);
        this.tail1.render(0.0625f);
        this.tail2.render(0.0625f);
        this.tail3.render(0.0625f);
        GL11.glPopMatrix();
    }
    }
