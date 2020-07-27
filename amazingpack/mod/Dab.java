package amazingpack.mod;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;

public class Dab
{
    public static boolean 14;
    public int prevDabbingHeld;
    public int dabbingHeld;
    
    public void render(final Entity entityIn, final ModelBiped model) {
        final boolean shouldRender = entityIn.getEntityId() == Minecraft.getMinecraft().thePlayer.getEntityId();
        if (shouldRender && this.prevDabbingHeld > 0) {
            final float heldPercent = this.prevDabbingHeld / 8.0f;
            model.bipedRightArm.rotateAngleX = (float)Math.toRadians(-90.0f * heldPercent);
            model.bipedRightArm.rotateAngleY = (float)Math.toRadians(-35.0f * heldPercent);
            model.bipedLeftArm.rotateAngleX = (float)Math.toRadians(15.0f * heldPercent);
            model.bipedLeftArm.rotateAngleY = (float)Math.toRadians(15.0f * heldPercent);
            model.bipedLeftArm.rotateAngleZ = (float)Math.toRadians(-110.0f * heldPercent);
            final float rotationX = entityIn.rotationPitch;
            model.bipedHead.rotateAngleX = (float)Math.toRadians(-rotationX * heldPercent) + (float)Math.toRadians(45.0f * heldPercent + rotationX);
            final float rotationY = ((EntityPlayer)entityIn).renderYawOffset - entityIn.rotationYaw;
            model.bipedHead.rotateAngleY = (float)Math.toRadians(rotationY * heldPercent) + (float)Math.toRadians(35.0f * heldPercent - rotationY);
            ModelBase.copyModelAngles(model.bipedHead, model.bipedHeadwear);
        }
    }
}
