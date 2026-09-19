package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

public class PayloadDuctRouter extends Block {
    public PayloadDuctRouter(String name) {
        super(name);
    }

    public class PayloadDuctRouterBuild extends Building {
        public PayloadDuctRouter block;

        public int curOut;
    }
}