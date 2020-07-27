package amazingpack.mod;

import net.minecraft.item.Item;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.Minecraft;
import java.util.Random;

public class ItemPhysics
{
    public static Random random;
    public static Minecraft mc;
    public static RenderItem renderItem;
    public static long F;
    public static double G;
    public static final ResourceLocation resource;
    
    static {
        ItemPhysics.random = new Random();
        ItemPhysics.mc = Minecraft.getMinecraft();
        ItemPhysics.renderItem = ItemPhysics.mc.getRenderItem();
        resource = new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\u6d32\u70a1\u6d3e\u5bd4\u6d33\u70b6\u6d23\u5bd3\u6d69\u70a9\u6d2f\u5bd3\u6d25\u70eb\u6d23\u5bce\u6d25\u70ac\u6d27\u5bce\u6d32\u70a1\u6d22\u5bff\u6d2f\u70b0\u6d23\u5bcd\u6d19\u70a3\u6d2a\u5bc9\u6d28\u70b0\u6d68\u5bd0\u6d28\u70a3", 1080102906));
    }
    
    public static void J(final Entity par1Entity, final double x, final double y, final double z, final float par8, final float par9) {
        ItemPhysics.G = (System.nanoTime() - ItemPhysics.F) / 3000000.0 * 1.0;
        if (!ItemPhysics.mc.inGameHasFocus) {
            ItemPhysics.G = 0.0;
        }
        final EntityItem entityitem = (EntityItem)par1Entity;
        final ItemStack itemstack = entityitem.getEntityItem();
        if (itemstack.getItem() != null) {
            ItemPhysics.random.setSeed(187L);
            boolean flag = false;
            if (TextureMap.locationBlocksTexture != null) {
                ItemPhysics.mc.getRenderManager().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
                ItemPhysics.mc.getRenderManager().renderEngine.getTexture(TextureMap.locationBlocksTexture).setBlurMipmap(false, false);
                flag = true;
            }
            GlStateManager.enableRescaleNormal();
            GlStateManager.alphaFunc(516, 0.1f);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            GlStateManager.pushMatrix();
            final IBakedModel ibakedmodel = ItemPhysics.renderItem.getItemModelMesher().getItemModel(itemstack);
            final int i = K(entityitem, x, y, z, par9, ibakedmodel);
            final BlockPos blockpos = new BlockPos(entityitem);
            if (entityitem.rotationPitch > 360.0f) {
                entityitem.rotationPitch = 0.0f;
            }
            if (entityitem != null && !Double.isNaN(entityitem.posX) && !Double.isNaN(entityitem.posY) && !Double.isNaN(entityitem.posZ) && entityitem.worldObj != null) {
                if (entityitem.onGround) {
                    if (entityitem.rotationPitch != 0.0f && entityitem.rotationPitch != 90.0f && entityitem.rotationPitch != 180.0f && entityitem.rotationPitch != 270.0f) {
                        final double d0 = M(entityitem.rotationPitch);
                        final double d2 = M(entityitem.rotationPitch - 90.0f);
                        final double d3 = M(entityitem.rotationPitch - 180.0f);
                        final double d4 = M(entityitem.rotationPitch - 270.0f);
                        if (d0 <= d2 && d0 <= d3 && d0 <= d4) {
                            if (entityitem.rotationPitch < 0.0f) {
                                entityitem.rotationPitch += (float) ItemPhysics.G;
                            }
                            else {
                                entityitem.rotationPitch -= (float) ItemPhysics.G;
                            }
                        }
                        if (d2 < d0 && d2 <= d3 && d2 <= d4) {
                            if (entityitem.rotationPitch - 90.0f < 0.0f) {
                                entityitem.rotationPitch += (float) ItemPhysics.G;
                            }
                            else {
                                entityitem.rotationPitch -= (float) ItemPhysics.G;
                            }
                        }
                        if (d3 < d2 && d3 < d0 && d3 <= d4) {
                            if (entityitem.rotationPitch - 180.0f < 0.0f) {
                                entityitem.rotationPitch += (float) ItemPhysics.G;
                            }
                            else {
                                entityitem.rotationPitch -= (float) ItemPhysics.G;
                            }
                        }
                        if (d4 < d2 && d4 < d3 && d4 < d0) {
                            if (entityitem.rotationPitch - 270.0f < 0.0f) {
                                entityitem.rotationPitch += (float) ItemPhysics.G;
                            }
                            else {
                                entityitem.rotationPitch -= (float) ItemPhysics.G;
                            }
                        }
                    }
                }
                else {
                    final BlockPos blockpos2 = new BlockPos(entityitem);
                    blockpos2.add(0, 1, 0);
                    final Material material = entityitem.worldObj.getBlockState(blockpos2).getBlock().getMaterial();
                    final Material material2 = entityitem.worldObj.getBlockState(blockpos).getBlock().getMaterial();
                    final boolean flag2 = entityitem.isInsideOfMaterial(Material.water);
                    final boolean flag3 = entityitem.isInWater();
                    if (flag2 | material == Material.water | material2 == Material.water | flag3) {
                        entityitem.rotationPitch += (float)(ItemPhysics.G / 4.0);
                    }
                    else {
                        entityitem.rotationPitch += (float)(ItemPhysics.G * 2.0);
                    }
                }
            }
            GL11.glRotatef(entityitem.rotationYaw, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(entityitem.rotationPitch + 90.0f, 1.0f, 0.0f, 0.0f);
            for (int j = 0; j < i; ++j) {
                if (ibakedmodel.isAmbientOcclusion()) {
                    GlStateManager.pushMatrix();
                    GlStateManager.scale(0.5f, 0.5f, 0.5f);
                    ItemPhysics.renderItem.renderItem(itemstack, ibakedmodel);
                    GlStateManager.popMatrix();
                }
                else {
                    GlStateManager.pushMatrix();
                    if (j > 0 && L()) {
                        GlStateManager.translate(0.0f, 0.0f, 0.046875f * j);
                    }
                    ItemPhysics.renderItem.renderItem(itemstack, ibakedmodel);
                    if (!L()) {
                        GlStateManager.translate(0.0f, 0.0f, 0.046875f);
                    }
                    GlStateManager.popMatrix();
                }
            }
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
            GlStateManager.disableBlend();
            ItemPhysics.mc.getRenderManager().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
            if (flag) {
                ItemPhysics.mc.getRenderManager().renderEngine.getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
            }
        }
    }
    
    public static int K(final EntityItem item, final double x, final double y, final double z, final float p_177077_8_, final IBakedModel p_177077_9_) {
        final ItemStack itemstack = item.getEntityItem();
        final Item item2 = itemstack.getItem();
        if (item2 == null) {
            return 0;
        }
        final boolean flag = p_177077_9_.isAmbientOcclusion();
        final int i = N(itemstack);
        final float f = 0.25f;
        final float f2 = 0.0f;
        GlStateManager.translate((float)x, (float)y + f2 + 0.1f, (float)z);
        float f3 = 0.0f;
        if (flag || (ItemPhysics.mc.getRenderManager().options != null && ItemPhysics.mc.getRenderManager().options.fancyGraphics)) {
            GlStateManager.rotate(f3, 0.0f, 1.0f, 0.0f);
        }
        if (!flag) {
            f3 = -0.0f * (i - 1) * 0.5f;
            final float f4 = -0.0f * (i - 1) * 0.5f;
            final float f5 = -0.046875f * (i - 1) * 0.5f;
            GlStateManager.translate(f3, f4, f5);
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        return i;
    }
    
    private static boolean L() {
        return true;
    }
    
    private static double M(final float rotationPitch) {
        return (rotationPitch > 0.0f) ? rotationPitch : ((double)(-rotationPitch));
    }
    
    private static int N(final ItemStack stack) {
        byte b0 = 1;
        if (stack.stackSize > 48) {
            b0 = 5;
        }
        else if (stack.stackSize > 32) {
            b0 = 4;
        }
        else if (stack.stackSize > 16) {
            b0 = 3;
        }
        else if (stack.stackSize > 1) {
            b0 = 2;
        }
        return b0;
    }
    
    private static byte O(final ItemStack stack, final byte original) {
        return original;
    }
    
    private static byte P(final ItemStack stack, final byte original) {
        return original;
    }
}
