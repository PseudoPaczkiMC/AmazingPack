package vazkii.emotes.client.emote;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;

public class EmotePoint extends EmoteBase
{
    public EmotePoint(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        super(player, model, armorModel, armorLegsModel);
    }
    
    @Override
    public Timeline getTimeline(final EntityPlayer player, final ModelBiped model) {
        final Timeline timeline = Timeline.createSequence().push(Tween.to(model, 6, 400.0f).target(-1.5707964f).repeatYoyo(1, 1000.0f));
        return timeline;
    }
    
    @Override
    public boolean usesBodyPart(final int part) {
        return part == 6;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uba3d\u9916\uba74\ua417\uba72\u991b\uba77", -508826258))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u9fd9\ubc86\u9fb7\u819c\u9fb7\ubc99\u9ff8\u81d5\u9ff4\ubc86\u9fb7\u8181\u9ff8\ubcc9\u9ff3\u8190\u9ff5\ubc9c\u9ff0\u8180\u9ffd\ubc8c\u9fe4\u818f\u9fa8", -582301463));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ubc1c\u9f2e\ubc56\ua236\ubc5f\u9f3b\ubc5d\ua23a\ubc53\u9f75\ubc5b\ua237\ubc46\u9f3f", 1288104783))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u9568\ub637\u9506\u8b2d\u9506\ub628\u9549\u8b64\u9545\ub637\u9506\u8b30\u9549\ub678\u9542\u8b21\u9544\ub62d\u9541\u8b31\u954c\ub63d\u9555\u8b3e\u9519", 2011677272));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u3b45\u185c\u3b29\u255c\u3b29\u1857\u3b2f\u254f\u3b26\u1842\u3b52", 457927702))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uec57\ucf08\uec39\uf212\uec39\ucf17\uec76\uf25b\uec7a\ucf08\uec39\uf20f\uec76\ucf47\uec7d\uf21e\uec7b\ucf12\uec7e\uf20e\uec73\ucf02\uec6a\uf201\uec26", -527516825));
            System.exit(-1348969135);
        }
    }
}
