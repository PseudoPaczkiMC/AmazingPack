package amazingpack.util;

import net.minecraft.util.ChatComponentText;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;

public class ChatUtil
{
    public static String fixColor(final String text) {
        return text.replaceAll("&", "§");
    }
    
    public static void printChatMessage(final String message) {
        Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(fixColor(message)));
    }
}
