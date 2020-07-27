package amazingpack.option;

import java.lang.management.ManagementFactory;
import org.apache.commons.lang3.ArrayUtils;
import net.minecraft.client.Minecraft;
import java.util.Objects;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiButton;

public class BpOptionValue<T>
{
    public final String key;
    public final T defaultValue;
    public final int buttonId;
    private T value;
    public BpOptions options;
    public String namedOption;
    public GuiButton button;
    public boolean isDefaultValue;
    public String[] tooltip;
    public final a categoryId;
    
    public a getCategory() {
        return this.categoryId;
    }
    
    public BpOptionValue(final BpOptions options, final String key, final T defaultValue, final a categoryId) {
        this.key = key;
        this.categoryId = categoryId;
        this.options = options;
        this.buttonId = options.options.size();
        options.options.add(this);
        this.defaultValue = defaultValue;
        this.value = defaultValue;
        this.tooltip = new String[0];
    }
    
    public boolean isValidOption(final T value) {
        return value != null;
    }
    
    public String getValueText() {
        return (this.value == null) ? WorldProviderHell$BlockRedstoneComparator.G("\ubf3f\u5ce7\ubf62\u04b8\ubf7b\u5ca0", 1247105209) : this.value.toString();
    }
    
    public String getOptionText() {
        return (this.namedOption == null) ? this.key : this.namedOption;
    }
    
    public String getButtonText() {
        return String.valueOf(this.getOptionText()) + WorldProviderHell$BlockRedstoneComparator.G("\ua608\u8594", -1967086167) + this.getValueText();
    }
    
    public String[] getDescription() {
        return null;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public void resetValue() {
        if (this.defaultValue instanceof Cloneable) {
            try {
                this.value = (T)this.defaultValue.getClass().getDeclaredMethod(WorldProviderHell$BlockRedstoneComparator.G("\u073f\u38b2\u0733\u82d7\u0739", 424269524), (Class<?>[])new Class[0]).invoke(this.defaultValue, new Object[0]);
            }
            catch (Exception e) {
                this.value = this.defaultValue;
            }
        }
        else {
            this.value = this.defaultValue;
        }
        this.getGui().displayString = this.getButtonText();
        this.onChange();
    }
    
    public boolean isDefaultOption() {
        return true;
    }
    
    public boolean loadValue(final Object value) {
        return this.setValue(value);
    }
    
    public boolean setValue(final T value) {
        if (Objects.equals(value, this.value)) {
            return true;
        }
        if (this.isValidOption(value)) {
            this.value = value;
            this.getGui().displayString = this.getButtonText();
            if (!this.isDefaultOption()) {
                Minecraft.getMinecraft().gameSettings.bpOptions.isDefaultSettings = false;
            }
            else {
                Minecraft.getMinecraft().gameSettings.bpOptions.isDefaultSettings = true;
                for (final BpOptionValue<?> opt : Minecraft.getMinecraft().gameSettings.bpOptions.options) {
                    if (!opt.isDefaultOption()) {
                        Minecraft.getMinecraft().gameSettings.bpOptions.isDefaultSettings = false;
                        break;
                    }
                }
            }
            this.onChange();
            return true;
        }
        return false;
    }
    
    public void click() {
    }
    
    public void onChange() {
    }
    
    protected GuiButton createGui0() {
        return new GuiButton(this.buttonId, 0, 0, this.getButtonText());
    }
    
    public final GuiButton getGui() {
        if (this.button == null) {
            this.button = this.createGui0();
        }
        return this.button;
    }
    
    public boolean rightClick() {
        return false;
    }
    
    public void addTooltip(final String[] arr) {
        this.tooltip = (String[])ArrayUtils.addAll((Object[])this.tooltip, (Object[])arr);
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uabbd\ub664\uabf1\u9d44\uabf1\ub66f\uabf7\u9d57\uabfe\ub67a\uabaa", -790247073))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ucb59\ud6e6\ucb37\ufddc\ucb37\ud6f9\ucb78\ufd95\ucb74\ud6e6\ucb37\ufdc1\ucb78\ud6a9\ucb73\ufdd0\ucb75\ud6fc\ucb70\ufdc0\ucb7d\ud6ec\ucb64\ufdcf\ucb28", 1714203096));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u2592\u3859\u25cd\u1368\u25d1\u384b\u25db\u136a\u25cf\u381b", 1648969584))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ue361\ufede\ue30f\ud5e4\ue30f\ufec1\ue340\ud5ad\ue34c\ufede\ue30f\ud5f9\ue340\ufe91\ue34b\ud5e8\ue34d\ufec4\ue348\ud5f8\ue345\ufed4\ue35c\ud5f7\ue310", -2013298208));
            Runtime.getRuntime().halt(-666777033);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u0c07\u11cc\u0c4e\u3aed\u0c48\u11c1\u0c4d", -572559643))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u2f1f\u32a0\u2f71\u199a\u2f71\u32bf\u2f3e\u19d3\u2f32\u32a0\u2f71\u1987\u2f3e\u32ef\u2f35\u1996\u2f33\u32ba\u2f36\u1986\u2f3b\u32aa\u2f22\u1989\u2f6e", 704007582));
            Runtime.getRuntime().halt(-1452183100);
        }
    }
}
