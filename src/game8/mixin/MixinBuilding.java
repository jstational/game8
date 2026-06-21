package game8.mixin;

import mindustry.world.Block.BlockBuild;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import game8.world.PressureSystem;

@Mixin(targets = "mindustry.gen.Building")
public abstract class MixinBuilding {
    @Unique public boolean willACT = false;
    @Unique public PressureSystem presssys = null;
}