package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

public class VoidBpOption extends BpOptionValue<Void>
{
    public VoidBpOption(final BpOptions options, final String key, final a categoryId) {
        super(options, key, null, categoryId);
    }
    
    @Override
    public boolean isValidOption(final Void value) {
        return true;
    }
    
    @Override
    public String getValueText() {
        return WorldProviderHell$BlockRedstoneComparator.G("", 146588824);
    }
    
    @Override
    public Void getValue() {
        return null;
    }
    
    @Override
    public boolean isDefaultOption() {
        return true;
    }
    
    @Override
    public boolean loadValue(final Object value) {
        return false;
    }
    
    @Override
    public void resetValue() {
    }
    
    @Override
    public boolean setValue(final Void value) {
        return true;
    }
    
    @Override
    public String getButtonText() {
        return this.getOptionText();
    }
    
    @Override
    public boolean isValidOption(final Object o) {
        return this.isValidOption((Void)o);
    }
    
    @Override
    public boolean setValue(final Object o) {
        return this.setValue((Void)o);
    }
    
    @Override
    public Object getValue() {
        return this.getValue();
    }
}
