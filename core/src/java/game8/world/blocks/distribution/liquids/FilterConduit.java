package game8.world.blocks.distribution.liquids;

import mindustry.world.blocks.liquid.*;

public class FilterConduit extends Conduit {
    public FilterConduit(String name) {
        super(name);
    }

    public class FilterConduitBuild extends ConduitBuild {
        public FilterConduit block;
    }
}