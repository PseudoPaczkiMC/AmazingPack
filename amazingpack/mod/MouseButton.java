package amazingpack.mod;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Mouse;
import java.util.ArrayList;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

import java.util.List;
import net.minecraft.client.Minecraft;

public class MouseButton
{
    private static final String[] X = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u7e6b\u63f4\u7e65", 976952553), WorldProviderHell$BlockRedstoneComparator.G("\u39bb\u243a\u39ab", 1435851559) };
    private final Minecraft mc;
    private final int button;
    private final int xOffset;
    private final int yOffset;
    private final List<Long> clicks;
    private boolean wasPressed;
    private long lastPress;
    private int color;
    private double textBrightness;

    public MouseButton(final int button, final int xOffset, final int yOffset) {
        this.mc = Minecraft.getMinecraft();
        this.clicks = new ArrayList<Long>();
        this.wasPressed = true;
        this.lastPress = 0L;
        this.color = 255;
        this.textBrightness = 1.0;
        this.button = button;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
    
    private int getCPS() {
        final long time = System.currentTimeMillis();
        this.clicks.removeIf(MouseButton::g);
        return this.clicks.size();
    }
    
    public void renderMouseButton(final int x, final int y) {
        final boolean pressed = Mouse.isButtonDown(this.button);
        final String name = MouseButton.X[this.button];
        if (pressed != this.wasPressed) {
            this.wasPressed = pressed;
            this.lastPress = System.currentTimeMillis();
            if (pressed) {
                this.clicks.add(this.lastPress);
            }
        }
        if (pressed) {
            this.color = Math.min(255, (int)(2L * (System.currentTimeMillis() - this.lastPress)));
            this.textBrightness = Math.max(0.0, 1.0 - (System.currentTimeMillis() - this.lastPress) / 20.0);
        }
        else {
            this.color = Math.max(0, 255 - (int)(2L * (System.currentTimeMillis() - this.lastPress)));
            this.textBrightness = Math.min(1.0, (System.currentTimeMillis() - this.lastPress) / 20.0);
        }
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
        Gui.drawRect(x + this.xOffset, y + this.yOffset, x + this.xOffset + 34, y + this.yOffset + 22, 2013265920 + (this.color << 16) + (this.color << 8) + this.color);
        Minecraft.fontRendererObj.drawString(name, x + this.xOffset + 8, y + this.yOffset + 4, -16777216 + defcolor);
        Minecraft.fontRendererObj.drawString(name, x + this.xOffset + 8, y + this.yOffset + 4, -16777216 + defcolor);
        final String cpsText = this.getCPS() + " CPS", -80054948);
        final int cpsTextWidth = Minecraft.fontRendererObj.getStringWidth(cpsText);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        if (Minecraft.getMinecraft().gameSettings.bpOptions.showCpsCounter.getValue()) {
            Minecraft.fontRendererObj.drawString(cpsText, (x + this.xOffset + 17) * 2 - cpsTextWidth / 2, (y + this.yOffset + 14) * 2, -16777216 + ((int)(255.0 * this.textBrightness) << 16) + ((int)(255.0 * this.textBrightness) << 8) + (int)(255.0 * this.textBrightness));
        }
        GL11.glScalef(2.0f, 2.0f, 2.0f);
    }
    
    private static boolean g(final long n, final Long aLong) {
        return aLong + 1000L < n;
    }
}
