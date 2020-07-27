package amazingpack.gui;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.multiplayer.ServerData;

public class ServerFeatured extends ServerData
{
    public static final ResourceLocation starLocation = new ResourceLocation("textures/yoipack/star.png");


    public ServerFeatured(final String serverName, final String serverIp) {
        super(serverName, serverIp, false);
    }
}
