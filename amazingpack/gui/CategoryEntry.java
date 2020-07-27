package amazingpack.gui;

import java.lang.management.ManagementFactory;

import amazingpack.option.GuiBpOptionsList;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;

public class CategoryEntry implements IGuiListEntry
{
    private a category;
    private int labelWidth;
    private String label;
    final GuiBpOptionsList this$0;
    
    public CategoryEntry(final GuiBpOptionsList this$0, final a text) {
        this.this$0 = this$0;
        this.setLabel(this.category = text);
    }
    
    public void reloadLabel() {
        this.setLabel(this.category);
    }
    
    public void setLabel(final a text) {
        this.category = text;
        if (Minecraft.getMinecraft().gameSettings.language.equalsIgnoreCase(WorldProviderHell$BlockRedstoneComparator.G("\u3dc5\u1e5b\u3dea\ufa1a\u3df9", 1561243136))) {
            this.label = GuiBpOptionsList.g[this.category.ordinal()];
        }
        else {
            this.label = GuiBpOptionsList.h[this.category.ordinal()];
        }
        this.labelWidth = Minecraft.fontRendererObj.getStringWidth(this.label);
    }
    
    @Override
    public void drawEntry(final int slotIndex, final int x, final int y, final int listWidth, final int slotHeight, final int mouseX, final int mouseY, final boolean isSelected) {
        Minecraft.fontRendererObj.drawString(this.label, GuiBpOptionsList.h(this.this$0).currentScreen.width / 2 - this.labelWidth / 2, y + slotHeight - Minecraft.fontRendererObj.FONT_HEIGHT - 1, 16777215);
    }
    
    @Override
    public boolean mousePressed(final int slotIndex, final int p_148278_2_, final int p_148278_3_, final int p_148278_4_, final int p_148278_5_, final int p_148278_6_) {
        return false;
    }
    
    @Override
    public void mouseReleased(final int slotIndex, final int x, final int y, final int mouseEvent, final int relativeX, final int relativeY) {
    }
    
    @Override
    public void setSelected(final int p_178011_1_, final int p_178011_2_, final int p_178011_3_) {
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u24a3\u3966\u24ef\u121e\u24ef\u396d\u24e9\u120d\u24e0\u3978\u24b4", 1432700450))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0907\u14a4\u0969\u3fc6\u0969\u14bb\u0926\u3f8f\u092a\u14a4\u0969\u3fdb\u0926\u14eb\u092d\u3fca\u092b\u14be\u092e\u3fda\u0923\u14ae\u093a\u3fd5\u0976", 794389477));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u101b\u0dcc\u1044\u26a5\u1058\u0dde\u1052\u26a7\u1046\u0d8e", -1667796326))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ud3b9\uce1a\ud3d7\ue578\ud3d7\uce05\ud398\ue531\ud394\uce1a\ud3d7\ue565\ud398\uce55\ud393\ue574\ud395\uce00\ud390\ue564\ud39d\uce10\ud384\ue56b\ud3c8", 982430043));
            System.exit(560317070);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u4b4e\u56b9\u4b27\u7dc0\u4b21\u56b4\u4b24", 808004047))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u77fd\u6a5e\u7793\u413c\u7793\u6a41\u77dc\u4175\u77d0\u6a5e\u7793\u4121\u77dc\u6a11\u77d7\u4130\u77d1\u6a44\u77d4\u4120\u77d9\u6a54\u77c0\u412f\u778c", 474682655));
        }
    }
}
