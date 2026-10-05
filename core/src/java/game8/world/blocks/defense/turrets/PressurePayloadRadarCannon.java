package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import mindustry.world.blocks.defense.turrets.*;
import arc.struct.Seq;
import game8.world.blocks.*;
import mindustry.world.blocks.payloads.Payload;

public class PressurePayloadRadarCannon extends PressurePayloadCannon {
    public PressurePayloadRadarCannon(String name) {
        super(name);
    }

    public class PressurePayloadRadarCannonBuild extends PressurePayloadCannonBuild implements PressureBuild {
        @Override
        public void shoot(float x, float y, Payload payload) {
            super.shoot(x, y, payload);
        }
    }
}