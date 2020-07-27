package amazingpack.mod;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBow;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class LeftHandMod
{
    public static boolean shouldRender(final Entity entity) {
        final boolean flag = Minecraft.getMinecraft().gameSettings.bpOptions.leftItem.getValue();
        if (entity == null) {
            return flag;
        }
        if (!Minecraft.getMinecraft().gameSettings.bpOptions.leftItem.getValue()) {
            return flag;
        }
        if (!(entity instanceof AbstractClientPlayer)) {
            return flag;
        }
        final AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)entity;
        return (abstractclientplayer.inventory == null) ? flag : ((abstractclientplayer.inventory.getCurrentItem() == null) ? flag : ((abstractclientplayer.inventory.getCurrentItem().getItem() == null) ? flag : (abstractclientplayer.inventory.getCurrentItem().getItem() instanceof ItemBow ^ flag)));
    }
    
    public static boolean check(final ItemStack itemToRender) {
        final boolean flag = Minecraft.getMinecraft().gameSettings.bpOptions.leftItem.getValue();
        if (itemToRender == null || itemToRender.getItem() == null || !(itemToRender.getItem() instanceof ItemMap)) {
            if (!Minecraft.getMinecraft().gameSettings.bpOptions.leftItem.getValue()) {
                if (!flag) {
                    return false;
                }
            }
            else if (itemToRender == null) {
                if (!flag) {
                    return false;
                }
            }
            else if (itemToRender.getItem() == null) {
                if (!flag) {
                    return false;
                }
            }
            else if (itemToRender.getItem() instanceof ItemBow == flag) {
                return false;
            }
            return true;
        }
        return false;
    }
}
