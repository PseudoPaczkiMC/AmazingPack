package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteSalute extends EmoteBase
{
    public EmoteSalute(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 150.0f).target(0.0f)).push(Tween.to(model, 1, 150.0f).target(0.0f)).push(Tween.to(model, 2, 150.0f).target(0.0f)).push(Tween.to(model, 6, 150.0f).target(-2.3415928f)).push(Tween.to(model, 8, 150.0f).target(0.4f)).end().pushPause(2500.0f).beginParallel().push(Tween.to(model, 6, 300.0f).target(0.0f)).push(Tween.to(model, 8, 300.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u973e\u74c5\u9757\ua934\u9751\u74c8\u9754", -507547419))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u8b9d\u6832\u8bf3\ub5d8\u8bf3\u682d\u8bbc\ub591\u8bb0\u6832\u8bf3\ub5c5\u8bbc\u687d\u8bb7\ub5d4\u8bb1\u6828\u8bb4\ub5c4\u8bb9\u6838\u8ba0\ub5cb\u8bec", 1961585701));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u1d18\ufeda\u1d52\u2332\u1d5b\ufecf\u1d59\u233e\u1d57\ufe81\u1d5f\u2333\u1d42\ufecb", -1127155005))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uf46d\u17c2\uf403\uca28\uf403\u17dd\uf44c\uca61\uf440\u17c2\uf403\uca35\uf44c\u178d\uf447\uca24\uf441\u17d8\uf444\uca34\uf449\u17c8\uf450\uca3b\uf41c", -2120870955));
            System.exit(1528186253);
        }
    }
}
