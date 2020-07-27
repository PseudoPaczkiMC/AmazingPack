package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

public class YesNo2BpOption extends BpOptionValue<Boolean>
{
    public String yes;
    public String no;
    
    public YesNo2BpOption(final BpOptions options, final String key, final boolean defaultValue, final a categoryId) {
        super(options, key, defaultValue, categoryId);
        this.yes = WorldProviderHell$BlockRedstoneComparator.G("", -1443305123);
        this.no = WorldProviderHell$BlockRedstoneComparator.G("", 167025418);
    }
    
    @Override
    public String getValueText() {
        return this.getValue() ? (WorldProviderHell$BlockRedstoneComparator.G("\u933b\u7003", -285705181) + this.yes) : (WorldProviderHell$BlockRedstoneComparator.G("\u4127\ua21d", -196497857) + this.no);
    }
    
    @Override
    public void click() {
        this.setValue(!this.getValue());
    }
    
    public void addPrefix(final String prefix) {
        this.namedOption = String.valueOf(prefix) + this.namedOption;
    }
}
