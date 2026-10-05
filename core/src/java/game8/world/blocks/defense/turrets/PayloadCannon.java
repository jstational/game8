package game8.world.blocks.defense.turrets;

import mindustry.world.*;
import mindustry.gen.*;
import mindustry.world.blocks.payloads.Payload;
import game8.struct.*;

public class PayloadCannon extends BaseTurret {
    public PayloadCannon(String name) {
        super(name);
    }

    public class PayloadCannonBuild extends BaseTurretBuild {
        public void shoot(float x, float y, Payload payload) {}
    }
}