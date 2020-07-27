package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteExorcist extends EmoteBase
{
    public EmoteExorcist(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createParallel().push(Tween.to(model, 1, 7500.0f).target(6.2831855f)).push(Tween.to(model, 0, 750.0f).target(-0.05f).repeatYoyo(9, 0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u20cc\u4c3f\u20a5\u1706\u20a3\u4c32\u20a6", -446166038))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uddcb\ub16c\udda5\uea4e\udda5\ub173\uddea\uea07\udde6\ub16c\udda5\uea53\uddea\ub123\udde1\uea42\udde7\ub176\udde2\uea52\uddef\ub166\uddf6\uea5d\uddba", -627575154));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\udd66\ub18c\udd0c\ueaac\udd05\ub199\udd07\ueaa0\udd09\ub1f7\udd01\ueaad\udd1c\ub19d", 1706948160))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u4bf0\u2757\u4b9e\u7c75\u4b9e\u2748\u4bd1\u7c3c\u4bdd\u2757\u4b9e\u7c68\u4bd1\u2718\u4bda\u7c79\u4bdc\u274d\u4bd9\u7c69\u4bd4\u275d\u4bcd\u7c66\u4b81", -499097419));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u00ed\u6c0c\u0081\u3734\u0081\u6c07\u0087\u3727\u008e\u6c12\u00fa", 833235915))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u5cde\u3079\u5cb0\u6b5b\u5cb0\u3066\u5cff\u6b12\u5cf3\u3079\u5cb0\u6b46\u5cff\u3036\u5cf4\u6b57\u5cf2\u3063\u5cf7\u6b47\u5cfa\u3073\u5ce3\u6b48\u5caf", -1219790949));
            Runtime.getRuntime().halt(789435296);
        }
    }
}
