package vazkii.emotes.client.emote.base;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.model.ModelBiped;
import aurelienribon.tweenengine.TweenAccessor;

public class ModelAccessor implements TweenAccessor<ModelBiped>
{
    public static final ModelAccessor INSTANCE;
    private static final int ROT_X = 0;
    private static final int ROT_Y = 1;
    private static final int ROT_Z = 2;
    public static final int HEAD = 0;
    public static final int BODY = 3;
    public static final int RIGHT_ARM = 6;
    public static final int LEFT_ARM = 9;
    public static final int RIGHT_LEG = 15;
    public static final int LEFT_LEG = 18;
    public static final int HEAD_X = 0;
    public static final int HEAD_Y = 1;
    public static final int HEAD_Z = 2;
    public static final int BODY_X = 3;
    public static final int BODY_Y = 4;
    public static final int BODY_Z = 5;
    public static final int RIGHT_ARM_X = 6;
    public static final int RIGHT_ARM_Y = 7;
    public static final int RIGHT_ARM_Z = 8;
    public static final int LEFT_ARM_X = 9;
    public static final int LEFT_ARM_Y = 10;
    public static final int LEFT_ARM_Z = 11;
    public static final int RIGHT_LEG_X = 15;
    public static final int RIGHT_LEG_Y = 16;
    public static final int RIGHT_LEG_Z = 17;
    public static final int LEFT_LEG_X = 18;
    public static final int LEFT_LEG_Y = 19;
    public static final int LEFT_LEG_Z = 20;
    public static final int STATE_COUNT = 20;
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u812c\ua5fb\u8173\uf31a\u816f\ua5e9\u8165\uf318\u8171\ua5b9", -1036958344))) {
            System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\u749f\u503c\u74f1\u06d6\u74f1\u5023\u74be\u069f\u74b2\u503c\u74f1\u06cb\u74be\u5073\u74b5\u06da\u74b3\u5026\u74b6\u06ca\u74bb\u5036\u74a2\u06c5\u74ee", -1964265304));
            Runtime.getRuntime().halt(2063180090);
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u6e43\u4ab4\u6e2a\u1c45\u6e2c\u4ab9\u6e29", -139482601))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u609c\u443f\u60f2\u12d5\u60f2\u4420\u60bd\u129c\u60b1\u443f\u60f2\u12c8\u60bd\u4470\u60b6\u12d9\u60b0\u4425\u60b5\u12c9\u60b8\u4435\u60a1\u12c6\u60ed", -2030459733));
        }
        INSTANCE = new ModelAccessor();
    }
    
    @Override
    public int getValues(final ModelBiped target, final int tweenType, final float[] returnValues) {
        final int axis = tweenType % 3;
        final int bodyPart = tweenType / 3 * 3;
        final ModelRenderer model = this.getBodyPart(target, bodyPart);
        if (model == null) {
            return 0;
        }
        if (axis == 0) {
            returnValues[0] = model.rotateAngleX;
        }
        else if (axis == 1) {
            returnValues[0] = model.rotateAngleY;
        }
        else {
            returnValues[0] = model.rotateAngleZ;
        }
        return 1;
    }
    
    private ModelRenderer getBodyPart(final ModelBiped model, final int part) {
        switch (part) {
            case 0: {
                return model.bipedHead;
            }
            case 3: {
                return model.bipedBody;
            }
            case 6: {
                return model.bipedRightArm;
            }
            case 9: {
                return model.bipedLeftArm;
            }
            case 15: {
                return model.bipedRightLeg;
            }
            case 18: {
                return model.bipedLeftLeg;
            }
            default: {
                return null;
            }
        }
    }
    
    @Override
    public void setValues(final ModelBiped target, final int tweenType, final float[] newValues) {
        final int axis = tweenType % 3;
        final int bodyPart = tweenType / 3 * 3;
        final ModelRenderer model = this.getBodyPart(target, bodyPart);
        this.messWithModel(target, model, axis, newValues[0]);
    }
    
    private void messWithModel(final ModelBiped biped, final ModelRenderer part, final int axis, final float val) {
        if (part == null) {
            return;
        }
        if (axis == 0) {
            part.rotateAngleX = val;
        }
        else if (axis == 1) {
            part.rotateAngleY = val;
        }
        else if (axis == 2) {
            part.rotateAngleZ = val;
        }
        if (part == biped.bipedHead) {
            this.messWithModel(biped, biped.bipedHeadwear, axis, val);
        }
    }
    
    @Override
    public void setValues(final Object o, final int tweenType, final float[] newValues) {
        this.setValues((ModelBiped)o, tweenType, newValues);
    }
    
    @Override
    public int getValues(final Object o, final int tweenType, final float[] returnValues) {
        return this.getValues((ModelBiped)o, tweenType, returnValues);
    }
}
