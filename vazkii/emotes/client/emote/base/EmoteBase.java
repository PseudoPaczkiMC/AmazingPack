package vazkii.emotes.client.emote.base;

import aurelienribon.tweenengine.BaseTween;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.Timeline;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.model.ModelBiped;
import aurelienribon.tweenengine.TweenManager;

public abstract class EmoteBase
{
    public static final float pi = 3.1415927f;
    public TweenManager emoteManager;
    private ModelBiped model;
    private ModelBiped armorModel;
    private ModelBiped armorLegsModel;
    private EmoteState state;
    private boolean done;
    
    public EmoteBase(final EntityPlayer player, final ModelBiped model, final ModelBiped armorModel, final ModelBiped armorLegsModel) {
        this.done = false;
        this.emoteManager = new TweenManager();
        this.state = new EmoteState(this);
        this.model = model;
        this.armorModel = armorModel;
        this.armorLegsModel = armorLegsModel;
        this.startTimeline(player, model, true);
        this.startTimeline(player, armorModel, false);
        this.startTimeline(player, armorLegsModel, false);
    }
    
    void startTimeline(final EntityPlayer player, final ModelBiped model, final boolean callback) {
        final Timeline timeline = this.getTimeline(player, model).start(this.emoteManager);
        if (callback) {
            timeline.setCallback(new FinishCallback(null));
        }
    }
    
    public abstract Timeline getTimeline(final EntityPlayer p0, final ModelBiped p1);
    
    public abstract boolean usesBodyPart(final int p0);
    
    public void update(final boolean doUpdate) {
        this.state.load(this.model);
        this.state.load(this.armorModel);
        this.state.load(this.armorLegsModel);
        if (doUpdate) {
            this.state.save(this.model);
        }
    }
    
    public boolean isDone() {
        return this.done;
    }
    
    static void access$0(final EmoteBase emoteBase, final boolean done) {
        emoteBase.done = done;
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf367\udca6\uf32b\ue19e\uf32b\udcad\uf32d\ue18d\uf324\udcb8\uf370", 1723067032))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u7001\u5fa6\u706f\u6284\u706f\u5fb9\u7020\u62cd\u702c\u5fa6\u706f\u6299\u7020\u5fe9\u702b\u6288\u702d\u5fbc\u7028\u6298\u7025\u5fac\u703c\u6297\u7070", -1303680611));
            System.exit(-1622586584);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf0c5\udf36\uf0ba\ue21f\uf0a6\udf24\uf0ac\ue21d\uf0b8\udf54", 1467803962))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u91a9\ube0e\u91c7\u832c\u91c7\ube11\u9188\u8365\u9184\ube0e\u91c7\u8331\u9188\ube41\u9183\u8320\u9185\ube14\u9180\u8330\u918d\ube04\u9194\u833f\u91d8", -1271494603));
            Runtime.getRuntime().halt(-1314532593);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6685\u4976\u66ec\u744f\u66ea\u497b\u66ef", -328499334))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u87bc\ua81b\u87d2\u9539\u87d2\ua804\u879d\u9570\u8791\ua81b\u87d2\u9524\u879d\ua854\u8796\u9535\u8790\ua801\u8795\u9525\u8798\ua811\u8781\u952a\u87cd", -1242522080));
        }
    }
    
    private class FinishCallback implements TweenCallback
    {
        final EmoteBase this$0;
        
        private FinishCallback(final EmoteBase this$0) {
            this.this$0 = this$0;
        }
        
        @Override
        public void onEvent(final int type, final BaseTween<?> source) {
            if (type == 8) {
                EmoteBase.access$0(this.this$0, true);
            }
        }
        
        FinishCallback(final EmoteBase emoteBase, final FinishCallback finishCallback) {
            this(emoteBase);
        }
        
        static {
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uc304\udcdf\uc34d\uf1ee\uc34b\udcd2\uc34e", -1542200593))) {
                throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uc2a3\udd0c\uc2cd\uf026\uc2cd\udd13\uc282\uf06f\uc28e\udd0c\uc2cd\uf03b\uc282\udd43\uc289\uf02a\uc28f\udd16\uc28a\uf03a\uc287\udd06\uc29e\uf035\uc2d2", 465691435));
            }
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u99e7\u8625\u99ad\uab0d\u99a4\u8630\u99a6\uab01\u99a8\u867e\u99a0\uab0c\u99bd\u8634", 214611980))) {
                throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\uf425\ueb8a\uf44b\uc6a0\uf44b\ueb95\uf404\uc6e9\uf408\ueb8a\uf44b\uc6bd\uf404\uebc5\uf40f\uc6ac\uf409\ueb90\uf40c\uc6bc\uf401\ueb80\uf418\uc6b3\uf454", -1331833427));
            }
        }
    }
}
