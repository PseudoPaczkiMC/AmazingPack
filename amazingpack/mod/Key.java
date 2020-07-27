package amazingpack.mod;

import java.lang.management.ManagementFactory;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.Gui;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

public class Key
{
    private final Minecraft mc;
    private final KeyBinding key;
    private int xOffset;
    private int yOffset;
    private boolean wasPressed;
    private long lastPress;
    private int color;
    private double textBrightness;
    private int width;
    private int height;
    public boolean visible;
    
    public Key(final KeyBinding key, final int xOffset, final int yOffset) {
        this.mc = Minecraft.getMinecraft();
        this.wasPressed = true;
        this.lastPress = 0L;
        this.color = 255;
        this.textBrightness = 1.0;
        this.width = 22;
        this.height = 22;
        this.visible = true;
        this.key = key;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
    
    public void setSize(final int width, final int height) {
        this.width = width;
        this.height = height;
    }
    
    public void renderKey(final int x, final int y) {
        if (!this.visible) {
            return;
        }
        final boolean pressed = this.key.isKeyDown();
        final int keyCode = this.key.getKeyCode();
        String name = GameSettings.getKeyDisplayString(keyCode);
        if (name.equals(WorldProviderHell$BlockRedstoneComparator.G("\u9bf7\ub772\u9be5\u0685\u9be1", -1816243546))) {
            name = WorldProviderHell$BlockRedstoneComparator.G("\uae7a\u8236\uaefd\u339f\uaefd\u827b\uaefd\u339f\uaefd\u827b\uaefd\u339f\uaefd\u827b\uaefd\u339f\uaefd\u827b", 918382559);
        }
        if (pressed != this.wasPressed) {
            this.wasPressed = pressed;
            this.lastPress = System.currentTimeMillis();
        }
        if (pressed) {
            this.color = Math.min(255, (int)(2L * (System.currentTimeMillis() - this.lastPress)));
            this.textBrightness = Math.max(0.0, 1.0 - (System.currentTimeMillis() - this.lastPress) / 20.0);
        }
        else {
            this.color = Math.max(0, 255 - (int)(2L * (System.currentTimeMillis() - this.lastPress)));
            this.textBrightness = Math.min(1.0, (System.currentTimeMillis() - this.lastPress) / 20.0);
        }
        Gui.drawRect(x + this.xOffset, y + this.yOffset, x + this.xOffset + this.width, y + this.yOffset + this.height, 2013265920 + (this.color << 16) + (this.color << 8) + this.color);
        int defcolor;
        final int colors = defcolor = Minecraft.getMinecraft().gameSettings.bpOptions.keystrokesColors.getValue();
        switch (colors) {
            case 0: {
                defcolor = 16777215;
                break;
            }
            case 1: {
                defcolor = 255;
                break;
            }
            case 2: {
                defcolor = 16711680;
                break;
            }
            case 3: {
                defcolor = 32768;
                break;
            }
            case 4: {
                defcolor = 16776960;
                break;
            }
            case 5: {
                defcolor = 12059647;
                break;
            }
            case 6: {
                defcolor = ColorUtil .12(2, 15);
                break;
            }
        }
        final int textWidth = Minecraft.fontRendererObj.getStringWidth(name);
        final int centerPosX = this.width / 2;
        final int centerPosY = this.height / 2;
        if (textWidth < 10) {
            Minecraft.fontRendererObj.drawString(name, x + this.xOffset + centerPosX - 3, y + this.yOffset + centerPosY - 3, -16777216 + defcolor);
        }
        else {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            Minecraft.fontRendererObj.drawString(name, (x + this.xOffset + centerPosX) * 2 - textWidth / 2, (y + this.yOffset + centerPosY) * 2 - 3, -16777216 + defcolor);
            GL11.glScalef(2.0f, 2.0f, 2.0f);
        }
    }
    
    public void setPosition(final int x, final int y) {
        this.xOffset = x;
        this.yOffset = y;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u549b\u4948\u54d2\u6271\u54d4\u4945\u54d1", 849557108))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u1e8e\u0329\u1ee0\u280b\u1ee0\u0336\u1eaf\u2842\u1ea3\u0329\u1ee0\u2816\u1eaf\u0366\u1ea4\u2807\u1ea2\u0333\u1ea7\u2817\u1eaa\u0323\u1eb3\u2818\u1eff", -1698726910));
            System.exit(1161338596);
        }
    }
}
