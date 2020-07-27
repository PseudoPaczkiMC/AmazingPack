package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptions;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiPageButtonList;

public class SliderBpOption extends Y<Float> implements GuiPageButtonList.GuiResponder, GuiSlider.FormatHelper
{
    private float min;
    private float max;
    private float cachedPowered;
    
    public SliderBpOption(final BpOptions options, final String key, final float defaultValue, final a categoryId, final float min, final float max) {
        super(options, key, defaultValue, categoryId);
        this.min = min;
        this.max = max;
        this.calcValuePowered();
    }
    
    @Override
    public String getValueText() {
        return (this.getValue() == null) ? WorldProviderHell$BlockRedstoneComparator.G("\u33d9\ud011\u3384\u885e\u339d\ud056", -172172169) : String.format(WorldProviderHell$BlockRedstoneComparator.G("\u32b8\ud177", -409281253), (int)this.getValuePowered());
    }
    
    public float getValuePowered() {
        return this.cachedPowered;
    }
    
    public void calcValuePowered() {
        this.cachedPowered = (float)Math.pow(2.0, this.getValue());
    }
    
    @Override
    public boolean isValidOption(final Float value) {
        return super.isValidOption(value) && value >= this.min && value <= this.max;
    }
    
    @Override
    protected GuiButton createGui0() {
        return new GuiSlider(this, this.buttonId, 0, 0, this.getButtonText(), this.min, this.max, this.getValue(), this);
    }
    
    @Override
    public void resetValue() {
        super.resetValue();
        this.calcValuePowered();
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
    public boolean setValue(final Float value) {
        final boolean ret = super.setValue(value);
        this.calcValuePowered();
        return ret;
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
    
    @Override
    public boolean setValue(final Object o) {
        return this.setValue((Float)o);
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u8d20\u90e2\u8d6a\ubb8a\u8d63\u90f7\u8d61\ubb86\u8d6f\u90b9\u8d67\ubb8b\u8d7a\u90f3", -11276374))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0f57\u12f8\u0f39\u3992\u0f39\u12e7\u0f76\u39db\u0f7a\u12f8\u0f39\u398f\u0f76\u12b7\u0f7d\u399e\u0f7b\u12e2\u0f7e\u398e\u0f73\u12f2\u0f6a\u3981\u0f26", 1367174590));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud60d\ucbe4\ud661\ue094\ud661\ucbef\ud667\ue087\ud66e\ucbfa\ud61a", 246002823))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u3191\u2c3e\u31ff\u0754\u31ff\u2c21\u31b0\u071d\u31bc\u2c3e\u31ff\u0749\u31b0\u2c71\u31bb\u0758\u31bd\u2c24\u31b8\u0748\u31b5\u2c34\u31ac\u0747\u31e0", 1472353144));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u2e5f\u3384\u2e00\u18e5\u2e1c\u3396\u2e16\u18e7\u2e02\u33c6", -1566356267))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u14e3\u094c\u148d\u2226\u148d\u0953\u14c2\u226f\u14ce\u094c\u148d\u223b\u14c2\u0903\u14c9\u222a\u14cf\u0956\u14ca\u223a\u14c7\u0946\u14de\u2235\u1492", 1166177802));
        }
    }
}
