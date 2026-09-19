package game8.world.blocks;

import mindustry.gen.Building;
import arc.struct.Seq;

public interface PressureBuild {
    void updateSystem();
    
    Seq<Building> getConnectedBuildings();
}