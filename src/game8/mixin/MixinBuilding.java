package game8.mixin;

import mindustry.world.Block.BlockBuild;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import game8.world.PressureSystem;
import static game8.utils.Util;

@Mixin(targets = "mindustry.gen.Building")
public abstract class MixinBuilding {
    @Unique public boolean WillACT = false;
    @Unique public PressureSystem PressureSystem = null;
    @Unique public float PressureProduction = 0;
    @Unique public float PressureCurrentRequirement = 0;

    @Inject(method = "updateTile", at = @At("HEAD"))
    public void updateTile(CallbackInfo ci) {
        if((PLACEHOLDER_PRESSURESYSTEM > ContentField(this, "MinMaxPress").greatest || PLACEHOLDER_PRESSURESYSTEM < ContentField(this, "MinMaxPress").least) && ContentField(this, "hasPressure") == true) {
            this.kill;
        }
    }
}