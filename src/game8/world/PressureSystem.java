package game8.world;

import mindustry.gen.Building;
import arc.struct.Seq;
import game8.utils.Util;
import mindustry.world.blocks.*;
import game8.world.blocks.*;

/** PressureSystem is supposed to be a data type based off of Seq<Building>.
 * This will have merging two or more PressureSystems based on a single Building, Splitting into more PressureSystems based on a Building contained in the PressureSystem 
 * This should ONLY be obtained by Building.PressureSystem.
 * It should always call Update on split or merge. */
// oh no not this again
// I dont know a single thing about dynamic stuff

public class PressureSystem {
    private final Seq<Building> buildings;

    public PressureSystem(Seq<Building> blds) {}

    public PressureSystem StaticNewSystem(Building) {
        Util.getGrouping(Building, "PressureConfig", (Object) "!/null")
    }
    public void DynamicNewSystem(Building) {}
    public void Update(Building) {}
    public void Merge(Building) {}
    public void Split(Building) {}
}