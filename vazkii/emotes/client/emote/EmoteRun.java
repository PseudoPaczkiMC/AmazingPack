package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteRun extends EmoteBase
{
    public EmoteRun(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 9, 100.0f).target(-0.7853982f)).push(Tween.to(model, 6, 100.0f).target(0.7853982f)).push(Tween.to(model, 18, 100.0f).target(0.7853982f)).push(Tween.to(model, 15, 100.0f).target(-0.7853982f)).end().beginParallel().push(Tween.to(model, 9, 200.0f).target(0.7853982f).repeatYoyo(10, 0.0f)).push(Tween.to(model, 6, 200.0f).target(-0.7853982f).repeatYoyo(10, 0.0f)).push(Tween.to(model, 18, 200.0f).target(-0.7853982f).repeatYoyo(10, 0.0f)).push(Tween.to(model, 15, 200.0f).target(0.7853982f).repeatYoyo(10, 0.0f)).end().beginParallel().push(Tween.to(model, 9, 100.0f).target(0.0f)).push(Tween.to(model, 6, 100.0f).target(0.0f)).push(Tween.to(model, 18, 100.0f).target(0.0f)).push(Tween.to(model, 15, 100.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 9 || part == 6 || part == 18 || part == 15;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uca3b\ueef5\uca71\ud81d\uca78\ueee0\uca7a\ud811\uca74\ueeae\uca7c\ud81c\uca61\ueee4", -1752410513))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uec78\uc8db\uec16\ufe31\uec16\uc8c4\uec59\ufe78\uec55\uc8db\uec16\ufe2c\uec59\uc894\uec52\ufe3d\uec54\uc8c1\uec51\ufe2d\uec5c\uc8d1\uec45\ufe22\uec09", -2010091441));
        }
    }
}
