package amazingpack.main;

import amazingpack.mod.ChunkAnimator;
import amazingpack.gui.ServerFeatured;
import amazingpack.gui.ServerData;
import amazingpack.task.AntiCheatEngineTask;
import org.lwjgl.opengl.Display;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.NetworkInterface;
import java.net.InetAddress;
import java.net.URLConnection;
import net.minecraft.client.multiplayer.ServerList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Map;

public class AmazingGownoPack
{
    public static ChunkAnimator chunkAnimator;
    public static Map<String, String> wingsPlayers;
    public static Map<String, String> hatPlayers;
    public static String version;
    public static Map<String, String> tailsPlayers;
    public static Map<String, String> itemPlayers;
    public static List<String> ringoPlayers;
    public static List<String> shitServers;
    public static boolean Field_1;
    public static boolean reloadWings;
    public static boolean reloadedWings;
    public static boolean reloadItems;
    public static boolean reloadItems1;

    static {
        AmazingGownoPack.chunkAnimator = new ChunkAnimator(Minecraft.getMinecraft());
        AmazingGownoPack.wingsPlayers = new HashMap<String, String>();
        AmazingGownoPack.hatPlayers = new HashMap<String, String>();
        AmazingGownoPack.tailsPlayers = new HashMap<String, String>();
        AmazingGownoPack.itemPlayers = new HashMap<String, String>();
        AmazingGownoPack.ringoPlayers = new ArrayList<String>();
        AmazingGownoPack.shitServers = new ArrayList<String>();
    }
    
    public void onTick() {
        Minecraft.getMinecraft().gameSettings.CLIENT_EMOTE_WHEEL.isPressed();
    }
    
