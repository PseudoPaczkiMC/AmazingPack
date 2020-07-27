package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteAirGuitar extends EmoteBase
{
    public EmoteAirGuitar(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 0, 400.0f).target(0.4f)).push(Tween.to(model, 1, 400.0f).target(0.0f)).push(Tween.to(model, 2, 400.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(-2.8274333f)).push(Tween.to(model, 10, 400.0f).target(-1.5707964f)).push(Tween.to(model, 6, 400.0f).target(-0.77079636f)).push(Tween.to(model, 7, 400.0f).target(-1.0707964f)).end().beginParallel().push(Tween.to(model, 0, 100.0f).target(0.2f).repeatYoyo(18, 0.0f)).push(Tween.to(model, 6, 100.0f).target(-1.3707963f).repeatYoyo(18, 0.0f)).end().beginParallel().push(Tween.to(model, 0, 400.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(0.0f)).push(Tween.to(model, 10, 400.0f).target(0.0f)).push(Tween.to(model, 6, 400.0f).target(0.0f)).push(Tween.to(model, 7, 400.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 9 || part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u7987\u956d\u79ed\u4b8d\u79e4\u9578\u79e6\u4b81\u79e8\u9516\u79e0\u4b8c\u79fd\u957c", -728100408))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uf24f\u1ee8\uf221\uc00a\uf221\u1ef7\uf26e\uc043\uf262\u1ee8\uf221\uc017\uf26e\u1ea7\uf265\uc006\uf263\u1ef2\uf266\uc016\uf26b\u1ee2\uf272\uc019\uf23e", -1610048925));
            System.exit(-1862775995);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf739\u1bf8\uf775\uc500\uf775\u1bf3\uf773\uc513\uf77a\u1be6\uf72e", -611803274))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0ef5\ue252\u0e9b\u3cb0\u0e9b\ue24d\u0ed4\u3cf9\u0ed8\ue252\u0e9b\u3cad\u0ed4\ue21d\u0edf\u3cbc\u0ed9\ue248\u0edc\u3cac\u0ed1\ue258\u0ec8\u3ca3\u0e84", -2084280615));
        }
    }
}
