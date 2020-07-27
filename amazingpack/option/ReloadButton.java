package amazingpack.option;

import java.util.Map;

import amazingpack.main.AmazingGownoPack;
import amazingpack.option.BpOptionValue;
import amazingpack.option.BpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import java.awt.geom.Point2D;
import java.util.HashMap;

class ReloadButton extends BpOptionValue<HashMap<String, Point2D.Double>>
{
    final BpOptions bpOptions;
    
    ReloadButton(final BpOptions bpOptions, final BpOptions $anonymous0, final String $anonymous1, final HashMap $anonymous2, final a $anonymous3) {
        super($anonymous0, $anonymous1, $anonymous2, $anonymous3);
        this.bpOptions = bpOptions;
    }
    
    @Override
    public void click() {
        try {
            AmazingGownoPack.X();
            AmazingGownoPack.d(Minecraft.getMinecraft());
            AmazingGownoPack.Z();
            AmazingGownoPack.Y();
            AmazingGownoPack.reloadedWings = true;
            AmazingGownoPack.reloadItems = false;
            AmazingGownoPack.reloadWings = true;
            AmazingGownoPack.reloadItems1 = true;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getValueText() {
        return WorldProviderHell$BlockRedstoneComparator.G("", -1269613292);
    }
    
    @Override
    public String getButtonText() {
        return this.getOptionText();
    }
    
    @Override
    public boolean isDefaultOption() {
        for (final Map.Entry<String, Point2D.Double> entr : this.getValue().entrySet()) {
            if (!entr.getValue().equals(((HashMap)this.defaultValue).get(entr.getKey()))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void resetValue() {
        super.resetValue();
    }
}
