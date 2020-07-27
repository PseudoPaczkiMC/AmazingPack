package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteGangnamStyle extends EmoteBase
{
    public boolean emote;
    
    public EmoteGangnamStyle(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 6, 400.0f).target(-1.3707963f)).push(Tween.to(model, 9, 400.0f).target(-1.7707964f)).push(Tween.to(model, 7, 400.0f).target(-0.63539815f)).push(Tween.to(model, 10, 400.0f).target(0.63539815f)).push(Tween.to(model, 17, 200.0f).target(0.5235988f)).push(Tween.to(model, 20, 200.0f).target(-0.5235988f)).end().beginParallel().push(Tween.to(model, 6, 200.0f).target(-0.77079636f).repeatYoyo(16, 0.0f)).push(Tween.to(model, 9, 200.0f).target(-1.1707964f).repeatYoyo(16, 0.0f)).push(Tween.to(model, 17, 200.0f).target(0.92359877f).repeatYoyo(8, 200.0f)).push(Tween.to(model, 20, 200.0f).delay(200.0f).target(-0.92359877f).repeatYoyo(8, 200.0f)).end().beginParallel().push(Tween.to(model, 6, 400.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(0.0f)).push(Tween.to(model, 7, 400.0f).target(0.0f)).push(Tween.to(model, 10, 400.0f).target(0.0f)).push(Tween.to(model, 17, 200.0f).target(0.0f)).push(Tween.to(model, 20, 200.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 9 || part == 6 || part == 18 || part == 15;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf2fd\uef0a\uf282\uc06b\uf29e\uef18\uf294\uc069\uf280\uef68", 1165021800))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uc23a\udf99\uc254\uf0f3\uc254\udf86\uc21b\uf0ba\uc217\udf99\uc254\uf0ee\uc21b\udfd6\uc210\uf0ff\uc216\udf83\uc213\uf0ef\uc21e\udf93\uc207\uf0e0\uc24b", 237560524));
            System.exit(-1762586163);
        }
    }
}
