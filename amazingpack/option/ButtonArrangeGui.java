package amazingpack.option;

import java.util.Map;

import amazingpack.gui.ArrangeGui;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;
import java.awt.geom.Point2D;
import java.util.HashMap;

class ButtonArrangeGui extends BpOptionValue<HashMap<String, Point2D.Double>>
{
    final BpOptions this$0;
    
    ButtonArrangeGui(final BpOptions this$0, final BpOptions $anonymous0, final String $anonymous1, final HashMap $anonymous2, final a $anonymous3) {
        super($anonymous0, $anonymous1, $anonymous2, $anonymous3);
        this.this$0 = this$0;
    }
    
    @Override
    public void click() {
        Minecraft.getMinecraft().displayGuiScreen(new ArrangeGui());
    }
    
    @Override
    public String getValueText() {
        return WorldProviderHell$BlockRedstoneComparator.G("", 18781531);
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
