package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiPageButtonList;

public class BpValue extends BpOptionValue<Float> implements GuiPageButtonList.GuiResponder, GuiSlider.FormatHelper
{
    public BpValue(final BpOptions options, final String key, final float defaultValue, final a categoryId) {
        super(options, key, defaultValue, categoryId);
    }
    
    @Override
    public String getValueText() {
        return (this.getValue() == null) ? WorldProviderHell$BlockRedstoneComparator.G("\u7964\u9aac\u7939\uc2e3\u7920\u9aeb", 1085118170) : String.format(WorldProviderHell$BlockRedstoneComparator.G("\u64cd\u8748\u64d9\udf4d\u64cd\u8743", 464489342), this.getValue() * 100.0f);
    }
    
    @Override
    public boolean isValidOption(final Float value) {
        return super.isValidOption(value) && value >= 0.0f && value <= 1.0f;
    }
    
    @Override
    protected GuiButton createGui0() {
        return new GuiSlider(this, this.buttonId, 0, 0, this.getButtonText(), 0.0f, 1.0f, this.getValue(), this);
    }
    
    @Override
    public void resetValue() {
        super.resetValue();
        this.fixSlider();
    }
    
    @Override
    public void func_175321_a(final int p_175321_1_, final boolean p_175321_2_) {
    }
    
    @Override
    public void onTick(final int id, final float value) {
        this.setValue(value);
    }
    
    @Override
    public void func_175319_a(final int p_175319_1_, final String p_175319_2_) {
    }
    
    @Override
    public String getText(final int id, final String name, final float value) {
        final float prev = this.getValue();
        this.setValue(value);
        final String res = this.getButtonText();
        this.setValue(prev);
        return res;
    }
    
    public void fixSlider() {
        ((GuiSlider)this.getGui()).func_175218_a(this.getValue(), false);
    }
    
    @Override
    public boolean isValidOption(final Object o) {
        return this.isValidOption((Float)o);
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf610\uebd2\uf65a\uc0ba\uf653\uebc7\uf651\uc0b6\uf65f\ueb89\uf657\uc0bb\uf64a\uebc3", 395220106))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ub747\uaae8\ub729\u8182\ub729\uaaf7\ub766\u81cb\ub76a\uaae8\ub729\u819f\ub766\uaaa7\ub76d\u818e\ub76b\uaaf2\ub76e\u819e\ub763\uaae2\ub77a\u8191\ub736", -1520708162));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ub061\uad88\ub00d\u86f8\ub00d\uad83\ub00b\u86eb\ub002\uad96\ub076", -362032389))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u2cde\u3171\u2cb0\u1a1b\u2cb0\u316e\u2cff\u1a52\u2cf3\u3171\u2cb0\u1a06\u2cff\u313e\u2cf4\u1a17\u2cf2\u316b\u2cf7\u1a07\u2cfa\u317b\u2ce3\u1a08\u2caf", 1967607335));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6b02\u76f9\u6b7d\u5d98\u6b61\u76eb\u6b6b\u5d9a\u6b7f\u769b", 857475480))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u7421\u698e\u744f\u42e4\u744f\u6991\u7400\u42ad\u740c\u698e\u744f\u42f9\u7400\u69c1\u740b\u42e8\u740d\u6994\u7408\u42f8\u7405\u6984\u741c\u42f7\u7450", 1104352984));
        }
    }
}
