package amazingpack.option;

import java.lang.management.ManagementFactory;

import net.minecraft.client.gui.GuiListExtended;
import java.util.List;
import java.io.IOException;

import net.minecraft.client.resources.I18n;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.gui.GuiScreen;

public class GuiBpOptions extends GuiScreen
{
    public GameSettings options;
    public GuiScreen parentScreen;
    public GuiBpOptionsList list;
    public String screenTitle;
    private int lastMouseX;
    private int lastMouseY;
    private GuiButton lastButton;
    private long mouseStillTime;
    
    public GuiBpOptions(final GuiScreen screen, final GameSettings settings) {
        this.screenTitle = WorldProviderHell$BlockRedstoneComparator.G("\u62f2\u4758\u62d2\u6012\u62da\u475b\u62d4\u6038\u62d2\u4756\u62d8\u6048\u62fc\u4745\u62c7\u6001\u62dc\u475b\u62c0\u6046\u629d\u471b", -1060883440);
        this.lastMouseX = 0;
        this.lastMouseY = 0;
        this.lastButton = null;
        this.mouseStillTime = 0L;
        this.parentScreen = screen;
        this.options = settings;
    }
    
    @Override
    public void initGui() {
        this.list = new GuiBpOptionsList(this, this.mc);
        this.screenTitle = I18n.format(WorldProviderHell$BlockRedstoneComparator.G("\ud5fe\ub150\ud5de\uaf81\ud5d6\ub153\ud5d8\uafab\ud5de\ub15e\ud5d4\uafdb\ud5f0\ub14d\ud5cb\uaf92\ud5d0\ub153\ud5cc\uafd5\ud591\ub113", -150602877), new Object[0]);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(200, this.width / 2 - 50, this.height - 29, 100, 20, I18n.format(WorldProviderHell$BlockRedstoneComparator.G("\u75df\u114f\u75d1\u0fd2\u75dc\u1155\u75d6\u0f99", -1935516796), new Object[0])));
        this.options.bpOptions.arrangeGui.getGui().enabled = (this.mc.theWorld != null);
        this.options.bpOptions.setLanguage();
    }
    
    @Override
    protected void actionPerformed(final GuiButton button) throws IOException {
        if (button.id == 200) {
            this.mc.displayGuiScreen(this.parentScreen);
        }
        else if (button.id == 201) {
            for (final BpOptionValue<?> opt : this.options.bpOptions.options) {
                if (!opt.isDefaultOption()) {
                    opt.resetValue();
                }
            }
            this.options.bpOptions.isDefaultSettings = true;
            this.options.bpOptions.saveOptions();
        }
        else {
            this.list.actionPerformed(button);
        }
    }
    
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        this.options.bpOptions.saveOptions();
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.drawDefaultBackground();
        this.list.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / 2, 16, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
        if (this.lastButton != null && this.lastButton == this.getHoveredButton() && Math.abs(mouseX - this.lastMouseX) <= 5 && Math.abs(mouseY - this.lastMouseY) <= 5) {
            if (System.currentTimeMillis() >= this.mouseStillTime + 700L) {
                final BpOptionValue<?> opt = this.options.bpOptions.options.get(this.lastButton.id);
                if (opt != null && opt.tooltip != null) {
                    final int left = this.width / 2 - 150;
                    int top = this.height / 6 - 5;
                    if (mouseY <= top + 98) {
                        top += 105;
                    }
                    final int right = left + 150 + 150;
                    int pixels = 0;
                    for (int i = 0; i < opt.tooltip.length; ++i) {
                        final String s1 = opt.tooltip[i];
                        final List lista = this.fontRendererObj.listFormattedStringToWidth(s1, right - left - 10);
                        for (final Object s2 : lista) {
                            pixels += 11;
                        }
                        pixels += 13;
                    }
                    int bottom = top + pixels;
                    if (bottom > this.height) {
                        final int toMove = bottom - this.height;
                        top -= toMove;
                        top = Math.max(0, top);
                        bottom = top + pixels;
                    }
                    this.drawGradientRect(left, top, right, bottom, -536870912, -536870912);
                    int line = 0;
                    for (int j = 0; j < opt.tooltip.length; ++j) {
                        final String s3 = opt.tooltip[j];
                        final List<String> lista2 = (List<String>)this.fontRendererObj.listFormattedStringToWidth(s3, right - left - 10);
                        for (final String s4 : lista2) {
                            this.fontRendererObj.drawStringWithShadow(s4, (float)(left + 5), (float)(top + 5 + line), 14540253);
                            line += 11;
                        }
                        line += 13;
                    }
                }
            }
        }
        else {
            this.lastMouseX = mouseX;
            this.lastMouseY = mouseY;
            this.lastButton = this.getHoveredButton();
            this.mouseStillTime = System.currentTimeMillis();
        }
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.list.handleMouseInput();
    }
    
    @Override
    protected void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) throws IOException {
        if (mouseButton != 0) {
            if (!this.list.mouseRightClicked(mouseX, mouseY, mouseButton)) {
                super.mouseClicked(mouseX, mouseY, mouseButton);
            }
        }
        else if (!this.list.mouseClicked(mouseX, mouseY, mouseButton)) {
            super.mouseClicked(mouseX, mouseY, mouseButton);
        }
    }
    
    @Override
    protected void mouseReleased(final int mouseX, final int mouseY, final int state) {
        if (state != 0 || !this.list.mouseReleased(mouseX, mouseY, state)) {
            super.mouseReleased(mouseX, mouseY, state);
        }
    }
    
    @Override
    protected void keyTyped(final char typedChar, final int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }
    
    private GuiButton getHoveredButton() {
        GuiListExtended.IGuiListEntry[] entries;
        for (int length = (entries = this.list.entries).length, i = 0; i < length; ++i) {
            final GuiListExtended.IGuiListEntry row = entries[i];
            if (row instanceof RowBpOption) {
                GuiButton[] buttons;
                for (int length2 = (buttons = ((RowBpOption)row).buttons).length, j = 0; j < length2; ++j) {
                    final GuiButton button = buttons[j];
                    if (button.isMouseOver()) {
                        return button;
                    }
                }
            }
        }
        return null;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u9fc1\u8212\u9f9e\ua93b\u9f82\u8200\u9f88\ua939\u9f9c\u8250", -259785418))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u6c8f\u7128\u6ce1\u5a0a\u6ce1\u7137\u6cae\u5a43\u6ca2\u7128\u6ce1\u5a17\u6cae\u7167\u6ca5\u5a06\u6ca3\u7132\u6ca6\u5a16\u6cab\u7122\u6cb2\u5a19\u6cfe", 1944391195));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf722\ueaf1\uf76b\uc1c8\uf76d\ueafc\uf768", -1402890795))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u34c4\u2963\u34aa\u0241\u34aa\u297c\u34e5\u0208\u34e9\u2963\u34aa\u025c\u34e5\u292c\u34ee\u024d\u34e8\u2979\u34ed\u025d\u34e0\u2969\u34f9\u0252\u34b5", 484202064));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u3a5f\u27b5\u3a35\u0c95\u3a3c\u27a0\u3a3e\u0c99\u3a30\u27ce\u3a38\u0c94\u3a25\u27a4", -293709656))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uacc6\ub161\uaca8\u9a43\uaca8\ub17e\uace7\u9a0a\uaceb\ub161\uaca8\u9a5e\uace7\ub12e\uacec\u9a4f\uacea\ub17b\uacef\u9a5f\uace2\ub16b\uacfb\u9a50\uacb7", 1266601554));
        }
    }
}
