package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import mindustry.world.blocks.defense.turrets.*;

public class LiquidRadarTurret extends LiquidTurret {
    public LiquidRadarTurret(String name) {
        super(name);
    }

    public class LiquidRadarTurretBuild extends LiquidTurretBuild {
        @Override
        public void shoot(float x, float y) {}
    }
}