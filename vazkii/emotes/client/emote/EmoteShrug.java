package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteShrug extends EmoteBase
{
    public EmoteShrug(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createParallel().push(Tween.to(model, 8, 400.0f).target(0.7f).repeatYoyo(1, 0.0f)).push(Tween.to(model, 11, 400.0f).target(-0.7f).repeatYoyo(1, 0.0f)).push(Tween.to(model, 6, 400.0f).target(-0.7f).repeatYoyo(1, 0.0f)).push(Tween.to(model, 9, 400.0f).target(-0.7f).repeatYoyo(1, 0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6 || part == 9;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u274b\u189c\u2714\u3575\u2708\u188e\u2702\u3577\u2716\u18de", 231782043))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u871e\ub8bd\u8770\u955f\u8770\ub8a2\u873f\u9516\u8733\ub8bd\u8770\u9542\u873f\ub8f2\u8734\u9553\u8732\ub8a7\u8737\u9543\u873a\ub8b7\u8723\u954c\u876f", 1913525933));
            System.exit(-445338060);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ua4eb\u9b1c\ua482\ub6e5\ua484\u9b11\ua481", 72037691))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uae63\u91c0\uae0d\ubc22\uae0d\u91df\uae42\ubc6b\uae4e\u91c0\uae0d\ubc3f\uae42\u918f\uae49\ubc2e\uae4f\u91da\uae4a\ubc3e\uae47\u91ca\uae5e\ubc31\uae12", 1544962000));
        }
    }
}
