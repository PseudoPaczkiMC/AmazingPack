package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteClap extends EmoteBase
{
    public EmoteClap(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 6, 400.0f).target(-1.5707964f)).push(Tween.to(model, 9, 400.0f).target(-1.5707964f)).push(Tween.to(model, 7, 400.0f).target(-0.5353982f)).push(Tween.to(model, 10, 400.0f).target(0.5353982f)).end().beginParallel().push(Tween.to(model, 7, 100.0f).target(-0.38539818f).repeatYoyo(11, 0.0f)).push(Tween.to(model, 10, 100.0f).target(0.38539818f).repeatYoyo(11, 0.0f)).end().beginParallel().push(Tween.to(model, 6, 400.0f).target(0.0f)).push(Tween.to(model, 9, 400.0f).target(0.0f)).push(Tween.to(model, 7, 400.0f).target(0.0f)).push(Tween.to(model, 10, 400.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6 || part == 9;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u5163\u7598\u511c\u42b9\u5100\u758a\u510a\u42bb\u511e\u75fa", -1502886904))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u711a\u55b5\u7174\u629f\u7174\u55aa\u713b\u62d6\u7137\u55b5\u7174\u6282\u713b\u55fa\u7130\u6293\u7136\u55af\u7133\u6283\u713e\u55bf\u7127\u628c\u716b", 1168630802));
            Runtime.getRuntime().halt(1076640364);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u39b5\u1d6e\u39fc\u2a5f\u39fa\u1d63\u39ff", 1692118238))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u442c\u6083\u4442\u57a9\u4442\u609c\u440d\u57e0\u4401\u6083\u4442\u57b4\u440d\u60cc\u4406\u57a5\u4400\u6099\u4405\u57b5\u4408\u6089\u4411\u57ba\u445d", 2037240100));
            System.exit(189983569);
        }
    }
}
