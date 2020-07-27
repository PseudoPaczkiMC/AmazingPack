package amazingpack.mod;

import java.lang.management.ManagementFactory;

import amazingpack.util.ColorUtil;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;

public class CompassRenderer
{
    private final Minecraft mc;
    public int height;
    public int x;
    public int y;
    private int offsetAll;
    private int centerX;
    public int width;
    public int spacing;
    
    public CompassRenderer(Minecraft mc) {
        this.height = 20;
        this.centerX = 20;
        this.width = 150;
        this.spacing = 460;
        this.mc = mc;
    }
    
    public void drawCompass(final int screenWidth) {
        final int direction = this.normalize((int)this.mc.thePlayer.rotationYaw);
        this.offsetAll = this.spacing * direction / 360;
        this.centerX = screenWidth / 2 + this.x;
        if (Minecraft.getMinecraft().gameSettings.bpOptions.compassBackground.getValue()) {
            Gui.drawRect(this.centerX - this.width / 2, this.y, this.centerX + this.width / 2, this.y + this.height, -1442840576);
        }
        this.renderMarker();
        final int details = Minecraft.getMinecraft().gameSettings.bpOptions.compassDetails.getValue();
        if (details >= 0) {
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u6668", -1786896119), 0, 1.5);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u8489", -1042365460), 90, 1.5);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u6e80", -240047620), 180, 1.5);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\ufd5d", 700168746), 270, 1.5);
        }
        if (details >= 1) {
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u23ad\u072f", 156722380), 45, 1.0);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u80ad\ua432", 1049479121), 135, 1.0);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\uefba\ucb37", -314529594), 225, 1.0);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\ud93a\ufdaa", 1052941915), 315, 1.0);
        }
        if (details >= 2) {
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u3d9f\u191d", 1464826524), 15, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u6123\u45a6", -1676532190), 30, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u4ec9\u6a49", -670692915), 60, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u0f78\u2bfc", -1438627715), 75, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u9032\ub4b5\u9036", -889268431), 105, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\uac03\u8886\uac02", 1738337024), 120, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u5664\u72e6\u5665", -173534873), 150, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u4536\u61b7\u4532", 1280901685), 165, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u05e4\u216a\u05e0", 782254823), 195, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u8e79\uaafc\u8e7b", 460769657), 210, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u635c\u47dc\u635e", -532929444), 240, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u3211\u1690\u3216", -379751151), 255, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u1da2\u392e\u1da5", -130655582), 285, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u156b\u31ee\u1568", 271929962), 300, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\u735e\u57d8\u735d", -242207649), 330, 0.75);
            this.drawDirection(WorldProviderHell$BlockRedstoneComparator.G("\ub002\u9483\ub004", 1332475651), 345, 0.75);
        }
    }
    
    private void renderMarker() {
        final Tessellator tessellator = Tessellator.getInstance();
        final WorldRenderer worldrenderer = tessellator.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        worldrenderer.begin(6, DefaultVertexFormats.POSITION);
        worldrenderer.pos(this.centerX, this.y + 3, 0.0).endVertex();
        worldrenderer.pos(this.centerX + 3, this.y, 0.0).endVertex();
        worldrenderer.pos(this.centerX - 3, this.y, 0.0).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
    
    private void drawDirection(final String dir, final int degrees, final double scale) {
        int offset = this.spacing * degrees / 360 - this.offsetAll;
        if (offset > this.spacing / 2) {
            offset -= this.spacing;
        }
        if (offset < -this.spacing / 2) {
            offset += this.spacing;
        }
        final double opacity = 1.0 - Math.abs(offset) / (this.width / 2.0);
        if (opacity > 0.1) {
            int defcolor;
            final int colors = defcolor = Minecraft.getMinecraft().gameSettings.bpOptions.compassColors.getValue();
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
                    defcolor = ColorUtil.rainbowColor(2, 15);
                    break;
                }
            }
            final int color = defcolor | (int)(opacity * 255.0) << 24;
            final int posX = this.centerX + offset - (int)(Minecraft.fontRendererObj.getStringWidth(dir) * scale / 2.0);
            final int posY = this.y + this.height / 2 - (int)(Minecraft.fontRendererObj.FONT_HEIGHT * scale / 2.0);
            GL11.glEnable(3042);
            GL11.glPushMatrix();
            GL11.glTranslated(-posX * (scale - 1.0), -posY * (scale - 1.0), 0.0);
            GL11.glScaled(scale, scale, 1.0);
            Minecraft.fontRendererObj.drawStringWithShadow(dir, (float)posX, (float)posY, color);
            GL11.glPopMatrix();
            GL11.glDisable(3042);
        }
    }
    
    private int normalize(int direction) {
        if (direction > 360) {
            direction %= 360;
        }
        while (direction < 0) {
            direction += 360;
        }
        return direction;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u35cf\u2801\u3585\u0361\u358c\u2814\u358e\u036d\u3580\u285a\u3588\u0360\u3595\u2810", -1388685489))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u3267\u2fc4\u3209\u04a6\u3209\u2fdb\u3246\u04ef\u324a\u2fc4\u3209\u04bb\u3246\u2f8b\u324d\u04aa\u324b\u2fde\u324e\u04ba\u3243\u2fce\u325a\u04b5\u3216", -543600508));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf9d8\ue41d\uf994\ucf65\uf994\ue416\uf992\ucf76\uf99b\ue403\uf9cf", -1194353832))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\uc345\udee6\uc32b\uf584\uc32b\udef9\uc364\uf5cd\uc368\udee6\uc32b\uf599\uc364\udea9\uc36f\uf588\uc369\udefc\uc36c\uf598\uc361\udeec\uc378\uf597\uc334", 244294054));
            System.exit(-219619307);
        }
    }
}
