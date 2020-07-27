package amazingpack.task;

import java.lang.management.ManagementFactory;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.util.Timer;
import java.util.TimerTask;

public class AntiCheatEngineTask extends TimerTask
{
    public void start() {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(this, 1000L, 1000L);
    }
    
    @Override
    public void run() {
        try {
            final Process process = Runtime.getRuntime().exec("tasklist");
            final BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("cengine") || line.contains("cheatengine") || line.contains("nodejs") || line.contains("Proxifier") || line.contains("injector")) {
                    System.exit(0);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
