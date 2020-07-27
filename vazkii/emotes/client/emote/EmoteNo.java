package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteNo extends EmoteBase
{
    public EmoteNo(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 300.0f).target(0.0f)).push(Tween.to(model, 1, 300.0f).target(0.2f)).push(Tween.to(model, 2, 300.0f).target(0.0f)).end().push(Tween.to(model, 1, 300.0f).target(-0.2f).repeatYoyo(4, 0.0f)).push(Tween.to(model, 1, 300.0f).target(0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ub353\uaeaa\ub33f\u81ca\ub33f\uaea1\ub339\u81d9\ub330\uaeb4\ub344", 1103860689))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uc370\udecf\uc31e\uf1b5\uc31e\uded0\uc351\uf1fc\uc35d\udecf\uc31e\uf1a8\uc351\ude80\uc35a\uf1b9\uc35c\uded5\uc359\uf1a9\uc354\udec5\uc34d\uf1a6\uc301", 716628881));
            Runtime.getRuntime().halt(168092800);
        }
    }
}
