package amazingpack.mod;

import java.lang.management.ManagementFactory;
import net.minecraft.util.StringUtils;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.font.effects.ColorEffect;
import java.awt.Color;
import java.awt.Font;
import org.newdawn.slick.UnicodeFont;
import net.minecraft.client.Minecraft;

public class UnicodeRenderer
{
    private Minecraft mc;
    private final UnicodeFont unicodeFont;
    private final int[] colorCodes;
    private int fontType;
    private int size;
    private String fontName;
    private float kerning;
    
    public UnicodeRenderer(final String fontName, final int fontType, final int size) {
        this(fontName, fontType, size, 0.0f);
    }
    
    public UnicodeRenderer(final String fontName, final int fontType, final int size, final float kerning) {
        this.mc = Minecraft.getMinecraft();
        this.colorCodes = new int[32];
        this.fontName = fontName;
        this.fontType = fontType;
        this.size = size;
        this.unicodeFont = new UnicodeFont(new Font(fontName, fontType, size));
        this.kerning = kerning;
        this.unicodeFont.addAsciiGlyphs();
        this.unicodeFont.getEffects().add(new ColorEffect(Color.WHITE));
        try {
            this.unicodeFont.loadGlyphs();
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            final int shadow = (i2 >> 3 & 0x1) * 85;
            int red = (i2 >> 2 & 0x1) * 170 + shadow;
            int green = (i2 >> 1 & 0x1) * 170 + shadow;
            int blue = (i2 & 0x1) * 170 + shadow;
            if (i2 == 6) {
                red += 85;
            }
            if (i2 >= 16) {
                red /= 4;
                green /= 4;
                blue /= 4;
            }
            this.colorCodes[i2] = ((red & 0xFF) << 16 | (green & 0xFF) << 8 | (blue & 0xFF));
        }
    }
    
    public int drawString(final String text, float x2, float y2, final int color) {
        y2 *= 2.0f;
        final float originalX;
        x2 = (originalX = x2 * 2.0f);
        GL11.glPushMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
        final boolean blend = GL11.glIsEnabled(3042);
        final boolean lighting = GL11.glIsEnabled(2896);
        final boolean texture = GL11.glIsEnabled(3553);
        if (!blend) {
            GL11.glEnable(3042);
        }
        if (lighting) {
            GL11.glDisable(2896);
        }
        if (texture) {
            GL11.glDisable(3553);
        }
        int currentColor = color;
        final char[] characters = text.toCharArray();
        int index = 0;
        char[] array;
        for (int length = (array = characters).length, i = 0; i < length; ++i) {
            final char c2 = array[i];
            if (c2 == '\r') {
                x2 = originalX;
            }
            if (c2 == '\n') {
                y2 += this.getHeight(Character.toString(c2)) * 2.0f;
            }
            if (c2 != '�' && (index == 0 || index == characters.length - 1 || characters[index - 1] != '�')) {
                this.unicodeFont.drawString(x2, y2, Character.toString(c2), new org.newdawn.slick.Color(currentColor));
                x2 += this.getWidth(Character.toString(c2)) * 2.0f;
            }
            else if (c2 == ' ') {
                x2 += this.unicodeFont.getSpaceWidth();
            }
            else if (c2 == '�' && index != characters.length - 1) {
                final int codeIndex = WorldProviderHell$BlockRedstoneComparator.G("\u9aa6\ub725\u9aa4\u0477\u9aa2\ub721\u9aa0\u0473\u9aae\ub72d\u9af7\u0426\u9af5\ub770\u9af3\u0422\u9af1", -494776261).indexOf(text.charAt(index + 1));
                if (codeIndex < 0) {
                    continue;
                }
                currentColor = this.colorCodes[codeIndex];
            }
            ++index;
        }
        GL11.glScaled(2.0, 2.0, 2.0);
        if (texture) {
            GL11.glEnable(3553);
        }
        if (lighting) {
            GL11.glEnable(2896);
        }
        if (!blend) {
            GL11.glDisable(3042);
        }
        GL11.glPopMatrix();
        return (int)x2;
    }
    
    public int drawStringWithShadow(final String text, final float x2, final float y2, final int color) {
        this.drawString(StringUtils.stripControlCodes(text), x2 + 0.5f, y2 + 0.5f, 0);
        return this.drawString(text, x2, y2, color);
    }
    
    public void drawCenteredString(final String text, final float x2, final float y2, final int color) {
        this.drawString(text, x2 - (int)this.getWidth(text) / 2, y2, color);
    }
    
    public float getWidth(final String s2) {
        float width = 0.0f;
        final String str = StringUtils.stripControlCodes(s2);
        char[] charArray;
        for (int length = (charArray = str.toCharArray()).length, i = 0; i < length; ++i) {
            final char c2 = charArray[i];
            width += this.unicodeFont.getWidth(Character.toString(c2)) + this.kerning;
        }
        return width / 2.0f;
    }
    
    public float getHeight(final String s2) {
        return this.unicodeFont.getHeight(s2) / 2.0f;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6b60\u76ae\u6b2a\u5db6\u6b23\u76bb\u6b21\u5dba\u6b2f\u76f5\u6b27\u5db7\u6b3a\u76bf", -1018558036))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uda4e\uc7ed\uda20\uecf7\uda20\uc7f2\uda6f\uecbe\uda63\uc7ed\uda20\uecea\uda6f\uc7a2\uda64\uecfb\uda62\uc7f7\uda67\ueceb\uda6a\uc7e7\uda73\uece4\uda3f", 368294113));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uea0b\uf7ee\uea67\udcee\uea67\uf7e5\uea61\udcfd\uea68\uf7f0\uea1c", 726960327))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ue70a\ufaa9\ue764\ud1b3\ue764\ufab6\ue72b\ud1fa\ue727\ufaa9\ue764\ud1ae\ue72b\ufae6\ue720\ud1bf\ue726\ufab3\ue723\ud1af\ue72e\ufaa3\ue737\ud1a0\ue77b", 406816165));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u1113\u0cc4\u114c\u27d5\u1150\u0cd6\u115a\u27d7\u114e\u0c86", 1645638623))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u2bd0\u3673\u2bbe\u1d69\u2bbe\u366c\u2bf1\u1d20\u2bfd\u3673\u2bbe\u1d74\u2bf1\u363c\u2bfa\u1d65\u2bfc\u3669\u2bf9\u1d75\u2bf4\u3679\u2bed\u1d7a\u2ba1", -339195521));
            System.exit(177442467);
        }
    }
}
