package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteShaftHeadTilt extends EmoteBase
{
    public EmoteShaftHeadTilt(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createParallel().push(Tween.to(model, 0, 2000.0f).target(-0.2617994f)).push(Tween.to(model, 1, 2000.0f).target(2.4870942f)).repeatYoyo(1, 1000.0f);
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u076e\u6399\u0711\u08b0\u070d\u638b\u0707\u08b2\u0713\u63fb", 299677702))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u2a74\u4ed7\u2a1a\u25f5\u2a1a\u4ec8\u2a55\u25bc\u2a59\u4ed7\u2a1a\u25e8\u2a55\u4e98\u2a5e\u25f9\u2a58\u4ecd\u2a5d\u25e9\u2a50\u4edd\u2a49\u25e6\u2a05", -2077911681));
            Runtime.getRuntime().halt(492691877);
        }
    }
}
