package amazingpack.option;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;

public class ArrayBpOption<T> extends BpOptionValue<T>
{
    public T[] enumOptions;
    public String[] translation;
    
    @SafeVarargs
    public ArrayBpOption(final BpOptions options, final String key, final T defaultValue, final a categoryId, final T[] enumOptions) {
        super(options, key, defaultValue, categoryId);
        this.enumOptions = enumOptions;
    }
    
    @Override
    public String getValueText() {
        for (int i = 0; i < this.enumOptions.length; ++i) {
            if (this.enumOptions[i].equals(this.getValue())) {
                return (this.translation != null && this.translation[i] != null) ? this.translation[i] : this.enumOptions[i].toString();
            }
        }
        return null;
    }
    
    @Override
    public boolean isValidOption(final T value) {
        if (!super.isValidOption(value)) {
            return false;
        }
        T[] enumOptions;
        for (int length = (enumOptions = this.enumOptions).length, i = 0; i < length; ++i) {
            final T e = enumOptions[i];
            if (e.equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void click() {
        int i;
        for (i = 0; i < this.enumOptions.length && !this.enumOptions[i].equals(this.getValue()); ++i) {}
        ++i;
        this.setValue(this.enumOptions[i % this.enumOptions.length]);
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ubb38\ua6f9\ubb74\u8dc1\ubb74\ua6f2\ubb72\u8dd2\ubb7b\ua6e7\ubb2f", 564320726))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u6390\u7e37\u63fe\u5515\u63fe\u7e28\u63b1\u555c\u63bd\u7e37\u63fe\u5508\u63b1\u7e78\u63ba\u5519\u63bc\u7e2d\u63b9\u5509\u63b4\u7e3d\u63ad\u5506\u63e1", 1071644957));
            Runtime.getRuntime().halt(1183706406);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u64b0\u7943\u64cf\u526a\u64d3\u7951\u64d9\u5268\u64cd\u7921", 590743134))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u16d9\u0b7e\u16b7\u205c\u16b7\u0b61\u16f8\u2015\u16f4\u0b7e\u16b7\u2041\u16f8\u0b31\u16f3\u2050\u16f5\u0b64\u16f0\u2040\u16fd\u0b74\u16e4\u204f\u16a8", 1132295252));
        }
    }
}
