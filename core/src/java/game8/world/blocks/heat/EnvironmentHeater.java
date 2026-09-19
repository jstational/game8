package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.heat.*;

public class EnvironmentHeater extends Block implements HeatConsumer {
    public EnvironmentHeater(String name) {
        super(name);
    }
    
    public class EnvironmentHeaterBuild extends Building {}
}