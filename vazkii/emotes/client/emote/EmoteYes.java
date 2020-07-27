package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteYes extends EmoteBase
{
    public EmoteYes(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 300.0f).target(0.15f)).push(Tween.to(model, 1, 300.0f).target(0.0f)).push(Tween.to(model, 2, 300.0f).target(0.0f)).end().push(Tween.to(model, 0, 300.0f).target(-0.15f).repeatYoyo(4, 0.0f)).push(Tween.to(model, 0, 300.0f).target(0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u2836\u4dc1\u285f\u3af8\u2859\u4dcc\u285c", -2096653106))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ueb3f\u8e9c\ueb51\uf9be\ueb51\u8e83\ueb1e\uf9f7\ueb12\u8e9c\ueb51\uf9a3\ueb1e\u8ed3\ueb15\uf9b2\ueb13\u8e86\ueb16\uf9a2\ueb1b\u8e96\ueb02\uf9ad\ueb4e", -1018929244));
            System.exit(-1987085694);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ub79c\ud272\ub7f6\ua552\ub7ff\ud267\ub7fd\ua55e\ub7f3\ud209\ub7fb\ua553\ub7e6\ud263", -647822492))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u19c4\u7c67\u19aa\u0b45\u19aa\u7c78\u19e5\u0b0c\u19e9\u7c67\u19aa\u0b58\u19e5\u7c28\u19ee\u0b49\u19e8\u7c7d\u19ed\u0b59\u19e0\u7c6d\u19f9\u0b56\u19b5", -981619361));
        }
    }
}
