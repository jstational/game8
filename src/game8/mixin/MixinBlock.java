package game8.mixin;

import mindustry.world.Block;
import arc.math.Vec2;
import mindustry.annotations.Annotations.*;
import game8.interfaces;

@Mixin(Blocks.class)
public class MixinBlock extends UnlockableContent implements PressureBlock {
    // if true, then this building has an PressureModule. uhhuh am now.
    public @NoPatch boolean HasPressure;
    // testing... if null, will not consume/produce pressure
    public @Nullable Vec2 PressureConfig;
    public boolean ProducePressure;
}