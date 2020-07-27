package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteZombie extends EmoteBase
{
    public EmoteZombie(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createParallel().beginSequence().push(Tween.set(model, 0).target(0.0f)).push(Tween.set(model, 1).target(0.0f)).push(Tween.to(model, 2, 1000.0f).target(0.5235988f)).push(Tween.to(model, 2, 2000.0f).target(-0.5235988f).repeatYoyo(3, 0.0f)).push(Tween.to(model, 2, 500.0f).target(0.0f)).end().beginSequence().beginParallel().push(Tween.to(model, 9, 1000.0f).target(-1.2707963f)).push(Tween.to(model, 6, 1000.0f).target(-1.8707964f)).end().beginParallel().push(Tween.to(model, 9, 1000.0f).target(-1.8707964f).repeatYoyo(7, 0.0f)).push(Tween.to(model, 6, 1000.0f).target(-1.2707963f).repeatYoyo(7, 0.0f)).end().beginParallel().push(Tween.to(model, 9, 500.0f).target(0.0f)).push(Tween.to(model, 6, 500.0f).target(0.0f)).end().end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 9 || part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ub5b2\u9945\ub5db\uc67c\ub5dd\u9948\ub5d8", 876412043))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0aca\u2669\u0aa4\u794b\u0aa4\u2676\u0aeb\u7902\u0ae7\u2669\u0aa4\u7956\u0aeb\u2626\u0ae0\u7947\u0ae6\u2673\u0ae3\u7957\u0aee\u2663\u0af7\u7958\u0abb", -1842265200));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud2e3\ufe2d\ud2a9\ua10d\ud2a0\ufe38\ud2a2\ua101\ud2ac\ufe76\ud2a4\ua10c\ud2b9\ufe3c", -1558996006))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u308c\u1c2f\u30e2\u430d\u30e2\u1c30\u30ad\u4344\u30a1\u1c2f\u30e2\u4310\u30ad\u1c60\u30a6\u4301\u30a0\u1c35\u30a5\u4311\u30a8\u1c25\u30b1\u431e\u30fd", 612727254));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud548\uf98d\ud504\ua6b5\ud504\uf986\ud502\ua6a6\ud50b\uf993\ud55f", -447636367))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ufa50\ud6f3\ufa3e\u89d1\ufa3e\ud6ec\ufa71\u8998\ufa7d\ud6f3\ufa3e\u89cc\ufa71\ud6bc\ufa7a\u89dd\ufa7c\ud6e9\ufa79\u89cd\ufa74\ud6f9\ufa6d\u89c2\ufa21", 143176458));
            Runtime.getRuntime().halt(1070005717);
        }
    }
}
