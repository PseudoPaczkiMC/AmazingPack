package vazkii.emotes.client.emote.base;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.model.ModelBiped;

public class EmoteState
{
    float[] states;
    EmoteBase emote;
    
    public EmoteState(final EmoteBase emote) {
        this.states = new float[0];
        this.emote = emote;
    }
    
    public void save(final ModelBiped model) {
        final float[] values = { 0.0f };
        for (int i = 0; i < 20; ++i) {
            ModelAccessor.INSTANCE.getValues(model, i, values);
            this.states[i] = values[0];
        }
    }
    
    public void load(final ModelBiped model) {
        if (this.states.length == 0) {
            this.states = new float[20];
            return;
        }
        final float[] values = { 0.0f };
        for (int i = 0; i < 20; ++i) {
            values[0] = this.states[i];
            final int part = i / 3 * 3;
            if (this.emote.usesBodyPart(part)) {
                ModelAccessor.INSTANCE.setValues(model, i, values);
            }
        }
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ua14e\ucca0\ua124\u9380\ua12d\uccb5\ua12f\u938c\ua121\uccdb\ua129\u9381\ua134\uccb1", -964425297))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u1300\u7ea3\u136e\u2181\u136e\u7ebc\u1321\u21c8\u132d\u7ea3\u136e\u219c\u1321\u7eec\u132a\u218d\u132c\u7eb9\u1329\u219d\u1324\u7ea9\u133d\u2192\u1371", 1805826946));
        }
    }
}
