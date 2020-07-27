package amazingpack.gui;

import amazingpack.util.ChatUtil;
import net.minecraft.client.Minecraft;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiBlacklist extends GuiScreen
{
    private final String reason;
    private final String date;
    
    public GuiBlacklist(final String reason, final String date) {
        this.reason = reason;
        this.date = date;
    }
    
    @Override
    public void initGui() {
        this.buttonList.add(new GuiButton(1, this.width / 2 - 50, this.height / 2 + 30, 90, 20, WorldProviderHell$BlockRedstoneComparator.G("\u9460\uf0d9\u9457\uee15\u9454\uf0d1\u9450\uee5e\u945d\uf0ca\u945f\uee5f", 481147447)));
        super.initGui();
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, ChatUtil.fixColor(WorldProviderHell$BlockRedstoneComparator.G("\u74d2\u1911\u74b5\u0a02\u7495\u1908\u749d\u0a01\u7493\u1922\u7495\u0a0c\u749f\u1953", -217948634)), this.width / 2, 70, 16777215);
        this.drawCenteredString(this.fontRendererObj, ChatUtil.fixColor((WorldProviderHell$BlockRedstoneComparator.G("\ue8f3\u8564\ue881\u9639\ue8ba\u8539\ue8b0\u966e\ue8be\u853c\ue8bb\u963a\ue8ba\u8573\ue8ba\u963a\ue8a7\u8529\ue8ac\u9623\ue8b4\u853f\ue8ba\u966e\ue8b7\u853f\ue8b4\u962d\ue8be\u853f\ue8bc\u963d\ue8a1\u8536", -2086485497)), this.width / 2, 90, 16777215);
        this.drawCenteredString(this.fontRendererObj, ChatUtil.fixColor(WorldProviderHell$BlockRedstoneComparator.G("\ua96f\uc4f8\ua919\ud7bd\ua93e\uc4a0\ua92d\ud7e8\ua969", 1929937819) + this.reason), this.width / 2, 110, 16777215);
        this.drawCenteredString(this.fontRendererObj, ChatUtil.fixColor(WorldProviderHell$BlockRedstoneComparator.G("\u8302\uee95\u8367\ufdc5\u8345\ueed1\u8304\ufdcb\u8356\ueed5\u8345\ufdd1\u834d\ueec3\u8304\ufddd\u8348\ueec3\u8347\ufdd4\u8348\ueecb\u8357\ufdcb\u835d\uee98\u8304", -1204049418) + this.date), this.width / 2, 130, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    @Override
    protected void keyTyped(final char typedChar, final int keyCode) throws IOException {
    }
    
    @Override
    protected void actionPerformed(final GuiButton button) throws IOException {
        if (button.id == 1) {
            Minecraft.getMinecraft().shutdown();
        }
        super.actionPerformed(button);
    }
}