    public static void X() throws IOException {
        try {
            Scanner scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\uc9da\ued48\uc9c6\uc9d3\uc988\ued13\uc99d\uc996\uc983\ued12\uc985\uc996\uc99c\ued0e\uc987\uc997\uc99c\ued0d\uc981\uc990\uc99d\ued5d\uc9c2\uc9ca\uc99d\ued4b\uc9db\uc9cd\uc9d5\ued4f\uc99c\uc9d6\uc9c1\ued59\uc9c0\uc9d0", -95969851)).openStream());
            while (scanner.hasNext()) {
                final String[] split = scanner.nextLine().split(WorldProviderHell$BlockRedstoneComparator.G("\u6a39", -1670103435));
                final String user = split[0];
                final String id = split[1];
                final String time = split[2];
                final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\u5c42\u78cc\u5c0b\u5c7a\u5c6b\u7885\u5c5f\u5c4e\u5c5f\u78d1", 1864501329)).parse(time, new ParsePosition(0)).getTime();
                if (expiration > System.currentTimeMillis()) {
                    AmazingGownoPack.wingsPlayers.put(user, id);
                }
            }
            scanner.close();
            scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\uf6dd\ud24f\uf6c1\uf6d4\uf68f\ud214\uf69a\uf691\uf684\ud215\uf682\uf691\uf69b\ud209\uf680\uf690\uf69b\ud20a\uf686\uf697\uf69a\ud25a\uf6c5\uf6cd\uf69a\ud24f\uf6d4\uf6cd\uf6d9\ud248\uf69b\uf6d1\uf6c6\ud25e\uf6c7\uf6d7", 942514882)).openStream());
            while (scanner.hasNext()) {
                final String[] split = scanner.nextLine().split(WorldProviderHell$BlockRedstoneComparator.G("\ub2be", -1979390221));
                final String user = split[0];
                final String id = split[1];
                final String time = split[2];
                final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\u374b\u13c5\u3702\u3773\u3762\u138c\u3756\u3747\u3756\u13d8", 1631609688)).parse(time, new ParsePosition(0)).getTime();
                if (expiration > System.currentTimeMillis()) {
                    AmazingGownoPack.tailsPlayers.put(user, id);
                }
            }
            scanner.close();
            scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u804e\ua4dc\u8052\u8047\u801c\ua487\u8009\u8002\u8017\ua486\u8011\u8002\u8008\ua49a\u8013\u8003\u8008\ua499\u8015\u8004\u8009\ua4c9\u8056\u805e\u8009\ua4c0\u8047\u8043\u8055\ua486\u8053\u8044\u8043\ua4da\u8055", 1914623057)).openStream());
            while (scanner.hasNext()) {
                final String[] split = scanner.nextLine().split(WorldProviderHell$BlockRedstoneComparator.G("\u99fc", -1230910031));
                final String user = split[0];
                final String id = split[1];
                final String time = split[2];
                final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\u944e\ub0c0\u9407\u9476\u9467\ub089\u9453\u9442\u9453\ub0dd", -816529315)).parse(time, new ParsePosition(0)).getTime();
                if (expiration > System.currentTimeMillis()) {
                    AmazingGownoPack.hatPlayers.put(user, id);
                }
            }
            scanner.close();
            scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u7ee3\u5a71\u7eff\u7eea\u7eb1\u5a2a\u7ea4\u7eaf\u7eba\u5a2b\u7ebc\u7eaf\u7ea5\u5a37\u7ebe\u7eae\u7ea5\u5a34\u7eb8\u7ea9\u7ea4\u5a64\u7efb\u7ef3\u7ea4\u5a6c\u7eff\u7eff\u7ee6\u5a76\u7ea5\u7eef\u7ef8\u5a60\u7ef9\u7ee9", 262941436)).openStream());
            while (scanner.hasNext()) {
                final String[] split = scanner.nextLine().split(WorldProviderHell$BlockRedstoneComparator.G("\u0578", -720088779));
                final String user = split[0];
                final String id = split[1];
                final String time = split[2];
                final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\ufe84\uda0a\ufecd\ufebc\ufead\uda43\ufe99\ufe88\ufe99\uda17", 71543447)).parse(time, new ParsePosition(0)).getTime();
                if (expiration > System.currentTimeMillis()) {
                    AmazingGownoPack.itemPlayers.put(user, id);
                }
            }
            scanner.close();
        }
        catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    public static void Y() throws IOException {
        final Scanner scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u125b\u36c5\u1247\u125d\u1209\u369e\u121c\u1218\u1202\u369f\u1204\u1218\u121d\u3683\u1206\u1219\u121d\u3680\u1200\u121e\u121c\u36d0\u1243\u1244\u121c\u36c3\u125a\u1243\u1254\u36de\u121d\u1258\u1240\u36d4\u1241\u125e", -11319733)).openStream());
        while (scanner.hasNextLine()) {
            AmazingGownoPack.ringoPlayers.add(scanner.nextLine());
        }
    }
    
    public static void Z() throws IOException {
        final Scanner scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u8cac\ua832\u8cb0\u8cab\u8cfe\ua869\u8ceb\u8cee\u8cf5\ua868\u8cf3\u8cee\u8cea\ua874\u8cf1\u8cef\u8cea\ua877\u8cf7\u8ce8\u8ceb\ua827\u8cb4\u8cb2\u8ceb\ua825\u8ca8\u8cb4\u8cb1\ua822\u8cb7\u8cf5\u8cb1\ua835\u8ca1\u8ca9\u8cb7", -684992323)).openStream());
        while (scanner.hasNextLine()) {
            AmazingGownoPack.shitServers.add(scanner.nextLine());
        }
    }
    
    public static void a() {
        try {
            final URL website = new URL(WorldProviderHell$BlockRedstoneComparator.G("\u94a6\ub138\u94ba\u9458\u94f4\ub163\u94e1\u941d\u94ff\ub162\u94f9\u941d\u94e0\ub17e\u94fb\u941c\u94e0\ub17d\u94fd\u941b\u94e1\ub12d\u94be\u9441\u94e1\ub13f\u94ab\u945a\u94b8\ub129\u94bc\u945b\u94e0\ub138\u94b6\u945c", 1824702542));
            final URLConnection connection = website.openConnection();
            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                final String[] splited = inputLine.split(WorldProviderHell$BlockRedstoneComparator.G("\uc2b7", 1396741645));
                final String ip = splited[0];
                ServerList.servers.add(new ServerFeatured(WorldProviderHell$BlockRedstoneComparator.G("\u1100\u34a6\u1123\u11ce\u112e\u34bd\u112c\u11cd\u1139\u34ef\u111e\u11ce\u113f\u34b9\u1128\u11d9", 1967015373), ip));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void b() {
        try {
            final URL website = new URL(WorldProviderHell$BlockRedstoneComparator.G("\uf80d\udd93\uf811\uf8f2\uf85f\uddc8\uf84a\uf8b7\uf854\uddc9\uf852\uf8b7\uf84b\uddd5\uf850\uf8b6\uf84b\uddd6\uf856\uf8b1\uf84a\udd86\uf815\uf8eb\uf84a\udd97\uf816\uf8f6\uf804\udd95\uf816\uf8ac\uf811\udd9f\uf811", 1236708580));
            final URLConnection connection = website.openConnection();
            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                final String[] splited = inputLine.split(WorldProviderHell$BlockRedstoneComparator.G("\u597f", 389746116));
                final String ip = splited[0];
                ServerList.servers.add(new ServerData(WorldProviderHell$BlockRedstoneComparator.G("\uac01\u89a7\uac22\uacce\uac2f\u89bc\uac2d\uaccd\uac38\u89ee\uac1f\uacce\uac3e\u89b8\uac29\uacd9", -1063651123), ip));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void c() throws IOException {
        final Scanner scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u08c0\u2d5a\u08dc\u083c\u0892\u2d01\u0887\u0879\u0899\u2d00\u089f\u0879\u0886\u2d1c\u089d\u0878\u0886\u2d1f\u089b\u087f\u0887\u2d4f\u08d8\u0825\u0887\u2d58\u08cd\u083e\u08db\u2d47\u08c7\u0822\u0886\u2d5e\u08c9\u082f\u08c3", -1140106198)).openStream());
        if (AmazingGownoPack.version.equals(scanner.findInLine(AmazingGownoPack.version))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u3404\u11b3\u3437\u34ca\u343f\u11b3\u3474\u34da\u3431\u11a1\u3420\u3490\u3435\u11b9\u3420\u34c5\u3435\u11be\u343a\u34d1", 598827222));
        }
        else {
            Minecraft.getMinecraft().shutdown();
        }
    }
    
    public static void d(final Minecraft mc) {
        try {
            final String name = mc.getSession().getUsername();
            String uuid;
            try {
                uuid = mc.getSession().getProfile().getId().toString();
            }
            catch (NullPointerException e3) {
                uuid = null;
            }
            final Scanner scanner = new Scanner(new URL(WorldProviderHell$BlockRedstoneComparator.G("\u42fb\u6761\u42e7\u4206\u42a9\u673a\u42bc\u4243\u42a2\u673b\u42a4\u4243\u42bd\u6727\u42a6\u4242\u42bd\u6724\u42a0\u4245\u42bc\u6774\u42e3\u421f\u42bc\u6777\u42ff\u4217\u42f0\u677e\u42ff\u421f\u42e0\u6761\u42bd\u4203\u42e0\u6770\u42e1\u4205", 952702480)).openStream());
            while (scanner.hasNextLine()) {
                final String[] split = scanner.nextLine().split(WorldProviderHell$BlockRedstoneComparator.G("\u5d95", 1734805804));
                final String s = split[0];
                final String reason = split[1];
                final String date = split[2];
                if (name.equalsIgnoreCase(s)) {
                    final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\uf3e3\ud665\uf3aa\uf32f\uf3ca\ud62c\uf3fe\uf31b\uf3fe\ud678", -1486248188)).parse(date, new ParsePosition(0)).getTime();
                    if (expiration > System.currentTimeMillis()) {
                        mc.displayGuiScreen(new 5(reason, date));
                    }
                }
                if (uuid != null && uuid.equals(s)) {
                    final long expiration = new SimpleDateFormat(WorldProviderHell$BlockRedstoneComparator.G("\u2be8\u0e6e\u2ba1\u2b24\u2bc1\u0e27\u2bf5\u2b10\u2bf5\u0e73", -1674608881)).parse(date, new ParsePosition(0)).getTime();
                    if (expiration > System.currentTimeMillis()) {
                        mc.displayGuiScreen(new 5(reason, date));
                    }
                }
                try {
                    final InetAddress ip = InetAddress.getLocalHost();
                    final NetworkInterface network = NetworkInterface.getByInetAddress(ip);
                    final byte[] mac = network.getHardwareAddress();
                    if (mac == null || !mac.equals(network)) {
                        continue;
                    }
                    mc.displayGuiScreen(new 5(reason, date));
                }
                catch (UnknownHostException | SocketException ex2) {
                    final IOException ex;
                    final IOException e = ex;
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }
    
    public static void e() {
        if (Minecraft.getMinecraft().gameSettings.bpOptions.sprint.getValue() && Minecraft.getMinecraft().gameSettings.keyBindForward.isKeyDown()) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
    }
    
    public static void f() {
        Display.setTitle(WorldProviderHell$BlockRedstoneComparator.G("\u7450\u51fe\u7470\u7488\u7478\u51fd\u7476\u74a2\u7470\u51f0\u747a\u74d2\u746d\u51b3\u7453\u7497\u7465\u51f2\u7431\u74c2\u743f\u51a2", -1155915628));
        try {
            X();
            d(Minecraft.getMinecraft());
            Y();
            Z();
            c();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        new AntiCheatEngineTask().start();
    }
}
