package amazingpack.option;

import amazingpack.option.BpOptionValue;
import amazingpack.option.GuiBpOptions;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiListExtended;

public class RowBpOption implements GuiListExtended.IGuiListEntry
{
    public GuiButton[] buttons;
    public GuiBpOptions options;
    public int listWidth;
    
    public RowBpOption(final GuiBpOptions gui, final BpOptionValue<?>[] options) {
        this.buttons = new GuiButton[options.length];
        for (int i = 0; i < this.buttons.length; ++i) {
            this.buttons[i] = options[i].getGui();
        }
        this.options = gui;
    }
    
    @Override
    public void setSelected(final int p_178011_1_, final int p_178011_2_, final int p_178011_3_) {
    }
    
    @Override
    public void drawEntry(final int slotIndex, final int x, final int y, final int listWidth, final int slotHeight, final int mouseX, int mouseY, final boolean isSelected) {
        if (mouseY > this.options.list.bottom) {
            mouseY = Integer.MAX_VALUE;
        }
        final int w = listWidth / ((this.buttons.length == 0) ? 1 : this.buttons.length);
        int i = 0;
        GuiButton[] buttons;
        for (int length = (buttons = this.buttons).length, j = 0; j < length; ++j) {
            final GuiButton button = buttons[j];
            button.width = w;
            button.height = 20;
            button.xPosition = x + listWidth * i / this.buttons.length;
            button.yPosition = y;
            button.drawButton(Minecraft.getMinecraft(), mouseX, mouseY);
            ++i;
        }
    }
    
    @Override
    public boolean mousePressed(final int slotIndex, final int mouseX, final int mouseY, final int mouseEvent, final int relativeX, final int relativeY) {
        GuiButton[] buttons;
        for (int length = (buttons = this.buttons).length, i = 0; i < length; ++i) {
            final GuiButton button = buttons[i];
            if (button.mousePressed(Minecraft.getMinecraft(), mouseX, mouseY)) {
                button.playPressSound(Minecraft.getMinecraft().getSoundHandler());
                final BpOptionValue<?> opt = Minecraft.getMinecraft().gameSettings.bpOptions.options.get(button.id);
                if (opt != null) {
                    opt.click();
                    this.options.options.bpOptions.saveOptions();
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void mouseReleased(final int slotIndex, final int x, final int y, final int mouseEvent, final int relativeX, final int relativeY) {
        GuiButton[] buttons;
        for (int length = (buttons = this.buttons).length, i = 0; i < length; ++i) {
            final GuiButton button = buttons[i];
            button.mouseReleased(x, y);
        }
    }
    
    public boolean mouseRightClicked(final int i, final int mouseX, final int mouseY, final int mouseEvent, final int l, final int i1) {
        final GuiButton[] buttons;
        final int length = (buttons = this.buttons).length;
        int j = 0;
        while (j < length) {
            final GuiButton button = buttons[j];
            if (button.mousePressed(Minecraft.getMinecraft(), mouseX, mouseY)) {
                final BpOptionValue<?> opt = Minecraft.getMinecraft().gameSettings.bpOptions.options.get(button.id);
                if (opt != null && opt.rightClick()) {
                    button.playPressSound(Minecraft.getMinecraft().getSoundHandler());
                    this.options.options.bpOptions.saveOptions();
                    return true;
                }
                return false;
            }
            else {
                ++j;
            }
        }
        return false;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u5a83\u474d\u5ac9\u6c6d\u5ac0\u4758\u5ac2\u6c61\u5acc\u4716\u5ac4\u6c6c\u5ad9\u475c", 1131755619))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u5223\u4f80\u524d\u64a2\u524d\u4f9f\u5202\u64eb\u520e\u4f80\u524d\u64bf\u5202\u4fcf\u5209\u64ae\u520f\u4f9a\u520a\u64be\u5207\u4f8a\u521e\u64b1\u5252", 2003710112));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u31ad\u2c68\u31e1\u0750\u31e1\u2c63\u31e7\u0743\u31ee\u2c76\u31ba", -107588787))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u1690\u0b33\u16fe\u2011\u16fe\u0b2c\u16b1\u2058\u16bd\u0b33\u16fe\u200c\u16b1\u0b7c\u16ba\u201d\u16bc\u0b29\u16b9\u200d\u16b4\u0b39\u16ad\u2002\u16e1", -1839827949));
            System.exit(1200302987);
        }
    }
}
