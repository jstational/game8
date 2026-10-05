package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import mindustry.world.blocks.defense.turrets.*;

public class ItemRadarTurret extends ItemTurret {
    public ItemRadarTurret(String name) {
        super(name);
    }

    public class ItemRadarTurretBuild extends ItemTurretBuild {
        @Override
        public void shoot(float x, float y) {}
    }
}