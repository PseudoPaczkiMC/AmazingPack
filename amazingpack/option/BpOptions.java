package amazingpack.option;

import net.minecraft.client.resources.I18n;
import java.util.Map;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import net.minecraft.client.settings.GameSettings;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.util.HashMap;

public class BpOptions
{
    public boolean isDefaultSettings;
    public final YesNo2BpOption showWings;
    public final YesNo2BpOption showItems;
    public final YesNo2BpOption showHats;
    public final YesNo2BpOption showTails;
    public final YesNo2BpOption showChatBackground;
    public final YesNo2BpOption showChunkAnimations;
    public final YesNo2BpOption showCpsCounter;
    public final YesNo2BpOption showActivePotions;
    public final YesNo2BpOption leftItem;
    public final YesNo2BpOption sprint;
    public final YesNo2BpOption disableDigParticles;
    public final YesNo2BpOption disableEnchantTableParticles;
    public final YesNo2BpOption disableItemEffects;
    public final YesNo2BpOption disableBackgroundNameTag;
    public final YesNo2BpOption keystrokesEnabled;
    public final YesNo2BpOption showScoreboard;
    public final ArrayBpOption<Integer> emotki;
    public final YesNo2BpOption itemsps;
    public final YesNo2BpOption newControls;
    public final YesNo2BpOption enableCompass;
    public final ArrayBpOption<Integer> compassDetails;
    public final ArrayBpOption<Integer> keystrokesColors;
    public final ArrayBpOption<Integer> compassColors;
    public final ArrayBpOption<Integer> overlayColors;
    public final YesNo2BpOption compassBackground;
    public final BpOptionValue<HashMap<String, Point2D.Double>> arrangeGui;
    public final BpOptionValue<HashMap<String, Point2D.Double>> reloadAddons;
    public final 9 outlineWeight;
    public ArrayList<BpOptionValue<?>> options;
    public GameSettings gameSettings;
    
