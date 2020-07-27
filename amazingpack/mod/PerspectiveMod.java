package amazingpack.mod;

import org.lwjgl.opengl.Display;
import net.minecraft.client.entity.EntityPlayerSP;
import org.lwjgl.input.Keyboard;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.Minecraft;

public class PerspectiveMod
{
    public static boolean Field_1;
    public static boolean Field_2;
    public static float Field_3;
    public static float Field_4;
    public static int A;
    private static Minecraft mc;
    
    static {
        Field_1 = false;
        Field_2 = false;
        Field_3 = 0.0f;
        Field_4 = 0.0f;
        A = 0;
        mc = Minecraft.getMinecraft();
    }
    
    public static void overrideMouse() {
        if (Keyboard.getEventKey() == mc.gameSettings.PERSPECTIVE_360.getKeyCode()) {
            if (Keyboard.getEventKeyState()) {
                Field_2 = !Field_2;
                Field_3 = mc.thePlayer.rotationYaw;
                Field_4 = mc.thePlayer.rotationPitch;
                if (Field_2) {
                    A = mc.gameSettings.thirdPersonView;
                    mc.gameSettings.thirdPersonView = 1;
                    final EntityPlayerSP thePlayer = mc.thePlayer;
                    thePlayer.posX += 1.0E-14;
                }
                else {
                    mc.gameSettings.thirdPersonView = A;
                }
            }
            else if (Field_1) {
                Field_2 = false;
                mc.gameSettings.thirdPersonView = A;
            }
        }
        if (mc.gameSettings.PERSPECTIVE_360.isPressed()) {
            Field_2 = false;
        }
    }
    
    public static float getOverrideYaw() {
        return Field_2 ? Field_3 : mc.thePlayer.rotationYaw;
    }
    
    public static float getOverridePitch() {
        return Field_2 ? Field_4 : mc.thePlayer.rotationPitch;
    }
    
    public static boolean Field_1() {
        if (mc.inGameHasFocus && Display.isActive()) {
            if (!Field_2) {
                return true;
            }
            mc.mouseHelper.mouseXYChange();
            final float f1 = mc.gameSettings.mouseSensitivity * Field_1 + 0.2f;
            final float f2 = f1 * f1 * f1 * Field_3;
            final float f3 = mc.mouseHelper.deltaX * f2;
            final float f4 = mc.mouseHelper.deltaY * f2;
            Field_3 += f3 * 0.15f;
            Field_4 += f4 * 0.15f;
            if (Field_4 > Field_4) {
                Field_4 = Field_4;
            }
            if (Field_4 < -Field_4) {
                Field_4 = -Field_4;
            }
        }
        return false;
    }
}
