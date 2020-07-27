package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteBalance extends EmoteBase
{
    public EmoteBalance(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 11, 2000.0f).target(-2.9415927f)).push(Tween.to(model, 8, 2000.0f).target(2.9415927f)).push(Tween.to(model, 17, 2000.0f).target(2.6179938f)).end().pushPause(2000.0f).beginParallel().push(Tween.to(model, 11, 500.0f).target(0.0f)).push(Tween.to(model, 8, 500.0f).target(0.0f)).push(Tween.to(model, 17, 500.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 0 || part == 9 || part == 6 || part == 18 || part == 15;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u105d\u2d8e\u1014\u02b7\u1012\u2d83\u1017", -1369603910))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ueb43\ud6e4\ueb2d\uf9c6\ueb2d\ud6fb\ueb62\uf98f\ueb6e\ud6e4\ueb2d\uf9db\ueb62\ud6ab\ueb69\uf9ca\ueb6f\ud6fe\ueb6a\uf9da\ueb67\ud6ee\ueb7e\uf9d5\ueb32", 1240431559));
            System.exit(777492103);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ua053\u9d99\ua019\ub2b9\ua010\u9d8c\ua012\ub2b5\ua01c\u9dc2\ua014\ub2b8\ua009\u9d88", 661336244))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u7e15\u43b2\u7e7b\u6c90\u7e7b\u43ad\u7e34\u6cd9\u7e38\u43b2\u7e7b\u6c8d\u7e34\u43fd\u7e3f\u6c9c\u7e39\u43a8\u7e3c\u6c8c\u7e31\u43b8\u7e28\u6c83\u7e64", 1625812625));
        }
    }
}
