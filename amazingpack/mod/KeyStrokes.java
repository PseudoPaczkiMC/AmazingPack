package amazingpack.mod;

import java.awt.Color;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class KeyStrokes
{
    private static ScaledResolution 15;
    public static int 16;
    public static int 17;
    private static final int[] 18;
    private final Key[] movementKeys;
    private final MouseButton[] mouseButtons;
    private final Minecraft mc;
    
    static {
        KeyStrokes .16 = 350;
        KeyStrokes .17 = 0;
        18 = new int[] { 16777215, 16711680, 65280, 255, 16776960, 11141290 };
    }
    
    public KeyStrokes(final Minecraft mc) {
        this.mc = mc;
        this.movementKeys = new Key[4];
        this.mouseButtons = new MouseButton[2];
        this.movementKeys[0] = new Key(mc.gameSettings.keyBindForward, 26, 2);
        this.movementKeys[1] = new Key(mc.gameSettings.keyBindBack, 26, 26);
        this.movementKeys[2] = new Key(mc.gameSettings.keyBindLeft, 2, 26);
        this.movementKeys[3] = new Key(mc.gameSettings.keyBindRight, 50, 26);
        this.mouseButtons[0] = new MouseButton(0, 2, 50);
        this.mouseButtons[1] = new MouseButton(1, 38, 50);
    }
    
    private int getRainbow(final int speed, final int offset) {
        float hue = (float)((System.currentTimeMillis() + offset) % speed);
        hue /= speed;
        return Color.getHSBColor(hue, 1.0f, 1.0f).getRGB();
    }
    
    public void render() {
        KeyStrokes .15 = new ScaledResolution(this.mc);
        final int width = 74;
        final int height = 74;
        if (KeyStrokes .17 > KeyStrokes .15.getScaledHeight() - 74) {
            KeyStrokes .17 = KeyStrokes .15.getScaledHeight() - 74;
        }
        else if (KeyStrokes .16 > KeyStrokes .15.getScaledWidth() - 74) {
            KeyStrokes .16 = KeyStrokes .15.getScaledWidth() - 74;
        }
        this.drawMovementKeys(KeyStrokes .16, KeyStrokes .17);
        this.drawMouseButtons(KeyStrokes .16, KeyStrokes .17);
    }
    
    private void drawMovementKeys(final int x, final int y) {
        Key[] movementKeys;
        for (int length = (movementKeys = this.movementKeys).length, i = 0; i < length; ++i) {
            final Key key = movementKeys[i];
            key.renderKey(x, y);
        }
    }
    
    private void drawMouseButtons(final int x, final int y) {
        MouseButton[] mouseButtons;
        for (int length = (mouseButtons = this.mouseButtons).length, i = 0; i < length; ++i) {
            final MouseButton button = mouseButtons[i];
            button.renderMouseButton(x, y);
        }
    }
}
