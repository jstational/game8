package game8.mixin;

import mindustry.world.Block;
import game8.utils.Press2;
import mindustry.annotations.Annotations.*;
import game8.interfaces;

@Mixin(Blocks.class)
public class MixinBlock extends UnlockableContent implements PressureBlock {
    // if null, does not have a PressureModule and will not do anything involving Pressure
    public @Nullable @NoPatch Press2 PressureConfig;
    public boolean ProducePressure;
}