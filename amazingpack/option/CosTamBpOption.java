package amazingpack.option;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptions;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiPageButtonList;

public class CosTamBpOption extends Y<Float> implements GuiPageButtonList.GuiResponder, GuiSlider.FormatHelper
{
    private float min;
    private float max;
    
    public CosTamBpOption(final BpOptions options, final String key, final float defaultValue, final a categoryId, final float min, final float max) {
        super(options, key, defaultValue, categoryId);
        this.min = min;
        this.max = max;
    }
    
    @Override
    public String getValueText() {
        return (this.getValue() == null) ? WorldProviderHell$BlockRedstoneComparator.G("\uef74\u0cac\uef29\u54f3\uef30\u0ceb", 1137049810) : String.format(WorldProviderHell$BlockRedstoneComparator.G("\ue5ed\u0678\ue5fa\u5e6d", 2079197766), ((Y<Object>)this).getValue());
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
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u3015\u2dfe\u306a\u068f\u3076\u2dec\u307c\u068d\u3068\u2d9c", -1007594857))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u86e9\u9b56\u8687\ub02c\u8687\u9b49\u86c8\ub065\u86c4\u9b56\u8687\ub031\u86c8\u9b19\u86c3\ub020\u86c5\u9b4c\u86c0\ub030\u86cd\u9b5c\u86d4\ub03f\u8698", -1866079224));
        }
    }
}
