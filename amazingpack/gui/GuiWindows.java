package amazingpack.gui;

import amazingpack.mod.KeyStrokes;
import amazingpack.model.ItemRenderer;
import amazingpack.task.AntiCheatEngineTask;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import reifnsk.minimap.ReiMinimap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class GuiWindows extends GuiIngame
{
    private static Minecraft w;
    public static AntiCheatEngineTask AntiCheatEngineTask;
    public static ItemRenderer ItemRenderer;
    public static KeyStrokes z;
    public static ReiMinimap reiMiniMap;
    
    static {
          GuiWindows.w = Minecraft.getMinecraft();
    }
    
    public GuiWindows(final Minecraft mcIn) {
        super(mcIn);
        GuiWindows.x = new G(GuiWindows.w);
        GuiWindows.y = new 4(GuiWindows.w);
        GuiWindows.z = new KeyStrokes(mcIn);
        GuiWindows.reiMiniMap = ReiMinimap.instance;
    }
    
    @Override
    public void renderGameOverlay(final float partialTicks) {
        super.renderGameOverlay(partialTicks);
        if (!GuiWindows.w.gameSettings.showDebugInfo) {
            if (Minecraft.getMinecraft().gameSettings.bpOptions.enableCompass.getValue()) {
                final ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft());
                GuiWindows.x.drawCompass(res.getScaledWidth());
            }
            if (Minecraft.getMinecraft().gameSettings.bpOptions.showActivePotions.getValue()) {
                GuiWindows.y.render();
            }
            if (Minecraft.getMinecraft().gameSettings.bpOptions.keystrokesEnabled.getValue()) {
                GuiWindows.z.render();
            }

            //info od vexia
            // Powodzenia z wydajnoscia tej gowno mapki, to powinno byc wykonywane tak jak w nazwie metody co TICK
            // nie co render jebany pseudolu
            GuiWindows.reiMiniMap.onTickInGame(partialTicks, GuiWindows.w);
        }
    }
}
