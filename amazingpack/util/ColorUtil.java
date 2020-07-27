package amazingpack.util;

import net.minecraft.util.EnumChatFormatting;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

import java.awt.Color;

public class ColorUtil
{
    public static final Color COLOR;
    public static final Color Field_1;
    public static final Color Field_2;
    public static final int Field_3 = 300;
    public static final int Field_4 = 15;
    
    static {
        COLOR = new Color(0, 135, 255);
        Field_1 = new Color(71, 77, 100);
        Field_2 = new Color((float)Color.BLACK.getRed(), (float)Color.BLACK.getGreen(), (float)Color.BLACK.getBlue(), 0.7f);
    }
    
    public static int y(final int speed, final int offset) {
        return z(speed, offset, System.currentTimeMillis());
    }
    
    public static int z(final int speed, final int offset, final long time) {
        return getRainbow(speed, offset, time, 1.0f);
    }
    
    public static int getRainbow(final int speed, final int offset, final long time, final float s) {
        float hue = (float)((time + offset) % speed);
        hue /= speed;
        return Color.getHSBColor(hue, s, 1.0f).getRGB();
    }
    
    public static Color createColor(final int mouseX, final int mouseY) {
        final ByteBuffer rgb = BufferUtils.createByteBuffer(3);
        GL11.glReadPixels(mouseX, mouseY, 1, 1, 6407, 5121, rgb);
        final float red = (float)(rgb.get(0) & 0xFF);
        final float green = (float)(rgb.get(1) & 0xFF);
        final float blue = (float)(rgb.get(2) & 0xFF);
        return new Color(red / 255.0f, green / 255.0f, blue / 255.0f);
    }
    
    public static int rainbowColor(final int speed, final int offset) {
        float hue = (float)((System.currentTimeMillis() + offset) % speed);
        hue /= speed;
        return Color.HSBtoRGB(System.currentTimeMillis() % 1000L / 1000.0f, 0.8f, 0.8f);
    }
    
    public Color getTeamColor(final String playerName) {
        final String color = playerName.substring(1, 2);
        final EnumChatFormatting color2 = EnumChatFormatting.getValueByName(color);
        return ColorUtil.COLOR;
    }
    
    public static Color setAlpha(final Color c, final int alpha) {
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), alpha);
    }
}
