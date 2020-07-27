package amazingpack.gui;

import java.lang.management.ManagementFactory;

import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiPageButtonList;

public class GuiSlider extends BpOptionValue<Integer> implements GuiPageButtonList.GuiResponder, net.minecraft.client.gui.GuiSlider.FormatHelper
{
    public int min;
    public int max;
    
    public GuiSlider(final BpOptions options, final String key, final int defaultValue, final a categoryId, final int min, final int max) {
        super(options, key, defaultValue, categoryId);
        this.min = min;
        this.max = max;
    }
    
    @Override
    public String getValueText() {
        return (this.getValue() == null) ? WorldProviderHell$BlockRedstoneComparator.G("\u8046\u638e\u801b\u3bc3\u8002\u63c9", 139554777) : Integer.toString(this.getValue());
    }
    
    public boolean isValidOption(final int value) {
        return super.isValidOption(value) && value >= this.min && value <= this.max;
    }
    
    @Override
    protected GuiButton createGui0() {
        return new net.minecraft.client.gui.GuiSlider(this, this.buttonId, 0, 0, this.getButtonText(), (float)this.min, (float)this.max, this.getValue(), this);
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
        this.setValue(Math.round(value));
        this.fixSlider();
    }
    
    @Override
    public void func_175319_a(final int p_175319_1_, final String p_175319_2_) {
    }
    
    @Override
    public String getText(final int id, final String name, final float value) {
        final int prev = this.getValue();
        this.setValue(Math.round(value));
        final String res = this.getButtonText();
        this.setValue(prev);
        return res;
    }
    
    public void fixSlider() {
        ((net.minecraft.client.gui.GuiSlider)this.getGui()).func_175218_a(this.getValue(), false);
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ua7ce\uba00\ua784\u9128\ua78d\uba15\ua78f\u9124\ua781\uba5b\ua789\u9129\ua794\uba11", 1942537531))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u73b7\u6e14\u73d9\u453e\u73d9\u6e0b\u7396\u4577\u739a\u6e14\u73d9\u4523\u7396\u6e5b\u739d\u4532\u739b\u6e0e\u739e\u4522\u7393\u6e1e\u738a\u452d\u73c6", 1242632481));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u5c3c\u41f9\u5c70\u6ac9\u5c70\u41f2\u5c76\u6ada\u5c7f\u41e7\u5c2b", 1660239561))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u2b3a\u3699\u2b54\u1db3\u2b54\u3686\u2b1b\u1dfa\u2b17\u3699\u2b54\u1dae\u2b1b\u36d6\u2b10\u1dbf\u2b16\u3683\u2b13\u1daf\u2b1e\u3693\u2b07\u1da0\u2b4b", 1463699884));
            Runtime.getRuntime().halt(1429214023);
        }
    }
}