    public BpOptions(final GameSettings gameSettings) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()printChatMessage
        //     4: aload_0         /* this */
        //     5: iconst_1       
        //     6: putfield        amazingpack/e.isDefaultSettings:Z
        //     9: aload_0         /* this */
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: invokespecial   java/util/ArrayList.<init>:()printChatMessage
        //    17: putfield        amazingpack/e.options:Ljava/util/ArrayList;
        //    20: aload_0         /* this */
        //    21: aload_1         /* gameSettings */
        //    22: putfield        amazingpack/e.gameSettings:Lnet/minecraft/client/settings/GameSettings;
        //    25: aload_0         /* this */
        //    26: new             Lamazingpack/M;
        //    29: dup            
        //    30: aload_0         /* this */
        //    31: ldc             "\u0a04\u2fae\u0a2e\u08e8\u0a2a\u2faa"
        //    33: ldc             1643732197
        //    35: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //    38: iconst_0       
        //    39: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    42: getstatic       amazingpack/a.e:Lamazingpack/a;
        //    45: iconst_4       
        //    46: anewarray       Ljava/lang/Integer;
        //    49: dup            
        //    50: iconst_0       
        //    51: iconst_0       
        //    52: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    55: aastore        
        //    56: dup            
        //    57: iconst_1       
        //    58: iconst_1       
        //    59: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    62: aastore        
        //    63: dup            
        //    64: iconst_2       
        //    65: iconst_2       
        //    66: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    69: aastore        
        //    70: dup            
        //    71: iconst_3       
        //    72: iconst_3       
        //    73: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    76: aastore        
        //    77: invokespecial   amazingpack/M.<init>:(Lamazingpack/e;Ljava/lang/String;Ljava/lang/Object;Lamazingpack/a;[Ljava/lang/Object;)printChatMessage
        //    80: putfield        amazingpack/e.emotki:Lamazingpack/M;
        //    83: aload_0         /* this */
        //    84: new             Lamazingpack/j;
        //    87: dup            
        //    88: aload_0         /* this */
        //    89: ldc             "\uf5a5\ud03c\uf5b9\uf77c\uf581\ud03d\uf5b8\uf76c\uf5a5"
        //    91: ldc             -1250778254
        //    93: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //    96: iconst_1       
        //    97: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   100: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   103: putfield        amazingpack/e.showWings:Lamazingpack/j;
        //   106: aload_0         /* this */
        //   107: new             Lamazingpack/j;
        //   110: dup            
        //   111: aload_0         /* this */
        //   112: ldc             "\ue0e4\uc57d\ue0f8\ue23d\ue0c0\uc57c\ue0f9\ue22d\ue0e4"
        //   114: ldc             1303819827
        //   116: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   119: iconst_1       
        //   120: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   123: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   126: putfield        amazingpack/e.showItems:Lamazingpack/j;
        //   129: aload_0         /* this */
        //   130: new             Lamazingpack/j;
        //   133: dup            
        //   134: aload_0         /* this */
        //   135: ldc             "\ufab4\udf2d\ufaa8\uf86d\ufa90\udf2c\ufaa9\uf87d\ufab4"
        //   137: ldc             -814568349
        //   139: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   142: iconst_1       
        //   143: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   146: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   149: putfield        amazingpack/e.showHats:Lamazingpack/j;
        //   152: aload_0         /* this */
        //   153: new             Lamazingpack/j;
        //   156: dup            
        //   157: aload_0         /* this */
        //   158: ldc             "\u10dd\u3544\u10c1\u1204\u10f9\u3545\u10c0\u1214\u10dd"
        //   160: ldc             1939621386
        //   162: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   165: iconst_1       
        //   166: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   169: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   172: putfield        amazingpack/e.showTails:Lamazingpack/j;
        //   175: aload_0         /* this */
        //   176: new             Lamazingpack/j;
        //   179: dup            
        //   180: aload_0         /* this */
        //   181: ldc             "\u8333\ua6ac\u833f\u81ea\u830a\ua6ab"
        //   183: ldc             215537150
        //   185: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   188: iconst_1       
        //   189: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   192: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   195: putfield        amazingpack/e.itemsps:Lamazingpack/j;
        //   198: aload_0         /* this */
        //   199: new             Lamazingpack/j;
        //   202: dup            
        //   203: aload_0         /* this */
        //   204: ldc             "\ub529\u90b0\ub535\ub7f0\ub519\u90b0\ub53b\ub7f3\ub518\u90b9\ub539\ub7ec\ub53d\u90aa\ub535\ub7f2\ub534\u90bc"
        //   206: ldc             -1459887106
        //   208: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   211: iconst_0       
        //   212: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   215: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   218: putfield        amazingpack/e.showChatBackground:Lamazingpack/j;
        //   221: aload_0         /* this */
        //   222: new             Lamazingpack/j;
        //   225: dup            
        //   226: aload_0         /* this */
        //   227: ldc             "\u3f38\u1aa1\u3f24\u3de1\u3f08\u1aa1\u3f3e\u3df8\u3f20\u1a88\u3f25\u3dff\u3f26\u1aa8\u3f3f\u3dff\u3f24\u1aa7\u3f38"
        //   229: ldc             2050255343
        //   231: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   234: iconst_1       
        //   235: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   238: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   241: putfield        amazingpack/e.showChunkAnimations:Lamazingpack/j;
        //   244: aload_0         /* this */
        //   245: new             Lamazingpack/j;
        //   248: dup            
        //   249: aload_0         /* this */
        //   250: ldc             "\u828e\ua717\u8292\u8057\u82be\ua717\u8288\u804e\u8296\ua73e\u8293\u8049\u8290\ua71e\u8289\u8049\u8292\ua711\u828e"
        //   252: ldc             -1083976615
        //   254: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   257: iconst_1       
        //   258: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   261: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   264: putfield        amazingpack/e.sprint:Lamazingpack/j;
        //   267: aload_0         /* this */
        //   268: new             Lamazingpack/j;
        //   271: dup            
        //   272: aload_0         /* this */
        //   273: ldc             "\u97e5\ub27c\u97f9\u953c\u97d7\ub277\u97e2\u9522\u97e0\ub271\u97c6\u9524\u97e2\ub27d\u97f9\u9525\u97e5"
        //   275: ldc             -1925922510
        //   277: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   280: iconst_1       
        //   281: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   284: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   287: putfield        amazingpack/e.showActivePotions:Lamazingpack/j;
        //   290: aload_0         /* this */
        //   291: new             Lamazingpack/j;
        //   294: dup            
        //   295: aload_0         /* this */
        //   296: ldc             "\u452d\u60a6\u4527\u47e8\u4508\u60b7\u4524\u47f1"
        //   298: ldc             -803073051
        //   300: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   303: iconst_0       
        //   304: getstatic       amazingpack/a.Z:Lamazingpack/a;
        //   307: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   310: putfield        amazingpack/e.leftItem:Lamazingpack/j;
        //   313: aload_0         /* this */
        //   314: new             Lamazingpack/j;
        //   317: dup            
        //   318: aload_0         /* this */
        //   319: ldc             "\u4d2c\u68b5\u4d30\u4ff5\u4d0c\u68be\u4d30\u4ff0\u4d3a\u68bf\u4d30\u4fe3\u4d2d\u68b9"
        //   321: ldc             487005179
        //   323: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   326: iconst_1       
        //   327: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   330: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   333: putfield        amazingpack/e.showScoreboard:Lamazingpack/j;
        //   336: aload_0         /* this */
        //   337: new             Lamazingpack/j;
        //   340: dup            
        //   341: aload_0         /* this */
        //   342: ldc             "\ue79a\uc215\ue78d\ue542\ue79c\uc210\ue79b\ue561\ue78c\uc219\ue79f\ue548\ue7ae\uc21d\ue78c\ue557\ue797\uc21f\ue792\ue546\ue78d"
        //   344: ldc             323858778
        //   346: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   349: iconst_0       
        //   350: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   353: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   356: putfield        amazingpack/e.disableDigParticles:Lamazingpack/j;
        //   359: aload_0         /* this */
        //   360: new             Lamazingpack/j;
        //   363: dup            
        //   364: aload_0         /* this */
        //   365: ldc             "\u7cdd\u5952\u7cca\u7e05\u7cdb\u5957\u7cdc\u7e2d\u7ccd\u595e\u7cd4\u7e21\u7cdf\u595d\u7cdc\u7e07\u7ccd\u5948"
        //   367: ldc             778054173
        //   369: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   372: iconst_0       
        //   373: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   376: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   379: putfield        amazingpack/e.disableItemEffects:Lamazingpack/j;
        //   382: aload_0         /* this */
        //   383: new             Lamazingpack/j;
        //   386: dup            
        //   387: aload_0         /* this */
        //   388: ldc             "\u140b\u3184\u141c\u16d3\u140d\u3181\u140a\u16f7\u1401\u318e\u1407\u16d3\u1401\u3199\u143b\u16d3\u140d\u3181\u140a\u16e2\u140e\u319f\u141b\u16db\u140c\u3181\u140a\u16c1"
        //   390: ldc             -1493548341
        //   392: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   395: iconst_0       
        //   396: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   399: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   402: putfield        amazingpack/e.disableEnchantTableParticles:Lamazingpack/j;
        //   405: aload_0         /* this */
        //   406: new             Lamazingpack/j;
        //   409: dup            
        //   410: aload_0         /* this */
        //   411: ldc             "\uc9be\uec31\uc9a9\ucb66\uc9b8\uec34\uc9bf\ucb45\uc9bb\uec3b\uc9b1\ucb60\uc9a8\uec37\uc9af\ucb69\uc9be\uec16\uc9bb\ucb6a\uc9bf\uec0c\uc9bb\ucb60"
        //   413: ldc             835821438
        //   415: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   418: iconst_0       
        //   419: getstatic       amazingpack/a.Y:Lamazingpack/a;
        //   422: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   425: putfield        amazingpack/e.disableBackgroundNameTag:Lamazingpack/j;
        //   428: new             Ljava/util/HashMap;
        //   431: dup            
        //   432: invokespecial   java/util/HashMap.<init>:()printChatMessage
        //   435: astore_2        /* defArrange */
        //   436: aload_0         /* this */
        //   437: new             Lamazingpack/printChatMessage;
        //   440: dup            
        //   441: aload_0         /* this */
        //   442: aload_0         /* this */
        //   443: ldc             "\u2555\u00c4\u2546\u2788\u255a\u00d1\u2551\u27ae\u2541\u00df"
        //   445: ldc             130380688
        //   447: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   450: aload_2         /* defArrange */
        //   451: getstatic       amazingpack/a.a:Lamazingpack/a;
        //   454: invokespecial   amazingpack/printChatMessage.<init>:(Lamazingpack/e;Lamazingpack/e;Ljava/lang/String;Ljava/util/HashMap;Lamazingpack/a;)printChatMessage
        //   457: putfield        amazingpack/e.arrangeGui:Lamazingpack/Y;
        //   460: new             Ljava/util/HashMap;
        //   463: dup            
        //   464: invokespecial   java/util/HashMap.<init>:()printChatMessage
        //   467: astore_3        /* reloadAddonsMap */
        //   468: aload_0         /* this */
        //   469: new             Lamazingpack/fixColor;
        //   472: dup            
        //   473: aload_0         /* this */
        //   474: aload_0         /* this */
        //   475: ldc             "\u38a9\u1d09\u3883\u3a41\u3895\u1d1a\u389d\u3a51\u3893\u1d5b\u389d\u3a4b\u389d\u1d1a\u388d\u3a4f\u3890"
        //   477: ldc             295136861
        //   479: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   482: aload_3         /* reloadAddonsMap */
        //   483: getstatic       amazingpack/a.a:Lamazingpack/a;
        //   486: invokespecial   amazingpack/fixColor.<init>:(Lamazingpack/e;Lamazingpack/e;Ljava/lang/String;Ljava/util/HashMap;Lamazingpack/a;)printChatMessage
        //   489: putfield        amazingpack/e.reloadAddons:Lamazingpack/Y;
        //   492: aload_0         /* this */
        //   493: new             Lamazingpack/j;
        //   496: dup            
        //   497: aload_0         /* this */
        //   498: ldc             "\u1487\u310e\u149e\u1677\u1486\u3105\u149d\u1646\u1486\u3107\u149a"
        //   500: ldc             739590733
        //   502: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   505: iconst_1       
        //   506: getstatic       amazingpack/a.a:Lamazingpack/a;
        //   509: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   512: putfield        amazingpack/e.newControls:Lamazingpack/j;
        //   515: aload_0         /* this */
        //   516: new             Lamazingpack/check;
        //   519: dup            
        //   520: aload_0         /* this */
        //   521: aload_0         /* this */
        //   522: ldc             "\u163e\u33b2\u162c\u14fb\u1621\u33b8\u1627\u14ed\u1626\u3392\u163b\u14e9\u1637\u33bb\u1630\u14ec"
        //   524: ldc             28786929
        //   526: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   529: iconst_1       
        //   530: getstatic       amazingpack/a.b:Lamazingpack/a;
        //   533: invokespecial   amazingpack/check.<init>:(Lamazingpack/e;Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   536: putfield        amazingpack/e.keystrokesEnabled:Lamazingpack/j;
        //   539: aload_0         /* this */
        //   540: new             Lamazingpack/j;
        //   543: dup            
        //   544: aload_0         /* this */
        //   545: ldc             "\ued8a\uc813\ued96\uef53\uedba\uc80b\ued8a\uef67\ued96\uc80e\ued97\uef50\ued9c\uc809"
        //   547: ldc             -982467747
        //   549: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   552: iconst_1       
        //   553: getstatic       amazingpack/a.b:Lamazingpack/a;
        //   556: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   559: putfield        amazingpack/e.showCpsCounter:Lamazingpack/j;
        //   562: aload_0         /* this */
        //   563: new             Lamazingpack/j;
        //   566: dup            
        //   567: aload_0         /* this */
        //   568: ldc             "\udfc6\ufa4f\udfc2\udd1c\udfcf\ufa44\udfe0\udd11\udfce\ufa51\udfc2\udd0d\udfd0"
        //   570: ldc             1697220871
        //   572: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   575: iconst_1       
        //   576: getstatic       amazingpack/a.c:Lamazingpack/a;
        //   579: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   582: putfield        amazingpack/e.enableCompass:Lamazingpack/j;
        //   585: aload_0         /* this */
        //   586: new             Lamazingpack/M;
        //   589: dup            
        //   590: aload_0         /* this */
        //   591: ldc             "\u9b0c\ube82\u9b02\u99c2\u9b0e\ube9e\u9b1c\u99f6\u9b0a\ube99\u9b0e\u99db\u9b03\ube9e"
        //   593: ldc             168676811
        //   595: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   598: iconst_2       
        //   599: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   602: getstatic       amazingpack/a.c:Lamazingpack/a;
        //   605: iconst_3       
        //   606: anewarray       Ljava/lang/Integer;
        //   609: dup            
        //   610: iconst_0       
        //   611: iconst_0       
        //   612: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   615: aastore        
        //   616: dup            
        //   617: iconst_1       
        //   618: iconst_1       
        //   619: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   622: aastore        
        //   623: dup            
        //   624: iconst_2       
        //   625: iconst_2       
        //   626: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   629: aastore        
        //   630: invokespecial   amazingpack/M.<init>:(Lamazingpack/e;Ljava/lang/String;Ljava/lang/Object;Lamazingpack/a;[Ljava/lang/Object;)printChatMessage
        //   633: putfield        amazingpack/e.compassDetails:Lamazingpack/M;
        //   636: aload_0         /* this */
        //   637: new             Lamazingpack/M;
        //   640: dup            
        //   641: aload_0         /* this */
        //   642: ldc             "\ufcfd\ud971\ufcef\ufe38\ufce2\ud966\ufcf9\ufe20\ufcf3\ud967\ufcd5\ufe24\ufcfa\ud97b\ufce4\ufe38"
        //   644: ldc             -135419342
        //   646: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   649: iconst_0       
        //   650: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   653: getstatic       amazingpack/a.b:Lamazingpack/a;
        //   656: bipush          7
        //   658: anewarray       Ljava/lang/Integer;
        //   661: dup            
        //   662: iconst_0       
        //   663: iconst_0       
        //   664: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   667: aastore        
        //   668: dup            
        //   669: iconst_1       
        //   670: iconst_1       
        //   671: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   674: aastore        
        //   675: dup            
        //   676: iconst_2       
        //   677: iconst_2       
        //   678: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   681: aastore        
        //   682: dup            
        //   683: iconst_3       
        //   684: iconst_3       
        //   685: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   688: aastore        
        //   689: dup            
        //   690: iconst_4       
        //   691: iconst_4       
        //   692: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   695: aastore        
        //   696: dup            
        //   697: iconst_5       
        //   698: iconst_5       
        //   699: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   702: aastore        
        //   703: dup            
        //   704: bipush          6
        //   706: bipush          6
        //   708: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   711: aastore        
        //   712: invokespecial   amazingpack/M.<init>:(Lamazingpack/e;Ljava/lang/String;Ljava/lang/Object;Lamazingpack/a;[Ljava/lang/Object;)printChatMessage
        //   715: putfield        amazingpack/e.keystrokesColors:Lamazingpack/M;
        //   718: aload_0         /* this */
        //   719: new             Lamazingpack/M;
        //   722: dup            
        //   723: aload_0         /* this */
        //   724: ldc             "\u685c\u4dd2\u6852\u6a92\u685e\u4dce\u684c\u6aa1\u6850\u4dd1\u6850\u6a90\u684c"
        //   726: ldc             1786134171
        //   728: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   731: iconst_0       
        //   732: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   735: getstatic       amazingpack/a.c:Lamazingpack/a;
        //   738: bipush          7
        //   740: anewarray       Ljava/lang/Integer;
        //   743: dup            
        //   744: iconst_0       
        //   745: iconst_0       
        //   746: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   749: aastore        
        //   750: dup            
        //   751: iconst_1       
        //   752: iconst_1       
        //   753: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   756: aastore        
        //   757: dup            
        //   758: iconst_2       
        //   759: iconst_2       
        //   760: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   763: aastore        
        //   764: dup            
        //   765: iconst_3       
        //   766: iconst_3       
        //   767: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   770: aastore        
        //   771: dup            
        //   772: iconst_4       
        //   773: iconst_4       
        //   774: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   777: aastore        
        //   778: dup            
        //   779: iconst_5       
        //   780: iconst_5       
        //   781: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   784: aastore        
        //   785: dup            
        //   786: bipush          6
        //   788: bipush          6
        //   790: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   793: aastore        
        //   794: invokespecial   amazingpack/M.<init>:(Lamazingpack/e;Ljava/lang/String;Ljava/lang/Object;Lamazingpack/a;[Ljava/lang/Object;)printChatMessage
        //   797: putfield        amazingpack/e.compassColors:Lamazingpack/M;
        //   800: aload_0         /* this */
        //   801: new             Lamazingpack/M;
        //   804: dup            
        //   805: aload_0         /* this */
        //   806: ldc             "\u1af2\u3f69\u1af8\u1832\u1af1\u3f7e\u1ae4\u1803\u1af2\u3f73\u1af2\u1832\u1aee"
        //   808: ldc_w           -652391367
        //   811: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   814: iconst_0       
        //   815: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   818: getstatic       amazingpack/a.d:Lamazingpack/a;
        //   821: iconst_5       
        //   822: anewarray       Ljava/lang/Integer;
        //   825: dup            
        //   826: iconst_0       
        //   827: iconst_0       
        //   828: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   831: aastore        
        //   832: dup            
        //   833: iconst_1       
        //   834: iconst_1       
        //   835: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   838: aastore        
        //   839: dup            
        //   840: iconst_2       
        //   841: iconst_2       
        //   842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   845: aastore        
        //   846: dup            
        //   847: iconst_3       
        //   848: iconst_3       
        //   849: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   852: aastore        
        //   853: dup            
        //   854: iconst_4       
        //   855: iconst_4       
        //   856: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   859: aastore        
        //   860: invokespecial   amazingpack/M.<init>:(Lamazingpack/e;Ljava/lang/String;Ljava/lang/Object;Lamazingpack/a;[Ljava/lang/Object;)printChatMessage
        //   863: putfield        amazingpack/e.overlayColors:Lamazingpack/M;
        //   866: aload_0         /* this */
        //   867: new             Lamazingpack/j;
        //   870: dup            
        //   871: aload_0         /* this */
        //   872: ldc_w           "\u7120\u54ae\u712e\u73ee\u7122\u54b2\u7130\u73dc\u7122\u54a2\u7128\u73f9\u7131\u54ae\u7136\u73f0\u7127"
        //   875: ldc_w           2029070311
        //   878: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   881: iconst_1       
        //   882: getstatic       amazingpack/a.c:Lamazingpack/a;
        //   885: invokespecial   amazingpack/j.<init>:(Lamazingpack/e;Ljava/lang/String;ZLamazingpack/a;)printChatMessage
        //   888: putfield        amazingpack/e.compassBackground:Lamazingpack/j;
        //   891: aload_0         /* this */
        //   892: new             Lamazingpack/9;
        //   895: dup            
        //   896: aload_0         /* this */
        //   897: ldc_w           "\udaf9\uff61\udae2\ud827\udaff\uff7a\udaf3\ud81c\udaf3\uff7d\udaf1\ud823\udae2"
        //   900: ldc_w           953781298
        //   903: invokestatic    net/minecraft/world/WorldProviderHell$BlockRedstoneComparator.G:(Ljava/lang/Object;I)Ljava/lang/String;
        //   906: fconst_2       
        //   907: getstatic       amazingpack/a.d:Lamazingpack/a;
        //   910: ldc_w           0.2
        //   913: ldc_w           10.0
        //   916: invokespecial   amazingpack/9.<init>:(Lamazingpack/e;Ljava/lang/String;FLamazingpack/a;FF)printChatMessage
        //   919: putfield        amazingpack/e.outlineWeight:Lamazingpack/9;
        //   922: aload_0         /* this */
        //   923: iconst_1       
        //   924: putfield        amazingpack/e.isDefaultSettings:Z
        //   927: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1119)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:192)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:45)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void saveOptions() {
        final HashMap<String, Object> savedOptions = new HashMap<String, Object>();
        for (final BpOptionValue<?> option : this.options) {
            savedOptions.put(option.key, option.getValue());
        }
        try {
            final FileOutputStream fos = new FileOutputStream(this.gameSettings.optionsFileLP);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(savedOptions);
            oos.close();
        }
        catch (IOException ex) {}
    }
    
    public void loadOptions() {
        try {
            final FileInputStream fis = new FileInputStream(this.gameSettings.optionsFileLP);
            final ObjectInputStream ois = new ObjectInputStream(fis);
            final HashMap<String, Object> loadedOptions = (HashMap<String, Object>)ois.readObject();
            ois.close();
            for (final BpOptionValue<?> option : this.options) {
                final Object opt = loadedOptions.get(option.key);
                if (opt != null) {
                    try {
                        option.loadValue(opt);
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
            for (final Map.Entry<String, Point2D.Double> entr : this.arrangeGui.defaultValue.entrySet()) {
                this.arrangeGui.getValue().putIfAbsent(entr.getKey(), entr.getValue());
            }
        }
        catch (IOException | ClassNotFoundException ex4) {
            final Exception ex3;
            final Exception ex2 = ex3;
            ex2.printStackTrace();
        }
    }
    
    public void setLanguage() {
        final boolean isPolish = WorldProviderHell$BlockRedstoneComparator.G("\u2fe0\u0b7e\u2fcf\ufdb5\u2fdc", 1992731036).equals(I18n.format(WorldProviderHell$BlockRedstoneComparator.G("\u809a\ua415\u8098\u52e4\u8083\ua415\u8091\u52e6\u80d8\ua417\u8099\u52e7\u8093", -1303771398), new Object[0]));
        for (final BpOptionValue<?> opt : this.options) {
            opt.tooltip = new String[0];
            if (opt instanceof YesNo2BpOption) {
                final YesNo2BpOption opt_ = (YesNo2BpOption)opt;
                opt_.yes = I18n.format(WorldProviderHell$BlockRedstoneComparator.G("\u853b\ua1ab\u8535\u5707\u8525\ua1bb\u852f", -98761904), new Object[0]);
                opt_.no = I18n.format(WorldProviderHell$BlockRedstoneComparator.G("\u292e\u0dbe\u2920\ufb12\u2927\u0da4", 1539878725), new Object[0]);
            }
            else {
                if (!(opt instanceof 3)) {
                    continue;
                }
                final 3 opt_2 = (3)opt;
                opt_2.tableColors = (isPolish ? 3.1 : 3.2);
            }
        }
        if (isPolish) {
            this.enableCompass.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u9a28\ubfbf\u9b7a\u4869\u9a05\ubedd\u9a14\u4865\u9a12\ube8d\u9a1e\u4879", 1187191923);
            this.itemsps.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ub746\u93eb\ub77a\u650c\ub76b\u93e3\ub720\u6525\ub772\u93f8\ub765\u6511\ub76d\u93eb\ub76f\u6501\ub7f3\u93f5", -243846900);
            this.sprint.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ue6e2\uc375\ue7b0\u34a3\ue6cf\uc217\ue6d4\u34b5\ue6c1\uc258\ue6d8\u34a1\ue6c1\uc24e\ue6d6\u34ba\ue6db\uc24e\ue695\u34b3\ue6c5\uc245\ue6dc\u34ae\ue6c1", 1786273977);
            this.compassDetails.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u21ae\u0507\u2181\uf2dd\u218b\u050c\u2184\uf3f0\u20b1\u046f\u21ca\uf3f4\u2185\u0505\u219a\uf3fe\u2199\u051d", -431052826);
            this.compassDetails.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u404e\u64eb\u4073\u921e\u4061", -1413954036), WorldProviderHell$BlockRedstoneComparator.G("\u20f6\u055d\u21c8\uf3bc\u21c3\u0546\u21cc", 1295493025), WorldProviderHell$BlockRedstoneComparator.G("\u8360\ua7cc\u8344\u512d\u835c\ua7d4", -146995909) };
            this.keystrokesColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\uf19a\ud5d9\uf16a\u2300\uf174\ud5eb\uf178", 1818654513), WorldProviderHell$BlockRedstoneComparator.G("\u9d6b\ub92c\u9d8e\u4ff5\u9d99\ub90b", -1426056256), WorldProviderHell$BlockRedstoneComparator.G("\u8f77\uab31\u8f82\u5de0\u8f94", -1150744100), WorldProviderHell$BlockRedstoneComparator.G("\uccf5\ue8b1\ucc15\u1e75\ucc17\ue895\ucc1c", -2108143010), WorldProviderHell$BlockRedstoneComparator.G("\uc26f\ue62f\uc291\u10f8\uc284\ue606\uc287\u10ea", 1331119300), WorldProviderHell$BlockRedstoneComparator.G("\udad7\ufec7\uda20\u0850\uda22\ufea2\uda3c\u0840", 978476156), WorldProviderHell$BlockRedstoneComparator.G("\u8c45\ua851\u8cb0\u5e30\u8cd0\ua821\u8c45\u5ea3\u8cab\ua8c7\u8cd7\u5ed9\u8c45\ua805\u8ca0\u5e30\u8cdb\ua82f\u8c45\u5ef3\u8cb5", -695596306) };
            this.keystrokesColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u0622\u2284\u0605\ud473\u061b\u2292\u0649\ud477\u0605\u228a\u061e\ud475\u061a\u2291\u0610", 265781349);
            this.overlayColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u8463\ua0c5\u8444\u5632\u845a\ua08a\u8447\u563f\u845f\ua059\u844c\u5636\u8441", -994901468);
            this.compassColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uda17\ufeb1\uda30\u0846\uda2e\ufea7\uda7c\u0842\uda33\ufeb3\uda2c\u0848\uda2f\ufeab", 1280859216);
            this.overlayColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u47fd\u63be\u470d\u9567\u4713\u638c\u471f", 912114006), WorldProviderHell$BlockRedstoneComparator.G("\u9ca7\ub8e0\u9c42\u4e39\u9c55\ub8c7", -1534780916), WorldProviderHell$BlockRedstoneComparator.G("\u2d22\u0962\u2ddc\uffb5\u2dc9\u094b\u2dca\uffa7", 1099606921), WorldProviderHell$BlockRedstoneComparator.G("\ub064\u9474\ub093\u62e3\ub091\u9411\ub08f\u62f3", -1223936305), WorldProviderHell$BlockRedstoneComparator.G("\u91a3\ub5b7\u9156\u43d6\u9136\ub5c7\u91a3\u4345\u914d\ub521\u9131\u433f\u91a3\ub5e3\u9146\u43d6\u913d\ub5c9\u91a3\u4315\u9153", -1328605432) };
            this.compassColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u7335\u5776\u73c5\ua1af\u73db\u5744\u73d7", -1760168546), WorldProviderHell$BlockRedstoneComparator.G("\u5a9f\u7ed8\u5a7a\u8801\u5a6d\u7eff", 1923341364), WorldProviderHell$BlockRedstoneComparator.G("\uf7f9\ud3bf\uf70c\u256e\uf71a", -2125631150), WorldProviderHell$BlockRedstoneComparator.G("\uf590\ud1d4\uf570\u2710\uf572\ud1f0\uf579", -536644805), WorldProviderHell$BlockRedstoneComparator.G("\u038c\u27cc\u0372\ud11b\u0367\u27e5\u0364\ud109", 819168551), WorldProviderHell$BlockRedstoneComparator.G("\u35f6\u11e6\u3501\ue771\u3503\u1183\u351d\ue761", 1974907741), WorldProviderHell$BlockRedstoneComparator.G("\ub193\u9587\ub166\u63e6\ub106\u95f7\ub193\u6375\ub17d\u9511\ub101\u630f\ub193\u95d3\ub176\u63e6\ub10d\u95f9\ub193\u6325\ub163", 2143631160) };
            this.compassBackground.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u4818\u6d8c\u4823\u9a19\u4827\u6ca1\u4821\u9a49\u482d\u6cbd\u4839", 304860736);
            this.emotki.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u9e69\ubacc\u9e4c\u4c3f\u9e5f\ubacc\u9e43\u4c37", 392763427), WorldProviderHell$BlockRedstoneComparator.G("\u3044\u14f1\u3075\ue206\u3036\u14f0\u3079\ue243\u3071\u14fb\u3064\ue21a", 439727642), WorldProviderHell$BlockRedstoneComparator.G("\u45c2\u6175\u45fd", 1397343130), WorldProviderHell$BlockRedstoneComparator.G("\uf278\ud6dd\uf253", 149779514) };
            this.emotki.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u5ed9\u7a66\u5eef\u8c84\u5eea\u7a63\u5eee\u8cde\u5eee\u7a64\u5ee4\u8c8a\u5eee\u7a62", 161994887);
            this.showWings.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u2af4\u0e49\u2acf\uf8b0\u2ade\u0e53\u2ace\uf8f1\u2ad7\u0e4d\u2ad6\uf8ab\u2add\u0e42\u2ac8\uf8b0", 604679336);
            this.showHats.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uacda\u8867\uace1\u7e9e\uacf0\u887d\uace0\u7edf\uace9\u8872\uaceb\u7e8f\uace1\u8861", 737815174);
            this.showItems.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u7334\u5789\u730f\ua170\u731e\u5793\u730e\ua131\u730d\u5792\u7301\ua17c\u731d", -649005720);
            this.showTails.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u9d92\ub92f\u9da9\u4fd6\u9db8\ub935\u9da8\u4f97\u9dad\ub927\u9dad\u4fd9\u9dbb", 227548110);
            this.showActivePotions.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ue695\uc228\ue6ae\u34d1\ue6bf\uc232\ue6af\u3490\ue6a0\uc221\ue6a0\u34db\ue6b1\uc23e\ue6e5\u34dd\ue6ac\uc22c\ue6b6\u34c4\ue6b0\uc235", -650485559);
            this.showCpsCounter.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u0bf3\u2f4e\u0bc8\ud9b7\u0bd9\u2f54\u0bc9\ud9f6\u0bcf\u2f48\u0bc0\ud9ac\u0bcd\u2f48\u0bc8\ud9f6\u0be0\u2f71\u0bf0", -861172305);
            this.showChatBackground.namedOption = WorldProviderHell$BlockRedstoneComparator.G("�\u2525\u008a\ud2b0\u0086\u241d\u0084\ud2e4\u0090", -773945623);
            this.showChunkAnimations.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u3918\u1db5\u3930\ueb41\u3938\u1db8\u3933\ueb4d\u3979\u1db8\u3931\ueb59\u3937\u1db0\u39aa\ueb5b", -2084847787);
            this.disableDigParticles.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u0c27\u288e\u0d2a\ude7c\u0c05\u2881\u0c01\ude3d\u0c12\u2884\u0c01\ude6e\u0c12\u2889\u0c12\ude72\u0c06\u288f\u0c0f\ude72\u0c48\u2888\u0c04\ude72\u0c03\u289f", -429553052);
            this.disableItemEffects.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u20c4\u0465\u20e4\uf29f\u20f5\u0423\u20db\uf295\u20ea\u046f\u2198\uf297\u20e8\u0462", -1374116211);
            this.disableEnchantTableParticles.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ue2c7\uc64e\ue3ea\u30bc\ue2c5\uc641\ue2c1\u30fd\ue2db\uc65e\ue2c7\u319f\ue2dd\uc60a\ue2cc\u30b2\ue288\uc650\ue2c9\u30b6\ue2c4\uc733\ue3af", -793221980);
            this.disableBackgroundNameTag.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u0557\u21ea\u056c\ud713\u057d\u21f0\u056d\ud752\u0573\u20c7\u0568\ud752\u0569\u21ec\u0564\ud719\u0572", -1138719989);
            this.keystrokesEnabled.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ueb47\ucffa\ueb7c\u3903\ueb6d\ucfe0\ueb7d\u3942\ueb7c\ucff9\ueb76\u3915\ueb7e\ucfe6\ueb6d\u3907", -910136037);
            this.showScoreboard.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ua144\u85f9\ua17f\u7300\ua16e\u85e3\ua17e\u7341\ua160\u84d4\ua17b\u7341\ua167\u85f5\ua17b\u7313\ua171\u85f4\ua17b\u7300\ua166\u85f2", -1259329768);
            this.leftItem.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uee44\ucae0\uee69\u3c07\uee30\ucafe\uee75\u3c12\uee7f\ucae0\uef09\u3c06\uee6a\ucafc\uee69", 2026137628);
            this.arrangeGui.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uc2c1\ue67e\uc2e9\u108b\uc2fa\ue674\uc3c8\u11e1\uc2b3\ue656\uc2c6\u10af", 1785283743);
            this.newControls.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ub95c\u9dff\ub965\u6b1e\ub932\u9de7\ub96b\u6b00\ub97e\u9c95\ub976", 751189790);
            this.outlineWeight.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u5355\u77e2\u5367\u8105\u537d\u76cb\u5215\u8147\u537d\u77f2\u5360\u8106\u537f\u77ff\u5365\u8106\u537c\u77f9\u5373", 1639175454);
            this.disableDigParticles.no = WorldProviderHell$BlockRedstoneComparator.G("\uc446\ue0ea\uc553\u1761\uc472\ue0e9\uc47e\u160a\uc470", -424984035);
            this.disableDigParticles.yes = WorldProviderHell$BlockRedstoneComparator.G("\u5cbf\u7813\u5daa\u8f98\u5c8b\u7810\u5c87\u8ef3\u5c89", -2129929500);
            this.disableItemEffects.no = WorldProviderHell$BlockRedstoneComparator.G("\u03ff\u2753\u02ea\ud0d8\u03cb\u2750\u03c7\ud1b3\u03c9", -501709404);
            this.disableItemEffects.yes = WorldProviderHell$BlockRedstoneComparator.G("\uc7ce\ue362\uc6db\u14e9\uc7fa\ue361\uc7f6\u1582\uc7f8", 81412501);
        }
        else {
            this.showWings.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ub344\u97fd\ub378\u6115\ub337\u97e2\ub37e\u610c\ub370\u97e6", 33502491);
            this.showHats.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u4b60\u6fd9\u4b5c\u9931\u4b13\u6fd9\u4b52\u9932\u4b40", -1260729025);
            this.itemsps.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u3fea\u1b5f\u3fd9\ueda1\u3f98\u1b53\u3fcc\ueda8\u3fd5\u1b49", -1836074572);
            this.emotki.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u3c35\u1890\u3c10\uee63\u3c03\u1890\u3c1f\uee6b", -1651459457), WorldProviderHell$BlockRedstoneComparator.G("\u9506\ub1b3\u9537\u4744\u9574\ub1b2\u953b\u4701\u9533\ub1b9\u9526\u4758", 1518998360), WorldProviderHell$BlockRedstoneComparator.G("\ud6a2\uf215\ud69d", 167923962), WorldProviderHell$BlockRedstoneComparator.G("\u9d95\ub930\u9dbe", -1412555817) };
            this.emotki.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uf919\udda6\uf92f\u2b44\uf92a\udda3\uf92e\u2b1e\uf92e\udda4\uf924\u2b4a\uf92e\udda2", 155352903);
            this.showItems.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u3c0f\u18b6\u3c33\uee5e\u3c7c\u18b7\u3c28\uee4c\u3c31\u18ad", 70236752);
            this.showTails.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u8adb\uae62\u8ae7\u588a\u8aa8\uae7e\u8ae9\u5894\u8ae4\uae79", 1870466180);
            this.enableCompass.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ucad6\uee7f\ucaf2\u1884\ucaff\uee74\ucab3\u1885\ucafc\uee7c\ucae3\u1887\ucae0\uee62", 1348226207);
            this.disableBackgroundNameTag.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ud100\uf5b9\ud13c\u0351\ud173\uf5bf\ud13a\u0345\ud138\uf5bf\ud132\u034b\ud136\uf5f1\ud131\u0347\ud130\uf5ba\ud134\u0354\ud13c\uf5a4\ud13d\u0342", -1489021089);
            this.keystrokesColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u5371\u77dd\u5343\u813c\u534e\u77ca\u5355\u8124\u535f\u77cb\u531a\u812c\u5355\u77d4\u5355\u813d\u5349", -1998269130);
            this.compassColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uc1e4\ue54a\uc1ca\u13a2\uc1c6\ue556\uc1d4\u13f2\uc1c4\ue54a\uc1cb\u13bd\uc1d5\ue556", -289912917);
            this.compassDetails.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u3d01\u19a2\u3d31\uef51\u3d2c\u19ab\u3d65\uef5c\u3d20\u19b1\u3d20\uef5c", 1581431625);
            this.disableItemEffects.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ube9a\u9a33\ubebc\u6cc2\ubebe\u9a33\ubeab\u6c8a\ubeba\u9a3b\ubeb9\u6ccf\ubebc\u9a29", 1929066707);
            this.disableEnchantTableParticles.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uf798\ud311\uf79e\u25e0\uf79c\ud311\uf789\u25a8\uf789\ud31e\uf79f\u25e4\uf798\ud35f\uf78d\u25e9\uf78f\ud30b\uf794\u25eb\uf791\ud31a\uf78e", -921538063);
            this.compassDetails.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u6c16\u48b7\u6c2d", 346745430), WorldProviderHell$BlockRedstoneComparator.G("\u957a\ub1d0\u9553\u472b\u9542\ub1d8", -794488005), WorldProviderHell$BlockRedstoneComparator.G("\ue437\uc094\ue418\u3662", -1533320589) };
            this.compassBackground.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uc11b\ue5ba\uc13a\u1347\uc13e\ue5a9\uc136\u1359\uc137\ue5bf", -750303403);
            this.overlayColors.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u5360\u77f8\u537b\u8116\u5366\u77e3\u536a\u815a\u536c\u77e2\u5363\u8115\u537d\u77fe", 65918211);
            this.compassColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\uc00f\ue44c\uc0ff\u1295\uc0e1\ue47e\uc0ed", -849721692), WorldProviderHell$BlockRedstoneComparator.G("\ub1e3\u95a4\ub106\u637d\ub111\u9583", -34195640), WorldProviderHell$BlockRedstoneComparator.G("\u07be\u23f8\u074b\ud529\u075d", -1476951787), WorldProviderHell$BlockRedstoneComparator.G("\u8d9d\ua9d9\u8d7d\u5f1d\u8d7f\ua9fd\u8d74", -1503917258), WorldProviderHell$BlockRedstoneComparator.G("\ub02c\u946c\ub0d2\u62bb\ub0c7\u9445\ub0c4\u62a9", 1136211591), WorldProviderHell$BlockRedstoneComparator.G("\u2797\u0387\u2760\uf510\u2762\u03e2\u277c\uf500", 1745002812), WorldProviderHell$BlockRedstoneComparator.G("\u2f86\u0b92\u2f73\ufdf3\u2f13\u0be2\u2f86\ufd60\u2f68\u0b04\u2f14\ufd1a\u2f86\u0bc6\u2f63\ufdf3\u2f18\u0bec\u2f86\ufd30\u2f76", -328423123) };
            this.overlayColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u1e98\u3adb\u1e68\ucc02\u1e76\u3ae9\u1e7a", -718104525), WorldProviderHell$BlockRedstoneComparator.G("\ub73a\u937d\ub7df\u65a4\ub7c8\u935a", 1985950097), WorldProviderHell$BlockRedstoneComparator.G("\ucac9\uee89\uca37\u185e\uca22\ueea0\uca21\u184c", -2117710750), WorldProviderHell$BlockRedstoneComparator.G("\u039a\u278a\u036d\ud11d\u036f\u27ef\u0371\ud10d", 1792050481), WorldProviderHell$BlockRedstoneComparator.G("\ufde1\ud9f5\ufd14\u2f94\ufd74\ud985\ufde1\u2f07\ufd0f\ud963\ufd73\u2f7d\ufde1\ud9a1\ufd04\u2f94\ufd7f\ud98b\ufde1\u2f57\ufd11", -421561526) };
            this.keystrokesColors.translation = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u7ea7\u5ae4\u7e57\uac3d\u7e49\u5ad6\u7e45", 1113454604), WorldProviderHell$BlockRedstoneComparator.G("\uedb6\uc9f1\ued53\u3f28\ued44\uc9d6", -55350499), WorldProviderHell$BlockRedstoneComparator.G("\uc1b4\ue5f2\uc141\u1323\uc157", -1919793377), WorldProviderHell$BlockRedstoneComparator.G("\u8be9\uafad\u8b09\u5969\u8b0b\uaf89\u8b00", 572722498), WorldProviderHell$BlockRedstoneComparator.G("\u8ee2\uaaa2\u8e1c\u5c75\u8e09\uaa8b\u8e0a\u5c67", -1183381431), WorldProviderHell$BlockRedstoneComparator.G("\u2621\u0231\u26d6\uf4a6\u26d4\u0254\u26ca\uf4b6", -161898358), WorldProviderHell$BlockRedstoneComparator.G("\u617a\u456e\u618f\ub30f\u61ef\u451e\u617a\ub39c\u6194\u45f8\u61e8\ub3e6\u617a\u453a\u619f\ub30f\u61e4\u4510\u617a\ub3cc\u618a", 1529079761) };
            this.showActivePotions.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u7692\u522b\u76ae\ua4c3\u76e1\u5233\u76ae\ua4c0\u76a8\u522c\u76af\ua494\u76a4\u5225\u76a7\ua4d1\u76a2\u5237\u76b2", 1722478797);
            this.sprint.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u9aef\ube59\u9ada\u48b4\u9add\ube5c\u9adc\u48b2\u9ac0\ube58", -553116510);
            this.showCpsCounter.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u208e\u0437\u20b2\uf2df\u20fd\u041c\u208d\uf2fb\u20fd\u043c\u20b2\uf2dd\u20b3\u042b\u20b8\uf2da", 1012770513);
            this.showChatBackground.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u263c\u0295\u261e\uf47e\u265f\u029f\u261e\uf469\u2614\u029a\u260d\uf465\u260a\u0293\u261b", -1030184845);
            this.showChunkAnimations.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ucf1f\uebb6\ucf29\u1d47\ucf37\uebfe\ucf1d\u1d47\ucf35\uebb3\ucf3d\u1d5d\ucf35\uebb1\ucf32", 522471760);
            this.disableDigParticles.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u1461\u30c7\u1442\uc630\u1442\u30c9\u140c\uc629\u144d\u30dc\u1458\uc630\u144f\u30c2\u1449\uc62a", 1765970464);
            this.keystrokesEnabled.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ub44e\u90f7\ub472\u661f\ub43d\u90f4\ub478\u6611\ub46e\u90eb\ub46f\u6607\ub476\u90fa\ub46e", -1938410991);
            this.showScoreboard.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ufc36\ud88f\ufc0a\u2e67\ufc45\ud894\ufc06\u2e7f\ufc17\ud882\ufc07\u2e7f\ufc04\ud895\ufc01\u2e30\ufc07\ud886\ufc06\u2e7b\ufc02\ud895\ufc0a\u2e65\ufc0b\ud883", 352287337);
            this.leftItem.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u39e4\u1d4f\u39ce\ueba9\u3985\u1d42\u39c9\uebb3\u39cc\u1d4f\u39cc\uebfd\u39c5\u1d45\u39cc\uebb8", -360792156);
            this.arrangeGui.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\u03a0\u2711\u0393\ud1f5\u038f\u2704\u0384\ud1b4\u03a6\u2736\u03a8", 170362349);
            this.newControls.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\ubec1\u9a68\ubef8\u6cda\ubeeb\u9a68\ubefc\u6c93\ubee8\u9a63", 1617967235);
            this.outlineWeight.namedOption = WorldProviderHell$BlockRedstoneComparator.G("\uc417\ue0af\uc42c\u1641\uc431\ue0b4\uc43d\u160d\uc42f\ue0b3\uc43c\u1659\uc430", 1603813972);
            this.disableDigParticles.yes = WorldProviderHell$BlockRedstoneComparator.G("\u164f\u32e0\u1678\uc41f\u1669\u32e5\u166e\uc41a", 1773375495);
            this.disableDigParticles.no = WorldProviderHell$BlockRedstoneComparator.G("\u44a1\u6008\u4485\u96f3\u4488\u6003\u4480", -1480670488);
        }
        WorldProviderHell$BlockRedstoneComparator.G("\uac4d\u880d\uaca4\u7eda\uacbd\u88cf\uac98\u7ebf", 1576807142);
        for (final BpOptionValue<?> opt : this.options) {
            opt.getGui().displayString = opt.getButtonText();
        }
    }
}
