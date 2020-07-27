package amazingpack.util;

import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.Minecraft;
import org.apache.commons.io.FilenameUtils;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import java.awt.image.BufferedImage;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.IImageBuffer;

public class TextureDownloader
{
    public static void download(final String url, final ResourceLocationCallback callback) {
        class a implements IImageBuffer {
            private final ResourceLocationCallback val$callback;
            private final ResourceLocation val$resourcelocation;

            a(final ResourceLocationCallback val$callback, final ResourceLocation val$resourcelocation) {
                this.val$callback = val$callback;
                this.val$resourcelocation = val$resourcelocation;
            }

            @Override
            public BufferedImage parseUserSkin(final BufferedImage image) {
                return image;
            }

            @Override
            public void skinAvailable() {
                this.val$callback.onTextureLoaded(this.val$resourcelocation);
            }
        }

    }

    public interface ResourceLocationCallback
    {
        void onTextureLoaded(final ResourceLocation p0);
    }
}
