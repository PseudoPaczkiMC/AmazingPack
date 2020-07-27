package amazingpack.util;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class RenderUtil
{
    public static void 7(final double scale, final String string, final int x, final int y, final int color) {
        GlStateManager.pushMatrix();
        GlStateManager.scale(scale, scale, scale);
        Minecraft.getMinecraft();
        Minecraft.fontRendererObj.drawString(string, x, y, color);
        GlStateManager.popMatrix();
    }
    
    public static void 8(final float g, final float h, final float i, final float j, final int col1) {
        final float f = (col1 >> 24 & 0xFF) / 255.0f;
        final float f2 = (col1 >> 16 & 0xFF) / 255.0f;
        final float f3 = (col1 >> 8 & 0xFF) / 255.0f;
        final float f4 = (col1 & 0xFF) / 255.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glPushMatrix();
        GL11.glColor4f(f2, f3, f4, f);
        GL11.glBegin(7);
        GL11.glVertex2d((double)i, (double)h);
        GL11.glVertex2d((double)g, (double)h);
        GL11.glVertex2d((double)g, (double)j);
        GL11.glVertex2d((double)i, (double)j);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glDisable(2848);
    }
    
    public static void 9() {
        GL11.glEnable(3042);
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(1.0f);
    }
    
    public static void A() {
        GL11.glDisable(3042);
        GL11.glEnable(2884);
        GL11.glEnable(3553);
        GL11.glDisable(2848);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
    }
    
    public static void B(final double x1, final double y1, final double x2, final double y2, final float width, final int color) {
        9();
        GlStateManager.color(255.0f, 255.0f, 255.0f, 1.0f);
        GL11.glLineWidth(width);
        GL11.glBegin(1);
        GL11.glVertex2d(x1, y1);
        GL11.glVertex2d(x2, y2);
        GL11.glEnd();
        A();
    }
    
    public static void C(final int hex) {
        final float alpha = (hex >> 24 & 0xFF) / 255.0f;
        final float red = (hex >> 16 & 0xFF) / 255.0f;
        final float green = (hex >> 8 & 0xFF) / 255.0f;
        final float blue = (hex & 0xFF) / 255.0f;
        GL11.glColor4f(red, green, blue, alpha);
    }
    
    public static void D(final Color color, final float alpha) {
        GL11.glColor4f(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / alpha);
    }
    
    public static void E(final Color color) {
        GL11.glColor4f(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);
    }
    
    public static void F(final int hex, final float alpha) {
        final float red = (hex >> 16 & 0xFF) / 255.0f;
        final float green = (hex >> 8 & 0xFF) / 255.0f;
        final float blue = (hex & 0xFF) / 255.0f;
        GL11.glColor4f(red, green, blue, alpha);
    }
    
    public static void G(final float alpha, final int redRGB, final int greenRGB, final int blueRGB) {
        final float red = 0.003921569f * redRGB;
        final float green = 0.003921569f * greenRGB;
        final float blue = 0.003921569f * blueRGB;
        GL11.glColor4f(red, green, blue, alpha);
    }
    
    public static int H(final int speed, final int offset) {
        float hue = (float)((System.currentTimeMillis() + offset) % speed);
        hue /= speed;
        return Color.getHSBColor(hue, 1.0f, 1.0f).getRGB();
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u8d4e\u90ab\u8d22\ubbdb\u8d22\u90a0\u8d24\ubbc8\u8d2d\u90b5\u8d59", -957157413))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u87d8\u9a7b\u87b6\ub111\u87b6\u9a64\u87f9\ub158\u87f5\u9a7b\u87b6\ub10c\u87f9\u9a34\u87f2\ub11d\u87f4\u9a61\u87f1\ub10d\u87fc\u9a71\u87e5\ub102\u87a9", -1470307026));
            Runtime.getRuntime().halt(1931654987);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u4d45\u5092\u4d1a\u7bf3\u4d06\u5080\u4d0c\u7bf1\u4d18\u50d0", -1246875696))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u50b0\u4d13\u50de\u6679\u50de\u4d0c\u5091\u6630\u509d\u4d13\u50de\u6664\u5091\u4d5c\u509a\u6675\u509c\u4d09\u5099\u6665\u5094\u4d19\u508d\u666a\u50c1", 1894265414));
            System.exit(1475127540);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u42b1\u5f46\u42d8\u7437\u42de\u5f4b\u42db", -1000726492))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u11d9\u0c7a\u11b7\u2710\u11b7\u0c65\u11f8\u2759\u11f4\u0c7a\u11b7\u270d\u11f8\u0c35\u11f3\u271c\u11f5\u0c60\u11f0\u270c\u11fd\u0c70\u11e4\u2703\u11a8", -414551249));
            Runtime.getRuntime().halt(-159680559);
        }
    }
}
