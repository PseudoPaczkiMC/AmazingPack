package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteWave extends EmoteBase
{
    public EmoteWave(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().push(Tween.to(model, 6, 200.0f).target(-2.8274333f)).push(Tween.to(model, 8, 300.0f).target(-0.9424779f).repeatYoyo(5, 0.0f)).push(Tween.to(model, 6, 200.0f).target(0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uc042\ue799\uc01d\u3278\uc001\ue78b\uc00b\u327a\uc01f\ue7db", 1114260872))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uefad\uc802\uefc3\u1de8\uefc3\uc81d\uef8c\u1da1\uef80\uc802\uefc3\u1df5\uef8c\uc84d\uef87\u1de4\uef81\uc818\uef84\u1df4\uef89\uc808\uef90\u1dfb\uefdc", 1398237700));
            Runtime.getRuntime().halt(537367635);
        }
    }
}
