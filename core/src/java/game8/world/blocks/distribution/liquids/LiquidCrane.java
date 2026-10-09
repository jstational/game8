package game8.world.blocks.distribution.liquids;

import mindustry.world.*;
import mindustry.gen.*;

public class LiquidCrane extends Block {
    public LiquidCrane(String name) {
        super(name);
    }

    public class LiquidCraneBuild extends Building {
        public LiquidCrane block;
    }
}