package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteCheer extends EmoteBase
{
    public EmoteCheer(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 8, 400.0f).target(2.6415927f)).push(Tween.to(model, 11, 400.0f).target(-2.6415927f)).end().beginParallel().push(Tween.to(model, 6, 150.0f).target(-0.6f).repeatYoyo(11, 0.0f)).push(Tween.to(model, 9, 150.0f).target(-0.6f).repeatYoyo(11, 0.0f)).end().beginParallel().push(Tween.to(model, 8, 400.0f).target(0.0f)).push(Tween.to(model, 11, 400.0f).target(0.0f)).push(Tween.to(model, 6, 400.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6 || part == 9;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf5b4\u1167\uf5eb\uca0e\uf5f7\u1175\uf5fd\uca0c\uf5e9\u1125", -1775693150))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u4327\ua780\u4349\u7ce2\u4349\ua79f\u4306\u7cab\u430a\ua780\u4349\u7cff\u4306\ua7cf\u430d\u7cee\u430b\ua79a\u430e\u7cfe\u4303\ua78a\u431a\u7cf1\u4356", 1784194130));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ubd3d\u59ee\ubd74\u8297\ubd72\u59e3\ubd77", 1843288619))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\udb3c\u3f9b\udb52\ue4f9\udb52\u3f84\udb1d\ue4b0\udb11\u3f9b\udb52\ue4e4\udb1d\u3fd4\udb16\ue4f5\udb10\u3f81\udb15\ue4e5\udb18\u3f91\udb01\ue4ea\udb4d", 1117797449));
            System.exit(1751721014);
        }
    }
}
