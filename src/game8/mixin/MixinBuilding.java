package game8.mixin;

import mindustry.world.Block.BlockBuild;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "mindustry.gen.BuildingImpl")
public abstract class MixinBuildingImpl {
    @Unique public boolean willACT = false;
}