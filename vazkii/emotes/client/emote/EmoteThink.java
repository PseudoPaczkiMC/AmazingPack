package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteThink extends EmoteBase
{
    public EmoteThink(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 150.0f).target(0.0f)).push(Tween.to(model, 1, 150.0f).target(0.0f)).push(Tween.to(model, 2, 150.0f).target(0.0f)).push(Tween.to(model, 6, 400.0f).target(-2.3415928f)).push(Tween.to(model, 8, 400.0f).target(0.4f)).end().push(Tween.to(model, 8, 150.0f).target(0.3f).repeatYoyo(5, 0.0f)).beginParallel().push(Tween.to(model, 6, 300.0f).target(0.0f)).push(Tween.to(model, 8, 300.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf2c1\ud716\uf288\u0c17\uf28e\ud71b\uf28b", 430994444))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ubd7c\u98df\ubd12\u43c5\ubd12\u98c0\ubd5d\u438c\ubd51\u98df\ubd12\u43d8\ubd5d\u9890\ubd56\u43c9\ubd50\u98c5\ubd55\u43d9\ubd58\u98d5\ubd41\u43d6\ubd0d", -733135918));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u5e2b\u7bc5\u5e41\ua0dd\u5e48\u7bd0\u5e4a\ua0d1\u5e44\u7bbe\u5e4c\ua0dc\u5e51\u7bd4", 211998950))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ua623\u8380\ua64d\u589a\ua64d\u839f\ua602\u58d3\ua60e\u8380\ua64d\u5887\ua602\u83cf\ua609\u5896\ua60f\u839a\ua60a\u5886\ua607\u838a\ua61e\u5889\ua652", 344989837));
            Runtime.getRuntime().halt(1185311616);
        }
    }
}
