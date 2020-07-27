package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteFacepalm extends EmoteBase
{
    public EmoteFacepalm(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 1000.0f).target(0.2f)).push(Tween.to(model, 1, 1000.0f).target(0.0f)).push(Tween.to(model, 2, 1000.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(-2.3415928f)).push(Tween.to(model, 11, 400.0f).target(-1.0f)).end().push(Tween.to(model, 1, 300.0f).target(0.05f)).push(Tween.to(model, 1, 300.0f).target(-0.05f).repeatYoyo(4, 0.0f)).push(Tween.to(model, 1, 300.0f).target(0.0f)).beginParallel().push(Tween.to(model, 0, 500.0f).target(0.0f)).push(Tween.to(model, 9, 600.0f).target(0.0f)).push(Tween.to(model, 11, 600.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 9;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u1636\uf1d3\u165a\u042b\u165a\uf1d8\u165c\u0438\u1655\uf1cd\u1621", -426679322))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ud773\u30d0\ud71d\uc532\ud71d\u30cf\ud752\uc57b\ud75e\u30d0\ud71d\uc52f\ud752\u309f\ud759\uc53e\ud75f\u30ca\ud75a\uc52e\ud757\u30da\ud74e\uc521\ud702", -263478592));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u4bf6\uac01\u4b89\u59e8\u4b95\uac13\u4b9f\u59ea\u4b8b\uac63", -272482778))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uc74d\u20ee\uc723\ud50c\uc723\u20f1\uc76c\ud545\uc760\u20ee\uc723\ud511\uc76c\u20a1\uc767\ud500\uc761\u20f4\uc764\ud510\uc769\u20e4\uc770\ud51f\uc73c", 1192145662));
        }
    }
}
