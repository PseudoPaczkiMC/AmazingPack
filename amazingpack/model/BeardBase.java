package amazingpack.model;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;

public class BeardBase extends ModelBase
{
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final int beardStage, final int growStage) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
