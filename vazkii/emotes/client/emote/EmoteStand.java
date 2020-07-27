package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteStand extends EmoteBase
{
    public EmoteStand(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 6, 400.0f).target(-0.3f)).push(Tween.to(model, 7, 400.0f).target(0.0f)).push(Tween.to(model, 8, 400.0f).target(-1.1780972f)).push(Tween.to(model, 9, 400.0f).target(0.3f)).push(Tween.to(model, 10, 400.0f).target(0.0f)).push(Tween.to(model, 11, 400.0f).target(0.7853982f)).end().repeatYoyo(1, 2000.0f);
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 9 || part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ucc7b\uebac\ucc32\ube95\ucc34\ueba1\ucc31", -870905454))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ub792\u9031\ub7fc\uc513\ub7fc\u902e\ub7b3\uc55a\ub7bf\u9031\ub7fc\uc50e\ub7b3\u907e\ub7b8\uc51f\ub7be\u902b\ub7bb\uc50f\ub7b6\u903b\ub7af\uc500\ub7e3", 1079407128));
            Runtime.getRuntime().halt(-2138018184);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf8cd\udf23\uf8a7\u8a03\uf8ae\udf36\uf8ac\u8a0f\uf8a2\udf58\uf8aa\u8a02\uf8b7\udf32", 591281444))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ued28\uca8b\ued46\u9fa9\ued46\uca94\ued09\u9fe0\ued05\uca8b\ued46\u9fb4\ued09\ucac4\ued02\u9fa5\ued04\uca91\ued01\u9fb5\ued0c\uca81\ued15\u9fba\ued59", -85579614));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud641\uf1a4\ud62d\ua49c\ud62d\uf1af\ud62b\ua48f\ud622\uf1ba\ud656", 1379013544))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u2166\u06c5\u2108\u53e7\u2108\u06da\u2147\u53ae\u214b\u06c5\u2108\u53fa\u2147\u068a\u214c\u53eb\u214a\u06df\u214f\u53fb\u2142\u06cf\u215b\u53f4\u2117", 454485228));
        }
    }
}
