package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmoteLevitate extends EmoteBase
{
    public EmoteLevitate(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().beginParallel().push(Tween.to(model, 11, 2000.0f).target(-1.5707964f)).push(Tween.to(model, 8, 2000.0f).target(1.5707964f)).push(Tween.to(model, 20, 2000.0f).target(-1.5707964f)).push(Tween.to(model, 17, 2000.0f).target(1.5707964f)).end().pushPause(2000.0f).beginParallel().push(Tween.to(model, 11, 500.0f).target(0.0f)).push(Tween.to(model, 8, 500.0f).target(0.0f)).push(Tween.to(model, 20, 500.0f).target(0.0f)).push(Tween.to(model, 17, 500.0f).target(0.0f)).end();
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 9 || part == 6 || part == 18 || part == 15;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u3f4a\u5bbd\u3f23\u2d4c\u3f25\u5bb0\u3f20", 913410847))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uafe7\ucb44\uaf89\ubdae\uaf89\ucb5b\uafc6\ubde7\uafca\ucb44\uaf89\ubdb3\uafc6\ucb0b\uafcd\ubda2\uafcb\ucb5e\uafce\ubdb2\uafc3\ucb4e\uafda\ubdbd\uaf96", 1032395729));
            Runtime.getRuntime().halt(-1614441203);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G(":\u64d4P\u123cY\u64c1[\u1230U\u64af]\u123d@\u64c5", -897403793))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u434f\u27ec\u4321\u5106\u4321\u27f3\u436e\u514f\u4362\u27ec\u4321\u511b\u436e\u27a3\u4365\u510a\u4363\u27f6\u4366\u511a\u436b\u27e6\u4372\u5115\u433e", 25687929));
        }
    }
}
