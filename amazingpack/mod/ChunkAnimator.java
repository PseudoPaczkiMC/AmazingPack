package amazingpack.mod;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.renderer.GlStateManager;
import java.util.WeakHashMap;
import net.minecraft.client.renderer.chunk.RenderChunk;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class ChunkAnimator
{
    private final Minecraft mc;
    private final Map<RenderChunk, Long> timeStamps;
    
    public ChunkAnimator(final Minecraft mc) {
        this.timeStamps = new WeakHashMap<RenderChunk, Long>();
        this.mc = mc;
    }
    
    public void preRender(final RenderChunk renderChunk) {
        if (this.timeStamps.containsKey(renderChunk)) {
            long time = this.timeStamps.get(renderChunk);
            if (time == -1L) {
                time = System.currentTimeMillis();
                this.timeStamps.put(renderChunk, time);
            }
            final long timeDif = System.currentTimeMillis() - time;
            if (timeDif < 1000L) {
                final double chunkY = renderChunk.getPosition().getY();
                final double modY = chunkY / 1000.0 * timeDif;
                GlStateManager.translate(0.0, -chunkY + modY, 0.0);
            }
            else {
                this.timeStamps.remove(renderChunk);
            }
        }
    }
    
    public void setPosition(final RenderChunk renderChunk) {
        if (Minecraft.getMinecraft().thePlayer != null) {
            this.timeStamps.put(renderChunk, -1L);
        }
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u127a\u0ff1\u1205\u24e0\u1219\u0fe3\u1213\u24e2\u1207\u0f93", -397643543))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u4bb0\u566f\u4bde\u7d75\u4bde\u5670\u4b91\u7d3c\u4b9d\u566f\u4bde\u7d68\u4b91\u5620\u4b9a\u7d79\u4b9c\u5675\u4b99\u7d69\u4b94\u5665\u4b8d\u7d66\u4bc1", 385952064));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6541\u78ca\u6528\u53cb\u652e\u78c7\u652b", -1280833582))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ub4a3\ua97c\ub4cd\u8266\ub4cd\ua963\ub482\u822f\ub48e\ua97c\ub4cd\u827b\ub482\ua933\ub489\u826a\ub48f\ua966\ub48a\u827a\ub487\ua976\ub49e\u8275\ub4d2", -1723804077));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u8d92\u9020\u8dd8\ubb38\u8dd1\u9035\u8dd3\ubb34\u8ddd\u907b\u8dd5\ubb39\u8dc8\u9031", 592047873))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0fa2\u127d\u0fcc\u3967\u0fcc\u1262\u0f83\u392e\u0f8f\u127d\u0fcc\u397a\u0f83\u1232\u0f88\u396b\u0f8e\u1267\u0f8b\u397b\u0f86\u1277\u0f9f\u3974\u0fd3", 1348562258));
        }
    }
}
