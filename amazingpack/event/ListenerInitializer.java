package amazingpack.event;

import amazingpack.mod.Dab;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import java.util.Arrays;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.Tessellator;
import java.util.List;
import java.util.ArrayList;

public class ListenerInitializer implements Listener
{
    public boolean renderOverlay;
    private ArrayList<Double> circlePoints;
    private static int i;
    private static List<List<float[]>> j;
    private static int k;
    boolean firstRun;
    public Dab dab;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static int o;
    public static final double p = 6.283185307179586;
    private static Tessellator q;
    private static WorldRenderer r;
    
    static {
        ListenerInitializer.i = 0;
        ListenerInitializer.j = new ArrayList<List<float[]>>();
        ListenerInitializer.l = false;
        ListenerInitializer.n = false;
        ListenerInitializer.q = Tessellator.getInstance();
        ListenerInitializer.r = ListenerInitializer.q.getWorldRenderer();
    }
    
    public ListenerInitializer() {
        this.renderOverlay = false;
        this.firstRun = true;
    }
    
    @ListenerAnnotation
    public void render(final EventImpl e) {
        if (this.firstRun) {
            j();
        }
        this.firstRun = false;
        final ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft());
        if (Minecraft.getMinecraft().currentScreen == null) {
            if (Minecraft.getMinecraft().thePlayer.moveForward != 0.0f || Minecraft.getMinecraft().thePlayer.moveStrafing != 0.0f) {
                p(0);
                ListenerInitializer.n = false;
            }
            Minecraft.getMinecraft().gameSettings.CLIENT_EMOTE_WHEEL.isPressed();
            if (Minecraft.getMinecraft().gameSettings.CLIENT_EMOTE_WHEEL.isKeyDown()) {
                final int emotki = Minecraft.getMinecraft().gameSettings.bpOptions.emotki.getValue();
                switch (emotki) {
                    case 0: {
                        ListenerInitializer.o = 0;
                        break;
                    }
                    case 1: {
                        ListenerInitializer.o = 3;
                        break;
                    }
                    case 2: {
                        ListenerInitializer.o = 1;
                        break;
                    }
                    case 3: {
                        ListenerInitializer.o = 2;
                        break;
                    }
                }
                ListenerInitializer.m = true;
            }
            else {
                if (!Mouse.isGrabbed()) {
                    Minecraft.getMinecraft().mouseHelper.grabMouseCursor();
                }
                if (ListenerInitializer.m && ListenerInitializer.j.size() > ListenerInitializer.o) {
                    p(ListenerInitializer.o + 1);
                    ListenerInitializer.l = true;
                    ListenerInitializer.n = true;
                }
                ListenerInitializer.m = false;
            }
        }
    }
    
    private static void i() {
        final ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft());
        final double angle = Math.atan2(res.getScaledHeight_double() - Mouse.getEventY() * res.getScaledHeight_double() / Minecraft.getMinecraft().displayHeight - res.getScaledHeight_double() / 2.0, Mouse.getEventX() * res.getScaledWidth_double() / Minecraft.getMinecraft().displayWidth - res.getScaledWidth_double() / 2.0) * 180.0 / 3.141592653589793;
        final int i = 0;
        if (angle > -180.0 && angle < 0.0) {
            if (angle > -180.0 && angle < -120.0) {
                ListenerInitializer.o = 0;
            }
            else if (angle > -120.0 && angle < -60.0) {
                ListenerInitializer.o = 1;
            }
            else if (angle > -60.0 && angle < 0.0) {
                ListenerInitializer.o = 2;
            }
        }
        else if (angle > 0.0 && angle < 60.0) {
            ListenerInitializer.o = 3;
        }
        else if (angle > 60.0 && angle < 120.0) {
            ListenerInitializer.o = 4;
        }
        else if (angle > 120.0 && angle < 180.0) {
            ListenerInitializer.o = 5;
        }
        int x2 = 150;
        int y2 = 30;
        final int width = 74;
        final int height = 10;
        if (y2 > res.getScaledHeight() - 10) {
            y2 = res.getScaledHeight() - 10;
        }
        else if (x2 > res.getScaledWidth() - 74) {
            x2 = res.getScaledWidth() - 74;
        }
        l(res.getScaledWidth_double() / 2.0, res.getScaledHeight_double() / 2.0, 100, 1000, 60, 60 * -ListenerInitializer.o + 30);
        GL11.glPushMatrix();
        k(res.getScaledWidth_double() / 2.0, res.getScaledHeight_double() / 2.0, 100, 1000);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Gui.drawHorizontalLine(res.getScaledWidth_double() / 2.0 - 95.0, res.getScaledWidth_double() / 2.0 + 95.0, res.getScaledHeight_double() / 2.0, new Color(96, 96, 96).getRGB());
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(WorldProviderHell$BlockRedstoneComparator.G("\udae3\uff70\udaef\uda05\udae2\uff67\udaf2\uda02\udab8\uff6c\udaf8\uda18\udae7\uff74\udaf4\uda1a\udab8\uff76\udafb\uda18\udaf2\uff7b\udae3\uda5e\udaf1\uff74\udaf4\uda14\udae7\uff74\udafb\uda1c\udab9\uff65\udaf9\uda16", 744721931)));
        Gui.drawModalRectWithCustomSizedTexture(x2, y2, 1.0f, 1.0f, 32, 32, 32.0f, 32.0f);
        GL11.glTranslatef((float)(0.0 + res.getScaledWidth_double() / 2.0), (float)(0.0 + res.getScaledHeight_double() / 2.0), 0.0f);
        GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-res.getScaledWidth_double() / 2.0), (float)(-res.getScaledHeight_double() / 2.0), 0.0f);
        Gui.drawHorizontalLine(res.getScaledWidth_double() / 2.0 - 95.0, res.getScaledWidth_double() / 2.0 + 95.0, res.getScaledHeight_double() / 2.0, new Color(96, 96, 96).getRGB());
        GL11.glTranslatef((float)(0.0 + res.getScaledWidth_double() / 2.0), (float)(0.0 + res.getScaledHeight_double() / 2.0), 0.0f);
        GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-res.getScaledWidth_double() / 2.0), (float)(-res.getScaledHeight_double() / 2.0), 0.0f);
        Gui.drawHorizontalLine(res.getScaledWidth_double() / 2.0 - 95.0, res.getScaledWidth_double() / 2.0 + 95.0, res.getScaledHeight_double() / 2.0, new Color(96, 96, 96).getRGB());
        GL11.glPopMatrix();
    }
    
    private static void j() {
        m(false, new List[] { Arrays.asList(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(800.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.0f, -0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(1550.0f, 0.6f, 0.6f, 0.0f, 0.0f, 0.0f, -2.0f, -5.0f, 0.0f, -1.0f, 0.0f, 0.05f, 0.05f, 0.0f, 0.0f) });
        m(false, new List[] { Arrays.asList(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(400.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(800.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(1200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f) });
        m(false, new List[] { Arrays.asList(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(400.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(800.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(1200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f) });
        m(false, new List[] { Arrays.asList(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(400.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f), Arrays.asList(500.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), Arrays.asList(900.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.7f, 0.0f, -0.7f, 0.0f, -0.7f, 0.0f, 0.0f) });
    }
    
    public static void k(final double x, final double y, final int radius, final int sides) {
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.5f);
        ListenerInitializer.r.begin(6, DefaultVertexFormats.POSITION);
        ListenerInitializer.r.pos(x, y, 0.0).endVertex();
        for (int i = 0; i <= sides; ++i) {
            final double angle = 6.283185307179586 * i / sides + Math.toRadians(180.0);
            ListenerInitializer.r.pos(x + Math.sin(angle) * radius, y + Math.cos(angle) * radius, 0.0).endVertex();
        }
        ListenerInitializer.q.draw();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    public static void l(final double x, final double y, final int radius, final int sides, final int realAngle, final int startAngle) {
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.5f);
        ListenerInitializer.r.begin(6, DefaultVertexFormats.POSITION);
        ListenerInitializer.r.pos(x, y, 0.0).endVertex();
        for (int i = 0; i <= sides / (360 / realAngle) + 0.75; ++i) {
            final double angle = 6.283185307179586 * i / sides + Math.toRadians(180.0) + Math.toRadians(startAngle);
            ListenerInitializer.r.pos(x + Math.sin(angle) * radius, y + Math.cos(angle) * radius, 0.0).endVertex();
        }
        ListenerInitializer.q.draw();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    private static void m(final boolean repetitiveBoolean, final List<Float>[] emotePos) {
        final ArrayList<float[]> array = new ArrayList<float[]>();
        final float[] repetitive = { (float)(repetitiveBoolean ? 1 : 0) };
        array.add(repetitive);
        for (int i = 0; i < emotePos.length; ++i) {
            final float[] pos = { emotePos[i].get(0), emotePos[i].get(1), emotePos[i].get(2), emotePos[i].get(3), emotePos[i].get(4), emotePos[i].get(5), emotePos[i].get(6), emotePos[i].get(7), emotePos[i].get(8), emotePos[i].get(9), emotePos[i].get(10), emotePos[i].get(11), emotePos[i].get(12), emotePos[i].get(13), emotePos[i].get(14) };
            array.add(pos);
        }
        ListenerInitializer.j.add(array);
    }
    
    public static void n(final ModelBiped model, final Entity entityIn) {
        Minecraft.getMinecraft();
        int time = (int)(Minecraft.getSystemTime() - ListenerInitializer.k);
        if (ListenerInitializer.j.get(ListenerInitializer.i - 1).get(0)[0] == 1.0f && time > ListenerInitializer.j.get(ListenerInitializer.i - 1).get(ListenerInitializer.j.get(ListenerInitializer.i - 1).size() - 1)[0]) {
            Minecraft.getMinecraft();
            ListenerInitializer.k = (int)Minecraft.getSystemTime();
            Minecraft.getMinecraft();
            time = (int)(Minecraft.getSystemTime() - ListenerInitializer.k);
        }
        int index = 1;
        float ratio = 0.0f;
        for (int i = 1; i < ListenerInitializer.j.get(ListenerInitializer.i - 1).size(); ++i) {
            final float timeStamp = ListenerInitializer.j.get(ListenerInitializer.i - 1).get(i)[0];
            if (timeStamp < time) {
                if (i + 1 < ListenerInitializer.j.get(ListenerInitializer.i - 1).size()) {
                    ratio = (time - ListenerInitializer.j.get(ListenerInitializer.i - 1).get(i)[0]) / (ListenerInitializer.j.get(ListenerInitializer.i - 1).get(i + 1)[0] - ListenerInitializer.j.get(ListenerInitializer.i - 1).get(i)[0]);
                }
                index = i;
            }
        }
        final float[] anglesStart = ListenerInitializer.j.get(ListenerInitializer.i - 1).get(index);
        float[] anglesFinish;
        if (index + 1 >= ListenerInitializer.j.get(ListenerInitializer.i - 1).size()) {
            anglesFinish = anglesStart;
        }
        else {
            anglesFinish = ListenerInitializer.j.get(ListenerInitializer.i - 1).get(index + 1);
        }
        model.bipedHead.rotateAngleX = ((C.I(ratio, anglesStart[1], anglesFinish[1]) == 0.0f) ? model.bipedHead.rotateAngleX : C.I(ratio, anglesStart[1], anglesFinish[1]));
        model.bipedHead.rotateAngleY = ((C.I(ratio, anglesStart[2], anglesFinish[2]) == 0.0f) ? model.bipedHead.rotateAngleY : C.I(ratio, anglesStart[2], anglesFinish[2]));
        model.bipedBody.rotateAngleX = ((C.I(ratio, anglesStart[3], anglesFinish[3]) == 0.0f) ? model.bipedBody.rotateAngleX : C.I(ratio, anglesStart[3], anglesFinish[3]));
        model.bipedBody.rotateAngleY = ((C.I(ratio, anglesStart[4], anglesFinish[4]) == 0.0f) ? model.bipedBody.rotateAngleY : C.I(ratio, anglesStart[4], anglesFinish[4]));
        model.bipedBody.rotateAngleZ = ((C.I(ratio, anglesStart[5], anglesFinish[5]) == 0.0f) ? model.bipedBody.rotateAngleZ : C.I(ratio, anglesStart[5], anglesFinish[5]));
        model.bipedRightArm.rotateAngleX = ((C.I(ratio, anglesStart[6], anglesFinish[6]) == 0.0f) ? model.bipedRightArm.rotateAngleX : C.I(ratio, anglesStart[6], anglesFinish[6]));
        model.bipedRightArm.rotateAngleY = ((C.I(ratio, anglesStart[7], anglesFinish[7]) == 0.0f) ? model.bipedRightArm.rotateAngleY : C.I(ratio, anglesStart[7], anglesFinish[7]));
        model.bipedLeftArm.rotateAngleX = ((C.I(ratio, anglesStart[8], anglesFinish[8]) == 0.0f) ? model.bipedLeftArm.rotateAngleX : C.I(ratio, anglesStart[8], anglesFinish[8]));
        model.bipedLeftArm.rotateAngleY = ((C.I(ratio, anglesStart[9], anglesFinish[9]) == 0.0f) ? model.bipedLeftArm.rotateAngleY : C.I(ratio, anglesStart[9], anglesFinish[9]));
        model.bipedRightLeg.rotateAngleX = ((C.I(ratio, anglesStart[10], anglesFinish[10]) == 0.0f) ? model.bipedRightLeg.rotateAngleX : C.I(ratio, anglesStart[10], anglesFinish[10]));
        model.bipedRightLeg.rotateAngleY = ((C.I(ratio, anglesStart[11], anglesFinish[11]) == 0.0f) ? model.bipedRightLeg.rotateAngleY : C.I(ratio, anglesStart[11], anglesFinish[11]));
        model.bipedLeftLeg.rotateAngleX = ((C.I(ratio, anglesStart[12], anglesFinish[12]) == 0.0f) ? model.bipedLeftLeg.rotateAngleX : C.I(ratio, anglesStart[12], anglesFinish[12]));
        model.bipedLeftLeg.rotateAngleY = ((C.I(ratio, anglesStart[13], anglesFinish[13]) == 0.0f) ? model.bipedLeftLeg.rotateAngleY : C.I(ratio, anglesStart[13], anglesFinish[13]));
        model.bipedLeftArm.rotateAngleZ = ((C.I(ratio, anglesStart[14], anglesFinish[14]) == 0.0f) ? model.bipedLeftArm.rotateAngleZ : C.I(ratio, anglesStart[14], anglesFinish[14]));
        ListenerInitializer.l = false;
    }
    
    public static int o() {
        return ListenerInitializer.i;
    }
    
    public static void p(final int emote) {
        ListenerInitializer.i = emote;
        Minecraft.getMinecraft();
        ListenerInitializer.k = (int)Minecraft.getSystemTime();
    }
}
