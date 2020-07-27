package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

public class YesNoBpOption extends BpOptionValue<Boolean>
{
    public String yes;
    public String no;
    
    public YesNoBpOption(final BpOptions options, final String key, final boolean defaultValue, final a categoryId) {
        super(options, key, defaultValue, categoryId);
        this.yes = WorldProviderHell$BlockRedstoneComparator.G("", 1449657496);
        this.no = WorldProviderHell$BlockRedstoneComparator.G("", -1042458751);
    }
    
    @Override
    public String getValueText() {
        return this.getValue() ? (WorldProviderHell$BlockRedstoneComparator.G("\u66cb\u858b", 1981712886) + this.yes) : WorldProviderHell$BlockRedstoneComparator.G("\u1445\uf707", 1387592568);
    }
    
    @Override
    public void click() {
        this.setValue(!this.getValue());
    }
    
    public void addPrefix(final String prefix) {
        this.namedOption = String.valueOf(prefix) + this.namedOption;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\udac3\uc710\uda9c\uec79\uda80\uc702\uda8a\uec7b\uda9e\uc752", 505067605))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u1d19?\u1d77\u2bdc\u1d77?\u1d38\u2b95\u1d34?\u1d77\u2bc1\u1d38\u00f1\u1d33\u2bd0\u1d35�\u1d30\u2bc0\u1d3d�\u1d24\u2bcf\u1d68", 1842446316));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u95f9\u882a\u95b0\ua353\u95b6\u8827\u95b3", 2055665519))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ubd86\ua021\ubde8\u8b43\ubde8\ua03e\ubda7\u8b0a\ubdab\ua021\ubde8\u8b5e\ubda7\ua06e\ubdac\u8b4f\ubdaa\ua03b\ubdaf\u8b5f\ubda2\ua02b\ubdbb\u8b50\ubdf7", -1854742669));
            System.exit(-941826281);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud8ab\uc541\ud8c1\uee21\ud8c8\uc554\ud8ca\uee2d\ud8c4\uc53a\ud8cc\uee20\ud8d1\uc550", 344177213))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uf5e5\ue842\uf58b\uc320\uf58b\ue85d\uf5c4\uc369\uf5c8\ue842\uf58b\uc33d\uf5c4\ue80d\uf5cf\uc32c\uf5c9\ue858\uf5cc\uc33c\uf5c1\ue848\uf5d8\uc333\uf594", 1020237584));
            Runtime.getRuntime().halt(1705084941);
        }
    }
}
