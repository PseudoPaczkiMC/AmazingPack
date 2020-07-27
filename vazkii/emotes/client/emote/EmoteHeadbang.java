package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteHeadbang extends EmoteBase
{
    public EmoteHeadbang(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 6, 400.0f).target(-3.1415927f)).push(Tween.to(model, 0, 400.0f).target(0.0f)).push(Tween.to(model, 1, 400.0f).target(0.0f)).push(Tween.to(model, 2, 400.0f).target(0.0f)).end().beginParallel().push(Tween.to(model, 6, 300.0f).target(-1.1415927f).repeatYoyo(11, 0.0f)).push(Tween.to(model, 0, 300.0f).target(1.1415927f).repeatYoyo(11, 0.0f)).end().push(Tween.to(model, 6, 600.0f).target(0.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6 || part == 0;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6c36\u48ff\u6c7a\u73cf\u6c7a\u48f4\u6c7c\u73dc\u6c75\u48e1\u6c21", -1810040035))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u93f9\ub756\u9397\u8c7c\u9397\ub749\u93d8\u8c35\u93d4\ub756\u9397\u8c61\u93d8\ub719\u93d3\u8c70\u93d5\ub74c\u93d0\u8c60\u93dd\ub75c\u93c4\u8c6f\u9388", -452852559));
            Runtime.getRuntime().halt(1351290719);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf909\uddf2\uf976\ue6d3\uf96a\udde0\uf960\ue6d1\uf974\udd90", 665349666))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uf551\ud1fe\uf53f\uead4\uf53f\ud1e1\uf570\uea9d\uf57c\ud1fe\uf53f\ueac9\uf570\ud1b1\uf57b\uead8\uf57d\ud1e4\uf578\ueac8\uf575\ud1f4\uf56c\ueac7\uf520", 119366169));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u0119\u25e2\u0170\u1ed3\u0176\u25ef\u0173", 1238668850))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uaa96\u8e39\uaaf8\ub513\uaaf8\u8e26\uaab7\ub55a\uaabb\u8e39\uaaf8\ub50e\uaab7\u8e76\uaabc\ub51f\uaaba\u8e23\uaabf\ub50f\uaab2\u8e33\uaaab\ub500\uaae7", -366133794));
            Runtime.getRuntime().halt(1992203046);
        }
    }
}
