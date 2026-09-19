package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import mindustry.world.blocks.defense.turrets.*;
import arc.struct.Seq;
import game8.world.blocks.*;
import mindustry.world.blocks.payloads.Payload;

public class PressurePayloadRadarCannon extends PressurePayloadCannon {
    public float shootAt = 0f;
    public float reloadAt = 0f;
    public boolean shootMin = false;

    public PressurePayloadCannon(String name) {
        super(name);
    }

    public class PressurePayloadRadarCannonBuild extends PressurePayloadCannonBuild {
        @Override
        public void shoot(float x, float y, Payload payload) {
            super.shoot(x, y, payload);
        }
    }
}