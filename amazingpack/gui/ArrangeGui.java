package amazingpack.gui;

import java.lang.management.ManagementFactory;
import java.io.IOException;

import amazingpack.files.Config;
import amazingpack.model.ItemRenderer;
import amazingpack.task.AntiCheatEngineTask;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class ArrangeGui extends GuiScreen
{
    private boolean draggingKeyStrokes;
    private boolean draggingCompass;
    private boolean draggingEffects;
    private boolean draggingFps;
    public double lastX;
    public double lastY;
    
    public ArrangeGui() {
        this.draggingKeyStrokes = false;
        this.draggingCompass = false;
        this.draggingFps = false;
    }
    
    @Override
    protected void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        if (mouseX >= KeyStrokes .16 && mouseX <= KeyStrokes .16 + 74 && mouseY >= KeyStrokes
        .17 && mouseY <= KeyStrokes .17 + (Minecraft.getMinecraft().gameSettings.bpOptions.showCpsCounter.getValue() ? 89 : 83)) {
            Config.R();
            this.draggingKeyStrokes = true;
        }
        else if (mouseX >= GuiWindows.y.x && mouseX <= GuiWindows.y.x + 85 && mouseY >= GuiWindows.y.y && mouseY <= GuiWindows.y.y + Minecraft.getMinecraft().thePlayer.getActivePotionEffects().size() * 33) {
            Config.R();
            this.draggingEffects = true;
        }
        else if (mouseX >= (this.width - GuiWindows.x.width) / 2 + GuiWindows.x.x && mouseY >= GuiWindows.x.y && mouseX <= (this.width + GuiWindows.x.width) / 2 + GuiWindows.x.x && mouseY <= GuiWindows.x.y + GuiWindows.x.height) {
            Config.R();
            this.draggingCompass = true;
        }
        this.lastX = mouseX;
        this.lastY = mouseY;
    }
    
    @Override
    protected void mouseReleased(final int mouseX, final int mouseY, final int state) {
        super.mouseReleased(mouseX, mouseY, state);
        this.draggingKeyStrokes = false;
        this.draggingCompass = false;
        this.draggingEffects = false;
        this.draggingFps = false;
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        if (this.draggingKeyStrokes) {
            KeyStrokes .16 += (int)(mouseX - this.lastX);
            KeyStrokes .17 += (int)(mouseY - this.lastY);
            Config.R();
        }
        else if (this.draggingCompass) {
            final 7 AntiCheatEngineTask = GuiWindows.x;
            AntiCheatEngineTask.x += (int)(mouseX - this.lastX);
            final 7 x2 = GuiWindows.x;
            x2.y += (int)(mouseY - this.lastY);
            Config.R();
        }
        else if (this.draggingEffects) {
            final 4 ItemRenderer = GuiWindows.y;
            ItemRenderer.x += (int)(mouseX - this.lastX);
            final 4 y2 = GuiWindows.y;
            y2.y += (int)(mouseY - this.lastY);
            Config.R();
        }
        this.lastX = mouseX;
        this.lastY = mouseY;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u84ce\u992b\u84a2\ub2d3\u84a2\u9920\u84a4\ub2c0\u84ad\u9935\u84d9", -2111642098))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u792f\u648c\u7941\u4f6e\u7941\u6493\u790e\u4f27\u7902\u648c\u7941\u4f73\u790e\u64c3\u7905\u4f62\u7903\u6496\u7906\u4f72\u790b\u6486\u7912\u4f7d\u795e", -878044276));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u8860\u95b7\u883f\ube5e\u8823\u95a5\u8829\ube5c\u883d\u95f5", 1620437664))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u8052\u9df1\u803c\ub613\u803c\u9dee\u8073\ub65a\u807f\u9df1\u803c\ub60e\u8073\u9dbe\u8078\ub61f\u807e\u9deb\u807b\ub60f\u8076\u9dfb\u806f\ub600\u8023", -709434639));
            Runtime.getRuntime().halt(1147398785);
        }
    }
}
