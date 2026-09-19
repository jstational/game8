package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** welds payloads on the ground */
public class PayloadWelder extends Block {
    public PayloadWelder(String name) {
        super(name);
    }
    
    public class PayloadWelderBuild extends Building {
        public PayloadWelder block;
        
        public int weldPercent;
        public Payload payload;
    }
}